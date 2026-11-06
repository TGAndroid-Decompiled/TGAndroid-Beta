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
import org.telegram.messenger.hd;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;
public class z0 extends FrameLayout implements a6 {
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
    public final f6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.q5 f28810a;
    public TextView f28811b;
    public final ch0 f28812c;
    public boolean d;
    public wo f28813e;
    public ImageView f28814f;
    public l9 h;
    public int f28815n;
    public int f28816r;
    public PorterDuff.Mode f28817s;
    public int f28818w;
    public int f28819x;
    public int f28820y;

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
            this.f28813e = woVar;
            woVar.setDrawUnchecked(false);
            this.f28813e.b(-1, -1, k6.E8);
            this.f28813e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.q5 q5Var = this.f28810a;
            int i12 = 3;
            if (i7 == 1) {
                boolean z9 = hd.f22871a0;
                this.d = !z9;
                wo woVar2 = this.f28813e;
                if (z9) {
                    i12 = 5;
                }
                addView(woVar2, ha.e(26, -1, i12 | 16));
                if (!hd.f22871a0) {
                    i11 = org.telegram.messenger.g0.L(34.0f);
                } else {
                    i11 = 0;
                }
                if (!hd.f22871a0) {
                    L2 = 0;
                } else {
                    L2 = org.telegram.messenger.g0.L(34.0f);
                }
                q5Var.setPadding(i11, 0, L2, 0);
                return;
            }
            wo woVar3 = this.f28813e;
            if (!hd.f22871a0) {
                i12 = 5;
            }
            addView(woVar3, ha.e(26, -1, i12 | 16));
            if (hd.f22871a0) {
                i10 = org.telegram.messenger.g0.L(34.0f);
            } else {
                i10 = 0;
            }
            if (hd.f22871a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(34.0f);
            }
            q5Var.setPadding(i10, 0, L, 0);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.f28819x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.f28820y;
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
        f6 f6Var = this.O;
        d(k6.w0(i7, f6Var), k6.w0(i10, f6Var));
        this.f28819x = i7;
        this.f28820y = i10;
        this.E = this.f28815n;
        this.F = this.f28816r;
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
        if (this.f28816r == i7 && this.f28817s == mode) {
            return;
        }
        this.f28816r = i7;
        this.f28817s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.I = porterDuffColorFilter;
        this.f28812c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public wo getCheckView() {
        return this.f28813e;
    }

    public int getIconResId() {
        return this.T;
    }

    public ImageView getImageView() {
        return this.f28812c;
    }

    public ImageView getRightIcon() {
        return this.f28814f;
    }

    public org.telegram.ui.Components.q5 getTextView() {
        return this.f28810a;
    }

