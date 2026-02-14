package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public final class EdgeEffectTrackerFactory extends RecyclerView.EdgeEffectFactory {
    private final TrackingEdgeEffect[] edgeEffects = new TrackingEdgeEffect[4];
    private final ArrayList listeners = new ArrayList();

    public interface OnEdgeEffectListener {
        void onEdgeEffectVisibilityChange(int i, boolean z);
    }

    public void addEdgeEffectListener(OnEdgeEffectListener onEdgeEffectListener) {
        this.listeners.add(onEdgeEffectListener);
    }

    public boolean hasVisibleEdges() {
        for (TrackingEdgeEffect trackingEdgeEffect : this.edgeEffects) {
            if (trackingEdgeEffect != null && trackingEdgeEffect.isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
        TrackingEdgeEffect trackingEdgeEffect = new TrackingEdgeEffect(recyclerView, i, new OnEdgeEffectListener() {
            @Override
            public final void onEdgeEffectVisibilityChange(int i2, boolean z) {
                this.f$0.onEdgeEffectVisibilityChange(i2, z);
            }
        });
        this.edgeEffects[i] = trackingEdgeEffect;
        return trackingEdgeEffect;
    }

    public void onEdgeEffectVisibilityChange(int i, boolean z) {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((OnEdgeEffectListener) it.next()).onEdgeEffectVisibilityChange(i, z);
        }
    }

    static final class TrackingEdgeEffect extends EdgeEffect {
        private final int direction;
        private boolean lastVisibility;
        private final OnEdgeEffectListener listener;
        private final Runnable mCheckEdgeVisibility;
        private final RecyclerView view;

        TrackingEdgeEffect(RecyclerView recyclerView, int i, OnEdgeEffectListener onEdgeEffectListener) {
            super(recyclerView.getContext());
            this.mCheckEdgeVisibility = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.checkEdgeVisibility();
                }
            };
            this.view = recyclerView;
            this.direction = i;
            this.listener = onEdgeEffectListener;
        }

        public boolean isVisible() {
            return !isFinished() && (Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f);
        }

        public void checkEdgeVisibility() {
            boolean zIsVisible = isVisible();
            if (this.lastVisibility != zIsVisible) {
                this.lastVisibility = zIsVisible;
                OnEdgeEffectListener onEdgeEffectListener = this.listener;
                if (onEdgeEffectListener != null) {
                    onEdgeEffectListener.onEdgeEffectVisibilityChange(this.direction, zIsVisible);
                }
            }
        }

        @Override
        public void setSize(int i, int i2) {
            super.setSize(i, i2);
            checkEdgeVisibility();
        }

        @Override
        public void finish() {
            super.finish();
            checkEdgeVisibility();
        }

        @Override
        public void onPull(float f) {
            super.onPull(f);
            checkEdgeVisibility();
        }

        @Override
        public void onPull(float f, float f2) {
            super.onPull(f, f2);
            checkEdgeVisibility();
        }

        @Override
        public float onPullDistance(float f, float f2) {
            float fOnPullDistance = super.onPullDistance(f, f2);
            checkEdgeVisibility();
            return fOnPullDistance;
        }

        @Override
        public void onRelease() {
            super.onRelease();
            checkEdgeVisibility();
        }

        @Override
        public void onAbsorb(int i) {
            super.onAbsorb(i);
            checkEdgeVisibility();
        }

        @Override
        public boolean draw(Canvas canvas) {
            boolean zDraw = super.draw(canvas);
            this.view.postOnAnimation(this.mCheckEdgeVisibility);
            return zDraw;
        }
    }
}
