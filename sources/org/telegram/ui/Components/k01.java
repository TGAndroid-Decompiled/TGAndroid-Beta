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
public class k01 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public mp H;
    public final q9 I;
    public final int J;
    public cp0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.en O;
    public boolean P;
    public final ImageReceiver Q;
    public b9 R;
    public final org.telegram.ui.ActionBar.u4 S;
    public final org.telegram.ui.ActionBar.u4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float f36694a;
    public boolean f36695a0;
    public final float f36696b;
    public final float f36697c;
    public final float d;
    public final float f36698e;
    public j01 f36699f;
    public j01 h;
    public float f36700n;
    public final Paint f36701r;
    public final Paint f36702s;
    public final RectF f36703w;
    public final Path f36704x;
    public final org.telegram.ui.ActionBar.h6 f36705y;

    public k01(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f36694a = org.telegram.messenger.g0.L(8.0f);
        this.f36696b = org.telegram.messenger.g0.L(6.0f);
        this.f36697c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.f36698e = org.telegram.messenger.g0.L(41.0f);
        this.f36699f = new j01(this);
        this.f36700n = 1.0f;
        Paint paint = new Paint(1);
        this.f36701r = paint;
        this.f36702s = new Paint(1);
        this.f36703w = new RectF();
        this.f36704x = new Path();
        this.S = new org.telegram.ui.ActionBar.u4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.u4(0, false, false, null);
        this.L = i10;
        this.J = i7;
        this.f36705y = h6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29438i5, this, h6Var);
        q9 q9Var = new q9(context);
        this.I = q9Var;
        q9Var.getImageReceiver().B0 = true;
        q9Var.getImageReceiver().f22661v0 = false;
        q9Var.getImageReceiver().W(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(q9Var, c8.na.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(q9Var, c8.na.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(org.telegram.messenger.g0.L(120.0f) / bitmap.getWidth(), org.telegram.messenger.g0.L(140.0f) / bitmap.getHeight());
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
        StaticLayout staticLayout = this.G;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.F = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Of, this.f36705y));
        this.F.setTextSize(org.telegram.messenger.g0.L(c()));
        this.F.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i7 = this.L;
        if (i7 == 3 || i7 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = zu0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.hd.N0(2131752205, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().B().f38188l0) {
                this.I.getImageReceiver().B().N(0, true, false);
                this.I.getImageReceiver().B().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            cp0 cp0Var = new cp0(this, 17);
            this.K = cp0Var;
            org.telegram.messenger.g0.h3(cp0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25306l4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j01 j01Var;
        j01 j01Var2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.f36704x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.f36700n != 1.0f && (j01Var2 = this.h) != null) {
            j01Var2.b(canvas, 1.0f);
        }
        float f10 = this.f36700n;
        if (f10 != 0.0f) {
            this.f36699f.b(canvas, f10);
        }
        if (this.f36700n != 1.0f && (j01Var = this.h) != null) {
            j01Var.a(canvas, 1.0f);
        }
        float f11 = this.f36700n;
        if (f11 != 0.0f) {
            this.f36699f.a(canvas, f11);
        }
        float f12 = this.f36700n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f36700n = f13;
            if (f13 >= 1.0f) {
                this.f36700n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.mp r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k01.f(org.telegram.ui.Components.mp, long, boolean):void");
    }

    public final void g(boolean z10, boolean z11) {
        float f10 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f36695a0 = z10;
            if (z10) {
                f10 = 1.0f;
            }
            this.N = f10;
            invalidate();
            return;
        }
        if (this.f36695a0 != z10) {
            float f11 = this.N;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new h60(this, 27));
            this.E.addListener(new org.telegram.ui.on(21, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.f36695a0 = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25306l4);
        this.P = true;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.f(this);
        }
        this.Q.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25306l4);
        this.P = false;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.g(this);
        }
        this.Q.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.f36695a0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = this.L;
        if (i11 != 1 && i11 != 4) {
            if (i11 == 0) {
                f10 = 77.0f;
            } else {
                f10 = 83.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int size = View.MeasureSpec.getSize(i10);
            if (size == 0) {
                size = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i7);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        q9 q9Var = this.I;
        q9Var.setPivotY(q9Var.getMeasuredHeight());
        q9Var.setPivotX(q9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f36697c;
        RectF rectF = this.f36703w;
        rectF.set(f10, f10, i7 - f10, i10 - f10);
        Path path = this.f36704x;
        path.reset();
        float f11 = this.f36696b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i7) {
        int i10 = org.telegram.ui.ActionBar.m6.f29438i5;
        org.telegram.ui.ActionBar.h6 h6Var = this.f36705y;
        this.f36702s.setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Of, h6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            mp mpVar = this.H;
            if (mpVar != null) {
                this.H = null;
                f(mpVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f36705y;
        try {
            this.f36702s.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29438i5, h6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Of, h6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
