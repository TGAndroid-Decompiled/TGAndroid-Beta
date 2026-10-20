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
public final class ci0 extends View {
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public zh0 I;
    public si0 J;
    public boolean K;
    public RenderNode L;
    public RenderNode M;
    public final iw0[] N;
    public final f6 O;
    public final ci.x5 P;
    public boolean f25195a;
    public final Object f25196b;
    public final qi0[] f25197c;
    public final qi0[] d;
    public volatile boolean e;
    public final Paint[] f25198f;
    public li0 h;
    public int f25199n;
    public int f25200r;
    public final bi0 f25201s;
    public final bi0 v;
    public int f25202w;
    public int f25203x;
    public int f25204y;

    public ci0(Context context) {
        super(context);
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25195a = z10;
        this.f25196b = new Object();
        this.f25197c = new qi0[3];
        this.d = new qi0[3];
        this.e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f25198f = paintArr;
        this.f25201s = new bi0(this, 0);
        this.v = new bi0(this, 1);
        this.f25202w = -1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.N = new iw0[3];
        f6 f6Var = new f6(this, 0L, 350L, bs.f25021f);
        this.O = f6Var;
        this.P = new ci.x5(this, 3);
        f6Var.d(1.0f, true);
        boolean z11 = this.f25195a & SharedConfig.useNewBlur;
        this.f25195a = z11;
        if (z11) {
            setLayerType(2, null);
            return;
        }
        setLayerType(1, paintArr[0]);
        setLayerType(1, paintArr[1]);
    }

