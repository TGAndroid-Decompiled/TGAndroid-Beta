package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.k10;
public final class o8 extends FrameLayout {
    public final TextView f22855a;
    public final TextView f22856b;
    public final TextView f22857c;
    public final ImageView d;
    public boolean e;
    public CharSequence f22858f;
    public int h;
    public int f22859n;
    public CharSequence f22860r;
    public int f22861s;
    public final org.telegram.ui.ActionBar.g6 v;

    public o8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12) {
        super(context);
        org.telegram.ui.ActionBar.n6 O;
        float f7;
        float f10;
        ViewGroup.LayoutParams d;
        org.telegram.ui.ActionBar.n6 O2;
        int o12;
        int o13;
        org.telegram.ui.ActionBar.n6 M;
        org.telegram.ui.ActionBar.n6 M2;
        org.telegram.ui.ActionBar.n6 O3;
        ViewGroup.LayoutParams d10;
        org.telegram.ui.ActionBar.n6 O4;
        float f11;
        ViewGroup.LayoutParams d11;
        float f12;
        float f13;
        float f14;
        this.v = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f22855a = textView;
        if (z12) {
            O = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153);
        } else {
            O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te);
        }
        org.telegram.ui.ActionBar.r6.X(textView, O, g6Var);
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
            d = w7.z5.i(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
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
            d = w7.z5.d(-2, -2.0f, 51, f7, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, d);
        TextView f15 = tl.f(linearLayout, textView, w7.z5.o(-2, -2, 1.0f, 16), context);
        this.f22857c = f15;
        if (z12) {
            O2 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153);
        } else {
            O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te);
        }
        org.telegram.ui.ActionBar.r6.X(f15, O2, g6Var);
        f15.setTextSize(1, 11.0f);
        f15.setTypeface(AndroidUtilities.bold());
        f15.setEllipsize(truncateAt);
        f15.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            o12 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 12.75f);
        } else {
            o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Te, g6Var));
        }
        int i10 = o12;
        if (z12) {
            o13 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, g6Var), (int) 20.4f);
        } else {
            o13 = org.telegram.ui.ActionBar.k6.o1(0.24f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Te, g6Var));
        }
        int i11 = o13;
        y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, i10, i11, i11);
        if (z12) {
            M = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 12);
        } else {
            M = org.telegram.ui.ActionBar.r6.M(0.1f, org.telegram.ui.ActionBar.k6.Te);
        }
        if (z12) {
            M2 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 20);
        } else {
            M2 = org.telegram.ui.ActionBar.r6.M(0.24f, org.telegram.ui.ActionBar.k6.Te);
        }
        f15.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(f15, j02, M, M2, g6Var);
        f15.setGravity(17);
        f15.setSingleLine(true);
        w7.b6.a(f15);
        linearLayout.addView(f15, w7.z5.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        f15.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f22856b = textView2;
        if (z12) {
            O3 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153);
        } else {
            O3 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Te);
        }
        org.telegram.ui.ActionBar.r6.X(textView2, O3, g6Var);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d10 = w7.z5.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = w7.z5.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            O4 = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Wk, 153);
        } else {
            O4 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.Ve);
        }
        org.telegram.ui.ActionBar.r6.u(imageView, O4, g6Var, PorterDuff.Mode.MULTIPLY);
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O5, g6Var);
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = w7.z5.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            d11 = w7.z5.d(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d11);
    }

    public final void a(int i10, CharSequence charSequence) {
        b(charSequence, i10, null, 0, 0);
    }

    public final void b(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f22858f = charSequence;
        this.h = i11;
        this.f22859n = i12;
        TextView textView = this.f22855a;
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
        this.f22857c.setVisibility(8);
    }

    public final void c(int i10, CharSequence charSequence) {
        int i11;
        this.f22860r = charSequence;
        this.f22861s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f22856b.setVisibility(i11);
        e();
    }

    public final void d() {
        if (this.f22858f != null && this.f22859n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22858f);
            try {
                k10 k10Var = new k10(org.telegram.ui.ActionBar.k6.Ue, this.v);
                int i10 = this.h;
                spannableStringBuilder.setSpan(k10Var, i10, this.f22859n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f22855a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void e() {
        org.telegram.ui.ActionBar.g6 g6Var = this.v;
        if (this.f22860r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22860r);
            try {
                spannableStringBuilder.setSpan(new n8(org.telegram.ui.ActionBar.k6.Ue, g6Var), 0, this.f22861s, 33);
                spannableStringBuilder.setSpan(new n8(org.telegram.ui.ActionBar.k6.Te, g6Var), this.f22861s, this.f22860r.length(), 33);
            } catch (Exception unused) {
            }
            this.f22856b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f22855a;
    }

    @Override
    public final void invalidate() {
        this.f22855a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f22856b) {
            i11 = org.telegram.messenger.v0.C(16.0f, this.f22855a.getMeasuredWidth(), i11);
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
        TextView textView = this.f22857c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f22855a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f22855a.setTextColor(i10);
    }
}
