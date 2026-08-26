package org.telegram.ui.Components.chat;

import java.util.ArrayList;
import java.util.Arrays;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda19;

public final class ChatActivityBottomViewsVisibilityController implements ReplaceAnimator.Callback {
    public final ChatActivity$$ExternalSyntheticLambda19 onValuesChanged;
    public final float[] visibilityValues = new float[32];
    public int visibilityFlags = 1;
    public final ReplaceAnimator replaceAnimator = new ReplaceAnimator(this, AnimatorUtils.DECELERATE_INTERPOLATOR, 240);

    public ChatActivityBottomViewsVisibilityController(ChatActivity$$ExternalSyntheticLambda19 chatActivity$$ExternalSyntheticLambda19) {
        this.onValuesChanged = chatActivity$$ExternalSyntheticLambda19;
    }

    @Override
    public final boolean hasChanges(ReplaceAnimator replaceAnimator) {
        return false;
    }

    @Override
    public final boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        return false;
    }

    @Override
    public final void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
    }

    @Override
    public final void onForceApplyChanges(ReplaceAnimator replaceAnimator) throws Throwable {
        float[] fArr = this.visibilityValues;
        Arrays.fill(fArr, 0.0f);
        ArrayList arrayList = this.replaceAnimator.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            fArr[((Integer) entry.item).intValue()] = entry.getVisibility();
        }
        this.onValuesChanged.run();
    }

    @Override
    public final void onItemChanged(ReplaceAnimator replaceAnimator) throws Throwable {
        float[] fArr = this.visibilityValues;
        Arrays.fill(fArr, 0.0f);
        ArrayList arrayList = this.replaceAnimator.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            fArr[((Integer) entry.item).intValue()] = entry.getVisibility();
        }
        this.onValuesChanged.run();
    }

    @Override
    public final void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
    }

    public final void setViewVisible(int i, boolean z, boolean z2) {
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.visibilityFlags);
        int flag = BitwiseUtils.setFlag(this.visibilityFlags, 1 << i, z);
        this.visibilityFlags = flag;
        int iNumberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(flag);
        if (iNumberOfLeadingZeros != iNumberOfLeadingZeros2) {
            this.replaceAnimator.replace(Integer.valueOf(iNumberOfLeadingZeros2), z2);
        }
    }
}
