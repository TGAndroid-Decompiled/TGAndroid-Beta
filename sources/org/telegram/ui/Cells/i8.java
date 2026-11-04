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
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.tz;
public final class i8 extends FrameLayout {
    public final TextView f29379a;
    public final TextView f29380b;
    public final TextView f29381c;
    public final ImageView d;
    public boolean f29382e;
    public CharSequence f29383f;
    public int h;
    public int f29384n;
    public CharSequence f29385r;
    public int f29386s;
    public final org.telegram.ui.ActionBar.e6 f29387w;

    public i8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12) {
        super(context);
        org.telegram.ui.ActionBar.n6 N;
        float f10;
        float f11;
        ViewGroup.LayoutParams d;
        org.telegram.ui.ActionBar.n6 N2;
        int r12;
        int r13;
        org.telegram.ui.ActionBar.n6 L;
        org.telegram.ui.ActionBar.n6 L2;
        org.telegram.ui.ActionBar.n6 N3;
        ViewGroup.LayoutParams d10;
        org.telegram.ui.ActionBar.n6 N4;
        float f12;
        ViewGroup.LayoutParams d11;
        float f13;
        float f14;
        float f15;
        this.f29387w = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f29379a = textView;
        if (z12) {
            N = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 153);
        } else {
            N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If);
        }
        org.telegram.ui.ActionBar.r6.W(textView, N, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
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
            d = mf.i(-2.0f, -2.0f, 8388659, f14, 5.0f, f15, 0.0f);
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
            d = mf.d(-2, -2.0f, 51, f10, 5.0f, f11, 0.0f);
        }
        addView(linearLayout, d);
        TextView f16 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.p(-2, -2, 1.0f, 16), context);
        this.f29381c = f16;
        if (z12) {
            N2 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 153);
        } else {
            N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If);
        }
        org.telegram.ui.ActionBar.r6.W(f16, N2, e6Var);
        f16.setTextSize(1, 11.0f);
        f16.setTypeface(org.telegram.messenger.g0.o());
        f16.setEllipsize(truncateAt);
        f16.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        int L3 = org.telegram.messenger.g0.L(9.0f);
        if (z12) {
            r12 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 12.75f);
        } else {
            r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, e6Var));
        }
        int i3 = r12;
        if (z12) {
            r13 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, e6Var), (int) 20.4f);
        } else {
            r13 = org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.If, e6Var));
        }
        int i10 = r13;
        y k02 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, i3, i10, i10);
        if (z12) {
            L = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 12);
        } else {
            L = org.telegram.ui.ActionBar.r6.L(0.1f, org.telegram.ui.ActionBar.k6.If);
        }
        if (z12) {
            L2 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 20);
        } else {
            L2 = org.telegram.ui.ActionBar.r6.L(0.24f, org.telegram.ui.ActionBar.k6.If);
        }
        f16.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(f16, k02, L, L2, e6Var);
        f16.setGravity(17);
        f16.setSingleLine(true);
        pf.a(f16);
        linearLayout.addView(f16, mf.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f16.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f29380b = textView2;
        if (z12) {
            N3 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 153);
        } else {
            N3 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.If);
        }
        org.telegram.ui.ActionBar.r6.W(textView2, N3, e6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d10 = mf.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = mf.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            N4 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Kl, 153);
        } else {
            N4 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.Kf);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i11 = N4.f28359a;
        int i12 = N4.f28360b;
        int i13 = N4.f28361c;
        float f17 = N4.d;
        int Q = org.telegram.ui.ActionBar.r6.Q(i11, i12, i13, f17, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.r6.O(imageView, 5, i11, i12, i13, f17, e6Var, Q, porterDuffColorFilter).h = mode;
        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i14);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N5, e6Var);
        if (z11) {
            if (z10) {
                f13 = 0.0f;
            } else {
                f13 = 10.0f;
            }
            d11 = mf.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f13, 0.0f);
        } else {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = mf.d(24, 24.0f, 53, 0.0f, 0.0f, f12, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.g0.L(4.0f));
        addView(imageView, d11);
    }

    public final void a(int i3, CharSequence charSequence) {
        b(charSequence, i3, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i3, CharSequence charSequence2, int i10, int i11) {
        this.f29383f = charSequence;
        this.h = i10;
        this.f29384n = i11;
        TextView textView = this.f29379a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f29382e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f29382e = false;
            if (i11 != 0) {
                d();
            } else {
                textView.setText(org.telegram.messenger.i6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i3 != 0) {
                imageView.setImageResource(i3);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.f29381c.setVisibility(8);
    }

    public final void c(int i3, CharSequence charSequence) {
        int i10;
        this.f29385r = charSequence;
        this.f29386s = i3;
        if (charSequence != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29380b.setVisibility(i10);
        e();
    }

    public final void d() {
        if (this.f29383f != null && this.f29384n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29383f);
            try {
                tz tzVar = new tz(org.telegram.ui.ActionBar.k6.Jf, this.f29387w);
                int i3 = this.h;
                spannableStringBuilder.setSpan(tzVar, i3, this.f29384n + i3, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f29379a;
            textView.setText(org.telegram.messenger.i6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f29387w;
        if (this.f29385r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29385r);
            try {
                spannableStringBuilder.setSpan(new h8(org.telegram.ui.ActionBar.k6.Jf, e6Var), 0, this.f29386s, 33);
                spannableStringBuilder.setSpan(new h8(org.telegram.ui.ActionBar.k6.If, e6Var), this.f29386s, this.f29385r.length(), 33);
            } catch (Exception unused) {
            }
            this.f29380b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f29379a;
    }

    @Override
    public final void invalidate() {
        this.f29379a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i3, int i10, int i11, int i12) {
        if (view == this.f29380b) {
            i10 = org.telegram.messenger.k5.C(16.0f, this.f29379a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i3, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (this.f29382e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f29381c;
        textView.setVisibility(0);
        textView.setText(bd.M0(2131751258, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f29379a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i3) {
        this.f29379a.setTextColor(i3);
    }
}
