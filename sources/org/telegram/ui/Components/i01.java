package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class i01 extends FrameLayout {
    public boolean f29256a;
    public final RectF f29257b;
    public Boolean f29258c;
    public final ThemeEditorView.EditorAlert d;

    public i01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f29256a = false;
        this.f29257b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i01.onDraw(android.graphics.Canvas):void");
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        ThemeEditorView.EditorAlert.s(this.d);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        j01 j01Var = editorAlert.f26566c;
        z10 = ((org.telegram.ui.ActionBar.f3) editorAlert).isFullscreen;
        if (!z10) {
            this.f29256a = true;
            i11 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            int i13 = AndroidUtilities.statusBarHeight;
            i12 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            setPadding(i11, i13, i12, 0);
            this.f29256a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (j01Var.getPaddingTop() != dp) {
            this.f29256a = true;
            j01Var.getPaddingTop();
            j01Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f26565b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(j01Var.getPaddingTop());
                editorAlert.C = 0;
            }
            this.f29256a = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
        if (this.f29256a) {
            return;
        }
        super.requestLayout();
    }
}
