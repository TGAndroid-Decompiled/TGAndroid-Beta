package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class b30 extends FrameLayout {
    public final Rect f35971a;
    public final RectF f35972b;
    public final Path f35973c;
    public final b50 d;

    public b30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = b50Var;
        this.f35971a = new Rect();
        this.f35972b = new RectF();
        this.f35973c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        b50 b50Var = this.d;
        a30 a30Var = b50Var.f36026i1;
        if (b50Var.U3 != 1.0f) {
            if (b50Var.O4 != null && b50Var.S4) {
                canvas.save();
                float measuredHeight = (b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / b50Var.O4.getAvatarImageView().getMeasuredHeight());
                float f7 = b50Var.U3;
                int L = (int) ((org.telegram.messenger.i0.L(13.0f) * f7) + ((1.0f - b50Var.U3) * measuredHeight));
                int i10 = (int) ((1.0f - f7) * measuredHeight);
                b50Var.O4.getAvatarWavesDrawable().a(canvas, b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                b50Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                b50Var.O4.getAvatarImageView().t(L, L, i10, i10);
                b50Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                b50Var.O4.getAvatarImageView().setRoundRadius(b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (b50Var.R4 != null && b50Var.Q4 == null && b50Var.F4) {
                canvas.save();
                float measuredHeight2 = (b50Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / b50Var.R4.getAvatarImageView().getMeasuredHeight());
                float f10 = b50Var.U3;
                int L2 = (int) ((org.telegram.messenger.i0.L(13.0f) * f10) + ((1.0f - b50Var.U3) * measuredHeight2));
                int i11 = (int) ((1.0f - f10) * measuredHeight2);
                b50Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                b50Var.R4.getAvatarImageView().t(L2, L2, i11, i11);
                b50Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                b50Var.R4.getAvatarImageView().setRoundRadius(b50Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        a30Var.setAlpha(b50Var.U3);
        Path path = this.f35973c;
        path.reset();
        RectF rectF = this.f35972b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (a30Var.f30934i1) {
            for (int i12 = 0; i12 < a30Var.getChildCount(); i12++) {
                childAt = a30Var.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Components.sg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = b50Var.Q4) != null && rVar.f31628w && !b50Var.f36094w4) {
            canvas.save();
            Rect rect = this.f35971a;
            rect.setEmpty();
            a30Var.getChildVisibleRect(childAt, rect, null);
            int i13 = rect.left;
            if (i13 < (-a30Var.getMeasuredWidth())) {
                i13 += a30Var.getMeasuredWidth() * 2;
            } else if (i13 > a30Var.getMeasuredWidth()) {
                i13 -= a30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i13, 0.0f);
            b50Var.Q4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f21586b.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
