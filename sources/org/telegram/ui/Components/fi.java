package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class fi implements TextWatcher {
    public boolean f24278a;
    public boolean f24279b;
    public final org.telegram.ui.ActionBar.m2 f24280c;
    public final wi d;

    public fi(wi wiVar, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = wiVar;
        this.f24280c = m2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        wi wiVar = this.d;
        p6 p6Var = wiVar.f30059s;
        ei eiVar = wiVar.P0;
        int i11 = wiVar.J1;
        p6 p6Var2 = wiVar.v;
        if (this.f24279b != TextUtils.isEmpty(editable)) {
            oi oiVar = wiVar.f30081y0;
            if (oiVar != null) {
                oiVar.A(oiVar.getSelectedItemsCount());
            }
            this.f24279b = !this.f24279b;
        }
        boolean z13 = false;
        if (this.f24278a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, eiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f24278a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        wiVar.L = codePointCount;
        le.c cVar = wiVar.e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a(z10, true);
        int i12 = wiVar.K;
        if (i12 > 0 && (i10 = i12 - wiVar.L) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            String formatNumber = LocaleController.formatNumber(j3, ',');
            if (p6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            p6Var2.c(formatNumber, z12, true);
            if (p6Var2.getVisibility() != 0) {
                p6Var2.setVisibility(0);
                p6Var2.setAlpha(0.0f);
                p6Var2.setScaleX(0.5f);
                p6Var2.setScaleY(0.5f);
            }
            p6Var2.animate().setListener(null).cancel();
            p6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19279p7));
                z11 = false;
            } else {
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19442y6));
                z11 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        } else {
            p6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r8(this, 5));
            p6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (wiVar.U0 != z11) {
            wiVar.U0 = z11;
            wiVar.I0.invalidate();
        }
        if (!wiVar.f30031i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && wiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && wiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            wiVar.f30031i2 = true;
            wiVar.O1(this.f24280c);
        }
        if (wiVar.f30010c0) {
            if (eiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(eiVar.getText().toString().trim())) {
                z13 = true;
            }
            wiVar.M1(z13);
        }
        wiVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f24278a = true;
        }
        wi wiVar = this.d;
        if (wiVar.B2 == null) {
            wi.Q(wiVar);
        }
        if (wiVar.B2.getAdapter() != null) {
            wiVar.B2.setReversed(true);
            wiVar.B2.getAdapter().U(charSequence, wiVar.P0.getEditText().getSelectionStart(), null, false, false);
            wiVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
