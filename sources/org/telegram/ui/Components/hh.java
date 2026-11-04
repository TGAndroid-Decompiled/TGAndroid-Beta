package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class hh implements TextWatcher {
    public boolean f34388a;
    public boolean f34389b;
    public final org.telegram.ui.ActionBar.d2 f34390c;
    public final bi d;

    public hh(bi biVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = biVar;
        this.f34390c = d2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        bi biVar = this.d;
        h6 h6Var = biVar.f32266r1;
        fh fhVar = biVar.K2;
        int i10 = biVar.E3;
        h6 h6Var2 = biVar.f32270s1;
        if (this.f34389b != TextUtils.isEmpty(editable)) {
            th thVar = biVar.f32275t2;
            if (thVar != null) {
                thVar.D(thVar.getSelectedItemsCount());
            }
            this.f34389b = !this.f34389b;
        }
        boolean z13 = false;
        if (this.f34388a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f34388a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        biVar.D1 = codePointCount;
        qe.a aVar = biVar.m1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = biVar.C1;
        if (i11 > 0 && (i3 = i11 - biVar.D1) <= 100) {
            if (i3 < -9999) {
                i3 = -9999;
            }
            long j10 = i3;
            String E = org.telegram.messenger.bd.E(j10, ',');
            if (h6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            h6Var2.c(E, z12, true);
            if (h6Var2.getVisibility() != 0) {
                h6Var2.setVisibility(0);
                h6Var2.setAlpha(0.0f);
                h6Var2.setScaleX(0.5f);
                h6Var2.setScaleY(0.5f);
            }
            h6Var2.animate().setListener(null).cancel();
            h6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i3 < 0) {
                org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.f28102p7, biVar.J0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.r6.Z(h6Var2, org.telegram.ui.ActionBar.k6.f28273y6, biVar.J0);
                z11 = true;
            }
            h6Var.c(org.telegram.messenger.bd.E(j10, ','), false, true);
            h6Var.setAlpha(1.0f);
        } else {
            h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 9));
            h6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (biVar.P2 != z11) {
            biVar.P2 = z11;
            biVar.D2.invalidate();
        }
        if (!biVar.f32222d4 && !org.telegram.messenger.hp.s1(i10).D3() && !org.telegram.messenger.h10.i(i10).q() && biVar.D1 > org.telegram.messenger.hp.s1(i10).T4 && biVar.D1 < org.telegram.messenger.hp.s1(i10).U4) {
            biVar.f32222d4 = true;
            biVar.D1(this.f34390c);
        }
        if (biVar.U1) {
            if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                z13 = true;
            }
            biVar.B1(z13);
        }
        biVar.Q0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f34388a = true;
        }
        bi biVar = this.d;
        if (biVar.f32301z4 == null) {
            bi.K0(biVar);
        }
        if (biVar.f32301z4.getAdapter() != null) {
            biVar.f32301z4.setReversed(true);
            biVar.f32301z4.getAdapter().U(charSequence, biVar.K2.getEditText().getSelectionStart(), null, false, false);
            biVar.J1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
