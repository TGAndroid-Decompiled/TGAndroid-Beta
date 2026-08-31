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
public final class b91 extends FrameLayout {
    public static final int F = 0;
    public int B;
    public int C;
    public final b71 D;
    public final f91 E;
    public final ImageReceiver f25529a;
    public boolean f25530b;
    public final TextPaint f25531c;
    public StaticLayout d;
    public StaticLayout f25532e;
    public final Paint f25533f;
    public final Paint h;
    public final Paint f25534n;
    public int f25535r;
    public int f25536s;
    public int v;
    public int f25537w;
    public boolean f25538x;
    public AnimatorSet f25539y;

    public b91(f91 f91Var, Context context) {
        super(context);
        this.E = f91Var;
        this.f25538x = true;
        this.D = new b71(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f25531c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f25533f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f25534n = paint3;
        paint3.setColor(-1);
        this.f25529a = new ImageReceiver(this);
    }

    public final void a() {
        b71 b71Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(b71Var);
        if (this.f25538x && this.E.f26812a.y()) {
            AndroidUtilities.runOnUIThread(b71Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f25536s != i10 && i10 >= 0 && !this.E.E) {
            this.f25536s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f25536s), this.f25531c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f25535r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f25530b && i10 >= 0 && !this.E.E) {
            this.v = i10;
            this.f25532e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f25531c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z4, boolean z10) {
        if (this.f25538x == z4) {
            return;
        }
        this.f25538x = z4;
        AnimatorSet animatorSet = this.f25539y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z11 = this.f25538x;
        Property property = View.ALPHA;
        if (z11) {
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f25539y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f25539y.setDuration(150L);
                this.f25539y.addListener(new a91(this, 0));
                this.f25539y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z10) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f25539y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f25539y.setDuration(150L);
            this.f25539y.addListener(new a91(this, 1));
            this.f25539y.start();
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
        f91 f91Var = this.E;
        if (f91Var.M) {
            if (f91Var.J && f91Var.K != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                f91Var.I = currentTimeMillis;
                float f10 = f91Var.K - (((float) (currentTimeMillis - f91Var.I)) / 150.0f);
                f91Var.K = f10;
                if (f10 < 0.0f) {
                    f91Var.K = 0.0f;
                }
                invalidate();
            }
            float f11 = f91Var.K;
            ImageReceiver imageReceiver = this.f25529a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (f91Var.f26812a.d != null && !f91Var.E) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!f91Var.R) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f25535r;
                    if (f91Var.Q) {
                        i12 = 6;
                    } else {
                        i12 = 10;
                    }
                    canvas.translate(dp3, measuredHeight - AndroidUtilities.dp(i12 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f25532e != null) {
                    canvas.save();
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (f91Var.Q) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.f25532e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f25536s != 0) {
                float f12 = 7.0f;
                int i14 = 0;
                if (f91Var.R) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (f91Var.Q) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f25535r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f25535r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z4 = f91Var.Q;
                Paint paint = this.h;
                if (z4) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f25530b) {
                    i10 = this.C;
                } else {
                    i10 = ((int) ((this.v / this.f25536s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f25537w;
                if (i16 != 0 && (i11 = this.f25536s) != 0) {
                    float f13 = i14;
                    float f14 = dp;
                    float c3 = w.c.c(i16, i11, measuredWidth - i14, f13);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (f91Var.Q) {
                        paint = this.f25534n;
                    }
                    canvas2.drawRect(f13, f14, c3, dp5, paint);
                }
                float f15 = i10;
                Paint paint2 = this.f25533f;
                canvas2.drawRect(i14, dp, f15, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!f91Var.R) {
                    float f16 = i15;
                    if (!this.f25530b) {
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
            if (!this.f25538x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f25530b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        f91 f91Var = this.E;
        k71 k71Var = f91Var.f26812a;
        if (f91Var.Q) {
            i10 = AndroidUtilities.dp(36.0f) + this.f25535r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f25535r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f25536s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        b71 b71Var = this.D;
        if (action == 0) {
            if (this.f25538x && !f91Var.R && !f91Var.E) {
                if (this.f25536s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f25530b = true;
                        this.B = x10;
                        this.C = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(b71Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f25530b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.C - (this.B - x11);
                this.C = i14;
                this.B = x11;
                if (i14 < i10) {
                    this.C = i10;
                } else if (i14 > measuredWidth) {
                    this.C = measuredWidth;
                }
                c((int) (((this.C - i10) / (measuredWidth - i10)) * this.f25536s * 1000));
                invalidate();
            }
        } else {
            if (f91Var.f26828w && k71Var.y()) {
                AndroidUtilities.runOnUIThread(b71Var, 3000L);
            }
            if (this.f25530b) {
                this.f25530b = false;
                if (f91Var.f26828w) {
                    int i15 = (int) (((this.C - i10) / (measuredWidth - i10)) * this.f25536s);
                    this.v = i15;
                    k71Var.L(i15 * 1000, false);
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
