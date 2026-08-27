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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.VideoEditedInfo;

public final class b71 extends View {
    public static final Object P = new Object();
    public int A;
    public int B;
    public float C;
    public float D;
    public boolean E;
    public Rect F;
    public Rect G;
    public int H;
    public Bitmap I;
    public final ArrayList J;
    public boolean K;
    public z61 L;
    public Path M;
    public final Paint N;
    public boolean O;

    public long f26999a;

    public float f27000b;

    public float f27001c;
    public final Paint d;

    public final Paint f27002e;

    public boolean f27003f;
    public boolean h;

    public float f27004n;

    public MediaMetadataRetriever f27005r;

    public a71 f27006s;
    public final ArrayList v;

    public y61 f27007w;

    public long f27008x;

    public int f27009y;

    public b71(Context context) {
        super(context);
        this.f27001c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f27002e = paint2;
        this.v = new ArrayList();
        this.C = 1.0f;
        this.D = 0.0f;
        this.J = new ArrayList();
        Paint paint3 = new Paint(1);
        this.N = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.H = 0;
        z61 z61Var = this.L;
        if (z61Var != null) {
            z61Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (P) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f27005r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f27005r = null;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (z10) {
            int i10 = 0;
            if (this.J.isEmpty()) {
                while (i10 < this.v.size()) {
                    Bitmap bitmap = (Bitmap) this.v.get(i10);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i10++;
                }
            } else {
                while (i10 < this.J.size()) {
                    Bitmap bitmap2 = (Bitmap) this.J.get(i10);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i10++;
                }
            }
        }
        this.J.clear();
        this.v.clear();
        y61 y61Var = this.f27007w;
        if (y61Var != null) {
            y61Var.cancel(true);
            this.f27007w = null;
        }
    }

    public final void b(int i10) {
        if (this.f27005r == null) {
            return;
        }
        if (i10 == 0) {
            if (this.E) {
                int iDp = AndroidUtilities.dp(56.0f);
                this.f27009y = iDp;
                this.A = iDp;
                this.B = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.A / 2.0f)));
            } else {
                this.A = AndroidUtilities.dp(40.0f);
                this.B = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.A);
                this.f27009y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.B);
            }
            this.f27008x = this.f26999a / ((long) this.B);
            ArrayList arrayList = this.J;
            if (!arrayList.isEmpty()) {
                float size = arrayList.size() / this.B;
                float f10 = 0.0f;
                for (int i11 = 0; i11 < this.B; i11++) {
                    this.v.add((Bitmap) arrayList.get((int) f10));
                    f10 += size;
                }
                return;
            }
        }
        this.K = false;
        y61 y61Var = new y61(this);
        this.f27007w = y61Var;
        y61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
    }

    public float getLeftProgress() {
        return this.f27000b;
    }

    public float getRightProgress() {
        return this.f27001c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.save();
            Path path = this.M;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int iDp = AndroidUtilities.dp(12.0f) + ((int) (this.f27000b * measuredWidth));
        int iDp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f27001c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f27007w == null) {
            b(0);
        }
        if (arrayList.isEmpty()) {
            if (this.O) {
                canvas.restore();
                return;
            }
            return;
        }
        if (!this.K) {
            canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f27002e);
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bitmap bitmap = (Bitmap) arrayList.get(i10);
            if (bitmap != null && !bitmap.isRecycled()) {
                boolean z10 = this.E;
                int i12 = this.f27009y;
                if (z10) {
                    i12 /= 2;
                }
                int i13 = i12 * i11;
                if (z10) {
                    this.G.set(i13, measuredHeight, AndroidUtilities.dp(28.0f) + i13, AndroidUtilities.dp(f10) + measuredHeight);
                    canvas.drawBitmap(bitmap, this.F, this.G, (Paint) null);
                } else {
                    canvas.drawBitmap(bitmap, i13, measuredHeight, (Paint) null);
                }
            }
            i11++;
            i10++;
            f10 = 32.0f;
        }
        float f11 = measuredHeight;
        float measuredHeight2 = getMeasuredHeight() - measuredHeight;
        Paint paint = this.d;
        canvas.drawRect(0.0f, f11, iDp, measuredHeight2, paint);
        canvas.drawRect(iDp2, f11, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
        float fDp = iDp - AndroidUtilities.dp(4.0f);
        float fDp2 = AndroidUtilities.dp(10.0f) + measuredHeight;
        float fDp3 = iDp - AndroidUtilities.dp(4.0f);
        float fB = org.telegram.messenger.y1.B(10.0f, getMeasuredHeight(), measuredHeight);
        Paint paint2 = this.N;
        canvas.drawLine(fDp, fDp2, fDp3, fB, paint2);
        canvas.drawLine(AndroidUtilities.dp(4.0f) + iDp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + iDp2, org.telegram.messenger.y1.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
        if (this.O) {
            canvas.restore();
            return;
        }
        int measuredHeight3 = getMeasuredHeight() - (measuredHeight * 2);
        int measuredWidth2 = getMeasuredWidth();
        if (AndroidUtilities.dp(6.0f) != this.H) {
            this.H = AndroidUtilities.dp(6.0f);
            this.I = Bitmap.createBitmap(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(this.I);
            Paint paint3 = new Paint(1);
            paint3.setColor(0);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sd, false));
            float f12 = this.H;
            canvas2.drawCircle(f12, f12, f12, paint3);
        }
        int i14 = this.H >> 1;
        canvas.save();
        float f13 = 0;
        canvas.drawBitmap(this.I, f13, f11, (Paint) null);
        int i15 = measuredHeight3 + measuredHeight;
        float f14 = i15 - i14;
        canvas.rotate(-90.0f, i14, f14);
        canvas.drawBitmap(this.I, f13, i15 - this.H, (Paint) null);
        canvas.restore();
        canvas.save();
        float f15 = measuredWidth2 - i14;
        canvas.rotate(180.0f, f15, f14);
        Bitmap bitmap2 = this.I;
        int i16 = this.H;
        canvas.drawBitmap(bitmap2, measuredWidth2 - i16, i15 - i16, (Paint) null);
        canvas.restore();
        canvas.save();
        canvas.rotate(90.0f, f15, measuredHeight + i14);
        canvas.drawBitmap(this.I, measuredWidth2 - this.H, f11, (Paint) null);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.O) {
            if (this.M == null) {
                this.M = new Path();
            }
            this.M.rewind();
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.M.addRoundRect(rectF, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f10 = measuredWidth;
            int iDp = AndroidUtilities.dp(12.0f) + ((int) (this.f27000b * f10));
            int iDp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f27001c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f27005r != null) {
                    int iDp3 = AndroidUtilities.dp(24.0f);
                    if (iDp - iDp3 <= x8 && x8 <= iDp + iDp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        a71 a71Var = this.f27006s;
                        if (a71Var != null) {
                            ((qe) a71Var).f31897a.U2.A(0.0f, 1);
                        }
                        this.f27003f = true;
                        this.f27004n = (int) (x8 - iDp);
                        this.L.setTime((int) ((this.f26999a / 1000.0f) * this.f27000b));
                        this.L.setCx(AndroidUtilities.dp(4.0f) + getLeft() + iDp);
                        this.L.a(true);
                        invalidate();
                        return true;
                    }
                    if (iDp2 - iDp3 > x8 || x8 > iDp3 + iDp2 || y10 < 0.0f || y10 > getMeasuredHeight()) {
                        this.L.a(false);
                        return false;
                    }
                    a71 a71Var2 = this.f27006s;
                    if (a71Var2 != null) {
                        ((qe) a71Var2).f31897a.U2.A(0.0f, 1);
                    }
                    this.h = true;
                    this.f27004n = (int) (x8 - iDp2);
                    this.L.setTime((int) ((this.f26999a / 1000.0f) * this.f27001c));
                    this.L.setCx((getLeft() + iDp2) - AndroidUtilities.dp(4.0f));
                    this.L.a(true);
                    invalidate();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f27003f) {
                    a71 a71Var3 = this.f27006s;
                    if (a71Var3 != null) {
                        ((qe) a71Var3).f31897a.U2.A(0.0f, 0);
                    }
                    this.f27003f = false;
                    invalidate();
                    this.L.a(false);
                    return true;
                }
                if (this.h) {
                    a71 a71Var4 = this.f27006s;
                    if (a71Var4 != null) {
                        ((qe) a71Var4).f31897a.U2.A(0.0f, 0);
                    }
                    this.h = false;
                    invalidate();
                    this.L.a(false);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                if (this.f27003f) {
                    int i10 = (int) (x8 - this.f27004n);
                    if (i10 < AndroidUtilities.dp(16.0f)) {
                        iDp2 = AndroidUtilities.dp(16.0f);
                    } else if (i10 <= iDp2) {
                        iDp2 = i10;
                    }
                    float fDp = (iDp2 - AndroidUtilities.dp(16.0f)) / f10;
                    this.f27000b = fDp;
                    float f11 = this.f27001c;
                    float f12 = f11 - fDp;
                    float f13 = this.C;
                    if (f12 > f13) {
                        this.f27001c = fDp + f13;
                    } else {
                        float f14 = this.D;
                        if (f14 != 0.0f && f12 < f14) {
                            float f15 = f11 - f14;
                            this.f27000b = f15;
                            if (f15 < 0.0f) {
                                this.f27000b = 0.0f;
                            }
                        }
                    }
                    this.L.setCx(((AndroidUtilities.dpf2(12.0f) + (f10 * this.f27000b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                    this.L.setTime((int) ((this.f26999a / 1000.0f) * this.f27000b));
                    this.L.a(true);
                    a71 a71Var5 = this.f27006s;
                    if (a71Var5 != null) {
                        float f16 = this.f27000b;
                        ChatActivityEnterView chatActivityEnterView = ((qe) a71Var5).f31897a;
                        VideoEditedInfo videoEditedInfo = chatActivityEnterView.Z2;
                        if (videoEditedInfo != null) {
                            videoEditedInfo.startTime = (long) (videoEditedInfo.estimatedDuration * f16);
                            chatActivityEnterView.U2.A(f16, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
                if (this.h) {
                    int i11 = (int) (x8 - this.f27004n);
                    if (i11 >= iDp) {
                        iDp = i11 > AndroidUtilities.dp(16.0f) + measuredWidth ? AndroidUtilities.dp(16.0f) + measuredWidth : i11;
                    }
                    float fDp2 = (iDp - AndroidUtilities.dp(16.0f)) / f10;
                    this.f27001c = fDp2;
                    float f17 = this.f27000b;
                    float f18 = fDp2 - f17;
                    float f19 = this.C;
                    if (f18 > f19) {
                        this.f27000b = fDp2 - f19;
                    } else {
                        float f20 = this.D;
                        if (f20 != 0.0f && f18 < f20) {
                            float f21 = f17 + f20;
                            this.f27001c = f21;
                            if (f21 > 1.0f) {
                                this.f27001c = 1.0f;
                            }
                        }
                    }
                    this.L.setCx(AndroidUtilities.dpf2(12.0f) + (f10 * this.f27001c) + getLeft() + AndroidUtilities.dp(4.0f));
                    this.L.a(true);
                    this.L.setTime((int) ((this.f26999a / 1000.0f) * this.f27001c));
                    a71 a71Var6 = this.f27006s;
                    if (a71Var6 != null) {
                        float f22 = this.f27001c;
                        ChatActivityEnterView chatActivityEnterView2 = ((qe) a71Var6).f31897a;
                        VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.Z2;
                        if (videoEditedInfo2 != null) {
                            videoEditedInfo2.endTime = (long) (videoEditedInfo2.estimatedDuration * f22);
                            chatActivityEnterView2.U2.A(f22, 2);
                        }
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setDelegate(a71 a71Var) {
        this.f27006s = a71Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.C = f10;
        float f11 = this.f27001c;
        float f12 = this.f27000b;
        if (f11 - f12 > f10) {
            this.f27001c = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.D = f10;
    }

    public void setRoundFrames(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F = new Rect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            this.G = new Rect();
        }
    }

    public void setTimeHintView(z61 z61Var) {
        this.L = z61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f27005r = mediaMetadataRetriever;
        this.f27000b = 0.0f;
        this.f27001c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f26999a = Long.parseLong(this.f27005r.extractMetadata(9));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        invalidate();
    }
}
