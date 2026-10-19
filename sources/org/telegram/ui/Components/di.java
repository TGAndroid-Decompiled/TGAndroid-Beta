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
    public boolean f25567a;
    public boolean f25568b;
    public final org.telegram.ui.ActionBar.n2 f25569c;
    public final ti d;

    public di(ti tiVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = tiVar;
        this.f25569c = n2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ti tiVar = this.d;
        q6 q6Var = tiVar.f30575s;
        ci ciVar = tiVar.S0;
        int i11 = tiVar.M1;
        q6 q6Var2 = tiVar.v;
        if (this.f25568b != TextUtils.isEmpty(editable)) {
            li liVar = tiVar.B0;
            if (liVar != null) {
                liVar.D(liVar.getSelectedItemsCount());
            }
            this.f25568b = !this.f25568b;
        }
        boolean z13 = false;
        if (this.f25567a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, ciVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f25567a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.L = codePointCount;
        ne.b bVar = tiVar.e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = tiVar.K;
        if (i12 > 0 && (i10 = i12 - tiVar.L) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            String formatNumber = LocaleController.formatNumber(j10, ',');
            if (q6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q6Var2.c(formatNumber, z12, true);
            if (q6Var2.getVisibility() != 0) {
                q6Var2.setVisibility(0);
                q6Var2.setAlpha(0.0f);
                q6Var2.setScaleX(0.5f);
                q6Var2.setScaleY(0.5f);
            }
            q6Var2.animate().setListener(null).cancel();
            q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21210p7));
                z11 = false;
            } else {
                q6Var2.setTextColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21377y6));
                z11 = true;
            }
            q6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            q6Var.setAlpha(1.0f);
        } else {
            q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.nq(this, 10));
            q6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (tiVar.X0 != z11) {
            tiVar.X0 = z11;
            tiVar.L0.invalidate();
        }
        if (!tiVar.f30555l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && tiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && tiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            tiVar.f30555l2 = true;
            tiVar.S1(this.f25569c);
        }
        if (tiVar.f30526c0) {
            if (ciVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ciVar.getText().toString().trim())) {
                z13 = true;
            }
            tiVar.Q1(z13);
        }
        tiVar.f1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f25567a = true;
        }
        ti tiVar = this.d;
        if (tiVar.E2 == null) {
            ti.S(tiVar);
        }
        if (tiVar.E2.getAdapter() != null) {
            tiVar.E2.setReversed(true);
            tiVar.E2.getAdapter().U(charSequence, tiVar.S0.getEditText().getSelectionStart(), null, false, false);
            tiVar.Y1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
