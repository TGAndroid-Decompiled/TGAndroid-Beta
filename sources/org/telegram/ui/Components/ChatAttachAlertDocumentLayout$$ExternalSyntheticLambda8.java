package org.telegram.ui.Components;

import java.util.Comparator;

public final class ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda8 implements Comparator {
    public final int $r8$classId;
    public final ChatAttachAlertDocumentLayout f$0;

    public ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda8(ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertDocumentLayout;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ChatAttachAlertDocumentLayout.ListItem listItem = (ChatAttachAlertDocumentLayout.ListItem) obj;
        ChatAttachAlertDocumentLayout.ListItem listItem2 = (ChatAttachAlertDocumentLayout.ListItem) obj2;
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$sortFileItems$8(listItem, listItem2);
            default:
                return this.f$0.lambda$sortRecentItems$7(listItem, listItem2);
        }
    }
}
