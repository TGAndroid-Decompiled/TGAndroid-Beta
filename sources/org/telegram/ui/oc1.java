package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oc1 {
    public String f49927a;
    public final int f49928b;
    public final int f49929c;
    public final int d;
    public final int f49930e;
    public int f49931f;
    public TLRPC.TL_wallPaper f49932g;
    public float h;
    public final File f49933i;
    public final boolean f49934j;
    public final boolean f49935k;
    public TLRPC.WallPaper f49936l;
    public Bitmap f49937m;

    public oc1(int i7, int i10, int i11, String str) {
        this.f49927a = str;
        this.f49928b = i7 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f49929c = i12;
        this.f49931f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f49928b));
        sb2.append(this.f49929c);
        sb2.append(this.d);
        sb2.append(this.f49930e);
        sb2.append(this.f49931f);
        sb2.append(this.h);
        String str = this.f49927a;
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
        int i7 = this.f49929c;
        if (i7 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i7 >> 16)) & 255), Integer.valueOf(((byte) (i7 >> 8)) & 255), Byte.valueOf((byte) (i7 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i10 = this.f49928b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        if (i11 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i12 = this.f49930e;
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
            if (this.f49932g != null) {
                StringBuilder m10 = r.b.m(E, "&rotation=");
                m10.append(org.telegram.messenger.g0.s1(this.f49931f, true));
                lowerCase = m10.toString();
            } else {
                StringBuilder m11 = r.b.m(E, "?rotation=");
                m11.append(org.telegram.messenger.g0.s1(this.f49931f, true));
                lowerCase = m11.toString();
            }
        }
        if (this.f49932g != null) {
            String str4 = "https://" + org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).V2 + "/bg/" + this.f49932g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f49934j) {
                return r.b.v(str4, "&mode=motion");
            }
            return str4;
        }
        return org.telegram.ui.Cells.y0.m(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).V2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public oc1(String str, int i7, int i10, int i11, int i12) {
        this.f49927a = str;
        this.f49928b = i7 | (-16777216);
        this.f49929c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f49930e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.f49935k = true;
    }

    public oc1(String str, int i7, int i10, int i11, int i12, int i13, float f10, boolean z10, File file) {
        this.f49927a = str;
        this.f49928b = i7 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f49929c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f49930e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f49931f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.f49933i = file;
        this.f49934j = z10;
    }
}
