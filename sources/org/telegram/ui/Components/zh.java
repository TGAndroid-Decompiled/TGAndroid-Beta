package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class zh implements TextWatcher {
    public boolean f30920a;
    public boolean f30921b;
    public final wi f30922c;

    public zh(wi wiVar) {
        this.f30922c = wiVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        wi wiVar = this.f30922c;
        p6 p6Var = wiVar.v;
        yh yhVar = wiVar.E0;
        p6 p6Var2 = wiVar.f30001s;
        if (this.f30921b != TextUtils.isEmpty(editable)) {
            oi oiVar = wiVar.f30023y0;
            if (oiVar != null) {
                oiVar.A(oiVar.getSelectedItemsCount());
            }
            this.f30921b = !this.f30921b;
        }
        boolean z13 = false;
        if (this.f30920a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, yhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f30920a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        wiVar.L = codePointCount;
        le.c cVar = wiVar.e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a(z10, true);
        int i11 = wiVar.K;
        if (i11 > 0 && (i10 = i11 - wiVar.L) <= 100) {
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
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19278p7));
                z11 = false;
            } else {
                p6Var2.setTextColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19442y6));
                z11 = true;
            }
            p6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            p6Var.setAlpha(1.0f);
        } else {
            p6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new r8(this, 4));
            p6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (wiVar.U0 != z11) {
            wiVar.U0 = z11;
            wiVar.I0.invalidate();
        }
        if (!wiVar.f29952c0) {
            if (yhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(yhVar.getText().toString().trim())) {
                z13 = true;
            }
            wiVar.J1(z13);
        }
        wiVar.b1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f30920a = true;
        }
        wi wiVar = this.f30922c;
        if (wiVar.B2 == null) {
            wi.J(wiVar);
        }
        if (wiVar.B2.getAdapter() != null) {
            wiVar.B2.setReversed(false);
            wiVar.B2.getAdapter().U(charSequence, wiVar.E0.getEditText().getSelectionStart(), null, false, false);
            wiVar.R1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
