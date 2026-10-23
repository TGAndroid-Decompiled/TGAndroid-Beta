package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class uu0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f31218a;
    public final org.telegram.ui.Cells.i6 f31219b;
    public final View f31220c;

    public uu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, kr0 kr0Var) {
        super(context);
        int i11;
        int i12;
        this.f31218a = g6Var;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
        this.f31219b = i6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        i6Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(i6Var, g02, null, O, g6Var);
        addView(i6Var, w7.z5.c(-2.0f, -1));
        View view = new View(context);
        this.f31220c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.k6.f21183d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var)), org.telegram.ui.ActionBar.k6.w0(i14, g6Var)}));
        addView(view, w7.z5.c(60.0f, -1));
        ei.d dVar = new ei.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new xq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, w7.z5.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new v80(kr0Var, 16));
        y90 y90Var = new y90(context, g6Var);
        y90Var.setTextSize(1, 13.0f);
        y90Var.setTextAlignment(4);
        y90Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21366n6, g6Var);
        y90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new kr0(kr0Var, 5));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        y90Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(y90Var, w7.z5.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f31218a;
        View view = this.f31220c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)), org.telegram.ui.ActionBar.k6.w0(i10, g6Var)});
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
