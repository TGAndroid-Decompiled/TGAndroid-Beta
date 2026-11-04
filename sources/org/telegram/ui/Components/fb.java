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
public abstract class fb extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final q1.e IN_OUT_OFFSET_Y = new bb(0);
    public static final Property<fb, Float> IN_OUT_OFFSET_Y2 = new org.telegram.ui.Cells.n8("offsetY", 8);
    Drawable background;
    private xh.b blurVisibilityDrawable;
    protected ac bulletin;
    private final List<cb> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    za delegate;
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

    public fb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = e6Var;
        setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        this.themeBackground = this.background;
        b();
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        setWillNotDraw(false);
        b8.pf.b(this, 0.02f, 1.5f);
    }

    public static boolean a() {
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x < point.y) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void access$000(fb fbVar, int i3, int i10) {
        boolean z10;
        boolean z11 = true;
        if (fbVar.wideScreenWidth != i3) {
            fbVar.wideScreenWidth = i3;
            z10 = true;
        } else {
            z10 = false;
        }
        if (fbVar.wideScreenGravity != i10) {
            fbVar.wideScreenGravity = i10;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            fbVar.b();
        }
    }

    public static boolean access$1400(fb fbVar, boolean z10) {
        fbVar.getClass();
        if (a() && fbVar.wideScreenWidth != -1) {
            int i3 = fbVar.wideScreenGravity;
            if (i3 != 1) {
                if (z10) {
                    if (i3 != 5) {
                        return false;
                    }
                } else if (i3 == 5) {
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
        ac acVar = this.bulletin;
        if (acVar != null && acVar.f31793k) {
            invalidate();
        }
    }

    public void addCallback(cb cbVar) {
        this.callbacks.add(cbVar);
    }

    public final void b() {
        int i3;
        boolean a10 = a();
        if (a10) {
            i3 = this.wideScreenWidth;
        } else {
            i3 = -1;
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
        setLayoutParams(b8.mf.e(i3, -2, i10));
    }

    public eb createTransition() {
        return new v7.s(17);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ac acVar = this.bulletin;
        if (acVar != null && acVar.f31793k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new xh.b(new t(this, 16));
            }
            xh.b bVar = this.blurVisibilityDrawable;
            if (bVar.f58800c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, org.telegram.messenger.g0.L(10.0f));
            }
            this.blurVisibilityDrawable.f58804i = b8.be.b((int) org.telegram.messenger.camera.q.x(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i3) {
        za zaVar;
        boolean z11;
        boolean z12;
        float L;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i3 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (zaVar = this.delegate) != null) {
                float h = zaVar.h(this.bulletin.f31785a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z10 && this.delegate.g(this.bulletin.f31785a)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                canvas2.save();
                if (!z10) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z11 && i3 == 255) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i3, 31);
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

    public void dispatchDrawImplBlur(Canvas canvas, int i3) {
        dispatchDrawImpl(canvas, true, i3);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i3;
        int f10;
        za zaVar;
        ac acVar;
        q1.g gVar;
        if (this.bulletin != null && (((zaVar = this.delegate) == null || zaVar.e()) && (gVar = (acVar = this.bulletin).d) != null && gVar.f53647f)) {
            f10 = acVar.f31797o;
        } else {
            za zaVar2 = this.delegate;
            if (zaVar2 != null) {
                ac acVar2 = this.bulletin;
                if (acVar2 != null) {
                    i3 = acVar2.f31785a;
                } else {
                    i3 = 0;
                }
                f10 = zaVar2.f(i3);
            } else {
                return 0.0f;
            }
        }
        return f10;
    }

    public ac getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i3;
        za zaVar = this.delegate;
        if (zaVar != null) {
            ac acVar = this.bulletin;
            if (acVar != null) {
                i3 = acVar.f31785a;
            } else {
                i3 = 0;
            }
            return zaVar.h(i3);
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

    public void onAttach(ac acVar) {
        this.bulletin = acVar;
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).c(acVar);
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
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).d();
        }
        xh.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f58800c) != null) {
            bitmap.recycle();
            bVar.f58800c = null;
        }
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).b();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.callbacks.get(i3).a();
        }
    }

    public void removeCallback(cb cbVar) {
        this.callbacks.remove(cbVar);
    }

    public void setBackground(int i3) {
        setBackground(i3, 16);
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
                ((ShapeDrawable) drawable).getPaint().setColor(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public void updatePosition() {
        int i3;
        int i10;
        za zaVar = this.delegate;
        float f10 = 0.0f;
        if (zaVar != null) {
            if (this.top) {
                ac acVar = this.bulletin;
                if (acVar != null) {
                    i10 = acVar.f31785a;
                } else {
                    i10 = 0;
                }
                f10 = 0.0f - zaVar.h(i10);
            } else {
                f10 = 0.0f + getBottomOffset();
            }
        }
        float f11 = -f10;
        float f12 = this.inOutOffset;
        if (this.top) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        setTranslationY((f12 * i3) + f11);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (this.background != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setBackground(int i3, int i10) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(i10), i3);
    }

    public void addColorKeys(HashSet hashSet) {
    }
}
