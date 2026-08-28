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
public final class rg0 extends View {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public pg0 E;
    public hh0 F;
    public boolean G;
    public RenderNode H;
    public RenderNode I;
    public final uu0[] J;
    public final y5 K;
    public final ih.j5 L;
    public boolean f32161a;
    public final Object f32162b;
    public final fh0[] f32163c;
    public final fh0[] d;
    public volatile boolean f32164e;
    public final Paint[] f32165f;
    public ah0 h;
    public int f32166n;
    public int f32167r;
    public final qg0 f32168s;
    public final qg0 v;
    public int f32169w;
    public int f32170x;
    public int f32171y;

    public rg0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32161a = z10;
        this.f32162b = new Object();
        this.f32163c = new fh0[3];
        this.d = new fh0[3];
        this.f32164e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f32165f = paintArr;
        this.f32168s = new qg0(this, 0);
        this.v = new qg0(this, 1);
        this.f32169w = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = new uu0[3];
        y5 y5Var = new y5(this, 0L, 350L, gr.f28844f);
        this.K = y5Var;
        this.L = new ih.j5(2, this);
        y5Var.d(1.0f, true);
        boolean z11 = this.f32161a & SharedConfig.useNewBlur;
        this.f32161a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(rg0 rg0Var, int i9, int i10, int i11) {
        synchronized (rg0Var.f32162b) {
            try {
                fh0[] fh0VarArr = rg0Var.f32163c;
                fh0 fh0Var = fh0VarArr[i9];
                fh0VarArr[i9] = fh0VarArr[i10];
                fh0VarArr[i10] = fh0Var;
                fh0[] fh0VarArr2 = rg0Var.d;
                fh0 fh0Var2 = fh0VarArr2[i9];
                fh0VarArr2[i9] = fh0VarArr2[i10];
                fh0VarArr2[i10] = fh0Var2;
                if (i9 == 2) {
                    if (fh0Var2.f28434f) {
                        rg0Var.b(fh0Var2.f28431b, i10);
                    }
                } else {
                    Paint[] paintArr = rg0Var.f32165f;
                    Paint paint = paintArr[i9];
                    paintArr[i9] = paintArr[i10];
                    paintArr[i10] = paint;
                }
                if (i11 != -1) {
                    rg0Var.f32165f[i11].setShader(null);
                    fh0 fh0Var3 = rg0Var.f32163c[i11];
                    if (fh0Var3 != null && !fh0Var3.f28433e && !fh0Var3.d) {
                        fh0Var3.f28434f = false;
                        fh0Var3.f28431b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f10, float f11) {
        if (imageReceiver == null) {
            return;
        }
        int i9 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f10 - f11);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f11) - f10);
        canvas.scale(1.0f, 2.0f, 0.0f, f11);
        imageReceiver.draw(canvas);
        canvas.restore();
        imageReceiver.setRoundRadius(i9);
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

    public final void b(Bitmap bitmap, int i9) {
        if (i9 < 2 && bitmap != null && !bitmap.isRecycled()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f32167r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f32167r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f32165f[i9].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f10, org.telegram.ui.iz0 iz0Var, float f11, float f12) {
        if (this.E == null && this.F == null) {
            this.G = false;
        } else {
            if (this.I == null) {
                this.I = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.I.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.G = true;
        }
        if (!this.G) {
            pg0 pg0Var = this.E;
            if (pg0Var != null) {
                pg0Var.i();
            }
            hh0 hh0Var = this.F;
            if (hh0Var != null) {
                hh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.f32166n + f12) / renderNodeScale));
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.H);
        this.I.endRecording();
        this.I.setAlpha(this.K.d(1.0f, false));
        pg0 pg0Var2 = this.E;
        if (pg0Var2 != null) {
            if (iz0Var != null) {
                pg0Var2.f31656w = this.I;
                pg0Var2.f31654r = iz0Var;
                pg0Var2.f31655s = renderNodeScale / f11;
                pg0Var2.v = -f12;
                pg0Var2.invalidate();
            } else {
                pg0Var2.f31656w = this.I;
                pg0Var2.f31654r = null;
                pg0Var2.f31655s = renderNodeScale;
                pg0Var2.v = -f12;
                pg0Var2.invalidate();
            }
        }
        hh0 hh0Var2 = this.F;
        if (hh0Var2 != null) {
            if (iz0Var != null) {
                hh0Var2.E = this.I;
                hh0Var2.F = renderNodeScale / f11;
                hh0Var2.G = (-f12) + AndroidUtilities.dp(22.0f);
                hh0Var2.invalidate();
                return;
            }
            hh0Var2.E = this.I;
            hh0Var2.F = renderNodeScale;
            hh0Var2.G = (-f12) + AndroidUtilities.dp(22.0f);
            hh0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rg0.d():boolean");
    }

    public final void e() {
        ah0 ah0Var = this.h;
        if (ah0Var != null) {
            ih.j5 j5Var = this.L;
            ArrayList arrayList = ah0Var.f17196g0;
            if (arrayList != null) {
                arrayList.remove(j5Var);
            }
            this.h = null;
        }
        this.f32164e = false;
        gh0.f28776a.cancelRunnable(this.f32168s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.H;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.H = null;
            }
            RenderNode renderNode2 = this.I;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.I = null;
            }
        }
        this.E = null;
        this.F = null;
        synchronized (this.f32162b) {
            for (int i9 = 0; i9 < 3; i9++) {
                try {
                    fh0 fh0Var = this.f32163c[i9];
                    if (fh0Var != null) {
                        fh0Var.a();
                        this.f32163c[i9] = null;
                    }
                    fh0 fh0Var2 = this.d[i9];
                    if (fh0Var2 != null) {
                        fh0Var2.a();
                        this.d[i9] = null;
                    }
                    uu0 uu0Var = this.J[i9];
                    if (uu0Var != null) {
                        uu0Var.g(null);
                        this.J[i9] = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f32165f[0].setShader(null);
            this.f32165f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.iz0 iz0Var, float f10, float f11, boolean z10, float f12, float f13) {
        int i9;
        float f14;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ah0 ah0Var = this.h;
        if (ah0Var != null && ah0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f32161a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (iz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        uu0[] uu0VarArr = this.J;
                        uu0 uu0Var = uu0VarArr[0];
                        if (uu0Var != null) {
                            uu0Var.g(null);
                        }
                        uu0 uu0Var2 = uu0VarArr[1];
                        if (uu0Var2 != null) {
                            uu0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.H.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.f32167r + this.f32166n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.H.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f32170x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f32170x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f32170x) + f10, 0.0f);
                            i(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.H.endRecording();
                        this.H.setAlpha(this.K.d(1.0f, false));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.H);
                        canvas2.restore();
                        if (getVisibility() == 0 && getAlpha() > 0.0f) {
                            c(f10, null, 1.0f, this.f32167r);
                            return;
                        }
                        return;
                    } else if (iz0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f16 = this.f32167r * (1.0f - f12);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.H.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.f32166n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.H.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        k5 k5Var = iz0Var.f31331e;
                        if (k5Var != null) {
                            imageReceiver = k5Var.f29951k;
                        } else {
                            imageReceiver = iz0Var.f31328a;
                        }
                        g(imageReceiver, beginRecording2, f17, f11);
                        if (iz0Var.T && iz0Var.R > 0.0f) {
                            g(iz0Var.Q, beginRecording2, f17, f11);
                        }
                        this.H.endRecording();
                        this.H.setAlpha(f13);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.H);
                        c(f10, iz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                } else if (iz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f32161a = false;
                    setLayerType(1, this.f32165f[0]);
                    setLayerType(1, this.f32165f[1]);
                } else {
                    return;
                }
            }
            pg0 pg0Var = this.E;
            if (pg0Var != null) {
                pg0Var.i();
            }
            hh0 hh0Var = this.F;
            if (hh0Var != null) {
                hh0Var.b();
            }
            if (this.D || this.C || this.B || (this.f32165f[0].getShader() == null && this.f32165f[1].getShader() == null && !this.f32164e)) {
                boolean d = d();
                if (!this.f32164e && d) {
                    this.f32164e = true;
                    DispatchQueue dispatchQueue = gh0.f28776a;
                    dispatchQueue.cancelRunnable(this.f32168s);
                    dispatchQueue.postRunnable(this.f32168s);
                }
            }
            if (this.f32165f[0].getShader() != null || this.f32165f[1].getShader() != null) {
                synchronized (this.f32162b) {
                    try {
                        float f19 = f10 / this.f32171y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.A);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f32166n / f19;
                        if (this.f32165f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f32170x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.A);
                            float f21 = this.A;
                            i9 = 255;
                            f14 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f21, this.f32171y, f21 + f20, this.f32165f[0]);
                            canvas.restore();
                            this.f32165f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.A;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.f32171y, f22, this.f32165f[0]);
                            this.f32165f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i9 = 255;
                            f14 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f32170x != 0 && this.f32165f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f32170x) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.A);
                            float f23 = this.A;
                            canvas2.drawRect(0.0f, f23, this.f32171y, f23 + f20, this.f32165f[c10]);
                            canvas.restore();
                            this.f32165f[c10].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.A;
                            canvas.drawRect(0.0f, f24 * f12, this.f32171y, f24, this.f32165f[c10]);
                            this.f32165f[c10].setAlpha(i9);
                            canvas.restore();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void h(int i9, View view) {
        fh0 fh0Var = this.f32163c[i9];
        if (view != null && !fh0Var.f28433e) {
            Canvas canvas = fh0Var.f28430a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f32167r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            fh0Var.f28434f = true;
        }
        if (i9 != 0 && (this.f32170x == 0 || i9 != 1)) {
            return;
        }
        boolean z10 = view instanceof uu0;
        uu0[] uu0VarArr = this.J;
        if (z10) {
            uu0VarArr[i9] = (uu0) view;
        } else {
            uu0VarArr[i9] = null;
        }
    }

    public final void i(Canvas canvas, int i9) {
        View E = this.h.E(this.f32169w + i9);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f32167r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f32167r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof uu0;
        uu0[] uu0VarArr = this.J;
        if (z10) {
            uu0 uu0Var = (uu0) E;
            uu0VarArr[i9] = uu0Var;
            uu0Var.g(this.v);
            return;
        }
        uu0VarArr[i9] = null;
    }

    public final void j() {
        if (this.H == null) {
            float renderNodeScale = getRenderNodeScale();
            this.H = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f32167r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f32167r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.H.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), this.f32167r + this.f32166n);
    }

    public void setActionsView(pg0 pg0Var) {
        this.E = pg0Var;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f32161a) {
            invalidate();
        }
    }

    public void setMusicView(hh0 hh0Var) {
        this.F = hh0Var;
    }

    public void setSize(int i9) {
        if (this.f32166n != i9) {
            invalidate();
        }
        this.f32166n = i9;
        this.f32167r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ah0 ah0Var) {
        e();
        this.h = ah0Var;
        this.f32169w = ah0Var.getCurrentItem();
        this.f32170x = 0;
        ah0Var.b(this.L);
    }

    public void setSuggestionView(ih0 ih0Var) {
    }
}
