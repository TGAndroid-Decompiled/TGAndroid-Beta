package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class t extends FrameLayout {
    public boolean a;
    public final RectF b;
    public Boolean c;
    public final ThemeEditorView.EditorAlert d;

    public t(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.d = editorAlert;
        this.a = false;
        this.b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        boolean z;
        boolean z2;
        ThemeEditorView.EditorAlert editorAlert = this.d;
        Drawable drawable = editorAlert.x1;
        int L = gl.L(6.0f) + (editorAlert.y1 - editorAlert.t0);
        int L2 = (editorAlert.y1 - editorAlert.t0) - gl.L(13.0f);
        int L3 = gl.L(30.0f) + getMeasuredHeight();
        int i2 = editorAlert.t0;
        int i3 = L3 + i2;
        boolean z3 = true;
        if (!editorAlert.W) {
            int i4 = gl.m;
            L2 += i4;
            L += i4;
            i3 -= i4;
            int i5 = i4 << 1;
            if (L2 + i2 < i5) {
                int min = Math.min(i4, (i5 - L2) - i2);
                L2 -= min;
                i3 += min;
                f = 1.0f - Math.min(1.0f, (min << 1) / gl.m);
            } else {
                f = 1.0f;
            }
            int i6 = editorAlert.t0;
            int i7 = L2 + i6;
            int i8 = gl.m;
            if (i7 < i8) {
                i = Math.min(i8, (i8 - L2) - i6);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            f = 1.0f;
        }
        drawable.setBounds(0, L2, getMeasuredWidth(), i3);
        drawable.draw(canvas);
        int i9 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        RectF rectF = this.b;
        if (i9 != 0) {
            bkb.s0.setColor(-1);
            rectF.set(editorAlert.u0, editorAlert.t0 + L2, getMeasuredWidth() - editorAlert.u0, gl.L(24.0f) + editorAlert.t0 + L2);
            canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
        }
        int L4 = gl.L(36.0f);
        rectF.set((getMeasuredWidth() - L4) / 2, L, (getMeasuredWidth() + L4) / 2, gl.L(4.0f) + L);
        bkb.s0.setColor(-1973016);
        bkb.s0.setAlpha((int) (editorAlert.m1.getAlpha() * 255.0f));
        canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        if (i > 0) {
            bkb.s0.setColor(bkb.w0(null, bkb.g5, false));
            canvas.drawRect(editorAlert.u0, gl.m - i, getMeasuredWidth() - editorAlert.u0, gl.m, bkb.s0);
        }
        if (i > gl.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.c;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        int i10 = bkb.g5;
        int i11 = ThemeEditorView.EditorAlert.G1;
        if (gl.B(bkb.v0(i10, editorAlert.J0)) > 0.721f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gl.B(bkb.v(bkb.v0(bkb.r8, editorAlert.J0), 855638016)) <= 0.721f) {
            z3 = false;
        }
        this.c = Boolean.valueOf(z);
        if (!z) {
            z2 = z3;
        }
        gl.o3(editorAlert.getWindow(), z2);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ThemeEditorView.EditorAlert editorAlert = this.d;
            if (editorAlert.y1 != 0 && motionEvent.getY() < editorAlert.y1) {
                editorAlert.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = ThemeEditorView.EditorAlert.G1;
        this.d.G0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ThemeEditorView.EditorAlert editorAlert = this.d;
        u uVar = editorAlert.m1;
        int i3 = ThemeEditorView.EditorAlert.G1;
        if (!editorAlert.W) {
            this.a = true;
            int i4 = editorAlert.u0;
            setPadding(i4, gl.m, i4, 0);
            this.a = false;
        }
        int L = (gl.L(8.0f) + (size2 - gl.m)) - Math.min(size, size2 - gl.m);
        if (uVar.getPaddingTop() != L) {
            this.a = true;
            uVar.getPaddingTop();
            uVar.setPadding(0, L, 0, gl.L(48.0f));
            if (editorAlert.l1.getVisibility() == 0) {
                editorAlert.setScrollOffsetY(uVar.getPaddingTop());
                editorAlert.A1 = 0;
            }
            this.a = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
