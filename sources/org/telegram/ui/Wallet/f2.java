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
import org.telegram.ui.Components.is;
public final class f2 extends FrameLayout {
    public final org.telegram.ui.Components.g6 f34944a;
    public final Paint f34945b;
    public final Path f34946c;
    public float d;
    public final i2 f34947e;

    public f2(i2 i2Var, Context context) {
        super(context);
        this.f34947e = i2Var;
        this.f34944a = new org.telegram.ui.Components.g6(this, 250L, is.h);
        Paint paint = new Paint(1);
        this.f34945b = paint;
        this.f34946c = new Path();
        setWillNotDraw(false);
        paint.setColor(i2Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int themedColor;
        int i10;
        int i11;
        ViewGroup viewGroup;
        int i12;
        float f7;
        i2 i2Var = this.f34947e;
        Integer num = i2Var.f35074f;
        if (num != null) {
            themedColor = num.intValue();
        } else {
            themedColor = i2Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5);
        }
        Paint paint = this.f34945b;
        paint.setColor(themedColor);
        View[] viewPages = i2Var.f35071b.getViewPages();
        float f10 = 0.0f;
        this.d = 0.0f;
        for (View view : viewPages) {
            if (view != null) {
                float clamp = Utilities.clamp(1.0f - Math.abs(view.getTranslationX() / Math.max(1, view.getMeasuredWidth())), 1.0f, 0.0f);
                float f11 = this.d;
                boolean z10 = view instanceof g2;
                if (z10) {
                    h2 h2Var = (h2) ((g2) view);
                    f7 = Math.max(0.0f, h2Var.getHeight() - h2Var.f35046a.getMeasuredHeight());
                } else {
                    f7 = 0.0f;
                }
                this.d = (f7 * clamp) + f11;
                if (view.getVisibility() == 0 && z10) {
                    g2 g2Var = (g2) view;
                }
            }
        }
        if (this.d <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        }
        float d = this.f34944a.d(f10, false);
        this.d = Math.max(AndroidUtilities.statusBarHeight, this.d) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) i2Var).backgroundPaddingLeft;
        float f12 = this.d;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) i2Var).backgroundPaddingLeft;
        rectF.set(i10, f12, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (i2Var.topBulletinContainer != null) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) i2Var).containerView;
            float y3 = viewGroup.getY() + this.d;
            i12 = ((org.telegram.ui.ActionBar.f3) i2Var).backgroundPaddingTop;
            i2Var.topBulletinContainer.setTranslationY(Math.max(y3 + i12, i2Var.topBulletinContainer.getHeight() + (AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight)) - i2Var.topBulletinContainer.getBottom());
        }
        canvas.save();
        Path path = this.f34946c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.d) {
            this.f34947e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        i2 i2Var = this.f34947e;
        FrameLayout frameLayout = i2Var.f35073e;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i12 = i2Var.f35073e.getMeasuredHeight();
        } else {
            i12 = 0;
        }
        i2Var.f35071b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, size2 - i12), 1073741824));
        setMeasuredDimension(size, size2);
    }
}
