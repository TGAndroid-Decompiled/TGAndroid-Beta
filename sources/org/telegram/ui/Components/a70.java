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
public final class a70 extends rl0 {
    public ArrayList f25172c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final uf.k1 f25173e;
    public int f25174f;
    public Runnable h;
    public final e70 f25175n;

    public a70(e70 e70Var) {
        this.f25175n = e70Var;
        uf.k1 k1Var = new uf.k1(false);
        this.f25173e = k1Var;
        k1Var.f48654a = new hv(this, 7);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f25172c.size();
        uf.k1 k1Var = this.f25173e;
        int size2 = k1Var.d.size();
        int size3 = k1Var.f48657e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f25174f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f25174f - 1) {
            return 4;
        }
        if (i10 - 1 != this.f25173e.d.size() + this.f25172c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a70.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21680e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f22803a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f22804b = textView;
                    org.telegram.ui.yh.p(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ai, false));
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
                    frameLayout.addView(textView, k7.c6.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new fg.h0(this, context, 14);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        return new f2.m1(view);
    }
}
