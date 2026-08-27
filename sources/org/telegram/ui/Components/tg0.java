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

public final class tg0 extends View {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public rg0 E;
    public jh0 F;
    public boolean G;
    public RenderNode H;
    public RenderNode I;
    public final wu0[] J;
    public final y5 K;
    public final jh.f5 L;

    public boolean f32770a;

    public final Object f32771b;

    public final hh0[] f32772c;
    public final hh0[] d;

    public volatile boolean f32773e;

    public final Paint[] f32774f;
    public ch0 h;

    public int f32775n;

    public int f32776r;

    public final sg0 f32777s;
    public final sg0 v;

    public int f32778w;

    public int f32779x;

    public int f32780y;

    public tg0(Context context) {
        super(context);
        int i10 = 1;
        int i11 = 0;
        this.f32770a = Build.VERSION.SDK_INT >= 31;
        this.f32771b = new Object();
        this.f32772c = new hh0[3];
        this.d = new hh0[3];
        this.f32773e = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.f32774f = paintArr;
        this.f32777s = new sg0(this, i11);
        this.v = new sg0(this, i10);
        this.f32778w = -1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = new wu0[3];
        y5 y5Var = new y5(this, 0L, 350L, er.f28122f);
        this.K = y5Var;
        this.L = new jh.f5(2, this);
        y5Var.d(1.0f, true);
        boolean z10 = this.f32770a & SharedConfig.useNewBlur;
        this.f32770a = z10;
        if (z10) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    public static void a(tg0 tg0Var, int i10, int i11, int i12) {
        synchronized (tg0Var.f32771b) {
            try {
                hh0[] hh0VarArr = tg0Var.f32772c;
                hh0 hh0Var = hh0VarArr[i10];
                hh0VarArr[i10] = hh0VarArr[i11];
                hh0VarArr[i11] = hh0Var;
                hh0[] hh0VarArr2 = tg0Var.d;
                hh0 hh0Var2 = hh0VarArr2[i10];
                hh0VarArr2[i10] = hh0VarArr2[i11];
                hh0VarArr2[i11] = hh0Var2;
                if (i10 != 2) {
                    Paint[] paintArr = tg0Var.f32774f;
                    Paint paint = paintArr[i10];
                    paintArr[i10] = paintArr[i11];
                    paintArr[i11] = paint;
                } else if (hh0Var2.f29023f) {
                    tg0Var.b(hh0Var2.f29020b, i11);
                }
                if (i12 != -1) {
                    tg0Var.f32774f[i12].setShader(null);
                    hh0 hh0Var3 = tg0Var.f32772c[i12];
                    if (hh0Var3 != null && !hh0Var3.f29022e && !hh0Var3.d) {
                        hh0Var3.f29023f = false;
                        hh0Var3.f29020b.eraseColor(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
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
            return devicePerformanceClass != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return AndroidUtilities.dp(1.0f);
    }

    public final void b(Bitmap bitmap, int i10) {
        if (i10 >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f32776r / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.f32776r}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.f32774f[i10].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    public final void c(float f10, org.telegram.ui.iz0 iz0Var, float f11, float f12) {
        if (this.E == null && this.F == null) {
            this.G = false;
        } else {
            if (this.I == null) {
                this.I = new RenderNode("profileActionsBlurNode");
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.I.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.G = true;
        }
        if (!this.G) {
            rg0 rg0Var = this.E;
            if (rg0Var != null) {
                rg0Var.i();
            }
            jh0 jh0Var = this.F;
            if (jh0Var != null) {
                jh0Var.b();
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f11 * 8.0f;
        this.I.setPosition(0, 0, (int) Math.ceil(f10 / renderNodeScale), (int) ((this.f32775n + f12) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.I.beginRecording();
        recordingCanvasBeginRecording.scale(0.125f, 0.125f);
        recordingCanvasBeginRecording.drawRenderNode(this.H);
        this.I.endRecording();
        this.I.setAlpha(this.K.d(1.0f, false));
        rg0 rg0Var2 = this.E;
        if (rg0Var2 != null) {
            if (iz0Var != null) {
                rg0Var2.f32165w = this.I;
                rg0Var2.f32163r = iz0Var;
                rg0Var2.f32164s = renderNodeScale / f11;
                rg0Var2.v = -f12;
                rg0Var2.invalidate();
            } else {
                rg0Var2.f32165w = this.I;
                rg0Var2.f32163r = null;
                rg0Var2.f32164s = renderNodeScale;
                rg0Var2.v = -f12;
                rg0Var2.invalidate();
            }
        }
        jh0 jh0Var2 = this.F;
        if (jh0Var2 != null) {
            if (iz0Var == null) {
                RenderNode renderNode = this.I;
                float fDp = (-f12) + AndroidUtilities.dp(22.0f);
                jh0Var2.E = renderNode;
                jh0Var2.F = renderNodeScale;
                jh0Var2.G = fDp;
                jh0Var2.invalidate();
                return;
            }
            RenderNode renderNode2 = this.I;
            float f13 = renderNodeScale / f11;
            float fDp2 = (-f12) + AndroidUtilities.dp(22.0f);
            jh0Var2.E = renderNode2;
            jh0Var2.F = f13;
            jh0Var2.G = fDp2;
            jh0Var2.invalidate();
        }
    }

    public final boolean d() {
        org.telegram.ui.ou0 ou0Var;
        wu0[] wu0VarArr;
        ch0 ch0Var = this.h;
        boolean z10 = false;
        if (ch0Var != null && ((ou0Var = ch0Var.f27435d1) == null || !ou0Var.f41180n)) {
            int measuredWidth = (int) (ch0Var.getMeasuredWidth() / 6.0f);
            int i10 = (int) (this.f32776r / 6.0f);
            if (measuredWidth > 0 && i10 > 0) {
                this.f32780y = measuredWidth;
                this.A = i10;
                boolean z11 = this.C;
                hh0[] hh0VarArr = this.f32772c;
                int length = (!z11 || this.D) ? hh0VarArr.length : 1;
                this.C = false;
                this.D = false;
                int i11 = 0;
                while (true) {
                    wu0VarArr = this.J;
                    if (i11 >= length) {
                        break;
                    }
                    wu0 wu0Var = wu0VarArr[i11];
                    if (wu0Var != null) {
                        wu0Var.g(null);
                    }
                    hh0 hh0Var = hh0VarArr[i11];
                    if (hh0Var != null) {
                        Bitmap bitmap = hh0Var.f29020b;
                        if (hh0Var.d || bitmap.getWidth() != measuredWidth || bitmap.getHeight() != i10) {
                            if (hh0Var != null) {
                                hh0Var.a();
                            }
                            hh0 hh0Var2 = new hh0();
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                            hh0Var2.f29020b = bitmapCreateBitmap;
                            hh0Var2.f29019a = new Canvas(bitmapCreateBitmap);
                            hh0VarArr[i11] = hh0Var2;
                        }
                    } else {
                        if (hh0Var != null) {
                            hh0Var.a();
                        }
                        hh0 hh0Var3 = new hh0();
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth, i10, Bitmap.Config.ARGB_8888);
                        hh0Var3.f29020b = bitmapCreateBitmap2;
                        hh0Var3.f29019a = new Canvas(bitmapCreateBitmap2);
                        hh0VarArr[i11] = hh0Var3;
                    }
                    if (hh0VarArr[i11].f29022e) {
                        if (length == 1) {
                            this.C = true;
                        } else {
                            this.D = true;
                        }
                    }
                    i11++;
                }
                View viewE = this.h.E(this.f32778w);
                h(0, viewE);
                sg0 sg0Var = this.v;
                if (length == 1) {
                    wu0 wu0Var2 = wu0VarArr[0];
                    if (wu0Var2 != null) {
                        wu0Var2.g(sg0Var);
                    }
                    return !this.C;
                }
                View viewE2 = this.h.E(this.f32778w + 1);
                h(1, viewE2);
                if (this.f32779x == 0) {
                    h(2, this.h.E(this.f32778w - 1));
                }
                for (wu0 wu0Var3 : wu0VarArr) {
                    if (wu0Var3 != null) {
                        wu0Var3.g(sg0Var);
                    }
                }
                if ((viewE != null && wu0VarArr[0] == null) || (this.f32779x != 0 && viewE2 != null && wu0VarArr[1] == null)) {
                    z10 = true;
                }
                this.B = z10;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        ch0 ch0Var = this.h;
        if (ch0Var != null) {
            jh.f5 f5Var = this.L;
            ArrayList arrayList = ch0Var.f17572g0;
            if (arrayList != null) {
                arrayList.remove(f5Var);
            }
            this.h = null;
        }
        this.f32773e = false;
        ih0.f29367a.cancelRunnable(this.f32777s);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.H;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.H = null;
            }
            RenderNode renderNode2 = this.I;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.I = null;
            }
        }
        this.E = null;
        this.F = null;
        synchronized (this.f32771b) {
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    hh0 hh0Var = this.f32772c[i10];
                    if (hh0Var != null) {
                        hh0Var.a();
                        this.f32772c[i10] = null;
                    }
                    hh0 hh0Var2 = this.d[i10];
                    if (hh0Var2 != null) {
                        hh0Var2.a();
                        this.d[i10] = null;
                    }
                    wu0 wu0Var = this.J[i10];
                    if (wu0Var != null) {
                        wu0Var.g(null);
                        this.J[i10] = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f32774f[0].setShader(null);
            this.f32774f[1].setShader(null);
        }
    }

    public final void f(Canvas canvas, org.telegram.ui.iz0 iz0Var, float f10, float f11, boolean z10, float f12, float f13) {
        int i10;
        float f14;
        char c10;
        Canvas canvas2 = canvas;
        ch0 ch0Var = this.h;
        if (ch0Var == null || !ch0Var.isAttachedToWindow() || this.h.getVisibility() == 8) {
            return;
        }
        if (this.f32770a && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (iz0Var != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (iz0Var != null) {
                        float measuredWidth = f10 / this.h.getMeasuredWidth();
                        float f15 = this.f32776r * (1.0f - f12);
                        float f16 = f15 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        j();
                        this.H.setPosition(0, 0, (int) (f10 / renderNodeScale), (int) ((this.f32775n + f15) / renderNodeScale));
                        RecordingCanvas recordingCanvasBeginRecording = this.H.beginRecording();
                        float f17 = 1.0f / renderNodeScale;
                        recordingCanvasBeginRecording.scale(f17, f17);
                        k5 k5Var = iz0Var.f30901e;
                        g(k5Var != null ? k5Var.f29961k : iz0Var.f30898a, recordingCanvasBeginRecording, f16, f11);
                        if (iz0Var.T && iz0Var.R > 0.0f) {
                            g(iz0Var.Q, recordingCanvasBeginRecording, f16, f11);
                        }
                        this.H.endRecording();
                        this.H.setAlpha(f13);
                        canvas2.translate(0.0f, -f16);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.H);
                        c(f10, iz0Var, measuredWidth, f15);
                        return;
                    }
                    return;
                }
                j();
                wu0[] wu0VarArr = this.J;
                wu0 wu0Var = wu0VarArr[0];
                if (wu0Var != null) {
                    wu0Var.g(null);
                }
                wu0 wu0Var2 = wu0VarArr[1];
                if (wu0Var2 != null) {
                    wu0Var2.g(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.H.setPosition(0, 0, (int) (f10 / renderNodeScale2), (int) ((this.f32776r + this.f32775n) / renderNodeScale2));
                RecordingCanvas recordingCanvasBeginRecording2 = this.H.beginRecording();
                float f18 = 1.0f / renderNodeScale2;
                recordingCanvasBeginRecording2.scale(f18, f18);
                recordingCanvasBeginRecording2.save();
                recordingCanvasBeginRecording2.translate(-this.f32779x, 0.0f);
                i(recordingCanvasBeginRecording2, 0);
                recordingCanvasBeginRecording2.restore();
                if (this.f32779x != 0) {
                    recordingCanvasBeginRecording2.save();
                    recordingCanvasBeginRecording2.translate((-this.f32779x) + f10, 0.0f);
                    i(recordingCanvasBeginRecording2, 1);
                    recordingCanvasBeginRecording2.restore();
                }
                this.H.endRecording();
                this.H.setAlpha(this.K.d(1.0f, false));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.H);
                canvas2.restore();
                if (getVisibility() != 0 || getAlpha() <= 0.0f) {
                    return;
                }
                c(f10, null, 1.0f, this.f32776r);
                return;
            }
            if (iz0Var != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.f32770a = false;
            setLayerType(1, this.f32774f[0]);
            setLayerType(1, this.f32774f[1]);
        }
        rg0 rg0Var = this.E;
        if (rg0Var != null) {
            rg0Var.i();
        }
        jh0 jh0Var = this.F;
        if (jh0Var != null) {
            jh0Var.b();
        }
        if (this.D || this.C || this.B || (this.f32774f[0].getShader() == null && this.f32774f[1].getShader() == null && !this.f32773e)) {
            boolean zD = d();
            if (!this.f32773e && zD) {
                this.f32773e = true;
                DispatchQueue dispatchQueue = ih0.f29367a;
                dispatchQueue.cancelRunnable(this.f32777s);
                dispatchQueue.postRunnable(this.f32777s);
            }
        }
        if (this.f32774f[0].getShader() == null && this.f32774f[1].getShader() == null) {
            return;
        }
        synchronized (this.f32771b) {
            try {
                float f19 = f10 / this.f32780y;
                if (z10) {
                    canvas2.translate(0.0f, (-f19) * this.A);
                }
                canvas2.scale(f19, f19);
                float f20 = this.f32775n / f19;
                if (this.f32774f[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.f32779x) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.A);
                    float f21 = this.A;
                    i10 = 255;
                    f14 = 2.0f;
                    c10 = 1;
                    canvas2.drawRect(0.0f, f21, this.f32780y, f21 + f20, this.f32774f[0]);
                    canvas.restore();
                    this.f32774f[0].setAlpha((int) (f13 * 255.0f));
                    float f22 = this.A;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f22 * f12, this.f32780y, f22, this.f32774f[0]);
                    this.f32774f[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    i10 = 255;
                    f14 = 2.0f;
                    c10 = 1;
                }
                if (this.f32779x != 0 && this.f32774f[c10].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.f32779x) + f10) / f19, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f14, 0.0f, this.A);
                    float f23 = this.A;
                    canvas2.drawRect(0.0f, f23, this.f32780y, f23 + f20, this.f32774f[c10]);
                    canvas.restore();
                    this.f32774f[c10].setAlpha((int) (f13 * 255.0f));
                    float f24 = this.A;
                    canvas.drawRect(0.0f, f24 * f12, this.f32780y, f24, this.f32774f[c10]);
                    this.f32774f[c10].setAlpha(i10);
                    canvas.restore();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i10, View view) {
        hh0 hh0Var = this.f32772c[i10];
        if (view != 0 && !hh0Var.f29022e) {
            Canvas canvas = hh0Var.f29019a;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.f32776r - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            hh0Var.f29023f = true;
        }
        if (i10 == 0 || (this.f32779x != 0 && i10 == 1)) {
            boolean z10 = view instanceof wu0;
            wu0[] wu0VarArr = this.J;
            if (z10) {
                wu0VarArr[i10] = (wu0) view;
            } else {
                wu0VarArr[i10] = null;
            }
        }
    }

    public final void i(Canvas canvas, int i10) {
        View viewE = this.h.E(this.f32778w + i10);
        if (viewE != 0) {
            int measuredHeight = viewE.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.f32776r - measuredHeight);
            viewE.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.f32776r);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            viewE.draw(canvas);
            canvas.restore();
        }
        boolean z10 = viewE instanceof wu0;
        wu0[] wu0VarArr = this.J;
        if (!z10) {
            wu0VarArr[i10] = null;
            return;
        }
        wu0 wu0Var = (wu0) viewE;
        wu0VarArr[i10] = wu0Var;
        wu0Var.g(this.v);
    }

    public final void j() {
        if (this.H == null) {
            float renderNodeScale = getRenderNodeScale();
            this.H = new RenderNode("profileBlurNode");
            float[] fArr = {0.0f, AndroidUtilities.dpf2(56.0f) / this.f32776r};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f32776r / renderNodeScale, new int[]{0, -1}, fArr, tileMode);
            float blurRadius = getBlurRadius();
            this.H.setRenderEffect(RenderEffect.createBlendModeEffect(RenderEffect.createBlurEffect(blurRadius, blurRadius, tileMode), RenderEffect.createShaderEffect(linearGradient), BlendMode.DST_IN));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f(canvas, null, this.h.getMeasuredWidth(), this.h.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.f32776r + this.f32775n);
    }

    public void setActionsView(rg0 rg0Var) {
        this.E = rg0Var;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (f10 == 0.0f || !this.f32770a) {
            return;
        }
        invalidate();
    }

    public void setMusicView(jh0 jh0Var) {
        this.F = jh0Var;
    }

    public void setSize(int i10) {
        if (this.f32775n != i10) {
            invalidate();
        }
        this.f32775n = i10;
        this.f32776r = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setView(ch0 ch0Var) {
        e();
        this.h = ch0Var;
        this.f32778w = ch0Var.getCurrentItem();
        this.f32779x = 0;
        ch0Var.b(this.L);
    }

    public void setSuggestionView(kh0 kh0Var) {
    }
}
