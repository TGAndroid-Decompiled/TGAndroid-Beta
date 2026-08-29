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
public final class o81 extends FrameLayout {
    public static final int E = 0;
    public int A;
    public int B;
    public final o61 C;
    public final s81 D;
    public final ImageReceiver f31283a;
    public boolean f31284b;
    public final TextPaint f31285c;
    public StaticLayout d;
    public StaticLayout f31286e;
    public final Paint f31287f;
    public final Paint h;
    public final Paint f31288n;
    public int f31289r;
    public int f31290s;
    public int v;
    public int f31291w;
    public boolean f31292x;
    public AnimatorSet f31293y;

    public o81(s81 s81Var, Context context) {
        super(context);
        this.D = s81Var;
        this.f31292x = true;
        this.C = new o61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f31285c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f31287f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f31288n = paint3;
        paint3.setColor(-1);
        this.f31283a = new ImageReceiver(this);
    }

    public final void a() {
        o61 o61Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(o61Var);
        if (this.f31292x && this.D.f32569a.z()) {
            AndroidUtilities.runOnUIThread(o61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f31290s != i10 && i10 >= 0 && !this.D.D) {
            this.f31290s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f31290s), this.f31285c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f31289r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f31284b && i10 >= 0 && !this.D.D) {
            this.v = i10;
            this.f31286e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f31285c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f31292x == z10) {
            return;
        }
        this.f31292x = z10;
        AnimatorSet animatorSet = this.f31293y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f31292x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f31293y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f31293y.setDuration(150L);
                this.f31293y.addListener(new n81(this, 0));
                this.f31293y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f31293y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f31293y.setDuration(150L);
            this.f31293y.addListener(new n81(this, 1));
            this.f31293y.start();
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
        s81 s81Var = this.D;
        if (s81Var.L) {
            if (s81Var.I && s81Var.J != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                s81Var.H = currentTimeMillis;
                float f9 = s81Var.J - (((float) (currentTimeMillis - s81Var.H)) / 150.0f);
                s81Var.J = f9;
                if (f9 < 0.0f) {
                    s81Var.J = 0.0f;
                }
                invalidate();
            }
            float f10 = s81Var.J;
            ImageReceiver imageReceiver = this.f31283a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (s81Var.f32569a.d != null && !s81Var.D) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!s81Var.Q) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f31289r;
                    if (s81Var.P) {
                        i12 = 6;
                    } else {
                        i12 = 10;
                    }
                    canvas.translate(dp3, measuredHeight - AndroidUtilities.dp(i12 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f31286e != null) {
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (s81Var.P) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.f31286e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f31290s != 0) {
                float f11 = 7.0f;
                int i14 = 0;
                if (s81Var.Q) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (s81Var.P) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f31289r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f31289r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z10 = s81Var.P;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f31284b) {
                    i10 = this.B;
                } else {
                    i10 = ((int) ((this.v / this.f31290s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f31291w;
                if (i16 != 0 && (i11 = this.f31290s) != 0) {
                    float f12 = i14;
                    float f13 = dp;
                    float c3 = u3.c.c(i16, i11, measuredWidth - i14, f12);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (s81Var.P) {
                        paint = this.f31288n;
                    }
                    canvas2.drawRect(f12, f13, c3, dp5, paint);
                }
                float f14 = i10;
                Paint paint2 = this.f31287f;
                canvas2.drawRect(i14, dp, f14, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!s81Var.Q) {
                    float f15 = i15;
                    if (!this.f31284b) {
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
            if (!this.f31292x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f31284b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        s81 s81Var = this.D;
        x61 x61Var = s81Var.f32569a;
        if (s81Var.P) {
            i10 = AndroidUtilities.dp(36.0f) + this.f31289r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f31289r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f31290s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        o61 o61Var = this.C;
        if (action == 0) {
            if (this.f31292x && !s81Var.Q && !s81Var.D) {
                if (this.f31290s != 0) {
                    int x4 = (int) motionEvent.getX();
                    int y8 = (int) motionEvent.getY();
                    if (x4 >= i13 - AndroidUtilities.dp(10.0f) && x4 <= AndroidUtilities.dp(10.0f) + i13 && y8 >= measuredHeight - AndroidUtilities.dp(10.0f) && y8 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f31284b = true;
                        this.A = x4;
                        this.B = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(o61Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f31284b) {
                int x10 = (int) motionEvent.getX();
                int i14 = this.B - (this.A - x10);
                this.B = i14;
                this.A = x10;
                if (i14 < i10) {
                    this.B = i10;
                } else if (i14 > measuredWidth) {
                    this.B = measuredWidth;
                }
                c((int) (((this.B - i10) / (measuredWidth - i10)) * this.f31290s * 1000));
                invalidate();
            }
        } else {
            if (s81Var.f32584w && x61Var.z()) {
                AndroidUtilities.runOnUIThread(o61Var, 3000L);
            }
            if (this.f31284b) {
                this.f31284b = false;
                if (s81Var.f32584w) {
                    int i15 = (int) (((this.B - i10) / (measuredWidth - i10)) * this.f31290s);
                    this.v = i15;
                    x61Var.M(i15 * 1000, false);
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
