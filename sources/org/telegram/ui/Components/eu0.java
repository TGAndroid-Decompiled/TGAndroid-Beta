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
public final class eu0 extends FrameLayout {
    public final org.telegram.ui.Cells.j6 f22757a;

    public eu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, uq0 uq0Var) {
        super(context);
        int i11;
        int i12;
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, f6Var);
        this.f22757a = j6Var;
        j6Var.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 2, -1));
        addView(j6Var, w7.a6.c(-2.0f, -1));
        View view = new View(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.j6.f17928d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.l1(0.4f, org.telegram.ui.ActionBar.j6.v0(i13, f6Var)), org.telegram.ui.ActionBar.j6.v0(i13, f6Var)}));
        addView(view, w7.a6.c(60.0f, -1));
        bi.d dVar = new bi.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new uq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, w7.a6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new g80(uq0Var, 17));
        m90 m90Var = new m90(context, f6Var);
        m90Var.setTextSize(1, 13.0f);
        m90Var.setTextAlignment(4);
        m90Var.setGravity(17);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18110n6, f6Var));
        m90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new uq0(uq0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        m90Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(m90Var, w7.a6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }
}
