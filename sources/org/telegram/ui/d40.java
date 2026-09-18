package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends FrameLayout {
    public final Rect f32861a;
    public final RectF f32862b;
    public final Path f32863c;
    public final i60 d;

    public d40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = i60Var;
        this.f32861a = new Rect();
        this.f32862b = new RectF();
        this.f32863c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        i60 i60Var = this.d;
        c40 c40Var = i60Var.f34331b;
        if (i60Var.f34343d2 != 1.0f) {
            if (i60Var.X2 != null && i60Var.f34335b3) {
                canvas.save();
                float measuredHeight = (i60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / i60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = i60Var.f34343d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - i60Var.f34343d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                i60Var.X2.getAvatarWavesDrawable().a(canvas, i60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, i60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                i60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                i60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                i60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                i60Var.X2.getAvatarImageView().setRoundRadius(i60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (i60Var.f34330a3 != null && i60Var.Z2 == null && i60Var.O2) {
                canvas.save();
                float measuredHeight2 = (i60Var.f34330a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / i60Var.f34330a3.getAvatarImageView().getMeasuredHeight());
                float f10 = i60Var.f34343d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - i60Var.f34343d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                i60Var.f34330a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                i60Var.f34330a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                i60Var.f34330a3.getAvatarImageView().getImageReceiver().draw(canvas);
                i60Var.f34330a3.getAvatarImageView().setRoundRadius(i60Var.f34330a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        c40Var.setAlpha(i60Var.f34343d2);
        Path path = this.f32863c;
        path.reset();
        RectF rectF = this.f32862b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (c40Var.f30811i1) {
            for (int i12 = 0; i12 < c40Var.getChildCount(); i12++) {
                childAt = c40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.wh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = i60Var.Z2) != null && uVar.v && !i60Var.F2) {
            canvas.save();
            Rect rect = this.f32861a;
            rect.setEmpty();
            c40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-c40Var.getMeasuredWidth())) {
                i13 += c40Var.getMeasuredWidth() * 2;
            } else if (i13 > c40Var.getMeasuredWidth()) {
                i13 -= c40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            i60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
