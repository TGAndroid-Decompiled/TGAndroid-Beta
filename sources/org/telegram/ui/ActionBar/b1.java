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
import java.util.HashSet;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
public class b1 extends FrameLayout implements k6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public PorterDuffColorFilter I;
    public org.telegram.ui.Cells.y J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public final p6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.n5 f20164a;
    public TextView f20165b;
    public final ei0 f20166c;
    public boolean d;
    public ep e;
    public ImageView f20167f;
    public g9 h;
    public int f20168n;
    public int f20169r;
    public PorterDuff.Mode f20170s;
    public int f20171w;
    public int f20172x;
    public int f20173y;

    public b1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        int i11;
        int L;
        int i12;
        int L2;
        if (i10 > 0) {
            ep epVar = new ep(26, getContext(), this.O);
            this.e = epVar;
            epVar.setDrawUnchecked(false);
            this.e.b(-1, -1, t6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.n5 n5Var = this.f20164a;
            int i13 = 3;
            if (i10 == 1) {
                boolean z10 = cd.X;
                this.d = !z10;
                ep epVar2 = this.e;
                if (z10) {
                    i13 = 5;
                }
                addView(epVar2, w7.b6.e(26, -1, i13 | 16));
                if (!cd.X) {
                    i12 = org.telegram.messenger.i0.L(34.0f);
                } else {
                    i12 = 0;
                }
                if (!cd.X) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.i0.L(34.0f);
                }
                n5Var.setPadding(i12, 0, L2, 0);
                return;
            }
            ep epVar3 = this.e;
            if (!cd.X) {
                i13 = 5;
            }
            addView(epVar3, w7.b6.e(26, -1, i13 | 16));
            if (cd.X) {
                i11 = org.telegram.messenger.i0.L(34.0f);
            } else {
                i11 = 0;
            }
            if (cd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(34.0f);
            }
            n5Var.setPadding(i11, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.f20172x;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.f20173y;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
        int i12 = this.D;
        if (i12 >= 0) {
            hashSet.add(Integer.valueOf(i12));
        }
    }

    public final void b() {
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        p6 p6Var = this.O;
        d(t6.w0(i10, p6Var), t6.w0(i11, p6Var));
        this.f20172x = i10;
        this.f20173y = i11;
        this.E = this.f20168n;
        this.F = this.f20169r;
    }

    public final void d(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void e(final int i10, final int i11, final int i12, boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.S) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b1 b1Var = b1.this;
                b1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i13 = i10;
                int i14 = i12;
                b1Var.setTextColor(i0.b.f(floatValue, i13, i14));
                b1Var.setIconColor(i0.b.f(floatValue, i11, i14));
            }
        });
        this.R.addListener(new a1(this, z10, i10, i12, i11));
        this.R.setInterpolator(gr.h);
        this.R.start();
    }

    public final void f(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (this.S) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new bg.k(this, 15));
        this.R.addListener(new eg.m(4, this, z10));
        this.R.setInterpolator(gr.h);
        this.R.start();
    }

    public final void g(int i10, PorterDuff.Mode mode) {
        if (this.f20169r == i10 && this.f20170s == mode) {
            return;
        }
        this.f20169r = i10;
        this.f20170s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        this.I = porterDuffColorFilter;
        this.f20166c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public ep getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.T;
    }

    public ImageView getImageView() {
        return this.f20166c;
    }

    public ImageView getRightIcon() {
        return this.f20167f;
    }

    public org.telegram.ui.Components.n5 getTextView() {
        return this.f20164a;
    }

    public final void h(float f7, int i10) {
        this.U = f7;
        setSelectorColor(t6.r1(f7, t6.w0(i10, this.O)));
        this.D = i10;
        this.G = this.f20171w;
    }

    public final void i(int i10, CharSequence charSequence) {
        j(charSequence, i10, null);
    }

    public final void j(CharSequence charSequence, int i10, Drawable drawable) {
        float f7;
        int L;
        int i11;
        org.telegram.ui.Components.n5 n5Var = this.f20164a;
        n5Var.setText(charSequence);
        ei0 ei0Var = this.f20166c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.T = 0;
            ei0Var.setVisibility(4);
            n5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            ei0Var.setImageDrawable(drawable);
        } else {
            this.T = i10;
            ei0Var.setImageResource(i10);
        }
        ei0Var.setVisibility(0);
        float f10 = 0.0f;
        if (this.d) {
            if (this.e != null) {
                L = org.telegram.messenger.i0.L(43.0f);
            } else {
                L = 0;
            }
        } else {
            if (i10 == 0 && drawable == null) {
                f7 = 0.0f;
            } else {
                f7 = 43.0f;
            }
            L = org.telegram.messenger.i0.L(f7);
        }
        if (this.d) {
            if (i10 != 0 || drawable != null) {
                f10 = 43.0f;
            }
            i11 = org.telegram.messenger.i0.L(f10);
        } else if (this.e != null) {
            i11 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i11 = 0;
        }
        n5Var.setPadding(L, 0, i11, 0);
    }

    public final void k(CharSequence charSequence, ic icVar, String str, c00 c00Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int L;
        int i10;
        int i11;
        org.telegram.ui.Components.n5 n5Var = this.f20164a;
        n5Var.setText(charSequence);
        if (!this.d || this.e != null) {
            L = org.telegram.messenger.i0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.e != null) {
            i10 = org.telegram.messenger.i0.L(43.0f);
        } else {
            i10 = 0;
        }
        n5Var.setPadding(L, 0, i10, 0);
        if (this.h == null) {
            g9 g9Var = new g9(getContext());
            this.h = g9Var;
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(5.0f));
            g9 g9Var2 = this.h;
            if (cd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(g9Var2, w7.b6.e(28, 28, i11 | 16));
        }
        this.f20166c.setVisibility(4);
        this.h.j(icVar, str, c00Var, tL_attachMenuBot);
    }

    public void l() {
        int i10;
        int i11 = this.f20171w;
        int i12 = 0;
        if (this.L) {
            i10 = this.K;
        } else {
            i10 = 0;
        }
        if (this.M) {
            i12 = this.K;
        }
        org.telegram.ui.Cells.y a02 = t6.a0(i11, i10, i12);
        this.J = a02;
        setBackground(a02);
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11) {
            return;
        }
        this.L = z10;
        this.M = z11;
        l();
    }

    public final void n(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11 && this.K == 12) {
            return;
        }
        this.L = z10;
        this.M = z11;
        this.K = 12;
        l();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        ep epVar = this.e;
        if (epVar != null && epVar.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.e.f25836a.f23919q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.N), 1073741824));
        if (this.Q && this.f20164a.getLayout().getLineCount() > 1) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.N + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i10) {
        this.T = 0;
        this.f20166c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        ep epVar = this.e;
        if (epVar == null) {
            return;
        }
        epVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.f20164a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.T = i10;
        this.f20166c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        g(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        g9 g9Var = this.h;
        if (g9Var != null) {
            g9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.N = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.f20164a;
        n5Var.setLines(2);
        if (z10) {
            n5Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        n5Var.setSingleLine(false);
        n5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        int i11;
        float f7;
        int i12;
        int i13;
        if (this.f20167f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f20167f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f20167f.setColorFilter(this.f20169r, PorterDuff.Mode.MULTIPLY);
            if (cd.X) {
                this.f20167f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f20167f;
            if (cd.X) {
                i13 = 3;
            } else {
                i13 = 5;
            }
            addView(imageView2, w7.b6.e(24, -1, i13 | 16));
        }
        org.telegram.ui.Components.n5 n5Var = this.f20164a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
        if (cd.X) {
            if (this.f20167f != null) {
                i12 = org.telegram.messenger.i0.L(32.0f);
            } else {
                i12 = 0;
            }
            layoutParams.leftMargin = i12;
        } else {
            if (this.f20167f != null) {
                i11 = org.telegram.messenger.i0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.rightMargin = i11;
        }
        n5Var.setLayoutParams(layoutParams);
        float f10 = 18.0f;
        if (cd.X) {
            f7 = 8.0f;
        } else {
            f7 = 18.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        if (!cd.X) {
            f10 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.i0.L(f10), 0);
        if (i10 == 0) {
            this.f20167f.setVisibility(8);
            return;
        }
        this.f20167f.setVisibility(0);
        this.f20167f.setImageResource(i10);
    }

    public void setSelectorColor(int i10) {
        if (this.f20171w != i10) {
            this.f20171w = i10;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    t6.H1(yVar, i10, true);
                    return;
                }
            }
            l();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        int L;
        int i10;
        int i11 = 8;
        boolean z10 = true;
        int i12 = 0;
        if (this.f20165b == null) {
            TextView textView = new TextView(getContext());
            this.f20165b = textView;
            textView.setLines(1);
            this.f20165b.setSingleLine(true);
            int i13 = 3;
            this.f20165b.setGravity(3);
            this.f20165b.setEllipsize(TextUtils.TruncateAt.END);
            a7.V(this.f20165b, t6.Oi, this.O);
            this.f20165b.setVisibility(8);
            this.f20165b.setTextSize(1, 13.0f);
            TextView textView2 = this.f20165b;
            if (cd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(43.0f);
            }
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(43.0f);
            } else {
                i10 = 0;
            }
            textView2.setPadding(L, 0, i10, 0);
            TextView textView3 = this.f20165b;
            if (cd.X) {
                i13 = 5;
            }
            addView(textView3, w7.b6.d(-2, -2.0f, i13 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        if (this.f20165b.getVisibility() != 0) {
            z10 = false;
        }
        if (z11 != z10) {
            TextView textView4 = this.f20165b;
            if (!isEmpty) {
                i11 = 0;
            }
            textView4.setVisibility(i11);
            org.telegram.ui.Components.n5 n5Var = this.f20164a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            if (!isEmpty) {
                i12 = org.telegram.messenger.i0.L(10.0f);
            }
            layoutParams.bottomMargin = i12;
            n5Var.setLayoutParams(layoutParams);
        }
        this.f20165b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.f20165b;
        if (textView != null) {
            a7.r(textView);
            this.f20165b.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f20164a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.f20168n != i10) {
            this.f20168n = i10;
            this.f20164a.setTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        ei0 ei0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.n5 n5Var;
        try {
            int i10 = this.f20172x;
            p6 p6Var = this.O;
            if (i10 >= 0 && this.f20168n == this.E && (n5Var = this.f20164a) != null && n5Var.getCurrentTextColor() == this.f20168n) {
                int w02 = t6.w0(this.f20172x, p6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.f20173y >= 0 && this.f20169r == this.F && (ei0Var = this.f20166c) != null && ei0Var.getColorFilter() == this.I) {
                int w03 = t6.w0(this.f20173y, p6Var);
                if (w03 != this.f20169r) {
                    this.f20169r = w03;
                    if (!this.H || (mode = this.f20170s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    ei0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f20167f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i11 = this.D;
            if (i11 >= 0 && this.f20171w == this.G) {
                int r12 = t6.r1(this.U, t6.w0(i11, p6Var));
                if (r12 != this.f20171w) {
                    this.f20171w = r12;
                    Drawable background = getBackground();
                    if (background == this.J && (background instanceof RippleDrawable)) {
                        ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                    }
                }
                this.G = r12;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public b1(Context context, p6 p6Var, boolean z10, boolean z11) {
        this(0, context, p6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.f20166c.setImageDrawable(drawable);
    }

    public b1(int i10, Context context, p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i11 = t6.E8;
        this.f20172x = i11;
        int i12 = t6.F8;
        this.f20173y = i12;
        int i13 = t6.I5;
        this.D = i13;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = p6Var;
        this.L = z10;
        this.M = z11;
        this.f20168n = t6.w0(i11, p6Var);
        this.f20169r = t6.w0(i12, p6Var);
        this.f20170s = PorterDuff.Mode.MULTIPLY;
        int w02 = t6.w0(i13, p6Var);
        this.f20171w = w02;
        this.E = this.f20168n;
        this.F = this.f20169r;
        this.G = w02;
        l();
        setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f20166c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f20169r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, w7.b6.e(-2, 40, (cd.X ? 5 : 3) | 16));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.f20164a = n5Var;
        n5Var.setLines(1);
        n5Var.setSingleLine(true);
        n5Var.setGravity(3);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        n5Var.setTextColor(this.f20168n);
        n5Var.setTextSize(1, 16.0f);
        addView(n5Var, w7.b6.e(-2, -2, (cd.X ? 5 : 3) | 16));
        this.d = cd.X;
        a(i10);
    }
}
