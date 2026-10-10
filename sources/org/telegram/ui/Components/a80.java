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
public final class a80 extends qm0 {
    public ArrayList f24504c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final gg.b2 f24505e;
    public int f24506f;
    public Runnable h;
    public final e80 f24507n;

    public a80(e80 e80Var) {
        this.f24507n = e80Var;
        gg.b2 b2Var = new gg.b2(false);
        this.f24505e = b2Var;
        b2Var.f10532a = new cw(this, 8);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f24504c.size();
        gg.b2 b2Var = this.f24505e;
        int size2 = b2Var.d.size();
        int size3 = b2Var.f10535e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f24506f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f24506f - 1) {
            return 4;
        }
        if (i10 - 1 != this.f24505e.d.size() + this.f24504c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a80.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        Context context = viewGroup.getContext();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.e7, false));
                    Drawable drawable = frameLayout.getResources().getDrawable(R.drawable.shadowdown);
                    frameLayout.f22082a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f22083b = textView;
                    com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20756ai, false));
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
                    frameLayout.addView(textView, w7.x5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, i12 | 48));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new ci.bb(this, context, 19);
            }
        } else {
            view = new org.telegram.ui.Cells.g4(1, 0, context, false);
        }
        return new s4.d1(view);
    }
}
