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
public abstract class l61 extends View implements org.telegram.messenger.fs {
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
    public boolean f37040a;
    public long f37041a0;
    public b6 f37042b;
    public long f37043b0;
    public long f37044c;
    public int f37045c0;
    public Uri d;
    public int f37046d0;
    public Runnable f37047e;
    public ArrayList f37048e0;
    public j61 f37049f;
    public TLRPC.Document f37050f0;
    public String f37051g0;
    public float h;
    public int f37052h0;
    public int f37053n;
    public int f37054r;
    public boolean f37055s;
    public Bitmap f37056w;
    public Bitmap f37057x;
    public final Drawable f37058y;

    public l61(Context context, org.telegram.ui.qn0 qn0Var) {
        super(context);
        this.f37053n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.f37052h0 = -1;
        setVisibility(4);
        this.f37058y = context.getResources().getDrawable(2131232800);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.N = qn0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.f22642h1 = new iy(this, 26);
    }

    public final void a() {
        if (this.f37047e != null) {
            Utilities.f22782e.a(this.f37047e);
            this.f37047e = null;
        }
        if (this.f37049f != null) {
            Utilities.f22782e.a(this.f37049f);
            this.f37049f = null;
        }
        b6 b6Var = this.f37042b;
        if (b6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = b6Var.f33561v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (b6Var.f33541e0 != null) {
                b6Var.f33541e0.h();
            }
        }
        Utilities.f22782e.c(new i61(this, 0));
        setVisibility(4);
        this.f37057x = null;
        this.H = null;
        invalidate();
        this.f37053n = -1;
        this.d = null;
        this.f37055s = false;
        this.f37040a = false;
        if (this.f37041a0 != 0) {
            this.f37041a0 = 0L;
            this.f37051g0 = null;
            this.f37050f0 = null;
            this.f37048e0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.f37052h0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.ks.Z1;
        int i12 = org.telegram.messenger.ks.Y1;
        if (i7 == -1) {
            org.telegram.messenger.ks.f(i10).n(this, i12);
            org.telegram.messenger.ks.f(this.f37052h0).n(this, i11);
        } else {
            org.telegram.messenger.ks.f(i7).c(this, i12);
            org.telegram.messenger.ks.f(i7).c(this, i11);
        }
        this.f37052h0 = i7;
    }

    public final void c(org.telegram.messenger.fj r12, org.telegram.ui.Components.f61 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l61.c(org.telegram.messenger.fj, org.telegram.ui.Components.f61):void");
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
                            arrayList.add(new k61(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new di.w0(3)));
                    this.f37043b0 = j3;
                    this.f37045c0 = i7;
                    this.f37046d0 = i10;
                    this.f37048e0 = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.f37048e0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.Y1) {
            if (((String) objArr[0]).equals(this.f37051g0)) {
                org.telegram.messenger.w7.G(i10);
                File I = org.telegram.messenger.w7.I(this.f37050f0);
                if (I != null && I.exists()) {
                    d(I);
                }
                this.f37051g0 = null;
                this.f37050f0 = null;
                b(-1);
            }
        } else if (i7 == org.telegram.messenger.ks.Z1 && ((String) objArr[0]).equals(this.f37051g0)) {
            this.f37051g0 = null;
            this.f37050f0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.fj r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l61.e(org.telegram.messenger.fj, float, int):void");
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
        Bitmap bitmap = this.f37056w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f37056w = null;
        }
        boolean z10 = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.f37058y;
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
        } else if (this.f37057x != null && this.H != null) {
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f37057x.getWidth();
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
