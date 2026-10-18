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
    public final PhotoViewer f38631a;

    public ku0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f38631a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        sn snVar = this.f38631a.l4;
        if (snVar != null) {
            snVar.T7();
            UndoView undoView = snVar.y3;
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
        PhotoViewer photoViewer = this.f38631a;
        if (!photoViewer.f33378r && photoViewer.f33250c2 != 1 && photoViewer.f33380r1 && photoViewer.F2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.F2.W(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f38631a;
            if (photoViewer.Q.x()) {
                photoViewer.Q.f(false);
            }
            if (photoViewer.I1()) {
                photoViewer.E0(true);
                return false;
            } else if (gt.q().E) {
                gt.q().o();
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
        if (this.f38631a.S8) {
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
        PhotoViewer photoViewer = this.f38631a;
        photoViewer.C4.onAttachedToWindow();
        photoViewer.B4.onAttachedToWindow();
        photoViewer.D4.onAttachedToWindow();
        photoViewer.S5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f38631a;
        photoViewer.C4.onDetachedFromWindow();
        photoViewer.B4.onDetachedFromWindow();
        photoViewer.D4.onDetachedFromWindow();
        photoViewer.S5 = false;
        photoViewer.T5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ku0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f38631a.e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f38631a;
        photoViewer.f33292h0.layout(getPaddingLeft(), 0, photoViewer.f33292h0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f33292h0.getMeasuredHeight());
        photoViewer.f33266e0.layout(getPaddingLeft(), 0, photoViewer.f33266e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f33266e0.getMeasuredHeight());
        photoViewer.f33310j0.layout(getPaddingLeft(), photoViewer.f33266e0.getMeasuredHeight(), photoViewer.f33310j0.getMeasuredWidth(), photoViewer.f33310j0.getMeasuredHeight() + photoViewer.f33266e0.getMeasuredHeight());
        photoViewer.T5 = true;
        if (z10) {
            if (!photoViewer.U5) {
                float r22 = photoViewer.r2(true);
                photoViewer.f33234a6 = r22;
                photoViewer.X5 = 0.0f;
                photoViewer.Y5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.N0;
            if (checkBox != null) {
                checkBox.post(new ut0(this, 1));
            }
        }
        if (photoViewer.U5) {
            photoViewer.N2();
            photoViewer.U5 = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.f38631a;
        if (!photoViewer.f33388s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f33391s2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f33292h0.getLayoutParams();
        photoViewer.f33292h0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f33266e0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f33310j0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f33319k0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f38631a;
        if (photoViewer.e && PhotoViewer.k(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
