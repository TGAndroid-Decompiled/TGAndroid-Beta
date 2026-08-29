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
public final class bh0 extends View {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public zg0 E;
    public rh0 F;
    public boolean G;
    public RenderNode H;
    public RenderNode I;
    public final ev0[] J;
    public final d6 K;
    public final lh.g5 L;
    public boolean f27100a;
    public final Object f27101b;
    public final ph0[] f27102c;
    public final ph0[] d;
    public volatile boolean f27103e;
    public final Paint[] f27104f;
    public kh0 h;
    public int f27105n;
    public int f27106r;
    public final ah0 f27107s;
    public final ah0 v;
    public int f27108w;
    public int f27109x;
    public int f27110y;

    public bh0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27100a = z10;
        this.f27101b = new Object();
        this.f27102c = new ph0[3];
        this.d = new ph0[3];
        this.f27103e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f27104f = paintArr;
        this.f27107s = new ah0(this, 0);
        this.v = new ah0(this, 1);
        this.f27108w = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = new ev0[3];
        d6 d6Var = new d6(this, 0L, 350L, jr.f29800f);
        this.K = d6Var;
        this.L = new lh.g5(2, this);
        d6Var.d(1.0f, true);
        boolean z11 = this.f27100a & SharedConfig.useNewBlur;
        this.f27100a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(bh0 bh0Var, int i10, int i11, int i12) {
        synchronized (bh0Var.f27101b) {
            try {
                ph0[] ph0VarArr = bh0Var.f27102c;
                ph0 ph0Var = ph0VarArr[i10];
                ph0VarArr[i10] = ph0VarArr[i11];
                ph0VarArr[i11] = ph0Var;
                ph0[] ph0VarArr2 = bh0Var.d;
                ph0 ph0Var2 = ph0VarArr2[i10];
                ph0VarArr2[i10] = ph0VarArr2[i11];
                ph0VarArr2[i11] = ph0Var2;
                if (i10 == 2) {
                    if (ph0Var2.f31680f) {
                        bh0Var.b(ph0Var2.f31677b, i11);
                    }
                } else {
                    Paint[] paintArr = bh0Var.f27104f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    bh0Var.f27104f[i12].setShader(null);
                    ph0 ph0Var3 = bh0Var.f27102c[i12];
                    if (ph0Var3 != null && !ph0Var3.f31679e && !ph0Var3.d) {
                        ph0Var3.f31680f = false;
                        ph0Var3.f31677b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void g(ImageReceiver imageReceiver, Canvas canvas, float f9, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f9 - f10);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f9);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27106r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f27106r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f27104f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f9, org.telegram.ui.iz0 iz0Var, float f10, float f11) {
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
            zg0 zg0Var = this.E;
            if (zg0Var != null) {
                zg0Var.i();
            }
            rh0 rh0Var = this.F;
            if (rh0Var != null) {
                rh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.I.setPosition(0, 0, (int) Math.ceil(f9 / renderNodeScale), (int) ((this.f27105n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.H);
        this.I.endRecording();
        this.I.setAlpha(this.K.d(1.0f, false));
        zg0 zg0Var2 = this.E;
        if (zg0Var2 != null) {
            if (iz0Var != null) {
                zg0Var2.f35346w = this.I;
                zg0Var2.f35344r = iz0Var;
                zg0Var2.f35345s = renderNodeScale / f10;
                zg0Var2.v = -f11;
                zg0Var2.invalidate();
            } else {
                zg0Var2.f35346w = this.I;
                zg0Var2.f35344r = null;
                zg0Var2.f35345s = renderNodeScale;
                zg0Var2.v = -f11;
                zg0Var2.invalidate();
            }
        }
        rh0 rh0Var2 = this.F;
        if (rh0Var2 != null) {
            if (iz0Var != null) {
                rh0Var2.E = this.I;
                rh0Var2.F = renderNodeScale / f10;
                rh0Var2.G = (-f11) + AndroidUtilities.dp(22.0f);
                rh0Var2.invalidate();
                return;
            }
            rh0Var2.E = this.I;
            rh0Var2.F = renderNodeScale;
            rh0Var2.G = (-f11) + AndroidUtilities.dp(22.0f);
            rh0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bh0.d():boolean");
    }

    public final void e() {
        kh0 kh0Var = this.h;
        if (kh0Var != null) {
            lh.g5 g5Var = this.L;
            ArrayList arrayList = kh0Var.f16794g0;
            if (arrayList != null) {
                arrayList.remove(g5Var);
            }
            this.h = null;
        }
        this.f27103e = false;
        qh0.f31952a.cancelRunnable(this.f27107s);
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
        synchronized (this.f27101b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ph0 ph0Var = this.f27102c[i10];
                    if (ph0Var != null) {
                        ph0Var.a();
                        this.f27102c[i10] = null;
                    }
                    ph0 ph0Var2 = this.d[i10];
                    if (ph0Var2 != null) {
                        ph0Var2.a();
                        this.d[i10] = null;
                    }
                    ev0 ev0Var = this.J[i10];
                    if (ev0Var != null) {
                        ev0Var.g(null);
                        this.J[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f27104f[0].setShader(null);
            this.f27104f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.iz0 iz0Var, float f9, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c3;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        kh0 kh0Var = this.h;
        if (kh0Var != null && kh0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f27100a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (iz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        ev0[] ev0VarArr = this.J;
                        ev0 ev0Var = ev0VarArr[0];
                        if (ev0Var != null) {
                            ev0Var.g(null);
                        }
                        ev0 ev0Var2 = ev0VarArr[1];
                        if (ev0Var2 != null) {
                            ev0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.H.setPosition(0, 0, (int) (f9 / renderNodeScale), (int) ((this.f27106r + this.f27105n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.H.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f27109x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f27109x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f27109x) + f9, 0.0f);
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
                            c(f9, null, 1.0f, this.f27106r);
                            return;
                        }
                        return;
                    } else if (iz0Var != null) {
                        float measuredWidth = f9 / this.h.getMeasuredWidth();
                        float f15 = this.f27106r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.H.setPosition(0, 0, (int) (f9 / renderNodeScale2), (int) ((this.f27105n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.H.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        p5 p5Var = iz0Var.f32906e;
                        if (p5Var != null) {
                            imageReceiver = p5Var.f31593k;
                        } else {
                            imageReceiver = iz0Var.f32903a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (iz0Var.T && iz0Var.R > 0.0f) {
                            g(iz0Var.Q, beginRecording2, f16, f10);
                        }
                        this.H.endRecording();
                        this.H.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.H);
                        c(f9, iz0Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (iz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f27100a = false;
                    setLayerType(1, this.f27104f[0]);
                    setLayerType(1, this.f27104f[1]);
                } else {
                    return;
                }
            }
            zg0 zg0Var = this.E;
            if (zg0Var != null) {
                zg0Var.i();
            }
            rh0 rh0Var = this.F;
            if (rh0Var != null) {
                rh0Var.b();
            }
            if (this.D || this.C || this.B || (this.f27104f[0].getShader() == null && this.f27104f[1].getShader() == null && !this.f27103e)) {
                boolean d = d();
                if (!this.f27103e && d) {
                    this.f27103e = true;
                    DispatchQueue dispatchQueue = qh0.f31952a;
                    dispatchQueue.cancelRunnable(this.f27107s);
                    dispatchQueue.postRunnable(this.f27107s);
                }
            }
            if (this.f27104f[0].getShader() != null || this.f27104f[1].getShader() != null) {
                synchronized (this.f27101b) {
                    try {
                        float f18 = f9 / this.f27110y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.A);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f27105n / f18;
                        if (this.f27104f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f27109x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.A);
                            float f20 = this.A;
                            i10 = 255;
                            f13 = 2.0f;
                            c3 = 1;
                            canvas2.drawRect(0.0f, f20, this.f27110y, f20 + f19, this.f27104f[0]);
                            canvas.restore();
                            this.f27104f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.A;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f27110y, f21, this.f27104f[0]);
                            this.f27104f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c3 = 1;
                        }
                        if (this.f27109x != 0 && this.f27104f[c3].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f27109x) + f9) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.A);
                            float f22 = this.A;
                            canvas2.drawRect(0.0f, f22, this.f27110y, f22 + f19, this.f27104f[c3]);
                            canvas.restore();
                            this.f27104f[c3].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.A;
                            canvas.drawRect(0.0f, f23 * f11, this.f27110y, f23, this.f27104f[c3]);
                            this.f27104f[c3].setAlpha(i10);
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
        ph0 ph0Var = this.f27102c[i10];
        if (view != null && !ph0Var.f31679e) {
            Canvas canvas = ph0Var.f31676a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f27106r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ph0Var.f31680f = true;
        }
        if (i10 != 0 && (this.f27109x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof ev0;
        ev0[] ev0VarArr = this.J;
        if (z10) {
            ev0VarArr[i10] = (ev0) view;
        } else {
            ev0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f27108w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f27106r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f27106r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof ev0;
        ev0[] ev0VarArr = this.J;
        if (z10) {
            ev0 ev0Var = (ev0) E;
            ev0VarArr[i10] = ev0Var;
            ev0Var.g(this.v);
            return;
        }
        ev0VarArr[i10] = null;
    }

    public final void j() {
        if (this.H == null) {
            float renderNodeScale = getRenderNodeScale();
            this.H = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f27106r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27106r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.H.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f27106r + this.f27105n);
    }

    public void setActionsView(zg0 zg0Var) {
        this.E = zg0Var;
    }

    @Override
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        if (f9 != 0.0f && this.f27100a) {
            invalidate();
        }
    }

    public void setMusicView(rh0 rh0Var) {
        this.F = rh0Var;
    }

    public void setSize(int i10) {
        if (this.f27105n != i10) {
            invalidate();
        }
        this.f27105n = i10;
        this.f27106r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(kh0 kh0Var) {
        e();
        this.h = kh0Var;
        this.f27108w = kh0Var.getCurrentItem();
        this.f27109x = 0;
        kh0Var.b(this.L);
    }

    public void setSuggestionView(sh0 sh0Var) {
    }
}
