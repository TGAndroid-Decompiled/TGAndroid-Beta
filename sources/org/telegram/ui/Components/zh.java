package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class zh implements TextWatcher {
    public boolean f42891a;
    public boolean f42892b;
    public final org.telegram.ui.ActionBar.h2 f42893c;
    public final si d;

    public zh(si siVar, org.telegram.ui.ActionBar.h2 h2Var) {
        this.d = siVar;
        this.f42893c = h2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        si siVar = this.d;
        n6 n6Var = siVar.f39723u1;
        xh xhVar = siVar.N2;
        int i10 = siVar.H3;
        n6 n6Var2 = siVar.f39727v1;
        if (this.f42892b != TextUtils.isEmpty(editable)) {
            ki kiVar = siVar.f39732w2;
            if (kiVar != null) {
                kiVar.E(kiVar.getSelectedItemsCount());
            }
            this.f42892b = !this.f42892b;
        }
        boolean z13 = false;
        if (this.f42891a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, xhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f42891a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        siVar.G1 = codePointCount;
        te.a aVar = siVar.f39703p1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = siVar.F1;
        if (i11 > 0 && (i7 = i11 - siVar.G1) <= 100) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            String E = org.telegram.messenger.gd.E(j3, ',');
            if (n6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            n6Var2.c(E, z12, true);
            if (n6Var2.getVisibility() != 0) {
                n6Var2.setVisibility(0);
                n6Var2.setAlpha(0.0f);
                n6Var2.setScaleX(0.5f);
                n6Var2.setScaleY(0.5f);
            }
            n6Var2.animate().setListener(null).cancel();
            n6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29617p7, siVar.J0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29788y6, siVar.J0);
                z11 = true;
            }
            n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
            n6Var.setAlpha(1.0f);
        } else {
            n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 10));
            n6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (siVar.S2 != z11) {
            siVar.S2 = z11;
            siVar.G2.invalidate();
        }
        if (!siVar.f39678g4 && !org.telegram.messenger.mp.u1(i10).K3() && !org.telegram.messenger.j10.i(i10).q() && siVar.G1 > org.telegram.messenger.mp.u1(i10).W4 && siVar.G1 < org.telegram.messenger.mp.u1(i10).X4) {
            siVar.f39678g4 = true;
            siVar.E1(this.f42893c);
        }
        if (siVar.X1) {
            if (xhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(xhVar.getText().toString().trim())) {
                z13 = true;
            }
            siVar.C1(z13);
        }
        siVar.R0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f42891a = true;
        }
        si siVar = this.d;
        if (siVar.C4 == null) {
            si.L0(siVar);
        }
        if (siVar.C4.getAdapter() != null) {
            siVar.C4.setReversed(true);
            siVar.C4.getAdapter().U(charSequence, siVar.N2.getEditText().getSelectionStart(), null, false, false);
            siVar.K1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
