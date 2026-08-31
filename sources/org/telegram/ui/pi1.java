package org.telegram.ui;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pi1 {
    public String f40056a;
    public final int f40057b;
    public final int f40058c;
    public final int d;
    public final int f40059e;
    public int f40060f;
    public TLRPC.TL_wallPaper f40061g;
    public float h;
    public final File f40062i;
    public final boolean f40063j;
    public final boolean f40064k;
    public TLRPC.WallPaper f40065l;
    public Bitmap f40066m;

    public pi1(int i10, int i11, String str, int i12) {
        this.f40056a = str;
        this.f40057b = i10 | (-16777216);
        int i13 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f40058c = i13;
        this.f40060f = i13 == 0 ? 0 : i12;
        this.h = 1.0f;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f40057b));
        sb.append(this.f40058c);
        sb.append(this.d);
        sb.append(this.f40059e);
        sb.append(this.f40060f);
        sb.append(this.h);
        String str = this.f40056a;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return Utilities.MD5(sb.toString());
    }

    public final String b() {
        String str;
        String str2;
        String str3 = null;
        int i10 = this.f40058c;
        if (i10 != 0) {
            str = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i10 >> 16)) & 255), Integer.valueOf(((byte) (i10 >> 8)) & 255), Byte.valueOf((byte) (i10 & 255))).toLowerCase();
        } else {
            str = null;
        }
        int i11 = this.f40057b;
        String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i11 >> 16)) & 255), Integer.valueOf(((byte) (i11 >> 8)) & 255), Byte.valueOf((byte) (i11 & 255))).toLowerCase();
        int i12 = this.d;
        if (i12 != 0) {
            str2 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i12 >> 16)) & 255), Integer.valueOf(((byte) (i12 >> 8)) & 255), Byte.valueOf((byte) (i12 & 255))).toLowerCase();
        } else {
            str2 = null;
        }
        int i13 = this.f40059e;
        if (i13 != 0) {
            str3 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i13 >> 16)) & 255), Integer.valueOf(((byte) (i13 >> 8)) & 255), Byte.valueOf((byte) (i13 & 255))).toLowerCase();
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(lowerCase);
                sb.append("~");
                sb.append(str);
                sb.append("~");
                sb.append(str2);
                lowerCase = android.support.v4.media.a.r(sb, "~", str3);
            } else {
                lowerCase = lowerCase + "~" + str + "~" + str2;
            }
        } else if (str != null) {
            String z4 = android.support.v4.media.a.z(lowerCase, "-", str);
            if (this.f40061g != null) {
                StringBuilder f10 = w.c.f(z4, "&rotation=");
                f10.append(AndroidUtilities.getWallpaperRotation(this.f40060f, true));
                lowerCase = f10.toString();
            } else {
                StringBuilder f11 = w.c.f(z4, "?rotation=");
                f11.append(AndroidUtilities.getWallpaperRotation(this.f40060f, true));
                lowerCase = f11.toString();
            }
        }
        if (this.f40061g != null) {
            String str4 = "https://" + MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/bg/" + this.f40061g.slug + "?intensity=" + ((int) (this.h * 100.0f)) + "&bg_color=" + lowerCase;
            if (this.f40063j) {
                return w.c.e(str4, "&mode=motion");
            }
            return str4;
        }
        return android.support.v4.media.a.p(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/bg/", lowerCase, new StringBuilder("https://"));
    }

    public pi1(String str, int i10, int i11, int i12, int i13) {
        this.f40056a = str;
        this.f40057b = i10 | (-16777216);
        this.f40058c = i11 == 0 ? 0 : i11 | (-16777216);
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f40059e = i13 != 0 ? i13 | (-16777216) : 0;
        this.h = 1.0f;
        this.f40064k = true;
    }

    public pi1(String str, int i10, int i11, int i12, int i13, int i14, float f10, boolean z4, File file) {
        this.f40056a = str;
        this.f40057b = i10 | (-16777216);
        int i15 = i11 == 0 ? 0 : i11 | (-16777216);
        this.f40058c = i15;
        this.d = i12 == 0 ? 0 : i12 | (-16777216);
        this.f40059e = i13 != 0 ? i13 | (-16777216) : 0;
        this.f40060f = i15 == 0 ? 45 : i14;
        this.h = f10;
        this.f40062i = file;
        this.f40063j = z4;
    }
}
