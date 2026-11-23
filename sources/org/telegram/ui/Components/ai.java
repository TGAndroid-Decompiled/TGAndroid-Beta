package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class ai implements TextWatcher {
    public boolean f33477a;
    public boolean f33478b;
    public final org.telegram.ui.ActionBar.g2 f33479c;
    public final ti d;

    public ai(ti tiVar, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = tiVar;
        this.f33479c = g2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        ti tiVar = this.d;
        n6 n6Var = tiVar.f40020u1;
        yh yhVar = tiVar.N2;
        int i10 = tiVar.H3;
        n6 n6Var2 = tiVar.f40024v1;
        if (this.f33478b != TextUtils.isEmpty(editable)) {
            li liVar = tiVar.f40029w2;
            if (liVar != null) {
                liVar.D(liVar.getSelectedItemsCount());
            }
            this.f33478b = !this.f33478b;
        }
        boolean z13 = false;
        if (this.f33477a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.j6.l(editable, yhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f33477a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.G1 = codePointCount;
        te.a aVar = tiVar.f40000p1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = tiVar.F1;
        if (i11 > 0 && (i7 = i11 - tiVar.G1) <= 100) {
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
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29672p7, tiVar.J0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.u6.Y(n6Var2, org.telegram.ui.ActionBar.n6.f29843y6, tiVar.J0);
                z11 = true;
            }
            n6Var.c(org.telegram.messenger.gd.E(j3, ','), false, true);
            n6Var.setAlpha(1.0f);
        } else {
            n6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new x(this, 10));
            n6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (tiVar.S2 != z11) {
            tiVar.S2 = z11;
            tiVar.G2.invalidate();
        }
        if (!tiVar.f39975g4 && !org.telegram.messenger.mp.u1(i10).K3() && !org.telegram.messenger.i10.i(i10).q() && tiVar.G1 > org.telegram.messenger.mp.u1(i10).W4 && tiVar.G1 < org.telegram.messenger.mp.u1(i10).X4) {
            tiVar.f39975g4 = true;
            tiVar.E1(this.f33479c);
        }
        if (tiVar.X1) {
            if (yhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(yhVar.getText().toString().trim())) {
                z13 = true;
            }
            tiVar.C1(z13);
        }
        tiVar.R0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f33477a = true;
        }
        ti tiVar = this.d;
        if (tiVar.C4 == null) {
            ti.L0(tiVar);
        }
        if (tiVar.C4.getAdapter() != null) {
            tiVar.C4.setReversed(true);
            tiVar.C4.getAdapter().U(charSequence, tiVar.N2.getEditText().getSelectionStart(), null, false, false);
            tiVar.K1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
