package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
public final class d20 extends FrameLayout {
    public final Rect f46934a;
    public final RectF f46935b;
    public final Path f46936c;
    public final e40 d;

    public d20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = e40Var;
        this.f46934a = new Rect();
        this.f46935b = new RectF();
        this.f46936c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.z zVar;
        e40 e40Var = this.d;
        c20 c20Var = e40Var.f47367m1;
        if (e40Var.f47331c4 != 1.0f) {
            if (e40Var.W4 != null && e40Var.f47324a5) {
                canvas.save();
                float measuredHeight = (e40Var.W4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.W4.getAvatarImageView().getMeasuredHeight());
                float f10 = e40Var.f47331c4;
                int L = (int) ((org.telegram.messenger.g0.L(13.0f) * f10) + ((1.0f - e40Var.f47331c4) * measuredHeight));
                int i7 = (int) ((1.0f - f10) * measuredHeight);
                e40Var.W4.getAvatarWavesDrawable().a(canvas, e40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, e40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, this);
                e40Var.W4.getAvatarImageView().getImageReceiver().z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.W4.getAvatarImageView().t(L, L, i7, i7);
                e40Var.W4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.W4.getAvatarImageView().setRoundRadius(e40Var.W4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (e40Var.Z4 != null && e40Var.Y4 == null && e40Var.N4) {
                canvas.save();
                float measuredHeight2 = (e40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.Z4.getAvatarImageView().getMeasuredHeight());
                float f11 = e40Var.f47331c4;
                int L2 = (int) ((org.telegram.messenger.g0.L(13.0f) * f11) + ((1.0f - e40Var.f47331c4) * measuredHeight2));
                int i10 = (int) ((1.0f - f11) * measuredHeight2);
                e40Var.Z4.getAvatarImageView().getImageReceiver().z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.Z4.getAvatarImageView().t(L2, L2, i10, i10);
                e40Var.Z4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.Z4.getAvatarImageView().setRoundRadius(e40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        c20Var.setAlpha(e40Var.f47331c4);
        Path path = this.f46936c;
        path.reset();
        RectF rectF = this.f46935b;
        rectF.set(0.0f, 0.0f, getMeasuredHeight(), getMeasuredWidth());
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (c20Var.f35422j1) {
            for (int i11 = 0; i11 < c20Var.getChildCount(); i11++) {
                childAt = c20Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Components.eg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (zVar = e40Var.Y4) != null && zVar.f41386w && !e40Var.E4) {
            canvas.save();
            Rect rect = this.f46934a;
            rect.setEmpty();
            c20Var.getChildVisibleRect(childAt, rect, null);
            int i12 = rect.left;
            if (i12 < (-c20Var.getMeasuredWidth())) {
                i12 += c20Var.getMeasuredWidth() * 2;
            } else if (i12 > c20Var.getMeasuredWidth()) {
                i12 -= c20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i12, 0.0f);
            e40Var.Y4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.d.f30226b.invalidate();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, 1073741824));
    }
}
