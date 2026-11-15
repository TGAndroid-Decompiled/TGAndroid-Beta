package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class b20 extends FrameLayout {
    public final Rect f45563a;
    public final RectF f45564b;
    public final Path f45565c;
    public final c40 d;

    public b20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c40Var;
        this.f45563a = new Rect();
        this.f45564b = new RectF();
        this.f45565c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.z zVar;
        c40 c40Var = this.d;
        a20 a20Var = c40Var.f45942m1;
        if (c40Var.f45906c4 != 1.0f) {
            if (c40Var.W4 != null && c40Var.f45899a5) {
                canvas.save();
                float measuredHeight = (c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.W4.getAvatarImageView().getMeasuredHeight());
                float f10 = c40Var.f45906c4;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - c40Var.f45906c4) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                c40Var.W4.getAvatarWavesDrawable().a(canvas, c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, this);
                c40Var.W4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.W4.getAvatarImageView().t(L, L, i7, i7);
                c40Var.W4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.W4.getAvatarImageView().setRoundRadius(c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c40Var.Z4 != null && c40Var.Y4 == null && c40Var.N4) {
                canvas.save();
                float measuredHeight2 = (c40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.Z4.getAvatarImageView().getMeasuredHeight());
                float f11 = c40Var.f45906c4;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - c40Var.f45906c4) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                c40Var.Z4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.Z4.getAvatarImageView().t(L2, L2, i10, i10);
                c40Var.Z4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.Z4.getAvatarImageView().setRoundRadius(c40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        a20Var.setAlpha(c40Var.f45906c4);
        Path path = this.f45565c;
        path.reset();
        RectF rectF = this.f45564b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (a20Var.f40399j1) {
            for (int i11 = 0; i11 < a20Var.getChildCount(); i11++) {
                childAt = a20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.tf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (zVar = c40Var.Y4) != null && zVar.f41107w && !c40Var.E4) {
            canvas.save();
            Rect rect = this.f45563a;
            rect.setEmpty();
            a20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-a20Var.getMeasuredWidth())) {
                i12 += a20Var.getMeasuredWidth() * 2;
            } else if (i12 > a20Var.getMeasuredWidth()) {
                i12 -= a20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            c40Var.Y4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f29682b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
