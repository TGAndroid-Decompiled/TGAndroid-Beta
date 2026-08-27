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

public final class oh1 implements nh0 {

    public final org.telegram.ui.Cells.s1 f41103a;

    public final org.telegram.ui.Components.zk0 f41104b;

    public final float f41105c;
    public float d;

    public final Paint f41106e = new Paint(1);

    public final ValueAnimator f41107f;

    public final ChatActivityEnterView.RecordCircle f41108g;
    public final int h;

    public final org.telegram.ui.Components.fi f41109i;

    public final org.telegram.ui.ActionBar.c6 f41110j;

    public float f41111k;

    public float f41112l;

    public oh1(org.telegram.ui.Cells.s1 s1Var, ck ckVar, org.telegram.ui.Components.zk0 zk0Var, org.telegram.ui.Components.fi fiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41110j = c6Var;
        this.f41103a = s1Var;
        this.f41109i = fiVar;
        this.f41104b = zk0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = ckVar.getRecordCircle();
        this.f41108g = recordCircle;
        if (recordCircle != null) {
            this.f41105c = recordCircle.H;
            recordCircle.I = true;
            recordCircle.J = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) fiVar.f28391c).add(this);
        fiVar.a();
        ((ViewGroup) fiVar.d).invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41107f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.t2(22, this, fiVar));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.addListener(new nh1(this, s1Var, fiVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.sn0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f32501n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float x8;
        final float y10;
        float y11;
        float x10;
        final float f10 = this.d;
        float f11 = f10 > 0.6f ? 1.0f : f10 / 0.6f;
        ChatActivityEnterView.RecordCircle recordCircle = this.f41108g;
        org.telegram.ui.Components.fi fiVar = this.f41109i;
        if (recordCircle == null) {
            x8 = 0.0f;
        } else {
            x8 = (recordCircle.getX() + recordCircle.F) - fiVar.getX();
        }
        if (recordCircle == null) {
            y10 = 0.0f;
        } else {
            y10 = (recordCircle.getY() + recordCircle.G) - fiVar.getY();
        }
        org.telegram.ui.Cells.s1 s1Var = this.f41103a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.zk0 zk0Var = this.f41104b;
        if (i10 != i11) {
            x10 = this.f41111k;
            y11 = this.f41112l;
        } else {
            y11 = (zk0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().f26464a.centerY())) - fiVar.getY();
            x10 = (zk0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().f26464a.centerX())) - fiVar.getX();
        }
        this.f41111k = x10;
        this.f41112l = y11;
        float interpolation = org.telegram.ui.Components.er.f28122f.getInterpolation(f10);
        float interpolation2 = org.telegram.ui.Components.er.h.getInterpolation(f10);
        final float f12 = (x10 * interpolation2) + ((1.0f - interpolation2) * x8);
        float f13 = 1.0f - interpolation;
        final float f14 = (y11 * interpolation) + (y10 * f13);
        float fHeight = s1Var.getRadialProgress().f26464a.height() / 2.0f;
        float f15 = (fHeight * interpolation) + (this.f41105c * f13);
        zk0Var.getY();
        fiVar.getY();
        zk0Var.getMeasuredHeight();
        if (fiVar.getMeasuredHeight() > 0) {
            fiVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().f26477p;
        int i13 = org.telegram.ui.ActionBar.g6.f23044cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f41110j;
        float f16 = f11;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int iD = i0.b.d(interpolation, iV0, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Paint paint = this.f41106e;
        paint.setColor(iD);
        if (recordCircle != null) {
            float f17 = 1.0f - f16;
            org.telegram.ui.Components.s9 s9Var = recordCircle.h;
            org.telegram.ui.Components.s9 s9Var2 = recordCircle.f26220n;
            float interpolation3 = org.telegram.ui.Components.er.f28123g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f18 = chatActivityEnterView.f26101e4;
            float f19 = f18 > 0.7f ? 1.0f : f18 / 0.7f;
            canvas.save();
            float f20 = ((s9Var2.f32373t * 1.4f) + 0.878f) * chatActivityEnterView.f26088c4 * f19 * interpolation3 * f17;
            canvas.scale(f20, f20, f12, f14);
            s9Var2.a(f12, f14, canvas, s9Var2.d);
            canvas.restore();
            float f21 = ((s9Var.f32373t * 1.4f) + 0.926f) * chatActivityEnterView.f26088c4 * f19 * interpolation3 * f17;
            canvas.save();
            canvas.scale(f21, f21, f12, f14);
            s9Var.a(f12, f14, canvas, s9Var.d);
            canvas.restore();
        }
        canvas.drawCircle(f12, f14, f15, paint);
        canvas.save();
        final float f22 = f15 / fHeight;
        canvas.scale(f22, f22, f12, f14);
        final float fCenterX = f12 - s1Var.getRadialProgress().f26464a.centerX();
        final float fCenterY = f14 - s1Var.getRadialProgress().f26464a.centerY();
        canvas.translate(fCenterX, fCenterY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f23 = x8;
        s1Var.p2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                oh1 oh1Var = this.f40514a;
                RadialProgress2 radialProgress = oh1Var.f41103a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f25 = fCenterX;
                float f26 = fCenterY;
                canvas3.translate(-f25, -f26);
                float f27 = f22;
                float f28 = 1.0f / f27;
                float f29 = f12;
                float f30 = f14;
                canvas3.scale(f28, f28, f29, f30);
                ChatActivityEnterView.RecordCircle recordCircle2 = oh1Var.f41108g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y10;
                    float f31 = 1.0f - f10;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f26150n4;
                    Rect rect = chatActivityEnterView2.O3;
                    Drawable drawable2 = null;
                    if (z10) {
                        if (recordCircle2.f26219f != 1.0f) {
                            drawable2 = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
                        }
                        drawable = chatActivityEnterView2.M3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.messenger.rl.v(2, i14, drawable), org.telegram.messenger.rl.e(2, i15, drawable), org.telegram.messenger.rl.A(2, i14, drawable), org.telegram.messenger.rl.y(2, i15, drawable));
                        if (drawable2 != null) {
                            drawable2.setBounds(org.telegram.messenger.rl.v(2, i14, drawable2), org.telegram.messenger.rl.e(2, i15, drawable2), org.telegram.messenger.rl.A(2, i14, drawable2), org.telegram.messenger.rl.y(2, i15, drawable2));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        drawable = chatActivityEnterView2.Y0 ? chatActivityEnterView2.L3 : chatActivityEnterView2.K3;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable3 = drawable;
                    Drawable drawable4 = drawable2;
                    drawable3.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable3, drawable4, recordCircle2.f26219f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
