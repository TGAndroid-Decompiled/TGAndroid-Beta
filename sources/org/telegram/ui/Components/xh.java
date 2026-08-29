package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class xh implements TextWatcher {
    public boolean f34722a;
    public boolean f34723b;
    public final org.telegram.ui.ActionBar.o2 f34724c;
    public final ni d;

    public xh(ni niVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = niVar;
        this.f34724c = o2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ni niVar = this.d;
        o6 o6Var = niVar.f31044s;
        wh whVar = niVar.L0;
        int i11 = niVar.F1;
        o6 o6Var2 = niVar.v;
        if (this.f34723b != TextUtils.isEmpty(editable)) {
            fi fiVar = niVar.f31051u0;
            if (fiVar != null) {
                fiVar.B(fiVar.getSelectedItemsCount());
            }
            this.f34723b = !this.f34723b;
        }
        boolean z13 = false;
        if (this.f34722a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, whVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f34722a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        niVar.H = codePointCount;
        vd.a aVar = niVar.f31000e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.a(z10, true);
        int i12 = niVar.G;
        if (i12 > 0 && (i10 = i12 - niVar.H) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            String formatNumber = LocaleController.formatNumber(j10, ',');
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
                o6Var2.setTextColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
                z11 = false;
            } else {
                o6Var2.setTextColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23433y6));
                z11 = true;
            }
            o6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            o6Var.setAlpha(1.0f);
        } else {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.bm(this, 13));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (niVar.Q0 != z11) {
            niVar.Q0 = z11;
            niVar.E0.invalidate();
        }
        if (!niVar.f31003e2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && niVar.H > MessagesController.getInstance(i11).captionLengthLimitDefault && niVar.H < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            niVar.f31003e2 = true;
            niVar.O1(this.f34724c);
        }
        if (niVar.Y) {
            if (whVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(whVar.getText().toString().trim())) {
                z13 = true;
            }
            niVar.M1(z13);
        }
        niVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f34722a = true;
        }
        ni niVar = this.d;
        if (niVar.f31064x2 == null) {
            ni.Q(niVar);
        }
        if (niVar.f31064x2.getAdapter() != null) {
            niVar.f31064x2.setReversed(true);
            niVar.f31064x2.getAdapter().U(charSequence, niVar.L0.getEditText().getSelectionStart(), null, false, false);
            niVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
