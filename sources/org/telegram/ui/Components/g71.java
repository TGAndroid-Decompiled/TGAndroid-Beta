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
import org.telegram.messenger.ImageReceiver;
public final class g71 extends FrameLayout {
    public static final int I = 0;
    public AnimatorSet D;
    public int E;
    public int F;
    public final r51 G;
    public final k71 H;
    public final ImageReceiver f33831a;
    public boolean f33832b;
    public final TextPaint f33833c;
    public StaticLayout d;
    public StaticLayout f33834e;
    public final Paint f33835f;
    public final Paint h;
    public final Paint f33836n;
    public int f33837r;
    public int f33838s;
    public int f33839w;
    public int f33840x;
    public boolean f33841y;

    public g71(k71 k71Var, Context context) {
        super(context);
        this.H = k71Var;
        this.f33841y = true;
        this.G = new r51(this, 3);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f33833c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        Paint paint = new Paint(1);
        this.f33835f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f33836n = paint3;
        paint3.setColor(-1);
        this.f33831a = new ImageReceiver(this);
    }

    public final void a() {
        r51 r51Var = this.G;
        org.telegram.messenger.g0.r(r51Var);
        if (this.f33841y && this.H.f35212a.d0()) {
            org.telegram.messenger.g0.i3(r51Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.f33838s != i7 && i7 >= 0 && !this.H.H) {
            this.f33838s = i7;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.f33838s, false, false), this.f33833c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f33837r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i7) {
        if (!this.f33832b && i7 >= 0 && !this.H.H) {
            this.f33839w = i7;
            this.f33834e = new StaticLayout(org.telegram.messenger.g0.g0(this.f33839w, false, false), this.f33833c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z9, boolean z10) {
        if (this.f33841y == z9) {
            return;
        }
        this.f33841y = z9;
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z11 = this.f33841y;
        Property property = View.ALPHA;
        if (z11) {
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.D.setDuration(150L);
                this.D.addListener(new f71(this, 0));
                this.D.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z10) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.D = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.D.setDuration(150L);
            this.D.addListener(new f71(this, 1));
            this.D.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        Canvas canvas2;
        int i7;
        int i10;
        int i11;
        k71 k71Var = this.H;
        if (k71Var.P) {
            if (k71Var.M && k71Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                k71Var.L = currentTimeMillis;
                float f10 = k71Var.N - (((float) (currentTimeMillis - k71Var.L)) / 150.0f);
                k71Var.N = f10;
                if (f10 < 0.0f) {
                    k71Var.N = 0.0f;
                }
                invalidate();
            }
            float f11 = k71Var.N;
            ImageReceiver imageReceiver = this.f33831a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (k71Var.f35212a.d != null && !k71Var.H) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!k71Var.U) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.f33837r;
                    if (k71Var.T) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.g0.L(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f33834e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (k71Var.T) {
                        i12 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.g0.L(i12 + 29));
                    this.f33834e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f33838s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (k71Var.U) {
                    L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                    L2 = org.telegram.messenger.g0.L(7.0f);
                } else if (k71Var.T) {
                    L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                    i13 = org.telegram.messenger.g0.L(36.0f) + this.f33837r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.f33837r;
                    L2 = org.telegram.messenger.g0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                    L2 = org.telegram.messenger.g0.L(12.0f);
                }
                int i14 = measuredHeight - L2;
                boolean z9 = k71Var.T;
                Paint paint = this.h;
                if (z9) {
                    canvas.drawRect(i13, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f33832b) {
                    i7 = this.F;
                } else {
                    i7 = ((int) ((this.f33839w / this.f33838s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f33840x;
                if (i15 != 0 && (i10 = this.f33838s) != 0) {
                    float f13 = i13;
                    float f14 = L;
                    float c10 = com.google.android.recaptcha.internal.a.c(i15, i10, measuredWidth - i13, f13);
                    float L5 = org.telegram.messenger.g0.L(3.0f) + L;
                    if (k71Var.T) {
                        paint = this.f33836n;
                    }
                    canvas2.drawRect(f13, f14, c10, L5, paint);
                }
                float f15 = i7;
                Paint paint2 = this.f33835f;
                canvas2.drawRect(i13, L, f15, org.telegram.messenger.g0.L(3.0f) + L, paint2);
                if (!k71Var.U) {
                    float f16 = i14;
                    if (!this.f33832b) {
                        f12 = 5.0f;
                    }
                    canvas2.drawCircle(f15, f16, org.telegram.messenger.g0.L(f12), paint2);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (!this.f33841y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f33832b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i7;
        int i10;
        k71 k71Var = this.H;
        s51 s51Var = k71Var.f35212a;
        if (k71Var.T) {
            i7 = org.telegram.messenger.g0.L(36.0f) + this.f33837r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.f33837r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i7 = 0;
        }
        int i11 = this.f33838s;
        if (i11 != 0) {
            i10 = (int) ((this.f33839w / i11) * (measuredWidth - i7));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i7;
        int action = motionEvent.getAction();
        r51 r51Var = this.G;
        if (action == 0) {
            if (this.f33841y && !k71Var.U && !k71Var.H) {
                if (this.f33838s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                        this.f33832b = true;
                        this.E = x10;
                        this.F = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.g0.r(r51Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f33832b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.F - (this.E - x11);
                this.F = i13;
                this.E = x11;
                if (i13 < i7) {
                    this.F = i7;
                } else if (i13 > measuredWidth) {
                    this.F = measuredWidth;
                }
                c((int) (((this.F - i7) / (measuredWidth - i7)) * this.f33838s * 1000));
                invalidate();
            }
        } else {
            if (k71Var.f35232x && s51Var.d0()) {
                org.telegram.messenger.g0.i3(r51Var, 3000L);
            }
            if (this.f33832b) {
                this.f33832b = false;
                if (k71Var.f35232x) {
                    int i14 = (int) (((this.F - i7) / (measuredWidth - i7)) * this.f33838s);
                    this.f33839w = i14;
                    s51Var.q0(i14 * 1000, false);
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        a();
    }
}
