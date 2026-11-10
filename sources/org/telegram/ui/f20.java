package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class f20 extends FrameLayout {
    public final Rect f45492a;
    public final RectF f45493b;
    public final Path f45494c;
    public final f40 d;

    public f20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = f40Var;
        this.f45492a = new Rect();
        this.f45493b = new RectF();
        this.f45494c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        f40 f40Var = this.d;
        e20 e20Var = f40Var.l1;
        if (f40Var.X3 != 1.0f) {
            if (f40Var.R4 != null && f40Var.V4) {
                canvas.save();
                float measuredHeight = (f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f10 = f40Var.X3;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - f40Var.X3) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                f40Var.R4.getAvatarWavesDrawable().a(canvas, f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2, f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2, this);
                f40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.R4.getAvatarImageView().t(L, L, i7, i7);
                f40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.R4.getAvatarImageView().setRoundRadius(f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f40Var.U4 != null && f40Var.T4 == null && f40Var.I4) {
                canvas.save();
                float measuredHeight2 = (f40Var.U4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.U4.getAvatarImageView().getMeasuredHeight());
                float f11 = f40Var.X3;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - f40Var.X3) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                f40Var.U4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.U4.getAvatarImageView().t(L2, L2, i10, i10);
                f40Var.U4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.U4.getAvatarImageView().setRoundRadius(f40Var.U4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e20Var.setAlpha(f40Var.X3);
        Path path = this.f45494c;
        path.reset();
        RectF rectF = this.f45493b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e20Var.f37977i1) {
            for (int i11 = 0; i11 < e20Var.getChildCount(); i11++) {
                childAt = e20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.qf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = f40Var.T4) != null && yVar.f39665w && !f40Var.f45613z4) {
            canvas.save();
            Rect rect = this.f45492a;
            rect.setEmpty();
            e20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-e20Var.getMeasuredWidth())) {
                i12 += e20Var.getMeasuredWidth() * 2;
            } else if (i12 > e20Var.getMeasuredWidth()) {
                i12 -= e20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            f40Var.T4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f28672b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
