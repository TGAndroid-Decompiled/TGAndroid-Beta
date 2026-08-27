package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.mo0;
import org.telegram.ui.o00;

public class l8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public org.telegram.ui.Components.i5 G;
    public int H;
    public CharSequence I;
    public Paint J;
    public boolean K;
    public int L;

    public final org.telegram.ui.ActionBar.h5 f24628a;

    public final org.telegram.ui.ActionBar.h5 f24629b;

    public final org.telegram.ui.Components.j6 f24630c;
    public final org.telegram.ui.ActionBar.h5 d;

    public final ri0 f24631e;

    public Switch f24632f;
    public final ImageView h;

    public int f24633n;

    public boolean f24634r;

    public int f24635s;
    public int v;

    public int f24636w;

    public boolean f24637x;

    public boolean f24638y;

    public l8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00();
        o00Var.f40970f = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false);
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r10 = this.f24632f;
        return r10 != null && r10.h;
    }

    public final void d(int i10, int i11, int i12) {
        this.f24635s = 52;
        ri0 ri0Var = this.f24631e;
        ri0Var.setVisibility(0);
        ri0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        ri0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        ri0Var.setImageResource(i12);
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        boolean zA = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        bb0 bb0Var = new bb0(1);
        bb0Var.b(i10, i11);
        bb0Var.f27060b = zA;
        ri0Var.setBackground(bb0Var);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.D || this.F != 0.0f) {
            if (this.J == null) {
                Paint paint = new Paint(1);
                this.J = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.A));
            }
            if (this.K) {
                float f12 = this.E + 0.016f;
                this.E = f12;
                if (f12 > 1.0f) {
                    this.E = 1.0f;
                    this.K = false;
                }
            } else {
                float f13 = this.E - 0.016f;
                this.E = f13;
                if (f13 < 0.0f) {
                    this.E = 0.0f;
                    this.K = true;
                }
            }
            int i10 = this.L;
            if (i10 > 0) {
                this.L = i10 - 15;
            } else {
                boolean z10 = this.D;
                if (z10) {
                    float f14 = this.F;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.F = f15;
                        if (f15 > 1.0f) {
                            this.F = 1.0f;
                        }
                    } else if (!z10) {
                        f10 = this.F;
                        if (f10 != 0.0f) {
                            f11 = f10 - 0.10666667f;
                            this.F = f11;
                            if (f11 < 0.0f) {
                                this.F = 0.0f;
                            }
                        }
                    }
                } else if (!z10) {
                    f10 = this.F;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.10666667f;
                        this.F = f11;
                        if (f11 < 0.0f) {
                            this.F = 0.0f;
                        }
                    }
                }
            }
            this.J.setAlpha((int) (((this.E * 0.4f) + 0.6f) * this.F * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.C), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.J);
            invalidate();
        }
        float f16 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var = this.G;
        this.f24630c.setAlpha(f16 * (i5Var == null ? 1.0f : 1.0f - i5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var2 = this.G;
        this.d.setAlpha(f17 * (i5Var2 == null ? 1.0f : 1.0f - i5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.i5 i5Var3 = this.G;
        if (i5Var3 != null) {
            i5Var3.setBounds((getWidth() - this.G.f29232s) - AndroidUtilities.dp(18.0f), (getHeight() - this.G.f29232s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.G.f29232s) / 2);
            this.G.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.setTextColor(iV0);
        h5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            ri0 ri0Var = this.f24631e;
            ri0Var.setColorFilter(porterDuffColorFilter);
            ri0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        this.D = z10;
        this.C = i10;
        if (!z11) {
            this.F = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void g(boolean z10) {
        super.setEnabled(z10);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setEnabled(z10);
        }
        this.f24628a.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.f24629b.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.f24630c.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public Switch getCheckBox() {
        return this.f24632f;
    }

    public ri0 getImageView() {
        return this.f24631e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.f24628a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f24630c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        if (i10 <= 0) {
            h5Var.i(null);
        } else {
            h5Var.i(new mo0(i10, getContext(), this.A, false));
            h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.f24636w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(null, false, true);
        this.f24631e.setVisibility(8);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f24634r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.f24631e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24634r = z11;
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(0);
            this.f24632f.c(z10, false);
        }
        setWillNotDraw(!this.f24634r);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24630c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f24632f == null) {
            Switch r13 = new Switch(getContext(), this.A);
            this.f24632f = r13;
            int i12 = org.telegram.ui.ActionBar.g6.M6;
            int i13 = org.telegram.ui.ActionBar.g6.N6;
            int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
            r13.d(i12, i13, i14, i14);
            addView(this.f24632f, h7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r14 = this.f24632f;
        if (r14 != null) {
            r14.setVisibility(0);
            this.f24632f.c(z10, false);
        }
        this.f24634r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.f24630c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(0);
            this.f24632f.c(z10, false);
        }
        ri0 ri0Var = this.f24631e;
        ri0Var.setVisibility(0);
        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        ri0Var.setImageResource(i10);
        this.f24634r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(null, false, true);
        ri0 ri0Var = this.f24631e;
        ri0Var.setImageResource(i10);
        ri0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24634r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24635s = 58;
        this.f24636w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(null, false, true);
        ri0 ri0Var = this.f24631e;
        ri0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oi0) {
            ri0Var.setAnimation((oi0) drawable);
        } else {
            ri0Var.setImageDrawable(drawable);
        }
        ri0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.h.setVisibility(8);
        ri0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24634r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.f24631e.setVisibility(8);
        this.h.setVisibility(8);
        this.f24634r = z11;
        setWillNotDraw(!z11);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float fDp;
        int iDp;
        if (this.f24634r) {
            org.telegram.ui.ActionBar.c6 c6Var = this.A;
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : null;
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            Paint paint = paintN;
            boolean z10 = LocaleController.isRTL;
            float f11 = 20.0f;
            ri0 ri0Var = this.f24631e;
            if (z10) {
                fDp = 0.0f;
            } else {
                if (ri0Var.getVisibility() == 0) {
                    f10 = this.f24637x ? 72 : 58;
                } else {
                    f10 = 20.0f;
                }
                fDp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (ri0Var.getVisibility() == 0) {
                    f11 = this.f24637x ? 72 : 58;
                }
                iDp = AndroidUtilities.dp(f11);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        CharSequence text = h5Var.getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        if (!zIsEmpty) {
            CharSequence text2 = j6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f24632f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f24632f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h5Var.getText());
            if (!TextUtils.isEmpty(j6Var.getText())) {
                sb2.append('\n');
                sb2.append(j6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp;
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        int iMax = ((i14 - Math.max(textHeight, j6Var.getTextHeight())) / 2) + 1;
        int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.f24633n - 6) : (i15 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24633n - 6);
        if (this.f24638y && !LocaleController.isRTL) {
            iDp2 = (i15 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24633n);
        }
        j6Var.layout(iDp2, iMax, j6Var.getMeasuredWidth() + iDp2, j6Var.getMeasuredHeight() + iMax);
        int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.f24633n - 6) : (i15 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24633n - 6);
        h5Var.layout(iDp3, iMax, h5Var.getMeasuredWidth() + iDp3, h5Var.getMeasuredHeight() + iMax);
        boolean z11 = LocaleController.isRTL;
        ri0 ri0Var = this.f24631e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.f24628a;
        if (z11) {
            iDp = (getMeasuredWidth() - h5Var2.getMeasuredWidth()) - AndroidUtilities.dp(ri0Var.getVisibility() == 0 ? this.f24635s : this.f24633n);
        } else {
            iDp = AndroidUtilities.dp(ri0Var.getVisibility() == 0 ? this.f24635s : this.f24633n);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24629b;
        if (h5Var3.getVisibility() == 0) {
            float f10 = this.v > 50 ? 4 : 2;
            int iDp4 = AndroidUtilities.dp(1.0f) + rl.x(f10, (i14 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(iDp, iDp4, h5Var2.getMeasuredWidth() + iDp, h5Var2.getMeasuredHeight() + iDp4);
            int iDp5 = AndroidUtilities.dp(f10) + h5Var2.getTextHeight() + iDp4;
            h5Var3.layout(iDp, iDp5, h5Var3.getMeasuredWidth() + iDp, h5Var3.getMeasuredHeight() + iDp5);
        } else {
            int iDp6 = AndroidUtilities.dp(1.0f) + ((i14 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(iDp, iDp6, h5Var2.getMeasuredWidth() + iDp, h5Var2.getMeasuredHeight() + iDp6);
        }
        if (ri0Var.getVisibility() == 0) {
            int iDp7 = AndroidUtilities.dp(1.0f) + ((((i14 - ri0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - ri0Var.getPaddingTop());
            int iDp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.f24636w) : (i15 - ri0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.f24636w);
            ri0Var.layout(iDp8, iDp7, ri0Var.getMeasuredWidth() + iDp8, ri0Var.getMeasuredHeight() + iDp7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int iDp9 = AndroidUtilities.dp(1.0f) + ((i14 - imageView.getMeasuredHeight()) / 2);
            int iDp10 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(iDp10, iDp9, imageView.getMeasuredWidth() + iDp10, imageView.getMeasuredHeight() + iDp9);
        }
        Switch r10 = this.f24632f;
        if (r10 == null || r10.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i14 - this.f24632f.getMeasuredHeight()) / 2;
        int iDp11 = LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : (i15 - this.f24632f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
        Switch r11 = this.f24632f;
        r11.layout(iDp11, measuredHeight, r11.getMeasuredWidth() + iDp11, this.f24632f.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(this.v);
        int i12 = this.H;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        if (i12 != 0 && i12 != size && (charSequence = this.I) != null) {
            j6Var.c(TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.H = size;
        boolean z10 = this.f24638y;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24629b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.f24628a;
        if (z10) {
            h5Var3.measure(rl.d(this.f24633n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(rl.d(this.f24633n + 71, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            j6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f24633n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f24633n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.f24633n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.f24633n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int iMax = Math.max(j6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.f24633n + 71)) - iMax), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.f24633n + 71)) - iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        ri0 ri0Var = this.f24631e;
        if (ri0Var.getVisibility() == 0) {
            ri0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, iDp + (this.f24634r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence charSequenceEllipsize;
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        if (str2 == null) {
            charSequenceEllipsize = "";
        } else {
            this.I = str2;
            charSequenceEllipsize = TextUtils.ellipsize(str2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(charSequenceEllipsize, z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.f24634r = z11;
        setWillNotDraw(!z11);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.f24635s = 58;
        this.f24636w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(charSequence2, false, true);
        ri0 ri0Var = this.f24631e;
        ri0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof oi0) {
            ri0Var.setAnimation((oi0) drawable);
        } else {
            ri0Var.setImageDrawable(drawable);
        }
        ri0Var.setVisibility(0);
        j6Var.setVisibility(0);
        this.h.setVisibility(8);
        ri0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.f24634r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        ri0 ri0Var = this.f24631e;
        ri0Var.setVisibility(0);
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        if (charSequence2 != null) {
            int iMax = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((lh.w3.g(charSequence, h5Var.getTextPaint()) + AndroidUtilities.dp(this.f24635s)) + AndroidUtilities.dp(16.0f)));
            this.I = charSequence2;
            j6Var.c(TextUtils.ellipsize(charSequence2, j6Var.getPaint(), iMax, TextUtils.TruncateAt.END), z10, true);
        } else {
            j6Var.c("", z10, true);
        }
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ri0Var.setTranslationX(0.0f);
        ri0Var.setTranslationY(0.0f);
        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        ri0Var.setImageResource(i10);
        this.f24634r = z11;
        setWillNotDraw(!z11);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f24632f.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i10) {
        this.f24636w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.f24634r != z10) {
            this.f24634r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.f24635s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.f24638y != z10) {
            this.f24638y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24629b;
        if (zIsEmpty) {
            h5Var.setVisibility(8);
        } else {
            h5Var.setVisibility(0);
            h5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.f24628a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
            }
        }
        this.G.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.f24636w = 16;
        this.f24635s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        j6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        ri0 ri0Var = this.f24631e;
        ri0Var.setVisibility(8);
        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f24634r = z10;
        setWillNotDraw(!z10);
        Switch r10 = this.f24632f;
        if (r10 != null) {
            r10.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence charSequenceEllipsize;
        org.telegram.ui.Components.j6 j6Var = this.f24630c;
        if (charSequence == null) {
            charSequenceEllipsize = "";
        } else {
            this.I = charSequence;
            charSequenceEllipsize = TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(charSequenceEllipsize, z10, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24628a;
        int iIntValue = h5Var.getTag() instanceof Integer ? ((Integer) h5Var.getTag()).intValue() : org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(iIntValue, c6Var);
        if (iIntValue != org.telegram.ui.ActionBar.g6.f23161j5 && iIntValue != org.telegram.ui.ActionBar.g6.G6) {
            iV0 = c(iV0);
        }
        h5Var.setTextColor(iV0);
        ri0 ri0Var = this.f24631e;
        if (ri0Var.getTag() instanceof Integer) {
            int iIntValue2 = ((Integer) ri0Var.getTag()).intValue();
            int iV1 = org.telegram.ui.ActionBar.g6.v0(iIntValue2, c6Var);
            if (iIntValue2 != org.telegram.ui.ActionBar.g6.J5 && iIntValue2 != org.telegram.ui.ActionBar.g6.f23215m6) {
                iV1 = c(iV1);
            }
            ri0Var.setColorFilter(new PorterDuffColorFilter(iV1, PorterDuff.Mode.SRC_IN));
        }
        this.f24629b.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var)));
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        this.f24630c.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
    }

    public l8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(23, context, c6Var, false, false);
    }

    public l8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public l8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24635s = 58;
        this.v = 50;
        this.f24636w = 16;
        this.A = c6Var;
        this.f24633n = i10;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24628a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23161j5 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, h7.z5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24629b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23268p5 : org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, h7.z5.c(-1.0f, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f24630c = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23233n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        j6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        j6Var.setImportantForAccessibility(2);
        j6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(j6Var);
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var3;
        Boolean bool = Boolean.FALSE;
        if (!h5Var3.L) {
            h5Var3.f23476j0 = true;
            h5Var3.f23478l0 = bool;
            h5Var3.m();
            h5Var3.b();
        }
        h5Var3.m0 = 18;
        h5Var3.m();
        h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.f23233n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        ri0 ri0Var = new ri0(context);
        this.f24631e = ri0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ri0Var.setScaleType(scaleType);
        ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.J5 : org.telegram.ui.ActionBar.g6.f23215m6, c6Var), PorterDuff.Mode.SRC_IN));
        addView(ri0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r10 = new Switch(context, c6Var);
            this.f24632f = r10;
            int i11 = org.telegram.ui.ActionBar.g6.M6;
            int i12 = org.telegram.ui.ActionBar.g6.N6;
            int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
            r10.d(i11, i12, i13, i13);
            addView(this.f24632f, h7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new ah.f(imageReceiver, 1));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.G.g(new lh.v3(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
