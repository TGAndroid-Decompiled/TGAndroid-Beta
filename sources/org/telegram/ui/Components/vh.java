package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
public final class vh implements TextWatcher {
    public boolean f33559a;
    public boolean f33560b;
    public final ni f33561c;

    public vh(ni niVar) {
        this.f33561c = niVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ni niVar = this.f33561c;
        o6 o6Var = niVar.v;
        th thVar = niVar.A0;
        o6 o6Var2 = niVar.f31044s;
        if (this.f33560b != TextUtils.isEmpty(editable)) {
            fi fiVar = niVar.f31051u0;
            if (fiVar != null) {
                fiVar.B(fiVar.getSelectedItemsCount());
            }
            this.f33560b = !this.f33560b;
        }
        boolean z13 = false;
        if (this.f33559a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, thVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f33559a = false;
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
        int i11 = niVar.G;
        if (i11 > 0 && (i10 = i11 - niVar.H) <= 100) {
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
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.bm(this, 12));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (niVar.Q0 != z11) {
            niVar.Q0 = z11;
            niVar.E0.invalidate();
        }
        if (!niVar.Y) {
            if (thVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(thVar.getText().toString().trim())) {
                z13 = true;
            }
            niVar.M1(z13);
        }
        niVar.d1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f33559a = true;
        }
        ni niVar = this.f33561c;
        if (niVar.f31064x2 == null) {
            ni.Q(niVar);
        }
        if (niVar.f31064x2.getAdapter() != null) {
            niVar.f31064x2.setReversed(false);
            niVar.f31064x2.getAdapter().U(charSequence, niVar.A0.getEditText().getSelectionStart(), null, false, false);
            niVar.U1();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
