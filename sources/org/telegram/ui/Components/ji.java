package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class ji implements TextWatcher {
    public boolean f27527a;
    public boolean f27528b;
    public final org.telegram.ui.ActionBar.m2 f27529c;
    public final aj d;

    public ji(aj ajVar, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = ajVar;
        this.f27529c = m2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        aj ajVar = this.d;
        r6 r6Var = ajVar.f24381s;
        ii iiVar = ajVar.S0;
        int i11 = ajVar.M1;
        r6 r6Var2 = ajVar.v;
        if (this.f27528b != TextUtils.isEmpty(editable)) {
            si siVar = ajVar.B0;
            if (siVar != null) {
                siVar.E(siVar.getSelectedItemsCount());
            }
            this.f27528b = !this.f27528b;
        }
        boolean z13 = false;
        if (this.f27527a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, iiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f27527a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        ajVar.L = codePointCount;
        me.b bVar = ajVar.f24337e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = ajVar.K;
        if (i12 > 0 && (i10 = i12 - ajVar.L) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            String formatNumber = LocaleController.formatNumber(j3, ',');
            if (r6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            r6Var2.c(formatNumber, z12, true);
            if (r6Var2.getVisibility() != 0) {
                r6Var2.setVisibility(0);
                r6Var2.setAlpha(0.0f);
                r6Var2.setScaleX(0.5f);
                r6Var2.setScaleY(0.5f);
            }
            r6Var2.animate().setListener(null).cancel();
            r6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                r6Var2.setTextColor(ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20780p7));
                z11 = false;
            } else {
                r6Var2.setTextColor(ajVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20945y6));
                z11 = true;
            }
            r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            r6Var.setAlpha(1.0f);
        } else {
            r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 5));
            r6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (ajVar.X0 != z11) {
            ajVar.X0 = z11;
            ajVar.L0.invalidate();
        }
        if (!ajVar.f24361l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && ajVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && ajVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            ajVar.f24361l2 = true;
            ajVar.S1(this.f27529c);
        }
        if (ajVar.f24331c0) {
            if (iiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(iiVar.getText().toString().trim())) {
                z13 = true;
            }
            ajVar.Q1(z13);
        }
        ajVar.f1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f27527a = true;
        }
        aj ajVar = this.d;
        if (ajVar.E2 == null) {
            aj.S(ajVar);
        }
        if (ajVar.E2.getAdapter() != null) {
            ajVar.E2.setReversed(true);
            ajVar.E2.getAdapter().U(charSequence, ajVar.S0.getEditText().getSelectionStart(), null, false, false);
            ajVar.Y1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
