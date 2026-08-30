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
    public boolean f29219a;
    public boolean f29220b;
    public final org.telegram.ui.ActionBar.p2 f29221c;
    public final li d;

    public uh(li liVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = liVar;
        this.f29221c = p2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        li liVar = this.d;
        k6 k6Var = liVar.f26738s;
        th thVar = liVar.M0;
        int i11 = liVar.G1;
        k6 k6Var2 = liVar.v;
        if (this.f29220b != TextUtils.isEmpty(editable)) {
            di diVar = liVar.f26748v0;
            if (diVar != null) {
                diVar.B(diVar.getSelectedItemsCount());
            }
            this.f29220b = !this.f29220b;
        }
        boolean z12 = false;
        if (this.f29219a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f29219a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        liVar.I = codePointCount;
        xd.a aVar = liVar.e;
        if (codePointCount > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        aVar.a(z4, true);
        int i12 = liVar.H;
        if (i12 > 0 && (i10 = i12 - liVar.I) <= 100) {
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
                k6Var2.setTextColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
                z10 = false;
            } else {
                k6Var2.setTextColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20281y6));
                z10 = true;
            }
            k6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            k6Var.setAlpha(1.0f);
        } else {
            k6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new a9(this, 4));
            k6Var.setAlpha(0.0f);
            z10 = true;
        }
        if (liVar.R0 != z10) {
            liVar.R0 = z10;
            liVar.F0.invalidate();
        }
        if (!liVar.f26701f2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && liVar.I > MessagesController.getInstance(i11).captionLengthLimitDefault && liVar.I < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            liVar.f26701f2 = true;
            liVar.O1(this.f29221c);
        }
        if (liVar.Z) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z12 = true;
            }
            liVar.M1(z12);
        }
        liVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f29219a = true;
        }
        li liVar = this.d;
        if (liVar.f26762y2 == null) {
            li.Q(liVar);
        }
        if (liVar.f26762y2.getAdapter() != null) {
            liVar.f26762y2.setReversed(true);
            liVar.f26762y2.getAdapter().U(charSequence, liVar.M0.getEditText().getSelectionStart(), null, false, false);
            liVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
