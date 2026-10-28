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
public abstract class e91 extends View {
    public static final Object f27755f0 = new Object();
    public d91 E;
    public final ArrayList F;
    public b91 G;
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
    public long f27756a;
    public final Paint f27757a0;
    public int f27758b;
    public final Paint f27759b0;
    public int f27760c;
    public final h6 f27761c0;
    public float d;
    public final Path f27762d0;
    public float e;
    public boolean f27763e0;
    public float f27764f;
    public boolean h;
    public boolean f27765n;
    public boolean f27766r;
    public float f27767s;
    public float v;
    public boolean f27768w;
    public ParcelFileDescriptor f27769x;
    public MediaMetadataRetriever f27770y;

    public e91(Context context) {
        super(context);
        this.e = 1.0f;
        this.f27767s = 0.5f;
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
        this.f27757a0 = paint5;
        Paint paint6 = new Paint(1);
        this.f27759b0 = paint6;
        this.f27761c0 = new h6(0.0f, this, 0L, 200L, ds.f27533j);
        this.f27762d0 = new Path();
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
        synchronized (f27755f0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f27769x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f27769x = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f27770y;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f27770y = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            c91 c91Var = (c91) this.F.get(i10);
            if (c91Var != null && (bitmap = c91Var.f27108a) != null) {
                bitmap.recycle();
            }
        }
        this.F.clear();
        b91 b91Var = this.G;
        if (b91Var != null) {
            b91Var.cancel(true);
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
        if (this.f27770y == null) {
            return;
        }
        if (i10 == 0) {
            this.J = AndroidUtilities.dp(38.0f);
            int i12 = this.f27758b;
            if (i12 != 0 && (i11 = this.f27760c) != 0) {
                f7 = i12 / i11;
            } else {
                f7 = 1.0f;
            }
            this.K = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.J * Utilities.clamp(f7, 1.3333334f, 0.5625f))));
            this.I = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.K);
            this.H = this.f27756a / this.K;
        }
        b91 b91Var = new b91(this);
        this.G = b91Var;
        b91Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f27756a);
    }

    public float getProgress() {
        return this.f27767s;
    }

    public float getRightProgress() {
        return this.e;
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
        float dp2 = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.e));
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = dp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f27762d0;
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
            this.f27763e0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((c91) arrayList.get(i10)).f27108a == null) {
                        this.f27763e0 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (this.f27763e0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(dpf2, dp3, AndroidUtilities.dp(4.0f) + f15, dp4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                c91 c91Var = (c91) arrayList.get(i12);
                Bitmap bitmap = c91Var.f27108a;
                if (bitmap != null) {
                    float f16 = (this.I * i11) + dpf2;
                    float dp5 = AndroidUtilities.dp(6.0f);
                    float f17 = c91Var.f27109b;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.045714285f;
                        c91Var.f27109b = f18;
                        if (f18 > 1.0f) {
                            c91Var.f27109b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.Q;
                        paint.setAlpha((int) (ds.h.getInterpolation(c91Var.f27109b) * 255.0f));
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
        boolean z11 = this.f27768w;
        Paint paint3 = this.T;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.N;
            rectF4.set(f12 - AndroidUtilities.dpf2(f10), f14, AndroidUtilities.dpf2(f10) + f13, dp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint3);
            rectF4.set(f12, AndroidUtilities.dpf2(f7) + f14, f13, dp4 - AndroidUtilities.dpf2(f7));
            canvas2.drawRect(rectF4, this.f27757a0);
            canvas2.restore();
            float dp7 = AndroidUtilities.dp(f7);
            float dp8 = AndroidUtilities.dp(f10);
            float dpf22 = f12 - ((AndroidUtilities.dpf2(f10) - dp7) / f7);
            float f19 = (((dp4 - f14) - dp8) / f7) + f14;
            float f20 = dp8 + f19;
            rectF4.set(dpf22, f19, dpf22 - dp7, f20);
            float dpf23 = AndroidUtilities.dpf2(f11);
            float dpf24 = AndroidUtilities.dpf2(f11);
            Paint paint4 = this.f27759b0;
            canvas2.drawRoundRect(rectF4, dpf23, dpf24, paint4);
            float dpf25 = ((AndroidUtilities.dpf2(f10) - dp7) / f7) + f13;
            rectF4.set(dpf25, f19, dp7 + dpf25, f20);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint4);
        } else {
            canvas2 = canvas;
        }
        float d = this.f27761c0.d(0.0f, false);
        if (d > 0.0f) {
            c(this.e, d, canvas2, paint3);
        }
        c(this.f27767s, 1.0f - d, canvas2, paint3);
        if (this.f27768w) {
            c(this.f27764f, 1.0f, canvas2, this.U);
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
                c91 c91Var = (c91) arrayList.get(i12);
                if (c91Var != null && (bitmap = c91Var.f27108a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            b91 b91Var = this.G;
            if (b91Var != null) {
                b91Var.cancel(true);
                this.G = null;
            }
            invalidate();
            this.O = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f7 = measuredWidth;
            int dp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f7));
            int dp2 = AndroidUtilities.dp(22.0f) + ((int) (this.f27767s * f7));
            int dp3 = AndroidUtilities.dp(22.0f) + ((int) (this.e * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f27770y != null) {
                    int dp4 = AndroidUtilities.dp(16.0f);
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (dp3 != dp && dp2 - dp5 <= x9 && x9 <= dp5 + dp2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        d91 d91Var = this.E;
                        if (d91Var != null) {
                            ((com.google.android.gms.common.api.internal.u) d91Var).c(2);
                        }
                        this.f27766r = true;
                        this.v = (int) (x9 - dp2);
                        invalidate();
                        return true;
                    } else if (dp - dp4 <= x9 && x9 <= Math.min(dp + dp4, dp3) && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        d91 d91Var2 = this.E;
                        if (d91Var2 != null) {
                            ((com.google.android.gms.common.api.internal.u) d91Var2).c(0);
                        }
                        this.h = true;
                        this.v = (int) (x9 - dp);
                        invalidate();
                        return true;
                    } else if (dp3 - dp4 <= x9 && x9 <= dp4 + dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        d91 d91Var3 = this.E;
                        if (d91Var3 != null) {
                            ((com.google.android.gms.common.api.internal.u) d91Var3).c(1);
                        }
                        this.f27765n = true;
                        this.v = (int) (x9 - dp3);
                        invalidate();
                        return true;
                    } else if (dp <= x9 && x9 <= dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        d91 d91Var4 = this.E;
                        if (d91Var4 != null) {
                            ((com.google.android.gms.common.api.internal.u) d91Var4).c(2);
                        }
                        this.f27766r = true;
                        float dp6 = (x9 - AndroidUtilities.dp(16.0f)) / f7;
                        this.f27767s = dp6;
                        d91 d91Var5 = this.E;
                        if (d91Var5 != null) {
                            com.google.android.gms.common.api.internal.u uVar = (com.google.android.gms.common.api.internal.u) d91Var5;
                            PhotoViewer photoViewer = (PhotoViewer) uVar.d;
                            if (photoViewer.F2 != null) {
                                if (photoViewer.f35654c2 == 1) {
                                    uVar.j(0);
                                }
                                uVar.h(dp6);
                            }
                        }
                        this.v = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f27766r) {
                        float dp7 = (((int) (x9 - this.v)) - AndroidUtilities.dp(16.0f)) / f7;
                        this.f27767s = dp7;
                        float f10 = this.d;
                        if (dp7 < f10) {
                            this.f27767s = f10;
                        } else {
                            float f11 = this.e;
                            if (dp7 > f11) {
                                this.f27767s = f11;
                            }
                        }
                        d91 d91Var6 = this.E;
                        if (d91Var6 != null) {
                            float f12 = this.f27767s;
                            com.google.android.gms.common.api.internal.u uVar2 = (com.google.android.gms.common.api.internal.u) d91Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) uVar2.d;
                            if (photoViewer2.F2 != null) {
                                if (photoViewer2.f35654c2 == 1) {
                                    uVar2.j(0);
                                }
                                uVar2.h(f12);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x9 - this.v);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp3 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp3) {
                            dp3 = i10;
                        }
                        float dp8 = (dp3 - AndroidUtilities.dp(16.0f)) / f7;
                        this.d = dp8;
                        float f13 = this.e;
                        float f14 = f13 - dp8;
                        float f15 = this.L;
                        if (f14 > f15) {
                            this.e = dp8 + f15;
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
                        float f19 = this.f27767s;
                        if (f18 > f19) {
                            this.f27767s = f18;
                        } else {
                            float f20 = this.e;
                            if (f20 < f19) {
                                this.f27767s = f20;
                            }
                        }
                        d91 d91Var7 = this.E;
                        if (d91Var7 != null) {
                            com.google.android.gms.common.api.internal.u uVar3 = (com.google.android.gms.common.api.internal.u) d91Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) uVar3.d;
                            t81 t81Var = photoViewer3.F2;
                            if (t81Var != null) {
                                if (t81Var.y()) {
                                    photoViewer3.H2 = false;
                                    photoViewer3.F2.B();
                                    photoViewer3.f35670e0.invalidate();
                                }
                                uVar3.j(1);
                                uVar3.h(f18);
                                photoViewer3.f35778q3.h(0.0f, false);
                                photoViewer3.S7.setProgress(f18);
                                photoViewer3.E3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f27765n) {
                        int i11 = (int) (x9 - this.v);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp9 = (dp - AndroidUtilities.dp(16.0f)) / f7;
                        this.e = dp9;
                        float f21 = this.d;
                        float f22 = dp9 - f21;
                        float f23 = this.L;
                        if (f22 > f23) {
                            this.d = dp9 - f23;
                        } else {
                            float f24 = this.M;
                            if (f24 != 0.0f && f22 < f24) {
                                float f25 = f21 + f24;
                                this.e = f25;
                                if (f25 > 1.0f) {
                                    this.e = 1.0f;
                                }
                            }
                        }
                        float f26 = this.d;
                        float f27 = this.f27767s;
                        if (f26 > f27) {
                            this.f27767s = f26;
                        } else {
                            float f28 = this.e;
                            if (f28 < f27) {
                                this.f27767s = f28;
                            }
                        }
                        d91 d91Var8 = this.E;
                        if (d91Var8 != null) {
                            ((com.google.android.gms.common.api.internal.u) d91Var8).f(this.e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                d91 d91Var9 = this.E;
                if (d91Var9 != null) {
                    ((com.google.android.gms.common.api.internal.u) d91Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f27765n) {
                d91 d91Var10 = this.E;
                if (d91Var10 != null) {
                    ((com.google.android.gms.common.api.internal.u) d91Var10).d(1);
                }
                this.f27765n = false;
                return true;
            } else if (this.f27766r) {
                d91 d91Var11 = this.E;
                if (d91Var11 != null) {
                    ((com.google.android.gms.common.api.internal.u) d91Var11).d(2);
                }
                this.f27766r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(d91 d91Var) {
        this.E = d91Var;
    }

    public void setMaxProgressDiff(float f7) {
        this.L = f7;
        float f10 = this.e;
        float f11 = this.d;
        if (f10 - f11 > f7) {
            this.e = f11 + f7;
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
        if (this.f27768w && (f7 <= 0.0f || f7 >= 1.0f)) {
            f7 = this.f27764f;
        }
        long j10 = this.f27756a;
        if (j10 != 0) {
            f10 = 240.0f / ((float) j10);
        }
        float f11 = this.f27767s;
        if (f7 < f11 && f7 <= this.d + f10 && f11 + f10 >= this.e) {
            this.f27761c0.d(1.0f, true);
        }
        this.f27767s = f7;
        invalidate();
    }

    public void setRightProgress(float f7) {
        this.e = f7;
        d91 d91Var = this.E;
        if (d91Var != null) {
            ((com.google.android.gms.common.api.internal.u) d91Var).c(1);
        }
        d91 d91Var2 = this.E;
        if (d91Var2 != null) {
            ((com.google.android.gms.common.api.internal.u) d91Var2).f(this.e);
        }
        d91 d91Var3 = this.E;
        if (d91Var3 != null) {
            ((com.google.android.gms.common.api.internal.u) d91Var3).d(1);
        }
        invalidate();
    }
}
