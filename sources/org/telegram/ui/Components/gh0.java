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
public final class gh0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public eh0 I;
    public wh0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final nv0[] N;
    public final c6 O;
    public final ai.m7 P;
    public boolean f24216a;
    public final Object f24217b;
    public final uh0[] f24218c;
    public final uh0[] d;
    public volatile boolean e;
    public final Paint[] f24219f;
    public ph0 h;
    public int f24220n;
    public int f24221r;
    public final fh0 f24222s;
    public final fh0 v;
    public int f24223w;
    public int f24224x;
    public int f24225y;

    public gh0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24216a = z10;
        this.f24217b = new Object();
        this.f24218c = new uh0[3];
        this.d = new uh0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f24219f = paintArr;
        this.f24222s = new fh0(this, 0);
        this.v = new fh0(this, 1);
        this.f24223w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new nv0[3];
        c6 c6Var = new c6(this, 0L, 350L, qr.f27380f);
        this.O = c6Var;
        this.P = new ai.m7(this, 3);
        c6Var.d(1.0f, true);
        boolean z11 = this.f24216a & SharedConfig.useNewBlur;
        this.f24216a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(gh0 gh0Var, int i10, int i11, int i12) {
        synchronized (gh0Var.f24217b) {
            try {
                uh0[] uh0VarArr = gh0Var.f24218c;
                uh0 uh0Var = uh0VarArr[i10];
                uh0VarArr[i10] = uh0VarArr[i11];
                uh0VarArr[i11] = uh0Var;
                uh0[] uh0VarArr2 = gh0Var.d;
                uh0 uh0Var2 = uh0VarArr2[i10];
                uh0VarArr2[i10] = uh0VarArr2[i11];
                uh0VarArr2[i11] = uh0Var2;
                if (i10 == 2) {
                    if (uh0Var2.f28390f) {
                        gh0Var.b(uh0Var2.f28388b, i11);
                    }
                } else {
                    Paint[] paintArr = gh0Var.f24219f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    gh0Var.f24219f[i12].setShader(null);
                    uh0 uh0Var3 = gh0Var.f24218c[i12];
                    if (uh0Var3 != null && !uh0Var3.e && !uh0Var3.d) {
                        uh0Var3.f28390f = false;
                        uh0Var3.f28388b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24221r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f24221r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f24219f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.o01 o01Var, float f10, float f11) {
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
            eh0 eh0Var = this.I;
            if (eh0Var != null) {
                eh0Var.i();
            }
            wh0 wh0Var = this.J;
            if (wh0Var != null) {
                wh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f24220n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        eh0 eh0Var2 = this.I;
        if (eh0Var2 != null) {
            if (o01Var != null) {
                eh0Var2.f23566w = this.M;
                eh0Var2.f23564r = o01Var;
                eh0Var2.f23565s = renderNodeScale / f10;
                eh0Var2.v = -f11;
                eh0Var2.invalidate();
            } else {
                eh0Var2.f23566w = this.M;
                eh0Var2.f23564r = null;
                eh0Var2.f23565s = renderNodeScale;
                eh0Var2.v = -f11;
                eh0Var2.invalidate();
            }
        }
        wh0 wh0Var2 = this.J;
        if (wh0Var2 != null) {
            if (o01Var != null) {
                wh0Var2.I = this.M;
                wh0Var2.J = renderNodeScale / f10;
                wh0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                wh0Var2.invalidate();
                return;
            }
            wh0Var2.I = this.M;
            wh0Var2.J = renderNodeScale;
            wh0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            wh0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gh0.d():boolean");
    }

    public final void e() {
        ph0 ph0Var = this.h;
        if (ph0Var != null) {
            ai.m7 m7Var = this.P;
            ArrayList arrayList = ph0Var.f48162k0;
            if (arrayList != null) {
                arrayList.remove(m7Var);
            }
            this.h = null;
        }
        this.e = false;
        vh0.f28724a.cancelRunnable(this.f24222s);
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
        synchronized (this.f24217b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    uh0 uh0Var = this.f24218c[i10];
                    if (uh0Var != null) {
                        uh0Var.a();
                        this.f24218c[i10] = null;
                    }
                    uh0 uh0Var2 = this.d[i10];
                    if (uh0Var2 != null) {
                        uh0Var2.a();
                        this.d[i10] = null;
                    }
                    nv0 nv0Var = this.N[i10];
                    if (nv0Var != null) {
                        nv0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24219f[0].setShader(null);
            this.f24219f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.o01 o01Var, float f7, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ph0 ph0Var = this.h;
        if (ph0Var != null && ph0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f24216a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (o01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        nv0[] nv0VarArr = this.N;
                        nv0 nv0Var = nv0VarArr[0];
                        if (nv0Var != null) {
                            nv0Var.g(null);
                        }
                        nv0 nv0Var2 = nv0VarArr[1];
                        if (nv0Var2 != null) {
                            nv0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f24221r + this.f24220n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f24224x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f24224x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f24224x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f24221r);
                            return;
                        }
                        return;
                    } else if (o01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f24221r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f24220n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        o5 o5Var = o01Var.e;
                        if (o5Var != null) {
                            imageReceiver = o5Var.f26636k;
                        } else {
                            imageReceiver = o01Var.f28301a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (o01Var.f36193a0 && o01Var.V > 0.0f) {
                            g(o01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, o01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (o01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f24216a = false;
                    setLayerType(1, this.f24219f[0]);
                    setLayerType(1, this.f24219f[1]);
                } else {
                    return;
                }
            }
            eh0 eh0Var = this.I;
            if (eh0Var != null) {
                eh0Var.i();
            }
            wh0 wh0Var = this.J;
            if (wh0Var != null) {
                wh0Var.b();
            }
            if (this.H || this.G || this.F || (this.f24219f[0].getShader() == null && this.f24219f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = vh0.f28724a;
                    dispatchQueue.cancelRunnable(this.f24222s);
                    dispatchQueue.postRunnable(this.f24222s);
                }
            }
            if (this.f24219f[0].getShader() != null || this.f24219f[1].getShader() != null) {
                synchronized (this.f24217b) {
                    try {
                        float f18 = f7 / this.f24225y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f24220n / f18;
                        if (this.f24219f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f24224x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f20, this.f24225y, f20 + f19, this.f24219f[0]);
                            canvas.restore();
                            this.f24219f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f24225y, f21, this.f24219f[0]);
                            this.f24219f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f24224x != 0 && this.f24219f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f24224x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f24225y, f22 + f19, this.f24219f[c10]);
                            canvas.restore();
                            this.f24219f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f24225y, f23, this.f24219f[c10]);
                            this.f24219f[c10].setAlpha(i10);
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
        uh0 uh0Var = this.f24218c[i10];
        if (view != null && !uh0Var.e) {
            Canvas canvas = uh0Var.f28387a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f24221r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            uh0Var.f28390f = true;
        }
        if (i10 != 0 && (this.f24224x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof nv0;
        nv0[] nv0VarArr = this.N;
        if (z10) {
            nv0VarArr[i10] = (nv0) view;
        } else {
            nv0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f24223w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f24221r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f24221r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof nv0;
        nv0[] nv0VarArr = this.N;
        if (z10) {
            nv0 nv0Var = (nv0) E;
            nv0VarArr[i10] = nv0Var;
            nv0Var.g(this.v);
            return;
        }
        nv0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f24221r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24221r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f24221r + this.f24220n);
    }

    public void setActionsView(eh0 eh0Var) {
        this.I = eh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f24216a) {
            invalidate();
        }
    }

    public void setMusicView(wh0 wh0Var) {
        this.J = wh0Var;
    }

    public void setSize(int i10) {
        if (this.f24220n != i10) {
            invalidate();
        }
        this.f24220n = i10;
        this.f24221r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ph0 ph0Var) {
        e();
        this.h = ph0Var;
        this.f24223w = ph0Var.getCurrentItem();
        this.f24224x = 0;
        ph0Var.b(this.P);
    }

    public void setSuggestionView(xh0 xh0Var) {
    }
}
