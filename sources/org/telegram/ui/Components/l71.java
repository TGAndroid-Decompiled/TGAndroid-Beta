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
public final class l71 extends View {
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
    public j71 L;
    public Path M;
    public final Paint N;
    public boolean O;
    public long f30248a;
    public float f30249b;
    public float f30250c;
    public final Paint d;
    public final Paint f30251e;
    public boolean f30252f;
    public boolean h;
    public float f30253n;
    public MediaMetadataRetriever f30254r;
    public k71 f30255s;
    public final ArrayList v;
    public i71 f30256w;
    public long f30257x;
    public int f30258y;

    public l71(Context context) {
        super(context);
        this.f30250c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.f30251e = paint2;
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
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.H = 0;
        j71 j71Var = this.L;
        if (j71Var != null) {
            j71Var.b();
        }
    }

    public final void a(boolean z10) {
        synchronized (P) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.f30254r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.f30254r = null;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        if (z10) {
            int i10 = 0;
            if (!this.J.isEmpty()) {
                while (i10 < this.J.size()) {
                    Bitmap bitmap = (Bitmap) this.J.get(i10);
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
        this.J.clear();
        this.v.clear();
        i71 i71Var = this.f30256w;
        if (i71Var != null) {
            i71Var.cancel(true);
            this.f30256w = null;
        }
    }

    public final void b(int i10) {
        if (this.f30254r != null) {
            if (i10 == 0) {
                if (this.E) {
                    int dp = AndroidUtilities.dp(56.0f);
                    this.f30258y = dp;
                    this.A = dp;
                    this.B = Math.max(1, (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / (this.A / 2.0f)));
                } else {
                    this.A = AndroidUtilities.dp(40.0f);
                    this.B = Math.max(1, (getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.A);
                    this.f30258y = (int) Math.ceil((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) / this.B);
                }
                this.f30257x = this.f30248a / this.B;
                ArrayList arrayList = this.J;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.B;
                    float f9 = 0.0f;
                    for (int i11 = 0; i11 < this.B; i11++) {
                        this.v.add((Bitmap) arrayList.get((int) f9));
                        f9 += size;
                    }
                    return;
                }
            }
            this.K = false;
            i71 i71Var = new i71(this);
            this.f30256w = i71Var;
            i71Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i10), null, null);
        }
    }

    public float getLeftProgress() {
        return this.f30249b;
    }

    public float getRightProgress() {
        return this.f30250c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.O) {
            canvas.save();
            Path path = this.M;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f30249b * measuredWidth));
        int dp2 = AndroidUtilities.dp(12.0f) + ((int) (measuredWidth * this.f30250c));
        float f9 = 32.0f;
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(32.0f)) >> 1;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty() && this.f30256w == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.K) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.f30251e);
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i11);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z10 = this.E;
                    int i13 = this.f30258y;
                    if (z10) {
                        i13 /= 2;
                    }
                    int i14 = i13 * i12;
                    if (z10) {
                        this.G.set(i14, measuredHeight, AndroidUtilities.dp(28.0f) + i14, AndroidUtilities.dp(f9) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.F, this.G, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i14, measuredHeight, (Paint) null);
                    }
                }
                i12++;
                i11++;
                f9 = 32.0f;
            }
            float f10 = measuredHeight;
            Paint paint = this.d;
            canvas.drawRect(0.0f, f10, dp, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(dp2, f10, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.N;
            canvas.drawLine(dp - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + measuredHeight, dp - AndroidUtilities.dp(4.0f), org.telegram.messenger.x3.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(AndroidUtilities.dp(4.0f) + dp2, AndroidUtilities.dp(10.0f) + measuredHeight, AndroidUtilities.dp(4.0f) + dp2, org.telegram.messenger.x3.B(10.0f, getMeasuredHeight(), measuredHeight), paint2);
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
                canvas2.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sd, false));
                float f11 = this.H;
                canvas2.drawCircle(f11, f11, f11, paint3);
            }
            int i15 = this.H >> 1;
            canvas.save();
            float f12 = 0;
            canvas.drawBitmap(this.I, f12, f10, (Paint) null);
            float f13 = (measuredHeight2 + measuredHeight) - i15;
            canvas.rotate(-90.0f, i15, f13);
            canvas.drawBitmap(this.I, f12, i10 - this.H, (Paint) null);
            canvas.restore();
            canvas.save();
            float f14 = measuredWidth2 - i15;
            canvas.rotate(180.0f, f14, f13);
            Bitmap bitmap2 = this.I;
            int i16 = this.H;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i16, i10 - i16, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f14, measuredHeight + i15);
            canvas.drawBitmap(this.I, measuredWidth2 - this.H, f10, (Paint) null);
            canvas.restore();
        } else if (this.O) {
            canvas.restore();
        }
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
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
            float f9 = measuredWidth;
            int dp = AndroidUtilities.dp(12.0f) + ((int) (this.f30249b * f9));
            int dp2 = AndroidUtilities.dp(12.0f) + ((int) (this.f30250c * f9));
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f30254r != null) {
                    int dp3 = AndroidUtilities.dp(24.0f);
                    if (dp - dp3 <= x4 && x4 <= dp + dp3 && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        k71 k71Var = this.f30255s;
                        if (k71Var != null) {
                            ((xe) k71Var).f34704a.U2.I(0.0f, 1);
                        }
                        this.f30252f = true;
                        this.f30253n = (int) (x4 - dp);
                        this.L.setTime((int) ((((float) this.f30248a) / 1000.0f) * this.f30249b));
                        this.L.setCx(AndroidUtilities.dp(4.0f) + getLeft() + dp);
                        this.L.a(true);
                        invalidate();
                        return true;
                    } else if (dp2 - dp3 <= x4 && x4 <= dp3 + dp2 && y8 >= 0.0f && y8 <= getMeasuredHeight()) {
                        k71 k71Var2 = this.f30255s;
                        if (k71Var2 != null) {
                            ((xe) k71Var2).f34704a.U2.I(0.0f, 1);
                        }
                        this.h = true;
                        this.f30253n = (int) (x4 - dp2);
                        this.L.setTime((int) ((((float) this.f30248a) / 1000.0f) * this.f30250c));
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
                    if (this.f30252f) {
                        int i10 = (int) (x4 - this.f30253n);
                        if (i10 < AndroidUtilities.dp(16.0f)) {
                            dp2 = AndroidUtilities.dp(16.0f);
                        } else if (i10 <= dp2) {
                            dp2 = i10;
                        }
                        float dp4 = (dp2 - AndroidUtilities.dp(16.0f)) / f9;
                        this.f30249b = dp4;
                        float f10 = this.f30250c;
                        float f11 = f10 - dp4;
                        float f12 = this.C;
                        if (f11 > f12) {
                            this.f30250c = dp4 + f12;
                        } else {
                            float f13 = this.D;
                            if (f13 != 0.0f && f11 < f13) {
                                float f14 = f10 - f13;
                                this.f30249b = f14;
                                if (f14 < 0.0f) {
                                    this.f30249b = 0.0f;
                                }
                            }
                        }
                        this.L.setCx(((AndroidUtilities.dpf2(12.0f) + (f9 * this.f30249b)) + getLeft()) - AndroidUtilities.dp(4.0f));
                        this.L.setTime((int) ((((float) this.f30248a) / 1000.0f) * this.f30249b));
                        this.L.a(true);
                        k71 k71Var3 = this.f30255s;
                        if (k71Var3 != null) {
                            float f15 = this.f30249b;
                            ChatActivityEnterView chatActivityEnterView = ((xe) k71Var3).f34704a;
                            VideoEditedInfo videoEditedInfo = chatActivityEnterView.Z2;
                            if (videoEditedInfo != null) {
                                videoEditedInfo.startTime = ((float) videoEditedInfo.estimatedDuration) * f15;
                                chatActivityEnterView.U2.I(f15, 2);
                            }
                        }
                        invalidate();
                        return true;
                    } else if (this.h) {
                        int i11 = (int) (x4 - this.f30253n);
                        if (i11 >= dp) {
                            if (i11 > AndroidUtilities.dp(16.0f) + measuredWidth) {
                                dp = AndroidUtilities.dp(16.0f) + measuredWidth;
                            } else {
                                dp = i11;
                            }
                        }
                        float dp5 = (dp - AndroidUtilities.dp(16.0f)) / f9;
                        this.f30250c = dp5;
                        float f16 = this.f30249b;
                        float f17 = dp5 - f16;
                        float f18 = this.C;
                        if (f17 > f18) {
                            this.f30249b = dp5 - f18;
                        } else {
                            float f19 = this.D;
                            if (f19 != 0.0f && f17 < f19) {
                                float f20 = f16 + f19;
                                this.f30250c = f20;
                                if (f20 > 1.0f) {
                                    this.f30250c = 1.0f;
                                }
                            }
                        }
                        this.L.setCx(AndroidUtilities.dpf2(12.0f) + (f9 * this.f30250c) + getLeft() + AndroidUtilities.dp(4.0f));
                        this.L.a(true);
                        this.L.setTime((int) ((((float) this.f30248a) / 1000.0f) * this.f30250c));
                        k71 k71Var4 = this.f30255s;
                        if (k71Var4 != null) {
                            float f21 = this.f30250c;
                            ChatActivityEnterView chatActivityEnterView2 = ((xe) k71Var4).f34704a;
                            VideoEditedInfo videoEditedInfo2 = chatActivityEnterView2.Z2;
                            if (videoEditedInfo2 != null) {
                                videoEditedInfo2.endTime = ((float) videoEditedInfo2.estimatedDuration) * f21;
                                chatActivityEnterView2.U2.I(f21, 2);
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.f30252f) {
                k71 k71Var5 = this.f30255s;
                if (k71Var5 != null) {
                    ((xe) k71Var5).f34704a.U2.I(0.0f, 0);
                }
                this.f30252f = false;
                invalidate();
                this.L.a(false);
                return true;
            } else if (this.h) {
                k71 k71Var6 = this.f30255s;
                if (k71Var6 != null) {
                    ((xe) k71Var6).f34704a.U2.I(0.0f, 0);
                }
                this.h = false;
                invalidate();
                this.L.a(false);
                return true;
            }
        }
        return false;
    }

    public void setDelegate(k71 k71Var) {
        this.f30255s = k71Var;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.J;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f9) {
        this.C = f9;
        float f10 = this.f30250c;
        float f11 = this.f30249b;
        if (f10 - f11 > f9) {
            this.f30250c = f11 + f9;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f9) {
        this.D = f9;
    }

    public void setRoundFrames(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F = new Rect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
            this.G = new Rect();
        }
    }

    public void setTimeHintView(j71 j71Var) {
        this.L = j71Var;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f30254r = mediaMetadataRetriever;
        this.f30249b = 0.0f;
        this.f30250c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.f30248a = Long.parseLong(this.f30254r.extractMetadata(9));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        invalidate();
    }
}
