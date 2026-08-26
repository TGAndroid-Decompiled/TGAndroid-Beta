package org.telegram.ui.Components.poll;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class FileState {
    public final String attachFileName;
    public final String attachPath;
    public final int currentAccount;
    public final TLRPC.Document document;
    public boolean isExists;
    public boolean isLoading;
    public final MessageObject messageObject;

    public FileState(int i, MessageObject messageObject, TLRPC.Document document, String str) {
        this.currentAccount = i;
        this.messageObject = messageObject;
        this.document = document;
        this.attachPath = str;
        this.attachFileName = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        checkState();
    }

    public final void checkState() {
        boolean z = false;
        String str = this.attachPath;
        boolean zExists = str != null ? new File(str).exists() : false;
        int i = this.currentAccount;
        if (!zExists) {
            zExists = FileLoader.getInstance(i).getPathToAttach(this.document).exists();
        }
        this.isExists = zExists;
        String str2 = this.attachFileName;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i).isLoadingFile(str2)) {
            z = true;
        }
        this.isLoading = z;
    }
}
