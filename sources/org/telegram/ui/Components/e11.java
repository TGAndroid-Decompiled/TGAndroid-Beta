package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class e11 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public ValueAnimator D;
    public TextPaint E;
    public StaticLayout F;
    public cp G;
    public final g9 H;
    public final int I;
    public uo0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.xn N;
    public boolean O;
    public final ImageReceiver P;
    public r8 Q;
    public final org.telegram.ui.ActionBar.c5 R;
    public final org.telegram.ui.ActionBar.c5 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f25610a;
    public final float f25611b;
    public final float f25612c;
    public final float d;
    public final float e;
    public d11 f25613f;
    public d11 h;
    public float f25614n;
    public final Paint f25615r;
    public final Paint f25616s;
    public final RectF f25617w;
    public final Path f25618x;
    public final org.telegram.ui.ActionBar.p6 f25619y;

    public e11(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f25610a = org.telegram.messenger.i0.L(8.0f);
        this.f25611b = org.telegram.messenger.i0.L(6.0f);
        this.f25612c = org.telegram.messenger.i0.L(4.0f);
        this.d = org.telegram.messenger.i0.L(21.0f);
        this.e = org.telegram.messenger.i0.L(41.0f);
        this.f25613f = new d11(this);
        this.f25614n = 1.0f;
        Paint paint = new Paint(1);
        this.f25615r = paint;
        this.f25616s = new Paint(1);
        this.f25617w = new RectF();
        this.f25618x = new Path();
        this.R = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.c5(0, false, false, null);
        this.K = i11;
        this.I = i10;
        this.f25619y = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(8.0f));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21019i5, this, p6Var);
        g9 g9Var = new g9(context);
        this.H = g9Var;
        g9Var.getImageReceiver().A0 = true;
        g9Var.getImageReceiver().f14410u0 = false;
        g9Var.getImageReceiver().W(0);
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            addView(g9Var, w7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(g9Var, w7.b6.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(org.telegram.messenger.i0.L(120.0f) / bitmap.getWidth(), org.telegram.messenger.i0.L(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && Math.abs(max - 1.0f) >= 0.0125f) {
            int width = (int) (bitmap.getWidth() * max);
            int height = (int) (bitmap.getHeight() * max);
            if (height > 0 && width > 0) {
                return Bitmap.createScaledBitmap(bitmap, width, height, true);
            }
            return bitmap;
        }
        return bitmap;
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, this.f25619y));
        this.E.setTextSize(org.telegram.messenger.i0.L(c()));
        this.E.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(52.0f);
        int i10 = this.K;
        if (i10 == 3 || i10 == 4) {
            L = org.telegram.messenger.i0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = ov0.d(b10, textPaint2, true, L, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.cd.L0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().B() != null) {
            org.telegram.messenger.i0.r(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().B().f24765k0) {
                this.H.getImageReceiver().B().N(0, true, false);
                this.H.getImageReceiver().B().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.i0.H).start();
            uo0 uo0Var = new uo0(this, 19);
            this.J = uo0Var;
            org.telegram.messenger.i0.h3(uo0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19630i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d11 d11Var;
        d11 d11Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f25618x);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f25614n != 1.0f && (d11Var2 = this.h) != null) {
            d11Var2.b(canvas, 1.0f);
        }
        float f7 = this.f25614n;
        if (f7 != 0.0f) {
            this.f25613f.b(canvas, f7);
        }
        if (this.f25614n != 1.0f && (d11Var = this.h) != null) {
            d11Var.a(canvas, 1.0f);
        }
        float f10 = this.f25614n;
        if (f10 != 0.0f) {
            this.f25613f.a(canvas, f10);
        }
        float f11 = this.f25614n;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.10666667f;
            this.f25614n = f12;
            if (f12 >= 1.0f) {
                this.f25614n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.cp r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e11.f(org.telegram.ui.Components.cp, long, boolean):void");
    }

    public final void g(boolean z10, boolean z11) {
        float f7 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z10;
            if (z10) {
                f7 = 1.0f;
            }
            this.M = f7;
            invalidate();
            return;
        }
        if (this.W != z10) {
            float f10 = this.M;
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new r60(this, 26));
            this.D.addListener(new ha0(6, this, z10));
            this.D.setDuration(250L);
            this.D.start();
        }
        this.W = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        this.O = true;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.f(this);
        }
        this.P.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
        this.O = false;
        org.telegram.ui.xn xnVar = this.N;
        if (xnVar != null) {
            xnVar.g(this);
        }
        this.P.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.W);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12 = this.K;
        if (i12 != 1 && i12 != 4) {
            if (i12 == 0) {
                f7 = 77.0f;
            } else {
                f7 = 83.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            int size = View.MeasureSpec.getSize(i11);
            if (size == 0) {
                size = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i10);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        g9 g9Var = this.H;
        g9Var.setPivotY(g9Var.getMeasuredHeight());
        g9Var.setPivotX(g9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        float f7 = this.f25612c;
        RectF rectF = this.f25617w;
        rectF.set(f7, f7, i10 - f7, i11 - f7);
        Path path = this.f25618x;
        path.reset();
        float f10 = this.f25611b;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i10) {
        int i11 = org.telegram.ui.ActionBar.t6.f21019i5;
        org.telegram.ui.ActionBar.p6 p6Var = this.f25619y;
        this.f25616s.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, p6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            cp cpVar = this.G;
            if (cpVar != null) {
                this.G = null;
                f(cpVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.f25619y;
        try {
            this.f25616s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21019i5, p6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Lf, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
