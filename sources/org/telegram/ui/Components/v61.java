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
public abstract class v61 extends View {
    public static final Object f33281b0 = new Object();
    public u61 A;
    public final ArrayList B;
    public s61 C;
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
    public long f33282a;
    public boolean f33283a0;
    public int f33284b;
    public int f33285c;
    public float d;
    public float f33286e;
    public float f33287f;
    public boolean h;
    public boolean f33288n;
    public boolean f33289r;
    public float f33290s;
    public float v;
    public boolean f33291w;
    public ParcelFileDescriptor f33292x;
    public MediaMetadataRetriever f33293y;

    public v61(Context context) {
        super(context);
        this.f33286e = 1.0f;
        this.f33290s = 0.5f;
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
        this.V = new y5(0.0f, this, 0L, 200L, gr.f28847j);
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
        synchronized (f33281b0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f33292x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f33292x = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f33293y;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f33293y = null;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        for (int i9 = 0; i9 < this.B.size(); i9++) {
            t61 t61Var = (t61) this.B.get(i9);
            if (t61Var != null && (bitmap = t61Var.f32634a) != null) {
                bitmap.recycle();
            }
        }
        this.B.clear();
        s61 s61Var = this.C;
        if (s61Var != null) {
            s61Var.cancel(true);
            this.C = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f10, float f11, Canvas canvas, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(46.0f) + dp;
        float f12 = (1.0f - f11) * ((dp2 - dp) / 2.0f);
        float f13 = dp + f12;
        float f14 = dp2 - f12;
        Paint paint2 = this.R;
        paint2.setAlpha((int) (38.0f * f11));
        paint.setAlpha((int) (f11 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (dpf2 * 2.0f)) - AndroidUtilities.dp(20.0f)) * f10) + dpf2 + AndroidUtilities.dp(10.0f);
        RectF rectF = this.J;
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f13, AndroidUtilities.dpf2(1.5f) + measuredWidth, f14);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f13, AndroidUtilities.dpf2(1.5f) + measuredWidth, f14);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    public final void d(int i9) {
        float f10;
        int i10;
        if (this.f33293y == null) {
            return;
        }
        if (i9 == 0) {
            this.F = AndroidUtilities.dp(38.0f);
            int i11 = this.f33284b;
            if (i11 != 0 && (i10 = this.f33285c) != 0) {
                f10 = i11 / i10;
            } else {
                f10 = 1.0f;
            }
            this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.F * Utilities.clamp(f10, 1.3333334f, 0.5625f))));
            this.E = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.G);
            this.D = this.f33282a / this.G;
        }
        s61 s61Var = new s61(this);
        this.C = s61Var;
        s61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i9), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f33282a);
    }

    public float getProgress() {
        return this.f33290s;
    }

    public float getRightProgress() {
        return this.f33286e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        float f15;
        Canvas canvas2;
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float measuredWidth = getMeasuredWidth() - (dpf2 * 2.0f);
        float dp = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.d));
        float dp2 = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.f33286e));
        float dp3 = AndroidUtilities.dp(6.0f);
        float dp4 = dp3 + AndroidUtilities.dp(38.0f);
        ArrayList arrayList = this.B;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.W;
        if (isEmpty && this.C == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dpf2, dp3, measuredWidth + dpf2, dp4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f13 = dp;
            f15 = dp3;
            f14 = dp2;
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f16 = measuredWidth + dpf2;
            rectF2.set(dpf2, dp3, f16, dp4);
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.G) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33283a0 = z10;
            if (!z10) {
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    } else if (((t61) arrayList.get(i9)).f32634a == null) {
                        this.f33283a0 = true;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            if (this.f33283a0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(dpf2, dp3, AndroidUtilities.dp(4.0f) + f16, dp4);
                b(canvas, rectF3);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t61 t61Var = (t61) arrayList.get(i11);
                Bitmap bitmap = t61Var.f32634a;
                if (bitmap != null) {
                    float f17 = (this.E * i10) + dpf2;
                    float dp5 = AndroidUtilities.dp(6.0f);
                    float f18 = t61Var.f32635b;
                    if (f18 != 1.0f) {
                        float f19 = f18 + 0.045714285f;
                        t61Var.f32635b = f19;
                        if (f19 > 1.0f) {
                            t61Var.f32635b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.M;
                        paint.setAlpha((int) (gr.h.getInterpolation(t61Var.f32635b) * 255.0f));
                        canvas.drawBitmap(bitmap, f17, dp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f17, dp5, (Paint) null);
                    }
                }
                i10++;
            }
            float dp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.S;
            canvas.drawRect(dpf2, dp3, dp, dp6, paint2);
            f13 = dp;
            canvas.drawRect(dp2, dp3, f16, dp4, paint2);
            f14 = dp2;
            f15 = dp3;
            canvas.restore();
        }
        boolean z11 = this.f33291w;
        Paint paint3 = this.P;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.J;
            rectF4.set(f13 - AndroidUtilities.dpf2(f11), f15, AndroidUtilities.dpf2(f11) + f14, dp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint3);
            rectF4.set(f13, AndroidUtilities.dpf2(f10) + f15, f14, dp4 - AndroidUtilities.dpf2(f10));
            canvas2.drawRect(rectF4, this.T);
            canvas2.restore();
            float dp7 = AndroidUtilities.dp(f10);
            float dp8 = AndroidUtilities.dp(f11);
            float dpf22 = f13 - ((AndroidUtilities.dpf2(f11) - dp7) / f10);
            float f20 = (((dp4 - f15) - dp8) / f10) + f15;
            float f21 = dp8 + f20;
            rectF4.set(dpf22, f20, dpf22 - dp7, f21);
            float dpf23 = AndroidUtilities.dpf2(f12);
            float dpf24 = AndroidUtilities.dpf2(f12);
            Paint paint4 = this.U;
            canvas2.drawRoundRect(rectF4, dpf23, dpf24, paint4);
            float dpf25 = ((AndroidUtilities.dpf2(f11) - dp7) / f10) + f14;
            rectF4.set(dpf25, f20, dp7 + dpf25, f21);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f12), paint4);
        } else {
            canvas2 = canvas;
        }
        float d = this.V.d(0.0f, false);
        if (d > 0.0f) {
            c(this.f33286e, d, canvas2, paint3);
        }
        c(this.f33290s, 1.0f - d, canvas2, paint3);
        if (this.f33291w) {
            c(this.f33287f, 1.0f, canvas2, this.Q);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            this.O.set(i9, 0, i11, getMeasuredHeight());
            setSystemGestureExclusionRects(this.N);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        if (this.K != size) {
            int i11 = 0;
            while (true) {
                arrayList = this.B;
                if (i11 >= arrayList.size()) {
                    break;
                }
                t61 t61Var = (t61) arrayList.get(i11);
                if (t61Var != null && (bitmap = t61Var.f32634a) != null) {
                    bitmap.recycle();
                }
                i11++;
            }
            arrayList.clear();
            s61 s61Var = this.C;
            if (s61Var != null) {
                s61Var.cancel(true);
                this.C = null;
            }
            invalidate();
            this.K = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f10 = measuredWidth;
            int dp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f10));
            int dp2 = AndroidUtilities.dp(22.0f) + ((int) (this.f33290s * f10));
            int dp3 = AndroidUtilities.dp(22.0f) + ((int) (this.f33286e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f33293y != null) {
                    int dp4 = AndroidUtilities.dp(16.0f);
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (dp3 != dp && dp2 - dp5 <= x10 && x10 <= dp5 + dp2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        u61 u61Var = this.A;
                        if (u61Var != null) {
                            ((com.google.android.gms.common.api.internal.v) u61Var).c(2);
                        }
                        this.f33289r = true;
                        this.v = (int) (x10 - dp2);
                        invalidate();
                        return true;
                    } else if (dp - dp4 <= x10 && x10 <= Math.min(dp + dp4, dp3) && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        u61 u61Var2 = this.A;
                        if (u61Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) u61Var2).c(0);
                        }
                        this.h = true;
                        this.v = (int) (x10 - dp);
                        invalidate();
                        return true;
                    } else if (dp3 - dp4 <= x10 && x10 <= dp4 + dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        u61 u61Var3 = this.A;
                        if (u61Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) u61Var3).c(1);
                        }
                        this.f33288n = true;
                        this.v = (int) (x10 - dp3);
                        invalidate();
                        return true;
                    } else if (dp <= x10 && x10 <= dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        u61 u61Var4 = this.A;
                        if (u61Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) u61Var4).c(2);
                        }
                        this.f33289r = true;
                        float dp6 = (x10 - AndroidUtilities.dp(16.0f)) / f10;
                        this.f33290s = dp6;
                        u61 u61Var5 = this.A;
                        if (u61Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) u61Var5;
                            PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                            if (photoViewer.B2 != null) {
                                if (photoViewer.Y1 == 1) {
                                    vVar.g(0);
                                }
                                vVar.f(dp6);
                            }
                        }
                        this.v = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f33289r) {
                        float dp7 = (((int) (x10 - this.v)) - AndroidUtilities.dp(16.0f)) / f10;
                        this.f33290s = dp7;
                        float f11 = this.d;
                        if (dp7 < f11) {
                            this.f33290s = f11;
                        } else {
                            float f12 = this.f33286e;
                            if (dp7 > f12) {
                                this.f33290s = f12;
                            }
                        }
                        u61 u61Var6 = this.A;
                        if (u61Var6 != null) {
                            float f13 = this.f33290s;
                            com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) u61Var6;
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
                    } else if (this.h) {
                        int i9 = (int) (x10 - this.v);
                        if (i9 < AndroidUtilities.dp(16.0f)) {
                            dp3 = AndroidUtilities.dp(16.0f);
                        } else if (i9 <= dp3) {
                            dp3 = i9;
                        }
                        float dp8 = (dp3 - AndroidUtilities.dp(16.0f)) / f10;
                        this.d = dp8;
                        float f14 = this.f33286e;
                        float f15 = f14 - dp8;
                        float f16 = this.H;
                        if (f15 > f16) {
                            this.f33286e = dp8 + f16;
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
                        float f20 = this.f33290s;
                        if (f19 > f20) {
                            this.f33290s = f19;
                        } else {
                            float f21 = this.f33286e;
                            if (f21 < f20) {
                                this.f33290s = f21;
                            }
                        }
                        u61 u61Var7 = this.A;
                        if (u61Var7 != null) {
                            com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) u61Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                            k61 k61Var = photoViewer3.B2;
                            if (k61Var != null) {
                                if (k61Var.z()) {
                                    photoViewer3.D2 = false;
                                    photoViewer3.B2.C();
                                    photoViewer3.f35580a0.invalidate();
                                }
                                vVar3.g(1);
                                vVar3.f(f19);
                                photoViewer3.f35691m3.h(0.0f, false);
                                photoViewer3.N7.setProgress(f19);
                                photoViewer3.B3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f33288n) {
                        int i10 = (int) (x10 - this.v);
                        if (i10 >= dp) {
                            if (i10 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i10;
                            }
                        }
                        float dp9 = (dp - AndroidUtilities.dp(16.0f)) / f10;
                        this.f33286e = dp9;
                        float f22 = this.d;
                        float f23 = dp9 - f22;
                        float f24 = this.H;
                        if (f23 > f24) {
                            this.d = dp9 - f24;
                        } else {
                            float f25 = this.I;
                            if (f25 != 0.0f && f23 < f25) {
                                float f26 = f22 + f25;
                                this.f33286e = f26;
                                if (f26 > 1.0f) {
                                    this.f33286e = 1.0f;
                                }
                            }
                        }
                        float f27 = this.d;
                        float f28 = this.f33290s;
                        if (f27 > f28) {
                            this.f33290s = f27;
                        } else {
                            float f29 = this.f33286e;
                            if (f29 < f28) {
                                this.f33290s = f29;
                            }
                        }
                        u61 u61Var8 = this.A;
                        if (u61Var8 != null) {
                            ((com.google.android.gms.common.api.internal.v) u61Var8).e(this.f33286e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                u61 u61Var9 = this.A;
                if (u61Var9 != null) {
                    ((com.google.android.gms.common.api.internal.v) u61Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f33288n) {
                u61 u61Var10 = this.A;
                if (u61Var10 != null) {
                    ((com.google.android.gms.common.api.internal.v) u61Var10).d(1);
                }
                this.f33288n = false;
                return true;
            } else if (this.f33289r) {
                u61 u61Var11 = this.A;
                if (u61Var11 != null) {
                    ((com.google.android.gms.common.api.internal.v) u61Var11).d(2);
                }
                this.f33289r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(u61 u61Var) {
        this.A = u61Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.f33286e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.f33286e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.I = f10;
    }

    public void setMode(int i9) {
        if (this.L == i9) {
            return;
        }
        this.L = i9;
        invalidate();
    }

    public void setProgress(float f10) {
        float f11 = 0.0f;
        if (this.f33291w && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f33287f;
        }
        long j10 = this.f33282a;
        if (j10 != 0) {
            f11 = 240.0f / ((float) j10);
        }
        float f12 = this.f33290s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.f33286e) {
            this.V.d(1.0f, true);
        }
        this.f33290s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.f33286e = f10;
        u61 u61Var = this.A;
        if (u61Var != null) {
            ((com.google.android.gms.common.api.internal.v) u61Var).c(1);
        }
        u61 u61Var2 = this.A;
        if (u61Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) u61Var2).e(this.f33286e);
        }
        u61 u61Var3 = this.A;
        if (u61Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) u61Var3).d(1);
        }
        invalidate();
    }
}