    public final void h(float f10, int i7) {
        this.U = f10;
        setSelectorColor(k6.r1(f10, k6.w0(i7, this.O)));
        this.D = i7;
        this.G = this.f28818w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        float f10;
        int L;
        int i10;
        org.telegram.ui.Components.q5 q5Var = this.f28810a;
        q5Var.setText(charSequence);
        ch0 ch0Var = this.f28812c;
        if (i7 == 0 && drawable == null && this.f28813e == null) {
            this.T = 0;
            ch0Var.setVisibility(4);
            q5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            ch0Var.setImageDrawable(drawable);
        } else {
            this.T = i7;
            ch0Var.setImageResource(i7);
        }
        ch0Var.setVisibility(0);
        float f11 = 0.0f;
        if (this.d) {
            if (this.f28813e != null) {
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
        } else if (this.f28813e != null) {
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
        org.telegram.ui.Components.q5 q5Var = this.f28810a;
        q5Var.setText(charSequence);
        if (!this.d || this.f28813e != null) {
            L = org.telegram.messenger.g0.L(43.0f);
        } else {
            L = 0;
        }
        if (this.d || this.f28813e != null) {
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
            if (hd.f22871a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            addView(l9Var2, ha.e(28, 28, i10 | 16));
        }
        this.f28812c.setVisibility(4);
        this.h.j(hcVar, str, rzVar, tL_attachMenuBot);
    }

    public void l() {
        int i7;
        int i10 = this.f28818w;
        int i11 = 0;
        if (this.L) {
            i7 = this.K;
        } else {
            i7 = 0;
        }
        if (this.M) {
            i11 = this.K;
        }
        org.telegram.ui.Cells.y a02 = k6.a0(i10, i7, i11);
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
        wo woVar = this.f28813e;
        if (woVar != null && woVar.f40043a.f31258q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f28813e.f40043a.f31258q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N), 1073741824));
        if (this.Q && this.f28810a.getLayout().getLineCount() > 1) {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N + 8), 1073741824));
        }
    }

    public void setAnimatedIcon(int i7) {
        this.T = 0;
        this.f28812c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.f28813e.b(-1, -1, i7);
    }

    public void setChecked(boolean z9) {
        wo woVar = this.f28813e;
        if (woVar == null) {
            return;
        }
        woVar.a(z9, true);
    }

    public void setEmojiCacheType(int i7) {
        this.f28810a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.T = i7;
        this.f28812c.setImageResource(i7);
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
        org.telegram.ui.Components.q5 q5Var = this.f28810a;
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
        if (this.f28814f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f28814f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f28814f.setColorFilter(this.f28816r, PorterDuff.Mode.MULTIPLY);
            if (hd.f22871a0) {
                this.f28814f.setScaleX(-1.0f);
            }
            ImageView imageView2 = this.f28814f;
            if (hd.f22871a0) {
                i12 = 3;
            } else {
                i12 = 5;
            }
            addView(imageView2, ha.e(24, -1, i12 | 16));
        }
        org.telegram.ui.Components.q5 q5Var = this.f28810a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (hd.f22871a0) {
            if (this.f28814f != null) {
                i11 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i11 = 0;
            }
            layoutParams.leftMargin = i11;
        } else {
            if (this.f28814f != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            } else {
                i10 = 0;
            }
            layoutParams.rightMargin = i10;
        }
        q5Var.setLayoutParams(layoutParams);
        float f11 = 18.0f;
        if (hd.f22871a0) {
            f10 = 8.0f;
        } else {
            f10 = 18.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!hd.f22871a0) {
            f11 = 8.0f;
        }
        setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        if (i7 == 0) {
            this.f28814f.setVisibility(8);
            return;
        }
        this.f28814f.setVisibility(0);
        this.f28814f.setImageResource(i7);
    }

    public void setSelectorColor(int i7) {
        if (this.f28818w != i7) {
            this.f28818w = i7;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    k6.H1(yVar, i7, true);
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
        if (this.f28811b == null) {
            TextView textView = new TextView(getContext());
            this.f28811b = textView;
            textView.setLines(1);
            this.f28811b.setSingleLine(true);
            int i12 = 3;
            this.f28811b.setGravity(3);
            this.f28811b.setEllipsize(TextUtils.TruncateAt.END);
            r6.V(this.f28811b, k6.Oi, this.O);
            this.f28811b.setVisibility(8);
            this.f28811b.setTextSize(1, 13.0f);
            TextView textView2 = this.f28811b;
            if (hd.f22871a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(43.0f);
            }
            if (hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(43.0f);
            } else {
                i7 = 0;
            }
            textView2.setPadding(L, 0, i7, 0);
            TextView textView3 = this.f28811b;
            if (hd.f22871a0) {
                i12 = 5;
            }
            addView(textView3, ha.d(-2, -2.0f, i12 | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        if (this.f28811b.getVisibility() != 0) {
            z9 = false;
        }
        if (z10 != z9) {
            TextView textView4 = this.f28811b;
            if (!isEmpty) {
                i10 = 0;
            }
            textView4.setVisibility(i10);
            org.telegram.ui.Components.q5 q5Var = this.f28810a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            if (!isEmpty) {
                i11 = org.telegram.messenger.g0.L(10.0f);
            }
            layoutParams.bottomMargin = i11;
            q5Var.setLayoutParams(layoutParams);
        }
        this.f28811b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.f28811b;
        if (textView != null) {
            r6.r(textView);
            this.f28811b.setTextColor(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28810a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        if (this.f28815n != i7) {
            this.f28815n = i7;
            this.f28810a.setTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        ch0 ch0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.q5 q5Var;
        try {
            int i7 = this.f28819x;
            f6 f6Var = this.O;
            if (i7 >= 0 && this.f28815n == this.E && (q5Var = this.f28810a) != null && q5Var.getCurrentTextColor() == this.f28815n) {
                int w02 = k6.w0(this.f28819x, f6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.f28820y >= 0 && this.f28816r == this.F && (ch0Var = this.f28812c) != null && ch0Var.getColorFilter() == this.I) {
                int w03 = k6.w0(this.f28820y, f6Var);
                if (w03 != this.f28816r) {
                    this.f28816r = w03;
                    if (!this.H || (mode = this.f28817s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    ch0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f28814f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i10 = this.D;
            if (i10 >= 0 && this.f28818w == this.G) {
                int r12 = k6.r1(this.U, k6.w0(i10, f6Var));
                if (r12 != this.f28818w) {
                    this.f28818w = r12;
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

    public z0(Context context, f6 f6Var, boolean z9, boolean z10) {
        this(0, context, f6Var, z9, z10);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.f28812c.setImageDrawable(drawable);
    }

    public z0(int i7, Context context, f6 f6Var, boolean z9, boolean z10) {
        super(context);
        int i10 = k6.E8;
        this.f28819x = i10;
        int i11 = k6.F8;
        this.f28820y = i11;
        int i12 = k6.I5;
        this.D = i12;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = f6Var;
        this.L = z9;
        this.M = z10;
        this.f28815n = k6.w0(i10, f6Var);
        this.f28816r = k6.w0(i11, f6Var);
        this.f28817s = PorterDuff.Mode.MULTIPLY;
        int w02 = k6.w0(i12, f6Var);
        this.f28818w = w02;
        this.E = this.f28815n;
        this.F = this.f28816r;
        this.G = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ?? imageView = new ImageView(context);
        this.f28812c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f28816r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        imageView.setColorFilter(porterDuffColorFilter);
        addView((View) imageView, ha.e(-2, 40, (hd.f22871a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.f28810a = q5Var;
        q5Var.setLines(1);
        q5Var.setSingleLine(true);
        q5Var.setGravity(3);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        q5Var.setTextColor(this.f28815n);
        q5Var.setTextSize(1, 16.0f);
        addView(q5Var, ha.e(-2, -2, (hd.f22871a0 ? 5 : 3) | 16));
        this.d = hd.f22871a0;
        a(i7);
    }
}
