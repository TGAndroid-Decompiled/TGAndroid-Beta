package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
public abstract class cy0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public ai.c F;
    public float G;
    public ValueAnimator H;
    public RectF f25128a;
    public by0[] f25129b;
    public float[] f25130c;
    public float[] d;
    public float[] f25131e;
    public float f25132f;
    public ImageReceiver h;
    public Long f25133n;
    public p6 f25134r;
    public p6 f25135s;
    public CharSequence v;
    public TextPaint f25136w;
    public StaticLayout f25137x;
    public int f25138y;

    public final long a() {
        if (this.f25129b == null) {
            return 0L;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < this.f25129b.length; i10++) {
            long f7 = this.F.f(i10);
            by0 by0Var = this.f25129b[i10];
            if (by0Var != null && (by0Var.f24822c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = by0Var.f24823e;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        by0[] by0VarArr = this.f25129b;
        if (by0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < by0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            by0 by0Var = by0VarArr[i10];
            if (by0Var != null && (by0Var.f24822c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = by0Var.f24823e;
                }
                j3 += f7;
            }
        }
        this.f25138y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < by0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            by0 by0Var2 = by0VarArr[i11];
            if (by0Var2 != null && (by0Var2.f24822c || f12 > 0)) {
                this.f25138y++;
            }
            if (by0Var2 != null && ((z11 = by0Var2.f24822c) || f12 > 0)) {
                int i12 = (f12 > 0L ? 1 : (f12 == 0L ? 0 : -1));
                if (i12 <= 0) {
                    f12 = by0Var2.f24823e;
                }
                float f13 = ((float) f12) / ((float) j3);
                if (f13 < 0.02777f) {
                    f13 = 0.02777f;
                }
                f10 += f13;
                if (f13 > f11 && (z11 || i12 > 0)) {
                    f11 = f13;
                }
                this.d[i11] = f13;
            } else {
                this.d[i11] = 0.0f;
            }
        }
        if (f10 > 1.0f) {
            float f14 = 1.0f / f10;
            for (int i13 = 0; i13 < by0VarArr.length; i13++) {
                if (by0VarArr[i13] != null) {
                    float[] fArr = this.d;
                    fArr[i13] = fArr[i13] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.f25130c, 0, by0VarArr.length);
            return;
        }
        System.arraycopy(this.f25130c, 0, this.f25131e, 0, by0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ah.m0(17, this, by0VarArr));
        this.E.addListener(new r80(by0VarArr, 21));
        this.E.setDuration(450L);
        this.E.setInterpolator(new u1.a());
        this.E.start();
    }

    public final long d() {
        String str;
        long a2 = a();
        String str2 = " ";
        String[] split = AndroidUtilities.formatFileSize(a2).split(" ");
        if (split.length > 1) {
            p6 p6Var = this.f25134r;
            int i10 = (a2 > 0L ? 1 : (a2 == 0L ? 0 : -1));
            if (i10 == 0) {
                str = " ";
            } else {
                str = split[0];
            }
            p6Var.q(str, true, false);
            p6 p6Var2 = this.f25135s;
            if (i10 != 0) {
                str2 = split[1];
            }
            p6Var2.q(str2, true, false);
        }
        return a2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        int i11;
        p6 p6Var = this.f25135s;
        ImageReceiver imageReceiver = this.h;
        p6 p6Var2 = this.f25134r;
        RectF rectF = this.f25128a;
        if (this.f25129b != null) {
            float f11 = 1.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f12 = this.G;
                    if (f12 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f12;
                        this.G = min;
                        this.G = Utilities.clamp(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.G, 0.15f, 0.85f);
                canvas.scale(z10, z10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            }
            if (this.f25138y > 1) {
                float f13 = this.f25132f;
                if (f13 > 0.0f) {
                    float f14 = (float) (f13 - 0.04d);
                    this.f25132f = f14;
                    if (f14 < 0.0f) {
                        this.f25132f = 0.0f;
                    }
                }
            } else {
                float f15 = this.f25132f;
                if (f15 < 1.0f) {
                    float f16 = (float) (f15 + 0.04d);
                    this.f25132f = f16;
                    if (f16 > 1.0f) {
                        this.f25132f = 1.0f;
                    }
                }
            }
            boolean z11 = false;
            int i12 = 0;
            float f17 = 0.0f;
            while (true) {
                by0[] by0VarArr = this.f25129b;
                i10 = 255;
                f7 = 10.0f;
                if (i12 >= by0VarArr.length) {
                    break;
                }
                by0 by0Var = by0VarArr[i12];
                if (by0Var != null) {
                    float f18 = this.f25130c[i12];
                    if (f18 != 0.0f) {
                        if (by0Var.d) {
                            float z12 = com.google.android.gms.internal.vision.e2.z(f11, this.f25132f, 10.0f, f18 * (-360.0f));
                            if (z12 > 0.0f) {
                                z12 = 0.0f;
                            }
                            by0Var.f24821b.setColor(org.telegram.ui.ActionBar.j6.w0(null, by0Var.f24820a, z11));
                            this.f25129b[i12].f24821b.setAlpha(255);
                            double width = rectF.width() / 2.0f;
                            i11 = i12;
                            if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f11) {
                                double d = (-90.0f) - (360.0f * f17);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.f25129b[i11].f24821b);
                            } else {
                                this.f25129b[i11].f24821b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f17), z12, false, this.f25129b[i11].f24821b);
                            }
                        } else {
                            i11 = i12;
                        }
                        f17 += f18;
                        i12 = i11 + 1;
                        f11 = 1.0f;
                        z11 = false;
                    }
                }
                i11 = i12;
                i12 = i11 + 1;
                f11 = 1.0f;
                z11 = false;
            }
            int i13 = 0;
            float f19 = 0.0f;
            while (true) {
                by0[] by0VarArr2 = this.f25129b;
                if (i13 >= by0VarArr2.length) {
                    break;
                }
                by0 by0Var2 = by0VarArr2[i13];
                if (by0Var2 != null) {
                    float f20 = this.f25130c[i13];
                    if (f20 != 0.0f) {
                        if (!by0Var2.d) {
                            float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f25132f, f7, f20 * (-360.0f));
                            if (z13 > 0.0f) {
                                z13 = 0.0f;
                            }
                            by0Var2.f24821b.setColor(org.telegram.ui.ActionBar.j6.w0(null, by0Var2.f24820a, false));
                            this.f25129b[i13].f24821b.setAlpha(i10);
                            double width2 = rectF.width() / 2.0f;
                            f10 = f20;
                            if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                                double d10 = (-90.0f) - (f19 * 360.0f);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), this.f25129b[i13].f24821b);
                            } else {
                                this.f25129b[i13].f24821b.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (f19 * 360.0f), z13, false, this.f25129b[i13].f24821b);
                                f19 += f10;
                                i13++;
                                i10 = 255;
                                f7 = 10.0f;
                            }
                        } else {
                            f10 = f20;
                        }
                        f19 += f10;
                        i13++;
                        i10 = 255;
                        f7 = 10.0f;
                    }
                }
                i13++;
                i10 = 255;
                f7 = 10.0f;
            }
            if (imageReceiver != null) {
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (p6Var2 != null) {
                int i14 = org.telegram.ui.ActionBar.j6.f20770j5;
                p6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                p6Var.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                if (this.f25133n != null) {
                    float d11 = p6Var.d() + p6Var2.d() + AndroidUtilities.dp(4.0f);
                    float width3 = (getWidth() - d11) / 2.0f;
                    p6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (p6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                    p6Var.setBounds((int) ((width3 + d11) - p6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
                }
                p6Var2.draw(canvas);
                p6Var.draw(canvas);
            }
            if (this.f25137x != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.f25137x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
                this.f25136w.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20770j5, false));
                this.f25137x.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.f25128a;
        p6 p6Var = this.f25135s;
        p6 p6Var2 = this.f25134r;
        Long l4 = this.f25133n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            i12 = org.telegram.messenger.wl.y(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        pr prVar = pr.h;
        p6Var2.k(0.18f, 300L, prVar);
        p6Var2.t(AndroidUtilities.dp(24.0f));
        p6Var2.u(AndroidUtilities.bold());
        p6Var.k(0.18f, 300L, prVar);
        if (l4 != null) {
            p6Var.t(AndroidUtilities.dp(16.0f));
            p6Var2.f29285b = 5;
            p6Var.f29285b = 3;
        } else {
            p6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) p6Var2.f29284a.getTextSize();
            int textSize2 = (int) p6Var.f29284a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            p6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            p6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            p6Var2.f29285b = 17;
            p6Var.f29285b = 17;
        }
        if (this.v != null) {
            if (this.f25136w == null) {
                this.f25136w = new TextPaint(1);
            }
            this.f25136w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.f25136w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f25137x = iw0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i12, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        Long l4;
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null && (l4 = this.f25133n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new jq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(ai.c cVar) {
        this.F = cVar;
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.H) != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            if (!z10) {
                float f7 = this.G;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.H = ofFloat;
                    ofFloat.addUpdateListener(new h70(this, 25));
                    this.H.addListener(new r80(this, 22));
                    this.H.setInterpolator(new OvershootInterpolator(2.0f));
                    this.H.setDuration(350L);
                    this.H.start();
                }
            }
        }
    }
}
