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
public abstract class p71 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public final TextPaint C;
    public BitmapShader D;
    public final RectF E;
    public final Paint F;
    public final Paint G;
    public final RectF H;
    public final Matrix I;
    public final org.telegram.ui.uq0 J;
    public org.telegram.ui.nt0 K;
    public double L;
    public boolean M;
    public final ImageReceiver N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final Path S;
    public long T;
    public long U;
    public int V;
    public int W;
    public boolean f27768a;
    public ArrayList f27769a0;
    public y5 f27770b;
    public TLRPC.Document f27771b0;
    public long f27772c;
    public String f27773c0;
    public Uri d;
    public int f27774d0;
    public Runnable e;
    public n71 f27775f;
    public float h;
    public int f27776n;
    public int f27777r;
    public boolean f27778s;
    public Bitmap v;
    public Bitmap f27779w;
    public final Drawable f27780x;
    public String f27781y;

    public p71(Context context, org.telegram.ui.uq0 uq0Var) {
        super(context);
        this.f27776n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.C = textPaint;
        this.E = new RectF();
        this.F = new Paint(2);
        this.G = new Paint(2);
        this.H = new RectF();
        this.I = new Matrix();
        this.S = new Path();
        this.f27774d0 = -1;
        setVisibility(4);
        this.f27780x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.J = uq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.N = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new fv(this, 29));
    }

    public final void a() {
        if (this.e != null) {
            Utilities.globalQueue.cancelRunnable(this.e);
            this.e = null;
        }
        if (this.f27775f != null) {
            Utilities.globalQueue.cancelRunnable(this.f27775f);
            this.f27775f = null;
        }
        y5 y5Var = this.f27770b;
        if (y5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = y5Var.f30871r0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (y5Var.f30850a0 != null) {
                y5Var.f30850a0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new l71(this, 0));
        setVisibility(4);
        this.f27779w = null;
        this.D = null;
        invalidate();
        this.f27776n = -1;
        this.d = null;
        this.f27778s = false;
        this.f27768a = false;
        if (this.T != 0) {
            this.T = 0L;
            this.f27773c0 = null;
            this.f27771b0 = null;
            this.f27769a0 = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.f27774d0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f27774d0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.f27774d0 = i10;
    }

    public final void c(org.telegram.ui.Components.i71 r12, org.telegram.messenger.MessageObject r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p71.c(org.telegram.ui.Components.i71, org.telegram.messenger.MessageObject):void");
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
                            arrayList.add(new o71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new lh.z0(3)));
                    this.U = j10;
                    this.V = i10;
                    this.W = i11;
                    this.f27769a0 = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.f27769a0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.f27773c0)) {
                File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.f27771b0);
                if (pathToAttach != null && pathToAttach.exists()) {
                    d(pathToAttach);
                }
                this.f27773c0 = null;
                this.f27771b0 = null;
                b(-1);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f27773c0)) {
            this.f27773c0 = null;
            this.f27771b0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.MessageObject r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p71.e(org.telegram.messenger.MessageObject, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z4 = this.M;
        TextPaint textPaint = this.C;
        Drawable drawable = this.f27780x;
        if (z4) {
            canvas.save();
            Path path = this.S;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.Q, getHeight() / this.R);
            canvas.translate(-this.O, -this.P);
            ImageReceiver imageReceiver = this.N;
            imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
            imageReceiver.draw(canvas);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f27781y, (getMeasuredWidth() - this.B) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        } else if (this.f27779w != null && this.D != null) {
            Matrix matrix = this.I;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f27779w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.H;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.G);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f27781y, (getMeasuredWidth() - this.B) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
