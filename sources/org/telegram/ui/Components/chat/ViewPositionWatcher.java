package org.telegram.ui.Components.chat;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class ViewPositionWatcher implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private static RectF tmpRectF2 = new RectF();
    private final View anchorView;
    private boolean listening;
    private ViewTreeObserver vto;
    private final WeakHashMap tracked = new WeakHashMap();
    private final RectF tmpRect = new RectF();

    public interface OnChangedListener {
        void onPositionChanged(View view, RectF rectF);
    }

    private static final class Tracked {
        boolean hasLast;
        final RectF last = new RectF();
        final OnChangedListener listener;
        final ViewGroup parent;

        Tracked(ViewGroup viewGroup, OnChangedListener onChangedListener) {
            this.parent = viewGroup;
            this.listener = onChangedListener;
        }
    }

    public ViewPositionWatcher(View view) {
        this.anchorView = view;
        view.addOnAttachStateChangeListener(this);
        attachIfPossible();
    }

    public void subscribe(View view, ViewGroup viewGroup, OnChangedListener onChangedListener) {
        Tracked tracked = new Tracked(viewGroup, onChangedListener);
        List list = (List) this.tracked.get(view);
        if (list == null) {
            list = new ArrayList(1);
            this.tracked.put(view, list);
        }
        list.add(tracked);
        computeRectInParent(view, viewGroup, this.tmpRect);
        tracked.last.set(this.tmpRect);
        tracked.hasLast = true;
        ensureListening();
    }

    private void attachIfPossible() {
        ViewTreeObserver viewTreeObserver;
        if (this.anchorView.isAttachedToWindow() && (viewTreeObserver = this.anchorView.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.vto = viewTreeObserver;
            if (this.listening) {
                return;
            }
            viewTreeObserver.addOnPreDrawListener(this);
            this.listening = true;
        }
    }

    private void ensureListening() {
        if (this.listening) {
            return;
        }
        attachIfPossible();
    }

    private void detachIfListening() {
        ViewTreeObserver viewTreeObserver;
        if (this.listening && (viewTreeObserver = this.vto) != null && viewTreeObserver.isAlive()) {
            this.vto.removeOnPreDrawListener(this);
        }
        this.listening = false;
        this.vto = null;
    }

    @Override
    public void onViewAttachedToWindow(View view) {
        attachIfPossible();
    }

    @Override
    public void onViewDetachedFromWindow(View view) {
        if (view == this.anchorView) {
            detachIfListening();
        }
    }

    @Override
    public boolean onPreDraw() {
        if (this.anchorView.getViewTreeObserver() != this.vto) {
            detachIfListening();
            attachIfPossible();
        }
        if (this.tracked.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : this.tracked.entrySet()) {
            View view = (View) entry.getKey();
            List<Tracked> list = (List) entry.getValue();
            if (view != null && list != null) {
                for (Tracked tracked : list) {
                    if (computeRectInParent(view, tracked.parent, this.tmpRect) && (!tracked.hasLast || !this.tmpRect.equals(tracked.last))) {
                        tracked.last.set(this.tmpRect);
                        tracked.hasLast = true;
                        try {
                            tracked.listener.onPositionChanged(view, new RectF(this.tmpRect));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean computeCoordinatesInParent(View view, ViewGroup viewGroup, PointF pointF) {
        boolean computeRectInParent = computeRectInParent(view, viewGroup, tmpRectF2);
        if (computeRectInParent) {
            RectF rectF = tmpRectF2;
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return computeRectInParent;
    }

    private static boolean computeRectInParent(View view, ViewGroup viewGroup, RectF rectF) {
        float f = 0.0f;
        float f2 = 0.0f;
        View view2 = view;
        while (view2 != null && view2 != viewGroup) {
            f += view2.getX();
            f2 += view2.getY();
            Object parent = view2.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view2 = (View) parent;
        }
        if (view2 != viewGroup) {
            return false;
        }
        rectF.set(f, f2, view.getWidth() + f, view.getHeight() + f2);
        return true;
    }
}
