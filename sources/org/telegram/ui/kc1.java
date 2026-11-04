package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kc1 {
    public String f46897a;
    public final int f46898b;
    public final int f46899c;
    public final int d;
    public final int f46900e;
    public int f46901f;
    public TLRPC.TL_wallPaper f46902g;
    public float h;
    public final File f46903i;
    public final boolean f46904j;
    public final boolean f46905k;
    public TLRPC.WallPaper f46906l;
    public Bitmap f46907m;

    public kc1(int i3, int i10, int i11, String str) {
        this.f46897a = str;
        this.f46898b = i3 | (-16777216);
        int i12 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f46899c = i12;
        this.f46901f = i12 == 0 ? 0 : i11;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f46898b));
        sb2.append(this.f46899c);
        sb2.append(this.d);
        sb2.append(this.f46900e);
        sb2.append(this.f46901f);
        sb2.append(this.h);
        String str = this.f46897a;
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
        int i3 = this.f46899c;
        if (i3 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (i3 >> 8)) & 255), Byte.valueOf((byte) (i3 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i10 = this.f46898b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        int i11 = this.d;
        if (i11 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i12 = this.f46900e;
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
                lowerCase = a1.g.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String C = a1.g.C(lowerCase, "-", str);
            if (this.f46902g != null) {
                StringBuilder h = t4.c.h(C, "&rotation=");
                h.append(org.telegram.messenger.g0.s1(this.f46901f, true));
                lowerCase = h.toString();
            } else {
                StringBuilder h7 = t4.c.h(C, "?rotation=");
                h7.append(org.telegram.messenger.g0.s1(this.f46901f, true));
                lowerCase = h7.toString();
            }
        }
        if (this.f46902g != null) {
            String str4 = "https://" + org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).V2 + "/bg/" + this.f46902g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f46904j) {
                return t4.c.q(str4, "&mode=motion");
            }
            return str4;
        }
        return org.telegram.ui.Cells.f1.r(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).V2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public kc1(String str, int i3, int i10, int i11, int i12) {
        this.f46897a = str;
        this.f46898b = i3 | (-16777216);
        this.f46899c = i10 == 0 ? 0 : i10 | (-16777216);
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f46900e = i12 != 0 ? i12 | (-16777216) : 0;
        this.h = 1.0f;
        this.f46905k = true;
    }

    public kc1(String str, int i3, int i10, int i11, int i12, int i13, float f10, boolean z10, File file) {
        this.f46897a = str;
        this.f46898b = i3 | (-16777216);
        int i14 = i10 == 0 ? 0 : i10 | (-16777216);
        this.f46899c = i14;
        this.d = i11 == 0 ? 0 : i11 | (-16777216);
        this.f46900e = i12 != 0 ? i12 | (-16777216) : 0;
        this.f46901f = i14 == 0 ? 45 : i13;
        this.h = f10;
        this.f46903i = file;
        this.f46904j = z10;
    }
}
