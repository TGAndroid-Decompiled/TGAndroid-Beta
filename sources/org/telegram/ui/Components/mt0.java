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
public final class mt0 extends FrameLayout {
    public final org.telegram.ui.Cells.f6 f30763a;

    public mt0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, fq0 fq0Var) {
        super(context);
        int i11;
        int i12;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
        this.f30763a = f6Var;
        f6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 2, -1));
        addView(f6Var, i7.f6.c(-2.0f, -1));
        View view = new View(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.g6.f23062d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)}));
        addView(view, i7.f6.c(60.0f, -1));
        nh.d dVar = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new iq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, i7.f6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new u70(fq0Var, 17));
        y80 y80Var = new y80(context, c6Var);
        y80Var.setTextSize(1, 13.0f);
        y80Var.setTextAlignment(4);
        y80Var.setGravity(17);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23241n6, c6Var));
        y80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new fq0(fq0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        y80Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(y80Var, i7.f6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }
}
