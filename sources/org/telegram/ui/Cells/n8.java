package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.l00;
public final class n8 extends FrameLayout {
    public final TextView f22363a;
    public final TextView f22364b;
    public final TextView f22365c;
    public final ImageView d;
    public boolean e;
    public CharSequence f22366f;
    public int h;
    public int f22367n;
    public CharSequence f22368r;
    public int f22369s;
    public final org.telegram.ui.ActionBar.p6 f22370w;

    public n8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.p6 p6Var, boolean z12) {
        super(context);
        org.telegram.ui.ActionBar.w6 N;
        float f7;
        float f10;
        ViewGroup.LayoutParams d;
        org.telegram.ui.ActionBar.w6 N2;
        int r12;
        int r13;
        org.telegram.ui.ActionBar.w6 L;
        org.telegram.ui.ActionBar.w6 L2;
        org.telegram.ui.ActionBar.w6 N3;
        ViewGroup.LayoutParams d10;
        org.telegram.ui.ActionBar.w6 N4;
        float f11;
        ViewGroup.LayoutParams d11;
        float f12;
        float f13;
        float f14;
        this.f22370w = p6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f22363a = textView;
        if (z12) {
            N = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 153);
        } else {
            N = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If);
        }
        org.telegram.ui.ActionBar.a7.W(textView, N, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
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
            d = w7.b6.i(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
        } else {
            if (z10) {
                f7 = 5.0f;
            } else {
                f7 = 15.0f;
            }
            if (z10) {
                f10 = 15.0f;
            } else {
                f10 = 25.0f;
            }
            d = w7.b6.d(-2, -2.0f, 51, f7, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, d);
        TextView f15 = a30.f(linearLayout, textView, w7.b6.p(-2, -2, 1.0f, 16), context);
        this.f22365c = f15;
        if (z12) {
            N2 = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 153);
        } else {
            N2 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If);
        }
        org.telegram.ui.ActionBar.a7.W(f15, N2, p6Var);
        f15.setTextSize(1, 11.0f);
        f15.setTypeface(org.telegram.messenger.i0.o());
        f15.setEllipsize(truncateAt);
        f15.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.33f), 0);
        int L3 = org.telegram.messenger.i0.L(9.0f);
        if (z12) {
            r12 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 12.75f);
        } else {
            r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.If, p6Var));
        }
        int i10 = r12;
        if (z12) {
            r13 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 20.4f);
        } else {
            r13 = org.telegram.ui.ActionBar.t6.r1(0.24f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.If, p6Var));
        }
        int i11 = r13;
        y k02 = org.telegram.ui.ActionBar.t6.k0(L3, L3, L3, L3, i10, i11, i11);
        if (z12) {
            L = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 12);
        } else {
            L = org.telegram.ui.ActionBar.a7.L(0.1f, org.telegram.ui.ActionBar.t6.If);
        }
        if (z12) {
            L2 = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 20);
        } else {
            L2 = org.telegram.ui.ActionBar.a7.L(0.24f, org.telegram.ui.ActionBar.t6.If);
        }
        f15.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(f15, k02, L, L2, p6Var);
        f15.setGravity(17);
        f15.setSingleLine(true);
        w7.e6.a(f15);
        linearLayout.addView(f15, w7.b6.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f15.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f22364b = textView2;
        if (z12) {
            N3 = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 153);
        } else {
            N3 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.If);
        }
        org.telegram.ui.ActionBar.a7.W(textView2, N3, p6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d10 = w7.b6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = w7.b6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            N4 = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.Kl, 153);
        } else {
            N4 = org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.Kf);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i12 = N4.f21453a;
        int i13 = N4.f21454b;
        int i14 = N4.f21455c;
        float f16 = N4.d;
        int Q = org.telegram.ui.ActionBar.a7.Q(i12, i13, i14, f16, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.a7.O(imageView, 5, i12, i13, i14, f16, p6Var, Q, porterDuffColorFilter).h = mode;
        int i15 = org.telegram.ui.ActionBar.t6.f21021i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 3, -1);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i15);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N5, p6Var);
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = w7.b6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            d11 = w7.b6.d(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.i0.L(4.0f));
        addView(imageView, d11);
    }

    public final void a(int i10, CharSequence charSequence) {
        b(charSequence, i10, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f22366f = charSequence;
        this.h = i11;
        this.f22367n = i12;
        TextView textView = this.f22363a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.e = false;
            if (i12 != 0) {
                d();
            } else {
                textView.setText(org.telegram.messenger.k6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i10 != 0) {
                imageView.setImageResource(i10);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.f22365c.setVisibility(8);
    }

    public final void c(int i10, CharSequence charSequence) {
        int i11;
        this.f22368r = charSequence;
        this.f22369s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f22364b.setVisibility(i11);
        e();
    }

    public final void d() {
        if (this.f22366f != null && this.f22367n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22366f);
            try {
                l00 l00Var = new l00(org.telegram.ui.ActionBar.t6.Jf, this.f22370w);
                int i10 = this.h;
                spannableStringBuilder.setSpan(l00Var, i10, this.f22367n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f22363a;
            textView.setText(org.telegram.messenger.k6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f22370w;
        if (this.f22368r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22368r);
            try {
                spannableStringBuilder.setSpan(new m8(org.telegram.ui.ActionBar.t6.Jf, p6Var), 0, this.f22369s, 33);
                spannableStringBuilder.setSpan(new m8(org.telegram.ui.ActionBar.t6.If, p6Var), this.f22369s, this.f22368r.length(), 33);
            } catch (Exception unused) {
            }
            this.f22364b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f22363a;
    }

    @Override
    public final void invalidate() {
        this.f22363a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f22364b) {
            i11 = org.telegram.messenger.m5.C(16.0f, this.f22363a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f22365c;
        textView.setVisibility(0);
        textView.setText(dd.L0(2131751258, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f22363a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f22363a.setTextColor(i10);
    }
}
