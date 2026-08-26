package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

public final class TopicsTabsView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public TopicsTabsView$$ExternalSyntheticLambda0(ViewGroup viewGroup, Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = viewGroup;
        this.f$1 = obj;
        this.f$3 = obj2;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$5((ItemOptions) this.f$1, this.f$2, (TLRPC.Chat) this.f$3);
                break;
            case 1:
                ((ChatAttachAlert) this.f$0).lambda$new$33(this.f$2, (ChatActivity) this.f$1, (Theme.ResourcesProvider) this.f$3);
                break;
            case 2:
                ((StickerCategoriesListView) this.f$0).lambda$new$2((StickerCategoriesListView.EmojiCategory[]) this.f$1, (TLRPC.TL_messages_emojiGroups) this.f$3, this.f$2);
                break;
            default:
                ((TopicsTabsView) this.f$0).lambda$deleteTopics$18((HashSet) this.f$1, (ArrayList) this.f$3, this.f$2);
                break;
        }
    }

    public TopicsTabsView$$ExternalSyntheticLambda0(ChatAttachAlert chatAttachAlert, long j, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 1;
        this.f$0 = chatAttachAlert;
        this.f$2 = j;
        this.f$1 = chatActivity;
        this.f$3 = resourcesProvider;
    }

    public TopicsTabsView$$ExternalSyntheticLambda0(TopicsTabsView topicsTabsView, ItemOptions itemOptions, long j, TLRPC.Chat chat) {
        this.$r8$classId = 0;
        this.f$0 = topicsTabsView;
        this.f$1 = itemOptions;
        this.f$2 = j;
        this.f$3 = chat;
    }
}
