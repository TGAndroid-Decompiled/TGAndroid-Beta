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
public final class r41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Path f30082a;
    public final Paint f30083b;
    public Boolean f30084c;
    public final y41 d;

    public r41(y41 y41Var, Context context) {
        super(context);
        this.d = y41Var;
        this.f30082a = new Path();
        Paint paint = new Paint(1);
        this.f30083b = paint;
        paint.setColor(y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5));
        org.telegram.ui.ActionBar.k6.m(paint);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        y41 y41Var = this.d;
        boolean z11 = true;
        float K = y41Var.K(true);
        float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.r.a(K / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
        y41Var.f32814x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, K));
        if (K <= AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f30084c;
        if (bool == null || bool.booleanValue() != z10) {
            this.f30084c = Boolean.valueOf(z10);
            Window window = y41Var.getWindow();
            if (z10) {
                v = y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5);
            } else {
                v = org.telegram.ui.ActionBar.k6.v(y41Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21462s8), 855638016);
            }
            if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                z11 = false;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        FrameLayout frameLayout = y41Var.topBulletinContainer;
        float translationY = getTranslationY() + ((-frameLayout.getTop()) - y41Var.topBulletinContainer.getHeight());
        int i10 = AndroidUtilities.statusBarHeight;
        frameLayout.setTranslationY(Math.max(y41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + i10, K) + translationY);
        Path path = this.f30082a;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, K, getWidth(), getHeight() + lerp);
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.drawPath(path, this.f30083b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        y41 y41Var = this.d;
        if (y41Var.O != null && y41Var.P != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + y41Var.O.x());
            }
            if (y41Var.O.x() && y41Var.P.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b10 = y41Var.P.b(motionEvent);
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
        qc.a(this, new ei.o8(9));
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
        y41 y41Var = this.d;
        FrameLayout frameLayout = y41Var.topBulletinContainer;
        frameLayout.setTranslationY(Math.max(y41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, y41Var.K(true)) + ((-frameLayout.getTop()) - y41Var.topBulletinContainer.getHeight()) + f7);
    }

    @Override
    public final void updateColors() {
        try {
            this.f30083b.setColor(this.d.getThemedColor(org.telegram.ui.ActionBar.k6.f21254h5));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
