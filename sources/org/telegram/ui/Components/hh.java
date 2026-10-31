package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class hh implements TextWatcher {
    public boolean f26741a;
    public boolean f26742b;
    public final org.telegram.ui.ActionBar.k2 f26743c;
    public final bi d;

    public hh(bi biVar, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = biVar;
        this.f26743c = k2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        bi biVar = this.d;
        f6 f6Var = biVar.f24712q1;
        fh fhVar = biVar.J2;
        int i11 = biVar.D3;
        f6 f6Var2 = biVar.f24716r1;
        if (this.f26742b != TextUtils.isEmpty(editable)) {
            uh uhVar = biVar.f24721s2;
            if (uhVar != null) {
                uhVar.D(uhVar.getSelectedItemsCount());
            }
            this.f26742b = !this.f26742b;
        }
        boolean z13 = false;
        if (this.f26741a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.k6.l(editable, fhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f26741a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        biVar.C1 = codePointCount;
        fe.b bVar = biVar.l1;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = biVar.B1;
        if (i12 > 0 && (i10 = i12 - biVar.C1) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            String E = org.telegram.messenger.cd.E(j10, ',');
            if (f6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            f6Var2.c(E, z12, true);
            if (f6Var2.getVisibility() != 0) {
                f6Var2.setVisibility(0);
                f6Var2.setAlpha(0.0f);
                f6Var2.setScaleX(0.5f);
                f6Var2.setScaleY(0.5f);
            }
            f6Var2.animate().setListener(null).cancel();
            f6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.f21153p7, biVar.I0);
                z11 = false;
            } else {
                org.telegram.ui.ActionBar.a7.Z(f6Var2, org.telegram.ui.ActionBar.t6.f21311y6, biVar.I0);
                z11 = true;
            }
            f6Var.c(org.telegram.messenger.cd.E(j10, ','), false, true);
            f6Var.setAlpha(1.0f);
        } else {
            f6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new w5(this, 9));
            f6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (biVar.O2 != z11) {
            biVar.O2 = z11;
            biVar.C2.invalidate();
        }
        if (!biVar.f24666c4 && !org.telegram.messenger.vp.r1(i11).A3() && !org.telegram.messenger.d20.i(i11).q() && biVar.C1 > org.telegram.messenger.vp.r1(i11).U4 && biVar.C1 < org.telegram.messenger.vp.r1(i11).V4) {
            biVar.f24666c4 = true;
            biVar.C1(this.f26743c);
        }
        if (biVar.T1) {
            if (fhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fhVar.getText().toString().trim())) {
                z13 = true;
            }
            biVar.A1(z13);
        }
        biVar.Q0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f26741a = true;
        }
        bi biVar = this.d;
        if (biVar.f24746y4 == null) {
            bi.K0(biVar);
        }
        if (biVar.f24746y4.getAdapter() != null) {
            biVar.f24746y4.setReversed(true);
            biVar.f24746y4.getAdapter().U(charSequence, biVar.J2.getEditText().getSelectionStart(), null, false, false);
            biVar.I1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
