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
public final class d00 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public ValueAnimator D;
    public boolean E;
    public final org.telegram.ui.Components.v5 F;
    public final Paint G;
    public final FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.m5 f44853a;
    public final TextView f44854b;
    public final ImageView f44855c;
    public int d;
    public int f44856e;
    public final View f44857f;
    public final ImageView h;
    public final org.telegram.ui.Components.z10 f44858n;
    public boolean f44859r;
    public final org.telegram.ui.Components.a80 f44860s;
    public boolean f44861w;
    public float f44862x;
    public org.telegram.messenger.vo f44863y;

    public d00(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
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
        this.H = filtersSetupActivity;
        this.d = -2;
        this.f44856e = -1;
        this.f44859r = false;
        this.F = new org.telegram.ui.Components.v5(this, 0L, 420L, org.telegram.ui.Components.wq.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f44855c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231627);
        int i17 = org.telegram.ui.ActionBar.m6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i17, null, mode);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131750707, null));
        imageView.setClickable(true);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i7 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f44857f = view;
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(view, c8.ha.d(20, 20.0f, i10 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f44853a = m5Var;
        m5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(16);
        m5Var.setMaxLines(1);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var.setGravity(i11 | 16);
        Drawable drawable = getContext().getDrawable(2131232474);
        org.telegram.ui.ActionBar.t6.x(this, drawable, i17, null, mode);
        m5Var.i(drawable);
        int i18 = org.telegram.ui.ActionBar.m6.Ci;
        h6Var = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity).resourceProvider;
        m5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i18, h6Var));
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 48;
        if (z9) {
            f10 = 80.0f;
        } else {
            f10 = 64.0f;
        }
        if (z9) {
            f11 = 64.0f;
        } else {
            f11 = 80.0f;
        }
        addView(m5Var, c8.ha.d(-1, -2.0f, i19, f10, 10.0f, f11, 0.0f));
        TextView textView = new TextView(context);
        this.f44854b = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28300z6, null);
        textView.setTextSize(1, 13.0f);
        if (org.telegram.messenger.id.f23161a0) {
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
        boolean z10 = org.telegram.messenger.id.f23161a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z10) {
            f12 = 80.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 80.0f;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i20, f12, 35.0f, f13, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80();
        this.f44860s = a80Var;
        a80Var.D = true;
        a80Var.f31789t = 2.0f;
        int i21 = org.telegram.ui.ActionBar.m6.f27982i6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i21, false);
        a80Var.g(org.telegram.ui.ActionBar.m6.r1(0.4f, x02), org.telegram.ui.ActionBar.m6.r1(1.0f, x02), org.telegram.ui.ActionBar.m6.r1(0.9f, x02), org.telegram.ui.ActionBar.m6.r1(1.7f, x02));
        int L = org.telegram.messenger.g0.L(1.0f);
        a80Var.f31792x.setStrokeWidth(L);
        a80Var.k(40.0f);
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(this, context, L, 1);
        this.f44858n = z10Var;
        a80Var.setCallback(z10Var);
        z10Var.setFocusable(false);
        z10Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i21);
        z10Var.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(z10Var, h02, null, M, null);
        org.telegram.ui.ActionBar.t6.s(z10Var, i17, null, mode);
        z10Var.setContentDescription(org.telegram.messenger.id.M0(2131750706, null));
        z10Var.setVisibility(8);
        z10Var.setImageResource(2131232207);
        org.telegram.ui.ActionBar.t6.s(z10Var, i17, null, mode);
        boolean z11 = org.telegram.messenger.id.f23161a0;
        if (z11) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i22 = i15 | 16;
        if (z11) {
            f14 = 52.0f;
        } else {
            f14 = 6.0f;
        }
        if (z11) {
            f15 = 6.0f;
        } else {
            f15 = 52.0f;
        }
        addView(z10Var, c8.ha.d(40, 40.0f, i22, f14, 0.0f, f15, 0.0f));
        z10Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i21);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.t6.j(imageView2, h03, null, M2, null);
        org.telegram.ui.ActionBar.t6.s(imageView2, i17, null, mode);
        imageView2.setImageResource(2131232041);
        imageView2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        if (org.telegram.messenger.id.f23161a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView2, c8.ha.d(40, 40.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.vo getCurrentFilter() {
        return this.f44863y;
    }

    public float getDraggingProgress() {
        return this.F.f38854c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float d = this.F.d(this.E);
        int i7 = 0;
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.m6.r1(d, 301989888));
            float L2 = org.telegram.messenger.g0.L(8.0f) * d;
            float L3 = org.telegram.messenger.g0.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.f44861w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.m6.f28013k0.getAlpha();
            org.telegram.ui.ActionBar.m6.f28013k0.setAlpha((int) ((1.0f - d) * alpha));
            if (org.telegram.messenger.id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
            org.telegram.ui.ActionBar.m6.f28013k0.setAlpha(alpha);
        }
        org.telegram.messenger.vo voVar = this.f44863y;
        if (voVar != null) {
            boolean z9 = voVar.f26087p;
            if (z9) {
                float f10 = this.f44862x;
                if (f10 != 1.0f) {
                    this.f44862x = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z9) {
                float f11 = this.f44862x;
                if (f11 != 0.0f) {
                    this.f44862x = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i10 = Utilities.i(this.f44862x, 1.0f, 0.0f);
        this.f44862x = i10;
        org.telegram.ui.ActionBar.m5 m5Var = this.f44853a;
        m5Var.setRightDrawableScale(i10);
        m5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    public void setDragging(boolean z9) {
        if (this.E == z9) {
            return;
        }
        this.E = z9;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f44855c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var;
        try {
            org.telegram.ui.ActionBar.m5 m5Var = this.f44853a;
            if (m5Var != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Ci;
                h6Var = ((org.telegram.ui.ActionBar.f2) this.H).resourceProvider;
                m5Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
