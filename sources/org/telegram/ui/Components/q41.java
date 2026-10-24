package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f29802a;
    public final Paint f29803b;
    public Boolean f29804c;
    public final x41 d;

    public q41(x41 x41Var, Context context) {
        super(context);
        this.d = x41Var;
        this.f29802a = new Path();
        Paint paint = new Paint(1);
        this.f29803b = paint;
        paint.setColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
        org.telegram.ui.ActionBar.k6.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        x41 x41Var = this.d;
        boolean z11 = true;
        float K = x41Var.K(true);
        float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.r.a(K / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
        x41Var.f32519x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, K));
        if (K <= AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f29804c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f29804c = Boolean.valueOf(z10);
            Window window = x41Var.getWindow();
            if (z10) {
                v = x41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
            } else {
                v = org.telegram.ui.ActionBar.k6.v(x41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8), 855638016);
            }
            if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                z11 = false;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        FrameLayout frameLayout = x41Var.topBulletinContainer;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - x41Var.topBulletinContainer.getHeight());
        int i10 = AndroidUtilities.statusBarHeight;
        frameLayout.setTranslationY(Math.max(x41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + i10, K) + translationY);
        Path path = this.f29802a;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, K, getWidth(), getHeight() + lerp);
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, this.f29803b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        x41 x41Var = this.d;
        if (x41Var.O != null && x41Var.P != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + x41Var.O.x());
            }
            if (x41Var.O.x() && x41Var.P.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = x41Var.P.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b10);
            }
            if (b10) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        oc.a(this, new ei.o8(9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        x41 x41Var = this.d;
        FrameLayout frameLayout = x41Var.topBulletinContainer;
        frameLayout.setTranslationY(Math.max(x41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, x41Var.K(true)) + ((-frameLayout.getTop()) - x41Var.topBulletinContainer.getHeight()) + f7);
    }

    @Override
    public final void updateColors() {
        try {
            this.f29803b.setColor(this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
