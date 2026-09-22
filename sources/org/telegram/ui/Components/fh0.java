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
public final class fh0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public dh0 I;
    public vh0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final mv0[] N;
    public final c6 O;
    public final ai.m7 P;
    public boolean f23936a;
    public final Object f23937b;
    public final th0[] f23938c;
    public final th0[] d;
    public volatile boolean e;
    public final Paint[] f23939f;
    public oh0 h;
    public int f23940n;
    public int f23941r;
    public final eh0 f23942s;
    public final eh0 v;
    public int f23943w;
    public int f23944x;
    public int f23945y;

    public fh0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23936a = z10;
        this.f23937b = new Object();
        this.f23938c = new th0[3];
        this.d = new th0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f23939f = paintArr;
        this.f23942s = new eh0(this, 0);
        this.v = new eh0(this, 1);
        this.f23943w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new mv0[3];
        c6 c6Var = new c6(this, 0L, 350L, qr.f27420f);
        this.O = c6Var;
        this.P = new ai.m7(this, 3);
        c6Var.d(1.0f, true);
        boolean z11 = this.f23936a & SharedConfig.useNewBlur;
        this.f23936a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(fh0 fh0Var, int i10, int i11, int i12) {
        synchronized (fh0Var.f23937b) {
            try {
                th0[] th0VarArr = fh0Var.f23938c;
                th0 th0Var = th0VarArr[i10];
                th0VarArr[i10] = th0VarArr[i11];
                th0VarArr[i11] = th0Var;
                th0[] th0VarArr2 = fh0Var.d;
                th0 th0Var2 = th0VarArr2[i10];
                th0VarArr2[i10] = th0VarArr2[i11];
                th0VarArr2[i11] = th0Var2;
                if (i10 == 2) {
                    if (th0Var2.f28134f) {
                        fh0Var.b(th0Var2.f28132b, i11);
                    }
                } else {
                    Paint[] paintArr = fh0Var.f23939f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    fh0Var.f23939f[i12].setShader(null);
                    th0 th0Var3 = fh0Var.f23938c[i12];
                    if (th0Var3 != null && !th0Var3.e && !th0Var3.d) {
                        th0Var3.f28134f = false;
                        th0Var3.f28132b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f23941r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f23941r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f23939f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.n01 n01Var, float f10, float f11) {
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
            dh0 dh0Var = this.I;
            if (dh0Var != null) {
                dh0Var.i();
            }
            vh0 vh0Var = this.J;
            if (vh0Var != null) {
                vh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f23940n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        dh0 dh0Var2 = this.I;
        if (dh0Var2 != null) {
            if (n01Var != null) {
                dh0Var2.f23335w = this.M;
                dh0Var2.f23333r = n01Var;
                dh0Var2.f23334s = renderNodeScale / f10;
                dh0Var2.v = -f11;
                dh0Var2.invalidate();
            } else {
                dh0Var2.f23335w = this.M;
                dh0Var2.f23333r = null;
                dh0Var2.f23334s = renderNodeScale;
                dh0Var2.v = -f11;
                dh0Var2.invalidate();
            }
        }
        vh0 vh0Var2 = this.J;
        if (vh0Var2 != null) {
            if (n01Var != null) {
                vh0Var2.I = this.M;
                vh0Var2.J = renderNodeScale / f10;
                vh0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                vh0Var2.invalidate();
                return;
            }
            vh0Var2.I = this.M;
            vh0Var2.J = renderNodeScale;
            vh0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            vh0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fh0.d():boolean");
    }

    public final void e() {
        oh0 oh0Var = this.h;
        if (oh0Var != null) {
            ai.m7 m7Var = this.P;
            ArrayList arrayList = oh0Var.f48132k0;
            if (arrayList != null) {
                arrayList.remove(m7Var);
            }
            this.h = null;
        }
        this.e = false;
        uh0.f28407a.cancelRunnable(this.f23942s);
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
        synchronized (this.f23937b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    th0 th0Var = this.f23938c[i10];
                    if (th0Var != null) {
                        th0Var.a();
                        this.f23938c[i10] = null;
                    }
                    th0 th0Var2 = this.d[i10];
                    if (th0Var2 != null) {
                        th0Var2.a();
                        this.d[i10] = null;
                    }
                    mv0 mv0Var = this.N[i10];
                    if (mv0Var != null) {
                        mv0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f23939f[0].setShader(null);
            this.f23939f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.n01 n01Var, float f7, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        oh0 oh0Var = this.h;
        if (oh0Var != null && oh0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f23936a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (n01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        mv0[] mv0VarArr = this.N;
                        mv0 mv0Var = mv0VarArr[0];
                        if (mv0Var != null) {
                            mv0Var.g(null);
                        }
                        mv0 mv0Var2 = mv0VarArr[1];
                        if (mv0Var2 != null) {
                            mv0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f23941r + this.f23940n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f23944x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f23944x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f23944x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f23941r);
                            return;
                        }
                        return;
                    } else if (n01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f23941r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f23940n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        o5 o5Var = n01Var.e;
                        if (o5Var != null) {
                            imageReceiver = o5Var.f26689k;
                        } else {
                            imageReceiver = n01Var.f28311a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (n01Var.f35859a0 && n01Var.V > 0.0f) {
                            g(n01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, n01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (n01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f23936a = false;
                    setLayerType(1, this.f23939f[0]);
                    setLayerType(1, this.f23939f[1]);
                } else {
                    return;
                }
            }
            dh0 dh0Var = this.I;
            if (dh0Var != null) {
                dh0Var.i();
            }
            vh0 vh0Var = this.J;
            if (vh0Var != null) {
                vh0Var.b();
            }
            if (this.H || this.G || this.F || (this.f23939f[0].getShader() == null && this.f23939f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = uh0.f28407a;
                    dispatchQueue.cancelRunnable(this.f23942s);
                    dispatchQueue.postRunnable(this.f23942s);
                }
            }
            if (this.f23939f[0].getShader() != null || this.f23939f[1].getShader() != null) {
                synchronized (this.f23937b) {
                    try {
                        float f18 = f7 / this.f23945y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f23940n / f18;
                        if (this.f23939f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f23944x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f20, this.f23945y, f20 + f19, this.f23939f[0]);
                            canvas.restore();
                            this.f23939f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f23945y, f21, this.f23939f[0]);
                            this.f23939f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f23944x != 0 && this.f23939f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f23944x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f23945y, f22 + f19, this.f23939f[c10]);
                            canvas.restore();
                            this.f23939f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f23945y, f23, this.f23939f[c10]);
                            this.f23939f[c10].setAlpha(i10);
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
        th0 th0Var = this.f23938c[i10];
        if (view != null && !th0Var.e) {
            Canvas canvas = th0Var.f28131a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f23941r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            th0Var.f28134f = true;
        }
        if (i10 != 0 && (this.f23944x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof mv0;
        mv0[] mv0VarArr = this.N;
        if (z10) {
            mv0VarArr[i10] = (mv0) view;
        } else {
            mv0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f23943w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f23941r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f23941r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof mv0;
        mv0[] mv0VarArr = this.N;
        if (z10) {
            mv0 mv0Var = (mv0) E;
            mv0VarArr[i10] = mv0Var;
            mv0Var.g(this.v);
            return;
        }
        mv0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f23941r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f23941r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f23941r + this.f23940n);
    }

    public void setActionsView(dh0 dh0Var) {
        this.I = dh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f23936a) {
            invalidate();
        }
    }

    public void setMusicView(vh0 vh0Var) {
        this.J = vh0Var;
    }

    public void setSize(int i10) {
        if (this.f23940n != i10) {
            invalidate();
        }
        this.f23940n = i10;
        this.f23941r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(oh0 oh0Var) {
        e();
        this.h = oh0Var;
        this.f23943w = oh0Var.getCurrentItem();
        this.f23944x = 0;
        oh0Var.b(this.P);
    }

    public void setSuggestionView(wh0 wh0Var) {
    }
}
