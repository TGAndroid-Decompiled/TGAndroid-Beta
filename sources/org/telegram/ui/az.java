package org.telegram.ui;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
public final class az extends org.telegram.ui.Cells.o4 {
    public final kz E;
    public final TextView f45694r;
    public final di.db f45695s;
    public int f45696w;
    public final org.telegram.ui.Components.f5 f45697x;
    public boolean f45698y;

    public az(kz kzVar, Context context) {
        super(context, org.telegram.ui.ActionBar.n6.L6, 22, 15, false, kz.i0(kzVar));
        int i7;
        int i10;
        this.E = kzVar;
        TextView textView = new TextView(getContext());
        this.f45694r = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29805z6, kzVar.getResourceProvider());
        if (kzVar.getUserConfig().q()) {
            i7 = 2131750604;
        } else {
            i7 = 2131750603;
        }
        textView.setText(org.telegram.messenger.gd.M0(i7, null));
        textView.setGravity(5);
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        float f10 = this.f31174b;
        addView(textView, c8.ma.d(-1, -1.0f, i10 | 48, f10, 16.66f, f10, this.f31175c));
        textView.setAlpha(0.0f);
        di.db dbVar = new di.db(this, getContext());
        this.f45695s = dbVar;
        this.f45697x = new org.telegram.ui.Components.f5(dbVar, 320L, org.telegram.ui.Components.lr.h, 0);
        dbVar.setTextSize(org.telegram.messenger.g0.L(10.0f));
        dbVar.setTypeface(org.telegram.messenger.g0.o());
        dbVar.setGravity(5);
        dbVar.setPadding(org.telegram.messenger.g0.L(4.66f), 0, org.telegram.messenger.g0.L(4.66f), 0);
        int i11 = (org.telegram.messenger.gd.f24213a0 ? 3 : 5) | 48;
        float f11 = this.f31174b;
        addView(dbVar, c8.ma.d(-1, -1.0f, i11, f11, 16.66f, f11, this.f31175c));
    }

    public final void d(int i7, boolean z10) {
        int i10;
        boolean z11;
        float f10;
        kz kzVar = this.E;
        if (kzVar.getUserConfig().q()) {
            i10 = 2131750604;
        } else {
            i10 = 2131750603;
        }
        String M0 = org.telegram.messenger.gd.M0(i10, null);
        TextView textView = this.f45694r;
        textView.setText(M0);
        int i11 = 0;
        if (i7 < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            int[] iArr = org.telegram.ui.ActionBar.n6.f29655r8;
            i11 = kzVar.getThemedColor(iArr[i7 % iArr.length]);
        }
        this.f45696w = i11;
        di.db dbVar = this.f45695s;
        if (!z11) {
            dbVar.setEmojiColor(i11);
        }
        if (!z10) {
            this.f45697x.a(this.f45696w, true);
        }
        if (z11 != this.f45698y) {
            this.f45698y = z11;
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 0.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setDuration(320L);
            org.telegram.ui.Components.lr lrVar = org.telegram.ui.Components.lr.h;
            duration.setInterpolator(lrVar).start();
            ViewPropertyAnimator animate2 = dbVar.animate();
            if (!z11) {
                f11 = 1.0f;
            }
            animate2.alpha(f11).setDuration(320L).setInterpolator(lrVar).start();
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
        di.db dbVar = this.f45695s;
        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, dbVar.getPaint().getFontMetricsInt(), false, null, 0);
        if (z10 && !org.telegram.messenger.gd.f24213a0) {
            z11 = true;
        }
        dbVar.c(m10, z11, true);
    }
}
