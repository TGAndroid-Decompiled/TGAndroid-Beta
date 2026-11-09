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
public final class lc1 implements hf0 {
    public final org.telegram.ui.Cells.q1 f47566a;
    public final org.telegram.ui.Components.qj0 f47567b;
    public final float f47568c;
    public float d;
    public final Paint f47569e = new Paint(1);
    public final ValueAnimator f47570f;
    public final ChatActivityEnterView.RecordCircle f47571g;
    public final int h;
    public final org.telegram.ui.Components.ci f47572i;
    public final org.telegram.ui.ActionBar.g6 f47573j;
    public float f47574k;
    public float f47575l;

    public lc1(org.telegram.ui.Cells.q1 q1Var, sj sjVar, org.telegram.ui.Components.qj0 qj0Var, org.telegram.ui.Components.ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f47573j = g6Var;
        this.f47566a = q1Var;
        this.f47572i = ciVar;
        this.f47567b = qj0Var;
        q1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = sjVar.getRecordCircle();
        this.f47571g = recordCircle;
        if (recordCircle != null) {
            this.f47568c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = q1Var.getMessageObject().f23264k1;
        ((ArrayList) ciVar.f32696c).add(this);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f47570f = ofFloat;
        ofFloat.addUpdateListener(new bi.de(25, this, ciVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new kc1(this, q1Var, ciVar));
        if (q1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qm0 seekBarWaveform = q1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.f37429n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f47571g;
        org.telegram.ui.Components.ci ciVar = this.f47572i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - ciVar.getX();
        }
        if (recordCircle != null) {
            f14 = (recordCircle.getY() + recordCircle.K) - ciVar.getY();
        }
        final float f15 = f14;
        org.telegram.ui.Cells.q1 q1Var = this.f47566a;
        int i7 = q1Var.getMessageObject().f23264k1;
        int i10 = this.h;
        org.telegram.ui.Components.qj0 qj0Var = this.f47567b;
        if (i7 != i10) {
            x11 = this.f47574k;
            y10 = this.f47575l;
        } else {
            y10 = (qj0Var.getY() + (q1Var.getY() + q1Var.getRadialProgress().f31481a.centerY())) - ciVar.getY();
            x11 = (qj0Var.getX() + (q1Var.getX() + q1Var.getRadialProgress().f31481a.centerX())) - ciVar.getX();
        }
        this.f47574k = x11;
        this.f47575l = y10;
        float interpolation = org.telegram.ui.Components.xq.f40458f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.xq.h.getInterpolation(f13);
        final float f16 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f17 = 1.0f - interpolation;
        final float f18 = (y10 * interpolation) + (f15 * f17);
        float height = q1Var.getRadialProgress().f31481a.height() / 2.0f;
        float f19 = (height * interpolation) + (this.f47568c * f17);
        qj0Var.getY();
        ciVar.getY();
        qj0Var.getMeasuredHeight();
        if (ciVar.getMeasuredHeight() > 0) {
            ciVar.getMeasuredHeight();
        }
        int i11 = q1Var.getRadialProgress().f31494p;
        int i12 = org.telegram.ui.ActionBar.l6.Rf;
        org.telegram.ui.ActionBar.g6 g6Var = this.f47573j;
        float f20 = f10;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i12, g6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f21 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        Paint paint = this.f47569e;
        paint.setColor(f21);
        if (recordCircle != null) {
            float f22 = 1.0f - f20;
            org.telegram.ui.Components.r9 r9Var = recordCircle.h;
            org.telegram.ui.Components.r9 r9Var2 = recordCircle.f31176n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.xq.f40459g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f23 = chatActivityEnterView.f31079j4;
            if (f23 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f23 / 0.7f;
            }
            canvas.save();
            float f24 = ((r9Var2.f37604t * 1.4f) + 0.878f) * chatActivityEnterView.f31068h4 * f12 * interpolation3 * f22;
            canvas.scale(f24, f24, f16, f18);
            r9Var2.a(f16, f18, canvas, r9Var2.d);
            canvas.restore();
            float f25 = ((r9Var.f37604t * 1.4f) + 0.926f) * chatActivityEnterView.f31068h4 * f12 * interpolation3 * f22;
            canvas.save();
            canvas.scale(f25, f25, f16, f18);
            r9Var.a(f16, f18, canvas, r9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f16, f18, f19, paint);
        canvas.save();
        final float f26 = f19 / height;
        canvas.scale(f26, f26, f16, f18);
        final float centerX = f16 - q1Var.getRadialProgress().f31481a.centerX();
        final float centerY = f18 - q1Var.getRadialProgress().f31481a.centerY();
        canvas.translate(centerX, centerY);
        q1Var.getRadialProgress().E = interpolation;
        q1Var.getRadialProgress().B = false;
        final float f27 = f11;
        q1Var.B1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f28;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                lc1 lc1Var = lc1.this;
                RadialProgress2 radialProgress = lc1Var.f47566a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = lc1Var.f47571g;
                if (recordCircle2 != null) {
                    int i13 = (int) f27;
                    int i14 = (int) f15;
                    float f35 = 1.0f - f13;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z9 = chatActivityEnterView2.f31132s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z9) {
                        if (recordCircle2.f31175f != 1.0f) {
                            if (chatActivityEnterView2.f31034c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f28 = f35;
                        rect.set(org.telegram.ui.Cells.f1.z(2, i13, drawable2), org.telegram.ui.Cells.f1.y(2, i14, drawable2), org.telegram.ui.Cells.f1.w(2, i13, drawable2), org.telegram.ui.Cells.f1.f(2, i14, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.f1.z(2, i13, drawable4), org.telegram.ui.Cells.f1.y(2, i14, drawable4), org.telegram.ui.Cells.f1.w(2, i13, drawable4), org.telegram.ui.Cells.f1.f(2, i14, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f28 = f35;
                        if (chatActivityEnterView2.f31034c1) {
                            drawable = chatActivityEnterView2.Q3;
                        } else {
                            drawable = chatActivityEnterView2.P3;
                        }
                        drawable2 = drawable;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f31175f, (int) (255.0f * f28));
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
