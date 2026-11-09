package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class kh implements TextWatcher {
    public boolean f35341a;
    public boolean f35342b;
    public final org.telegram.ui.ActionBar.f2 f35343c;
    public final di d;

    public kh(di diVar, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = diVar;
        this.f35343c = f2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        di diVar = this.d;
        j6 j6Var = diVar.f33038q1;
        ih ihVar = diVar.J2;
        int i10 = diVar.D3;
        j6 j6Var2 = diVar.f33042r1;
        if (this.f35342b != TextUtils.isEmpty(editable)) {
            vh vhVar = diVar.f33047s2;
            if (vhVar != null) {
                vhVar.D(vhVar.getSelectedItemsCount());
            }
            this.f35342b = !this.f35342b;
        }
        boolean z12 = false;
        if (this.f35341a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, ihVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f35341a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        diVar.C1 = codePointCount;
        te.a aVar = diVar.l1;
        if (codePointCount > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(z9, true);
        int i11 = diVar.B1;
        if (i11 > 0 && (i7 = i11 - diVar.C1) <= 100) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            String E = org.telegram.messenger.id.E(j3, ',');
            if (j6Var2.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var2.c(E, z11, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.f28086p7, diVar.I0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.s6.Y(j6Var2, org.telegram.ui.ActionBar.l6.f28257y6, diVar.I0);
                z10 = true;
            }
            j6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
            j6Var.setAlpha(1.0f);
        } else {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new z5(this, 9));
            j6Var.setAlpha(0.0f);
            z10 = true;
        }
        if (diVar.O2 != z10) {
            diVar.O2 = z10;
            diVar.C2.invalidate();
        }
        if (!diVar.f32995c4 && !org.telegram.messenger.qp.s1(i10).D3() && !org.telegram.messenger.p10.i(i10).q() && diVar.C1 > org.telegram.messenger.qp.s1(i10).T4 && diVar.C1 < org.telegram.messenger.qp.s1(i10).U4) {
            diVar.f32995c4 = true;
            diVar.D1(this.f35343c);
        }
        if (diVar.T1) {
            if (ihVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ihVar.getText().toString().trim())) {
                z12 = true;
            }
            diVar.B1(z12);
        }
        diVar.Q0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f35341a = true;
        }
        di diVar = this.d;
        if (diVar.f33073y4 == null) {
            di.K0(diVar);
        }
        if (diVar.f33073y4.getAdapter() != null) {
            diVar.f33073y4.setReversed(true);
            diVar.f33073y4.getAdapter().U(charSequence, diVar.J2.getEditText().getSelectionStart(), null, false, false);
            diVar.J1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
