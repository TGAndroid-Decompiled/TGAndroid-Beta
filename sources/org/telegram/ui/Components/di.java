package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class di implements TextWatcher {
    public boolean f25732a;
    public boolean f25733b;
    public final org.telegram.ui.ActionBar.n2 f25734c;
    public final xi d;

    public di(xi xiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = xiVar;
        this.f25734c = n2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        xi xiVar = this.d;
        p6 p6Var = xiVar.f32851s;
        bi biVar = xiVar.P0;
        int i11 = xiVar.J1;
        p6 p6Var2 = xiVar.v;
        if (this.f25733b != TextUtils.isEmpty(editable)) {
            pi piVar = xiVar.f32873y0;
            if (piVar != null) {
                piVar.A(piVar.getSelectedItemsCount());
            }
            this.f25733b = !this.f25733b;
        }
        boolean z13 = false;
        if (this.f25732a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, biVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f25732a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        xiVar.L = codePointCount;
        le.b bVar = xiVar.f32807e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = xiVar.K;
        if (i12 > 0 && (i10 = i12 - xiVar.L) <= 100) {
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
                p6Var2.setTextColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21039p7));
                z11 = false;
            } else {
                p6Var2.setTextColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21204y6));
                z11 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        } else {
            p6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r8(this, 5));
            p6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (xiVar.U0 != z11) {
            xiVar.U0 = z11;
            xiVar.I0.invalidate();
        }
        if (!xiVar.f32823i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && xiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && xiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            xiVar.f32823i2 = true;
            xiVar.L1(this.f25734c);
        }
        if (xiVar.f32801c0) {
            if (biVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(biVar.getText().toString().trim())) {
                z13 = true;
            }
            xiVar.J1(z13);
        }
        xiVar.b1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f25732a = true;
        }
        xi xiVar = this.d;
        if (xiVar.B2 == null) {
            xi.H(xiVar);
        }
        if (xiVar.B2.getAdapter() != null) {
            xiVar.B2.setReversed(true);
            xiVar.B2.getAdapter().U(charSequence, xiVar.P0.getEditText().getSelectionStart(), null, false, false);
            xiVar.R1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
