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
public final class au0 extends FrameLayout {
    public final PhotoViewer f36555a;

    public au0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f36555a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        qn qnVar = this.f36555a.f35649h4;
        if (qnVar != null) {
            qnVar.Q7();
            UndoView undoView = qnVar.f42093u3;
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
        PhotoViewer photoViewer = this.f36555a;
        if (!photoViewer.f35732r && photoViewer.Y1 != 1 && photoViewer.f35699n1 && photoViewer.B2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.B2.X(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f36555a;
            if (photoViewer.M.y()) {
                photoViewer.M.f(false);
            }
            if (photoViewer.H1()) {
                photoViewer.D0(true);
                return false;
            } else if (ht.q().E) {
                ht.q().o();
                return false;
            } else {
                PhotoViewer.t1().F0(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.au0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f36555a.N8) {
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
        PhotoViewer photoViewer = this.f36555a;
        photoViewer.f35802y4.onAttachedToWindow();
        photoViewer.f35792x4.onAttachedToWindow();
        photoViewer.f35811z4.onAttachedToWindow();
        photoViewer.O5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f36555a;
        photoViewer.f35802y4.onDetachedFromWindow();
        photoViewer.f35792x4.onDetachedFromWindow();
        photoViewer.f35811z4.onDetachedFromWindow();
        photoViewer.O5 = false;
        photoViewer.P5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.au0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36555a.f35616e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.f36555a;
        photoViewer.f35607d0.layout(getPaddingLeft(), 0, photoViewer.f35607d0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35607d0.getMeasuredHeight());
        photoViewer.f35580a0.layout(getPaddingLeft(), 0, photoViewer.f35580a0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35580a0.getMeasuredHeight());
        photoViewer.f35627f0.layout(getPaddingLeft(), photoViewer.f35580a0.getMeasuredHeight(), photoViewer.f35627f0.getMeasuredWidth(), photoViewer.f35627f0.getMeasuredHeight() + photoViewer.f35580a0.getMeasuredHeight());
        photoViewer.P5 = true;
        if (z10) {
            if (!photoViewer.Q5) {
                float r22 = photoViewer.r2(true);
                photoViewer.W5 = r22;
                photoViewer.T5 = 0.0f;
                photoViewer.U5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.J0;
            if (checkBox != null) {
                checkBox.post(new kt0(this, 1));
            }
        }
        if (photoViewer.Q5) {
            photoViewer.N2();
            photoViewer.Q5 = false;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        PhotoViewer photoViewer = this.f36555a;
        if (!photoViewer.f35742s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i11 = AndroidUtilities.displaySize.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.f35709o2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f35607d0.getLayoutParams();
        photoViewer.f35607d0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f35580a0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f35627f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f35636g0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f36555a;
        if (photoViewer.f35616e && PhotoViewer.k(photoViewer, motionEvent)) {
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
