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
public abstract class h71 extends View {
    public static final Object f29096b0 = new Object();
    public g71 A;
    public final ArrayList B;
    public e71 C;
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
    public final d6 V;
    public final Path W;
    public long f29097a;
    public boolean f29098a0;
    public int f29099b;
    public int f29100c;
    public float d;
    public float f29101e;
    public float f29102f;
    public boolean h;
    public boolean f29103n;
    public boolean f29104r;
    public float f29105s;
    public float v;
    public boolean f29106w;
    public ParcelFileDescriptor f29107x;
    public MediaMetadataRetriever f29108y;

    public h71(Context context) {
        super(context);
        this.f29101e = 1.0f;
        this.f29105s = 0.5f;
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
        this.V = new d6(0.0f, this, 0L, 200L, jr.f29803j);
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
        synchronized (f29096b0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f29107x;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f29107x = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f29108y;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f29108y = null;
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            f71 f71Var = (f71) this.B.get(i10);
            if (f71Var != null && (bitmap = f71Var.f28343a) != null) {
                bitmap.recycle();
            }
        }
        this.B.clear();
        e71 e71Var = this.C;
        if (e71Var != null) {
            e71Var.cancel(true);
            this.C = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f9, float f10, Canvas canvas, Paint paint) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(46.0f) + dp;
        float f11 = (1.0f - f10) * ((dp2 - dp) / 2.0f);
        float f12 = dp + f11;
        float f13 = dp2 - f11;
        Paint paint2 = this.R;
        paint2.setAlpha((int) (38.0f * f10));
        paint.setAlpha((int) (f10 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (dpf2 * 2.0f)) - AndroidUtilities.dp(20.0f)) * f9) + dpf2 + AndroidUtilities.dp(10.0f);
        RectF rectF = this.J;
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f12, AndroidUtilities.dpf2(1.5f) + measuredWidth, f13);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.set(measuredWidth - AndroidUtilities.dpf2(1.5f), f12, AndroidUtilities.dpf2(1.5f) + measuredWidth, f13);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
    }

    public final void d(int i10) {
        float f9;
        int i11;
        if (this.f29108y == null) {
            return;
        }
        if (i10 == 0) {
            this.F = AndroidUtilities.dp(38.0f);
            int i12 = this.f29099b;
            if (i12 != 0 && (i11 = this.f29100c) != 0) {
                f9 = i12 / i11;
            } else {
                f9 = 1.0f;
            }
            this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / (this.F * Utilities.clamp(f9, 1.3333334f, 0.5625f))));
            this.E = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(32.0f)) / this.G);
            this.D = this.f29097a / this.G;
        }
        e71 e71Var = new e71(this);
        this.C = e71Var;
        e71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f29097a);
    }

    public float getProgress() {
        return this.f29105s;
    }

    public float getRightProgress() {
        return this.f29101e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
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
        float dp2 = AndroidUtilities.dp(10.0f) + dpf2 + ((int) ((measuredWidth - AndroidUtilities.dp(20.0f)) * this.f29101e));
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
            f12 = dp;
            f14 = dp3;
            f13 = dp2;
            f9 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f15 = measuredWidth + dpf2;
            rectF2.set(dpf2, dp3, f15, dp4);
            f9 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
            path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.G) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29098a0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((f71) arrayList.get(i10)).f28343a == null) {
                        this.f29098a0 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (this.f29098a0) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(dpf2, dp3, AndroidUtilities.dp(4.0f) + f15, dp4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                f71 f71Var = (f71) arrayList.get(i12);
                Bitmap bitmap = f71Var.f28343a;
                if (bitmap != null) {
                    float f16 = (this.E * i11) + dpf2;
                    float dp5 = AndroidUtilities.dp(6.0f);
                    float f17 = f71Var.f28344b;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.045714285f;
                        f71Var.f28344b = f18;
                        if (f18 > 1.0f) {
                            f71Var.f28344b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.M;
                        paint.setAlpha((int) (jr.h.getInterpolation(f71Var.f28344b) * 255.0f));
                        canvas.drawBitmap(bitmap, f16, dp5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f16, dp5, (Paint) null);
                    }
                }
                i11++;
            }
            float dp6 = AndroidUtilities.dp(46.0f);
            Paint paint2 = this.S;
            canvas.drawRect(dpf2, dp3, dp, dp6, paint2);
            f12 = dp;
            canvas.drawRect(dp2, dp3, f15, dp4, paint2);
            f13 = dp2;
            f14 = dp3;
            canvas.restore();
        }
        boolean z11 = this.f29106w;
        Paint paint3 = this.P;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.J;
            rectF4.set(f12 - AndroidUtilities.dpf2(f10), f14, AndroidUtilities.dpf2(f10) + f13, dp4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint3);
            rectF4.set(f12, AndroidUtilities.dpf2(f9) + f14, f13, dp4 - AndroidUtilities.dpf2(f9));
            canvas2.drawRect(rectF4, this.T);
            canvas2.restore();
            float dp7 = AndroidUtilities.dp(f9);
            float dp8 = AndroidUtilities.dp(f10);
            float dpf22 = f12 - ((AndroidUtilities.dpf2(f10) - dp7) / f9);
            float f19 = (((dp4 - f14) - dp8) / f9) + f14;
            float f20 = dp8 + f19;
            rectF4.set(dpf22, f19, dpf22 - dp7, f20);
            float dpf23 = AndroidUtilities.dpf2(f11);
            float dpf24 = AndroidUtilities.dpf2(f11);
            Paint paint4 = this.U;
            canvas2.drawRoundRect(rectF4, dpf23, dpf24, paint4);
            float dpf25 = ((AndroidUtilities.dpf2(f10) - dp7) / f9) + f13;
            rectF4.set(dpf25, f19, dp7 + dpf25, f20);
            canvas2.drawRoundRect(rectF4, AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f11), paint4);
        } else {
            canvas2 = canvas;
        }
        float d = this.V.d(0.0f, false);
        if (d > 0.0f) {
            c(this.f29101e, d, canvas2, paint3);
        }
        c(this.f29105s, 1.0f - d, canvas2, paint3);
        if (this.f29106w) {
            c(this.f29102f, 1.0f, canvas2, this.Q);
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
                f71 f71Var = (f71) arrayList.get(i12);
                if (f71Var != null && (bitmap = f71Var.f28343a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            e71 e71Var = this.C;
            if (e71Var != null) {
                e71Var.cancel(true);
                this.C = null;
            }
            invalidate();
            this.K = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(44.0f);
            float f9 = measuredWidth;
            int dp = AndroidUtilities.dp(22.0f) + ((int) (this.d * f9));
            int dp2 = AndroidUtilities.dp(22.0f) + ((int) (this.f29105s * f9));
            int dp3 = AndroidUtilities.dp(22.0f) + ((int) (this.f29101e * f9));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f29108y != null) {
                    int dp4 = AndroidUtilities.dp(16.0f);
                    int dp5 = AndroidUtilities.dp(8.0f);
                    if (dp3 != dp && dp2 - dp5 <= x4 && x4 <= dp5 + dp2 && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        g71 g71Var = this.A;
                        if (g71Var != null) {
                            ((com.google.android.gms.common.api.internal.v) g71Var).c(2);
                        }
                        this.f29104r = true;
                        this.v = (int) (x4 - dp2);
                        invalidate();
                        return true;
                    } else if (dp - dp4 <= x4 && x4 <= Math.min(dp + dp4, dp3) && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        g71 g71Var2 = this.A;
                        if (g71Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) g71Var2).c(0);
                        }
                        this.h = true;
                        this.v = (int) (x4 - dp);
                        invalidate();
                        return true;
                    } else if (dp3 - dp4 <= x4 && x4 <= dp4 + dp3 && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        g71 g71Var3 = this.A;
                        if (g71Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) g71Var3).c(1);
                        }
                        this.f29103n = true;
                        this.v = (int) (x4 - dp3);
                        invalidate();
                        return true;
                    } else if (dp <= x4 && x4 <= dp3 && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        g71 g71Var4 = this.A;
                        if (g71Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) g71Var4).c(2);
                        }
                        this.f29104r = true;
                        float dp6 = (x4 - AndroidUtilities.dp(16.0f)) / f9;
                        this.f29105s = dp6;
                        g71 g71Var5 = this.A;
                        if (g71Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) g71Var5;
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
                    if (this.f29104r) {
                        float dp7 = (((int) (x4 - this.v)) - AndroidUtilities.dp(16.0f)) / f9;
                        this.f29105s = dp7;
                        float f10 = this.d;
                        if (dp7 < f10) {
                            this.f29105s = f10;
                        } else {
                            float f11 = this.f29101e;
                            if (dp7 > f11) {
                                this.f29105s = f11;
                            }
                        }
                        g71 g71Var6 = this.A;
                        if (g71Var6 != null) {
                            float f12 = this.f29105s;
                            com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) g71Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) vVar2.d;
                            if (photoViewer2.B2 != null) {
                                if (photoViewer2.Y1 == 1) {
                                    vVar2.g(0);
                                }
                                vVar2.f(f12);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x4 - this.v);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp3 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp3) {
                            dp3 = i10;
                        }
                        float dp8 = (dp3 - AndroidUtilities.dp(16.0f)) / f9;
                        this.d = dp8;
                        float f13 = this.f29101e;
                        float f14 = f13 - dp8;
                        float f15 = this.H;
                        if (f14 > f15) {
                            this.f29101e = dp8 + f15;
                        } else {
                            float f16 = this.I;
                            if (f16 != 0.0f && f14 < f16) {
                                float f17 = f13 - f16;
                                this.d = f17;
                                if (f17 < 0.0f) {
                                    this.d = 0.0f;
                                }
                            }
                        }
                        float f18 = this.d;
                        float f19 = this.f29105s;
                        if (f18 > f19) {
                            this.f29105s = f18;
                        } else {
                            float f20 = this.f29101e;
                            if (f20 < f19) {
                                this.f29105s = f20;
                            }
                        }
                        g71 g71Var7 = this.A;
                        if (g71Var7 != null) {
                            com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) g71Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                            x61 x61Var = photoViewer3.B2;
                            if (x61Var != null) {
                                if (x61Var.z()) {
                                    photoViewer3.D2 = false;
                                    photoViewer3.B2.C();
                                    photoViewer3.f35647a0.invalidate();
                                }
                                vVar3.g(1);
                                vVar3.f(f18);
                                photoViewer3.f35757m3.h(0.0f, false);
                                photoViewer3.N7.setProgress(f18);
                                photoViewer3.B3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f29103n) {
                        int i11 = (int) (x4 - this.v);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp9 = (dp - AndroidUtilities.dp(16.0f)) / f9;
                        this.f29101e = dp9;
                        float f21 = this.d;
                        float f22 = dp9 - f21;
                        float f23 = this.H;
                        if (f22 > f23) {
                            this.d = dp9 - f23;
                        } else {
                            float f24 = this.I;
                            if (f24 != 0.0f && f22 < f24) {
                                float f25 = f21 + f24;
                                this.f29101e = f25;
                                if (f25 > 1.0f) {
                                    this.f29101e = 1.0f;
                                }
                            }
                        }
                        float f26 = this.d;
                        float f27 = this.f29105s;
                        if (f26 > f27) {
                            this.f29105s = f26;
                        } else {
                            float f28 = this.f29101e;
                            if (f28 < f27) {
                                this.f29105s = f28;
                            }
                        }
                        g71 g71Var8 = this.A;
                        if (g71Var8 != null) {
                            ((com.google.android.gms.common.api.internal.v) g71Var8).e(this.f29101e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                g71 g71Var9 = this.A;
                if (g71Var9 != null) {
                    ((com.google.android.gms.common.api.internal.v) g71Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f29103n) {
                g71 g71Var10 = this.A;
                if (g71Var10 != null) {
                    ((com.google.android.gms.common.api.internal.v) g71Var10).d(1);
                }
                this.f29103n = false;
                return true;
            } else if (this.f29104r) {
                g71 g71Var11 = this.A;
                if (g71Var11 != null) {
                    ((com.google.android.gms.common.api.internal.v) g71Var11).d(2);
                }
                this.f29104r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(g71 g71Var) {
        this.A = g71Var;
    }

    public void setMaxProgressDiff(float f9) {
        this.H = f9;
        float f10 = this.f29101e;
        float f11 = this.d;
        if (f10 - f11 > f9) {
            this.f29101e = f11 + f9;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f9) {
        this.I = f9;
    }

    public void setMode(int i10) {
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        invalidate();
    }

    public void setProgress(float f9) {
        float f10 = 0.0f;
        if (this.f29106w && (f9 <= 0.0f || f9 >= 1.0f)) {
            f9 = this.f29102f;
        }
        long j10 = this.f29097a;
        if (j10 != 0) {
            f10 = 240.0f / ((float) j10);
        }
        float f11 = this.f29105s;
        if (f9 < f11 && f9 <= this.d + f10 && f11 + f10 >= this.f29101e) {
            this.V.d(1.0f, true);
        }
        this.f29105s = f9;
        invalidate();
    }

    public void setRightProgress(float f9) {
        this.f29101e = f9;
        g71 g71Var = this.A;
        if (g71Var != null) {
            ((com.google.android.gms.common.api.internal.v) g71Var).c(1);
        }
        g71 g71Var2 = this.A;
        if (g71Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) g71Var2).e(this.f29101e);
        }
        g71 g71Var3 = this.A;
        if (g71Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) g71Var3).d(1);
        }
        invalidate();
    }
}
