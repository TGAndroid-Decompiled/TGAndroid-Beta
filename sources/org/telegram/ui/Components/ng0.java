package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
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
import org.telegram.messenger.ImageReceiver;
public final class ng0 extends View {
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public RenderNode I;
    public final su0[] J;
    public final t5 K;
    public final hc0 L;
    public boolean f28816a;
    public final Object f28817b;
    public final ah0[] f28818c;
    public final ah0[] d;
    public volatile boolean e;
    public final Paint[] f28819f;
    public vg0 h;
    public int f28820n;
    public int f28821r;
    public final mg0 f28822s;
    public final mg0 f28823w;
    public int f28824x;
    public int f28825y;

    public ng0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28816a = z10;
        this.f28817b = new Object();
        this.f28818c = new ah0[3];
        this.d = new ah0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f28819f = paintArr;
        this.f28822s = new mg0(this, 0);
        this.f28823w = new mg0(this, 1);
        this.f28824x = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.J = new su0[3];
        t5 t5Var = new t5(this, 0L, 350L, gr.f26523f);
        this.K = t5Var;
        this.L = new hc0(1, this);
        t5Var.e(true, 1.0f);
        boolean z11 = this.f28816a & org.telegram.messenger.uz.f18501a0;
        this.f28816a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(ng0 ng0Var, int i10, int i11, int i12) {
        synchronized (ng0Var.f28817b) {
            try {
                ah0[] ah0VarArr = ng0Var.f28818c;
                ah0 ah0Var = ah0VarArr[i10];
                ah0VarArr[i10] = ah0VarArr[i11];
                ah0VarArr[i11] = ah0Var;
                ah0[] ah0VarArr2 = ng0Var.d;
                ah0 ah0Var2 = ah0VarArr2[i10];
                ah0VarArr2[i10] = ah0VarArr2[i11];
                ah0VarArr2[i11] = ah0Var2;
                if (i10 == 2) {
                    if (ah0Var2.f24402f) {
                        ng0Var.b(ah0Var2.f24400b, i11);
                    }
                } else {
                    Paint[] paintArr = ng0Var.f28819f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    ng0Var.f28819f[i12].setShader(null);
                    ah0 ah0Var3 = ng0Var.f28818c[i12];
                    if (ah0Var3 != null && !ah0Var3.e && !ah0Var3.d) {
                        ah0Var3.f24402f = false;
                        ah0Var3.f24400b.eraseColor(0);
                    }
                }
            } finally {
            }
        }
    }

