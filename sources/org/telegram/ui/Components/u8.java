package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public abstract class u8 extends FrameLayout {
    public float A;
    public final v8 B;

    public long f33002a;

    public TLRPC.Document f33003b;

    public final jh.z3 f33004c;
    public final c20 d;

    public final c20 f33005e;

    public float f33006f;
    public r8 h;

    public boolean f33007n;

    public final PorterDuffColorFilter f33008r;

    public final y5 f33009s;
    public boolean v;

    public float f33010w;

    public float f33011x;

    public float f33012y;

    public u8(v8 v8Var, Context context) {
        super(context);
        this.B = v8Var;
        this.d = new c20();
        this.f33005e = new c20();
        this.f33006f = 1.0f;
        this.f33008r = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.f33009s = new y5(this, 200L, er.f28123g);
        this.f33010w = -1.0f;
        jh.z3 z3Var = new jh.z3(this, context, 6);
        this.f33004c = z3Var;
        z3Var.getImageReceiver().setAutoRepeatCount(1);
        z3Var.getImageReceiver().setAspectFit(true);
        setClipChildren(false);
        addView(z3Var, h7.z5.e(70, 70, 17));
    }

    public final void a(Canvas canvas, float f10, float f11, float f12, float f13, Paint paint) {
        float f14 = this.f33009s.f34812c;
        if (f14 == 0.0f) {
            canvas.drawCircle(f10, f11, f13, paint);
            return;
        }
        float fLerp = AndroidUtilities.lerp(f12, 0.0f, f14);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10 - f13, f11 - f13, f10 + f13, f11 + f13);
        canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
    }

    public final void b(r8 r8Var, boolean z10) {
        r8 r8Var2 = this.h;
        if (r8Var2 != null) {
            this.f33005e.d(r8Var2.f32101c, r8Var2.d, r8Var2.f32102e, r8Var2.f32103f);
            this.f33006f = 0.0f;
            this.B.f33300n = true;
        }
        this.h = r8Var;
        this.f33007n = z10;
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u8 u8Var;
        Canvas canvas2;
        int iDp;
        float fLerp;
        jh.z3 z3Var;
        k5 k5Var;
        jh.y2 y2Var;
        this.f33012y = getMeasuredWidth() / 2.0f;
        this.A = getMeasuredHeight() / 2.0f;
        v8 v8Var = this.B;
        float measuredWidth = v8Var.Q ? getMeasuredWidth() * 0.3f : AndroidUtilities.dp(50.0f);
        float f10 = this.v ? 1.0f : 0.0f;
        y5 y5Var = this.f33009s;
        y5Var.d(f10, false);
        float f11 = this.f33010w;
        if (f11 >= 0.0f) {
            y5Var.d(f11, true);
        }
        float fLerp2 = AndroidUtilities.lerp(measuredWidth, getMeasuredWidth() / 2.0f, y5Var.f34812c);
        this.f33011x = fLerp2;
        this.f33011x = AndroidUtilities.lerp(fLerp2, AndroidUtilities.dp(21.0f), v8Var.J);
        this.f33012y = AndroidUtilities.lerp(this.f33012y, (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(21.0f), v8Var.J);
        canvas.save();
        int i10 = v8Var.d - v8Var.f33297c;
        canvas.clipRect(0.0f, (-i10) / 2.0f, getMeasuredWidth(), ((i10 / 2.0f) * v8Var.A) + getMeasuredHeight());
        r8 r8Var = this.h;
        if (r8Var != null) {
            int i11 = r8Var.f32101c;
            int i12 = r8Var.d;
            int i13 = r8Var.f32102e;
            int i14 = r8Var.f32103f;
            c20 c20Var = this.d;
            c20Var.d(i11, i12, i13, i14);
            Paint paint = c20Var.f27292c;
            float f12 = this.f33012y;
            float f13 = this.f33011x;
            float f14 = this.A;
            c20Var.b(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (this.f33006f != 1.0f) {
                float f15 = this.f33012y;
                float f16 = this.f33011x;
                float f17 = f15 - f16;
                float f18 = this.A;
                float f19 = f18 - f16;
                float f20 = f15 + f16;
                float f21 = f18 + f16;
                c20 c20Var2 = this.f33005e;
                c20Var2.b(f17, f19, f20, f21);
                Paint paint2 = c20Var2.f27292c;
                paint2.setAlpha(255);
                u8Var = this;
                u8Var.a(canvas, this.f33012y, this.A, measuredWidth, this.f33011x, paint2);
                paint.setAlpha((int) (u8Var.f33006f * 255.0f));
                u8Var.a(canvas, u8Var.f33012y, u8Var.A, measuredWidth, u8Var.f33011x, paint);
                float f22 = u8Var.f33006f + 0.064f;
                u8Var.f33006f = f22;
                if (f22 > 1.0f) {
                    canvas = canvas;
                    u8Var.f33006f = 1.0f;
                }
                canvas = canvas;
                invalidate();
            } else {
                u8Var = this;
                paint.setAlpha(255);
                canvas2 = canvas;
                u8Var.a(canvas2, u8Var.f33012y, u8Var.A, measuredWidth, u8Var.f33011x, paint);
            }
            if (v8Var.Q) {
                iDp = (int) (measuredWidth * 2.0f * 0.7f);
            } else {
                iDp = AndroidUtilities.dp(70.0f);
            }
            fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(iDp, (int) (getMeasuredWidth() * 0.7f), y5Var.f34812c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), v8Var.J) / 2.0f;
            z3Var = u8Var.f33004c;
            k5Var = z3Var.f30901e;
            if (k5Var != null) {
                ImageReceiver imageReceiver = z3Var.f30898a;
                float f23 = u8Var.f33012y - fLerp;
                float f24 = u8Var.A - fLerp;
                float f25 = fLerp * 2.0f;
                imageReceiver.setImageCoords(f23, f24, f25, f25);
                z3Var.f30898a.setRoundRadius((int) (f25 * 0.13f));
                z3Var.f30898a.draw(canvas2);
                return;
            }
            y2Var = k5Var.f29961k;
            if (y2Var != null) {
                y2Var.setRoundRadius((int) (2.0f * fLerp * 0.13f));
            }
            k5 k5Var2 = z3Var.f30901e;
            float f26 = u8Var.f33012y;
            float f27 = u8Var.A;
            k5Var2.setBounds((int) (f26 - fLerp), (int) (f27 - fLerp), (int) (f26 + fLerp), (int) (f27 + fLerp));
            z3Var.f30901e.setColorFilter(u8Var.f33008r);
            z3Var.f30901e.draw(canvas2);
        }
        u8Var = this;
        canvas2 = canvas;
        if (v8Var.Q) {
            iDp = (int) (measuredWidth * 2.0f * 0.7f);
        } else {
            iDp = AndroidUtilities.dp(70.0f);
        }
        fLerp = AndroidUtilities.lerp(AndroidUtilities.lerp(iDp, (int) (getMeasuredWidth() * 0.7f), y5Var.f34812c), (int) (AndroidUtilities.dp(42.0f) * 0.7f), v8Var.J) / 2.0f;
        z3Var = u8Var.f33004c;
        k5Var = z3Var.f30901e;
        if (k5Var != null) {
            ImageReceiver imageReceiver2 = z3Var.f30898a;
            float f28 = u8Var.f33012y - fLerp;
            float f29 = u8Var.A - fLerp;
            float f210 = fLerp * 2.0f;
            imageReceiver2.setImageCoords(f28, f29, f210, f210);
            z3Var.f30898a.setRoundRadius((int) (f210 * 0.13f));
            z3Var.f30898a.draw(canvas2);
            return;
        }
        y2Var = k5Var.f29961k;
        if (y2Var != null) {
            y2Var.setRoundRadius((int) (2.0f * fLerp * 0.13f));
        }
        k5 k5Var3 = z3Var.f30901e;
        float f211 = u8Var.f33012y;
        float f212 = u8Var.A;
        k5Var3.setBounds((int) (f211 - fLerp), (int) (f212 - fLerp), (int) (f211 + fLerp), (int) (f212 + fLerp));
        z3Var.f30901e.setColorFilter(u8Var.f33008r);
        z3Var.f30901e.draw(canvas2);
    }

    public long getDuration() {
        jh.z3 z3Var = this.f33004c;
        ImageReceiver imageReceiver = z3Var.getImageReceiver();
        k5 k5Var = z3Var.f30901e;
        if (k5Var != null) {
            imageReceiver = k5Var.f29961k;
        }
        if (imageReceiver == null || imageReceiver.getLottieAnimation() == null) {
            return 5000L;
        }
        return imageReceiver.getLottieAnimation().p();
    }

    public ImageReceiver getImageReceiver() {
        jh.z3 z3Var = this.f33004c;
        ImageReceiver imageReceiver = z3Var.getImageReceiver();
        k5 k5Var = z3Var.f30901e;
        if (k5Var == null) {
            return imageReceiver;
        }
        jh.y2 y2Var = k5Var.f29961k;
        k5Var.setColorFilter(this.f33008r);
        return y2Var;
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.B.fragmentView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.B.Q) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(140.0f), 1073741824));
        }
    }

    public void setExpanded(boolean z10) {
        jh.y2 y2Var;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        if (z10) {
            jh.z3 z3Var = this.f33004c;
            k5 k5Var = z3Var.f30901e;
            if (k5Var != null && (y2Var = k5Var.f29961k) != null) {
                y2Var.startAnimation();
            }
            z3Var.f30898a.startAnimation();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        invalidate();
    }
}
