package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
public final class zf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final au0[] K;
    public final d6 L;
    public final fi.d5 M;
    public boolean f42755a;
    public final Object f42756b;
    public final mg0[] f42757c;
    public final mg0[] d;
    public volatile boolean f42758e;
    public final Paint[] f42759f;
    public hg0 h;
    public int f42760n;
    public int f42761r;
    public final yf0 f42762s;
    public final yf0 f42763w;
    public int f42764x;
    public int f42765y;

    public zf0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42755a = z10;
        this.f42756b = new Object();
        this.f42757c = new mg0[3];
        this.d = new mg0[3];
        this.f42758e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f42759f = paintArr;
        this.f42762s = new yf0(this, 0);
        this.f42763w = new yf0(this, 1);
        this.f42764x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new au0[3];
        d6 d6Var = new d6(this, 0L, 350L, nr.f37917f);
        this.L = d6Var;
        this.M = new fi.d5(2, this);
        d6Var.e(true, 1.0f);
        boolean z11 = this.f42755a & org.telegram.messenger.cz.f23355a0;
        this.f42755a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(zf0 zf0Var, int i7, int i10, int i11) {
        synchronized (zf0Var.f42756b) {
            try {
                mg0[] mg0VarArr = zf0Var.f42757c;
                mg0 mg0Var = mg0VarArr[i7];
                mg0VarArr[i7] = mg0VarArr[i10];
                mg0VarArr[i10] = mg0Var;
                mg0[] mg0VarArr2 = zf0Var.d;
                mg0 mg0Var2 = mg0VarArr2[i7];
                mg0VarArr2[i7] = mg0VarArr2[i10];
                mg0VarArr2[i10] = mg0Var2;
                if (i7 == 2) {
                    if (mg0Var2.f37471f) {
                        zf0Var.b(i10, mg0Var2.f37468b);
                    }
                } else {
                    Paint[] paintArr = zf0Var.f42759f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    zf0Var.f42759f[i11].setShader(null);
                    mg0 mg0Var3 = zf0Var.f42757c[i11];
                    if (mg0Var3 != null && !mg0Var3.f37470e && !mg0Var3.d) {
                        mg0Var3.f37471f = false;
                        mg0Var3.f37468b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void f(ImageReceiver imageReceiver, Canvas canvas, float f10, float f11) {
        if (imageReceiver == null) {
            return;
        }
        int i7 = imageReceiver.X0[0];
        imageReceiver.J0(0);
        canvas.save();
        canvas.translate(0.0f, f10 - f11);
        imageReceiver.h(canvas, null);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f11) - f10);
        canvas.scale(1.0f, 2.0f, 0.0f, f11);
        imageReceiver.h(canvas, null);
        canvas.restore();
        imageReceiver.J0(i7);
    }

    private float getBlurRadius() {
        int o4 = org.telegram.messenger.cz.o();
        if (o4 != 1) {
            if (o4 != 2) {
                return 8.0f;
            }
            return 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.g0.L(1.0f);
    }

    public final void b(int i7, Bitmap bitmap) {
        if (i7 < 2 && bitmap != null && !bitmap.isRecycled()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42761r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42761r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f42759f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        hg0 hg0Var = this.h;
        if (hg0Var != null) {
            fi.d5 d5Var = this.M;
            ArrayList arrayList = hg0Var.f4442l0;
            if (arrayList != null) {
                arrayList.remove(d5Var);
            }
            this.h = null;
        }
        this.f42758e = false;
        ng0.f37831a.cancelRunnable(this.f42762s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.f42756b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    mg0 mg0Var = this.f42757c[i7];
                    if (mg0Var != null) {
                        mg0Var.a();
                        this.f42757c[i7] = null;
                    }
                    mg0 mg0Var2 = this.d[i7];
                    if (mg0Var2 != null) {
                        mg0Var2.a();
                        this.d[i7] = null;
                    }
                    au0 au0Var = this.K[i7];
                    if (au0Var != null) {
                        au0Var.e(null);
                        this.K[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f42759f[0].setShader(null);
            this.f42759f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.xv0 xv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        hg0 hg0Var = this.h;
        if (hg0Var != null && hg0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f42755a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (xv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        au0[] au0VarArr = this.K;
                        au0 au0Var = au0VarArr[0];
                        if (au0Var != null) {
                            au0Var.e(null);
                        }
                        au0 au0Var2 = au0VarArr[1];
                        if (au0Var2 != null) {
                            au0Var2.e(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f42761r + this.f42760n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f42765y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f42765y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f42765y) + f10, 0.0f);
                            h(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.J.endRecording();
                        this.J.setAlpha(this.L.e(false, 1.0f));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.J);
                        canvas2.restore();
                        return;
                    } else if (xv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f42761r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f42760n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.J.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        p5 p5Var = xv0Var.f38792e;
                        if (p5Var != null) {
                            imageReceiver = p5Var.f38457k;
                        } else {
                            imageReceiver = xv0Var.f38789a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (xv0Var.f53943b0 && xv0Var.W > 0.0f) {
                            f(xv0Var.V, beginRecording2, f17, f11);
                        }
                        this.J.endRecording();
                        this.J.setAlpha(f13);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.J);
                        return;
                    } else {
                        return;
                    }
                } else if (xv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f42755a = false;
                    setLayerType(1, this.f42759f[0]);
                    setLayerType(1, this.f42759f[1]);
                } else {
                    return;
                }
            }
            if (this.I || this.H || this.G || (this.f42759f[0].getShader() == null && this.f42759f[1].getShader() == null && !this.f42758e)) {
                boolean c10 = c();
                if (!this.f42758e && c10) {
                    this.f42758e = true;
                    org.telegram.messenger.r5 r5Var = ng0.f37831a;
                    r5Var.cancelRunnable(this.f42762s);
                    r5Var.postRunnable(this.f42762s);
                }
            }
            if (this.f42759f[0].getShader() != null || this.f42759f[1].getShader() != null) {
                synchronized (this.f42756b) {
                    try {
                        float f19 = f10 / this.E;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.F);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f42760n / f19;
                        if (this.f42759f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f42765y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                            float f21 = this.F;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.E, f21 + f20, this.f42759f[0]);
                            canvas.restore();
                            this.f42759f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.F;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.E, f22, this.f42759f[0]);
                            this.f42759f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f42765y != 0 && this.f42759f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f42765y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.F);
                            float f23 = this.F;
                            canvas2.drawRect(0.0f, f23, this.E, f23 + f20, this.f42759f[1]);
                            canvas.restore();
                            this.f42759f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.F;
                            canvas.drawRect(0.0f, f24 * f12, this.E, f24, this.f42759f[1]);
                            this.f42759f[1].setAlpha(255);
                            canvas.restore();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void g(int i7, View view) {
        mg0 mg0Var = this.f42757c[i7];
        if (view != null && !mg0Var.f37470e) {
            Canvas canvas = mg0Var.f37467a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f42761r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            mg0Var.f37471f = true;
        }
        if (i7 != 0 && (this.f42765y == 0 || i7 != 1)) {
            return;
        }
        boolean z10 = view instanceof au0;
        au0[] au0VarArr = this.K;
        if (z10) {
            au0VarArr[i7] = (au0) view;
        } else {
            au0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f42764x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f42761r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f42761r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof au0;
        au0[] au0VarArr = this.K;
        if (z10) {
            au0 au0Var = (au0) E;
            au0VarArr[i7] = au0Var;
            au0Var.e(this.f42763w);
            return;
        }
        au0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42761r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42761r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.J;
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(createBlurEffect, createShaderEffect, blendMode));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f42761r + this.f42760n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f42755a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f42760n != i7) {
            invalidate();
        }
        this.f42760n = i7;
        this.f42761r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(hg0 hg0Var) {
        d();
        this.h = hg0Var;
        this.f42764x = hg0Var.getCurrentItem();
        this.f42765y = 0;
        hg0Var.b(this.M);
    }
}
