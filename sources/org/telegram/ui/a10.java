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
public final class a10 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public ValueAnimator D;
    public boolean E;
    public final org.telegram.ui.Components.t5 F;
    public final Paint G;
    public final FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.u5 f35516a;
    public final TextView f35517b;
    public final ImageView f35518c;
    public int d;
    public int e;
    public final View f35519f;
    public final ImageView h;
    public final org.telegram.ui.Components.q20 f35520n;
    public boolean f35521r;
    public final org.telegram.ui.Components.t80 f35522s;
    public boolean f35523w;
    public float f35524x;
    public org.telegram.messenger.bp f35525y;

    public a10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17;
        this.H = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.f35521r = false;
        this.F = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f35518c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231628);
        int i18 = org.telegram.ui.ActionBar.t6.Ii;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i18, null, mode);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131750708, null));
        imageView.setClickable(true);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.b6.d(48, 48.0f, i10 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f35519f = view;
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, w7.b6.d(20, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f35516a = u5Var;
        u5Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        u5Var.setMaxLines(1);
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(2131232473);
        org.telegram.ui.ActionBar.a7.y(this, drawable, i18, null, mode);
        u5Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.t6.Ci;
        p6Var = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity).resourceProvider;
        u5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
        boolean z10 = org.telegram.messenger.dd.X;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z10) {
            f7 = 80.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 80.0f;
        }
        addView(u5Var, w7.b6.d(-1, -2.0f, i20, f7, 10.0f, f10, 0.0f));
        TextView textView = new TextView(context);
        this.f35517b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView.setTextSize(1, 13.0f);
        if (org.telegram.messenger.dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView.setGravity(i14);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = org.telegram.messenger.dd.X;
        if (z11) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z11) {
            f11 = 80.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 80.0f;
        }
        addView(textView, w7.b6.d(-2, -2.0f, i21, f11, 35.0f, f12, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
        this.f35522s = t80Var;
        t80Var.D = true;
        t80Var.f30589t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.t6.f21021i6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i22, false);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.4f, x02), org.telegram.ui.ActionBar.t6.r1(1.0f, x02), org.telegram.ui.ActionBar.t6.r1(0.9f, x02), org.telegram.ui.ActionBar.t6.r1(1.7f, x02));
        int L = org.telegram.messenger.i0.L(1.0f);
        t80Var.f30592x.setStrokeWidth(L);
        t80Var.k(40.0f);
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(this, context, L, 1);
        this.f35520n = q20Var;
        t80Var.setCallback(q20Var);
        q20Var.setFocusable(false);
        q20Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i22);
        q20Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(q20Var, h02, null, N, null);
        org.telegram.ui.ActionBar.a7.t(q20Var, i18, null, mode);
        q20Var.setContentDescription(org.telegram.messenger.dd.L0(2131750707, null));
        q20Var.setVisibility(8);
        q20Var.setImageResource(2131232206);
        org.telegram.ui.ActionBar.a7.t(q20Var, i18, null, mode);
        boolean z12 = org.telegram.messenger.dd.X;
        if (z12) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        int i23 = i16 | 16;
        if (z12) {
            f13 = 52.0f;
        } else {
            f13 = 6.0f;
        }
        if (z12) {
            f14 = 6.0f;
        } else {
            f14 = 52.0f;
        }
        addView(q20Var, w7.b6.d(40, 40.0f, i23, f13, 0.0f, f14, 0.0f));
        q20Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i22, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i22);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.a7.k(imageView2, h03, null, N2, null);
        org.telegram.ui.ActionBar.a7.t(imageView2, i18, null, mode);
        imageView2.setImageResource(2131232040);
        imageView2.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        if (org.telegram.messenger.dd.X) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, w7.b6.d(40, 40.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.bp getCurrentFilter() {
        return this.f35525y;
    }

    public float getDraggingProgress() {
        return this.F.f30530c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float d = this.F.d(this.E);
        int i10 = 0;
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.i0.L(12.0f) * d, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(d, 301989888));
            float L2 = org.telegram.messenger.i0.L(8.0f) * d;
            float L3 = org.telegram.messenger.i0.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.f35523w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.t6.f21053k0.getAlpha();
            org.telegram.ui.ActionBar.t6.f21053k0.setAlpha((int) ((1.0f - d) * alpha));
            if (org.telegram.messenger.dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.dd.X) {
                i10 = org.telegram.messenger.i0.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
            org.telegram.ui.ActionBar.t6.f21053k0.setAlpha(alpha);
        }
        org.telegram.messenger.bp bpVar = this.f35525y;
        if (bpVar != null) {
            boolean z10 = bpVar.f15012p;
            if (z10) {
                float f7 = this.f35524x;
                if (f7 != 1.0f) {
                    this.f35524x = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.f35524x;
                if (f10 != 0.0f) {
                    this.f35524x = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i11 = Utilities.i(this.f35524x, 1.0f, 0.0f);
        this.f35524x = i11;
        org.telegram.ui.ActionBar.u5 u5Var = this.f35516a;
        u5Var.setRightDrawableScale(i11);
        u5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    public void setDragging(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f35518c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        try {
            org.telegram.ui.ActionBar.u5 u5Var = this.f35516a;
            if (u5Var != null) {
                int i10 = org.telegram.ui.ActionBar.t6.Ci;
                p6Var = ((org.telegram.ui.ActionBar.k2) this.H).resourceProvider;
                u5Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
