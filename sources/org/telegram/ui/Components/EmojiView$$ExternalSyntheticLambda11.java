package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.TopicsFragment;

public final class EmojiView$$ExternalSyntheticLambda11 implements ImageReceiver.ImageReceiverDelegate, ReplaceAnimator.Callback, FactorAnimator.Target, DialogsActivity.DialogsActivityDelegate {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;

    public EmojiView$$ExternalSyntheticLambda11(KeyEvent.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
    }

    private final void onFactorChangeFinished$org$telegram$ui$Components$EmojiView$$ExternalSyntheticLambda11(int i, float f, FactorAnimator factorAnimator) {
    }

    private final void onFactorChangeFinished$org$telegram$ui$Components$TopicsTabsView$$ExternalSyntheticLambda9(int i, float f, FactorAnimator factorAnimator) {
    }

    private final void onFinishMetadataAnimation$org$telegram$ui$Components$ChatAttachAlert$$ExternalSyntheticLambda57(ReplaceAnimator replaceAnimator, boolean z) {
    }

    private final void onFinishMetadataAnimation$org$telegram$ui$Components$FragmentContextView$$ExternalSyntheticLambda0(ReplaceAnimator replaceAnimator, boolean z) {
    }

    private final void onForceApplyChanges$org$telegram$ui$Components$ChatAttachAlert$$ExternalSyntheticLambda57(ReplaceAnimator replaceAnimator) {
    }

    private final void onForceApplyChanges$org$telegram$ui$Components$FragmentContextView$$ExternalSyntheticLambda0(ReplaceAnimator replaceAnimator) {
    }

    private final void onPrepareMetadataAnimation$org$telegram$ui$Components$ChatAttachAlert$$ExternalSyntheticLambda57(ReplaceAnimator replaceAnimator) {
    }

    private final void onPrepareMetadataAnimation$org$telegram$ui$Components$FragmentContextView$$ExternalSyntheticLambda0(ReplaceAnimator replaceAnimator) {
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 5:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 5:
                return ((SearchViewPager) this.f$0).lambda$onActionBarItemClick$4(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            default:
                return ((SharedMediaLayout) this.f$0).lambda$onActionBarItemClick$47(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
        }
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        int i = this.$r8$classId;
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        switch (this.$r8$classId) {
            case 1:
                ((AttachBotIntroTopView) this.f$0).lambda$new$1(imageReceiver, z, z2, z3);
                break;
            case 2:
                ((BackupImageView) this.f$0).lambda$new$0(imageReceiver, z, z2, z3);
                break;
            default:
                ((VideoSeekPreviewImage) this.f$0).lambda$new$0(imageReceiver, z, z2, z3);
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean hasChanges(ReplaceAnimator replaceAnimator) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        int i2 = this.$r8$classId;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiView) this.f$0).lambda$new$22(i, f, f2, factorAnimator);
                break;
            default:
                ((TopicsTabsView) this.f$0).lambda$new$1(i, f, f2, factorAnimator);
                break;
        }
    }

    @Override
    public void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
        int i = this.$r8$classId;
    }

    @Override
    public void onForceApplyChanges(ReplaceAnimator replaceAnimator) {
        int i = this.$r8$classId;
    }

    @Override
    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        switch (this.$r8$classId) {
            case 3:
                ((ChatAttachAlert) this.f$0).onCurrentLayoutAnimatorChanged(replaceAnimator);
                break;
            default:
                ((FragmentContextView) this.f$0).onItemChanged(replaceAnimator);
                break;
        }
    }

    @Override
    public void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
        int i = this.$r8$classId;
    }
}
