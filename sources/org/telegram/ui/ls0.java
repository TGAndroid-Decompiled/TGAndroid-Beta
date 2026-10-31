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
public final class ls0 extends org.telegram.ui.Components.tk0 {
    public final int f39377e3 = 0;
    public final Paint f39378f3;
    public final Object f39379g3;
    public final Object f39380h3;

    public ls0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f39378f3 = paint;
        this.f39380h3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-org.telegram.messenger.i0.L(10.0f));
        ks0 ks0Var = new ks0(this);
        setItemAnimator(ks0Var);
        ks0Var.C = false;
        ks0Var.f47927m = false;
        setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
        paint.setColor(2130706432);
        this.f39379g3 = context.getResources().getDrawable(2131232528).mutate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39377e3) {
            case 1:
                Path path = (Path) this.f39379g3;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false);
                Paint paint = this.f39378f3;
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
        switch (this.f39377e3) {
            case 1:
                if (((du0) this.f39380h3).f36836n.f33709q0 >= 1.0f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f39377e3) {
            case 0:
                RectF rectF = (RectF) this.f39380h3;
                Drawable drawable = (Drawable) this.f39379g3;
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
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f39378f3);
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
        switch (this.f39377e3) {
            case 1:
                if (((du0) this.f39380h3).f36836n.f33709q0 >= 1.0f) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39377e3) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                PremiumPreviewFragment premiumPreviewFragment = ((du0) this.f39380h3).f36836n;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = premiumPreviewFragment.d;
                    if (i14 < arrayList.size()) {
                        premiumPreviewFragment.M.a((fu0) arrayList.get(i14), false);
                        premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                        ((fu0) arrayList.get(i14)).h = i15;
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

    public ls0(du0 du0Var, Context context) {
        super(context, null);
        this.f39380h3 = du0Var;
        Paint paint = new Paint(1);
        this.f39378f3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false));
        this.f39379g3 = new Path();
    }
}
