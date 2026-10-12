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
import org.telegram.messenger.yh;
public final class o8 extends FrameLayout {
    public final TextView f21630a;
    public final TextView f21631b;
    public final TextView f21632c;
    public final ImageView d;
    public boolean e;
    public CharSequence f21633f;
    public int h;
    public int f21634n;
    public CharSequence f21635r;
    public int f21636s;
    public final org.telegram.ui.ActionBar.c6 v;

    public o8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12) {
        super(context);
        int w02;
        float f7;
        ViewGroup.LayoutParams a2;
        int w03;
        int m12;
        int m13;
        int w04;
        ViewGroup.LayoutParams a10;
        int w05;
        float f10;
        ViewGroup.LayoutParams a11;
        float f11;
        float f12;
        float f13;
        this.v = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f21630a = textView;
        if (z12) {
            w02 = a(0.6f);
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        org.telegram.messenger.q.n(15.0f, w02, 1, textView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            if (z10) {
                f12 = 5.0f;
            } else {
                f12 = 15.0f;
            }
            if (z10) {
                f13 = 15.0f;
            } else {
                f13 = 25.0f;
            }
            a2 = w7.a6.i(-2.0f, -2.0f, 8388659, f12, 5.0f, f13, 0.0f);
        } else {
            float f14 = z10 ? 5.0f : 15.0f;
            if (z10) {
                f7 = 15.0f;
            } else {
                f7 = 25.0f;
            }
            a2 = w7.a6.a(-2.0f, f14, 5.0f, f7, 0.0f, -2, 51);
        }
        addView(linearLayout, a2);
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.o(-2, -2, 1.0f, 16), context);
        this.f21632c = i10;
        if (z12) {
            w03 = a(0.6f);
        } else {
            w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        i10.setTextColor(w03);
        i10.setTextSize(1, 11.0f);
        i10.setTypeface(AndroidUtilities.bold());
        i10.setEllipsize(truncateAt);
        i10.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            m12 = a(0.05f);
        } else {
            m12 = org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        }
        int i11 = m12;
        if (z12) {
            m13 = a(0.08f);
        } else {
            m13 = org.telegram.ui.ActionBar.g6.m1(0.24f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        }
        int i12 = m13;
        i10.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, i11, i12, i12));
        i10.setGravity(17);
        i10.setSingleLine(true);
        w7.c6.a(i10);
        linearLayout.addView(i10, w7.a6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        i10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f21631b = textView2;
        if (z12) {
            w04 = a(0.6f);
        } else {
            w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        textView2.setTextColor(w04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            a10 = w7.a6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            a10 = w7.a6.a(-2.0f, 12.0f, 6.0f, 17.0f, 0.0f, -2, 53);
        }
        addView(textView2, a10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            w05 = a(0.6f);
        } else {
            w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ve, c6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var), 3, -1));
        if (z11) {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            a11 = w7.a6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f11, 0.0f);
        } else {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 10.0f;
            }
            a11 = w7.a6.a(24.0f, 0.0f, 0.0f, f10, 0.0f, 24, 53);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, a11);
    }

    public final int a(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, this.v), (int) (f7 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f21633f = charSequence;
        this.h = i11;
        this.f21634n = i12;
        TextView textView = this.f21630a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
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
        this.f21632c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f21635r = charSequence;
        this.f21636s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f21631b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f21633f != null && this.f21634n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21633f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f21634n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f21630a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (this.f21635r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21635r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ue, c6Var)), 0, this.f21636s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Te, c6Var)), this.f21636s, this.f21635r.length(), 33);
            } catch (Exception unused) {
            }
            this.f21631b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f21630a;
    }

    @Override
    public final void invalidate() {
        this.f21630a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f21631b) {
            i11 = yh.c(16.0f, this.f21630a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f21632c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f21630a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f21630a.setTextColor(i10);
    }
}
