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
public final class aj1 implements ei0 {
    public final org.telegram.ui.Cells.u1 f35859a;
    public final org.telegram.ui.Components.wm0 f35860b;
    public final float f35861c;
    public float d;
    public final Paint f35862e = new Paint(1);
    public final ValueAnimator f35863f;
    public final ChatActivityEnterView.RecordCircle f35864g;
    public final int h;
    public final org.telegram.ui.Components.zi f35865i;
    public final org.telegram.ui.ActionBar.c6 f35866j;
    public float f35867k;
    public float f35868l;

    public aj1(org.telegram.ui.Cells.u1 u1Var, sk skVar, org.telegram.ui.Components.wm0 wm0Var, org.telegram.ui.Components.zi ziVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f35866j = c6Var;
        this.f35859a = u1Var;
        this.f35865i = ziVar;
        this.f35860b = wm0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = skVar.getRecordCircle();
        this.f35864g = recordCircle;
        if (recordCircle != null) {
            this.f35861c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) ziVar.f33389c).add(this);
        ziVar.a();
        ((ViewGroup) ziVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35863f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, ziVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new zi1(this, u1Var, ziVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.tp0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30934n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f35864g;
        org.telegram.ui.Components.zi ziVar = this.f35865i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - ziVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - ziVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.u1 u1Var = this.f35859a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.wm0 wm0Var = this.f35860b;
        if (i10 != i11) {
            x11 = this.f35867k;
            y3 = this.f35868l;
        } else {
            y3 = (wm0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f24038a.centerY())) - ziVar.getY();
            x11 = (wm0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f24038a.centerX())) - ziVar.getX();
        }
        this.f35867k = x11;
        this.f35868l = y3;
        float interpolation = org.telegram.ui.Components.js.f27634f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.js.h.getInterpolation(f12);
        final float f15 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = u1Var.getRadialProgress().f24038a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f35861c * f16);
        wm0Var.getY();
        ziVar.getY();
        wm0Var.getMeasuredHeight();
        if (ziVar.getMeasuredHeight() > 0) {
            ziVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f24051p;
        int i13 = org.telegram.ui.ActionBar.h6.f20550cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35866j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, w02, org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        Paint paint = this.f35862e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f20 = 1.0f - f19;
            org.telegram.ui.Components.da daVar = recordCircle.h;
            org.telegram.ui.Components.da daVar2 = recordCircle.f23782n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.js.f27635g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f21 = chatActivityEnterView.M4;
            if (f21 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f21 / 0.7f;
            }
            canvas.save();
            float f22 = ((daVar2.f25281t * 1.4f) + 0.878f) * chatActivityEnterView.K4 * f11 * interpolation3 * f20;
            canvas.scale(f22, f22, f15, f17);
            daVar2.a(f15, f17, canvas, daVar2.d);
            canvas.restore();
            float f23 = ((daVar.f25281t * 1.4f) + 0.926f) * chatActivityEnterView.K4 * f11 * interpolation3 * f20;
            canvas.save();
            canvas.scale(f23, f23, f15, f17);
            daVar.a(f15, f17, canvas, daVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f24 = f18 / height;
        canvas.scale(f24, f24, f15, f17);
        final float centerX = f15 - u1Var.getRadialProgress().f24038a.centerX();
        final float centerY = f17 - u1Var.getRadialProgress().f24038a.centerY();
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
                aj1 aj1Var = aj1.this;
                RadialProgress2 radialProgress = aj1Var.f35859a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = aj1Var.f35864g;
                if (recordCircle2 != null) {
                    int i14 = (int) f25;
                    int i15 = (int) f14;
                    float f33 = 1.0f - f12;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.V4;
                    Rect rect = chatActivityEnterView2.f23756w4;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f23781f != 1.0f) {
                            if (chatActivityEnterView2.f23632c1) {
                                drawable3 = chatActivityEnterView2.f23731s4;
                            } else {
                                drawable3 = chatActivityEnterView2.f23724r4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.f23737t4;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.messenger.am.z(2, i14, drawable2), org.telegram.messenger.am.d(2, i15, drawable2), org.telegram.ui.Cells.c1.r(2, i14, drawable2), org.telegram.ui.Cells.c1.c(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.messenger.am.z(2, i14, drawable4), org.telegram.messenger.am.d(2, i15, drawable4), org.telegram.ui.Cells.c1.r(2, i14, drawable4), org.telegram.ui.Cells.c1.c(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        if (chatActivityEnterView2.f23632c1) {
                            drawable = chatActivityEnterView2.f23731s4;
                        } else {
                            drawable = chatActivityEnterView2.f23724r4;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable5, drawable6, recordCircle2.f23781f, (int) (255.0f * f26));
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
