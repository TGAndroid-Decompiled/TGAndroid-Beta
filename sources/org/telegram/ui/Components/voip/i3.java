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
import org.telegram.ui.Components.mi0;
public final class i3 extends View {
    public final n1 A;
    public ValueAnimator B;
    public float C;
    public float D;
    public float E;
    public mi0 f33566a;
    public mi0 f33567b;
    public mi0 f33568c;
    public final Paint d;
    public final Paint f33569e;
    public final Paint f33570f;
    public final Path h;
    public final int f33571n;
    public int f33572r;
    public int f33573s;
    public boolean v;
    public int f33574w;
    public h3 f33575x;
    public ValueAnimator f33576y;

    public i3(Context context, n1 n1Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f33569e = paint2;
        Paint paint3 = new Paint(1);
        this.f33570f = paint3;
        this.h = new Path();
        int dp = AndroidUtilities.dp(26.0f);
        this.f33571n = dp;
        this.f33572r = dp;
        this.f33573s = 0;
        this.v = false;
        this.f33574w = 0;
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
        float f10;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = this.C;
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new f3(this, 0));
        this.B.setDuration(150L);
        this.B.start();
    }

    public final void a(int i9, boolean z10, boolean z11) {
        ValueAnimator ofInt;
        ValueAnimator valueAnimator = this.f33576y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33576y.removeAllUpdateListeners();
            this.f33576y.cancel();
            z11 = false;
        }
        int i10 = this.f33571n;
        if (z11) {
            if (this.f33568c != null) {
                ValueAnimator valueAnimator2 = this.f33576y;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                    this.f33576y.cancel();
                }
                if (z10) {
                    ofInt = ValueAnimator.ofInt(20, 100);
                } else {
                    ofInt = ValueAnimator.ofInt(100, 20);
                }
                this.f33576y = ofInt;
                ofInt.addUpdateListener(new f3(this, 1));
                this.f33576y.setDuration(200L);
                this.f33576y.start();
                if (i9 == 2) {
                    this.f33568c.L(0, false, false);
                    this.f33568c.start();
                }
            } else {
                ValueAnimator valueAnimator3 = this.f33576y;
                if (valueAnimator3 != null) {
                    valueAnimator3.removeAllUpdateListeners();
                    this.f33576y.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, i10);
                this.f33576y = ofInt2;
                if (z10) {
                    this.f33572r = i10;
                    ofInt2.addUpdateListener(new f3(this, 2));
                    this.f33576y.addListener(new g3(this, 0));
                    this.f33576y.setDuration(200L);
                    this.f33576y.start();
                    this.f33567b.L(0, false, false);
                    this.f33567b.start();
                } else {
                    this.f33573s = i10;
                    ofInt2.addUpdateListener(new f3(this, 3));
                    this.f33576y.setDuration(200L);
                    this.f33576y.addListener(new g3(this, 1));
                    this.f33576y.start();
                }
            }
        } else if (z10) {
            this.f33573s = i10;
            this.f33572r = 0;
            this.f33574w = 100;
            if (i9 == 3 || i9 == 1) {
                mi0 mi0Var = this.f33567b;
                mi0Var.L(mi0Var.f30847e[0] - 1, false, false);
            }
        } else {
            this.f33573s = 0;
            this.f33572r = i10;
            this.f33574w = 20;
        }
        this.v = z10;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        int i9;
        Path path;
        int i10;
        canvas.save();
        float f10 = this.C;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) ((View) getParent()).getParent()).getY() + getY();
        n1 n1Var = this.A;
        int i11 = n1Var.f33691g;
        Paint paint = n1Var.f33693j;
        com.google.firebase.messaging.m mVar = n1Var.f33686a;
        float f11 = n1Var.f33691g;
        float f12 = 1.12f * f11;
        float f13 = -x10;
        float f14 = -y10;
        mVar.y(f13 - ((f12 - n1Var.f33690f) / 2.0f), f14 - ((f12 - f11) / 2.0f), (i11 * 1.12f) / ((Bitmap) mVar.f4162c).getHeight(), n1Var.h);
        n1Var.f33688c.w(f13, f14, n1Var.f33690f - x10, n1Var.f33691g - y10);
        mi0 mi0Var = this.f33568c;
        Paint paint2 = this.f33569e;
        Paint paint3 = this.d;
        int i12 = this.f33571n;
        if (mi0Var != null) {
            if (this.f33574w > 20) {
                Paint paint4 = this.f33570f;
                paint4.setAlpha((int) ((i10 * 35) / 100.0f));
                paint2.setAlpha((int) ((this.f33574w * 255) / 100.0f));
                canvas.drawCircle(width, height, i12, paint2);
                this.f33568c.o(canvas, paint3, false, 0L, 0);
                this.f33568c.o(canvas, paint4, false, 0L, 0);
                return;
            }
            float f15 = i12;
            if (!n1Var.f33692i) {
                paint = (Paint) mVar.f4160a;
            }
            canvas.drawCircle(width, height, f15, paint);
            if (n1Var.f33689e) {
                canvas.drawCircle(width, height, f15, (Paint) n1Var.f33688c.f4160a);
            }
            this.f33568c.draw(canvas);
        } else if (this.f33567b != null && this.f33566a != null) {
            int i13 = this.f33572r;
            if (i13 == i12 && this.f33573s == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i14 = this.f33573s;
            if (i14 == i12 && i13 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Path path2 = this.h;
            if (i14 == i12 && i13 > 0 && i13 != i12) {
                canvas.drawCircle(width, height, i14, paint2);
                canvas.drawCircle(width, height, this.f33572r, paint3);
                this.f33567b.setAlpha(255);
                i9 = i12;
                this.f33567b.o(canvas, paint3, false, 0L, 0);
                this.f33567b.setAlpha(35);
                this.f33567b.draw(canvas);
                path2.reset();
                path = path2;
                path.addCircle(width, height, this.f33572r, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f33572r, paint3);
            } else {
                i9 = i12;
                path = path2;
            }
            if (z10 || this.f33572r > 0) {
                float f16 = this.f33572r;
                if (!n1Var.f33692i) {
                    paint = (Paint) mVar.f4160a;
                }
                canvas.drawCircle(width, height, f16, paint);
                if (n1Var.f33689e) {
                    canvas.drawCircle(width, height, this.f33572r, (Paint) n1Var.f33688c.f4160a);
                }
                this.f33566a.draw(canvas);
            }
            if (z11 || (this.f33573s > 0 && this.f33572r == i9)) {
                path.reset();
                path.addCircle(width, height, this.f33573s, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.drawCircle(width, height, this.f33573s, paint2);
                this.f33567b.setAlpha(255);
                this.f33567b.o(canvas, paint3, false, 0L, 0);
                this.f33567b.setAlpha(35);
                this.f33567b.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h3 h3Var;
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z11 = false;
            if (action != 1) {
                if (action == 3) {
                    setPressedBtn(false);
                    return true;
                }
            } else {
                setPressedBtn(false);
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = this.D;
                float f11 = this.E;
                float abs = Math.abs(f10 - x10);
                float abs2 = Math.abs(f11 - y10);
                if (abs <= AndroidUtilities.dp(48.0f) && abs2 <= AndroidUtilities.dp(48.0f)) {
                    int i9 = this.f33572r;
                    int i10 = this.f33571n;
                    if (i9 == i10 && this.f33573s == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f33573s == i10 && i9 == 0) {
                        z11 = true;
                    }
                    if ((z10 || z11) && (h3Var = this.f33575x) != null) {
                        h3Var.d(this);
                    }
                }
            }
            return true;
        }
        setPressedBtn(true);
        this.D = motionEvent.getX();
        this.E = motionEvent.getY();
        return true;
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.f33575x = h3Var;
    }
}
