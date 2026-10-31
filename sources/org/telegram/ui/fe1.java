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
public final class fe1 implements ng0 {
    public final org.telegram.ui.Cells.q1 f37247a;
    public final org.telegram.ui.Components.tk0 f37248b;
    public final float f37249c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f37250f;
    public final ChatActivityEnterView.RecordCircle f37251g;
    public final int h;
    public final ih.e f37252i;
    public final org.telegram.ui.ActionBar.p6 f37253j;
    public float f37254k;
    public float f37255l;

    public fe1(org.telegram.ui.Cells.q1 q1Var, mk mkVar, org.telegram.ui.Components.tk0 tk0Var, ih.e eVar, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f37253j = p6Var;
        this.f37247a = q1Var;
        this.f37252i = eVar;
        this.f37248b = tk0Var;
        q1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = mkVar.getRecordCircle();
        this.f37251g = recordCircle;
        if (recordCircle != null) {
            this.f37249c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.i0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = q1Var.getMessageObject().f16339k1;
        ((ArrayList) eVar.f8535c).add(this);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f37250f = ofFloat;
        ofFloat.addUpdateListener(new ag.p2(24, this, eVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ee1(this, q1Var, eVar));
        if (q1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qn0 seekBarWaveform = q1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.q1 q1Var2 = seekBarWaveform.f29698n;
            if (q1Var2 != null) {
                q1Var2.invalidate();
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f37251g;
        ih.e eVar = this.f37252i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - eVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - eVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.q1 q1Var = this.f37247a;
        int i10 = q1Var.getMessageObject().f16339k1;
        int i11 = this.h;
        org.telegram.ui.Components.tk0 tk0Var = this.f37248b;
        if (i10 != i11) {
            x11 = this.f37254k;
            y3 = this.f37255l;
        } else {
            y3 = (tk0Var.getY() + (q1Var.getY() + q1Var.getRadialProgress().f24123a.centerY())) - eVar.getY();
            x11 = (tk0Var.getX() + (q1Var.getX() + q1Var.getRadialProgress().f24123a.centerX())) - eVar.getX();
        }
        this.f37254k = x11;
        this.f37255l = y3;
        float interpolation = org.telegram.ui.Components.gr.f26495f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.gr.h.getInterpolation(f12);
        final float f15 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = q1Var.getRadialProgress().f24123a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f37249c * f16);
        tk0Var.getY();
        eVar.getY();
        tk0Var.getMeasuredHeight();
        if (eVar.getMeasuredHeight() > 0) {
            eVar.getMeasuredHeight();
        }
        int i12 = q1Var.getRadialProgress().f24135p;
        int i13 = org.telegram.ui.ActionBar.t6.Rf;
        org.telegram.ui.ActionBar.p6 p6Var = this.f37253j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int f20 = i0.b.f(interpolation, w02, org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        Paint paint = this.e;
        paint.setColor(f20);
        if (recordCircle != null) {
            float f21 = 1.0f - f19;
            org.telegram.ui.Components.m9 m9Var = recordCircle.h;
            org.telegram.ui.Components.m9 m9Var2 = recordCircle.f23829n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.gr.f26496g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f22 = chatActivityEnterView.f23734j4;
            if (f22 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f22 / 0.7f;
            }
            canvas.save();
            float f23 = ((m9Var2.f28396t * 1.4f) + 0.878f) * chatActivityEnterView.f23722h4 * f11 * interpolation3 * f21;
            canvas.scale(f23, f23, f15, f17);
            m9Var2.a(f15, f17, canvas, m9Var2.d);
            canvas.restore();
            float f24 = ((m9Var.f28396t * 1.4f) + 0.926f) * chatActivityEnterView.f23722h4 * f11 * interpolation3 * f21;
            canvas.save();
            canvas.scale(f24, f24, f15, f17);
            m9Var.a(f15, f17, canvas, m9Var.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f25 = f18 / height;
        canvas.scale(f25, f25, f15, f17);
        final float centerX = f15 - q1Var.getRadialProgress().f24123a.centerX();
        final float centerY = f17 - q1Var.getRadialProgress().f24123a.centerY();
        canvas.translate(centerX, centerY);
        q1Var.getRadialProgress().E = interpolation;
        q1Var.getRadialProgress().B = false;
        final float f26 = f10;
        q1Var.z1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f27;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                fe1 fe1Var = fe1.this;
                RadialProgress2 radialProgress = fe1Var.f37247a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = fe1Var.f37251g;
                if (recordCircle2 != null) {
                    int i14 = (int) f26;
                    int i15 = (int) f14;
                    float f34 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f23787s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f23828f != 1.0f) {
                            if (chatActivityEnterView2.f23688c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f27 = f34;
                        rect.set(org.telegram.ui.Cells.f1.z(2, i14, drawable2), org.telegram.ui.Cells.f1.y(2, i15, drawable2), org.telegram.ui.Cells.f1.w(2, i14, drawable2), org.telegram.ui.Cells.f1.f(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.f1.z(2, i14, drawable4), org.telegram.ui.Cells.f1.y(2, i15, drawable4), org.telegram.ui.Cells.f1.w(2, i14, drawable4), org.telegram.ui.Cells.f1.f(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f27 = f34;
                        if (chatActivityEnterView2.f23688c1) {
                            drawable = chatActivityEnterView2.Q3;
                        } else {
                            drawable = chatActivityEnterView2.P3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - org.telegram.messenger.i0.L(12.0f), i15 - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f) + i14, org.telegram.messenger.i0.L(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f23828f, (int) (255.0f * f27));
                }
                canvas3.scale(f30, f30, f32, f33);
                canvas3.translate(f28, f29);
            }
        });
        q1Var.getRadialProgress().B = true;
        q1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
