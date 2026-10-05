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
public final class ni1 implements zh0 {
    public final org.telegram.ui.Cells.u1 f38984a;
    public final org.telegram.ui.Components.zl0 f38985b;
    public final float f38986c;
    public float d;
    public final Paint f38987e = new Paint(1);
    public final ValueAnimator f38988f;
    public final ChatActivityEnterView.RecordCircle f38989g;
    public final int h;
    public final org.telegram.ui.Components.wi f38990i;
    public final org.telegram.ui.ActionBar.d6 f38991j;
    public float f38992k;
    public float f38993l;

    public ni1(org.telegram.ui.Cells.u1 u1Var, jk jkVar, org.telegram.ui.Components.zl0 zl0Var, org.telegram.ui.Components.wi wiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38991j = d6Var;
        this.f38984a = u1Var;
        this.f38990i = wiVar;
        this.f38985b = zl0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.f38989g = recordCircle;
        if (recordCircle != null) {
            this.f38986c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) wiVar.f32649c).add(this);
        wiVar.a();
        ((ViewGroup) wiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f38988f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, wiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new mi1(this, u1Var, wiVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.cp0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f25489n;
            if (u1Var2 != null) {
                u1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f7;
        float x10;
        final float y3;
        float y10;
        float x11;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f7 = 1.0f;
        } else {
            f7 = f12 / 0.6f;
        }
        ChatActivityEnterView.RecordCircle recordCircle = this.f38989g;
        org.telegram.ui.Components.wi wiVar = this.f38990i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - wiVar.getX();
        }
        if (recordCircle == null) {
            y3 = 0.0f;
        } else {
            y3 = (recordCircle.getY() + recordCircle.K) - wiVar.getY();
        }
        org.telegram.ui.Cells.u1 u1Var = this.f38984a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.zl0 zl0Var = this.f38985b;
        if (i10 != i11) {
            x11 = this.f38992k;
            y10 = this.f38993l;
        } else {
            y10 = (zl0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f24264a.centerY())) - wiVar.getY();
            x11 = (zl0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f24264a.centerX())) - wiVar.getX();
        }
        this.f38992k = x11;
        this.f38993l = y10;
        float interpolation = org.telegram.ui.Components.tr.f31215f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.tr.h.getInterpolation(f12);
        final float f13 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y3 * f14);
        float height = u1Var.getRadialProgress().f24264a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f38986c * f14);
        zl0Var.getY();
        wiVar.getY();
        zl0Var.getMeasuredHeight();
        if (wiVar.getMeasuredHeight() > 0) {
            wiVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f24277p;
        int i13 = org.telegram.ui.ActionBar.i6.f20817cf;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38991j;
        float f17 = f7;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i13, d6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        Paint paint = this.f38987e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.ca caVar = recordCircle.h;
            org.telegram.ui.Components.ca caVar2 = recordCircle.f24008n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.tr.f31216g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f23916j4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((caVar2.f25339t * 1.4f) + 0.878f) * chatActivityEnterView.f23905h4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            caVar2.a(f13, f15, canvas, caVar2.d);
            canvas.restore();
            float f21 = ((caVar.f25339t * 1.4f) + 0.926f) * chatActivityEnterView.f23905h4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            caVar.a(f13, f15, canvas, caVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - u1Var.getRadialProgress().f24264a.centerX();
        final float centerY = f15 - u1Var.getRadialProgress().f24264a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f23 = f10;
        u1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                ni1 ni1Var = ni1.this;
                RadialProgress2 radialProgress = ni1Var.f38984a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f25 = centerX;
                float f26 = centerY;
                canvas3.translate(-f25, -f26);
                float f27 = f22;
                float f28 = 1.0f / f27;
                float f29 = f13;
                float f30 = f15;
                canvas3.scale(f28, f28, f29, f30);
                ChatActivityEnterView.RecordCircle recordCircle2 = ni1Var.f38989g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y3;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f23965s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f24007f != 1.0f) {
                            if (chatActivityEnterView2.f23870c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.ui.Cells.c1.t(2, i14, drawable2), org.telegram.ui.Cells.c1.e(2, i15, drawable2), org.telegram.ui.Cells.c1.x(2, i14, drawable2), org.telegram.ui.Cells.c1.w(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c1.t(2, i14, drawable4), org.telegram.ui.Cells.c1.e(2, i15, drawable4), org.telegram.ui.Cells.c1.x(2, i14, drawable4), org.telegram.ui.Cells.c1.w(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        if (chatActivityEnterView2.f23870c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f24007f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
