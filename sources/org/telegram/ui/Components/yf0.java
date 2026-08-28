package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public abstract class yf0 extends FrameLayout {
    public final s5 f34962a;
    public final TextView f34963b;
    public final org.telegram.ui.Cells.w1 f34964c;
    public final ag0 d;

    public yf0(ag0 ag0Var, Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        this.d = ag0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23091i5, false));
        s5 s5Var = new s5(getContext());
        this.f34962a = s5Var;
        s5Var.setTextSize(1, 14.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.f6.f23038f7;
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        s5Var.setSingleLine(true);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        s5Var.setGravity(i9 | 16);
        TextView textView = new TextView(getContext());
        this.f34963b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, getContext(), 1);
        this.f34964c = w1Var;
        w1Var.setTextSize(AndroidUtilities.dp(14.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        w1Var.setGravity(i11);
        w1Var.setOnClickListener(new h70(this, 9));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i16 = i12 | 48;
        if (z10) {
            i13 = 0;
        } else {
            i13 = 16;
        }
        addView(s5Var, g7.e6.d(-2, -1.0f, i16, i13, 0.0f, z10 ? 16 : 0, 0.0f));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(textView, g7.e6.d(-2, -1.0f, i14 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(w1Var, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i9, int i10, int i11, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        s5 s5Var = this.f34962a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(s5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns(arrayList, str, spannableStringBuilder2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, s5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt());
            s5Var.setText(replaceEmoji);
        } else {
            s5Var.setText(Emoji.replaceEmoji(str, s5Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i9));
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder(ta.b.c(i9, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(j3.r0.m(i9, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.f34963b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.w1 w1Var = this.f34964c;
        if (i11 == 0) {
            if (this.d.f26788r.quiz) {
                w1Var.c(LocaleController.formatPluralString("Answer", i10, new Object[0]), z10, true);
            } else {
                w1Var.c(LocaleController.formatPluralString("Vote", i10, new Object[0]), z10, true);
            }
        } else if (i11 == 1) {
            w1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            w1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        boolean z11 = LocaleController.isRTL;
        s5 s5Var = this.f34962a;
        TextView textView = this.f34963b;
        if (z11) {
            int left = s5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = s5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f34963b;
        measureChildWithMargins(textView, i9, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.w1 w1Var = this.f34964c;
        measureChildWithMargins(w1Var, i9, 0, makeMeasureSpec, 0);
        int measuredWidth = w1Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f34962a, i9, AndroidUtilities.dp(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(32.0f));
    }
}
