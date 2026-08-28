package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class j30 extends FrameLayout {
    public final Rect f39352a;
    public final RectF f39353b;
    public final Path f39354c;
    public final o50 d;

    public j30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = o50Var;
        this.f39352a = new Rect();
        this.f39353b = new RectF();
        this.f39354c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        o50 o50Var = this.d;
        i30 i30Var = o50Var.f40883b;
        if (o50Var.Z1 != 1.0f) {
            if (o50Var.T2 != null && o50Var.X2) {
                canvas.save();
                float measuredHeight = (o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / o50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f10 = o50Var.Z1;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - o50Var.Z1) * measuredHeight));
                int i9 = (int) ((1.0f - f10) * measuredHeight);
                o50Var.T2.getAvatarWavesDrawable().a(canvas, o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                o50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                o50Var.T2.getAvatarImageView().r(dp, dp, i9, i9);
                o50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                o50Var.T2.getAvatarImageView().setRoundRadius(o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (o50Var.W2 != null && o50Var.V2 == null && o50Var.K2) {
                canvas.save();
                float measuredHeight2 = (o50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / o50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f11 = o50Var.Z1;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f11) + ((1.0f - o50Var.Z1) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                o50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                o50Var.W2.getAvatarImageView().r(dp2, dp2, i10, i10);
                o50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                o50Var.W2.getAvatarImageView().setRoundRadius(o50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        i30Var.setAlpha(o50Var.Z1);
        Path path = this.f39354c;
        path.reset();
        RectF rectF = this.f39353b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (i30Var.f26799e1) {
            for (int i11 = 0; i11 < i30Var.getChildCount(); i11++) {
                childAt = i30Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.xg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = o50Var.V2) != null && tVar.v && !o50Var.B2) {
            canvas.save();
            Rect rect = this.f39352a;
            rect.setEmpty();
            i30Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-i30Var.getMeasuredWidth())) {
                i12 += i30Var.getMeasuredWidth() * 2;
            } else if (i12 > i30Var.getMeasuredWidth()) {
                i12 -= i30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            o50Var.V2.draw(canvas);
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
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
