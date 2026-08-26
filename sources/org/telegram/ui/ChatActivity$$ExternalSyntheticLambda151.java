package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.web.AddressBarList;

public final class ChatActivity$$ExternalSyntheticLambda151 implements Consumer {
    public final int $r8$classId;

    public ChatActivity$$ExternalSyntheticLambda151(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.$r8$classId) {
            case 0:
                View view = (View) obj;
                if ((view instanceof ChatMessageCell) && (messageObject = ((ChatMessageCell) view).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 1:
                ((SampleQueue.SharedSampleMetadata) obj).getClass();
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof QuickRepliesActivity.QuickReplyView) {
                    ((QuickRepliesActivity.QuickReplyView) view2).textView.invalidate();
                }
                break;
            case 3:
                View view3 = (View) obj;
                if (view3 instanceof QuickRepliesActivity.QuickReplyView) {
                    ((QuickRepliesActivity.QuickReplyView) view3).checkBox.checkBoxBase.setChecked(-1, false, true);
                }
                break;
            case 4:
                View view4 = (View) obj;
                if ((view4 instanceof ChatMessageCell) && (messageObject2 = ((ChatMessageCell) view4).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 5:
                View view5 = (View) obj;
                if (!(view5 instanceof BottomSheet.BottomSheetCell)) {
                    view5.invalidate();
                } else {
                    ((BottomSheet.BottomSheetCell) view5).getTextView().invalidate();
                }
                break;
            case 6:
                ((View) obj).invalidate();
                break;
            case 7:
                View view6 = (View) obj;
                if (view6 instanceof MentionCell) {
                    MentionCell mentionCell = (MentionCell) view6;
                    mentionCell.nameTextView.invalidate();
                    mentionCell.usernameTextView.invalidate();
                } else if (!(view6 instanceof QuickRepliesActivity.QuickReplyView)) {
                    view6.invalidate();
                } else {
                    ((QuickRepliesActivity.QuickReplyView) view6).textView.invalidate();
                }
                break;
            case 8:
                View view7 = (View) obj;
                if (view7 instanceof StickerEmojiCell) {
                    ((StickerEmojiCell) view7).disableEditMode(true);
                }
                break;
            case 9:
                View view8 = (View) obj;
                if (view8 instanceof StickerEmojiCell) {
                    ((StickerEmojiCell) view8).enableEditMode(true);
                }
                break;
            case 10:
                Long l = (Long) obj;
                if (l == null || l.longValue() == Long.MAX_VALUE) {
                    AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(22));
                } else {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        safeLastFragment.presentFragment(ProfileActivity.of(l.longValue()));
                    }
                }
                break;
            case 11:
                break;
            case 12:
                View view9 = (View) obj;
                view9.setScaleX(1.0f);
                view9.setScaleY(1.0f);
                break;
            case 13:
                ((DialogStoriesCell.StoryCell) ((View) obj)).invalidate();
                break;
            case 14:
                View view10 = (View) obj;
                view10.setAlpha(1.0f);
                view10.setTranslationX(0.0f);
                view10.setTranslationY(0.0f);
                break;
            case 15:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof AddressBarList.BookmarkView) {
                    ((AddressBarList.BookmarkView) view11).setChecked(false);
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof AddressBarList.BookmarkView) {
                    ((AddressBarList.BookmarkView) view12).setChecked(false);
                }
                break;
        }
    }
}
