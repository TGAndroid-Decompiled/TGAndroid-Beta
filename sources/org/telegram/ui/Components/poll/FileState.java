package org.telegram.ui.Components.poll;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public class FileState {
    private final String attachFileName;
    public final String attachPath;
    public final int currentAccount;
    public final TLRPC.Document document;
    private boolean isExists;
    private boolean isLoading;
    public final MessageObject messageObject;

    public FileState(int i, MessageObject messageObject, TLRPC.Document document, String str) {
        this.currentAccount = i;
        this.messageObject = messageObject;
        this.document = document;
        this.attachPath = str;
        this.attachFileName = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        checkState();
    }

    public void checkState() {
        boolean z = false;
        boolean zExists = this.attachPath != null ? new File(this.attachPath).exists() : false;
        if (!zExists) {
            zExists = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.document).exists();
        }
        this.isExists = zExists;
        if (!TextUtils.isEmpty(this.attachFileName) && FileLoader.getInstance(this.currentAccount).isLoadingFile(this.attachFileName)) {
            z = true;
        }
        this.isLoading = z;
    }

    public void downloadStart() {
        FileLoader.getInstance(this.currentAccount).loadFile(this.document, this.messageObject, 2, 0);
        checkState();
    }

    public void downloadCancel() {
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.document);
        checkState();
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public boolean isExists() {
        return this.isExists;
    }
}
