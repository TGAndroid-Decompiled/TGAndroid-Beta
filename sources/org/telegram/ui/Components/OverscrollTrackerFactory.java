package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class OverscrollTrackerFactory extends RecyclerView.EdgeEffectFactory {
    private final Listener listener;

    public interface Listener {

        public abstract class CC {
            public static void $default$onOverscrollAbsorb(Listener listener, int i, int i2) {
            }

            public static void $default$onOverscrollPull(Listener listener, int i, float f) {
            }

            public static void $default$onOverscrollRelease(Listener listener, int i) {
            }
        }

        void onOverscrollAbsorb(int i, int i2);

        void onOverscrollEnd(int i);

        void onOverscrollPull(int i, float f);

        void onOverscrollRelease(int i);

        void onOverscrollStart(int i);
    }

    public OverscrollTrackerFactory(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected EdgeEffect createEdgeEffect(RecyclerView recyclerView, int i) {
        return new TrackingEdgeEffect(recyclerView.getContext(), i, this.listener);
    }

    private static final class TrackingEdgeEffect extends EdgeEffect {
        private final int direction;
        private boolean inOverscroll;
        private final Listener listener;

        TrackingEdgeEffect(Context context, int i, Listener listener) {
            super(context);
            this.inOverscroll = false;
            this.direction = i;
            this.listener = listener;
        }

        private void ensureStart() {
            if (this.inOverscroll) {
                return;
            }
            this.inOverscroll = true;
            AndroidUtilities.printStackTrace("Overscroll Start");
            Listener listener = this.listener;
            if (listener != null) {
                listener.onOverscrollStart(this.direction);
            }
        }

        private void maybeEnd() {
            if (this.inOverscroll && isFinished()) {
                this.inOverscroll = false;
                AndroidUtilities.printStackTrace("Overscroll End");
                Listener listener = this.listener;
                if (listener != null) {
                    listener.onOverscrollEnd(this.direction);
                }
            }
        }

        @Override
        public void onPull(float f) {
            ensureStart();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onOverscrollPull(this.direction, f);
            }
            super.onPull(f);
        }

        @Override
        public void onPull(float f, float f2) {
            ensureStart();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onOverscrollPull(this.direction, f);
            }
            super.onPull(f, f2);
        }

        @Override
        public void onAbsorb(int i) {
            ensureStart();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onOverscrollAbsorb(this.direction, i);
            }
            super.onAbsorb(i);
        }

        @Override
        public void onRelease() {
            Listener listener;
            if (this.inOverscroll && (listener = this.listener) != null) {
                listener.onOverscrollRelease(this.direction);
            }
            super.onRelease();
            maybeEnd();
        }

        @Override
        public boolean draw(Canvas canvas) {
            boolean zDraw = super.draw(canvas);
            maybeEnd();
            return zDraw;
        }

        @Override
        public void finish() {
            super.finish();
            maybeEnd();
        }
    }
}
