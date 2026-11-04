package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class hz0 extends FrameLayout {
    public boolean f34550a;
    public final RectF f34551b;
    public Boolean f34552c;
    public final ThemeEditorView.EditorAlert d;

    public hz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f34550a = false;
        this.f34551b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        boolean z10;
        boolean z11;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.f31664v1;
        int L = org.telegram.messenger.g0.L(6.0f) + (editorAlert.f31665w1 - editorAlert.f28617t0);
        int L2 = (editorAlert.f31665w1 - editorAlert.f28617t0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight();
        int i10 = editorAlert.f28617t0;
        int i11 = L3 + i10;
        boolean z12 = false;
        if (!editorAlert.W) {
            int i12 = org.telegram.messenger.g0.f22602m;
            L2 += i12;
            L += i12;
            i11 -= i12;
            int i13 = i12 * 2;
            if (L2 + i10 < i13) {
                int min = Math.min(i12, (i13 - L2) - i10);
                L2 -= min;
                i11 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22602m);
            } else {
                f10 = 1.0f;
            }
            int i14 = editorAlert.f28617t0;
            int i15 = L2 + i14;
            int i16 = org.telegram.messenger.g0.f22602m;
            if (i15 < i16) {
                i3 = Math.min(i16, (i16 - L2) - i14);
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
            f10 = 1.0f;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f34551b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(-1);
            rectF.set(editorAlert.f28618u0, editorAlert.f28617t0 + L2, getMeasuredWidth() - editorAlert.f28618u0, org.telegram.messenger.g0.L(24.0f) + editorAlert.f28617t0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
        }
        int L4 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L);
        org.telegram.ui.ActionBar.k6.f28171t0.setColor(-1973016);
        org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (editorAlert.k1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
        if (i3 > 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
            canvas.drawRect(editorAlert.f28618u0, org.telegram.messenger.g0.f22602m - i3, getMeasuredWidth() - editorAlert.f28618u0, org.telegram.messenger.g0.f22602m, org.telegram.ui.ActionBar.k6.f28171t0);
        }
        if (i3 > org.telegram.messenger.g0.f22602m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f34552c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        int i18 = org.telegram.ui.ActionBar.k6.f27954h5;
        int i19 = ThemeEditorView.EditorAlert.E1;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i18, editorAlert.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, editorAlert.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f34552c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.s3(editorAlert.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.f31665w1 != 0 && motionEvent.getY() < editorAlert.f31665w1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        iz0 iz0Var = editorAlert.k1;
        int i11 = ThemeEditorView.EditorAlert.E1;
        if (!editorAlert.W) {
            this.f34550a = true;
            int i12 = editorAlert.f28618u0;
            setPadding(i12, org.telegram.messenger.g0.f22602m, i12, 0);
            this.f34550a = false;
        }
        int L = (org.telegram.messenger.g0.L(8.0f) + (size2 - org.telegram.messenger.g0.f22602m)) - Math.min(size, size2 - org.telegram.messenger.g0.f22602m);
        if (iz0Var.getPaddingTop() != L) {
            this.f34550a = true;
            iz0Var.getPaddingTop();
            iz0Var.setPadding(0, L, 0, org.telegram.messenger.g0.L(48.0f));
            if (editorAlert.f31654j1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(iz0Var.getPaddingTop());
                editorAlert.f31667y1 = 0;
            }
            this.f34550a = false;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34550a) {
            return;
        }
        super.requestLayout();
    }
}
