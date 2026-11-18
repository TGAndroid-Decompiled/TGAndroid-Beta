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
public final class s71 extends FrameLayout {
    public static final int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final t51 H;
    public final w71 I;
    public final ImageReceiver f39508a;
    public boolean f39509b;
    public final TextPaint f39510c;
    public StaticLayout d;
    public StaticLayout f39511e;
    public final Paint f39512f;
    public final Paint h;
    public final Paint f39513n;
    public int f39514r;
    public int f39515s;
    public int f39516w;
    public int f39517x;
    public boolean f39518y;

    public s71(w71 w71Var, Context context) {
        super(context);
        this.I = w71Var;
        this.f39518y = true;
        this.H = new t51(this, 5);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f39510c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        Paint paint = new Paint(1);
        this.f39512f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f39513n = paint3;
        paint3.setColor(-1);
        this.f39508a = new ImageReceiver(this);
    }

    public final void a() {
        t51 t51Var = this.H;
        org.telegram.messenger.g0.r(t51Var);
        if (this.f39518y && this.I.f41592a.d0()) {
            org.telegram.messenger.g0.h3(t51Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.f39515s != i7 && i7 >= 0 && !this.I.I) {
            this.f39515s = i7;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.f39515s, false, false), this.f39510c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f39514r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i7) {
        if (!this.f39509b && i7 >= 0 && !this.I.I) {
            this.f39516w = i7;
            this.f39511e = new StaticLayout(org.telegram.messenger.g0.g0(this.f39516w, false, false), this.f39510c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f39518y == z10) {
            return;
        }
        this.f39518y = z10;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f39518y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new r71(this, 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new r71(this, 1));
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
        w71 w71Var = this.I;
        if (w71Var.Q) {
            if (w71Var.N && w71Var.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                w71Var.M = currentTimeMillis;
                float f10 = w71Var.O - (((float) (currentTimeMillis - w71Var.M)) / 150.0f);
                w71Var.O = f10;
                if (f10 < 0.0f) {
                    w71Var.O = 0.0f;
                }
                invalidate();
            }
            float f11 = w71Var.O;
            ImageReceiver imageReceiver = this.f39508a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (w71Var.f41592a.d != null && !w71Var.I) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!w71Var.V) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.f39514r;
                    if (w71Var.U) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.g0.L(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f39511e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (w71Var.U) {
                        i12 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.g0.L(i12 + 29));
                    this.f39511e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f39515s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (w71Var.V) {
                    L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                    L2 = org.telegram.messenger.g0.L(7.0f);
                } else if (w71Var.U) {
                    L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                    i13 = org.telegram.messenger.g0.L(36.0f) + this.f39514r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.f39514r;
                    L2 = org.telegram.messenger.g0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                    L2 = org.telegram.messenger.g0.L(12.0f);
                }
                int i14 = measuredHeight - L2;
                boolean z10 = w71Var.U;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i13, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f39509b) {
                    i7 = this.G;
                } else {
                    i7 = ((int) ((this.f39516w / this.f39515s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f39517x;
                if (i15 != 0 && (i10 = this.f39515s) != 0) {
                    float f13 = i13;
                    float f14 = L;
                    float c10 = com.google.android.gms.internal.vision.e2.c(i15, i10, measuredWidth - i13, f13);
                    float L5 = org.telegram.messenger.g0.L(3.0f) + L;
                    if (w71Var.U) {
                        paint = this.f39513n;
                    }
                    canvas2.drawRect(f13, f14, c10, L5, paint);
                }
                float f15 = i7;
                Paint paint2 = this.f39512f;
                canvas2.drawRect(i13, L, f15, org.telegram.messenger.g0.L(3.0f) + L, paint2);
                if (!w71Var.V) {
                    float f16 = i14;
                    if (!this.f39509b) {
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
            if (!this.f39518y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f39509b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i7;
        int i10;
        w71 w71Var = this.I;
        f61 f61Var = w71Var.f41592a;
        if (w71Var.U) {
            i7 = org.telegram.messenger.g0.L(36.0f) + this.f39514r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.f39514r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i7 = 0;
        }
        int i11 = this.f39515s;
        if (i11 != 0) {
            i10 = (int) ((this.f39516w / i11) * (measuredWidth - i7));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i7;
        int action = motionEvent.getAction();
        t51 t51Var = this.H;
        if (action == 0) {
            if (this.f39518y && !w71Var.V && !w71Var.I) {
                if (this.f39515s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                        this.f39509b = true;
                        this.F = x10;
                        this.G = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.g0.r(t51Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f39509b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.G - (this.F - x11);
                this.G = i13;
                this.F = x11;
                if (i13 < i7) {
                    this.G = i7;
                } else if (i13 > measuredWidth) {
                    this.G = measuredWidth;
                }
                c((int) (((this.G - i7) / (measuredWidth - i7)) * this.f39515s * 1000));
                invalidate();
            }
        } else {
            if (w71Var.f41613x && f61Var.d0()) {
                org.telegram.messenger.g0.h3(t51Var, 3000L);
            }
            if (this.f39509b) {
                this.f39509b = false;
                if (w71Var.f41613x) {
                    int i14 = (int) (((this.G - i7) / (measuredWidth - i7)) * this.f39515s);
                    this.f39516w = i14;
                    f61Var.q0(i14 * 1000, false);
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
