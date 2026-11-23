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
public final class w71 extends FrameLayout {
    public static final int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final v51 H;
    public final a81 I;
    public final ImageReceiver f41524a;
    public boolean f41525b;
    public final TextPaint f41526c;
    public StaticLayout d;
    public StaticLayout f41527e;
    public final Paint f41528f;
    public final Paint h;
    public final Paint f41529n;
    public int f41530r;
    public int f41531s;
    public int f41532w;
    public int f41533x;
    public boolean f41534y;

    public w71(a81 a81Var, Context context) {
        super(context);
        this.I = a81Var;
        this.f41534y = true;
        this.H = new v51(this, 5);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f41526c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        Paint paint = new Paint(1);
        this.f41528f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f41529n = paint3;
        paint3.setColor(-1);
        this.f41524a = new ImageReceiver(this);
    }

    public final void a() {
        v51 v51Var = this.H;
        org.telegram.messenger.g0.r(v51Var);
        if (this.f41534y && this.I.f33397a.d0()) {
            org.telegram.messenger.g0.h3(v51Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.f41531s != i7 && i7 >= 0 && !this.I.I) {
            this.f41531s = i7;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.f41531s, false, false), this.f41526c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f41530r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i7) {
        if (!this.f41525b && i7 >= 0 && !this.I.I) {
            this.f41532w = i7;
            this.f41527e = new StaticLayout(org.telegram.messenger.g0.g0(this.f41532w, false, false), this.f41526c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f41534y == z10) {
            return;
        }
        this.f41534y = z10;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f41534y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new v71(this, 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new v71(this, 1));
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
        int i7;
        int i10;
        int i11;
        a81 a81Var = this.I;
        if (a81Var.Q) {
            if (a81Var.N && a81Var.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                a81Var.M = currentTimeMillis;
                float f10 = a81Var.O - (((float) (currentTimeMillis - a81Var.M)) / 150.0f);
                a81Var.O = f10;
                if (f10 < 0.0f) {
                    a81Var.O = 0.0f;
                }
                invalidate();
            }
            float f11 = a81Var.O;
            ImageReceiver imageReceiver = this.f41524a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (a81Var.f33397a.d != null && !a81Var.I) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!a81Var.V) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.f41530r;
                    if (a81Var.U) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.g0.L(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f41527e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (a81Var.U) {
                        i12 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.g0.L(i12 + 29));
                    this.f41527e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f41531s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (a81Var.V) {
                    L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                    L2 = org.telegram.messenger.g0.L(7.0f);
                } else if (a81Var.U) {
                    L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                    i13 = org.telegram.messenger.g0.L(36.0f) + this.f41530r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.f41530r;
                    L2 = org.telegram.messenger.g0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                    L2 = org.telegram.messenger.g0.L(12.0f);
                }
                int i14 = measuredHeight - L2;
                boolean z10 = a81Var.U;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i13, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f41525b) {
                    i7 = this.G;
                } else {
                    i7 = ((int) ((this.f41532w / this.f41531s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f41533x;
                if (i15 != 0 && (i10 = this.f41531s) != 0) {
                    float f13 = i13;
                    float f14 = L;
                    float c10 = com.google.android.gms.internal.vision.e2.c(i15, i10, measuredWidth - i13, f13);
                    float L5 = org.telegram.messenger.g0.L(3.0f) + L;
                    if (a81Var.U) {
                        paint = this.f41529n;
                    }
                    canvas2.drawRect(f13, f14, c10, L5, paint);
                }
                float f15 = i7;
                Paint paint2 = this.f41528f;
                canvas2.drawRect(i13, L, f15, org.telegram.messenger.g0.L(3.0f) + L, paint2);
                if (!a81Var.V) {
                    float f16 = i14;
                    if (!this.f41525b) {
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
            if (!this.f41534y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f41525b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i7;
        int i10;
        a81 a81Var = this.I;
        h61 h61Var = a81Var.f33397a;
        if (a81Var.U) {
            i7 = org.telegram.messenger.g0.L(36.0f) + this.f41530r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.f41530r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i7 = 0;
        }
        int i11 = this.f41531s;
        if (i11 != 0) {
            i10 = (int) ((this.f41532w / i11) * (measuredWidth - i7));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i7;
        int action = motionEvent.getAction();
        v51 v51Var = this.H;
        if (action == 0) {
            if (this.f41534y && !a81Var.V && !a81Var.I) {
                if (this.f41531s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                        this.f41525b = true;
                        this.F = x10;
                        this.G = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.g0.r(v51Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f41525b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.G - (this.F - x11);
                this.G = i13;
                this.F = x11;
                if (i13 < i7) {
                    this.G = i7;
                } else if (i13 > measuredWidth) {
                    this.G = measuredWidth;
                }
                c((int) (((this.G - i7) / (measuredWidth - i7)) * this.f41531s * 1000));
                invalidate();
            }
        } else {
            if (a81Var.f33418x && h61Var.d0()) {
                org.telegram.messenger.g0.h3(v51Var, 3000L);
            }
            if (this.f41525b) {
                this.f41525b = false;
                if (a81Var.f33418x) {
                    int i14 = (int) (((this.G - i7) / (measuredWidth - i7)) * this.f41531s);
                    this.f41532w = i14;
                    h61Var.q0(i14 * 1000, false);
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
