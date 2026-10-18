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
    public final Rect f39020a;
    public final RectF f39021b;
    public final Path f39022c;
    public final s50 d;

    public m30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = s50Var;
        this.f39020a = new Rect();
        this.f39021b = new RectF();
        this.f39022c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        s50 s50Var = this.d;
        l30 l30Var = s50Var.f40936b;
        if (s50Var.f40948d2 != 1.0f) {
            if (s50Var.X2 != null && s50Var.f40940b3) {
                canvas.save();
                float measuredHeight = (s50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = s50Var.f40948d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - s50Var.f40948d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                s50Var.X2.getAvatarWavesDrawable().a(canvas, s50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, s50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                s50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                s50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.X2.getAvatarImageView().setRoundRadius(s50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (s50Var.f40935a3 != null && s50Var.Z2 == null && s50Var.O2) {
                canvas.save();
                float measuredHeight2 = (s50Var.f40935a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.f40935a3.getAvatarImageView().getMeasuredHeight());
                float f10 = s50Var.f40948d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - s50Var.f40948d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                s50Var.f40935a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.f40935a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                s50Var.f40935a3.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.f40935a3.getAvatarImageView().setRoundRadius(s50Var.f40935a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        l30Var.setAlpha(s50Var.f40948d2);
        Path path = this.f39022c;
        path.reset();
        RectF rectF = this.f39021b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (l30Var.f27900i1) {
            for (int i12 = 0; i12 < l30Var.getChildCount(); i12++) {
                childAt = l30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.hi0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = s50Var.Z2) != null && tVar.v && !s50Var.F2) {
            canvas.save();
            Rect rect = this.f39020a;
            rect.setEmpty();
            l30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-l30Var.getMeasuredWidth())) {
                i13 += l30Var.getMeasuredWidth() * 2;
            } else if (i13 > l30Var.getMeasuredWidth()) {
                i13 -= l30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            s50Var.Z2.draw(canvas);
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
