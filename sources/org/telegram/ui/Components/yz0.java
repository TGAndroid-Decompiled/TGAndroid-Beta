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
public class yz0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public uo H;
    public final k9 I;
    public final int J;
    public sp0 K;
    public final int L;
    public int M;
    public float N;
    public org.telegram.ui.zm O;
    public boolean P;
    public final ImageReceiver Q;
    public u8 R;
    public final org.telegram.ui.ActionBar.t4 S;
    public final org.telegram.ui.ActionBar.t4 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float f40864a;
    public boolean f40865a0;
    public final float f40866b;
    public final float f40867c;
    public final float d;
    public final float f40868e;
    public xz0 f40869f;
    public xz0 h;
    public float f40870n;
    public final Paint f40871r;
    public final Paint f40872s;
    public final RectF f40873w;
    public final Path f40874x;
    public final org.telegram.ui.ActionBar.e6 f40875y;

    public yz0(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40864a = org.telegram.messenger.g0.L(8.0f);
        this.f40866b = org.telegram.messenger.g0.L(6.0f);
        this.f40867c = org.telegram.messenger.g0.L(4.0f);
        this.d = org.telegram.messenger.g0.L(21.0f);
        this.f40868e = org.telegram.messenger.g0.L(41.0f);
        this.f40869f = new xz0(this);
        this.f40870n = 1.0f;
        Paint paint = new Paint(1);
        this.f40871r = paint;
        this.f40872s = new Paint(1);
        this.f40873w = new RectF();
        this.f40874x = new Path();
        this.S = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.T = new org.telegram.ui.ActionBar.t4(0, false, false, null);
        this.L = i10;
        this.J = i3;
        this.f40875y = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(8.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27971i5, this, e6Var);
        k9 k9Var = new k9(context);
        this.I = k9Var;
        k9Var.getImageReceiver().B0 = true;
        k9Var.getImageReceiver().f21274v0 = false;
        k9Var.getImageReceiver().W(0);
        if (i10 != 0 && i10 != 3 && i10 != 2) {
            addView(k9Var, b8.mf.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(k9Var, b8.mf.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
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
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, this.f40875y));
        this.F.setTextSize(org.telegram.messenger.g0.L(c()));
        this.F.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(52.0f);
        int i3 = this.L;
        if (i3 == 3 || i3 == 4) {
            L = org.telegram.messenger.g0.L(77.0f);
        }
        String b10 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = lu0.d(b10, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return org.telegram.messenger.bd.M0(2131752217, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().B() != null) {
            org.telegram.messenger.g0.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().B().f32734l0) {
                this.I.getImageReceiver().B().N(0, true, false);
                this.I.getImageReceiver().B().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(org.telegram.messenger.g0.H).start();
            sp0 sp0Var = new sp0(this, 16);
            this.K = sp0Var;
            org.telegram.messenger.g0.i3(sp0Var, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        xz0 xz0Var;
        xz0 xz0Var2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.f40874x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.f40870n != 1.0f && (xz0Var2 = this.h) != null) {
            xz0Var2.b(canvas, 1.0f);
        }
        float f10 = this.f40870n;
        if (f10 != 0.0f) {
            this.f40869f.b(canvas, f10);
        }
        if (this.f40870n != 1.0f && (xz0Var = this.h) != null) {
            xz0Var.a(canvas, 1.0f);
        }
        float f11 = this.f40870n;
        if (f11 != 0.0f) {
            this.f40869f.a(canvas, f11);
        }
        float f12 = this.f40870n;
        if (f12 != 1.0f) {
            float f13 = f12 + 0.10666667f;
            this.f40870n = f13;
            if (f13 >= 1.0f) {
                this.f40870n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(org.telegram.ui.Components.uo r23, long r24, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yz0.f(org.telegram.ui.Components.uo, long, boolean):void");
    }

    public final void g(boolean z10, boolean z11) {
        float f10 = 0.0f;
        if (!z11) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f40865a0 = z10;
            if (z10) {
                f10 = 1.0f;
            }
            this.N = f10;
            invalidate();
            return;
        }
        if (this.f40865a0 != z10) {
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
            ofFloat.addUpdateListener(new y50(this, 26));
            this.E.addListener(new s9(20, this, z10));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.f40865a0 = z10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        this.P = true;
        org.telegram.ui.zm zmVar = this.O;
        if (zmVar != null) {
            zmVar.f(this);
        }
        this.Q.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        this.P = false;
        org.telegram.ui.zm zmVar = this.O;
        if (zmVar != null) {
            zmVar.g(this);
        }
        this.Q.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.f40865a0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
            int size2 = View.MeasureSpec.getSize(i3);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        k9 k9Var = this.I;
        k9Var.setPivotY(k9Var.getMeasuredHeight());
        k9Var.setPivotX(k9Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 == i11 && i10 == i12) {
            return;
        }
        float f10 = this.f40867c;
        RectF rectF = this.f40873w;
        rectF.set(f10, f10, i3 - f10, i10 - f10);
        Path path = this.f40874x;
        path.reset();
        float f11 = this.f40866b;
        path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i3) {
        int i10 = org.telegram.ui.ActionBar.k6.f27971i5;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40875y;
        this.f40872s.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, e6Var));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            uo uoVar = this.H;
            if (uoVar != null) {
                this.H = null;
                f(uoVar, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f40875y;
        try {
            this.f40872s.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, e6Var));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Lf, e6Var));
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
