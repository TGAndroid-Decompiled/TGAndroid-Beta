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
public final class t61 extends View {
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
    public r61 Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long f39918a;
    public float f39919b;
    public float f39920c;
    public final Paint d;
    public final Paint f39921e;
    public boolean f39922f;
    public boolean h;
    public float f39923n;
    public MediaMetadataRetriever f39924r;
    public s61 f39925s;
    public final ArrayList f39926w;
    public q61 f39927x;
    public long f39928y;

    public t61(Context context) {
        super(context);
        this.f39920c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f39921e = paint2;
        this.f39926w = new ArrayList();
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
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29339a7, false));
        this.M = 0;
        r61 r61Var = this.Q;
        if (r61Var != null) {
            r61Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f39924r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f39924r = null;
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
                while (i7 < this.f39926w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f39926w.get(i7);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i7++;
                }
            }
        }
        this.O.clear();
        this.f39926w.clear();
        q61 q61Var = this.f39927x;
        if (q61Var != null) {
            q61Var.cancel(true);
            this.f39927x = null;
        }
    }

    public final void b(int i7) {
        if (this.f39924r != null) {
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
                this.f39928y = this.f39918a / this.G;
                ArrayList arrayList = this.O;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.G;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.G; i10++) {
                        this.f39926w.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.P = false;
            q61 q61Var = new q61(this);
            this.f39927x = q61Var;
            q61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i7), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f39919b;
    }

    public float getRightProgress() {
        return this.f39920c;
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
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f39919b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.f39920c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f39926w;
        if (arrayList.isEmpty() && this.f39927x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.P) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f39921e);
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
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f39919b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f39920c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f39924r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s61 s61Var = this.f39925s;
                        if (s61Var != null) {
                            ((ve) s61Var).f40595a.N3.Q(0.0f, 1);
                        }
                        this.f39922f = true;
                        this.f39923n = (int) (x10 - L);
                        this.Q.setTime((int) ((((float) this.f39918a) / 1000.0f) * this.f39919b));
                        this.Q.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.Q.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        s61 s61Var2 = this.f39925s;
                        if (s61Var2 != null) {
                            ((ve) s61Var2).f40595a.N3.Q(0.0f, 1);
                        }
                        this.h = true;
                        this.f39923n = (int) (x10 - L2);
                        this.Q.setTime((int) ((((float) this.f39918a) / 1000.0f) * this.f39920c));
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
                    if (this.f39922f) {
                        int i7 = (int) (x10 - this.f39923n);
                        if (i7 < org.telegram.messenger.g0.L(16.0f)) {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i7 <= L2) {
                            L2 = i7;
                        }
                        float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39919b = L4;
                        float f11 = this.f39920c;
                        float f12 = f11 - L4;
                        float f13 = this.H;
                        if (f12 > f13) {
                            this.f39920c = L4 + f13;
                        } else {
                            float f14 = this.I;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f39919b = f15;
                                if (f15 < 0.0f) {
                                    this.f39919b = 0.0f;
                                }
                            }
                        }
                        this.Q.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.f39919b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                        this.Q.setTime((int) ((((float) this.f39918a) / 1000.0f) * this.f39919b));
                        this.Q.a(true);
                        s61 s61Var3 = this.f39925s;
                        if (s61Var3 != null) {
                            float f16 = this.f39919b;
                            ChatActivityEnterView chatActivityEnterView = ((ve) s61Var3).f40595a;
                            org.telegram.messenger.e20 e20Var = chatActivityEnterView.S3;
                            if (e20Var != null) {
                                e20Var.f23637a = ((float) e20Var.f23654r) * f16;
                                chatActivityEnterView.N3.Q(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f39923n);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f39920c = L5;
                        float f17 = this.f39919b;
                        float f18 = L5 - f17;
                        float f19 = this.H;
                        if (f18 > f19) {
                            this.f39919b = L5 - f19;
                        } else {
                            float f20 = this.I;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f39920c = f21;
                                if (f21 > 1.0f) {
                                    this.f39920c = 1.0f;
                                }
                            }
                        }
                        this.Q.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.f39920c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                        this.Q.a(true);
                        this.Q.setTime((int) ((((float) this.f39918a) / 1000.0f) * this.f39920c));
                        s61 s61Var4 = this.f39925s;
                        if (s61Var4 != null) {
                            float f22 = this.f39920c;
                            ChatActivityEnterView chatActivityEnterView2 = ((ve) s61Var4).f40595a;
                            org.telegram.messenger.e20 e20Var2 = chatActivityEnterView2.S3;
                            if (e20Var2 != null) {
                                e20Var2.f23639b = ((float) e20Var2.f23654r) * f22;
                                chatActivityEnterView2.N3.Q(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f39922f) {
                s61 s61Var5 = this.f39925s;
                if (s61Var5 != null) {
                    ((ve) s61Var5).f40595a.N3.Q(0.0f, 0);
                }
                this.f39922f = false;
                invalidate();
                this.Q.a(false);
                return true;
            } else if (this.h) {
                s61 s61Var6 = this.f39925s;
                if (s61Var6 != null) {
                    ((ve) s61Var6).f40595a.N3.Q(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.Q.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(s61 s61Var) {
        this.f39925s = s61Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.f39920c;
        float f12 = this.f39919b;
        if (f11 - f12 > f10) {
            this.f39920c = f12 + f10;
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

    public void setTimeHintView(r61 r61Var) {
        this.Q = r61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f39924r = mediaMetadataRetriever;
        this.f39919b = 0.0f;
        this.f39920c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f39918a = Long.parseLong(this.f39924r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
