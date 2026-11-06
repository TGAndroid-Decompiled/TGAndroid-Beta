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
public class zz0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public ValueAnimator D;
    public TextPaint E;
    public StaticLayout F;
    public uo G;
    public final l9 H;
    public final int I;
    public ir0 J;
    public final int K;
    public int L;
    public float M;
    public org.telegram.ui.dn N;
    public boolean O;
    public final ImageReceiver P;
    public w8 Q;
    public final org.telegram.ui.ActionBar.t4 R;
    public final org.telegram.ui.ActionBar.t4 S;
    public TLRPC.WallPaper T;
    public long U;
    public int V;
    public boolean W;
    public final float f41164a;
    public final float f41165b;
    public final float f41166c;
    public final float d;
    public final float f41167e;
    public yz0 f41168f;
    public yz0 h;
    public float f41169n;
    public final Paint f41170r;
    public final Paint f41171s;
    public final RectF f41172w;
    public final Path f41173x;
    public final org.telegram.ui.ActionBar.f6 f41174y;

    public zz0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f41164a = org.telegram.messenger.g0.L(8.0f);
        this.f41165b = org.telegram.messenger.g0.L(6.0f);
        this.f41166c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.f41167e = org.telegram.messenger.g0.L(41.0f);
        this.f41168f = new yz0(this);
        this.f41169n = 1.0f;
        Paint paint = new Paint(1);
        this.f41170r = paint;
        this.f41171s = new Paint(1);
        this.f41172w = new RectF();
        this.f41173x = new Path();
        this.R = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.S = new org.telegram.ui.ActionBar.t4(0, false, false, null);
        this.K = i10;
        this.I = i7;
        this.f41174y = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27940i5, this, f6Var);
        l9 l9Var = new l9(context);
        this.H = l9Var;
        l9Var.getImageReceiver().A0 = true;
        l9Var.getImageReceiver().f21219u0 = false;
        l9Var.getImageReceiver().W(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(l9Var, c8.ha.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(l9Var, c8.ha.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.E = textPaint;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, this.f41174y));
        this.E.setTextSize(org.telegram.messenger.g0.L(c()));
        this.E.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i7 = this.K;
        if (i7 == 3 || i7 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.E;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = mu0.d(b10, textPaint2, true, L, 3);
        this.F = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.hd.M0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.H.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.J);
            this.H.setVisibility(0);
            if (!this.H.getImageReceiver().B().f40984k0) {
                this.H.getImageReceiver().B().N(0, true, false);
                this.H.getImageReceiver().B().start();
            }
            this.H.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            ir0 ir0Var = new ir0(this, 14);
            this.J = ir0Var;
            org.telegram.messenger.g0.i3(ir0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25009i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yz0 yz0Var;
        yz0 yz0Var2;
        if (this.G == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.N != null) {
            canvas.save();
            canvas.clipPath(this.f41173x);
            this.N.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.f41169n != 1.0f && (yz0Var2 = this.h) != null) {
            yz0Var2.b(canvas, 1.0f);
        }
        float f10 = this.f41169n;
        if (f10 != 0.0f) {
            this.f41168f.b(canvas, f10);
        }
        if (this.f41169n != 1.0f && (yz0Var = this.h) != null) {
            yz0Var.a(canvas, 1.0f);
        }
        float f11 = this.f41169n;
        if (f11 != 0.0f) {
            this.f41168f.a(canvas, f11);
        }
        float f12 = this.f41169n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f41169n = f13;
            if (f13 >= 1.0f) {
                this.f41169n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.uo r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zz0.f(org.telegram.ui.Components.uo, long, boolean):void");
    }

    public final void g(boolean z9, boolean z10) {
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W = z9;
            if (z9) {
                f10 = 1.0f;
            }
            this.M = f10;
            invalidate();
            return;
        }
        if (this.W != z9) {
            float f11 = this.M;
            ValueAnimator valueAnimator2 = this.D;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new c60(this, 25));
            this.D.addListener(new t9(20, this, z9));
            this.D.setDuration(250L);
            this.D.start();
        }
        this.W = z9;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        this.O = true;
        org.telegram.ui.dn dnVar = this.N;
        if (dnVar != null) {
            dnVar.f(this);
        }
        this.P.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
        this.O = false;
        org.telegram.ui.dn dnVar = this.N;
        if (dnVar != null) {
            dnVar.g(this);
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
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = this.K;
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
        l9 l9Var = this.H;
        l9Var.setPivotY(l9Var.getMeasuredHeight());
        l9Var.setPivotX(l9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f41166c;
        RectF rectF = this.f41172w;
        rectF.set(f10, f10, i7 - f10, i10 - f10);
        Path path = this.f41173x;
        path.reset();
        float f11 = this.f41165b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i7) {
        int i10 = org.telegram.ui.ActionBar.k6.f27940i5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f41174y;
        this.f41171s.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        TextPaint textPaint = this.E;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, f6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.T != wallPaper) {
            this.T = wallPaper;
            uo uoVar = this.G;
            if (uoVar != null) {
                this.G = null;
                f(uoVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f41174y;
        try {
            this.f41171s.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27940i5, f6Var));
            TextPaint textPaint = this.E;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, f6Var));
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
