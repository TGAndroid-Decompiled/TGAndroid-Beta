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
public final class z41 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final Path f35235a;
    public final Paint f35236b;
    public Boolean f35237c;
    public final g51 d;

    public z41(g51 g51Var, Context context) {
        super(context);
        this.d = g51Var;
        this.f35235a = new Path();
        Paint paint = new Paint(1);
        this.f35236b = paint;
        paint.setColor(g51Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
        org.telegram.ui.ActionBar.y6.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        g51 g51Var = this.d;
        boolean z11 = true;
        float K = g51Var.K(true);
        float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), a8.ee.a(K / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
        g51Var.f28405x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, K));
        if (K <= AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f35237c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f35237c = Boolean.valueOf(z10);
            Window window = g51Var.getWindow();
            if (z10) {
                v = g51Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
            } else {
                v = org.telegram.ui.ActionBar.y6.v(g51Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8), 855638016);
            }
            if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                z11 = false;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        FrameLayout frameLayout = g51Var.topBulletinContainer;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - g51Var.topBulletinContainer.getHeight());
        int i10 = AndroidUtilities.statusBarHeight;
        frameLayout.setTranslationY(Math.max(g51Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + i10, K) + translationY);
        Path path = this.f35235a;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, K, getWidth(), getHeight() + lerp);
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, this.f35236b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g51 g51Var = this.d;
        if (g51Var.O != null && g51Var.P != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + g51Var.O.x());
            }
            if (g51Var.O.x() && g51Var.P.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = g51Var.P.b(motionEvent);
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
        qc.a(this, new fi.k8(8));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        g51 g51Var = this.d;
        FrameLayout frameLayout = g51Var.topBulletinContainer;
        frameLayout.setTranslationY(Math.max(g51Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, g51Var.K(true)) + ((-frameLayout.getTop()) - g51Var.topBulletinContainer.getHeight()) + f7);
    }

    @Override
    public final void updateColors() {
        try {
            this.f35236b.setColor(this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
