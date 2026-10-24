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
public final class tu0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f30888a;
    public final org.telegram.ui.Cells.i6 f30889b;
    public final View f30890c;

    public tu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, jr0 jr0Var) {
        super(context);
        int i11;
        int i12;
        this.f30888a = g6Var;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
        this.f30889b = i6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 2, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        i6Var.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(i6Var, g02, null, O, g6Var);
        addView(i6Var, w7.z5.c(-2.0f, -1));
        View view = new View(context);
        this.f30890c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.k6.f21184d6;
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
        spannableString.setSpan(new vq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, w7.z5.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new t80(jr0Var, 16));
        w90 w90Var = new w90(context, g6Var);
        w90Var.setTextSize(1, 13.0f);
        w90Var.setTextAlignment(4);
        w90Var.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21367n6, g6Var);
        w90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new jr0(jr0Var, 5));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        w90Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(w90Var, w7.z5.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.f30888a;
        View view = this.f30890c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.4f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var)), org.telegram.ui.ActionBar.k6.w0(i10, g6Var)});
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
