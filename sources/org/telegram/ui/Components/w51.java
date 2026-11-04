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
public abstract class w51 extends View {
    public static final Object f39895g0 = new Object();
    public MediaMetadataRetriever E;
    public v51 F;
    public final ArrayList G;
    public t51 H;
    public long I;
    public int J;
    public int K;
    public int L;
    public float M;
    public float N;
    public final RectF O;
    public int P;
    public int Q;
    public final Paint R;
    public final ArrayList S;
    public final Rect T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public long f39896a;
    public final Paint f39897a0;
    public int f39898b;
    public final Paint f39899b0;
    public int f39900c;
    public final Paint f39901c0;
    public float d;
    public final u5 f39902d0;
    public float f39903e;
    public final Path f39904e0;
    public float f39905f;
    public boolean f39906f0;
    public boolean h;
    public boolean f39907n;
    public boolean f39908r;
    public float f39909s;
    public float f39910w;
    public boolean f39911x;
    public ParcelFileDescriptor f39912y;

    public w51(Context context) {
        super(context);
        this.f39903e = 1.0f;
        this.f39909s = 0.5f;
        this.G = new ArrayList();
        this.M = 1.0f;
        this.N = 0.0f;
        this.O = new RectF();
        this.Q = 0;
        this.R = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        Rect rect = new Rect();
        this.T = rect;
        Paint paint = new Paint(1);
        this.U = paint;
        Paint paint2 = new Paint(1);
        this.V = paint2;
        Paint paint3 = new Paint(1);
        this.W = paint3;
        Paint paint4 = new Paint(1);
        this.f39897a0 = paint4;
        Paint paint5 = new Paint(1);
        this.f39899b0 = paint5;
        Paint paint6 = new Paint(1);
        this.f39901c0 = paint6;
        this.f39902d0 = new u5(0.0f, this, 0L, 200L, xq.f40455j);
        this.f39904e0 = new Path();
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
        synchronized (f39895g0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f39912y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f39912y = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.E;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.E = null;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            u51 u51Var = (u51) this.G.get(i3);
            if (u51Var != null && (bitmap = u51Var.f38654a) != null) {
                bitmap.recycle();
            }
        }
        this.G.clear();
        t51 t51Var = this.H;
        if (t51Var != null) {
            t51Var.cancel(true);
            this.H = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f10, float f11, Canvas canvas, Paint paint) {
        float N = org.telegram.messenger.g0.N(12.0f);
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(46.0f) + L;
        float f12 = (1.0f - f11) * ((L2 - L) / 2.0f);
        float f13 = L + f12;
        float f14 = L2 - f12;
        Paint paint2 = this.W;
        paint2.setAlpha((int) (38.0f * f11));
        paint.setAlpha((int) (f11 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (N * 2.0f)) - org.telegram.messenger.g0.L(20.0f)) * f10) + N + org.telegram.messenger.g0.L(10.0f);
        RectF rectF = this.O;
        rectF.set(measuredWidth - org.telegram.messenger.g0.N(1.5f), f13, org.telegram.messenger.g0.N(1.5f) + measuredWidth, f14);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
        rectF.set(measuredWidth - org.telegram.messenger.g0.N(1.5f), f13, org.telegram.messenger.g0.N(1.5f) + measuredWidth, f14);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
    }

