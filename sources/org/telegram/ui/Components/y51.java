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
public abstract class y51 extends View {
    public static final Object f40514f0 = new Object();
    public MediaMetadataRetriever D;
    public x51 E;
    public final ArrayList F;
    public v51 G;
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
    public long f40515a;
    public final Paint f40516a0;
    public int f40517b;
    public final Paint f40518b0;
    public int f40519c;
    public final w5 f40520c0;
    public float d;
    public final Path f40521d0;
    public float f40522e;
    public boolean f40523e0;
    public float f40524f;
    public boolean h;
    public boolean f40525n;
    public boolean f40526r;
    public float f40527s;
    public float f40528w;
    public boolean f40529x;
    public ParcelFileDescriptor f40530y;

    public y51(Context context) {
        super(context);
        this.f40522e = 1.0f;
        this.f40527s = 0.5f;
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
        this.f40516a0 = paint5;
        Paint paint6 = new Paint(1);
        this.f40518b0 = paint6;
        this.f40520c0 = new w5(0.0f, this, 0L, 200L, xq.f40313j);
        this.f40521d0 = new Path();
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
        synchronized (f40514f0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f40530y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f40530y = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.D;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.D = null;
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        for (int i7 = 0; i7 < this.F.size(); i7++) {
            w51 w51Var = (w51) this.F.get(i7);
            if (w51Var != null && (bitmap = w51Var.f39860a) != null) {
                bitmap.recycle();
            }
        }
        this.F.clear();
        v51 v51Var = this.G;
        if (v51Var != null) {
            v51Var.cancel(true);
            this.G = null;
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
        Paint paint2 = this.V;
        paint2.setAlpha((int) (38.0f * f11));
        paint.setAlpha((int) (f11 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (N * 2.0f)) - org.telegram.messenger.g0.L(20.0f)) * f10) + N + org.telegram.messenger.g0.L(10.0f);
        RectF rectF = this.N;
        rectF.set(measuredWidth - org.telegram.messenger.g0.N(1.5f), f13, org.telegram.messenger.g0.N(1.5f) + measuredWidth, f14);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
        rectF.set(measuredWidth - org.telegram.messenger.g0.N(1.5f), f13, org.telegram.messenger.g0.N(1.5f) + measuredWidth, f14);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
    }

    public final void d(int i7) {
        float f10;
        int i10;
        if (this.D == null) {
            return;
        }
        if (i7 == 0) {
            this.J = org.telegram.messenger.g0.L(38.0f);
            int i11 = this.f40517b;
            if (i11 != 0 && (i10 = this.f40519c) != 0) {
                f10 = i11 / i10;
            } else {
                f10 = 1.0f;
            }
            this.K = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / (this.J * Utilities.i(f10, 1.3333334f, 0.5625f))));
            this.I = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / this.K);
            this.H = this.f40515a / this.K;
        }
        v51 v51Var = new v51(this);
        this.G = v51Var;
        v51Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f40515a);
    }

    public float getProgress() {
        return this.f40527s;
    }

    public float getRightProgress() {
        return this.f40522e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9;
        float f13;
        float f14;
        float f15;
        Canvas canvas2;
        float N = org.telegram.messenger.g0.N(12.0f);
        float measuredWidth = getMeasuredWidth() - (N * 2.0f);
        float L = org.telegram.messenger.g0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.g0.L(20.0f)) * this.d));
        float L2 = org.telegram.messenger.g0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.g0.L(20.0f)) * this.f40522e));
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = L3 + org.telegram.messenger.g0.L(38.0f);
        ArrayList arrayList = this.F;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f40521d0;
        if (isEmpty && this.G == null) {
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
            if (arrayList.size() < this.K) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f40523e0 = z9;
            if (!z9) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    } else if (((w51) arrayList.get(i7)).f39860a == null) {
                        this.f40523e0 = true;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (this.f40523e0) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(N, L3, org.telegram.messenger.g0.L(4.0f) + f16, L4);
                b(canvas, rectF3);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                w51 w51Var = (w51) arrayList.get(i11);
                Bitmap bitmap = w51Var.f39860a;
                if (bitmap != null) {
                    float f17 = (this.I * i10) + N;
                    float L5 = org.telegram.messenger.g0.L(6.0f);
                    float f18 = w51Var.f39861b;
                    if (f18 != 1.0f) {
                        float f19 = f18 + 0.045714285f;
                        w51Var.f39861b = f19;
                        if (f19 > 1.0f) {
                            w51Var.f39861b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.Q;
                        paint.setAlpha((int) (xq.h.getInterpolation(w51Var.f39861b) * 255.0f));
                        canvas.drawBitmap(bitmap, f17, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f17, L5, (Paint) null);
                    }
                }
                i10++;
            }
            float L6 = org.telegram.messenger.g0.L(46.0f);
            Paint paint2 = this.W;
            canvas.drawRect(N, L3, L, L6, paint2);
            f13 = L;
            canvas.drawRect(L2, L3, f16, L4, paint2);
            f14 = L2;
            f15 = L3;
            canvas.restore();
        }
        boolean z10 = this.f40529x;
        Paint paint3 = this.T;
        if (!z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.N;
            rectF4.set(f13 - org.telegram.messenger.g0.N(f11), f15, org.telegram.messenger.g0.N(f11) + f14, L4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint3);
            rectF4.set(f13, org.telegram.messenger.g0.N(f10) + f15, f14, L4 - org.telegram.messenger.g0.N(f10));
            canvas2.drawRect(rectF4, this.f40516a0);
            canvas2.restore();
            float L7 = org.telegram.messenger.g0.L(f10);
            float L8 = org.telegram.messenger.g0.L(f11);
            float N2 = f13 - ((org.telegram.messenger.g0.N(f11) - L7) / f10);
            float f20 = (((L4 - f15) - L8) / f10) + f15;
            float f21 = L8 + f20;
            rectF4.set(N2, f20, N2 - L7, f21);
            float N3 = org.telegram.messenger.g0.N(f12);
            float N4 = org.telegram.messenger.g0.N(f12);
            Paint paint4 = this.f40518b0;
            canvas2.drawRoundRect(rectF4, N3, N4, paint4);
            float N5 = ((org.telegram.messenger.g0.N(f11) - L7) / f10) + f14;
            rectF4.set(N5, f20, L7 + N5, f21);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint4);
        } else {
            canvas2 = canvas;
        }
        float e10 = this.f40520c0.e(false, 0.0f);
        if (e10 > 0.0f) {
            c(this.f40522e, e10, canvas2, paint3);
        }
        c(this.f40527s, 1.0f - e10, canvas2, paint3);
        if (this.f40529x) {
            c(this.f40524f, 1.0f, canvas2, this.U);
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            this.S.set(i7, 0, i11, getMeasuredHeight());
            setSystemGestureExclusionRects(this.R);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.O != size) {
            int i11 = 0;
            while (true) {
                arrayList = this.F;
                if (i11 >= arrayList.size()) {
                    break;
                }
                w51 w51Var = (w51) arrayList.get(i11);
                if (w51Var != null && (bitmap = w51Var.f39860a) != null) {
                    bitmap.recycle();
                }
                i11++;
            }
            arrayList.clear();
            v51 v51Var = this.G;
            if (v51Var != null) {
                v51Var.cancel(true);
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
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(44.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(22.0f) + ((int) (this.d * f10));
            int L2 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f40527s * f10));
            int L3 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f40522e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.D != null) {
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    int L5 = org.telegram.messenger.g0.L(8.0f);
                    if (L3 != L && L2 - L5 <= x10 && x10 <= L5 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        x51 x51Var = this.E;
                        if (x51Var != null) {
                            ((com.google.android.gms.common.api.internal.s) x51Var).c(2);
                        }
                        this.f40526r = true;
                        this.f40528w = (int) (x10 - L2);
                        invalidate();
                        return true;
                    } else if (L - L4 <= x10 && x10 <= Math.min(L + L4, L3) && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        x51 x51Var2 = this.E;
                        if (x51Var2 != null) {
                            ((com.google.android.gms.common.api.internal.s) x51Var2).c(0);
                        }
                        this.h = true;
                        this.f40528w = (int) (x10 - L);
                        invalidate();
                        return true;
                    } else if (L3 - L4 <= x10 && x10 <= L4 + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        x51 x51Var3 = this.E;
                        if (x51Var3 != null) {
                            ((com.google.android.gms.common.api.internal.s) x51Var3).c(1);
                        }
                        this.f40525n = true;
                        this.f40528w = (int) (x10 - L3);
                        invalidate();
                        return true;
                    } else if (L <= x10 && x10 <= L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        x51 x51Var4 = this.E;
                        if (x51Var4 != null) {
                            ((com.google.android.gms.common.api.internal.s) x51Var4).c(2);
                        }
                        this.f40526r = true;
                        float L6 = (x10 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f40527s = L6;
                        x51 x51Var5 = this.E;
                        if (x51Var5 != null) {
                            com.google.android.gms.common.api.internal.s sVar = (com.google.android.gms.common.api.internal.s) x51Var5;
                            PhotoViewer photoViewer = (PhotoViewer) sVar.d;
                            if (photoViewer.F2 != null) {
                                if (photoViewer.f41340c2 == 1) {
                                    sVar.j(0);
                                }
                                sVar.h(L6);
                            }
                        }
                        this.f40528w = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f40526r) {
                        float L7 = (((int) (x10 - this.f40528w)) - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f40527s = L7;
                        float f11 = this.d;
                        if (L7 < f11) {
                            this.f40527s = f11;
                        } else {
                            float f12 = this.f40522e;
                            if (L7 > f12) {
                                this.f40527s = f12;
                            }
                        }
                        x51 x51Var6 = this.E;
                        if (x51Var6 != null) {
                            float f13 = this.f40527s;
                            com.google.android.gms.common.api.internal.s sVar2 = (com.google.android.gms.common.api.internal.s) x51Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) sVar2.d;
                            if (photoViewer2.F2 != null) {
                                if (photoViewer2.f41340c2 == 1) {
                                    sVar2.j(0);
                                }
                                sVar2.h(f13);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i7 = (int) (x10 - this.f40528w);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L3 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L3) {
                            L3 = i7;
                        }
                        float L8 = (L3 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.d = L8;
                        float f14 = this.f40522e;
                        float f15 = f14 - L8;
                        float f16 = this.L;
                        if (f15 > f16) {
                            this.f40522e = L8 + f16;
                        } else {
                            float f17 = this.M;
                            if (f17 != 0.0f && f15 < f17) {
                                float f18 = f14 - f17;
                                this.d = f18;
                                if (f18 < 0.0f) {
                                    this.d = 0.0f;
                                }
                            }
                        }
                        float f19 = this.d;
                        float f20 = this.f40527s;
                        if (f19 > f20) {
                            this.f40527s = f19;
                        } else {
                            float f21 = this.f40522e;
                            if (f21 < f20) {
                                this.f40527s = f21;
                            }
                        }
                        x51 x51Var7 = this.E;
                        if (x51Var7 != null) {
                            com.google.android.gms.common.api.internal.s sVar3 = (com.google.android.gms.common.api.internal.s) x51Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) sVar3.d;
                            n51 n51Var = photoViewer3.F2;
                            if (n51Var != null) {
                                if (n51Var.d0()) {
                                    photoViewer3.G2 = false;
                                    photoViewer3.F2.g0();
                                    photoViewer3.f41356e0.invalidate();
                                }
                                sVar3.j(1);
                                sVar3.h(f19);
                                photoViewer3.f41453p3.h(false, 0.0f);
                                photoViewer3.R7.setProgress(f19);
                                photoViewer3.z3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f40525n) {
                        int i10 = (int) (x10 - this.f40528w);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L9 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f40522e = L9;
                        float f22 = this.d;
                        float f23 = L9 - f22;
                        float f24 = this.L;
                        if (f23 > f24) {
                            this.d = L9 - f24;
                        } else {
                            float f25 = this.M;
                            if (f25 != 0.0f && f23 < f25) {
                                float f26 = f22 + f25;
                                this.f40522e = f26;
                                if (f26 > 1.0f) {
                                    this.f40522e = 1.0f;
                                }
                            }
                        }
                        float f27 = this.d;
                        float f28 = this.f40527s;
                        if (f27 > f28) {
                            this.f40527s = f27;
                        } else {
                            float f29 = this.f40522e;
                            if (f29 < f28) {
                                this.f40527s = f29;
                            }
                        }
                        x51 x51Var8 = this.E;
                        if (x51Var8 != null) {
                            ((com.google.android.gms.common.api.internal.s) x51Var8).f(this.f40522e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                x51 x51Var9 = this.E;
                if (x51Var9 != null) {
                    ((com.google.android.gms.common.api.internal.s) x51Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f40525n) {
                x51 x51Var10 = this.E;
                if (x51Var10 != null) {
                    ((com.google.android.gms.common.api.internal.s) x51Var10).d(1);
                }
                this.f40525n = false;
                return true;
            } else if (this.f40526r) {
                x51 x51Var11 = this.E;
                if (x51Var11 != null) {
                    ((com.google.android.gms.common.api.internal.s) x51Var11).d(2);
                }
                this.f40526r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(x51 x51Var) {
        this.E = x51Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.L = f10;
        float f11 = this.f40522e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.f40522e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.M = f10;
    }

    public void setMode(int i7) {
        if (this.P == i7) {
            return;
        }
        this.P = i7;
        invalidate();
    }

    public void setProgress(float f10) {
        float f11 = 0.0f;
        if (this.f40529x && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f40524f;
        }
        long j3 = this.f40515a;
        if (j3 != 0) {
            f11 = 240.0f / ((float) j3);
        }
        float f12 = this.f40527s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.f40522e) {
            this.f40520c0.e(true, 1.0f);
        }
        this.f40527s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.f40522e = f10;
        x51 x51Var = this.E;
        if (x51Var != null) {
            ((com.google.android.gms.common.api.internal.s) x51Var).c(1);
        }
        x51 x51Var2 = this.E;
        if (x51Var2 != null) {
            ((com.google.android.gms.common.api.internal.s) x51Var2).f(this.f40522e);
        }
        x51 x51Var3 = this.E;
        if (x51Var3 != null) {
            ((com.google.android.gms.common.api.internal.s) x51Var3).d(1);
        }
        invalidate();
    }
}
