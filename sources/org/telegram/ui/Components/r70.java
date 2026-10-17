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
public final class r70 extends hm0 {
    public ArrayList f29857c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final hg.a2 e;
    public int f29858f;
    public Runnable h;
    public final v70 f29859n;

    public r70(v70 v70Var) {
        this.f29859n = v70Var;
        hg.a2 a2Var = new hg.a2(false);
        this.e = a2Var;
        a2Var.f11793a = new tv(this, 8);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45941f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f29857c.size();
        hg.a2 a2Var = this.e;
        int size2 = a2Var.d.size();
        int size3 = a2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f29858f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f29858f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f29857c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r70.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f22180a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f22181b = textView;
                    com.google.android.gms.internal.cast.a6.m(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20939ai, false));
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
                    frameLayout.addView(textView, w7.z5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, i12 | 48));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new ai.hc(this, context, 20);
            }
        } else {
            view = new org.telegram.ui.Cells.f4(1, 0, context, false);
        }
        return new s4.b1(view);
    }
}
