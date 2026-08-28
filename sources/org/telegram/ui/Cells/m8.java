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
public final class m8 extends FrameLayout {
    public final TextView f24711a;
    public final TextView f24712b;
    public final TextView f24713c;
    public final ImageView d;
    public boolean f24714e;
    public CharSequence f24715f;
    public int h;
    public int f24716n;
    public CharSequence f24717r;
    public int f24718s;
    public final org.telegram.ui.ActionBar.b6 v;

    public m8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, boolean z12) {
        super(context);
        int v02;
        float f10;
        float f11;
        ViewGroup.LayoutParams d;
        int v03;
        int l1;
        int l12;
        int v04;
        ViewGroup.LayoutParams d9;
        int v05;
        float f12;
        ViewGroup.LayoutParams d10;
        float f13;
        float f14;
        float f15;
        this.v = b6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f24711a = textView;
        if (z12) {
            v02 = a(0.6f);
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var);
        }
        org.telegram.messenger.l0.q(textView, v02, 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            if (z10) {
                f14 = 5.0f;
            } else {
                f14 = 15.0f;
            }
            if (z10) {
                f15 = 15.0f;
            } else {
                f15 = 25.0f;
            }
            d = g7.e6.i(-2.0f, -2.0f, 8388659, f14, 5.0f, f15, 0.0f);
        } else {
            if (z10) {
                f10 = 5.0f;
            } else {
                f10 = 15.0f;
            }
            if (z10) {
                f11 = 15.0f;
            } else {
                f11 = 25.0f;
            }
            d = g7.e6.d(-2, -2.0f, 51, f10, 5.0f, f11, 0.0f);
        }
        addView(linearLayout, d);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.o(-2, -2, 1.0f, 16), context);
        this.f24713c = h;
        if (z12) {
            v03 = a(0.6f);
        } else {
            v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var);
        }
        h.setTextColor(v03);
        h.setTextSize(1, 11.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setEllipsize(truncateAt);
        h.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            l1 = a(0.05f);
        } else {
            l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        }
        int i9 = l1;
        if (z12) {
            l12 = a(0.08f);
        } else {
            l12 = org.telegram.ui.ActionBar.f6.l1(0.24f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var));
        }
        int i10 = l12;
        h.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, i9, i10, i10));
        h.setGravity(17);
        h.setSingleLine(true);
        g7.g6.a(h);
        linearLayout.addView(h, g7.e6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        h.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f24712b = textView2;
        if (z12) {
            v04 = a(0.6f);
        } else {
            v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var);
        }
        textView2.setTextColor(v04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d9 = g7.e6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d9 = g7.e6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d9);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            v05 = a(0.6f);
        } else {
            v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ve, b6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 3, -1));
        if (z11) {
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 10.0f;
            }
            d10 = g7.e6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f13, 0.0f);
        } else {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d10 = g7.e6.d(24, 24.0f, 53, 0.0f, 0.0f, f12, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d10);
    }

    public final int a(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, this.v), (int) (f10 * 255.0f));
    }

    public final void b(int i9, CharSequence charSequence) {
        c(charSequence, i9, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i9, CharSequence charSequence2, int i10, int i11) {
        this.f24715f = charSequence;
        this.h = i10;
        this.f24716n = i11;
        TextView textView = this.f24711a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f24714e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f24714e = false;
            if (i11 != 0) {
                e();
            } else {
                textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
            }
            if (i9 != 0) {
                imageView.setImageResource(i9);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.f24713c.setVisibility(8);
    }

    public final void d(int i9, CharSequence charSequence) {
        int i10;
        this.f24717r = charSequence;
        this.f24718s = i9;
        if (charSequence != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24712b.setVisibility(i10);
        f();
    }

    public final void e() {
        if (this.f24715f != null && this.f24716n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24715f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, this.v));
                int i9 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i9, this.f24716n + i9, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f24711a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.b6 b6Var = this.v;
        if (this.f24717r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24717r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ue, b6Var)), 0, this.f24718s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Te, b6Var)), this.f24718s, this.f24717r.length(), 33);
            } catch (Exception unused) {
            }
            this.f24712b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f24711a;
    }

    @Override
    public final void invalidate() {
        this.f24711a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        if (view == this.f24712b) {
            i10 = org.telegram.messenger.l0.C(16.0f, this.f24711a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.f24714e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f24713c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f24711a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i9) {
        this.f24711a.setTextColor(i9);
    }
}
