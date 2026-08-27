package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class k01 extends FrameLayout {

    public boolean f29871a;

    public final RectF f29872b;

    public Boolean f29873c;
    public final ThemeEditorView.EditorAlert d;

    public k01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f29871a = false;
        this.f29872b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fMin;
        int iMin;
        RectF rectF;
        boolean z10;
        Boolean bool;
        boolean z11;
        boolean z12;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.f26570y;
        int iDp = AndroidUtilities.dp(6.0f) + (editorAlert.A - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop);
        int iDp2 = (editorAlert.A - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
        int iDp3 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        if (!((org.telegram.ui.ActionBar.e3) editorAlert).isFullscreen) {
            int i10 = AndroidUtilities.statusBarHeight;
            iDp2 += i10;
            iDp += i10;
            iDp3 -= i10;
            int i11 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2;
            int i12 = AndroidUtilities.statusBarHeight;
            int i13 = i12 * 2;
            if (i11 < i13) {
                int iMin2 = Math.min(i12, (i13 - iDp2) - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop);
                iDp2 -= iMin2;
                iDp3 += iMin2;
                fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
            } else {
                fMin = 1.0f;
            }
            int i14 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2;
            int i15 = AndroidUtilities.statusBarHeight;
            iMin = i14 < i15 ? Math.min(i15, (i15 - iDp2) - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop) : 0;
            drawable.setBounds(0, iDp2, getMeasuredWidth(), iDp3);
            drawable.draw(canvas);
            rectF = this.f29872b;
            if (fMin != 1.0f) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(-1);
                rectF.set(((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            int iDp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - iDp4) / 2, iDp, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + iDp);
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(-1973016);
            org.telegram.ui.ActionBar.g6.f23333t0.setAlpha((int) (editorAlert.f26562c.getAlpha() * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            if (iMin > 0) {
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                canvas.drawRect(((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
            }
            if (iMin > AndroidUtilities.statusBarHeight / 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = this.f29873c;
            if (bool == null && bool.booleanValue() == z10) {
                return;
            }
            if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
            this.f29873c = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z11);
        }
        fMin = 1.0f;
        drawable.setBounds(0, iDp2, getMeasuredWidth(), iDp3);
        drawable.draw(canvas);
        rectF = this.f29872b;
        if (fMin != 1.0f) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(-1);
            rectF.set(((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop + iDp2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        int iDp5 = AndroidUtilities.dp(36.0f);
        rectF.set((getMeasuredWidth() - iDp5) / 2, iDp, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp);
        org.telegram.ui.ActionBar.g6.f23333t0.setColor(-1973016);
        org.telegram.ui.ActionBar.g6.f23333t0.setAlpha((int) (editorAlert.f26562c.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
        if (iMin > 0) {
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
            canvas.drawRect(((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f23333t0);
        }
        if (iMin > AndroidUtilities.statusBarHeight / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        bool = this.f29873c;
        if (bool == null) {
        }
        if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f) {
        }
        this.f29873c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.A != 0 && motionEvent.getY() < editorAlert.A) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.t(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        l01 l01Var = editorAlert.f26562c;
        if (!((org.telegram.ui.ActionBar.e3) editorAlert).isFullscreen) {
            this.f29871a = true;
            setPadding(((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft, 0);
            this.f29871a = false;
        }
        int iDp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (l01Var.getPaddingTop() != iDp) {
            this.f29871a = true;
            l01Var.getPaddingTop();
            l01Var.setPadding(0, iDp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f26561b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(l01Var.getPaddingTop());
                editorAlert.C = 0;
            }
            this.f29871a = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f29871a) {
            return;
        }
        super.requestLayout();
    }
}
