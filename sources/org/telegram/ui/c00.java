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
public final class c00 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public ValueAnimator E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public final Paint H;
    public final FiltersSetupActivity I;
    public final org.telegram.ui.ActionBar.j5 f45859a;
    public final TextView f45860b;
    public final ImageView f45861c;
    public int d;
    public int f45862e;
    public final View f45863f;
    public final ImageView h;
    public final org.telegram.ui.Components.c20 f45864n;
    public boolean f45865r;
    public final org.telegram.ui.Components.d80 f45866s;
    public boolean f45867w;
    public float f45868x;
    public org.telegram.messenger.so f45869y;

    public c00(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
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
        this.f45862e = -1;
        this.f45865r = false;
        this.G = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.er.h);
        this.H = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f45861c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231627);
        int i17 = org.telegram.ui.ActionBar.j6.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i17, null, mode);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131750707, null));
        imageView.setClickable(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, c8.ja.d(48, 48.0f, i7 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f45863f = view;
        if (org.telegram.messenger.hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(view, c8.ja.d(20, 20.0f, i10 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f45859a = j5Var;
        j5Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
        j5Var.setTextSize(16);
        j5Var.setMaxLines(1);
        if (org.telegram.messenger.hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11 | 16);
        Drawable drawable = getContext().getDrawable(2131232475);
        org.telegram.ui.ActionBar.q6.x(this, drawable, i17, null, mode);
        j5Var.i(drawable);
        int i18 = org.telegram.ui.ActionBar.j6.Fi;
        e6Var = ((org.telegram.ui.ActionBar.e2) filtersSetupActivity).resourceProvider;
        j5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.w0(i18, e6Var));
        boolean z10 = org.telegram.messenger.hd.f24104a0;
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
        addView(j5Var, c8.ja.d(-1, -2.0f, i19, f10, 10.0f, f11, 0.0f));
        TextView textView = new TextView(context);
        this.f45860b = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29260z6, null);
        textView.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f24104a0) {
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
        boolean z11 = org.telegram.messenger.hd.f24104a0;
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
        addView(textView, c8.ja.d(-2, -2.0f, i20, f12, 35.0f, f13, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80();
        this.f45866s = d80Var;
        d80Var.D = true;
        d80Var.f33883t = 2.0f;
        int i21 = org.telegram.ui.ActionBar.j6.f28941i6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i21, false);
        d80Var.g(org.telegram.ui.ActionBar.j6.r1(0.4f, x02), org.telegram.ui.ActionBar.j6.r1(1.0f, x02), org.telegram.ui.ActionBar.j6.r1(0.9f, x02), org.telegram.ui.ActionBar.j6.r1(1.7f, x02));
        int L = org.telegram.messenger.g0.L(1.0f);
        d80Var.f33886x.setStrokeWidth(L);
        d80Var.k(40.0f);
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(this, context, L, 1);
        this.f45864n = c20Var;
        d80Var.setCallback(c20Var);
        c20Var.setFocusable(false);
        c20Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(x02, 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i21);
        c20Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(c20Var, h02, null, M, null);
        org.telegram.ui.ActionBar.q6.s(c20Var, i17, null, mode);
        c20Var.setContentDescription(org.telegram.messenger.hd.M0(2131750706, null));
        c20Var.setVisibility(8);
        c20Var.setImageResource(2131232208);
        org.telegram.ui.ActionBar.q6.s(c20Var, i17, null, mode);
        boolean z12 = org.telegram.messenger.hd.f24104a0;
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
        addView(c20Var, c8.ja.d(40, 40.0f, i22, f14, 0.0f, f15, 0.0f));
        c20Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i21, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i21);
        imageView2.setBackground(h03);
        org.telegram.ui.ActionBar.q6.j(imageView2, h03, null, M2, null);
        org.telegram.ui.ActionBar.q6.s(imageView2, i17, null, mode);
        imageView2.setImageResource(2131232042);
        imageView2.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        if (org.telegram.messenger.hd.f24104a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView2, c8.ja.d(40, 40.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public org.telegram.messenger.so getCurrentFilter() {
        return this.f45869y;
    }

    public float getDraggingProgress() {
        return this.G.f39900c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        float d = this.G.d(this.F);
        int i7 = 0;
        if (d > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false);
            Paint paint = this.H;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * d));
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.j6.r1(d, 301989888));
            float L2 = org.telegram.messenger.g0.L(8.0f) * d;
            float L3 = org.telegram.messenger.g0.L(12.0f) * d;
            canvas.drawRoundRect(L2, 0.0f, getWidth() - L2, getHeight(), L3, L3, paint);
        }
        if (this.f45867w && d < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.j6.f28972k0.getAlpha();
            org.telegram.ui.ActionBar.j6.f28972k0.setAlpha((int) ((1.0f - d) * alpha));
            if (org.telegram.messenger.hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(62.0f);
            }
            canvas.drawLine(L, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            org.telegram.ui.ActionBar.j6.f28972k0.setAlpha(alpha);
        }
        org.telegram.messenger.so soVar = this.f45869y;
        if (soVar != null) {
            boolean z10 = soVar.f26565p;
            if (z10) {
                float f10 = this.f45868x;
                if (f10 != 1.0f) {
                    this.f45868x = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f11 = this.f45868x;
                if (f11 != 0.0f) {
                    this.f45868x = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float i10 = Utilities.i(this.f45868x, 1.0f, 0.0f);
        this.f45868x = i10;
        org.telegram.ui.ActionBar.j5 j5Var = this.f45859a;
        j5Var.setRightDrawableScale(i10);
        j5Var.invalidate();
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
        this.f45861c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var;
        try {
            org.telegram.ui.ActionBar.j5 j5Var = this.f45859a;
            if (j5Var != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Fi;
                e6Var = ((org.telegram.ui.ActionBar.e2) this.I).resourceProvider;
                j5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
