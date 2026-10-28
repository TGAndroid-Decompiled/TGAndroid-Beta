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
public abstract class mh0 extends FrameLayout {
    public final b6 f30540a;
    public final TextView f30541b;
    public final org.telegram.ui.Cells.v1 f30542c;
    public final oh0 d;

    public mh0(oh0 oh0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.d = oh0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23448i5, this, null);
        b6 b6Var = new b6(getContext());
        this.f30540a = b6Var;
        b6Var.setTextSize(1, 14.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.y6.f7;
        org.telegram.ui.ActionBar.f7.V(b6Var, i16, null);
        b6Var.setSingleLine(true);
        b6Var.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10 | 16);
        TextView textView = new TextView(getContext());
        this.f30541b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i16, null);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, getContext(), 1);
        this.f30542c = v1Var;
        v1Var.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var, i16, null);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        v1Var.setGravity(i12);
        v1Var.setOnClickListener(new x80(this, 7));
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
        addView(b6Var, kb1.h(-2, -1.0f, i17, i14, 0.0f, z10 ? 16 : 0, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        addView(textView, kb1.h(-2, -1.0f, i15 | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v1Var, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        b6 b6Var = this.f30540a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(b6Var);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns(arrayList, str, spannableStringBuilder2);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, b6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, b6Var.getPaint().getFontMetricsInt());
            b6Var.setText(replaceEmoji);
        } else {
            b6Var.setText(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder(a1.g.m(i10, "% – "));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(ic.a.j(i10, " – ", "%"));
        }
        spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.f30541b.setText(spannableStringBuilder);
        org.telegram.ui.Cells.v1 v1Var = this.f30542c;
        if (i12 == 0) {
            if (this.d.f31289r.quiz) {
                v1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
            } else {
                v1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
            }
        } else if (i12 == 1) {
            v1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            v1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        b6 b6Var = this.f30540a;
        TextView textView = this.f30541b;
        if (z11) {
            int left = b6Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            return;
        }
        int right = b6Var.getRight();
        textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f30541b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.v1 v1Var = this.f30542c;
        measureChildWithMargins(v1Var, i10, 0, makeMeasureSpec, 0);
        int measuredWidth = v1Var.getMeasuredWidth() + textView.getMeasuredWidth();
        measureChildWithMargins(this.f30540a, i10, AndroidUtilities.dp(32.0f) + measuredWidth, makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
