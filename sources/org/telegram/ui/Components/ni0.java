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
public final class ni0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public li0 I;
    public dj0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final vw0[] N;
    public final g6 O;
    public final ai.o7 P;
    public boolean f28791a;
    public final Object f28792b;
    public final bj0[] f28793c;
    public final bj0[] d;
    public volatile boolean f28794e;
    public final Paint[] f28795f;
    public wi0 h;
    public int f28796n;
    public int f28797r;
    public final mi0 f28798s;
    public final mi0 v;
    public int f28799w;
    public int f28800x;
    public int f28801y;

    public ni0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28791a = z10;
        this.f28792b = new Object();
        this.f28793c = new bj0[3];
        this.d = new bj0[3];
        this.f28794e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f28795f = paintArr;
        this.f28798s = new mi0(this, 0);
        this.v = new mi0(this, 1);
        this.f28799w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new vw0[3];
        g6 g6Var = new g6(this, 0L, 350L, js.f27634f);
        this.O = g6Var;
        this.P = new ai.o7(this, 3);
        g6Var.d(1.0f, true);
        boolean z11 = this.f28791a & SharedConfig.useNewBlur;
        this.f28791a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(ni0 ni0Var, int i10, int i11, int i12) {
        synchronized (ni0Var.f28792b) {
            try {
                bj0[] bj0VarArr = ni0Var.f28793c;
                bj0 bj0Var = bj0VarArr[i10];
                bj0VarArr[i10] = bj0VarArr[i11];
                bj0VarArr[i11] = bj0Var;
                bj0[] bj0VarArr2 = ni0Var.d;
                bj0 bj0Var2 = bj0VarArr2[i10];
                bj0VarArr2[i10] = bj0VarArr2[i11];
                bj0VarArr2[i11] = bj0Var2;
                if (i10 == 2) {
                    if (bj0Var2.f24666f) {
                        ni0Var.b(bj0Var2.f24663b, i11);
                    }
                } else {
                    Paint[] paintArr = ni0Var.f28795f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    ni0Var.f28795f[i12].setShader(null);
                    bj0 bj0Var3 = ni0Var.f28793c[i12];
                    if (bj0Var3 != null && !bj0Var3.f24665e && !bj0Var3.d) {
                        bj0Var3.f24666f = false;
                        bj0Var3.f24663b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28797r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f28797r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f28795f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
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
            li0 li0Var = this.I;
            if (li0Var != null) {
                li0Var.i();
            }
            dj0 dj0Var = this.J;
            if (dj0Var != null) {
                dj0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f28796n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        li0 li0Var2 = this.I;
        if (li0Var2 != null) {
            if (n01Var != null) {
                li0Var2.f28203w = this.M;
                li0Var2.f28201r = n01Var;
                li0Var2.f28202s = renderNodeScale / f10;
                li0Var2.v = -f11;
                li0Var2.invalidate();
            } else {
                li0Var2.f28203w = this.M;
                li0Var2.f28201r = null;
                li0Var2.f28202s = renderNodeScale;
                li0Var2.v = -f11;
                li0Var2.invalidate();
            }
        }
        dj0 dj0Var2 = this.J;
        if (dj0Var2 != null) {
            if (n01Var != null) {
                dj0Var2.I = this.M;
                dj0Var2.J = renderNodeScale / f10;
                dj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                dj0Var2.invalidate();
                return;
            }
            dj0Var2.I = this.M;
            dj0Var2.J = renderNodeScale;
            dj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            dj0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ni0.d():boolean");
    }

    public final void e() {
        wi0 wi0Var = this.h;
        if (wi0Var != null) {
            ai.o7 o7Var = this.P;
            ArrayList arrayList = wi0Var.f53782k0;
            if (arrayList != null) {
                arrayList.remove(o7Var);
            }
            this.h = null;
        }
        this.f28794e = false;
        cj0.f24945a.cancelRunnable(this.f28798s);
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
        synchronized (this.f28792b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    bj0 bj0Var = this.f28793c[i10];
                    if (bj0Var != null) {
                        bj0Var.a();
                        this.f28793c[i10] = null;
                    }
                    bj0 bj0Var2 = this.d[i10];
                    if (bj0Var2 != null) {
                        bj0Var2.a();
                        this.d[i10] = null;
                    }
                    vw0 vw0Var = this.N[i10];
                    if (vw0Var != null) {
                        vw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f28795f[0].setShader(null);
            this.f28795f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.n01 n01Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        wi0 wi0Var = this.h;
        if (wi0Var != null && wi0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f28791a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (n01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        vw0[] vw0VarArr = this.N;
                        vw0 vw0Var = vw0VarArr[0];
                        if (vw0Var != null) {
                            vw0Var.g(null);
                        }
                        vw0 vw0Var2 = vw0VarArr[1];
                        if (vw0Var2 != null) {
                            vw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f28797r + this.f28796n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f28800x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f28800x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f28800x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f28797r);
                            return;
                        }
                        return;
                    } else if (n01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f28797r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f28796n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        s5 s5Var = n01Var.f32997e;
                        if (s5Var != null) {
                            imageReceiver = s5Var.f30402k;
                        } else {
                            imageReceiver = n01Var.f32994a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (n01Var.f40171a0 && n01Var.V > 0.0f) {
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
                    this.f28791a = false;
                    setLayerType(1, this.f28795f[0]);
                    setLayerType(1, this.f28795f[1]);
                } else {
                    return;
                }
            }
            li0 li0Var = this.I;
            if (li0Var != null) {
                li0Var.i();
            }
            dj0 dj0Var = this.J;
            if (dj0Var != null) {
                dj0Var.b();
            }
            if (this.H || this.G || this.F || (this.f28795f[0].getShader() == null && this.f28795f[1].getShader() == null && !this.f28794e)) {
                boolean d = d();
                if (!this.f28794e && d) {
                    this.f28794e = true;
                    DispatchQueue dispatchQueue = cj0.f24945a;
                    dispatchQueue.cancelRunnable(this.f28798s);
                    dispatchQueue.postRunnable(this.f28798s);
                }
            }
            if (this.f28795f[0].getShader() != null || this.f28795f[1].getShader() != null) {
                synchronized (this.f28792b) {
                    try {
                        float f18 = f7 / this.f28801y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f28796n / f18;
                        if (this.f28795f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f28800x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                            canvas2.drawRect(0.0f, f20, this.f28801y, f20 + f19, this.f28795f[0]);
                            canvas.restore();
                            this.f28795f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f28801y, f21, this.f28795f[0]);
                            this.f28795f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                        }
                        if (this.f28800x != 0 && this.f28795f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f28800x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f28801y, f22 + f19, this.f28795f[c10]);
                            canvas.restore();
                            this.f28795f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f28801y, f23, this.f28795f[c10]);
                            this.f28795f[c10].setAlpha(i10);
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
        bj0 bj0Var = this.f28793c[i10];
        if (view != null && !bj0Var.f24665e) {
            Canvas canvas = bj0Var.f24662a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f28797r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            bj0Var.f24666f = true;
        }
        if (i10 != 0 && (this.f28800x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof vw0;
        vw0[] vw0VarArr = this.N;
        if (z10) {
            vw0VarArr[i10] = (vw0) view;
        } else {
            vw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f28799w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f28797r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f28797r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof vw0;
        vw0[] vw0VarArr = this.N;
        if (z10) {
            vw0 vw0Var = (vw0) E;
            vw0VarArr[i10] = vw0Var;
            vw0Var.g(this.v);
            return;
        }
        vw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f28797r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28797r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f28797r + this.f28796n);
    }

    public void setActionsView(li0 li0Var) {
        this.I = li0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f28791a) {
            invalidate();
        }
    }

    public void setMusicView(dj0 dj0Var) {
        this.J = dj0Var;
    }

    public void setSize(int i10) {
        if (this.f28796n != i10) {
            invalidate();
        }
        this.f28796n = i10;
        this.f28797r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(wi0 wi0Var) {
        e();
        this.h = wi0Var;
        this.f28799w = wi0Var.getCurrentItem();
        this.f28800x = 0;
        wi0Var.b(this.P);
    }

    public void setSuggestionView(ej0 ej0Var) {
    }
}
