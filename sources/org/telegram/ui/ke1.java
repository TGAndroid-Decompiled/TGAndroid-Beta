package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ke1 {
    public String f38859a;
    public final int f38860b;
    public final int f38861c;
    public final int d;
    public final int e;
    public int f38862f;
    public TLRPC.TL_wallPaper f38863g;
    public float h;
    public final File f38864i;
    public final boolean f38865j;
    public final boolean f38866k;
    public TLRPC.WallPaper f38867l;
    public Bitmap f38868m;

    public ke1(int i10, int i11, String str, int i12) {
        this.f38859a = str;
        this.f38860b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38861c = i13;
        this.f38862f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f38860b));
        sb2.append(this.f38861c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f38862f);
        sb2.append(this.h);
        String str = this.f38859a;
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
        int i10 = this.f38861c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f38860b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.e;
        if (i13 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (i13 >> 8)) & 255), Byte.valueOf((byte) (i13 & 255))).toLowerCase();
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lowerCase);
                sb2.append("~");
                sb2.append(str);
                sb2.append("~");
                sb2.append(str2);
                lowerCase = a1.g.r(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String C = a1.g.C(lowerCase, "-", str);
            if (this.f38863g != null) {
                StringBuilder i14 = sc.e.i(C, "&rotation=");
                i14.append(org.telegram.messenger.i0.s1(this.f38862f, true));
                lowerCase = i14.toString();
            } else {
                StringBuilder i15 = sc.e.i(C, "?rotation=");
                i15.append(org.telegram.messenger.i0.s1(this.f38862f, true));
                lowerCase = i15.toString();
            }
        }
        if (this.f38863g != null) {
            String str4 = "https://" + org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).U2 + "/bg/" + this.f38863g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f38865j) {
                return sc.e.A(str4, "&mode=motion");
            }
            return str4;
        }
        return a1.g.o(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).U2, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public ke1(String str, int i10, int i11, int i12, int i13) {
        this.f38859a = str;
        this.f38860b = i10 | (-16777216);
        this.f38861c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f38866k = true;
    }

    public ke1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f38859a = str;
        this.f38860b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38861c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f38862f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f38864i = file;
        this.f38865j = z10;
    }
}
