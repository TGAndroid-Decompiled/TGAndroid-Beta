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
public abstract class rh0 extends FrameLayout {
    public final a6 f30526a;
    public final TextView f30527b;
    public final org.telegram.ui.Cells.x1 f30528c;
    public final th0 d;

    public rh0(th0 th0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.d = th0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20912i5, false));
        a6 a6Var = new a6(getContext());
        this.f30526a = a6Var;
        a6Var.setTextSize(1, 14.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.h6.f7;
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        a6Var.setSingleLine(true);
        a6Var.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        a6Var.setGravity(i10 | 16);
        TextView textView = new TextView(getContext());
        this.f30527b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, getContext(), 1);
        this.f30528c = x1Var;
        x1Var.setTextSize(AndroidUtilities.dp(14.0f));
        x1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        x1Var.setGravity(i12);
        x1Var.setOnClickListener(new b90(this, 8));
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
        addView(a6Var, w7.x5.a(-1.0f, i14, 0.0f, z10 ? 16 : 0, 0.0f, -2, i17));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        addView(textView, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, i15 | 48));
        addView(x1Var, w7.x5.a(-1.0f, 16.0f, 0.0f, 16.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        a6 a6Var = this.f30526a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(a6Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns(arrayList, str, spannableStringBuilder2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, a6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, a6Var.getPaint().getFontMetricsInt());
            a6Var.setText(replaceEmoji);
        } else {
            a6Var.setText(Emoji.replaceEmoji(str, a6Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder(a1.g.n(i10, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(hg.c.i(i10, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.f30527b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.x1 x1Var = this.f30528c;
        if (i12 == 0) {
            if (this.d.f31260r.quiz) {
                x1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
            } else {
                x1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
            }
        } else if (i12 == 1) {
            x1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            x1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        a6 a6Var = this.f30526a;
        TextView textView = this.f30527b;
        if (z11) {
            int left = a6Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = a6Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f30527b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.x1 x1Var = this.f30528c;
        measureChildWithMargins(x1Var, i10, 0, makeMeasureSpec, 0);
        int measuredWidth = x1Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f30526a, i10, AndroidUtilities.dp(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
