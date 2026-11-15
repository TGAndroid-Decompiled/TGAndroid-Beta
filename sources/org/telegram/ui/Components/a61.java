package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class a61 extends View implements org.telegram.messenger.is {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final org.telegram.ui.nn0 N;
    public org.telegram.ui.bq0 O;
    public double P;
    public boolean Q;
    public final ImageReceiver R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public boolean f32887a;
    public long f32888a0;
    public t5 f32889b;
    public long f32890b0;
    public long f32891c;
    public int f32892c0;
    public Uri d;
    public int f32893d0;
    public Runnable f32894e;
    public ArrayList f32895e0;
    public y51 f32896f;
    public TLRPC.Document f32897f0;
    public String f32898g0;
    public float h;
    public int f32899h0;
    public int f32900n;
    public int f32901r;
    public boolean f32902s;
    public Bitmap f32903w;
    public Bitmap f32904x;
    public final Drawable f32905y;

    public a61(Context context, org.telegram.ui.nn0 nn0Var) {
        super(context);
        this.f32900n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.f32899h0 = -1;
        setVisibility(4);
        this.f32905y = context.getResources().getDrawable(2131232799);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.N = nn0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f22276h1 = new gx(this, 27);
    }

    public final void a() {
        if (this.f32894e != null) {
            Utilities.f22416e.a(this.f32894e);
            this.f32894e = null;
        }
        if (this.f32896f != null) {
            Utilities.f22416e.a(this.f32896f);
            this.f32896f = null;
        }
        t5 t5Var = this.f32889b;
        if (t5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = t5Var.f39536v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (t5Var.f39516e0 != null) {
                t5Var.f39516e0.h();
            }
        }
        Utilities.f22416e.c(new x51(this, 0));
        setVisibility(4);
        this.f32904x = null;
        this.H = null;
        invalidate();
        this.f32900n = -1;
        this.d = null;
        this.f32902s = false;
        this.f32887a = false;
        if (this.f32888a0 != 0) {
            this.f32888a0 = 0L;
            this.f32898g0 = null;
            this.f32897f0 = null;
            this.f32895e0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.f32899h0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.ns.Z1;
        int i12 = org.telegram.messenger.ns.Y1;
        if (i7 == -1) {
            org.telegram.messenger.ns.f(i10).n(this, i12);
            org.telegram.messenger.ns.f(this.f32899h0).n(this, i11);
        } else {
            org.telegram.messenger.ns.f(i7).c(this, i12);
            org.telegram.messenger.ns.f(i7).c(this, i11);
        }
        this.f32899h0 = i7;
    }

    public final void c(org.telegram.messenger.gj r12, org.telegram.ui.Components.u51 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.c(org.telegram.messenger.gj, org.telegram.ui.Components.u51):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j3 = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i7 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i10 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new z51(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new di.x0(3)));
                    this.f32890b0 = j3;
                    this.f32892c0 = i7;
                    this.f32893d0 = i10;
                    this.f32895e0 = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.f32895e0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.Y1) {
            if (((String) objArr[0]).equals(this.f32898g0)) {
                org.telegram.messenger.w7.G(i10);
                File I = org.telegram.messenger.w7.I(this.f32897f0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f32898g0 = null;
                this.f32897f0 = null;
                b(-1);
            }
        } else if (i7 == org.telegram.messenger.ns.Z1 && ((String) objArr[0]).equals(this.f32898g0)) {
            this.f32898g0 = null;
            this.f32897f0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.gj r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.e(org.telegram.messenger.gj, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f32903w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32903w = null;
        }
        boolean z10 = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.f32905y;
        if (z10) {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.U, getHeight() / this.V);
            canvas.translate(-this.S, -this.T);
            ImageReceiver imageReceiver = this.R;
            imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
            imageReceiver.h(canvas, null);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
        } else if (this.f32904x != null && this.H != null) {
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f32904x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.L;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.K);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotY(getMeasuredHeight());
    }
}
