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
public final class y60 extends rl0 {
    public ArrayList f30889c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final tf.k1 e;
    public int f30890f;
    public Runnable h;
    public final c70 f30891n;

    public y60(c70 c70Var) {
        this.f30891n = c70Var;
        tf.k1 k1Var = new tf.k1(false);
        this.e = k1Var;
        k1Var.f44769a = new fv(this, 7);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f30889c.size();
        tf.k1 k1Var = this.e;
        int size2 = k1Var.d.size();
        int size3 = k1Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f30890f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f30890f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f30889c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y60.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19924e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f21057a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f21058b = textView;
                    org.telegram.ui.yh.p(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ai, false));
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
                    frameLayout.addView(textView, k7.b6.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new eg.h0(this, context, 14);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        return new f2.l1(view);
    }
}
