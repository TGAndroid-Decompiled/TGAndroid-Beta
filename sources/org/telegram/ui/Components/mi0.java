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
public final class mi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ki0 I;
    public cj0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final rw0[] N;
    public final g6 O;
    public final ai.o7 P;
    public boolean f28712a;
    public final Object f28713b;
    public final aj0[] f28714c;
    public final aj0[] d;
    public volatile boolean f28715e;
    public final Paint[] f28716f;
    public vi0 h;
    public int f28717n;
    public int f28718r;
    public final li0 f28719s;
    public final li0 v;
    public int f28720w;
    public int f28721x;
    public int f28722y;

    public mi0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28712a = z10;
        this.f28713b = new Object();
        this.f28714c = new aj0[3];
        this.d = new aj0[3];
        this.f28715e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f28716f = paintArr;
        this.f28719s = new li0(this, 0);
        this.v = new li0(this, 1);
        this.f28720w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new rw0[3];
        g6 g6Var = new g6(this, 0L, 350L, is.f27451f);
        this.O = g6Var;
        this.P = new ai.o7(this, 3);
        g6Var.d(1.0f, true);
        boolean z11 = this.f28712a & SharedConfig.useNewBlur;
        this.f28712a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(mi0 mi0Var, int i10, int i11, int i12) {
        synchronized (mi0Var.f28713b) {
            try {
                aj0[] aj0VarArr = mi0Var.f28714c;
                aj0 aj0Var = aj0VarArr[i10];
                aj0VarArr[i10] = aj0VarArr[i11];
                aj0VarArr[i11] = aj0Var;
                aj0[] aj0VarArr2 = mi0Var.d;
                aj0 aj0Var2 = aj0VarArr2[i10];
                aj0VarArr2[i10] = aj0VarArr2[i11];
                aj0VarArr2[i11] = aj0Var2;
                if (i10 == 2) {
                    if (aj0Var2.f24529f) {
                        mi0Var.b(aj0Var2.f24526b, i11);
                    }
                } else {
                    Paint[] paintArr = mi0Var.f28716f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    mi0Var.f28716f[i12].setShader(null);
                    aj0 aj0Var3 = mi0Var.f28714c[i12];
                    if (aj0Var3 != null && !aj0Var3.f24528e && !aj0Var3.d) {
                        aj0Var3.f24529f = false;
                        aj0Var3.f24526b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28718r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f28718r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f28716f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
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
            ki0 ki0Var = this.I;
            if (ki0Var != null) {
                ki0Var.i();
            }
            cj0 cj0Var = this.J;
            if (cj0Var != null) {
                cj0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f28717n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        ki0 ki0Var2 = this.I;
        if (ki0Var2 != null) {
            if (k01Var != null) {
                ki0Var2.f27997w = this.M;
                ki0Var2.f27995r = k01Var;
                ki0Var2.f27996s = renderNodeScale / f10;
                ki0Var2.v = -f11;
                ki0Var2.invalidate();
            } else {
                ki0Var2.f27997w = this.M;
                ki0Var2.f27995r = null;
                ki0Var2.f27996s = renderNodeScale;
                ki0Var2.v = -f11;
                ki0Var2.invalidate();
            }
        }
        cj0 cj0Var2 = this.J;
        if (cj0Var2 != null) {
            if (k01Var != null) {
                cj0Var2.I = this.M;
                cj0Var2.J = renderNodeScale / f10;
                cj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                cj0Var2.invalidate();
                return;
            }
            cj0Var2.I = this.M;
            cj0Var2.J = renderNodeScale;
            cj0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            cj0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mi0.d():boolean");
    }

    public final void e() {
        vi0 vi0Var = this.h;
        if (vi0Var != null) {
            ai.o7 o7Var = this.P;
            ArrayList arrayList = vi0Var.f53637k0;
            if (arrayList != null) {
                arrayList.remove(o7Var);
            }
            this.h = null;
        }
        this.f28715e = false;
        bj0.f24968a.cancelRunnable(this.f28719s);
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
        synchronized (this.f28713b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    aj0 aj0Var = this.f28714c[i10];
                    if (aj0Var != null) {
                        aj0Var.a();
                        this.f28714c[i10] = null;
                    }
                    aj0 aj0Var2 = this.d[i10];
                    if (aj0Var2 != null) {
                        aj0Var2.a();
                        this.d[i10] = null;
                    }
                    rw0 rw0Var = this.N[i10];
                    if (rw0Var != null) {
                        rw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f28716f[0].setShader(null);
            this.f28716f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.k01 k01Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        int i10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        vi0 vi0Var = this.h;
        if (vi0Var != null && vi0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f28712a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (k01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        rw0[] rw0VarArr = this.N;
                        rw0 rw0Var = rw0VarArr[0];
                        if (rw0Var != null) {
                            rw0Var.g(null);
                        }
                        rw0 rw0Var2 = rw0VarArr[1];
                        if (rw0Var2 != null) {
                            rw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f28718r + this.f28717n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f28721x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f28721x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f28721x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f28718r);
                            return;
                        }
                        return;
                    } else if (k01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f28718r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f28717n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        s5 s5Var = k01Var.f33133e;
                        if (s5Var != null) {
                            imageReceiver = s5Var.f30634k;
                        } else {
                            imageReceiver = k01Var.f33130a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (k01Var.f39156a0 && k01Var.V > 0.0f) {
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
                    this.f28712a = false;
                    setLayerType(1, this.f28716f[0]);
                    setLayerType(1, this.f28716f[1]);
                } else {
                    return;
                }
            }
            ki0 ki0Var = this.I;
            if (ki0Var != null) {
                ki0Var.i();
            }
            cj0 cj0Var = this.J;
            if (cj0Var != null) {
                cj0Var.b();
            }
            if (this.H || this.G || this.F || (this.f28716f[0].getShader() == null && this.f28716f[1].getShader() == null && !this.f28715e)) {
                boolean d = d();
                if (!this.f28715e && d) {
                    this.f28715e = true;
                    DispatchQueue dispatchQueue = bj0.f24968a;
                    dispatchQueue.cancelRunnable(this.f28719s);
                    dispatchQueue.postRunnable(this.f28719s);
                }
            }
            if (this.f28716f[0].getShader() != null || this.f28716f[1].getShader() != null) {
                synchronized (this.f28713b) {
                    try {
                        float f18 = f7 / this.f28722y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f28717n / f18;
                        if (this.f28716f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f28721x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                            canvas2.drawRect(0.0f, f20, this.f28722y, f20 + f19, this.f28716f[0]);
                            canvas.restore();
                            this.f28716f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f28722y, f21, this.f28716f[0]);
                            this.f28716f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                            c10 = 1;
                            i10 = 255;
                        }
                        if (this.f28721x != 0 && this.f28716f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f28721x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f28722y, f22 + f19, this.f28716f[c10]);
                            canvas.restore();
                            this.f28716f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f28722y, f23, this.f28716f[c10]);
                            this.f28716f[c10].setAlpha(i10);
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
        aj0 aj0Var = this.f28714c[i10];
        if (view != null && !aj0Var.f24528e) {
            Canvas canvas = aj0Var.f24525a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f28718r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            aj0Var.f24529f = true;
        }
        if (i10 != 0 && (this.f28721x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof rw0;
        rw0[] rw0VarArr = this.N;
        if (z10) {
            rw0VarArr[i10] = (rw0) view;
        } else {
            rw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f28720w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f28718r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f28718r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof rw0;
        rw0[] rw0VarArr = this.N;
        if (z10) {
            rw0 rw0Var = (rw0) E;
            rw0VarArr[i10] = rw0Var;
            rw0Var.g(this.v);
            return;
        }
        rw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f28718r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28718r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f28718r + this.f28717n);
    }

    public void setActionsView(ki0 ki0Var) {
        this.I = ki0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f28712a) {
            invalidate();
        }
    }

    public void setMusicView(cj0 cj0Var) {
        this.J = cj0Var;
    }

    public void setSize(int i10) {
        if (this.f28717n != i10) {
            invalidate();
        }
        this.f28717n = i10;
        this.f28718r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(vi0 vi0Var) {
        e();
        this.h = vi0Var;
        this.f28720w = vi0Var.getCurrentItem();
        this.f28721x = 0;
        vi0Var.b(this.P);
    }

    public void setSuggestionView(dj0 dj0Var) {
    }
}
