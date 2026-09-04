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
public final class o8 extends FrameLayout {
    public final TextView f22439a;
    public final TextView f22440b;
    public final TextView f22441c;
    public final ImageView d;
    public boolean f22442e;
    public CharSequence f22443f;
    public int h;
    public int f22444n;
    public CharSequence f22445r;
    public int f22446s;
    public final org.telegram.ui.ActionBar.f6 v;

    public o8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12) {
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
        this.f22439a = textView;
        if (z12) {
            v02 = a(0.6f);
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
        }
        org.telegram.messenger.w1.q(textView, v02, 1, 15.0f);
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
            d = w7.x5.i(-2.0f, -2.0f, 8388659, f13, 5.0f, f14, 0.0f);
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
            d = w7.x5.d(-2, -2.0f, 51, f7, 5.0f, f10, 0.0f);
        }
        addView(linearLayout, d);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.o(-2, -2, 1.0f, 16), context);
        this.f22441c = h;
        if (z12) {
            v03 = a(0.6f);
        } else {
            v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var);
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
            l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i10 = l1;
        if (z12) {
            l12 = a(0.08f);
        } else {
            l12 = org.telegram.ui.ActionBar.j6.l1(0.24f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var));
        }
        int i11 = l12;
        h.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i10, i11, i11));
        h.setGravity(17);
        h.setSingleLine(true);
        w7.z5.a(h);
        linearLayout.addView(h, w7.x5.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        h.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f22440b = textView2;
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
            d10 = w7.x5.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            d10 = w7.x5.d(-2, -2.0f, 53, 12.0f, 6.0f, 17.0f, 0.0f);
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
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var), 3, -1));
        if (z11) {
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = 10.0f;
            }
            d11 = w7.x5.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f12, 0.0f);
        } else {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            d11 = w7.x5.d(24, 24.0f, 53, 0.0f, 0.0f, f11, 0.0f);
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
        this.f22443f = charSequence;
        this.h = i11;
        this.f22444n = i12;
        TextView textView = this.f22439a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f22442e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f22442e = false;
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
        this.f22441c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f22445r = charSequence;
        this.f22446s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f22440b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f22443f != null && this.f22444n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22443f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f22444n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f22439a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.f6 f6Var = this.v;
        if (this.f22445r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22445r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ue, f6Var)), 0, this.f22446s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Te, f6Var)), this.f22446s, this.f22445r.length(), 33);
            } catch (Exception unused) {
            }
            this.f22440b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f22439a;
    }

    @Override
    public final void invalidate() {
        this.f22439a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f22440b) {
            i11 = org.telegram.messenger.w1.C(16.0f, this.f22439a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22442e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f22441c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f22439a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f22439a.setTextColor(i10);
    }
}
