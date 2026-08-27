package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

public abstract class x61 extends View {

    public static final Object f34513b0 = new Object();
    public w61 A;
    public final ArrayList B;
    public u61 C;
    public long D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public final RectF J;
    public int K;
    public int L;
    public final Paint M;
    public final ArrayList N;
    public final Rect O;
    public final Paint P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final y5 V;
    public final Path W;

    public long f34514a;

    public boolean f34515a0;

    public int f34516b;

    public int f34517c;
    public float d;

    public float f34518e;

    public float f34519f;
    public boolean h;

    public boolean f34520n;

    public boolean f34521r;

    public float f34522s;
    public float v;

    public boolean f34523w;

    public ParcelFileDescriptor f34524x;

    public MediaMetadataRetriever f34525y;

    public x61(Context context) {
        super(context);
        this.f34518e = 1.0f;
        this.f34522s = 0.5f;
        this.B = new ArrayList();
        this.H = 1.0f;
        this.I = 0.0f;
        this.J = new RectF();
        this.L = 0;
        this.M = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        Rect rect = new Rect();
        this.O = rect;
        Paint paint = new Paint(1);
        this.P = paint;
        Paint paint2 = new Paint(1);
        this.Q = paint2;
        Paint paint3 = new Paint(1);
        this.R = paint3;
        Paint paint4 = new Paint(1);
        this.S = paint4;
        Paint paint5 = new Paint(1);
        this.T = paint5;
        Paint paint6 = new Paint(1);
        this.U = paint6;
        this.V = new y5(0.0f, this, 0L, 200L, er.f28125j);
        this.W = new Path();
        paint.setColor(-1);
        paint2.setColor(-256);
        paint3.setColor(637534208);
        paint4.setColor(1291845632);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setColor(-16777216);
        arrayList.add(rect);
    }

