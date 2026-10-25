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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.p10;
public final class s8 extends FrameLayout {
    public final TextView f25401a;
    public final TextView f25402b;
    public final TextView f25403c;
    public final ImageView d;
    public boolean e;
    public CharSequence f25404f;
    public int h;
    public int f25405n;
    public CharSequence f25406r;
    public int f25407s;
    public final org.telegram.ui.ActionBar.u6 v;

    public s8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, boolean z12) {
        super(context);
        org.telegram.ui.ActionBar.b7 N;
        float f7;
        float f10;
        ViewGroup.LayoutParams h;
        org.telegram.ui.ActionBar.b7 N2;
        int o12;
        int o13;
        org.telegram.ui.ActionBar.b7 L;
        org.telegram.ui.ActionBar.b7 L2;
        org.telegram.ui.ActionBar.b7 N3;
        ViewGroup.LayoutParams h10;
        org.telegram.ui.ActionBar.b7 N4;
        float f11;
        ViewGroup.LayoutParams h11;
        float f12;
        float f13;
        float f14;
        this.v = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f25401a = textView;
        if (z12) {
            N = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153);
        } else {
            N = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te);
        }
        org.telegram.ui.ActionBar.f7.W(textView, N, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
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
            h = gb1.m(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
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
            h = gb1.h(-2, -2.0f, 51, f7, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, h);
        TextView e = vh.e(linearLayout, textView, gb1.s(-2, -2, 1.0f, 16), context);
        this.f25403c = e;
        if (z12) {
            N2 = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153);
        } else {
            N2 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te);
        }
        org.telegram.ui.ActionBar.f7.W(e, N2, u6Var);
        e.setTextSize(1, 11.0f);
        e.setTypeface(AndroidUtilities.bold());
        e.setEllipsize(truncateAt);
        e.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            o12 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 12.75f);
        } else {
            o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Te, u6Var));
        }
        int i10 = o12;
        if (z12) {
            o13 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Wk, u6Var), (int) 20.4f);
        } else {
            o13 = org.telegram.ui.ActionBar.y6.o1(0.24f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Te, u6Var));
        }
        int i11 = o13;
        y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, i10, i11, i11);
        if (z12) {
            L = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 12);
        } else {
            L = org.telegram.ui.ActionBar.f7.L(0.1f, org.telegram.ui.ActionBar.y6.Te);
        }
        if (z12) {
            L2 = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 20);
        } else {
            L2 = org.telegram.ui.ActionBar.f7.L(0.24f, org.telegram.ui.ActionBar.y6.Te);
        }
        e.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(e, j02, L, L2, u6Var);
        e.setGravity(17);
        e.setSingleLine(true);
        gb1.b(e);
        linearLayout.addView(e, gb1.t(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        e.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f25402b = textView2;
        if (z12) {
            N3 = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153);
        } else {
            N3 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Te);
        }
        org.telegram.ui.ActionBar.f7.W(textView2, N3, u6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            h10 = gb1.m(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            h10 = gb1.h(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, h10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            N4 = org.telegram.ui.ActionBar.f7.h(org.telegram.ui.ActionBar.y6.Wk, 153);
        } else {
            N4 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.Ve);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i12 = N4.f22483a;
        int i13 = N4.f22484b;
        int i14 = N4.f22485c;
        float f15 = N4.d;
        int Q = org.telegram.ui.ActionBar.f7.Q(i12, i13, i14, f15, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView.setColorFilter(porterDuffColorFilter);
        org.telegram.ui.ActionBar.f7.O(imageView, 5, i12, i13, i14, f15, u6Var, Q, porterDuffColorFilter).h = mode;
        int i15 = org.telegram.ui.ActionBar.y6.f23446i6;
        y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i15, u6Var), 3, -1);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i15);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N5, u6Var);
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            h11 = gb1.m(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            h11 = gb1.h(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, h11);
    }

    public final void a(int i10, CharSequence charSequence) {
        b(charSequence, i10, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f25404f = charSequence;
        this.h = i11;
        this.f25405n = i12;
        TextView textView = this.f25401a;
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
        this.f25403c.setVisibility(8);
    }

    public final void c(int i10, CharSequence charSequence) {
        int i11;
        this.f25406r = charSequence;
        this.f25407s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f25402b.setVisibility(i11);
        e();
    }

    public final void d() {
        if (this.f25404f != null && this.f25405n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25404f);
            try {
                p10 p10Var = new p10(org.telegram.ui.ActionBar.y6.Ue, this.v);
                int i10 = this.h;
                spannableStringBuilder.setSpan(p10Var, i10, this.f25405n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f25401a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.u6 u6Var = this.v;
        if (this.f25406r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25406r);
            try {
                spannableStringBuilder.setSpan(new r8(org.telegram.ui.ActionBar.y6.Ue, u6Var), 0, this.f25407s, 33);
                spannableStringBuilder.setSpan(new r8(org.telegram.ui.ActionBar.y6.Te, u6Var), this.f25407s, this.f25406r.length(), 33);
            } catch (Exception unused) {
            }
            this.f25402b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f25401a;
    }

    @Override
    public final void invalidate() {
        this.f25401a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f25402b) {
            i11 = org.telegram.messenger.t.D(16.0f, this.f25401a.getMeasuredWidth(), i11);
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
        TextView textView = this.f25403c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f25401a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f25401a.setTextColor(i10);
    }
}
