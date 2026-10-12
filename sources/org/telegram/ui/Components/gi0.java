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
public final class gi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ei0 I;
    public wi0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final lw0[] N;
    public final g6 O;
    public final bi.z6 P;
    public boolean f25287a;
    public final Object f25288b;
    public final ui0[] f25289c;
    public final ui0[] d;
    public volatile boolean e;
    public final Paint[] f25290f;
    public pi0 h;
    public int f25291n;
    public int f25292r;
    public final fi0 f25293s;
    public final fi0 v;
    public int f25294w;
    public int f25295x;
    public int f25296y;

    public gi0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25287a = z10;
        this.f25288b = new Object();
        this.f25289c = new ui0[3];
        this.d = new ui0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f25290f = paintArr;
        this.f25293s = new fi0(this, 0);
        this.v = new fi0(this, 1);
        this.f25294w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new lw0[3];
        g6 g6Var = new g6(this, 0L, 350L, es.f24771f);
        this.O = g6Var;
        this.P = new bi.z6(this, 3);
        g6Var.d(1.0f, true);
        boolean z11 = this.f25287a & SharedConfig.useNewBlur;
        this.f25287a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(gi0 gi0Var, int i10, int i11, int i12) {
        synchronized (gi0Var.f25288b) {
            try {
                ui0[] ui0VarArr = gi0Var.f25289c;
                ui0 ui0Var = ui0VarArr[i10];
                ui0VarArr[i10] = ui0VarArr[i11];
                ui0VarArr[i11] = ui0Var;
                ui0[] ui0VarArr2 = gi0Var.d;
                ui0 ui0Var2 = ui0VarArr2[i10];
                ui0VarArr2[i10] = ui0VarArr2[i11];
                ui0VarArr2[i11] = ui0Var2;
                if (i10 == 2) {
                    if (ui0Var2.f29695f) {
                        gi0Var.b(ui0Var2.f29693b, i11);
                    }
                } else {
                    Paint[] paintArr = gi0Var.f25290f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    gi0Var.f25290f[i12].setShader(null);
                    ui0 ui0Var3 = gi0Var.f25289c[i12];
                    if (ui0Var3 != null && !ui0Var3.e && !ui0Var3.d) {
                        ui0Var3.f29695f = false;
                        ui0Var3.f29693b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f25292r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f25292r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f25290f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.s01 s01Var, float f10, float f11) {
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
            ei0 ei0Var = this.I;
            if (ei0Var != null) {
                ei0Var.i();
            }
            wi0 wi0Var = this.J;
            if (wi0Var != null) {
                wi0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f25291n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        ei0 ei0Var2 = this.I;
        if (ei0Var2 != null) {
            if (s01Var != null) {
                ei0Var2.f24719w = this.M;
                ei0Var2.f24717r = s01Var;
                ei0Var2.f24718s = renderNodeScale / f10;
                ei0Var2.v = -f11;
                ei0Var2.invalidate();
            } else {
                ei0Var2.f24719w = this.M;
                ei0Var2.f24717r = null;
                ei0Var2.f24718s = renderNodeScale;
                ei0Var2.v = -f11;
                ei0Var2.invalidate();
            }
        }
        wi0 wi0Var2 = this.J;
        if (wi0Var2 != null) {
            if (s01Var != null) {
                wi0Var2.I = this.M;
                wi0Var2.J = renderNodeScale / f10;
                wi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                wi0Var2.invalidate();
                return;
            }
            wi0Var2.I = this.M;
            wi0Var2.J = renderNodeScale;
            wi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            wi0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gi0.d():boolean");
    }

    public final void e() {
        pi0 pi0Var = this.h;
        if (pi0Var != null) {
            bi.z6 z6Var = this.P;
            ArrayList arrayList = pi0Var.f49308k0;
            if (arrayList != null) {
                arrayList.remove(z6Var);
            }
            this.h = null;
        }
        this.e = false;
        vi0.f30068a.cancelRunnable(this.f25293s);
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
        synchronized (this.f25288b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ui0 ui0Var = this.f25289c[i10];
                    if (ui0Var != null) {
                        ui0Var.a();
                        this.f25289c[i10] = null;
                    }
                    ui0 ui0Var2 = this.d[i10];
                    if (ui0Var2 != null) {
                        ui0Var2.a();
                        this.d[i10] = null;
                    }
                    lw0 lw0Var = this.N[i10];
                    if (lw0Var != null) {
                        lw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f25290f[0].setShader(null);
            this.f25290f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.s01 s01Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        pi0 pi0Var = this.h;
        if (pi0Var != null && pi0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f25287a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (s01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        lw0[] lw0VarArr = this.N;
                        lw0 lw0Var = lw0VarArr[0];
                        if (lw0Var != null) {
                            lw0Var.g(null);
                        }
                        lw0 lw0Var2 = lw0VarArr[1];
                        if (lw0Var2 != null) {
                            lw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f25292r + this.f25291n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f25295x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f25295x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f25295x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f25292r);
                            return;
                        }
                        return;
                    } else if (s01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f25292r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f25291n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        s5 s5Var = s01Var.e;
                        if (s5Var != null) {
                            imageReceiver = s5Var.f29031k;
                        } else {
                            imageReceiver = s01Var.f31813a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (s01Var.f39912a0 && s01Var.V > 0.0f) {
                            g(s01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, s01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (s01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f25287a = false;
                    setLayerType(1, this.f25290f[0]);
                    setLayerType(1, this.f25290f[1]);
                } else {
                    return;
                }
            }
            ei0 ei0Var = this.I;
            if (ei0Var != null) {
                ei0Var.i();
            }
            wi0 wi0Var = this.J;
            if (wi0Var != null) {
                wi0Var.b();
            }
            if (this.H || this.G || this.F || (this.f25290f[0].getShader() == null && this.f25290f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = vi0.f30068a;
                    dispatchQueue.cancelRunnable(this.f25293s);
                    dispatchQueue.postRunnable(this.f25293s);
                }
            }
            if (this.f25290f[0].getShader() != null || this.f25290f[1].getShader() != null) {
                synchronized (this.f25288b) {
                    try {
                        float f18 = f7 / this.f25296y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f25291n / f18;
                        if (this.f25290f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f25295x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                            canvas2.drawRect(0.0f, f20, this.f25296y, f20 + f19, this.f25290f[0]);
                            canvas.restore();
                            this.f25290f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f25296y, f21, this.f25290f[0]);
                            this.f25290f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                        }
                        if (this.f25295x != 0 && this.f25290f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f25295x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f25296y, f22 + f19, this.f25290f[c10]);
                            canvas.restore();
                            this.f25290f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f25296y, f23, this.f25290f[c10]);
                            this.f25290f[c10].setAlpha(i10);
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
        ui0 ui0Var = this.f25289c[i10];
        if (view != null && !ui0Var.e) {
            Canvas canvas = ui0Var.f29692a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f25292r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ui0Var.f29695f = true;
        }
        if (i10 != 0 && (this.f25295x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof lw0;
        lw0[] lw0VarArr = this.N;
        if (z10) {
            lw0VarArr[i10] = (lw0) view;
        } else {
            lw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f25294w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f25292r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f25292r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof lw0;
        lw0[] lw0VarArr = this.N;
        if (z10) {
            lw0 lw0Var = (lw0) E;
            lw0VarArr[i10] = lw0Var;
            lw0Var.g(this.v);
            return;
        }
        lw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f25292r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f25292r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f25292r + this.f25291n);
    }

    public void setActionsView(ei0 ei0Var) {
        this.I = ei0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f25287a) {
            invalidate();
        }
    }

    public void setMusicView(wi0 wi0Var) {
        this.J = wi0Var;
    }

    public void setSize(int i10) {
        if (this.f25291n != i10) {
            invalidate();
        }
        this.f25291n = i10;
        this.f25292r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(pi0 pi0Var) {
        e();
        this.h = pi0Var;
        this.f25294w = pi0Var.getCurrentItem();
        this.f25295x = 0;
        pi0Var.b(this.P);
    }

    public void setSuggestionView(xi0 xi0Var) {
    }
}
