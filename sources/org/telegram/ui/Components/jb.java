package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;

public abstract class jb extends FrameLayout {
    public static final o1.i IN_OUT_OFFSET_Y = new fb(0);
    public static final Property<jb, Float> IN_OUT_OFFSET_Y2 = new dh.g("offsetY", 10);
    Drawable background;
    private dh.b blurVisibilityDrawable;
    protected ec bulletin;
    private final List<gb> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    db delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public jb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = c6Var;
        setMinimumHeight(AndroidUtilities.dp(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        b();
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        setWillNotDraw(false);
        h7.b6.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (AndroidUtilities.isTablet()) {
            return true;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x >= point.y;
    }

    public static void access$000(jb jbVar, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (jbVar.wideScreenWidth != i10) {
            jbVar.wideScreenWidth = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (jbVar.wideScreenGravity != i11) {
            jbVar.wideScreenGravity = i11;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            jbVar.b();
        }
    }

    public static boolean access$1400(jb jbVar, boolean z10) {
        jbVar.getClass();
        if (!a() || jbVar.wideScreenWidth == -1) {
            return false;
        }
        int i10 = jbVar.wideScreenGravity;
        if (i10 != 1) {
            if (z10) {
                if (i10 != 5) {
                    return false;
                }
            } else if (i10 == 5) {
                return false;
            }
        }
        return true;
    }

    public void setInOutOffset(float f10) {
        this.inOutOffset = f10;
        updatePosition();
        ec ecVar = this.bulletin;
        if (ecVar == null || !ecVar.f28021k) {
            return;
        }
        invalidate();
    }

    public void addCallback(gb gbVar) {
        this.callbacks.add(gbVar);
    }

    public final void b() {
        boolean zA = a();
        int i10 = zA ? this.wideScreenWidth : -1;
        int i11 = 80;
        if (zA) {
            i11 = (this.top ? 48 : 80) | this.wideScreenGravity;
        } else if (this.top) {
            i11 = 48;
        }
        setLayoutParams(h7.z5.e(i10, -2, i11));
    }

    public ib createTransition() {
        return new w9.d(18);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ec ecVar = this.bulletin;
        if (ecVar == null || !ecVar.f28021k) {
            dispatchDrawImpl(canvas, false, 255);
            return;
        }
        if (this.blurVisibilityDrawable == null) {
            this.blurVisibilityDrawable = new dh.b(new s(this, 16));
        }
        dh.b bVar = this.blurVisibilityDrawable;
        if (bVar.f4971c == null) {
            bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
        }
        this.blurVisibilityDrawable.f4975i = h7.n.b((int) org.telegram.messenger.rl.t(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
        this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.blurVisibilityDrawable.draw(canvas);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i10) {
        db dbVar;
        Canvas canvas2 = canvas;
        if (this.bulletin == null || i10 == 0) {
            return;
        }
        this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
        if (!isTransitionRunning() || (dbVar = this.delegate) == null) {
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
            return;
        }
        float fH = dbVar.h(this.bulletin.f28013a) - getY();
        float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
        boolean z11 = !z10 && this.delegate.g(this.bulletin.f28013a);
        canvas2.save();
        if (!z10) {
            canvas2.clipRect(0.0f, fH, getMeasuredWidth(), measuredHeight);
        }
        boolean z12 = z11 || i10 != 255;
        if (z12) {
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
        }
        this.background.draw(canvas2);
        super.dispatchDraw(canvas);
        if (z11) {
            if (this.clipPaint == null) {
                Paint paint = new Paint(1);
                this.clipPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                this.clipMatrix = matrix;
                this.clipGradient.setLocalMatrix(matrix);
                this.clipPaint.setShader(this.clipGradient);
            }
            canvas2.save();
            this.clipMatrix.reset();
            this.clipMatrix.postTranslate(0.0f, this.top ? fH : measuredHeight - AndroidUtilities.dp(8.0f));
            this.clipGradient.setLocalMatrix(this.clipMatrix);
            if (this.top) {
                canvas2.drawRect(0.0f, fH, getWidth(), fH + AndroidUtilities.dp(8.0f), this.clipPaint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - AndroidUtilities.dp(8.0f), getWidth(), measuredHeight, this.clipPaint);
            }
            canvas2.restore();
        }
        if (z12) {
            canvas2.restore();
        }
        canvas2.restore();
        invalidate();
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i10) {
        dispatchDrawImpl(canvas, true, i10);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int iF;
        db dbVar;
        ec ecVar;
        o1.j jVar;
        if (this.bulletin == null || !(((dbVar = this.delegate) == null || dbVar.e()) && (jVar = (ecVar = this.bulletin).d) != null && jVar.f19141f)) {
            db dbVar2 = this.delegate;
            if (dbVar2 == null) {
                return 0.0f;
            }
            ec ecVar2 = this.bulletin;
            iF = dbVar2.f(ecVar2 != null ? ecVar2.f28013a : 0);
        } else {
            iF = ecVar.f28025o;
        }
        return iF;
    }

    public ec getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider);
    }

    public float getTopOffset() {
        db dbVar = this.delegate;
        if (dbVar == null) {
            return 0.0f;
        }
        ec ecVar = this.bulletin;
        return dbVar.h(ecVar != null ? ecVar.f28013a : 0);
    }

    public boolean isAttachedToBulletin() {
        return this.bulletin != null;
    }

    public boolean isTransitionRunning() {
        return this.transitionRunningEnter || this.transitionRunningExit;
    }

    public void onAttach(ec ecVar) {
        this.bulletin = ecVar;
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).a(ecVar);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onDetach() {
        Bitmap bitmap;
        this.bulletin = null;
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).b();
        }
        dh.b bVar = this.blurVisibilityDrawable;
        if (bVar == null || (bitmap = bVar.f4971c) == null) {
            return;
        }
        bitmap.recycle();
        bVar.f4971c = null;
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).c();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).d();
        }
    }

    public void removeCallback(gb gbVar) {
        this.callbacks.remove(gbVar);
    }

    public void setBackground(int i10) {
        setBackground(i10, 16);
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setTop(boolean z10) {
        if (this.top != z10) {
            this.top = z10;
            b();
        }
    }

    public void updatePosition() {
        db dbVar = this.delegate;
        float bottomOffset = 0.0f;
        if (dbVar != null) {
            if (this.top) {
                ec ecVar = this.bulletin;
                bottomOffset = 0.0f - dbVar.h(ecVar != null ? ecVar.f28013a : 0);
            } else {
                bottomOffset = 0.0f + getBottomOffset();
            }
        }
        setTranslationY((this.inOutOffset * (this.top ? -1 : 1)) + (-bottomOffset));
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return this.background == drawable || super.verifyDrawable(drawable);
    }

    public void setBackground(int i10, int i11) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(i11), i10);
    }
}
