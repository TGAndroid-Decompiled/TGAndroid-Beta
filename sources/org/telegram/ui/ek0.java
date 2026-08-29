package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
public final class ek0 {
    public boolean f37853a;
    public boolean f37854b;
    public int f37855c;
    public int d;
    public TLRPC.Document f37856e;
    public String f37857f;
    public String f37858g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.f37858g)) {
            return Uri.fromFile(new File(this.f37858g));
        }
        TLRPC.Document document = this.f37856e;
        if (document != null) {
            String str = document.file_name_fixed;
            String documentExtension = FileLoader.getDocumentExtension(document);
            if (documentExtension != null) {
                String lowerCase = documentExtension.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a4.w.y(str, ".", lowerCase);
                }
                File file = new File(AndroidUtilities.getCacheDir(), str);
                if (!file.exists()) {
                    try {
                        AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.f37856e), file);
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
