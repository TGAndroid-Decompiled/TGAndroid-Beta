package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class hi implements TextWatcher {
    public boolean f27077a;
    public boolean f27078b;
    public final org.telegram.ui.ActionBar.n2 f27079c;
    public final yi d;

    public hi(yi yiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = yiVar;
        this.f27079c = n2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        yi yiVar = this.d;
        r6 r6Var = yiVar.f33267s;
        gi giVar = yiVar.S0;
        int i11 = yiVar.M1;
        r6 r6Var2 = yiVar.v;
        if (this.f27078b != TextUtils.isEmpty(editable)) {
            qi qiVar = yiVar.B0;
            if (qiVar != null) {
                qiVar.E(qiVar.getSelectedItemsCount());
            }
            this.f27078b = !this.f27078b;
        }
        boolean z13 = false;
        if (this.f27077a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, giVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f27077a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        yiVar.L = codePointCount;
        me.b bVar = yiVar.f33223e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = yiVar.K;
        if (i12 > 0 && (i10 = i12 - yiVar.L) <= 100) {
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
                r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21018p7));
                z11 = false;
            } else {
                r6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21181y6));
                z11 = true;
            }
            r6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            r6Var.setAlpha(1.0f);
        } else {
            r6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new t8(this, 5));
            r6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (yiVar.X0 != z11) {
            yiVar.X0 = z11;
            yiVar.L0.invalidate();
        }
        if (!yiVar.f33247l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && yiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && yiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            yiVar.f33247l2 = true;
            yiVar.S1(this.f27079c);
        }
        if (yiVar.f33217c0) {
            if (giVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(giVar.getText().toString().trim())) {
                z13 = true;
            }
            yiVar.Q1(z13);
        }
        yiVar.f1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f27077a = true;
        }
        yi yiVar = this.d;
        if (yiVar.E2 == null) {
            yi.S(yiVar);
        }
        if (yiVar.E2.getAdapter() != null) {
            yiVar.E2.setReversed(true);
            yiVar.E2.getAdapter().U(charSequence, yiVar.S0.getEditText().getSelectionStart(), null, false, false);
            yiVar.Y1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
