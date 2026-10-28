package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class ai implements TextWatcher {
    public boolean f26558a;
    public boolean f26559b;
    public final org.telegram.ui.ActionBar.r2 f26560c;
    public final ti d;

    public ai(ti tiVar, org.telegram.ui.ActionBar.r2 r2Var) {
        this.d = tiVar;
        this.f26560c = r2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        ti tiVar = this.d;
        s6 s6Var = tiVar.f33029s;
        yh yhVar = tiVar.S0;
        int i11 = tiVar.M1;
        s6 s6Var2 = tiVar.v;
        if (this.f26559b != TextUtils.isEmpty(editable)) {
            li liVar = tiVar.B0;
            if (liVar != null) {
                liVar.D(liVar.getSelectedItemsCount());
            }
            this.f26559b = !this.f26559b;
        }
        boolean z13 = false;
        if (this.f26558a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, yhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f26558a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        tiVar.L = codePointCount;
        oe.b bVar = tiVar.e;
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
                int i13 = org.telegram.ui.ActionBar.y6.f23582p7;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, u6Var2);
                z11 = false;
            } else {
                int i14 = org.telegram.ui.ActionBar.y6.f23749y6;
                u6Var = ((org.telegram.ui.ActionBar.k3) tiVar).resourcesProvider;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i14, u6Var);
                z11 = true;
            }
            s6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            s6Var.setAlpha(1.0f);
        } else {
            s6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.sp(this, 11));
            s6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (tiVar.X0 != z11) {
            tiVar.X0 = z11;
            tiVar.L0.invalidate();
        }
        if (!tiVar.f33009l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && tiVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && tiVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            tiVar.f33009l2 = true;
            tiVar.W1(this.f26560c);
        }
        if (tiVar.f32980c0) {
            if (yhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(yhVar.getText().toString().trim())) {
                z13 = true;
            }
            tiVar.U1(z13);
        }
        tiVar.j1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f26558a = true;
        }
        ti tiVar = this.d;
        if (tiVar.H2 == null) {
            ti.M(tiVar);
        }
        if (tiVar.H2.getAdapter() != null) {
            tiVar.H2.setReversed(true);
            tiVar.H2.getAdapter().U(charSequence, tiVar.S0.getEditText().getSelectionStart(), null, false, false);
            tiVar.c2();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
