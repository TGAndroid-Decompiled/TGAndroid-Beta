package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;
public final class j21 extends FrameLayout {
    public boolean f27527a;
    public final RectF f27528b;
    public Boolean f27529c;
    public final ThemeEditorView.EditorAlert d;

    public j21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f27527a = false;
        this.f27528b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        float f7;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.f24361y;
        int i24 = editorAlert.E;
        i10 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i24 - i10);
        int i25 = editorAlert.E;
        i11 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
        int dp2 = (i25 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(30.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
        int i26 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.e3) editorAlert).isFullscreen;
        boolean z13 = false;
        if (!z10) {
            int i27 = AndroidUtilities.statusBarHeight;
            dp2 += i27;
            dp += i27;
            i26 -= i27;
            i20 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
            int i28 = i20 + dp2;
            int i29 = AndroidUtilities.statusBarHeight;
            int i30 = i29 * 2;
            if (i28 < i30) {
                i23 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
                int min = Math.min(i29, (i30 - dp2) - i23);
                dp2 -= min;
                i26 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
            } else {
                f7 = 1.0f;
            }
            i21 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
            int i31 = i21 + dp2;
            int i32 = AndroidUtilities.statusBarHeight;
            if (i31 < i32) {
                i22 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
                i13 = Math.min(i32, (i32 - dp2) - i22);
            } else {
                i13 = 0;
            }
        } else {
            i13 = 0;
            f7 = 1.0f;
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i26);
        drawable.draw(canvas);
        int i33 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        RectF rectF = this.f27528b;
        if (i33 != 0) {
            org.telegram.ui.ActionBar.h6.f21076t0.setColor(-1);
            i16 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            i17 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
            int measuredWidth = getMeasuredWidth();
            i18 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            i19 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingTop;
            rectF.set(i16, i17 + dp2, measuredWidth - i18, AndroidUtilities.dp(24.0f) + i19 + dp2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21076t0);
        }
        int dp4 = AndroidUtilities.dp(36.0f);
        rectF.set((getMeasuredWidth() - dp4) / 2, dp, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp);
        org.telegram.ui.ActionBar.h6.f21076t0.setColor(-1973016);
        org.telegram.ui.ActionBar.h6.f21076t0.setAlpha((int) (editorAlert.f24353c.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21076t0);
        if (i13 > 0) {
            org.telegram.ui.ActionBar.h6.f21076t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
            i14 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            int measuredWidth2 = getMeasuredWidth();
            i15 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            canvas.drawRect(i14, AndroidUtilities.statusBarHeight - i13, measuredWidth2 - i15, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f21076t0);
        }
        if (i13 > AndroidUtilities.statusBarHeight / 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f27529c;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(editorAlert.getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(editorAlert.getThemedColor(org.telegram.ui.ActionBar.h6.f21065s8), 855638016)) > 0.721f) {
            z13 = true;
        }
        this.f27529c = Boolean.valueOf(z11);
        if (!z11) {
            z12 = z13;
        }
        AndroidUtilities.setLightStatusBar(editorAlert.getWindow(), z12);
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
        ThemeEditorView.EditorAlert.u(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        k21 k21Var = editorAlert.f24353c;
        z10 = ((org.telegram.ui.ActionBar.e3) editorAlert).isFullscreen;
        if (!z10) {
            this.f27527a = true;
            i12 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            int i14 = AndroidUtilities.statusBarHeight;
            i13 = ((org.telegram.ui.ActionBar.e3) editorAlert).backgroundPaddingLeft;
            setPadding(i12, i14, i13, 0);
            this.f27527a = false;
        }
        int dp = (AndroidUtilities.dp(8.0f) + (size2 - AndroidUtilities.statusBarHeight)) - Math.min(size, size2 - AndroidUtilities.statusBarHeight);
        if (k21Var.getPaddingTop() != dp) {
            this.f27527a = true;
            k21Var.getPaddingTop();
            k21Var.setPadding(0, dp, 0, AndroidUtilities.dp(48.0f));
            if (editorAlert.f24352b.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(k21Var.getPaddingTop());
                editorAlert.G = 0;
            }
            this.f27527a = false;
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
        if (this.f27527a) {
            return;
        }
        super.requestLayout();
    }
}
