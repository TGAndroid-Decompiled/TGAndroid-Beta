package org.telegram.ui.Components.inset;

import android.graphics.PointF;
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
    private final PointF tmpPointF;

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
        this.tmpPointF = new PointF();
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
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            Listener listener = (Listener) it.next();
            View animatedInsetsTargetView = listener.getAnimatedInsetsTargetView();
            if (animatedInsetsTargetView != null && ViewPositionWatcher.computeCoordinatesInParent(animatedInsetsTargetView, this.root, this.tmpPointF)) {
                PointF pointF = this.tmpPointF;
                int i = (int) pointF.x;
                int i2 = (int) pointF.y;
                listener.onAnimatedInsetsChanged(animatedInsetsTargetView, windowInsetsCompat.inset(Math.max(0, i), Math.max(0, i2), Math.max(0, this.root.getWidth() - (animatedInsetsTargetView.getWidth() + i)), Math.max(0, this.root.getHeight() - (animatedInsetsTargetView.getHeight() + i2))));
            }
        }
    }
}
