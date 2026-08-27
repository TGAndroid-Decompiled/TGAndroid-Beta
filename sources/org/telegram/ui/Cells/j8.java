package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bq;

public final class j8 extends FrameLayout {

    public final TextView f24532a;

    public final TextView f24533b;

    public final TextView f24534c;
    public final ImageView d;

    public boolean f24535e;

    public CharSequence f24536f;
    public int h;

    public int f24537n;

    public CharSequence f24538r;

    public int f24539s;
    public final org.telegram.ui.ActionBar.c6 v;

    public j8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12) {
        ViewGroup.LayoutParams layoutParamsD;
        ViewGroup.LayoutParams layoutParamsD2;
        super(context);
        this.v = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f24532a = textView;
        org.telegram.messenger.y1.s(textView, z12 ? a(0.6f) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var), 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            layoutParamsD = h7.z5.i(-2.0f, -2.0f, 8388659, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        } else {
            layoutParamsD = h7.z5.d(-2, -2.0f, 51, z10 ? 5.0f : 15.0f, 5.0f, z10 ? 15.0f : 25.0f, 0.0f);
        }
        addView(linearLayout, layoutParamsD);
        TextView textViewI = pa.i(linearLayout, textView, h7.z5.o(-2, -2, 1.0f, 16), context);
        this.f24534c = textViewI;
        textViewI.setTextColor(z12 ? a(0.6f) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        textViewI.setTextSize(1, 11.0f);
        textViewI.setTypeface(AndroidUtilities.bold());
        textViewI.setEllipsize(truncateAt);
        textViewI.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int iDp = AndroidUtilities.dp(9.0f);
        int iA = z12 ? a(0.05f) : org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        int iA2 = z12 ? a(0.08f) : org.telegram.ui.ActionBar.g6.l1(0.24f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        textViewI.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iA, iA2, iA2));
        textViewI.setGravity(17);
        textViewI.setSingleLine(true);
        h7.b6.a(textViewI);
        linearLayout.addView(textViewI, h7.z5.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        textViewI.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f24533b = textView2;
        textView2.setTextColor(z12 ? a(0.6f) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        addView(textView2, z11 ? h7.z5.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f) : h7.z5.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(z12 ? a(0.6f) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ve, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 3, -1));
        if (z11) {
            layoutParamsD2 = h7.z5.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        } else {
            layoutParamsD2 = h7.z5.d(24, 24.0f, 53, 0.0f, 0.0f, z10 ? 0.0f : 10.0f, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, layoutParamsD2);
    }

    public final int a(float f10) {
        return i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.v), (int) (f10 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f24536f = charSequence;
        this.h = i11;
        this.f24537n = i12;
        TextView textView = this.f24532a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f24535e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f24535e = false;
            if (i12 != 0) {
                e();
            } else {
                textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
            }
            if (i10 != 0) {
                imageView.setImageResource(i10);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.f24534c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        this.f24538r = charSequence;
        this.f24539s = i10;
        this.f24533b.setVisibility(charSequence != null ? 0 : 8);
        f();
    }

    public final void e() {
        if (this.f24536f == null || this.f24537n <= 0) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24536f);
        try {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, this.v));
            int i10 = this.h;
            spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f24537n + i10, 33);
        } catch (Exception unused) {
        }
        TextView textView = this.f24532a;
        textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
    }

    public final void f() {
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (this.f24538r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24538r);
            try {
                spannableStringBuilder.setSpan(new bq(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, c6Var)), 0, this.f24539s, 33);
                spannableStringBuilder.setSpan(new bq(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var)), this.f24539s, this.f24538r.length(), 33);
            } catch (Exception unused) {
            }
            this.f24533b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f24532a;
    }

    @Override
    public final void invalidate() {
        this.f24532a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f24533b) {
            i11 = org.telegram.messenger.y1.C(16.0f, this.f24532a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f24535e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f24534c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f24532a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f24532a.setTextColor(i10);
    }
}
