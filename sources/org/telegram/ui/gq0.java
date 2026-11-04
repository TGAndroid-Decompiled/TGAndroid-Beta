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
public final class gq0 extends org.telegram.ui.Components.rt0 {
    public final Paint f45702k0;
    public boolean f45703l0;
    public boolean m0;
    public ArrayList f45704n0;
    public final PhotoViewer f45705o0;

    public gq0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f45705o0 = photoViewer;
        Paint paint = new Paint();
        this.f45702k0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f10;
        super.R();
        PhotoViewer photoViewer = this.f45705o0;
        if (photoViewer.f41533s1) {
            mo0 mo0Var = photoViewer.X0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.g0.L(20.0f)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            mo0Var.e(2, f10, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f45704n0 == null) {
                this.f45704n0 = new ArrayList();
            }
            this.f45704n0.clear();
            PhotoViewer photoViewer = this.f45705o0;
            if (photoViewer.f41562v4 == 1 || photoViewer.f41510p6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f45704n0.add(new Rect(0, org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), org.telegram.messenger.g0.L(100.0f), (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
                this.f45704n0.add(new Rect(measuredWidth - org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.camera.q.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.g0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f45704n0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f45705o0;
        photoViewer.R.n(photoViewer.f41437h0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f45705o0;
        org.telegram.ui.Cells.t9 n4 = photoViewer.R.n(getContext());
        org.telegram.ui.Cells.u9 u9Var = n4.f30614r;
        if (motionEvent.getAction() == 0) {
            n4.h = motionEvent.getX();
            n4.f30613n = motionEvent.getY();
            u9Var.f30666e = u9Var.x();
        } else if (u9Var.f30666e && Math.abs(motionEvent.getX() - n4.h) < org.telegram.messenger.g0.f22587e && Math.abs(motionEvent.getY() - n4.f30613n) < org.telegram.messenger.g0.f22587e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.u9 u9Var2 = n4.f30614r;
            if (!u9Var2.f30673i && u9Var2.f30666e) {
                u9Var2.f(false);
            }
        }
        if (photoViewer.R.x()) {
            photoViewer.R.n(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.f45705o0;
        tp0 tp0Var = photoViewer.f41429g0;
        if (tp0Var != null && tp0Var.f38729y) {
            int measuredHeight = ((int) ((photoViewer.f41388b6 - 1.0f) * tp0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.d51 d51Var = photoViewer.A1;
            if (d51Var != null && d51Var.f32944j) {
                d51Var.setBounds(photoViewer.f41429g0.getLeft(), (photoViewer.f41429g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Z5 / photoViewer.f41388b6)), photoViewer.f41429g0.getRight(), photoViewer.f41429g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Z5 / photoViewer.f41388b6)));
                photoViewer.A1.draw(canvas);
            }
            org.telegram.ui.Components.tm0 tm0Var = photoViewer.B1;
            if (tm0Var != null && tm0Var.a()) {
                photoViewer.B1.setBounds(photoViewer.f41429g0.getLeft(), (int) ((photoViewer.G.getAlpha() * org.telegram.messenger.g0.L(90.0f)) + org.telegram.messenger.g0.f22602m), photoViewer.f41429g0.getRight(), photoViewer.f41429g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Z5 / photoViewer.f41388b6)));
                photoViewer.B1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.f45705o0;
        if (view != photoViewer.R.n(photoViewer.f41437h0.getContext()) && view != photoViewer.f41545t5 && view != photoViewer.A4 && view != photoViewer.B4 && view != photoViewer.Y0) {
            FrameLayout frameLayout = photoViewer.S7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.S7.getX(), photoViewer.S7.getY(), photoViewer.S7.getX() + photoViewer.S7.getMeasuredWidth(), photoViewer.S7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f41599z2 && view != photoViewer.f41601z4) {
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
        return this.f45705o0.Q0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new x8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.p7 p7Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.V8;
        PhotoViewer photoViewer = this.f45705o0;
        photoViewer.Y1(canvas);
        if (org.telegram.messenger.g0.f22602m != 0 && (p7Var = photoViewer.G) != null) {
            Paint paint = this.f45702k0;
            paint.setAlpha((int) (p7Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.G.getAlpha()) * org.telegram.messenger.g0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gq0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int q10;
        int o10;
        View view;
        int i15;
        gq0 gq0Var = this;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        if (gq0Var.getLayoutParams().height > 0) {
            size2 = gq0Var.getLayoutParams().height;
        }
        int i16 = size2;
        gq0Var.setMeasuredDimension(size, i16);
        PhotoViewer photoViewer = gq0Var.f45705o0;
        boolean z10 = true;
        if (!photoViewer.f41533s1) {
            gq0Var.f45703l0 = true;
            if (photoViewer.f41455j2) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i15 = 5;
                } else {
                    i15 = 10;
                }
                photoViewer.R1.getCurrentView().setMaxLines(i15);
                photoViewer.R1.getNextView().setMaxLines(i15);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.R1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            gq0Var.f45703l0 = false;
        }
        if (photoViewer.f41453j0.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(48.0f);
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.h20 h20Var = photoViewer.m1;
        if (h20Var != null && h20Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = i11;
            i12 = i3;
            gq0Var.measureChildWithMargins(photoViewer.m1, i12, 0, i10, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            gq0Var.f45703l0 = true;
            if (!org.telegram.messenger.g0.Q1() && i16 < size) {
                if (photoViewer.m1.getVisibility() != 4) {
                    photoViewer.m1.setVisibility(4);
                }
            } else if (photoViewer.m1.getVisibility() != 0) {
                photoViewer.m1.setVisibility(0);
            }
            gq0Var.f45703l0 = false;
            i13 = measuredHeight;
        } else {
            i12 = i3;
            i13 = 0;
        }
        sq0 sq0Var = photoViewer.f41456j3;
        if (sq0Var != null) {
            sq0Var.f49595e = size;
            sq0Var.f49596f = i16;
        }
        int paddingLeft = size - (gq0Var.getPaddingLeft() + gq0Var.getPaddingRight());
        int paddingBottom = i16 - gq0Var.getPaddingBottom();
        int childCount = gq0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = gq0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                org.telegram.ui.Components.zd0 zd0Var = photoViewer.f41599z2;
                if (childAt == zd0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(gq0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f41601z4) {
                    if (zd0Var != null && zd0Var.getVisibility() == 0) {
                        if (photoViewer.E2) {
                            view = photoViewer.D2;
                        } else {
                            view = photoViewer.C2;
                        }
                        q10 = view.getMeasuredWidth();
                        o10 = view.getMeasuredHeight();
                    } else {
                        q10 = photoViewer.D4.q();
                        o10 = photoViewer.D4.o();
                    }
                    if (q10 == 0 || o10 == 0) {
                        q10 = paddingLeft;
                        o10 = paddingBottom;
                    }
                    photoViewer.f41601z4.measure(View.MeasureSpec.makeMeasureSpec(q10, 1073741824), View.MeasureSpec.makeMeasureSpec(o10, 1073741824));
                } else if (!photoViewer.V1.f13144f.l(childAt) && !photoViewer.W1.f13144f.l(childAt)) {
                    if (childAt == photoViewer.U1) {
                        if (photoViewer.f41489n2) {
                            if (gq0Var.m0) {
                                i14 = i11 + i13;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m)) - i14;
                                ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i14 = i11;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.m1.c() && (org.telegram.messenger.g0.Q1() || paddingBottom > paddingLeft)) {
                            i14 = i11 + i13;
                            gq0Var.m0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            gq0Var.m0 = false;
                            i14 = i11;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m)) - i14;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i14;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Z1 && childAt != photoViewer.R0) {
                        if (childAt == photoViewer.W1.N) {
                            childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m), 1073741824));
                        } else {
                            gq0Var.measureChildWithMargins(childAt, i12, 0, i10, 0);
                        }
                    } else {
                        childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m), 1073741824));
                    }
                } else if (photoViewer.f41531s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.g0.E) {
                    if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(320.0f), paddingBottom - org.telegram.messenger.g0.f22602m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.g0.f22602m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.g0.f22603n, 1073741824));
                }
            }
            i17++;
            z10 = true;
            gq0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f45703l0) {
            return;
        }
        super.requestLayout();
    }
}
