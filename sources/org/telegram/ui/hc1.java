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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;
public final class hc1 implements ff0 {
    public final org.telegram.ui.Cells.q1 f47662a;
    public final org.telegram.ui.Components.uj0 f47663b;
    public final float f47664c;
    public float d;
    public final Paint f47665e = new Paint(1);
    public final ValueAnimator f47666f;
    public final ChatActivityEnterView.RecordCircle f47667g;
    public final int h;
    public final org.telegram.ui.Components.ji f47668i;
    public final org.telegram.ui.ActionBar.e6 f47669j;
    public float f47670k;
    public float f47671l;

    public hc1(org.telegram.ui.Cells.q1 q1Var, qj qjVar, org.telegram.ui.Components.uj0 uj0Var, org.telegram.ui.Components.ji jiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f47669j = e6Var;
        this.f47662a = q1Var;
        this.f47668i = jiVar;
        this.f47663b = uj0Var;
        q1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = qjVar.getRecordCircle();
        this.f47667g = recordCircle;
        if (recordCircle != null) {
            this.f47664c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = q1Var.getMessageObject().f23829m1;
        ((ArrayList) jiVar.f36007c).add(this);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47666f = ofFloat;
        ofFloat.addUpdateListener(new ch.v(24, this, jiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new gc1(this, q1Var, jiVar));
        if (q1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.tm0 seekBarWaveform = q1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.f39733n;
            if (q1Var2 != null) {
                q1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f10;
        float x10;
        float y10;
        float x11;
        float f11;
        float f12;
        final float f13 = this.d;
        if (f13 > 0.6f) {
            f10 = 1.0f;
        } else {
            f10 = f13 / 0.6f;
        }
        float f14 = 0.0f;
        ChatActivityEnterView.RecordCircle recordCircle = this.f47667g;
        org.telegram.ui.Components.ji jiVar = this.f47668i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.K) - jiVar.getX();
        }
        if (recordCircle != null) {
            f14 = (recordCircle.getY() + recordCircle.L) - jiVar.getY();
        }
        final float f15 = f14;
        org.telegram.ui.Cells.q1 q1Var = this.f47662a;
        int i7 = q1Var.getMessageObject().f23829m1;
        int i10 = this.h;
        org.telegram.ui.Components.uj0 uj0Var = this.f47663b;
        if (i7 != i10) {
            x11 = this.f47670k;
            y10 = this.f47671l;
        } else {
            y10 = (uj0Var.getY() + (q1Var.getY() + q1Var.getRadialProgress().f32655a.centerY())) - jiVar.getY();
            x11 = (uj0Var.getX() + (q1Var.getX() + q1Var.getRadialProgress().f32655a.centerX())) - jiVar.getX();
        }
        this.f47670k = x11;
        this.f47671l = y10;
        float interpolation = org.telegram.ui.Components.er.f34419f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.er.h.getInterpolation(f13);
        final float f16 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f17 = 1.0f - interpolation;
        final float f18 = (y10 * interpolation) + (f15 * f17);
        float height = q1Var.getRadialProgress().f32655a.height() / 2.0f;
        float f19 = (height * interpolation) + (this.f47664c * f17);
        uj0Var.getY();
        jiVar.getY();
        uj0Var.getMeasuredHeight();
        if (jiVar.getMeasuredHeight() > 0) {
            jiVar.getMeasuredHeight();
        }
        int i11 = q1Var.getRadialProgress().f32668p;
        int i12 = org.telegram.ui.ActionBar.j6.Uf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47669j;
        float f20 = f10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i12, e6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f21 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        Paint paint = this.f47665e;
        paint.setColor(f21);
        if (recordCircle != null) {
            float f22 = 1.0f - f20;
            org.telegram.ui.Components.o9 o9Var = recordCircle.h;
            org.telegram.ui.Components.o9 o9Var2 = recordCircle.f32348n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.er.f34420g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f23 = chatActivityEnterView.R4;
            if (f23 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f23 / 0.7f;
            }
            canvas.save();
            float f24 = ((o9Var2.f37881t * 1.4f) + 0.878f) * chatActivityEnterView.P4 * f12 * interpolation3 * f22;
            canvas.scale(f24, f24, f16, f18);
            o9Var2.a(f16, f18, canvas, o9Var2.d);
            canvas.restore();
            float f25 = ((o9Var.f37881t * 1.4f) + 0.926f) * chatActivityEnterView.P4 * f12 * interpolation3 * f22;
            canvas.save();
            canvas.scale(f25, f25, f16, f18);
            o9Var.a(f16, f18, canvas, o9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f16, f18, f19, paint);
        canvas.save();
        final float f26 = f19 / height;
        canvas.scale(f26, f26, f16, f18);
        final float centerX = f16 - q1Var.getRadialProgress().f32655a.centerX();
        final float centerY = f18 - q1Var.getRadialProgress().f32655a.centerY();
        canvas.translate(centerX, centerY);
        q1Var.getRadialProgress().E = interpolation;
        q1Var.getRadialProgress().B = false;
        final float f27 = f11;
        q1Var.C1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f28;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                hc1 hc1Var = hc1.this;
                RadialProgress2 radialProgress = hc1Var.f47662a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f29 = centerX;
                float f30 = centerY;
                canvas3.translate(-f29, -f30);
                float f31 = f26;
                float f32 = 1.0f / f31;
                float f33 = f16;
                float f34 = f18;
                canvas3.scale(f32, f32, f33, f34);
                ChatActivityEnterView.RecordCircle recordCircle2 = hc1Var.f47667g;
                if (recordCircle2 != null) {
                    int i13 = (int) f27;
                    int i14 = (int) f15;
                    float f35 = 1.0f - f13;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f32159a5;
                    Rect rect = chatActivityEnterView2.B4;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f32347f != 1.0f) {
                            if (chatActivityEnterView2.f32178d1) {
                                drawable3 = chatActivityEnterView2.f32328y4;
                            } else {
                                drawable3 = chatActivityEnterView2.f32320x4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.f32335z4;
                        canvas2 = canvas3;
                        f28 = f35;
                        rect.set(org.telegram.ui.Cells.y0.A(2, i13, drawable2), org.telegram.ui.Cells.y0.y(2, i14, drawable2), org.telegram.ui.Cells.y0.w(2, i13, drawable2), org.telegram.ui.Cells.y0.h(2, i14, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.y0.A(2, i13, drawable4), org.telegram.ui.Cells.y0.y(2, i14, drawable4), org.telegram.ui.Cells.y0.w(2, i13, drawable4), org.telegram.ui.Cells.y0.h(2, i14, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f28 = f35;
                        if (chatActivityEnterView2.f32178d1) {
                            drawable = chatActivityEnterView2.f32328y4;
                        } else {
                            drawable = chatActivityEnterView2.f32320x4;
                        }
                        drawable2 = drawable;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    float f36 = 1.0f;
                    float L = (recordCircle2.M - org.telegram.messenger.g0.L(19.0f)) / Math.max(1.0f, recordCircle2.f32349r - org.telegram.messenger.g0.L(19.0f));
                    if (L < 0.0f) {
                        f36 = 0.0f;
                    } else if (L <= 1.0f) {
                        f36 = L;
                    }
                    recordCircle2.f32344d0 = f36;
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable5, drawable6, recordCircle2.f32347f, (int) (255.0f * f28));
                }
                canvas3.scale(f31, f31, f33, f34);
                canvas3.translate(f29, f30);
            }
        });
        q1Var.getRadialProgress().B = true;
        q1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
