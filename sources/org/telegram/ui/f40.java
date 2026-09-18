package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f40 extends FrameLayout {
    public final Rect f33549a;
    public final RectF f33550b;
    public final Path f33551c;
    public final k60 d;

    public f40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = k60Var;
        this.f33549a = new Rect();
        this.f33550b = new RectF();
        this.f33551c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        k60 k60Var = this.d;
        e40 e40Var = k60Var.f35019b;
        if (k60Var.f35031d2 != 1.0f) {
            if (k60Var.X2 != null && k60Var.f35023b3) {
                canvas.save();
                float measuredHeight = (k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / k60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = k60Var.f35031d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - k60Var.f35031d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                k60Var.X2.getAvatarWavesDrawable().a(canvas, k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                k60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                k60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                k60Var.X2.getAvatarImageView().setRoundRadius(k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (k60Var.f35018a3 != null && k60Var.Z2 == null && k60Var.O2) {
                canvas.save();
                float measuredHeight2 = (k60Var.f35018a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / k60Var.f35018a3.getAvatarImageView().getMeasuredHeight());
                float f10 = k60Var.f35031d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - k60Var.f35031d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                k60Var.f35018a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k60Var.f35018a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                k60Var.f35018a3.getAvatarImageView().getImageReceiver().draw(canvas);
                k60Var.f35018a3.getAvatarImageView().setRoundRadius(k60Var.f35018a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e40Var.setAlpha(k60Var.f35031d2);
        Path path = this.f33551c;
        path.reset();
        RectF rectF = this.f33550b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e40Var.f27040i1) {
            for (int i12 = 0; i12 < e40Var.getChildCount(); i12++) {
                childAt = e40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.mh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = k60Var.Z2) != null && uVar.v && !k60Var.F2) {
            canvas.save();
            Rect rect = this.f33549a;
            rect.setEmpty();
            e40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-e40Var.getMeasuredWidth())) {
                i13 += e40Var.getMeasuredWidth() * 2;
            } else if (i13 > e40Var.getMeasuredWidth()) {
                i13 -= e40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            k60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
