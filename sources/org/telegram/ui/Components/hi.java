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
    public boolean f23637a;
    public boolean f23638b;
    public final org.telegram.ui.ActionBar.p2 f23639c;
    public final yi d;

    public hi(yi yiVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = yiVar;
        this.f23639c = p2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        yi yiVar = this.d;
        o6 o6Var = yiVar.f29405s;
        gi giVar = yiVar.P0;
        int i11 = yiVar.J1;
        o6 o6Var2 = yiVar.v;
        if (this.f23638b != TextUtils.isEmpty(editable)) {
            qi qiVar = yiVar.f29427y0;
            if (qiVar != null) {
                qiVar.A(qiVar.getSelectedItemsCount());
            }
            this.f23638b = !this.f23638b;
        }
        boolean z13 = false;
        if (this.f23637a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, giVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f23637a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        yiVar.L = codePointCount;
        le.b bVar = yiVar.e;
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
            if (o6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            o6Var2.c(formatNumber, z12, true);
            if (o6Var2.getVisibility() != 0) {
                o6Var2.setVisibility(0);
                o6Var2.setAlpha(0.0f);
                o6Var2.setScaleX(0.5f);
                o6Var2.setScaleY(0.5f);
            }
            o6Var2.animate().setListener(null).cancel();
            o6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                o6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7));
                z11 = false;
            } else {
                o6Var2.setTextColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18306y6));
                z11 = true;
            }
            o6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            o6Var.setAlpha(1.0f);
        } else {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.Cells.v5(this, 25));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (yiVar.U0 != z11) {
            yiVar.U0 = z11;
            yiVar.I0.invalidate();
        }
        if (!yiVar.f29377i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && yiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && yiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            yiVar.f29377i2 = true;
            yiVar.O1(this.f23639c);
        }
        if (yiVar.f29356c0) {
            if (giVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(giVar.getText().toString().trim())) {
                z13 = true;
            }
            yiVar.M1(z13);
        }
        yiVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f23637a = true;
        }
        yi yiVar = this.d;
        if (yiVar.B2 == null) {
            yi.Q(yiVar);
        }
        if (yiVar.B2.getAdapter() != null) {
            yiVar.B2.setReversed(true);
            yiVar.B2.getAdapter().U(charSequence, yiVar.P0.getEditText().getSelectionStart(), null, false, false);
            yiVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
