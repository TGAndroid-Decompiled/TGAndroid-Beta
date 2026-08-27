package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
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
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public abstract class t61 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final TextPaint B;
    public BitmapShader C;
    public final RectF D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final Matrix H;
    public final org.telegram.ui.pq0 I;
    public org.telegram.ui.ht0 J;
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

    public boolean f32660a;

    public TLRPC.Document f32661a0;

    public x5 f32662b;

    public String f32663b0;

    public long f32664c;

    public int f32665c0;
    public Uri d;

    public Runnable f32666e;

    public q61 f32667f;
    public float h;

    public int f32668n;

    public int f32669r;

    public boolean f32670s;
    public Bitmap v;

    public Bitmap f32671w;

    public final Drawable f32672x;

    public String f32673y;

    public t61(Context context, org.telegram.ui.pq0 pq0Var) {
        super(context);
        this.f32668n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.D = new RectF();
        this.E = new Paint(2);
        this.F = new Paint(2);
        this.G = new RectF();
        this.H = new Matrix();
        this.R = new Path();
        this.f32665c0 = -1;
        setVisibility(4);
        this.f32672x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.I = pq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.M = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new vu(this, 29));
    }

    public final void a() {
        if (this.f32666e != null) {
            Utilities.globalQueue.cancelRunnable(this.f32666e);
            this.f32666e = null;
        }
        if (this.f32667f != null) {
            Utilities.globalQueue.cancelRunnable(this.f32667f);
            this.f32667f = null;
        }
        x5 x5Var = this.f32662b;
        if (x5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var.f34488q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (x5Var.Z != null) {
                x5Var.Z.h();
            }
        }
        Utilities.globalQueue.postRunnable(new p61(this, 0));
        setVisibility(4);
        this.f32671w = null;
        this.C = null;
        invalidate();
        this.f32668n = -1;
        this.d = null;
        this.f32670s = false;
        this.f32660a = false;
        if (this.S != 0) {
            this.S = 0L;
            this.f32663b0 = null;
            this.f32661a0 = null;
            this.W = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.f32665c0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.f32665c0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.f32665c0 = i10;
    }

    public final void c(m61 m61Var, MessageObject messageObject) {
        TLRPC.Document document;
        if (m61Var == null) {
            return;
        }
        if (m61Var.u() > 0) {
            k61 k61VarA = null;
            for (int i10 = 0; i10 < m61Var.u(); i10++) {
                ArrayList arrayList = m61Var.v(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    k61 k61Var = (k61) obj;
                    if (k61VarA == null || ((!k61VarA.b() && k61Var.b()) || (k61VarA.b() == k61Var.b() && k61Var.f30013i * k61Var.f30014j < k61VarA.f30013i * k61VarA.f30014j))) {
                        k61VarA = k61Var;
                    }
                }
            }
            if (k61VarA != null && !k61VarA.b()) {
                int iP = m61Var.p();
                i61 i61VarV = (iP < 0 || iP >= m61Var.u()) ? null : m61Var.v(iP);
                if (i61VarV != null) {
                    k61VarA = i61VarV.a();
                }
            }
            if (k61VarA != null && !k61VarA.b()) {
                a();
                return;
            }
            if (k61VarA != null) {
                k61VarA.b();
            }
            if (k61VarA != null && !k61VarA.d.equals(this.d)) {
                if (this.f32660a) {
                    a();
                }
                this.d = k61VarA.d;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                gs0 gs0Var = new gs0((org.telegram.ui.ks0) this, k61VarA, messageObject, 12);
                this.f32666e = gs0Var;
                dispatchQueue.postRunnable(gs0Var);
            }
        } else {
            Uri uri = m61Var.B;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.f32660a) {
                    a();
                }
                this.d = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                gs0 gs0Var2 = new gs0((org.telegram.ui.ks0) this, uri, messageObject, 11);
                this.f32666e = gs0Var2;
                dispatchQueue2.postRunnable(gs0Var2);
            }
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media == null) {
            document = null;
            break;
        }
        TLRPC.Document document2 = media.document;
        if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
            ArrayList<TLRPC.Document> arrayList2 = media.alt_documents;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size2) {
                    document = null;
                    break;
                }
                TLRPC.Document document3 = arrayList2.get(i12);
                i12++;
                TLRPC.Document document4 = document3;
                if ("application/x-tgstoryboardmap".equalsIgnoreCase(document4.mime_type)) {
                    document = document4;
                    break;
                }
            }
        } else {
            document = media.document;
        }
        long j10 = document == null ? 0L : document.f22386id;
        if (this.S != j10) {
            this.S = j10;
            this.W = null;
            if (document == null) {
                this.f32663b0 = null;
                this.f32661a0 = null;
                b(-1);
                this.W = null;
                return;
            }
            File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document);
            if (pathToAttach == null || !pathToAttach.exists()) {
                this.f32663b0 = FileLoader.getAttachFileName(document);
                this.f32661a0 = document;
                b(messageObject.currentAccount);
                FileLoader.getInstance(messageObject.currentAccount).loadFile(document, messageObject, 2, 0);
                return;
            }
            this.f32663b0 = null;
            this.f32661a0 = null;
            b(-1);
            d(pathToAttach);
        }
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String line = randomAccessFile.readLine();
                if (line == null) {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new hh.a1(3)));
                    this.T = j10;
                    this.U = i10;
                    this.V = i11;
                    this.W = arrayList;
                    return;
                }
                if (line.startsWith("file=mtproto:")) {
                    j10 = Long.parseLong(line.substring(13));
                } else if (line.startsWith("frame_width=")) {
                    i10 = Integer.parseInt(line.substring(12));
                } else if (line.startsWith("frame_height=")) {
                    i11 = Integer.parseInt(line.substring(13));
                } else {
                    String[] strArrSplit = line.split(",");
                    if (strArrSplit.length == 3) {
                        arrayList.add(new s61(Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Double.parseDouble(strArrSplit[0])));
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            this.W = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f32663b0)) {
                this.f32663b0 = null;
                this.f32661a0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.f32663b0)) {
            File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.f32661a0);
            if (pathToAttach != null && pathToAttach.exists()) {
                d(pathToAttach);
            }
            this.f32663b0 = null;
            this.f32661a0 = null;
            b(-1);
        }
    }

    public final void e(MessageObject messageObject, final float f10, int i10) {
        TLRPC.Document document;
        this.J = null;
        boolean z10 = false;
        if (this.W != null) {
            long j10 = this.T;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media == null) {
                document = null;
                break;
            }
            document = media.document;
            if (document == null || document.f22386id != j10) {
                ArrayList<TLRPC.Document> arrayList = media.alt_documents;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        document = null;
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i11);
                    i11++;
                    TLRPC.Document document3 = document2;
                    if (document3.f22386id == j10) {
                        document = document3;
                        break;
                    }
                }
            }
            if (document != null) {
                this.K = ((double) (this.f32664c * f10)) / 1000.0d;
                this.M.setImage(ImageLocation.getForDocument(document), null, null, null, messageObject, 0);
                z10 = true;
            } else {
                this.M.setImageBitmap((Drawable) null);
            }
        } else {
            this.M.setImageBitmap((Drawable) null);
        }
        this.L = z10;
        if (i10 != 0) {
            this.f32669r = i10;
            int i12 = ((int) (i10 * f10)) / 5;
            if (this.f32668n == i12) {
                return;
            } else {
                this.f32668n = i12;
            }
        }
        final long j11 = (long) (this.f32664c * f10);
        String shortDuration = AndroidUtilities.formatShortDuration((int) (j11 / 1000));
        this.f32673y = shortDuration;
        this.A = (int) Math.ceil(this.B.measureText(shortDuration));
        invalidate();
        if (this.f32667f != null) {
            Utilities.globalQueue.cancelRunnable(this.f32667f);
        }
        if (z10) {
            return;
        }
        x5 x5Var = this.f32662b;
        if (x5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var.f34488q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (x5Var.Z != null) {
                x5Var.Z.e();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r10 = new Runnable() {
            @Override
            public final void run() {
                int i13;
                t61 t61Var = this.f31810a;
                RectF rectF = t61Var.D;
                if (t61Var.f32662b == null) {
                    t61Var.h = f10;
                    return;
                }
                int iMax = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap bitmapQ = t61Var.f32662b.q(j11, false);
                if (bitmapQ != null) {
                    int width = bitmapQ.getWidth();
                    int height = bitmapQ.getHeight();
                    if (width > height) {
                        i13 = (int) (height / (width / iMax));
                    } else {
                        int i14 = (int) (width / (height / iMax));
                        i13 = iMax;
                        iMax = i14;
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(iMax, i13, Bitmap.Config.ARGB_8888);
                        rectF.set(0.0f, 0.0f, iMax, i13);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawBitmap(bitmapQ, (Rect) null, rectF, t61Var.E);
                        canvas.setBitmap(null);
                        bitmapQ = bitmapCreateBitmap;
                    } catch (Throwable unused) {
                        bitmapQ = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new r61(0, t61Var, bitmapQ));
            }
        };
        this.f32667f = r10;
        dispatchQueue.postRunnable(r10);
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
        Drawable drawable = this.f32672x;
        if (!z10) {
            if (this.f32671w == null || this.C == null) {
                return;
            }
            Matrix matrix = this.H;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.f32671w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.G;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.F);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.f32673y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.R;
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.P, getHeight() / this.Q);
        canvas.translate(-this.N, -this.O);
        ImageReceiver imageReceiver = this.M;
        imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
        imageReceiver.draw(canvas);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.f32673y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
