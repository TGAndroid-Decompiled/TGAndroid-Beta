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
public final class j81 extends View {
    public static final Object T = new Object();
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
    public h81 P;
    public Path Q;
    public final Paint R;
    public boolean S;
    public long f25292a;
    public float f25293b;
    public float f25294c;
    public final Paint d;
    public final Paint e;
    public boolean f25295f;
    public boolean h;
    public float f25296n;
    public MediaMetadataRetriever f25297r;
    public i81 f25298s;
    public final ArrayList v;
    public g81 f25299w;
    public long f25300x;
    public int f25301y;

    public j81(Context context) {
        super(context);
        this.f25294c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.v = new ArrayList();
        this.G = 1.0f;
        this.H = 0.0f;
        this.N = new ArrayList();
        Paint paint3 = new Paint(1);
        this.R = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        this.L = 0;
        h81 h81Var = this.P;
        if (h81Var != null) {
            h81Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (T) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f25297r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f25297r = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
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
                while (i10 < this.v.size()) {
                    Bitmap bitmap2 = (Bitmap) this.v.get(i10);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i10++;
                }
            }
        }
        this.N.clear();
        this.v.clear();
        g81 g81Var = this.f25299w;
        if (g81Var != null) {
            g81Var.cancel(true);
            this.f25299w = null;
        }
    }

    public final void b(int i10) {
        if (this.f25297r != null) {
            if (i10 == 0) {
                if (this.I) {
                    int dp = AndroidUtilities.dp(56.0f);
                    this.f25301y = dp;
                    this.E = dp;
                    this.F = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.E / 2.0f)));
                } else {
                    this.E = AndroidUtilities.dp(40.0f);
                    this.F = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.E);
                    this.f25301y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.F);
                }
                this.f25300x = this.f25292a / this.F;
                ArrayList arrayList = this.N;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.F;
                    float f7 = 0.0f;
                    for (int i11 = 0; i11 < this.F; i11++) {
                        this.v.add((Bitmap) arrayList.get((int) f7));
                        f7 += size;
                    }
                    return;
                }
            }
            this.O = false;
            g81 g81Var = new g81(this);
            this.f25299w = g81Var;
            g81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f25293b;
    }

    public float getRightProgress() {
        return this.f25294c;
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
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f25293b * measuredWidth));
        int dp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f25294c));
        float f7 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f25299w == null) {
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
                    int i13 = this.f25301y;
                    if (z10) {
                        i13 /= 2;
                    }
                    int i14 = i13 * i12;
                    if (z10) {
                        this.K.set(i14, measuredHeight, AndroidUtilities.dp(28.0f) + i14, AndroidUtilities.dp(f7) + measuredHeight);
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
            canvas.drawRect(0.0f, f10, dp, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(dp2, f10, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.R;
            canvas.drawLine(dp - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + measuredHeight, dp - AndroidUtilities.dp(4.0f), org.telegram.messenger.l0.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(AndroidUtilities.dp(4.0f) + dp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + dp2, org.telegram.messenger.l0.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.S) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (AndroidUtilities.dp(6.0f) != this.L) {
                this.L = AndroidUtilities.dp(6.0f);
                this.M = Bitmap.createBitmap(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.M);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sd, false));
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
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.Q.addRoundRect(rectF, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f7 = measuredWidth;
            int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f25293b * f7));
            int dp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f25294c * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f25297r != null) {
                    int dp3 = AndroidUtilities.dp(24.0f);
                    if (dp - dp3 <= x10 && x10 <= dp + dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        i81 i81Var = this.f25298s;
                        if (i81Var != null) {
                            ((df) i81Var).f23583a.Y2.K(0.0f, 1);
                        }
                        this.f25295f = true;
                        this.f25296n = (int) (x10 - dp);
                        this.P.setTime((int) ((((float) this.f25292a) / 1000.0f) * this.f25293b));
                        this.P.setCx(AndroidUtilities.dp(4.0f) + getLeft() + dp);
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else if (dp2 - dp3 <= x10 && x10 <= dp3 + dp2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        i81 i81Var2 = this.f25298s;
                        if (i81Var2 != null) {
                            ((df) i81Var2).f23583a.Y2.K(0.0f, 1);
                        }
                        this.h = true;
                        this.f25296n = (int) (x10 - dp2);
                        this.P.setTime((int) ((((float) this.f25292a) / 1000.0f) * this.f25294c));
                        this.P.setCx((getLeft() + dp2) - AndroidUtilities.dp(4.0f));
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
                    if (this.f25295f) {
                        int i10 = (int) (x10 - this.f25296n);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp2 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp2) {
                            dp2 = i10;
                        }
                        float dp4 = (dp2 - AndroidUtilities.dp(16.0f)) / f7;
                        this.f25293b = dp4;
                        float f10 = this.f25294c;
                        float f11 = f10 - dp4;
                        float f12 = this.G;
                        if (f11 > f12) {
                            this.f25294c = dp4 + f12;
                        } else {
                            float f13 = this.H;
                            if (f13 != 0.0f && f11 < f13) {
                                float f14 = f10 - f13;
                                this.f25293b = f14;
                                if (f14 < 0.0f) {
                                    this.f25293b = 0.0f;
                                }
                            }
                        }
                        this.P.setCx(((AndroidUtilities.dpf2(12.0f) + (f7 * this.f25293b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                        this.P.setTime((int) ((((float) this.f25292a) / 1000.0f) * this.f25293b));
                        this.P.a(true);
                        i81 i81Var3 = this.f25298s;
                        if (i81Var3 != null) {
                            float f15 = this.f25293b;
                            ChatActivityEnterView chatActivityEnterView = ((df) i81Var3).f23583a;
                            VideoEditedInfo videoEditedInfo = chatActivityEnterView.f21976d3;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.startTime = ((float) videoEditedInfo.estimatedDuration) * f15;
                                chatActivityEnterView.Y2.K(f15, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i11 = (int) (x10 - this.f25296n);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp5 = (dp - AndroidUtilities.dp(16.0f)) / f7;
                        this.f25294c = dp5;
                        float f16 = this.f25293b;
                        float f17 = dp5 - f16;
                        float f18 = this.G;
                        if (f17 > f18) {
                            this.f25293b = dp5 - f18;
                        } else {
                            float f19 = this.H;
                            if (f19 != 0.0f && f17 < f19) {
                                float f20 = f16 + f19;
                                this.f25294c = f20;
                                if (f20 > 1.0f) {
                                    this.f25294c = 1.0f;
                                }
                            }
                        }
                        this.P.setCx(AndroidUtilities.dpf2(12.0f) + (f7 * this.f25294c) + getLeft() + AndroidUtilities.dp(4.0f));
                        this.P.a(true);
                        this.P.setTime((int) ((((float) this.f25292a) / 1000.0f) * this.f25294c));
                        i81 i81Var4 = this.f25298s;
                        if (i81Var4 != null) {
                            float f21 = this.f25294c;
                            ChatActivityEnterView chatActivityEnterView2 = ((df) i81Var4).f23583a;
                            VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.f21976d3;
                            if (videoEditedInfo2 != null) {
                                videoEditedInfo2.endTime = ((float) videoEditedInfo2.estimatedDuration) * f21;
                                chatActivityEnterView2.Y2.K(f21, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f25295f) {
                i81 i81Var5 = this.f25298s;
                if (i81Var5 != null) {
                    ((df) i81Var5).f23583a.Y2.K(0.0f, 0);
                }
                this.f25295f = false;
                invalidate();
                this.P.a(false);
                return true;
            } else if (this.h) {
                i81 i81Var6 = this.f25298s;
                if (i81Var6 != null) {
                    ((df) i81Var6).f23583a.Y2.K(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.P.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(i81 i81Var) {
        this.f25298s = i81Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f7) {
        this.G = f7;
        float f10 = this.f25294c;
        float f11 = this.f25293b;
        if (f10 - f11 > f7) {
            this.f25294c = f11 + f7;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f7) {
        this.H = f7;
    }

    public void setRoundFrames(boolean z10) {
        this.I = z10;
        if (z10) {
            this.J = new Rect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            this.K = new Rect();
        }
    }

    public void setTimeHintView(h81 h81Var) {
        this.P = h81Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f25297r = mediaMetadataRetriever;
        this.f25293b = 0.0f;
        this.f25294c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f25292a = Long.parseLong(this.f25297r.extractMetadata(9));
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }
}
