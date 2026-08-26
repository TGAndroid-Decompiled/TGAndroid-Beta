package org.telegram.ui.Components.inset;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.credentials.Credential;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.vkryl.core.BitwiseUtils;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public final class WindowAnimatedInsetsProvider extends Credential {
    public static final Rect tmpRect;
    public static final RectF tmpRectF;
    public int activeAnimationsCounter;
    public final ReferenceList listeners = new ReferenceList(true);
    public final ViewGroup root;

    public interface Listener {
        View getAnimatedInsetsTargetView();

        void onAnimatedInsetsChanged(WindowInsetsCompat windowInsetsCompat);

        void onAnimatedInsetsFinished();

        void onAnimatedInsetsStarted();
    }

    static {
        new PointF();
        tmpRectF = new RectF();
        tmpRect = new Rect();
    }

    public WindowAnimatedInsetsProvider(ViewGroup viewGroup) {
        this.root = viewGroup;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (Build.VERSION.SDK_INT >= 30) {
            viewGroup.setWindowInsetsAnimationCallback(new WindowInsetsAnimationCompat.Impl30.ProxyCallback(this));
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.Impl21.SHOW_IME_INTERPOLATOR;
        View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(viewGroup, this);
        viewGroup.setTag(2131296698, impl21OnApplyWindowInsetsListener);
        if (viewGroup.getTag(2131296686) == null && viewGroup.getTag(2131296687) == null) {
            viewGroup.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
        }
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
        if (i == 0 && i2 == 0 && width == 0 && height == 0) {
            return windowInsetsCompat;
        }
        return windowInsetsCompat.mImpl.inset(Math.max(0, i), Math.max(0, i2), Math.max(0, width), Math.max(0, height));
    }

    @Override
    public final void onEnd() {
        int i = this.activeAnimationsCounter - 1;
        this.activeAnimationsCounter = i;
        if (i == 0) {
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onAnimatedInsetsFinished();
            }
        }
    }

    @Override
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        int typeMask = 0;
        while (it.hasNext()) {
            typeMask |= ((WindowInsetsAnimationCompat) it.next()).mImpl.getTypeMask();
        }
        if (BitwiseUtils.hasFlag(typeMask, 8)) {
            for (Listener listener : this.listeners) {
                WindowInsetsCompat windowInsetsCompatCalculateWindowInsets = calculateWindowInsets(windowInsetsCompat, listener.getAnimatedInsetsTargetView(), this.root);
                if (windowInsetsCompatCalculateWindowInsets != null) {
                    listener.onAnimatedInsetsChanged(windowInsetsCompatCalculateWindowInsets);
                }
            }
        }
        return windowInsetsCompat;
    }
}
