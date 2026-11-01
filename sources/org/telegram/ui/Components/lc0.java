package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
public final class lc0 extends FrameLayout {
    public Bitmap f28132a;
    public HashMap f28133b;
    public boolean f28134c;
    public BitmapDrawable d;
    public boolean e;

    public lc0(Context context) {
        super(context);
        this.e = true;
    }

    public final void a() {
        this.f28132a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f28133b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(java.util.ArrayList r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lc0.b(java.util.ArrayList, boolean, boolean, boolean):void");
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.e) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public Bitmap getBitmap() {
        return this.f28132a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / org.telegram.messenger.i0.L(120.0f), measuredHeight / org.telegram.messenger.i0.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 1.0f / max;
        canvas.scale(f7, f7);
        draw(canvas);
        return createBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        if (this.f28133b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                org.telegram.messenger.w20 w20Var = (org.telegram.messenger.w20) this.f28133b.get(childAt);
                if (w20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof jg.b) {
                        if (w20Var.A) {
                            i14 = ((int) (((w20Var.f18973f / 2.0f) + w20Var.f18972c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (((w20Var.f18974g / 2.0f) + w20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i14 = ((int) (measuredWidth * w20Var.f18990y)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (measuredHeight2 * w20Var.f18991z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i15 = i16 - measuredHeight;
                    } else {
                        i14 = (int) (measuredWidth * w20Var.f18972c);
                        i15 = (int) (measuredHeight2 * w20Var.d);
                    }
                    childAt.layout(i14, i15, measuredWidth2 + i14, measuredHeight3 + i15);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.f28134c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.f28133b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                org.telegram.messenger.w20 w20Var = (org.telegram.messenger.w20) this.f28133b.get(childAt);
                if (w20Var != null) {
                    if (childAt instanceof jg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(w20Var.f18983q, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (w20Var.A) {
                            f7 = (w20Var.f18973f * getMeasuredWidth()) / w20Var.f18983q;
                        } else {
                            f7 = w20Var.v * ((w20Var.f18988w * measuredWidth) / w20Var.f18983q);
                        }
                        childAt.setScaleX(f7);
                        childAt.setScaleY(f7);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * w20Var.f18973f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * w20Var.f18974g), 1073741824));
                    }
                }
            }
        }
        this.f28134c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f28134c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f7));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f7);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f28132a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
