package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;
public final class qh0 {
    public boolean f49206a;
    public boolean f49207b;
    public int f49208c;
    public int d;
    public TLRPC.Document f49209e;
    public String f49210f;
    public String f49211g;

    public final Uri a(int i7) {
        if (!TextUtils.isEmpty(this.f49211g)) {
            return Uri.fromFile(new File(this.f49211g));
        }
        TLRPC.Document document = this.f49209e;
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
                        org.telegram.messenger.g0.E(org.telegram.messenger.w7.I(this.f49209e), file);
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
