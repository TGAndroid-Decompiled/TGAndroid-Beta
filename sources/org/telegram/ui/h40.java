package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h40 extends FrameLayout {
    public final Rect f36596a;
    public final RectF f36597b;
    public final Path f36598c;
    public final n60 d;

    public h40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = n60Var;
        this.f36596a = new Rect();
        this.f36597b = new RectF();
        this.f36598c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        n60 n60Var = this.d;
        g40 g40Var = n60Var.f38444b;
        if (n60Var.f38456d2 != 1.0f) {
            if (n60Var.X2 != null && n60Var.f38448b3) {
                canvas.save();
                float measuredHeight = (n60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / n60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = n60Var.f38456d2;
                int dp = (int) ((AndroidUtilities.dp(13.0f) * f7) + ((1.0f - n60Var.f38456d2) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                n60Var.X2.getAvatarWavesDrawable().a(canvas, n60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, n60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                n60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n60Var.X2.getAvatarImageView().r(dp, dp, i10, i10);
                n60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                n60Var.X2.getAvatarImageView().setRoundRadius(n60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (n60Var.f38443a3 != null && n60Var.Z2 == null && n60Var.O2) {
                canvas.save();
                float measuredHeight2 = (n60Var.f38443a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / n60Var.f38443a3.getAvatarImageView().getMeasuredHeight());
                float f10 = n60Var.f38456d2;
                int dp2 = (int) ((AndroidUtilities.dp(13.0f) * f10) + ((1.0f - n60Var.f38456d2) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                n60Var.f38443a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                n60Var.f38443a3.getAvatarImageView().r(dp2, dp2, i11, i11);
                n60Var.f38443a3.getAvatarImageView().getImageReceiver().draw(canvas);
                n60Var.f38443a3.getAvatarImageView().setRoundRadius(n60Var.f38443a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        g40Var.setAlpha(n60Var.f38456d2);
        Path path = this.f36598c;
        path.reset();
        RectF rectF = this.f36597b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (g40Var.f28327i1) {
            for (int i12 = 0; i12 < g40Var.getChildCount(); i12++) {
                childAt = g40Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.mi0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = n60Var.Z2) != null && tVar.v && !n60Var.F2) {
            canvas.save();
            Rect rect = this.f36596a;
            rect.setEmpty();
            g40Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-g40Var.getMeasuredWidth())) {
                i13 += g40Var.getMeasuredWidth() * 2;
            } else if (i13 > g40Var.getMeasuredWidth()) {
                i13 -= g40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            n60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
