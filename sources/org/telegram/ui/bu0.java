package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;

public final class bu0 extends FrameLayout {

    public final PhotoViewer f36886a;

    public bu0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f36886a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        rn rnVar = this.f36886a.f35652h4;
        if (rnVar != null) {
            rnVar.Q7();
            UndoView undoView = rnVar.f42229u3;
            if (undoView == null || undoView.getVisibility() != 0) {
                return;
            }
            canvas.save();
            View view = (View) undoView.getParent();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            canvas.translate(undoView.getX(), undoView.getY());
            undoView.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        PhotoViewer photoViewer = this.f36886a;
        if (!photoViewer.f35735r && photoViewer.Y1 != 1 && photoViewer.f35702n1 && photoViewer.B2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.B2.X(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        PhotoViewer photoViewer = this.f36886a;
        if (photoViewer.M.y()) {
            photoViewer.M.f(false);
        }
        if (photoViewer.H1()) {
            photoViewer.E0(true);
            return false;
        }
        if (kt.q().E) {
            kt.q().o();
            return false;
        }
        PhotoViewer.t1().G0(true, false);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        MessageObject messageObject;
        PhotoViewer photoViewer = this.f36886a;
        if (photoViewer.f35651h3 && photoViewer.L3) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                AndroidUtilities.cancelRunOnUIThread(photoViewer.f35757t2);
            } else if (actionMasked == 1 || actionMasked == 3) {
                messageObject = photoViewer.P4;
                if (messageObject != null || !messageObject.isSponsored()) {
                    photoViewer.s2();
                }
            } else if (actionMasked == 5) {
                AndroidUtilities.cancelRunOnUIThread(photoViewer.f35757t2);
            } else if (actionMasked == 6) {
                messageObject = photoViewer.P4;
                if (messageObject != null) {
                    photoViewer.s2();
                } else {
                    photoViewer.s2();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f36886a.N8) {
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
        PhotoViewer photoViewer = this.f36886a;
        photoViewer.f35805y4.onAttachedToWindow();
        photoViewer.f35796x4.onAttachedToWindow();
        photoViewer.f35814z4.onAttachedToWindow();
        photoViewer.O5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f36886a;
        photoViewer.f35805y4.onDetachedFromWindow();
        photoViewer.f35796x4.onDetachedFromWindow();
        photoViewer.f35814z4.onDetachedFromWindow();
        photoViewer.O5 = false;
        photoViewer.P5 = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        PhotoViewer photoViewer = this.f36886a;
        Paint paint = photoViewer.I0;
        jh.a3 a3Var = photoViewer.f35715o5;
        if (a3Var == null || a3Var.getVisibility() != 0) {
            canvas2 = canvas;
        } else {
            View view = (View) photoViewer.f35715o5.getParent();
            float fMin = Math.min(photoViewer.f35715o5.getAlpha(), view != null ? view.getAlpha() : 1.0f);
            if (fMin > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (fMin * 255.0f), 31);
                canvas2 = canvas;
                photoViewer.f35715o5.draw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
        }
        if (photoViewer.f35619e) {
            paint.setAlpha(photoViewer.H0.getAlpha());
            canvas2.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + photoViewer.f35712o2.bottom, paint);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f36886a.f35619e && super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f36886a;
        photoViewer.f35610d0.layout(getPaddingLeft(), 0, photoViewer.f35610d0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35610d0.getMeasuredHeight());
        photoViewer.f35583a0.layout(getPaddingLeft(), 0, photoViewer.f35583a0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35583a0.getMeasuredHeight());
        photoViewer.f35630f0.layout(getPaddingLeft(), photoViewer.f35583a0.getMeasuredHeight(), photoViewer.f35630f0.getMeasuredWidth(), photoViewer.f35630f0.getMeasuredHeight() + photoViewer.f35583a0.getMeasuredHeight());
        photoViewer.P5 = true;
        if (z10) {
            if (!photoViewer.Q5) {
                float fR2 = photoViewer.r2(true);
                photoViewer.W5 = fR2;
                photoViewer.T5 = 0.0f;
                photoViewer.U5 = 0.0f;
                photoViewer.w3(fR2);
            }
            CheckBox checkBox = photoViewer.J0;
            if (checkBox != null) {
                checkBox.post(new lt0(this, 1));
            }
        }
        if (photoViewer.Q5) {
            photoViewer.N2();
            photoViewer.Q5 = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.f36886a;
        if (!photoViewer.f35745s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f35712o2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f35610d0.getLayoutParams();
        photoViewer.f35610d0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f35583a0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f35630f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f35639g0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f36886a;
        return photoViewer.f35619e && PhotoViewer.k(photoViewer, motionEvent);
    }

    @Override
    public final void requestLayout() {
        super.requestLayout();
        AndroidUtilities.printStackTrace("requestLayout");
    }
}
