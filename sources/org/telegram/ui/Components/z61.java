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
public final class z61 extends FrameLayout {
    public static final int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final f51 H;
    public final d71 I;
    public final ImageReceiver f40929a;
    public boolean f40930b;
    public final TextPaint f40931c;
    public StaticLayout d;
    public StaticLayout f40932e;
    public final Paint f40933f;
    public final Paint h;
    public final Paint f40934n;
    public int f40935r;
    public int f40936s;
    public int f40937w;
    public int f40938x;
    public boolean f40939y;

    public z61(d71 d71Var, Context context) {
        super(context);
        this.I = d71Var;
        this.f40939y = true;
        this.H = new f51(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f40931c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        Paint paint = new Paint(1);
        this.f40933f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f40934n = paint3;
        paint3.setColor(-1);
        this.f40929a = new ImageReceiver(this);
    }

    public final void a() {
        f51 f51Var = this.H;
        org.telegram.messenger.g0.r(f51Var);
        if (this.f40939y && this.I.f32996a.d0()) {
            org.telegram.messenger.g0.i3(f51Var, 3000L);
        }
    }

    public final void b(int i3) {
        if (this.f40936s != i3 && i3 >= 0 && !this.I.I) {
            this.f40936s = i3;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.f40936s, false, false), this.f40931c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f40935r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i3) {
        if (!this.f40930b && i3 >= 0 && !this.I.I) {
            this.f40937w = i3;
            this.f40932e = new StaticLayout(org.telegram.messenger.g0.g0(this.f40937w, false, false), this.f40931c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f40939y == z10) {
            return;
        }
        this.f40939y = z10;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f40939y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new y61(this, 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new y61(this, 1));
            this.E.start();
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
        int i3;
        int i10;
        int i11;
        d71 d71Var = this.I;
        if (d71Var.Q) {
            if (d71Var.N && d71Var.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                d71Var.M = currentTimeMillis;
                float f10 = d71Var.O - (((float) (currentTimeMillis - d71Var.M)) / 150.0f);
                d71Var.O = f10;
                if (f10 < 0.0f) {
                    d71Var.O = 0.0f;
                }
                invalidate();
            }
            float f11 = d71Var.O;
            ImageReceiver imageReceiver = this.f40929a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (d71Var.f32996a.d != null && !d71Var.I) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!d71Var.V) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.f40935r;
                    if (d71Var.U) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.g0.L(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f40932e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (d71Var.U) {
                        i12 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.g0.L(i12 + 29));
                    this.f40932e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f40936s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (d71Var.V) {
                    L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                    L2 = org.telegram.messenger.g0.L(7.0f);
                } else if (d71Var.U) {
                    L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                    i13 = org.telegram.messenger.g0.L(36.0f) + this.f40935r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.f40935r;
                    L2 = org.telegram.messenger.g0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                    L2 = org.telegram.messenger.g0.L(12.0f);
                }
                int i14 = measuredHeight - L2;
                boolean z10 = d71Var.U;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i13, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f40930b) {
                    i3 = this.G;
                } else {
                    i3 = ((int) ((this.f40937w / this.f40936s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f40938x;
                if (i15 != 0 && (i10 = this.f40936s) != 0) {
                    float f13 = i13;
                    float f14 = L;
                    float A = a1.g.A(i15, i10, measuredWidth - i13, f13);
                    float L5 = org.telegram.messenger.g0.L(3.0f) + L;
                    if (d71Var.U) {
                        paint = this.f40934n;
                    }
                    canvas2.drawRect(f13, f14, A, L5, paint);
                }
                float f15 = i3;
                Paint paint2 = this.f40933f;
                canvas2.drawRect(i13, L, f15, org.telegram.messenger.g0.L(3.0f) + L, paint2);
                if (!d71Var.V) {
                    float f16 = i14;
                    if (!this.f40930b) {
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
            if (!this.f40939y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f40930b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i3;
        int i10;
        d71 d71Var = this.I;
        m51 m51Var = d71Var.f32996a;
        if (d71Var.U) {
            i3 = org.telegram.messenger.g0.L(36.0f) + this.f40935r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.f40935r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i3 = 0;
        }
        int i11 = this.f40936s;
        if (i11 != 0) {
            i10 = (int) ((this.f40937w / i11) * (measuredWidth - i3));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i3;
        int action = motionEvent.getAction();
        f51 f51Var = this.H;
        if (action == 0) {
            if (this.f40939y && !d71Var.V && !d71Var.I) {
                if (this.f40936s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y9 = (int) motionEvent.getY();
                    if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y9 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y9 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                        this.f40930b = true;
                        this.F = x10;
                        this.G = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.g0.r(f51Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f40930b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.G - (this.F - x11);
                this.G = i13;
                this.F = x11;
                if (i13 < i3) {
                    this.G = i3;
                } else if (i13 > measuredWidth) {
                    this.G = measuredWidth;
                }
                c((int) (((this.G - i3) / (measuredWidth - i3)) * this.f40936s * 1000));
                invalidate();
            }
        } else {
            if (d71Var.f33017x && m51Var.d0()) {
                org.telegram.messenger.g0.i3(f51Var, 3000L);
            }
            if (this.f40930b) {
                this.f40930b = false;
                if (d71Var.f33017x) {
                    int i14 = (int) (((this.G - i3) / (measuredWidth - i3)) * this.f40936s);
                    this.f40937w = i14;
                    m51Var.q0(i14 * 1000, false);
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
