package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class t50 extends pj0 {
    public ArrayList f38296c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final jg.z1 f38297e;
    public int f38298f;
    public Runnable h;
    public final y50 f38299n;

    public t50(y50 y50Var) {
        this.f38299n = y50Var;
        jg.z1 z1Var = new jg.z1(false);
        this.f38297e = z1Var;
        z1Var.f16992a = new bx(this, 7);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f38296c.size();
        jg.z1 z1Var = this.f38297e;
        int size2 = z1Var.d.size();
        int size3 = z1Var.f16995e.size();
        int i7 = size + size2;
        if (size3 != 0) {
            i7 += size3 + 1;
        }
        int i10 = i7 + 2;
        this.f38298f = i10;
        return i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f38298f - 1) {
            return 4;
        }
        if (i7 - 1 != this.f38297e.d.size() + this.f38296c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t50.t(v4.d1, int):void");
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
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27885e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232723);
                    frameLayout.f29148a = drawable;
                    org.telegram.ui.ActionBar.s6.x(frameLayout, drawable, org.telegram.ui.ActionBar.l6.Ni, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f29149b = textView;
                    com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Oi, null);
                    int i11 = 3;
                    if (org.telegram.messenger.id.f23157a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (org.telegram.messenger.id.f23157a0) {
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
