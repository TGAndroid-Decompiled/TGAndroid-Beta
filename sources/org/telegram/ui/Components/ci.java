package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class ci implements TextWatcher {
    public boolean f25036a;
    public boolean f25037b;
    public final vi f25038c;

    public ci(vi viVar) {
        this.f25038c = viVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        vi viVar = this.f25038c;
        q6 q6Var = viVar.v;
        ai aiVar = viVar.E0;
        q6 q6Var2 = viVar.f31345s;
        if (this.f25037b != TextUtils.isEmpty(editable)) {
            ni niVar = viVar.f31367y0;
            if (niVar != null) {
                niVar.B(niVar.getSelectedItemsCount());
            }
            this.f25037b = !this.f25037b;
        }
        boolean z13 = false;
        if (this.f25036a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f25036a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        viVar.L = codePointCount;
        le.b bVar = viVar.f31301e;
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
            if (q6Var2.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            q6Var2.c(formatNumber, z12, true);
            if (q6Var2.getVisibility() != 0) {
                q6Var2.setVisibility(0);
                q6Var2.setAlpha(0.0f);
                q6Var2.setScaleX(0.5f);
                q6Var2.setScaleY(0.5f);
            }
            q6Var2.animate().setListener(null).cancel();
            q6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                q6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20907p7));
                z11 = false;
            } else {
                q6Var2.setTextColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.f21069y6));
                z11 = true;
            }
            q6Var.c(LocaleController.formatNumber(j3, ','), false, true);
            q6Var.setAlpha(1.0f);
        } else {
            q6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new j6(this, 7));
            q6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (viVar.U0 != z11) {
            viVar.U0 = z11;
            viVar.I0.invalidate();
        }
        if (!viVar.f31295c0) {
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
            this.f25036a = true;
        }
        vi viVar = this.f25038c;
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
