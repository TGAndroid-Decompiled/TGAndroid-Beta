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
public final class nf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final nt0[] K;
    public final u5 L;
    public final ei.n5 M;
    public boolean f36498a;
    public final Object f36499b;
    public final ag0[] f36500c;
    public final ag0[] d;
    public volatile boolean f36501e;
    public final Paint[] f36502f;
    public vf0 h;
    public int f36503n;
    public int f36504r;
    public final mf0 f36505s;
    public final mf0 f36506w;
    public int f36507x;
    public int f36508y;

    public nf0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36498a = z10;
        this.f36499b = new Object();
        this.f36500c = new ag0[3];
        this.d = new ag0[3];
        this.f36501e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f36502f = paintArr;
        this.f36505s = new mf0(this, 0);
        this.f36506w = new mf0(this, 1);
        this.f36507x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new nt0[3];
        u5 u5Var = new u5(this, 0L, 350L, xq.f40452f);
        this.L = u5Var;
        this.M = new ei.n5(2, this);
        u5Var.e(true, 1.0f);
        boolean z11 = this.f36498a & org.telegram.messenger.az.f21613a0;
        this.f36498a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(nf0 nf0Var, int i3, int i10, int i11) {
        synchronized (nf0Var.f36499b) {
            try {
                ag0[] ag0VarArr = nf0Var.f36500c;
                ag0 ag0Var = ag0VarArr[i3];
                ag0VarArr[i3] = ag0VarArr[i10];
                ag0VarArr[i10] = ag0Var;
                ag0[] ag0VarArr2 = nf0Var.d;
                ag0 ag0Var2 = ag0VarArr2[i3];
                ag0VarArr2[i3] = ag0VarArr2[i10];
                ag0VarArr2[i10] = ag0Var2;
                if (i3 == 2) {
                    if (ag0Var2.f31843f) {
                        nf0Var.b(ag0Var2.f31840b, i10);
                    }
                } else {
                    Paint[] paintArr = nf0Var.f36502f;
                    Paint paint = paintArr[i3];
                    paintArr[i3] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    nf0Var.f36502f[i11].setShader(null);
                    ag0 ag0Var3 = nf0Var.f36500c[i11];
                    if (ag0Var3 != null && !ag0Var3.f31842e && !ag0Var3.d) {
                        ag0Var3.f31843f = false;
                        ag0Var3.f31840b.eraseColor(0);
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
        int i3 = imageReceiver.X0[0];
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
        imageReceiver.J0(i3);
    }

    private float getBlurRadius() {
        int o10 = org.telegram.messenger.az.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 8.0f;
            }
            return 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.g0.L(1.0f);
    }

    public final void b(Bitmap bitmap, int i3) {
        if (i3 < 2 && bitmap != null && !bitmap.isRecycled()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f36504r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f36504r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f36502f[i3].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        vf0 vf0Var = this.h;
        if (vf0Var != null) {
            ei.n5 n5Var = this.M;
            ArrayList arrayList = vf0Var.f2431l0;
            if (arrayList != null) {
                arrayList.remove(n5Var);
            }
            this.h = null;
        }
        this.f36501e = false;
        bg0.f32203a.cancelRunnable(this.f36505s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.f36499b) {
            for (int i3 = 0; i3 < 3; i3++) {
                try {
                    ag0 ag0Var = this.f36500c[i3];
                    if (ag0Var != null) {
                        ag0Var.a();
                        this.f36500c[i3] = null;
                    }
                    ag0 ag0Var2 = this.d[i3];
                    if (ag0Var2 != null) {
                        ag0Var2.a();
                        this.d[i3] = null;
                    }
                    nt0 nt0Var = this.K[i3];
                    if (nt0Var != null) {
                        nt0Var.f(null);
                        this.K[i3] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f36502f[0].setShader(null);
            this.f36502f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.nv0 nv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        vf0 vf0Var = this.h;
        if (vf0Var != null && vf0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f36498a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (nv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        nt0[] nt0VarArr = this.K;
                        nt0 nt0Var = nt0VarArr[0];
                        if (nt0Var != null) {
                            nt0Var.f(null);
                        }
                        nt0 nt0Var2 = nt0VarArr[1];
                        if (nt0Var2 != null) {
                            nt0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f36504r + this.f36503n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f36508y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f36508y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f36508y) + f10, 0.0f);
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
                    } else if (nv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f36504r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f36503n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.J.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        g5 g5Var = nv0Var.f35345e;
                        if (g5Var != null) {
                            imageReceiver = g5Var.f33971k;
                        } else {
                            imageReceiver = nv0Var.f35342a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (nv0Var.f48132b0 && nv0Var.W > 0.0f) {
                            f(nv0Var.V, beginRecording2, f17, f11);
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
                } else if (nv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f36498a = false;
                    setLayerType(1, this.f36502f[0]);
                    setLayerType(1, this.f36502f[1]);
                } else {
                    return;
                }
            }
            if (this.I || this.H || this.G || (this.f36502f[0].getShader() == null && this.f36502f[1].getShader() == null && !this.f36501e)) {
                boolean c2 = c();
                if (!this.f36501e && c2) {
                    this.f36501e = true;
                    org.telegram.messenger.q5 q5Var = bg0.f32203a;
                    q5Var.cancelRunnable(this.f36505s);
                    q5Var.postRunnable(this.f36505s);
                }
            }
            if (this.f36502f[0].getShader() != null || this.f36502f[1].getShader() != null) {
                synchronized (this.f36499b) {
                    try {
                        float f19 = f10 / this.E;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.F);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f36503n / f19;
                        if (this.f36502f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f36508y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                            float f21 = this.F;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.E, f21 + f20, this.f36502f[0]);
                            canvas.restore();
                            this.f36502f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.F;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.E, f22, this.f36502f[0]);
                            this.f36502f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f36508y != 0 && this.f36502f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f36508y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.F);
                            float f23 = this.F;
                            canvas2.drawRect(0.0f, f23, this.E, f23 + f20, this.f36502f[1]);
                            canvas.restore();
                            this.f36502f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.F;
                            canvas.drawRect(0.0f, f24 * f12, this.E, f24, this.f36502f[1]);
                            this.f36502f[1].setAlpha(255);
                            canvas.restore();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void g(int i3, View view) {
        ag0 ag0Var = this.f36500c[i3];
        if (view != null && !ag0Var.f31842e) {
            Canvas canvas = ag0Var.f31839a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f36504r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ag0Var.f31843f = true;
        }
        if (i3 != 0 && (this.f36508y == 0 || i3 != 1)) {
            return;
        }
        boolean z10 = view instanceof nt0;
        nt0[] nt0VarArr = this.K;
        if (z10) {
            nt0VarArr[i3] = (nt0) view;
        } else {
            nt0VarArr[i3] = null;
        }
    }

    public final void h(Canvas canvas, int i3) {
        View E = this.h.E(this.f36507x + i3);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f36504r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f36504r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof nt0;
        nt0[] nt0VarArr = this.K;
        if (z10) {
            nt0 nt0Var = (nt0) E;
            nt0VarArr[i3] = nt0Var;
            nt0Var.f(this.f36506w);
            return;
        }
        nt0VarArr[i3] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f36504r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f36504r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), this.f36504r + this.f36503n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f36498a) {
            invalidate();
        }
    }

    public void setSize(int i3) {
        if (this.f36503n != i3) {
            invalidate();
        }
        this.f36503n = i3;
        this.f36504r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(vf0 vf0Var) {
        d();
        this.h = vf0Var;
        this.f36507x = vf0Var.getCurrentItem();
        this.f36508y = 0;
        vf0Var.b(this.M);
    }
}
