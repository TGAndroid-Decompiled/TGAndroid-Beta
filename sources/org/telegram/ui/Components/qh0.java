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
public final class qh0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public oh0 I;
    public gi0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final yv0[] N;
    public final e6 O;
    public final ai.m7 P;
    public boolean f27604a;
    public final Object f27605b;
    public final ei0[] f27606c;
    public final ei0[] d;
    public volatile boolean e;
    public final Paint[] f27607f;
    public zh0 h;
    public int f27608n;
    public int f27609r;
    public final ph0 f27610s;
    public final ph0 v;
    public int f27611w;
    public int f27612x;
    public int f27613y;

    public qh0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27604a = z10;
        this.f27605b = new Object();
        this.f27606c = new ei0[3];
        this.d = new ei0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f27607f = paintArr;
        this.f27610s = new ph0(this, 0);
        this.v = new ph0(this, 1);
        this.f27611w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new yv0[3];
        e6 e6Var = new e6(this, 0L, 350L, qr.f27715f);
        this.O = e6Var;
        this.P = new ai.m7(this, 3);
        e6Var.d(1.0f, true);
        boolean z11 = this.f27604a & SharedConfig.useNewBlur;
        this.f27604a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(qh0 qh0Var, int i10, int i11, int i12) {
        synchronized (qh0Var.f27605b) {
            try {
                ei0[] ei0VarArr = qh0Var.f27606c;
                ei0 ei0Var = ei0VarArr[i10];
                ei0VarArr[i10] = ei0VarArr[i11];
                ei0VarArr[i11] = ei0Var;
                ei0[] ei0VarArr2 = qh0Var.d;
                ei0 ei0Var2 = ei0VarArr2[i10];
                ei0VarArr2[i10] = ei0VarArr2[i11];
                ei0VarArr2[i11] = ei0Var2;
                if (i10 == 2) {
                    if (ei0Var2.f23887f) {
                        qh0Var.b(ei0Var2.f23885b, i11);
                    }
                } else {
                    Paint[] paintArr = qh0Var.f27607f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    qh0Var.f27607f[i12].setShader(null);
                    ei0 ei0Var3 = qh0Var.f27606c[i12];
                    if (ei0Var3 != null && !ei0Var3.e && !ei0Var3.d) {
                        ei0Var3.f23887f = false;
                        ei0Var3.f23885b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27609r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f27609r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f27607f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
        }
    }

    public final void c(float f7, org.telegram.ui.m01 m01Var, float f10, float f11) {
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
            oh0 oh0Var = this.I;
            if (oh0Var != null) {
                oh0Var.i();
            }
            gi0 gi0Var = this.J;
            if (gi0Var != null) {
                gi0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) ((this.f27608n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        oh0 oh0Var2 = this.I;
        if (oh0Var2 != null) {
            if (m01Var != null) {
                oh0Var2.f26947w = this.M;
                oh0Var2.f26945r = m01Var;
                oh0Var2.f26946s = renderNodeScale / f10;
                oh0Var2.v = -f11;
                oh0Var2.invalidate();
            } else {
                oh0Var2.f26947w = this.M;
                oh0Var2.f26945r = null;
                oh0Var2.f26946s = renderNodeScale;
                oh0Var2.v = -f11;
                oh0Var2.invalidate();
            }
        }
        gi0 gi0Var2 = this.J;
        if (gi0Var2 != null) {
            if (m01Var != null) {
                gi0Var2.I = this.M;
                gi0Var2.J = renderNodeScale / f10;
                gi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
                gi0Var2.invalidate();
                return;
            }
            gi0Var2.I = this.M;
            gi0Var2.J = renderNodeScale;
            gi0Var2.K = (-f11) + AndroidUtilities.dp(22.0f);
            gi0Var2.invalidate();
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qh0.d():boolean");
    }

    public final void e() {
        zh0 zh0Var = this.h;
        if (zh0Var != null) {
            ai.m7 m7Var = this.P;
            ArrayList arrayList = zh0Var.f48393k0;
            if (arrayList != null) {
                arrayList.remove(m7Var);
            }
            this.h = null;
        }
        this.e = false;
        fi0.f24172a.cancelRunnable(this.f27610s);
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
        synchronized (this.f27605b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    ei0 ei0Var = this.f27606c[i10];
                    if (ei0Var != null) {
                        ei0Var.a();
                        this.f27606c[i10] = null;
                    }
                    ei0 ei0Var2 = this.d[i10];
                    if (ei0Var2 != null) {
                        ei0Var2.a();
                        this.d[i10] = null;
                    }
                    yv0 yv0Var = this.N[i10];
                    if (yv0Var != null) {
                        yv0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f27607f[0].setShader(null);
            this.f27607f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.m01 m01Var, float f7, float f10, boolean z10, float f11, float f12) {
        int i10;
        float f13;
        char c10;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        zh0 zh0Var = this.h;
        if (zh0Var != null && zh0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f27604a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (m01Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        yv0[] yv0VarArr = this.N;
                        yv0 yv0Var = yv0VarArr[0];
                        if (yv0Var != null) {
                            yv0Var.g(null);
                        }
                        yv0 yv0Var2 = yv0VarArr[1];
                        if (yv0Var2 != null) {
                            yv0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale), (int) ((this.f27609r + this.f27608n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f14 = 1.0f / renderNodeScale;
                        beginRecording.scale(f14, f14);
                        beginRecording.save();
                        beginRecording.translate(-this.f27612x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f27612x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f27612x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f27609r);
                            return;
                        }
                        return;
                    } else if (m01Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f15 = this.f27609r * (1.0f - f11);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) (f7 / renderNodeScale2), (int) ((this.f27608n + f15) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f17 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f17, f17);
                        q5 q5Var = m01Var.e;
                        if (q5Var != null) {
                            imageReceiver = q5Var.f27461k;
                        } else {
                            imageReceiver = m01Var.f29987a;
                        }
                        g(imageReceiver, beginRecording2, f16, f10);
                        if (m01Var.f35487a0 && m01Var.V > 0.0f) {
                            g(m01Var.U, beginRecording2, f16, f10);
                        }
                        this.L.endRecording();
                        this.L.setAlpha(f12);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale2, renderNodeScale2);
                        canvas2.drawRenderNode(this.L);
                        c(f7, m01Var, measuredWidth, f15);
                        return;
                    } else {
                        return;
                    }
                } else if (m01Var == null && !AndroidUtilities.makingGlobalBlurBitmap) {
                    this.f27604a = false;
                    setLayerType(1, this.f27607f[0]);
                    setLayerType(1, this.f27607f[1]);
                } else {
                    return;
                }
            }
            oh0 oh0Var = this.I;
            if (oh0Var != null) {
                oh0Var.i();
            }
            gi0 gi0Var = this.J;
            if (gi0Var != null) {
                gi0Var.b();
            }
            if (this.H || this.G || this.F || (this.f27607f[0].getShader() == null && this.f27607f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = fi0.f24172a;
                    dispatchQueue.cancelRunnable(this.f27610s);
                    dispatchQueue.postRunnable(this.f27610s);
                }
            }
            if (this.f27607f[0].getShader() != null || this.f27607f[1].getShader() != null) {
                synchronized (this.f27605b) {
                    try {
                        float f18 = f7 / this.f27613y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f18) * this.E);
                        }
                        canvas2.scale(f18, f18);
                        float f19 = this.f27608n / f18;
                        if (this.f27607f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f27612x) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, 2.0f, 0.0f, this.E);
                            float f20 = this.E;
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                            canvas2.drawRect(0.0f, f20, this.f27613y, f20 + f19, this.f27607f[0]);
                            canvas.restore();
                            this.f27607f[0].setAlpha((int) (f12 * 255.0f));
                            float f21 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f21 * f11, this.f27613y, f21, this.f27607f[0]);
                            this.f27607f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            i10 = 255;
                            f13 = 2.0f;
                            c10 = 1;
                        }
                        if (this.f27612x != 0 && this.f27607f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f27612x) + f7) / f18, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f13, 0.0f, this.E);
                            float f22 = this.E;
                            canvas2.drawRect(0.0f, f22, this.f27613y, f22 + f19, this.f27607f[c10]);
                            canvas.restore();
                            this.f27607f[c10].setAlpha((int) (f12 * 255.0f));
                            float f23 = this.E;
                            canvas.drawRect(0.0f, f23 * f11, this.f27613y, f23, this.f27607f[c10]);
                            this.f27607f[c10].setAlpha(i10);
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
        ei0 ei0Var = this.f27606c[i10];
        if (view != null && !ei0Var.e) {
            Canvas canvas = ei0Var.f23884a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f27609r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            ei0Var.f23887f = true;
        }
        if (i10 != 0 && (this.f27612x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof yv0;
        yv0[] yv0VarArr = this.N;
        if (z10) {
            yv0VarArr[i10] = (yv0) view;
        } else {
            yv0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f27611w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f27609r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f27609r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof yv0;
        yv0[] yv0VarArr = this.N;
        if (z10) {
            yv0 yv0Var = (yv0) E;
            yv0VarArr[i10] = yv0Var;
            yv0Var.g(this.v);
            return;
        }
        yv0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f27609r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f27609r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f27609r + this.f27608n);
    }

    public void setActionsView(oh0 oh0Var) {
        this.I = oh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f27604a) {
            invalidate();
        }
    }

    public void setMusicView(gi0 gi0Var) {
        this.J = gi0Var;
    }

    public void setSize(int i10) {
        if (this.f27608n != i10) {
            invalidate();
        }
        this.f27608n = i10;
        this.f27609r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(zh0 zh0Var) {
        e();
        this.h = zh0Var;
        this.f27611w = zh0Var.getCurrentItem();
        this.f27612x = 0;
        zh0Var.b(this.P);
    }

    public void setSuggestionView(hi0 hi0Var) {
    }
}
