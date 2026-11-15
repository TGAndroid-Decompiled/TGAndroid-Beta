package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class rh implements TextWatcher {
    public boolean f38976a;
    public boolean f38977b;
    public final org.telegram.ui.ActionBar.e2 f38978c;
    public final ki d;

    public rh(ki kiVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = kiVar;
        this.f38978c = e2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        ki kiVar = this.d;
        h6 h6Var = kiVar.f36488u1;
        ph phVar = kiVar.N2;
        int i10 = kiVar.H3;
        h6 h6Var2 = kiVar.f36492v1;
        if (this.f38977b != TextUtils.isEmpty(editable)) {
            ci ciVar = kiVar.f36497w2;
            if (ciVar != null) {
                ciVar.D(ciVar.getSelectedItemsCount());
            }
            this.f38977b = !this.f38977b;
        }
        boolean z13 = false;
        if (this.f38976a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, phVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f38976a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        kiVar.G1 = codePointCount;
        te.a aVar = kiVar.f36468p1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = kiVar.F1;
        if (i11 > 0 && (i7 = i11 - kiVar.G1) <= 100) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            String E = org.telegram.messenger.hd.E(j3, ',');
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
            if (i7 < 0) {
                org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29070p7, kiVar.J0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.q6.Y(h6Var2, org.telegram.ui.ActionBar.j6.f29241y6, kiVar.J0);
                z11 = true;
            }
            h6Var.c(org.telegram.messenger.hd.E(j3, ','), false, true);
            h6Var.setAlpha(1.0f);
        } else {
            h6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x5(this, 9));
            h6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (kiVar.S2 != z11) {
            kiVar.S2 = z11;
            kiVar.G2.invalidate();
        }
        if (!kiVar.f36443g4 && !org.telegram.messenger.np.s1(i10).D3() && !org.telegram.messenger.m10.i(i10).q() && kiVar.G1 > org.telegram.messenger.np.s1(i10).U4 && kiVar.G1 < org.telegram.messenger.np.s1(i10).V4) {
            kiVar.f36443g4 = true;
            kiVar.D1(this.f38978c);
        }
        if (kiVar.X1) {
            if (phVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(phVar.getText().toString().trim())) {
                z13 = true;
            }
            kiVar.B1(z13);
        }
        kiVar.Q0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f38976a = true;
        }
        ki kiVar = this.d;
        if (kiVar.C4 == null) {
            ki.K0(kiVar);
        }
        if (kiVar.C4.getAdapter() != null) {
            kiVar.C4.setReversed(true);
            kiVar.C4.getAdapter().U(charSequence, kiVar.N2.getEditText().getSelectionStart(), null, false, false);
            kiVar.J1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
