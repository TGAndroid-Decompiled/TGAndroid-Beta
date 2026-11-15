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
    public final pt0[] K;
    public final u5 L;
    public final fi.f5 M;
    public boolean f37558a;
    public final Object f37559b;
    public final ag0[] f37560c;
    public final ag0[] d;
    public volatile boolean f37561e;
    public final Paint[] f37562f;
    public vf0 h;
    public int f37563n;
    public int f37564r;
    public final mf0 f37565s;
    public final mf0 f37566w;
    public int f37567x;
    public int f37568y;

    public nf0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37558a = z10;
        this.f37559b = new Object();
        this.f37560c = new ag0[3];
        this.d = new ag0[3];
        this.f37561e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f37562f = paintArr;
        this.f37565s = new mf0(this, 0);
        this.f37566w = new mf0(this, 1);
        this.f37567x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new pt0[3];
        u5 u5Var = new u5(this, 0L, 350L, er.f34419f);
        this.L = u5Var;
        this.M = new fi.f5(2, this);
        u5Var.e(true, 1.0f);
        boolean z11 = this.f37558a & org.telegram.messenger.gz.f23933a0;
        this.f37558a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(nf0 nf0Var, int i7, int i10, int i11) {
        synchronized (nf0Var.f37559b) {
            try {
                ag0[] ag0VarArr = nf0Var.f37560c;
                ag0 ag0Var = ag0VarArr[i7];
                ag0VarArr[i7] = ag0VarArr[i10];
                ag0VarArr[i10] = ag0Var;
                ag0[] ag0VarArr2 = nf0Var.d;
                ag0 ag0Var2 = ag0VarArr2[i7];
                ag0VarArr2[i7] = ag0VarArr2[i10];
                ag0VarArr2[i10] = ag0Var2;
                if (i7 == 2) {
                    if (ag0Var2.f32991f) {
                        nf0Var.b(i10, ag0Var2.f32988b);
                    }
                } else {
                    Paint[] paintArr = nf0Var.f37562f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    nf0Var.f37562f[i11].setShader(null);
                    ag0 ag0Var3 = nf0Var.f37560c[i11];
                    if (ag0Var3 != null && !ag0Var3.f32990e && !ag0Var3.d) {
                        ag0Var3.f32991f = false;
                        ag0Var3.f32988b.eraseColor(0);
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
        int o4 = org.telegram.messenger.gz.o();
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f37564r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f37564r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f37562f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        vf0 vf0Var = this.h;
        if (vf0Var != null) {
            fi.f5 f5Var = this.M;
            ArrayList arrayList = vf0Var.f4169l0;
            if (arrayList != null) {
                arrayList.remove(f5Var);
            }
            this.h = null;
        }
        this.f37561e = false;
        bg0.f33279a.cancelRunnable(this.f37565s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.f37559b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    ag0 ag0Var = this.f37560c[i7];
                    if (ag0Var != null) {
                        ag0Var.a();
                        this.f37560c[i7] = null;
                    }
                    ag0 ag0Var2 = this.d[i7];
                    if (ag0Var2 != null) {
                        ag0Var2.a();
                        this.d[i7] = null;
                    }
                    pt0 pt0Var = this.K[i7];
                    if (pt0Var != null) {
                        pt0Var.d(null);
                        this.K[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f37562f[0].setShader(null);
            this.f37562f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.vv0 vv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        vf0 vf0Var = this.h;
        if (vf0Var != null && vf0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f37558a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (vv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        pt0[] pt0VarArr = this.K;
                        pt0 pt0Var = pt0VarArr[0];
                        if (pt0Var != null) {
                            pt0Var.d(null);
                        }
                        pt0 pt0Var2 = pt0VarArr[1];
                        if (pt0Var2 != null) {
                            pt0Var2.d(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f37564r + this.f37563n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f37568y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f37568y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f37568y) + f10, 0.0f);
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
                    } else if (vv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f37564r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f37563n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.J.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        g5 g5Var = vv0Var.f35502e;
                        if (g5Var != null) {
                            imageReceiver = g5Var.f34813k;
                        } else {
                            imageReceiver = vv0Var.f35499a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (vv0Var.f52305b0 && vv0Var.W > 0.0f) {
                            f(vv0Var.V, beginRecording2, f17, f11);
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
                } else if (vv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f37558a = false;
                    setLayerType(1, this.f37562f[0]);
                    setLayerType(1, this.f37562f[1]);
                } else {
                    return;
                }
            }
            if (this.I || this.H || this.G || (this.f37562f[0].getShader() == null && this.f37562f[1].getShader() == null && !this.f37561e)) {
                boolean c10 = c();
                if (!this.f37561e && c10) {
                    this.f37561e = true;
                    org.telegram.messenger.q5 q5Var = bg0.f33279a;
                    q5Var.cancelRunnable(this.f37565s);
                    q5Var.postRunnable(this.f37565s);
                }
            }
            if (this.f37562f[0].getShader() != null || this.f37562f[1].getShader() != null) {
                synchronized (this.f37559b) {
                    try {
                        float f19 = f10 / this.E;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.F);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f37563n / f19;
                        if (this.f37562f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f37568y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                            float f21 = this.F;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.E, f21 + f20, this.f37562f[0]);
                            canvas.restore();
                            this.f37562f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.F;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.E, f22, this.f37562f[0]);
                            this.f37562f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f37568y != 0 && this.f37562f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f37568y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.F);
                            float f23 = this.F;
                            canvas2.drawRect(0.0f, f23, this.E, f23 + f20, this.f37562f[1]);
                            canvas.restore();
                            this.f37562f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.F;
                            canvas.drawRect(0.0f, f24 * f12, this.E, f24, this.f37562f[1]);
                            this.f37562f[1].setAlpha(255);
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
        ag0 ag0Var = this.f37560c[i7];
        if (view != null && !ag0Var.f32990e) {
            Canvas canvas = ag0Var.f32987a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f37564r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ag0Var.f32991f = true;
        }
        if (i7 != 0 && (this.f37568y == 0 || i7 != 1)) {
            return;
        }
        boolean z10 = view instanceof pt0;
        pt0[] pt0VarArr = this.K;
        if (z10) {
            pt0VarArr[i7] = (pt0) view;
        } else {
            pt0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f37567x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f37564r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f37564r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof pt0;
        pt0[] pt0VarArr = this.K;
        if (z10) {
            pt0 pt0Var = (pt0) E;
            pt0VarArr[i7] = pt0Var;
            pt0Var.d(this.f37566w);
            return;
        }
        pt0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f37564r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f37564r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f37564r + this.f37563n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f37558a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f37563n != i7) {
            invalidate();
        }
        this.f37563n = i7;
        this.f37564r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(vf0 vf0Var) {
        d();
        this.h = vf0Var;
        this.f37567x = vf0Var.getCurrentItem();
        this.f37568y = 0;
        vf0Var.b(this.M);
    }
}
