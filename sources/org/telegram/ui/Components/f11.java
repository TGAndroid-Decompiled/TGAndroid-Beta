package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class f11 extends FrameLayout {
    public boolean f24748a;
    public final RectF f24749b;
    public Boolean f24750c;
    public final ThemeEditorView.EditorAlert d;

    public f11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f24748a = false;
        this.f24749b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f11.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.B != 0 && motionEvent.getY() < editorAlert.B) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.s(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        g11 g11Var = editorAlert.f23204c;
        z4 = ((org.telegram.ui.ActionBar.g3) editorAlert).isFullscreen;
        if (!z4) {
            this.f24748a = true;
            i12 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
            int i14 = AndroidUtilities.statusBarHeight;
            i13 = ((org.telegram.ui.ActionBar.g3) editorAlert).backgroundPaddingLeft;
            setPadding(i12, i14, i13, 0);
            this.f24748a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (g11Var.getPaddingTop() != dp) {
            this.f24748a = true;
            g11Var.getPaddingTop();
            g11Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f23203b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(g11Var.getPaddingTop());
                editorAlert.D = 0;
            }
            this.f24748a = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isDismissed() && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f24748a) {
            return;
        }
        super.requestLayout();
    }
}
