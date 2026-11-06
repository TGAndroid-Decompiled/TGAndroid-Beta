package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class s50 extends oj0 {
    public ArrayList f37892c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final jg.z1 f37893e;
    public int f37894f;
    public Runnable h;
    public final x50 f37895n;

    public s50(x50 x50Var) {
        this.f37895n = x50Var;
        jg.z1 z1Var = new jg.z1(false);
        this.f37893e = z1Var;
        z1Var.f16989a = new ax(this, 7);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56956f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f37892c.size();
        jg.z1 z1Var = this.f37893e;
        int size2 = z1Var.d.size();
        int size3 = z1Var.f16992e.size();
        int i7 = size + size2;
        if (size3 != 0) {
            i7 += size3 + 1;
        }
        int i10 = i7 + 2;
        this.f37894f = i10;
        return i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f37894f - 1) {
            return 4;
        }
        if (i7 - 1 != this.f37893e.d.size() + this.f37892c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s50.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        Context context = viewGroup.getContext();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27868e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232723);
                    frameLayout.f29140a = drawable;
                    org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, org.telegram.ui.ActionBar.k6.Ni, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f29141b = textView;
                    com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Oi, null);
                    int i11 = 3;
                    if (org.telegram.messenger.hd.f22871a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (org.telegram.messenger.hd.f22871a0) {
                        i11 = 5;
                    }
                    frameLayout.addView(textView, c8.ha.d(-1, -1.0f, i11 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.ec(20, context, this);
            }
        } else {
            view = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        return new v4.d1(view);
    }
}
