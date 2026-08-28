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
public final class c81 extends FrameLayout {
    public static final int E = 0;
    public int A;
    public int B;
    public final b61 C;
    public final g81 D;
    public final ImageReceiver f27414a;
    public boolean f27415b;
    public final TextPaint f27416c;
    public StaticLayout d;
    public StaticLayout f27417e;
    public final Paint f27418f;
    public final Paint h;
    public final Paint f27419n;
    public int f27420r;
    public int f27421s;
    public int v;
    public int f27422w;
    public boolean f27423x;
    public AnimatorSet f27424y;

    public c81(g81 g81Var, Context context) {
        super(context);
        this.D = g81Var;
        this.f27423x = true;
        this.C = new b61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f27416c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f27418f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f27419n = paint3;
        paint3.setColor(-1);
        this.f27414a = new ImageReceiver(this);
    }

    public final void a() {
        b61 b61Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(b61Var);
        if (this.f27423x && this.D.f28692a.z()) {
            AndroidUtilities.runOnUIThread(b61Var, 3000L);
        }
    }

    public final void b(int i9) {
        if (this.f27421s != i9 && i9 >= 0 && !this.D.D) {
            this.f27421s = i9;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f27421s), this.f27416c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f27420r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i9) {
        if (!this.f27415b && i9 >= 0 && !this.D.D) {
            this.v = i9;
            this.f27417e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f27416c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f27423x == z10) {
            return;
        }
        this.f27423x = z10;
        AnimatorSet animatorSet = this.f27424y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f27423x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f27424y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f27424y.setDuration(150L);
                this.f27424y.addListener(new b81(this, 0));
                this.f27424y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f27424y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f27424y.setDuration(150L);
            this.f27424y.addListener(new b81(this, 1));
            this.f27424y.start();
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
        int i9;
        int i10;
        int i11;
        g81 g81Var = this.D;
        if (g81Var.L) {
            if (g81Var.I && g81Var.J != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                g81Var.H = currentTimeMillis;
                float f10 = g81Var.J - (((float) (currentTimeMillis - g81Var.H)) / 150.0f);
                g81Var.J = f10;
                if (f10 < 0.0f) {
                    g81Var.J = 0.0f;
                }
                invalidate();
            }
            float f11 = g81Var.J;
            ImageReceiver imageReceiver = this.f27414a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (g81Var.f28692a.d != null && !g81Var.D) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!g81Var.Q) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f27420r;
                    if (g81Var.P) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(dp3, measuredHeight - AndroidUtilities.dp(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f27417e != null) {
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (g81Var.P) {
                        i12 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i12 + 29));
                    this.f27417e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f27421s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (g81Var.Q) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (g81Var.P) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i13 = AndroidUtilities.dp(36.0f) + this.f27420r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f27420r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i14 = measuredHeight - dp2;
                boolean z10 = g81Var.P;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i13, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f27415b) {
                    i9 = this.B;
                } else {
                    i9 = ((int) ((this.v / this.f27421s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f27422w;
                if (i15 != 0 && (i10 = this.f27421s) != 0) {
                    float f13 = i13;
                    float f14 = dp;
                    float b10 = org.telegram.ui.Cells.j2.b(i15, i10, measuredWidth - i13, f13);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (g81Var.P) {
                        paint = this.f27419n;
                    }
                    canvas2.drawRect(f13, f14, b10, dp5, paint);
                }
                float f15 = i9;
                Paint paint2 = this.f27418f;
                canvas2.drawRect(i13, dp, f15, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!g81Var.Q) {
                    float f16 = i14;
                    if (!this.f27415b) {
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
            if (!this.f27423x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f27415b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i9;
        int i10;
        g81 g81Var = this.D;
        k61 k61Var = g81Var.f28692a;
        if (g81Var.P) {
            i9 = AndroidUtilities.dp(36.0f) + this.f27420r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f27420r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i9 = 0;
        }
        int i11 = this.f27421s;
        if (i11 != 0) {
            i10 = (int) ((this.v / i11) * (measuredWidth - i9));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i9;
        int action = motionEvent.getAction();
        b61 b61Var = this.C;
        if (action == 0) {
            if (this.f27423x && !g81Var.Q && !g81Var.D) {
                if (this.f27421s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i12 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i12 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f27415b = true;
                        this.A = x10;
                        this.B = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(b61Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f27415b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.B - (this.A - x11);
                this.B = i13;
                this.A = x11;
                if (i13 < i9) {
                    this.B = i9;
                } else if (i13 > measuredWidth) {
                    this.B = measuredWidth;
                }
                c((int) (((this.B - i9) / (measuredWidth - i9)) * this.f27421s * 1000));
                invalidate();
            }
        } else {
            if (g81Var.f28707w && k61Var.z()) {
                AndroidUtilities.runOnUIThread(b61Var, 3000L);
            }
            if (this.f27415b) {
                this.f27415b = false;
                if (g81Var.f28707w) {
                    int i14 = (int) (((this.B - i9) / (measuredWidth - i9)) * this.f27421s);
                    this.v = i14;
                    k61Var.M(i14 * 1000, false);
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
