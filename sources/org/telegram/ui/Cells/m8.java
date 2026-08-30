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
import org.telegram.ui.yh;
public final class m8 extends FrameLayout {
    public final TextView f21394a;
    public final TextView f21395b;
    public final TextView f21396c;
    public final ImageView d;
    public boolean e;
    public CharSequence f21397f;
    public int h;
    public int f21398n;
    public CharSequence f21399r;
    public int f21400s;
    public final org.telegram.ui.ActionBar.f6 v;

    public m8(Context context, boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, boolean z11) {
        super(context);
        int v02;
        float f10;
        float f11;
        ViewGroup.LayoutParams d;
        int v03;
        int l1;
        int l12;
        int v04;
        ViewGroup.LayoutParams d10;
        int v05;
        float f12;
        ViewGroup.LayoutParams d11;
        float f13;
        float f14;
        float f15;
        this.v = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f21394a = textView;
        if (z11) {
            v02 = a(0.6f);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        org.telegram.messenger.y3.t(textView, v02, 1, 15.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z4) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z10) {
            if (z4) {
                f14 = 5.0f;
            } else {
                f14 = 15.0f;
            }
            if (z4) {
                f15 = 15.0f;
            } else {
                f15 = 25.0f;
            }
            d = k7.b6.i(-2.0f, -2.0f, 8388659, f14, 5.0f, f15, 0.0f);
        } else {
            if (z4) {
                f10 = 5.0f;
            } else {
                f10 = 15.0f;
            }
            if (z4) {
                f11 = 15.0f;
            } else {
                f11 = 25.0f;
            }
            d = k7.b6.d(-2, -2.0f, 51, f10, 5.0f, f11, 0.0f);
        }
        addView(linearLayout, d);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.o(-2, -2, 1.0f, 16), context);
        this.f21396c = j10;
        if (z11) {
            v03 = a(0.6f);
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        j10.setTextColor(v03);
        j10.setTextSize(1, 11.0f);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setEllipsize(truncateAt);
        j10.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z11) {
            l1 = a(0.05f);
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i10 = l1;
        if (z11) {
            l12 = a(0.08f);
        } else {
            l12 = org.telegram.ui.ActionBar.j6.l1(0.24f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i11 = l12;
        j10.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i10, i11, i11));
        j10.setGravity(17);
        j10.setSingleLine(true);
        k7.d6.a(j10);
        linearLayout.addView(j10, k7.b6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        j10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f21395b = textView2;
        if (z11) {
            v04 = a(0.6f);
        } else {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        textView2.setTextColor(v04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z10) {
            d10 = k7.b6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = k7.b6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z11) {
            v05 = a(0.6f);
        } else {
            v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 3, -1));
        if (z10) {
            if (z4) {
                f13 = 0.0f;
            } else {
                f13 = 10.0f;
            }
            d11 = k7.b6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f13, 0.0f);
        } else {
            if (z4) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = k7.b6.d(24, 24.0f, 53, 0.0f, 0.0f, f12, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d11);
    }

    public final int a(float f10) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.v), (int) (f10 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f21397f = charSequence;
        this.h = i11;
        this.f21398n = i12;
        TextView textView = this.f21394a;
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
        this.f21396c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f21399r = charSequence;
        this.f21400s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f21395b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f21397f != null && this.f21398n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21397f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f21398n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f21394a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (this.f21399r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f21399r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, f6Var)), 0, this.f21400s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var)), this.f21400s, this.f21399r.length(), 33);
            } catch (Exception unused) {
            }
            this.f21395b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f21394a;
    }

    @Override
    public final void invalidate() {
        this.f21394a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f21395b) {
            i11 = org.telegram.messenger.y3.C(16.0f, this.f21394a.getMeasuredWidth(), i11);
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
        TextView textView = this.f21396c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f21394a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f21394a.setTextColor(i10);
    }
}
