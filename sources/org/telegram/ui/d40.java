package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d40 extends FrameLayout {
    public final Rect f35669a;
    public final RectF f35670b;
    public final Path f35671c;
    public final j60 d;

    public d40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = j60Var;
        this.f35669a = new Rect();
        this.f35670b = new RectF();
        this.f35671c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        j60 j60Var = this.d;
        c40 c40Var = j60Var.f37542b;
        if (j60Var.f37554d2 != 1.0f) {
            if (j60Var.X2 != null && j60Var.f37546b3) {
                canvas.save();
                float measuredHeight = (j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = j60Var.f37554d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - j60Var.f37554d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                j60Var.X2.getAvatarWavesDrawable().a(canvas, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                j60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                j60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.X2.getAvatarImageView().setRoundRadius(j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (j60Var.f37541a3 != null && j60Var.Z2 == null && j60Var.O2) {
                canvas.save();
                float measuredHeight2 = (j60Var.f37541a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.f37541a3.getAvatarImageView().getMeasuredHeight());
                float f10 = j60Var.f37554d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - j60Var.f37554d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                j60Var.f37541a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.f37541a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                j60Var.f37541a3.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.f37541a3.getAvatarImageView().setRoundRadius(j60Var.f37541a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        c40Var.setAlpha(j60Var.f37554d2);
        Path path = this.f35671c;
        path.reset();
        RectF rectF = this.f35670b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (c40Var.f29089i1) {
            for (int i12 = 0; i12 < c40Var.getChildCount(); i12++) {
                childAt = c40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.lh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = j60Var.Z2) != null && tVar.v && !j60Var.F2) {
            canvas.save();
            Rect rect = this.f35669a;
            rect.setEmpty();
            c40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-c40Var.getMeasuredWidth())) {
                i13 += c40Var.getMeasuredWidth() * 2;
            } else if (i13 > c40Var.getMeasuredWidth()) {
                i13 -= c40Var.getMeasuredWidth() * 2;
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
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
