package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o5 extends FrameLayout {
    public final Matrix f35348a;
    public final float[] f35349b;
    public final FrameLayout f35350c;
    public final ai.j2 d;
    public boolean f35351e;
    public boolean f35352f;

    public o5(Context context) {
        super(context);
        this.f35348a = new Matrix();
        this.f35349b = new float[8];
        this.f35351e = true;
        this.f35352f = true;
        setClipChildren(false);
        setClipToPadding(false);
        ai.j2 j2Var = new ai.j2(context, 1);
        this.d = j2Var;
        j2Var.setLayerType(2, null);
        addView(j2Var, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35350c = frameLayout;
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        j2Var.addView(frameLayout, new FrameLayout.LayoutParams(AndroidUtilities.dp(336.0f), AndroidUtilities.dp(205.0f)));
    }

    public final void a(k5 k5Var) {
        Bitmap bitmap;
        if (this.f35351e && getWidth() != 0 && getHeight() != 0) {
            this.f35351e = false;
            int width = getWidth();
            int height = getHeight();
            synchronized (k5Var) {
                try {
                    bitmap = k5Var.S;
                    k5Var.S = null;
                    if (bitmap != null) {
                        if (bitmap.getWidth() == width) {
                            if (bitmap.getHeight() != height) {
                            }
                        }
                        bitmap.recycle();
                        bitmap = null;
                    }
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    }
                } finally {
                }
            }
            bitmap.eraseColor(0);
            Canvas canvas = new Canvas(bitmap);
            this.d.draw(canvas);
            canvas.setBitmap(null);
            k5Var.f(bitmap);
        }
    }

    public final void b(float[] fArr) {
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0) {
            float[] fArr2 = this.f35349b;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            float f7 = width;
            fArr2[2] = f7;
            fArr2[3] = 0.0f;
            fArr2[4] = f7;
            float f10 = height;
            fArr2[5] = f10;
            fArr2[6] = 0.0f;
            fArr2[7] = f10;
            this.f35348a.setPolyToPoly(fArr2, 0, fArr, 0, 4);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (!this.f35352f) {
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f35348a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        this.f35351e = true;
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override
    public final void onDescendantInvalidated(View view, View view2) {
        this.f35351e = true;
        super.onDescendantInvalidated(view, view2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f35351e = true;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f35351e = true;
        float dp = i10 / AndroidUtilities.dp(336.0f);
        FrameLayout frameLayout = this.f35350c;
        frameLayout.setScaleX(dp);
        frameLayout.setScaleY(i11 / AndroidUtilities.dp(205.0f));
    }
}
