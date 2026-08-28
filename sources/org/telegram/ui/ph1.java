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
public final class ph1 implements lh0 {
    public final org.telegram.ui.Cells.t1 f41532a;
    public final org.telegram.ui.Components.wk0 f41533b;
    public final float f41534c;
    public float d;
    public final Paint f41535e = new Paint(1);
    public final ValueAnimator f41536f;
    public final ChatActivityEnterView.RecordCircle f41537g;
    public final int h;
    public final org.telegram.ui.Components.ji f41538i;
    public final org.telegram.ui.ActionBar.b6 f41539j;
    public float f41540k;
    public float f41541l;

    public ph1(org.telegram.ui.Cells.t1 t1Var, ak akVar, org.telegram.ui.Components.wk0 wk0Var, org.telegram.ui.Components.ji jiVar, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f41539j = b6Var;
        this.f41532a = t1Var;
        this.f41538i = jiVar;
        this.f41533b = wk0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = akVar.getRecordCircle();
        this.f41537g = recordCircle;
        if (recordCircle != null) {
            this.f41534c = recordCircle.H;
            recordCircle.I = true;
            recordCircle.J = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) jiVar.f29744c).add(this);
        jiVar.a();
        ((ViewGroup) jiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41536f = ofFloat;
        ofFloat.addUpdateListener(new f2.g(21, this, jiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new oh1(this, t1Var, jiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.rn0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f32220n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f41537g;
        org.telegram.ui.Components.ji jiVar = this.f41538i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.F) - jiVar.getX();
        }
        if (recordCircle == null) {
            y10 = 0.0f;
        } else {
            y10 = (recordCircle.getY() + recordCircle.G) - jiVar.getY();
        }
        org.telegram.ui.Cells.t1 t1Var = this.f41532a;
        int i9 = t1Var.getMessageObject().stableId;
        int i10 = this.h;
        org.telegram.ui.Components.wk0 wk0Var = this.f41533b;
        if (i9 != i10) {
            x11 = this.f41540k;
            y11 = this.f41541l;
        } else {
            y11 = (wk0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().f26468a.centerY())) - jiVar.getY();
            x11 = (wk0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().f26468a.centerX())) - jiVar.getX();
        }
        this.f41540k = x11;
        this.f41541l = y11;
        float interpolation = org.telegram.ui.Components.gr.f28844f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.gr.h.getInterpolation(f13);
        final float f14 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f15 = 1.0f - interpolation;
        final float f16 = (y11 * interpolation) + (y10 * f15);
        float height = t1Var.getRadialProgress().f26468a.height() / 2.0f;
        float f17 = (height * interpolation) + (this.f41534c * f15);
        wk0Var.getY();
        jiVar.getY();
        wk0Var.getMeasuredHeight();
        if (jiVar.getMeasuredHeight() > 0) {
            jiVar.getMeasuredHeight();
        }
        int i11 = t1Var.getRadialProgress().f26481p;
        int i12 = org.telegram.ui.ActionBar.f6.f22992cf;
        org.telegram.ui.ActionBar.b6 b6Var = this.f41539j;
        float f18 = f10;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i12, b6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        Paint paint = this.f41535e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f19 = 1.0f - f18;
            org.telegram.ui.Components.t9 t9Var = recordCircle.h;
            org.telegram.ui.Components.t9 t9Var2 = recordCircle.f26224n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.gr.f28845g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f20 = chatActivityEnterView.f26105e4;
            if (f20 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f20 / 0.7f;
            }
            canvas.save();
            float f21 = ((t9Var2.f32664t * 1.4f) + 0.878f) * chatActivityEnterView.f26092c4 * f12 * interpolation3 * f19;
            canvas.scale(f21, f21, f14, f16);
            t9Var2.a(f14, f16, canvas, t9Var2.d);
            canvas.restore();
            float f22 = ((t9Var.f32664t * 1.4f) + 0.926f) * chatActivityEnterView.f26092c4 * f12 * interpolation3 * f19;
            canvas.save();
            canvas.scale(f22, f22, f14, f16);
            t9Var.a(f14, f16, canvas, t9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f14, f16, f17, paint);
        canvas.save();
        final float f23 = f17 / height;
        canvas.scale(f23, f23, f14, f16);
        final float centerX = f14 - t1Var.getRadialProgress().f26468a.centerX();
        final float centerY = f16 - t1Var.getRadialProgress().f26468a.centerY();
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
                ph1 ph1Var = ph1.this;
                RadialProgress2 radialProgress = ph1Var.f41532a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = ph1Var.f41537g;
                if (recordCircle2 != null) {
                    int i13 = (int) f24;
                    int i14 = (int) y10;
                    float f32 = 1.0f - f13;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f26154n4;
                    Rect rect = chatActivityEnterView2.O3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f26223f != 1.0f) {
                            if (chatActivityEnterView2.Y0) {
                                drawable3 = chatActivityEnterView2.L3;
                            } else {
                                drawable3 = chatActivityEnterView2.K3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.M3;
                        canvas2 = canvas3;
                        f25 = f32;
                        rect.set(org.telegram.messenger.ll.x(2, i13, drawable2), org.telegram.messenger.ll.e(2, i14, drawable2), org.telegram.messenger.ll.B(2, i13, drawable2), org.telegram.messenger.ll.z(2, i14, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.messenger.ll.x(2, i13, drawable4), org.telegram.messenger.ll.e(2, i14, drawable4), org.telegram.messenger.ll.B(2, i13, drawable4), org.telegram.messenger.ll.z(2, i14, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f25 = f32;
                        if (chatActivityEnterView2.Y0) {
                            drawable = chatActivityEnterView2.L3;
                        } else {
                            drawable = chatActivityEnterView2.K3;
                        }
                        drawable2 = drawable;
                        rect.set(i13 - AndroidUtilities.dp(12.0f), i14 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13, AndroidUtilities.dp(12.0f) + i14);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f26223f, (int) (255.0f * f25));
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
