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
public class j01 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public jp H;
    public final p9 I;
    public final int J;
    public bp0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.en O;
    public boolean P;
    public final ImageReceiver Q;
    public a9 R;
    public final org.telegram.ui.ActionBar.u4 S;
    public final org.telegram.ui.ActionBar.u4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float f36215a;
    public boolean f36216a0;
    public final float f36217b;
    public final float f36218c;
    public final float d;
    public final float f36219e;
    public i01 f36220f;
    public i01 h;
    public float f36221n;
    public final Paint f36222r;
    public final Paint f36223s;
    public final RectF f36224w;
    public final Path f36225x;
    public final org.telegram.ui.ActionBar.i6 f36226y;

    public j01(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f36215a = org.telegram.messenger.g0.L(8.0f);
        this.f36217b = org.telegram.messenger.g0.L(6.0f);
        this.f36218c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.f36219e = org.telegram.messenger.g0.L(41.0f);
        this.f36220f = new i01(this);
        this.f36221n = 1.0f;
        Paint paint = new Paint(1);
        this.f36222r = paint;
        this.f36223s = new Paint(1);
        this.f36224w = new RectF();
        this.f36225x = new Path();
        this.S = new org.telegram.ui.ActionBar.u4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.u4(0, false, false, null);
        this.L = i10;
        this.J = i7;
        this.f36226y = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.K0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29542i5, this, i6Var);
        p9 p9Var = new p9(context);
        this.I = p9Var;
        p9Var.getImageReceiver().B0 = true;
        p9Var.getImageReceiver().f22764v0 = false;
        p9Var.getImageReceiver().X(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(p9Var, c8.na.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(p9Var, c8.na.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, this.f36226y));
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
        StaticLayout d = yu0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.gd.N0(2131752205, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().C() != null) {
            org.telegram.messenger.g0.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().C().f37814l0) {
                this.I.getImageReceiver().C().N(0, true, false);
                this.I.getImageReceiver().C().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            bp0 bp0Var = new bp0(this, 17);
            this.K = bp0Var;
            org.telegram.messenger.g0.h3(bp0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i01 i01Var;
        i01 i01Var2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.f36225x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.f36221n != 1.0f && (i01Var2 = this.h) != null) {
            i01Var2.b(canvas, 1.0f);
        }
        float f10 = this.f36221n;
        if (f10 != 0.0f) {
            this.f36220f.b(canvas, f10);
        }
        if (this.f36221n != 1.0f && (i01Var = this.h) != null) {
            i01Var.a(canvas, 1.0f);
        }
        float f11 = this.f36221n;
        if (f11 != 0.0f) {
            this.f36220f.a(canvas, f11);
        }
        float f12 = this.f36221n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f36221n = f13;
            if (f13 >= 1.0f) {
                this.f36221n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.jp r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j01.f(org.telegram.ui.Components.jp, long, boolean):void");
    }

    public final void g(boolean z10, boolean z11) {
        float f10 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f36216a0 = z10;
            if (z10) {
                f10 = 1.0f;
            }
            this.N = f10;
            invalidate();
            return;
        }
        if (this.f36216a0 != z10) {
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
            ofFloat.addUpdateListener(new e60(this, 27));
            this.E.addListener(new org.telegram.ui.on(21, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.f36216a0 = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        this.P = true;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.f(this);
        }
        this.Q.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        this.P = false;
        org.telegram.ui.en enVar = this.O;
        if (enVar != null) {
            enVar.g(this);
        }
        this.Q.S();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.f36216a0);
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
        p9 p9Var = this.I;
        p9Var.setPivotY(p9Var.getMeasuredHeight());
        p9Var.setPivotX(p9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f36218c;
        RectF rectF = this.f36224w;
        rectF.set(f10, f10, i7 - f10, i10 - f10);
        Path path = this.f36225x;
        path.reset();
        float f11 = this.f36217b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i7) {
        int i10 = org.telegram.ui.ActionBar.n6.f29542i5;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36226y;
        this.f36223s.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, i6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            jp jpVar = this.H;
            if (jpVar != null) {
                this.H = null;
                f(jpVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f36226y;
        try {
            this.f36223s.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, i6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Of, i6Var));
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
