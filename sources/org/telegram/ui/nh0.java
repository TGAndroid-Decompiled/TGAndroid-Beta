package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class nh0 {
    public boolean f48003a;
    public boolean f48004b;
    public int f48005c;
    public int d;
    public TLRPC.Document f48006e;
    public String f48007f;
    public String f48008g;

    public final Uri a(int i3) {
        if (!TextUtils.isEmpty(this.f48008g)) {
            return Uri.fromFile(new File(this.f48008g));
        }
        TLRPC.Document document = this.f48006e;
        if (document != null) {
            String str = document.file_name_fixed;
            String A = org.telegram.messenger.w7.A(document);
            if (A != null) {
                String lowerCase = A.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a1.g.C(str, ".", lowerCase);
                }
                File file = new File(org.telegram.messenger.g0.E0(), str);
                if (!file.exists()) {
                    try {
                        org.telegram.messenger.w7.G(i3);
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f48006e), file);
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
