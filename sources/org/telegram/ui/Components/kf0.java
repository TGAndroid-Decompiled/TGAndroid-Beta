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
public final class kf0 extends View {
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public RenderNode I;
    public final pt0[] J;
    public final v5 K;
    public final di.o5 L;
    public boolean f35305a;
    public final Object f35306b;
    public final xf0[] f35307c;
    public final xf0[] d;
    public volatile boolean f35308e;
    public final Paint[] f35309f;
    public sf0 h;
    public int f35310n;
    public int f35311r;
    public final jf0 f35312s;
    public final jf0 f35313w;
    public int f35314x;
    public int f35315y;

    public kf0(Context context) {
        super(context);
        boolean z9;
        if (Build.VERSION.SDK_INT >= 31) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35305a = z9;
        this.f35306b = new Object();
        this.f35307c = new xf0[3];
        this.d = new xf0[3];
        this.f35308e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f35309f = paintArr;
        this.f35312s = new jf0(this, 0);
        this.f35313w = new jf0(this, 1);
        this.f35314x = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.J = new pt0[3];
        v5 v5Var = new v5(this, 0L, 350L, wq.f40046f);
        this.K = v5Var;
        this.L = new di.o5(2, this);
        v5Var.e(true, 1.0f);
        boolean z10 = this.f35305a & org.telegram.messenger.iz.f23390a0;
        this.f35305a = z10;
        if (z10) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(kf0 kf0Var, int i7, int i10, int i11) {
        synchronized (kf0Var.f35306b) {
            try {
                xf0[] xf0VarArr = kf0Var.f35307c;
                xf0 xf0Var = xf0VarArr[i7];
                xf0VarArr[i7] = xf0VarArr[i10];
                xf0VarArr[i10] = xf0Var;
                xf0[] xf0VarArr2 = kf0Var.d;
                xf0 xf0Var2 = xf0VarArr2[i7];
                xf0VarArr2[i7] = xf0VarArr2[i10];
                xf0VarArr2[i10] = xf0Var2;
                if (i7 == 2) {
                    if (xf0Var2.f40302f) {
                        kf0Var.b(i10, xf0Var2.f40299b);
                    }
                } else {
                    Paint[] paintArr = kf0Var.f35309f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    kf0Var.f35309f[i11].setShader(null);
                    xf0 xf0Var3 = kf0Var.f35307c[i11];
                    if (xf0Var3 != null && !xf0Var3.f40301e && !xf0Var3.d) {
                        xf0Var3.f40302f = false;
                        xf0Var3.f40299b.eraseColor(0);
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
        int i7 = imageReceiver.W0[0];
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
        int o4 = org.telegram.messenger.iz.o();
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f35311r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f35311r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f35309f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        sf0 sf0Var = this.h;
        if (sf0Var != null) {
            di.o5 o5Var = this.L;
            ArrayList arrayList = sf0Var.f5345k0;
            if (arrayList != null) {
                arrayList.remove(o5Var);
            }
            this.h = null;
        }
        this.f35308e = false;
        yf0.f40574a.cancelRunnable(this.f35312s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.I) != null) {
            renderNode.discardDisplayList();
            this.I = null;
        }
        synchronized (this.f35306b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    xf0 xf0Var = this.f35307c[i7];
                    if (xf0Var != null) {
                        xf0Var.a();
                        this.f35307c[i7] = null;
                    }
                    xf0 xf0Var2 = this.d[i7];
                    if (xf0Var2 != null) {
                        xf0Var2.a();
                        this.d[i7] = null;
                    }
                    pt0 pt0Var = this.J[i7];
                    if (pt0Var != null) {
                        pt0Var.f(null);
                        this.J[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f35309f[0].setShader(null);
            this.f35309f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.zv0 zv0Var, float f10, float f11, boolean z9, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        sf0 sf0Var = this.h;
        if (sf0Var != null && sf0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f35305a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (zv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        pt0[] pt0VarArr = this.J;
                        pt0 pt0Var = pt0VarArr[0];
                        if (pt0Var != null) {
                            pt0Var.f(null);
                        }
                        pt0 pt0Var2 = pt0VarArr[1];
                        if (pt0Var2 != null) {
                            pt0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f35311r + this.f35310n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f35315y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f35315y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f35315y) + f10, 0.0f);
                            h(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.I.endRecording();
                        this.I.setAlpha(this.K.e(false, 1.0f));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        canvas2.restore();
                        return;
                    } else if (zv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f35311r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f35310n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.I.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        h5 h5Var = zv0Var.f35252e;
                        if (h5Var != null) {
                            imageReceiver = h5Var.f34176k;
                        } else {
                            imageReceiver = zv0Var.f35249a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (zv0Var.f52546a0 && zv0Var.V > 0.0f) {
                            f(zv0Var.U, beginRecording2, f17, f11);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f13);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.I);
                        return;
                    } else {
                        return;
                    }
                } else if (zv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f35305a = false;
                    setLayerType(1, this.f35309f[0]);
                    setLayerType(1, this.f35309f[1]);
                } else {
                    return;
                }
            }
            if (this.H || this.G || this.F || (this.f35309f[0].getShader() == null && this.f35309f[1].getShader() == null && !this.f35308e)) {
                boolean c10 = c();
                if (!this.f35308e && c10) {
                    this.f35308e = true;
                    org.telegram.messenger.q5 q5Var = yf0.f40574a;
                    q5Var.cancelRunnable(this.f35312s);
                    q5Var.postRunnable(this.f35312s);
                }
            }
            if (this.f35309f[0].getShader() != null || this.f35309f[1].getShader() != null) {
                synchronized (this.f35306b) {
                    try {
                        float f19 = f10 / this.D;
                        if (z9) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f35310n / f19;
                        if (this.f35309f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f35315y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.D, f21 + f20, this.f35309f[0]);
                            canvas.restore();
                            this.f35309f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.D, f22, this.f35309f[0]);
                            this.f35309f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f35315y != 0 && this.f35309f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f35315y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.D, f23 + f20, this.f35309f[1]);
                            canvas.restore();
                            this.f35309f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f12, this.D, f24, this.f35309f[1]);
                            this.f35309f[1].setAlpha(255);
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
        xf0 xf0Var = this.f35307c[i7];
        if (view != null && !xf0Var.f40301e) {
            Canvas canvas = xf0Var.f40298a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f35311r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            xf0Var.f40302f = true;
        }
        if (i7 != 0 && (this.f35315y == 0 || i7 != 1)) {
            return;
        }
        boolean z9 = view instanceof pt0;
        pt0[] pt0VarArr = this.J;
        if (z9) {
            pt0VarArr[i7] = (pt0) view;
        } else {
            pt0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f35314x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f35311r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f35311r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z9 = E instanceof pt0;
        pt0[] pt0VarArr = this.J;
        if (z9) {
            pt0 pt0Var = (pt0) E;
            pt0VarArr[i7] = pt0Var;
            pt0Var.f(this.f35313w);
            return;
        }
        pt0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f35311r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f35311r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.I;
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f35311r + this.f35310n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f35305a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f35310n != i7) {
            invalidate();
        }
        this.f35310n = i7;
        this.f35311r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(sf0 sf0Var) {
        d();
        this.h = sf0Var;
        this.f35314x = sf0Var.getCurrentItem();
        this.f35315y = 0;
        sf0Var.b(this.L);
    }
}
