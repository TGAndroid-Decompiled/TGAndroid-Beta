package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class ei implements TextWatcher {
    public boolean f24391a;
    public boolean f24392b;
    public final org.telegram.ui.ActionBar.m2 f24393c;
    public final vi d;

    public ei(vi viVar, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = viVar;
        this.f24393c = m2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        vi viVar = this.d;
        s6 s6Var = viVar.f29711s;
        di diVar = viVar.S0;
        int i11 = viVar.M1;
        s6 s6Var2 = viVar.v;
        if (this.f24392b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.B0;
            if (niVar != null) {
                niVar.E(niVar.getSelectedItemsCount());
            }
            this.f24392b = !this.f24392b;
        }
        boolean z13 = false;
        if (this.f24391a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f24391a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        viVar.L = codePointCount;
        ne.b bVar = viVar.e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = viVar.K;
        if (i12 > 0 && (i10 = i12 - viVar.L) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            String formatNumber = LocaleController.formatNumber(j10, ',');
            if (s6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            s6Var2.c(formatNumber, z12, true);
            if (s6Var2.getVisibility() != 0) {
                s6Var2.setVisibility(0);
                s6Var2.setAlpha(0.0f);
                s6Var2.setScaleX(0.5f);
                s6Var2.setScaleY(0.5f);
            }
            s6Var2.animate().setListener(null).cancel();
            s6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19822p7));
                z11 = false;
            } else {
                s6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19988y6));
                z11 = true;
            }
            s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            s6Var.setAlpha(1.0f);
        } else {
            s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new l6(this, 8));
            s6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (viVar.X0 != z11) {
            viVar.X0 = z11;
            viVar.L0.invalidate();
        }
        if (!viVar.f29691l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && viVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && viVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            viVar.f29691l2 = true;
            viVar.S1(this.f24393c);
        }
        if (viVar.f29662c0) {
            if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                z13 = true;
            }
            viVar.Q1(z13);
        }
        viVar.f1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f24391a = true;
        }
        vi viVar = this.d;
        if (viVar.E2 == null) {
            vi.S(viVar);
        }
        if (viVar.E2.getAdapter() != null) {
            viVar.E2.setReversed(true);
            viVar.E2.getAdapter().U(charSequence, viVar.S0.getEditText().getSelectionStart(), null, false, false);
            viVar.Y1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
