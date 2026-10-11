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
public final class li0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ji0 I;
    public bj0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final qw0[] N;
    public final g6 O;
    public final ai.o7 P;
    public boolean f28422a;
    public final Object f28423b;
    public final zi0[] f28424c;
    public final zi0[] d;
    public volatile boolean f28425e;
    public final Paint[] f28426f;
    public ui0 h;
    public int f28427n;
    public int f28428r;
    public final ki0 f28429s;
    public final ki0 v;
    public int f28430w;
    public int f28431x;
    public int f28432y;

    public li0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28422a = z10;
        this.f28423b = new Object();
        this.f28424c = new zi0[3];
        this.d = new zi0[3];
        this.f28425e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f28426f = paintArr;
        this.f28429s = new ki0(this, 0);
        this.v = new ki0(this, 1);
        this.f28430w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new qw0[3];
        g6 g6Var = new g6(this, 0L, 350L, is.f27500f);
        this.O = g6Var;
        this.P = new ai.o7(this, 3);
        g6Var.d(1.0f, true);
        boolean z11 = this.f28422a & SharedConfig.useNewBlur;
        this.f28422a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(li0 li0Var, int i10, int i11, int i12) {
        synchronized (li0Var.f28423b) {
            try {
                zi0[] zi0VarArr = li0Var.f28424c;
                zi0 zi0Var = zi0VarArr[i10];
                zi0VarArr[i10] = zi0VarArr[i11];
                zi0VarArr[i11] = zi0Var;
                zi0[] zi0VarArr2 = li0Var.d;
                zi0 zi0Var2 = zi0VarArr2[i10];
                zi0VarArr2[i10] = zi0VarArr2[i11];
                zi0VarArr2[i11] = zi0Var2;
                if (i10 == 2) {
                    if (zi0Var2.f33640f) {
                        li0Var.b(zi0Var2.f33637b, i11);
                    }
                } else {
                    Paint[] paintArr = li0Var.f28426f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    li0Var.f28426f[i12].setShader(null);
                    zi0 zi0Var3 = li0Var.f28424c[i12];
                    if (zi0Var3 != null && !zi0Var3.f33639e && !zi0Var3.d) {
                        zi0Var3.f33640f = false;
                        zi0Var3.f33637b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28428r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f28428r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f28426f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.k01 k01Var, float f10, float f11) {
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
            ji0 ji0Var = this.I;
            if (ji0Var != null) {
                ji0Var.i();
            }
            bj0 bj0Var = this.J;
            if (bj0Var != null) {
                bj0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f28427n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        ji0 ji0Var2 = this.I;
        if (ji0Var2 != null) {
            if (k01Var != null) {
                ji0Var2.f27761w = this.M;
                ji0Var2.f27759r = k01Var;
                ji0Var2.f27760s = renderNodeScale / f10;
                ji0Var2.v = -f11;
                ji0Var2.invalidate();
            } else {
                ji0Var2.f27761w = this.M;
                ji0Var2.f27759r = null;
                ji0Var2.f27760s = renderNodeScale;
                ji0Var2.v = -f11;
                ji0Var2.invalidate();
            }
        }
        bj0 bj0Var2 = this.J;
        if (bj0Var2 != null) {
            if (k01Var != null) {
                bj0Var2.I = this.M;
                bj0Var2.J = renderNodeScale / f10;
                bj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                bj0Var2.invalidate();
                return;
            }
            bj0Var2.I = this.M;
            bj0Var2.J = renderNodeScale;
            bj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            bj0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.li0.d():boolean");
    }

    public final void e() {
        ui0 ui0Var = this.h;
        if (ui0Var != null) {
            ai.o7 o7Var = this.P;
            ArrayList arrayList = ui0Var.f53671k0;
            if (arrayList != null) {
                arrayList.remove(o7Var);
            }
            this.h = null;
        }
        this.f28425e = false;
        aj0.f24616a.cancelRunnable(this.f28429s);
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
        synchronized (this.f28423b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    zi0 zi0Var = this.f28424c[i10];
                    if (zi0Var != null) {
                        zi0Var.a();
                        this.f28424c[i10] = null;
                    }
                    zi0 zi0Var2 = this.d[i10];
                    if (zi0Var2 != null) {
                        zi0Var2.a();
                        this.d[i10] = null;
                    }
                    qw0 qw0Var = this.N[i10];
                    if (qw0Var != null) {
                        qw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f28426f[0].setShader(null);
            this.f28426f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.k01 k01Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ui0 ui0Var = this.h;
        if (ui0Var != null && ui0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f28422a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (k01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        qw0[] qw0VarArr = this.N;
                        qw0 qw0Var = qw0VarArr[0];
                        if (qw0Var != null) {
                            qw0Var.g(null);
                        }
                        qw0 qw0Var2 = qw0VarArr[1];
                        if (qw0Var2 != null) {
                            qw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f28428r + this.f28427n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f28431x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f28431x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f28431x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f28428r);
                            return;
                        }
                        return;
                    } else if (k01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f28428r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f28427n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        s5 s5Var = k01Var.f33191e;
                        if (s5Var != null) {
                            imageReceiver = s5Var.f30739k;
                        } else {
                            imageReceiver = k01Var.f33188a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (k01Var.f39190a0 && k01Var.V > 0.0f) {
                            g(k01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, k01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (k01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f28422a = false;
                    setLayerType(1, this.f28426f[0]);
                    setLayerType(1, this.f28426f[1]);
                } else {
                    return;
                }
            }
            ji0 ji0Var = this.I;
            if (ji0Var != null) {
                ji0Var.i();
            }
            bj0 bj0Var = this.J;
            if (bj0Var != null) {
                bj0Var.b();
            }
            if (this.H || this.G || this.F || (this.f28426f[0].getShader() == null && this.f28426f[1].getShader() == null && !this.f28425e)) {
                boolean d = d();
                if (!this.f28425e && d) {
                    this.f28425e = true;
                    DispatchQueue dispatchQueue = aj0.f24616a;
                    dispatchQueue.cancelRunnable(this.f28429s);
                    dispatchQueue.postRunnable(this.f28429s);
                }
            }
            if (this.f28426f[0].getShader() != null || this.f28426f[1].getShader() != null) {
                synchronized (this.f28423b) {
                    try {
                        float f18 = f7 / this.f28432y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f28427n / f18;
                        if (this.f28426f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f28431x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                            canvas2.drawRect(0.0f, f20, this.f28432y, f20 + f19, this.f28426f[0]);
                            canvas.restore();
                            this.f28426f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f28432y, f21, this.f28426f[0]);
                            this.f28426f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                        }
                        if (this.f28431x != 0 && this.f28426f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f28431x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f28432y, f22 + f19, this.f28426f[c10]);
                            canvas.restore();
                            this.f28426f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f28432y, f23, this.f28426f[c10]);
                            this.f28426f[c10].setAlpha(i10);
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
        zi0 zi0Var = this.f28424c[i10];
        if (view != null && !zi0Var.f33639e) {
            Canvas canvas = zi0Var.f33636a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f28428r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            zi0Var.f33640f = true;
        }
        if (i10 != 0 && (this.f28431x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof qw0;
        qw0[] qw0VarArr = this.N;
        if (z10) {
            qw0VarArr[i10] = (qw0) view;
        } else {
            qw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f28430w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f28428r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f28428r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof qw0;
        qw0[] qw0VarArr = this.N;
        if (z10) {
            qw0 qw0Var = (qw0) E;
            qw0VarArr[i10] = qw0Var;
            qw0Var.g(this.v);
            return;
        }
        qw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f28428r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28428r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f28428r + this.f28427n);
    }

    public void setActionsView(ji0 ji0Var) {
        this.I = ji0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f28422a) {
            invalidate();
        }
    }

    public void setMusicView(bj0 bj0Var) {
        this.J = bj0Var;
    }

    public void setSize(int i10) {
        if (this.f28427n != i10) {
            invalidate();
        }
        this.f28427n = i10;
        this.f28428r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ui0 ui0Var) {
        e();
        this.h = ui0Var;
        this.f28430w = ui0Var.getCurrentItem();
        this.f28431x = 0;
        ui0Var.b(this.P);
    }

    public void setSuggestionView(cj0 cj0Var) {
    }
}
