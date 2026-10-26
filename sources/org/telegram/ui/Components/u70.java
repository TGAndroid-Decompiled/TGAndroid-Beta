package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u70 extends lm0 {
    public ArrayList f33266c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final ig.a2 e;
    public int f33267f;
    public Runnable h;
    public final y70 f33268n;

    public u70(y70 y70Var) {
        this.f33268n = y70Var;
        ig.a2 a2Var = new ig.a2(false);
        this.e = a2Var;
        a2Var.f13988a = new tv(this, 8);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f33266c.size();
        ig.a2 a2Var = this.e;
        int size2 = a2Var.d.size();
        int size3 = a2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f33267f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f33267f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f33266c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u70.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23376e7, frameLayout, null);
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f24286a = drawable;
                    org.telegram.ui.ActionBar.f7.y(frameLayout, drawable, org.telegram.ui.ActionBar.y6.Zh, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f24287b = textView;
                    ic.a.o(14.0f, 1, textView);
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23309ai, null);
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
                    frameLayout.addView(textView, gb1.h(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.cc(this, context, 19);
            }
        } else {
            view = new org.telegram.ui.Cells.k4(context, 1, 0, false);
        }
        return new s4.e1(view);
    }
}
