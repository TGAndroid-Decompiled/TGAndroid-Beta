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
public final class z61 extends View {
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
    public x61 L;
    public Path M;
    public final Paint N;
    public boolean O;
    public long f35205a;
    public float f35206b;
    public float f35207c;
    public final Paint d;
    public final Paint f35208e;
    public boolean f35209f;
    public boolean h;
    public float f35210n;
    public MediaMetadataRetriever f35211r;
    public y61 f35212s;
    public final ArrayList v;
    public w61 f35213w;
    public long f35214x;
    public int f35215y;

    public z61(Context context) {
        super(context);
        this.f35207c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f35208e = paint2;
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
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.H = 0;
        x61 x61Var = this.L;
        if (x61Var != null) {
            x61Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (P) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f35211r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f35211r = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (z10) {
            int i9 = 0;
            if (!this.J.isEmpty()) {
                while (i9 < this.J.size()) {
                    Bitmap bitmap = (Bitmap) this.J.get(i9);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i9++;
                }
            } else {
                while (i9 < this.v.size()) {
                    Bitmap bitmap2 = (Bitmap) this.v.get(i9);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i9++;
                }
            }
        }
        this.J.clear();
        this.v.clear();
        w61 w61Var = this.f35213w;
        if (w61Var != null) {
            w61Var.cancel(true);
            this.f35213w = null;
        }
    }

    public final void b(int i9) {
        if (this.f35211r != null) {
            if (i9 == 0) {
                if (this.E) {
                    int dp = AndroidUtilities.dp(56.0f);
                    this.f35215y = dp;
                    this.A = dp;
                    this.B = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.A / 2.0f)));
                } else {
                    this.A = AndroidUtilities.dp(40.0f);
                    this.B = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.A);
                    this.f35215y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.B);
                }
                this.f35214x = this.f35205a / this.B;
                ArrayList arrayList = this.J;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.B;
                    float f10 = 0.0f;
                    for (int i10 = 0; i10 < this.B; i10++) {
                        this.v.add((Bitmap) arrayList.get((int) f10));
                        f10 += size;
                    }
                    return;
                }
            }
            this.K = false;
            w61 w61Var = new w61(this);
            this.f35213w = w61Var;
            w61Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i9), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f35206b;
    }

    public float getRightProgress() {
        return this.f35207c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        if (this.O) {
            canvas.save();
            Path path = this.M;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f35206b * measuredWidth));
        int dp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f35207c));
        float f10 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f35213w == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.K) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f35208e);
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i10);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z10 = this.E;
                    int i12 = this.f35215y;
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
            Paint paint = this.d;
            canvas.drawRect(0.0f, f11, dp, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(dp2, f11, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.N;
            canvas.drawLine(dp - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + measuredHeight, dp - AndroidUtilities.dp(4.0f), org.telegram.messenger.l0.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(AndroidUtilities.dp(4.0f) + dp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + dp2, org.telegram.messenger.l0.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.O) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight * 2);
            int measuredWidth2 = getMeasuredWidth();
            if (AndroidUtilities.dp(6.0f) != this.H) {
                this.H = AndroidUtilities.dp(6.0f);
                this.I = Bitmap.createBitmap(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.I);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sd, false));
                float f12 = this.H;
                canvas2.drawCircle(f12, f12, f12, paint3);
            }
            int i14 = this.H >> 1;
            canvas.save();
            float f13 = 0;
            canvas.drawBitmap(this.I, f13, f11, (Paint) null);
            float f14 = (measuredHeight2 + measuredHeight) - i14;
            canvas.rotate(-90.0f, i14, f14);
            canvas.drawBitmap(this.I, f13, i9 - this.H, (Paint) null);
            canvas.restore();
            canvas.save();
            float f15 = measuredWidth2 - i14;
            canvas.rotate(180.0f, f15, f14);
            Bitmap bitmap2 = this.I;
            int i15 = this.H;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i15, i9 - i15, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f15, measuredHeight + i14);
            canvas.drawBitmap(this.I, measuredWidth2 - this.H, f11, (Paint) null);
            canvas.restore();
        } else if (this.O) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
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
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f10 = measuredWidth;
            int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f35206b * f10));
            int dp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f35207c * f10));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f35211r != null) {
                    int dp3 = AndroidUtilities.dp(24.0f);
                    if (dp - dp3 <= x10 && x10 <= dp + dp3 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        y61 y61Var = this.f35212s;
                        if (y61Var != null) {
                            ((ue) y61Var).f32992a.U2.B(0.0f, 1);
                        }
                        this.f35209f = true;
                        this.f35210n = (int) (x10 - dp);
                        this.L.setTime((int) ((((float) this.f35205a) / 1000.0f) * this.f35206b));
                        this.L.setCx(AndroidUtilities.dp(4.0f) + getLeft() + dp);
                        this.L.a(true);
                        invalidate();
                        return true;
                    } else if (dp2 - dp3 <= x10 && x10 <= dp3 + dp2 && y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                        y61 y61Var2 = this.f35212s;
                        if (y61Var2 != null) {
                            ((ue) y61Var2).f32992a.U2.B(0.0f, 1);
                        }
                        this.h = true;
                        this.f35210n = (int) (x10 - dp2);
                        this.L.setTime((int) ((((float) this.f35205a) / 1000.0f) * this.f35207c));
                        this.L.setCx((getLeft() + dp2) - AndroidUtilities.dp(4.0f));
                        this.L.a(true);
                        invalidate();
                        return true;
                    } else {
                        this.L.a(false);
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    if (this.f35209f) {
                        int i9 = (int) (x10 - this.f35210n);
                        if (i9 < AndroidUtilities.dp(16.0f)) {
                            dp2 = AndroidUtilities.dp(16.0f);
                        } else if (i9 <= dp2) {
                            dp2 = i9;
                        }
                        float dp4 = (dp2 - AndroidUtilities.dp(16.0f)) / f10;
                        this.f35206b = dp4;
                        float f11 = this.f35207c;
                        float f12 = f11 - dp4;
                        float f13 = this.C;
                        if (f12 > f13) {
                            this.f35207c = dp4 + f13;
                        } else {
                            float f14 = this.D;
                            if (f14 != 0.0f && f12 < f14) {
                                float f15 = f11 - f14;
                                this.f35206b = f15;
                                if (f15 < 0.0f) {
                                    this.f35206b = 0.0f;
                                }
                            }
                        }
                        this.L.setCx(((AndroidUtilities.dpf2(12.0f) + (f10 * this.f35206b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                        this.L.setTime((int) ((((float) this.f35205a) / 1000.0f) * this.f35206b));
                        this.L.a(true);
                        y61 y61Var3 = this.f35212s;
                        if (y61Var3 != null) {
                            float f16 = this.f35206b;
                            ChatActivityEnterView chatActivityEnterView = ((ue) y61Var3).f32992a;
                            VideoEditedInfo videoEditedInfo = chatActivityEnterView.Z2;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.startTime = ((float) videoEditedInfo.estimatedDuration) * f16;
                                chatActivityEnterView.U2.B(f16, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i10 = (int) (x10 - this.f35210n);
                        if (i10 >= dp) {
                            if (i10 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i10;
                            }
                        }
                        float dp5 = (dp - AndroidUtilities.dp(16.0f)) / f10;
                        this.f35207c = dp5;
                        float f17 = this.f35206b;
                        float f18 = dp5 - f17;
                        float f19 = this.C;
                        if (f18 > f19) {
                            this.f35206b = dp5 - f19;
                        } else {
                            float f20 = this.D;
                            if (f20 != 0.0f && f18 < f20) {
                                float f21 = f17 + f20;
                                this.f35207c = f21;
                                if (f21 > 1.0f) {
                                    this.f35207c = 1.0f;
                                }
                            }
                        }
                        this.L.setCx(AndroidUtilities.dpf2(12.0f) + (f10 * this.f35207c) + getLeft() + AndroidUtilities.dp(4.0f));
                        this.L.a(true);
                        this.L.setTime((int) ((((float) this.f35205a) / 1000.0f) * this.f35207c));
                        y61 y61Var4 = this.f35212s;
                        if (y61Var4 != null) {
                            float f22 = this.f35207c;
                            ChatActivityEnterView chatActivityEnterView2 = ((ue) y61Var4).f32992a;
                            VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.Z2;
                            if (videoEditedInfo2 != null) {
                                videoEditedInfo2.endTime = ((float) videoEditedInfo2.estimatedDuration) * f22;
                                chatActivityEnterView2.U2.B(f22, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f35209f) {
                y61 y61Var5 = this.f35212s;
                if (y61Var5 != null) {
                    ((ue) y61Var5).f32992a.U2.B(0.0f, 0);
                }
                this.f35209f = false;
                invalidate();
                this.L.a(false);
                return true;
            } else if (this.h) {
                y61 y61Var6 = this.f35212s;
                if (y61Var6 != null) {
                    ((ue) y61Var6).f32992a.U2.B(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.L.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(y61 y61Var) {
        this.f35212s = y61Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f10) {
        this.C = f10;
        float f11 = this.f35207c;
        float f12 = this.f35206b;
        if (f11 - f12 > f10) {
            this.f35207c = f12 + f10;
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

    public void setTimeHintView(x61 x61Var) {
        this.L = x61Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f35211r = mediaMetadataRetriever;
        this.f35206b = 0.0f;
        this.f35207c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f35205a = Long.parseLong(this.f35211r.extractMetadata(9));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        invalidate();
    }
}
