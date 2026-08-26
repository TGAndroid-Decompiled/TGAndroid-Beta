package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class EdgeEffectTrackerFactory extends RecyclerView.EdgeEffectFactory {
    private final TrackingEdgeEffect[] edgeEffects = new TrackingEdgeEffect[4];
    private final ArrayList<OnEdgeEffectListener> listeners = new ArrayList<>();

    public interface OnEdgeEffectListener {
        void onEdgeEffectVisibilityChange(int i, boolean z);
    }

    public void onEdgeEffectVisibilityChange(int i, boolean z) {
        ArrayList<OnEdgeEffectListener> arrayList = this.listeners;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            OnEdgeEffectListener onEdgeEffectListener = arrayList.get(i2);
            i2++;
            onEdgeEffectListener.onEdgeEffectVisibilityChange(i, z);
        }
    }

    public void addEdgeEffectListener(OnEdgeEffectListener onEdgeEffectListener) {
        this.listeners.add(onEdgeEffectListener);
    }

    @Override
    public EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
        TrackingEdgeEffect trackingEdgeEffect = new TrackingEdgeEffect(recyclerView, i, new RecyclerListView$$ExternalSyntheticLambda5(this, 1));
        this.edgeEffects[i] = trackingEdgeEffect;
        return trackingEdgeEffect;
    }

    public boolean hasVisibleEdges() {
        for (TrackingEdgeEffect trackingEdgeEffect : this.edgeEffects) {
            if (trackingEdgeEffect != null && trackingEdgeEffect.isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void removeEdgeEffectListener(OnEdgeEffectListener onEdgeEffectListener) {
        this.listeners.remove(onEdgeEffectListener);
    }

    public static final class TrackingEdgeEffect extends EdgeEffect {
        private final int direction;
        private boolean lastVisibility;
        private final OnEdgeEffectListener listener;
        private final Runnable mCheckEdgeVisibility;
        private final RecyclerView view;

        public TrackingEdgeEffect(RecyclerView recyclerView, int i, OnEdgeEffectListener onEdgeEffectListener) {
            super(recyclerView.getContext());
            this.mCheckEdgeVisibility = new Bulletin$2$$ExternalSyntheticLambda1(this, 10);
            this.view = recyclerView;
            this.direction = i;
            this.listener = onEdgeEffectListener;
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
        public boolean draw(Canvas canvas) {
            boolean zDraw = super.draw(canvas);
            this.view.postOnAnimation(this.mCheckEdgeVisibility);
            return zDraw;
        }

        @Override
        public void finish() {
            super.finish();
            checkEdgeVisibility();
        }

        public boolean isVisible() {
            if (isFinished()) {
                return false;
            }
            return Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f;
        }

        @Override
        public void onAbsorb(int i) {
            super.onAbsorb(i);
            checkEdgeVisibility();
        }

        @Override
        public void onPull(float f) {
            super.onPull(f);
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
        public void setSize(int i, int i2) {
            super.setSize(i, i2);
            checkEdgeVisibility();
        }

        @Override
        public void onPull(float f, float f2) {
            super.onPull(f, f2);
            checkEdgeVisibility();
        }
    }
}
