package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class qh0 {
    public boolean f49233a;
    public boolean f49234b;
    public int f49235c;
    public int d;
    public TLRPC.Document f49236e;
    public String f49237f;
    public String f49238g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f49238g)) {
            return Uri.fromFile(new File(this.f49238g));
        }
        TLRPC.Document document = this.f49236e;
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
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f49236e), file);
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
