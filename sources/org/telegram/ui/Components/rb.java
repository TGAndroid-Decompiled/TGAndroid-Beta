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
public abstract class rb extends FrameLayout {
    public static final o1.j IN_OUT_OFFSET_Y = new mb(0);
    public static final Property<rb, Float> IN_OUT_OFFSET_Y2 = new fh.g("offsetY", 10);
    Drawable background;
    private fh.b blurVisibilityDrawable;
    protected mc bulletin;
    private final List<nb> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    kb delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.c6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public rb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        i7.h6.b(this, 0.02f, 1.5f);
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

    public static void access$000(rb rbVar, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (rbVar.wideScreenWidth != i10) {
            rbVar.wideScreenWidth = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (rbVar.wideScreenGravity != i11) {
            rbVar.wideScreenGravity = i11;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            rbVar.b();
        }
    }

    public static boolean access$1400(rb rbVar, boolean z10) {
        rbVar.getClass();
        if (a() && rbVar.wideScreenWidth != -1) {
            int i10 = rbVar.wideScreenGravity;
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
        return false;
    }

    public void setInOutOffset(float f9) {
        this.inOutOffset = f9;
        updatePosition();
        mc mcVar = this.bulletin;
        if (mcVar != null && mcVar.f30653k) {
            invalidate();
        }
    }

    public void addCallback(nb nbVar) {
        this.callbacks.add(nbVar);
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
        setLayoutParams(i7.f6.e(i10, -2, i11));
    }

    public qb createTransition() {
        return new ab.b(17);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        mc mcVar = this.bulletin;
        if (mcVar != null && mcVar.f30653k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new fh.b(new u(this, 16));
            }
            fh.b bVar = this.blurVisibilityDrawable;
            if (bVar.f6766c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
            }
            this.blurVisibilityDrawable.f6770i = i7.w.b((int) org.telegram.ui.b.c(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i10) {
        kb kbVar;
        boolean z11;
        boolean z12;
        float dp;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i10 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (kbVar = this.delegate) != null) {
                float h = kbVar.h(this.bulletin.f30645a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z10 && this.delegate.g(this.bulletin.f30645a)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                canvas2.save();
                if (!z10) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z11 && i10 == 255) {
                    z12 = false;
                } else {
                    z12 = true;
                }
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
                if (z12) {
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
        int f9;
        kb kbVar;
        mc mcVar;
        o1.k kVar;
        if (this.bulletin != null && (((kbVar = this.delegate) == null || kbVar.e()) && (kVar = (mcVar = this.bulletin).d) != null && kVar.f19039f)) {
            f9 = mcVar.f30657o;
        } else {
            kb kbVar2 = this.delegate;
            if (kbVar2 != null) {
                mc mcVar2 = this.bulletin;
                if (mcVar2 != null) {
                    i10 = mcVar2.f30645a;
                } else {
                    i10 = 0;
                }
                f9 = kbVar2.f(i10);
            } else {
                return 0.0f;
            }
        }
        return f9;
    }

    public mc getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i10;
        kb kbVar = this.delegate;
        if (kbVar != null) {
            mc mcVar = this.bulletin;
            if (mcVar != null) {
                i10 = mcVar.f30645a;
            } else {
                i10 = 0;
            }
            return kbVar.h(i10);
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

    public void onAttach(mc mcVar) {
        this.bulletin = mcVar;
        int size = this.callbacks.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.callbacks.get(i10).a(mcVar);
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
        fh.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f6766c) != null) {
            bitmap.recycle();
            bVar.f6766c = null;
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

    public void removeCallback(nb nbVar) {
        this.callbacks.remove(nbVar);
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
        int i10;
        int i11;
        kb kbVar = this.delegate;
        float f9 = 0.0f;
        if (kbVar != null) {
            if (this.top) {
                mc mcVar = this.bulletin;
                if (mcVar != null) {
                    i11 = mcVar.f30645a;
                } else {
                    i11 = 0;
                }
                f9 = 0.0f - kbVar.h(i11);
            } else {
                f9 = 0.0f + getBottomOffset();
            }
        }
        float f10 = -f9;
        float f11 = this.inOutOffset;
        if (this.top) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        setTranslationY((f11 * i10) + f10);
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
        this.background = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(i11), i10);
    }
}
