package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;

public class SpoilersShowcase extends BaseFragment {
    public SpoilersShowcase() {
        super(null);
    }

    @Override
    public View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context) {
            private SpoilerEffect2 spoilerEffect;

            @Override
            public void dispatchDraw(Canvas canvas) {
                this.spoilerEffect.draw(canvas, this, getMeasuredWidth(), getMeasuredHeight(), 1.0f, false);
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
                if (spoilerEffect2 != null) {
                    spoilerEffect2.detach(this);
                    this.spoilerEffect = null;
                }
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (this.spoilerEffect == null) {
                    this.spoilerEffect = SpoilerEffect2.getInstance(this);
                }
            }
        };
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }
}
