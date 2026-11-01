package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class a30 extends FrameLayout {
    public final Rect f35550a;
    public final RectF f35551b;
    public final Path f35552c;
    public final a50 d;

    public a30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = a50Var;
        this.f35550a = new Rect();
        this.f35551b = new RectF();
        this.f35552c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        a50 a50Var = this.d;
        z20 z20Var = a50Var.f35610i1;
        if (a50Var.U3 != 1.0f) {
            if (a50Var.O4 != null && a50Var.S4) {
                canvas.save();
                float measuredHeight = (a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / a50Var.O4.getAvatarImageView().getMeasuredHeight());
                float f7 = a50Var.U3;
                int L = (int) ((org.telegram.messenger.i0.L(13.0f) * f7) + ((1.0f - a50Var.U3) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                a50Var.O4.getAvatarWavesDrawable().a(canvas, a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                a50Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a50Var.O4.getAvatarImageView().t(L, L, i10, i10);
                a50Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                a50Var.O4.getAvatarImageView().setRoundRadius(a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (a50Var.R4 != null && a50Var.Q4 == null && a50Var.F4) {
                canvas.save();
                float measuredHeight2 = (a50Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / a50Var.R4.getAvatarImageView().getMeasuredHeight());
                float f10 = a50Var.U3;
                int L2 = (int) ((org.telegram.messenger.i0.L(13.0f) * f10) + ((1.0f - a50Var.U3) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                a50Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a50Var.R4.getAvatarImageView().t(L2, L2, i11, i11);
                a50Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                a50Var.R4.getAvatarImageView().setRoundRadius(a50Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        z20Var.setAlpha(a50Var.U3);
        Path path = this.f35552c;
        path.reset();
        RectF rectF = this.f35551b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (z20Var.f31293i1) {
            for (int i12 = 0; i12 < z20Var.getChildCount(); i12++) {
                childAt = z20Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.tg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = a50Var.Q4) != null && rVar.f31691w && !a50Var.f35678w4) {
            canvas.save();
            Rect rect = this.f35550a;
            rect.setEmpty();
            z20Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-z20Var.getMeasuredWidth())) {
                i13 += z20Var.getMeasuredWidth() * 2;
            } else if (i13 > z20Var.getMeasuredWidth()) {
                i13 -= z20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            a50Var.Q4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f21587b.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
