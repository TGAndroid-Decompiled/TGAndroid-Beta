package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Input;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Path;
import org.telegram.ui.Components.Paint.Point;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda116;

public final class AboutLinkCell$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final float f$2;
    public final Object f$4;

    public AboutLinkCell$$ExternalSyntheticLambda1(AboutLinkCell aboutLinkCell, AtomicReference atomicReference, float f, AboutLinkCell.SpringInterpolator springInterpolator) {
        this.f$0 = aboutLinkCell;
        this.f$1 = atomicReference;
        this.f$2 = f;
        this.f$4 = springInterpolator;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.f$2;
        Object obj = this.f$4;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((AboutLinkCell) obj3).lambda$updateCollapse$1((AtomicReference) obj2, f, (AboutLinkCell.SpringInterpolator) obj, valueAnimator);
                break;
            default:
                Input input = (Input) obj3;
                input.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Path path = new Path(new Point[]{(Point) obj2});
                Brush brush = (Brush) obj;
                brush.getClass();
                boolean z = brush instanceof Brush.Eraser;
                RenderView renderView = input.renderView;
                path.color = z ? -1 : renderView.getCurrentColor();
                path.baseWeight = fFloatValue * f;
                path.brush = brush;
                Painting painting = renderView.getPainting();
                if (painting.helperApplyAnimator == null) {
                    painting.renderView.performInContext(new ProfileActivity$$ExternalSyntheticLambda116((Object) painting, (Object) path, true, true, (Runnable) null, 1));
                    break;
                }
                break;
        }
    }

    public AboutLinkCell$$ExternalSyntheticLambda1(Input input, Point point, Brush brush, float f) {
        this.f$0 = input;
        this.f$1 = point;
        this.f$4 = brush;
        this.f$2 = f;
    }
}
