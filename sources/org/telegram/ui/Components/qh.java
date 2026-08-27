package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;

public final class qh implements TextWatcher {

    public boolean f31906a;

    public boolean f31907b;

    public final org.telegram.ui.ActionBar.n2 f31908c;
    public final gi d;

    public qh(gi giVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = giVar;
        this.f31908c = n2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        gi giVar = this.d;
        j6 j6Var = giVar.f28689s;
        ph phVar = giVar.L0;
        int i11 = giVar.F1;
        j6 j6Var2 = giVar.v;
        if (this.f31907b != TextUtils.isEmpty(editable)) {
            yh yhVar = giVar.f28696u0;
            if (yhVar != null) {
                yhVar.C(yhVar.getSelectedItemsCount());
            }
            this.f31907b = !this.f31907b;
        }
        boolean z11 = false;
        if (this.f31906a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, phVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f31906a = false;
        }
        int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
        giVar.H = iCodePointCount;
        giVar.f28645e.a(iCodePointCount > 0, true);
        int i12 = giVar.G;
        if (i12 <= 0 || (i10 = i12 - giVar.H) > 100) {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 13));
            j6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            j6Var2.c(LocaleController.formatNumber(j10, ','), j6Var2.getVisibility() == 0, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                z10 = false;
            } else {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
                z10 = true;
            }
            j6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            j6Var.setAlpha(1.0f);
        }
        if (giVar.Q0 != z10) {
            giVar.Q0 = z10;
            giVar.E0.invalidate();
        }
        if (!giVar.f28648e2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && giVar.H > MessagesController.getInstance(i11).captionLengthLimitDefault && giVar.H < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            giVar.f28648e2 = true;
            giVar.O1(this.f31908c);
        }
        if (giVar.Y) {
            if (phVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(phVar.getText().toString().trim())) {
                z11 = true;
            }
            giVar.M1(z11);
        }
        giVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f31906a = true;
        }
        gi giVar = this.d;
        if (giVar.f28709x2 == null) {
            gi.Q(giVar);
        }
        if (giVar.f28709x2.getAdapter() != null) {
            giVar.f28709x2.setReversed(true);
            giVar.f28709x2.getAdapter().U(charSequence, giVar.L0.getEditText().getSelectionStart(), null, false, false);
            giVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
