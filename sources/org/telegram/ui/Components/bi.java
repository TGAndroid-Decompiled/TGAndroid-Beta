package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class bi implements TextWatcher {
    public boolean f33854a;
    public boolean f33855b;
    public final org.telegram.ui.ActionBar.g2 f33856c;
    public final ui d;

    public bi(ui uiVar, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = uiVar;
        this.f33856c = g2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        ui uiVar = this.d;
        o6 o6Var = uiVar.f40439u1;
        zh zhVar = uiVar.N2;
        int i10 = uiVar.H3;
        o6 o6Var2 = uiVar.f40443v1;
        if (this.f33855b != TextUtils.isEmpty(editable)) {
            mi miVar = uiVar.f40448w2;
            if (miVar != null) {
                miVar.E(miVar.getSelectedItemsCount());
            }
            this.f33855b = !this.f33855b;
        }
        boolean z13 = false;
        if (this.f33854a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, zhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f33854a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        uiVar.G1 = codePointCount;
        te.a aVar = uiVar.f40419p1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = uiVar.F1;
        if (i11 > 0 && (i7 = i11 - uiVar.G1) <= 100) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            String E = org.telegram.messenger.gd.E(j3, ',');
            if (o6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            o6Var2.c(E, z12, true);
            if (o6Var2.getVisibility() != 0) {
                o6Var2.setVisibility(0);
                o6Var2.setAlpha(0.0f);
                o6Var2.setScaleX(0.5f);
                o6Var2.setScaleY(0.5f);
            }
            o6Var2.animate().setListener(null).cancel();
            o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.f29599p7, uiVar.J0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.t6.Y(o6Var2, org.telegram.ui.ActionBar.m6.f29770y6, uiVar.J0);
                z11 = true;
            }
            o6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
            o6Var.setAlpha(1.0f);
        } else {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y(this, 10));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (uiVar.S2 != z11) {
            uiVar.S2 = z11;
            uiVar.G2.invalidate();
        }
        if (!uiVar.f40394g4 && !org.telegram.messenger.mp.u1(i10).K3() && !org.telegram.messenger.j10.i(i10).q() && uiVar.G1 > org.telegram.messenger.mp.u1(i10).W4 && uiVar.G1 < org.telegram.messenger.mp.u1(i10).X4) {
            uiVar.f40394g4 = true;
            uiVar.E1(this.f33856c);
        }
        if (uiVar.X1) {
            if (zhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zhVar.getText().toString().trim())) {
                z13 = true;
            }
            uiVar.C1(z13);
        }
        uiVar.R0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f33854a = true;
        }
        ui uiVar = this.d;
        if (uiVar.C4 == null) {
            ui.L0(uiVar);
        }
        if (uiVar.C4.getAdapter() != null) {
            uiVar.C4.setReversed(true);
            uiVar.C4.getAdapter().U(charSequence, uiVar.N2.getEditText().getSelectionStart(), null, false, false);
            uiVar.K1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
