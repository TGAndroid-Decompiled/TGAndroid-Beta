package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class q11 extends FrameLayout {
    public boolean f27497a;
    public final RectF f27498b;
    public Boolean f27499c;
    public final ThemeEditorView.EditorAlert d;

    public q11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f27497a = false;
        this.f27498b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q11.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.E != 0 && motionEvent.getY() < editorAlert.E) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.s(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        r11 r11Var = editorAlert.f22441c;
        z10 = ((org.telegram.ui.ActionBar.f3) editorAlert).isFullscreen;
        if (!z10) {
            this.f27497a = true;
            i12 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            int i14 = AndroidUtilities.statusBarHeight;
            i13 = ((org.telegram.ui.ActionBar.f3) editorAlert).backgroundPaddingLeft;
            setPadding(i12, i14, i13, 0);
            this.f27497a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (r11Var.getPaddingTop() != dp) {
            this.f27497a = true;
            r11Var.getPaddingTop();
            r11Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f22440b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(r11Var.getPaddingTop());
                editorAlert.G = 0;
            }
            this.f27497a = false;
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
        if (this.f27497a) {
            return;
        }
        super.requestLayout();
    }
}
