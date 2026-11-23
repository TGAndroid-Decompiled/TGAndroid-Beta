package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.g7;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.mz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.rh0;
public class y0 extends FrameLayout implements b6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public PorterDuffColorFilter J;
    public org.telegram.ui.Cells.y K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public final h6 P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final org.telegram.ui.Components.x5 f30287a;
    public TextView f30288b;
    public final rh0 f30289c;
    public boolean d;
    public op f30290e;
    public ImageView f30291f;
    public q9 h;
    public int f30292n;
    public int f30293r;
    public PorterDuff.Mode f30294s;
    public int f30295w;
    public int f30296x;
    public int f30297y;

    public y0(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i7) {
        int i10;
        int L;
        int i11;
        int L2;
        if (i7 > 0) {
            op opVar = new op(26, getContext(), this.P);
            this.f30290e = opVar;
            opVar.setDrawUnchecked(false);
            this.f30290e.b(-1, -1, m6.E8);
            this.f30290e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.x5 x5Var = this.f30287a;
            int i12 = 3;
            if (i7 == 1) {
                boolean z10 = hd.f24444a0;
                this.d = !z10;
                op opVar2 = this.f30290e;
                if (z10) {
                    i12 = 5;
                }
                addView(opVar2, ma.e(26, -1, i12 | 16));
                if (!hd.f24444a0) {
                    i11 = org.telegram.messenger.g0.L(34.0f);
                } else {
                    i11 = 0;
                }
                if (!hd.f24444a0) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.g0.L(34.0f);
                }
                x5Var.setPadding(i11, 0, L2, 0);
                return;
            }
            op opVar3 = this.f30290e;
            if (!hd.f24444a0) {
                i12 = 5;
            }
            addView(opVar3, ma.e(26, -1, i12 | 16));
            if (hd.f24444a0) {
                i10 = org.telegram.messenger.g0.L(34.0f);
            } else {
                i10 = 0;
            }
            if (hd.f24444a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(34.0f);
            }
            x5Var.setPadding(i10, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f30296x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.f30297y;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.E;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
    }

    public final void b() {
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i7, int i10) {
        h6 h6Var = this.P;
        d(m6.w0(i7, h6Var), m6.w0(i10, h6Var));
        this.f30296x = i7;
        this.f30297y = i10;
        this.F = this.f30292n;
        this.G = this.f30293r;
    }

    public final void d(int i7, int i10) {
        setTextColor(i7);
        setIconColor(i10);
    }

    public final void e(final int i7, final int i10, final int i11, boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.T) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.S = ofFloat;
        this.T = z10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                y0 y0Var = y0.this;
                y0Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i12 = i7;
                int i13 = i11;
                y0Var.setTextColor(i0.a.f(floatValue, i12, i13));
                y0Var.setIconColor(i0.a.f(floatValue, i10, i13));
            }
        });
        this.S.addListener(new x0(this, z10, i7, i11, i10));
        this.S.setInterpolator(nr.h);
        this.S.start();
    }

    public final void f(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.T) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.S = ofFloat;
        this.T = z10;
        ofFloat.addUpdateListener(new hi.j3(this, 11));
        this.S.addListener(new g7(19, this, z10));
        this.S.setInterpolator(nr.h);
        this.S.start();
    }

    public final void g(int i7, PorterDuff.Mode mode) {
        if (this.f30293r == i7 && this.f30294s == mode) {
            return;
        }
        this.f30293r = i7;
        this.f30294s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.J = porterDuffColorFilter;
        this.f30289c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public op getCheckView() {
        return this.f30290e;
    }

    public int getIconResId() {
        return this.U;
    }

    public ImageView getImageView() {
        return this.f30289c;
    }

    public ImageView getRightIcon() {
        return this.f30291f;
    }

    public TextView getSubtextView() {
        return this.f30288b;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.f30287a;
    }

    public final void h(float f10, int i7) {
        this.V = f10;
        setSelectorColor(m6.r1(f10, m6.w0(i7, this.P)));
        this.E = i7;
        this.H = this.f30295w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        float f10;
        int L;
        int i10;
        org.telegram.ui.Components.x5 x5Var = this.f30287a;
        x5Var.setText(charSequence);
        rh0 rh0Var = this.f30289c;
        if (i7 == 0 && drawable == null && this.f30290e == null) {
            this.U = 0;
            rh0Var.setVisibility(4);
            x5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            rh0Var.setImageDrawable(drawable);
        } else {
            this.U = i7;
            rh0Var.setImageResource(i7);
        }
        rh0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f30290e != null) {
                L = org.telegram.messenger.g0.L(43.0f);
            } else {
                L = 0;
            }
        } else {
            if (i7 == 0 && drawable == null) {
                f10 = 0.0f;
            } else {
                f10 = 43.0f;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        if (this.d) {
            if (i7 != 0 || drawable != null) {
                f11 = 43.0f;
            }
            i10 = org.telegram.messenger.g0.L(f11);
        } else if (this.f30290e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        x5Var.setPadding(L, 0, i10, 0);
    }

    public final void k(CharSequence charSequence, gc gcVar, String str, mz mzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int L;
        int i7;
        int i10;
        org.telegram.ui.Components.x5 x5Var = this.f30287a;
        x5Var.setText(charSequence);
        if (!this.d || this.f30290e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.f30290e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        x5Var.setPadding(L, 0, i7, 0);
        if (this.h == null) {
            q9 q9Var = new q9(getContext());
            this.h = q9Var;
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            q9 q9Var2 = this.h;
            if (hd.f24444a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(q9Var2, ma.e(28, 28, i10 | 16));
        }
        this.f30289c.setVisibility(4);
        this.h.j(gcVar, str, mzVar, tL_attachMenuBot);
    }

    public void l() {
        int i7;
        int i10 = this.f30295w;
        int i11 = 0;
        if (this.M) {
            i7 = this.L;
        } else {
            i7 = 0;
        }
        if (this.N) {
            i11 = this.L;
        }
        org.telegram.ui.Cells.y a02 = m6.a0(i10, i7, i11);
        this.K = a02;
        setBackground(a02);
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M == z10 && this.N == z11) {
            return;
        }
        this.M = z10;
        this.N = z11;
        l();
    }

    public final void n(boolean z10, boolean z11) {
        if (this.M == z10 && this.N == z11 && this.L == 12) {
            return;
        }
        this.M = z10;
        this.N = z11;
        this.L = 12;
        l();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        op opVar = this.f30290e;
        if (opVar != null && opVar.f38320a.f32874q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f30290e.f38320a.f32874q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O), 1073741824));
        if (this.R && this.f30287a.getLayout().getLineCount() > 1) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i7) {
        this.U = 0;
        this.f30289c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.f30290e.b(-1, -1, i7);
    }

    public void setChecked(boolean z10) {
        op opVar = this.f30290e;
        if (opVar == null) {
            return;
        }
        opVar.a(z10, true);
    }

    public void setEmojiCacheType(int i7) {
        this.f30287a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.U = i7;
        this.f30289c.setImageResource(i7);
    }

    public void setIconColor(int i7) {
        g(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i7) {
        q9 q9Var = this.h;
        if (q9Var != null) {
            q9Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i7) {
        this.O = i7;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.x5 x5Var = this.f30287a;
        x5Var.setLines(2);
        if (z10) {
            x5Var.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        x5Var.setSingleLine(false);
        x5Var.setGravity(16);
    }

    public void setRightIcon(int i7) {
        int i10;
        float f10;
        int i11;
        int i12;
        if (this.f30291f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f30291f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f30291f.setColorFilter(this.f30293r, PorterDuff.Mode.MULTIPLY);
            if (hd.f24444a0) {
                this.f30291f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f30291f;
            if (hd.f24444a0) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, ma.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.x5 x5Var = this.f30287a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (hd.f24444a0) {
            if (this.f30291f != null) {
                i11 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f30291f != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        x5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (hd.f24444a0) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!hd.f24444a0) {
            f11 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (i7 == 0) {
            this.f30291f.setVisibility(8);
            return;
        }
        this.f30291f.setVisibility(0);
        this.f30291f.setImageResource(i7);
    }

    public void setSelectorColor(int i7) {
        if (this.f30295w != i7) {
            this.f30295w = i7;
            if (this.K != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.K;
                if (background == yVar) {
                    m6.H1(yVar, i7, true);
                    return;
                }
            }
            l();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int L;
        int i7;
        int i10 = 8;
        boolean z10 = true;
        int i11 = 0;
        if (this.f30288b == null) {
            TextView textView = new TextView(getContext());
            this.f30288b = textView;
            textView.setLines(1);
            this.f30288b.setSingleLine(true);
            int i12 = 3;
            this.f30288b.setGravity(3);
            this.f30288b.setEllipsize(TextUtils.TruncateAt.END);
            t6.U(this.f30288b, m6.Ri, this.P);
            this.f30288b.setVisibility(8);
            this.f30288b.setTextSize(1, 13.0f);
            TextView textView2 = this.f30288b;
            if (hd.f24444a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(43.0f);
            }
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(43.0f);
            } else {
                i7 = 0;
            }
            textView2.setPadding(L, 0, i7, 0);
            TextView textView3 = this.f30288b;
            if (hd.f24444a0) {
                i12 = 5;
            }
            addView(textView3, ma.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f30288b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f30288b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.x5 x5Var = this.f30287a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.bottomMargin = i11;
            x5Var.setLayoutParams(layoutParams);
        }
        this.f30288b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.f30288b;
        if (textView != null) {
            t6.q(textView);
            this.f30288b.setTextColor(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f30287a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        if (this.f30292n != i7) {
            this.f30292n = i7;
            this.f30287a.setTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        rh0 rh0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.x5 x5Var;
        try {
            int i7 = this.f30296x;
            h6 h6Var = this.P;
            if (i7 >= 0 && this.f30292n == this.F && (x5Var = this.f30287a) != null && x5Var.getCurrentTextColor() == this.f30292n) {
                int w02 = m6.w0(this.f30296x, h6Var);
                setTextColor(w02);
                this.F = w02;
            }
            if (this.f30297y >= 0 && this.f30293r == this.G && (rh0Var = this.f30289c) != null && rh0Var.getColorFilter() == this.J) {
                int w03 = m6.w0(this.f30297y, h6Var);
                if (w03 != this.f30293r) {
                    this.f30293r = w03;
                    if (!this.I || (mode = this.f30294s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.J = porterDuffColorFilter;
                    rh0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f30291f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.G = w03;
            }
            int i10 = this.E;
            if (i10 >= 0 && this.f30295w == this.H) {
                int r12 = m6.r1(this.V, m6.w0(i10, h6Var));
                if (r12 != this.f30295w) {
                    this.f30295w = r12;
                    Drawable background = getBackground();
                    if (background == this.K && (background instanceof RippleDrawable)) {
                        ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                    }
                }
                this.H = r12;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public y0(Context context, h6 h6Var, boolean z10, boolean z11) {
        this(0, context, h6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.f30289c.setImageDrawable(drawable);
    }

    public y0(int i7, Context context, h6 h6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = m6.E8;
        this.f30296x = i10;
        int i11 = m6.F8;
        this.f30297y = i11;
        int i12 = m6.I5;
        this.E = i12;
        this.L = 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = h6Var;
        this.M = z10;
        this.N = z11;
        this.f30292n = m6.w0(i10, h6Var);
        this.f30293r = m6.w0(i11, h6Var);
        this.f30294s = PorterDuff.Mode.MULTIPLY;
        int w02 = m6.w0(i12, h6Var);
        this.f30295w = w02;
        this.F = this.f30292n;
        this.G = this.f30293r;
        this.H = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f30289c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f30293r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, ma.e(-2, 40, (hd.f24444a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.f30287a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(3);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setTextColor(this.f30292n);
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, ma.e(-2, -2, (hd.f24444a0 ? 5 : 3) | 16));
        this.d = hd.f24444a0;
        a(i7);
    }
}
