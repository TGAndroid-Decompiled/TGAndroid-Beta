package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
public final class cc0 extends FrameLayout {
    public Bitmap f34016a;
    public HashMap f34017b;
    public boolean f34018c;
    public BitmapDrawable d;
    public boolean f34019e;
    public boolean f34020f;
    public bc0 h;
    public boolean f34021n;
    public final rc f34022r;

    public cc0(Context context) {
        super(context);
        this.f34019e = true;
        this.f34022r = new rc(this, 12);
    }

    public final void a() {
        this.f34016a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f34017b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(java.util.ArrayList r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc0.b(java.util.ArrayList, boolean, boolean, boolean):void");
    }

    public final void c() {
        this.f34020f = false;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setVisibility(0);
        }
        setBackground(this.d);
    }

    public final void d() {
        bc0 bc0Var;
        long j3;
        boolean z10;
        if (this.f34017b != null && (bc0Var = this.h) != null) {
            h61 h61Var = ((org.telegram.ui.qn0) bc0Var).f51496a.G2;
            if (h61Var != null) {
                j3 = h61Var.S();
            } else {
                j3 = 0;
            }
            for (Map.Entry entry : this.f34017b.entrySet()) {
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) entry.getValue();
                if (b20Var.f23124a == 11) {
                    boolean z11 = true;
                    int i7 = 0;
                    if (!this.f34020f && j3 >= b20Var.V && j3 < b20Var.W) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    View view = (View) entry.getKey();
                    if (view.getVisibility() != 0) {
                        z11 = false;
                    }
                    if (z11 != z10) {
                        if (!z10) {
                            i7 = 4;
                        }
                        view.setVisibility(i7);
                    }
                    if (z10 && (view instanceof tg.f)) {
                        ((tg.f) view).A(j3);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.f34019e) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public Bitmap getBitmap() {
        return this.f34016a;
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rc rcVar = this.f34022r;
        removeCallbacks(rcVar);
        if (this.f34021n) {
            postOnAnimation(rcVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f34022r);
        super.onDetachedFromWindow();
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
        if (this.f34017b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.f34017b.get(childAt);
                if (b20Var != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof tg.f) {
                        if (b20Var.A) {
                            i13 = ((int) (((b20Var.f23129f / 2.0f) + b20Var.f23127c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((b20Var.f23130g / 2.0f) + b20Var.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * b20Var.f23146y)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * b20Var.f23147z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * b20Var.f23127c);
                        i14 = (int) (measuredHeight2 * b20Var.d);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        this.f34018c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        if (this.f34017b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                org.telegram.messenger.b20 b20Var = (org.telegram.messenger.b20) this.f34017b.get(childAt);
                if (b20Var != null) {
                    if (childAt instanceof tg.f) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(b20Var.f23139q, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (b20Var.A) {
                            f10 = (b20Var.f23129f * getMeasuredWidth()) / b20Var.f23139q;
                        } else {
                            f10 = b20Var.v * ((b20Var.f23144w * measuredWidth) / b20Var.f23139q);
                        }
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f10);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * b20Var.f23129f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * b20Var.f23130g), 1073741824));
                    }
                }
            }
        }
        this.f34018c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34018c) {
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
        this.f34016a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public void setVideoPosition(bc0 bc0Var) {
        this.h = bc0Var;
    }
}
