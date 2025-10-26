package org.telegram.ui.Components.chat;

import java.util.Arrays;
import java.util.Iterator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class ChatActivityBottomViewsVisibilityController implements ReplaceAnimator.Callback {
    private final Runnable onValuesChanged;
    private final float[] visibilityValues = new float[32];
    private int visibilityFlags = 1;
    private final ReplaceAnimator replaceAnimator = new ReplaceAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 320);

    @Override
    public boolean hasChanges(ReplaceAnimator replaceAnimator) {
        return ReplaceAnimator.Callback.CC.$default$hasChanges(this, replaceAnimator);
    }

    @Override
    public boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        return ReplaceAnimator.Callback.CC.$default$onApplyMetadataAnimation(this, replaceAnimator, f);
    }

    @Override
    public void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
        ReplaceAnimator.Callback.CC.$default$onFinishMetadataAnimation(this, replaceAnimator, z);
    }

    @Override
    public void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
        ReplaceAnimator.Callback.CC.$default$onPrepareMetadataAnimation(this, replaceAnimator);
    }

    public ChatActivityBottomViewsVisibilityController(Runnable runnable) {
        this.onValuesChanged = runnable;
    }

    public float getVisibility(int i) {
        return this.visibilityValues[i];
    }

    public void setViewVisible(int i, boolean z, boolean z2) {
        int currentPriorityContainerId = getCurrentPriorityContainerId();
        this.visibilityFlags = BitwiseUtils.setFlag(this.visibilityFlags, 1 << i, z);
        int currentPriorityContainerId2 = getCurrentPriorityContainerId();
        if (currentPriorityContainerId != currentPriorityContainerId2) {
            this.replaceAnimator.replace(Integer.valueOf(currentPriorityContainerId2), z2);
        }
    }

    public int getCurrentPriorityContainerId() {
        return 31 - Integer.numberOfLeadingZeros(this.visibilityFlags);
    }

    @Override
    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        onItemChanged();
    }

    @Override
    public void onForceApplyChanges(ReplaceAnimator replaceAnimator) {
        onItemChanged();
    }

    private void onItemChanged() {
        Arrays.fill(this.visibilityValues, 0.0f);
        Iterator it = this.replaceAnimator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            this.visibilityValues[((Integer) entry.item).intValue()] = entry.getVisibility();
        }
        this.onValuesChanged.run();
    }
}
