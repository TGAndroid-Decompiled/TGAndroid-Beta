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
public final class i71 extends FrameLayout {
    public static final int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final w41 H;
    public final m71 I;
    public final ImageReceiver f35489a;
    public boolean f35490b;
    public final TextPaint f35491c;
    public StaticLayout d;
    public StaticLayout f35492e;
    public final Paint f35493f;
    public final Paint h;
    public final Paint f35494n;
    public int f35495r;
    public int f35496s;
    public int f35497w;
    public int f35498x;
    public boolean f35499y;

    public i71(m71 m71Var, Context context) {
        super(context);
        this.I = m71Var;
        this.f35499y = true;
        this.H = new w41(this, 6);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f35491c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        Paint paint = new Paint(1);
        this.f35493f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f35494n = paint3;
        paint3.setColor(-1);
        this.f35489a = new ImageReceiver(this);
    }

    public final void a() {
        w41 w41Var = this.H;
        org.telegram.messenger.g0.r(w41Var);
        if (this.f35499y && this.I.f37138a.d0()) {
            org.telegram.messenger.g0.i3(w41Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.f35496s != i7 && i7 >= 0 && !this.I.I) {
            this.f35496s = i7;
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.f35496s, false, false), this.f35491c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.d = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.f35495r = (int) Math.ceil(this.d.getLineWidth(0));
            }
            invalidate();
        }
    }

    public final void c(int i7) {
        if (!this.f35490b && i7 >= 0 && !this.I.I) {
            this.f35497w = i7;
            this.f35492e = new StaticLayout(org.telegram.messenger.g0.g0(this.f35497w, false, false), this.f35491c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f35499y == z10) {
            return;
        }
        this.f35499y = z10;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f35499y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new h71(this, 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new h71(this, 1));
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
        m71 m71Var = this.I;
        if (m71Var.Q) {
            if (m71Var.N && m71Var.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                m71Var.M = currentTimeMillis;
                float f10 = m71Var.O - (((float) (currentTimeMillis - m71Var.M)) / 150.0f);
                m71Var.O = f10;
                if (f10 < 0.0f) {
                    m71Var.O = 0.0f;
                }
                invalidate();
            }
            float f11 = m71Var.O;
            ImageReceiver imageReceiver = this.f35489a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (m71Var.f37138a.d != null && !m71Var.I) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!m71Var.V) {
                int i12 = 10;
                if (this.d != null) {
                    canvas.save();
                    float L3 = (measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.f35495r;
                    if (m71Var.U) {
                        i11 = 6;
                    } else {
                        i11 = 10;
                    }
                    canvas.translate(L3, measuredHeight - org.telegram.messenger.g0.L(i11 + 29));
                    this.d.draw(canvas);
                    canvas.restore();
                }
                if (this.f35492e != null) {
                    canvas.save();
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (m71Var.U) {
                        i12 = 6;
                    }
                    canvas.translate(L4, measuredHeight - org.telegram.messenger.g0.L(i12 + 29));
                    this.f35492e.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.f35496s != 0) {
                float f12 = 7.0f;
                int i13 = 0;
                if (m71Var.V) {
                    L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                    L2 = org.telegram.messenger.g0.L(7.0f);
                } else if (m71Var.U) {
                    L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                    i13 = org.telegram.messenger.g0.L(36.0f) + this.f35495r;
                    measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.f35495r;
                    L2 = org.telegram.messenger.g0.L(28.0f);
                } else {
                    L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                    L2 = org.telegram.messenger.g0.L(12.0f);
                }
                int i14 = measuredHeight - L2;
                boolean z10 = m71Var.U;
                Paint paint = this.h;
                if (z10) {
                    canvas.drawRect(i13, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                if (this.f35490b) {
                    i7 = this.G;
                } else {
                    i7 = ((int) ((this.f35497w / this.f35496s) * (measuredWidth - i13))) + i13;
                }
                int i15 = this.f35498x;
                if (i15 != 0 && (i10 = this.f35496s) != 0) {
                    float f13 = i13;
                    float f14 = L;
                    float c10 = com.google.android.gms.internal.vision.e2.c(i15, i10, measuredWidth - i13, f13);
                    float L5 = org.telegram.messenger.g0.L(3.0f) + L;
                    if (m71Var.U) {
                        paint = this.f35494n;
                    }
                    canvas2.drawRect(f13, f14, c10, L5, paint);
                }
                float f15 = i7;
                Paint paint2 = this.f35493f;
                canvas2.drawRect(i13, L, f15, org.telegram.messenger.g0.L(3.0f) + L, paint2);
                if (!m71Var.V) {
                    float f16 = i14;
                    if (!this.f35490b) {
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
            if (!this.f35499y) {
                d(true, true);
                return true;
            }
            onTouchEvent(motionEvent);
            return this.f35490b;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i7;
        int i10;
        m71 m71Var = this.I;
        u51 u51Var = m71Var.f37138a;
        if (m71Var.U) {
            i7 = org.telegram.messenger.g0.L(36.0f) + this.f35495r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.f35495r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i7 = 0;
        }
        int i11 = this.f35496s;
        if (i11 != 0) {
            i10 = (int) ((this.f35497w / i11) * (measuredWidth - i7));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i7;
        int action = motionEvent.getAction();
        w41 w41Var = this.H;
        if (action == 0) {
            if (this.f35499y && !m71Var.V && !m71Var.I) {
                if (this.f35496s != 0) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                        this.f35490b = true;
                        this.F = x10;
                        this.G = i12;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
            } else {
                d(true, true);
            }
            org.telegram.messenger.g0.r(w41Var);
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2 && this.f35490b) {
                int x11 = (int) motionEvent.getX();
                int i13 = this.G - (this.F - x11);
                this.G = i13;
                this.F = x11;
                if (i13 < i7) {
                    this.G = i7;
                } else if (i13 > measuredWidth) {
                    this.G = measuredWidth;
                }
                c((int) (((this.G - i7) / (measuredWidth - i7)) * this.f35496s * 1000));
                invalidate();
            }
        } else {
            if (m71Var.f37159x && u51Var.d0()) {
                org.telegram.messenger.g0.i3(w41Var, 3000L);
            }
            if (this.f35490b) {
                this.f35490b = false;
                if (m71Var.f37159x) {
                    int i14 = (int) (((this.G - i7) / (measuredWidth - i7)) * this.f35496s);
                    this.f35497w = i14;
                    u51Var.q0(i14 * 1000, false);
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
