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
public final class kc1 implements jf0 {
    public final org.telegram.ui.Cells.r1 f49238a;
    public final org.telegram.ui.Components.ck0 f49239b;
    public final float f49240c;
    public float d;
    public final Paint f49241e = new Paint(1);
    public final ValueAnimator f49242f;
    public final ChatActivityEnterView.RecordCircle f49243g;
    public final int h;
    public final org.telegram.ui.Components.ri f49244i;
    public final org.telegram.ui.ActionBar.i6 f49245j;
    public float f49246k;
    public float f49247l;

    public kc1(org.telegram.ui.Cells.r1 r1Var, rj rjVar, org.telegram.ui.Components.ck0 ck0Var, org.telegram.ui.Components.ri riVar, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f49245j = i6Var;
        this.f49238a = r1Var;
        this.f49244i = riVar;
        this.f49239b = ck0Var;
        r1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = rjVar.getRecordCircle();
        this.f49243g = recordCircle;
        if (recordCircle != null) {
            this.f49240c = recordCircle.M;
            recordCircle.N = true;
            recordCircle.O = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = r1Var.getMessageObject().f23975m1;
        ((ArrayList) riVar.f39153c).add(this);
        riVar.a();
        ((ViewGroup) riVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49242f = ofFloat;
        ofFloat.addUpdateListener(new ch.w(24, this, riVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new jc1(this, r1Var, riVar));
        if (r1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.bn0 seekBarWaveform = r1Var.getSeekBarWaveform();
            seekBarWaveform.v.e(true, 0.0f);
            org.telegram.ui.Cells.r1 r1Var2 = seekBarWaveform.f33737n;
            if (r1Var2 != null) {
                r1Var2.invalidate();
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f49243g;
        org.telegram.ui.Components.ri riVar = this.f49244i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.K) - riVar.getX();
        }
        if (recordCircle != null) {
            f14 = (recordCircle.getY() + recordCircle.L) - riVar.getY();
        }
        final float f15 = f14;
        org.telegram.ui.Cells.r1 r1Var = this.f49238a;
        int i7 = r1Var.getMessageObject().f23975m1;
        int i10 = this.h;
        org.telegram.ui.Components.ck0 ck0Var = this.f49239b;
        if (i7 != i10) {
            x11 = this.f49246k;
            y10 = this.f49247l;
        } else {
            y10 = (ck0Var.getY() + (r1Var.getY() + r1Var.getRadialProgress().f33052a.centerY())) - riVar.getY();
            x11 = (ck0Var.getX() + (r1Var.getX() + r1Var.getRadialProgress().f33052a.centerX())) - riVar.getX();
        }
        this.f49246k = x11;
        this.f49247l = y10;
        float interpolation = org.telegram.ui.Components.lr.f37208f.getInterpolation(f13);
        float interpolation2 = org.telegram.ui.Components.lr.h.getInterpolation(f13);
        final float f16 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f17 = 1.0f - interpolation;
        final float f18 = (y10 * interpolation) + (f15 * f17);
        float height = r1Var.getRadialProgress().f33052a.height() / 2.0f;
        float f19 = (height * interpolation) + (this.f49240c * f17);
        ck0Var.getY();
        riVar.getY();
        ck0Var.getMeasuredHeight();
        if (riVar.getMeasuredHeight() > 0) {
            riVar.getMeasuredHeight();
        }
        int i11 = r1Var.getRadialProgress().f33065p;
        int i12 = org.telegram.ui.ActionBar.n6.Uf;
        org.telegram.ui.ActionBar.i6 i6Var = this.f49245j;
        float f20 = f10;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i12, i6Var);
        if (i11 < 0) {
            i11 = i12;
        }
        int f21 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        Paint paint = this.f49241e;
        paint.setColor(f21);
        if (recordCircle != null) {
            float f22 = 1.0f - f20;
            org.telegram.ui.Components.w9 w9Var = recordCircle.h;
            org.telegram.ui.Components.w9 w9Var2 = recordCircle.f32745n;
            f11 = x10;
            float interpolation3 = org.telegram.ui.Components.lr.f37209g.getInterpolation(recordCircle.I);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f23 = chatActivityEnterView.X4;
            if (f23 > 0.7f) {
                f12 = 1.0f;
            } else {
                f12 = f23 / 0.7f;
            }
            canvas.save();
            float f24 = ((w9Var2.f41645t * 1.4f) + 0.878f) * chatActivityEnterView.V4 * f12 * interpolation3 * f22;
            canvas.scale(f24, f24, f16, f18);
            w9Var2.a(f16, f18, canvas, w9Var2.d);
            canvas.restore();
            float f25 = ((w9Var.f41645t * 1.4f) + 0.926f) * chatActivityEnterView.V4 * f12 * interpolation3 * f22;
            canvas.save();
            canvas.scale(f25, f25, f16, f18);
            w9Var.a(f16, f18, canvas, w9Var.d);
            canvas.restore();
        } else {
            f11 = x10;
        }
        canvas.drawCircle(f16, f18, f19, paint);
        canvas.save();
        final float f26 = f19 / height;
        canvas.scale(f26, f26, f16, f18);
        final float centerX = f16 - r1Var.getRadialProgress().f33052a.centerX();
        final float centerY = f18 - r1Var.getRadialProgress().f33052a.centerY();
        canvas.translate(centerX, centerY);
        r1Var.getRadialProgress().E = interpolation;
        r1Var.getRadialProgress().B = false;
        final float f27 = f11;
        r1Var.C1(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f28;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                kc1 kc1Var = kc1.this;
                RadialProgress2 radialProgress = kc1Var.f49238a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = kc1Var.f49243g;
                if (recordCircle2 != null) {
                    int i13 = (int) f27;
                    int i14 = (int) f15;
                    float f35 = 1.0f - f13;
                    recordCircle2.b();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f32596g5;
                    Rect rect = chatActivityEnterView2.H4;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f32744f != 1.0f) {
                            if (chatActivityEnterView2.f32567d1) {
                                drawable3 = chatActivityEnterView2.E4;
                            } else {
                                drawable3 = chatActivityEnterView2.D4;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.F4;
                        canvas2 = canvas3;
                        f28 = f35;
                        rect.set(org.telegram.ui.Cells.c0.C(2, i13, drawable2), org.telegram.ui.Cells.c0.A(2, i14, drawable2), org.telegram.ui.Cells.c0.y(2, i13, drawable2), org.telegram.ui.Cells.c0.j(2, i14, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c0.C(2, i13, drawable4), org.telegram.ui.Cells.c0.A(2, i14, drawable4), org.telegram.ui.Cells.c0.y(2, i13, drawable4), org.telegram.ui.Cells.c0.j(2, i14, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f28 = f35;
                        if (chatActivityEnterView2.f32567d1) {
                            drawable = chatActivityEnterView2.E4;
                        } else {
                            drawable = chatActivityEnterView2.D4;
                        }
                        drawable2 = drawable;
                        rect.set(i13 - org.telegram.messenger.g0.L(12.0f), i14 - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + i13, org.telegram.messenger.g0.L(12.0f) + i14);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    float f36 = 1.0f;
                    float L = (recordCircle2.M - org.telegram.messenger.g0.L(19.0f)) / Math.max(1.0f, recordCircle2.f32746r - org.telegram.messenger.g0.L(19.0f));
                    if (L < 0.0f) {
                        f36 = 0.0f;
                    } else if (L <= 1.0f) {
                        f36 = L;
                    }
                    recordCircle2.f32741d0 = f36;
                    canvas3 = canvas2;
                    recordCircle2.c(canvas3, drawable5, drawable6, recordCircle2.f32744f, (int) (255.0f * f28));
                }
                canvas3.scale(f31, f31, f33, f34);
                canvas3.translate(f29, f30);
            }
        });
        r1Var.getRadialProgress().B = true;
        r1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
