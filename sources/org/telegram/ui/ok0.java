package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ok0 {
    public boolean f39795a;
    public boolean f39796b;
    public int f39797c;
    public int d;
    public TLRPC.Document f39798e;
    public String f39799f;
    public String f39800g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f39800g)) {
            return Uri.fromFile(new File(this.f39800g));
        }
        TLRPC.Document document = this.f39798e;
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
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f39798e), file);
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
