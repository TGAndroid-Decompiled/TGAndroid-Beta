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
public final class y60 extends ll0 {
    public ArrayList f30168c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final gg.c2 e;
    public int f30169f;
    public Runnable h;
    public final c70 f30170n;

    public y60(c70 c70Var) {
        this.f30170n = c70Var;
        gg.c2 c2Var = new gg.c2(false);
        this.e = c2Var;
        c2Var.f9672a = new mv(this, 7);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f30168c.size();
        gg.c2 c2Var = this.e;
        int size2 = c2Var.d.size();
        int size3 = c2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f30169f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f30169f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f30168c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y60.v(s4.c1, int):void");
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
                    frameLayout.f20034a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f20035b = textView;
                    com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18744ai, false));
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
                    frameLayout.addView(textView, w7.x5.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
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
