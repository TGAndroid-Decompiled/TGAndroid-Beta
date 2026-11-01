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
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;
public abstract class g71 extends View {
    public static final Object f26331f0 = new Object();
    public MediaMetadataRetriever D;
    public f71 E;
    public final ArrayList F;
    public d71 G;
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
    public long f26332a;
    public final Paint f26333a0;
    public int f26334b;
    public final Paint f26335b0;
    public int f26336c;
    public final t5 f26337c0;
    public float d;
    public final Path f26338d0;
    public float e;
    public boolean f26339e0;
    public float f26340f;
    public boolean h;
    public boolean f26341n;
    public boolean f26342r;
    public float f26343s;
    public float f26344w;
    public boolean f26345x;
    public ParcelFileDescriptor f26346y;

    public g71(Context context) {
        super(context);
        this.e = 1.0f;
        this.f26343s = 0.5f;
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
        this.f26333a0 = paint5;
        Paint paint6 = new Paint(1);
        this.f26335b0 = paint6;
        this.f26337c0 = new t5(0.0f, this, 0L, 200L, gr.f26526j);
        this.f26338d0 = new Path();
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
        synchronized (f26331f0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f26346y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f26346y = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.D;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.D = null;
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            e71 e71Var = (e71) this.F.get(i10);
            if (e71Var != null && (bitmap = e71Var.f25770a) != null) {
                bitmap.recycle();
            }
        }
        this.F.clear();
        d71 d71Var = this.G;
        if (d71Var != null) {
            d71Var.cancel(true);
            this.G = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f7, float f10, Canvas canvas, Paint paint) {
        float N = org.telegram.messenger.i0.N(12.0f);
        float L = org.telegram.messenger.i0.L(2.0f);
        float L2 = org.telegram.messenger.i0.L(46.0f) + L;
        float f11 = (1.0f - f10) * ((L2 - L) / 2.0f);
        float f12 = L + f11;
        float f13 = L2 - f11;
        Paint paint2 = this.V;
        paint2.setAlpha((int) (38.0f * f10));
        paint.setAlpha((int) (f10 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (N * 2.0f)) - org.telegram.messenger.i0.L(20.0f)) * f7) + N + org.telegram.messenger.i0.L(10.0f);
        RectF rectF = this.N;
        rectF.set(measuredWidth - org.telegram.messenger.i0.N(1.5f), f12, org.telegram.messenger.i0.N(1.5f) + measuredWidth, f13);
        rectF.inset(-org.telegram.messenger.i0.N(0.66f), -org.telegram.messenger.i0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint2);
        rectF.set(measuredWidth - org.telegram.messenger.i0.N(1.5f), f12, org.telegram.messenger.i0.N(1.5f) + measuredWidth, f13);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
    }

