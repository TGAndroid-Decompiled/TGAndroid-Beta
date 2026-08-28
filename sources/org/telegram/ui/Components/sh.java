package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class sh implements TextWatcher {
    public boolean f32462a;
    public boolean f32463b;
    public final ki f32464c;

    public sh(ki kiVar) {
        this.f32464c = kiVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i9;
        boolean z12;
        ki kiVar = this.f32464c;
        j6 j6Var = kiVar.v;
        qh qhVar = kiVar.A0;
        j6 j6Var2 = kiVar.f30153s;
        if (this.f32463b != TextUtils.isEmpty(editable)) {
            ci ciVar = kiVar.f30160u0;
            if (ciVar != null) {
                ciVar.A(ciVar.getSelectedItemsCount());
            }
            this.f32463b = !this.f32463b;
        }
        boolean z13 = false;
        if (this.f32462a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, qhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f32462a = false;
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
        int i10 = kiVar.G;
        if (i10 > 0 && (i9 = i10 - kiVar.H) <= 100) {
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
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.xp(this, 10));
            j6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (kiVar.Q0 != z11) {
            kiVar.Q0 = z11;
            kiVar.E0.invalidate();
        }
        if (!kiVar.Y) {
            if (qhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(qhVar.getText().toString().trim())) {
                z13 = true;
            }
            kiVar.M1(z13);
        }
        kiVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (i11 - i10 >= 1) {
            this.f32462a = true;
        }
        ki kiVar = this.f32464c;
        if (kiVar.f30173x2 == null) {
            ki.P(kiVar);
        }
        if (kiVar.f30173x2.getAdapter() != null) {
            kiVar.f30173x2.setReversed(false);
            kiVar.f30173x2.getAdapter().U(charSequence, kiVar.A0.getEditText().getSelectionStart(), null, false, false);
            kiVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
