package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;
public final class fs0 extends FrameLayout {
    public final PhotoViewer f37341a;

    public fs0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f37341a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        un unVar = this.f37341a.l4;
        if (unVar != null) {
            unVar.Y7();
            UndoView undoView = unVar.M3;
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
        PhotoViewer photoViewer = this.f37341a;
        if (!photoViewer.f33582r && photoViewer.f33454c2 != 1 && photoViewer.f33584r1 && photoViewer.F2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.F2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f37341a;
            if (photoViewer.Q.x()) {
                photoViewer.Q.f(false);
            }
            if (photoViewer.K1()) {
                photoViewer.F0(true);
                return false;
            } else if (lt.p().E) {
                lt.p().n();
                return false;
            } else {
                PhotoViewer.v1().H0(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fs0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f37341a.S8) {
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
        PhotoViewer photoViewer = this.f37341a;
        photoViewer.C4.P();
        photoViewer.B4.P();
        photoViewer.D4.P();
        photoViewer.S5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f37341a;
        photoViewer.C4.R();
        photoViewer.B4.R();
        photoViewer.D4.R();
        photoViewer.S5 = false;
        photoViewer.T5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fs0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f37341a.e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f37341a;
        photoViewer.f33496h0.layout(getPaddingLeft(), 0, photoViewer.f33496h0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f33496h0.getMeasuredHeight());
        photoViewer.f33470e0.layout(getPaddingLeft(), 0, photoViewer.f33470e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f33470e0.getMeasuredHeight());
        photoViewer.f33514j0.layout(getPaddingLeft(), photoViewer.f33470e0.getMeasuredHeight(), photoViewer.f33514j0.getMeasuredWidth(), photoViewer.f33514j0.getMeasuredHeight() + photoViewer.f33470e0.getMeasuredHeight());
        photoViewer.T5 = true;
        if (z10) {
            if (!photoViewer.U5) {
                float u22 = photoViewer.u2(true);
                photoViewer.f33438a6 = u22;
                photoViewer.X5 = 0.0f;
                photoViewer.Y5 = 0.0f;
                photoViewer.z3(u22);
            }
            CheckBox checkBox = photoViewer.N0;
            if (checkBox != null) {
                checkBox.post(new rr0(this, 1));
            }
        }
        if (photoViewer.U5) {
            photoViewer.Q2();
            photoViewer.U5 = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.f37341a;
        if (!photoViewer.f33592s && org.telegram.messenger.i0.f16033y) {
            int i12 = org.telegram.messenger.i0.f16026q.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += org.telegram.messenger.i0.f16020m;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f33595s2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f33496h0.getLayoutParams();
        photoViewer.f33496h0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f33470e0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f33514j0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f33523k0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f37341a;
        if (photoViewer.e && PhotoViewer.d(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
