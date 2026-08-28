package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ik0 {
    public boolean f39199a;
    public boolean f39200b;
    public int f39201c;
    public int d;
    public TLRPC.Document f39202e;
    public String f39203f;
    public String f39204g;

    public final Uri a(int i9) {
        if (!TextUtils.isEmpty(this.f39204g)) {
            return Uri.fromFile(new File(this.f39204g));
        }
        TLRPC.Document document = this.f39202e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = aa.d.z(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i9).getPathToAttach(this.f39202e), file);
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                return Uri.fromFile(file);
            }
            return null;
        }
        return null;
    }
}
