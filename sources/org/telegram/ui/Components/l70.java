package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l70 extends yl0 {
    public ArrayList f25927c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final gg.c2 e;
    public int f25928f;
    public Runnable h;
    public final p70 f25929n;

    public l70(p70 p70Var) {
        this.f25929n = p70Var;
        gg.c2 c2Var = new gg.c2(false);
        this.e = c2Var;
        c2Var.f9683a = new ov(this, 8);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f43071f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f25927c.size();
        gg.c2 c2Var = this.e;
        int size2 = c2Var.d.size();
        int size3 = c2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f25928f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f25928f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f25927c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l70.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f20311a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f20312b = textView;
                    com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19031ai, false));
                    int i12 = 3;
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    }
                    frameLayout.addView(textView, w7.y5.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new ci.bb(this, context, 19);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        return new s4.c1(view);
    }
}
