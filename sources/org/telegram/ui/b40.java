package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b40 extends FrameLayout {
    public final Rect f32234a;
    public final RectF f32235b;
    public final Path f32236c;
    public final g60 d;

    public b40(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = g60Var;
        this.f32234a = new Rect();
        this.f32235b = new RectF();
        this.f32236c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        g60 g60Var = this.d;
        a40 a40Var = g60Var.f33728b;
        if (g60Var.f33740d2 != 1.0f) {
            if (g60Var.X2 != null && g60Var.f33732b3) {
                canvas.save();
                float measuredHeight = (g60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = g60Var.f33740d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - g60Var.f33740d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                g60Var.X2.getAvatarWavesDrawable().a(canvas, g60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, g60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                g60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                g60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                g60Var.X2.getAvatarImageView().setRoundRadius(g60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (g60Var.f33727a3 != null && g60Var.Z2 == null && g60Var.O2) {
                canvas.save();
                float measuredHeight2 = (g60Var.f33727a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g60Var.f33727a3.getAvatarImageView().getMeasuredHeight());
                float f10 = g60Var.f33740d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - g60Var.f33740d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                g60Var.f33727a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g60Var.f33727a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                g60Var.f33727a3.getAvatarImageView().getImageReceiver().draw(canvas);
                g60Var.f33727a3.getAvatarImageView().setRoundRadius(g60Var.f33727a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        a40Var.setAlpha(g60Var.f33740d2);
        Path path = this.f32236c;
        path.reset();
        RectF rectF = this.f32235b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (a40Var.f23038i1) {
            for (int i12 = 0; i12 < a40Var.getChildCount(); i12++) {
                childAt = a40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.yh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = g60Var.Z2) != null && uVar.v && !g60Var.F2) {
            canvas.save();
            Rect rect = this.f32234a;
            rect.setEmpty();
            a40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-a40Var.getMeasuredWidth())) {
                i13 += a40Var.getMeasuredWidth() * 2;
            } else if (i13 > a40Var.getMeasuredWidth()) {
                i13 -= a40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            g60Var.Z2.draw(canvas);
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
