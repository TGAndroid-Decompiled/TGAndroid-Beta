package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;

public final class oh implements TextWatcher {

    public boolean f31302a;

    public boolean f31303b;

    public final gi f31304c;

    public oh(gi giVar) {
        this.f31304c = giVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        int i10;
        gi giVar = this.f31304c;
        j6 j6Var = giVar.v;
        mh mhVar = giVar.A0;
        j6 j6Var2 = giVar.f28689s;
        if (this.f31303b != TextUtils.isEmpty(editable)) {
            yh yhVar = giVar.f28696u0;
            if (yhVar != null) {
                yhVar.C(yhVar.getSelectedItemsCount());
            }
            this.f31303b = !this.f31303b;
        }
        boolean z11 = false;
        if (this.f31302a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, mhVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f31302a = false;
        }
        int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
        giVar.H = iCodePointCount;
        giVar.f28645e.a(iCodePointCount > 0, true);
        int i11 = giVar.G;
        if (i11 <= 0 || (i10 = i11 - giVar.H) > 100) {
            j6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.am(this, 12));
            j6Var.setAlpha(0.0f);
            z10 = true;
        } else {
            if (i10 < -9999) {
                i10 = -9999;
            }
            long j10 = i10;
            j6Var2.c(LocaleController.formatNumber(j10, ','), j6Var2.getVisibility() == 0, true);
            if (j6Var2.getVisibility() != 0) {
                j6Var2.setVisibility(0);
                j6Var2.setAlpha(0.0f);
                j6Var2.setScaleX(0.5f);
                j6Var2.setScaleY(0.5f);
            }
            j6Var2.animate().setListener(null).cancel();
            j6Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i10 < 0) {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
                z10 = false;
            } else {
                j6Var2.setTextColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
                z10 = true;
            }
            j6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            j6Var.setAlpha(1.0f);
        }
        if (giVar.Q0 != z10) {
            giVar.Q0 = z10;
            giVar.E0.invalidate();
        }
        if (!giVar.Y) {
            if (mhVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(mhVar.getText().toString().trim())) {
                z11 = true;
            }
            giVar.M1(z11);
        }
        giVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f31302a = true;
        }
        gi giVar = this.f31304c;
        if (giVar.f28709x2 == null) {
            gi.Q(giVar);
        }
        if (giVar.f28709x2.getAdapter() != null) {
            giVar.f28709x2.setReversed(false);
            giVar.f28709x2.getAdapter().U(charSequence, giVar.A0.getEditText().getSelectionStart(), null, false, false);
            giVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
