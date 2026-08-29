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
import org.telegram.ui.th;
public final class k8 extends FrameLayout {
    public final TextView f24599a;
    public final TextView f24600b;
    public final TextView f24601c;
    public final ImageView d;
    public boolean f24602e;
    public CharSequence f24603f;
    public int h;
    public int f24604n;
    public CharSequence f24605r;
    public int f24606s;
    public final org.telegram.ui.ActionBar.c6 v;

    public k8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, boolean z12) {
        super(context);
        int v02;
        float f9;
        float f10;
        ViewGroup.LayoutParams d;
        int v03;
        int l1;
        int l12;
        int v04;
        ViewGroup.LayoutParams d10;
        int v05;
        float f11;
        ViewGroup.LayoutParams d11;
        float f12;
        float f13;
        float f14;
        this.v = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f24599a = textView;
        if (z12) {
            v02 = a(0.6f);
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        org.telegram.messenger.x3.t(textView, v02, 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            if (z10) {
                f13 = 5.0f;
            } else {
                f13 = 15.0f;
            }
            if (z10) {
                f14 = 15.0f;
            } else {
                f14 = 25.0f;
            }
            d = i7.f6.i(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
        } else {
            if (z10) {
                f9 = 5.0f;
            } else {
                f9 = 15.0f;
            }
            if (z10) {
                f10 = 15.0f;
            } else {
                f10 = 25.0f;
            }
            d = i7.f6.d(-2, -2.0f, 51, f9, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, d);
        TextView i10 = th.i(linearLayout, textView, i7.f6.o(-2, -2, 1.0f, 16), context);
        this.f24601c = i10;
        if (z12) {
            v03 = a(0.6f);
        } else {
            v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        i10.setTextColor(v03);
        i10.setTextSize(1, 11.0f);
        i10.setTypeface(AndroidUtilities.bold());
        i10.setEllipsize(truncateAt);
        i10.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            l1 = a(0.05f);
        } else {
            l1 = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        }
        int i11 = l1;
        if (z12) {
            l12 = a(0.08f);
        } else {
            l12 = org.telegram.ui.ActionBar.g6.l1(0.24f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var));
        }
        int i12 = l12;
        i10.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, i11, i12, i12));
        i10.setGravity(17);
        i10.setSingleLine(true);
        i7.h6.a(i10);
        linearLayout.addView(i10, i7.f6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        i10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f24600b = textView2;
        if (z12) {
            v04 = a(0.6f);
        } else {
            v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var);
        }
        textView2.setTextColor(v04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d10 = i7.f6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = i7.f6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            v05 = a(0.6f);
        } else {
            v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ve, c6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 3, -1));
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = i7.f6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            d11 = i7.f6.d(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d11);
    }

    public final int a(float f9) {
        return i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, this.v), (int) (f9 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f24603f = charSequence;
        this.h = i11;
        this.f24604n = i12;
        TextView textView = this.f24599a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f24602e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f24602e = false;
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
        this.f24601c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f24605r = charSequence;
        this.f24606s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f24600b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f24603f != null && this.f24604n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24603f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f24604n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f24599a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        if (this.f24605r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f24605r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ue, c6Var)), 0, this.f24606s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Te, c6Var)), this.f24606s, this.f24605r.length(), 33);
            } catch (Exception unused) {
            }
            this.f24600b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f24599a;
    }

    @Override
    public final void invalidate() {
        this.f24599a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f24600b) {
            i11 = org.telegram.messenger.x3.C(16.0f, this.f24599a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f24602e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f24601c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f24599a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f24599a.setTextColor(i10);
    }
}
