package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;

public final class i3 extends View {
    public final n1 A;
    public ValueAnimator B;
    public float C;
    public float D;
    public float E;

    public oi0 f33616a;

    public oi0 f33617b;

    public oi0 f33618c;
    public final Paint d;

    public final Paint f33619e;

    public final Paint f33620f;
    public final Path h;

    public final int f33621n;

    public int f33622r;

    public int f33623s;
    public boolean v;

    public int f33624w;

    public h3 f33625x;

    public ValueAnimator f33626y;

    public i3(Context context, n1 n1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f33619e = paint2;
        Paint paint3 = new Paint(1);
        this.f33620f = paint3;
        this.h = new Path();
        int iDp = AndroidUtilities.dp(26.0f);
        this.f33621n = iDp;
        this.f33622r = iDp;
        this.f33623s = 0;
        this.v = false;
        this.f33624w = 0;
        this.C = 1.0f;
        this.A = n1Var;
        n1Var.a(this);
        setLayerType(1, null);
        paint2.setColor(-1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setColor(-16777216);
        paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
        paint3.setAlpha(35);
    }

    private void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.C, z10 ? 0.8f : 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new f3(this, 0));
        this.B.setDuration(150L);
        this.B.start();
    }

    public final void a(int i10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f33626y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33626y.removeAllUpdateListeners();
            this.f33626y.cancel();
            z11 = false;
        }
        int i11 = this.f33621n;
        if (z11) {
            if (this.f33618c != null) {
                ValueAnimator valueAnimator2 = this.f33626y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f33626y.cancel();
                }
                ValueAnimator valueAnimatorOfInt = z10 ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                this.f33626y = valueAnimatorOfInt;
                valueAnimatorOfInt.addUpdateListener(new f3(this, 1));
                this.f33626y.setDuration(200L);
                this.f33626y.start();
                if (i10 == 2) {
                    this.f33618c.L(0, false, false);
                    this.f33618c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f33626y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f33626y.cancel();
                }
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, i11);
                this.f33626y = valueAnimatorOfInt2;
                if (z10) {
                    this.f33622r = i11;
                    valueAnimatorOfInt2.addUpdateListener(new f3(this, 2));
                    this.f33626y.addListener(new g3(this, 0));
                    this.f33626y.setDuration(200L);
                    this.f33626y.start();
                    this.f33617b.L(0, false, false);
                    this.f33617b.start();
                } else {
                    this.f33623s = i11;
                    valueAnimatorOfInt2.addUpdateListener(new f3(this, 3));
                    this.f33626y.setDuration(200L);
                    this.f33626y.addListener(new g3(this, 1));
                    this.f33626y.start();
                }
            }
        } else if (z10) {
            this.f33623s = i11;
            this.f33622r = 0;
            this.f33624w = 100;
            if (i10 == 3 || i10 == 1) {
                oi0 oi0Var = this.f33617b;
                oi0Var.L(oi0Var.f31312e[0] - 1, false, false);
            }
        } else {
            this.f33623s = 0;
            this.f33622r = i11;
            this.f33624w = 20;
        }
        this.v = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        Path path;
        canvas.save();
        float f10 = this.C;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x8 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        n1 n1Var = this.A;
        int i11 = n1Var.f33741g;
        Paint paint = n1Var.f33743j;
        com.google.firebase.messaging.m mVar = n1Var.f33736a;
        float height2 = (i11 * 1.12f) / ((Bitmap) mVar.f4604c).getHeight();
        float f11 = n1Var.f33741g;
        float f12 = 1.12f * f11;
        float f13 = (f12 - n1Var.f33740f) / 2.0f;
        float f14 = (f12 - f11) / 2.0f;
        float f15 = -x8;
        float f16 = f15 - f13;
        float f17 = -y10;
        mVar.y(f16, f17 - f14, height2, n1Var.h);
        n1Var.f33738c.w(f15, f17, n1Var.f33740f - x8, n1Var.f33741g - y10);
        oi0 oi0Var = this.f33618c;
        Paint paint2 = this.f33619e;
        Paint paint3 = this.d;
        int i12 = this.f33621n;
        if (oi0Var != null) {
            int i13 = this.f33624w;
            if (i13 > 20) {
                Paint paint4 = this.f33620f;
                paint4.setAlpha((int) ((i13 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f33624w * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f33618c.o(canvas, paint3, false, 0L, 0);
                this.f33618c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f18 = i12;
            if (!n1Var.f33742i) {
                paint = (Paint) mVar.f4602a;
            }
            canvas.drawCircle(width, height, f18, paint);
            if (n1Var.f33739e) {
                canvas.drawCircle(width, height, f18, (Paint) n1Var.f33738c.f4602a);
            }
            this.f33618c.draw(canvas);
            return;
        }
        if (this.f33617b == null || this.f33616a == null) {
            return;
        }
        int i14 = this.f33622r;
        boolean z10 = i14 == i12 && this.f33623s == 0;
        int i15 = this.f33623s;
        boolean z11 = i15 == i12 && i14 == 0;
        Path path2 = this.h;
        if (i15 != i12 || i14 <= 0 || i14 == i12) {
            i10 = i12;
            path = path2;
        } else {
            canvas.drawCircle(width, height, i15, paint2);
            canvas.drawCircle(width, height, this.f33622r, paint3);
            this.f33617b.setAlpha(255);
            i10 = i12;
            this.f33617b.o(canvas, paint3, false, 0L, 0);
            this.f33617b.setAlpha(35);
            this.f33617b.draw(canvas);
            path2.reset();
            path = path2;
            path.addCircle(width, height, this.f33622r, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.f33622r, paint3);
        }
        if (z10 || this.f33622r > 0) {
            float f19 = this.f33622r;
            if (!n1Var.f33742i) {
                paint = (Paint) mVar.f4602a;
            }
            canvas.drawCircle(width, height, f19, paint);
            if (n1Var.f33739e) {
                canvas.drawCircle(width, height, this.f33622r, (Paint) n1Var.f33738c.f4602a);
            }
            this.f33616a.draw(canvas);
        }
        if (z11 || (this.f33623s > 0 && this.f33622r == i10)) {
            path.reset();
            path.addCircle(width, height, this.f33623s, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawCircle(width, height, this.f33623s, paint2);
            this.f33617b.setAlpha(255);
            this.f33617b.o(canvas, paint3, false, 0L, 0);
            this.f33617b.setAlpha(35);
            this.f33617b.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h3 h3Var;
        int action = motionEvent.getAction();
        if (action == 0) {
            setPressedBtn(true);
            this.D = motionEvent.getX();
            this.E = motionEvent.getY();
            return true;
        }
        boolean z10 = false;
        if (action == 1) {
            setPressedBtn(false);
            float x8 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = this.D;
            float f11 = this.E;
            float fAbs = Math.abs(f10 - x8);
            float fAbs2 = Math.abs(f11 - y10);
            if (fAbs <= AndroidUtilities.dp(48.0f) && fAbs2 <= AndroidUtilities.dp(48.0f)) {
                int i10 = this.f33622r;
                int i11 = this.f33621n;
                boolean z11 = i10 == i11 && this.f33623s == 0;
                if (this.f33623s == i11 && i10 == 0) {
                    z10 = true;
                }
                if ((z11 || z10) && (h3Var = this.f33625x) != null) {
                    h3Var.d(this);
                }
            }
        } else if (action == 3) {
            setPressedBtn(false);
            return true;
        }
        return true;
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f33625x = h3Var;
    }
}
