package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class EdgeEffectTrackerFactory extends RecyclerView.EdgeEffectFactory {
    public final TrackingEdgeEffect[] edgeEffects = new TrackingEdgeEffect[4];
    public final ArrayList listeners = new ArrayList();

    @Override
    public final EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
        TrackingEdgeEffect trackingEdgeEffect = new TrackingEdgeEffect(recyclerView, i, new RecyclerListView$$ExternalSyntheticLambda5(this, 1));
        this.edgeEffects[i] = trackingEdgeEffect;
        return trackingEdgeEffect;
    }

    public final class TrackingEdgeEffect extends EdgeEffect {
        public final int direction;
        public boolean lastVisibility;
        public final RecyclerListView$$ExternalSyntheticLambda5 listener;
        public final Bulletin$2$$ExternalSyntheticLambda1 mCheckEdgeVisibility;
        public final RecyclerView view;

        public TrackingEdgeEffect(RecyclerView recyclerView, int i, RecyclerListView$$ExternalSyntheticLambda5 recyclerListView$$ExternalSyntheticLambda5) {
            super(recyclerView.getContext());
            this.mCheckEdgeVisibility = new Bulletin$2$$ExternalSyntheticLambda1(this, 27);
            this.view = recyclerView;
            this.direction = i;
            this.listener = recyclerListView$$ExternalSyntheticLambda5;
        }

        public final void checkEdgeVisibility() {
            boolean z = !isFinished() && (Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f);
            if (this.lastVisibility != z) {
                this.lastVisibility = z;
                RecyclerListView$$ExternalSyntheticLambda5 recyclerListView$$ExternalSyntheticLambda5 = this.listener;
                if (recyclerListView$$ExternalSyntheticLambda5 != null) {
                    recyclerListView$$ExternalSyntheticLambda5.onEdgeEffectVisibilityChange(this.direction, z);
                }
            }
        }

        @Override
        public final boolean draw(Canvas canvas) {
            boolean zDraw = super.draw(canvas);
            this.view.postOnAnimation(this.mCheckEdgeVisibility);
            return zDraw;
        }

        @Override
        public final void finish() {
            super.finish();
            checkEdgeVisibility();
        }

        @Override
        public final void onAbsorb(int i) {
            super.onAbsorb(i);
            checkEdgeVisibility();
        }

        @Override
        public final void onPull(float f) {
            super.onPull(f);
            checkEdgeVisibility();
        }

        @Override
        public final float onPullDistance(float f, float f2) {
            float fOnPullDistance = super.onPullDistance(f, f2);
            checkEdgeVisibility();
            return fOnPullDistance;
        }

        @Override
        public final void onRelease() {
            super.onRelease();
            checkEdgeVisibility();
        }

        @Override
        public final void setSize(int i, int i2) {
            super.setSize(i, i2);
            checkEdgeVisibility();
        }

        @Override
        public final void onPull(float f, float f2) {
            super.onPull(f, f2);
            checkEdgeVisibility();
        }
    }
}
