package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class az extends org.telegram.ui.Cells.o4 {
    public final kz E;
    public final TextView f45678r;
    public final di.db f45679s;
    public int f45680w;
    public final org.telegram.ui.Components.g5 f45681x;
    public boolean f45682y;

    public az(kz kzVar, Context context) {
        super(context, org.telegram.ui.ActionBar.m6.L6, 22, 15, false, kz.i0(kzVar));
        int i7;
        int i10;
        this.E = kzVar;
        TextView textView = new TextView(getContext());
        this.f45678r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29758z6, kzVar.getResourceProvider());
        if (kzVar.getUserConfig().q()) {
            i7 = 2131750603;
        } else {
            i7 = 2131750602;
        }
        textView.setText(org.telegram.messenger.hd.N0(i7, null));
        textView.setGravity(5);
        if (org.telegram.messenger.hd.f24408a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        float f10 = this.f31171b;
        addView(textView, c8.na.d(-1, -1.0f, i10 | 48, f10, 16.66f, f10, this.f31172c));
        textView.setAlpha(0.0f);
        di.db dbVar = new di.db(this, getContext());
        this.f45679s = dbVar;
        this.f45681x = new org.telegram.ui.Components.g5(dbVar, 320L, org.telegram.ui.Components.nr.h, 0);
        dbVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        dbVar.setTypeface(org.telegram.messenger.g0.o());
        dbVar.setGravity(5);
        dbVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.hd.f24408a0 ? 3 : 5) | 48;
        float f11 = this.f31171b;
        addView(dbVar, c8.na.d(-1, -1.0f, i11, f11, 16.66f, f11, this.f31172c));
    }

    public final void d(int i7, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        kz kzVar = this.E;
        if (kzVar.getUserConfig().q()) {
            i10 = 2131750603;
        } else {
            i10 = 2131750602;
        }
        String N0 = org.telegram.messenger.hd.N0(i10, null);
        TextView textView = this.f45678r;
        textView.setText(N0);
        int i11 = 0;
        if (i7 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.m6.f29608r8;
            i11 = kzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f45680w = i11;
        di.db dbVar = this.f45679s;
        if (!z11) {
            dbVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f45681x.a(this.f45680w, true);
        }
        if (z11 != this.f45682y) {
            this.f45682y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
            duration.setInterpolator(nrVar).start();
            ViewPropertyAnimator animate2 = dbVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(nrVar).start();
        }
    }

    public final void e(CharSequence charSequence, boolean z10) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z11 = false;
        if (charSequence.length() > 12) {
            charSequence = charSequence.subSequence(0, 12);
        }
        di.db dbVar = this.f45679s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, dbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.hd.f24408a0) {
            z11 = true;
        }
        dbVar.c(m10, z11, true);
    }
}
