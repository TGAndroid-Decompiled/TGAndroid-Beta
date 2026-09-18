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
public final class m91 extends FrameLayout {
    public static final int I = 0;
    public int E;
    public int F;
    public final m71 G;
    public final q91 H;
    public final ImageReceiver f26379a;
    public boolean f26380b;
    public final TextPaint f26381c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f26382f;
    public final Paint h;
    public final Paint f26383n;
    public int f26384r;
    public int f26385s;
    public int v;
    public int f26386w;
    public boolean f26387x;
    public AnimatorSet f26388y;

    public m91(q91 q91Var, Context context) {
        super(context);
        this.H = q91Var;
        this.f26387x = true;
        this.G = new m71(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f26381c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f26382f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f26383n = paint3;
        paint3.setColor(-1);
        this.f26379a = new ImageReceiver(this);
    }

    public final void a() {
        m71 m71Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(m71Var);
        if (this.f26387x && this.H.f27509a.y()) {
            AndroidUtilities.runOnUIThread(m71Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f26385s != i10 && i10 >= 0 && !this.H.H) {
            this.f26385s = i10;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f26385s), this.f26381c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f26384r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f26380b && i10 >= 0 && !this.H.H) {
            this.v = i10;
            this.e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f26381c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f26387x == z10) {
            return;
        }
        this.f26387x = z10;
        AnimatorSet animatorSet = this.f26388y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f26387x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26388y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.f26388y.setDuration(150L);
                this.f26388y.addListener(new l91(this, 0));
                this.f26388y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f26388y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.f26388y.setDuration(150L);
            this.f26388y.addListener(new l91(this, 1));
            this.f26388y.start();
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
        q91 q91Var = this.H;
        if (q91Var.P) {
            if (q91Var.M && q91Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                q91Var.L = currentTimeMillis;
                float f7 = q91Var.N - (((float) (currentTimeMillis - q91Var.L)) / 150.0f);
                q91Var.N = f7;
                if (f7 < 0.0f) {
                    q91Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = q91Var.N;
            ImageReceiver imageReceiver = this.f26379a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (q91Var.f27509a.d != null && !q91Var.H) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!q91Var.U) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float dp3 = (measuredWidth - AndroidUtilities.dp(58.0f)) - this.f26384r;
                    if (q91Var.T) {
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
                    if (q91Var.T) {
                        i13 = 6;
                    }
                    canvas.translate(dp4, measuredHeight - AndroidUtilities.dp(i13 + 29));
                    this.e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f26385s != 0) {
                float f11 = 7.0f;
                int i14 = 0;
                if (q91Var.U) {
                    dp = measuredHeight - AndroidUtilities.dp(3.0f);
                    dp2 = AndroidUtilities.dp(7.0f);
                } else if (q91Var.T) {
                    dp = measuredHeight - AndroidUtilities.dp(29.0f);
                    i14 = AndroidUtilities.dp(36.0f) + this.f26384r;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f26384r;
                    dp2 = AndroidUtilities.dp(28.0f);
                } else {
                    dp = measuredHeight - AndroidUtilities.dp(13.0f);
                    dp2 = AndroidUtilities.dp(12.0f);
                }
                int i15 = measuredHeight - dp2;
                boolean z10 = q91Var.T;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i14, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f26380b) {
                    i10 = this.F;
                } else {
                    i10 = ((int) ((this.v / this.f26385s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f26386w;
                if (i16 != 0 && (i11 = this.f26385s) != 0) {
                    float f12 = i14;
                    float f13 = dp;
                    float e = a4.a.e(i16, i11, measuredWidth - i14, f12);
                    float dp5 = AndroidUtilities.dp(3.0f) + dp;
                    if (q91Var.T) {
                        paint = this.f26383n;
                    }
                    canvas2.drawRect(f12, f13, e, dp5, paint);
                }
                float f14 = i10;
                Paint paint2 = this.f26382f;
                canvas2.drawRect(i14, dp, f14, AndroidUtilities.dp(3.0f) + dp, paint2);
                if (!q91Var.U) {
                    float f15 = i15;
                    if (!this.f26380b) {
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
            if (!this.f26387x) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f26380b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        q91 q91Var = this.H;
        u71 u71Var = q91Var.f27509a;
        if (q91Var.T) {
            i10 = AndroidUtilities.dp(36.0f) + this.f26384r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f26384r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.f26385s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        m71 m71Var = this.G;
        if (action == 0) {
            if (this.f26387x && !q91Var.U && !q91Var.H) {
                if (this.f26385s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y3 >= measuredHeight - AndroidUtilities.dp(10.0f) && y3 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.f26380b = true;
                        this.E = x10;
                        this.F = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            AndroidUtilities.cancelRunOnUIThread(m71Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f26380b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.F - (this.E - x11);
                this.F = i14;
                this.E = x11;
                if (i14 < i10) {
                    this.F = i10;
                } else if (i14 > measuredWidth) {
                    this.F = measuredWidth;
                }
                c((int) (((this.F - i10) / (measuredWidth - i10)) * this.f26385s * 1000));
                invalidate();
            }
        } else {
            if (q91Var.f27527w && u71Var.y()) {
                AndroidUtilities.runOnUIThread(m71Var, 3000L);
            }
            if (this.f26380b) {
                this.f26380b = false;
                if (q91Var.f27527w) {
                    int i15 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.f26385s);
                    this.v = i15;
                    u71Var.L(i15 * 1000, false);
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
