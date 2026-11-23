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
public final class x61 extends View {
    public static final Object U = new Object();
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public Rect K;
    public Rect L;
    public int M;
    public Bitmap N;
    public final ArrayList O;
    public boolean P;
    public v61 Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long f41901a;
    public float f41902b;
    public float f41903c;
    public final Paint d;
    public final Paint f41904e;
    public boolean f41905f;
    public boolean h;
    public float f41906n;
    public MediaMetadataRetriever f41907r;
    public w61 f41908s;
    public final ArrayList f41909w;
    public u61 f41910x;
    public long f41911y;

    public x61(Context context) {
        super(context);
        this.f41903c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f41904e = paint2;
        this.f41909w = new ArrayList();
        this.H = 1.0f;
        this.I = 0.0f;
        this.O = new ArrayList();
        Paint paint3 = new Paint(1);
        this.S = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
        this.M = 0;
        v61 v61Var = this.Q;
        if (v61Var != null) {
            v61Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f41907r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f41907r = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (z10) {
            int i7 = 0;
            if (!this.O.isEmpty()) {
                while (i7 < this.O.size()) {
                    Bitmap bitmap = (Bitmap) this.O.get(i7);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i7++;
                }
            } else {
                while (i7 < this.f41909w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f41909w.get(i7);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i7++;
                }
            }
        }
        this.O.clear();
        this.f41909w.clear();
        u61 u61Var = this.f41910x;
        if (u61Var != null) {
            u61Var.cancel(true);
            this.f41910x = null;
        }
    }

    public final void b(int i7) {
        if (this.f41907r != null) {
            if (i7 == 0) {
                if (this.J) {
                    int L = org.telegram.messenger.g0.L(56.0f);
                    this.E = L;
                    this.F = L;
                    this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / (this.F / 2.0f)));
                } else {
                    this.F = org.telegram.messenger.g0.L(40.0f);
                    this.G = Math.max(1, (getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.F);
                    this.E = (int) Math.ceil((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) / this.G);
                }
                this.f41911y = this.f41901a / this.G;
                ArrayList arrayList = this.O;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.G;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.G; i10++) {
                        this.f41909w.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.P = false;
            u61 u61Var = new u61(this);
            this.f41910x = u61Var;
            u61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f41902b;
    }

    public float getRightProgress() {
        return this.f41903c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (this.T) {
            canvas.save();
            Path path = this.R;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f41902b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.f41903c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f41909w;
        if (arrayList.isEmpty() && this.f41910x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.P) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f41904e);
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z10 = this.J;
                    int i12 = this.E;
                    if (z10) {
                        i12 /= 2;
                    }
                    int i13 = i12 * i11;
                    if (z10) {
                        this.L.set(i13, measuredHeight, org.telegram.messenger.g0.L(28.0f) + i13, org.telegram.messenger.g0.L(f10) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.K, this.L, (Paint) null);
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
            Paint paint2 = this.S;
            canvas.drawLine(L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + measuredHeight, L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.f3.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.f3.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.T) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (org.telegram.messenger.g0.L(6.0f) != this.M) {
                this.M = org.telegram.messenger.g0.L(6.0f);
                this.N = Bitmap.createBitmap(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.N);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Je, false));
                float f12 = this.M;
                canvas2.drawCircle(f12, f12, f12, paint3);
            }
            int i14 = this.M >> 1;
            canvas.save();
            float f13 = 0;
            canvas.drawBitmap(this.N, f13, f11, (Paint) null);
            float f14 = (measuredHeight2 + measuredHeight) - i14;
            canvas.rotate(-90.0f, i14, f14);
            canvas.drawBitmap(this.N, f13, i7 - this.M, (Paint) null);
            canvas.restore();
            canvas.save();
            float f15 = measuredWidth2 - i14;
            canvas.rotate(180.0f, f15, f14);
            Bitmap bitmap2 = this.N;
            int i15 = this.M;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i15, i7 - i15, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f15, measuredHeight + i14);
            canvas.drawBitmap(this.N, measuredWidth2 - this.M, f11, (Paint) null);
            canvas.restore();
        } else if (this.T) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.T) {
            if (this.R == null) {
                this.R = new Path();
            }
            this.R.rewind();
            int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.R.addRoundRect(rectF, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f41902b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f41903c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f41907r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var = this.f41908s;
                        if (w61Var != null) {
                            ((we) w61Var).f41620a.P3.K(0.0f, 1);
                        }
                        this.f41905f = true;
                        this.f41906n = (int) (x10 - L);
                        this.Q.setTime((int) ((((float) this.f41901a) / 1000.0f) * this.f41902b));
                        this.Q.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.Q.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        w61 w61Var2 = this.f41908s;
                        if (w61Var2 != null) {
                            ((we) w61Var2).f41620a.P3.K(0.0f, 1);
                        }
                        this.h = true;
                        this.f41906n = (int) (x10 - L2);
                        this.Q.setTime((int) ((((float) this.f41901a) / 1000.0f) * this.f41903c));
                        this.Q.setCx((getLeft() + L2) - org.telegram.messenger.g0.L(4.0f));
                        this.Q.a(true);
                        invalidate();
                        return true;
                    } else {
                        this.Q.a(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f41905f) {
                        int i7 = (int) (x10 - this.f41906n);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L2) {
                            L2 = i7;
                        }
                        float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f41902b = L4;
                        float f11 = this.f41903c;
                        float f12 = f11 - L4;
                        float f13 = this.H;
                        if (f12 > f13) {
                            this.f41903c = L4 + f13;
                        } else {
                            float f14 = this.I;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f41902b = f15;
                                if (f15 < 0.0f) {
                                    this.f41902b = 0.0f;
                                }
                            }
                        }
                        this.Q.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.f41902b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                        this.Q.setTime((int) ((((float) this.f41901a) / 1000.0f) * this.f41902b));
                        this.Q.a(true);
                        w61 w61Var3 = this.f41908s;
                        if (w61Var3 != null) {
                            float f16 = this.f41902b;
                            ChatActivityEnterView chatActivityEnterView = ((we) w61Var3).f41620a;
                            org.telegram.messenger.d20 d20Var = chatActivityEnterView.U3;
                            if (d20Var != null) {
                                d20Var.f23587a = ((float) d20Var.f23604r) * f16;
                                chatActivityEnterView.P3.K(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f41906n);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f41903c = L5;
                        float f17 = this.f41902b;
                        float f18 = L5 - f17;
                        float f19 = this.H;
                        if (f18 > f19) {
                            this.f41902b = L5 - f19;
                        } else {
                            float f20 = this.I;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f41903c = f21;
                                if (f21 > 1.0f) {
                                    this.f41903c = 1.0f;
                                }
                            }
                        }
                        this.Q.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.f41903c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                        this.Q.a(true);
                        this.Q.setTime((int) ((((float) this.f41901a) / 1000.0f) * this.f41903c));
                        w61 w61Var4 = this.f41908s;
                        if (w61Var4 != null) {
                            float f22 = this.f41903c;
                            ChatActivityEnterView chatActivityEnterView2 = ((we) w61Var4).f41620a;
                            org.telegram.messenger.d20 d20Var2 = chatActivityEnterView2.U3;
                            if (d20Var2 != null) {
                                d20Var2.f23589b = ((float) d20Var2.f23604r) * f22;
                                chatActivityEnterView2.P3.K(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f41905f) {
                w61 w61Var5 = this.f41908s;
                if (w61Var5 != null) {
                    ((we) w61Var5).f41620a.P3.K(0.0f, 0);
                }
                this.f41905f = false;
                invalidate();
                this.Q.a(false);
                return true;
            } else if (this.h) {
                w61 w61Var6 = this.f41908s;
                if (w61Var6 != null) {
                    ((we) w61Var6).f41620a.P3.K(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.Q.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(w61 w61Var) {
        this.f41908s = w61Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.f41903c;
        float f12 = this.f41902b;
        if (f11 - f12 > f10) {
            this.f41903c = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.I = f10;
    }

    public void setRoundFrames(boolean z10) {
        this.J = z10;
        if (z10) {
            this.K = new Rect(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
            this.L = new Rect();
        }
    }

    public void setTimeHintView(v61 v61Var) {
        this.Q = v61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f41907r = mediaMetadataRetriever;
        this.f41902b = 0.0f;
        this.f41903c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f41901a = Long.parseLong(this.f41907r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
