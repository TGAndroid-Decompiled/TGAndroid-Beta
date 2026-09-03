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
public final class pu0 extends FrameLayout {
    public final PhotoViewer f37233a;

    public pu0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f37233a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zn znVar = this.f37233a.f31746i4;
        if (znVar != null) {
            znVar.Q7();
            UndoView undoView = znVar.f40775v3;
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
        PhotoViewer photoViewer = this.f37233a;
        if (!photoViewer.f31822r && photoViewer.Z1 != 1 && photoViewer.f31796o1 && photoViewer.C2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.C2.W(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f37233a;
            if (photoViewer.N.y()) {
                photoViewer.N.f(false);
            }
            if (photoViewer.H1()) {
                photoViewer.E0(true);
                return false;
            } else if (rt.q().E) {
                rt.q().o();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pu0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f37233a.O8) {
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
        PhotoViewer photoViewer = this.f37233a;
        photoViewer.z4.onAttachedToWindow();
        photoViewer.f31892y4.onAttachedToWindow();
        photoViewer.A4.onAttachedToWindow();
        photoViewer.P5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f37233a;
        photoViewer.z4.onDetachedFromWindow();
        photoViewer.f31892y4.onDetachedFromWindow();
        photoViewer.A4.onDetachedFromWindow();
        photoViewer.P5 = false;
        photoViewer.Q5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pu0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f37233a.e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f37233a;
        photoViewer.f31706e0.layout(getPaddingLeft(), 0, photoViewer.f31706e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f31706e0.getMeasuredHeight());
        photoViewer.f31679b0.layout(getPaddingLeft(), 0, photoViewer.f31679b0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f31679b0.getMeasuredHeight());
        photoViewer.f31724g0.layout(getPaddingLeft(), photoViewer.f31679b0.getMeasuredHeight(), photoViewer.f31724g0.getMeasuredWidth(), photoViewer.f31724g0.getMeasuredHeight() + photoViewer.f31679b0.getMeasuredHeight());
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
                checkBox.post(new yt0(this, 1));
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
        PhotoViewer photoViewer = this.f37233a;
        if (!photoViewer.f31832s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f31806p2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f31706e0.getLayoutParams();
        photoViewer.f31706e0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f31679b0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f31724g0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f31733h0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f37233a;
        if (photoViewer.e && PhotoViewer.k(photoViewer, motionEvent)) {
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