    public final void d(int i3) {
        float f10;
        int i10;
        if (this.E == null) {
            return;
        }
        if (i3 == 0) {
            this.K = org.telegram.messenger.g0.L(38.0f);
            int i11 = this.f39898b;
            if (i11 != 0 && (i10 = this.f39900c) != 0) {
                f10 = i11 / i10;
            } else {
                f10 = 1.0f;
            }
            this.L = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / (this.K * Utilities.i(f10, 1.3333334f, 0.5625f))));
            this.J = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / this.L);
            this.I = this.f39896a / this.L;
        }
        t51 t51Var = new t51(this);
        this.H = t51Var;
        t51Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i3), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f39896a);
    }

    public float getProgress() {
        return this.f39909s;
    }

    public float getRightProgress() {
        return this.f39903e;
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
        float N = org.telegram.messenger.g0.N(12.0f);
        float measuredWidth = getMeasuredWidth() - (N * 2.0f);
        float L = org.telegram.messenger.g0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.g0.L(20.0f)) * this.d));
        float L2 = org.telegram.messenger.g0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.g0.L(20.0f)) * this.f39903e));
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = L3 + org.telegram.messenger.g0.L(38.0f);
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f39904e0;
        if (isEmpty && this.H == null) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(N, L3, measuredWidth + N, L4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
            f13 = L;
            f15 = L3;
            f14 = L2;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f16 = measuredWidth + N;
            rectF2.set(N, L3, f16, L4);
            f10 = 2.0f;
            f11 = 10.0f;
            f12 = 6.0f;
            path.addRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.L) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f39906f0 = z10;
            if (!z10) {
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    } else if (((u51) arrayList.get(i3)).f38654a == null) {
                        this.f39906f0 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (this.f39906f0) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(N, L3, org.telegram.messenger.g0.L(4.0f) + f16, L4);
                b(canvas, rectF3);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u51 u51Var = (u51) arrayList.get(i11);
                Bitmap bitmap = u51Var.f38654a;
                if (bitmap != null) {
                    float f17 = (this.J * i10) + N;
                    float L5 = org.telegram.messenger.g0.L(6.0f);
                    float f18 = u51Var.f38655b;
                    if (f18 != 1.0f) {
                        float f19 = f18 + 0.045714285f;
                        u51Var.f38655b = f19;
                        if (f19 > 1.0f) {
                            u51Var.f38655b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.R;
                        paint.setAlpha((int) (xq.h.getInterpolation(u51Var.f38655b) * 255.0f));
                        canvas.drawBitmap(bitmap, f17, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f17, L5, (Paint) null);
                    }
                }
                i10++;
            }
            float L6 = org.telegram.messenger.g0.L(46.0f);
            Paint paint2 = this.f39897a0;
            canvas.drawRect(N, L3, L, L6, paint2);
            f13 = L;
            canvas.drawRect(L2, L3, f16, L4, paint2);
            f14 = L2;
            f15 = L3;
            canvas.restore();
        }
        boolean z11 = this.f39911x;
        Paint paint3 = this.U;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.O;
            rectF4.set(f13 - org.telegram.messenger.g0.N(f11), f15, org.telegram.messenger.g0.N(f11) + f14, L4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint3);
            rectF4.set(f13, org.telegram.messenger.g0.N(f10) + f15, f14, L4 - org.telegram.messenger.g0.N(f10));
            canvas2.drawRect(rectF4, this.f39899b0);
            canvas2.restore();
            float L7 = org.telegram.messenger.g0.L(f10);
            float L8 = org.telegram.messenger.g0.L(f11);
            float N2 = f13 - ((org.telegram.messenger.g0.N(f11) - L7) / f10);
            float f20 = (((L4 - f15) - L8) / f10) + f15;
            float f21 = L8 + f20;
            rectF4.set(N2, f20, N2 - L7, f21);
            float N3 = org.telegram.messenger.g0.N(f12);
            float N4 = org.telegram.messenger.g0.N(f12);
            Paint paint4 = this.f39901c0;
            canvas2.drawRoundRect(rectF4, N3, N4, paint4);
            float N5 = ((org.telegram.messenger.g0.N(f11) - L7) / f10) + f14;
            rectF4.set(N5, f20, L7 + N5, f21);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint4);
        } else {
            canvas2 = canvas;
        }
        float e10 = this.f39902d0.e(false, 0.0f);
        if (e10 > 0.0f) {
            c(this.f39903e, e10, canvas2, paint3);
        }
        c(this.f39909s, 1.0f - e10, canvas2, paint3);
        if (this.f39911x) {
            c(this.f39905f, 1.0f, canvas2, this.V);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            this.T.set(i3, 0, i11, getMeasuredHeight());
            setSystemGestureExclusionRects(this.S);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.P != size) {
            int i11 = 0;
            while (true) {
                arrayList = this.G;
                if (i11 >= arrayList.size()) {
                    break;
                }
                u51 u51Var = (u51) arrayList.get(i11);
                if (u51Var != null && (bitmap = u51Var.f38654a) != null) {
                    bitmap.recycle();
                }
                i11++;
            }
            arrayList.clear();
            t51 t51Var = this.H;
            if (t51Var != null) {
                t51Var.cancel(true);
                this.H = null;
            }
            invalidate();
            this.P = size;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(44.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(22.0f) + ((int) (this.d * f10));
            int L2 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f39909s * f10));
            int L3 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f39903e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.E != null) {
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    int L5 = org.telegram.messenger.g0.L(8.0f);
                    if (L3 != L && L2 - L5 <= x10 && x10 <= L5 + L2 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        v51 v51Var = this.F;
                        if (v51Var != null) {
                            ((com.google.android.gms.common.api.internal.s) v51Var).c(2);
                        }
                        this.f39908r = true;
                        this.f39910w = (int) (x10 - L2);
                        invalidate();
                        return true;
                    } else if (L - L4 <= x10 && x10 <= Math.min(L + L4, L3) && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        v51 v51Var2 = this.F;
                        if (v51Var2 != null) {
                            ((com.google.android.gms.common.api.internal.s) v51Var2).c(0);
                        }
                        this.h = true;
                        this.f39910w = (int) (x10 - L);
                        invalidate();
                        return true;
                    } else if (L3 - L4 <= x10 && x10 <= L4 + L3 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        v51 v51Var3 = this.F;
                        if (v51Var3 != null) {
                            ((com.google.android.gms.common.api.internal.s) v51Var3).c(1);
                        }
                        this.f39907n = true;
                        this.f39910w = (int) (x10 - L3);
                        invalidate();
                        return true;
                    } else if (L <= x10 && x10 <= L3 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        v51 v51Var4 = this.F;
                        if (v51Var4 != null) {
                            ((com.google.android.gms.common.api.internal.s) v51Var4).c(2);
                        }
                        this.f39908r = true;
                        float L6 = (x10 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39909s = L6;
                        v51 v51Var5 = this.F;
                        if (v51Var5 != null) {
                            com.google.android.gms.common.api.internal.s sVar = (com.google.android.gms.common.api.internal.s) v51Var5;
                            PhotoViewer photoViewer = (PhotoViewer) sVar.d;
                            if (photoViewer.G2 != null) {
                                if (photoViewer.f41402d2 == 1) {
                                    sVar.j(0);
                                }
                                sVar.h(L6);
                            }
                        }
                        this.f39910w = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f39908r) {
                        float L7 = (((int) (x10 - this.f39910w)) - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39909s = L7;
                        float f11 = this.d;
                        if (L7 < f11) {
                            this.f39909s = f11;
                        } else {
                            float f12 = this.f39903e;
                            if (L7 > f12) {
                                this.f39909s = f12;
                            }
                        }
                        v51 v51Var6 = this.F;
                        if (v51Var6 != null) {
                            float f13 = this.f39909s;
                            com.google.android.gms.common.api.internal.s sVar2 = (com.google.android.gms.common.api.internal.s) v51Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) sVar2.d;
                            if (photoViewer2.G2 != null) {
                                if (photoViewer2.f41402d2 == 1) {
                                    sVar2.j(0);
                                }
                                sVar2.h(f13);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i3 = (int) (x10 - this.f39910w);
                        if (i3 < org.telegram.messenger.g0.L(16.0f)) {
                            L3 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i3 <= L3) {
                            L3 = i3;
                        }
                        float L8 = (L3 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.d = L8;
                        float f14 = this.f39903e;
                        float f15 = f14 - L8;
                        float f16 = this.M;
                        if (f15 > f16) {
                            this.f39903e = L8 + f16;
                        } else {
                            float f17 = this.N;
                            if (f17 != 0.0f && f15 < f17) {
                                float f18 = f14 - f17;
                                this.d = f18;
                                if (f18 < 0.0f) {
                                    this.d = 0.0f;
                                }
                            }
                        }
                        float f19 = this.d;
                        float f20 = this.f39909s;
                        if (f19 > f20) {
                            this.f39909s = f19;
                        } else {
                            float f21 = this.f39903e;
                            if (f21 < f20) {
                                this.f39909s = f21;
                            }
                        }
                        v51 v51Var7 = this.F;
                        if (v51Var7 != null) {
                            com.google.android.gms.common.api.internal.s sVar3 = (com.google.android.gms.common.api.internal.s) v51Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) sVar3.d;
                            m51 m51Var = photoViewer3.G2;
                            if (m51Var != null) {
                                if (m51Var.d0()) {
                                    photoViewer3.I2 = false;
                                    photoViewer3.G2.g0();
                                    photoViewer3.f41420f0.invalidate();
                                }
                                sVar3.j(1);
                                sVar3.h(f19);
                                photoViewer3.f41526r3.h(false, 0.0f);
                                photoViewer3.T7.setProgress(f19);
                                photoViewer3.E3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f39907n) {
                        int i10 = (int) (x10 - this.f39910w);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L9 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39903e = L9;
                        float f22 = this.d;
                        float f23 = L9 - f22;
                        float f24 = this.M;
                        if (f23 > f24) {
                            this.d = L9 - f24;
                        } else {
                            float f25 = this.N;
                            if (f25 != 0.0f && f23 < f25) {
                                float f26 = f22 + f25;
                                this.f39903e = f26;
                                if (f26 > 1.0f) {
                                    this.f39903e = 1.0f;
                                }
                            }
                        }
                        float f27 = this.d;
                        float f28 = this.f39909s;
                        if (f27 > f28) {
                            this.f39909s = f27;
                        } else {
                            float f29 = this.f39903e;
                            if (f29 < f28) {
                                this.f39909s = f29;
                            }
                        }
                        v51 v51Var8 = this.F;
                        if (v51Var8 != null) {
                            ((com.google.android.gms.common.api.internal.s) v51Var8).f(this.f39903e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                v51 v51Var9 = this.F;
                if (v51Var9 != null) {
                    ((com.google.android.gms.common.api.internal.s) v51Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f39907n) {
                v51 v51Var10 = this.F;
                if (v51Var10 != null) {
                    ((com.google.android.gms.common.api.internal.s) v51Var10).d(1);
                }
                this.f39907n = false;
                return true;
            } else if (this.f39908r) {
                v51 v51Var11 = this.F;
                if (v51Var11 != null) {
                    ((com.google.android.gms.common.api.internal.s) v51Var11).d(2);
                }
                this.f39908r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(v51 v51Var) {
        this.F = v51Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.M = f10;
        float f11 = this.f39903e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.f39903e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.N = f10;
    }

    public void setMode(int i3) {
        if (this.Q == i3) {
            return;
        }
        this.Q = i3;
        invalidate();
    }

    public void setProgress(float f10) {
        float f11 = 0.0f;
        if (this.f39911x && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f39905f;
        }
        long j10 = this.f39896a;
        if (j10 != 0) {
            f11 = 240.0f / ((float) j10);
        }
        float f12 = this.f39909s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.f39903e) {
            this.f39902d0.e(true, 1.0f);
        }
        this.f39909s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.f39903e = f10;
        v51 v51Var = this.F;
        if (v51Var != null) {
            ((com.google.android.gms.common.api.internal.s) v51Var).c(1);
        }
        v51 v51Var2 = this.F;
        if (v51Var2 != null) {
            ((com.google.android.gms.common.api.internal.s) v51Var2).f(this.f39903e);
        }
        v51 v51Var3 = this.F;
        if (v51Var3 != null) {
            ((com.google.android.gms.common.api.internal.s) v51Var3).d(1);
        }
        invalidate();
    }
}
