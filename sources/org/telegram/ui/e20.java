package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class e20 extends FrameLayout {
    public final Rect f47116a;
    public final RectF f47117b;
    public final Path f47118c;
    public final f40 d;

    public e20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = f40Var;
        this.f47116a = new Rect();
        this.f47117b = new RectF();
        this.f47118c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        f40 f40Var = this.d;
        d20 d20Var = f40Var.f47517m1;
        if (f40Var.f47481c4 != 1.0f) {
            if (f40Var.W4 != null && f40Var.f47474a5) {
                canvas.save();
                float measuredHeight = (f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.W4.getAvatarImageView().getMeasuredHeight());
                float f10 = f40Var.f47481c4;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - f40Var.f47481c4) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                f40Var.W4.getAvatarWavesDrawable().a(canvas, f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, this);
                f40Var.W4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.W4.getAvatarImageView().t(L, L, i7, i7);
                f40Var.W4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.W4.getAvatarImageView().setRoundRadius(f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f40Var.Z4 != null && f40Var.Y4 == null && f40Var.N4) {
                canvas.save();
                float measuredHeight2 = (f40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.Z4.getAvatarImageView().getMeasuredHeight());
                float f11 = f40Var.f47481c4;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - f40Var.f47481c4) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                f40Var.Z4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.Z4.getAvatarImageView().t(L2, L2, i10, i10);
                f40Var.Z4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.Z4.getAvatarImageView().setRoundRadius(f40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        d20Var.setAlpha(f40Var.f47481c4);
        Path path = this.f47118c;
        path.reset();
        RectF rectF = this.f47117b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (d20Var.f35888j1) {
            for (int i11 = 0; i11 < d20Var.getChildCount(); i11++) {
                childAt = d20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.fg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = f40Var.Y4) != null && yVar.f41491w && !f40Var.E4) {
            canvas.save();
            Rect rect = this.f47116a;
            rect.setEmpty();
            d20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-d20Var.getMeasuredWidth())) {
                i12 += d20Var.getMeasuredWidth() * 2;
            } else if (i12 > d20Var.getMeasuredWidth()) {
                i12 -= d20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            f40Var.Y4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f30176b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
