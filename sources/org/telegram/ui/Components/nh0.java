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
public final class nh0 extends View {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public kh0 F;
    public di0 G;
    public boolean H;
    public RenderNode I;
    public RenderNode J;
    public final nv0[] K;
    public final z5 L;
    public final nh.h5 M;
    public boolean f27260a;
    public final Object f27261b;
    public final bi0[] f27262c;
    public final bi0[] d;
    public volatile boolean e;
    public final Paint[] f27263f;
    public wh0 h;
    public int f27264n;
    public int f27265r;
    public final mh0 f27266s;
    public final mh0 v;
    public int f27267w;
    public int f27268x;
    public int f27269y;

    public nh0(Context context) {
        super(context);
        boolean z4;
        if (Build.VERSION.SDK_INT >= 31) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f27260a = z4;
        this.f27261b = new Object();
        this.f27262c = new bi0[3];
        this.d = new bi0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f27263f = paintArr;
        this.f27266s = new mh0(this, 0);
        this.v = new mh0(this, 1);
        this.f27267w = -1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.K = new nv0[3];
        z5 z5Var = new z5(this, 0L, 350L, mr.f27122f);
        this.L = z5Var;
        this.M = new nh.h5(2, this);
        z5Var.d(1.0f, true);
        boolean z10 = this.f27260a & SharedConfig.useNewBlur;
        this.f27260a = z10;
        if (z10) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(nh0 nh0Var, int i10, int i11, int i12) {
        synchronized (nh0Var.f27261b) {
            try {
                bi0[] bi0VarArr = nh0Var.f27262c;
                bi0 bi0Var = bi0VarArr[i10];
                bi0VarArr[i10] = bi0VarArr[i11];
                bi0VarArr[i11] = bi0Var;
                bi0[] bi0VarArr2 = nh0Var.d;
                bi0 bi0Var2 = bi0VarArr2[i10];
                bi0VarArr2[i10] = bi0VarArr2[i11];
                bi0VarArr2[i11] = bi0Var2;
                if (i10 == 2) {
                    if (bi0Var2.f23701f) {
                        nh0Var.b(bi0Var2.f23699b, i11);
                    }
                } else {
                    Paint[] paintArr = nh0Var.f27263f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    nh0Var.f27263f[i12].setShader(null);
                    bi0 bi0Var3 = nh0Var.f27262c[i12];
                    if (bi0Var3 != null && !bi0Var3.e && !bi0Var3.d) {
                        bi0Var3.f23701f = false;
                        bi0Var3.f23699b.eraseColor(0);
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
        int i10 = imageReceiver.getRoundRadius()[0];
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27265r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f27265r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f27263f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f10, org.telegram.ui.a01 a01Var, float f11, float f12) {
        if (this.F == null && this.G == null) {
            this.H = false;
        } else {
            if (this.J == null) {
                this.J = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.J.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.H = true;
        }
        if (!this.H) {
            kh0 kh0Var = this.F;
            if (kh0Var != null) {
                kh0Var.i();
            }
            di0 di0Var = this.G;
            if (di0Var != null) {
                di0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.f27264n + f12) / renderNodeScale));
        RecordingCanvas beginRecording = this.J.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.I);
        this.J.endRecording();
        this.J.setAlpha(this.L.d(1.0f, false));
        kh0 kh0Var2 = this.F;
        if (kh0Var2 != null) {
            if (a01Var != null) {
                kh0Var2.f26292w = this.J;
                kh0Var2.f26290r = a01Var;
                kh0Var2.f26291s = renderNodeScale / f11;
                kh0Var2.v = -f12;
                kh0Var2.invalidate();
            } else {
                kh0Var2.f26292w = this.J;
                kh0Var2.f26290r = null;
                kh0Var2.f26291s = renderNodeScale;
                kh0Var2.v = -f12;
                kh0Var2.invalidate();
            }
        }
        di0 di0Var2 = this.G;
        if (di0Var2 != null) {
            if (a01Var != null) {
                di0Var2.F = this.J;
                di0Var2.G = renderNodeScale / f11;
                di0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
                di0Var2.invalidate();
                return;
            }
            di0Var2.F = this.J;
            di0Var2.G = renderNodeScale;
            di0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
            di0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nh0.d():boolean");
    }

    public final void e() {
        wh0 wh0Var = this.h;
        if (wh0Var != null) {
            nh.h5 h5Var = this.M;
            ArrayList arrayList = wh0Var.f13722h0;
            if (arrayList != null) {
                arrayList.remove(h5Var);
            }
            this.h = null;
        }
        this.e = false;
        ci0.f23949a.cancelRunnable(this.f27266s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.I;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.I = null;
            }
            RenderNode renderNode2 = this.J;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.J = null;
            }
        }
        this.F = null;
        this.G = null;
        synchronized (this.f27261b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    bi0 bi0Var = this.f27262c[i10];
                    if (bi0Var != null) {
                        bi0Var.a();
                        this.f27262c[i10] = null;
                    }
                    bi0 bi0Var2 = this.d[i10];
                    if (bi0Var2 != null) {
                        bi0Var2.a();
                        this.d[i10] = null;
                    }
                    nv0 nv0Var = this.K[i10];
                    if (nv0Var != null) {
                        nv0Var.g(null);
                        this.K[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f27263f[0].setShader(null);
            this.f27263f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.a01 a01Var, float f10, float f11, boolean z4, float f12, float f13) {
        int i10;
        float f14;
        char c3;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        wh0 wh0Var = this.h;
        if (wh0Var != null && wh0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f27260a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (a01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        nv0[] nv0VarArr = this.K;
                        nv0 nv0Var = nv0VarArr[0];
                        if (nv0Var != null) {
                            nv0Var.g(null);
                        }
                        nv0 nv0Var2 = nv0VarArr[1];
                        if (nv0Var2 != null) {
                            nv0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.I.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.f27265r + this.f27264n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f27268x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f27268x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f27268x) + f10, 0.0f);
                            i(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.I.endRecording();
                        this.I.setAlpha(this.L.d(1.0f, false));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        canvas2.restore();
                        if (getVisibility() == 0 && getAlpha() > 0.0f) {
                            c(f10, null, 1.0f, this.f27265r);
                            return;
                        }
                        return;
                    } else if (a01Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f16 = this.f27265r * (1.0f - f12);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.I.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.f27264n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.I.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        l5 l5Var = a01Var.e;
                        if (l5Var != null) {
                            imageReceiver = l5Var.f26587k;
                        } else {
                            imageReceiver = a01Var.f27801a;
                        }
                        g(imageReceiver, beginRecording2, f17, f11);
                        if (a01Var.U && a01Var.S > 0.0f) {
                            g(a01Var.R, beginRecording2, f17, f11);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f13);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.I);
                        c(f10, a01Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                } else if (a01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f27260a = false;
                    setLayerType(1, this.f27263f[0]);
                    setLayerType(1, this.f27263f[1]);
                } else {
                    return;
                }
            }
            kh0 kh0Var = this.F;
            if (kh0Var != null) {
                kh0Var.i();
            }
            di0 di0Var = this.G;
            if (di0Var != null) {
                di0Var.b();
            }
            if (this.E || this.D || this.C || (this.f27263f[0].getShader() == null && this.f27263f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ci0.f23949a;
                    dispatchQueue.cancelRunnable(this.f27266s);
                    dispatchQueue.postRunnable(this.f27266s);
                }
            }
            if (this.f27263f[0].getShader() != null || this.f27263f[1].getShader() != null) {
                synchronized (this.f27261b) {
                    try {
                        float f19 = f10 / this.f27269y;
                        if (z4) {
                            canvas2.translate(0.0f, (-f19) * this.B);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f27264n / f19;
                        if (this.f27263f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f27268x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.B);
                            float f21 = this.B;
                            i10 = 255;
                            f14 = 2.0f;
                            c3 = 1;
                            canvas2.drawRect(0.0f, f21, this.f27269y, f21 + f20, this.f27263f[0]);
                            canvas.restore();
                            this.f27263f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.B;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.f27269y, f22, this.f27263f[0]);
                            this.f27263f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f14 = 2.0f;
                            c3 = 1;
                        }
                        if (this.f27268x != 0 && this.f27263f[c3].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f27268x) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.B);
                            float f23 = this.B;
                            canvas2.drawRect(0.0f, f23, this.f27269y, f23 + f20, this.f27263f[c3]);
                            canvas.restore();
                            this.f27263f[c3].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.B;
                            canvas.drawRect(0.0f, f24 * f12, this.f27269y, f24, this.f27263f[c3]);
                            this.f27263f[c3].setAlpha(i10);
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
        bi0 bi0Var = this.f27262c[i10];
        if (view != null && !bi0Var.e) {
            Canvas canvas = bi0Var.f23698a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f27265r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            bi0Var.f23701f = true;
        }
        if (i10 != 0 && (this.f27268x == 0 || i10 != 1)) {
            return;
        }
        boolean z4 = view instanceof nv0;
        nv0[] nv0VarArr = this.K;
        if (z4) {
            nv0VarArr[i10] = (nv0) view;
        } else {
            nv0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f27267w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f27265r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f27265r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z4 = E instanceof nv0;
        nv0[] nv0VarArr = this.K;
        if (z4) {
            nv0 nv0Var = (nv0) E;
            nv0VarArr[i10] = nv0Var;
            nv0Var.g(this.v);
            return;
        }
        nv0VarArr[i10] = null;
    }

    public final void j() {
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f27265r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27265r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.I.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f27265r + this.f27264n);
    }

    public void setActionsView(kh0 kh0Var) {
        this.F = kh0Var;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f27260a) {
            invalidate();
        }
    }

    public void setMusicView(di0 di0Var) {
        this.G = di0Var;
    }

    public void setSize(int i10) {
        if (this.f27264n != i10) {
            invalidate();
        }
        this.f27264n = i10;
        this.f27265r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(wh0 wh0Var) {
        e();
        this.h = wh0Var;
        this.f27267w = wh0Var.getCurrentItem();
        this.f27268x = 0;
        wh0Var.b(this.M);
    }

    public void setSuggestionView(ei0 ei0Var) {
    }
}
