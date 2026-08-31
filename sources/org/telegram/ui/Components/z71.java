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
public final class z71 extends View {
    public static final Object Q = new Object();
    public int B;
    public int C;
    public float D;
    public float E;
    public boolean F;
    public Rect G;
    public Rect H;
    public int I;
    public Bitmap J;
    public final ArrayList K;
    public boolean L;
    public x71 M;
    public Path N;
    public final Paint O;
    public boolean P;
    public long f33779a;
    public float f33780b;
    public float f33781c;
    public final Paint d;
    public final Paint f33782e;
    public boolean f33783f;
    public boolean h;
    public float f33784n;
    public MediaMetadataRetriever f33785r;
    public y71 f33786s;
    public final ArrayList v;
    public w71 f33787w;
    public long f33788x;
    public int f33789y;

    public z71(Context context) {
        super(context);
        this.f33781c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f33782e = paint2;
        this.v = new ArrayList();
        this.D = 1.0f;
        this.E = 0.0f;
        this.K = new ArrayList();
        Paint paint3 = new Paint(1);
        this.O = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        this.I = 0;
        x71 x71Var = this.M;
        if (x71Var != null) {
            x71Var.b();
        }
    }

    public final void a(boolean z4) {
        synchronized (Q) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f33785r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f33785r = null;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        if (z4) {
            int i10 = 0;
            if (!this.K.isEmpty()) {
                while (i10 < this.K.size()) {
                    Bitmap bitmap = (Bitmap) this.K.get(i10);
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
        this.K.clear();
        this.v.clear();
        w71 w71Var = this.f33787w;
        if (w71Var != null) {
            w71Var.cancel(true);
            this.f33787w = null;
        }
    }

    public final void b(int i10) {
        if (this.f33785r != null) {
            if (i10 == 0) {
                if (this.F) {
                    int dp = AndroidUtilities.dp(56.0f);
                    this.f33789y = dp;
                    this.B = dp;
                    this.C = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.B / 2.0f)));
                } else {
                    this.B = AndroidUtilities.dp(40.0f);
                    this.C = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.B);
                    this.f33789y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.C);
                }
                this.f33788x = this.f33779a / this.C;
                ArrayList arrayList = this.K;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.C;
                    float f10 = 0.0f;
                    for (int i11 = 0; i11 < this.C; i11++) {
                        this.v.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.L = false;
            w71 w71Var = new w71(this);
            this.f33787w = w71Var;
            w71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f33780b;
    }

    public float getRightProgress() {
        return this.f33781c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.P) {
            canvas.save();
            Path path = this.N;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f33780b * measuredWidth));
        int dp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f33781c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f33787w == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.L) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f33782e);
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i11);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z4 = this.F;
                    int i13 = this.f33789y;
                    if (z4) {
                        i13 /= 2;
                    }
                    int i14 = i13 * i12;
                    if (z4) {
                        this.H.set(i14, measuredHeight, AndroidUtilities.dp(28.0f) + i14, AndroidUtilities.dp(f10) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.G, this.H, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i14, measuredHeight, (Paint) null);
                    }
                }
                i12++;
                i11++;
                f10 = 32.0f;
            }
            float f11 = measuredHeight;
            Paint paint = this.d;
            canvas.drawRect(0.0f, f11, dp, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(dp2, f11, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.O;
            canvas.drawLine(dp - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + measuredHeight, dp - AndroidUtilities.dp(4.0f), org.telegram.messenger.y3.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(AndroidUtilities.dp(4.0f) + dp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + dp2, org.telegram.messenger.y3.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.P) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (AndroidUtilities.dp(6.0f) != this.I) {
                this.I = AndroidUtilities.dp(6.0f);
                this.J = Bitmap.createBitmap(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.J);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sd, false));
                float f12 = this.I;
                canvas2.drawCircle(f12, f12, f12, paint3);
            }
            int i15 = this.I >> 1;
            canvas.save();
            float f13 = 0;
            canvas.drawBitmap(this.J, f13, f11, (Paint) null);
            float f14 = (measuredHeight2 + measuredHeight) - i15;
            canvas.rotate(-90.0f, i15, f14);
            canvas.drawBitmap(this.J, f13, i10 - this.I, (Paint) null);
            canvas.restore();
            canvas.save();
            float f15 = measuredWidth2 - i15;
            canvas.rotate(180.0f, f15, f14);
            Bitmap bitmap2 = this.J;
            int i16 = this.I;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i16, i10 - i16, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f15, measuredHeight + i15);
            canvas.drawBitmap(this.J, measuredWidth2 - this.I, f11, (Paint) null);
            canvas.restore();
        } else if (this.P) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.P) {
            if (this.N == null) {
                this.N = new Path();
            }
            this.N.rewind();
            int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.N.addRoundRect(rectF, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f10 = measuredWidth;
            int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f33780b * f10));
            int dp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f33781c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f33785r != null) {
                    int dp3 = AndroidUtilities.dp(24.0f);
                    if (dp - dp3 <= x10 && x10 <= dp + dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        y71 y71Var = this.f33786s;
                        if (y71Var != null) {
                            ((ue) y71Var).f31661a.V2.G(0.0f, 1);
                        }
                        this.f33783f = true;
                        this.f33784n = (int) (x10 - dp);
                        this.M.setTime((int) ((((float) this.f33779a) / 1000.0f) * this.f33780b));
                        this.M.setCx(AndroidUtilities.dp(4.0f) + getLeft() + dp);
                        this.M.a(true);
                        invalidate();
                        return true;
                    } else if (dp2 - dp3 <= x10 && x10 <= dp3 + dp2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        y71 y71Var2 = this.f33786s;
                        if (y71Var2 != null) {
                            ((ue) y71Var2).f31661a.V2.G(0.0f, 1);
                        }
                        this.h = true;
                        this.f33784n = (int) (x10 - dp2);
                        this.M.setTime((int) ((((float) this.f33779a) / 1000.0f) * this.f33781c));
                        this.M.setCx((getLeft() + dp2) - AndroidUtilities.dp(4.0f));
                        this.M.a(true);
                        invalidate();
                        return true;
                    } else {
                        this.M.a(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f33783f) {
                        int i10 = (int) (x10 - this.f33784n);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp2 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp2) {
                            dp2 = i10;
                        }
                        float dp4 = (dp2 - AndroidUtilities.dp(16.0f)) / f10;
                        this.f33780b = dp4;
                        float f11 = this.f33781c;
                        float f12 = f11 - dp4;
                        float f13 = this.D;
                        if (f12 > f13) {
                            this.f33781c = dp4 + f13;
                        } else {
                            float f14 = this.E;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f33780b = f15;
                                if (f15 < 0.0f) {
                                    this.f33780b = 0.0f;
                                }
                            }
                        }
                        this.M.setCx(((AndroidUtilities.dpf2(12.0f) + (f10 * this.f33780b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                        this.M.setTime((int) ((((float) this.f33779a) / 1000.0f) * this.f33780b));
                        this.M.a(true);
                        y71 y71Var3 = this.f33786s;
                        if (y71Var3 != null) {
                            float f16 = this.f33780b;
                            ChatActivityEnterView chatActivityEnterView = ((ue) y71Var3).f31661a;
                            VideoEditedInfo videoEditedInfo = chatActivityEnterView.f24572a3;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.startTime = ((float) videoEditedInfo.estimatedDuration) * f16;
                                chatActivityEnterView.V2.G(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i11 = (int) (x10 - this.f33784n);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp5 = (dp - AndroidUtilities.dp(16.0f)) / f10;
                        this.f33781c = dp5;
                        float f17 = this.f33780b;
                        float f18 = dp5 - f17;
                        float f19 = this.D;
                        if (f18 > f19) {
                            this.f33780b = dp5 - f19;
                        } else {
                            float f20 = this.E;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f33781c = f21;
                                if (f21 > 1.0f) {
                                    this.f33781c = 1.0f;
                                }
                            }
                        }
                        this.M.setCx(AndroidUtilities.dpf2(12.0f) + (f10 * this.f33781c) + getLeft() + AndroidUtilities.dp(4.0f));
                        this.M.a(true);
                        this.M.setTime((int) ((((float) this.f33779a) / 1000.0f) * this.f33781c));
                        y71 y71Var4 = this.f33786s;
                        if (y71Var4 != null) {
                            float f22 = this.f33781c;
                            ChatActivityEnterView chatActivityEnterView2 = ((ue) y71Var4).f31661a;
                            VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.f24572a3;
                            if (videoEditedInfo2 != null) {
                                videoEditedInfo2.endTime = ((float) videoEditedInfo2.estimatedDuration) * f22;
                                chatActivityEnterView2.V2.G(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f33783f) {
                y71 y71Var5 = this.f33786s;
                if (y71Var5 != null) {
                    ((ue) y71Var5).f31661a.V2.G(0.0f, 0);
                }
                this.f33783f = false;
                invalidate();
                this.M.a(false);
                return true;
            } else if (this.h) {
                y71 y71Var6 = this.f33786s;
                if (y71Var6 != null) {
                    ((ue) y71Var6).f31661a.V2.G(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.M.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(y71 y71Var) {
        this.f33786s = y71Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.D = f10;
        float f11 = this.f33781c;
        float f12 = this.f33780b;
        if (f11 - f12 > f10) {
            this.f33781c = f12 + f10;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f10) {
        this.E = f10;
    }

    public void setRoundFrames(boolean z4) {
        this.F = z4;
        if (z4) {
            this.G = new Rect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            this.H = new Rect();
        }
    }

    public void setTimeHintView(x71 x71Var) {
        this.M = x71Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f33785r = mediaMetadataRetriever;
        this.f33780b = 0.0f;
        this.f33781c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f33779a = Long.parseLong(this.f33785r.extractMetadata(9));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        invalidate();
    }
}
