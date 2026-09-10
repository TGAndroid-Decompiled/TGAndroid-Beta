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
public final class k91 extends FrameLayout {
    public static final int I = 0;
    public int E;
    public int F;
    public final k71 G;
    public final o91 H;
    public final ImageReceiver f24676a;
    public boolean f24677b;
    public final TextPaint f24678c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f24679f;
    public final Paint h;
    public final Paint f24680n;
    public int f24681r;
    public int f24682s;
    public int v;
    public int f24683w;
    public boolean f24684x;
    public AnimatorSet f24685y;

    public k91(o91 o91Var, Context context) {
        super(context);
        this.H = o91Var;
        this.f24684x = true;
        this.G = new k71(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f24678c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f24679f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f24680n = paint3;
        paint3.setColor(-1);
        this.f24676a = new ImageReceiver(this);
    }

    public final void a() {
        k71 k71Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(k71Var);
        if (this.f24684x && this.H.f25715a.y()) {
            AndroidUtilities.runOnUIThread(k71Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f24682s != i10 && i10 >= 0 && !this.H.H) {
            this.f24682s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f24682s), this.f24678c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f24681r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f24677b && i10 >= 0 && !this.H.H) {
            this.v = i10;
            this.e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f24678c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f24684x == z10) {
            return;
        }
        this.f24684x = z10;
        AnimatorSet animatorSet = this.f24685y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f24684x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24685y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f24685y.setDuration(150L);
                this.f24685y.addListener(new j91(this, 0));
                this.f24685y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f24685y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f24685y.setDuration(150L);
            this.f24685y.addListener(new j91(this, 1));
            this.f24685y.start();
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
        o91 o91Var = this.H;
        if (o91Var.P) {
            if (o91Var.M && o91Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                o91Var.L = currentTimeMillis;
                float f7 = o91Var.N - (((float) (currentTimeMillis - o91Var.L)) / 150.0f);
                o91Var.N = f7;
                if (f7 < 0.0f) {
                    o91Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = o91Var.N;
            ImageReceiver imageReceiver = this.f24676a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (o91Var.f25715a.d != null && !o91Var.H) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!o91Var.U) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f24681r;
                    if (o91Var.T) {
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
                    if (o91Var.T) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f24682s != 0) {
                float f11 = 7.0f;
                int i14 = 0;
                if (o91Var.U) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (o91Var.T) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f24681r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f24681r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z10 = o91Var.T;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f24677b) {
                    i10 = this.F;
                } else {
                    i10 = ((int) ((this.v / this.f24682s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f24683w;
                if (i16 != 0 && (i11 = this.f24682s) != 0) {
                    float f12 = i14;
                    float f13 = dp;
                    float e = a4.a.e(i16, i11, measuredWidth - i14, f12);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (o91Var.T) {
                        paint = this.f24680n;
                    }
                    canvas2.drawRect(f12, f13, e, dp5, paint);
                }
                float f14 = i10;
                Paint paint2 = this.f24679f;
                canvas2.drawRect(i14, dp, f14, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!o91Var.U) {
                    float f15 = i15;
                    if (!this.f24677b) {
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
            if (!this.f24684x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f24677b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        o91 o91Var = this.H;
        t71 t71Var = o91Var.f25715a;
        if (o91Var.T) {
            i10 = AndroidUtilities.dp(36.0f) + this.f24681r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f24681r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f24682s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        k71 k71Var = this.G;
        if (action == 0) {
            if (this.f24684x && !o91Var.U && !o91Var.H) {
                if (this.f24682s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y3 >= measuredHeight - AndroidUtilities.dp(10.0f) && y3 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f24677b = true;
                        this.E = x10;
                        this.F = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(k71Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f24677b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.F - (this.E - x11);
                this.F = i14;
                this.E = x11;
                if (i14 < i10) {
                    this.F = i10;
                } else if (i14 > measuredWidth) {
                    this.F = measuredWidth;
                }
                c((int) (((this.F - i10) / (measuredWidth - i10)) * this.f24682s * 1000));
                invalidate();
            }
        } else {
            if (o91Var.f25733w && t71Var.y()) {
                AndroidUtilities.runOnUIThread(k71Var, 3000L);
            }
            if (this.f24677b) {
                this.f24677b = false;
                if (o91Var.f25733w) {
                    int i15 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.f24682s);
                    this.v = i15;
                    t71Var.L(i15 * 1000, false);
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
