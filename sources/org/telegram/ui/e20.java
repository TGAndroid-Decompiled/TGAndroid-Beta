package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class e20 extends FrameLayout {
    public final Rect f45166a;
    public final RectF f45167b;
    public final Path f45168c;
    public final e40 d;

    public e20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = e40Var;
        this.f45166a = new Rect();
        this.f45167b = new RectF();
        this.f45168c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        e40 e40Var = this.d;
        d20 d20Var = e40Var.f45219i1;
        if (e40Var.U3 != 1.0f) {
            if (e40Var.O4 != null && e40Var.S4) {
                canvas.save();
                float measuredHeight = (e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.O4.getAvatarImageView().getMeasuredHeight());
                float f10 = e40Var.U3;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - e40Var.U3) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                e40Var.O4.getAvatarWavesDrawable().a(canvas, e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                e40Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.O4.getAvatarImageView().t(L, L, i7, i7);
                e40Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.O4.getAvatarImageView().setRoundRadius(e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (e40Var.R4 != null && e40Var.Q4 == null && e40Var.F4) {
                canvas.save();
                float measuredHeight2 = (e40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f11 = e40Var.U3;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - e40Var.U3) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                e40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.R4.getAvatarImageView().t(L2, L2, i10, i10);
                e40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.R4.getAvatarImageView().setRoundRadius(e40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        d20Var.setAlpha(e40Var.U3);
        Path path = this.f45168c;
        path.reset();
        RectF rectF = this.f45167b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (d20Var.f38403i1) {
            for (int i11 = 0; i11 < d20Var.getChildCount(); i11++) {
                childAt = d20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.rf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = e40Var.Q4) != null && yVar.f39743w && !e40Var.f45285w4) {
            canvas.save();
            Rect rect = this.f45166a;
            rect.setEmpty();
            d20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-d20Var.getMeasuredWidth())) {
                i12 += d20Var.getMeasuredWidth() * 2;
            } else if (i12 > d20Var.getMeasuredWidth()) {
                i12 -= d20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            e40Var.Q4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f28624b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
