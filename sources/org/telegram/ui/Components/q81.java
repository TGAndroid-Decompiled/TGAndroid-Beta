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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public abstract class q81 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.vr0 M;
    public org.telegram.ui.ou0 N;
    public double O;
    public boolean P;
    public final ImageReceiver Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Path V;
    public long W;
    public boolean f28225a;
    public long f28226a0;
    public f6 f28227b;
    public int f28228b0;
    public long f28229c;
    public int f28230c0;
    public Uri d;
    public ArrayList f28231d0;
    public Runnable e;
    public TLRPC.Document f28232e0;
    public o81 f28233f;
    public String f28234f0;
    public int f28235g0;
    public float h;
    public int f28236n;
    public int f28237r;
    public boolean f28238s;
    public Bitmap v;
    public Bitmap f28239w;
    public final Drawable f28240x;
    public String f28241y;

    public q81(Context context, org.telegram.ui.vr0 vr0Var) {
        super(context);
        this.f28236n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.H = new RectF();
        this.I = new Paint(2);
        this.J = new Paint(2);
        this.K = new RectF();
        this.L = new Matrix();
        this.V = new Path();
        this.f28235g0 = -1;
        setVisibility(4);
        this.f28240x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.M = vr0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.Q = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new n81(this));
    }

    public final void a() {
        if (this.e != null) {
            Utilities.globalQueue.cancelRunnable(this.e);
            this.e = null;
        }
        if (this.f28233f != null) {
            Utilities.globalQueue.cancelRunnable(this.f28233f);
            this.f28233f = null;
        }
        f6 f6Var = this.f28227b;
        if (f6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = f6Var.f24628u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (f6Var.f24608d0 != null) {
                f6Var.f24608d0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new l81(this, 0));
        setVisibility(4);
        this.f28239w = null;
        this.G = null;
        invalidate();
        this.f28236n = -1;
        this.d = null;
        this.f28238s = false;
        this.f28225a = false;
        if (this.W != 0) {
            this.W = 0L;
            this.f28234f0 = null;
            this.f28232e0 = null;
            this.f28231d0 = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.f28235g0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f28235g0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.f28235g0 = i10;
    }

    public final void c(org.telegram.ui.Components.i81 r12, org.telegram.messenger.MessageObject r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q81.c(org.telegram.ui.Components.i81, org.telegram.messenger.MessageObject):void");
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
                            arrayList.add(new p81(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new m81(0)));
                    this.f28226a0 = j10;
                    this.f28228b0 = i10;
                    this.f28230c0 = i11;
                    this.f28231d0 = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.f28231d0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.f28234f0)) {
                File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.f28232e0);
                if (pathToAttach != null && pathToAttach.exists()) {
                    d(pathToAttach);
                }
                this.f28234f0 = null;
                this.f28232e0 = null;
                b(-1);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f28234f0)) {
            this.f28234f0 = null;
            this.f28232e0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.MessageObject r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q81.e(org.telegram.messenger.MessageObject, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z10 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.f28240x;
        if (z10) {
            canvas.save();
            Path path = this.V;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.T, getHeight() / this.U);
            canvas.translate(-this.R, -this.S);
            ImageReceiver imageReceiver = this.Q;
            imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
            imageReceiver.draw(canvas);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f28241y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        } else if (this.f28239w != null && this.G != null) {
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f28239w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.K;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f28241y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
