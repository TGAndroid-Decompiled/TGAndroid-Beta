package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ij1 {
    public String f38719a;
    public final int f38720b;
    public final int f38721c;
    public final int d;
    public final int f38722e;
    public int f38723f;
    public TLRPC.TL_wallPaper f38724g;
    public float h;
    public final File f38725i;
    public final boolean f38726j;
    public final boolean f38727k;
    public TLRPC.WallPaper f38728l;
    public Bitmap f38729m;

    public ij1(int i10, int i11, String str, int i12) {
        this.f38719a = str;
        this.f38720b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38721c = i13;
        this.f38723f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f38720b));
        sb2.append(this.f38721c);
        sb2.append(this.d);
        sb2.append(this.f38722e);
        sb2.append(this.f38723f);
        sb2.append(this.h);
        String str = this.f38719a;
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
        int i10 = this.f38721c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f38720b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.f38722e;
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
                lowerCase = a1.g.t(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String D = a1.g.D(lowerCase, "-", str);
            if (this.f38724g != null) {
                StringBuilder j3 = sc.v.j(D, "&rotation=");
                j3.append(AndroidUtilities.getWallpaperRotation(this.f38723f, true));
                lowerCase = j3.toString();
            } else {
                StringBuilder j10 = sc.v.j(D, "?rotation=");
                j10.append(AndroidUtilities.getWallpaperRotation(this.f38723f, true));
                lowerCase = j10.toString();
            }
        }
        if (this.f38724g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f38724g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f38726j) {
                return sc.v.v(str4, "&mode=motion");
            }
            return str4;
        }
        return a1.g.r(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public ij1(String str, int i10, int i11, int i12, int i13) {
        this.f38719a = str;
        this.f38720b = i10 | (-16777216);
        this.f38721c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f38722e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f38727k = true;
    }

    public ij1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f38719a = str;
        this.f38720b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f38721c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f38722e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f38723f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f38725i = file;
        this.f38726j = z10;
    }
}
