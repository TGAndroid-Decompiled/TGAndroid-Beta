package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class ks0 extends org.telegram.ui.Components.uk0 {
    public final int f38967e3 = 0;
    public final Paint f38968f3;
    public final Object f38969g3;
    public final Object f38970h3;

    public ks0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f38968f3 = paint;
        this.f38970h3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        js0 js0Var = new js0(this);
        setItemAnimator(js0Var);
        js0Var.C = false;
        js0Var.f47938m = false;
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
        paint.setColor(2130706432);
        this.f38969g3 = context.getResources().getDrawable(2131232528).mutate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38967e3) {
            case 1:
                Path path = (Path) this.f38969g3;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false);
                Paint paint = this.f38968f3;
                paint.setColor(x02);
                canvas.drawPath(path, paint);
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f38967e3) {
            case 1:
                if (((cu0) this.f38970h3).f36413n.f33716q0 >= 1.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38967e3) {
            case 0:
                RectF rectF = (RectF) this.f38970h3;
                Drawable drawable = (Drawable) this.f38969g3;
                super.onDraw(canvas);
                int childCount = getChildCount();
                if (childCount > 0) {
                    int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(87.0f);
                    drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.messenger.i0.L(6.0f));
                    drawable.draw(canvas);
                    int i10 = Integer.MIN_VALUE;
                    int i11 = Integer.MAX_VALUE;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = getChildAt(i12);
                        i11 = (int) Math.min(i11, Math.floor(childAt.getX()));
                        i10 = (int) Math.max(i10, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                    }
                    if (i11 != Integer.MAX_VALUE && i10 != Integer.MIN_VALUE) {
                        rectF.set(i11 - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f) + i10, org.telegram.messenger.i0.L(103.0f));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f38968f3);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f38967e3) {
            case 1:
                if (((cu0) this.f38970h3).f36413n.f33716q0 >= 1.0f) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f38967e3) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                PremiumPreviewFragment premiumPreviewFragment = ((cu0) this.f38970h3).f36413n;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = premiumPreviewFragment.d;
                    if (i14 < arrayList.size()) {
                        premiumPreviewFragment.M.a((eu0) arrayList.get(i14), false);
                        premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                        ((eu0) arrayList.get(i14)).h = i15;
                        i15 += premiumPreviewFragment.M.getMeasuredHeight();
                        i14++;
                    } else {
                        premiumPreviewFragment.O = i15;
                        return;
                    }
                }
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    public ks0(cu0 cu0Var, Context context) {
        super(context, null);
        this.f38970h3 = cu0Var;
        Paint paint = new Paint(1);
        this.f38968f3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
        this.f38969g3 = new Path();
    }
}
