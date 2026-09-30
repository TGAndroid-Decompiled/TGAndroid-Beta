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
public final class th0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public rh0 I;
    public ji0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final aw0[] N;
    public final e6 O;
    public final ai.n7 P;
    public boolean f28523a;
    public final Object f28524b;
    public final hi0[] f28525c;
    public final hi0[] d;
    public volatile boolean e;
    public final Paint[] f28526f;
    public ci0 h;
    public int f28527n;
    public int f28528r;
    public final sh0 f28529s;
    public final sh0 v;
    public int f28530w;
    public int f28531x;
    public int f28532y;

    public th0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28523a = z10;
        this.f28524b = new Object();
        this.f28525c = new hi0[3];
        this.d = new hi0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f28526f = paintArr;
        this.f28529s = new sh0(this, 0);
        this.v = new sh0(this, 1);
        this.f28530w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new aw0[3];
        e6 e6Var = new e6(this, 0L, 350L, tr.f28636f);
        this.O = e6Var;
        this.P = new ai.n7(this, 3);
        e6Var.d(1.0f, true);
        boolean z11 = this.f28523a & SharedConfig.useNewBlur;
        this.f28523a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(th0 th0Var, int i10, int i11, int i12) {
        synchronized (th0Var.f28524b) {
            try {
                hi0[] hi0VarArr = th0Var.f28525c;
                hi0 hi0Var = hi0VarArr[i10];
                hi0VarArr[i10] = hi0VarArr[i11];
                hi0VarArr[i11] = hi0Var;
                hi0[] hi0VarArr2 = th0Var.d;
                hi0 hi0Var2 = hi0VarArr2[i10];
                hi0VarArr2[i10] = hi0VarArr2[i11];
                hi0VarArr2[i11] = hi0Var2;
                if (i10 == 2) {
                    if (hi0Var2.f24874f) {
                        th0Var.b(hi0Var2.f24872b, i11);
                    }
                } else {
                    Paint[] paintArr = th0Var.f28526f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    th0Var.f28526f[i12].setShader(null);
                    hi0 hi0Var3 = th0Var.f28525c[i12];
                    if (hi0Var3 != null && !hi0Var3.e && !hi0Var3.d) {
                        hi0Var3.f24874f = false;
                        hi0Var3.f24872b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28528r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f28528r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f28526f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.d01 d01Var, float f10, float f11) {
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
            rh0 rh0Var = this.I;
            if (rh0Var != null) {
                rh0Var.i();
            }
            ji0 ji0Var = this.J;
            if (ji0Var != null) {
                ji0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f28527n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        rh0 rh0Var2 = this.I;
        if (rh0Var2 != null) {
            if (d01Var != null) {
                rh0Var2.f28024w = this.M;
                rh0Var2.f28022r = d01Var;
                rh0Var2.f28023s = renderNodeScale / f10;
                rh0Var2.v = -f11;
                rh0Var2.invalidate();
            } else {
                rh0Var2.f28024w = this.M;
                rh0Var2.f28022r = null;
                rh0Var2.f28023s = renderNodeScale;
                rh0Var2.v = -f11;
                rh0Var2.invalidate();
            }
        }
        ji0 ji0Var2 = this.J;
        if (ji0Var2 != null) {
            if (d01Var != null) {
                ji0Var2.I = this.M;
                ji0Var2.J = renderNodeScale / f10;
                ji0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                ji0Var2.invalidate();
                return;
            }
            ji0Var2.I = this.M;
            ji0Var2.J = renderNodeScale;
            ji0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            ji0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.th0.d():boolean");
    }

    public final void e() {
        ci0 ci0Var = this.h;
        if (ci0Var != null) {
            ai.n7 n7Var = this.P;
            ArrayList arrayList = ci0Var.f48518k0;
            if (arrayList != null) {
                arrayList.remove(n7Var);
            }
            this.h = null;
        }
        this.e = false;
        ii0.f25137a.cancelRunnable(this.f28529s);
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
        synchronized (this.f28524b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    hi0 hi0Var = this.f28525c[i10];
                    if (hi0Var != null) {
                        hi0Var.a();
                        this.f28525c[i10] = null;
                    }
                    hi0 hi0Var2 = this.d[i10];
                    if (hi0Var2 != null) {
                        hi0Var2.a();
                        this.d[i10] = null;
                    }
                    aw0 aw0Var = this.N[i10];
                    if (aw0Var != null) {
                        aw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f28526f[0].setShader(null);
            this.f28526f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.d01 d01Var, float f7, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ci0 ci0Var = this.h;
        if (ci0Var != null && ci0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f28523a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (d01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        aw0[] aw0VarArr = this.N;
                        aw0 aw0Var = aw0VarArr[0];
                        if (aw0Var != null) {
                            aw0Var.g(null);
                        }
                        aw0 aw0Var2 = aw0VarArr[1];
                        if (aw0Var2 != null) {
                            aw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f28528r + this.f28527n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f28531x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f28531x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f28531x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f28528r);
                            return;
                        }
                        return;
                    } else if (d01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f28528r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f28527n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        q5 q5Var = d01Var.e;
                        if (q5Var != null) {
                            imageReceiver = q5Var.f27555k;
                        } else {
                            imageReceiver = d01Var.f29863a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (d01Var.f32930a0 && d01Var.V > 0.0f) {
                            g(d01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, d01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (d01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f28523a = false;
                    setLayerType(1, this.f28526f[0]);
                    setLayerType(1, this.f28526f[1]);
                } else {
                    return;
                }
            }
            rh0 rh0Var = this.I;
            if (rh0Var != null) {
                rh0Var.i();
            }
            ji0 ji0Var = this.J;
            if (ji0Var != null) {
                ji0Var.b();
            }
            if (this.H || this.G || this.F || (this.f28526f[0].getShader() == null && this.f28526f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ii0.f25137a;
                    dispatchQueue.cancelRunnable(this.f28529s);
                    dispatchQueue.postRunnable(this.f28529s);
                }
            }
            if (this.f28526f[0].getShader() != null || this.f28526f[1].getShader() != null) {
                synchronized (this.f28524b) {
                    try {
                        float f18 = f7 / this.f28532y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f28527n / f18;
                        if (this.f28526f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f28531x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f20, this.f28532y, f20 + f19, this.f28526f[0]);
                            canvas.restore();
                            this.f28526f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f28532y, f21, this.f28526f[0]);
                            this.f28526f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f28531x != 0 && this.f28526f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f28531x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f28532y, f22 + f19, this.f28526f[c10]);
                            canvas.restore();
                            this.f28526f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f28532y, f23, this.f28526f[c10]);
                            this.f28526f[c10].setAlpha(i10);
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
        hi0 hi0Var = this.f28525c[i10];
        if (view != null && !hi0Var.e) {
            Canvas canvas = hi0Var.f24871a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f28528r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            hi0Var.f24874f = true;
        }
        if (i10 != 0 && (this.f28531x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof aw0;
        aw0[] aw0VarArr = this.N;
        if (z10) {
            aw0VarArr[i10] = (aw0) view;
        } else {
            aw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f28530w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f28528r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f28528r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof aw0;
        aw0[] aw0VarArr = this.N;
        if (z10) {
            aw0 aw0Var = (aw0) E;
            aw0VarArr[i10] = aw0Var;
            aw0Var.g(this.v);
            return;
        }
        aw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f28528r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28528r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f28528r + this.f28527n);
    }

    public void setActionsView(rh0 rh0Var) {
        this.I = rh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f28523a) {
            invalidate();
        }
    }

    public void setMusicView(ji0 ji0Var) {
        this.J = ji0Var;
    }

    public void setSize(int i10) {
        if (this.f28527n != i10) {
            invalidate();
        }
        this.f28527n = i10;
        this.f28528r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ci0 ci0Var) {
        e();
        this.h = ci0Var;
        this.f28530w = ci0Var.getCurrentItem();
        this.f28531x = 0;
        ci0Var.b(this.P);
    }

    public void setSuggestionView(ki0 ki0Var) {
    }
}
