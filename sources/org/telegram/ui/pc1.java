package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pc1 {
    public String f50979a;
    public final int f50980b;
    public final int f50981c;
    public final int d;
    public final int f50982e;
    public int f50983f;
    public TLRPC.TL_wallPaper f50984g;
    public float h;
    public final File f50985i;
    public final boolean f50986j;
    public final boolean f50987k;
    public TLRPC.WallPaper f50988l;
    public Bitmap f50989m;

    public pc1(int i7, int i10, int i11, String str) {
        this.f50979a = str;
        this.f50980b = i7 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f50981c = i12;
        this.f50983f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f50980b));
        sb2.append(this.f50981c);
        sb2.append(this.d);
        sb2.append(this.f50982e);
        sb2.append(this.f50983f);
        sb2.append(this.h);
        String str = this.f50979a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.a(sb2.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i7 = this.f50981c;
        if (i7 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i7 >> 16)) & 255), Integer.valueOf(((byte) (i7 >> 8)) & 255), Byte.valueOf((byte) (i7 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i10 = this.f50980b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        if (i11 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i12 = this.f50982e;
        if (i12 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lowerCase);
                sb2.append("~");
                sb2.append(str);
                sb2.append("~");
                sb2.append(str2);
                lowerCase = a8.p0.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String E = a8.p0.E(lowerCase, "-", str);
            if (this.f50984g != null) {
                StringBuilder n10 = p5.c.n(E, "&rotation=");
                n10.append(org.telegram.messenger.g0.s1(this.f50983f, true));
                lowerCase = n10.toString();
            } else {
                StringBuilder n11 = p5.c.n(E, "?rotation=");
                n11.append(org.telegram.messenger.g0.s1(this.f50983f, true));
                lowerCase = n11.toString();
            }
        }
        if (this.f50984g != null) {
            String str4 = "https://" + org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).X2 + "/bg/" + this.f50984g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f50986j) {
                return p5.c.v(str4, "&mode=motion");
            }
            return str4;
        }
        return p5.c.m(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).X2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public pc1(String str, int i7, int i10, int i11, int i12) {
        this.f50979a = str;
        this.f50980b = i7 | (-16777216);
        this.f50981c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f50982e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.f50987k = true;
    }

    public pc1(String str, int i7, int i10, int i11, int i12, int i13, float f10, boolean z10, File file) {
        this.f50979a = str;
        this.f50980b = i7 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f50981c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f50982e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f50983f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.f50985i = file;
        this.f50986j = z10;
    }
}
