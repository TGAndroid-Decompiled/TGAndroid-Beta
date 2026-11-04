package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class yc {
    public String f26561a;
    public String f26562b;
    public String f26563c;
    public String d;
    public String f26564e;
    public String f26565f;
    public boolean f26566g;
    public int h;
    public int f26567i;
    public boolean f26568j;
    public int f26569k;

    public static yc a(String str) {
        String str2;
        String str3;
        yc ycVar = null;
        ycVar = null;
        ycVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.f26561a = split[0];
                obj.f26562b = split[1];
                obj.f26563c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f26564e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f26563c;
                }
                obj.f26565f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f26566g = z10;
                }
                if (split.length >= 9) {
                    obj.f26567i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f26569k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f26569k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f26564e);
                ycVar = obj;
                if (!isEmpty) {
                    obj.f26564e = obj.f26564e.replace("-", "_");
                    ycVar = obj;
                }
            }
        }
        return ycVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f26563c;
        } else if (j()) {
            return "unofficial_" + this.f26563c;
        } else {
            return this.f26563c;
        }
    }

    public final String c() {
        return this.f26563c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a1.g.s(new StringBuilder("unofficial_base_"), this.f26563c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a1.g.s(new StringBuilder("remote_"), this.f26563c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a1.g.s(new StringBuilder("unofficial_"), this.f26563c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f26564e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f26565f);
        return this.f26561a + "|" + this.f26562b + "|" + this.f26563c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f26565f + "|" + (this.f26566g ? 1 : 0) + "|" + this.f26567i + "|" + this.f26569k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f26564e) && !this.f26564e.equals(this.f26563c)) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (!TextUtils.isEmpty(this.d) && !i() && !j()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        return "remote".equals(this.d);
    }

    public final boolean j() {
        return "unofficial".equals(this.d);
    }
}
