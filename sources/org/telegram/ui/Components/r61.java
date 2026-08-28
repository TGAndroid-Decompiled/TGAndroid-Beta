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
public abstract class r61 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final TextPaint B;
    public BitmapShader C;
    public final RectF D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final Matrix H;
    public final org.telegram.ui.oq0 I;
    public org.telegram.ui.gt0 J;
    public double K;
    public boolean L;
    public final ImageReceiver M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final Path R;
    public long S;
    public long T;
    public int U;
    public int V;
    public ArrayList W;
    public boolean f32087a;
    public TLRPC.Document f32088a0;
    public x5 f32089b;
    public String f32090b0;
    public long f32091c;
    public int f32092c0;
    public Uri d;
    public Runnable f32093e;
    public o61 f32094f;
    public float h;
    public int f32095n;
    public int f32096r;
    public boolean f32097s;
    public Bitmap v;
    public Bitmap f32098w;
    public final Drawable f32099x;
    public String f32100y;

    public r61(Context context, org.telegram.ui.oq0 oq0Var) {
        super(context);
        this.f32095n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.D = new RectF();
        this.E = new Paint(2);
        this.F = new Paint(2);
        this.G = new RectF();
        this.H = new Matrix();
        this.R = new Path();
        this.f32092c0 = -1;
        setVisibility(4);
        this.f32099x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.I = oq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.M = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new wu(this, 29));
    }

    public final void a() {
        if (this.f32093e != null) {
            Utilities.globalQueue.cancelRunnable(this.f32093e);
            this.f32093e = null;
        }
        if (this.f32094f != null) {
            Utilities.globalQueue.cancelRunnable(this.f32094f);
            this.f32094f = null;
        }
        x5 x5Var = this.f32089b;
        if (x5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var.f34527q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (x5Var.Z != null) {
                x5Var.Z.h();
            }
        }
        Utilities.globalQueue.postRunnable(new n61(this, 0));
        setVisibility(4);
        this.f32098w = null;
        this.C = null;
        invalidate();
        this.f32095n = -1;
        this.d = null;
        this.f32097s = false;
        this.f32087a = false;
        if (this.S != 0) {
            this.S = 0L;
            this.f32090b0 = null;
            this.f32088a0 = null;
            this.W = null;
            b(-1);
        }
    }

    public final void b(int i9) {
        int i10 = this.f32092c0;
        if (i10 == i9) {
            return;
        }
        if (i9 == -1) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f32092c0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.f32092c0 = i9;
    }

    public final void c(org.telegram.ui.Components.k61 r12, org.telegram.messenger.MessageObject r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r61.c(org.telegram.ui.Components.k61, org.telegram.messenger.MessageObject):void");
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j10 = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i9 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i10 = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new q61(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new gh.a1(3)));
                    this.T = j10;
                    this.U = i9;
                    this.V = i10;
                    this.W = arrayList;
                    return;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            this.W = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.f32090b0)) {
                File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(this.f32088a0);
                if (pathToAttach != null && pathToAttach.exists()) {
                    d(pathToAttach);
                }
                this.f32090b0 = null;
                this.f32088a0 = null;
                b(-1);
            }
        } else if (i9 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f32090b0)) {
            this.f32090b0 = null;
            this.f32088a0 = null;
            b(-1);
        }
    }

    public final void e(org.telegram.messenger.MessageObject r18, final float r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r61.e(org.telegram.messenger.MessageObject, float, int):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.M.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z10 = this.L;
        TextPaint textPaint = this.B;
        Drawable drawable = this.f32099x;
        if (z10) {
            canvas.save();
            Path path = this.R;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            canvas.scale(getWidth() / this.P, getHeight() / this.Q);
            canvas.translate(-this.N, -this.O);
            ImageReceiver imageReceiver = this.M;
            imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
            imageReceiver.draw(canvas);
            canvas.restore();
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f32100y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        } else if (this.f32098w != null && this.C != null) {
            Matrix matrix = this.H;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f32098w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF2 = this.G;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.F);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f32100y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setPivotY(getMeasuredHeight());
    }
}
