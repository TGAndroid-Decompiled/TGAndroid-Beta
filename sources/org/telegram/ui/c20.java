package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class c20 extends FrameLayout {
    public final Rect f44529a;
    public final RectF f44530b;
    public final Path f44531c;
    public final c40 d;

    public c20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c40Var;
        this.f44529a = new Rect();
        this.f44530b = new RectF();
        this.f44531c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        c40 c40Var = this.d;
        b20 b20Var = c40Var.f44576i1;
        if (c40Var.U3 != 1.0f) {
            if (c40Var.O4 != null && c40Var.S4) {
                canvas.save();
                float measuredHeight = (c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.O4.getAvatarImageView().getMeasuredHeight());
                float f10 = c40Var.U3;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - c40Var.U3) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                c40Var.O4.getAvatarWavesDrawable().a(canvas, c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                c40Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.O4.getAvatarImageView().t(L, L, i7, i7);
                c40Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.O4.getAvatarImageView().setRoundRadius(c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c40Var.R4 != null && c40Var.Q4 == null && c40Var.F4) {
                canvas.save();
                float measuredHeight2 = (c40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f11 = c40Var.U3;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - c40Var.U3) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                c40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.R4.getAvatarImageView().t(L2, L2, i10, i10);
                c40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.R4.getAvatarImageView().setRoundRadius(c40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        b20Var.setAlpha(c40Var.U3);
        Path path = this.f44531c;
        path.reset();
        RectF rectF = this.f44530b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (b20Var.f38040i1) {
            for (int i11 = 0; i11 < b20Var.getChildCount(); i11++) {
                childAt = b20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.qf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = c40Var.Q4) != null && yVar.f39619w && !c40Var.f44642w4) {
            canvas.save();
            Rect rect = this.f44529a;
            rect.setEmpty();
            b20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-b20Var.getMeasuredWidth())) {
                i12 += b20Var.getMeasuredWidth() * 2;
            } else if (i12 > b20Var.getMeasuredWidth()) {
                i12 -= b20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            c40Var.Q4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f28616b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