    public static void a(ci0 ci0Var, int i10, int i11, int i12) {
        synchronized (ci0Var.f25196b) {
            try {
                qi0[] qi0VarArr = ci0Var.f25197c;
                qi0 qi0Var = qi0VarArr[i10];
                qi0VarArr[i10] = qi0VarArr[i11];
                qi0VarArr[i11] = qi0Var;
                qi0[] qi0VarArr2 = ci0Var.d;
                qi0 qi0Var2 = qi0VarArr2[i10];
                qi0VarArr2[i10] = qi0VarArr2[i11];
                qi0VarArr2[i11] = qi0Var2;
                if (i10 == 2) {
                    if (qi0Var2.f29611f) {
                        ci0Var.b(qi0Var2.f29609b, i11);
                    }
                } else {
                    Paint[] paintArr = ci0Var.f25198f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                }
                if (i12 != -1) {
                    ci0Var.f25198f[i12].setShader(null);
                    qi0 qi0Var3 = ci0Var.f25197c[i12];
                    if (qi0Var3 != null && !qi0Var3.e && !qi0Var3.d) {
                        qi0Var3.f29611f = false;
                        qi0Var3.f29609b.eraseColor(0);
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
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f25200r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f25200r}, Shader.TileMode.CLAMP);
            Shader.TileMode tileMode = Shader.TileMode.MIRROR;
            this.f25198f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
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
            zh0 zh0Var = this.I;
            if (zh0Var != null) {
                zh0Var.i();
            }
            si0 si0Var = this.J;
            if (si0Var != null) {
                si0Var.c();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f10 * 8.0f;
        this.M.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f25199n + f11) / renderNodeScale));
        RecordingCanvas beginRecording = this.M.beginRecording();
        beginRecording.scale(0.125f, 0.125f);
        beginRecording.drawRenderNode(this.L);
        this.M.endRecording();
        this.M.setAlpha(this.O.d(1.0f, false));
        zh0 zh0Var2 = this.I;
        if (zh0Var2 != null) {
            if (oz0Var != null) {
                zh0Var2.f32912w = this.M;
                zh0Var2.f32910r = oz0Var;
                zh0Var2.f32911s = renderNodeScale / f10;
                zh0Var2.v = -f11;
                zh0Var2.invalidate();
            } else {
                zh0Var2.f32912w = this.M;
                zh0Var2.f32910r = null;
                zh0Var2.f32911s = renderNodeScale;
                zh0Var2.v = -f11;
                zh0Var2.invalidate();
            }
        }
        si0 si0Var2 = this.J;
        if (si0Var2 != null) {
            if (oz0Var != null) {
                si0Var2.d(this.M, oz0Var, renderNodeScale / f10, (-f11) + AndroidUtilities.dp(22.0f));
            } else {
                si0Var2.d(this.M, null, renderNodeScale, (-f11) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ci0.d():boolean");
    }

    public final void e() {
        li0 li0Var = this.h;
        if (li0Var != null) {
            ci.x5 x5Var = this.P;
            ArrayList arrayList = li0Var.f50697k0;
            if (arrayList != null) {
                arrayList.remove(x5Var);
            }
            this.h = null;
        }
        this.e = false;
        ri0.f29936a.cancelRunnable(this.f25201s);
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
        synchronized (this.f25196b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    qi0 qi0Var = this.f25197c[i10];
                    if (qi0Var != null) {
                        qi0Var.a();
                        this.f25197c[i10] = null;
                    }
                    qi0 qi0Var2 = this.d[i10];
                    if (qi0Var2 != null) {
                        qi0Var2.a();
                        this.d[i10] = null;
                    }
                    iw0 iw0Var = this.N[i10];
                    if (iw0Var != null) {
                        iw0Var.g(null);
                        this.N[i10] = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f25198f[0].setShader(null);
            this.f25198f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.oz0 oz0Var, float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        char c10;
        float f14;
        ImageReceiver imageReceiver;
        Canvas canvas2 = canvas;
        li0 li0Var = this.h;
        if (li0Var != null && li0Var.isAttachedToWindow() && this.h.getVisibility() != 8) {
            if (this.f25195a && Build.VERSION.SDK_INT >= 31) {
                if (canvas2.isHardwareAccelerated()) {
                    if (oz0Var == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                        j();
                        iw0[] iw0VarArr = this.N;
                        iw0 iw0Var = iw0VarArr[0];
                        if (iw0Var != null) {
                            iw0Var.g(null);
                        }
                        iw0 iw0Var2 = iw0VarArr[1];
                        if (iw0Var2 != null) {
                            iw0Var2.g(null);
                        }
                        float renderNodeScale = getRenderNodeScale();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale), (int) Math.ceil((this.f25200r + this.f25199n) / renderNodeScale));
                        RecordingCanvas beginRecording = this.L.beginRecording();
                        float f15 = 1.0f / renderNodeScale;
                        beginRecording.scale(f15, f15);
                        beginRecording.save();
                        beginRecording.translate(-this.f25203x, 0.0f);
                        i(beginRecording, 0);
                        beginRecording.restore();
                        if (this.f25203x != 0) {
                            beginRecording.save();
                            beginRecording.translate((-this.f25203x) + f7, 0.0f);
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
                            c(f7, null, 1.0f, this.f25200r);
                            return;
                        }
                        return;
                    } else if (oz0Var != null) {
                        float measuredWidth = f7 / this.h.getMeasuredWidth();
                        float f16 = this.f25200r * (1.0f - f11);
                        float f17 = f16 * measuredWidth;
                        float renderNodeScale2 = getRenderNodeScale() * measuredWidth;
                        j();
                        this.L.setPosition(0, 0, (int) Math.ceil(f7 / renderNodeScale2), (int) Math.ceil((this.f25199n + f16) / renderNodeScale2));
                        RecordingCanvas beginRecording2 = this.L.beginRecording();
                        float f18 = 1.0f / renderNodeScale2;
                        beginRecording2.scale(f18, f18);
                        r5 r5Var = oz0Var.e;
                        if (r5Var != null) {
                            imageReceiver = r5Var.f29837k;
                        } else {
                            imageReceiver = oz0Var.f31992a;
                        }
                        g(imageReceiver, beginRecording2, f17, f10);
                        if (oz0Var.f40015a0 && oz0Var.V > 0.0f) {
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
                    this.f25195a = false;
                    setLayerType(1, this.f25198f[0]);
                    setLayerType(1, this.f25198f[1]);
                } else {
                    return;
                }
            } else {
                f13 = 1.0f;
            }
            zh0 zh0Var = this.I;
            if (zh0Var != null) {
                zh0Var.i();
            }
            si0 si0Var = this.J;
            if (si0Var != null) {
                si0Var.c();
            }
            if (this.H || this.G || this.F || (this.f25198f[0].getShader() == null && this.f25198f[1].getShader() == null && !this.e)) {
                boolean d = d();
                if (!this.e && d) {
                    this.e = true;
                    DispatchQueue dispatchQueue = ri0.f29936a;
                    dispatchQueue.cancelRunnable(this.f25201s);
                    dispatchQueue.postRunnable(this.f25201s);
                }
            }
            if (this.f25198f[0].getShader() != null || this.f25198f[1].getShader() != null) {
                synchronized (this.f25196b) {
                    try {
                        float f19 = f7 / this.f25204y;
                        if (z10) {
                            canvas2.translate(0.0f, (-f19) * this.E);
                        }
                        canvas2.scale(f19, f19);
                        float f20 = this.f25199n / f19;
                        if (this.f25198f[0].getShader() != null) {
                            canvas2.save();
                            canvas2.translate((-this.f25203x) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(f13, 2.0f, 0.0f, this.E);
                            float f21 = this.E;
                            c10 = 1;
                            f14 = 2.0f;
                            canvas2.drawRect(0.0f, f21, this.f25204y, f21 + f20, this.f25198f[0]);
                            canvas.restore();
                            this.f25198f[0].setAlpha((int) (f12 * 255.0f));
                            float f22 = this.E;
                            canvas2 = canvas;
                            canvas2.drawRect(0.0f, f22 * f11, this.f25204y, f22, this.f25198f[0]);
                            this.f25198f[0].setAlpha(255);
                            canvas2.restore();
                        } else {
                            c10 = 1;
                            f14 = 2.0f;
                        }
                        if (this.f25203x != 0 && this.f25198f[c10].getShader() != null) {
                            canvas2.save();
                            canvas2.translate(((-this.f25203x) + f7) / f19, 0.0f);
                            canvas2.save();
                            canvas2.scale(1.0f, f14, 0.0f, this.E);
                            float f23 = this.E;
                            canvas2.drawRect(0.0f, f23, this.f25204y, f23 + f20, this.f25198f[c10]);
                            canvas.restore();
                            this.f25198f[c10].setAlpha((int) (f12 * 255.0f));
                            float f24 = this.E;
                            canvas.drawRect(0.0f, f24 * f11, this.f25204y, f24, this.f25198f[c10]);
                            this.f25198f[c10].setAlpha(255);
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
        qi0 qi0Var = this.f25197c[i10];
        if (view != null && !qi0Var.e) {
            Canvas canvas = qi0Var.f29608a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f25200r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            qi0Var.f29611f = true;
        }
        if (i10 != 0 && (this.f25203x == 0 || i10 != 1)) {
            return;
        }
        boolean z10 = view instanceof iw0;
        iw0[] iw0VarArr = this.N;
        if (z10) {
            iw0VarArr[i10] = (iw0) view;
        } else {
            iw0VarArr[i10] = null;
        }
    }

    public final void i(Canvas canvas, int i10) {
        View E = this.h.E(this.f25202w + i10);
        if (E != null) {
            int measuredHeight = E.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f25200r - measuredHeight);
            E.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f25200r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            E.draw(canvas);
            canvas.restore();
        }
        boolean z10 = E instanceof iw0;
        iw0[] iw0VarArr = this.N;
        if (z10) {
            iw0 iw0Var = (iw0) E;
            iw0VarArr[i10] = iw0Var;
            iw0Var.g(this.v);
            return;
        }
        iw0VarArr[i10] = null;
    }

    public final void j() {
        if (this.L == null) {
            float renderNodeScale = getRenderNodeScale();
            this.L = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f25200r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f25200r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
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
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f25200r + this.f25199n);
    }

    public void setActionsView(zh0 zh0Var) {
        this.I = zh0Var;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        if (f7 != 0.0f && this.f25195a) {
            invalidate();
        }
    }

    public void setMusicView(si0 si0Var) {
        this.J = si0Var;
    }

    public void setSize(int i10) {
        if (this.f25199n != i10) {
            invalidate();
        }
        this.f25199n = i10;
        this.f25200r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(li0 li0Var) {
        e();
        this.h = li0Var;
        this.f25202w = li0Var.getCurrentItem();
        this.f25203x = 0;
        li0Var.b(this.P);
    }

    public void setSuggestionView(ti0 ti0Var) {
    }
}
