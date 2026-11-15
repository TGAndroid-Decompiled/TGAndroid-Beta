package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class v50 extends tj0 {
    public ArrayList f40270c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final jg.z1 f40271e;
    public int f40272f;
    public Runnable h;
    public final a60 f40273n;

    public v50(a60 a60Var) {
        this.f40273n = a60Var;
        jg.z1 z1Var = new jg.z1(false);
        this.f40271e = z1Var;
        z1Var.f17344a = new gx(this, 7);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.f40270c.size();
        jg.z1 z1Var = this.f40271e;
        int size2 = z1Var.d.size();
        int size3 = z1Var.f17347e.size();
        int i7 = size + size2;
        if (size3 != 0) {
            i7 += size3 + 1;
        }
        int i10 = i7 + 2;
        this.f40272f = i10;
        return i10;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.f40272f - 1) {
            return 4;
        }
        if (i7 - 1 != this.f40271e.d.size() + this.f40270c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v50.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        int i10;
        Context context = viewGroup.getContext();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28869e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232724);
                    frameLayout.f30317a = drawable;
                    org.telegram.ui.ActionBar.q6.x(frameLayout, drawable, org.telegram.ui.ActionBar.j6.Qi, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f30318b = textView;
                    i5.c.v(textView, 1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ri, null);
                    int i11 = 3;
                    if (org.telegram.messenger.hd.f24104a0) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (org.telegram.messenger.hd.f24104a0) {
                        i11 = 5;
                    }
                    frameLayout.addView(textView, c8.ja.d(-1, -1.0f, i11 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.o2(21, context, this);
            }
        } else {
            view = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        }
        return new v4.e1(view);
    }
}
