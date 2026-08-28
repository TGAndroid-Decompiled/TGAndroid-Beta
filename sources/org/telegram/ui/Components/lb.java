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
public abstract class lb extends FrameLayout {
    public static final o1.i IN_OUT_OFFSET_Y = new hb(0);
    public static final Property<lb, Float> IN_OUT_OFFSET_Y2 = new ch.g("offsetY", 10);
    Drawable background;
    private ch.b blurVisibilityDrawable;
    protected gc bulletin;
    private final List<ib> callbacks;
    private LinearGradient clipGradient;
    private Matrix clipMatrix;
    private Paint clipPaint;
    fb delegate;
    private boolean hasCustomBackground;
    public float inOutOffset;
    public View.OnClickListener onClickListener;
    private final org.telegram.ui.ActionBar.b6 resourcesProvider;
    public boolean top;
    public boolean transitionRunningEnter;
    public boolean transitionRunningExit;
    private int wideScreenGravity;
    private int wideScreenWidth;

    public lb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.callbacks = new ArrayList();
        this.wideScreenWidth = -2;
        this.wideScreenGravity = 1;
        this.resourcesProvider = b6Var;
        setMinimumHeight(AndroidUtilities.dp(48.0f));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
        b();
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        setWillNotDraw(false);
        g7.g6.b(this, 0.02f, 1.5f);
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

    public static void access$000(lb lbVar, int i9, int i10) {
        boolean z10;
        boolean z11 = true;
        if (lbVar.wideScreenWidth != i9) {
            lbVar.wideScreenWidth = i9;
            z10 = true;
        } else {
            z10 = false;
        }
        if (lbVar.wideScreenGravity != i10) {
            lbVar.wideScreenGravity = i10;
        } else {
            z11 = z10;
        }
        if (a() && z11) {
            lbVar.b();
        }
    }

