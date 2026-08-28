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
public final class g60 extends vk0 {
    public ArrayList f28656c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final of.v1 f28657e;
    public int f28658f;
    public Runnable h;
    public final k60 f28659n;

    public g60(k60 k60Var) {
        this.f28659n = k60Var;
        of.v1 v1Var = new of.v1(false);
        this.f28657e = v1Var;
        v1Var.f19524a = new wu(this, 7);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f28656c.size();
        of.v1 v1Var = this.f28657e;
        int size2 = v1Var.d.size();
        int size3 = v1Var.f19527e.size();
        int i9 = size + size2;
        if (size3 != 0) {
            i9 += size3 + 1;
        }
        int i10 = i9 + 2;
        this.f28658f = i10;
        return i10;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        if (i9 == this.f28658f - 1) {
            return 4;
        }
        if (i9 - 1 != this.f28657e.d.size() + this.f28656c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g60.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        int i10;
        Context context = viewGroup.getContext();
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23020e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f24333a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f24334b = textView;
                    j3.r0.u(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ai, false));
                    int i11 = 3;
                    if (LocaleController.isRTL) {
                        i10 = 5;
                    } else {
                        i10 = 3;
                    }
                    textView.setGravity(i10 | 16);
                    if (LocaleController.isRTL) {
                        i11 = 5;
                    }
                    frameLayout.addView(textView, g7.e6.d(-1, -1.0f, i11 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new fh.l2(this, context, 18);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        return new f2.q1(view);
    }
}
