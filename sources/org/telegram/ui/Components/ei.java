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
    public boolean f23881a;
    public boolean f23882b;
    public final org.telegram.ui.ActionBar.n2 f23883c;
    public final vi d;

    public ei(vi viVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = viVar;
        this.f23883c = n2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        vi viVar = this.d;
        p6 p6Var = viVar.f29060s;
        di diVar = viVar.P0;
        int i11 = viVar.J1;
        p6 p6Var2 = viVar.v;
        if (this.f23882b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.f29082y0;
            if (niVar != null) {
                niVar.A(niVar.getSelectedItemsCount());
            }
            this.f23882b = !this.f23882b;
        }
        boolean z13 = false;
        if (this.f23881a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, diVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f23881a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        viVar.L = codePointCount;
        le.b bVar = viVar.e;
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
                p6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19283p7));
                z11 = false;
            } else {
                p6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19445y6));
                z11 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        } else {
            p6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r8(this, 5));
            p6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (viVar.U0 != z11) {
            viVar.U0 = z11;
            viVar.I0.invalidate();
        }
        if (!viVar.f29032i2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && viVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && viVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            viVar.f29032i2 = true;
            viVar.O1(this.f23883c);
        }
        if (viVar.f29011c0) {
            if (diVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(diVar.getText().toString().trim())) {
                z13 = true;
            }
            viVar.M1(z13);
        }
        viVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f23881a = true;
        }
        vi viVar = this.d;
        if (viVar.B2 == null) {
            vi.Q(viVar);
        }
        if (viVar.B2.getAdapter() != null) {
            viVar.B2.setReversed(true);
            viVar.B2.getAdapter().U(charSequence, viVar.P0.getEditText().getSelectionStart(), null, false, false);
            viVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
