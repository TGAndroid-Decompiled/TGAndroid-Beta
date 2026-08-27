package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class m30 extends FrameLayout {

    public final Rect f40306a;

    public final RectF f40307b;

    public final Path f40308c;
    public final s50 d;

    public m30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = s50Var;
        this.f40306a = new Rect();
        this.f40307b = new RectF();
        this.f40308c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        s50 s50Var = this.d;
        l30 l30Var = s50Var.f42412b;
        if (s50Var.Z1 != 1.0f) {
            if (s50Var.T2 != null && s50Var.X2) {
                canvas.save();
                float measuredHeight = (s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - s50Var.Z1) * measuredHeight;
                float fDp = AndroidUtilities.dp(13.0f);
                float f11 = s50Var.Z1;
                int i10 = (int) ((fDp * f11) + f10);
                int i11 = (int) ((1.0f - f11) * measuredHeight);
                s50Var.T2.getAvatarWavesDrawable().a(canvas, s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                s50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.T2.getAvatarImageView().r(i10, i10, i11, i11);
                s50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.T2.getAvatarImageView().setRoundRadius(s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (s50Var.W2 != null && s50Var.V2 == null && s50Var.K2) {
                canvas.save();
                float measuredHeight2 = (s50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - s50Var.Z1) * measuredHeight2;
                float fDp2 = AndroidUtilities.dp(13.0f);
                float f13 = s50Var.Z1;
                int i12 = (int) ((fDp2 * f13) + f12);
                int i13 = (int) ((1.0f - f13) * measuredHeight2);
                s50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.W2.getAvatarImageView().r(i12, i12, i13, i13);
                s50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.W2.getAvatarImageView().setRoundRadius(s50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        l30Var.setAlpha(s50Var.Z1);
        Path path = this.f40308c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.f40307b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        int i14 = 0;
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (!l30Var.f27436e1) {
            childAt = null;
            break;
        }
        while (true) {
            if (i14 >= l30Var.getChildCount()) {
                childAt = null;
                break;
            }
            childAt = l30Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Components.zg0) {
                break;
            } else {
                i14++;
            }
        }
        if (childAt != null && (tVar = s50Var.V2) != null && tVar.v && !s50Var.B2) {
            canvas.save();
            Rect rect = this.f40306a;
            rect.setEmpty();
            l30Var.getChildVisibleRect(childAt, rect, null);
            int measuredWidth2 = rect.left;
            if (measuredWidth2 < (-l30Var.getMeasuredWidth())) {
                measuredWidth2 += l30Var.getMeasuredWidth() * 2;
            } else if (measuredWidth2 > l30Var.getMeasuredWidth()) {
                measuredWidth2 -= l30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(measuredWidth2, 0.0f);
            s50Var.V2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((org.telegram.ui.ActionBar.e3) this.d).containerView.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + iMin, 1073741824));
    }
}
