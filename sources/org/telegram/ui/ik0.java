package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

public final class ik0 {

    public boolean f39121a;

    public boolean f39122b;

    public int f39123c;
    public int d;

    public TLRPC.Document f39124e;

    public String f39125f;

    public String f39126g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f39126g)) {
            return Uri.fromFile(new File(this.f39126g));
        }
        TLRPC.Document document = this.f39124e;
        if (document == null) {
            return null;
        }
        String strW = document.file_name_fixed;
        String documentExtension = FileLoader.getDocumentExtension(document);
        if (documentExtension == null) {
            return null;
        }
        String lowerCase = documentExtension.toLowerCase();
        if (!strW.endsWith(lowerCase)) {
            strW = a9.p.w(strW, ".", lowerCase);
        }
        File file = new File(AndroidUtilities.getCacheDir(), strW);
        if (!file.exists()) {
            try {
                AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f39124e), file);
            } catch (IOException e9) {
                e9.printStackTrace();
            }
        }
        return Uri.fromFile(file);
    }
}
