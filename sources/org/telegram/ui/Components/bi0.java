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
public final class bi0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public yh0 I;
    public ri0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final hw0[] N;
    public final f6 O;
    public final ci.x5 P;
    public boolean f24957a;
    public final Object f24958b;
    public final pi0[] f24959c;
    public final pi0[] d;
    public volatile boolean e;
    public final Paint[] f24960f;
    public ki0 h;
    public int f24961n;
    public int f24962r;
    public final ai0 f24963s;
    public final ai0 v;
    public int f24964w;
    public int f24965x;
    public int f24966y;

    public bi0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24957a = z10;
        this.f24958b = new Object();
        this.f24959c = new pi0[3];
        this.d = new pi0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f24960f = paintArr;
        this.f24963s = new ai0(this, 0);
        this.v = new ai0(this, 1);
        this.f24964w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new hw0[3];
        f6 f6Var = new f6(this, 0L, 350L, bs.f25012f);
        this.O = f6Var;
        this.P = new ci.x5(this, 3);
        f6Var.d(1.0f, true);
        boolean z11 = this.f24957a & SharedConfig.useNewBlur;
        this.f24957a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(bi0 bi0Var, int i10, int i11, int i12) {
        synchronized (bi0Var.f24958b) {
            try {
                pi0[] pi0VarArr = bi0Var.f24959c;
                pi0 pi0Var = pi0VarArr[i10];
                pi0VarArr[i10] = pi0VarArr[i11];
                pi0VarArr[i11] = pi0Var;
                pi0[] pi0VarArr2 = bi0Var.d;
                pi0 pi0Var2 = pi0VarArr2[i10];
                pi0VarArr2[i10] = pi0VarArr2[i11];
                pi0VarArr2[i11] = pi0Var2;
                if (i10 == 2) {
                    if (pi0Var2.f29285f) {
                        bi0Var.b(pi0Var2.f29283b, i11);
                    }
                } else {
                    Paint[] paintArr = bi0Var.f24960f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    bi0Var.f24960f[i12].setShader(null);
                    pi0 pi0Var3 = bi0Var.f24959c[i12];
                    if (pi0Var3 != null && !pi0Var3.e && !pi0Var3.d) {
                        pi0Var3.f29285f = false;
                        pi0Var3.f29283b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24962r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f24962r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f24960f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.oz0 oz0Var, float f10, float f11) {
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
            yh0 yh0Var = this.I;
            if (yh0Var != null) {
                yh0Var.i();
            }
            ri0 ri0Var = this.J;
            if (ri0Var != null) {
                ri0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f24961n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        yh0 yh0Var2 = this.I;
        if (yh0Var2 != null) {
            if (oz0Var != null) {
                yh0Var2.f32634w = this.M;
                yh0Var2.f32632r = oz0Var;
                yh0Var2.f32633s = renderNodeScale / f10;
                yh0Var2.v = -f11;
                yh0Var2.invalidate();
            } else {
                yh0Var2.f32634w = this.M;
                yh0Var2.f32632r = null;
                yh0Var2.f32633s = renderNodeScale;
                yh0Var2.v = -f11;
                yh0Var2.invalidate();
            }
        }
        ri0 ri0Var2 = this.J;
        if (ri0Var2 != null) {
            if (oz0Var != null) {
                ri0Var2.d(this.M, oz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                ri0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bi0.d():boolean");
    }

    public final void e() {
        ki0 ki0Var = this.h;
        if (ki0Var != null) {
            ci.x5 x5Var = this.P;
            ArrayList arrayList = ki0Var.f50692k0;
            if (arrayList != null) {
                arrayList.remove(x5Var);
            }
            this.h = null;
        }
        this.e = false;
        qi0.f29651a.cancelRunnable(this.f24963s);
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
        synchronized (this.f24958b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    pi0 pi0Var = this.f24959c[i10];
                    if (pi0Var != null) {
                        pi0Var.a();
                        this.f24959c[i10] = null;
                    }
                    pi0 pi0Var2 = this.d[i10];
                    if (pi0Var2 != null) {
                        pi0Var2.a();
                        this.d[i10] = null;
                    }
                    hw0 hw0Var = this.N[i10];
                    if (hw0Var != null) {
                        hw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24960f[0].setShader(null);
            this.f24960f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.oz0 oz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ki0 ki0Var = this.h;
        if (ki0Var != null && ki0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f24957a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (oz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        hw0[] hw0VarArr = this.N;
                        hw0 hw0Var = hw0VarArr[0];
                        if (hw0Var != null) {
                            hw0Var.g(null);
                        }
                        hw0 hw0Var2 = hw0VarArr[1];
                        if (hw0Var2 != null) {
                            hw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f24962r + this.f24961n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f24965x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f24965x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f24965x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f24962r);
                            return;
                        }
                        return;
                    } else if (oz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f24962r * (1.0f - f11);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.f24961n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        r5 r5Var = oz0Var.e;
                        if (r5Var != null) {
                            imageReceiver = r5Var.f29851k;
                        } else {
                            imageReceiver = oz0Var.f32040a;
                        }
                        g(imageReceiver, beginRecording2, f17, f10);
                        if (oz0Var.f40009a0 && oz0Var.V > 0.0f) {
                            g(oz0Var.U, beginRecording2, f17, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, oz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                }
                f13 = 1.0f;
                if (oz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f24957a = false;
                    setLayerType(1, this.f24960f[0]);
                    setLayerType(1, this.f24960f[1]);
                } else {
                    return;
                }
            } else {
                f13 = 1.0f;
            }
            yh0 yh0Var = this.I;
            if (yh0Var != null) {
                yh0Var.i();
            }
            ri0 ri0Var = this.J;
            if (ri0Var != null) {
                ri0Var.c();
            }
            if (this.H || this.G || this.F || (this.f24960f[0].getShader() == null && this.f24960f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = qi0.f29651a;
                    dispatchQueue.cancelRunnable(this.f24963s);
                    dispatchQueue.postRunnable(this.f24963s);
                }
            }
            if (this.f24960f[0].getShader() != null || this.f24960f[1].getShader() != null) {
                synchronized (this.f24958b) {
                    try {
                        float f19 = f7 / this.f24966y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f24961n / f19;
                        if (this.f24960f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f24965x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(f13, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            c10 = 1;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.f24966y, f21 + f20, this.f24960f[0]);
                            canvas.restore();
                            this.f24960f[0].setAlpha((int) (f12 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f11, this.f24966y, f22, this.f24960f[0]);
                            this.f24960f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            c10 = 1;
                            f14 = 2.0f;
                        }
                        if (this.f24965x != 0 && this.f24960f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f24965x) + f7) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.f24966y, f23 + f20, this.f24960f[c10]);
                            canvas.restore();
                            this.f24960f[c10].setAlpha((int) (f12 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f11, this.f24966y, f24, this.f24960f[c10]);
                            this.f24960f[c10].setAlpha(255);
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
        pi0 pi0Var = this.f24959c[i10];
        if (view != null && !pi0Var.e) {
            Canvas canvas = pi0Var.f29282a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f24962r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            pi0Var.f29285f = true;
        }
        if (i10 != 0 && (this.f24965x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof hw0;
        hw0[] hw0VarArr = this.N;
        if (z10) {
            hw0VarArr[i10] = (hw0) view;
        } else {
            hw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f24964w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f24962r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f24962r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof hw0;
        hw0[] hw0VarArr = this.N;
        if (z10) {
            hw0 hw0Var = (hw0) E;
            hw0VarArr[i10] = hw0Var;
            hw0Var.g(this.v);
            return;
        }
        hw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f24962r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f24962r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f24962r + this.f24961n);
    }

    public void setActionsView(yh0 yh0Var) {
        this.I = yh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f24957a) {
            invalidate();
        }
    }

    public void setMusicView(ri0 ri0Var) {
        this.J = ri0Var;
    }

    public void setSize(int i10) {
        if (this.f24961n != i10) {
            invalidate();
        }
        this.f24961n = i10;
        this.f24962r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ki0 ki0Var) {
        e();
        this.h = ki0Var;
        this.f24964w = ki0Var.getCurrentItem();
        this.f24965x = 0;
        ki0Var.b(this.P);
    }

    public void setSuggestionView(si0 si0Var) {
    }
}
