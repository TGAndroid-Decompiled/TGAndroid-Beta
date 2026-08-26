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
import org.telegram.ui.Cells.ChatMessageCell;

public final class ViewPositionWatcher implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final int[] tmpCords = new int[2];
    public static final RectF tmpRectF2 = new RectF();
    public final View anchorView;
    public boolean listening;
    public ViewTreeObserver vto;
    public final WeakHashMap tracked = new WeakHashMap();
    public final RectF tmpRect = new RectF();

    public interface OnChangedListener {
        void onPositionChanged(View view, RectF rectF);
    }

    public final class Tracked {
        public boolean hasLast;
        public final RectF last = new RectF();
        public final OnChangedListener listener;
        public boolean multiwindow;
        public final ViewGroup parent;

        public Tracked(ViewGroup viewGroup, OnChangedListener onChangedListener) {
            this.parent = viewGroup;
            this.listener = onChangedListener;
        }
    }

    public ViewPositionWatcher(View view) {
        this.anchorView = view;
        view.addOnAttachStateChangeListener(this);
        attachIfPossible();
    }

    public static boolean computeCoordinatesInParent(View view, ViewGroup viewGroup, PointF pointF) {
        RectF rectF = tmpRectF2;
        boolean zComputeRectInParent = computeRectInParent(view, viewGroup, rectF);
        if (zComputeRectInParent) {
            pointF.x = rectF.left;
            pointF.y = rectF.top;
        }
        return zComputeRectInParent;
    }

    public static boolean computeRectInParent(View view, View view2, RectF rectF) {
        float f = 0.0f;
        float scrollY = 0.0f;
        View view3 = view;
        while (view3 != null && view3 != view2) {
            float x = view3.getX() + f;
            float y = view3.getY() + scrollY;
            Object parent = view3.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view3 = (View) parent;
            float scrollX = x - view3.getScrollX();
            scrollY = y - view3.getScrollY();
            f = scrollX;
        }
        if (view3 != view2) {
            return false;
        }
        rectF.set(f, scrollY, view.getWidth() + f, view.getHeight() + scrollY);
        return true;
    }

    public static float computeYCoordinateInParent(ChatMessageCell chatMessageCell, ViewGroup viewGroup) {
        RectF rectF = tmpRectF2;
        computeRectInParent(chatMessageCell, viewGroup, rectF);
        return rectF.top;
    }

    public final void attachIfPossible() {
        ViewTreeObserver viewTreeObserver;
        View view = this.anchorView;
        if (view.isAttachedToWindow() && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.vto = viewTreeObserver;
            if (this.listening) {
                return;
            }
            viewTreeObserver.addOnPreDrawListener(this);
            this.listening = true;
        }
    }

    @Override
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.anchorView.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver2 = this.vto;
        if (viewTreeObserver != viewTreeObserver2) {
            if (this.listening && viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                this.vto.removeOnPreDrawListener(this);
            }
            this.listening = false;
            this.vto = null;
            attachIfPossible();
        }
        WeakHashMap weakHashMap = this.tracked;
        if (!weakHashMap.isEmpty()) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                List<Tracked> list = (List) entry.getValue();
                if (view != null && list != null) {
                    for (Tracked tracked : list) {
                        boolean z = tracked.multiwindow;
                        RectF rectF = this.tmpRect;
                        ViewGroup viewGroup = tracked.parent;
                        if (z) {
                            int[] iArr = tmpCords;
                            view.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            rectF.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
                            viewGroup.getLocationOnScreen(iArr);
                            rectF.offset(-iArr[0], -iArr[1]);
                        } else if (!computeRectInParent(view, viewGroup, rectF)) {
                        }
                        boolean z2 = tracked.hasLast;
                        RectF rectF2 = tracked.last;
                        if (!z2 || !rectF.equals(rectF2)) {
                            rectF2.set(rectF);
                            tracked.hasLast = true;
                            try {
                                tracked.listener.onPositionChanged(view, new RectF(rectF));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        attachIfPossible();
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view == this.anchorView) {
            if (this.listening && (viewTreeObserver = this.vto) != null && viewTreeObserver.isAlive()) {
                this.vto.removeOnPreDrawListener(this);
            }
            this.listening = false;
            this.vto = null;
        }
    }

    public final void subscribe(View view, ViewGroup viewGroup, OnChangedListener onChangedListener, boolean z) {
        Tracked tracked = new Tracked(viewGroup, onChangedListener);
        tracked.multiwindow = z;
        WeakHashMap weakHashMap = this.tracked;
        List arrayList = (List) weakHashMap.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            weakHashMap.put(view, arrayList);
        }
        arrayList.add(tracked);
        RectF rectF = this.tmpRect;
        computeRectInParent(view, viewGroup, rectF);
        tracked.last.set(rectF);
        if (!this.listening) {
            attachIfPossible();
        }
        if (z) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }
}
