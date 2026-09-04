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
public final class v71 extends View {
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
    public t71 P;
    public Path Q;
    public final Paint R;
    public boolean S;
    public long f31144a;
    public float f31145b;
    public float f31146c;
    public final Paint d;
    public final Paint f31147e;
    public boolean f31148f;
    public boolean h;
    public float f31149n;
    public MediaMetadataRetriever f31150r;
    public u71 f31151s;
    public final ArrayList v;
    public s71 f31152w;
    public long f31153x;
    public int f31154y;

    public v71(Context context) {
        super(context);
        this.f31146c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f31147e = paint2;
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
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        this.L = 0;
        t71 t71Var = this.P;
        if (t71Var != null) {
            t71Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (T) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f31150r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f31150r = null;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
        s71 s71Var = this.f31152w;
        if (s71Var != null) {
            s71Var.cancel(true);
            this.f31152w = null;
        }
    }

    public final void b(int i10) {
        if (this.f31150r != null) {
            if (i10 == 0) {
                if (this.I) {
                    int dp = AndroidUtilities.dp(56.0f);
                    this.f31154y = dp;
                    this.E = dp;
                    this.F = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.E / 2.0f)));
                } else {
                    this.E = AndroidUtilities.dp(40.0f);
                    this.F = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.E);
                    this.f31154y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.F);
                }
                this.f31153x = this.f31144a / this.F;
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
            s71 s71Var = new s71(this);
            this.f31152w = s71Var;
            s71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f31145b;
    }

    public float getRightProgress() {
        return this.f31146c;
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
        int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f31145b * measuredWidth));
        int dp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f31146c));
        float f7 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f31152w == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.O) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f31147e);
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i11);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z10 = this.I;
                    int i13 = this.f31154y;
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
            canvas.drawLine(dp - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + measuredHeight, dp - AndroidUtilities.dp(4.0f), org.telegram.messenger.w1.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(AndroidUtilities.dp(4.0f) + dp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + dp2, org.telegram.messenger.w1.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
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
            int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f31145b * f7));
            int dp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f31146c * f7));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f31150r != null) {
                    int dp3 = AndroidUtilities.dp(24.0f);
                    if (dp - dp3 <= x10 && x10 <= dp + dp3 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        u71 u71Var = this.f31151s;
                        if (u71Var != null) {
                            ((ef) u71Var).f25669a.Y2.J(0.0f, 1);
                        }
                        this.f31148f = true;
                        this.f31149n = (int) (x10 - dp);
                        this.P.setTime((int) ((((float) this.f31144a) / 1000.0f) * this.f31145b));
                        this.P.setCx(AndroidUtilities.dp(4.0f) + getLeft() + dp);
                        this.P.a(true);
                        invalidate();
                        return true;
                    } else if (dp2 - dp3 <= x10 && x10 <= dp3 + dp2 && y3 >= 0.0f && y3 <= getMeasuredHeight()) {
                        u71 u71Var2 = this.f31151s;
                        if (u71Var2 != null) {
                            ((ef) u71Var2).f25669a.Y2.J(0.0f, 1);
                        }
                        this.h = true;
                        this.f31149n = (int) (x10 - dp2);
                        this.P.setTime((int) ((((float) this.f31144a) / 1000.0f) * this.f31146c));
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
                    if (this.f31148f) {
                        int i10 = (int) (x10 - this.f31149n);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp2 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp2) {
                            dp2 = i10;
                        }
                        float dp4 = (dp2 - AndroidUtilities.dp(16.0f)) / f7;
                        this.f31145b = dp4;
                        float f10 = this.f31146c;
                        float f11 = f10 - dp4;
                        float f12 = this.G;
                        if (f11 > f12) {
                            this.f31146c = dp4 + f12;
                        } else {
                            float f13 = this.H;
                            if (f13 != 0.0f && f11 < f13) {
                                float f14 = f10 - f13;
                                this.f31145b = f14;
                                if (f14 < 0.0f) {
                                    this.f31145b = 0.0f;
                                }
                            }
                        }
                        this.P.setCx(((AndroidUtilities.dpf2(12.0f) + (f7 * this.f31145b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                        this.P.setTime((int) ((((float) this.f31144a) / 1000.0f) * this.f31145b));
                        this.P.a(true);
                        u71 u71Var3 = this.f31151s;
                        if (u71Var3 != null) {
                            float f15 = this.f31145b;
                            ChatActivityEnterView chatActivityEnterView = ((ef) u71Var3).f25669a;
                            VideoEditedInfo videoEditedInfo = chatActivityEnterView.f23685d3;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.startTime = ((float) videoEditedInfo.estimatedDuration) * f15;
                                chatActivityEnterView.Y2.J(f15, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i11 = (int) (x10 - this.f31149n);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp5 = (dp - AndroidUtilities.dp(16.0f)) / f7;
                        this.f31146c = dp5;
                        float f16 = this.f31145b;
                        float f17 = dp5 - f16;
                        float f18 = this.G;
                        if (f17 > f18) {
                            this.f31145b = dp5 - f18;
                        } else {
                            float f19 = this.H;
                            if (f19 != 0.0f && f17 < f19) {
                                float f20 = f16 + f19;
                                this.f31146c = f20;
                                if (f20 > 1.0f) {
                                    this.f31146c = 1.0f;
                                }
                            }
                        }
                        this.P.setCx(AndroidUtilities.dpf2(12.0f) + (f7 * this.f31146c) + getLeft() + AndroidUtilities.dp(4.0f));
                        this.P.a(true);
                        this.P.setTime((int) ((((float) this.f31144a) / 1000.0f) * this.f31146c));
                        u71 u71Var4 = this.f31151s;
                        if (u71Var4 != null) {
                            float f21 = this.f31146c;
                            ChatActivityEnterView chatActivityEnterView2 = ((ef) u71Var4).f25669a;
                            VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.f23685d3;
                            if (videoEditedInfo2 != null) {
                                videoEditedInfo2.endTime = ((float) videoEditedInfo2.estimatedDuration) * f21;
                                chatActivityEnterView2.Y2.J(f21, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f31148f) {
                u71 u71Var5 = this.f31151s;
                if (u71Var5 != null) {
                    ((ef) u71Var5).f25669a.Y2.J(0.0f, 0);
                }
                this.f31148f = false;
                invalidate();
                this.P.a(false);
                return true;
            } else if (this.h) {
                u71 u71Var6 = this.f31151s;
                if (u71Var6 != null) {
                    ((ef) u71Var6).f25669a.Y2.J(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.P.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(u71 u71Var) {
        this.f31151s = u71Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f7) {
        this.G = f7;
        float f10 = this.f31146c;
        float f11 = this.f31145b;
        if (f10 - f11 > f7) {
            this.f31146c = f11 + f7;
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

    public void setTimeHintView(t71 t71Var) {
        this.P = t71Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f31150r = mediaMetadataRetriever;
        this.f31145b = 0.0f;
        this.f31146c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f31144a = Long.parseLong(this.f31150r.extractMetadata(9));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        invalidate();
    }
}
