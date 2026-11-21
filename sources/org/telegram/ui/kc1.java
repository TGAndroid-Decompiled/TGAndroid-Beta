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
public final class kc1 implements if0 {
    public final org.telegram.ui.Cells.r1 f49277a;
    public final org.telegram.ui.Components.ek0 f49278b;
    public final float f49279c;
    public float d;
    public final Paint f49280e = new Paint(1);
    public final ValueAnimator f49281f;
    public final ChatActivityEnterView.RecordCircle f49282g;
    public final int h;
    public final org.telegram.ui.Components.ti f49283i;
    public final org.telegram.ui.ActionBar.h6 f49284j;
    public float f49285k;
    public float f49286l;

    public kc1(org.telegram.ui.Cells.r1 r1Var, rj rjVar, org.telegram.ui.Components.ek0 ek0Var, org.telegram.ui.Components.ti tiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f49284j = h6Var;
        this.f49277a = r1Var;
        this.f49283i = tiVar;
        this.f49278b = ek0Var;
        r1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = rjVar.getRecordCircle();
        this.f49282g = recordCircle;
        if (recordCircle != null) {
            this.f49279c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = r1Var.getMessageObject().f24003m1;
        ((ArrayList) tiVar.f39927c).add(this);
        tiVar.a();
        ((ViewGroup) tiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49281f = ofFloat;
        ofFloat.addUpdateListener(new ch.w(24, this, tiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new jc1(this, r1Var, tiVar));
        if (r1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.en0 seekBarWaveform = r1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.r1 r1Var2 = seekBarWaveform.f34929n;
            if (r1Var2 != null) {
                r1Var2.invalidate();
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f49282g;
        org.telegram.ui.Components.ti tiVar = this.f49283i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.K) - tiVar.getX();
        }
        if (recordCircle != null) {
            f14 = (recordCircle.getY() + recordCircle.L) - tiVar.getY();
        }
        final float f15 = f14;
        org.telegram.ui.Cells.r1 r1Var = this.f49277a;
        int i7 = r1Var.getMessageObject().f24003m1;
        int i10 = this.h;
        org.telegram.ui.Components.ek0 ek0Var = this.f49278b;
        if (i7 != i10) {
            x11 = this.f49285k;
            y10 = this.f49286l;
        } else {
            y10 = (ek0Var.getY() + (r1Var.getY() + r1Var.getRadialProgress().f33085a.centerY())) - tiVar.getY();
            x11 = (ek0Var.getX() + (r1Var.getX() + r1Var.getRadialProgress().f33085a.centerX())) - tiVar.getX();
        }
        this.f49285k = x11;
        this.f49286l = y10;
        float interpolation = org.telegram.ui.Components.nr.f37956f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.nr.h.getInterpolation(f13);
        final float f16 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f17 = 1.0f - interpolation;
        final float f18 = (y10 * interpolation) + (f15 * f17);
        float height = r1Var.getRadialProgress().f33085a.height() / 2.0f;
        float f19 = (height * interpolation) + (this.f49279c * f17);
        ek0Var.getY();
        tiVar.getY();
        ek0Var.getMeasuredHeight();
        if (tiVar.getMeasuredHeight() > 0) {
            tiVar.getMeasuredHeight();
        }
        int i11 = r1Var.getRadialProgress().f33098p;
        int i12 = org.telegram.ui.ActionBar.m6.Uf;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49284j;
        float f20 = f10;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f21 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        Paint paint = this.f49280e;
        paint.setColor(f21);
        if (recordCircle != null) {
            float f22 = 1.0f - f20;
            org.telegram.ui.Components.w9 w9Var = recordCircle.h;
            org.telegram.ui.Components.w9 w9Var2 = recordCircle.f32778n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.nr.f37957g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f23 = chatActivityEnterView.Z4;
            if (f23 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f23 / 0.7f;
            }
            canvas.save();
            float f24 = ((w9Var2.f41736t * 1.4f) + 0.878f) * chatActivityEnterView.X4 * f12 * interpolation3 * f22;
            canvas.scale(f24, f24, f16, f18);
            w9Var2.a(f16, f18, canvas, w9Var2.d);
            canvas.restore();
            float f25 = ((w9Var.f41736t * 1.4f) + 0.926f) * chatActivityEnterView.X4 * f12 * interpolation3 * f22;
            canvas.save();
            canvas.scale(f25, f25, f16, f18);
            w9Var.a(f16, f18, canvas, w9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f16, f18, f19, paint);
        canvas.save();
        final float f26 = f19 / height;
        canvas.scale(f26, f26, f16, f18);
        final float centerX = f16 - r1Var.getRadialProgress().f33085a.centerX();
        final float centerY = f18 - r1Var.getRadialProgress().f33085a.centerY();
        canvas.translate(centerX, centerY);
        r1Var.getRadialProgress().E = interpolation;
        r1Var.getRadialProgress().B = false;
        final float f27 = f11;
        r1Var.C1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f28;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                kc1 kc1Var = kc1.this;
                RadialProgress2 radialProgress = kc1Var.f49277a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = kc1Var.f49282g;
                if (recordCircle2 != null) {
                    int i13 = (int) f27;
                    int i14 = (int) f15;
                    float f35 = 1.0f - f13;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f32639i5;
                    Rect rect = chatActivityEnterView2.J4;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f32777f != 1.0f) {
                            if (chatActivityEnterView2.f32595d1) {
                                drawable3 = chatActivityEnterView2.G4;
                            } else {
                                drawable3 = chatActivityEnterView2.F4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.H4;
                        canvas2 = canvas3;
                        f28 = f35;
                        rect.set(org.telegram.ui.Cells.c0.C(2, i13, drawable2), org.telegram.ui.Cells.c0.A(2, i14, drawable2), org.telegram.ui.Cells.c0.y(2, i13, drawable2), org.telegram.ui.Cells.c0.j(2, i14, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c0.C(2, i13, drawable4), org.telegram.ui.Cells.c0.A(2, i14, drawable4), org.telegram.ui.Cells.c0.y(2, i13, drawable4), org.telegram.ui.Cells.c0.j(2, i14, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f28 = f35;
                        if (chatActivityEnterView2.f32595d1) {
                            drawable = chatActivityEnterView2.G4;
                        } else {
                            drawable = chatActivityEnterView2.F4;
                        }
                        drawable2 = drawable;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    float f36 = 1.0f;
                    float L = (recordCircle2.M - org.telegram.messenger.g0.L(19.0f)) / Math.max(1.0f, recordCircle2.f32779r - org.telegram.messenger.g0.L(19.0f));
                    if (L < 0.0f) {
                        f36 = 0.0f;
                    } else if (L <= 1.0f) {
                        f36 = L;
                    }
                    recordCircle2.f32774d0 = f36;
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable5, drawable6, recordCircle2.f32777f, (int) (255.0f * f28));
                }
                canvas3.scale(f31, f31, f33, f34);
                canvas3.translate(f29, f30);
            }
        });
        r1Var.getRadialProgress().B = true;
        r1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
