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
public abstract class s61 extends View {
    public static final Object f39447g0 = new Object();
    public MediaMetadataRetriever E;
    public r61 F;
    public final ArrayList G;
    public p61 H;
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
    public long f39448a;
    public final Paint f39449a0;
    public int f39450b;
    public final Paint f39451b0;
    public int f39452c;
    public final Paint f39453c0;
    public float d;
    public final d6 f39454d0;
    public float f39455e;
    public final Path f39456e0;
    public float f39457f;
    public boolean f39458f0;
    public boolean h;
    public boolean f39459n;
    public boolean f39460r;
    public float f39461s;
    public float f39462w;
    public boolean f39463x;
    public ParcelFileDescriptor f39464y;

    public s61(Context context) {
        super(context);
        this.f39455e = 1.0f;
        this.f39461s = 0.5f;
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
        this.f39449a0 = paint4;
        Paint paint5 = new Paint(1);
        this.f39451b0 = paint5;
        Paint paint6 = new Paint(1);
        this.f39453c0 = paint6;
        this.f39454d0 = new d6(0.0f, this, 0L, 200L, nr.f37920j);
        this.f39456e0 = new Path();
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
        synchronized (f39447g0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f39464y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.f39464y = null;
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
        for (int i7 = 0; i7 < this.G.size(); i7++) {
            q61 q61Var = (q61) this.G.get(i7);
            if (q61Var != null && (bitmap = q61Var.f38750a) != null) {
                bitmap.recycle();
            }
        }
        this.G.clear();
        p61 p61Var = this.H;
        if (p61Var != null) {
            p61Var.cancel(true);
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

    public final void d(int i7) {
        float f10;
        int i10;
        if (this.E == null) {
            return;
        }
        if (i7 == 0) {
            this.K = org.telegram.messenger.g0.L(38.0f);
            int i11 = this.f39450b;
            if (i11 != 0 && (i10 = this.f39452c) != 0) {
                f10 = i11 / i10;
            } else {
                f10 = 1.0f;
            }
            this.L = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / (this.K * Utilities.i(f10, 1.3333334f, 0.5625f))));
            this.J = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f)) / this.L);
            this.I = this.f39448a / this.L;
        }
        p61 p61Var = new p61(this);
        this.H = p61Var;
        p61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.f39448a);
    }

    public float getProgress() {
        return this.f39461s;
    }

    public float getRightProgress() {
        return this.f39455e;
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
        float L2 = org.telegram.messenger.g0.L(10.0f) + N + ((int) ((measuredWidth - org.telegram.messenger.g0.L(20.0f)) * this.f39455e));
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = L3 + org.telegram.messenger.g0.L(38.0f);
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.f39456e0;
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
            this.f39458f0 = z10;
            if (!z10) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    } else if (((q61) arrayList.get(i7)).f38750a == null) {
                        this.f39458f0 = true;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (this.f39458f0) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(N, L3, org.telegram.messenger.g0.L(4.0f) + f16, L4);
                b(canvas, rectF3);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q61 q61Var = (q61) arrayList.get(i11);
                Bitmap bitmap = q61Var.f38750a;
                if (bitmap != null) {
                    float f17 = (this.J * i10) + N;
                    float L5 = org.telegram.messenger.g0.L(6.0f);
                    float f18 = q61Var.f38751b;
                    if (f18 != 1.0f) {
                        float f19 = f18 + 0.045714285f;
                        q61Var.f38751b = f19;
                        if (f19 > 1.0f) {
                            q61Var.f38751b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.R;
                        paint.setAlpha((int) (nr.h.getInterpolation(q61Var.f38751b) * 255.0f));
                        canvas.drawBitmap(bitmap, f17, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f17, L5, (Paint) null);
                    }
                }
                i10++;
            }
            float L6 = org.telegram.messenger.g0.L(46.0f);
            Paint paint2 = this.f39449a0;
            canvas.drawRect(N, L3, L, L6, paint2);
            f13 = L;
            canvas.drawRect(L2, L3, f16, L4, paint2);
            f14 = L2;
            f15 = L3;
            canvas.restore();
        }
        boolean z11 = this.f39463x;
        Paint paint3 = this.U;
        if (!z11) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.O;
            rectF4.set(f13 - org.telegram.messenger.g0.N(f11), f15, org.telegram.messenger.g0.N(f11) + f14, L4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint3);
            rectF4.set(f13, org.telegram.messenger.g0.N(f10) + f15, f14, L4 - org.telegram.messenger.g0.N(f10));
            canvas2.drawRect(rectF4, this.f39451b0);
            canvas2.restore();
            float L7 = org.telegram.messenger.g0.L(f10);
            float L8 = org.telegram.messenger.g0.L(f11);
            float N2 = f13 - ((org.telegram.messenger.g0.N(f11) - L7) / f10);
            float f20 = (((L4 - f15) - L8) / f10) + f15;
            float f21 = L8 + f20;
            rectF4.set(N2, f20, N2 - L7, f21);
            float N3 = org.telegram.messenger.g0.N(f12);
            float N4 = org.telegram.messenger.g0.N(f12);
            Paint paint4 = this.f39453c0;
            canvas2.drawRoundRect(rectF4, N3, N4, paint4);
            float N5 = ((org.telegram.messenger.g0.N(f11) - L7) / f10) + f14;
            rectF4.set(N5, f20, L7 + N5, f21);
            canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f12), paint4);
        } else {
            canvas2 = canvas;
        }
        float e10 = this.f39454d0.e(false, 0.0f);
        if (e10 > 0.0f) {
            c(this.f39455e, e10, canvas2, paint3);
        }
        c(this.f39461s, 1.0f - e10, canvas2, paint3);
        if (this.f39463x) {
            c(this.f39457f, 1.0f, canvas2, this.V);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (Build.VERSION.SDK_INT >= 29) {
            this.T.set(i7, 0, i11, getMeasuredHeight());
            setSystemGestureExclusionRects(this.S);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.P != size) {
            int i11 = 0;
            while (true) {
                arrayList = this.G;
                if (i11 >= arrayList.size()) {
                    break;
                }
                q61 q61Var = (q61) arrayList.get(i11);
                if (q61Var != null && (bitmap = q61Var.f38750a) != null) {
                    bitmap.recycle();
                }
                i11++;
            }
            arrayList.clear();
            p61 p61Var = this.H;
            if (p61Var != null) {
                p61Var.cancel(true);
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
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(44.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(22.0f) + ((int) (this.d * f10));
            int L2 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f39461s * f10));
            int L3 = org.telegram.messenger.g0.L(22.0f) + ((int) (this.f39455e * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.E != null) {
                    int L4 = org.telegram.messenger.g0.L(16.0f);
                    int L5 = org.telegram.messenger.g0.L(8.0f);
                    if (L3 != L && L2 - L5 <= x10 && x10 <= L5 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        r61 r61Var = this.F;
                        if (r61Var != null) {
                            ((com.google.android.gms.common.api.internal.t) r61Var).c(2);
                        }
                        this.f39460r = true;
                        this.f39462w = (int) (x10 - L2);
                        invalidate();
                        return true;
                    } else if (L - L4 <= x10 && x10 <= Math.min(L + L4, L3) && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        r61 r61Var2 = this.F;
                        if (r61Var2 != null) {
                            ((com.google.android.gms.common.api.internal.t) r61Var2).c(0);
                        }
                        this.h = true;
                        this.f39462w = (int) (x10 - L);
                        invalidate();
                        return true;
                    } else if (L3 - L4 <= x10 && x10 <= L4 + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        r61 r61Var3 = this.F;
                        if (r61Var3 != null) {
                            ((com.google.android.gms.common.api.internal.t) r61Var3).c(1);
                        }
                        this.f39459n = true;
                        this.f39462w = (int) (x10 - L3);
                        invalidate();
                        return true;
                    } else if (L <= x10 && x10 <= L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        r61 r61Var4 = this.F;
                        if (r61Var4 != null) {
                            ((com.google.android.gms.common.api.internal.t) r61Var4).c(2);
                        }
                        this.f39460r = true;
                        float L6 = (x10 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39461s = L6;
                        r61 r61Var5 = this.F;
                        if (r61Var5 != null) {
                            com.google.android.gms.common.api.internal.t tVar = (com.google.android.gms.common.api.internal.t) r61Var5;
                            PhotoViewer photoViewer = (PhotoViewer) tVar.d;
                            if (photoViewer.G2 != null) {
                                if (photoViewer.d2 == 1) {
                                    tVar.j(0);
                                }
                                tVar.h(L6);
                            }
                        }
                        this.f39462w = 0.0f;
                        invalidate();
                        return true;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f39460r) {
                        float L7 = (((int) (x10 - this.f39462w)) - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39461s = L7;
                        float f11 = this.d;
                        if (L7 < f11) {
                            this.f39461s = f11;
                        } else {
                            float f12 = this.f39455e;
                            if (L7 > f12) {
                                this.f39461s = f12;
                            }
                        }
                        r61 r61Var6 = this.F;
                        if (r61Var6 != null) {
                            float f13 = this.f39461s;
                            com.google.android.gms.common.api.internal.t tVar2 = (com.google.android.gms.common.api.internal.t) r61Var6;
                            PhotoViewer photoViewer2 = (PhotoViewer) tVar2.d;
                            if (photoViewer2.G2 != null) {
                                if (photoViewer2.d2 == 1) {
                                    tVar2.j(0);
                                }
                                tVar2.h(f13);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i7 = (int) (x10 - this.f39462w);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L3 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L3) {
                            L3 = i7;
                        }
                        float L8 = (L3 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.d = L8;
                        float f14 = this.f39455e;
                        float f15 = f14 - L8;
                        float f16 = this.M;
                        if (f15 > f16) {
                            this.f39455e = L8 + f16;
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
                        float f20 = this.f39461s;
                        if (f19 > f20) {
                            this.f39461s = f19;
                        } else {
                            float f21 = this.f39455e;
                            if (f21 < f20) {
                                this.f39461s = f21;
                            }
                        }
                        r61 r61Var7 = this.F;
                        if (r61Var7 != null) {
                            com.google.android.gms.common.api.internal.t tVar3 = (com.google.android.gms.common.api.internal.t) r61Var7;
                            PhotoViewer photoViewer3 = (PhotoViewer) tVar3.d;
                            i61 i61Var = photoViewer3.G2;
                            if (i61Var != null) {
                                if (i61Var.d0()) {
                                    photoViewer3.H2 = false;
                                    photoViewer3.G2.g0();
                                    photoViewer3.f43218f0.invalidate();
                                }
                                tVar3.j(1);
                                tVar3.h(f19);
                                photoViewer3.f43314q3.h(false, 0.0f);
                                photoViewer3.S7.setProgress(f19);
                                photoViewer3.A3();
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.f39459n) {
                        int i10 = (int) (x10 - this.f39462w);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L9 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39455e = L9;
                        float f22 = this.d;
                        float f23 = L9 - f22;
                        float f24 = this.M;
                        if (f23 > f24) {
                            this.d = L9 - f24;
                        } else {
                            float f25 = this.N;
                            if (f25 != 0.0f && f23 < f25) {
                                float f26 = f22 + f25;
                                this.f39455e = f26;
                                if (f26 > 1.0f) {
                                    this.f39455e = 1.0f;
                                }
                            }
                        }
                        float f27 = this.d;
                        float f28 = this.f39461s;
                        if (f27 > f28) {
                            this.f39461s = f27;
                        } else {
                            float f29 = this.f39455e;
                            if (f29 < f28) {
                                this.f39461s = f29;
                            }
                        }
                        r61 r61Var8 = this.F;
                        if (r61Var8 != null) {
                            ((com.google.android.gms.common.api.internal.t) r61Var8).f(this.f39455e);
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.h) {
                r61 r61Var9 = this.F;
                if (r61Var9 != null) {
                    ((com.google.android.gms.common.api.internal.t) r61Var9).d(0);
                }
                this.h = false;
                return true;
            } else if (this.f39459n) {
                r61 r61Var10 = this.F;
                if (r61Var10 != null) {
                    ((com.google.android.gms.common.api.internal.t) r61Var10).d(1);
                }
                this.f39459n = false;
                return true;
            } else if (this.f39460r) {
                r61 r61Var11 = this.F;
                if (r61Var11 != null) {
                    ((com.google.android.gms.common.api.internal.t) r61Var11).d(2);
                }
                this.f39460r = false;
            }
            return true;
        }
        return false;
    }

    public void setDelegate(r61 r61Var) {
        this.F = r61Var;
    }

    public void setMaxProgressDiff(float f10) {
        this.M = f10;
        float f11 = this.f39455e;
        float f12 = this.d;
        if (f11 - f12 > f10) {
            this.f39455e = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.N = f10;
    }

    public void setMode(int i7) {
        if (this.Q == i7) {
            return;
        }
        this.Q = i7;
        invalidate();
    }

    public void setProgress(float f10) {
        float f11 = 0.0f;
        if (this.f39463x && (f10 <= 0.0f || f10 >= 1.0f)) {
            f10 = this.f39457f;
        }
        long j3 = this.f39448a;
        if (j3 != 0) {
            f11 = 240.0f / ((float) j3);
        }
        float f12 = this.f39461s;
        if (f10 < f12 && f10 <= this.d + f11 && f12 + f11 >= this.f39455e) {
            this.f39454d0.e(true, 1.0f);
        }
        this.f39461s = f10;
        invalidate();
    }

    public void setRightProgress(float f10) {
        this.f39455e = f10;
        r61 r61Var = this.F;
        if (r61Var != null) {
            ((com.google.android.gms.common.api.internal.t) r61Var).c(1);
        }
        r61 r61Var2 = this.F;
        if (r61Var2 != null) {
            ((com.google.android.gms.common.api.internal.t) r61Var2).f(this.f39455e);
        }
        r61 r61Var3 = this.F;
        if (r61Var3 != null) {
            ((com.google.android.gms.common.api.internal.t) r61Var3).d(1);
        }
        invalidate();
    }
}
