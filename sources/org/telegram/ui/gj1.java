package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gj1 {
    public String f36697a;
    public final int f36698b;
    public final int f36699c;
    public final int d;
    public final int f36700e;
    public int f36701f;
    public TLRPC.TL_wallPaper f36702g;
    public float h;
    public final File f36703i;
    public final boolean f36704j;
    public final boolean f36705k;
    public TLRPC.WallPaper f36706l;
    public Bitmap f36707m;

    public gj1(int i10, int i11, String str, int i12) {
        this.f36697a = str;
        this.f36698b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f36699c = i13;
        this.f36701f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f36698b));
        sb2.append(this.f36699c);
        sb2.append(this.d);
        sb2.append(this.f36700e);
        sb2.append(this.f36701f);
        sb2.append(this.h);
        String str = this.f36697a;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return Utilities.MD5(sb2.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i10 = this.f36699c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f36698b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.f36700e;
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
                lowerCase = a4.a.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String C = a4.a.C(lowerCase, "-", str);
            if (this.f36702g != null) {
                StringBuilder g10 = w.f.g(C, "&rotation=");
                g10.append(AndroidUtilities.getWallpaperRotation(this.f36701f, true));
                lowerCase = g10.toString();
            } else {
                StringBuilder g11 = w.f.g(C, "?rotation=");
                g11.append(AndroidUtilities.getWallpaperRotation(this.f36701f, true));
                lowerCase = g11.toString();
            }
        }
        if (this.f36702g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f36702g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f36704j) {
                return org.telegram.ui.Cells.p6.t(str4, "&mode=motion");
            }
            return str4;
        }
        return a4.a.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public gj1(String str, int i10, int i11, int i12, int i13) {
        this.f36697a = str;
        this.f36698b = i10 | (-16777216);
        this.f36699c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f36700e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f36705k = true;
    }

    public gj1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f36697a = str;
        this.f36698b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f36699c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f36700e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f36701f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f36703i = file;
        this.f36704j = z10;
    }
}
