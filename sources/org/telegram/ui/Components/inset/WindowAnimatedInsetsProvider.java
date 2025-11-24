package org.telegram.ui.Components.inset;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class WindowAnimatedInsetsProvider extends WindowInsetsAnimationCompat.Callback {
    private final ReferenceList listeners;
    private final ViewGroup root;
    private final PointF tmpPointF;

    public interface Listener {
        View getAnimatedInsetsTargetView();

        void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat);
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
        dispatchWindowInsetsAnimationChange(windowInsetsCompat);
        return windowInsetsCompat;
    }

    public void subscribeToWindowInsetsAnimation(Listener listener) {
        this.listeners.add(listener);
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
