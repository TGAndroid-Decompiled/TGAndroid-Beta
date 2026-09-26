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
public final class pi1 implements vh0 {
    public final org.telegram.ui.Cells.u1 f36555a;
    public final org.telegram.ui.Components.xl0 f36556b;
    public final float f36557c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f36558f;
    public final ChatActivityEnterView.RecordCircle f36559g;
    public final int h;
    public final org.telegram.ui.Components.vi f36560i;
    public final org.telegram.ui.ActionBar.d6 f36561j;
    public float f36562k;
    public float f36563l;

    public pi1(org.telegram.ui.Cells.u1 u1Var, jk jkVar, org.telegram.ui.Components.xl0 xl0Var, org.telegram.ui.Components.vi viVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f36561j = d6Var;
        this.f36555a = u1Var;
        this.f36560i = viVar;
        this.f36556b = xl0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.f36559g = recordCircle;
        if (recordCircle != null) {
            this.f36557c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) viVar.f29106c).add(this);
        viVar.a();
        ((ViewGroup) viVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f36558f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, viVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new oi1(this, u1Var, viVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.wo0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30164n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f36559g;
        org.telegram.ui.Components.vi viVar = this.f36560i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - viVar.getX();
        }
        if (recordCircle == null) {
            y3 = 0.0f;
        } else {
            y3 = (recordCircle.getY() + recordCircle.K) - viVar.getY();
        }
        org.telegram.ui.Cells.u1 u1Var = this.f36555a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.xl0 xl0Var = this.f36556b;
        if (i10 != i11) {
            x11 = this.f36562k;
            y10 = this.f36563l;
        } else {
            y10 = (xl0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f22347a.centerY())) - viVar.getY();
            x11 = (xl0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f22347a.centerX())) - viVar.getX();
        }
        this.f36562k = x11;
        this.f36563l = y10;
        float interpolation = org.telegram.ui.Components.sr.f28339f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.sr.h.getInterpolation(f12);
        final float f13 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y3 * f14);
        float height = u1Var.getRadialProgress().f22347a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f36557c * f14);
        xl0Var.getY();
        viVar.getY();
        xl0Var.getMeasuredHeight();
        if (viVar.getMeasuredHeight() > 0) {
            viVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f22359p;
        int i13 = org.telegram.ui.ActionBar.h6.f19049cf;
        org.telegram.ui.ActionBar.d6 d6Var = this.f36561j;
        float f17 = f7;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i13, d6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.ba baVar = recordCircle.h;
            org.telegram.ui.Components.ba baVar2 = recordCircle.f22104n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.sr.f28340g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f22013j4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((baVar2.f22952t * 1.4f) + 0.878f) * chatActivityEnterView.f22002h4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            baVar2.a(f13, f15, canvas, baVar2.d);
            canvas.restore();
            float f21 = ((baVar.f22952t * 1.4f) + 0.926f) * chatActivityEnterView.f22002h4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            baVar.a(f13, f15, canvas, baVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - u1Var.getRadialProgress().f22347a.centerX();
        final float centerY = f15 - u1Var.getRadialProgress().f22347a.centerY();
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
                pi1 pi1Var = pi1.this;
                RadialProgress2 radialProgress = pi1Var.f36555a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = pi1Var.f36559g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y3;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f22062s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f22103f != 1.0f) {
                            if (chatActivityEnterView2.f21968c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.messenger.ok.z(2, i14, drawable2), org.telegram.messenger.ok.d(2, i15, drawable2), org.telegram.ui.Cells.c1.t(2, i14, drawable2), org.telegram.ui.Cells.c1.d(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.messenger.ok.z(2, i14, drawable4), org.telegram.messenger.ok.d(2, i15, drawable4), org.telegram.ui.Cells.c1.t(2, i14, drawable4), org.telegram.ui.Cells.c1.d(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        if (chatActivityEnterView2.f21968c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f22103f, (int) (255.0f * f24));
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
