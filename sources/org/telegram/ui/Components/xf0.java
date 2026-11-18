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
public final class xf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final xt0[] K;
    public final c6 L;
    public final fi.d5 M;
    public boolean f41999a;
    public final Object f42000b;
    public final kg0[] f42001c;
    public final kg0[] d;
    public volatile boolean f42002e;
    public final Paint[] f42003f;
    public fg0 h;
    public int f42004n;
    public int f42005r;
    public final wf0 f42006s;
    public final wf0 f42007w;
    public int f42008x;
    public int f42009y;

    public xf0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41999a = z10;
        this.f42000b = new Object();
        this.f42001c = new kg0[3];
        this.d = new kg0[3];
        this.f42002e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f42003f = paintArr;
        this.f42006s = new wf0(this, 0);
        this.f42007w = new wf0(this, 1);
        this.f42008x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new xt0[3];
        c6 c6Var = new c6(this, 0L, 350L, lr.f37208f);
        this.L = c6Var;
        this.M = new fi.d5(2, this);
        c6Var.e(true, 1.0f);
        boolean z11 = this.f41999a & org.telegram.messenger.bz.f23149a0;
        this.f41999a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(xf0 xf0Var, int i7, int i10, int i11) {
        synchronized (xf0Var.f42000b) {
            try {
                kg0[] kg0VarArr = xf0Var.f42001c;
                kg0 kg0Var = kg0VarArr[i7];
                kg0VarArr[i7] = kg0VarArr[i10];
                kg0VarArr[i10] = kg0Var;
                kg0[] kg0VarArr2 = xf0Var.d;
                kg0 kg0Var2 = kg0VarArr2[i7];
                kg0VarArr2[i7] = kg0VarArr2[i10];
                kg0VarArr2[i10] = kg0Var2;
                if (i7 == 2) {
                    if (kg0Var2.f36760f) {
                        xf0Var.b(i10, kg0Var2.f36757b);
                    }
                } else {
                    Paint[] paintArr = xf0Var.f42003f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    xf0Var.f42003f[i11].setShader(null);
                    kg0 kg0Var3 = xf0Var.f42001c[i11];
                    if (kg0Var3 != null && !kg0Var3.f36759e && !kg0Var3.d) {
                        kg0Var3.f36760f = false;
                        kg0Var3.f36757b.eraseColor(0);
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
        int o4 = org.telegram.messenger.bz.o();
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42005r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42005r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f42003f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        fg0 fg0Var = this.h;
        if (fg0Var != null) {
            fi.d5 d5Var = this.M;
            ArrayList arrayList = fg0Var.f4450l0;
            if (arrayList != null) {
                arrayList.remove(d5Var);
            }
            this.h = null;
        }
        this.f42002e = false;
        lg0.f37122a.cancelRunnable(this.f42006s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.f42000b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    kg0 kg0Var = this.f42001c[i7];
                    if (kg0Var != null) {
                        kg0Var.a();
                        this.f42001c[i7] = null;
                    }
                    kg0 kg0Var2 = this.d[i7];
                    if (kg0Var2 != null) {
                        kg0Var2.a();
                        this.d[i7] = null;
                    }
                    xt0 xt0Var = this.K[i7];
                    if (xt0Var != null) {
                        xt0Var.e(null);
                        this.K[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f42003f[0].setShader(null);
            this.f42003f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.wv0 wv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        fg0 fg0Var = this.h;
        if (fg0Var != null && fg0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f41999a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (wv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        xt0[] xt0VarArr = this.K;
                        xt0 xt0Var = xt0VarArr[0];
                        if (xt0Var != null) {
                            xt0Var.e(null);
                        }
                        xt0 xt0Var2 = xt0VarArr[1];
                        if (xt0Var2 != null) {
                            xt0Var2.e(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f42005r + this.f42004n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f42009y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f42009y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f42009y) + f10, 0.0f);
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
                    } else if (wv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f42005r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f42004n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.J.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        o5 o5Var = wv0Var.f38745e;
                        if (o5Var != null) {
                            imageReceiver = o5Var.f37976k;
                        } else {
                            imageReceiver = wv0Var.f38742a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (wv0Var.f53536b0 && wv0Var.W > 0.0f) {
                            f(wv0Var.V, beginRecording2, f17, f11);
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
                } else if (wv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f41999a = false;
                    setLayerType(1, this.f42003f[0]);
                    setLayerType(1, this.f42003f[1]);
                } else {
                    return;
                }
            }
            if (this.I || this.H || this.G || (this.f42003f[0].getShader() == null && this.f42003f[1].getShader() == null && !this.f42002e)) {
                boolean c10 = c();
                if (!this.f42002e && c10) {
                    this.f42002e = true;
                    org.telegram.messenger.r5 r5Var = lg0.f37122a;
                    r5Var.cancelRunnable(this.f42006s);
                    r5Var.postRunnable(this.f42006s);
                }
            }
            if (this.f42003f[0].getShader() != null || this.f42003f[1].getShader() != null) {
                synchronized (this.f42000b) {
                    try {
                        float f19 = f10 / this.E;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.F);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f42004n / f19;
                        if (this.f42003f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f42009y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                            float f21 = this.F;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.E, f21 + f20, this.f42003f[0]);
                            canvas.restore();
                            this.f42003f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.F;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.E, f22, this.f42003f[0]);
                            this.f42003f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f42009y != 0 && this.f42003f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f42009y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.F);
                            float f23 = this.F;
                            canvas2.drawRect(0.0f, f23, this.E, f23 + f20, this.f42003f[1]);
                            canvas.restore();
                            this.f42003f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.F;
                            canvas.drawRect(0.0f, f24 * f12, this.E, f24, this.f42003f[1]);
                            this.f42003f[1].setAlpha(255);
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
        kg0 kg0Var = this.f42001c[i7];
        if (view != null && !kg0Var.f36759e) {
            Canvas canvas = kg0Var.f36756a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f42005r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            kg0Var.f36760f = true;
        }
        if (i7 != 0 && (this.f42009y == 0 || i7 != 1)) {
            return;
        }
        boolean z10 = view instanceof xt0;
        xt0[] xt0VarArr = this.K;
        if (z10) {
            xt0VarArr[i7] = (xt0) view;
        } else {
            xt0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f42008x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f42005r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f42005r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof xt0;
        xt0[] xt0VarArr = this.K;
        if (z10) {
            xt0 xt0Var = (xt0) E;
            xt0VarArr[i7] = xt0Var;
            xt0Var.e(this.f42007w);
            return;
        }
        xt0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42005r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42005r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f42005r + this.f42004n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f41999a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f42004n != i7) {
            invalidate();
        }
        this.f42004n = i7;
        this.f42005r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(fg0 fg0Var) {
        d();
        this.h = fg0Var;
        this.f42008x = fg0Var.getCurrentItem();
        this.f42009y = 0;
        fg0Var.b(this.M);
    }
}
