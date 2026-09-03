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
public final class z60 extends ql0 {
    public ArrayList f31262c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final tf.j1 e;
    public int f31263f;
    public Runnable h;
    public final d70 f31264n;

    public z60(d70 d70Var) {
        this.f31264n = d70Var;
        tf.j1 j1Var = new tf.j1(false);
        this.e = j1Var;
        j1Var.f44819a = new ev(this, 7);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f31262c.size();
        tf.j1 j1Var = this.e;
        int size2 = j1Var.d.size();
        int size3 = j1Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f31263f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f31263f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f31262c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z60.v(f2.l1, int):void");
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
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19899e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f20993a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f20994b = textView;
                    org.telegram.ui.ai.o(14.0f, 1, textView);
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
            view = new org.telegram.ui.Cells.f4(context, 1, 0, false);
        }
        return new f2.l1(view);
    }
}
