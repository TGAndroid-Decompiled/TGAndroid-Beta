package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class i60 extends sk0 {
    public ArrayList f26892c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final zf.m1 e;
    public int f26893f;
    public Runnable h;
    public final m60 f26894n;

    public i60(m60 m60Var) {
        this.f26894n = m60Var;
        zf.m1 m1Var = new zf.m1(false);
        this.e = m1Var;
        m1Var.f55575a = new px(this, 7);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f26892c.size();
        zf.m1 m1Var = this.e;
        int size2 = m1Var.d.size();
        int size3 = m1Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f26893f = i11;
        return i11;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f26893f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f26892c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i60.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232720);
                    frameLayout.f22031a = drawable;
                    org.telegram.ui.ActionBar.a7.y(frameLayout, drawable, org.telegram.ui.ActionBar.t6.Ni, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f22032b = textView;
                    sc.e.t(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Oi, null);
                    int i12 = 3;
                    if (org.telegram.messenger.cd.X) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    textView.setGravity(i11 | 16);
                    if (org.telegram.messenger.cd.X) {
                        i12 = 5;
                    }
                    frameLayout.addView(textView, w7.b6.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.t0(this, context, 15);
            }
        } else {
            view = new org.telegram.ui.Cells.j4(context, 1, 0, false);
        }
        return new s4.c1(view);
    }
}
