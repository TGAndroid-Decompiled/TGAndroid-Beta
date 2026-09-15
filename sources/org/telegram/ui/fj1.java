package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fj1 {
    public String f33594a;
    public final int f33595b;
    public final int f33596c;
    public final int d;
    public final int e;
    public int f33597f;
    public TLRPC.TL_wallPaper f33598g;
    public float h;
    public final File f33599i;
    public final boolean f33600j;
    public final boolean f33601k;
    public TLRPC.WallPaper f33602l;
    public Bitmap f33603m;

    public fj1(int i10, int i11, String str, int i12) {
        this.f33594a = str;
        this.f33595b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f33596c = i13;
        this.f33597f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f33595b));
        sb2.append(this.f33596c);
        sb2.append(this.d);
        sb2.append(this.e);
        sb2.append(this.f33597f);
        sb2.append(this.h);
        String str = this.f33594a;
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
        int i10 = this.f33596c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f33595b;
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
                lowerCase = a4.a.s(sb2, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String C = a4.a.C(lowerCase, "-", str);
            if (this.f33598g != null) {
                StringBuilder g10 = w.f.g(C, "&rotation=");
                g10.append(AndroidUtilities.getWallpaperRotation(this.f33597f, true));
                lowerCase = g10.toString();
            } else {
                StringBuilder g11 = w.f.g(C, "?rotation=");
                g11.append(AndroidUtilities.getWallpaperRotation(this.f33597f, true));
                lowerCase = g11.toString();
            }
        }
        if (this.f33598g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f33598g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f33600j) {
                return org.telegram.ui.Cells.p6.t(str4, "&mode=motion");
            }
            return str4;
        }
        return a4.a.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public fj1(String str, int i10, int i11, int i12, int i13) {
        this.f33594a = str;
        this.f33595b = i10 | (-16777216);
        this.f33596c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f33601k = true;
    }

    public fj1(String str, int i10, int i11, int i12, int i13, int i14, float f7, boolean z10, File file) {
        this.f33594a = str;
        this.f33595b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f33596c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f33597f = i15 == 0 ? 45 : i14;
        this.h = f7;
        this.f33599i = file;
        this.f33600j = z10;
    }
}
