package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
public final class bi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public yh0 I;
    public ri0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final gw0[] N;
    public final f6 O;
    public final ci.x5 P;
    public boolean f24975a;
    public final Object f24976b;
    public final pi0[] f24977c;
    public final pi0[] d;
    public volatile boolean e;
    public final Paint[] f24978f;
    public ki0 h;
    public int f24979n;
    public int f24980r;
    public final ai0 f24981s;
    public final ai0 v;
    public int f24982w;
    public int f24983x;
    public int f24984y;

    public bi0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24975a = z10;
        this.f24976b = new Object();
        this.f24977c = new pi0[3];
        this.d = new pi0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f24978f = paintArr;
        this.f24981s = new ai0(this, 0);
        this.v = new ai0(this, 1);
        this.f24982w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new gw0[3];
        f6 f6Var = new f6(this, 0L, 350L, bs.f25030f);
        this.O = f6Var;
        this.P = new ci.x5(this, 3);
        f6Var.d(1.0f, true);
        boolean z11 = this.f24975a & SharedConfig.useNewBlur;
        this.f24975a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(bi0 bi0Var, int i10, int i11, int i12) {
        synchronized (bi0Var.f24976b) {
            try {
                pi0[] pi0VarArr = bi0Var.f24977c;
                pi0 pi0Var = pi0VarArr[i10];
                pi0VarArr[i10] = pi0VarArr[i11];
                pi0VarArr[i11] = pi0Var;
                pi0[] pi0VarArr2 = bi0Var.d;
                pi0 pi0Var2 = pi0VarArr2[i10];
                pi0VarArr2[i10] = pi0VarArr2[i11];
                pi0VarArr2[i11] = pi0Var2;
                if (i10 == 2) {
                    if (pi0Var2.f29315f) {
                        bi0Var.b(pi0Var2.f29313b, i11);
                    }
                } else {
                    Paint[] paintArr = bi0Var.f24978f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    bi0Var.f24978f[i12].setShader(null);
                    pi0 pi0Var3 = bi0Var.f24977c[i12];
                    if (pi0Var3 != null && !pi0Var3.e && !pi0Var3.d) {
                        pi0Var3.f29315f = false;
                        pi0Var3.f29313b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f7, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f7 - f10);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f7);
        canvas.scale(1.0f, 2.0f, 0.0f, f10);
        imageReceiver.draw(canvas);
        canvas.restore();
        imageReceiver.setRoundRadius(i10);
    }

    private float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            if (devicePerformanceClass != 2) {
                return 8.0f;
            }
            return 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return AndroidUtilities.dp(1.0f);
    }

    public final void b(Bitmap bitmap, int i10) {
        if (i10 < 2 && bitmap != null && !bitmap.isRecycled()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24980r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f24980r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f24978f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.qz0 qz0Var, float f10, float f11) {
        if (this.I == null && this.J == null) {
            this.K = false;
        } else {
            if (this.M == null) {
                this.M = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.M.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.K = true;
        }
        if (!this.K) {
            yh0 yh0Var = this.I;
            if (yh0Var != null) {
                yh0Var.i();
            }
            ri0 ri0Var = this.J;
            if (ri0Var != null) {
                ri0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f24979n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        yh0 yh0Var2 = this.I;
        if (yh0Var2 != null) {
            if (qz0Var != null) {
                yh0Var2.f32642w = this.M;
                yh0Var2.f32640r = qz0Var;
                yh0Var2.f32641s = renderNodeScale / f10;
                yh0Var2.v = -f11;
                yh0Var2.invalidate();
            } else {
                yh0Var2.f32642w = this.M;
                yh0Var2.f32640r = null;
                yh0Var2.f32641s = renderNodeScale;
                yh0Var2.v = -f11;
                yh0Var2.invalidate();
            }
        }
        ri0 ri0Var2 = this.J;
        if (ri0Var2 != null) {
            if (qz0Var != null) {
                ri0Var2.d(this.M, qz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                ri0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.d():boolean");
    }

    public final void e() {
        ki0 ki0Var = this.h;
        if (ki0Var != null) {
            ci.x5 x5Var = this.P;
            ArrayList arrayList = ki0Var.f50712k0;
            if (arrayList != null) {
                arrayList.remove(x5Var);
            }
            this.h = null;
        }
        this.e = false;
        qi0.f29696a.cancelRunnable(this.f24981s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.L;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.L = null;
            }
            RenderNode renderNode2 = this.M;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.M = null;
            }
        }
        this.I = null;
        this.J = null;
        synchronized (this.f24976b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    pi0 pi0Var = this.f24977c[i10];
                    if (pi0Var != null) {
                        pi0Var.a();
                        this.f24977c[i10] = null;
                    }
                    pi0 pi0Var2 = this.d[i10];
                    if (pi0Var2 != null) {
                        pi0Var2.a();
                        this.d[i10] = null;
                    }
                    gw0 gw0Var = this.N[i10];
                    if (gw0Var != null) {
                        gw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24978f[0].setShader(null);
            this.f24978f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.qz0 qz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ki0 ki0Var = this.h;
        if (ki0Var != null && ki0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f24975a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (qz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        gw0[] gw0VarArr = this.N;
                        gw0 gw0Var = gw0VarArr[0];
                        if (gw0Var != null) {
                            gw0Var.g(null);
                        }
                        gw0 gw0Var2 = gw0VarArr[1];
                        if (gw0Var2 != null) {
                            gw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f24980r + this.f24979n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f24983x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f24983x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f24983x) + f7, 0.0f);
                            i(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.L.endRecording();
                        this.L.setAlpha(this.O.d(1.0f, false));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.L);
                        canvas2.restore();
                        if (getVisibility() == 0 && getAlpha() > 0.0f) {
                            c(f7, null, 1.0f, this.f24980r);
                            return;
                        }
                        return;
                    } else if (qz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f24980r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f24979n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        r5 r5Var = qz0Var.e;
                        if (r5Var != null) {
                            imageReceiver = r5Var.f29841k;
                        } else {
                            imageReceiver = qz0Var.f32033a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (qz0Var.f40535a0 && qz0Var.V > 0.0f) {
                            g(qz0Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, qz0Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (qz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f24975a = false;
                    setLayerType(1, this.f24978f[0]);
                    setLayerType(1, this.f24978f[1]);
                } else {
                    return;
                }
            }
            yh0 yh0Var = this.I;
            if (yh0Var != null) {
                yh0Var.i();
            }
            ri0 ri0Var = this.J;
            if (ri0Var != null) {
                ri0Var.c();
            }
            if (this.H || this.G || this.F || (this.f24978f[0].getShader() == null && this.f24978f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = qi0.f29696a;
                    dispatchQueue.cancelRunnable(this.f24981s);
                    dispatchQueue.postRunnable(this.f24981s);
                }
            }
            if (this.f24978f[0].getShader() != null || this.f24978f[1].getShader() != null) {
                synchronized (this.f24976b) {
                    try {
                        float f18 = f7 / this.f24984y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f24979n / f18;
                        if (this.f24978f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f24983x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                            canvas2.drawRect(0.0f, f20, this.f24984y, f20 + f19, this.f24978f[0]);
                            canvas.restore();
                            this.f24978f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f24984y, f21, this.f24978f[0]);
                            this.f24978f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                        }
                        if (this.f24983x != 0 && this.f24978f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f24983x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f24984y, f22 + f19, this.f24978f[c10]);
                            canvas.restore();
                            this.f24978f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f24984y, f23, this.f24978f[c10]);
                            this.f24978f[c10].setAlpha(i10);
                            canvas.restore();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void h(int i10, View view) {
        pi0 pi0Var = this.f24977c[i10];
        if (view != null && !pi0Var.e) {
            Canvas canvas = pi0Var.f29312a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f24980r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            pi0Var.f29315f = true;
        }
        if (i10 != 0 && (this.f24983x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof gw0;
        gw0[] gw0VarArr = this.N;
        if (z10) {
            gw0VarArr[i10] = (gw0) view;
        } else {
            gw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f24982w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f24980r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f24980r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof gw0;
        gw0[] gw0VarArr = this.N;
        if (z10) {
            gw0 gw0Var = (gw0) E;
            gw0VarArr[i10] = gw0Var;
            gw0Var.g(this.v);
            return;
        }
        gw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f24980r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24980r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.L.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f24980r + this.f24979n);
    }

    public void setActionsView(yh0 yh0Var) {
        this.I = yh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f24975a) {
            invalidate();
        }
    }

    public void setMusicView(ri0 ri0Var) {
        this.J = ri0Var;
    }

    public void setSize(int i10) {
        if (this.f24979n != i10) {
            invalidate();
        }
        this.f24979n = i10;
        this.f24980r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ki0 ki0Var) {
        e();
        this.h = ki0Var;
        this.f24982w = ki0Var.getCurrentItem();
        this.f24983x = 0;
        ki0Var.b(this.P);
    }

    public void setSuggestionView(si0 si0Var) {
    }
}
