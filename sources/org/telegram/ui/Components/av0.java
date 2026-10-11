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
public final class av0 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 f24600a;
    public final View f24601b;

    public av0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.d6 d6Var, qr0 qr0Var) {
        super(context);
        int i11;
        int i12;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
        this.f24600a = i6Var;
        i6Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var), 2, -1));
        addView(i6Var, w7.x5.d(-2.0f, -1));
        View view = new View(context);
        this.f24601b = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i13 = org.telegram.ui.ActionBar.h6.f20786d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.m1(0.4f, org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), org.telegram.ui.ActionBar.h6.w0(i13, d6Var)}));
        addView(view, w7.x5.d(60.0f, -1));
        ci.d dVar = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, w7.x5.a(48.0f, 14.0f, 38.0f, 14.0f, 0.0f, -1, 48));
        dVar.setOnClickListener(new c90(qr0Var, 16));
        fa0 fa0Var = new fa0(context, d6Var);
        fa0Var.setTextSize(1, 13.0f);
        fa0Var.setTextAlignment(4);
        fa0Var.setGravity(17);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20971n6, d6Var));
        fa0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new qr0(qr0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new o61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        fa0Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(fa0Var, w7.x5.a(-2.0f, 24.0f, 96.0f, 24.0f, 12.0f, -1, 49));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }
}
