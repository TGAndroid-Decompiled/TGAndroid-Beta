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
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class z0 extends FrameLayout implements b6 {
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
    public final g6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.q5 f28817a;
    public TextView f28818b;
    public final dh0 f28819c;
    public boolean d;
    public wo f28820e;
    public ImageView f28821f;
    public l9 h;
    public int f28822n;
    public int f28823r;
    public PorterDuff.Mode f28824s;
    public int f28825w;
    public int f28826x;
    public int f28827y;

    public z0(Context context, boolean z9, boolean z10) {
        this(0, context, null, z9, z10);
    }

    public final void a(int i7) {
        int i10;
        int L;
        int i11;
        int L2;
        if (i7 > 0) {
            wo woVar = new wo(26, getContext(), this.O);
            this.f28820e = woVar;
            woVar.setDrawUnchecked(false);
            this.f28820e.b(-1, -1, l6.E8);
            this.f28820e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.q5 q5Var = this.f28817a;
            int i12 = 3;
            if (i7 == 1) {
                boolean z9 = id.f23157a0;
                this.d = !z9;
                wo woVar2 = this.f28820e;
                if (z9) {
                    i12 = 5;
                }
                addView(woVar2, ha.e(26, -1, i12 | 16));
                if (!id.f23157a0) {
                    i11 = org.telegram.messenger.g0.L(34.0f);
                } else {
                    i11 = 0;
                }
                if (!id.f23157a0) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.g0.L(34.0f);
                }
                q5Var.setPadding(i11, 0, L2, 0);
                return;
            }
            wo woVar3 = this.f28820e;
            if (!id.f23157a0) {
                i12 = 5;
            }
            addView(woVar3, ha.e(26, -1, i12 | 16));
            if (id.f23157a0) {
                i10 = org.telegram.messenger.g0.L(34.0f);
            } else {
                i10 = 0;
            }
            if (id.f23157a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(34.0f);
            }
            q5Var.setPadding(i10, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f28826x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.f28827y;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.D;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
    }

    public final void b() {
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i7, int i10) {
        g6 g6Var = this.O;
        d(l6.w0(i7, g6Var), l6.w0(i10, g6Var));
        this.f28826x = i7;
        this.f28827y = i10;
        this.E = this.f28822n;
        this.F = this.f28823r;
    }

    public final void d(int i7, int i10) {
        setTextColor(i7);
        setIconColor(i10);
    }

    public final void e(final int i7, final int i10, final int i11, boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.S) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.R = ofFloat;
        this.S = z9;
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
        this.R.addListener(new y0(this, z9, i7, i11, i10));
        this.R.setInterpolator(xq.h);
        this.R.start();
    }

    public final void f(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = 0.0f;
        if (this.S) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.R = ofFloat;
        this.S = z9;
        ofFloat.addUpdateListener(new fi.v3(this, 11));
        this.R.addListener(new ch.y(18, this, z9));
        this.R.setInterpolator(xq.h);
        this.R.start();
    }

    public final void g(int i7, PorterDuff.Mode mode) {
        if (this.f28823r == i7 && this.f28824s == mode) {
            return;
        }
        this.f28823r = i7;
        this.f28824s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.I = porterDuffColorFilter;
        this.f28819c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public wo getCheckView() {
        return this.f28820e;
    }

    public int getIconResId() {
        return this.T;
    }

    public ImageView getImageView() {
        return this.f28819c;
    }

    public ImageView getRightIcon() {
        return this.f28821f;
    }

    public org.telegram.ui.Components.q5 getTextView() {
        return this.f28817a;
    }

    public final void h(float f10, int i7) {
        this.U = f10;
        setSelectorColor(l6.r1(f10, l6.w0(i7, this.O)));
        this.D = i7;
        this.G = this.f28825w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        float f10;
        int L;
        int i10;
        org.telegram.ui.Components.q5 q5Var = this.f28817a;
        q5Var.setText(charSequence);
        dh0 dh0Var = this.f28819c;
        if (i7 == 0 && drawable == null && this.f28820e == null) {
            this.T = 0;
            dh0Var.setVisibility(4);
            q5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            dh0Var.setImageDrawable(drawable);
        } else {
            this.T = i7;
            dh0Var.setImageResource(i7);
        }
        dh0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f28820e != null) {
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
        } else if (this.f28820e != null) {
            i10 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i10 = 0;
        }
        q5Var.setPadding(L, 0, i10, 0);
    }

    public final void k(CharSequence charSequence, hc hcVar, String str, rz rzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        int L;
        int i7;
        int i10;
        org.telegram.ui.Components.q5 q5Var = this.f28817a;
        q5Var.setText(charSequence);
        if (!this.d || this.f28820e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.f28820e != null) {
            i7 = org.telegram.messenger.g0.L(43.0f);
        } else {
            i7 = 0;
        }
        q5Var.setPadding(L, 0, i7, 0);
        if (this.h == null) {
            l9 l9Var = new l9(getContext());
            this.h = l9Var;
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            l9 l9Var2 = this.h;
            if (id.f23157a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(l9Var2, ha.e(28, 28, i10 | 16));
        }
        this.f28819c.setVisibility(4);
        this.h.j(hcVar, str, rzVar, tL_attachMenuBot);
    }

    public void l() {
        int i7;
        int i10 = this.f28825w;
        int i11 = 0;
        if (this.L) {
            i7 = this.K;
        } else {
            i7 = 0;
        }
        if (this.M) {
            i11 = this.K;
        }
        org.telegram.ui.Cells.y a02 = l6.a0(i10, i7, i11);
        this.J = a02;
        setBackground(a02);
    }

    public final void m(boolean z9, boolean z10) {
        if (this.L == z9 && this.M == z10) {
            return;
        }
        this.L = z9;
        this.M = z10;
        l();
    }

    public final void n(boolean z9, boolean z10) {
        if (this.L == z9 && this.M == z10 && this.K == 12) {
            return;
        }
        this.L = z9;
        this.M = z10;
        this.K = 12;
        l();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        wo woVar = this.f28820e;
        if (woVar != null && woVar.f40108a.f31268q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f28820e.f40108a.f31268q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N), 1073741824));
        if (this.Q && this.f28817a.getLayout().getLineCount() > 1) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i7) {
        this.T = 0;
        this.f28819c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.f28820e.b(-1, -1, i7);
    }

    public void setChecked(boolean z9) {
        wo woVar = this.f28820e;
        if (woVar == null) {
            return;
        }
        woVar.a(z9, true);
    }

    public void setEmojiCacheType(int i7) {
        this.f28817a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.T = i7;
        this.f28819c.setImageResource(i7);
    }

    public void setIconColor(int i7) {
        g(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i7) {
        l9 l9Var = this.h;
        if (l9Var != null) {
            l9Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i7) {
        this.N = i7;
    }

    public void setMultiline(boolean z9) {
        org.telegram.ui.Components.q5 q5Var = this.f28817a;
        q5Var.setLines(2);
        if (z9) {
            q5Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        q5Var.setSingleLine(false);
        q5Var.setGravity(16);
    }

    public void setRightIcon(int i7) {
        int i10;
        float f10;
        int i11;
        int i12;
        if (this.f28821f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f28821f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f28821f.setColorFilter(this.f28823r, PorterDuff.Mode.MULTIPLY);
            if (id.f23157a0) {
                this.f28821f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f28821f;
            if (id.f23157a0) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, ha.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.q5 q5Var = this.f28817a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (id.f23157a0) {
            if (this.f28821f != null) {
                i11 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f28821f != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        q5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (id.f23157a0) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!id.f23157a0) {
            f11 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (i7 == 0) {
            this.f28821f.setVisibility(8);
            return;
        }
        this.f28821f.setVisibility(0);
        this.f28821f.setImageResource(i7);
    }

    public void setSelectorColor(int i7) {
        if (this.f28825w != i7) {
            this.f28825w = i7;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    l6.H1(yVar, i7, true);
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
        boolean z9 = true;
        int i11 = 0;
        if (this.f28818b == null) {
            TextView textView = new TextView(getContext());
            this.f28818b = textView;
            textView.setLines(1);
            this.f28818b.setSingleLine(true);
            int i12 = 3;
            this.f28818b.setGravity(3);
            this.f28818b.setEllipsize(TextUtils.TruncateAt.END);
            s6.U(this.f28818b, l6.Oi, this.O);
            this.f28818b.setVisibility(8);
            this.f28818b.setTextSize(1, 13.0f);
            TextView textView2 = this.f28818b;
            if (id.f23157a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(43.0f);
            }
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(43.0f);
            } else {
                i7 = 0;
            }
            textView2.setPadding(L, 0, i7, 0);
            TextView textView3 = this.f28818b;
            if (id.f23157a0) {
                i12 = 5;
            }
            addView(textView3, ha.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        if (this.f28818b.getVisibility() != 0) {
            z9 = false;
        }
        if (z10 != z9) {
            TextView textView4 = this.f28818b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.q5 q5Var = this.f28817a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.bottomMargin = i11;
            q5Var.setLayoutParams(layoutParams);
        }
        this.f28818b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.f28818b;
        if (textView != null) {
            s6.q(textView);
            this.f28818b.setTextColor(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28817a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        if (this.f28822n != i7) {
            this.f28822n = i7;
            this.f28817a.setTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        dh0 dh0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.q5 q5Var;
        try {
            int i7 = this.f28826x;
            g6 g6Var = this.O;
            if (i7 >= 0 && this.f28822n == this.E && (q5Var = this.f28817a) != null && q5Var.getCurrentTextColor() == this.f28822n) {
                int w02 = l6.w0(this.f28826x, g6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.f28827y >= 0 && this.f28823r == this.F && (dh0Var = this.f28819c) != null && dh0Var.getColorFilter() == this.I) {
                int w03 = l6.w0(this.f28827y, g6Var);
                if (w03 != this.f28823r) {
                    this.f28823r = w03;
                    if (!this.H || (mode = this.f28824s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    dh0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f28821f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i10 = this.D;
            if (i10 >= 0 && this.f28825w == this.G) {
                int r12 = l6.r1(this.U, l6.w0(i10, g6Var));
                if (r12 != this.f28825w) {
                    this.f28825w = r12;
                    Drawable background = getBackground();
                    if (background == this.J && (background instanceof RippleDrawable)) {
                        ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                    }
                }
                this.G = r12;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public z0(Context context, g6 g6Var, boolean z9, boolean z10) {
        this(0, context, g6Var, z9, z10);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.f28819c.setImageDrawable(drawable);
    }

    public z0(int i7, Context context, g6 g6Var, boolean z9, boolean z10) {
        super(context);
        int i10 = l6.E8;
        this.f28826x = i10;
        int i11 = l6.F8;
        this.f28827y = i11;
        int i12 = l6.I5;
        this.D = i12;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = g6Var;
        this.L = z9;
        this.M = z10;
        this.f28822n = l6.w0(i10, g6Var);
        this.f28823r = l6.w0(i11, g6Var);
        this.f28824s = PorterDuff.Mode.MULTIPLY;
        int w02 = l6.w0(i12, g6Var);
        this.f28825w = w02;
        this.E = this.f28822n;
        this.F = this.f28823r;
        this.G = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f28819c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f28823r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, ha.e(-2, 40, (id.f23157a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f28817a = q5Var;
        q5Var.setLines(1);
        q5Var.setSingleLine(true);
        q5Var.setGravity(3);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        q5Var.setTextColor(this.f28822n);
        q5Var.setTextSize(1, 16.0f);
        addView(q5Var, ha.e(-2, -2, (id.f23157a0 ? 5 : 3) | 16));
        this.d = id.f23157a0;
        a(i7);
    }
}
