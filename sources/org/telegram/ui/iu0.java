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
public final class iu0 extends org.telegram.ui.Components.ww0 {
    public final Paint f40353p0;
    public boolean f40354q0;
    public boolean f40355r0;
    public ArrayList f40356s0;
    public final PhotoViewer f40357t0;

    public iu0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f40357t0 = photoViewer;
        Paint paint = new Paint();
        this.f40353p0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f7;
        super.R();
        PhotoViewer photoViewer = this.f40357t0;
        if (photoViewer.f35761r1) {
            mu0 mu0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= AndroidUtilities.dp(20.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            mu0Var.e(2, f7, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f40356s0 == null) {
                this.f40356s0 = new ArrayList();
            }
            this.f40356s0.clear();
            PhotoViewer photoViewer = this.f40357t0;
            if (photoViewer.f35791u4 == 1 || photoViewer.f35739o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f40356s0.add(new Rect(0, org.telegram.messenger.vh.B(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.f40356s0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.vh.B(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f40356s0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f40357t0;
        photoViewer.Q.n(photoViewer.f35664g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f40357t0;
        org.telegram.ui.Cells.ea n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.fa faVar = n10.f24043r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f24042n = motionEvent.getY();
            faVar.e = faVar.x();
        } else if (faVar.e && Math.abs(motionEvent.getX() - n10.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - n10.f24042n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.fa faVar2 = n10.f24043r;
            if (!faVar2.f24100i && faVar2.e) {
                faVar2.f(false);
            }
        }
        if (photoViewer.Q.x()) {
            photoViewer.Q.n(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.f40357t0;
        vt0 vt0Var = photoViewer.f35656f0;
        if (vt0Var != null && vt0Var.f30582x) {
            int measuredHeight = ((int) ((photoViewer.f35614a6 - 1.0f) * vt0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.j81 j81Var = photoViewer.f35835z1;
            if (j81Var != null && j81Var.f29522j) {
                j81Var.setBounds(photoViewer.f35656f0.getLeft(), (photoViewer.f35656f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.f35614a6)), photoViewer.f35656f0.getRight(), photoViewer.f35656f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f35614a6)));
                photoViewer.f35835z1.draw(canvas);
            }
            org.telegram.ui.Components.qp0 qp0Var = photoViewer.A1;
            if (qp0Var != null && qp0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f35656f0.getLeft(), (int) ((photoViewer.F.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f35656f0.getRight(), photoViewer.f35656f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f35614a6)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.f40357t0;
        if (view != photoViewer.Q.n(photoViewer.f35664g0.getContext()) && view != photoViewer.f35774s5 && view != photoViewer.f35838z4 && view != photoViewer.A4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.R7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f35828y2 && view != photoViewer.f35829y4) {
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
        return this.f40357t0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.qc.a(this, new d9(this, 7));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.qc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.b8 b8Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.f40357t0;
        photoViewer.X1(canvas);
        if (AndroidUtilities.statusBarHeight != 0 && (b8Var = photoViewer.F) != null) {
            Paint paint = this.f40353p0;
            paint.setAlpha((int) (b8Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.F.getAlpha()) * AndroidUtilities.dpf2(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.iu0.onLayout(boolean, int, int, int, int):void");
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
        iu0 iu0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (iu0Var.getLayoutParams().height > 0) {
            size2 = iu0Var.getLayoutParams().height;
        }
        int i17 = size2;
        iu0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = iu0Var.f40357t0;
        boolean z10 = true;
        if (!photoViewer.f35761r1) {
            iu0Var.f40354q0 = true;
            if (photoViewer.f35683i2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i16 = 5;
                } else {
                    i16 = 10;
                }
                photoViewer.Q1.getCurrentView().setMaxLines(i16);
                photoViewer.Q1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.Q1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            iu0Var.f40354q0 = false;
        }
        if (photoViewer.f35681i0.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.g40 g40Var = photoViewer.l1;
        if (g40Var != null && g40Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            iu0Var.measureChildWithMargins(photoViewer.l1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            iu0Var.f40354q0 = true;
            if (!AndroidUtilities.isTablet() && i17 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            iu0Var.f40354q0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        xu0 xu0Var = photoViewer.f35684i3;
        if (xu0Var != null) {
            xu0Var.e = size;
            xu0Var.f45864f = i17;
        }
        int paddingLeft = size - (iu0Var.getPaddingLeft() + iu0Var.getPaddingRight());
        int paddingBottom = i17 - iu0Var.getPaddingBottom();
        int childCount = iu0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = iu0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                ft0 ft0Var = photoViewer.f35828y2;
                if (childAt == ft0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(iu0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f35829y4) {
                    if (ft0Var != null && ft0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    } else {
                        bitmapWidth = photoViewer.C4.getBitmapWidth();
                        bitmapHeight = photoViewer.C4.getBitmapHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f35829y4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (!photoViewer.U1.f11199f.l(childAt) && !photoViewer.V1.f11199f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f35716m2) {
                            if (iu0Var.f40355r0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (AndroidUtilities.isTablet() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            iu0Var.f40355r0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            iu0Var.f40355r0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                        } else {
                            iu0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                    }
                } else if (photoViewer.f35768s) {
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
            z10 = true;
            iu0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f40354q0) {
            return;
        }
        super.requestLayout();
    }
}