    public static boolean access$1400(lb lbVar, boolean z10) {
        lbVar.getClass();
        if (a() && lbVar.wideScreenWidth != -1) {
            int i9 = lbVar.wideScreenGravity;
            if (i9 != 1) {
                if (z10) {
                    if (i9 != 5) {
                        return false;
                    }
                } else if (i9 == 5) {
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
        gc gcVar = this.bulletin;
        if (gcVar != null && gcVar.f28738k) {
            invalidate();
        }
    }

    public void addCallback(ib ibVar) {
        this.callbacks.add(ibVar);
    }

    public final void b() {
        int i9;
        boolean a2 = a();
        if (a2) {
            i9 = this.wideScreenWidth;
        } else {
            i9 = -1;
        }
        int i10 = 80;
        if (a2) {
            if (this.top) {
                i10 = 48;
            }
            i10 |= this.wideScreenGravity;
        } else if (this.top) {
            i10 = 48;
        }
        setLayoutParams(g7.e6.e(i9, -2, i10));
    }

    public kb createTransition() {
        return new v9.d(18);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        gc gcVar = this.bulletin;
        if (gcVar != null && gcVar.f28738k) {
            if (this.blurVisibilityDrawable == null) {
                this.blurVisibilityDrawable = new ch.b(new s(this, 16));
            }
            ch.b bVar = this.blurVisibilityDrawable;
            if (bVar.f2427c == null) {
                bVar.a(getMeasuredWidth(), getMeasuredHeight(), 6.0f, AndroidUtilities.dp(10.0f));
            }
            this.blurVisibilityDrawable.f2431i = g7.n.b((int) org.telegram.messenger.ll.v(this.inOutOffset, getMeasuredHeight(), 1.0f, 255.0f), 0, 255);
            this.blurVisibilityDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurVisibilityDrawable.draw(canvas);
            return;
        }
        dispatchDrawImpl(canvas, false, 255);
    }

    public void dispatchDrawImpl(Canvas canvas, boolean z10, int i9) {
        fb fbVar;
        boolean z11;
        boolean z12;
        float dp;
        Canvas canvas2 = canvas;
        if (this.bulletin != null && i9 != 0) {
            this.background.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredBackgroundHeight() - getPaddingBottom());
            if (isTransitionRunning() && (fbVar = this.delegate) != null) {
                float h = fbVar.h(this.bulletin.f28730a) - getY();
                float measuredHeight = (((View) getParent()).getMeasuredHeight() - getBottomOffset()) - getY();
                if (!z10 && this.delegate.g(this.bulletin.f28730a)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                canvas2.save();
                if (!z10) {
                    canvas2.clipRect(0.0f, h, getMeasuredWidth(), measuredHeight);
                }
                if (!z11 && i9 == 255) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i9, 31);
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

    public void dispatchDrawImplBlur(Canvas canvas, int i9) {
        dispatchDrawImpl(canvas, true, i9);
    }

    public CharSequence getAccessibilityText() {
        return null;
    }

    public float getBottomOffset() {
        int i9;
        int f10;
        fb fbVar;
        gc gcVar;
        o1.j jVar;
        if (this.bulletin != null && (((fbVar = this.delegate) == null || fbVar.e()) && (jVar = (gcVar = this.bulletin).d) != null && jVar.f18794f)) {
            f10 = gcVar.f28742o;
        } else {
            fb fbVar2 = this.delegate;
            if (fbVar2 != null) {
                gc gcVar2 = this.bulletin;
                if (gcVar2 != null) {
                    i9 = gcVar2.f28730a;
                } else {
                    i9 = 0;
                }
                f10 = fbVar2.f(i9);
            } else {
                return 0.0f;
            }
        }
        return f10;
    }

    public gc getBulletin() {
        return this.bulletin;
    }

    public int getMeasuredBackgroundHeight() {
        return getMeasuredHeight();
    }

    public int getThemedColor(int i9) {
        return org.telegram.ui.ActionBar.f6.v0(i9, this.resourcesProvider);
    }

    public float getTopOffset() {
        int i9;
        fb fbVar = this.delegate;
        if (fbVar != null) {
            gc gcVar = this.bulletin;
            if (gcVar != null) {
                i9 = gcVar.f28730a;
            } else {
                i9 = 0;
            }
            return fbVar.h(i9);
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

    public void onAttach(gc gcVar) {
        this.bulletin = gcVar;
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).a(gcVar);
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
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).b();
        }
        ch.b bVar = this.blurVisibilityDrawable;
        if (bVar != null && (bitmap = bVar.f2427c) != null) {
            bitmap.recycle();
            bVar.f2427c = null;
        }
    }

    public void onEnterTransitionEnd() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onEnterTransitionStart() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onExitTransitionEnd() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onExitTransitionStart() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).getClass();
        }
    }

    public void onHide() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).c();
        }
    }

    public void onShow() {
        int size = this.callbacks.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.callbacks.get(i9).d();
        }
    }

    public void removeCallback(ib ibVar) {
        this.callbacks.remove(ibVar);
    }

    public void setBackground(int i9) {
        setBackground(i9, 16);
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
        int i9;
        int i10;
        fb fbVar = this.delegate;
        float f10 = 0.0f;
        if (fbVar != null) {
            if (this.top) {
                gc gcVar = this.bulletin;
                if (gcVar != null) {
                    i10 = gcVar.f28730a;
                } else {
                    i10 = 0;
                }
                f10 = 0.0f - fbVar.h(i10);
            } else {
                f10 = 0.0f + getBottomOffset();
            }
        }
        float f11 = -f10;
        float f12 = this.inOutOffset;
        if (this.top) {
            i9 = -1;
        } else {
            i9 = 1;
        }
        setTranslationY((f12 * i9) + f11);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        if (this.background != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setBackground(int i9, int i10) {
        if (this.hasCustomBackground) {
            return;
        }
        this.background = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(i10), i9);
    }
}
