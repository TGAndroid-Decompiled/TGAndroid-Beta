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
public final class a61 extends View {
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
    public y51 Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long f31733a;
    public float f31734b;
    public float f31735c;
    public final Paint d;
    public final Paint f31736e;
    public boolean f31737f;
    public boolean h;
    public float f31738n;
    public MediaMetadataRetriever f31739r;
    public z51 f31740s;
    public final ArrayList f31741w;
    public x51 f31742x;
    public long f31743y;

    public a61(Context context) {
        super(context);
        this.f31735c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f31736e = paint2;
        this.f31741w = new ArrayList();
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
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false));
        this.M = 0;
        y51 y51Var = this.Q;
        if (y51Var != null) {
            y51Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f31739r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f31739r = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        if (z10) {
            int i3 = 0;
            if (!this.O.isEmpty()) {
                while (i3 < this.O.size()) {
                    Bitmap bitmap = (Bitmap) this.O.get(i3);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i3++;
                }
            } else {
                while (i3 < this.f31741w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.f31741w.get(i3);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i3++;
                }
            }
        }
        this.O.clear();
        this.f31741w.clear();
        x51 x51Var = this.f31742x;
        if (x51Var != null) {
            x51Var.cancel(true);
            this.f31742x = null;
        }
    }

    public final void b(int i3) {
        if (this.f31739r != null) {
            if (i3 == 0) {
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
                this.f31743y = this.f31733a / this.G;
                ArrayList arrayList = this.O;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.G;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.G; i10++) {
                        this.f31741w.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.P = false;
            x51 x51Var = new x51(this);
            this.f31742x = x51Var;
            x51Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i3), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f31734b;
    }

    public float getRightProgress() {
        return this.f31735c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        if (this.T) {
            canvas.save();
            Path path = this.R;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f31734b * measuredWidth));
        int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (measuredWidth * this.f31735c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.L(32.0f)) >> 1;
        ArrayList arrayList = this.f31741w;
        if (arrayList.isEmpty() && this.f31742x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.P) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f31736e);
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
            canvas.drawLine(L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f) + measuredHeight, L - org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.g0.L(10.0f) + measuredHeight, org.telegram.messenger.g0.L(4.0f) + L2, org.telegram.messenger.k5.z(10.0f, getMeasuredHeight(), measuredHeight), paint2);
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
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ge, false));
                float f12 = this.M;
                canvas2.drawCircle(f12, f12, f12, paint3);
            }
            int i14 = this.M >> 1;
            canvas.save();
            float f13 = 0;
            canvas.drawBitmap(this.N, f13, f11, (Paint) null);
            float f14 = (measuredHeight2 + measuredHeight) - i14;
            canvas.rotate(-90.0f, i14, f14);
            canvas.drawBitmap(this.N, f13, i3 - this.M, (Paint) null);
            canvas.restore();
            canvas.save();
            float f15 = measuredWidth2 - i14;
            canvas.rotate(180.0f, f15, f14);
            Bitmap bitmap2 = this.N;
            int i15 = this.M;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i15, i3 - i15, (Paint) null);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
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
            float y9 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
            float f10 = measuredWidth;
            int L = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f31734b * f10));
            int L2 = org.telegram.messenger.g0.L(12.0f) + ((int) (this.f31735c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f31739r != null) {
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    if (L - L3 <= x10 && x10 <= L + L3 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        z51 z51Var = this.f31740s;
                        if (z51Var != null) {
                            ((ke) z51Var).f35374a.f31087a3.O(0.0f, 1);
                        }
                        this.f31737f = true;
                        this.f31738n = (int) (x10 - L);
                        this.Q.setTime((int) ((((float) this.f31733a) / 1000.0f) * this.f31734b));
                        this.Q.setCx(org.telegram.messenger.g0.L(4.0f) + getLeft() + L);
                        this.Q.a(true);
                        invalidate();
                        return true;
                    } else if (L2 - L3 <= x10 && x10 <= L3 + L2 && y9 >= 0.0f && y9 <= getMeasuredHeight()) {
                        z51 z51Var2 = this.f31740s;
                        if (z51Var2 != null) {
                            ((ke) z51Var2).f35374a.f31087a3.O(0.0f, 1);
                        }
                        this.h = true;
                        this.f31738n = (int) (x10 - L2);
                        this.Q.setTime((int) ((((float) this.f31733a) / 1000.0f) * this.f31735c));
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
                    if (this.f31737f) {
                        int i3 = (int) (x10 - this.f31738n);
                        if (i3 < org.telegram.messenger.g0.L(16.0f)) {
                            L2 = org.telegram.messenger.g0.L(16.0f);
                        } else if (i3 <= L2) {
                            L2 = i3;
                        }
                        float L4 = (L2 - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f31734b = L4;
                        float f11 = this.f31735c;
                        float f12 = f11 - L4;
                        float f13 = this.H;
                        if (f12 > f13) {
                            this.f31735c = L4 + f13;
                        } else {
                            float f14 = this.I;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f31734b = f15;
                                if (f15 < 0.0f) {
                                    this.f31734b = 0.0f;
                                }
                            }
                        }
                        this.Q.setCx(((org.telegram.messenger.g0.N(12.0f) + (f10 * this.f31734b)) + getLeft()) - org.telegram.messenger.g0.L(4.0f));
                        this.Q.setTime((int) ((((float) this.f31733a) / 1000.0f) * this.f31734b));
                        this.Q.a(true);
                        z51 z51Var3 = this.f31740s;
                        if (z51Var3 != null) {
                            float f16 = this.f31734b;
                            ChatActivityEnterView chatActivityEnterView = ((ke) z51Var3).f35374a;
                            org.telegram.messenger.b20 b20Var = chatActivityEnterView.f31120f3;
                            if (b20Var != null) {
                                b20Var.f21708a = ((float) b20Var.f21725r) * f16;
                                chatActivityEnterView.f31087a3.O(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f31738n);
                        if (i10 >= L) {
                            if (i10 > org.telegram.messenger.g0.L(16.0f) + measuredWidth) {
                                L = org.telegram.messenger.g0.L(16.0f) + measuredWidth;
                            } else {
                                L = i10;
                            }
                        }
                        float L5 = (L - org.telegram.messenger.g0.L(16.0f)) / f10;
                        this.f31735c = L5;
                        float f17 = this.f31734b;
                        float f18 = L5 - f17;
                        float f19 = this.H;
                        if (f18 > f19) {
                            this.f31734b = L5 - f19;
                        } else {
                            float f20 = this.I;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f31735c = f21;
                                if (f21 > 1.0f) {
                                    this.f31735c = 1.0f;
                                }
                            }
                        }
                        this.Q.setCx(org.telegram.messenger.g0.N(12.0f) + (f10 * this.f31735c) + getLeft() + org.telegram.messenger.g0.L(4.0f));
                        this.Q.a(true);
                        this.Q.setTime((int) ((((float) this.f31733a) / 1000.0f) * this.f31735c));
                        z51 z51Var4 = this.f31740s;
                        if (z51Var4 != null) {
                            float f22 = this.f31735c;
                            ChatActivityEnterView chatActivityEnterView2 = ((ke) z51Var4).f35374a;
                            org.telegram.messenger.b20 b20Var2 = chatActivityEnterView2.f31120f3;
                            if (b20Var2 != null) {
                                b20Var2.f21710b = ((float) b20Var2.f21725r) * f22;
                                chatActivityEnterView2.f31087a3.O(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f31737f) {
                z51 z51Var5 = this.f31740s;
                if (z51Var5 != null) {
                    ((ke) z51Var5).f35374a.f31087a3.O(0.0f, 0);
                }
                this.f31737f = false;
                invalidate();
                this.Q.a(false);
                return true;
            } else if (this.h) {
                z51 z51Var6 = this.f31740s;
                if (z51Var6 != null) {
                    ((ke) z51Var6).f35374a.f31087a3.O(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.Q.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(z51 z51Var) {
        this.f31740s = z51Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.H = f10;
        float f11 = this.f31735c;
        float f12 = this.f31734b;
        if (f11 - f12 > f10) {
            this.f31735c = f12 + f10;
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

    public void setTimeHintView(y51 y51Var) {
        this.Q = y51Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f31739r = mediaMetadataRetriever;
        this.f31734b = 0.0f;
        this.f31735c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f31733a = Long.parseLong(this.f31739r.extractMetadata(9));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        invalidate();
    }
}
