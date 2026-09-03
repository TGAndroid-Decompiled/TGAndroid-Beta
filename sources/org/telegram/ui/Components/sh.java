package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class sh implements TextWatcher {
    public boolean f31059a;
    public boolean f31060b;
    public final mi f31061c;

    public sh(mi miVar) {
        this.f31061c = miVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        mi miVar = this.f31061c;
        k6 k6Var = miVar.v;
        qh qhVar = miVar.B0;
        k6 k6Var2 = miVar.f29108s;
        if (this.f31060b != TextUtils.isEmpty(editable)) {
            ei eiVar = miVar.f29118v0;
            if (eiVar != null) {
                eiVar.B(eiVar.getSelectedItemsCount());
            }
            this.f31060b = !this.f31060b;
        }
        boolean z12 = false;
        if (this.f31059a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f31059a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        miVar.I = codePointCount;
        xd.a aVar = miVar.f29064e;
        if (codePointCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        int i11 = miVar.H;
        if (i11 > 0 && (i10 = i11 - miVar.I) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            String formatNumber = LocaleController.formatNumber(j10, ',');
            if (k6Var2.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var2.c(formatNumber, z11, true);
            if (k6Var2.getVisibility() != 0) {
                k6Var2.setVisibility(0);
                k6Var2.setAlpha(0.0f);
                k6Var2.setScaleX(0.5f);
                k6Var2.setScaleY(0.5f);
            }
            k6Var2.animate().setListener(null).cancel();
            k6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21878p7));
                z10 = false;
            } else {
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f22038y6));
                z10 = true;
            }
            k6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            k6Var.setAlpha(1.0f);
        } else {
            k6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 3));
            k6Var.setAlpha(0.0f);
            z10 = true;
        }
        if (miVar.R0 != z10) {
            miVar.R0 = z10;
            miVar.F0.invalidate();
        }
        if (!miVar.Z) {
            if (qhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(qhVar.getText().toString().trim())) {
                z12 = true;
            }
            miVar.M1(z12);
        }
        miVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f31059a = true;
        }
        mi miVar = this.f31061c;
        if (miVar.f29132y2 == null) {
            mi.Q(miVar);
        }
        if (miVar.f29132y2.getAdapter() != null) {
            miVar.f29132y2.setReversed(false);
            miVar.f29132y2.getAdapter().U(charSequence, miVar.B0.getEditText().getSelectionStart(), null, false, false);
            miVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
