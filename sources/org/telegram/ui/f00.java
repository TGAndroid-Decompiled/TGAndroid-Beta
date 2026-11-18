package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public final class f00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ValueAnimator E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public final Paint H;
    public final FiltersSetupActivity I;
    public final org.telegram.ui.ActionBar.n5 f47364a;
    public final TextView f47365b;
    public final ImageView f47366c;
    public int d;
    public int f47367e;
    public final View f47368f;
    public final ImageView h;
    public final org.telegram.ui.Components.j20 f47369n;
    public boolean f47370r;
    public final org.telegram.ui.Components.o80 f47371s;
    public boolean f47372w;
    public float f47373x;
    public org.telegram.messenger.ro f47374y;

    public f00(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        float f14;
        float f15;
        int i16;
        this.I = filtersSetupActivity;
        this.d = -2;
        this.f47367e = -1;
        this.f47370r = false;
        this.G = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.lr.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f47366c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231628);
        int i17 = org.telegram.ui.ActionBar.n6.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i17, null, mode);
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131750694, null));
        imageView.setClickable(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ma.d(48, 48.0f, i7 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f47368f = view;
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(view, c8.ma.d(20, 20.0f, i10 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f47364a = n5Var;
        n5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setMaxLines(1);
        if (org.telegram.messenger.gd.f24213a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 16);
        Drawable drawable = getContext().getDrawable(2131232476);
        org.telegram.ui.ActionBar.u6.x(this, drawable, i17, null, mode);
        n5Var.i(drawable);
        int i18 = org.telegram.ui.ActionBar.n6.Fi;
        i6Var = ((org.telegram.ui.ActionBar.h2) filtersSetupActivity).resourceProvider;
        n5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i18, i6Var));
        boolean z10 = org.telegram.messenger.gd.f24213a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 48;
        if (z10) {
            f10 = 80.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 80.0f;
        }
        addView(n5Var, c8.ma.d(-1, -2.0f, i19, f10, 10.0f, f11, 0.0f));
        TextView textView = new TextView(context);
        this.f47365b = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29805z6, null);
        textView.setTextSize(1, 13.0f);
        if (org.telegram.messenger.gd.f24213a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = org.telegram.messenger.gd.f24213a0;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z11) {
            f12 = 80.0f;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 80.0f;
        }
        addView(textView, c8.ma.d(-2, -2.0f, i20, f12, 35.0f, f13, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80();
        this.f47371s = o80Var;
        o80Var.D = true;
        o80Var.f38029t = 2.0f;
        int i21 = org.telegram.ui.ActionBar.n6.f29486i6;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i21, false);
        o80Var.g(org.telegram.ui.ActionBar.n6.r1(0.4f, x02), org.telegram.ui.ActionBar.n6.r1(1.0f, x02), org.telegram.ui.ActionBar.n6.r1(0.9f, x02), org.telegram.ui.ActionBar.n6.r1(1.7f, x02));
        int L = org.telegram.messenger.g0.L(1.0f);
        o80Var.f38032x.setStrokeWidth(L);
        o80Var.k(40.0f);
        org.telegram.ui.Components.j20 j20Var = new org.telegram.ui.Components.j20(this, context, L, 1);
        this.f47369n = j20Var;
        o80Var.setCallback(j20Var);
        j20Var.setFocusable(false);
        j20Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i21);
        j20Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(j20Var, h02, null, M, null);
        org.telegram.ui.ActionBar.u6.s(j20Var, i17, null, mode);
        j20Var.setContentDescription(org.telegram.messenger.gd.M0(2131750693, null));
        j20Var.setVisibility(8);
        j20Var.setImageResource(2131232209);
        org.telegram.ui.ActionBar.u6.s(j20Var, i17, null, mode);
        boolean z12 = org.telegram.messenger.gd.f24213a0;
        if (z12) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i22 = i15 | 16;
        if (z12) {
            f14 = 52.0f;
        } else {
            f14 = 6.0f;
        }
        if (z12) {
            f15 = 6.0f;
        } else {
            f15 = 52.0f;
        }
        addView(j20Var, c8.ma.d(40, 40.0f, i22, f14, 0.0f, f15, 0.0f));
        j20Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i21);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.u6.j(imageView2, h03, null, M2, null);
        org.telegram.ui.ActionBar.u6.s(imageView2, i17, null, mode);
        imageView2.setImageResource(2131232043);
        imageView2.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        if (org.telegram.messenger.gd.f24213a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView2, c8.ma.d(40, 40.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.ro getCurrentFilter() {
        return this.f47374y;
    }

    public float getDraggingProgress() {
        return this.G.f33892c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float d = this.G.d(this.F);
        int i7 = 0;
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false);
            Paint paint = this.H;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.r1(d, 301989888));
            float L2 = org.telegram.messenger.g0.L(8.0f) * d;
            float L3 = org.telegram.messenger.g0.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.f47372w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.n6.f29517k0.getAlpha();
            org.telegram.ui.ActionBar.n6.f29517k0.setAlpha((int) ((1.0f - d) * alpha));
            if (org.telegram.messenger.gd.f24213a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
            org.telegram.ui.ActionBar.n6.f29517k0.setAlpha(alpha);
        }
        org.telegram.messenger.ro roVar = this.f47374y;
        if (roVar != null) {
            boolean z10 = roVar.f26685p;
            if (z10) {
                float f10 = this.f47373x;
                if (f10 != 1.0f) {
                    this.f47373x = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f11 = this.f47373x;
                if (f11 != 0.0f) {
                    this.f47373x = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i10 = Utilities.i(this.f47373x, 1.0f, 0.0f);
        this.f47373x = i10;
        org.telegram.ui.ActionBar.n5 n5Var = this.f47364a;
        n5Var.setRightDrawableScale(i10);
        n5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    public void setDragging(boolean z10) {
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f47366c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var;
        try {
            org.telegram.ui.ActionBar.n5 n5Var = this.f47364a;
            if (n5Var != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Fi;
                i6Var = ((org.telegram.ui.ActionBar.h2) this.I).resourceProvider;
                n5Var.setEmojiColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
