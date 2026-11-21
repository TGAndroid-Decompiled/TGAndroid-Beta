package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class g60 extends dk0 {
    public ArrayList f35415c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final jg.z1 f35416e;
    public int f35417f;
    public Runnable h;
    public final l60 f35418n;

    public g60(l60 l60Var) {
        this.f35418n = l60Var;
        jg.z1 z1Var = new jg.z1(false);
        this.f35416e = z1Var;
        z1Var.f17752a = new ky(this, 6);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f35415c.size();
        jg.z1 z1Var = this.f35416e;
        int size2 = z1Var.d.size();
        int size3 = z1Var.f17755e.size();
        int i7 = size + size2;
        if (size3 != 0) {
            i7 += size3 + 1;
        }
        int i10 = i7 + 2;
        this.f35417f = i10;
        return i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f35417f - 1) {
            return 4;
        }
        if (i7 - 1 != this.f35416e.d.size() + this.f35415c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g60.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        Context context = viewGroup.getContext();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29398e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232725);
                    frameLayout.f30723a = drawable;
                    org.telegram.ui.ActionBar.t6.x(frameLayout, drawable, org.telegram.ui.ActionBar.m6.Qi, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f30724b = textView;
                    i5.c.x(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ri, null);
                    int i11 = 3;
                    if (org.telegram.messenger.gd.f24241a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (org.telegram.messenger.gd.f24241a0) {
                        i11 = 5;
                    }
                    frameLayout.addView(textView, c8.ma.d(-1, -1.0f, i11 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.m3(21, context, this);
            }
        } else {
            view = new org.telegram.ui.Cells.i4(context, 1, 0, false);
        }
        return new v4.f1(view);
    }
}
