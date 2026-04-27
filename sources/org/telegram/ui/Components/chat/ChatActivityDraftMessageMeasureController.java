package org.telegram.ui.Components.chat;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;

public class ChatActivityDraftMessageMeasureController {
    private long groupIdToOverride;
    private int messageIdToOverride;
    private int previousMessageHeight;
    private RecyclerView recyclerView;

    public int getOverrideMeasureHeight(MessageObject messageObject, int i) {
        if (!filter(messageObject)) {
            return i;
        }
        int iMax = Math.max(0, (((this.recyclerView.getHeight() - this.recyclerView.getPaddingTop()) - this.recyclerView.getPaddingBottom()) - this.previousMessageHeight) - i);
        if (this.messageIdToOverride > 0 && iMax == 0) {
            setMessageIdToOverride(0, 0L);
        }
        return i + iMax;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void setPreviousMessageHeight(int i) {
        this.previousMessageHeight = i;
    }

    public boolean setMessageIdToOverride(int i, long j) {
        if (this.messageIdToOverride == i && this.groupIdToOverride == j) {
            return false;
        }
        this.messageIdToOverride = i;
        this.groupIdToOverride = j;
        return true;
    }

    public void onScroll() {
        if (this.messageIdToOverride <= 0) {
            return;
        }
        int childCount = this.recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (filter(this.recyclerView.getChildAt(i))) {
                return;
            }
        }
        setMessageIdToOverride(0, 0L);
    }

    public void onRequestLayout() {
        if (this.messageIdToOverride == 0) {
            return;
        }
        int childCount = this.recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.recyclerView.getChildAt(i).forceLayout();
        }
    }

    public boolean filter(View view) {
        if (view instanceof ChatMessageCell) {
            return filter(((ChatMessageCell) view).getMessageObject());
        }
        if (view instanceof ChatActionCell) {
            return filter(((ChatActionCell) view).getMessageObject());
        }
        return false;
    }

    public boolean filter(MessageObject messageObject) {
        return messageObject != null && (messageObject.getId() == this.messageIdToOverride || (this.groupIdToOverride != 0 && messageObject.getGroupId() == this.groupIdToOverride));
    }
}
