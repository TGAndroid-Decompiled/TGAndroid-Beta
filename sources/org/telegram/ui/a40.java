package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a40 extends FrameLayout {
    public final Rect f32450a;
    public final RectF f32451b;
    public final Path f32452c;
    public final e60 d;

    public a40(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = e60Var;
        this.f32450a = new Rect();
        this.f32451b = new RectF();
        this.f32452c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        e60 e60Var = this.d;
        z30 z30Var = e60Var.f33620b;
        if (e60Var.a2 != 1.0f) {
            if (e60Var.U2 != null && e60Var.Y2) {
                canvas.save();
                float measuredHeight = (e60Var.U2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e60Var.U2.getAvatarImageView().getMeasuredHeight());
                float f10 = e60Var.a2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - e60Var.a2) * measuredHeight));
                int i10 = (int) ((1.0f - f10) * measuredHeight);
                e60Var.U2.getAvatarWavesDrawable().a(canvas, e60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, e60Var.U2.getAvatarImageView().getMeasuredHeight() / 2, this);
                e60Var.U2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e60Var.U2.getAvatarImageView().r(dp, dp, i10, i10);
                e60Var.U2.getAvatarImageView().getImageReceiver().draw(canvas);
                e60Var.U2.getAvatarImageView().setRoundRadius(e60Var.U2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (e60Var.X2 != null && e60Var.W2 == null && e60Var.L2) {
                canvas.save();
                float measuredHeight2 = (e60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f11 = e60Var.a2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f11) + ((1.0f - e60Var.a2) * measuredHeight2));
                int i11 = (int) ((1.0f - f11) * measuredHeight2);
                e60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e60Var.X2.getAvatarImageView().r(dp2, dp2, i11, i11);
                e60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                e60Var.X2.getAvatarImageView().setRoundRadius(e60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        z30Var.setAlpha(e60Var.a2);
        Path path = this.f32452c;
        path.reset();
        RectF rectF = this.f32451b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (z30Var.f30264f1) {
            for (int i12 = 0; i12 < z30Var.getChildCount(); i12++) {
                childAt = z30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.th0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = e60Var.W2) != null && tVar.v && !e60Var.C2) {
            canvas.save();
            Rect rect = this.f32450a;
            rect.setEmpty();
            z30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-z30Var.getMeasuredWidth())) {
                i13 += z30Var.getMeasuredWidth() * 2;
            } else if (i13 > z30Var.getMeasuredWidth()) {
                i13 -= z30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            e60Var.W2.draw(canvas);
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
