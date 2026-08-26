package org.telegram.ui.Cells;

import android.view.View;
import com.google.android.gms.wearable.internal.zzff;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class ChatMessageCell$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final ChatMessageCell f$0;

    public ChatMessageCell$$ExternalSyntheticLambda7(int i, ChatMessageCell chatMessageCell) {
        this.$r8$classId = i;
        this.f$0 = chatMessageCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatMessageCell chatMessageCell = this.f$0;
                ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate = chatMessageCell.delegate;
                if (chatMessageCellDelegate != null) {
                    chatMessageCellDelegate.didPressSideButton(chatMessageCell);
                }
                break;
            case 1:
                this.f$0.scheduleUpdateRelativeDates();
                break;
            case 2:
                ChatMessageCell chatMessageCell2 = this.f$0;
                ChatMessageCell$$ExternalSyntheticLambda7 chatMessageCell$$ExternalSyntheticLambda7 = chatMessageCell2.scheduleUpdateRelativeDatesRunnable;
                zzff zzffVar = chatMessageCell2.postRunnableHolder;
                Runnable runnable = (Runnable) zzffVar.zza.remove(chatMessageCell$$ExternalSyntheticLambda7);
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                Runnable runnable2 = (Runnable) zzffVar.zza.remove(chatMessageCell2.doUpdateRelativeDatesRunnable);
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                }
                chatMessageCell2.scheduleUpdateRelativeDates();
                MessageObject messageObject = chatMessageCell2.currentMessageObject;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = chatMessageCell2.currentMessageObject;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    ChatMessageCell.ChatMessageCellDelegate chatMessageCellDelegate2 = chatMessageCell2.delegate;
                    if (chatMessageCellDelegate2 != null) {
                        chatMessageCellDelegate2.forceUpdateNoAnimation(chatMessageCell2);
                    }
                    break;
                }
                break;
            case 3:
                ChatMessageCell chatMessageCell3 = this.f$0;
                if (chatMessageCell3.replyPressed && !chatMessageCell3.replySelectorPressed && chatMessageCell3.replySelectorCanBePressed) {
                    chatMessageCell3.replySelectorPressed = true;
                    chatMessageCell3.replySelector.setState(new int[]{16842919, 16842910});
                    break;
                }
                break;
            case 4:
                ChatMessageCell chatMessageCell4 = this.f$0;
                chatMessageCell4.replySelector.setState(new int[0]);
                chatMessageCell4.invalidate();
                break;
            case 5:
                ChatMessageCell chatMessageCell5 = this.f$0;
                chatMessageCell5.replySelector.setState(new int[0]);
                chatMessageCell5.invalidate();
                break;
            case 6:
                ChatMessageCell chatMessageCell6 = this.f$0;
                chatMessageCell6.post(new ChatMessageCell$$ExternalSyntheticLambda7(7, chatMessageCell6));
                break;
            case 7:
                ChatMessageCell chatMessageCell7 = this.f$0;
                int i = 0;
                chatMessageCell7.isSpoilerRevealing = false;
                chatMessageCell7.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = chatMessageCell7.explanationLayout;
                if (textLayoutBlocks != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = textLayoutBlocks.textLayoutBlocks;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i2);
                        i2++;
                        textLayoutBlock.spoilers.clear();
                    }
                }
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = chatMessageCell7.captionLayout;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i);
                        i++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = chatMessageCell7.currentMessageObject.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i);
                            i++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                chatMessageCell7.invalidate();
                break;
            case 8:
                ChatMessageCell chatMessageCell8 = this.f$0;
                chatMessageCell8.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                chatMessageCell8.replySpoilers.clear();
                chatMessageCell8.invalidate();
                break;
            case 9:
                this.f$0.invalidateParentForce();
                break;
            case 10:
                this.f$0.invalidateOutbounds();
                break;
            case 11:
                ChatMessageCell chatMessageCell9 = this.f$0;
                if (chatMessageCell9 != null) {
                    chatMessageCell9.invalidate();
                }
                if (chatMessageCell9.getParent() instanceof View) {
                    ((View) chatMessageCell9.getParent()).invalidate();
                }
                break;
            default:
                ChatMessageCell chatMessageCell10 = this.f$0;
                if (chatMessageCell10 != null) {
                    chatMessageCell10.invalidate();
                }
                if (chatMessageCell10.getParent() instanceof View) {
                    ((View) chatMessageCell10.getParent()).invalidate();
                }
                break;
        }
    }
}
