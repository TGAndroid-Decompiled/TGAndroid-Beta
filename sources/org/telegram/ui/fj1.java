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
public final class fj1 implements gi0 {
    public final org.telegram.ui.Cells.u1 f35549a;
    public final org.telegram.ui.Components.mm0 f35550b;
    public final float f35551c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f35552f;
    public final ChatActivityEnterView.RecordCircle f35553g;
    public final int h;
    public final org.telegram.ui.Components.ui f35554i;
    public final org.telegram.ui.ActionBar.c6 f35555j;
    public float f35556k;
    public float f35557l;

    public fj1(org.telegram.ui.Cells.u1 u1Var, sk skVar, org.telegram.ui.Components.mm0 mm0Var, org.telegram.ui.Components.ui uiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f35555j = c6Var;
        this.f35549a = u1Var;
        this.f35554i = uiVar;
        this.f35550b = mm0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = skVar.getRecordCircle();
        this.f35553g = recordCircle;
        if (recordCircle != null) {
            this.f35551c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) uiVar.f29385c).add(this);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35552f = ofFloat;
        ofFloat.addUpdateListener(new ah.l0(26, this, uiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ej1(this, u1Var, uiVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.jp0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f26108n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f35553g;
        org.telegram.ui.Components.ui uiVar = this.f35554i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - uiVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - uiVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.u1 u1Var = this.f35549a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.mm0 mm0Var = this.f35550b;
        if (i10 != i11) {
            x11 = this.f35556k;
            y3 = this.f35557l;
        } else {
            y3 = (mm0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f22945a.centerY())) - uiVar.getY();
            x11 = (mm0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f22945a.centerX())) - uiVar.getX();
        }
        this.f35556k = x11;
        this.f35557l = y3;
        float interpolation = org.telegram.ui.Components.es.f24465f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.es.h.getInterpolation(f12);
        final float f15 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = u1Var.getRadialProgress().f22945a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f35551c * f16);
        mm0Var.getY();
        uiVar.getY();
        mm0Var.getMeasuredHeight();
        if (uiVar.getMeasuredHeight() > 0) {
            uiVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f22957p;
        int i13 = org.telegram.ui.ActionBar.g6.f19591cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35555j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, w02, org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f20 = 1.0f - f19;
            org.telegram.ui.Components.ea eaVar = recordCircle.h;
            org.telegram.ui.Components.ea eaVar2 = recordCircle.f22702n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.es.f24466g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f21 = chatActivityEnterView.f22611j4;
            if (f21 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f21 / 0.7f;
            }
            canvas.save();
            float f22 = ((eaVar2.f24349t * 1.4f) + 0.878f) * chatActivityEnterView.f22599h4 * f11 * interpolation3 * f20;
            canvas.scale(f22, f22, f15, f17);
            eaVar2.a(f15, f17, canvas, eaVar2.d);
            canvas.restore();
            float f23 = ((eaVar.f24349t * 1.4f) + 0.926f) * chatActivityEnterView.f22599h4 * f11 * interpolation3 * f20;
            canvas.save();
            canvas.scale(f23, f23, f15, f17);
            eaVar.a(f15, f17, canvas, eaVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f24 = f18 / height;
        canvas.scale(f24, f24, f15, f17);
        final float centerX = f15 - u1Var.getRadialProgress().f22945a.centerX();
        final float centerY = f17 - u1Var.getRadialProgress().f22945a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f25 = f10;
        u1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f26;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                fj1 fj1Var = fj1.this;
                RadialProgress2 radialProgress = fj1Var.f35549a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f27 = centerX;
                float f28 = centerY;
                canvas3.translate(-f27, -f28);
                float f29 = f24;
                float f30 = 1.0f / f29;
                float f31 = f15;
                float f32 = f17;
                canvas3.scale(f30, f30, f31, f32);
                ChatActivityEnterView.RecordCircle recordCircle2 = fj1Var.f35553g;
                if (recordCircle2 != null) {
                    int i14 = (int) f25;
                    int i15 = (int) f14;
                    float f33 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f22660s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f22701f != 1.0f) {
                            if (chatActivityEnterView2.f22565c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.ui.Cells.c1.r(2, i14, drawable2), org.telegram.ui.Cells.c1.c(2, i15, drawable2), org.telegram.ui.Cells.c1.v(2, i14, drawable2), org.telegram.ui.Cells.c1.u(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c1.r(2, i14, drawable4), org.telegram.ui.Cells.c1.c(2, i15, drawable4), org.telegram.ui.Cells.c1.v(2, i14, drawable4), org.telegram.ui.Cells.c1.u(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        if (chatActivityEnterView2.f22565c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f22701f, (int) (255.0f * f26));
                }
                canvas3.scale(f29, f29, f31, f32);
                canvas3.translate(f27, f28);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
