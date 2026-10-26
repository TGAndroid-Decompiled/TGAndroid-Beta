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
public final class ei0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public bi0 I;
    public ui0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final sw0[] N;
    public final h6 O;
    public final di.w5 P;
    public boolean f27873a;
    public final Object f27874b;
    public final si0[] f27875c;
    public final si0[] d;
    public volatile boolean e;
    public final Paint[] f27876f;
    public ni0 h;
    public int f27877n;
    public int f27878r;
    public final di0 f27879s;
    public final di0 v;
    public int f27880w;
    public int f27881x;
    public int f27882y;

    public ei0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27873a = z10;
        this.f27874b = new Object();
        this.f27875c = new si0[3];
        this.d = new si0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f27876f = paintArr;
        this.f27879s = new di0(this, 0);
        this.v = new di0(this, 1);
        this.f27880w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new sw0[3];
        h6 h6Var = new h6(this, 0L, 350L, ds.f27586f);
        this.O = h6Var;
        this.P = new di.w5(2, this);
        h6Var.d(1.0f, true);
        boolean z11 = this.f27873a & SharedConfig.useNewBlur;
        this.f27873a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(ei0 ei0Var, int i10, int i11, int i12) {
        synchronized (ei0Var.f27874b) {
            try {
                si0[] si0VarArr = ei0Var.f27875c;
                si0 si0Var = si0VarArr[i10];
                si0VarArr[i10] = si0VarArr[i11];
                si0VarArr[i11] = si0Var;
                si0[] si0VarArr2 = ei0Var.d;
                si0 si0Var2 = si0VarArr2[i10];
                si0VarArr2[i10] = si0VarArr2[i11];
                si0VarArr2[i11] = si0Var2;
                if (i10 == 2) {
                    if (si0Var2.f32574f) {
                        ei0Var.b(si0Var2.f32572b, i11);
                    }
                } else {
                    Paint[] paintArr = ei0Var.f27876f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    ei0Var.f27876f[i12].setShader(null);
                    si0 si0Var3 = ei0Var.f27875c[i12];
                    if (si0Var3 != null && !si0Var3.e && !si0Var3.d) {
                        si0Var3.f32574f = false;
                        si0Var3.f32572b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27878r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f27878r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f27876f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.wz0 wz0Var, float f10, float f11) {
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
            bi0 bi0Var = this.I;
            if (bi0Var != null) {
                bi0Var.i();
            }
            ui0 ui0Var = this.J;
            if (ui0Var != null) {
                ui0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f27877n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        bi0 bi0Var2 = this.I;
        if (bi0Var2 != null) {
            if (wz0Var != null) {
                bi0Var2.f26868w = this.M;
                bi0Var2.f26866r = wz0Var;
                bi0Var2.f26867s = renderNodeScale / f10;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            } else {
                bi0Var2.f26868w = this.M;
                bi0Var2.f26866r = null;
                bi0Var2.f26867s = renderNodeScale;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            }
        }
        ui0 ui0Var2 = this.J;
        if (ui0Var2 != null) {
            if (wz0Var != null) {
                ui0Var2.d(this.M, wz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                ui0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ei0.d():boolean");
    }

    public final void e() {
        ni0 ni0Var = this.h;
        if (ni0Var != null) {
            di.w5 w5Var = this.P;
            ArrayList arrayList = ni0Var.f315k0;
            if (arrayList != null) {
                arrayList.remove(w5Var);
            }
            this.h = null;
        }
        this.e = false;
        ti0.f33088a.cancelRunnable(this.f27879s);
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
        synchronized (this.f27874b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    si0 si0Var = this.f27875c[i10];
                    if (si0Var != null) {
                        si0Var.a();
                        this.f27875c[i10] = null;
                    }
                    si0 si0Var2 = this.d[i10];
                    if (si0Var2 != null) {
                        si0Var2.a();
                        this.d[i10] = null;
                    }
                    sw0 sw0Var = this.N[i10];
                    if (sw0Var != null) {
                        sw0Var.e(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f27876f[0].setShader(null);
            this.f27876f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.wz0 wz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ni0 ni0Var = this.h;
        if (ni0Var != null && ni0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f27873a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (wz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        sw0[] sw0VarArr = this.N;
                        sw0 sw0Var = sw0VarArr[0];
                        if (sw0Var != null) {
                            sw0Var.e(null);
                        }
                        sw0 sw0Var2 = sw0VarArr[1];
                        if (sw0Var2 != null) {
                            sw0Var2.e(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f27878r + this.f27877n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f27881x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f27881x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f27881x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f27878r);
                            return;
                        }
                        return;
                    } else if (wz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f27878r * (1.0f - f11);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.f27877n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        t5 t5Var = wz0Var.e;
                        if (t5Var != null) {
                            imageReceiver = t5Var.f32852k;
                        } else {
                            imageReceiver = wz0Var.f34984a;
                        }
                        g(imageReceiver, beginRecording2, f17, f10);
                        if (wz0Var.f45595a0 && wz0Var.V > 0.0f) {
                            g(wz0Var.U, beginRecording2, f17, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, wz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                }
                f13 = 1.0f;
                if (wz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f27873a = false;
                    setLayerType(1, this.f27876f[0]);
                    setLayerType(1, this.f27876f[1]);
                } else {
                    return;
                }
            } else {
                f13 = 1.0f;
            }
            bi0 bi0Var = this.I;
            if (bi0Var != null) {
                bi0Var.i();
            }
            ui0 ui0Var = this.J;
            if (ui0Var != null) {
                ui0Var.c();
            }
            if (this.H || this.G || this.F || (this.f27876f[0].getShader() == null && this.f27876f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ti0.f33088a;
                    dispatchQueue.cancelRunnable(this.f27879s);
                    dispatchQueue.postRunnable(this.f27879s);
                }
            }
            if (this.f27876f[0].getShader() != null || this.f27876f[1].getShader() != null) {
                synchronized (this.f27874b) {
                    try {
                        float f19 = f7 / this.f27882y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f27877n / f19;
                        if (this.f27876f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f27881x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(f13, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            c10 = 1;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.f27882y, f21 + f20, this.f27876f[0]);
                            canvas.restore();
                            this.f27876f[0].setAlpha((int) (f12 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f11, this.f27882y, f22, this.f27876f[0]);
                            this.f27876f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            c10 = 1;
                            f14 = 2.0f;
                        }
                        if (this.f27881x != 0 && this.f27876f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f27881x) + f7) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.f27882y, f23 + f20, this.f27876f[c10]);
                            canvas.restore();
                            this.f27876f[c10].setAlpha((int) (f12 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f11, this.f27882y, f24, this.f27876f[c10]);
                            this.f27876f[c10].setAlpha(255);
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
        si0 si0Var = this.f27875c[i10];
        if (view != null && !si0Var.e) {
            Canvas canvas = si0Var.f32571a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f27878r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            si0Var.f32574f = true;
        }
        if (i10 != 0 && (this.f27881x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof sw0;
        sw0[] sw0VarArr = this.N;
        if (z10) {
            sw0VarArr[i10] = (sw0) view;
        } else {
            sw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f27880w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f27878r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f27878r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof sw0;
        sw0[] sw0VarArr = this.N;
        if (z10) {
            sw0 sw0Var = (sw0) E;
            sw0VarArr[i10] = sw0Var;
            sw0Var.e(this.v);
            return;
        }
        sw0VarArr[i10] = null;
    }

    public final void j() {
        BlendMode blendMode;
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f27878r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27878r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.L;
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(createBlurEffect, createShaderEffect, blendMode));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f27878r + this.f27877n);
    }

    public void setActionsView(bi0 bi0Var) {
        this.I = bi0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f27873a) {
            invalidate();
        }
    }

    public void setMusicView(ui0 ui0Var) {
        this.J = ui0Var;
    }

    public void setSize(int i10) {
        if (this.f27877n != i10) {
            invalidate();
        }
        this.f27877n = i10;
        this.f27878r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ni0 ni0Var) {
        e();
        this.h = ni0Var;
        this.f27880w = ni0Var.getCurrentItem();
        this.f27881x = 0;
        ni0Var.b(this.P);
    }

    public void setSuggestionView(vi0 vi0Var) {
    }
}
