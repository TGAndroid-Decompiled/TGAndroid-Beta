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
public abstract class b71 extends View implements org.telegram.messenger.us {
    public String D;
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.yo0 M;
    public org.telegram.ui.mr0 N;
    public double O;
    public boolean P;
    public final ImageReceiver Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Path V;
    public long W;
    public boolean f24563a;
    public long f24564a0;
    public s5 f24565b;
    public int f24566b0;
    public long f24567c;
    public int f24568c0;
    public Uri d;
    public ArrayList f24569d0;
    public Runnable e;
    public TLRPC.Document f24570e0;
    public z61 f24571f;
    public String f24572f0;
    public int f24573g0;
    public float h;
    public int f24574n;
    public int f24575r;
    public boolean f24576s;
    public Bitmap f24577w;
    public Bitmap f24578x;
    public final Drawable f24579y;

    public b71(Context context, org.telegram.ui.yo0 yo0Var) {
        super(context);
        this.f24574n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.H = new RectF();
        this.I = new Paint(2);
        this.J = new Paint(2);
        this.K = new RectF();
        this.L = new Matrix();
        this.V = new Path();
        this.f24573g0 = -1;
        setVisibility(4);
        this.f24579y = context.getResources().getDrawable(2131232796);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        this.M = yo0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Q = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f14382g1 = new px(this, 27);
    }

    public final void a() {
        if (this.e != null) {
            Utilities.e.a(this.e);
            this.e = null;
        }
        if (this.f24571f != null) {
            Utilities.e.a(this.f24571f);
            this.f24571f = null;
        }
        s5 s5Var = this.f24565b;
        if (s5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = s5Var.f30151u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (s5Var.f30131d0 != null) {
                s5Var.f30131d0.h();
            }
        }
        Utilities.e.c(new x61(this, 0));
        setVisibility(4);
        this.f24578x = null;
        this.G = null;
        invalidate();
        this.f24574n = -1;
        this.d = null;
        this.f24576s = false;
        this.f24563a = false;
        if (this.W != 0) {
            this.W = 0L;
            this.f24572f0 = null;
            this.f24570e0 = null;
            this.f24569d0 = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.f24573g0;
        if (i11 == i10) {
            return;
        }
        int i12 = org.telegram.messenger.zs.Z1;
        int i13 = org.telegram.messenger.zs.Y1;
        if (i10 == -1) {
            org.telegram.messenger.zs.f(i11).n(this, i13);
            org.telegram.messenger.zs.f(this.f24573g0).n(this, i12);
        } else {
            org.telegram.messenger.zs.f(i10).c(this, i13);
            org.telegram.messenger.zs.f(i10).c(this, i12);
        }
        this.f24573g0 = i10;
    }

    public final void c(org.telegram.messenger.jj r12, org.telegram.ui.Components.u61 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b71.c(org.telegram.messenger.jj, org.telegram.ui.Components.u61):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j10 = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i10 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i11 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new a71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new y61(0)));
                    this.f24564a0 = j10;
                    this.f24566b0 = i10;
                    this.f24568c0 = i11;
                    this.f24569d0 = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            this.f24569d0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.Y1) {
            if (((String) objArr[0]).equals(this.f24572f0)) {
                org.telegram.messenger.b8.G(i11);
                File I = org.telegram.messenger.b8.I(this.f24570e0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f24572f0 = null;
                this.f24570e0 = null;
                b(-1);
            }
        } else if (i10 == org.telegram.messenger.zs.Z1 && ((String) objArr[0]).equals(this.f24572f0)) {
            this.f24572f0 = null;
            this.f24570e0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.jj r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b71.e(org.telegram.messenger.jj, float, int):void");
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
        Bitmap bitmap = this.f24577w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24577w = null;
        }
        boolean z10 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.f24579y;
        if (z10) {
            canvas.save();
            Path path = this.V;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.T, getHeight() / this.U);
            canvas.translate(-this.R, -this.S);
            ImageReceiver imageReceiver = this.Q;
            imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
            imageReceiver.h(canvas, null);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), textPaint);
        } else if (this.f24578x != null && this.G != null) {
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f24578x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.K;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
