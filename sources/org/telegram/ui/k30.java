package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k30 extends FrameLayout {
    public final Rect f38411a;
    public final RectF f38412b;
    public final Path f38413c;
    public final q50 d;

    public k30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = q50Var;
        this.f38411a = new Rect();
        this.f38412b = new RectF();
        this.f38413c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        q50 q50Var = this.d;
        j30 j30Var = q50Var.f40382b;
        if (q50Var.f40394d2 != 1.0f) {
            if (q50Var.X2 != null && q50Var.f40386b3) {
                canvas.save();
                float measuredHeight = (q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / q50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = q50Var.f40394d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - q50Var.f40394d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                q50Var.X2.getAvatarWavesDrawable().a(canvas, q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                q50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q50Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                q50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                q50Var.X2.getAvatarImageView().setRoundRadius(q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (q50Var.f40381a3 != null && q50Var.Z2 == null && q50Var.O2) {
                canvas.save();
                float measuredHeight2 = (q50Var.f40381a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / q50Var.f40381a3.getAvatarImageView().getMeasuredHeight());
                float f10 = q50Var.f40394d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - q50Var.f40394d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                q50Var.f40381a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q50Var.f40381a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                q50Var.f40381a3.getAvatarImageView().getImageReceiver().draw(canvas);
                q50Var.f40381a3.getAvatarImageView().setRoundRadius(q50Var.f40381a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        j30Var.setAlpha(q50Var.f40394d2);
        Path path = this.f38413c;
        path.reset();
        RectF rectF = this.f38412b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (j30Var.f28188i1) {
            for (int i12 = 0; i12 < j30Var.getChildCount(); i12++) {
                childAt = j30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.ii0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = q50Var.Z2) != null && tVar.v && !q50Var.F2) {
            canvas.save();
            Rect rect = this.f38411a;
            rect.setEmpty();
            j30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-j30Var.getMeasuredWidth())) {
                i13 += j30Var.getMeasuredWidth() * 2;
            } else if (i13 > j30Var.getMeasuredWidth()) {
                i13 -= j30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            q50Var.Z2.draw(canvas);
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
