package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class qh0 {
    public boolean f49235a;
    public boolean f49236b;
    public int f49237c;
    public int d;
    public TLRPC.Document f49238e;
    public String f49239f;
    public String f49240g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f49240g)) {
            return Uri.fromFile(new File(this.f49240g));
        }
        TLRPC.Document document = this.f49238e;
        if (document != null) {
            String str = document.file_name_fixed;
            String A = org.telegram.messenger.w7.A(document);
            if (A != null) {
                String lowerCase = A.toLowerCase();
                if (!str.endsWith(lowerCase)) {
                    str = a8.p0.D(str, ".", lowerCase);
                }
                File file = new File(org.telegram.messenger.g0.E0(), str);
                if (!file.exists()) {
                    try {
                        org.telegram.messenger.w7.G(i7);
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f49238e), file);
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
