package org.telegram.ui;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.VoIpGradientLayout;
import org.telegram.ui.Components.voip.VoIpGradientLayout$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorListView.BlockButtonEdit;

public final class VoIPFragment$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public VoIPFragment$$ExternalSyntheticLambda9(int i, ArrayList arrayList) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = arrayList;
    }

    @Override
    public final void run() {
        int i = this.f$1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = (VoIPFragment) obj;
                voIPFragment.statusTextView.setSignalBarCount(i);
                if (i > 1) {
                    VoIpGradientLayout voIpGradientLayout = voIPFragment.gradientLayout;
                    if (voIpGradientLayout.state != 2) {
                        voIpGradientLayout.state = 2;
                        voIpGradientLayout.switchToConnectedAnimator();
                        ValueAnimator valueAnimator = voIpGradientLayout.badConnectionAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            voIpGradientLayout.badConnectionAnimator.cancel();
                        }
                        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(voIpGradientLayout.alphaOrangeRed, 0);
                        voIpGradientLayout.badConnectionAnimator = valueAnimatorOfInt;
                        valueAnimatorOfInt.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(voIpGradientLayout, 0));
                        voIpGradientLayout.badConnectionAnimator.setDuration(500L);
                        voIpGradientLayout.badConnectionAnimator.start();
                    }
                    voIPFragment.statusTextView.showBadConnection(false);
                } else {
                    VoIpGradientLayout voIpGradientLayout2 = voIPFragment.gradientLayout;
                    if (voIpGradientLayout2.state != 3) {
                        voIpGradientLayout2.state = 3;
                        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(voIpGradientLayout2.alphaOrangeRed, 255);
                        voIpGradientLayout2.badConnectionAnimator = valueAnimatorOfInt2;
                        valueAnimatorOfInt2.addUpdateListener(new VoIpGradientLayout$$ExternalSyntheticLambda0(voIpGradientLayout2, 2));
                        voIpGradientLayout2.badConnectionAnimator.setDuration(500L);
                        voIpGradientLayout2.badConnectionAnimator.start();
                    }
                    voIPFragment.statusTextView.showBadConnection(true);
                }
                break;
            case 1:
                ((EmojiBottomSheet) obj).onWidgetClick(i);
                break;
            case 2:
                MessagesController.getInstance(i).putUsers((ArrayList) obj, true);
                break;
            case 3:
                StoryRecorder storyRecorder = (StoryRecorder) obj;
                storyRecorder.applyPaintMessage();
                storyRecorder.switchingStory = false;
                File file = storyRecorder.outputEntry.draftThumbFile;
                if (file != null) {
                    file.delete();
                    storyRecorder.outputEntry.draftThumbFile = null;
                }
                storyRecorder.prepareThumb(true, storyRecorder.outputEntry);
                CharSequence[] charSequenceArr = {storyRecorder.captionEdit.getText()};
                int i2 = storyRecorder.currentAccount;
                ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(i2).storyEntitiesAllowed() ? MediaDataController.getInstance(i2).getEntities(charSequenceArr, true) : new ArrayList<>();
                ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(i2).storyEntitiesAllowed() ? MediaDataController.getInstance(i2).getEntities(new CharSequence[]{storyRecorder.outputEntry.caption}, true) : new ArrayList<>();
                StoryEntry storyEntry = storyRecorder.outputEntry;
                storyEntry.editedCaption = (TextUtils.equals(storyEntry.caption, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                storyRecorder.outputEntry.caption = new SpannableString(storyRecorder.captionEdit.getText());
                storyRecorder.destroyPhotoPaintView();
                storyRecorder.destroyPhotoFilterView();
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                storyRecorder.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
                storyRecorder.outputEntry = (StoryEntry) storyRecorder.entries.get(i);
                storyRecorder.onNavigateStart(0, 1);
                storyRecorder.onNavigateEnd(0, 1);
                storyRecorder.storiesSelector.listView.adapter.update(false);
                storyRecorder.captionEdit.setText(storyRecorder.outputEntry.caption);
                break;
            default:
                RichButtonRowCell.ButtonView buttonView = (RichButtonRowCell.ButtonView) obj;
                if (buttonView.pressed) {
                    RichButtonRowCell richButtonRowCell = RichButtonRowCell.this;
                    if (richButtonRowCell.delegate != null && richButtonRowCell.currentRow != null) {
                        buttonView.longPressed = true;
                        buttonView.button.setPressed(false);
                        try {
                            buttonView.performHapticFeedback(0);
                            break;
                        } catch (Exception unused) {
                        }
                        RichButtonRowCell.Delegate delegate = richButtonRowCell.delegate;
                        BlockRow blockRow = richButtonRowCell.currentRow;
                        RichEditorListView.AnonymousClass5 anonymousClass5 = (RichEditorListView.AnonymousClass5) delegate;
                        RichEditorListView.this.hideTextSelectionUi(false);
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        richEditorListView.delegate.onBlockButtonEditRequested(richEditorListView.new BlockButtonEdit(blockRow, i), buttonView);
                        break;
                    }
                }
                break;
        }
    }

    public VoIPFragment$$ExternalSyntheticLambda9(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }
}
