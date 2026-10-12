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
public final class uu0 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 f29770a;
    public final View f29771b;

    public uu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, lr0 lr0Var) {
        super(context);
        int i11;
        int i12;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, c6Var);
        this.f29770a = i6Var;
        i6Var.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 2, -1));
        addView(i6Var, w7.a6.d(-2.0f, -1));
        View view = new View(context);
        this.f29771b = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.g6.f19901d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.m1(0.4f, org.telegram.ui.ActionBar.g6.w0(i13, c6Var)), org.telegram.ui.ActionBar.g6.w0(i13, c6Var)}));
        addView(view, w7.a6.d(60.0f, -1));
        di.d dVar = new di.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new br(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, w7.a6.a(48.0f, 14.0f, 38.0f, 14.0f, 0.0f, -1, 48));
        dVar.setOnClickListener(new z80(lr0Var, 16));
        da0 da0Var = new da0(context, c6Var);
        da0Var.setTextSize(1, 13.0f);
        da0Var.setTextAlignment(4);
        da0Var.setGravity(17);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20084n6, c6Var));
        da0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new lr0(lr0Var, 5));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        da0Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(da0Var, w7.a6.a(-2.0f, 24.0f, 96.0f, 24.0f, 12.0f, -1, 49));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }
}