    public final void a() {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever;
        synchronized (f34513b0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f34524x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f34524x = null;
                    try {
                        mediaMetadataRetriever = this.f34525y;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                            this.f34525y = null;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } else {
                    mediaMetadataRetriever = this.f34525y;
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                        this.f34525y = null;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            throw th;
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            v61 v61Var = (v61) this.B.get(i10);
            if (v61Var != null && (bitmap = v61Var.f33280a) != null) {
                bitmap.recycle();
            }
        }
        this.B.clear();
        u61 u61Var = this.C;
        if (u61Var != null) {
            u61Var.cancel(true);
            this.C = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f10, float f11, Canvas canvas, Paint paint) {
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = (getMeasuredWidth() - (fDpf2 * 2.0f)) - AndroidUtilities.dp(20.0f);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(46.0f) + fDp;
        float f12 = (1.0f - f11) * ((fDp2 - fDp) / 2.0f);
        float f13 = fDp + f12;
        float f14 = fDp2 - f12;
        Paint paint2 = this.R;
        paint2.setAlpha((int) (38.0f * f11));
        paint.setAlpha((int) (f11 * 255.0f));
        float fDp3 = (measuredWidth * f10) + fDpf2 + AndroidUtilities.dp(10.0f);
        float fDpf3 = fDp3 - AndroidUtilities.dpf2(1.5f);
        float fDpf4 = AndroidUtilities.dpf2(1.5f) + fDp3;
        RectF rectF = this.J;
        rectF.set(fDpf3, f13, fDpf4, f14);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(fDp3 - AndroidUtilities.dpf2(1.5f), f13, AndroidUtilities.dpf2(1.5f) + fDp3, f14);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    public final void d(int i10) {
        int i11;
        if (this.f34525y == null) {
            return;
        }
        if (i10 == 0) {
            this.F = AndroidUtilities.dp(38.0f);
            int i12 = this.f34516b;
            this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.F * Utilities.clamp((i12 == 0 || (i11 = this.f34517c) == 0) ? 1.0f : i12 / i11, 1.3333334f, 0.5625f))));
            this.E = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.G);
            this.D = this.f34514a / ((long) this.G);
        }
        u61 u61Var = new u61(this);
        this.C = u61Var;
        u61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f34514a);
    }

    public float getProgress() {
        return this.f34522s;
    }

    public float getRightProgress() {
        return this.f34518e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (fDpf2 * 2.0f);
        float fDp = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.d));
        float fDp2 = AndroidUtilities.dp(10.0f) + fDpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.f34518e));
        float fDp3 = AndroidUtilities.dp(6.0f);
        float fDp4 = fDp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.B;
        boolean zIsEmpty = arrayList.isEmpty();
        Path path = this.W;
        if (zIsEmpty && this.C == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDpf2, fDp3, measuredWidth + fDpf2, fDp4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f14 = fDp3;
            f13 = fDp2;
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f15 = measuredWidth + fDpf2;
            rectF2.set(fDpf2, fDp3, f15, fDp4);
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            boolean z10 = arrayList.size() < this.G;
            this.f34515a0 = z10;
            if (!z10) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((v61) arrayList.get(i10)).f33280a == null) {
                        this.f34515a0 = true;
                        break;
                    }
                }
            }
            if (this.f34515a0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(fDpf2, fDp3, AndroidUtilities.dp(4.0f) + f15, fDp4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                v61 v61Var = (v61) arrayList.get(i12);
                Bitmap bitmap = v61Var.f33280a;
                if (bitmap != null) {
                    float f16 = (this.E * i11) + fDpf2;
                    float fDp5 = AndroidUtilities.dp(6.0f);
                    float f17 = v61Var.f33281b;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.045714285f;
                        v61Var.f33281b = f18;
                        if (f18 > 1.0f) {
                            v61Var.f33281b = 1.0f;
                        } else {
                            invalidate();
                        }
                        int interpolation = (int) (er.h.getInterpolation(v61Var.f33281b) * 255.0f);
                        Paint paint = this.M;
                        paint.setAlpha(interpolation);
                        canvas.drawBitmap(bitmap, f16, fDp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f16, fDp5, (Paint) null);
                    }
                }
                i11++;
            }
            float fDp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.S;
            canvas.drawRect(fDpf2, fDp3, fDp, fDp6, paint2);
            canvas.drawRect(fDp2, fDp3, f15, fDp4, paint2);
            f13 = fDp2;
            f14 = fDp3;
            canvas.restore();
        }
        boolean z11 = this.f34523w;
        Paint paint3 = this.P;
        if (z11) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            float fDpf3 = fDp - AndroidUtilities.dpf2(f11);
            float fDpf4 = AndroidUtilities.dpf2(f11) + f13;
            RectF rectF4 = this.J;
            rectF4.set(fDpf3, f14, fDpf4, fDp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint3);
            rectF4.set(fDp, AndroidUtilities.dpf2(f10) + f14, f13, fDp4 - AndroidUtilities.dpf2(f10));
            canvas2.drawRect(rectF4, this.T);
            canvas2.restore();
            float fDp7 = AndroidUtilities.dp(f10);
            float fDp8 = AndroidUtilities.dp(f11);
            float fDpf5 = fDp - ((AndroidUtilities.dpf2(f11) - fDp7) / f10);
            float f19 = (((fDp4 - f14) - fDp8) / f10) + f14;
            float f20 = fDp8 + f19;
            rectF4.set(fDpf5, f19, fDpf5 - fDp7, f20);
            float fDpf6 = AndroidUtilities.dpf2(f12);
            float fDpf7 = AndroidUtilities.dpf2(f12);
            Paint paint4 = this.U;
            canvas2.drawRoundRect(rectF4, fDpf6, fDpf7, paint4);
            float fDpf8 = ((AndroidUtilities.dpf2(f11) - fDp7) / f10) + f13;
            rectF4.set(fDpf8, f19, fDp7 + fDpf8, f20);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint4);
        }
        float fD = this.V.d(0.0f, false);
        if (fD > 0.0f) {
            c(this.f34518e, fD, canvas2, paint3);
        }
        c(this.f34522s, 1.0f - fD, canvas2, paint3);
        if (this.f34523w) {
            c(this.f34519f, 1.0f, canvas2, this.Q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            this.O.set(i10, 0, i12, getMeasuredHeight());
            setSystemGestureExclusionRects(this.N);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.K != size) {
            int i12 = 0;
            while (true) {
                arrayList = this.B;
                if (i12 >= arrayList.size()) {
                    break;
                }
                v61 v61Var = (v61) arrayList.get(i12);
                if (v61Var != null && (bitmap = v61Var.f33280a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            u61 u61Var = this.C;
            if (u61Var != null) {
                u61Var.cancel(true);
                this.C = null;
            }
            invalidate();
            this.K = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f10 = measuredWidth;
            int iDp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f10));
            int iDp2 = AndroidUtilities.dp(22.0f) + ((int) (this.f34522s * f10));
            int iDp3 = AndroidUtilities.dp(22.0f) + ((int) (this.f34518e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f34525y != null) {
                    int iDp4 = AndroidUtilities.dp(16.0f);
                    int iDp5 = AndroidUtilities.dp(8.0f);
                    if (iDp3 != iDp && iDp2 - iDp5 <= x8 && x8 <= iDp5 + iDp2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var = this.A;
                        if (w61Var != null) {
                            ((com.google.android.gms.common.api.internal.v) w61Var).c(2);
                        }
                        this.f34521r = true;
                        this.v = (int) (x8 - iDp2);
                        invalidate();
                        return true;
                    }
                    if (iDp - iDp4 <= x8 && x8 <= Math.min(iDp + iDp4, iDp3) && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var2 = this.A;
                        if (w61Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) w61Var2).c(0);
                        }
                        this.h = true;
                        this.v = (int) (x8 - iDp);
                        invalidate();
                        return true;
                    }
                    if (iDp3 - iDp4 <= x8 && x8 <= iDp4 + iDp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var3 = this.A;
                        if (w61Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) w61Var3).c(1);
                        }
                        this.f34520n = true;
                        this.v = (int) (x8 - iDp3);
                        invalidate();
                        return true;
                    }
                    if (iDp <= x8 && x8 <= iDp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var4 = this.A;
                        if (w61Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) w61Var4).c(2);
                        }
                        this.f34521r = true;
                        float fDp = (x8 - AndroidUtilities.dp(16.0f)) / f10;
                        this.f34522s = fDp;
                        w61 w61Var5 = this.A;
                        if (w61Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) w61Var5;
                            PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                            if (photoViewer.B2 != null) {
                                if (photoViewer.Y1 == 1) {
                                    vVar.g(0);
                                }
                                vVar.f(fDp);
                            }
                        }
                        this.v = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.h) {
                    w61 w61Var6 = this.A;
                    if (w61Var6 != null) {
                        ((com.google.android.gms.common.api.internal.v) w61Var6).d(0);
                    }
                    this.h = false;
                    return true;
                }
                if (this.f34520n) {
                    w61 w61Var7 = this.A;
                    if (w61Var7 != null) {
                        ((com.google.android.gms.common.api.internal.v) w61Var7).d(1);
                    }
                    this.f34520n = false;
                    return true;
                }
                if (this.f34521r) {
                    w61 w61Var8 = this.A;
                    if (w61Var8 != null) {
                        ((com.google.android.gms.common.api.internal.v) w61Var8).d(2);
                    }
                    this.f34521r = false;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.f34521r) {
                    float fDp2 = (((int) (x8 - this.v)) - AndroidUtilities.dp(16.0f)) / f10;
                    this.f34522s = fDp2;
                    float f11 = this.d;
                    if (fDp2 < f11) {
                        this.f34522s = f11;
                    } else {
                        float f12 = this.f34518e;
                        if (fDp2 > f12) {
                            this.f34522s = f12;
                        }
                    }
                    w61 w61Var9 = this.A;
                    if (w61Var9 != null) {
                        float f13 = this.f34522s;
                        com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) w61Var9;
                        PhotoViewer photoViewer2 = (PhotoViewer) vVar2.d;
                        if (photoViewer2.B2 != null) {
                            if (photoViewer2.Y1 == 1) {
                                vVar2.g(0);
                            }
                            vVar2.f(f13);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i10 = (int) (x8 - this.v);
                    if (i10 < AndroidUtilities.dp(16.0f)) {
                        iDp3 = AndroidUtilities.dp(16.0f);
                    } else if (i10 <= iDp3) {
                        iDp3 = i10;
                    }
                    float fDp3 = (iDp3 - AndroidUtilities.dp(16.0f)) / f10;
                    this.d = fDp3;
                    float f14 = this.f34518e;
                    float f15 = f14 - fDp3;
                    float f16 = this.H;
                    if (f15 > f16) {
                        this.f34518e = fDp3 + f16;
                    } else {
                        float f17 = this.I;
                        if (f17 != 0.0f && f15 < f17) {
                            float f18 = f14 - f17;
                            this.d = f18;
                            if (f18 < 0.0f) {
                                this.d = 0.0f;
                            }
                        }
                    }
                    float f19 = this.d;
                    float f20 = this.f34522s;
                    if (f19 > f20) {
                        this.f34522s = f19;
                    } else {
                        float f21 = this.f34518e;
                        if (f21 < f20) {
                            this.f34522s = f21;
                        }
                    }
                    w61 w61Var10 = this.A;
                    if (w61Var10 != null) {
                        com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) w61Var10;
                        PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                        m61 m61Var = photoViewer3.B2;
                        if (m61Var != null) {
                            if (m61Var.z()) {
                                photoViewer3.D2 = false;
                                photoViewer3.B2.C();
                                photoViewer3.f35583a0.invalidate();
                            }
                            vVar3.g(1);
                            vVar3.f(f19);
                            photoViewer3.f35694m3.h(0.0f, false);
                            photoViewer3.N7.setProgress(f19);
                            photoViewer3.B3();
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.f34520n) {
                    int i11 = (int) (x8 - this.v);
                    if (i11 >= iDp) {
                        iDp = i11 > AndroidUtilities.dp(16.0f) + measuredWidth ? AndroidUtilities.dp(16.0f) + measuredWidth : i11;
                    }
                    float fDp4 = (iDp - AndroidUtilities.dp(16.0f)) / f10;
                    this.f34518e = fDp4;
                    float f22 = this.d;
                    float f23 = fDp4 - f22;
                    float f24 = this.H;
                    if (f23 > f24) {
                        this.d = fDp4 - f24;
                    } else {
                        float f25 = this.I;
                        if (f25 != 0.0f && f23 < f25) {
                            float f26 = f22 + f25;
                            this.f34518e = f26;
                            if (f26 > 1.0f) {
                                this.f34518e = 1.0f;
                            }
                        }
                    }
                    float f27 = this.d;
                    float f28 = this.f34522s;
                    if (f27 > f28) {
                        this.f34522s = f27;
                    } else {
                        float f29 = this.f34518e;
                        if (f29 < f28) {
                            this.f34522s = f29;
                        }
                    }
                    w61 w61Var11 = this.A;
                    if (w61Var11 != null) {
                        ((com.google.android.gms.common.api.internal.v) w61Var11).e(this.f34518e);
                    }
                    invalidate();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void setDelegate(w61 w61Var) {
        this.A = w61Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.f34518e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.f34518e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.I = f10;
    }

    public void setMode(int i10) {
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        invalidate();
    }

    public void setProgress(float f10) {
        if (this.f34523w && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f34519f;
        }
        long j10 = this.f34514a;
        float f11 = j10 != 0 ? 240.0f / j10 : 0.0f;
        float f12 = this.f34522s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.f34518e) {
            this.V.d(1.0f, true);
        }
        this.f34522s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.f34518e = f10;
        w61 w61Var = this.A;
        if (w61Var != null) {
            ((com.google.android.gms.common.api.internal.v) w61Var).c(1);
        }
        w61 w61Var2 = this.A;
        if (w61Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) w61Var2).e(this.f34518e);
        }
        w61 w61Var3 = this.A;
        if (w61Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) w61Var3).d(1);
        }
        invalidate();
    }
}
