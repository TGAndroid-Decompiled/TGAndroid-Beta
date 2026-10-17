package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class kk0 {
    public boolean f38569a;
    public boolean f38570b;
    public int f38571c;
    public int d;
    public TLRPC.Document e;
    public String f38572f;
    public String f38573g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f38573g)) {
            return Uri.fromFile(new File(this.f38573g));
        }
        TLRPC.Document document = this.e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a1.g.D(str, ".", lowerCase);
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
