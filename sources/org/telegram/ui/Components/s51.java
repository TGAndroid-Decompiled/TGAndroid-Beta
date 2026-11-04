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
public abstract class s51 extends View implements org.telegram.messenger.cs {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final org.telegram.ui.gn0 N;
    public org.telegram.ui.tp0 O;
    public double P;
    public boolean Q;
    public final ImageReceiver R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public boolean f37913a;
    public long f37914a0;
    public t5 f37915b;
    public long f37916b0;
    public long f37917c;
    public int f37918c0;
    public Uri d;
    public int f37919d0;
    public Runnable f37920e;
    public ArrayList f37921e0;
    public q51 f37922f;
    public TLRPC.Document f37923f0;
    public String f37924g0;
    public float h;
    public int f37925h0;
    public int f37926n;
    public int f37927r;
    public boolean f37928s;
    public Bitmap f37929w;
    public Bitmap f37930x;
    public final Drawable f37931y;

    public s51(Context context, org.telegram.ui.gn0 gn0Var) {
        super(context);
        this.f37926n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.f37925h0 = -1;
        setVisibility(4);
        this.f37931y = context.getResources().getDrawable(2131232796);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.N = gn0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f21247h1 = new zw(this, 27);
    }

    public final void a() {
        if (this.f37920e != null) {
            Utilities.f21387e.a(this.f37920e);
            this.f37920e = null;
        }
        if (this.f37922f != null) {
            Utilities.f21387e.a(this.f37922f);
            this.f37922f = null;
        }
        t5 t5Var = this.f37915b;
        if (t5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = t5Var.f38280v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (t5Var.f38260e0 != null) {
                t5Var.f38260e0.h();
            }
        }
        Utilities.f21387e.c(new p51(this, 0));
        setVisibility(4);
        this.f37930x = null;
        this.H = null;
        invalidate();
        this.f37926n = -1;
        this.d = null;
        this.f37928s = false;
        this.f37913a = false;
        if (this.f37914a0 != 0) {
            this.f37914a0 = 0L;
            this.f37924g0 = null;
            this.f37923f0 = null;
            this.f37921e0 = null;
            b(-1);
        }
    }

    public final void b(int i3) {
        int i10 = this.f37925h0;
        if (i10 == i3) {
            return;
        }
        int i11 = org.telegram.messenger.hs.Z1;
        int i12 = org.telegram.messenger.hs.Y1;
        if (i3 == -1) {
            org.telegram.messenger.hs.f(i10).n(this, i12);
            org.telegram.messenger.hs.f(this.f37925h0).n(this, i11);
        } else {
            org.telegram.messenger.hs.f(i3).c(this, i12);
            org.telegram.messenger.hs.f(i3).c(this, i11);
        }
        this.f37925h0 = i3;
    }

    public final void c(org.telegram.messenger.zi r12, org.telegram.ui.Components.m51 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s51.c(org.telegram.messenger.zi, org.telegram.ui.Components.m51):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i3 = 0;
            int i10 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j10 = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i3 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i10 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new r51(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new ci.c1(3)));
                    this.f37916b0 = j10;
                    this.f37918c0 = i3;
                    this.f37919d0 = i10;
                    this.f37921e0 = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.f37921e0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.Y1) {
            if (((String) objArr[0]).equals(this.f37924g0)) {
                org.telegram.messenger.w7.G(i10);
                File I = org.telegram.messenger.w7.I(this.f37923f0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f37924g0 = null;
                this.f37923f0 = null;
                b(-1);
            }
        } else if (i3 == org.telegram.messenger.hs.Z1 && ((String) objArr[0]).equals(this.f37924g0)) {
            this.f37924g0 = null;
            this.f37923f0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.zi r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s51.e(org.telegram.messenger.zi, float, int):void");
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
        Bitmap bitmap = this.f37929w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f37929w = null;
        }
        boolean z10 = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.f37931y;
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
        } else if (this.f37930x != null && this.H != null) {
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f37930x.getWidth();
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        setPivotY(getMeasuredHeight());
    }
}
