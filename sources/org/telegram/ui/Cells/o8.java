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
    public final TextView f22601a;
    public final TextView f22602b;
    public final TextView f22603c;
    public final ImageView d;
    public boolean f22604e;
    public CharSequence f22605f;
    public int h;
    public int f22606n;
    public CharSequence f22607r;
    public int f22608s;
    public final org.telegram.ui.ActionBar.e6 v;

    public o8(Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12) {
        super(context);
        int w02;
        float f7;
        ViewGroup.LayoutParams a2;
        int w03;
        int m12;
        int m13;
        int w04;
        ViewGroup.LayoutParams a10;
        int w05;
        float f10;
        ViewGroup.LayoutParams a11;
        float f11;
        float f12;
        float f13;
        this.v = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        this.f22601a = textView;
        if (z12) {
            w02 = a(0.6f);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var);
        }
        org.telegram.messenger.q.m(15.0f, w02, 1, textView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        if (z10) {
            textView.setGravity(17);
            textView.setTextAlignment(4);
        }
        if (z11) {
            if (z10) {
                f12 = 5.0f;
            } else {
                f12 = 15.0f;
            }
            if (z10) {
                f13 = 15.0f;
            } else {
                f13 = 25.0f;
            }
            a2 = w7.x5.i(-2.0f, -2.0f, 8388659, f12, 5.0f, f13, 0.0f);
        } else {
            float f14 = z10 ? 5.0f : 15.0f;
            if (z10) {
                f7 = 15.0f;
            } else {
                f7 = 25.0f;
            }
            a2 = w7.x5.a(-2.0f, f14, 5.0f, f7, 0.0f, -2, 51);
        }
        addView(linearLayout, a2);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.o(-2, -2, 1.0f, 16), context);
        this.f22603c = h;
        if (z12) {
            w03 = a(0.6f);
        } else {
            w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var);
        }
        h.setTextColor(w03);
        h.setTextSize(1, 11.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setEllipsize(truncateAt);
        h.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.33f), 0);
        int dp = AndroidUtilities.dp(9.0f);
        if (z12) {
            m12 = a(0.05f);
        } else {
            m12 = org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var));
        }
        int i10 = m12;
        if (z12) {
            m13 = a(0.08f);
        } else {
            m13 = org.telegram.ui.ActionBar.i6.m1(0.24f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var));
        }
        int i11 = m13;
        h.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, i10, i11, i11));
        h.setGravity(17);
        h.setSingleLine(true);
        w7.z5.a(h);
        linearLayout.addView(h, w7.x5.p(-2, -2, 0.0f, 16, 5, 1, 0, 0));
        h.setVisibility(8);
        TextView textView2 = new TextView(context);
        this.f22602b = textView2;
        if (z12) {
            w04 = a(0.6f);
        } else {
            w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var);
        }
        textView2.setTextColor(w04);
        textView2.setTextSize(1, 12.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setVisibility(4);
        if (z11) {
            a10 = w7.x5.i(-2.0f, -2.0f, 8388661, 12.0f, 6.0f, 17.0f, 0.0f);
        } else {
            a10 = w7.x5.a(-2.0f, 12.0f, 6.0f, 17.0f, 0.0f, -2, 53);
        }
        addView(textView2, a10);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (z12) {
            w05 = a(0.6f);
        } else {
            w05 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ve, e6Var);
        }
        imageView.setColorFilter(new PorterDuffColorFilter(w05, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var), 3, -1));
        if (z11) {
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            a11 = w7.x5.i(24.0f, 24.0f, 8388661, 0.0f, 0.0f, f11, 0.0f);
        } else {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 10.0f;
            }
            a11 = w7.x5.a(24.0f, 0.0f, 0.0f, f10, 0.0f, 24, 53);
        }
        imageView.setTranslationY(AndroidUtilities.dp(4.0f));
        addView(imageView, a11);
    }

    public final int a(float f7) {
        return i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, this.v), (int) (f7 * 255.0f));
    }

    public final void b(int i10, CharSequence charSequence) {
        c(charSequence, i10, null, 0, 0);
    }

    public final void c(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        this.f22605f = charSequence;
        this.h = i11;
        this.f22606n = i12;
        TextView textView = this.f22601a;
        ImageView imageView = this.d;
        if (charSequence == null) {
            this.f22604e = true;
            textView.setText("");
            imageView.setVisibility(4);
        } else {
            this.f22604e = false;
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
        this.f22603c.setVisibility(8);
    }

    public final void d(int i10, CharSequence charSequence) {
        int i11;
        this.f22607r = charSequence;
        this.f22608s = i10;
        if (charSequence != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f22602b.setVisibility(i11);
        f();
    }

    public final void e() {
        if (this.f22605f != null && this.f22606n > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22605f);
            try {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ue, this.v));
                int i10 = this.h;
                spannableStringBuilder.setSpan(foregroundColorSpan, i10, this.f22606n + i10, 33);
            } catch (Exception unused) {
            }
            TextView textView = this.f22601a;
            textView.setText(Emoji.replaceEmoji(spannableStringBuilder, textView.getPaint().getFontMetricsInt(), false));
        }
    }

    public final void f() {
        org.telegram.ui.ActionBar.e6 e6Var = this.v;
        if (this.f22607r != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22607r);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ue, e6Var)), 0, this.f22608s, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Te, e6Var)), this.f22608s, this.f22607r.length(), 33);
            } catch (Exception unused) {
            }
            this.f22602b.setText(spannableStringBuilder);
        }
    }

    public TextView getTextView() {
        return this.f22601a;
    }

    @Override
    public final void invalidate() {
        this.f22601a.invalidate();
        super.invalidate();
    }

    @Override
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        if (view == this.f22602b) {
            i11 = org.telegram.messenger.q.C(16.0f, this.f22601a.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f22604e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(27.0f), 1073741824));
        }
    }

    public void setEdit(View.OnClickListener onClickListener) {
        TextView textView = this.f22603c;
        textView.setVisibility(0);
        textView.setText(LocaleController.getString(R.string.EditPack));
        textView.setOnClickListener(onClickListener);
    }

    public void setHeaderOnClick(View.OnClickListener onClickListener) {
        this.f22601a.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setTitleColor(int i10) {
        this.f22601a.setTextColor(i10);
    }
}
