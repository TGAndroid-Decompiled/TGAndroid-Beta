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
public class b01 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public dp H;
    public final i9 I;
    public final int J;
    public ro0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.dn O;
    public boolean P;
    public final ImageReceiver Q;
    public t8 R;
    public final org.telegram.ui.ActionBar.r4 S;
    public final org.telegram.ui.ActionBar.r4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float f33126a;
    public boolean f33127a0;
    public final float f33128b;
    public final float f33129c;
    public final float d;
    public final float f33130e;
    public a01 f33131f;
    public a01 h;
    public float f33132n;
    public final Paint f33133r;
    public final Paint f33134s;
    public final RectF f33135w;
    public final Path f33136x;
    public final org.telegram.ui.ActionBar.e6 f33137y;

    public b01(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33126a = org.telegram.messenger.g0.L(8.0f);
        this.f33128b = org.telegram.messenger.g0.L(6.0f);
        this.f33129c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.f33130e = org.telegram.messenger.g0.L(41.0f);
        this.f33131f = new a01(this);
        this.f33132n = 1.0f;
        Paint paint = new Paint(1);
        this.f33133r = paint;
        this.f33134s = new Paint(1);
        this.f33135w = new RectF();
        this.f33136x = new Path();
        this.S = new org.telegram.ui.ActionBar.r4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.r4(0, false, false, null);
        this.L = i10;
        this.J = i7;
        this.f33137y = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28940i5, this, e6Var);
        i9 i9Var = new i9(context);
        this.I = i9Var;
        i9Var.getImageReceiver().B0 = true;
        i9Var.getImageReceiver().f22303v0 = false;
        i9Var.getImageReceiver().W(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(i9Var, c8.ja.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(i9Var, c8.ja.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Of, this.f33137y));
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
        StaticLayout d = ou0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.hd.M0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().B().f33588l0) {
                this.I.getImageReceiver().B().N(0, true, false);
                this.I.getImageReceiver().B().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            ro0 ro0Var = new ro0(this, 17);
            this.K = ro0Var;
            org.telegram.messenger.g0.i3(ro0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25515i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a01 a01Var;
        a01 a01Var2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.f33136x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.f33132n != 1.0f && (a01Var2 = this.h) != null) {
            a01Var2.b(canvas, 1.0f);
        }
        float f10 = this.f33132n;
        if (f10 != 0.0f) {
            this.f33131f.b(canvas, f10);
        }
        if (this.f33132n != 1.0f && (a01Var = this.h) != null) {
            a01Var.a(canvas, 1.0f);
        }
        float f11 = this.f33132n;
        if (f11 != 0.0f) {
            this.f33131f.a(canvas, f11);
        }
        float f12 = this.f33132n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f33132n = f13;
            if (f13 >= 1.0f) {
                this.f33132n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.dp r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b01.f(org.telegram.ui.Components.dp, long, boolean):void");
    }

    public final void g(boolean z10, boolean z11) {
        float f10 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f33127a0 = z10;
            if (z10) {
                f10 = 1.0f;
            }
            this.N = f10;
            invalidate();
            return;
        }
        if (this.f33127a0 != z10) {
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
            ofFloat.addUpdateListener(new f60(this, 25));
            this.E.addListener(new org.telegram.ui.nn(21, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.f33127a0 = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
        this.P = true;
        org.telegram.ui.dn dnVar = this.O;
        if (dnVar != null) {
            dnVar.f(this);
        }
        this.Q.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
        this.P = false;
        org.telegram.ui.dn dnVar = this.O;
        if (dnVar != null) {
            dnVar.g(this);
        }
        this.Q.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.f33127a0);
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
        i9 i9Var = this.I;
        i9Var.setPivotY(i9Var.getMeasuredHeight());
        i9Var.setPivotX(i9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f33129c;
        RectF rectF = this.f33135w;
        rectF.set(f10, f10, i7 - f10, i10 - f10);
        Path path = this.f33136x;
        path.reset();
        float f11 = this.f33128b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i7) {
        int i10 = org.telegram.ui.ActionBar.j6.f28940i5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33137y;
        this.f33134s.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Of, e6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            dp dpVar = this.H;
            if (dpVar != null) {
                this.H = null;
                f(dpVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f33137y;
        try {
            this.f33134s.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, e6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Of, e6Var));
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
