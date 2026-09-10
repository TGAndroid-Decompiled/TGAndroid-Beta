package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends FrameLayout {
    public final Rect f32057a;
    public final RectF f32058b;
    public final Path f32059c;
    public final j60 d;

    public e40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = j60Var;
        this.f32057a = new Rect();
        this.f32058b = new RectF();
        this.f32059c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        j60 j60Var = this.d;
        d40 d40Var = j60Var.f33938b;
        if (j60Var.f33950d2 != 1.0f) {
            if (j60Var.X2 != null && j60Var.f33942b3) {
                canvas.save();
                float measuredHeight = (j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = j60Var.f33950d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - j60Var.f33950d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                j60Var.X2.getAvatarWavesDrawable().a(canvas, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                j60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                j60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.X2.getAvatarImageView().setRoundRadius(j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (j60Var.f33937a3 != null && j60Var.Z2 == null && j60Var.O2) {
                canvas.save();
                float measuredHeight2 = (j60Var.f33937a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.f33937a3.getAvatarImageView().getMeasuredHeight());
                float f10 = j60Var.f33950d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - j60Var.f33950d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                j60Var.f33937a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.f33937a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                j60Var.f33937a3.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.f33937a3.getAvatarImageView().setRoundRadius(j60Var.f33937a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        d40Var.setAlpha(j60Var.f33950d2);
        Path path = this.f32059c;
        path.reset();
        RectF rectF = this.f32058b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (d40Var.f29337i1) {
            for (int i12 = 0; i12 < d40Var.getChildCount(); i12++) {
                childAt = d40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.vh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = j60Var.Z2) != null && tVar.v && !j60Var.F2) {
            canvas.save();
            Rect rect = this.f32057a;
            rect.setEmpty();
            d40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-d40Var.getMeasuredWidth())) {
                i13 += d40Var.getMeasuredWidth() * 2;
            } else if (i13 > d40Var.getMeasuredWidth()) {
                i13 -= d40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            j60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