    public static void f(ImageReceiver imageReceiver, Canvas canvas, float f7, float f10) {
        if (imageReceiver == null) {
            return;
        }
        int i10 = imageReceiver.W0[0];
        imageReceiver.J0(0);
        canvas.save();
        canvas.translate(0.0f, f7 - f10);
        imageReceiver.h(canvas, null);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f10) - f7);
        canvas.scale(1.0f, 2.0f, 0.0f, f10);
        imageReceiver.h(canvas, null);
        canvas.restore();
        imageReceiver.J0(i10);
    }

    private float getBlurRadius() {
        int o10 = org.telegram.messenger.uz.o();
        if (o10 != 1) {
            if (o10 != 2) {
                return 8.0f;
            }
            return 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return org.telegram.messenger.i0.L(1.0f);
    }

    public final void b(Bitmap bitmap, int i10) {
        if (i10 < 2 && bitmap != null && !bitmap.isRecycled()) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28821r / 6.0f, new int[]{0, -1}, new float[]{0.0f, org.telegram.messenger.i0.N(56.0f) / this.f28821r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f28819f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final boolean c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ng0.c():boolean");
    }

    public final void d() {
        RenderNode renderNode;
        vg0 vg0Var = this.h;
        if (vg0Var != null) {
            hc0 hc0Var = this.L;
            ArrayList arrayList = vg0Var.f54626k0;
            if (arrayList != null) {
                arrayList.remove(hc0Var);
            }
            this.h = null;
        }
        this.e = false;
        bh0.f24749a.cancelRunnable(this.f28822s);
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.I) != null) {
            renderNode.discardDisplayList();
            this.I = null;
        }
        synchronized (this.f28817b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ah0 ah0Var = this.f28818c[i10];
                    if (ah0Var != null) {
                        ah0Var.a();
                        this.f28818c[i10] = null;
                    }
                    ah0 ah0Var2 = this.d[i10];
                    if (ah0Var2 != null) {
                        ah0Var2.a();
                        this.d[i10] = null;
                    }
                    su0 su0Var = this.J[i10];
                    if (su0Var != null) {
                        su0Var.f(null);
                        this.J[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f28819f[0].setShader(null);
            this.f28819f[1].setShader(null);
        }
    }

    public final void e(Canvas canvas, org.telegram.ui.ix0 ix0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        vg0 vg0Var = this.h;
        if (vg0Var != null && vg0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f28816a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (ix0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        i();
                        su0[] su0VarArr = this.J;
                        su0 su0Var = su0VarArr[0];
                        if (su0Var != null) {
                            su0Var.f(null);
                        }
                        su0 su0Var2 = su0VarArr[1];
                        if (su0Var2 != null) {
                            su0Var2.f(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.I.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f28821r + this.f28820n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.I.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f28825y, 0.0f);
                        h(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f28825y != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f28825y) + f7, 0.0f);
                            h(beginRecording, 1);
                            beginRecording.restore();
                        }
                        this.I.endRecording();
                        this.I.setAlpha(this.K.e(false, 1.0f));
                        canvas2.save();
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.I);
                        canvas2.restore();
                        return;
                    } else if (ix0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f28821r * (1.0f - f11) * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        i();
                        this.I.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((f14 + this.f28820n) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.I.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        f5 f5Var = ix0Var.e;
                        if (f5Var != null) {
                            imageReceiver = f5Var.f26070k;
                        } else {
                            imageReceiver = ix0Var.f26357a;
                        }
                        f(imageReceiver, beginRecording2, f16, f10);
                        if (ix0Var.f38206a0 && ix0Var.V > 0.0f) {
                            f(ix0Var.U, beginRecording2, f16, f10);
                        }
                        this.I.endRecording();
                        this.I.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.I);
                        return;
                    } else {
                        return;
                    }
                } else if (ix0Var == null && !org.telegram.messenger.i0.m0) {
                    this.f28816a = false;
                    setLayerType(1, this.f28819f[0]);
                    setLayerType(1, this.f28819f[1]);
                } else {
                    return;
                }
            }
            if (this.H || this.G || this.F || (this.f28819f[0].getShader() == null && this.f28819f[1].getShader() == null && !this.e)) {
                boolean c10 = c();
                if (!this.e && c10) {
                    this.e = true;
                    org.telegram.messenger.s5 s5Var = bh0.f24749a;
                    s5Var.cancelRunnable(this.f28822s);
                    s5Var.postRunnable(this.f28822s);
                }
            }
            if (this.f28819f[0].getShader() != null || this.f28819f[1].getShader() != null) {
                synchronized (this.f28817b) {
                    try {
                        float f18 = f7 / this.D;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f28820n / f18;
                        if (this.f28819f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f28825y) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            f13 = 2.0f;
                            canvas2.drawRect(0.0f, f20, this.D, f20 + f19, this.f28819f[0]);
                            canvas.restore();
                            this.f28819f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.D, f21, this.f28819f[0]);
                            this.f28819f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            f13 = 2.0f;
                        }
                        if (this.f28825y != 0 && this.f28819f[1].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f28825y) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.D, f22 + f19, this.f28819f[1]);
                            canvas.restore();
                            this.f28819f[1].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.D, f23, this.f28819f[1]);
                            this.f28819f[1].setAlpha(255);
                            canvas.restore();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public final void g(int i10, View view) {
        ah0 ah0Var = this.f28818c[i10];
        if (view != null && !ah0Var.e) {
            Canvas canvas = ah0Var.f24399a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f28821r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ah0Var.f24402f = true;
        }
        if (i10 != 0 && (this.f28825y == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof su0;
        su0[] su0VarArr = this.J;
        if (z10) {
            su0VarArr[i10] = (su0) view;
        } else {
            su0VarArr[i10] = null;
        }
    }

    public final void h(Canvas canvas, int i10) {
        View E = this.h.E(this.f28824x + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f28821r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f28821r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof su0;
        su0[] su0VarArr = this.J;
        if (z10) {
            su0 su0Var = (su0) E;
            su0VarArr[i10] = su0Var;
            su0Var.f(this.f28823w);
            return;
        }
        su0VarArr[i10] = null;
    }

    public final void i() {
        BlendMode blendMode;
        if (this.I == null) {
            float renderNodeScale = getRenderNodeScale();
            this.I = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, org.telegram.messenger.i0.N(56.0f) / this.f28821r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f28821r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.I;
            RenderEffect createBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode);
            RenderEffect createShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(createBlurEffect, createShaderEffect, blendMode));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f28821r + this.f28820n);
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f28816a) {
            invalidate();
        }
    }

    public void setSize(int i10) {
        if (this.f28820n != i10) {
            invalidate();
        }
        this.f28820n = i10;
        this.f28821r = (int) (org.telegram.messenger.i0.L(64.0f) * 1.5f);
    }

    public void setView(vg0 vg0Var) {
        d();
        this.h = vg0Var;
        this.f28824x = vg0Var.getCurrentItem();
        this.f28825y = 0;
        vg0Var.b(this.L);
    }
}
