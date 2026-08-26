package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

public final class ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3 implements Comparator {
    public final int $r8$classId;
    public final ChatAttachAlertDocumentLayout f$0;

    public ChatAttachAlertDocumentLayout$$ExternalSyntheticLambda3(ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertDocumentLayout;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ChatAttachAlertDocumentLayout.ListItem listItem = (ChatAttachAlertDocumentLayout.ListItem) obj;
        ChatAttachAlertDocumentLayout.ListItem listItem2 = (ChatAttachAlertDocumentLayout.ListItem) obj2;
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.f$0;
                chatAttachAlertDocumentLayout.getClass();
                File file = listItem.file;
                if (file != null) {
                    if (listItem2.file != null) {
                        boolean zIsDirectory = file.isDirectory();
                        if (zIsDirectory != listItem2.file.isDirectory()) {
                            if (zIsDirectory) {
                            }
                        } else {
                            if (zIsDirectory || chatAttachAlertDocumentLayout.sortByName) {
                                return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
                            }
                            long jLastModified = listItem.file.lastModified();
                            long jLastModified2 = listItem2.file.lastModified();
                            if (jLastModified == jLastModified2) {
                                return 0;
                            }
                            if (jLastModified > jLastModified2) {
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                if (this.f$0.sortByName) {
                    return listItem.file.getName().compareToIgnoreCase(listItem2.file.getName());
                }
                long jLastModified3 = listItem.file.lastModified();
                long jLastModified4 = listItem2.file.lastModified();
                if (jLastModified3 == jLastModified4) {
                    return 0;
                }
                return jLastModified3 > jLastModified4 ? -1 : 1;
        }
    }
}
