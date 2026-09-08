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
public final class x81 extends FrameLayout {
    public static final int I = 0;
    public int E;
    public int F;
    public final x61 G;
    public final b91 H;
    public final ImageReceiver f32492a;
    public boolean f32493b;
    public final TextPaint f32494c;
    public StaticLayout d;
    public StaticLayout f32495e;
    public final Paint f32496f;
    public final Paint h;
    public final Paint f32497n;
    public int f32498r;
    public int f32499s;
    public int v;
    public int f32500w;
    public boolean f32501x;
    public AnimatorSet f32502y;

    public x81(b91 b91Var, Context context) {
        super(context);
        this.H = b91Var;
        this.f32501x = true;
        this.G = new x61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f32494c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f32496f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f32497n = paint3;
        paint3.setColor(-1);
        this.f32492a = new ImageReceiver(this);
    }

    public final void a() {
        x61 x61Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(x61Var);
        if (this.f32501x && this.H.f24645a.y()) {
            AndroidUtilities.runOnUIThread(x61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f32499s != i10 && i10 >= 0 && !this.H.H) {
            this.f32499s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f32499s), this.f32494c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f32498r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f32493b && i10 >= 0 && !this.H.H) {
            this.v = i10;
            this.f32495e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f32494c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f32501x == z10) {
            return;
        }
        this.f32501x = z10;
        AnimatorSet animatorSet = this.f32502y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f32501x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f32502y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f32502y.setDuration(150L);
                this.f32502y.addListener(new w81(this, 0));
                this.f32502y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f32502y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f32502y.setDuration(150L);
            this.f32502y.addListener(new w81(this, 1));
            this.f32502y.start();
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
        b91 b91Var = this.H;
        if (b91Var.P) {
            if (b91Var.M && b91Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                b91Var.L = currentTimeMillis;
                float f7 = b91Var.N - (((float) (currentTimeMillis - b91Var.L)) / 150.0f);
                b91Var.N = f7;
                if (f7 < 0.0f) {
                    b91Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = b91Var.N;
            ImageReceiver imageReceiver = this.f32492a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (b91Var.f24645a.d != null && !b91Var.H) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!b91Var.U) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f32498r;
                    if (b91Var.T) {
                        i12 = 6;
                    } else {
                        i12 = 10;
                    }
                    canvas.translate(dp3, measuredHeight - AndroidUtilities.dp(i12 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f32495e != null) {
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (b91Var.T) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.f32495e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f32499s != 0) {
                float f11 = 7.0f;
                int i14 = 0;
                if (b91Var.U) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (b91Var.T) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f32498r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f32498r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z10 = b91Var.T;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f32493b) {
                    i10 = this.F;
                } else {
                    i10 = ((int) ((this.v / this.f32499s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f32500w;
                if (i16 != 0 && (i11 = this.f32499s) != 0) {
                    float f12 = i14;
                    float f13 = dp;
                    float e7 = a4.a.e(i16, i11, measuredWidth - i14, f12);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (b91Var.T) {
                        paint = this.f32497n;
                    }
                    canvas2.drawRect(f12, f13, e7, dp5, paint);
                }
                float f14 = i10;
                Paint paint2 = this.f32496f;
                canvas2.drawRect(i14, dp, f14, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!b91Var.U) {
                    float f15 = i15;
                    if (!this.f32493b) {
                        f11 = 5.0f;
                    }
                    canvas2.drawCircle(f14, f15, AndroidUtilities.dp(f11), paint2);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (!this.f32501x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f32493b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        b91 b91Var = this.H;
        g71 g71Var = b91Var.f24645a;
        if (b91Var.T) {
            i10 = AndroidUtilities.dp(36.0f) + this.f32498r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f32498r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f32499s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        x61 x61Var = this.G;
        if (action == 0) {
            if (this.f32501x && !b91Var.U && !b91Var.H) {
                if (this.f32499s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y3 >= measuredHeight - AndroidUtilities.dp(10.0f) && y3 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f32493b = true;
                        this.E = x10;
                        this.F = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(x61Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f32493b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.F - (this.E - x11);
                this.F = i14;
                this.E = x11;
                if (i14 < i10) {
                    this.F = i10;
                } else if (i14 > measuredWidth) {
                    this.F = measuredWidth;
                }
                c((int) (((this.F - i10) / (measuredWidth - i10)) * this.f32499s * 1000));
                invalidate();
            }
        } else {
            if (b91Var.f24664w && g71Var.y()) {
                AndroidUtilities.runOnUIThread(x61Var, 3000L);
            }
            if (this.f32493b) {
                this.f32493b = false;
                if (b91Var.f24664w) {
                    int i15 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.f32499s);
                    this.v = i15;
                    g71Var.L(i15 * 1000, false);
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        a();
    }
}
