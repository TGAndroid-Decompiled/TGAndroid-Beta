package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class n01 extends FrameLayout {
    public boolean f28629a;
    public final RectF f28630b;
    public Boolean f28631c;
    public final ThemeEditorView.EditorAlert d;

    public n01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.f28629a = false;
        this.f28630b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.f24232u1;
        int L = org.telegram.messenger.i0.L(6.0f) + (editorAlert.f24233v1 - editorAlert.f21615s0);
        int L2 = (editorAlert.f24233v1 - editorAlert.f21615s0) - org.telegram.messenger.i0.L(13.0f);
        int L3 = org.telegram.messenger.i0.L(30.0f) + getMeasuredHeight();
        int i11 = editorAlert.f21615s0;
        int i12 = L3 + i11;
        boolean z12 = false;
        if (!editorAlert.V) {
            int i13 = org.telegram.messenger.i0.f16166m;
            L2 += i13;
            L += i13;
            i12 -= i13;
            int i14 = i13 * 2;
            if (L2 + i11 < i14) {
                int min = Math.min(i13, (i14 - L2) - i11);
                L2 -= min;
                i12 += min;
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16166m);
            } else {
                f7 = 1.0f;
            }
            int i15 = editorAlert.f21615s0;
            int i16 = L2 + i15;
            int i17 = org.telegram.messenger.i0.f16166m;
            if (i16 < i17) {
                i10 = Math.min(i17, (i17 - L2) - i15);
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i12);
        drawable.draw(canvas);
        int i18 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        RectF rectF = this.f28630b;
        if (i18 != 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(-1);
            rectF.set(editorAlert.f21616t0, editorAlert.f21615s0 + L2, getMeasuredWidth() - editorAlert.f21616t0, org.telegram.messenger.i0.L(24.0f) + editorAlert.f21615s0 + L2);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21218t0);
        }
        int L4 = org.telegram.messenger.i0.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + L);
        org.telegram.ui.ActionBar.t6.f21218t0.setColor(-1973016);
        org.telegram.ui.ActionBar.t6.f21218t0.setAlpha((int) (editorAlert.f24222j1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
            canvas.drawRect(editorAlert.f21616t0, org.telegram.messenger.i0.f16166m - i10, getMeasuredWidth() - editorAlert.f21616t0, org.telegram.messenger.i0.f16166m, org.telegram.ui.ActionBar.t6.f21218t0);
        }
        if (i10 > org.telegram.messenger.i0.f16166m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f28631c;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        int i19 = org.telegram.ui.ActionBar.t6.f21002h5;
        int i20 = ThemeEditorView.EditorAlert.D1;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i19, editorAlert.I0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, editorAlert.I0), 855638016)) > 0.721f) {
            z12 = true;
        }
        this.f28631c = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.i0.r3(editorAlert.getWindow(), z11);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.f24233v1 != 0 && motionEvent.getY() < editorAlert.f24233v1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ThemeEditorView.EditorAlert.I0(this.d);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        o01 o01Var = editorAlert.f24222j1;
        int i12 = ThemeEditorView.EditorAlert.D1;
        if (!editorAlert.V) {
            this.f28629a = true;
            int i13 = editorAlert.f21616t0;
            setPadding(i13, org.telegram.messenger.i0.f16166m, i13, 0);
            this.f28629a = false;
        }
        int L = (org.telegram.messenger.i0.L(8.0f) + (size2 - org.telegram.messenger.i0.f16166m)) - Math.min(size, size2 - org.telegram.messenger.i0.f16166m);
        if (o01Var.getPaddingTop() != L) {
            this.f28629a = true;
            o01Var.getPaddingTop();
            o01Var.setPadding(0, L, 0, org.telegram.messenger.i0.L(48.0f));
            if (editorAlert.f24221i1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(o01Var.getPaddingTop());
                editorAlert.f24235x1 = 0;
            }
            this.f28629a = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
        if (this.f28629a) {
            return;
        }
        super.requestLayout();
    }
}
