package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n30 extends FrameLayout {
    public final Rect f39761a;
    public final RectF f39762b;
    public final Path f39763c;
    public final u50 d;

    public n30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = u50Var;
        this.f39761a = new Rect();
        this.f39762b = new RectF();
        this.f39763c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        u50 u50Var = this.d;
        m30 m30Var = u50Var.f42173b;
        if (u50Var.f42185d2 != 1.0f) {
            if (u50Var.X2 != null && u50Var.f42177b3) {
                canvas.save();
                float measuredHeight = (u50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / u50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = u50Var.f42185d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - u50Var.f42185d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                u50Var.X2.getAvatarWavesDrawable().a(canvas, u50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, u50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                u50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                u50Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                u50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                u50Var.X2.getAvatarImageView().setRoundRadius(u50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (u50Var.f42172a3 != null && u50Var.Z2 == null && u50Var.O2) {
                canvas.save();
                float measuredHeight2 = (u50Var.f42172a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / u50Var.f42172a3.getAvatarImageView().getMeasuredHeight());
                float f10 = u50Var.f42185d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - u50Var.f42185d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                u50Var.f42172a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                u50Var.f42172a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                u50Var.f42172a3.getAvatarImageView().getImageReceiver().draw(canvas);
                u50Var.f42172a3.getAvatarImageView().setRoundRadius(u50Var.f42172a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        m30Var.setAlpha(u50Var.f42185d2);
        Path path = this.f39763c;
        path.reset();
        RectF rectF = this.f39762b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (m30Var.f29193i1) {
            for (int i12 = 0; i12 < m30Var.getChildCount(); i12++) {
                childAt = m30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.li0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = u50Var.Z2) != null && tVar.v && !u50Var.F2) {
            canvas.save();
            Rect rect = this.f39761a;
            rect.setEmpty();
            m30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-m30Var.getMeasuredWidth())) {
                i13 += m30Var.getMeasuredWidth() * 2;
            } else if (i13 > m30Var.getMeasuredWidth()) {
                i13 -= m30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            u50Var.Z2.draw(canvas);
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
