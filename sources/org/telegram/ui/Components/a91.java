package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class a91 extends FrameLayout {
    public static final int F = 0;
    public int B;
    public int C;
    public final z61 D;
    public final e91 E;
    public final ImageReceiver f23343a;
    public boolean f23344b;
    public final TextPaint f23345c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f23346f;
    public final Paint h;
    public final Paint f23347n;
    public int f23348r;
    public int f23349s;
    public int v;
    public int f23350w;
    public boolean f23351x;
    public AnimatorSet f23352y;

    public a91(e91 e91Var, Context context) {
        super(context);
        this.E = e91Var;
        this.f23351x = true;
        this.D = new z61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f23345c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f23346f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f23347n = paint3;
        paint3.setColor(-1);
        this.f23343a = new ImageReceiver(this);
    }

    public final void a() {
        z61 z61Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(z61Var);
        if (this.f23351x && this.E.f24530a.y()) {
            AndroidUtilities.runOnUIThread(z61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f23349s != i10 && i10 >= 0 && !this.E.E) {
            this.f23349s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f23349s), this.f23345c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f23348r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f23344b && i10 >= 0 && !this.E.E) {
            this.v = i10;
            this.e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f23345c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z4, boolean z10) {
        if (this.f23351x == z4) {
            return;
        }
        this.f23351x = z4;
        AnimatorSet animatorSet = this.f23352y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z11 = this.f23351x;
        Property property = View.ALPHA;
        if (z11) {
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23352y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f23352y.setDuration(150L);
                this.f23352y.addListener(new z81(this, 0));
                this.f23352y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z10) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f23352y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f23352y.setDuration(150L);
            this.f23352y.addListener(new z81(this, 1));
            this.f23352y.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        int dp2;
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        e91 e91Var = this.E;
        if (e91Var.M) {
            if (e91Var.J && e91Var.K != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                e91Var.I = currentTimeMillis;
                float f10 = e91Var.K - (((float) (currentTimeMillis - e91Var.I)) / 150.0f);
                e91Var.K = f10;
                if (f10 < 0.0f) {
                    e91Var.K = 0.0f;
                }
                invalidate();
            }
            float f11 = e91Var.K;
            ImageReceiver imageReceiver = this.f23343a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (e91Var.f24530a.d != null && !e91Var.E) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!e91Var.R) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f23348r;
                    if (e91Var.Q) {
                        i12 = 6;
                    } else {
                        i12 = 10;
                    }
                    canvas.translate(dp3, measuredHeight - AndroidUtilities.dp(i12 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.e != null) {
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (e91Var.Q) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f23349s != 0) {
                float f12 = 7.0f;
                int i14 = 0;
                if (e91Var.R) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (e91Var.Q) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f23348r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f23348r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z4 = e91Var.Q;
                Paint paint = this.h;
                if (z4) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f23344b) {
                    i10 = this.C;
                } else {
                    i10 = ((int) ((this.v / this.f23349s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f23350w;
                if (i16 != 0 && (i11 = this.f23349s) != 0) {
                    float f13 = i14;
                    float f14 = dp;
                    float c3 = vh.w2.c(i16, i11, measuredWidth - i14, f13);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (e91Var.Q) {
                        paint = this.f23347n;
                    }
                    canvas2.drawRect(f13, f14, c3, dp5, paint);
                }
                float f15 = i10;
                Paint paint2 = this.f23346f;
                canvas2.drawRect(i14, dp, f15, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!e91Var.R) {
                    float f16 = i15;
                    if (!this.f23344b) {
                        f12 = 5.0f;
                    }
                    canvas2.drawCircle(f15, f16, AndroidUtilities.dp(f12), paint2);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (!this.f23351x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f23344b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        e91 e91Var = this.E;
        i71 i71Var = e91Var.f24530a;
        if (e91Var.Q) {
            i10 = AndroidUtilities.dp(36.0f) + this.f23348r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f23348r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f23349s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        z61 z61Var = this.D;
        if (action == 0) {
            if (this.f23351x && !e91Var.R && !e91Var.E) {
                if (this.f23349s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f23344b = true;
                        this.B = x10;
                        this.C = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(z61Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f23344b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.C - (this.B - x11);
                this.C = i14;
                this.B = x11;
                if (i14 < i10) {
                    this.C = i10;
                } else if (i14 > measuredWidth) {
                    this.C = measuredWidth;
                }
                c((int) (((this.C - i10) / (measuredWidth - i10)) * this.f23349s * 1000));
                invalidate();
            }
        } else {
            if (e91Var.f24545w && i71Var.y()) {
                AndroidUtilities.runOnUIThread(z61Var, 3000L);
            }
            if (this.f23344b) {
                this.f23344b = false;
                if (e91Var.f24545w) {
                    int i15 = (int) (((this.C - i10) / (measuredWidth - i10)) * this.f23349s);
                    this.v = i15;
                    i71Var.L(i15 * 1000, false);
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        a();
    }
}
