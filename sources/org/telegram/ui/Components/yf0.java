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
public final class yf0 extends View {
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public RenderNode J;
    public final zt0[] K;
    public final c6 L;
    public final fi.e5 M;
    public boolean f42443a;
    public final Object f42444b;
    public final lg0[] f42445c;
    public final lg0[] d;
    public volatile boolean f42446e;
    public final Paint[] f42447f;
    public gg0 h;
    public int f42448n;
    public int f42449r;
    public final xf0 f42450s;
    public final xf0 f42451w;
    public int f42452x;
    public int f42453y;

    public yf0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42443a = z10;
        this.f42444b = new Object();
        this.f42445c = new lg0[3];
        this.d = new lg0[3];
        this.f42446e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f42447f = paintArr;
        this.f42450s = new xf0(this, 0);
        this.f42451w = new xf0(this, 1);
        this.f42452x = -1;
        this.G = false;
        this.H = false;
        this.I = false;
        this.K = new zt0[3];
        c6 c6Var = new c6(this, 0L, 350L, kr.f36858f);
        this.L = c6Var;
        this.M = new fi.e5(2, this);
        c6Var.e(true, 1.0f);
        boolean z11 = this.f42443a & org.telegram.messenger.bz.f23271a0;
        this.f42443a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(yf0 yf0Var, int i7, int i10, int i11) {
        synchronized (yf0Var.f42444b) {
            try {
                lg0[] lg0VarArr = yf0Var.f42445c;
                lg0 lg0Var = lg0VarArr[i7];
                lg0VarArr[i7] = lg0VarArr[i10];
                lg0VarArr[i10] = lg0Var;
                lg0[] lg0VarArr2 = yf0Var.d;
                lg0 lg0Var2 = lg0VarArr2[i7];
                lg0VarArr2[i7] = lg0VarArr2[i10];
                lg0VarArr2[i10] = lg0Var2;
                if (i7 == 2) {
                    if (lg0Var2.f37129f) {
                        yf0Var.b(i10, lg0Var2.f37126b);
                    }
                } else {
                    Paint[] paintArr = yf0Var.f42447f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    yf0Var.f42447f[i11].setShader(null);
                    lg0 lg0Var3 = yf0Var.f42445c[i11];
                    if (lg0Var3 != null && !lg0Var3.f37128e && !lg0Var3.d) {
                        lg0Var3.f37129f = false;
                        lg0Var3.f37126b.eraseColor(0);
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
        imageReceiver.K0(0);
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
        imageReceiver.K0(i7);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42449r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42449r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f42447f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        gg0 gg0Var = this.h;
        if (gg0Var != null) {
            fi.e5 e5Var = this.M;
            ArrayList arrayList = gg0Var.f4442l0;
            if (arrayList != null) {
                arrayList.remove(e5Var);
            }
            this.h = null;
        }
        this.f42446e = false;
        mg0.f37451a.cancelRunnable(this.f42450s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.J) != null) {
            renderNode.discardDisplayList();
            this.J = null;
        }
        synchronized (this.f42444b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    lg0 lg0Var = this.f42445c[i7];
                    if (lg0Var != null) {
                        lg0Var.a();
                        this.f42445c[i7] = null;
                    }
                    lg0 lg0Var2 = this.d[i7];
                    if (lg0Var2 != null) {
                        lg0Var2.a();
                        this.d[i7] = null;
                    }
                    zt0 zt0Var = this.K[i7];
                    if (zt0Var != null) {
                        zt0Var.d(null);
                        this.K[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f42447f[0].setShader(null);
            this.f42447f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.vv0 vv0Var, float f10, float f11, boolean z10, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        gg0 gg0Var = this.h;
        if (gg0Var != null && gg0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f42443a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (vv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        zt0[] zt0VarArr = this.K;
                        zt0 zt0Var = zt0VarArr[0];
                        if (zt0Var != null) {
                            zt0Var.d(null);
                        }
                        zt0 zt0Var2 = zt0VarArr[1];
                        if (zt0Var2 != null) {
                            zt0Var2.d(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f42449r + this.f42448n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.J.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f42453y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f42453y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f42453y) + f10, 0.0f);
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
                        float f17 = this.f42449r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f42448n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.J.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        o5 o5Var = vv0Var.f38432e;
                        if (o5Var != null) {
                            imageReceiver = o5Var.f38028k;
                        } else {
                            imageReceiver = vv0Var.f38429a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (vv0Var.f53038b0 && vv0Var.W > 0.0f) {
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
                    this.f42443a = false;
                    setLayerType(1, this.f42447f[0]);
                    setLayerType(1, this.f42447f[1]);
                } else {
                    return;
                }
            }
            if (this.I || this.H || this.G || (this.f42447f[0].getShader() == null && this.f42447f[1].getShader() == null && !this.f42446e)) {
                boolean c10 = c();
                if (!this.f42446e && c10) {
                    this.f42446e = true;
                    org.telegram.messenger.r5 r5Var = mg0.f37451a;
                    r5Var.cancelRunnable(this.f42450s);
                    r5Var.postRunnable(this.f42450s);
                }
            }
            if (this.f42447f[0].getShader() != null || this.f42447f[1].getShader() != null) {
                synchronized (this.f42444b) {
                    try {
                        float f19 = f10 / this.E;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.F);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f42448n / f19;
                        if (this.f42447f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f42453y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.F);
                            float f21 = this.F;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.E, f21 + f20, this.f42447f[0]);
                            canvas.restore();
                            this.f42447f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.F;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.E, f22, this.f42447f[0]);
                            this.f42447f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f42453y != 0 && this.f42447f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f42453y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.F);
                            float f23 = this.F;
                            canvas2.drawRect(0.0f, f23, this.E, f23 + f20, this.f42447f[1]);
                            canvas.restore();
                            this.f42447f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.F;
                            canvas.drawRect(0.0f, f24 * f12, this.E, f24, this.f42447f[1]);
                            this.f42447f[1].setAlpha(255);
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
        lg0 lg0Var = this.f42445c[i7];
        if (view != null && !lg0Var.f37128e) {
            Canvas canvas = lg0Var.f37125a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f42449r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            lg0Var.f37129f = true;
        }
        if (i7 != 0 && (this.f42453y == 0 || i7 != 1)) {
            return;
        }
        boolean z10 = view instanceof zt0;
        zt0[] zt0VarArr = this.K;
        if (z10) {
            zt0VarArr[i7] = (zt0) view;
        } else {
            zt0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f42452x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f42449r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f42449r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof zt0;
        zt0[] zt0VarArr = this.K;
        if (z10) {
            zt0 zt0Var = (zt0) E;
            zt0VarArr[i7] = zt0Var;
            zt0Var.d(this.f42451w);
            return;
        }
        zt0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.J == null) {
            float renderNodeScale = getRenderNodeScale();
            this.J = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f42449r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f42449r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f42449r + this.f42448n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f42443a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f42448n != i7) {
            invalidate();
        }
        this.f42448n = i7;
        this.f42449r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(gg0 gg0Var) {
        d();
        this.h = gg0Var;
        this.f42452x = gg0Var.getCurrentItem();
        this.f42453y = 0;
        gg0Var.b(this.M);
    }
}
