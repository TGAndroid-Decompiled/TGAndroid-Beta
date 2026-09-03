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
public abstract class vg0 extends FrameLayout {
    public final t5 f31884a;
    public final TextView f31885b;
    public final org.telegram.ui.Cells.w1 f31886c;
    public final xg0 d;

    public vg0(xg0 xg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.d = xg0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21751i5, false));
        t5 t5Var = new t5(getContext());
        this.f31884a = t5Var;
        t5Var.setTextSize(1, 14.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.k6.f21699f7;
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        t5Var.setSingleLine(true);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        t5Var.setGravity(i10 | 16);
        TextView textView = new TextView(getContext());
        this.f31885b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, getContext(), 1);
        this.f31886c = w1Var;
        w1Var.setTextSize(AndroidUtilities.dp(14.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        w1Var.setGravity(i12);
        w1Var.setOnClickListener(new b80(this, 9));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z4) {
            i14 = 0;
        } else {
            i14 = 16;
        }
        addView(t5Var, k7.c6.d(-2, -1.0f, i17, i14, 0.0f, z4 ? 16 : 0, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        addView(textView, k7.c6.d(-2, -1.0f, i15 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(w1Var, k7.c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        t5 t5Var = this.f31884a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(t5Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns(arrayList, str, spannableStringBuilder2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, t5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, t5Var.getPaint().getFontMetricsInt());
            t5Var.setText(replaceEmoji);
        } else {
            t5Var.setText(Emoji.replaceEmoji(str, t5Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.l(i10, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(l.d.k(i10, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.f31885b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.w1 w1Var = this.f31886c;
        if (i12 == 0) {
            if (this.d.f33071r.quiz) {
                w1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z4, true);
            } else {
                w1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z4, true);
            }
        } else if (i12 == 1) {
            w1Var.c(LocaleController.getString(R.string.PollExpand), z4, true);
        } else {
            w1Var.c(LocaleController.getString(R.string.PollCollapse), z4, true);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        boolean z10 = LocaleController.isRTL;
        t5 t5Var = this.f31884a;
        TextView textView = this.f31885b;
        if (z10) {
            int left = t5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = t5Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f31885b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.w1 w1Var = this.f31886c;
        measureChildWithMargins(w1Var, i10, 0, makeMeasureSpec, 0);
        int measuredWidth = w1Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f31884a, i10, AndroidUtilities.dp(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
