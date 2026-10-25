package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ds;
public final class t3 extends TextView implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.Components.r5 f25435a;
    public final Paint f25436b;
    public final Path f25437c;
    public final RectF d;
    public ValueAnimator e;
    public float f25438f;
    public float h;
    public float f25439n;
    public boolean f25440r;
    public int f25441s;
    public final u3 v;

    public t3(u3 u3Var, Context context) {
        super(context);
        this.v = u3Var;
        this.f25436b = new Paint(1);
        this.f25437c = new Path();
        this.d = new RectF();
        this.h = -1.0f;
        int dp = AndroidUtilities.dp(14.0f);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, u3Var.f25475a));
        setForeground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o12, o12));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && isSelected() == z10) {
            return;
        }
        setSelected(z10);
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f25438f = f7;
            b();
            invalidate();
            return;
        }
        float f10 = this.f25438f;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.e = ofFloat;
        ofFloat.setDuration(280L);
        this.e.setInterpolator(ds.h);
        this.e.addUpdateListener(new r(this, 3));
        this.e.start();
    }

    public final void b() {
        this.f25440r = true;
        int i10 = org.telegram.ui.ActionBar.y6.f23538n6;
        u3 u3Var = this.v;
        int f7 = i0.a.f(this.f25438f, org.telegram.ui.ActionBar.y6.w0(i10, u3Var.f25475a), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u3Var.f25475a));
        if (getCurrentTextColor() != f7) {
            setTextColor(f7);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.r5 r5Var = this.f25435a;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        float f7;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (isSelected()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f25438f = f7;
        b();
        org.telegram.ui.Components.r5 r5Var = this.f25435a;
        if (r5Var != null) {
            r5Var.b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, this.v.f25475a);
        RectF rectF = this.d;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.f25437c;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), direction);
        canvas.save();
        canvas.clipPath(path);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.1f, w02);
        Paint paint = this.f25436b;
        paint.setColor(o12);
        canvas.drawRect(rectF, paint);
        if (this.f25438f > 0.0f) {
            float f10 = this.h;
            if (f10 < 0.0f) {
                f10 = getWidth() / 2.0f;
            }
            if (this.h < 0.0f) {
                f7 = getHeight() / 2.0f;
            } else {
                f7 = this.f25439n;
            }
            path.rewind();
            path.addCircle(f10, f7, ((float) Math.hypot(Math.max(f10, getWidth() - f10), Math.max(f7, getHeight() - f7))) * this.f25438f, direction);
            canvas.clipPath(path);
            paint.setColor(w02);
            canvas.drawRect(rectF, paint);
        }
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.h = motionEvent.getX();
            this.f25439n = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f25440r) {
                b();
            }
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23538n6, this.v.f25475a));
            if (o12 != this.f25441s) {
                this.f25441s = o12;
                org.telegram.ui.ActionBar.y6.E1(getForeground(), o12, true);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25435a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
