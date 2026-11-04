package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
public final class nb0 extends FrameLayout {
    public Bitmap f36428a;
    public HashMap f36429b;
    public boolean f36430c;
    public BitmapDrawable d;
    public boolean f36431e;

    public nb0(Context context) {
        super(context);
        this.f36431e = true;
    }

    public final void a() {
        this.f36428a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f36429b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(java.util.ArrayList r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nb0.b(java.util.ArrayList, boolean, boolean, boolean):void");
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f36431e) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public Bitmap getBitmap() {
        return this.f36428a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / org.telegram.messenger.g0.L(120.0f), measuredHeight / org.telegram.messenger.g0.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / max;
        canvas.scale(f10, f10);
        draw(canvas);
        return createBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int measuredHeight;
        if (this.f36429b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f36429b.get(childAt);
                if (z10Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof ug.b) {
                        if (z10Var.A) {
                            i13 = ((int) (((z10Var.f26707f / 2.0f) + z10Var.f26705c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((z10Var.f26708g / 2.0f) + z10Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * z10Var.f26724y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * z10Var.f26725z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * z10Var.f26705c);
                        i14 = (int) (measuredHeight2 * z10Var.d);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        this.f36430c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        if (this.f36429b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f36429b.get(childAt);
                if (z10Var != null) {
                    if (childAt instanceof ug.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(z10Var.f26717q, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (z10Var.A) {
                            f10 = (z10Var.f26707f * getMeasuredWidth()) / z10Var.f26717q;
                        } else {
                            f10 = z10Var.v * ((z10Var.f26722w * measuredWidth) / z10Var.f26717q);
                        }
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f10);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * z10Var.f26707f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * z10Var.f26708g), 1073741824));
                    }
                }
            }
        }
        this.f36430c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36430c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f10));
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f36428a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
