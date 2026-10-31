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
public final class as0 extends org.telegram.ui.Components.vu0 {
    public final Paint f35703j0;
    public boolean f35704k0;
    public boolean f35705l0;
    public ArrayList m0;
    public final PhotoViewer f35706n0;

    public as0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f35706n0 = photoViewer;
        Paint paint = new Paint();
        this.f35703j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f7;
        super.R();
        PhotoViewer photoViewer = this.f35706n0;
        if (photoViewer.f33584r1) {
            fq0 fq0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.i0.L(20.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fq0Var.e(2, f7, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.f35706n0;
            if (photoViewer.f33615u4 == 1 || photoViewer.f33563o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.z20.y(200.0f, measuredHeight, 2), org.telegram.messenger.i0.L(100.0f), (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.z20.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f35706n0;
        photoViewer.Q.n(photoViewer.f33487g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f35706n0;
        org.telegram.ui.Cells.v9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.w9 w9Var = n10.f23339r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f23338n = motionEvent.getY();
            w9Var.e = w9Var.x();
        } else if (w9Var.e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.i0.e && Math.abs(motionEvent.getY() - n10.f23338n) < org.telegram.messenger.i0.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = n10.f23339r;
            if (!w9Var2.f23425i && w9Var2.e) {
                w9Var2.f(false);
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
        PhotoViewer photoViewer = this.f35706n0;
        mr0 mr0Var = photoViewer.f33479f0;
        if (mr0Var != null && mr0Var.f31243y) {
            int measuredHeight = ((int) ((photoViewer.f33438a6 - 1.0f) * mr0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.m61 m61Var = photoViewer.f33659z1;
            if (m61Var != null && m61Var.f28320j) {
                m61Var.setBounds(photoViewer.f33479f0.getLeft(), (photoViewer.f33479f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.f33438a6)), photoViewer.f33479f0.getRight(), photoViewer.f33479f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33438a6)));
                photoViewer.f33659z1.draw(canvas);
            }
            org.telegram.ui.Components.rn0 rn0Var = photoViewer.A1;
            if (rn0Var != null && rn0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f33479f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.i0.L(90.0f)) + org.telegram.messenger.i0.f16020m), photoViewer.f33479f0.getRight(), photoViewer.f33479f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33438a6)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.f35706n0;
        if (view != photoViewer.Q.n(photoViewer.f33487g0.getContext()) && view != photoViewer.f33598s5 && view != photoViewer.f33662z4 && view != photoViewer.A4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.R7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f33652y2 && view != photoViewer.f33653y4) {
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
        return this.f35706n0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new z8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kg.g1 g1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.f35706n0;
        photoViewer.Y1(canvas);
        if (org.telegram.messenger.i0.f16020m != 0 && (g1Var = photoViewer.F) != null) {
            Paint paint = this.f35703j0;
            paint.setAlpha((int) (g1Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.i0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.as0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int q6;
        int o10;
        View view;
        int i16;
        as0 as0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (as0Var.getLayoutParams().height > 0) {
            size2 = as0Var.getLayoutParams().height;
        }
        int i17 = size2;
        as0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = as0Var.f35706n0;
        boolean z10 = true;
        if (!photoViewer.f33584r1) {
            as0Var.f35704k0 = true;
            if (photoViewer.f33507i2) {
                Point point = org.telegram.messenger.i0.f16026q;
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
            as0Var.f35704k0 = false;
        }
        if (photoViewer.f33505i0.getVisibility() != 8) {
            i12 = org.telegram.messenger.i0.L(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
        if (d30Var != null && d30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            as0Var.measureChildWithMargins(photoViewer.l1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            as0Var.f35704k0 = true;
            if (!org.telegram.messenger.i0.Q1() && i17 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            as0Var.f35704k0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        ms0 ms0Var = photoViewer.f33508i3;
        if (ms0Var != null) {
            ms0Var.e = size;
            ms0Var.f39759f = i17;
        }
        int paddingLeft = size - (as0Var.getPaddingLeft() + as0Var.getPaddingRight());
        int paddingBottom = i17 - as0Var.getPaddingBottom();
        int childCount = as0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = as0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.af0 af0Var = photoViewer.f33652y2;
                if (childAt == af0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(as0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f33653y4) {
                    if (af0Var != null && af0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        q6 = view.getMeasuredWidth();
                        o10 = view.getMeasuredHeight();
                    } else {
                        q6 = photoViewer.C4.q();
                        o10 = photoViewer.C4.o();
                    }
                    if (q6 == 0 || o10 == 0) {
                        q6 = paddingLeft;
                        o10 = paddingBottom;
                    }
                    photoViewer.f33653y4.measure(View.MeasureSpec.makeMeasureSpec(q6, 1073741824), View.MeasureSpec.makeMeasureSpec(o10, 1073741824));
                } else if (!photoViewer.U1.f51340f.l(childAt) && !photoViewer.V1.f51340f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f33540m2) {
                            if (as0Var.f35705l0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (org.telegram.messenger.i0.Q1() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            as0Var.f35705l0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            as0Var.f35705l0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m), 1073741824));
                        } else {
                            as0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m), 1073741824));
                    }
                } else if (photoViewer.f33592s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.i0.E) {
                    if (org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(320.0f), paddingBottom - org.telegram.messenger.i0.f16020m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.i0.f16020m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.i0.f16021n, 1073741824));
                }
            }
            i18++;
            z10 = true;
            as0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f35704k0) {
            return;
        }
        super.requestLayout();
    }
}
