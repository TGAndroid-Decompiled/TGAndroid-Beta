package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
public final class e2 extends FrameLayout {
    public final org.telegram.ui.Components.g6 f34851a;
    public final Paint f34852b;
    public final Path f34853c;
    public float d;
    public final h2 f34854e;

    public e2(h2 h2Var, Context context) {
        super(context);
        this.f34854e = h2Var;
        this.f34851a = new org.telegram.ui.Components.g6(this, 250L, hs.h);
        Paint paint = new Paint(1);
        this.f34852b = paint;
        this.f34853c = new Path();
        setWillNotDraw(false);
        paint.setColor(h2Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int themedColor;
        int i10;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f7;
        h2 h2Var = this.f34854e;
        Integer num = h2Var.f34983f;
        if (num != null) {
            themedColor = num.intValue();
        } else {
            themedColor = h2Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5);
        }
        Paint paint = this.f34852b;
        paint.setColor(themedColor);
        View[] viewPages = h2Var.f34980b.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float clamp = Utilities.clamp(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof f2;
                if (z10) {
                    g2 g2Var = (g2) ((f2) view);
                    f7 = Math.max(0.0f, g2Var.getHeight() - g2Var.f34957a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * clamp) + f11;
                if (view.getVisibility() == 0 && z10) {
                    f2 f2Var = (f2) view;
                }
            }
        }
        if (this.d <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        }
        float d = this.f34851a.d(f10, false);
        this.d = Math.max(AndroidUtilities.statusBarHeight, this.d) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingLeft;
        float f12 = this.d;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingLeft;
        rectF.set(i10, f12, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (h2Var.topBulletinContainer != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) h2Var).containerView;
            float y3 = viewGroup.getY() + this.d;
            i12 = ((org.telegram.ui.ActionBar.f3) h2Var).backgroundPaddingTop;
            h2Var.topBulletinContainer.setTranslationY(Math.max(y3 + i12, h2Var.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - h2Var.topBulletinContainer.getBottom());
        }
        canvas.save();
        Path path = this.f34853c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f34854e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        h2 h2Var = this.f34854e;
        FrameLayout frameLayout = h2Var.f34982e;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = h2Var.f34982e.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        h2Var.f34980b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
