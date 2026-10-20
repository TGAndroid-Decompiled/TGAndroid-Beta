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
public final class kh1 implements mh0 {
    public final org.telegram.ui.Cells.u1 f38613a;
    public final org.telegram.ui.Components.jm0 f38614b;
    public final float f38615c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f38616f;
    public final ChatActivityEnterView.RecordCircle f38617g;
    public final int h;
    public final org.telegram.ui.Components.si f38618i;
    public final org.telegram.ui.ActionBar.d6 f38619j;
    public float f38620k;
    public float f38621l;

    public kh1(org.telegram.ui.Cells.u1 u1Var, fk fkVar, org.telegram.ui.Components.jm0 jm0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38619j = d6Var;
        this.f38613a = u1Var;
        this.f38618i = siVar;
        this.f38614b = jm0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = fkVar.getRecordCircle();
        this.f38617g = recordCircle;
        if (recordCircle != null) {
            this.f38615c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) siVar.f30291c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38616f = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(26, this, siVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new jh1(this, u1Var, siVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.gp0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f26636n;
            if (u1Var2 != null) {
                u1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f7;
        float x10;
        float y3;
        float x11;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f7 = 1.0f;
        } else {
            f7 = f12 / 0.6f;
        }
        float f13 = 0.0f;
        ChatActivityEnterView.RecordCircle recordCircle = this.f38617g;
        org.telegram.ui.Components.si siVar = this.f38618i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - siVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - siVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.u1 u1Var = this.f38613a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.jm0 jm0Var = this.f38614b;
        if (i10 != i11) {
            x11 = this.f38620k;
            y3 = this.f38621l;
        } else {
            y3 = (jm0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f24304a.centerY())) - siVar.getY();
            x11 = (jm0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f24304a.centerX())) - siVar.getX();
        }
        this.f38620k = x11;
        this.f38621l = y3;
        float interpolation = org.telegram.ui.Components.bs.f25021f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.bs.h.getInterpolation(f12);
        final float f15 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = u1Var.getRadialProgress().f24304a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f38615c * f16);
        jm0Var.getY();
        siVar.getY();
        jm0Var.getMeasuredHeight();
        if (siVar.getMeasuredHeight() > 0) {
            siVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f24316p;
        int i13 = org.telegram.ui.ActionBar.h6.f20980cf;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38619j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int f20 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        Paint paint = this.e;
        paint.setColor(f20);
        if (recordCircle != null) {
            float f21 = 1.0f - f19;
            org.telegram.ui.Components.ba baVar = recordCircle.h;
            org.telegram.ui.Components.ba baVar2 = recordCircle.f24061n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.bs.f25022g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f22 = chatActivityEnterView.f23970j4;
            if (f22 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f22 / 0.7f;
            }
            canvas.save();
            float f23 = ((baVar2.f24855t * 1.4f) + 0.878f) * chatActivityEnterView.f23958h4 * f11 * interpolation3 * f21;
            canvas.scale(f23, f23, f15, f17);
            baVar2.a(f15, f17, canvas, baVar2.d);
            canvas.restore();
            float f24 = ((baVar.f24855t * 1.4f) + 0.926f) * chatActivityEnterView.f23958h4 * f11 * interpolation3 * f21;
            canvas.save();
            canvas.scale(f24, f24, f15, f17);
            baVar.a(f15, f17, canvas, baVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f25 = f18 / height;
        canvas.scale(f25, f25, f15, f17);
        final float centerX = f15 - u1Var.getRadialProgress().f24304a.centerX();
        final float centerY = f17 - u1Var.getRadialProgress().f24304a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f26 = f10;
        u1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f27;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                kh1 kh1Var = kh1.this;
                RadialProgress2 radialProgress = kh1Var.f38613a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f28 = centerX;
                float f29 = centerY;
                canvas3.translate(-f28, -f29);
                float f30 = f25;
                float f31 = 1.0f / f30;
                float f32 = f15;
                float f33 = f17;
                canvas3.scale(f31, f31, f32, f33);
                ChatActivityEnterView.RecordCircle recordCircle2 = kh1Var.f38617g;
                if (recordCircle2 != null) {
                    int i14 = (int) f26;
                    int i15 = (int) f14;
                    float f34 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f24019s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f24060f != 1.0f) {
                            if (chatActivityEnterView2.f23924c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f27 = f34;
                        rect.set(org.telegram.ui.Cells.c1.w(2, i14, drawable2), org.telegram.ui.Cells.c1.f(2, i15, drawable2), org.telegram.ui.Cells.c1.B(2, i14, drawable2), org.telegram.ui.Cells.c1.A(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c1.w(2, i14, drawable4), org.telegram.ui.Cells.c1.f(2, i15, drawable4), org.telegram.ui.Cells.c1.B(2, i14, drawable4), org.telegram.ui.Cells.c1.A(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f27 = f34;
                        if (chatActivityEnterView2.f23924c1) {
                            drawable = chatActivityEnterView2.Q3;
                        } else {
                            drawable = chatActivityEnterView2.P3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f24060f, (int) (255.0f * f27));
                }
                canvas3.scale(f30, f30, f32, f33);
                canvas3.translate(f28, f29);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
