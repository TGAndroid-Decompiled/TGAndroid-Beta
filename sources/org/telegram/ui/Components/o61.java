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
public abstract class o61 extends View implements org.telegram.messenger.gs {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final org.telegram.ui.qn0 N;
    public org.telegram.ui.dq0 O;
    public double P;
    public boolean Q;
    public final ImageReceiver R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public boolean f38122a;
    public long f38123a0;
    public c6 f38124b;
    public long f38125b0;
    public long f38126c;
    public int f38127c0;
    public Uri d;
    public int f38128d0;
    public Runnable f38129e;
    public ArrayList f38130e0;
    public m61 f38131f;
    public TLRPC.Document f38132f0;
    public String f38133g0;
    public float h;
    public int f38134h0;
    public int f38135n;
    public int f38136r;
    public boolean f38137s;
    public Bitmap f38138w;
    public Bitmap f38139x;
    public final Drawable f38140y;

    public o61(Context context, org.telegram.ui.qn0 qn0Var) {
        super(context);
        this.f38135n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.f38134h0 = -1;
        setVisibility(4);
        this.f38140y = context.getResources().getDrawable(2131232800);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.N = qn0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f22670h1 = new ky(this, 26);
    }

    public final void a() {
        if (this.f38129e != null) {
            Utilities.f22810e.a(this.f38129e);
            this.f38129e = null;
        }
        if (this.f38131f != null) {
            Utilities.f22810e.a(this.f38131f);
            this.f38131f = null;
        }
        c6 c6Var = this.f38124b;
        if (c6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.f34095v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (c6Var.f34075e0 != null) {
                c6Var.f34075e0.h();
            }
        }
        Utilities.f22810e.c(new l61(this, 0));
        setVisibility(4);
        this.f38139x = null;
        this.H = null;
        invalidate();
        this.f38135n = -1;
        this.d = null;
        this.f38137s = false;
        this.f38122a = false;
        if (this.f38123a0 != 0) {
            this.f38123a0 = 0L;
            this.f38133g0 = null;
            this.f38132f0 = null;
            this.f38130e0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.f38134h0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.ls.Z1;
        int i12 = org.telegram.messenger.ls.Y1;
        if (i7 == -1) {
            org.telegram.messenger.ls.f(i10).n(this, i12);
            org.telegram.messenger.ls.f(this.f38134h0).n(this, i11);
        } else {
            org.telegram.messenger.ls.f(i7).c(this, i12);
            org.telegram.messenger.ls.f(i7).c(this, i11);
        }
        this.f38134h0 = i7;
    }

    public final void c(org.telegram.messenger.gj r12, org.telegram.ui.Components.i61 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o61.c(org.telegram.messenger.gj, org.telegram.ui.Components.i61):void");
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
                            arrayList.add(new n61(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new di.w0(3)));
                    this.f38125b0 = j3;
                    this.f38127c0 = i7;
                    this.f38128d0 = i10;
                    this.f38130e0 = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.f38130e0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.Y1) {
            if (((String) objArr[0]).equals(this.f38133g0)) {
                org.telegram.messenger.w7.G(i10);
                File I = org.telegram.messenger.w7.I(this.f38132f0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f38133g0 = null;
                this.f38132f0 = null;
                b(-1);
            }
        } else if (i7 == org.telegram.messenger.ls.Z1 && ((String) objArr[0]).equals(this.f38133g0)) {
            this.f38133g0 = null;
            this.f38132f0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.gj r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o61.e(org.telegram.messenger.gj, float, int):void");
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
        Bitmap bitmap = this.f38138w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f38138w = null;
        }
        boolean z10 = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.f38140y;
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
        } else if (this.f38139x != null && this.H != null) {
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f38139x.getWidth();
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
