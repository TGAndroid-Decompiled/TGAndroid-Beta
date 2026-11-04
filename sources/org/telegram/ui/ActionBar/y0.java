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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.jz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class y0 extends FrameLayout implements z5 {
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
    public final org.telegram.ui.Components.o5 f28812a;
    public TextView f28813b;
    public final fh0 f28814c;
    public boolean d;
    public wo f28815e;
    public ImageView f28816f;
    public k9 h;
    public int f28817n;
    public int f28818r;
    public PorterDuff.Mode f28819s;
    public int f28820w;
    public int f28821x;
    public int f28822y;

    public y0(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i3) {
        int i10;
        int L;
        int i11;
        int L2;
        if (i3 > 0) {
            wo woVar = new wo(26, getContext(), this.P);
            this.f28815e = woVar;
            woVar.setDrawUnchecked(false);
            this.f28815e.b(-1, -1, k6.E8);
            this.f28815e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.o5 o5Var = this.f28812a;
            int i12 = 3;
            if (i3 == 1) {
                boolean z10 = bd.f21784a0;
                this.d = !z10;
                wo woVar2 = this.f28815e;
                if (z10) {
                    i12 = 5;
                }
                addView(woVar2, mf.e(26, -1, i12 | 16));
                if (!bd.f21784a0) {
                    i11 = org.telegram.messenger.g0.L(34.0f);
                } else {
                    i11 = 0;
                }
                if (!bd.f21784a0) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.g0.L(34.0f);
                }
                o5Var.setPadding(i11, 0, L2, 0);
                return;
            }
            wo woVar3 = this.f28815e;
            if (!bd.f21784a0) {
                i12 = 5;
            }
            addView(woVar3, mf.e(26, -1, i12 | 16));
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(34.0f);
            } else {
                i10 = 0;
            }
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(34.0f);
            }
            o5Var.setPadding(i10, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i3 = this.f28821x;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
        }
        int i10 = this.f28822y;
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

    public final void c(int i3, int i10) {
        e6 e6Var = this.P;
        d(k6.w0(i3, e6Var), k6.w0(i10, e6Var));
        this.f28821x = i3;
        this.f28822y = i10;
        this.F = this.f28817n;
        this.G = this.f28818r;
    }

    public final void d(int i3, int i10) {
        setTextColor(i3);
        setIconColor(i10);
    }

    public final void e(final int i3, final int i10, final int i11, boolean z10) {
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
                int i12 = i3;
                int i13 = i11;
                y0Var.setTextColor(i0.a.f(floatValue, i12, i13));
                y0Var.setIconColor(i0.a.f(floatValue, i10, i13));
            }
        });
        this.S.addListener(new x0(this, z10, i3, i11, i10));
        this.S.setInterpolator(xq.h);
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
        ofFloat.addUpdateListener(new gi.j3(this, 12));
        this.S.addListener(new dh.x(18, this, z10));
        this.S.setInterpolator(xq.h);
        this.S.start();
    }

    public final void g(int i3, PorterDuff.Mode mode) {
        if (this.f28818r == i3 && this.f28819s == mode) {
            return;
        }
        this.f28818r = i3;
        this.f28819s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        this.J = porterDuffColorFilter;
        this.f28814c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public wo getCheckView() {
        return this.f28815e;
    }

    public int getIconResId() {
        return this.U;
    }

    public ImageView getImageView() {
        return this.f28814c;
    }

    public ImageView getRightIcon() {
        return this.f28816f;
    }

    public org.telegram.ui.Components.o5 getTextView() {
        return this.f28812a;
    }

    public final void h(float f10, int i3) {
        this.V = f10;
        setSelectorColor(k6.r1(f10, k6.w0(i3, this.P)));
        this.E = i3;
        this.H = this.f28820w;
    }

    public final void i(int i3, CharSequence charSequence) {
        j(charSequence, i3, null);
    }

    public final void j(CharSequence charSequence, int i3, Drawable drawable) {
        float f10;
        int L;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.f28812a;
        o5Var.setText(charSequence);
        fh0 fh0Var = this.f28814c;
        if (i3 == 0 && drawable == null && this.f28815e == null) {
            this.U = 0;
            fh0Var.setVisibility(4);
            o5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            fh0Var.setImageDrawable(drawable);
        } else {
            this.U = i3;
            fh0Var.setImageResource(i3);
        }
        fh0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f28815e != null) {
                L = org.telegram.messenger.g0.L(43.0f);
            } else {
                L = 0;
            }
        } else {
            if (i3 == 0 && drawable == null) {
                f10 = 0.0f;
            } else {
                f10 = 43.0f;
            }
            L = org.telegram.messenger.g0.L(f10);
        }
        if (this.d) {
            if (i3 != 0 || drawable != null) {
                f11 = 43.0f;
            }
            i10 = org.telegram.messenger.g0.L(f11);
        } else if (this.f28815e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        o5Var.setPadding(L, 0, i10, 0);
    }

    public final void k(CharSequence charSequence, ac acVar, String str, jz jzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int L;
        int i3;
        int i10;
        org.telegram.ui.Components.o5 o5Var = this.f28812a;
        o5Var.setText(charSequence);
        if (!this.d || this.f28815e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.f28815e != null) {
            i3 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i3 = 0;
        }
        o5Var.setPadding(L, 0, i3, 0);
        if (this.h == null) {
            k9 k9Var = new k9(getContext());
            this.h = k9Var;
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            k9 k9Var2 = this.h;
            if (bd.f21784a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(k9Var2, mf.e(28, 28, i10 | 16));
        }
        this.f28814c.setVisibility(4);
        this.h.j(acVar, str, jzVar, tL_attachMenuBot);
    }

    public void l() {
        int i3;
        int i10 = this.f28820w;
        int i11 = 0;
        if (this.M) {
            i3 = this.L;
        } else {
            i3 = 0;
        }
        if (this.N) {
            i11 = this.L;
        }
        org.telegram.ui.Cells.y a02 = k6.a0(i10, i3, i11);
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
        wo woVar = this.f28815e;
        if (woVar != null && woVar.f40035a.f31334q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f28815e.f40035a.f31334q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O), 1073741824));
        if (this.R && this.f28812a.getLayout().getLineCount() > 1) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i3) {
        this.U = 0;
        this.f28814c.f(i3, 24, 24, null);
    }

    public void setCheckColor(int i3) {
        this.f28815e.b(-1, -1, i3);
    }

    public void setChecked(boolean z10) {
        wo woVar = this.f28815e;
        if (woVar == null) {
            return;
        }
        woVar.a(z10, true);
    }

    public void setEmojiCacheType(int i3) {
        this.f28812a.setCacheType(i3);
    }

    public void setIcon(int i3) {
        this.U = i3;
        this.f28814c.setImageResource(i3);
    }

    public void setIconColor(int i3) {
        g(i3, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i3) {
        k9 k9Var = this.h;
        if (k9Var != null) {
            k9Var.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i3) {
        this.O = i3;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.o5 o5Var = this.f28812a;
        o5Var.setLines(2);
        if (z10) {
            o5Var.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        o5Var.setSingleLine(false);
        o5Var.setGravity(16);
    }

    public void setRightIcon(int i3) {
        int i10;
        float f10;
        int i11;
        int i12;
        if (this.f28816f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f28816f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f28816f.setColorFilter(this.f28818r, PorterDuff.Mode.MULTIPLY);
            if (bd.f21784a0) {
                this.f28816f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f28816f;
            if (bd.f21784a0) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, mf.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.o5 o5Var = this.f28812a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
        if (bd.f21784a0) {
            if (this.f28816f != null) {
                i11 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f28816f != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        o5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (bd.f21784a0) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!bd.f21784a0) {
            f11 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (i3 == 0) {
            this.f28816f.setVisibility(8);
            return;
        }
        this.f28816f.setVisibility(0);
        this.f28816f.setImageResource(i3);
    }

    public void setSelectorColor(int i3) {
        if (this.f28820w != i3) {
            this.f28820w = i3;
            if (this.K != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.K;
                if (background == yVar) {
                    k6.H1(yVar, i3, true);
                    return;
                }
            }
            l();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int L;
        int i3;
        int i10 = 8;
        boolean z10 = true;
        int i11 = 0;
        if (this.f28813b == null) {
            TextView textView = new TextView(getContext());
            this.f28813b = textView;
            textView.setLines(1);
            this.f28813b.setSingleLine(true);
            int i12 = 3;
            this.f28813b.setGravity(3);
            this.f28813b.setEllipsize(TextUtils.TruncateAt.END);
            r6.V(this.f28813b, k6.Oi, this.P);
            this.f28813b.setVisibility(8);
            this.f28813b.setTextSize(1, 13.0f);
            TextView textView2 = this.f28813b;
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(43.0f);
            }
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(43.0f);
            } else {
                i3 = 0;
            }
            textView2.setPadding(L, 0, i3, 0);
            TextView textView3 = this.f28813b;
            if (bd.f21784a0) {
                i12 = 5;
            }
            addView(textView3, mf.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f28813b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f28813b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.o5 o5Var = this.f28812a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.bottomMargin = i11;
            o5Var.setLayoutParams(layoutParams);
        }
        this.f28813b.setText(charSequence);
    }

    public void setSubtextColor(int i3) {
        TextView textView = this.f28813b;
        if (textView != null) {
            r6.r(textView);
            this.f28813b.setTextColor(i3);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28812a.setText(charSequence);
    }

    public void setTextColor(int i3) {
        if (this.f28817n != i3) {
            this.f28817n = i3;
            this.f28812a.setTextColor(i3);
        }
    }

    @Override
    public final void updateColors() {
        fh0 fh0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.o5 o5Var;
        try {
            int i3 = this.f28821x;
            e6 e6Var = this.P;
            if (i3 >= 0 && this.f28817n == this.F && (o5Var = this.f28812a) != null && o5Var.getCurrentTextColor() == this.f28817n) {
                int w02 = k6.w0(this.f28821x, e6Var);
                setTextColor(w02);
                this.F = w02;
            }
            if (this.f28822y >= 0 && this.f28818r == this.G && (fh0Var = this.f28814c) != null && fh0Var.getColorFilter() == this.J) {
                int w03 = k6.w0(this.f28822y, e6Var);
                if (w03 != this.f28818r) {
                    this.f28818r = w03;
                    if (!this.I || (mode = this.f28819s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.J = porterDuffColorFilter;
                    fh0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f28816f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.G = w03;
            }
            int i10 = this.E;
            if (i10 >= 0 && this.f28820w == this.H) {
                int r12 = k6.r1(this.V, k6.w0(i10, e6Var));
                if (r12 != this.f28820w) {
                    this.f28820w = r12;
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

    public y0(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(0, context, e6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.f28814c.setImageDrawable(drawable);
    }

    public y0(int i3, Context context, e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = k6.E8;
        this.f28821x = i10;
        int i11 = k6.F8;
        this.f28822y = i11;
        int i12 = k6.I5;
        this.E = i12;
        this.L = 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = e6Var;
        this.M = z10;
        this.N = z11;
        this.f28817n = k6.w0(i10, e6Var);
        this.f28818r = k6.w0(i11, e6Var);
        this.f28819s = PorterDuff.Mode.MULTIPLY;
        int w02 = k6.w0(i12, e6Var);
        this.f28820w = w02;
        this.F = this.f28817n;
        this.G = this.f28818r;
        this.H = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f28814c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f28818r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, mf.e(-2, 40, (bd.f21784a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.f28812a = o5Var;
        o5Var.setLines(1);
        o5Var.setSingleLine(true);
        o5Var.setGravity(3);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        o5Var.setTextColor(this.f28817n);
        o5Var.setTextSize(1, 16.0f);
        addView(o5Var, mf.e(-2, -2, (bd.f21784a0 ? 5 : 3) | 16));
        this.d = bd.f21784a0;
        a(i3);
    }
}