    public final void d(int i10) {
        float f7;
        int i11;
        if (this.D == null) {
            return;
        }
        if (i10 == 0) {
            this.J = org.telegram.messenger.i0.L(38.0f);
            int i12 = this.f26334b;
            if (i12 != 0 && (i11 = this.f26336c) != 0) {
                f7 = i12 / i11;
            } else {
                f7 = 1.0f;
            }
            this.K = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f)) / (this.J * Utilities.i(f7, 1.3333334f, 0.5625f))));
            this.I = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f)) / this.K);
            this.H = this.f26332a / this.K;
        }
        d71 d71Var = new d71(this);
        this.G = d71Var;
        d71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f26332a);
    }

    public float getProgress() {
        return this.f26343s;
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
        float N = org.telegram.messenger.i0.N(12.0f);
        float measuredWidth = getMeasuredWidth() - (N * 2.0f);
        float L = org.telegram.messenger.i0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.i0.L(20.0f)) * this.d));
        float L2 = org.telegram.messenger.i0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.i0.L(20.0f)) * this.e));
        float L3 = org.telegram.messenger.i0.L(6.0f);
        float L4 = L3 + org.telegram.messenger.i0.L(38.0f);
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f26338d0;
        if (isEmpty && this.G == null) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(N, L3, measuredWidth + N, L4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f7 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
            f12 = L;
            f14 = L3;
            f13 = L2;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = org.telegram.messenger.i0.P;
            float f15 = measuredWidth + N;
            rectF2.set(N, L3, f15, L4);
            f7 = 2.0f;
            f10 = 10.0f;
            f11 = 6.0f;
            path.addRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.K) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26339e0 = z10;
            if (!z10) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((e71) arrayList.get(i10)).f25770a == null) {
                        this.f26339e0 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (this.f26339e0) {
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(N, L3, org.telegram.messenger.i0.L(4.0f) + f15, L4);
                b(canvas, rectF3);
            }
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                e71 e71Var = (e71) arrayList.get(i12);
                Bitmap bitmap = e71Var.f25770a;
                if (bitmap != null) {
                    float f16 = (this.I * i11) + N;
                    float L5 = org.telegram.messenger.i0.L(6.0f);
                    float f17 = e71Var.f25771b;
                    if (f17 != 1.0f) {
                        float f18 = f17 + 0.045714285f;
                        e71Var.f25771b = f18;
                        if (f18 > 1.0f) {
                            e71Var.f25771b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.Q;
                        paint.setAlpha((int) (gr.h.getInterpolation(e71Var.f25771b) * 255.0f));
                        canvas.drawBitmap(bitmap, f16, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f16, L5, (Paint) null);
                    }
                }
                i11++;
            }
            float L6 = org.telegram.messenger.i0.L(46.0f);
            Paint paint2 = this.W;
            canvas.drawRect(N, L3, L, L6, paint2);
            f12 = L;
            canvas.drawRect(L2, L3, f15, L4, paint2);
            f13 = L2;
            f14 = L3;
            canvas.restore();
        }
        boolean z11 = this.f26345x;
        Paint paint3 = this.T;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.N;
            rectF4.set(f12 - org.telegram.messenger.i0.N(f10), f14, org.telegram.messenger.i0.N(f10) + f13, L4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.N(f11), org.telegram.messenger.i0.N(f11), paint3);
            rectF4.set(f12, org.telegram.messenger.i0.N(f7) + f14, f13, L4 - org.telegram.messenger.i0.N(f7));
            canvas2.drawRect(rectF4, this.f26333a0);
            canvas2.restore();
            float L7 = org.telegram.messenger.i0.L(f7);
            float L8 = org.telegram.messenger.i0.L(f10);
            float N2 = f12 - ((org.telegram.messenger.i0.N(f10) - L7) / f7);
            float f19 = (((L4 - f14) - L8) / f7) + f14;
            float f20 = L8 + f19;
            rectF4.set(N2, f19, N2 - L7, f20);
            float N3 = org.telegram.messenger.i0.N(f11);
            float N4 = org.telegram.messenger.i0.N(f11);
            Paint paint4 = this.f26335b0;
            canvas2.drawRoundRect(rectF4, N3, N4, paint4);
            float N5 = ((org.telegram.messenger.i0.N(f10) - L7) / f7) + f13;
            rectF4.set(N5, f19, L7 + N5, f20);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.i0.N(f11), org.telegram.messenger.i0.N(f11), paint4);
        } else {
            canvas2 = canvas;
        }
        float e = this.f26337c0.e(false, 0.0f);
        if (e > 0.0f) {
            c(this.e, e, canvas2, paint3);
        }
        c(this.f26343s, 1.0f - e, canvas2, paint3);
        if (this.f26345x) {
            c(this.f26340f, 1.0f, canvas2, this.U);
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
                e71 e71Var = (e71) arrayList.get(i12);
                if (e71Var != null && (bitmap = e71Var.f25770a) != null) {
                    bitmap.recycle();
                }
                i12++;
            }
            arrayList.clear();
            d71 d71Var = this.G;
            if (d71Var != null) {
                d71Var.cancel(true);
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
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(44.0f);
            float f7 = measuredWidth;
            int L = org.telegram.messenger.i0.L(22.0f) + ((int) (this.d * f7));
            int L2 = org.telegram.messenger.i0.L(22.0f) + ((int) (this.f26343s * f7));
            int L3 = org.telegram.messenger.i0.L(22.0f) + ((int) (this.e * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.D != null) {
                    int L4 = org.telegram.messenger.i0.L(16.0f);
                    int L5 = org.telegram.messenger.i0.L(8.0f);
                    if (L3 != L && L2 - L5 <= x10 && x10 <= L5 + L2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        f71 f71Var = this.E;
                        if (f71Var != null) {
                            ((com.google.android.gms.common.api.internal.v) f71Var).c(2);
                        }
                        this.f26342r = true;
                        this.f26344w = (int) (x10 - L2);
                        invalidate();
                        return true;
                    } else if (L - L4 <= x10 && x10 <= Math.min(L + L4, L3) && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        f71 f71Var2 = this.E;
                        if (f71Var2 != null) {
                            ((com.google.android.gms.common.api.internal.v) f71Var2).c(0);
                        }
                        this.h = true;
                        this.f26344w = (int) (x10 - L);
                        invalidate();
                        return true;
                    } else if (L3 - L4 <= x10 && x10 <= L4 + L3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        f71 f71Var3 = this.E;
                        if (f71Var3 != null) {
                            ((com.google.android.gms.common.api.internal.v) f71Var3).c(1);
                        }
                        this.f26341n = true;
                        this.f26344w = (int) (x10 - L3);
                        invalidate();
                        return true;
                    } else if (L <= x10 && x10 <= L3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        f71 f71Var4 = this.E;
                        if (f71Var4 != null) {
                            ((com.google.android.gms.common.api.internal.v) f71Var4).c(2);
                        }
                        this.f26342r = true;
                        float L6 = (x10 - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.f26343s = L6;
                        f71 f71Var5 = this.E;
                        if (f71Var5 != null) {
                            com.google.android.gms.common.api.internal.v vVar = (com.google.android.gms.common.api.internal.v) f71Var5;
                            PhotoViewer photoViewer = (PhotoViewer) vVar.d;
                            if (photoViewer.F2 != null) {
                                if (photoViewer.f33461c2 == 1) {
                                    vVar.j(0);
                                }
                                vVar.h(L6);
                            }
                        }
                        this.f26344w = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f26342r) {
                        float L7 = (((int) (x10 - this.f26344w)) - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.f26343s = L7;
                        float f10 = this.d;
                        if (L7 < f10) {
                            this.f26343s = f10;
                        } else {
                            float f11 = this.e;
                            if (L7 > f11) {
                                this.f26343s = f11;
                            }
                        }
                        f71 f71Var6 = this.E;
                        if (f71Var6 != null) {
                            float f12 = this.f26343s;
                            com.google.android.gms.common.api.internal.v vVar2 = (com.google.android.gms.common.api.internal.v) f71Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) vVar2.d;
                            if (photoViewer2.F2 != null) {
                                if (photoViewer2.f33461c2 == 1) {
                                    vVar2.j(0);
                                }
                                vVar2.h(f12);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f26344w);
                        if (i10 < org.telegram.messenger.i0.L(16.0f)) {
                            L3 = org.telegram.messenger.i0.L(16.0f);
                        } else if (i10 <= L3) {
                            L3 = i10;
                        }
                        float L8 = (L3 - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.d = L8;
                        float f13 = this.e;
                        float f14 = f13 - L8;
                        float f15 = this.L;
                        if (f14 > f15) {
                            this.e = L8 + f15;
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
                        float f19 = this.f26343s;
                        if (f18 > f19) {
                            this.f26343s = f18;
                        } else {
                            float f20 = this.e;
                            if (f20 < f19) {
                                this.f26343s = f20;
                            }
                        }
                        f71 f71Var7 = this.E;
                        if (f71Var7 != null) {
                            com.google.android.gms.common.api.internal.v vVar3 = (com.google.android.gms.common.api.internal.v) f71Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) vVar3.d;
                            v61 v61Var = photoViewer3.F2;
                            if (v61Var != null) {
                                if (v61Var.d0()) {
                                    photoViewer3.H2 = false;
                                    photoViewer3.F2.g0();
                                    photoViewer3.f33477e0.invalidate();
                                }
                                vVar3.j(1);
                                vVar3.h(f18);
                                photoViewer3.f33584q3.h(false, 0.0f);
                                photoViewer3.S7.setProgress(f18);
                                photoViewer3.E3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f26341n) {
                        int i11 = (int) (x10 - this.f26344w);
                        if (i11 >= L) {
                            if (i11 > org.telegram.messenger.i0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.i0.L(16.0f) + measuredWidth;
                            } else {
                                L = i11;
                            }
                        }
                        float L9 = (L - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.e = L9;
                        float f21 = this.d;
                        float f22 = L9 - f21;
                        float f23 = this.L;
                        if (f22 > f23) {
                            this.d = L9 - f23;
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
                        float f27 = this.f26343s;
                        if (f26 > f27) {
                            this.f26343s = f26;
                        } else {
                            float f28 = this.e;
                            if (f28 < f27) {
                                this.f26343s = f28;
                            }
                        }
                        f71 f71Var8 = this.E;
                        if (f71Var8 != null) {
                            ((com.google.android.gms.common.api.internal.v) f71Var8).f(this.e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                f71 f71Var9 = this.E;
                if (f71Var9 != null) {
                    ((com.google.android.gms.common.api.internal.v) f71Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f26341n) {
                f71 f71Var10 = this.E;
                if (f71Var10 != null) {
                    ((com.google.android.gms.common.api.internal.v) f71Var10).d(1);
                }
                this.f26341n = false;
                return true;
            } else if (this.f26342r) {
                f71 f71Var11 = this.E;
                if (f71Var11 != null) {
                    ((com.google.android.gms.common.api.internal.v) f71Var11).d(2);
                }
                this.f26342r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(f71 f71Var) {
        this.E = f71Var;
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
        if (this.f26345x && (f7 <= 0.0f || f7 >= 1.0f)) {
            f7 = this.f26340f;
        }
        long j10 = this.f26332a;
        if (j10 != 0) {
            f10 = 240.0f / ((float) j10);
        }
        float f11 = this.f26343s;
        if (f7 < f11 && f7 <= this.d + f10 && f11 + f10 >= this.e) {
            this.f26337c0.e(true, 1.0f);
        }
        this.f26343s = f7;
        invalidate();
    }

    public void setRightProgress(float f7) {
        this.e = f7;
        f71 f71Var = this.E;
        if (f71Var != null) {
            ((com.google.android.gms.common.api.internal.v) f71Var).c(1);
        }
        f71 f71Var2 = this.E;
        if (f71Var2 != null) {
            ((com.google.android.gms.common.api.internal.v) f71Var2).f(this.e);
        }
        f71 f71Var3 = this.E;
        if (f71Var3 != null) {
            ((com.google.android.gms.common.api.internal.v) f71Var3).d(1);
        }
        invalidate();
    }
}
