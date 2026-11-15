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
public abstract class cb extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final r1.e IN_OUT_OFFSET_Y = new ya(0);
    public static final Property<cb, Float> IN_OUT_OFFSET_Y2 = new org.telegram.ui.Cells.n8("offsetY", 8);
    Drawable background;
    private wh.b blurVisibilityDrawable;
    protected xb bulletin;
    private final List<za> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    wa delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.e6 resourcesProvider;
    private Drawable themeBackground;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public cb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = e6Var;
        setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        this.themeBackground = this.background;
        b();
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        setWillNotDraw(false);
        c8.na.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f23611q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(cb cbVar, int i7, int i10) {
        boolean z10;
        boolean z11 = true;
        if (cbVar.wideScreenWidth != i7) {
            cbVar.wideScreenWidth = i7;
            z10 = true;
        } else {
            z10 = false;
        }
        if (cbVar.wideScreenGravity != i10) {
            cbVar.wideScreenGravity = i10;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            cbVar.b();
        }
    }

    public static boolean access$1400(cb cbVar, boolean z10) {
        cbVar.getClass();
        if (a() && cbVar.wideScreenWidth != -1) {
            int i7 = cbVar.wideScreenGravity;
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
        xb xbVar = this.bulletin;
        if (xbVar != null && xbVar.f41636k) {
            invalidate();
        }
    }

    public void addCallback(za zaVar) {
        this.callbacks.add(zaVar);
    }

    public final void b() {
        int i7;
        boolean a10 = a();
        if (a10) {
            i7 = this.wideScreenWidth;
        } else {
            i7 = -1;
        }
        int i10 = 80;
        if (a10) {
            if (this.top) {
                i10 = 48;
            }
            i10 |= this.wideScreenGravity;
        } else if (this.top) {
            i10 = 48;
        }
        setLayoutParams(c8.ja.e(i7, -2, i10));
    }

    public bb createTransition() {
        return new w7.s(17);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        xb xbVar = this.bulletin;
        if (xbVar != null && xbVar.f41636k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new wh.b(new s(this, 16));
            }
            wh.b bVar = this.blurVisibilityDrawable;
            if (bVar.f59301c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, org.telegram.messenger.g0.L(10.0f));
            }
            this.blurVisibilityDrawable.f59305i = c8.i9.b((int) org.telegram.messenger.i20.x(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i7) {
        wa waVar;
        boolean z11;
        boolean z12;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i7 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (waVar = this.delegate) != null) {
                float h = waVar.h(this.bulletin.f41628a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z10 && this.delegate.g(this.bulletin.f41628a)) {
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
        wa waVar;
        xb xbVar;
        r1.g gVar;
        if (this.bulletin != null && (((waVar = this.delegate) == null || waVar.e()) && (gVar = (xbVar = this.bulletin).d) != null && gVar.f55742f)) {
            f10 = xbVar.f41640o;
        } else {
            wa waVar2 = this.delegate;
            if (waVar2 != null) {
                xb xbVar2 = this.bulletin;
                if (xbVar2 != null) {
                    i7 = xbVar2.f41628a;
                } else {
                    i7 = 0;
                }
                f10 = waVar2.f(i7);
            } else {
                return 0.0f;
            }
        }
        return f10;
    }

    public xb getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i7;
        wa waVar = this.delegate;
        if (waVar != null) {
            xb xbVar = this.bulletin;
            if (xbVar != null) {
                i7 = xbVar.f41628a;
            } else {
                i7 = 0;
            }
            return waVar.h(i7);
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

    public void onAttach(xb xbVar) {
        this.bulletin = xbVar;
        int size = this.callbacks.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).c(xbVar);
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
        for (int i7 = 0; i7 < size; i7++) {
            this.callbacks.get(i7).d();
        }
        wh.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f59301c) != null) {
            bitmap.recycle();
            bVar.f59301c = null;
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

    public void removeCallback(za zaVar) {
        this.callbacks.remove(zaVar);
    }

    public void setBackground(int i7) {
        setBackground(i7, 16);
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

    public void updateColors() {
        try {
            Drawable drawable = this.background;
            if (drawable != null && drawable == this.themeBackground && (drawable instanceof ShapeDrawable)) {
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void updatePosition() {
        int i7;
        int i10;
        wa waVar = this.delegate;
        float f10 = 0.0f;
        if (waVar != null) {
            if (this.top) {
                xb xbVar = this.bulletin;
                if (xbVar != null) {
                    i10 = xbVar.f41628a;
                } else {
                    i10 = 0;
                }
                f10 = 0.0f - waVar.h(i10);
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
        this.background = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(i10), i7);
    }

    public void addColorKeys(HashSet hashSet) {
    }
}
