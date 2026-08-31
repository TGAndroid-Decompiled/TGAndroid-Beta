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
public abstract class nb extends FrameLayout {
    public static final o1.i IN_OUT_OFFSET_Y = new hb(0);
    public static final Property<nb, Float> IN_OUT_OFFSET_Y2 = new ih.g("offsetY", 10);
    Drawable background;
    private ih.b blurVisibilityDrawable;
    protected ic bulletin;
    private final List<ib> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    fb delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.g6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public nb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = g6Var;
        setMinimumHeight(AndroidUtilities.dp(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        b();
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        setWillNotDraw(false);
        k7.e6.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(nb nbVar, int i10, int i11) {
        boolean z4;
        boolean z10 = true;
        if (nbVar.wideScreenWidth != i10) {
            nbVar.wideScreenWidth = i10;
            z4 = true;
        } else {
            z4 = false;
        }
        if (nbVar.wideScreenGravity != i11) {
            nbVar.wideScreenGravity = i11;
        } else {
            z10 = z4;
        }
        if (a() && z10) {
            nbVar.b();
        }
    }

    public static boolean access$1400(nb nbVar, boolean z4) {
        nbVar.getClass();
        if (a() && nbVar.wideScreenWidth != -1) {
            int i10 = nbVar.wideScreenGravity;
            if (i10 != 1) {
                if (z4) {
                    if (i10 != 5) {
                        return false;
                    }
                } else if (i10 == 5) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void setInOutOffset(float f10) {
        this.inOutOffset = f10;
        updatePosition();
        ic icVar = this.bulletin;
        if (icVar != null && icVar.f27746k) {
            invalidate();
        }
    }

    public void addCallback(ib ibVar) {
        this.callbacks.add(ibVar);
    }

    public final void b() {
        int i10;
        boolean a2 = a();
        if (a2) {
            i10 = this.wideScreenWidth;
        } else {
            i10 = -1;
        }
        int i11 = 80;
        if (a2) {
            if (this.top) {
                i11 = 48;
            }
            i11 |= this.wideScreenGravity;
        } else if (this.top) {
            i11 = 48;
        }
        setLayoutParams(k7.c6.e(i10, -2, i11));
    }

    public mb createTransition() {
        return new z9.d(15);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ic icVar = this.bulletin;
        if (icVar != null && icVar.f27746k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new ih.b(new t(this, 16));
            }
            ih.b bVar = this.blurVisibilityDrawable;
            if (bVar.f8108c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
            }
            this.blurVisibilityDrawable.f8112i = k7.o.b((int) org.telegram.ui.b.c(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z4, int i10) {
        fb fbVar;
        boolean z10;
        boolean z11;
        float dp;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i10 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (fbVar = this.delegate) != null) {
                float h = fbVar.h(this.bulletin.f27738a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z4 && this.delegate.g(this.bulletin.f27738a)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canvas2.save();
                if (!z4) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z10 && i10 == 255) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
                }
                this.background.draw(canvas2);
                super.dispatchDraw(canvas);
                if (z10) {
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
                    Matrix matrix2 = this.clipMatrix;
                    if (this.top) {
                        dp = h;
                    } else {
                        dp = measuredHeight - AndroidUtilities.dp(8.0f);
                    }
                    matrix2.postTranslate(0.0f, dp);
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas2.drawRect(0.0f, h, getWidth(), h + AndroidUtilities.dp(8.0f), this.clipPaint);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, measuredHeight - AndroidUtilities.dp(8.0f), getWidth(), measuredHeight, this.clipPaint);
                    }
                    canvas2.restore();
                }
                if (z11) {
                    canvas2.restore();
                }
                canvas2.restore();
                invalidate();
                return;
            }
            this.background.draw(canvas2);
            super.dispatchDraw(canvas);
        }
    }

    public void dispatchDrawImplBlur(Canvas canvas, int i10) {
        dispatchDrawImpl(canvas, true, i10);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i10;
        int f10;
        fb fbVar;
        ic icVar;
        o1.j jVar;
        if (this.bulletin != null && (((fbVar = this.delegate) == null || fbVar.e()) && (jVar = (icVar = this.bulletin).d) != null && jVar.f16330f)) {
            f10 = icVar.f27750o;
        } else {
            fb fbVar2 = this.delegate;
            if (fbVar2 != null) {
                ic icVar2 = this.bulletin;
                if (icVar2 != null) {
                    i10 = icVar2.f27738a;
                } else {
                    i10 = 0;
                }
                f10 = fbVar2.f(i10);
            } else {
                return 0.0f;
            }
        }
        return f10;
    }

    public ic getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i10;
        fb fbVar = this.delegate;
        if (fbVar != null) {
            ic icVar = this.bulletin;
            if (icVar != null) {
                i10 = icVar.f27738a;
            } else {
                i10 = 0;
            }
            return fbVar.h(i10);
        }
        return 0.0f;
    }

    public boolean isAttachedToBulletin() {
        if (this.bulletin != null) {
            return true;
        }
        return false;
    }

    public boolean isTransitionRunning() {
        if (!this.transitionRunningEnter && !this.transitionRunningExit) {
            return false;
        }
        return true;
    }

    public void onAttach(ic icVar) {
        this.bulletin = icVar;
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).a(icVar);
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
        ih.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f8108c) != null) {
            bitmap.recycle();
            bVar.f8108c = null;
        }
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

    public void removeCallback(ib ibVar) {
        this.callbacks.remove(ibVar);
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

    public void setTop(boolean z4) {
        if (this.top != z4) {
            this.top = z4;
            b();
        }
    }

    public void updatePosition() {
        int i10;
        int i11;
        fb fbVar = this.delegate;
        float f10 = 0.0f;
        if (fbVar != null) {
            if (this.top) {
                ic icVar = this.bulletin;
                if (icVar != null) {
                    i11 = icVar.f27738a;
                } else {
                    i11 = 0;
                }
                f10 = 0.0f - fbVar.h(i11);
            } else {
                f10 = 0.0f + getBottomOffset();
            }
        }
        float f11 = -f10;
        float f12 = this.inOutOffset;
        if (this.top) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        setTranslationY((f12 * i10) + f11);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (this.background != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setBackground(int i10, int i11) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(i11), i10);
    }
}
