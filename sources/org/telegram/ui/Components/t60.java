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
public final class t60 extends il0 {
    public ArrayList f32879c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final rf.k1 f32880e;
    public int f32881f;
    public Runnable h;
    public final x60 f32882n;

    public t60(x60 x60Var) {
        this.f32882n = x60Var;
        rf.k1 k1Var = new rf.k1(false);
        this.f32880e = k1Var;
        k1Var.f47277a = new cv(this, 7);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f32879c.size();
        rf.k1 k1Var = this.f32880e;
        int size2 = k1Var.d.size();
        int size3 = k1Var.f47280e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f32881f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32881f - 1) {
            return 4;
        }
        if (i10 - 1 != this.f32880e.d.size() + this.f32879c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t60.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23081e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f24226a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f24227b = textView;
                    org.telegram.ui.th.n(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ai, false));
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
                    frameLayout.addView(textView, i7.f6.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new cg.h0(this, context, 16);
            }
        } else {
            view = new org.telegram.ui.Cells.e4(context, 1, 0, false);
        }
        return new f2.n1(view);
    }
}
