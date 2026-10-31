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
public final class j71 extends View {
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
    public h71 P;
    public Path Q;
    public final Paint R;
    public boolean S;
    public long f27243a;
    public float f27244b;
    public float f27245c;
    public final Paint d;
    public final Paint e;
    public boolean f27246f;
    public boolean h;
    public float f27247n;
    public MediaMetadataRetriever f27248r;
    public i71 f27249s;
    public final ArrayList f27250w;
    public g71 f27251x;
    public long f27252y;

    public j71(Context context) {
        super(context);
        this.f27245c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.f27250w = new ArrayList();
        this.G = 1.0f;
        this.H = 0.0f;
        this.N = new ArrayList();
        Paint paint3 = new Paint(1);
        this.R = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false));
        this.L = 0;
        h71 h71Var = this.P;
        if (h71Var != null) {
            h71Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (T) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f27248r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f27248r = null;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        if (z10) {
            int i10 = 0;
            if (!this.N.isEmpty()) {
                while (i10 < this.N.size()) {
                    Bitmap bitmap = (Bitmap) this.N.get(i10);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i10++;
                }
            } else {
                while (i10 < this.f27250w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f27250w.get(i10);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i10++;
                }
            }
        }
        this.N.clear();
        this.f27250w.clear();
        g71 g71Var = this.f27251x;
        if (g71Var != null) {
            g71Var.cancel(true);
            this.f27251x = null;
        }
    }

    public final void b(int i10) {
        if (this.f27248r != null) {
            if (i10 == 0) {
                if (this.I) {
                    int L = org.telegram.messenger.i0.L(56.0f);
                    this.D = L;
                    this.E = L;
                    this.F = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) / (this.E / 2.0f)));
                } else {
                    this.E = org.telegram.messenger.i0.L(40.0f);
                    this.F = Math.max(1, (getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) / this.E);
                    this.D = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) / this.F);
                }
                this.f27252y = this.f27243a / this.F;
                ArrayList arrayList = this.N;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.F;
                    float f7 = 0.0f;
                    for (int i11 = 0; i11 < this.F; i11++) {
                        this.f27250w.add((Bitmap) arrayList.get((int) f7));
                        f7 += size;
                    }
                    return;
                }
            }
            this.O = false;
            g71 g71Var = new g71(this);
            this.f27251x = g71Var;
            g71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f27244b;
    }

    public float getRightProgress() {
        return this.f27245c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.S) {
            canvas.save();
            Path path = this.Q;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
        int L = org.telegram.messenger.i0.L(12.0f) + ((int) (this.f27244b * measuredWidth));
        int L2 = org.telegram.messenger.i0.L(12.0f) + ((int) (measuredWidth * this.f27245c));
        float f7 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f27250w;
        if (arrayList.isEmpty() && this.f27251x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.O) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.e);
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i11);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z10 = this.I;
                    int i13 = this.D;
                    if (z10) {
                        i13 /= 2;
                    }
                    int i14 = i13 * i12;
                    if (z10) {
                        this.K.set(i14, measuredHeight, org.telegram.messenger.i0.L(28.0f) + i14, org.telegram.messenger.i0.L(f7) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.J, this.K, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i14, measuredHeight, (Paint) null);
                    }
                }
                i12++;
                i11++;
                f7 = 32.0f;
            }
            float f10 = measuredHeight;
            Paint paint = this.d;
            canvas.drawRect(0.0f, f10, L, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(L2, f10, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.R;
            canvas.drawLine(L - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f) + measuredHeight, L - org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.m5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(org.telegram.messenger.i0.L(4.0f) + L2, org.telegram.messenger.i0.L(10.0f) + measuredHeight, org.telegram.messenger.i0.L(4.0f) + L2, org.telegram.messenger.m5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.S) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (org.telegram.messenger.i0.L(6.0f) != this.L) {
                this.L = org.telegram.messenger.i0.L(6.0f);
                this.M = Bitmap.createBitmap(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.M);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ge, false));
                float f11 = this.L;
                canvas2.drawCircle(f11, f11, f11, paint3);
            }
            int i15 = this.L >> 1;
            canvas.save();
            float f12 = 0;
            canvas.drawBitmap(this.M, f12, f10, (Paint) null);
            float f13 = (measuredHeight2 + measuredHeight) - i15;
            canvas.rotate(-90.0f, i15, f13);
            canvas.drawBitmap(this.M, f12, i10 - this.L, (Paint) null);
            canvas.restore();
            canvas.save();
            float f14 = measuredWidth2 - i15;
            canvas.rotate(180.0f, f14, f13);
            Bitmap bitmap2 = this.M;
            int i16 = this.L;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i16, i10 - i16, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f14, measuredHeight + i15);
            canvas.drawBitmap(this.M, measuredWidth2 - this.L, f10, (Paint) null);
            canvas.restore();
        } else if (this.S) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.S) {
            if (this.Q == null) {
                this.Q = new Path();
            }
            this.Q.rewind();
            int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.i0.L(32.0f)) >> 1;
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.Q.addRoundRect(rectF, org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f);
            float f7 = measuredWidth;
            int L = org.telegram.messenger.i0.L(12.0f) + ((int) (this.f27244b * f7));
            int L2 = org.telegram.messenger.i0.L(12.0f) + ((int) (this.f27245c * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f27248r != null) {
                    int L3 = org.telegram.messenger.i0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        i71 i71Var = this.f27249s;
                        if (i71Var != null) {
                            ((he) i71Var).f26709a.Z2.I(0.0f, 1);
                        }
                        this.f27246f = true;
                        this.f27247n = (int) (x10 - L);
                        this.P.setTime((int) ((((float) this.f27243a) / 1000.0f) * this.f27244b));
                        this.P.setCx(org.telegram.messenger.i0.L(4.0f) + getLeft() + L);
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        i71 i71Var2 = this.f27249s;
                        if (i71Var2 != null) {
                            ((he) i71Var2).f26709a.Z2.I(0.0f, 1);
                        }
                        this.h = true;
                        this.f27247n = (int) (x10 - L2);
                        this.P.setTime((int) ((((float) this.f27243a) / 1000.0f) * this.f27245c));
                        this.P.setCx((getLeft() + L2) - org.telegram.messenger.i0.L(4.0f));
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
                    if (this.f27246f) {
                        int i10 = (int) (x10 - this.f27247n);
                        if (i10 < org.telegram.messenger.i0.L(16.0f)) {
                            L2 = org.telegram.messenger.i0.L(16.0f);
                        } else if (i10 <= L2) {
                            L2 = i10;
                        }
                        float L4 = (L2 - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.f27244b = L4;
                        float f10 = this.f27245c;
                        float f11 = f10 - L4;
                        float f12 = this.G;
                        if (f11 > f12) {
                            this.f27245c = L4 + f12;
                        } else {
                            float f13 = this.H;
                            if (f13 != 0.0f && f11 < f13) {
                                float f14 = f10 - f13;
                                this.f27244b = f14;
                                if (f14 < 0.0f) {
                                    this.f27244b = 0.0f;
                                }
                            }
                        }
                        this.P.setCx(((org.telegram.messenger.i0.N(12.0f) + (f7 * this.f27244b)) + getLeft()) - org.telegram.messenger.i0.L(4.0f));
                        this.P.setTime((int) ((((float) this.f27243a) / 1000.0f) * this.f27244b));
                        this.P.a(true);
                        i71 i71Var3 = this.f27249s;
                        if (i71Var3 != null) {
                            float f15 = this.f27244b;
                            ChatActivityEnterView chatActivityEnterView = ((he) i71Var3).f26709a;
                            org.telegram.messenger.x20 x20Var = chatActivityEnterView.f23702e3;
                            if (x20Var != null) {
                                x20Var.f19183a = ((float) x20Var.f19199r) * f15;
                                chatActivityEnterView.Z2.I(f15, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i11 = (int) (x10 - this.f27247n);
                        if (i11 >= L) {
                            if (i11 > org.telegram.messenger.i0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.i0.L(16.0f) + measuredWidth;
                            } else {
                                L = i11;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.i0.L(16.0f)) / f7;
                        this.f27245c = L5;
                        float f16 = this.f27244b;
                        float f17 = L5 - f16;
                        float f18 = this.G;
                        if (f17 > f18) {
                            this.f27244b = L5 - f18;
                        } else {
                            float f19 = this.H;
                            if (f19 != 0.0f && f17 < f19) {
                                float f20 = f16 + f19;
                                this.f27245c = f20;
                                if (f20 > 1.0f) {
                                    this.f27245c = 1.0f;
                                }
                            }
                        }
                        this.P.setCx(org.telegram.messenger.i0.N(12.0f) + (f7 * this.f27245c) + getLeft() + org.telegram.messenger.i0.L(4.0f));
                        this.P.a(true);
                        this.P.setTime((int) ((((float) this.f27243a) / 1000.0f) * this.f27245c));
                        i71 i71Var4 = this.f27249s;
                        if (i71Var4 != null) {
                            float f21 = this.f27245c;
                            ChatActivityEnterView chatActivityEnterView2 = ((he) i71Var4).f26709a;
                            org.telegram.messenger.x20 x20Var2 = chatActivityEnterView2.f23702e3;
                            if (x20Var2 != null) {
                                x20Var2.f19185b = ((float) x20Var2.f19199r) * f21;
                                chatActivityEnterView2.Z2.I(f21, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f27246f) {
                i71 i71Var5 = this.f27249s;
                if (i71Var5 != null) {
                    ((he) i71Var5).f26709a.Z2.I(0.0f, 0);
                }
                this.f27246f = false;
                invalidate();
                this.P.a(false);
                return true;
            } else if (this.h) {
                i71 i71Var6 = this.f27249s;
                if (i71Var6 != null) {
                    ((he) i71Var6).f26709a.Z2.I(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.P.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(i71 i71Var) {
        this.f27249s = i71Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f7) {
        this.G = f7;
        float f10 = this.f27245c;
        float f11 = this.f27244b;
        if (f10 - f11 > f7) {
            this.f27245c = f11 + f7;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f7) {
        this.H = f7;
    }

    public void setRoundFrames(boolean z10) {
        this.I = z10;
        if (z10) {
            this.J = new Rect(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
            this.K = new Rect();
        }
    }

    public void setTimeHintView(h71 h71Var) {
        this.P = h71Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f27248r = mediaMetadataRetriever;
        this.f27244b = 0.0f;
        this.f27245c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f27243a = Long.parseLong(this.f27248r.extractMetadata(9));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        invalidate();
    }
}
