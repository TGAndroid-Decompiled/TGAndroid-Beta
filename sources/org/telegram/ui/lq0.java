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
public final class lq0 extends FrameLayout {
    public final PhotoViewer f47413a;

    public lq0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f47413a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wm wmVar = this.f47413a.f41481m4;
        if (wmVar != null) {
            wmVar.f8();
            UndoView undoView = wmVar.N3;
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
        PhotoViewer photoViewer = this.f47413a;
        if (!photoViewer.f41522r && photoViewer.f41402d2 != 1 && photoViewer.f41533s1 && photoViewer.G2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.G2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f47413a;
            if (photoViewer.R.x()) {
                photoViewer.R.f(false);
            }
            if (photoViewer.K1()) {
                photoViewer.F0(true);
                return false;
            } else if (is.p().E) {
                is.p().n();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f47413a.T8) {
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
        PhotoViewer photoViewer = this.f47413a;
        photoViewer.D4.P();
        photoViewer.C4.P();
        photoViewer.E4.P();
        photoViewer.T5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f47413a;
        photoViewer.D4.R();
        photoViewer.C4.R();
        photoViewer.E4.R();
        photoViewer.T5 = false;
        photoViewer.U5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lq0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47413a.f41409e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.f47413a;
        photoViewer.f41445i0.layout(getPaddingLeft(), 0, photoViewer.f41445i0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41445i0.getMeasuredHeight());
        photoViewer.f41420f0.layout(getPaddingLeft(), 0, photoViewer.f41420f0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41420f0.getMeasuredHeight());
        photoViewer.f41462k0.layout(getPaddingLeft(), photoViewer.f41420f0.getMeasuredHeight(), photoViewer.f41462k0.getMeasuredWidth(), photoViewer.f41462k0.getMeasuredHeight() + photoViewer.f41420f0.getMeasuredHeight());
        photoViewer.U5 = true;
        if (z10) {
            if (!photoViewer.V5) {
                float u22 = photoViewer.u2(true);
                photoViewer.f41388b6 = u22;
                photoViewer.Y5 = 0.0f;
                photoViewer.Z5 = 0.0f;
                photoViewer.z3(u22);
            }
            CheckBox checkBox = photoViewer.O0;
            if (checkBox != null) {
                checkBox.post(new xp0(this, 1));
            }
        }
        if (photoViewer.V5) {
            photoViewer.Q2();
            photoViewer.V5 = false;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        PhotoViewer photoViewer = this.f47413a;
        if (!photoViewer.f41531s && org.telegram.messenger.g0.f22615y) {
            int i11 = org.telegram.messenger.g0.f22608q.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += org.telegram.messenger.g0.f22602m;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.f41542t2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f41445i0.getLayoutParams();
        photoViewer.f41445i0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f41420f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f41462k0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f41470l0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f47413a;
        if (photoViewer.f41409e && PhotoViewer.d(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
