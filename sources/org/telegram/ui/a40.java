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
    public final Rect f31657a;
    public final RectF f31658b;
    public final Path f31659c;
    public final f60 d;

    public a40(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = f60Var;
        this.f31657a = new Rect();
        this.f31658b = new RectF();
        this.f31659c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        f60 f60Var = this.d;
        z30 z30Var = f60Var.f33101b;
        if (f60Var.f33113d2 != 1.0f) {
            if (f60Var.X2 != null && f60Var.f33105b3) {
                canvas.save();
                float measuredHeight = (f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = f60Var.f33113d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - f60Var.f33113d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                f60Var.X2.getAvatarWavesDrawable().a(canvas, f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                f60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                f60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                f60Var.X2.getAvatarImageView().setRoundRadius(f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f60Var.f33100a3 != null && f60Var.Z2 == null && f60Var.O2) {
                canvas.save();
                float measuredHeight2 = (f60Var.f33100a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f60Var.f33100a3.getAvatarImageView().getMeasuredHeight());
                float f10 = f60Var.f33113d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - f60Var.f33113d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                f60Var.f33100a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f60Var.f33100a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                f60Var.f33100a3.getAvatarImageView().getImageReceiver().draw(canvas);
                f60Var.f33100a3.getAvatarImageView().setRoundRadius(f60Var.f33100a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        z30Var.setAlpha(f60Var.f33113d2);
        Path path = this.f31659c;
        path.reset();
        RectF rectF = this.f31658b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (z30Var.f27039i1) {
            for (int i12 = 0; i12 < z30Var.getChildCount(); i12++) {
                childAt = z30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.mh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = f60Var.Z2) != null && uVar.v && !f60Var.F2) {
            canvas.save();
            Rect rect = this.f31657a;
            rect.setEmpty();
            z30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-z30Var.getMeasuredWidth())) {
                i13 += z30Var.getMeasuredWidth() * 2;
            } else if (i13 > z30Var.getMeasuredWidth()) {
                i13 -= z30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            f60Var.Z2.draw(canvas);
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
