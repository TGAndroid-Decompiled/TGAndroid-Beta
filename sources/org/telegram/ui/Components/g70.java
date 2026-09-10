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
public final class g70 extends ul0 {
    public ArrayList f23261c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final fg.d2 e;
    public int f23262f;
    public Runnable h;
    public final k70 f23263n;

    public g70(k70 k70Var) {
        this.f23263n = k70Var;
        fg.d2 d2Var = new fg.d2(false);
        this.e = d2Var;
        d2Var.f7979a = new pv(this, 7);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f23261c.size();
        fg.d2 d2Var = this.e;
        int size2 = d2Var.d.size();
        int size3 = d2Var.e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f23262f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f23262f - 1) {
            return 4;
        }
        if (i10 - 1 != this.e.d.size() + this.f23261c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g70.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f19068a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f19069b = textView;
                    com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17883ai, false));
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
                    frameLayout.addView(textView, w7.a6.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new bi.nc(this, context, 19);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(context, 1, 0, false);
        }
        return new s4.c1(view);
    }
}
