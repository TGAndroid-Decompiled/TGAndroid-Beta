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
public final class xu0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f34821a;
    public final org.telegram.ui.Cells.m6 f34822b;
    public final View f34823c;

    public xu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, mp0 mp0Var) {
        super(context);
        int i11;
        int i12;
        this.f34821a = u6Var;
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
        this.f34822b = m6Var;
        int i13 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        m6Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(m6Var, g02, null, N, u6Var);
        addView(m6Var, gb1.g(-2.0f, -1));
        View view = new View(context);
        this.f34823c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i14 = org.telegram.ui.ActionBar.y6.f23354d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.w0(i14, u6Var)), org.telegram.ui.ActionBar.y6.w0(i14, u6Var)}));
        addView(view, gb1.g(60.0f, -1));
        fi.d dVar = new fi.d(context, u6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            i11 = R.string.MoreSimilarBotsButton;
        } else {
            i11 = R.string.MoreSimilarButton;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, gb1.h(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new w80(mp0Var, 15));
        z90 z90Var = new z90(context, u6Var);
        z90Var.setTextSize(1, 13.0f);
        z90Var.setTextAlignment(4);
        z90Var.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.f23538n6, u6Var);
        z90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (z10) {
            i12 = R.string.MoreSimilarBotsText;
        } else {
            i12 = R.string.MoreSimilarText;
        }
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(i12), new mp0(mp0Var, 8));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new q61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        z90Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(z90Var, gb1.h(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23354d6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f34821a;
        View view = this.f34823c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i10 = org.telegram.ui.ActionBar.y6.f23354d6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)), org.telegram.ui.ActionBar.y6.w0(i10, u6Var)});
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
