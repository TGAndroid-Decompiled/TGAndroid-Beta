package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;
public final class di1 implements sh0 {
    public final org.telegram.ui.Cells.t1 f33661a;
    public final org.telegram.ui.Components.sl0 f33662b;
    public final float f33663c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f33664f;
    public final ChatActivityEnterView.RecordCircle f33665g;
    public final int h;
    public final org.telegram.ui.Components.ki f33666i;
    public final org.telegram.ui.ActionBar.f6 f33667j;
    public float f33668k;
    public float f33669l;

    public di1(org.telegram.ui.Cells.t1 t1Var, jk jkVar, org.telegram.ui.Components.sl0 sl0Var, org.telegram.ui.Components.ki kiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f33667j = f6Var;
        this.f33661a = t1Var;
        this.f33666i = kiVar;
        this.f33662b = sl0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.f33665g = recordCircle;
        if (recordCircle != null) {
            this.f33663c = recordCircle.I;
            recordCircle.J = true;
            recordCircle.K = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) kiVar.f26277c).add(this);
        kiVar.a();
        ((ViewGroup) kiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f33664f = ofFloat;
        ofFloat.addUpdateListener(new ag.a(24, this, kiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ci1(this, t1Var, kiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.mo0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f27093n;
            if (t1Var2 != null) {
                t1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f10;
        float x10;
        final float y10;
        float y11;
        float x11;
        float f11;
        float f12;
        final float f13 = this.d;
        if (f13 > 0.6f) {
            f10 = 1.0f;
        } else {
            f10 = f13 / 0.6f;
        }
        ChatActivityEnterView.RecordCircle recordCircle = this.f33665g;
        org.telegram.ui.Components.ki kiVar = this.f33666i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.G) - kiVar.getX();
        }
        if (recordCircle == null) {
            y10 = 0.0f;
        } else {
            y10 = (recordCircle.getY() + recordCircle.H) - kiVar.getY();
        }
        org.telegram.ui.Cells.t1 t1Var = this.f33661a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.sl0 sl0Var = this.f33662b;
        if (i10 != i11) {
            x11 = this.f33668k;
            y11 = this.f33669l;
        } else {
            y11 = (sl0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().f23112a.centerY())) - kiVar.getY();
            x11 = (sl0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().f23112a.centerX())) - kiVar.getX();
        }
        this.f33668k = x11;
        this.f33669l = y11;
        float interpolation = org.telegram.ui.Components.nr.f27346f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.nr.h.getInterpolation(f13);
        final float f14 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f15 = 1.0f - interpolation;
        final float f16 = (y11 * interpolation) + (y10 * f15);
        float height = t1Var.getRadialProgress().f23112a.height() / 2.0f;
        float f17 = (height * interpolation) + (this.f33663c * f15);
        sl0Var.getY();
        kiVar.getY();
        sl0Var.getMeasuredHeight();
        if (kiVar.getMeasuredHeight() > 0) {
            kiVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().f23124p;
        int i13 = org.telegram.ui.ActionBar.j6.f19897cf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f33667j;
        float f18 = f10;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f19 = 1.0f - f18;
            org.telegram.ui.Components.u9 u9Var = recordCircle.h;
            org.telegram.ui.Components.u9 u9Var2 = recordCircle.f22878n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.nr.f27347g.getInterpolation(recordCircle.E);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.f22766f4;
            if (f20 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f20 / 0.7f;
            }
            canvas.save();
            float f21 = ((u9Var2.f29147t * 1.4f) + 0.878f) * chatActivityEnterView.f22753d4 * f12 * interpolation3 * f19;
            canvas.scale(f21, f21, f14, f16);
            u9Var2.a(f14, f16, canvas, u9Var2.d);
            canvas.restore();
            float f22 = ((u9Var.f29147t * 1.4f) + 0.926f) * chatActivityEnterView.f22753d4 * f12 * interpolation3 * f19;
            canvas.save();
            canvas.scale(f22, f22, f14, f16);
            u9Var.a(f14, f16, canvas, u9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f14, f16, f17, paint);
        canvas.save();
        final float f23 = f17 / height;
        canvas.scale(f23, f23, f14, f16);
        final float centerX = f14 - t1Var.getRadialProgress().f23112a.centerX();
        final float centerY = f16 - t1Var.getRadialProgress().f23112a.centerY();
        canvas.translate(centerX, centerY);
        t1Var.getRadialProgress().E = interpolation;
        t1Var.getRadialProgress().B = false;
        final float f24 = f11;
        t1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f25;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                di1 di1Var = di1.this;
                RadialProgress2 radialProgress = di1Var.f33661a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f26 = centerX;
                float f27 = centerY;
                canvas3.translate(-f26, -f27);
                float f28 = f23;
                float f29 = 1.0f / f28;
                float f30 = f14;
                float f31 = f16;
                canvas3.scale(f29, f29, f30, f31);
                ChatActivityEnterView.RecordCircle recordCircle2 = di1Var.f33665g;
                if (recordCircle2 != null) {
                    int i14 = (int) f24;
                    int i15 = (int) y10;
                    float f32 = 1.0f - f13;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z4 = chatActivityEnterView2.f22814o4;
                    Rect rect = chatActivityEnterView2.P3;
                    Drawable drawable4 = null;
                    if (z4) {
                        if (recordCircle2.f22877f != 1.0f) {
                            if (chatActivityEnterView2.Z0) {
                                drawable3 = chatActivityEnterView2.M3;
                            } else {
                                drawable3 = chatActivityEnterView2.L3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.N3;
                        canvas2 = canvas3;
                        f25 = f32;
                        rect.set(b.u(2, i14, drawable2), b.f(2, i15, drawable2), b.A(2, i14, drawable2), b.y(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(b.u(2, i14, drawable4), b.f(2, i15, drawable4), b.A(2, i14, drawable4), b.y(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        if (chatActivityEnterView2.Z0) {
                            drawable = chatActivityEnterView2.M3;
                        } else {
                            drawable = chatActivityEnterView2.L3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f22877f, (int) (255.0f * f25));
                }
                canvas3.scale(f28, f28, f30, f31);
                canvas3.translate(f26, f27);
            }
        });
        t1Var.getRadialProgress().B = true;
        t1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
