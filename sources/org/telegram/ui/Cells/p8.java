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
public final class p8 extends FrameLayout {
    public final TextView f19686a;
    public final TextView f19687b;
    public final TextView f19688c;
    public final ImageView d;
    public boolean e;
    public CharSequence f19689f;
    public int h;
    public int f19690n;
    public CharSequence f19691r;
    public int f19692s;
    public final org.telegram.ui.ActionBar.f6 v;

    public p8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12) {
        super(context);
        int v02;
        float f7;
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
        this.v = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f19686a = textView;
        if (z12) {
            v02 = a(0.6f);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        org.telegram.messenger.a2.q(textView, v02, 1, 15.0f);
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
            d = w7.a6.i(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
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
            d = w7.a6.d(-2, -2.0f, 51, f7, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, d);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.o(-2, -2, 1.0f, 16), context);
        this.f19688c = g10;
        if (z12) {
            v03 = a(0.6f);
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        g10.setTextColor(v03);
        g10.setTextSize(1, 11.0f);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setEllipsize(truncateAt);
        g10.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            l1 = a(0.05f);
        } else {
            l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i10 = l1;
        if (z12) {
            l12 = a(0.08f);
        } else {
            l12 = org.telegram.ui.ActionBar.j6.l1(0.24f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i11 = l12;
        g10.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i10, i11, i11));
        g10.setGravity(17);
        g10.setSingleLine(true);
        w7.c6.a(g10);
        linearLayout.addView(g10, w7.a6.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        g10.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f19687b = textView2;
        if (z12) {
            v04 = a(0.6f);
        } else {
            v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        textView2.setTextColor(v04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            d10 = w7.a6.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = w7.a6.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
        }
        addView(textView2, d10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            v05 = a(0.6f);
        } else {
            v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ve, f6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(v05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 3, -1));
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = w7.a6.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            d11 = w7.a6.d(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, d11);
    }

    public final int a(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, this.v), (int) (f7 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f19689f = charSequence;
        this.h = i11;
        this.f19690n = i12;
        TextView textView = this.f19686a;
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
        this.f19688c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f19691r = charSequence;
        this.f19692s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f19687b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f19689f != null && this.f19690n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19689f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f19690n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f19686a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (this.f19691r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f19691r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, f6Var)), 0, this.f19692s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var)), this.f19692s, this.f19691r.length(), 33);
            } catch (Exception unused) {
            }
            this.f19687b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f19686a;
    }

    @Override
    public final void invalidate() {
        this.f19686a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f19687b) {
            i11 = org.telegram.messenger.a2.C(16.0f, this.f19686a.getMeasuredWidth(), i11);
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
        TextView textView = this.f19688c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f19686a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f19686a.setTextColor(i10);
    }
}
