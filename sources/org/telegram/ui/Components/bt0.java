package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class bt0 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 f27277a;

    public bt0(int i9, Context context, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, tp0 tp0Var) {
        super(context);
        int i10;
        int i11;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, b6Var);
        this.f27277a = h6Var;
        h6Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 2, -1));
        addView(h6Var, g7.e6.c(-2.0f, -1));
        View view = new View(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.f6.f23001d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.f6.l1(0.4f, org.telegram.ui.ActionBar.f6.v0(i12, b6Var)), org.telegram.ui.ActionBar.f6.v0(i12, b6Var)}));
        addView(view, g7.e6.c(60.0f, -1));
        kh.d dVar = new kh.d(context, b6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i10 = R.string.MoreSimilarBotsButton;
        } else {
            i10 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new eq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, g7.e6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new h70(tp0Var, 17));
        l80 l80Var = new l80(context, b6Var);
        l80Var.setTextSize(1, 13.0f);
        l80Var.setTextAlignment(4);
        l80Var.setGravity(17);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23179n6, b6Var));
        l80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i11 = R.string.MoreSimilarBotsText;
        } else {
            i11 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i11), new tp0(tp0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i9).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        l80Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(l80Var, g7.e6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }
}
