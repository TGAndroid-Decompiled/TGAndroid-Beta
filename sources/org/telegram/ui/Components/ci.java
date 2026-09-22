package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class ci implements TextWatcher {
    public boolean f23366a;
    public boolean f23367b;
    public final vi f23368c;

    public ci(vi viVar) {
        this.f23368c = viVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        vi viVar = this.f23368c;
        o6 o6Var = viVar.v;
        ai aiVar = viVar.E0;
        o6 o6Var2 = viVar.f29135s;
        if (this.f23367b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.f29157y0;
            if (niVar != null) {
                niVar.A(niVar.getSelectedItemsCount());
            }
            this.f23367b = !this.f23367b;
        }
        boolean z13 = false;
        if (this.f23366a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f23366a = false;
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
        int i11 = viVar.K;
        if (i11 > 0 && (i10 = i11 - viVar.L) <= 100) {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j3 = i10;
            String formatNumber = LocaleController.formatNumber(j3, ',');
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
                o6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19330p7));
                z11 = false;
            } else {
                o6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19492y6));
                z11 = true;
            }
            o6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            o6Var.setAlpha(1.0f);
        } else {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new q8(this, 4));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (viVar.U0 != z11) {
            viVar.U0 = z11;
            viVar.I0.invalidate();
        }
        if (!viVar.f29086c0) {
            if (aiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(aiVar.getText().toString().trim())) {
                z13 = true;
            }
            viVar.M1(z13);
        }
        viVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f23366a = true;
        }
        vi viVar = this.f23368c;
        if (viVar.B2 == null) {
            vi.Q(viVar);
        }
        if (viVar.B2.getAdapter() != null) {
            viVar.B2.setReversed(false);
            viVar.B2.getAdapter().U(charSequence, viVar.E0.getEditText().getSelectionStart(), null, false, false);
            viVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
