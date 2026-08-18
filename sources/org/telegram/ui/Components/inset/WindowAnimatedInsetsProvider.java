package org.telegram.ui.Components.inset;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.BitwiseUtils;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class WindowAnimatedInsetsProvider extends WindowInsetsAnimationCompat.Callback {
    private int activeAnimationsCounter;
    private final ReferenceList listeners;
    private final ViewGroup root;
    private static final PointF tmpPointF = new PointF();
    private static final RectF tmpRectF = new RectF();
    private static final Rect tmpRect = new Rect();

    public interface Listener {

        public abstract class CC {
            public static void $default$onAnimatedInsetsFinished(Listener listener) {
            }

            public static void $default$onAnimatedInsetsStarted(Listener listener) {
            }
        }

        View getAnimatedInsetsTargetView();

        void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat);

        void onAnimatedInsetsFinished();

        void onAnimatedInsetsStarted();
    }

    public WindowAnimatedInsetsProvider(ViewGroup viewGroup) {
        super(0);
        this.listeners = new ReferenceList();
        this.root = viewGroup;
        ViewCompat.setWindowInsetsAnimationCallback(viewGroup, this);
    }

    @Override
    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        int typeMask = 0;
        while (it.hasNext()) {
            typeMask |= ((WindowInsetsAnimationCompat) it.next()).getTypeMask();
        }
        if (BitwiseUtils.hasFlag(typeMask, WindowInsetsCompat.Type.ime())) {
            dispatchWindowInsetsAnimationChange(windowInsetsCompat);
        }
        return windowInsetsCompat;
    }

    @Override
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        if (this.activeAnimationsCounter == 0) {
            dispatchWindowInsetsAnimationStart();
        }
        this.activeAnimationsCounter++;
        return super.onStart(windowInsetsAnimationCompat, boundsCompat);
    }

    @Override
    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        super.onEnd(windowInsetsAnimationCompat);
        int i = this.activeAnimationsCounter - 1;
        this.activeAnimationsCounter = i;
        if (i == 0) {
            dispatchWindowInsetsAnimationFinish();
        }
    }

    public void subscribeToWindowInsetsAnimation(Listener listener) {
        this.listeners.add(listener);
    }

    private void dispatchWindowInsetsAnimationStart() {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onAnimatedInsetsStarted();
        }
    }

    private void dispatchWindowInsetsAnimationFinish() {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onAnimatedInsetsFinished();
        }
    }

    private void dispatchWindowInsetsAnimationChange(WindowInsetsCompat windowInsetsCompat) {
        for (Listener listener : this.listeners) {
            View animatedInsetsTargetView = listener.getAnimatedInsetsTargetView();
            WindowInsetsCompat windowInsetsCompatCalculateWindowInsets = calculateWindowInsets(windowInsetsCompat, animatedInsetsTargetView, this.root);
            if (windowInsetsCompatCalculateWindowInsets != null) {
                listener.onAnimatedInsetsChanged(animatedInsetsTargetView, windowInsetsCompatCalculateWindowInsets);
            }
        }
    }

    public static WindowInsetsCompat calculateWindowInsets(View view) {
        return calculateWindowInsets(ViewCompat.getRootWindowInsets(view), view, view.getRootView());
    }

    public static WindowInsetsCompat calculateWindowInsets(WindowInsetsCompat windowInsetsCompat, View view, View view2) {
        if (view == null || view2 == null || windowInsetsCompat == null) {
            return null;
        }
        RectF rectF = tmpRectF;
        if (!ViewPositionWatcher.computeRectInParent(view, view2, rectF)) {
            return null;
        }
        Rect rect = tmpRect;
        rectF.round(rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        return (i == 0 && i2 == 0 && width == 0 && height == 0) ? windowInsetsCompat : windowInsetsCompat.inset(Math.max(0, i), Math.max(0, i2), Math.max(0, width), Math.max(0, height));
    }
}
