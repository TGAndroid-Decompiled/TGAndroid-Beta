package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class uh implements TextWatcher {
    public boolean f32998a;
    public boolean f32999b;
    public final org.telegram.ui.ActionBar.o2 f33000c;
    public final ki d;

    public uh(ki kiVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = kiVar;
        this.f33000c = o2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i9;
        boolean z12;
        ki kiVar = this.d;
        j6 j6Var = kiVar.f30153s;
        th thVar = kiVar.L0;
        int i10 = kiVar.F1;
        j6 j6Var2 = kiVar.v;
        if (this.f32999b != TextUtils.isEmpty(editable)) {
            ci ciVar = kiVar.f30160u0;
            if (ciVar != null) {
                ciVar.A(ciVar.getSelectedItemsCount());
            }
            this.f32999b = !this.f32999b;
        }
        boolean z13 = false;
        if (this.f32998a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f32998a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        kiVar.H = codePointCount;
        td.a aVar = kiVar.f30109e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i11 = kiVar.G;
        if (i11 > 0 && (i9 = i11 - kiVar.H) <= 100) {
            if (i9 < -9999) {
                i9 = -9999;
            }
            long j10 = i9;
            String formatNumber = LocaleController.formatNumber(j10, ',');
            if (j6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            j6Var2.c(formatNumber, z12, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i9 < 0) {
                j6Var2.setTextColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23212p7));
                z11 = false;
            } else {
                j6Var2.setTextColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
                z11 = true;
            }
            j6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            j6Var.setAlpha(1.0f);
        } else {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.xp(this, 11));
            j6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (kiVar.Q0 != z11) {
            kiVar.Q0 = z11;
            kiVar.E0.invalidate();
        }
        if (!kiVar.f30112e2 && !MessagesController.getInstance(i10).premiumFeaturesBlocked() && !UserConfig.getInstance(i10).isPremium() && kiVar.H > MessagesController.getInstance(i10).captionLengthLimitDefault && kiVar.H < MessagesController.getInstance(i10).captionLengthLimitPremium) {
            kiVar.f30112e2 = true;
            kiVar.O1(this.f33000c);
        }
        if (kiVar.Y) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z13 = true;
            }
            kiVar.M1(z13);
        }
        kiVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f32998a = true;
        }
        ki kiVar = this.d;
        if (kiVar.f30173x2 == null) {
            ki.P(kiVar);
        }
        if (kiVar.f30173x2.getAdapter() != null) {
            kiVar.f30173x2.setReversed(true);
            kiVar.f30173x2.getAdapter().U(charSequence, kiVar.L0.getEditText().getSelectionStart(), null, false, false);
            kiVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
