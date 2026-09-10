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
public abstract class a81 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.qr0 M;
    public org.telegram.ui.hu0 N;
    public double O;
    public boolean P;
    public final ImageReceiver Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Path V;
    public long W;
    public boolean f21420a;
    public long f21421a0;
    public c6 f21422b;
    public int f21423b0;
    public long f21424c;
    public int f21425c0;
    public Uri d;
    public ArrayList f21426d0;
    public Runnable e;
    public TLRPC.Document f21427e0;
    public y71 f21428f;
    public String f21429f0;
    public int f21430g0;
    public float h;
    public int f21431n;
    public int f21432r;
    public boolean f21433s;
    public Bitmap v;
    public Bitmap f21434w;
    public final Drawable f21435x;
    public String f21436y;

    public a81(Context context, org.telegram.ui.qr0 qr0Var) {
        super(context);
        this.f21431n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.H = new RectF();
        this.I = new Paint(2);
        this.J = new Paint(2);
        this.K = new RectF();
        this.L = new Matrix();
        this.V = new Path();
        this.f21430g0 = -1;
        setVisibility(4);
        this.f21435x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.M = qr0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.Q = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new pv(this, 29));
    }

    public final void a() {
        if (this.e != null) {
            Utilities.globalQueue.cancelRunnable(this.e);
            this.e = null;
        }
        if (this.f21428f != null) {
            Utilities.globalQueue.cancelRunnable(this.f21428f);
            this.f21428f = null;
        }
        c6 c6Var = this.f21422b;
        if (c6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.f22022u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (c6Var.f22002d0 != null) {
                c6Var.f22002d0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new w71(this, 0));
        setVisibility(4);
        this.f21434w = null;
        this.G = null;
        invalidate();
        this.f21431n = -1;
        this.d = null;
        this.f21433s = false;
        this.f21420a = false;
        if (this.W != 0) {
            this.W = 0L;
            this.f21429f0 = null;
            this.f21427e0 = null;
            this.f21426d0 = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.f21430g0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f21430g0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.f21430g0 = i10;
    }

    public final void c(org.telegram.ui.Components.t71 r12, org.telegram.messenger.MessageObject r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.c(org.telegram.ui.Components.t71, org.telegram.messenger.MessageObject):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j3 = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i10 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i11 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new z71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new x71(0)));
                    this.f21421a0 = j3;
                    this.f21423b0 = i10;
                    this.f21425c0 = i11;
                    this.f21426d0 = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.f21426d0 = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.f21429f0)) {
                File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.f21427e0);
                if (pathToAttach != null && pathToAttach.exists()) {
                    d(pathToAttach);
                }
                this.f21429f0 = null;
                this.f21427e0 = null;
                b(-1);
            }
        } else if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f21429f0)) {
            this.f21429f0 = null;
            this.f21427e0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.MessageObject r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.e(org.telegram.messenger.MessageObject, float, int):void");
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
        Drawable drawable = this.f21435x;
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
            canvas.drawText(this.f21436y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        } else if (this.f21434w != null && this.G != null) {
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f21434w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.K;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f21436y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
