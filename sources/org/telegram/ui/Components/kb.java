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
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public abstract class kb extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final r1.e IN_OUT_OFFSET_Y = new gb(0);
    public static final Property<kb, Float> IN_OUT_OFFSET_Y2 = new org.telegram.ui.Cells.o8("offsetY", 8);
    Drawable background;
    private Drawable backgroundBeforeGlass;
    private int backgroundColor;
    private wh.b blurVisibilityDrawable;
    protected fc bulletin;
    private final List<hb> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    eb delegate;
    private Drawable glassBackground;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private Runnable onGlassBackgroundRemoved;
    private boolean pillStyle;
    private final org.telegram.ui.ActionBar.i6 resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public kb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = i6Var;
        setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        this.themeBackground = this.background;
        b();
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        setWillNotDraw(false);
        c8.sa.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(kb kbVar, int i7, int i10) {
        boolean z10;
        boolean z11 = true;
        if (kbVar.wideScreenWidth != i7) {
            kbVar.wideScreenWidth = i7;
            z10 = true;
        } else {
            z10 = false;
        }
        if (kbVar.wideScreenGravity != i10) {
            kbVar.wideScreenGravity = i10;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            kbVar.b();
        }
    }

    public static boolean access$1600(kb kbVar, boolean z10) {
        kbVar.getClass();
        if (a() && kbVar.wideScreenWidth != -1) {
            int i7 = kbVar.wideScreenGravity;
            if (i7 != 1) {
                if (z10) {
                    if (i7 != 5) {
                        return false;
                    }
                } else if (i7 == 5) {
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
        fc fcVar = this.bulletin;
        if (fcVar != null && fcVar.f35092k) {
            invalidate();
        }
    }

    public void addCallback(hb hbVar) {
        this.callbacks.add(hbVar);
    }

    public final void b() {
        int i7;
        int i10 = 80;
        if (this.pillStyle) {
            if (this.top) {
                i10 = 48;
            }
            setLayoutParams(c8.na.e(-2, -2, i10 | 1));
            return;
        }
        boolean a10 = a();
        if (a10) {
            i7 = this.wideScreenWidth;
        } else {
            i7 = -1;
        }
        if (a10) {
            if (this.top) {
                i10 = 48;
            }
            i10 |= this.wideScreenGravity;
        } else if (this.top) {
            i10 = 48;
        }
        setLayoutParams(c8.na.e(i7, -2, i10));
    }

    public boolean canHaveGlassBackground() {
        if (!this.hasCustomBackground && this.glassBackground == null && this.backgroundColor == getThemedColor(org.telegram.ui.ActionBar.n6.wj)) {
            return true;
        }
        return false;
    }

    public jb createTransition() {
        return new w7.s(17);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        fc fcVar = this.bulletin;
        if (fcVar != null && fcVar.f35092k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new wh.b(new b0(this, 15));
            }
            wh.b bVar = this.blurVisibilityDrawable;
            if (bVar.f59994c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, org.telegram.messenger.g0.L(10.0f));
            }
            this.blurVisibilityDrawable.f59998i = c8.m9.b((int) org.telegram.messenger.m10.y(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i7) {
        eb ebVar;
        boolean z11;
        boolean z12;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i7 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (ebVar = this.delegate) != null) {
                float h = ebVar.h(this.bulletin.f35084a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z10 && this.delegate.g(this.bulletin.f35084a)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                canvas2.save();
                if (!z10) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z11 && i7 == 255) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i7, 31);
                }
                this.background.draw(canvas2);
                super.dispatchDraw(canvas);
                if (z11) {
                    if (this.clipPaint == null) {
                        Paint paint = new Paint(1);
                        this.clipPaint = paint;
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        this.clipGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), this.top ? new int[]{-16777216, 0} : new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        Matrix matrix = new Matrix();
                        this.clipMatrix = matrix;
                        this.clipGradient.setLocalMatrix(matrix);
                        this.clipPaint.setShader(this.clipGradient);
                    }
                    canvas2.save();
                    this.clipMatrix.reset();
                    Matrix matrix2 = this.clipMatrix;
                    if (this.top) {
                        L = h;
                    } else {
                        L = measuredHeight - org.telegram.messenger.g0.L(8.0f);
                    }
                    matrix2.postTranslate(0.0f, L);
                    this.clipGradient.setLocalMatrix(this.clipMatrix);
                    if (this.top) {
                        canvas2.drawRect(0.0f, h, getWidth(), h + org.telegram.messenger.g0.L(8.0f), this.clipPaint);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, measuredHeight - org.telegram.messenger.g0.L(8.0f), getWidth(), measuredHeight, this.clipPaint);
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

    public void dispatchDrawImplBlur(Canvas canvas, int i7) {
        dispatchDrawImpl(canvas, true, i7);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i7;
        int f10;
        eb ebVar;
        fc fcVar;
        r1.g gVar;
        if (this.bulletin != null && (((ebVar = this.delegate) == null || ebVar.e()) && (gVar = (fcVar = this.bulletin).d) != null && gVar.f56440f)) {
            f10 = fcVar.f35096o;
        } else {
            eb ebVar2 = this.delegate;
            if (ebVar2 != null) {
                fc fcVar2 = this.bulletin;
                if (fcVar2 != null) {
                    i7 = fcVar2.f35084a;
                } else {
                    i7 = 0;
                }
                f10 = ebVar2.f(i7);
            } else {
                return 0.0f;
            }
        }
        return f10;
    }

    public fc getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.n6.w0(i7, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i7;
        eb ebVar = this.delegate;
        if (ebVar != null) {
            fc fcVar = this.bulletin;
            if (fcVar != null) {
                i7 = fcVar.f35084a;
            } else {
                i7 = 0;
            }
            return ebVar.h(i7);
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

    public void onAttach(fc fcVar) {
        this.bulletin = fcVar;
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).c(fcVar);
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
        if (this.glassBackground != null) {
            this.background = this.backgroundBeforeGlass;
            this.backgroundBeforeGlass = null;
            this.glassBackground = null;
            Runnable runnable = this.onGlassBackgroundRemoved;
            this.onGlassBackgroundRemoved = null;
            if (runnable != null) {
                runnable.run();
            }
        }
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).d();
        }
        wh.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f59994c) != null) {
            bitmap.recycle();
            bVar.f59994c = null;
        }
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).b();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).a();
        }
    }

    public void removeCallback(hb hbVar) {
        this.callbacks.remove(hbVar);
    }

    public void setBackground(int i7) {
        setBackground(i7, 16);
    }

    public void setCustomBackground(Drawable drawable) {
        this.background = drawable;
        this.hasCustomBackground = true;
    }

    public void setGlassBackground(Drawable drawable, Runnable runnable) {
        this.backgroundBeforeGlass = this.background;
        this.background = drawable;
        this.glassBackground = drawable;
        this.onGlassBackgroundRemoved = runnable;
        invalidate();
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

    public void updateColors() {
        try {
            Drawable drawable = this.background;
            if (drawable != null && drawable == this.themeBackground && (drawable instanceof ShapeDrawable)) {
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void updatePosition() {
        int i7;
        int i10;
        eb ebVar = this.delegate;
        float f10 = 0.0f;
        if (ebVar != null) {
            if (this.top) {
                fc fcVar = this.bulletin;
                if (fcVar != null) {
                    i10 = fcVar.f35084a;
                } else {
                    i10 = 0;
                }
                f10 = 0.0f - ebVar.h(i10);
            } else {
                f10 = 0.0f + getBottomOffset();
            }
        }
        float f11 = -f10;
        float f12 = this.inOutOffset;
        if (this.top) {
            i7 = -1;
        } else {
            i7 = 1;
        }
        setTranslationY((f12 * i7) + f11);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (this.background != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setBackground(int i7, int i10) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(i10), i7);
        this.backgroundColor = i7;
    }

    public void addColorKeys(HashSet hashSet) {
    }
}
