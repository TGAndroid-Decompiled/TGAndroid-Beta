package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ok0 {
    public boolean f36831a;
    public boolean f36832b;
    public int f36833c;
    public int d;
    public TLRPC.Document e;
    public String f36834f;
    public String f36835g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f36835g)) {
            return Uri.fromFile(new File(this.f36835g));
        }
        TLRPC.Document document = this.e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = android.support.v4.media.a.z(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.e), file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
