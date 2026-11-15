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
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.pz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i9;
public class z0 extends FrameLayout implements z5 {
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
    public final e6 P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final org.telegram.ui.Components.o5 f29899a;
    public TextView f29900b;
    public final fh0 f29901c;
    public boolean d;
    public fp f29902e;
    public ImageView f29903f;
    public i9 h;
    public int f29904n;
    public int f29905r;
    public PorterDuff.Mode f29906s;
    public int f29907w;
    public int f29908x;
    public int f29909y;

    public z0(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i7) {
        int i10;
        int L;
        int i11;
        int L2;
        if (i7 > 0) {
            fp fpVar = new fp(26, getContext(), this.P);
            this.f29902e = fpVar;
            fpVar.setDrawUnchecked(false);
            this.f29902e.b(-1, -1, j6.E8);
            this.f29902e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.o5 o5Var = this.f29899a;
            int i12 = 3;
            if (i7 == 1) {
                boolean z10 = hd.f24101a0;
                this.d = !z10;
                fp fpVar2 = this.f29902e;
                if (z10) {
                    i12 = 5;
                }
                addView(fpVar2, ja.e(26, -1, i12 | 16));
                if (!hd.f24101a0) {
                    i11 = org.telegram.messenger.g0.L(34.0f);
                } else {
                    i11 = 0;
                }
                if (!hd.f24101a0) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.g0.L(34.0f);
                }
                o5Var.setPadding(i11, 0, L2, 0);
                return;
            }
            fp fpVar3 = this.f29902e;
            if (!hd.f24101a0) {
                i12 = 5;
            }
            addView(fpVar3, ja.e(26, -1, i12 | 16));
            if (hd.f24101a0) {
                i10 = org.telegram.messenger.g0.L(34.0f);
            } else {
                i10 = 0;
            }
            if (hd.f24101a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(34.0f);
            }
            o5Var.setPadding(i10, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f29908x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.f29909y;
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
        e6 e6Var = this.P;
        d(j6.w0(i7, e6Var), j6.w0(i10, e6Var));
        this.f29908x = i7;
        this.f29909y = i10;
        this.F = this.f29904n;
        this.G = this.f29905r;
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
                z0 z0Var = z0.this;
                z0Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i12 = i7;
                int i13 = i11;
                z0Var.setTextColor(i0.a.f(floatValue, i12, i13));
                z0Var.setIconColor(i0.a.f(floatValue, i10, i13));
            }
        });
        this.S.addListener(new y0(this, z10, i7, i11, i10));
        this.S.setInterpolator(er.h);
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
        this.S.addListener(new bi.v4(19, this, z10));
        this.S.setInterpolator(er.h);
        this.S.start();
    }

    public final void g(int i7, PorterDuff.Mode mode) {
        if (this.f29905r == i7 && this.f29906s == mode) {
            return;
        }
        this.f29905r = i7;
        this.f29906s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.J = porterDuffColorFilter;
        this.f29901c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public fp getCheckView() {
        return this.f29902e;
    }

    public int getIconResId() {
        return this.U;
    }

    public ImageView getImageView() {
        return this.f29901c;
    }

    public ImageView getRightIcon() {
        return this.f29903f;
    }

    public TextView getSubtextView() {
        return this.f29900b;
    }

    public org.telegram.ui.Components.o5 getTextView() {
        return this.f29899a;
    }

    public final void h(float f10, int i7) {
        this.V = f10;
        setSelectorColor(j6.r1(f10, j6.w0(i7, this.P)));
        this.E = i7;
        this.H = this.f29907w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        float f10;
        int L;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.f29899a;
        o5Var.setText(charSequence);
        fh0 fh0Var = this.f29901c;
        if (i7 == 0 && drawable == null && this.f29902e == null) {
            this.U = 0;
            fh0Var.setVisibility(4);
            o5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            fh0Var.setImageDrawable(drawable);
        } else {
            this.U = i7;
            fh0Var.setImageResource(i7);
        }
        fh0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f29902e != null) {
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
        } else if (this.f29902e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        o5Var.setPadding(L, 0, i10, 0);
    }

    public final void k(CharSequence charSequence, gc gcVar, String str, pz pzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int L;
        int i7;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.f29899a;
        o5Var.setText(charSequence);
        if (!this.d || this.f29902e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.f29902e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        o5Var.setPadding(L, 0, i7, 0);
        if (this.h == null) {
            i9 i9Var = new i9(getContext());
            this.h = i9Var;
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            i9 i9Var2 = this.h;
            if (hd.f24101a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(i9Var2, ja.e(28, 28, i10 | 16));
        }
        this.f29901c.setVisibility(4);
        this.h.j(gcVar, str, pzVar, tL_attachMenuBot);
    }

    public void l() {
        int i7;
        int i10 = this.f29907w;
        int i11 = 0;
        if (this.M) {
            i7 = this.L;
        } else {
            i7 = 0;
        }
        if (this.N) {
            i11 = this.L;
        }
        org.telegram.ui.Cells.y a02 = j6.a0(i10, i7, i11);
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
        fp fpVar = this.f29902e;
        if (fpVar != null && fpVar.f34663a.f32441q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f29902e.f34663a.f32441q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O), 1073741824));
        if (this.R && this.f29899a.getLayout().getLineCount() > 1) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i7) {
        this.U = 0;
        this.f29901c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.f29902e.b(-1, -1, i7);
    }

    public void setChecked(boolean z10) {
        fp fpVar = this.f29902e;
        if (fpVar == null) {
            return;
        }
        fpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i7) {
        this.f29899a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.U = i7;
        this.f29901c.setImageResource(i7);
    }

    public void setIconColor(int i7) {
        g(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i7) {
        i9 i9Var = this.h;
        if (i9Var != null) {
            i9Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i7) {
        this.O = i7;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.o5 o5Var = this.f29899a;
        o5Var.setLines(2);
        if (z10) {
            o5Var.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        o5Var.setSingleLine(false);
        o5Var.setGravity(16);
    }

    public void setRightIcon(int i7) {
        int i10;
        float f10;
        int i11;
        int i12;
        if (this.f29903f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f29903f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f29903f.setColorFilter(this.f29905r, PorterDuff.Mode.MULTIPLY);
            if (hd.f24101a0) {
                this.f29903f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f29903f;
            if (hd.f24101a0) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, ja.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.o5 o5Var = this.f29899a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
        if (hd.f24101a0) {
            if (this.f29903f != null) {
                i11 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f29903f != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        o5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (hd.f24101a0) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!hd.f24101a0) {
            f11 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (i7 == 0) {
            this.f29903f.setVisibility(8);
            return;
        }
        this.f29903f.setVisibility(0);
        this.f29903f.setImageResource(i7);
    }

    public void setSelectorColor(int i7) {
        if (this.f29907w != i7) {
            this.f29907w = i7;
            if (this.K != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.K;
                if (background == yVar) {
                    j6.H1(yVar, i7, true);
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
        if (this.f29900b == null) {
            TextView textView = new TextView(getContext());
            this.f29900b = textView;
            textView.setLines(1);
            this.f29900b.setSingleLine(true);
            int i12 = 3;
            this.f29900b.setGravity(3);
            this.f29900b.setEllipsize(TextUtils.TruncateAt.END);
            q6.U(this.f29900b, j6.Ri, this.P);
            this.f29900b.setVisibility(8);
            this.f29900b.setTextSize(1, 13.0f);
            TextView textView2 = this.f29900b;
            if (hd.f24101a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(43.0f);
            }
            if (hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(43.0f);
            } else {
                i7 = 0;
            }
            textView2.setPadding(L, 0, i7, 0);
            TextView textView3 = this.f29900b;
            if (hd.f24101a0) {
                i12 = 5;
            }
            addView(textView3, ja.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f29900b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f29900b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.o5 o5Var = this.f29899a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.bottomMargin = i11;
            o5Var.setLayoutParams(layoutParams);
        }
        this.f29900b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.f29900b;
        if (textView != null) {
            q6.q(textView);
            this.f29900b.setTextColor(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f29899a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        if (this.f29904n != i7) {
            this.f29904n = i7;
            this.f29899a.setTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        fh0 fh0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.o5 o5Var;
        try {
            int i7 = this.f29908x;
            e6 e6Var = this.P;
            if (i7 >= 0 && this.f29904n == this.F && (o5Var = this.f29899a) != null && o5Var.getCurrentTextColor() == this.f29904n) {
                int w02 = j6.w0(this.f29908x, e6Var);
                setTextColor(w02);
                this.F = w02;
            }
            if (this.f29909y >= 0 && this.f29905r == this.G && (fh0Var = this.f29901c) != null && fh0Var.getColorFilter() == this.J) {
                int w03 = j6.w0(this.f29909y, e6Var);
                if (w03 != this.f29905r) {
                    this.f29905r = w03;
                    if (!this.I || (mode = this.f29906s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.J = porterDuffColorFilter;
                    fh0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f29903f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.G = w03;
            }
            int i10 = this.E;
            if (i10 >= 0 && this.f29907w == this.H) {
                int r12 = j6.r1(this.V, j6.w0(i10, e6Var));
                if (r12 != this.f29907w) {
                    this.f29907w = r12;
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

    public z0(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(0, context, e6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.f29901c.setImageDrawable(drawable);
    }

    public z0(int i7, Context context, e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = j6.E8;
        this.f29908x = i10;
        int i11 = j6.F8;
        this.f29909y = i11;
        int i12 = j6.I5;
        this.E = i12;
        this.L = 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = e6Var;
        this.M = z10;
        this.N = z11;
        this.f29904n = j6.w0(i10, e6Var);
        this.f29905r = j6.w0(i11, e6Var);
        this.f29906s = PorterDuff.Mode.MULTIPLY;
        int w02 = j6.w0(i12, e6Var);
        this.f29907w = w02;
        this.F = this.f29904n;
        this.G = this.f29905r;
        this.H = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f29901c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f29905r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, ja.e(-2, 40, (hd.f24101a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f29899a = o5Var;
        o5Var.setLines(1);
        o5Var.setSingleLine(true);
        o5Var.setGravity(3);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        o5Var.setTextColor(this.f29904n);
        o5Var.setTextSize(1, 16.0f);
        addView(o5Var, ja.e(-2, -2, (hd.f24101a0 ? 5 : 3) | 16));
        this.d = hd.f24101a0;
        a(i7);
    }
}
