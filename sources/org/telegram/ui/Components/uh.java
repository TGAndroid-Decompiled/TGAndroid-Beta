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
    public boolean f31677a;
    public boolean f31678b;
    public final org.telegram.ui.ActionBar.p2 f31679c;
    public final mi d;

    public uh(mi miVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = miVar;
        this.f31679c = p2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        mi miVar = this.d;
        k6 k6Var = miVar.f29090s;
        th thVar = miVar.M0;
        int i11 = miVar.G1;
        k6 k6Var2 = miVar.v;
        if (this.f31678b != TextUtils.isEmpty(editable)) {
            ei eiVar = miVar.f29100v0;
            if (eiVar != null) {
                eiVar.B(eiVar.getSelectedItemsCount());
            }
            this.f31678b = !this.f31678b;
        }
        boolean z12 = false;
        if (this.f31677a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f31677a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        miVar.I = codePointCount;
        xd.a aVar = miVar.f29046e;
        if (codePointCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        int i12 = miVar.H;
        if (i12 > 0 && (i10 = i12 - miVar.I) <= 100) {
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
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
                z10 = false;
            } else {
                k6Var2.setTextColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f22036y6));
                z10 = true;
            }
            k6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            k6Var.setAlpha(1.0f);
        } else {
            k6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 4));
            k6Var.setAlpha(0.0f);
            z10 = true;
        }
        if (miVar.R0 != z10) {
            miVar.R0 = z10;
            miVar.F0.invalidate();
        }
        if (!miVar.f29053f2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && miVar.I > MessagesController.getInstance(i11).captionLengthLimitDefault && miVar.I < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            miVar.f29053f2 = true;
            miVar.O1(this.f31679c);
        }
        if (miVar.Z) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z12 = true;
            }
            miVar.M1(z12);
        }
        miVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f31677a = true;
        }
        mi miVar = this.d;
        if (miVar.f29114y2 == null) {
            mi.Q(miVar);
        }
        if (miVar.f29114y2.getAdapter() != null) {
            miVar.f29114y2.setReversed(true);
            miVar.f29114y2.getAdapter().U(charSequence, miVar.M0.getEditText().getSelectionStart(), null, false, false);
            miVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
