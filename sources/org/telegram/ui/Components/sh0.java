package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
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
public final class sh0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public qh0 I;
    public ii0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final iw0[] N;
    public final e6 O;
    public final ai.n7 P;
    public boolean f30720a;
    public final Object f30721b;
    public final gi0[] f30722c;
    public final gi0[] d;
    public volatile boolean f30723e;
    public final Paint[] f30724f;
    public bi0 h;
    public int f30725n;
    public int f30726r;
    public final rh0 f30727s;
    public final rh0 v;
    public int f30728w;
    public int f30729x;
    public int f30730y;

    public sh0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30720a = z10;
        this.f30721b = new Object();
        this.f30722c = new gi0[3];
        this.d = new gi0[3];
        this.f30723e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f30724f = paintArr;
        this.f30727s = new rh0(this, 0);
        this.v = new rh0(this, 1);
        this.f30728w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new iw0[3];
        e6 e6Var = new e6(this, 0L, 350L, tr.f31140f);
        this.O = e6Var;
        this.P = new ai.n7(this, 3);
        e6Var.d(1.0f, true);
        boolean z11 = this.f30720a & SharedConfig.useNewBlur;
        this.f30720a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(sh0 sh0Var, int i10, int i11, int i12) {
        synchronized (sh0Var.f30721b) {
            try {
                gi0[] gi0VarArr = sh0Var.f30722c;
                gi0 gi0Var = gi0VarArr[i10];
                gi0VarArr[i10] = gi0VarArr[i11];
                gi0VarArr[i11] = gi0Var;
                gi0[] gi0VarArr2 = sh0Var.d;
                gi0 gi0Var2 = gi0VarArr2[i10];
                gi0VarArr2[i10] = gi0VarArr2[i11];
                gi0VarArr2[i11] = gi0Var2;
                if (i10 == 2) {
                    if (gi0Var2.f26873f) {
                        sh0Var.b(gi0Var2.f26870b, i11);
                    }
                } else {
                    Paint[] paintArr = sh0Var.f30724f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    sh0Var.f30724f[i12].setShader(null);
                    gi0 gi0Var3 = sh0Var.f30722c[i12];
                    if (gi0Var3 != null && !gi0Var3.f26872e && !gi0Var3.d) {
                        gi0Var3.f26873f = false;
                        gi0Var3.f26870b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f30726r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f30726r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f30724f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.f01 f01Var, float f10, float f11) {
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
            qh0 qh0Var = this.I;
            if (qh0Var != null) {
                qh0Var.i();
            }
            ii0 ii0Var = this.J;
            if (ii0Var != null) {
                ii0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f30725n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        qh0 qh0Var2 = this.I;
        if (qh0Var2 != null) {
            if (f01Var != null) {
                qh0Var2.f30039w = this.M;
                qh0Var2.f30037r = f01Var;
                qh0Var2.f30038s = renderNodeScale / f10;
                qh0Var2.v = -f11;
                qh0Var2.invalidate();
            } else {
                qh0Var2.f30039w = this.M;
                qh0Var2.f30037r = null;
                qh0Var2.f30038s = renderNodeScale;
                qh0Var2.v = -f11;
                qh0Var2.invalidate();
            }
        }
        ii0 ii0Var2 = this.J;
        if (ii0Var2 != null) {
            if (f01Var != null) {
                ii0Var2.G = this.M;
                ii0Var2.H = renderNodeScale / f10;
                ii0Var2.I = (-f11) + AndroidUtilities.dp(22.0f);
                ii0Var2.invalidate();
                return;
            }
            ii0Var2.G = this.M;
            ii0Var2.H = renderNodeScale;
            ii0Var2.I = (-f11) + AndroidUtilities.dp(22.0f);
            ii0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sh0.d():boolean");
    }

    public final void e() {
        bi0 bi0Var = this.h;
        if (bi0Var != null) {
            ai.n7 n7Var = this.P;
            ArrayList arrayList = bi0Var.f52417k0;
            if (arrayList != null) {
                arrayList.remove(n7Var);
            }
            this.h = null;
        }
        this.f30723e = false;
        hi0.f27143a.cancelRunnable(this.f30727s);
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
        synchronized (this.f30721b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    gi0 gi0Var = this.f30722c[i10];
                    if (gi0Var != null) {
                        gi0Var.a();
                        this.f30722c[i10] = null;
                    }
                    gi0 gi0Var2 = this.d[i10];
                    if (gi0Var2 != null) {
                        gi0Var2.a();
                        this.d[i10] = null;
                    }
                    iw0 iw0Var = this.N[i10];
                    if (iw0Var != null) {
                        iw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f30724f[0].setShader(null);
            this.f30724f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.f01 f01Var, float f7, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        bi0 bi0Var = this.h;
        if (bi0Var != null && bi0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f30720a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (f01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        iw0[] iw0VarArr = this.N;
                        iw0 iw0Var = iw0VarArr[0];
                        if (iw0Var != null) {
                            iw0Var.g(null);
                        }
                        iw0 iw0Var2 = iw0VarArr[1];
                        if (iw0Var2 != null) {
                            iw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f30726r + this.f30725n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f30729x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f30729x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f30729x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f30726r);
                            return;
                        }
                        return;
                    } else if (f01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f30726r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f30725n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        q5 q5Var = f01Var.f32489e;
                        if (q5Var != null) {
                            imageReceiver = q5Var.f29908k;
                        } else {
                            imageReceiver = f01Var.f32486a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (f01Var.f36127a0 && f01Var.V > 0.0f) {
                            g(f01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, f01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (f01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f30720a = false;
                    setLayerType(1, this.f30724f[0]);
                    setLayerType(1, this.f30724f[1]);
                } else {
                    return;
                }
            }
            qh0 qh0Var = this.I;
            if (qh0Var != null) {
                qh0Var.i();
            }
            ii0 ii0Var = this.J;
            if (ii0Var != null) {
                ii0Var.b();
            }
            if (this.H || this.G || this.F || (this.f30724f[0].getShader() == null && this.f30724f[1].getShader() == null && !this.f30723e)) {
                boolean d = d();
                if (!this.f30723e && d) {
                    this.f30723e = true;
                    DispatchQueue dispatchQueue = hi0.f27143a;
                    dispatchQueue.cancelRunnable(this.f30727s);
                    dispatchQueue.postRunnable(this.f30727s);
                }
            }
            if (this.f30724f[0].getShader() != null || this.f30724f[1].getShader() != null) {
                synchronized (this.f30721b) {
                    try {
                        float f18 = f7 / this.f30730y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f30725n / f18;
                        if (this.f30724f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f30729x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f20, this.f30730y, f20 + f19, this.f30724f[0]);
                            canvas.restore();
                            this.f30724f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f30730y, f21, this.f30724f[0]);
                            this.f30724f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f30729x != 0 && this.f30724f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f30729x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f30730y, f22 + f19, this.f30724f[c10]);
                            canvas.restore();
                            this.f30724f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f30730y, f23, this.f30724f[c10]);
                            this.f30724f[c10].setAlpha(i10);
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
        gi0 gi0Var = this.f30722c[i10];
        if (view != null && !gi0Var.f26872e) {
            Canvas canvas = gi0Var.f26869a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f30726r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            gi0Var.f26873f = true;
        }
        if (i10 != 0 && (this.f30729x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof iw0;
        iw0[] iw0VarArr = this.N;
        if (z10) {
            iw0VarArr[i10] = (iw0) view;
        } else {
            iw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f30728w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f30726r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f30726r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof iw0;
        iw0[] iw0VarArr = this.N;
        if (z10) {
            iw0 iw0Var = (iw0) E;
            iw0VarArr[i10] = iw0Var;
            iw0Var.g(this.v);
            return;
        }
        iw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f30726r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f30726r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.L.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), ru.d()));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f30726r + this.f30725n);
    }

    public void setActionsView(qh0 qh0Var) {
        this.I = qh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f30720a) {
            invalidate();
        }
    }

    public void setMusicView(ii0 ii0Var) {
        this.J = ii0Var;
    }

    public void setSize(int i10) {
        if (this.f30725n != i10) {
            invalidate();
        }
        this.f30725n = i10;
        this.f30726r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(bi0 bi0Var) {
        e();
        this.h = bi0Var;
        this.f30728w = bi0Var.getCurrentItem();
        this.f30729x = 0;
        bi0Var.b(this.P);
    }

    public void setSuggestionView(ji0 ji0Var) {
    }
}
