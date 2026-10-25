package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p30 extends FrameLayout {
    public final Rect f42341a;
    public final RectF f42342b;
    public final Path f42343c;
    public final v50 d;

    public p30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = v50Var;
        this.f42341a = new Rect();
        this.f42342b = new RectF();
        this.f42343c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        v50 v50Var = this.d;
        o30 o30Var = v50Var.f44609b;
        if (v50Var.f44621d2 != 1.0f) {
            if (v50Var.X2 != null && v50Var.f44613b3) {
                canvas.save();
                float measuredHeight = (v50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / v50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = v50Var.f44621d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - v50Var.f44621d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                v50Var.X2.getAvatarWavesDrawable().a(canvas, v50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, v50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                v50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v50Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                v50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                v50Var.X2.getAvatarImageView().setRoundRadius(v50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (v50Var.f44608a3 != null && v50Var.Z2 == null && v50Var.O2) {
                canvas.save();
                float measuredHeight2 = (v50Var.f44608a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / v50Var.f44608a3.getAvatarImageView().getMeasuredHeight());
                float f10 = v50Var.f44621d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - v50Var.f44621d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                v50Var.f44608a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                v50Var.f44608a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                v50Var.f44608a3.getAvatarImageView().getImageReceiver().draw(canvas);
                v50Var.f44608a3.getAvatarImageView().setRoundRadius(v50Var.f44608a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        o30Var.setAlpha(v50Var.f44621d2);
        Path path = this.f42343c;
        path.reset();
        RectF rectF = this.f42342b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (o30Var.f30992i1) {
            for (int i12 = 0; i12 < o30Var.getChildCount(); i12++) {
                childAt = o30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.ki0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = v50Var.Z2) != null && tVar.v && !v50Var.F2) {
            canvas.save();
            Rect rect = this.f42341a;
            rect.setEmpty();
            o30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-o30Var.getMeasuredWidth())) {
                i13 += o30Var.getMeasuredWidth() * 2;
            } else if (i13 > o30Var.getMeasuredWidth()) {
                i13 -= o30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            v50Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
