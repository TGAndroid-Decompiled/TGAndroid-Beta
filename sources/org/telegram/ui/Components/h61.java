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
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class h61 extends View {
    public static final Object T = new Object();
    public int D;
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public Rect J;
    public Rect K;
    public int L;
    public Bitmap M;
    public final ArrayList N;
    public boolean O;
    public f61 P;
    public Path Q;
    public final Paint R;
    public boolean S;
    public long f34211a;
    public float f34212b;
    public float f34213c;
    public final Paint d;
    public final Paint f34214e;
    public boolean f34215f;
    public boolean h;
    public float f34216n;
    public MediaMetadataRetriever f34217r;
    public g61 f34218s;
    public final ArrayList f34219w;
    public e61 f34220x;
    public long f34221y;

    public h61(Context context) {
        super(context);
        this.f34213c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f34214e = paint2;
        this.f34219w = new ArrayList();
        this.G = 1.0f;
        this.H = 0.0f;
        this.N = new ArrayList();
        Paint paint3 = new Paint(1);
        this.R = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
        this.L = 0;
        f61 f61Var = this.P;
        if (f61Var != null) {
            f61Var.b();
        }
    }

    public final void a(boolean z9) {
        synchronized (T) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f34217r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f34217r = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (z9) {
            int i7 = 0;
            if (!this.N.isEmpty()) {
                while (i7 < this.N.size()) {
                    Bitmap bitmap = (Bitmap) this.N.get(i7);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i7++;
                }
            } else {
                while (i7 < this.f34219w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f34219w.get(i7);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i7++;
                }
            }
        }
        this.N.clear();
        this.f34219w.clear();
        e61 e61Var = this.f34220x;
        if (e61Var != null) {
            e61Var.cancel(true);
            this.f34220x = null;
        }
    }

    public final void b(int i7) {
        if (this.f34217r != null) {
            if (i7 == 0) {
                if (this.I) {
                    int L = org.telegram.messenger.g0.L(56.0f);
                    this.D = L;
                    this.E = L;
                    this.F = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / (this.E / 2.0f)));
                } else {
                    this.E = org.telegram.messenger.g0.L(40.0f);
                    this.F = Math.max(1, (getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.E);
                    this.D = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.F);
                }
                this.f34221y = this.f34211a / this.F;
                ArrayList arrayList = this.N;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.F;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.F; i10++) {
                        this.f34219w.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.O = false;
            e61 e61Var = new e61(this);
            this.f34220x = e61Var;
            e61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f34212b;
    }

    public float getRightProgress() {
        return this.f34213c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (this.S) {
            canvas.save();
            Path path = this.Q;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34212b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.f34213c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f34219w;
        if (arrayList.isEmpty() && this.f34220x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.O) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f34214e);
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z9 = this.I;
                    int i12 = this.D;
                    if (z9) {
                        i12 /= 2;
                    }
                    int i13 = i12 * i11;
                    if (z9) {
                        this.K.set(i13, measuredHeight, org.telegram.messenger.g0.L(28.0f) + i13, org.telegram.messenger.g0.L(f10) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.J, this.K, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i13, measuredHeight, (Paint) null);
                    }
                }
                i11++;
                i10++;
                f10 = 32.0f;
            }
            float f11 = measuredHeight;
            Paint paint = this.d;
            canvas.drawRect(0.0f, f11, L, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(L2, f11, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.R;
            canvas.drawLine(L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + measuredHeight, L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.S) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (org.telegram.messenger.g0.L(6.0f) != this.L) {
                this.L = org.telegram.messenger.g0.L(6.0f);
                this.M = Bitmap.createBitmap(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.M);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ge, false));
                float f12 = this.L;
                canvas2.drawCircle(f12, f12, f12, paint3);
            }
            int i14 = this.L >> 1;
            canvas.save();
            float f13 = 0;
            canvas.drawBitmap(this.M, f13, f11, (Paint) null);
            float f14 = (measuredHeight2 + measuredHeight) - i14;
            canvas.rotate(-90.0f, i14, f14);
            canvas.drawBitmap(this.M, f13, i7 - this.L, (Paint) null);
            canvas.restore();
            canvas.save();
            float f15 = measuredWidth2 - i14;
            canvas.rotate(180.0f, f15, f14);
            Bitmap bitmap2 = this.M;
            int i15 = this.L;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i15, i7 - i15, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f15, measuredHeight + i14);
            canvas.drawBitmap(this.M, measuredWidth2 - this.L, f11, (Paint) null);
            canvas.restore();
        } else if (this.S) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.S) {
            if (this.Q == null) {
                this.Q = new Path();
            }
            this.Q.rewind();
            int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.Q.addRoundRect(rectF, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34212b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34213c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f34217r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        g61 g61Var = this.f34218s;
                        if (g61Var != null) {
                            ((le) g61Var).f35664a.Z2.M(0.0f, 1);
                        }
                        this.f34215f = true;
                        this.f34216n = (int) (x10 - L);
                        this.P.setTime((int) ((((float) this.f34211a) / 1000.0f) * this.f34212b));
                        this.P.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        g61 g61Var2 = this.f34218s;
                        if (g61Var2 != null) {
                            ((le) g61Var2).f35664a.Z2.M(0.0f, 1);
                        }
                        this.h = true;
                        this.f34216n = (int) (x10 - L2);
                        this.P.setTime((int) ((((float) this.f34211a) / 1000.0f) * this.f34213c));
                        this.P.setCx((getLeft() + L2) - org.telegram.messenger.g0.L(4.0f));
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else {
                        this.P.a(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f34215f) {
                        int i7 = (int) (x10 - this.f34216n);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L2) {
                            L2 = i7;
                        }
                        float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f34212b = L4;
                        float f11 = this.f34213c;
                        float f12 = f11 - L4;
                        float f13 = this.G;
                        if (f12 > f13) {
                            this.f34213c = L4 + f13;
                        } else {
                            float f14 = this.H;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f34212b = f15;
                                if (f15 < 0.0f) {
                                    this.f34212b = 0.0f;
                                }
                            }
                        }
                        this.P.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.f34212b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                        this.P.setTime((int) ((((float) this.f34211a) / 1000.0f) * this.f34212b));
                        this.P.a(true);
                        g61 g61Var3 = this.f34218s;
                        if (g61Var3 != null) {
                            float f16 = this.f34212b;
                            ChatActivityEnterView chatActivityEnterView = ((le) g61Var3).f35664a;
                            org.telegram.messenger.j20 j20Var = chatActivityEnterView.f31059e3;
                            if (j20Var != null) {
                                j20Var.f23475a = ((float) j20Var.f23492r) * f16;
                                chatActivityEnterView.Z2.M(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f34216n);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f34213c = L5;
                        float f17 = this.f34212b;
                        float f18 = L5 - f17;
                        float f19 = this.G;
                        if (f18 > f19) {
                            this.f34212b = L5 - f19;
                        } else {
                            float f20 = this.H;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f34213c = f21;
                                if (f21 > 1.0f) {
                                    this.f34213c = 1.0f;
                                }
                            }
                        }
                        this.P.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.f34213c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                        this.P.a(true);
                        this.P.setTime((int) ((((float) this.f34211a) / 1000.0f) * this.f34213c));
                        g61 g61Var4 = this.f34218s;
                        if (g61Var4 != null) {
                            float f22 = this.f34213c;
                            ChatActivityEnterView chatActivityEnterView2 = ((le) g61Var4).f35664a;
                            org.telegram.messenger.j20 j20Var2 = chatActivityEnterView2.f31059e3;
                            if (j20Var2 != null) {
                                j20Var2.f23477b = ((float) j20Var2.f23492r) * f22;
                                chatActivityEnterView2.Z2.M(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f34215f) {
                g61 g61Var5 = this.f34218s;
                if (g61Var5 != null) {
                    ((le) g61Var5).f35664a.Z2.M(0.0f, 0);
                }
                this.f34215f = false;
                invalidate();
                this.P.a(false);
                return true;
            } else if (this.h) {
                g61 g61Var6 = this.f34218s;
                if (g61Var6 != null) {
                    ((le) g61Var6).f35664a.Z2.M(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.P.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(g61 g61Var) {
        this.f34218s = g61Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.G = f10;
        float f11 = this.f34213c;
        float f12 = this.f34212b;
        if (f11 - f12 > f10) {
            this.f34213c = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.H = f10;
    }

    public void setRoundFrames(boolean z9) {
        this.I = z9;
        if (z9) {
            this.J = new Rect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
            this.K = new Rect();
        }
    }

    public void setTimeHintView(f61 f61Var) {
        this.P = f61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f34217r = mediaMetadataRetriever;
        this.f34212b = 0.0f;
        this.f34213c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f34211a = Long.parseLong(this.f34217r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
