package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class zc {
    public String f19495a;
    public String f19496b;
    public String f19497c;
    public String d;
    public String e;
    public String f19498f;
    public boolean f19499g;
    public int h;
    public int f19500i;
    public boolean f19501j;
    public int f19502k;

    public static zc a(String str) {
        String str2;
        String str3;
        zc zcVar = null;
        zcVar = null;
        zcVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.f19495a = split[0];
                obj.f19496b = split[1];
                obj.f19497c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f19497c;
                }
                obj.f19498f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f19499g = z10;
                }
                if (split.length >= 9) {
                    obj.f19500i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f19502k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f19502k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.e);
                zcVar = obj;
                if (!isEmpty) {
                    obj.e = obj.e.replace("-", "_");
                    zcVar = obj;
                }
            }
        }
        return zcVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f19497c;
        } else if (j()) {
            return "unofficial_" + this.f19497c;
        } else {
            return this.f19497c;
        }
    }

    public final String c() {
        return this.f19497c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_base_"), this.f19497c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("remote_"), this.f19497c, ".xml"));
        }
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_"), this.f19497c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f19498f);
        return this.f19495a + "|" + this.f19496b + "|" + this.f19497c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f19498f + "|" + (this.f19499g ? 1 : 0) + "|" + this.f19500i + "|" + this.f19502k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.e) && !this.e.equals(this.f19497c)) {
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
