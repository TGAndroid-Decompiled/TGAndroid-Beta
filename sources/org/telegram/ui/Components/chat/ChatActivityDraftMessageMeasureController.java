package org.telegram.ui.Components.chat;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;

public class ChatActivityDraftMessageMeasureController {
    private long groupIdToOverride;
    private boolean hasAdditionalHeight;
    private int messageIdToOverride;
    private int previousMessageHeight;
    private RecyclerView recyclerView;

    public int getOverrideMeasureHeight(MessageObject messageObject, int i) {
        if (!filter(messageObject)) {
            return i;
        }
        int iMax = Math.max(0, (((this.recyclerView.getHeight() - this.recyclerView.getPaddingTop()) - this.recyclerView.getPaddingBottom()) - this.previousMessageHeight) - i);
        boolean z = iMax > 0;
        this.hasAdditionalHeight = z;
        if (this.messageIdToOverride > 0 && !z) {
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

    public boolean hasAdditionalHeight() {
        return this.hasAdditionalHeight;
    }

    public boolean onMessageIdChanged(int i, int i2, long j) {
        if (this.messageIdToOverride == i) {
            return setMessageIdToOverride(i2, j);
        }
        return false;
    }

    public boolean setMessageIdToOverride(int i, long j) {
        if (this.messageIdToOverride == i && this.groupIdToOverride == j) {
            return false;
        }
        this.messageIdToOverride = i;
        this.groupIdToOverride = j;
        if (i != 0) {
            return true;
        }
        this.hasAdditionalHeight = false;
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
