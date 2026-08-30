package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class bu0 extends org.telegram.ui.Components.rv0 {
    public ArrayList A0;
    public final PhotoViewer B0;
    public final Paint f33031x0;
    public boolean f33032y0;
    public boolean f33033z0;

    public bu0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.B0 = photoViewer;
        Paint paint = new Paint();
        this.f33031x0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void S() {
        float f10;
        super.S();
        PhotoViewer photoViewer = this.B0;
        if (photoViewer.f31822o1) {
            fu0 fu0Var = photoViewer.T0[0];
            if (getKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fu0Var.e(2, f10, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.A0 == null) {
                this.A0 = new ArrayList();
            }
            this.A0.clear();
            PhotoViewer photoViewer = this.B0;
            if (photoViewer.f31853r4 == 1 || photoViewer.f31800l6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.A0.add(new Rect(0, b.x(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.A0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), b.x(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.A0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.B0;
        photoViewer.N.o(photoViewer.f31723d0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.B0;
        org.telegram.ui.Cells.y9 o10 = photoViewer.N.o(getContext());
        org.telegram.ui.Cells.z9 z9Var = o10.f22632r;
        if (motionEvent.getAction() == 0) {
            o10.h = motionEvent.getX();
            o10.f22631n = motionEvent.getY();
            z9Var.e = z9Var.y();
        } else if (z9Var.e && Math.abs(motionEvent.getX() - o10.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - o10.f22631n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.z9 z9Var2 = o10.f22632r;
            if (!z9Var2.f22678i && z9Var2.e) {
                z9Var2.f(false);
            }
        }
        if (photoViewer.N.y()) {
            photoViewer.N.o(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.B0;
        nt0 nt0Var = photoViewer.f31715c0;
        if (nt0Var != null && nt0Var.f29456x) {
            int measuredHeight = ((int) ((photoViewer.X5 - 1.0f) * nt0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.y61 y61Var = photoViewer.f31895w1;
            if (y61Var != null && y61Var.f30899j) {
                y61Var.setBounds(photoViewer.f31715c0.getLeft(), (photoViewer.f31715c0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.V5 / photoViewer.X5)), photoViewer.f31715c0.getRight(), photoViewer.f31715c0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.V5 / photoViewer.X5)));
                photoViewer.f31895w1.draw(canvas);
            }
            org.telegram.ui.Components.oo0 oo0Var = photoViewer.f31905x1;
            if (oo0Var != null && oo0Var.a()) {
                photoViewer.f31905x1.setBounds(photoViewer.f31715c0.getLeft(), (int) ((photoViewer.C.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f31715c0.getRight(), photoViewer.f31715c0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.V5 / photoViewer.X5)));
                photoViewer.f31905x1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.B0;
        if (view != photoViewer.N.o(photoViewer.f31723d0.getContext()) && view != photoViewer.f31835p5 && view != photoViewer.f31898w4 && view != photoViewer.f31908x4 && view != photoViewer.U0) {
            FrameLayout frameLayout = photoViewer.N7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.M0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.N7.getX(), photoViewer.N7.getY(), photoViewer.N7.getX() + photoViewer.N7.getMeasuredWidth(), photoViewer.N7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f31886v2 && view != photoViewer.f31888v4) {
                    if (super.drawChild(canvas, view, j10)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getBottomPadding() {
        return this.B0.M0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.ic.a(this, new a9(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.ic.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eg.l1 l1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Q8;
        PhotoViewer photoViewer = this.B0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight != 0 && (l1Var = photoViewer.C) != null) {
            Paint paint = this.f33031x0;
            paint.setAlpha((int) (l1Var.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (getPaddingLeft() > 0) {
                canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
            }
            if (getPaddingBottom() > 0) {
                float alpha = (1.0f - photoViewer.C.getAlpha()) * AndroidUtilities.dpf2(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bu0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int bitmapWidth;
        int bitmapHeight;
        View view;
        int i16;
        bu0 bu0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (bu0Var.getLayoutParams().height > 0) {
            size2 = bu0Var.getLayoutParams().height;
        }
        int i17 = size2;
        bu0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = bu0Var.B0;
        boolean z4 = true;
        if (!photoViewer.f31822o1) {
            bu0Var.f33032y0 = true;
            if (photoViewer.f31743f2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i16 = 5;
                } else {
                    i16 = 10;
                }
                photoViewer.N1.getCurrentView().setMaxLines(i16);
                photoViewer.N1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.N1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.N1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            bu0Var.f33032y0 = false;
        }
        if (photoViewer.f31741f0.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.x30 x30Var = photoViewer.f31769i1;
        if (x30Var != null && x30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.f31769i1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            bu0Var.measureChildWithMargins(photoViewer.f31769i1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.f31769i1.getMeasuredHeight();
            bu0Var.f33032y0 = true;
            if (!AndroidUtilities.isTablet() && i17 < size) {
                if (photoViewer.f31769i1.getVisibility() != 4) {
                    photoViewer.f31769i1.setVisibility(4);
                }
            } else if (photoViewer.f31769i1.getVisibility() != 0) {
                photoViewer.f31769i1.setVisibility(0);
            }
            bu0Var.f33032y0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        qu0 qu0Var = photoViewer.f31744f3;
        if (qu0Var != null) {
            qu0Var.e = size;
            qu0Var.f37847f = i17;
        }
        int paddingLeft = size - (bu0Var.getPaddingLeft() + bu0Var.getPaddingRight());
        int paddingBottom = i17 - bu0Var.getPaddingBottom();
        int childCount = bu0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = bu0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.f31769i1) {
                xs0 xs0Var = photoViewer.f31886v2;
                if (childAt == xs0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, 1073741824));
                } else if (childAt == photoViewer.f31888v4) {
                    if (xs0Var != null && xs0Var.getVisibility() == 0) {
                        if (photoViewer.A2) {
                            view = photoViewer.f31925z2;
                        } else {
                            view = photoViewer.f31916y2;
                        }
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    } else {
                        bitmapWidth = photoViewer.z4.getBitmapWidth();
                        bitmapHeight = photoViewer.z4.getBitmapHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f31888v4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (!photoViewer.R1.f41809f.l(childAt) && !photoViewer.S1.f41809f.l(childAt)) {
                    if (childAt == photoViewer.Q1) {
                        if (photoViewer.f31779j2) {
                            if (bu0Var.f33033z0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.f31769i1.c() && (AndroidUtilities.isTablet() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            bu0Var.f33033z0 = z4;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            bu0Var.f33033z0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.Q1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.V1 && childAt != photoViewer.N0) {
                        if (childAt == photoViewer.S1.J) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                        } else {
                            bu0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else if (photoViewer.f31858s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (AndroidUtilities.isInMultiwindow) {
                    if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, 1073741824));
                }
            }
            i18++;
            z4 = true;
            bu0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f33032y0) {
            return;
        }
        super.requestLayout();
    }
}
