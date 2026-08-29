package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m30 extends FrameLayout {
    public final Rect f40361a;
    public final RectF f40362b;
    public final Path f40363c;
    public final r50 d;

    public m30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = r50Var;
        this.f40361a = new Rect();
        this.f40362b = new RectF();
        this.f40363c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        r50 r50Var = this.d;
        l30 l30Var = r50Var.f41871b;
        if (r50Var.Z1 != 1.0f) {
            if (r50Var.T2 != null && r50Var.X2) {
                canvas.save();
                float measuredHeight = (r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / r50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f9 = r50Var.Z1;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f9) + ((1.0f - r50Var.Z1) * measuredHeight));
                int i10 = (int) ((1.0f - f9) * measuredHeight);
                r50Var.T2.getAvatarWavesDrawable().a(canvas, r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                r50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                r50Var.T2.getAvatarImageView().r(dp, dp, i10, i10);
                r50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                r50Var.T2.getAvatarImageView().setRoundRadius(r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (r50Var.W2 != null && r50Var.V2 == null && r50Var.K2) {
                canvas.save();
                float measuredHeight2 = (r50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / r50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f10 = r50Var.Z1;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - r50Var.Z1) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                r50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                r50Var.W2.getAvatarImageView().r(dp2, dp2, i11, i11);
                r50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                r50Var.W2.getAvatarImageView().setRoundRadius(r50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        l30Var.setAlpha(r50Var.Z1);
        Path path = this.f40363c;
        path.reset();
        RectF rectF = this.f40362b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (l30Var.f30050e1) {
            for (int i12 = 0; i12 < l30Var.getChildCount(); i12++) {
                childAt = l30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.hh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = r50Var.V2) != null && uVar.v && !r50Var.B2) {
            canvas.save();
            Rect rect = this.f40361a;
            rect.setEmpty();
            l30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-l30Var.getMeasuredWidth())) {
                i13 += l30Var.getMeasuredWidth() * 2;
            } else if (i13 > l30Var.getMeasuredWidth()) {
                i13 -= l30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            r50Var.V2.draw(canvas);
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
