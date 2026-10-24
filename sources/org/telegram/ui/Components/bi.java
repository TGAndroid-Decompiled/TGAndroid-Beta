package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class bi implements TextWatcher {
    public boolean f25004a;
    public boolean f25005b;
    public final org.telegram.ui.ActionBar.o2 f25006c;
    public final ri d;

    public bi(ri riVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = riVar;
        this.f25006c = o2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ri riVar = this.d;
        o6 o6Var = riVar.f30185s;
        ai aiVar = riVar.S0;
        int i11 = riVar.M1;
        o6 o6Var2 = riVar.v;
        if (this.f25005b != TextUtils.isEmpty(editable)) {
            ji jiVar = riVar.B0;
            if (jiVar != null) {
                jiVar.D(jiVar.getSelectedItemsCount());
            }
            this.f25005b = !this.f25005b;
        }
        boolean z13 = false;
        if (this.f25004a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            Emoji.replaceEmoji(editable, aiVar.getEditText().getPaint().getFontMetricsInt(), false);
            this.f25004a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        riVar.L = codePointCount;
        ne.b bVar = riVar.e;
        if (codePointCount > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        int i12 = riVar.K;
        if (i12 > 0 && (i10 = i12 - riVar.L) <= 100) {
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
                int i13 = org.telegram.ui.ActionBar.k6.f21405p7;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
                org.telegram.ui.ActionBar.r6.a0(o6Var2, i13, g6Var2);
                z11 = false;
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.f21572y6;
                g6Var = ((org.telegram.ui.ActionBar.h3) riVar).resourcesProvider;
                org.telegram.ui.ActionBar.r6.a0(o6Var2, i14, g6Var);
                z11 = true;
            }
            o6Var.c(LocaleController.formatNumber(j10, ','), false, true);
            o6Var.setAlpha(1.0f);
        } else {
            o6Var2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new org.telegram.ui.pq(this, 10));
            o6Var.setAlpha(0.0f);
            z11 = true;
        }
        if (riVar.X0 != z11) {
            riVar.X0 = z11;
            riVar.L0.invalidate();
        }
        if (!riVar.f30165l2 && !MessagesController.getInstance(i11).premiumFeaturesBlocked() && !UserConfig.getInstance(i11).isPremium() && riVar.L > MessagesController.getInstance(i11).captionLengthLimitDefault && riVar.L < MessagesController.getInstance(i11).captionLengthLimitPremium) {
            riVar.f30165l2 = true;
            riVar.W1(this.f25006c);
        }
        if (riVar.f30136c0) {
            if (aiVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(aiVar.getText().toString().trim())) {
                z13 = true;
            }
            riVar.U1(z13);
        }
        riVar.i1(true);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i12 - i11 >= 1) {
            this.f25004a = true;
        }
        ri riVar = this.d;
        if (riVar.H2 == null) {
            ri.R(riVar);
        }
        if (riVar.H2.getAdapter() != null) {
            riVar.H2.setReversed(true);
            riVar.H2.getAdapter().U(charSequence, riVar.S0.getEditText().getSelectionStart(), null, false, false);
            riVar.c2();
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
