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
    public boolean f34406a;
    public final RectF f34407b;
    public Boolean f34408c;
    public final ThemeEditorView.EditorAlert d;

    public hz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f34406a = false;
        this.f34407b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        boolean z9;
        boolean z10;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.f31585u1;
        int L = org.telegram.messenger.g0.L(6.0f) + (editorAlert.f31586v1 - editorAlert.f28644s0);
        int L2 = (editorAlert.f31586v1 - editorAlert.f28644s0) - org.telegram.messenger.g0.L(13.0f);
        int L3 = org.telegram.messenger.g0.L(30.0f) + getMeasuredHeight();
        int i10 = editorAlert.f28644s0;
        int i11 = L3 + i10;
        boolean z11 = false;
        if (!editorAlert.V) {
            int i12 = org.telegram.messenger.g0.f22531m;
            L2 += i12;
            L += i12;
            i11 -= i12;
            int i13 = i12 * 2;
            if (L2 + i10 < i13) {
                int min = Math.min(i12, (i13 - L2) - i10);
                L2 -= min;
                i11 += min;
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22531m);
            } else {
                f10 = 1.0f;
            }
            int i14 = editorAlert.f28644s0;
            int i15 = L2 + i14;
            int i16 = org.telegram.messenger.g0.f22531m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - L2) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f34407b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(-1);
            rectF.set(editorAlert.f28645t0, editorAlert.f28644s0 + L2, getMeasuredWidth() - editorAlert.f28645t0, org.telegram.messenger.g0.L(24.0f) + editorAlert.f28644s0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28139t0);
        }
        int L4 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L);
        org.telegram.ui.ActionBar.k6.f28139t0.setColor(-1973016);
        org.telegram.ui.ActionBar.k6.f28139t0.setAlpha((int) (editorAlert.f31576j1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28139t0);
        if (i7 > 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false));
            canvas.drawRect(editorAlert.f28645t0, org.telegram.messenger.g0.f22531m - i7, getMeasuredWidth() - editorAlert.f28645t0, org.telegram.messenger.g0.f22531m, org.telegram.ui.ActionBar.k6.f28139t0);
        }
        if (i7 > org.telegram.messenger.g0.f22531m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f34408c;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        int i18 = org.telegram.ui.ActionBar.k6.f27921h5;
        int i19 = ThemeEditorView.EditorAlert.D1;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i18, editorAlert.I0)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, editorAlert.I0), 855638016)) > 0.721f) {
            z11 = true;
        }
        this.f34408c = Boolean.valueOf(z9);
        if (!z9) {
            z10 = z11;
        }
        org.telegram.messenger.g0.s3(editorAlert.getWindow(), z10);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.f31586v1 != 0 && motionEvent.getY() < editorAlert.f31586v1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        iz0 iz0Var = editorAlert.f31576j1;
        int i11 = ThemeEditorView.EditorAlert.D1;
        if (!editorAlert.V) {
            this.f34406a = true;
            int i12 = editorAlert.f28645t0;
            setPadding(i12, org.telegram.messenger.g0.f22531m, i12, 0);
            this.f34406a = false;
        }
        int L = (org.telegram.messenger.g0.L(8.0f) + (size2 - org.telegram.messenger.g0.f22531m)) - Math.min(size, size2 - org.telegram.messenger.g0.f22531m);
        if (iz0Var.getPaddingTop() != L) {
            this.f34406a = true;
            iz0Var.getPaddingTop();
            iz0Var.setPadding(0, L, 0, org.telegram.messenger.g0.L(48.0f));
            if (editorAlert.f31575i1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(iz0Var.getPaddingTop());
                editorAlert.f31588x1 = 0;
            }
            this.f34406a = false;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f34406a) {
            return;
        }
        super.requestLayout();
    }
}
