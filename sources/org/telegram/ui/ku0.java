package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;
public final class ku0 extends FrameLayout {
    public final PhotoViewer f38517a;

    public ku0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f38517a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xn xnVar = this.f38517a.f34298i4;
        if (xnVar != null) {
            xnVar.Q7();
            UndoView undoView = xnVar.f43378v3;
            if (undoView != null && undoView.getVisibility() == 0) {
                canvas.save();
                View view = (View) undoView.getParent();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                canvas.translate(undoView.getX(), undoView.getY());
                undoView.draw(canvas);
                canvas.restore();
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        PhotoViewer photoViewer = this.f38517a;
        if (!photoViewer.f34374r && photoViewer.Z1 != 1 && photoViewer.f34348o1 && photoViewer.C2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.C2.W(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f38517a;
            if (photoViewer.N.y()) {
                photoViewer.N.f(false);
            }
            if (photoViewer.H1()) {
                photoViewer.E0(true);
                return false;
            } else if (qt.q().E) {
                qt.q().o();
                return false;
            } else {
                PhotoViewer.t1().G0(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ku0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f38517a.O8) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.f38517a;
        photoViewer.z4.onAttachedToWindow();
        photoViewer.f34444y4.onAttachedToWindow();
        photoViewer.A4.onAttachedToWindow();
        photoViewer.P5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f38517a;
        photoViewer.z4.onDetachedFromWindow();
        photoViewer.f34444y4.onDetachedFromWindow();
        photoViewer.A4.onDetachedFromWindow();
        photoViewer.P5 = false;
        photoViewer.Q5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ku0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f38517a.f34257e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f38517a;
        photoViewer.f34258e0.layout(getPaddingLeft(), 0, photoViewer.f34258e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f34258e0.getMeasuredHeight());
        photoViewer.f34230b0.layout(getPaddingLeft(), 0, photoViewer.f34230b0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f34230b0.getMeasuredHeight());
        photoViewer.f34276g0.layout(getPaddingLeft(), photoViewer.f34230b0.getMeasuredHeight(), photoViewer.f34276g0.getMeasuredWidth(), photoViewer.f34276g0.getMeasuredHeight() + photoViewer.f34230b0.getMeasuredHeight());
        photoViewer.Q5 = true;
        if (z4) {
            if (!photoViewer.R5) {
                float r22 = photoViewer.r2(true);
                photoViewer.X5 = r22;
                photoViewer.U5 = 0.0f;
                photoViewer.V5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.K0;
            if (checkBox != null) {
                checkBox.post(new tt0(this, 1));
            }
        }
        if (photoViewer.R5) {
            photoViewer.N2();
            photoViewer.R5 = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.f38517a;
        if (!photoViewer.f34384s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f34358p2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f34258e0.getLayoutParams();
        photoViewer.f34258e0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f34230b0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f34276g0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f34285h0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f38517a;
        if (photoViewer.f34257e && PhotoViewer.k(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        super.requestLayout();
        AndroidUtilities.printStackTrace("requestLayout");
    }
}
