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
    public final kw0[] N;
    public final d6 O;
    public final ci.w5 P;
    public boolean f26051a;
    public final Object f26052b;
    public final si0[] f26053c;
    public final si0[] d;
    public volatile boolean e;
    public final Paint[] f26054f;
    public ni0 h;
    public int f26055n;
    public int f26056r;
    public final di0 f26057s;
    public final di0 v;
    public int f26058w;
    public int f26059x;
    public int f26060y;

    public ei0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26051a = z10;
        this.f26052b = new Object();
        this.f26053c = new si0[3];
        this.d = new si0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f26054f = paintArr;
        this.f26057s = new di0(this, 0);
        this.v = new di0(this, 1);
        this.f26058w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new kw0[3];
        d6 d6Var = new d6(this, 0L, 350L, zr.f33337f);
        this.O = d6Var;
        this.P = new ci.w5(this, 3);
        d6Var.d(1.0f, true);
        boolean z11 = this.f26051a & SharedConfig.useNewBlur;
        this.f26051a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(ei0 ei0Var, int i10, int i11, int i12) {
        synchronized (ei0Var.f26052b) {
            try {
                si0[] si0VarArr = ei0Var.f26053c;
                si0 si0Var = si0VarArr[i10];
                si0VarArr[i10] = si0VarArr[i11];
                si0VarArr[i11] = si0Var;
                si0[] si0VarArr2 = ei0Var.d;
                si0 si0Var2 = si0VarArr2[i10];
                si0VarArr2[i10] = si0VarArr2[i11];
                si0VarArr2[i11] = si0Var2;
                if (i10 == 2) {
                    if (si0Var2.f30522f) {
                        ei0Var.b(si0Var2.f30520b, i11);
                    }
                } else {
                    Paint[] paintArr = ei0Var.f26054f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    ei0Var.f26054f[i12].setShader(null);
                    si0 si0Var3 = ei0Var.f26053c[i12];
                    if (si0Var3 != null && !si0Var3.e && !si0Var3.d) {
                        si0Var3.f30522f = false;
                        si0Var3.f30520b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f26056r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f26056r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f26054f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.rz0 rz0Var, float f10, float f11) {
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
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f26055n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        bi0 bi0Var2 = this.I;
        if (bi0Var2 != null) {
            if (rz0Var != null) {
                bi0Var2.f25018w = this.M;
                bi0Var2.f25016r = rz0Var;
                bi0Var2.f25017s = renderNodeScale / f10;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            } else {
                bi0Var2.f25018w = this.M;
                bi0Var2.f25016r = null;
                bi0Var2.f25017s = renderNodeScale;
                bi0Var2.v = -f11;
                bi0Var2.invalidate();
            }
        }
        ui0 ui0Var2 = this.J;
        if (ui0Var2 != null) {
            if (rz0Var != null) {
                ui0Var2.d(this.M, rz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
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
            ci.w5 w5Var = this.P;
            ArrayList arrayList = ni0Var.f51161k0;
            if (arrayList != null) {
                arrayList.remove(w5Var);
            }
            this.h = null;
        }
        this.e = false;
        ti0.f30849a.cancelRunnable(this.f26057s);
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
        synchronized (this.f26052b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    si0 si0Var = this.f26053c[i10];
                    if (si0Var != null) {
                        si0Var.a();
                        this.f26053c[i10] = null;
                    }
                    si0 si0Var2 = this.d[i10];
                    if (si0Var2 != null) {
                        si0Var2.a();
                        this.d[i10] = null;
                    }
                    kw0 kw0Var = this.N[i10];
                    if (kw0Var != null) {
                        kw0Var.f(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f26054f[0].setShader(null);
            this.f26054f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.rz0 rz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        ni0 ni0Var = this.h;
        if (ni0Var != null && ni0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f26051a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (rz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        kw0[] kw0VarArr = this.N;
                        kw0 kw0Var = kw0VarArr[0];
                        if (kw0Var != null) {
                            kw0Var.f(null);
                        }
                        kw0 kw0Var2 = kw0VarArr[1];
                        if (kw0Var2 != null) {
                            kw0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f26056r + this.f26055n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f26059x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f26059x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f26059x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f26056r);
                            return;
                        }
                        return;
                    } else if (rz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f26056r * (1.0f - f11);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.f26055n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        p5 p5Var = rz0Var.e;
                        if (p5Var != null) {
                            imageReceiver = p5Var.f29484k;
                        } else {
                            imageReceiver = rz0Var.f31064a;
                        }
                        g(imageReceiver, beginRecording2, f17, f10);
                        if (rz0Var.f41257a0 && rz0Var.V > 0.0f) {
                            g(rz0Var.U, beginRecording2, f17, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f17);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, rz0Var, measuredWidth, f16);
                        return;
                    } else {
                        return;
                    }
                }
                f13 = 1.0f;
                if (rz0Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f26051a = false;
                    setLayerType(1, this.f26054f[0]);
                    setLayerType(1, this.f26054f[1]);
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
            if (this.H || this.G || this.F || (this.f26054f[0].getShader() == null && this.f26054f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ti0.f30849a;
                    dispatchQueue.cancelRunnable(this.f26057s);
                    dispatchQueue.postRunnable(this.f26057s);
                }
            }
            if (this.f26054f[0].getShader() != null || this.f26054f[1].getShader() != null) {
                synchronized (this.f26052b) {
                    try {
                        float f19 = f7 / this.f26060y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f26055n / f19;
                        if (this.f26054f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f26059x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(f13, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            c10 = 1;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.f26060y, f21 + f20, this.f26054f[0]);
                            canvas.restore();
                            this.f26054f[0].setAlpha((int) (f12 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f11, this.f26060y, f22, this.f26054f[0]);
                            this.f26054f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            c10 = 1;
                            f14 = 2.0f;
                        }
                        if (this.f26059x != 0 && this.f26054f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f26059x) + f7) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.f26060y, f23 + f20, this.f26054f[c10]);
                            canvas.restore();
                            this.f26054f[c10].setAlpha((int) (f12 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f11, this.f26060y, f24, this.f26054f[c10]);
                            this.f26054f[c10].setAlpha(255);
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
        si0 si0Var = this.f26053c[i10];
        if (view != null && !si0Var.e) {
            Canvas canvas = si0Var.f30519a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f26056r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            si0Var.f30522f = true;
        }
        if (i10 != 0 && (this.f26059x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof kw0;
        kw0[] kw0VarArr = this.N;
        if (z10) {
            kw0VarArr[i10] = (kw0) view;
        } else {
            kw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f26058w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f26056r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f26056r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof kw0;
        kw0[] kw0VarArr = this.N;
        if (z10) {
            kw0 kw0Var = (kw0) E;
            kw0VarArr[i10] = kw0Var;
            kw0Var.f(this.v);
            return;
        }
        kw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f26056r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f26056r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f26056r + this.f26055n);
    }

    public void setActionsView(bi0 bi0Var) {
        this.I = bi0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f26051a) {
            invalidate();
        }
    }

    public void setMusicView(ui0 ui0Var) {
        this.J = ui0Var;
    }

    public void setSize(int i10) {
        if (this.f26055n != i10) {
            invalidate();
        }
        this.f26055n = i10;
        this.f26056r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ni0 ni0Var) {
        e();
        this.h = ni0Var;
        this.f26058w = ni0Var.getCurrentItem();
        this.f26059x = 0;
        ni0Var.b(this.P);
    }

    public void setSuggestionView(vi0 vi0Var) {
    }
}
