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
public final class x60 extends kl0 {
    public ArrayList f32434c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final hg.b2 f32435e;
    public int f32436f;
    public Runnable h;
    public final b70 f32437n;

    public x60(b70 b70Var) {
        this.f32437n = b70Var;
        hg.b2 b2Var = new hg.b2(false);
        this.f32435e = b2Var;
        b2Var.f10979a = new kv(this, 7);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int size = this.f32434c.size();
        hg.b2 b2Var = this.f32435e;
        int size2 = b2Var.d.size();
        int size3 = b2Var.f10982e.size();
        int i10 = size + size2;
        if (size3 != 0) {
            i10 += size3 + 1;
        }
        int i11 = i10 + 2;
        this.f32436f = i11;
        return i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f32436f - 1) {
            return 4;
        }
        if (i10 - 1 != this.f32435e.d.size() + this.f32434c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x60.v(s4.c1, int):void");
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
                    frameLayout.f21854a = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zh, false), PorterDuff.Mode.MULTIPLY));
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.f21855b = textView;
                    com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20618ai, false));
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
                    frameLayout.addView(textView, w7.x5.d(-1, -1.0f, i12 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new di.eb(this, context, 19);
            }
        } else {
            view = new org.telegram.ui.Cells.f4(context, 1, 0, false);
        }
        return new s4.c1(view);
    }
}
