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
public final class i61 extends View {
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
    public g61 P;
    public Path Q;
    public final Paint R;
    public boolean S;
    public long f34611a;
    public float f34612b;
    public float f34613c;
    public final Paint d;
    public final Paint f34614e;
    public boolean f34615f;
    public boolean h;
    public float f34616n;
    public MediaMetadataRetriever f34617r;
    public h61 f34618s;
    public final ArrayList f34619w;
    public f61 f34620x;
    public long f34621y;

    public i61(Context context) {
        super(context);
        this.f34613c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f34614e = paint2;
        this.f34619w = new ArrayList();
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
        paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false));
        this.L = 0;
        g61 g61Var = this.P;
        if (g61Var != null) {
            g61Var.b();
        }
    }

    public final void a(boolean z9) {
        synchronized (T) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f34617r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f34617r = null;
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
                while (i7 < this.f34619w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f34619w.get(i7);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i7++;
                }
            }
        }
        this.N.clear();
        this.f34619w.clear();
        f61 f61Var = this.f34620x;
        if (f61Var != null) {
            f61Var.cancel(true);
            this.f34620x = null;
        }
    }

    public final void b(int i7) {
        if (this.f34617r != null) {
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
                this.f34621y = this.f34611a / this.F;
                ArrayList arrayList = this.N;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.F;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.F; i10++) {
                        this.f34619w.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.O = false;
            f61 f61Var = new f61(this);
            this.f34620x = f61Var;
            f61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f34612b;
    }

    public float getRightProgress() {
        return this.f34613c;
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
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34612b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.f34613c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f34619w;
        if (arrayList.isEmpty() && this.f34620x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.O) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f34614e);
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
                canvas2.drawColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ge, false));
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
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34612b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f34613c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f34617r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        h61 h61Var = this.f34618s;
                        if (h61Var != null) {
                            ((me) h61Var).f36080a.Z2.M(0.0f, 1);
                        }
                        this.f34615f = true;
                        this.f34616n = (int) (x10 - L);
                        this.P.setTime((int) ((((float) this.f34611a) / 1000.0f) * this.f34612b));
                        this.P.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        h61 h61Var2 = this.f34618s;
                        if (h61Var2 != null) {
                            ((me) h61Var2).f36080a.Z2.M(0.0f, 1);
                        }
                        this.h = true;
                        this.f34616n = (int) (x10 - L2);
                        this.P.setTime((int) ((((float) this.f34611a) / 1000.0f) * this.f34613c));
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
                    if (this.f34615f) {
                        int i7 = (int) (x10 - this.f34616n);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L2) {
                            L2 = i7;
                        }
                        float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f34612b = L4;
                        float f11 = this.f34613c;
                        float f12 = f11 - L4;
                        float f13 = this.G;
                        if (f12 > f13) {
                            this.f34613c = L4 + f13;
                        } else {
                            float f14 = this.H;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f34612b = f15;
                                if (f15 < 0.0f) {
                                    this.f34612b = 0.0f;
                                }
                            }
                        }
                        this.P.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.f34612b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                        this.P.setTime((int) ((((float) this.f34611a) / 1000.0f) * this.f34612b));
                        this.P.a(true);
                        h61 h61Var3 = this.f34618s;
                        if (h61Var3 != null) {
                            float f16 = this.f34612b;
                            ChatActivityEnterView chatActivityEnterView = ((me) h61Var3).f36080a;
                            org.telegram.messenger.j20 j20Var = chatActivityEnterView.f31048e3;
                            if (j20Var != null) {
                                j20Var.f23471a = ((float) j20Var.f23488r) * f16;
                                chatActivityEnterView.Z2.M(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f34616n);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f34613c = L5;
                        float f17 = this.f34612b;
                        float f18 = L5 - f17;
                        float f19 = this.G;
                        if (f18 > f19) {
                            this.f34612b = L5 - f19;
                        } else {
                            float f20 = this.H;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f34613c = f21;
                                if (f21 > 1.0f) {
                                    this.f34613c = 1.0f;
                                }
                            }
                        }
                        this.P.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.f34613c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                        this.P.a(true);
                        this.P.setTime((int) ((((float) this.f34611a) / 1000.0f) * this.f34613c));
                        h61 h61Var4 = this.f34618s;
                        if (h61Var4 != null) {
                            float f22 = this.f34613c;
                            ChatActivityEnterView chatActivityEnterView2 = ((me) h61Var4).f36080a;
                            org.telegram.messenger.j20 j20Var2 = chatActivityEnterView2.f31048e3;
                            if (j20Var2 != null) {
                                j20Var2.f23473b = ((float) j20Var2.f23488r) * f22;
                                chatActivityEnterView2.Z2.M(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f34615f) {
                h61 h61Var5 = this.f34618s;
                if (h61Var5 != null) {
                    ((me) h61Var5).f36080a.Z2.M(0.0f, 0);
                }
                this.f34615f = false;
                invalidate();
                this.P.a(false);
                return true;
            } else if (this.h) {
                h61 h61Var6 = this.f34618s;
                if (h61Var6 != null) {
                    ((me) h61Var6).f36080a.Z2.M(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.P.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(h61 h61Var) {
        this.f34618s = h61Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.G = f10;
        float f11 = this.f34613c;
        float f12 = this.f34612b;
        if (f11 - f12 > f10) {
            this.f34613c = f12 + f10;
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

    public void setTimeHintView(g61 g61Var) {
        this.P = g61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f34617r = mediaMetadataRetriever;
        this.f34612b = 0.0f;
        this.f34613c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f34611a = Long.parseLong(this.f34617r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
