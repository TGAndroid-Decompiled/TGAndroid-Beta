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
public final class fi1 implements th0 {
    public final org.telegram.ui.Cells.t1 f36892a;
    public final org.telegram.ui.Components.tl0 f36893b;
    public final float f36894c;
    public float d;
    public final Paint f36895e = new Paint(1);
    public final ValueAnimator f36896f;
    public final ChatActivityEnterView.RecordCircle f36897g;
    public final int h;
    public final org.telegram.ui.Components.li f36898i;
    public final org.telegram.ui.ActionBar.g6 f36899j;
    public float f36900k;
    public float f36901l;

    public fi1(org.telegram.ui.Cells.t1 t1Var, jk jkVar, org.telegram.ui.Components.tl0 tl0Var, org.telegram.ui.Components.li liVar, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36899j = g6Var;
        this.f36892a = t1Var;
        this.f36898i = liVar;
        this.f36893b = tl0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.f36897g = recordCircle;
        if (recordCircle != null) {
            this.f36894c = recordCircle.I;
            recordCircle.J = true;
            recordCircle.K = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) liVar.f28749c).add(this);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36896f = ofFloat;
        ofFloat.addUpdateListener(new bg.a(24, this, liVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new ei1(this, t1Var, liVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.no0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f29594n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f36897g;
        org.telegram.ui.Components.li liVar = this.f36898i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.G) - liVar.getX();
        }
        if (recordCircle == null) {
            y10 = 0.0f;
        } else {
            y10 = (recordCircle.getY() + recordCircle.H) - liVar.getY();
        }
        org.telegram.ui.Cells.t1 t1Var = this.f36892a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.tl0 tl0Var = this.f36893b;
        if (i10 != i11) {
            x11 = this.f36900k;
            y11 = this.f36901l;
        } else {
            y11 = (tl0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().f24966a.centerY())) - liVar.getY();
            x11 = (tl0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().f24966a.centerX())) - liVar.getX();
        }
        this.f36900k = x11;
        this.f36901l = y11;
        float interpolation = org.telegram.ui.Components.pr.f30183f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.pr.h.getInterpolation(f13);
        final float f14 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f15 = 1.0f - interpolation;
        final float f16 = (y11 * interpolation) + (y10 * f15);
        float height = t1Var.getRadialProgress().f24966a.height() / 2.0f;
        float f17 = (height * interpolation) + (this.f36894c * f15);
        tl0Var.getY();
        liVar.getY();
        tl0Var.getMeasuredHeight();
        if (liVar.getMeasuredHeight() > 0) {
            liVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().f24979p;
        int i13 = org.telegram.ui.ActionBar.k6.f21650cf;
        org.telegram.ui.ActionBar.g6 g6Var = this.f36899j;
        float f18 = f10;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i13, g6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        Paint paint = this.f36895e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f19 = 1.0f - f18;
            org.telegram.ui.Components.u9 u9Var = recordCircle.h;
            org.telegram.ui.Components.u9 u9Var2 = recordCircle.f24719n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.pr.f30184g.getInterpolation(recordCircle.E);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.f24606f4;
            if (f20 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f20 / 0.7f;
            }
            canvas.save();
            float f21 = ((u9Var2.f31623t * 1.4f) + 0.878f) * chatActivityEnterView.f24592d4 * f12 * interpolation3 * f19;
            canvas.scale(f21, f21, f14, f16);
            u9Var2.a(f14, f16, canvas, u9Var2.d);
            canvas.restore();
            float f22 = ((u9Var.f31623t * 1.4f) + 0.926f) * chatActivityEnterView.f24592d4 * f12 * interpolation3 * f19;
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
        final float centerX = f14 - t1Var.getRadialProgress().f24966a.centerX();
        final float centerY = f16 - t1Var.getRadialProgress().f24966a.centerY();
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
                fi1 fi1Var = fi1.this;
                RadialProgress2 radialProgress = fi1Var.f36892a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = fi1Var.f36897g;
                if (recordCircle2 != null) {
                    int i14 = (int) f24;
                    int i15 = (int) y10;
                    float f32 = 1.0f - f13;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z4 = chatActivityEnterView2.f24654o4;
                    Rect rect = chatActivityEnterView2.P3;
                    Drawable drawable4 = null;
                    if (z4) {
                        if (recordCircle2.f24718f != 1.0f) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f24718f, (int) (255.0f * f25));
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
