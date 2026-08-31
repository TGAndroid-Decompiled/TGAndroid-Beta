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
public final class oh0 extends View {
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public lh0 F;
    public ei0 G;
    public boolean H;
    public RenderNode I;
    public RenderNode J;
    public final nv0[] K;
    public final z5 L;
    public final oh.i5 M;
    public boolean f29760a;
    public final Object f29761b;
    public final ci0[] f29762c;
    public final ci0[] d;
    public volatile boolean f29763e;
    public final Paint[] f29764f;
    public xh0 h;
    public int f29765n;
    public int f29766r;
    public final nh0 f29767s;
    public final nh0 v;
    public int f29768w;
    public int f29769x;
    public int f29770y;

    public oh0(Context context) {
        super(context);
        boolean z4;
        if (Build.VERSION.SDK_INT >= 31) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f29760a = z4;
        this.f29761b = new Object();
        this.f29762c = new ci0[3];
        this.d = new ci0[3];
        this.f29763e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f29764f = paintArr;
        this.f29767s = new nh0(this, 0);
        this.v = new nh0(this, 1);
        this.f29768w = -1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.K = new nv0[3];
        z5 z5Var = new z5(this, 0L, 350L, pr.f30183f);
        this.L = z5Var;
        this.M = new oh.i5(2, this);
        z5Var.d(1.0f, true);
        boolean z10 = this.f29760a & SharedConfig.useNewBlur;
        this.f29760a = z10;
        if (z10) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(oh0 oh0Var, int i10, int i11, int i12) {
        synchronized (oh0Var.f29761b) {
            try {
                ci0[] ci0VarArr = oh0Var.f29762c;
                ci0 ci0Var = ci0VarArr[i10];
                ci0VarArr[i10] = ci0VarArr[i11];
                ci0VarArr[i11] = ci0Var;
                ci0[] ci0VarArr2 = oh0Var.d;
                ci0 ci0Var2 = ci0VarArr2[i10];
                ci0VarArr2[i10] = ci0VarArr2[i11];
                ci0VarArr2[i11] = ci0Var2;
                if (i10 == 2) {
                    if (ci0Var2.f25984f) {
                        oh0Var.b(ci0Var2.f25981b, i11);
                    }
                } else {
                    Paint[] paintArr = oh0Var.f29764f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    oh0Var.f29764f[i12].setShader(null);
                    ci0 ci0Var3 = oh0Var.f29762c[i12];
                    if (ci0Var3 != null && !ci0Var3.f25983e && !ci0Var3.d) {
                        ci0Var3.f25984f = false;
                        ci0Var3.f25981b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f29766r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f29766r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f29764f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f10, org.telegram.ui.vz0 vz0Var, float f11, float f12) {
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
            lh0 lh0Var = this.F;
            if (lh0Var != null) {
                lh0Var.i();
            }
            ei0 ei0Var = this.G;
            if (ei0Var != null) {
                ei0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.J.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.f29765n + f12) / renderNodeScale));
        RecordingCanvas beginRecording = this.J.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.I);
        this.J.endRecording();
        this.J.setAlpha(this.L.d(1.0f, false));
        lh0 lh0Var2 = this.F;
        if (lh0Var2 != null) {
            if (vz0Var != null) {
                lh0Var2.f28744w = this.J;
                lh0Var2.f28742r = vz0Var;
                lh0Var2.f28743s = renderNodeScale / f11;
                lh0Var2.v = -f12;
                lh0Var2.invalidate();
            } else {
                lh0Var2.f28744w = this.J;
                lh0Var2.f28742r = null;
                lh0Var2.f28743s = renderNodeScale;
                lh0Var2.v = -f12;
                lh0Var2.invalidate();
            }
        }
        ei0 ei0Var2 = this.G;
        if (ei0Var2 != null) {
            if (vz0Var != null) {
                ei0Var2.F = this.J;
                ei0Var2.G = renderNodeScale / f11;
                ei0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
                ei0Var2.invalidate();
                return;
            }
            ei0Var2.F = this.J;
            ei0Var2.G = renderNodeScale;
            ei0Var2.H = (-f12) + AndroidUtilities.dp(22.0f);
            ei0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oh0.d():boolean");
    }

    public final void e() {
        xh0 xh0Var = this.h;
        if (xh0Var != null) {
            oh.i5 i5Var = this.M;
            ArrayList arrayList = xh0Var.f13449h0;
            if (arrayList != null) {
                arrayList.remove(i5Var);
            }
            this.h = null;
        }
        this.f29763e = false;
        di0.f26276a.cancelRunnable(this.f29767s);
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
        synchronized (this.f29761b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ci0 ci0Var = this.f29762c[i10];
                    if (ci0Var != null) {
                        ci0Var.a();
                        this.f29762c[i10] = null;
                    }
                    ci0 ci0Var2 = this.d[i10];
                    if (ci0Var2 != null) {
                        ci0Var2.a();
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
            this.f29764f[0].setShader(null);
            this.f29764f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.vz0 vz0Var, float f10, float f11, boolean z4, float f12, float f13) {
        int i10;
        float f14;
        char c3;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        xh0 xh0Var = this.h;
        if (xh0Var != null && xh0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f29760a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (vz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
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
                        this.I.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.f29766r + this.f29765n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f29769x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f29769x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f29769x) + f10, 0.0f);
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
                            c(f10, null, 1.0f, this.f29766r);
                            return;
                        }
                        return;
                    } else if (vz0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f16 = this.f29766r * (1.0f - f12);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.I.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.f29765n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.I.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        l5 l5Var = vz0Var.f30001e;
                        if (l5Var != null) {
                            imageReceiver = l5Var.f28604k;
                        } else {
                            imageReceiver = vz0Var.f29998a;
                        }
                        g(imageReceiver, beginRecording2, f17, f11);
                        if (vz0Var.U && vz0Var.S > 0.0f) {
                            g(vz0Var.R, beginRecording2, f17, f11);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f13);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.I);
                        c(f10, vz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                } else if (vz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f29760a = false;
                    setLayerType(1, this.f29764f[0]);
                    setLayerType(1, this.f29764f[1]);
                } else {
                    return;
                }
            }
            lh0 lh0Var = this.F;
            if (lh0Var != null) {
                lh0Var.i();
            }
            ei0 ei0Var = this.G;
            if (ei0Var != null) {
                ei0Var.b();
            }
            if (this.E || this.D || this.C || (this.f29764f[0].getShader() == null && this.f29764f[1].getShader() == null && !this.f29763e)) {
                boolean d = d();
                if (!this.f29763e && d) {
                    this.f29763e = true;
                    DispatchQueue dispatchQueue = di0.f26276a;
                    dispatchQueue.cancelRunnable(this.f29767s);
                    dispatchQueue.postRunnable(this.f29767s);
                }
            }
            if (this.f29764f[0].getShader() != null || this.f29764f[1].getShader() != null) {
                synchronized (this.f29761b) {
                    try {
                        float f19 = f10 / this.f29770y;
                        if (z4) {
                            canvas2.translate(0.0f, (-f19) * this.B);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f29765n / f19;
                        if (this.f29764f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f29769x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.B);
                            float f21 = this.B;
                            i10 = 255;
                            f14 = 2.0f;
                            c3 = 1;
                            canvas2.drawRect(0.0f, f21, this.f29770y, f21 + f20, this.f29764f[0]);
                            canvas.restore();
                            this.f29764f[0].setAlpha((int) (f13 * 255.0f));
                            float f22 = this.B;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f12, this.f29770y, f22, this.f29764f[0]);
                            this.f29764f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f14 = 2.0f;
                            c3 = 1;
                        }
                        if (this.f29769x != 0 && this.f29764f[c3].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f29769x) + f10) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.B);
                            float f23 = this.B;
                            canvas2.drawRect(0.0f, f23, this.f29770y, f23 + f20, this.f29764f[c3]);
                            canvas.restore();
                            this.f29764f[c3].setAlpha((int) (f13 * 255.0f));
                            float f24 = this.B;
                            canvas.drawRect(0.0f, f24 * f12, this.f29770y, f24, this.f29764f[c3]);
                            this.f29764f[c3].setAlpha(i10);
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
        ci0 ci0Var = this.f29762c[i10];
        if (view != null && !ci0Var.f25983e) {
            Canvas canvas = ci0Var.f25980a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f29766r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ci0Var.f25984f = true;
        }
        if (i10 != 0 && (this.f29769x == 0 || i10 != 1)) {
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
        View E = this.h.E(this.f29768w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f29766r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f29766r);
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
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f29766r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f29766r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f29766r + this.f29765n);
    }

    public void setActionsView(lh0 lh0Var) {
        this.F = lh0Var;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 != 0.0f && this.f29760a) {
            invalidate();
        }
    }

    public void setMusicView(ei0 ei0Var) {
        this.G = ei0Var;
    }

    public void setSize(int i10) {
        if (this.f29765n != i10) {
            invalidate();
        }
        this.f29765n = i10;
        this.f29766r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(xh0 xh0Var) {
        e();
        this.h = xh0Var;
        this.f29768w = xh0Var.getCurrentItem();
        this.f29769x = 0;
        xh0Var.b(this.M);
    }

    public void setSuggestionView(fi0 fi0Var) {
    }
}
