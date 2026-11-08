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
public final class pq0 extends org.telegram.ui.Components.st0 {
    public final Paint f48909j0;
    public boolean f48910k0;
    public boolean f48911l0;
    public ArrayList m0;
    public final PhotoViewer f48912n0;

    public pq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f48912n0 = photoViewer;
        Paint paint = new Paint();
        this.f48909j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f10;
        super.R();
        PhotoViewer photoViewer = this.f48912n0;
        if (photoViewer.f41498r1) {
            vo0 vo0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            vo0Var.e(2, f10, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.f48912n0;
            if (photoViewer.f41519t4 == 1 || photoViewer.f41467n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f48912n0;
        photoViewer.Q.n(photoViewer.f41403g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f48912n0;
        org.telegram.ui.Cells.u9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.v9 v9Var = n10.f30592r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f30591n = motionEvent.getY();
            v9Var.f30655e = v9Var.x();
        } else if (v9Var.f30655e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.g0.f22542e && Math.abs(motionEvent.getY() - n10.f30591n) < org.telegram.messenger.g0.f22542e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.v9 v9Var2 = n10.f30592r;
            if (!v9Var2.f30662i && v9Var2.f30655e) {
                v9Var2.f(false);
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
        PhotoViewer photoViewer = this.f48912n0;
        cq0 cq0Var = photoViewer.f41394f0;
        if (cq0Var != null && cq0Var.f31802y) {
            int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * cq0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.j51 j51Var = photoViewer.f41572z1;
            if (j51Var != null && j51Var.f34909j) {
                j51Var.setBounds(photoViewer.f41394f0.getLeft(), (photoViewer.f41394f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.f41394f0.getRight(), photoViewer.f41394f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.f41572z1.draw(canvas);
            }
            org.telegram.ui.Components.qm0 qm0Var = photoViewer.A1;
            if (qm0Var != null && qm0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f41394f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.f22557m), photoViewer.f41394f0.getRight(), photoViewer.f41394f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        PhotoViewer photoViewer = this.f48912n0;
        if (view != photoViewer.Q.n(photoViewer.f41403g0.getContext()) && view != photoViewer.f41502r5 && view != photoViewer.f41566y4 && view != photoViewer.f41575z4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.Q7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.Q7.getX(), photoViewer.Q7.getY(), photoViewer.Q7.getX() + photoViewer.Q7.getMeasuredWidth(), photoViewer.Q7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f41564y2 && view != photoViewer.f41556x4) {
                    if (super.drawChild(canvas, view, j3)) {
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
        return this.f48912n0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new y8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.r7 r7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.Y8;
        PhotoViewer photoViewer = this.f48912n0;
        photoViewer.T1(canvas);
        if (org.telegram.messenger.g0.f22557m != 0 && (r7Var = photoViewer.F) != null) {
            Paint paint = this.f48909j0;
            paint.setAlpha((int) (r7Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int q10;
        int o4;
        View view;
        int i15;
        pq0 pq0Var = this;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (pq0Var.getLayoutParams().height > 0) {
            size2 = pq0Var.getLayoutParams().height;
        }
        int i16 = size2;
        pq0Var.setMeasuredDimension(size, i16);
        PhotoViewer photoViewer = pq0Var.f48912n0;
        boolean z9 = true;
        if (!photoViewer.f41498r1) {
            pq0Var.f48910k0 = true;
            if (photoViewer.f41422i2) {
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i15 = 5;
                } else {
                    i15 = 10;
                }
                photoViewer.Q1.getCurrentView().setMaxLines(i15);
                photoViewer.Q1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.Q1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            pq0Var.f48910k0 = false;
        }
        if (photoViewer.f41420i0.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.l20 l20Var = photoViewer.l1;
        if (l20Var != null && l20Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i11;
            i12 = i7;
            pq0Var.measureChildWithMargins(photoViewer.l1, i12, 0, i10, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            pq0Var.f48910k0 = true;
            if (!org.telegram.messenger.g0.Q1() && i16 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            pq0Var.f48910k0 = false;
            i13 = measuredHeight;
        } else {
            i12 = i7;
            i13 = 0;
        }
        cr0 cr0Var = photoViewer.f41415h3;
        if (cr0Var != null) {
            cr0Var.f44885e = size;
            cr0Var.f44886f = i16;
        }
        int paddingLeft = size - (pq0Var.getPaddingLeft() + pq0Var.getPaddingRight());
        int paddingBottom = i16 - pq0Var.getPaddingBottom();
        int childCount = pq0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = pq0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.fe0 fe0Var = photoViewer.f41564y2;
                if (childAt == fe0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(pq0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f41556x4) {
                    if (fe0Var != null && fe0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        q10 = view.getMeasuredWidth();
                        o4 = view.getMeasuredHeight();
                    } else {
                        q10 = photoViewer.B4.q();
                        o4 = photoViewer.B4.o();
                    }
                    if (q10 == 0 || o4 == 0) {
                        q10 = paddingLeft;
                        o4 = paddingBottom;
                    }
                    photoViewer.f41556x4.measure(View.MeasureSpec.makeMeasureSpec(q10, 1073741824), View.MeasureSpec.makeMeasureSpec(o4, 1073741824));
                } else if (!photoViewer.U1.f12365f.l(childAt) && !photoViewer.V1.f12365f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f41454m2) {
                            if (pq0Var.f48911l0) {
                                i14 = i11 + i13;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i14 = i11;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (org.telegram.messenger.g0.Q1() || paddingBottom > paddingLeft)) {
                            i14 = i11 + i13;
                            pq0Var.f48911l0 = z9;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            pq0Var.f48911l0 = false;
                            i14 = i11;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m), 1073741824));
                        } else {
                            pq0Var.measureChildWithMargins(childAt, i12, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22557m), 1073741824));
                    }
                } else if (photoViewer.f41506s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.g0.E) {
                    if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.f22557m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.f22557m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.f22558n, 1073741824));
                }
            }
            i17++;
            z9 = true;
            pq0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f48910k0) {
            return;
        }
        super.requestLayout();
    }
}
