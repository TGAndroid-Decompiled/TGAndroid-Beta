package org.telegram.ui;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.SeekBar;

public final class PhotoViewer$$ExternalSyntheticLambda96 implements DialogsActivity.DialogsActivityDelegate, SeekBar.SeekBarDelegate, LocationActivity.LocationActivityDelegate, FactorAnimator.Target, ImageReceiver.ImageReceiverDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda96(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onFactorChangeFinished$org$telegram$ui$MainTabsLayout$$ExternalSyntheticLambda1(int i, float f, FactorAnimator factorAnimator) {
    }

    private final void onFactorChangeFinished$org$telegram$ui$ProfileActivity$$ExternalSyntheticLambda46(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
            case 1:
                break;
            case 4:
                break;
            case 5:
                break;
            case 8:
                break;
        }
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 1:
                return ((WallpapersListActivity.AnonymousClass2) this.f$0).lambda$onItemClick$3(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            case 4:
                return ((DialogOrContactPickerActivity) this.f$0).lambda$new$1(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            case 5:
                return ((FeedWidgetConfigActivity) this.f$0).lambda$handleIntent$0(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            case 8:
                return ((NotificationsCustomSettingsActivity) this.f$0).lambda$createView$8(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
            default:
                return ((SaveToGallerySettingsActivity) this.f$0).lambda$createView$0(dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        switch (this.$r8$classId) {
            case 3:
                ((ChatEditActivity) this.f$0).lambda$createView$6(messageMedia, i, z, i2, j);
                break;
            default:
                ((GroupCreateFinalActivity) this.f$0).lambda$createView$5(messageMedia, i, z, i2, j);
                break;
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
            case 0:
                ((PhotoViewer) this.f$0).lambda$setParentActivity$78(imageReceiver, z, z2, z3);
                break;
            default:
                ((ThemePreviewActivity) this.f$0).lambda$createView$4(imageReceiver, z, z2, z3);
                break;
        }
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        int i2 = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public boolean isSeekBarDragAllowed() {
        return SeekBar.SeekBarDelegate.CC.$default$isSeekBarDragAllowed(this);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        int i = this.$r8$classId;
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        int i2 = this.$r8$classId;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        switch (this.$r8$classId) {
            case 7:
                ((MainTabsLayout) this.f$0).lambda$new$1(i, f, f2, factorAnimator);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$new$47(i, f, f2, factorAnimator);
                break;
        }
    }

    @Override
    public void onSeekBarContinuousDrag(float f) {
        SeekBar.SeekBarDelegate.CC.$default$onSeekBarContinuousDrag(this, f);
    }

    @Override
    public void onSeekBarDrag(float f) {
        ((ArticleViewer.BlockAudioCell) this.f$0).lambda$new$0(f);
    }

    @Override
    public void onSeekBarPressed() {
        SeekBar.SeekBarDelegate.CC.$default$onSeekBarPressed(this);
    }

    @Override
    public void onSeekBarReleased() {
        SeekBar.SeekBarDelegate.CC.$default$onSeekBarReleased(this);
    }

    @Override
    public boolean reverseWaveform() {
        return SeekBar.SeekBarDelegate.CC.$default$reverseWaveform(this);
    }
}
