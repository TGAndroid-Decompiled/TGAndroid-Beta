package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class jh implements TextWatcher {
    public boolean f34932a;
    public boolean f34933b;
    public final org.telegram.ui.ActionBar.f2 f34934c;
    public final ci d;

    public jh(ci ciVar, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = ciVar;
        this.f34934c = f2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        ci ciVar = this.d;
        i6 i6Var = ciVar.f32651t1;
        hh hhVar = ciVar.M2;
        int i10 = ciVar.G3;
        i6 i6Var2 = ciVar.f32655u1;
        if (this.f34933b != TextUtils.isEmpty(editable)) {
            uh uhVar = ciVar.f32660v2;
            if (uhVar != null) {
                uhVar.D(uhVar.getSelectedItemsCount());
            }
            this.f34933b = !this.f34933b;
        }
        boolean z12 = false;
        if (this.f34932a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            org.telegram.messenger.i6.l(editable, hhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f34932a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        ciVar.F1 = codePointCount;
        te.a aVar = ciVar.f32632o1;
        if (codePointCount > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(z9, true);
        int i11 = ciVar.E1;
        if (i11 > 0 && (i7 = i11 - ciVar.F1) <= 100) {
            if (i7 < -9999) {
                i7 = -9999;
            }
            long j3 = i7;
            String E = org.telegram.messenger.id.E(j3, ',');
            if (i6Var2.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.c(E, z11, true);
            if (i6Var2.getVisibility() != 0) {
                i6Var2.setVisibility(0);
                i6Var2.setAlpha(0.0f);
                i6Var2.setScaleX(0.5f);
                i6Var2.setScaleY(0.5f);
            }
            i6Var2.animate().setListener(null).cancel();
            i6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i7 < 0) {
                org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.f28111p7, ciVar.I0);
                z10 = false;
            } else {
                org.telegram.ui.ActionBar.t6.Y(i6Var2, org.telegram.ui.ActionBar.m6.f28282y6, ciVar.I0);
                z10 = true;
            }
            i6Var.c(org.telegram.messenger.id.E(j3, ','), false, true);
            i6Var.setAlpha(1.0f);
        } else {
            i6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new y5(this, 9));
            i6Var.setAlpha(0.0f);
            z10 = true;
        }
        if (ciVar.R2 != z10) {
            ciVar.R2 = z10;
            ciVar.F2.invalidate();
        }
        if (!ciVar.f32607f4 && !org.telegram.messenger.qp.s1(i10).D3() && !org.telegram.messenger.p10.i(i10).q() && ciVar.F1 > org.telegram.messenger.qp.s1(i10).T4 && ciVar.F1 < org.telegram.messenger.qp.s1(i10).U4) {
            ciVar.f32607f4 = true;
            ciVar.D1(this.f34934c);
        }
        if (ciVar.W1) {
            if (hhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(hhVar.getText().toString().trim())) {
                z12 = true;
            }
            ciVar.B1(z12);
        }
        ciVar.Q0(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f34932a = true;
        }
        ci ciVar = this.d;
        if (ciVar.B4 == null) {
            ci.K0(ciVar);
        }
        if (ciVar.B4.getAdapter() != null) {
            ciVar.B4.setReversed(true);
            ciVar.B4.getAdapter().U(charSequence, ciVar.M2.getEditText().getSelectionStart(), null, false, false);
            ciVar.J1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
