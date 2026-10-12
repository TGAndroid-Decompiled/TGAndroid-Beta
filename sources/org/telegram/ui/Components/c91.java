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
public abstract class c91 extends View {
    public static final Object f24869f0 = new Object();
    public b91 E;
    public final ArrayList F;
    public z81 G;
    public long H;
    public int I;
    public int J;
    public int K;
    public float L;
    public float M;
    public final RectF N;
    public int O;
    public int P;
    public final Paint Q;
    public final ArrayList R;
    public final Rect S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public long f24870a;
    public final Paint f24871a0;
    public int f24872b;
    public final Paint f24873b0;
    public int f24874c;
    public final g6 f24875c0;
    public float d;
    public final Path f24876d0;
    public float f24877e;
    public boolean f24878e0;
    public float f24879f;
    public boolean h;
    public boolean f24880n;
    public boolean f24881r;
    public float f24882s;
    public float v;
    public boolean f24883w;
    public ParcelFileDescriptor f24884x;
    public MediaMetadataRetriever f24885y;

    public c91(Context context) {
        super(context);
        this.f24877e = 1.0f;
        this.f24882s = 0.5f;
        this.F = new ArrayList();
        this.L = 1.0f;
        this.M = 0.0f;
        this.N = new RectF();
        this.P = 0;
        this.Q = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.R = arrayList;
        Rect rect = new Rect();
        this.S = rect;
        Paint paint = new Paint(1);
        this.T = paint;
        Paint paint2 = new Paint(1);
        this.U = paint2;
        Paint paint3 = new Paint(1);
        this.V = paint3;
        Paint paint4 = new Paint(1);
        this.W = paint4;
        Paint paint5 = new Paint(1);
        this.f24871a0 = paint5;
        Paint paint6 = new Paint(1);
        this.f24873b0 = paint6;
        this.f24875c0 = new g6(0.0f, this, 0L, 200L, js.f27637j);
        this.f24876d0 = new Path();
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
        synchronized (f24869f0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f24884x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f24884x = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f24885y;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f24885y = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            a91 a91Var = (a91) this.F.get(i10);
            if (a91Var != null && (bitmap = a91Var.f24264a) != null) {
                bitmap.recycle();
            }
        }
        this.F.clear();
        z81 z81Var = this.G;
        if (z81Var != null) {
            z81Var.cancel(true);
            this.G = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f7, float f10, Canvas canvas, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(46.0f) + dp;
        float f11 = (1.0f - f10) * ((dp2 - dp) / 2.0f);
        float f12 = dp + f11;
        float f13 = dp2 - f11;
        Paint paint2 = this.V;
        paint2.setAlpha((int) (38.0f * f10));
        paint.setAlpha((int) (f10 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (dpf2 * 2.0f)) - AndroidUtilities.dp(20.0f)) * f7) + dpf2 + AndroidUtilities.dp(10.0f);
        RectF rectF = this.N;
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f12, AndroidUtilities.dpf2(1.5f) + measuredWidth, f13);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f12, AndroidUtilities.dpf2(1.5f) + measuredWidth, f13);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    public final void d(int i10) {
        float f7;
        int i11;
        if (this.f24885y == null) {
            return;
        }
        if (i10 == 0) {
            this.J = AndroidUtilities.dp(38.0f);
            int i12 = this.f24872b;
            if (i12 != 0 && (i11 = this.f24874c) != 0) {
                f7 = i12 / i11;
            } else {
                f7 = 1.0f;
            }
            this.K = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.J * Utilities.clamp(f7, 1.3333334f, 0.5625f))));
            this.I = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.K);
            this.H = this.f24870a / this.K;
        }
        z81 z81Var = new z81(this);
        this.G = z81Var;
        z81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f24870a);
    }

    public float getProgress() {
        return this.f24882s;
    }

    public float getRightProgress() {
        return this.f24877e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (dpf2 * 2.0f);
        float dp = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.d));
        float dp2 = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.f24877e));
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = dp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f24876d0;
        if (isEmpty && this.G == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dpf2, dp3, measuredWidth + dpf2, dp4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f7 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
            f12 = dp;
            f14 = dp3;
            f13 = dp2;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f15 = measuredWidth + dpf2;
            rectF2.set(dpf2, dp3, f15, dp4);
            f7 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.K) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f24878e0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((a91) arrayList.get(i10)).f24264a == null) {
                        this.f24878e0 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (this.f24878e0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(dpf2, dp3, AndroidUtilities.dp(4.0f) + f15, dp4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                a91 a91Var = (a91) arrayList.get(i12);
                Bitmap bitmap = a91Var.f24264a;
                if (bitmap != null) {
                    float f16 = (this.I * i11) + dpf2;
                    float dp5 = AndroidUtilities.dp(6.0f);
                    float f17 = a91Var.f24265b;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.045714285f;
                        a91Var.f24265b = f18;
                        if (f18 > 1.0f) {
                            a91Var.f24265b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.Q;
                        paint.setAlpha((int) (js.h.getInterpolation(a91Var.f24265b) * 255.0f));
                        canvas.drawBitmap(bitmap, f16, dp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f16, dp5, (Paint) null);
                    }
                }
                i11++;
            }
            float dp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.W;
            canvas.drawRect(dpf2, dp3, dp, dp6, paint2);
            f12 = dp;
            canvas.drawRect(dp2, dp3, f15, dp4, paint2);
            f13 = dp2;
            f14 = dp3;
            canvas.restore();
        }
        boolean z11 = this.f24883w;
        Paint paint3 = this.T;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.N;
            rectF4.set(f12 - AndroidUtilities.dpf2(f10), f14, AndroidUtilities.dpf2(f10) + f13, dp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint3);
            rectF4.set(f12, AndroidUtilities.dpf2(f7) + f14, f13, dp4 - AndroidUtilities.dpf2(f7));
            canvas2.drawRect(rectF4, this.f24871a0);
            canvas2.restore();
            float dp7 = AndroidUtilities.dp(f7);
            float dp8 = AndroidUtilities.dp(f10);
            float dpf22 = f12 - ((AndroidUtilities.dpf2(f10) - dp7) / f7);
            float f19 = (((dp4 - f14) - dp8) / f7) + f14;
            float f20 = dp8 + f19;
            rectF4.set(dpf22, f19, dpf22 - dp7, f20);
            float dpf23 = AndroidUtilities.dpf2(f11);
            float dpf24 = AndroidUtilities.dpf2(f11);
            Paint paint4 = this.f24873b0;
            canvas2.drawRoundRect(rectF4, dpf23, dpf24, paint4);
            float dpf25 = ((AndroidUtilities.dpf2(f10) - dp7) / f7) + f13;
            rectF4.set(dpf25, f19, dp7 + dpf25, f20);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint4);
        } else {
            canvas2 = canvas;
        }
        float d = this.f24875c0.d(0.0f, false);
        if (d > 0.0f) {
            c(this.f24877e, d, canvas2, paint3);
        }
        c(this.f24882s, 1.0f - d, canvas2, paint3);
        if (this.f24883w) {
            c(this.f24879f, 1.0f, canvas2, this.U);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            this.S.set(i10, 0, i12, getMeasuredHeight());
            setSystemGestureExclusionRects(this.R);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.O != size) {
            int i12 = 0;
            while (true) {
                arrayList = this.F;
                if (i12 >= arrayList.size()) {
                    break;
                }
                a91 a91Var = (a91) arrayList.get(i12);
                if (a91Var != null && (bitmap = a91Var.f24264a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            z81 z81Var = this.G;
            if (z81Var != null) {
                z81Var.cancel(true);
                this.G = null;
            }
            invalidate();
            this.O = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f7 = measuredWidth;
            int dp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f7));
            int dp2 = AndroidUtilities.dp(22.0f) + ((int) (this.f24882s * f7));
            int dp3 = AndroidUtilities.dp(22.0f) + ((int) (this.f24877e * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f24885y != null) {
                    int dp4 = AndroidUtilities.dp(16.0f);
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (dp3 != dp && dp2 - dp5 <= x10 && x10 <= dp5 + dp2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        b91 b91Var = this.E;
                        if (b91Var != null) {
                            ((com.google.android.gms.common.api.internal.v) b91Var).c(2);
                        }
                        this.f24881r = true;
                        this.v = (int) (x10 - dp2);
                        invalidate();
                        return true;
                    } else if (dp - dp4 <= x10 && x10 <= Math.min(dp + dp4, dp3) && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        b91 b91Var2 = this.E;
                        if (b91Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) b91Var2).c(0);
                        }
                        this.h = true;
                        this.v = (int) (x10 - dp);
                        invalidate();
                        return true;
                    } else if (dp3 - dp4 <= x10 && x10 <= dp4 + dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        b91 b91Var3 = this.E;
                        if (b91Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) b91Var3).c(1);
                        }
                        this.f24880n = true;
                        this.v = (int) (x10 - dp3);
                        invalidate();
                        return true;
                    } else if (dp <= x10 && x10 <= dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        b91 b91Var4 = this.E;
                        if (b91Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) b91Var4).c(2);
                        }
                        this.f24881r = true;
                        float dp6 = (x10 - AndroidUtilities.dp(16.0f)) / f7;
                        this.f24882s = dp6;
                        b91 b91Var5 = this.E;
                        if (b91Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) b91Var5;
                            PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                            if (photoViewer.F2 != null) {
                                if (photoViewer.f33726c2 == 1) {
                                    vVar.j(0);
                                }
                                vVar.h(dp6);
                            }
                        }
                        this.v = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f24881r) {
                        float dp7 = (((int) (x10 - this.v)) - AndroidUtilities.dp(16.0f)) / f7;
                        this.f24882s = dp7;
                        float f10 = this.d;
                        if (dp7 < f10) {
                            this.f24882s = f10;
                        } else {
                            float f11 = this.f24877e;
                            if (dp7 > f11) {
                                this.f24882s = f11;
                            }
                        }
                        b91 b91Var6 = this.E;
                        if (b91Var6 != null) {
                            float f12 = this.f24882s;
                            com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) b91Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) vVar2.d;
                            if (photoViewer2.F2 != null) {
                                if (photoViewer2.f33726c2 == 1) {
                                    vVar2.j(0);
                                }
                                vVar2.h(f12);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.v);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp3 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp3) {
                            dp3 = i10;
                        }
                        float dp8 = (dp3 - AndroidUtilities.dp(16.0f)) / f7;
                        this.d = dp8;
                        float f13 = this.f24877e;
                        float f14 = f13 - dp8;
                        float f15 = this.L;
                        if (f14 > f15) {
                            this.f24877e = dp8 + f15;
                        } else {
                            float f16 = this.M;
                            if (f16 != 0.0f && f14 < f16) {
                                float f17 = f13 - f16;
                                this.d = f17;
                                if (f17 < 0.0f) {
                                    this.d = 0.0f;
                                }
                            }
                        }
                        float f18 = this.d;
                        float f19 = this.f24882s;
                        if (f18 > f19) {
                            this.f24882s = f18;
                        } else {
                            float f20 = this.f24877e;
                            if (f20 < f19) {
                                this.f24882s = f20;
                            }
                        }
                        b91 b91Var7 = this.E;
                        if (b91Var7 != null) {
                            com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) b91Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                            q81 q81Var = photoViewer3.F2;
                            if (q81Var != null) {
                                if (q81Var.y()) {
                                    photoViewer3.H2 = false;
                                    photoViewer3.F2.B();
                                    photoViewer3.f33743e0.invalidate();
                                }
                                vVar3.j(1);
                                vVar3.h(f18);
                                photoViewer3.f33849q3.h(0.0f, false);
                                photoViewer3.S7.setProgress(f18);
                                photoViewer3.B3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f24880n) {
                        int i11 = (int) (x10 - this.v);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp9 = (dp - AndroidUtilities.dp(16.0f)) / f7;
                        this.f24877e = dp9;
                        float f21 = this.d;
                        float f22 = dp9 - f21;
                        float f23 = this.L;
                        if (f22 > f23) {
                            this.d = dp9 - f23;
                        } else {
                            float f24 = this.M;
                            if (f24 != 0.0f && f22 < f24) {
                                float f25 = f21 + f24;
                                this.f24877e = f25;
                                if (f25 > 1.0f) {
                                    this.f24877e = 1.0f;
                                }
                            }
                        }
                        float f26 = this.d;
                        float f27 = this.f24882s;
                        if (f26 > f27) {
                            this.f24882s = f26;
                        } else {
                            float f28 = this.f24877e;
                            if (f28 < f27) {
                                this.f24882s = f28;
                            }
                        }
                        b91 b91Var8 = this.E;
                        if (b91Var8 != null) {
                            ((com.google.android.gms.common.api.internal.v) b91Var8).f(this.f24877e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                b91 b91Var9 = this.E;
                if (b91Var9 != null) {
                    ((com.google.android.gms.common.api.internal.v) b91Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f24880n) {
                b91 b91Var10 = this.E;
                if (b91Var10 != null) {
                    ((com.google.android.gms.common.api.internal.v) b91Var10).d(1);
                }
                this.f24880n = false;
                return true;
            } else if (this.f24881r) {
                b91 b91Var11 = this.E;
                if (b91Var11 != null) {
                    ((com.google.android.gms.common.api.internal.v) b91Var11).d(2);
                }
                this.f24881r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(b91 b91Var) {
        this.E = b91Var;
    }

    public void setMaxProgressDiff(float f7) {
        this.L = f7;
        float f10 = this.f24877e;
        float f11 = this.d;
        if (f10 - f11 > f7) {
            this.f24877e = f11 + f7;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f7) {
        this.M = f7;
    }

    public void setMode(int i10) {
        if (this.P == i10) {
            return;
        }
        this.P = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        float f10 = 0.0f;
        if (this.f24883w && (f7 <= 0.0f || f7 >= 1.0f)) {
            f7 = this.f24879f;
        }
        long j3 = this.f24870a;
        if (j3 != 0) {
            f10 = 240.0f / ((float) j3);
        }
        float f11 = this.f24882s;
        if (f7 < f11 && f7 <= this.d + f10 && f11 + f10 >= this.f24877e) {
            this.f24875c0.d(1.0f, true);
        }
        this.f24882s = f7;
        invalidate();
    }

    public void setRightProgress(float f7) {
        this.f24877e = f7;
        b91 b91Var = this.E;
        if (b91Var != null) {
            ((com.google.android.gms.common.api.internal.v) b91Var).c(1);
        }
        b91 b91Var2 = this.E;
        if (b91Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) b91Var2).f(this.f24877e);
        }
        b91 b91Var3 = this.E;
        if (b91Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) b91Var3).d(1);
        }
        invalidate();
    }
}
