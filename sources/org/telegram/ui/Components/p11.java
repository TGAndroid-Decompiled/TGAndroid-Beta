package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class p11 extends FrameLayout {
    public boolean f25981a;
    public final RectF f25982b;
    public Boolean f25983c;
    public final ThemeEditorView.EditorAlert d;

    public p11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f25981a = false;
        this.f25982b = new RectF();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p11.onDraw(android.graphics.Canvas):void");
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
        q11 q11Var = editorAlert.f21305c;
        z10 = ((org.telegram.ui.ActionBar.h3) editorAlert).isFullscreen;
        if (!z10) {
            this.f25981a = true;
            i12 = ((org.telegram.ui.ActionBar.h3) editorAlert).backgroundPaddingLeft;
            int i14 = AndroidUtilities.statusBarHeight;
            i13 = ((org.telegram.ui.ActionBar.h3) editorAlert).backgroundPaddingLeft;
            setPadding(i12, i14, i13, 0);
            this.f25981a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (q11Var.getPaddingTop() != dp) {
            this.f25981a = true;
            q11Var.getPaddingTop();
            q11Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f21304b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(q11Var.getPaddingTop());
                editorAlert.G = 0;
            }
            this.f25981a = false;
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
        if (this.f25981a) {
            return;
        }
        super.requestLayout();
    }
}
