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
public abstract class z51 extends View implements org.telegram.messenger.ls {
    public String D;
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.ln0 M;
    public org.telegram.ui.cq0 N;
    public double O;
    public boolean P;
    public final ImageReceiver Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Path V;
    public long W;
    public boolean f40898a;
    public long f40899a0;
    public v5 f40900b;
    public int f40901b0;
    public long f40902c;
    public int f40903c0;
    public Uri d;
    public ArrayList f40904d0;
    public Runnable f40905e;
    public TLRPC.Document f40906e0;
    public x51 f40907f;
    public String f40908f0;
    public int f40909g0;
    public float h;
    public int f40910n;
    public int f40911r;
    public boolean f40912s;
    public Bitmap f40913w;
    public Bitmap f40914x;
    public final Drawable f40915y;

    public z51(Context context, org.telegram.ui.ln0 ln0Var) {
        super(context);
        this.f40910n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.H = new RectF();
        this.I = new Paint(2);
        this.J = new Paint(2);
        this.K = new RectF();
        this.L = new Matrix();
        this.V = new Path();
        this.f40909g0 = -1;
        setVisibility(4);
        this.f40915y = context.getResources().getDrawable(2131232798);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.M = ln0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Q = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f21195g1 = new bx(this, 27);
    }

    public final void a() {
        if (this.f40905e != null) {
            Utilities.f21336e.a(this.f40905e);
            this.f40905e = null;
        }
        if (this.f40907f != null) {
            Utilities.f21336e.a(this.f40907f);
            this.f40907f = null;
        }
        v5 v5Var = this.f40900b;
        if (v5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = v5Var.f38884u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (v5Var.f38863d0 != null) {
                v5Var.f38863d0.h();
            }
        }
        Utilities.f21336e.c(new w51(this, 0));
        setVisibility(4);
        this.f40914x = null;
        this.G = null;
        invalidate();
        this.f40910n = -1;
        this.d = null;
        this.f40912s = false;
        this.f40898a = false;
        if (this.W != 0) {
            this.W = 0L;
            this.f40908f0 = null;
            this.f40906e0 = null;
            this.f40904d0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.f40909g0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.qs.Z1;
        int i12 = org.telegram.messenger.qs.Y1;
        if (i7 == -1) {
            org.telegram.messenger.qs.f(i10).n(this, i12);
            org.telegram.messenger.qs.f(this.f40909g0).n(this, i11);
        } else {
            org.telegram.messenger.qs.f(i7).c(this, i12);
            org.telegram.messenger.qs.f(i7).c(this, i11);
        }
        this.f40909g0 = i7;
    }

    public final void c(org.telegram.messenger.ij r12, org.telegram.ui.Components.t51 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z51.c(org.telegram.messenger.ij, org.telegram.ui.Components.t51):void");
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
                            arrayList.add(new y51(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new bi.j1(3)));
                    this.f40899a0 = j3;
                    this.f40901b0 = i7;
                    this.f40903c0 = i10;
                    this.f40904d0 = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.f40904d0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Y1) {
            if (((String) objArr[0]).equals(this.f40908f0)) {
                org.telegram.messenger.w7.G(i10);
                File I = org.telegram.messenger.w7.I(this.f40906e0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f40908f0 = null;
                this.f40906e0 = null;
                b(-1);
            }
        } else if (i7 == org.telegram.messenger.qs.Z1 && ((String) objArr[0]).equals(this.f40908f0)) {
            this.f40908f0 = null;
            this.f40906e0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.ij r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z51.e(org.telegram.messenger.ij, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f40913w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f40913w = null;
        }
        boolean z9 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.f40915y;
        if (z9) {
            canvas.save();
            Path path = this.V;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.T, getHeight() / this.U);
            canvas.translate(-this.R, -this.S);
            ImageReceiver imageReceiver = this.Q;
            imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
            imageReceiver.h(canvas, null);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
        } else if (this.f40914x != null && this.G != null) {
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f40914x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.K;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotY(getMeasuredHeight());
    }
}
