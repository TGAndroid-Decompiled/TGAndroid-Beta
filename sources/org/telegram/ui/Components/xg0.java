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
public abstract class xg0 extends FrameLayout {
    public final x5 f29038a;
    public final TextView f29039b;
    public final org.telegram.ui.Cells.w1 f29040c;
    public final zg0 d;

    public xg0(zg0 zg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.d = zg0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18016i5, false));
        x5 x5Var = new x5(getContext());
        this.f29038a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.j6.f7;
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        x5Var.setSingleLine(true);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        x5Var.setGravity(i10 | 16);
        TextView textView = new TextView(getContext());
        this.f29039b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, getContext(), 1);
        this.f29040c = w1Var;
        w1Var.setTextSize(AndroidUtilities.dp(14.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        w1Var.setGravity(i12);
        w1Var.setOnClickListener(new g80(this, 9));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z10) {
            i14 = 0;
        } else {
            i14 = 16;
        }
        addView(x5Var, w7.a6.d(-2, -1.0f, i17, i14, 0.0f, z10 ? 16 : 0, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        addView(textView, w7.a6.d(-2, -1.0f, i15 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(w1Var, w7.a6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        x5 x5Var = this.f29038a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(x5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns(arrayList, str, spannableStringBuilder2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, x5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, x5Var.getPaint().getFontMetricsInt());
            x5Var.setText(replaceEmoji);
        } else {
            x5Var.setText(Emoji.replaceEmoji(str, x5Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder(a4.a.m(i10, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(hc.b.k(i10, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.f29039b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.w1 w1Var = this.f29040c;
        if (i12 == 0) {
            if (this.d.f29682r.quiz) {
                w1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
            } else {
                w1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
            }
        } else if (i12 == 1) {
            w1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            w1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        x5 x5Var = this.f29038a;
        TextView textView = this.f29039b;
        if (z11) {
            int left = x5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = x5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f29039b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.w1 w1Var = this.f29040c;
        measureChildWithMargins(w1Var, i10, 0, makeMeasureSpec, 0);
        int measuredWidth = w1Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f29038a, i10, AndroidUtilities.dp(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
