package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
public final class ec0 extends FrameLayout {
    public Bitmap f34730a;
    public HashMap f34731b;
    public boolean f34732c;
    public BitmapDrawable d;
    public boolean f34733e;

    public ec0(Context context) {
        super(context);
        this.f34733e = true;
    }

    public final void a() {
        this.f34730a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f34731b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(java.util.ArrayList r25, boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ec0.b(java.util.ArrayList, boolean, boolean, boolean):void");
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f34733e) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public Bitmap getBitmap() {
        return this.f34730a;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int measuredHeight;
        if (this.f34731b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) this.f34731b.get(childAt);
                if (d20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof tg.b) {
                        if (d20Var.A) {
                            i13 = ((int) (((d20Var.f23482f / 2.0f) + d20Var.f23480c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((d20Var.f23483g / 2.0f) + d20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * d20Var.f23499y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * d20Var.f23500z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * d20Var.f23480c);
                        i14 = (int) (measuredHeight2 * d20Var.d);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f34732c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        if (this.f34731b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                org.telegram.messenger.d20 d20Var = (org.telegram.messenger.d20) this.f34731b.get(childAt);
                if (d20Var != null) {
                    if (childAt instanceof tg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(d20Var.f23492q, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (d20Var.A) {
                            f10 = (d20Var.f23482f * getMeasuredWidth()) / d20Var.f23492q;
                        } else {
                            f10 = d20Var.v * ((d20Var.f23497w * measuredWidth) / d20Var.f23492q);
                        }
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f10);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * d20Var.f23482f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * d20Var.f23483g), 1073741824));
                    }
                }
            }
        }
        this.f34732c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34732c) {
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
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f34730a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
