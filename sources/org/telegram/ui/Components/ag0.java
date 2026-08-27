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
import org.telegram.tgnet.TLRPC;

public abstract class ag0 extends FrameLayout {

    public final s5 f26739a;

    public final TextView f26740b;

    public final org.telegram.ui.Cells.v1 f26741c;
    public final cg0 d;

    public ag0(cg0 cg0Var, Context context) {
        super(context);
        this.d = cg0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143i5, false));
        s5 s5Var = new s5(getContext());
        this.f26739a = s5Var;
        s5Var.setTextSize(1, 14.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.f23091f7;
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        s5Var.setSingleLine(true);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        s5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.f26740b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, getContext(), 1);
        this.f26741c = v1Var;
        v1Var.setTextSize(AndroidUtilities.dp(14.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        v1Var.setGravity(LocaleController.isRTL ? 3 : 5);
        v1Var.setOnClickListener(new l70(this, 9));
        boolean z10 = LocaleController.isRTL;
        addView(s5Var, h7.z5.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v1Var, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        s5 s5Var = this.f26739a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(s5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, str, spannableStringBuilder);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, s5Var.getPaint().getFontMetricsInt());
            s5Var.setText(charSequenceReplaceEmoji);
        } else {
            s5Var.setText(Emoji.replaceEmoji(str, s5Var.getPaint().getFontMetricsInt(), false));
        }
        String str2 = String.format("%d", Integer.valueOf(i10));
        SpannableStringBuilder spannableStringBuilder2 = LocaleController.isRTL ? new SpannableStringBuilder(s3.c.d(i10, "% – ")) : new SpannableStringBuilder(i0.a.l(i10, " – ", "%"));
        spannableStringBuilder2.setSpan(new k41(AndroidUtilities.bold()), 3, str2.length() + 3, 33);
        this.f26740b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.v1 v1Var = this.f26741c;
        if (i12 == 0) {
            if (this.d.f27422r.quiz) {
                v1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
                return;
            } else {
                v1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
                return;
            }
        }
        if (i12 == 1) {
            v1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            v1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        s5 s5Var = this.f26739a;
        TextView textView = this.f26740b;
        if (z11) {
            int left = s5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = s5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
        TextView textView = this.f26740b;
        measureChildWithMargins(textView, i10, 0, iMakeMeasureSpec, 0);
        org.telegram.ui.Cells.v1 v1Var = this.f26741c;
        measureChildWithMargins(v1Var, i10, 0, iMakeMeasureSpec, 0);
        measureChildWithMargins(this.f26739a, i10, AndroidUtilities.dp(32.0f) + v1Var.getMeasuredWidth() + textView.getMeasuredWidth(), iMakeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
