package org.telegram.ui.Components.chat;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;

public final class ChatActivityDraftMessageMeasureController {
    public long groupIdToOverride;
    public boolean hasAdditionalHeight;
    public int messageIdToOverride;
    public int previousMessageHeight;
    public RecyclerView recyclerView;

    public final boolean filter(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        if (messageObject.getId() != this.messageIdToOverride) {
            return this.groupIdToOverride != 0 && messageObject.getGroupId() == this.groupIdToOverride;
        }
        return true;
    }

    public final boolean hasAdditionalHeight() {
        return this.hasAdditionalHeight;
    }

    public final void setMessageIdToOverride(int i, long j) {
        if (this.messageIdToOverride == i && this.groupIdToOverride == j) {
            return;
        }
        this.messageIdToOverride = i;
        this.groupIdToOverride = j;
        if (i == 0) {
            this.hasAdditionalHeight = false;
        }
    }

    public final void setPreviousMessageHeight(int i) {
        this.previousMessageHeight = i;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }
}
