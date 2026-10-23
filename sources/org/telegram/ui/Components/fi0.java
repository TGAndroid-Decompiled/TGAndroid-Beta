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
public final class fi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ci0 I;
    public vi0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final lw0[] N;
    public final f6 O;
    public final ci.w5 P;
    public boolean f26333a;
    public final Object f26334b;
    public final ti0[] f26335c;
    public final ti0[] d;
    public volatile boolean e;
    public final Paint[] f26336f;
    public oi0 h;
    public int f26337n;
    public int f26338r;
    public final ei0 f26339s;
    public final ei0 v;
    public int f26340w;
    public int f26341x;
    public int f26342y;

    public fi0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26333a = z10;
        this.f26334b = new Object();
        this.f26335c = new ti0[3];
        this.d = new ti0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f26336f = paintArr;
        this.f26339s = new ei0(this, 0);
        this.v = new ei0(this, 1);
        this.f26340w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new lw0[3];
        f6 f6Var = new f6(this, 0L, 350L, bs.f25133f);
        this.O = f6Var;
        this.P = new ci.w5(this, 3);
        f6Var.d(1.0f, true);
        boolean z11 = this.f26333a & SharedConfig.useNewBlur;
        this.f26333a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(fi0 fi0Var, int i10, int i11, int i12) {
        synchronized (fi0Var.f26334b) {
            try {
                ti0[] ti0VarArr = fi0Var.f26335c;
                ti0 ti0Var = ti0VarArr[i10];
                ti0VarArr[i10] = ti0VarArr[i11];
                ti0VarArr[i11] = ti0Var;
                ti0[] ti0VarArr2 = fi0Var.d;
                ti0 ti0Var2 = ti0VarArr2[i10];
                ti0VarArr2[i10] = ti0VarArr2[i11];
                ti0VarArr2[i11] = ti0Var2;
                if (i10 == 2) {
                    if (ti0Var2.f30800f) {
                        fi0Var.b(ti0Var2.f30798b, i11);
                    }
                } else {
                    Paint[] paintArr = fi0Var.f26336f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    fi0Var.f26336f[i12].setShader(null);
                    ti0 ti0Var3 = fi0Var.f26335c[i12];
                    if (ti0Var3 != null && !ti0Var3.e && !ti0Var3.d) {
                        ti0Var3.f30800f = false;
                        ti0Var3.f30798b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f26338r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f26338r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f26336f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.sz0 sz0Var, float f10, float f11) {
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
            ci0 ci0Var = this.I;
            if (ci0Var != null) {
                ci0Var.i();
            }
            vi0 vi0Var = this.J;
            if (vi0Var != null) {
                vi0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f26337n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        ci0 ci0Var2 = this.I;
        if (ci0Var2 != null) {
            if (sz0Var != null) {
                ci0Var2.f25348w = this.M;
                ci0Var2.f25346r = sz0Var;
                ci0Var2.f25347s = renderNodeScale / f10;
                ci0Var2.v = -f11;
                ci0Var2.invalidate();
            } else {
                ci0Var2.f25348w = this.M;
                ci0Var2.f25346r = null;
                ci0Var2.f25347s = renderNodeScale;
                ci0Var2.v = -f11;
                ci0Var2.invalidate();
            }
        }
        vi0 vi0Var2 = this.J;
        if (vi0Var2 != null) {
            if (sz0Var != null) {
                vi0Var2.d(this.M, sz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                vi0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fi0.d():boolean");
    }

    public final void e() {
        oi0 oi0Var = this.h;
        if (oi0Var != null) {
            ci.w5 w5Var = this.P;
            ArrayList arrayList = oi0Var.f51162k0;
            if (arrayList != null) {
                arrayList.remove(w5Var);
            }
            this.h = null;
        }
        this.e = false;
        ui0.f31170a.cancelRunnable(this.f26339s);
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
        synchronized (this.f26334b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ti0 ti0Var = this.f26335c[i10];
                    if (ti0Var != null) {
                        ti0Var.a();
                        this.f26335c[i10] = null;
                    }
                    ti0 ti0Var2 = this.d[i10];
                    if (ti0Var2 != null) {
                        ti0Var2.a();
                        this.d[i10] = null;
                    }
                    lw0 lw0Var = this.N[i10];
                    if (lw0Var != null) {
                        lw0Var.f(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f26336f[0].setShader(null);
            this.f26336f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.sz0 sz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        oi0 oi0Var = this.h;
        if (oi0Var != null && oi0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f26333a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (sz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        lw0[] lw0VarArr = this.N;
                        lw0 lw0Var = lw0VarArr[0];
                        if (lw0Var != null) {
                            lw0Var.f(null);
                        }
                        lw0 lw0Var2 = lw0VarArr[1];
                        if (lw0Var2 != null) {
                            lw0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f26338r + this.f26337n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f26341x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f26341x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f26341x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f26338r);
                            return;
                        }
                        return;
                    } else if (sz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f26338r * (1.0f - f11);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.f26337n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        r5 r5Var = sz0Var.e;
                        if (r5Var != null) {
                            imageReceiver = r5Var.f30098k;
                        } else {
                            imageReceiver = sz0Var.f32195a;
                        }
                        g(imageReceiver, beginRecording2, f17, f10);
                        if (sz0Var.f41828a0 && sz0Var.V > 0.0f) {
                            g(sz0Var.U, beginRecording2, f17, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, sz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                }
                f13 = 1.0f;
                if (sz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f26333a = false;
                    setLayerType(1, this.f26336f[0]);
                    setLayerType(1, this.f26336f[1]);
                } else {
                    return;
                }
            } else {
                f13 = 1.0f;
            }
            ci0 ci0Var = this.I;
            if (ci0Var != null) {
                ci0Var.i();
            }
            vi0 vi0Var = this.J;
            if (vi0Var != null) {
                vi0Var.c();
            }
            if (this.H || this.G || this.F || (this.f26336f[0].getShader() == null && this.f26336f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ui0.f31170a;
                    dispatchQueue.cancelRunnable(this.f26339s);
                    dispatchQueue.postRunnable(this.f26339s);
                }
            }
            if (this.f26336f[0].getShader() != null || this.f26336f[1].getShader() != null) {
                synchronized (this.f26334b) {
                    try {
                        float f19 = f7 / this.f26342y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f26337n / f19;
                        if (this.f26336f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f26341x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(f13, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            c10 = 1;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.f26342y, f21 + f20, this.f26336f[0]);
                            canvas.restore();
                            this.f26336f[0].setAlpha((int) (f12 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f11, this.f26342y, f22, this.f26336f[0]);
                            this.f26336f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            c10 = 1;
                            f14 = 2.0f;
                        }
                        if (this.f26341x != 0 && this.f26336f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f26341x) + f7) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.f26342y, f23 + f20, this.f26336f[c10]);
                            canvas.restore();
                            this.f26336f[c10].setAlpha((int) (f12 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f11, this.f26342y, f24, this.f26336f[c10]);
                            this.f26336f[c10].setAlpha(255);
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
        ti0 ti0Var = this.f26335c[i10];
        if (view != null && !ti0Var.e) {
            Canvas canvas = ti0Var.f30797a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f26338r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ti0Var.f30800f = true;
        }
        if (i10 != 0 && (this.f26341x == 0 || i10 != 1)) {
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
        View E = this.h.E(this.f26340w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f26338r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f26338r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof lw0;
        lw0[] lw0VarArr = this.N;
        if (z10) {
            lw0 lw0Var = (lw0) E;
            lw0VarArr[i10] = lw0Var;
            lw0Var.f(this.v);
            return;
        }
        lw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f26338r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f26338r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f26338r + this.f26337n);
    }

    public void setActionsView(ci0 ci0Var) {
        this.I = ci0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f26333a) {
            invalidate();
        }
    }

    public void setMusicView(vi0 vi0Var) {
        this.J = vi0Var;
    }

    public void setSize(int i10) {
        if (this.f26337n != i10) {
            invalidate();
        }
        this.f26337n = i10;
        this.f26338r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(oi0 oi0Var) {
        e();
        this.h = oi0Var;
        this.f26340w = oi0Var.getCurrentItem();
        this.f26341x = 0;
        oi0Var.b(this.P);
    }

    public void setSuggestionView(wi0 wi0Var) {
    }
}
