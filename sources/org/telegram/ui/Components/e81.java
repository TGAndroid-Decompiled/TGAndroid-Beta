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

public final class e81 extends FrameLayout {
    public static final int E = 0;
    public int A;
    public int B;
    public final d61 C;
    public final i81 D;

    public final ImageReceiver f27973a;

    public boolean f27974b;

    public final TextPaint f27975c;
    public StaticLayout d;

    public StaticLayout f27976e;

    public final Paint f27977f;
    public final Paint h;

    public final Paint f27978n;

    public int f27979r;

    public int f27980s;
    public int v;

    public int f27981w;

    public boolean f27982x;

    public AnimatorSet f27983y;

    public e81(i81 i81Var, Context context) {
        super(context);
        this.D = i81Var;
        this.f27982x = true;
        this.C = new d61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f27975c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f27977f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.f27978n = paint3;
        paint3.setColor(-1);
        this.f27973a = new ImageReceiver(this);
    }

    public final void a() {
        d61 d61Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(d61Var);
        if (this.f27982x && this.D.f29295a.z()) {
            AndroidUtilities.runOnUIThread(d61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.f27980s == i10 || i10 < 0 || this.D.D) {
            return;
        }
        this.f27980s = i10;
        StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.f27980s), this.f27975c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.f27979r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i10) {
        if (this.f27974b || i10 < 0 || this.D.D) {
            return;
        }
        this.v = i10;
        this.f27976e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.f27975c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f27982x == z10) {
            return;
        }
        this.f27982x = z10;
        AnimatorSet animatorSet = this.f27983y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.f27982x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f27983y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<e81, Float>) property, 1.0f));
                this.f27983y.setDuration(150L);
                this.f27983y.addListener(new d81(this, 0));
                this.f27983y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f27983y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<e81, Float>) property, 0.0f));
            this.f27983y.setDuration(150L);
            this.f27983y.addListener(new d81(this, 1));
            this.f27983y.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        int iDp2;
        Canvas canvas2;
        int i10;
        i81 i81Var = this.D;
        if (i81Var.L) {
            if (i81Var.I && i81Var.J != 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = jCurrentTimeMillis - i81Var.H;
                i81Var.H = jCurrentTimeMillis;
                float f10 = i81Var.J - (j10 / 150.0f);
                i81Var.J = f10;
                if (f10 < 0.0f) {
                    i81Var.J = 0.0f;
                }
                invalidate();
            }
            float f11 = i81Var.J;
            ImageReceiver imageReceiver = this.f27973a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (i81Var.f29295a.d == null || i81Var.D) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!i81Var.Q) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.f27979r, measuredHeight - AndroidUtilities.dp((i81Var.P ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.f27976e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((i81Var.P ? 6 : 10) + 29));
                this.f27976e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.f27980s != 0) {
            int iDp3 = 0;
            if (i81Var.Q) {
                iDp = measuredHeight - AndroidUtilities.dp(3.0f);
                iDp2 = AndroidUtilities.dp(7.0f);
            } else if (i81Var.P) {
                iDp = measuredHeight - AndroidUtilities.dp(29.0f);
                iDp3 = AndroidUtilities.dp(36.0f) + this.f27979r;
                measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.f27979r;
                iDp2 = AndroidUtilities.dp(28.0f);
            } else {
                iDp = measuredHeight - AndroidUtilities.dp(13.0f);
                iDp2 = AndroidUtilities.dp(12.0f);
            }
            int i11 = measuredHeight - iDp2;
            boolean z10 = i81Var.P;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(iDp3, iDp, measuredWidth, AndroidUtilities.dp(3.0f) + iDp, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i12 = this.f27974b ? this.B : ((int) ((this.v / this.f27980s) * (measuredWidth - iDp3))) + iDp3;
            int i13 = this.f27981w;
            if (i13 != 0 && (i10 = this.f27980s) != 0) {
                float f12 = iDp3;
                float f13 = iDp;
                float fC = s3.c.c(i13, i10, measuredWidth - iDp3, f12);
                float fDp = AndroidUtilities.dp(3.0f) + iDp;
                if (i81Var.P) {
                    paint = this.f27978n;
                }
                canvas2.drawRect(f12, f13, fC, fDp, paint);
            }
            float f14 = i12;
            float fDp2 = AndroidUtilities.dp(3.0f) + iDp;
            Paint paint2 = this.f27977f;
            canvas2.drawRect(iDp3, iDp, f14, fDp2, paint2);
            if (i81Var.Q) {
                return;
            }
            canvas2.drawCircle(f14, i11, AndroidUtilities.dp(this.f27974b ? 7.0f : 5.0f), paint2);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f27982x) {
            onTouchEvent(motionEvent);
            return this.f27974b;
        }
        d(true, true);
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int iDp;
        int i10;
        i81 i81Var = this.D;
        m61 m61Var = i81Var.f29295a;
        if (i81Var.P) {
            iDp = AndroidUtilities.dp(36.0f) + this.f27979r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.f27979r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            iDp = 0;
        }
        int i11 = this.f27980s;
        if (i11 != 0) {
            i10 = (int) ((this.v / i11) * (measuredWidth - iDp));
        } else {
            i10 = 0;
        }
        int i12 = i10 + iDp;
        int action = motionEvent.getAction();
        d61 d61Var = this.C;
        if (action == 0) {
            if (!this.f27982x || i81Var.Q || i81Var.D) {
                d(true, true);
            } else if (this.f27980s != 0) {
                int x8 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x8 >= i12 - AndroidUtilities.dp(10.0f) && x8 <= AndroidUtilities.dp(10.0f) + i12 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                    this.f27974b = true;
                    this.A = x8;
                    this.B = i12;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(d61Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (i81Var.f29310w && m61Var.z()) {
                AndroidUtilities.runOnUIThread(d61Var, 3000L);
            }
            if (this.f27974b) {
                this.f27974b = false;
                if (i81Var.f29310w) {
                    int i13 = (int) (((this.B - iDp) / (measuredWidth - iDp)) * this.f27980s);
                    this.v = i13;
                    m61Var.M(((long) i13) * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.f27974b) {
            int x10 = (int) motionEvent.getX();
            int i14 = this.B - (this.A - x10);
            this.B = i14;
            this.A = x10;
            if (i14 < iDp) {
                this.B = iDp;
            } else if (i14 > measuredWidth) {
                this.B = measuredWidth;
            }
            c((int) (((this.B - iDp) / (measuredWidth - iDp)) * this.f27980s * 1000));
            invalidate();
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
