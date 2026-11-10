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
import org.telegram.messenger.id;
import org.telegram.ui.Components.xz;
public final class j8 extends FrameLayout {
    public final TextView f29383a;
    public final TextView f29384b;
    public final TextView f29385c;
    public final ImageView d;
    public boolean f29386e;
    public CharSequence f29387f;
    public int h;
    public int f29388n;
    public CharSequence f29389r;
    public int f29390s;
    public final org.telegram.ui.ActionBar.h6 f29391w;

    public j8(Context context, boolean z9, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, boolean z11) {
        super(context);
        org.telegram.ui.ActionBar.p6 M;
        float f10;
        float f11;
        ViewGroup.LayoutParams d;
        org.telegram.ui.ActionBar.p6 M2;
        int r12;
        int r13;
        org.telegram.ui.ActionBar.p6 K;
        org.telegram.ui.ActionBar.p6 K2;
        org.telegram.ui.ActionBar.p6 M3;
        ViewGroup.LayoutParams d2;
        org.telegram.ui.ActionBar.p6 M4;
        float f12;
        ViewGroup.LayoutParams d10;
        float f13;
        float f14;
        float f15;
        this.f29391w = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f29383a = textView;
        if (z11) {
            M = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 153);
        } else {
            M = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.If);
        }
        org.telegram.ui.ActionBar.t6.V(textView, M, h6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z9) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z10) {
            if (z9) {
                f14 = 5.0f;
            } else {
                f14 = 15.0f;
            }
            if (z9) {
                f15 = 15.0f;
            } else {
                f15 = 25.0f;
            }
            d = c8.ha.i(-2.0f, -2.0f, 8388659, f14, 5.0f, f15, 0.0f);
        } else {
            if (z9) {
                f10 = 5.0f;
            } else {
                f10 = 15.0f;
            }
            if (z9) {
                f11 = 15.0f;
            } else {
                f11 = 25.0f;
            }
            d = c8.ha.d(-2, -2.0f, 51, f10, 5.0f, f11, 0.0f);
        }
        addView(linearLayout, d);
        TextView f16 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.p(-2, -2, 1.0f, 16), context);
        this.f29385c = f16;
        if (z11) {
            M2 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 153);
        } else {
            M2 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.If);
        }
        org.telegram.ui.ActionBar.t6.V(f16, M2, h6Var);
        f16.setTextSize(1, 11.0f);
        f16.setTypeface(org.telegram.messenger.g0.o());
        f16.setEllipsize(truncateAt);
        f16.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        int L = org.telegram.messenger.g0.L(9.0f);
        if (z11) {
            r12 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 12.75f);
        } else {
            r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.If, h6Var));
        }
        int i7 = r12;
        if (z11) {
            r13 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Kl, h6Var), (int) 20.4f);
        } else {
            r13 = org.telegram.ui.ActionBar.m6.r1(0.24f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.If, h6Var));
        }
        int i10 = r13;
        y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, i7, i10, i10);
        if (z11) {
            K = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 12);
        } else {
            K = org.telegram.ui.ActionBar.t6.K(0.1f, org.telegram.ui.ActionBar.m6.If);
        }
        if (z11) {
            K2 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 20);
        } else {
            K2 = org.telegram.ui.ActionBar.t6.K(0.24f, org.telegram.ui.ActionBar.m6.If);
        }
        f16.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(f16, k02, K, K2, h6Var);
        f16.setGravity(17);
        f16.setSingleLine(true);
        c8.ka.a(f16);
        linearLayout.addView(f16, c8.ha.q(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f16.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f29384b = textView2;
        if (z11) {
            M3 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 153);
        } else {
            M3 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.If);
        }
        org.telegram.ui.ActionBar.t6.V(textView2, M3, h6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z10) {
            d2 = c8.ha.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d2 = c8.ha.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d2);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z11) {
            M4 = org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.Kl, 153);
        } else {
            M4 = org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.Kf);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i11 = M4.f28387a;
        int i12 = M4.f28388b;
        int i13 = M4.f28389c;
        float f17 = M4.d;
        int P = org.telegram.ui.ActionBar.t6.P(i11, i12, i13, f17, h6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.t6.N(imageView, 5, i11, i12, i13, f17, h6Var, P, porterDuffColorFilter).h = mode;
        int i14 = org.telegram.ui.ActionBar.m6.f27982i6;
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 3, -1);
        org.telegram.ui.ActionBar.p6 M5 = org.telegram.ui.ActionBar.t6.M(i14);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M5, h6Var);
        if (z10) {
            if (z9) {
                f13 = 0.0f;
            } else {
                f13 = 10.0f;
            }
            d10 = c8.ha.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f13, 0.0f);
        } else {
            if (z9) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d10 = c8.ha.d(24, 24.0f, 53, 0.0f, 0.0f, f12, 0.0f);
        }
        imageView.setTranslationY(org.telegram.messenger.g0.L(4.0f));
        addView(imageView, d10);
    }

    public final void a(int i7, CharSequence charSequence) {
        b(charSequence, i7, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i7, CharSequence charSequence2, int i10, int i11) {
        this.f29387f = charSequence;
        this.h = i10;
        this.f29388n = i11;
        TextView textView = this.f29383a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f29386e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f29386e = false;
            if (i11 != 0) {
                d();
            } else {
                textView.setText(org.telegram.messenger.i6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
            }
            if (i7 != 0) {
                imageView.setImageResource(i7);
                imageView.setContentDescription(charSequence2);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
        this.f29385c.setVisibility(8);
    }

    public final void c(int i7, CharSequence charSequence) {
        int i10;
        this.f29389r = charSequence;
        this.f29390s = i7;
        if (charSequence != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f29384b.setVisibility(i10);
        e();
    }

    public final void d() {
        if (this.f29387f != null && this.f29388n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29387f);
            try {
                xz xzVar = new xz(org.telegram.ui.ActionBar.m6.Jf, this.f29391w);
                int i7 = this.h;
                spannableStringBuilder.setSpan(xzVar, i7, this.f29388n + i7, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f29383a;
            textView.setText(org.telegram.messenger.i6.m(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false, null, 0));
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f29391w;
        if (this.f29389r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f29389r);
            try {
                spannableStringBuilder.setSpan(new i8(org.telegram.ui.ActionBar.m6.Jf, h6Var), 0, this.f29390s, 33);
                spannableStringBuilder.setSpan(new i8(org.telegram.ui.ActionBar.m6.If, h6Var), this.f29390s, this.f29389r.length(), 33);
            } catch (Exception unused) {
            }
            this.f29384b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f29383a;
    }

    @Override
    public final void invalidate() {
        this.f29383a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        if (view == this.f29384b) {
            i10 = org.telegram.messenger.k5.C(16.0f, this.f29383a.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (this.f29386e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f29385c;
        textView.setVisibility(0);
        textView.setText(id.M0(2131751257, null));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f29383a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i7) {
        this.f29383a.setTextColor(i7);
    }
}
