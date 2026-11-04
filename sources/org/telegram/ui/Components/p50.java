package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class p50 extends sj0 {
    public ArrayList f37065c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final kg.v1 f37066e;
    public int f37067f;
    public Runnable h;
    public final t50 f37068n;

    public p50(t50 t50Var) {
        this.f37068n = t50Var;
        kg.v1 v1Var = new kg.v1(false);
        this.f37066e = v1Var;
        v1Var.f17206a = new zw(this, 7);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f37065c.size();
        kg.v1 v1Var = this.f37066e;
        int size2 = v1Var.d.size();
        int size3 = v1Var.f17209e.size();
        int i3 = size + size2;
        if (size3 != 0) {
            i3 += size3 + 1;
        }
        int i10 = i3 + 2;
        this.f37067f = i10;
        return i10;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == this.f37067f - 1) {
            return 4;
        }
        if (i3 - 1 != this.f37066e.d.size() + this.f37065c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p50.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        int i10;
        Context context = viewGroup.getContext();
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27899e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232721);
                    frameLayout.f29258a = drawable;
                    org.telegram.ui.ActionBar.r6.y(frameLayout, drawable, org.telegram.ui.ActionBar.k6.Ni, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f29259b = textView;
                    k2.p1.t(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Oi, null);
                    int i11 = 3;
                    if (org.telegram.messenger.bd.f21784a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i11 = 5;
                    }
                    frameLayout.addView(textView, b8.mf.d(-1, -1.0f, i11 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new ai.x2(21, context, this);
            }
        } else {
            view = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        return new u4.d1(view);
    }
}
