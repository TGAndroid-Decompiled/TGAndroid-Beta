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
public final class lf0 extends View {
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public RenderNode I;
    public final qt0[] J;
    public final w5 K;
    public final di.o5 L;
    public boolean f35703a;
    public final Object f35704b;
    public final yf0[] f35705c;
    public final yf0[] d;
    public volatile boolean f35706e;
    public final Paint[] f35707f;
    public tf0 h;
    public int f35708n;
    public int f35709r;
    public final kf0 f35710s;
    public final kf0 f35711w;
    public int f35712x;
    public int f35713y;

    public lf0(Context context) {
        super(context);
        boolean z9;
        if (Build.VERSION.SDK_INT >= 31) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35703a = z9;
        this.f35704b = new Object();
        this.f35705c = new yf0[3];
        this.d = new yf0[3];
        this.f35706e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f35707f = paintArr;
        this.f35710s = new kf0(this, 0);
        this.f35711w = new kf0(this, 1);
        this.f35712x = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.J = new qt0[3];
        w5 w5Var = new w5(this, 0L, 350L, xq.f40458f);
        this.K = w5Var;
        this.L = new di.o5(2, this);
        w5Var.e(true, 1.0f);
        boolean z10 = this.f35703a & org.telegram.messenger.iz.f23386a0;
        this.f35703a = z10;
        if (z10) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(lf0 lf0Var, int i7, int i10, int i11) {
        synchronized (lf0Var.f35704b) {
            try {
                yf0[] yf0VarArr = lf0Var.f35705c;
                yf0 yf0Var = yf0VarArr[i7];
                yf0VarArr[i7] = yf0VarArr[i10];
                yf0VarArr[i10] = yf0Var;
                yf0[] yf0VarArr2 = lf0Var.d;
                yf0 yf0Var2 = yf0VarArr2[i7];
                yf0VarArr2[i7] = yf0VarArr2[i10];
                yf0VarArr2[i10] = yf0Var2;
                if (i7 == 2) {
                    if (yf0Var2.f40715f) {
                        lf0Var.b(i10, yf0Var2.f40712b);
                    }
                } else {
                    Paint[] paintArr = lf0Var.f35707f;
                    Paint paint = paintArr[i7];
                    paintArr[i7] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    lf0Var.f35707f[i11].setShader(null);
                    yf0 yf0Var3 = lf0Var.f35705c[i11];
                    if (yf0Var3 != null && !yf0Var3.f40714e && !yf0Var3.d) {
                        yf0Var3.f40715f = false;
                        yf0Var3.f40712b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f35709r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.g0.N(56.0f) / this.f35709r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f35707f[i7].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lf0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        tf0 tf0Var = this.h;
        if (tf0Var != null) {
            di.o5 o5Var = this.L;
            ArrayList arrayList = tf0Var.f5340k0;
            if (arrayList != null) {
                arrayList.remove(o5Var);
            }
            this.h = null;
        }
        this.f35706e = false;
        zf0.f40978a.cancelRunnable(this.f35710s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.I) != null) {
            renderNode.discardDisplayList();
            this.I = null;
        }
        synchronized (this.f35704b) {
            for (int i7 = 0; i7 < 3; i7++) {
                try {
                    yf0 yf0Var = this.f35705c[i7];
                    if (yf0Var != null) {
                        yf0Var.a();
                        this.f35705c[i7] = null;
                    }
                    yf0 yf0Var2 = this.d[i7];
                    if (yf0Var2 != null) {
                        yf0Var2.a();
                        this.d[i7] = null;
                    }
                    qt0 qt0Var = this.J[i7];
                    if (qt0Var != null) {
                        qt0Var.f(null);
                        this.J[i7] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f35707f[0].setShader(null);
            this.f35707f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.yv0 yv0Var, float f10, float f11, boolean z9, float f12, float f13) {
        float f14;
        float f15;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        tf0 tf0Var = this.h;
        if (tf0Var != null && tf0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f35703a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (yv0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        qt0[] qt0VarArr = this.J;
                        qt0 qt0Var = qt0VarArr[0];
                        if (qt0Var != null) {
                            qt0Var.f(null);
                        }
                        qt0 qt0Var2 = qt0VarArr[1];
                        if (qt0Var2 != null) {
                            qt0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) Math.ceil((this.f35709r + this.f35708n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f16 = 1.0f / renderNodeScale;
                        beginRecording.scale(f16, f16);
                        beginRecording.save();
                        beginRecording.translate(-this.f35713y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f35713y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f35713y) + f10, 0.0f);
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
                    } else if (yv0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f17 = this.f35709r * (1.0f - f12) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale2), (int) Math.ceil((f15 + this.f35708n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.I.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        i5 i5Var = yv0Var.f35650e;
                        if (i5Var != null) {
                            imageReceiver = i5Var.f34568k;
                        } else {
                            imageReceiver = yv0Var.f35647a;
                        }
                        f(imageReceiver, beginRecording2, f17, f11);
                        if (yv0Var.f52200a0 && yv0Var.V > 0.0f) {
                            f(yv0Var.U, beginRecording2, f17, f11);
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
                } else if (yv0Var == null && !org.telegram.messenger.g0.m0) {
                    this.f35703a = false;
                    setLayerType(1, this.f35707f[0]);
                    setLayerType(1, this.f35707f[1]);
                } else {
                    return;
                }
            }
            if (this.H || this.G || this.F || (this.f35707f[0].getShader() == null && this.f35707f[1].getShader() == null && !this.f35706e)) {
                boolean c10 = c();
                if (!this.f35706e && c10) {
                    this.f35706e = true;
                    org.telegram.messenger.q5 q5Var = zf0.f40978a;
                    q5Var.cancelRunnable(this.f35710s);
                    q5Var.postRunnable(this.f35710s);
                }
            }
            if (this.f35707f[0].getShader() != null || this.f35707f[1].getShader() != null) {
                synchronized (this.f35704b) {
                    try {
                        float f19 = f10 / this.D;
                        if (z9) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f35708n / f19;
                        if (this.f35707f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f35713y) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.D, f21 + f20, this.f35707f[0]);
                            canvas.restore();
                            this.f35707f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.D, f22, this.f35707f[0]);
                            this.f35707f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f14 = 2.0f;
                        }
                        if (this.f35713y != 0 && this.f35707f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f35713y) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.D, f23 + f20, this.f35707f[1]);
                            canvas.restore();
                            this.f35707f[1].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f12, this.D, f24, this.f35707f[1]);
                            this.f35707f[1].setAlpha(255);
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
        yf0 yf0Var = this.f35705c[i7];
        if (view != null && !yf0Var.f40714e) {
            Canvas canvas = yf0Var.f40711a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f35709r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            yf0Var.f40715f = true;
        }
        if (i7 != 0 && (this.f35713y == 0 || i7 != 1)) {
            return;
        }
        boolean z9 = view instanceof qt0;
        qt0[] qt0VarArr = this.J;
        if (z9) {
            qt0VarArr[i7] = (qt0) view;
        } else {
            qt0VarArr[i7] = null;
        }
    }

    public final void h(Canvas canvas, int i7) {
        View E = this.h.E(this.f35712x + i7);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f35709r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f35709r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z9 = E instanceof qt0;
        qt0[] qt0VarArr = this.J;
        if (z9) {
            qt0 qt0Var = (qt0) E;
            qt0VarArr[i7] = qt0Var;
            qt0Var.f(this.f35711w);
            return;
        }
        qt0VarArr[i7] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.g0.N(56.0f) / this.f35709r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f35709r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.f35709r + this.f35708n);
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f35703a) {
            invalidate();
        }
    }

    public void setSize(int i7) {
        if (this.f35708n != i7) {
            invalidate();
        }
        this.f35708n = i7;
        this.f35709r = (int) (org.telegram.messenger.g0.L(64.0f) * 1.5f);
    }

    public void setView(tf0 tf0Var) {
        d();
        this.h = tf0Var;
        this.f35712x = tf0Var.getCurrentItem();
        this.f35713y = 0;
        tf0Var.b(this.L);
    }
}
