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
public final class j81 extends FrameLayout {
    public static final int I = 0;
    public AnimatorSet D;
    public int E;
    public int F;
    public final k51 G;
    public final n81 H;
    public final ImageReceiver f27311a;
    public boolean f27312b;
    public final TextPaint f27313c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f27314f;
    public final Paint h;
    public final Paint f27315n;
    public int f27316r;
    public int f27317s;
    public int f27318w;
    public int f27319x;
    public boolean f27320y;

    public j81(n81 n81Var, Context context) {
        super(context);
        this.H = n81Var;
        this.f27320y = true;
        this.G = new k51(this, 7);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f27313c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        Paint paint = new Paint(1);
        this.f27314f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f27315n = paint3;
        paint3.setColor(-1);
        this.f27311a = new ImageReceiver(this);
    }

    public final void a() {
        k51 k51Var = this.G;
        org.telegram.messenger.i0.r(k51Var);
        if (this.f27320y && this.H.f28725a.d0()) {
            org.telegram.messenger.i0.h3(k51Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f27317s != i10 && i10 >= 0 && !this.H.H) {
            this.f27317s = i10;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.i0.g0(this.f27317s, false, false), this.f27313c, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f27316r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i10) {
        if (!this.f27312b && i10 >= 0 && !this.H.H) {
            this.f27318w = i10;
            this.e = new StaticLayout(org.telegram.messenger.i0.g0(this.f27318w, false, false), this.f27313c, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f27320y == z10) {
            return;
        }
        this.f27320y = z10;
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f27320y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.D.setDuration(150L);
                this.D.addListener(new i81(this, 0));
                this.D.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.D = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.D.setDuration(150L);
            this.D.addListener(new i81(this, 1));
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
        int i10;
        int i11;
        int i12;
        n81 n81Var = this.H;
        if (n81Var.P) {
            if (n81Var.M && n81Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                n81Var.L = currentTimeMillis;
                float f7 = n81Var.N - (((float) (currentTimeMillis - n81Var.L)) / 150.0f);
                n81Var.N = f7;
                if (f7 < 0.0f) {
                    n81Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = n81Var.N;
            ImageReceiver imageReceiver = this.f27311a;
            imageReceiver.setAlpha(f10);
            imageReceiver.h(canvas, null);
        }
        if (n81Var.f28725a.d != null && !n81Var.H) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!n81Var.U) {
                int i13 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.i0.L(58.0f)) - this.f27316r;
                    if (n81Var.T) {
                        i12 = 6;
                    } else {
                        i12 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.i0.L(i12 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.i0.L(18.0f);
                    if (n81Var.T) {
                        i13 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.i0.L(i13 + 29));
                    this.e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f27317s != 0) {
                float f11 = 7.0f;
                int i14 = 0;
                if (n81Var.U) {
                    L = measuredHeight - org.telegram.messenger.i0.L(3.0f);
                    L2 = org.telegram.messenger.i0.L(7.0f);
                } else if (n81Var.T) {
                    L = measuredHeight - org.telegram.messenger.i0.L(29.0f);
                    i14 = org.telegram.messenger.i0.L(36.0f) + this.f27316r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.i0.L(76.0f)) - this.f27316r;
                    L2 = org.telegram.messenger.i0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.i0.L(13.0f);
                    L2 = org.telegram.messenger.i0.L(12.0f);
                }
                int i15 = measuredHeight - L2;
                boolean z10 = n81Var.T;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i14, L, measuredWidth, org.telegram.messenger.i0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f27312b) {
                    i10 = this.F;
                } else {
                    i10 = ((int) ((this.f27318w / this.f27317s) * (measuredWidth - i14))) + i14;
                }
                int i16 = this.f27319x;
                if (i16 != 0 && (i11 = this.f27317s) != 0) {
                    float f12 = i14;
                    float f13 = L;
                    float c10 = a1.g.c(i16, i11, measuredWidth - i14, f12);
                    float L5 = org.telegram.messenger.i0.L(3.0f) + L;
                    if (n81Var.T) {
                        paint = this.f27315n;
                    }
                    canvas2.drawRect(f12, f13, c10, L5, paint);
                }
                float f14 = i10;
                Paint paint2 = this.f27314f;
                canvas2.drawRect(i14, L, f14, org.telegram.messenger.i0.L(3.0f) + L, paint2);
                if (!n81Var.U) {
                    float f15 = i15;
                    if (!this.f27312b) {
                        f11 = 5.0f;
                    }
                    canvas2.drawCircle(f14, f15, org.telegram.messenger.i0.L(f11), paint2);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (!this.f27320y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f27312b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        n81 n81Var = this.H;
        v61 v61Var = n81Var.f28725a;
        if (n81Var.T) {
            i10 = org.telegram.messenger.i0.L(36.0f) + this.f27316r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(76.0f)) - this.f27316r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(12.0f);
            i10 = 0;
        }
        int i12 = this.f27317s;
        if (i12 != 0) {
            i11 = (int) ((this.f27318w / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        k51 k51Var = this.G;
        if (action == 0) {
            if (this.f27320y && !n81Var.U && !n81Var.H) {
                if (this.f27317s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y3 = (int) motionEvent.getY();
                    if (x10 >= i13 - org.telegram.messenger.i0.L(10.0f) && x10 <= org.telegram.messenger.i0.L(10.0f) + i13 && y3 >= measuredHeight - org.telegram.messenger.i0.L(10.0f) && y3 <= org.telegram.messenger.i0.L(10.0f) + measuredHeight) {
                        this.f27312b = true;
                        this.E = x10;
                        this.F = i13;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.i0.r(k51Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f27312b) {
                int x11 = (int) motionEvent.getX();
                int i14 = this.F - (this.E - x11);
                this.F = i14;
                this.E = x11;
                if (i14 < i10) {
                    this.F = i10;
                } else if (i14 > measuredWidth) {
                    this.F = measuredWidth;
                }
                c((int) (((this.F - i10) / (measuredWidth - i10)) * this.f27317s * 1000));
                invalidate();
            }
        } else {
            if (n81Var.f28744x && v61Var.d0()) {
                org.telegram.messenger.i0.h3(k51Var, 3000L);
            }
            if (this.f27312b) {
                this.f27312b = false;
                if (n81Var.f28744x) {
                    int i15 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.f27317s);
                    this.f27318w = i15;
                    v61Var.q0(i15 * 1000, false);
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
