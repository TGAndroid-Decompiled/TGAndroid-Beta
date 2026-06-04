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
    private static final int[] tmpCords = new int[2];
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
        boolean multiwindow;
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
        subscribe(view, viewGroup, onChangedListener, false);
    }

    public void subscribe(View view, ViewGroup viewGroup, OnChangedListener onChangedListener, boolean z) {
        Tracked tracked = new Tracked(viewGroup, onChangedListener);
        tracked.multiwindow = z;
        List arrayList = (List) this.tracked.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.tracked.put(view, arrayList);
        }
        arrayList.add(tracked);
        computeRectInParent(view, viewGroup, this.tmpRect);
        tracked.last.set(this.tmpRect);
        ensureListening();
        if (z) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
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
                    if (tracked.multiwindow) {
                        int[] iArr = tmpCords;
                        view.getLocationOnScreen(iArr);
                        this.tmpRect.set(iArr[0], iArr[1], r8 + view.getWidth(), iArr[1] + view.getHeight());
                        tracked.parent.getLocationOnScreen(iArr);
                        this.tmpRect.offset(-iArr[0], -iArr[1]);
                    } else if (!computeRectInParent(view, tracked.parent, this.tmpRect)) {
                    }
                    if (!tracked.hasLast || !this.tmpRect.equals(tracked.last)) {
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

    public static float computeYCoordinateInParent(View view, ViewGroup viewGroup) {
        computeRectInParent(view, viewGroup, tmpRectF2);
        return tmpRectF2.top;
    }

    public static float computeXCoordinateInParent(View view, ViewGroup viewGroup) {
        computeRectInParent(view, viewGroup, tmpRectF2);
        return tmpRectF2.left;
    }

    public static boolean computeCoordinatesInParent(View view, ViewGroup viewGroup, PointF pointF) {
        boolean zComputeRectInParent = computeRectInParent(view, viewGroup, tmpRectF2);
        if (zComputeRectInParent) {
            RectF rectF = tmpRectF2;
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return zComputeRectInParent;
    }

    public static boolean computeRectInParent(View view, View view2, RectF rectF) {
        float scrollX = 0.0f;
        float scrollY = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x = scrollX + view3.getX();
            float y = scrollY + view3.getY();
            Object parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            scrollX = x - view3.getScrollX();
            scrollY = y - view3.getScrollY();
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(scrollX, scrollY, view.getWidth() + scrollX, view.getHeight() + scrollY);
        return true;
    }
}
