package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t51 {
    public int f39543a;
    public boolean f39544b;
    public long f39545c;
    public Uri d;
    public long f39546e;
    public Uri f39547f;
    public TLRPC.Document f39548g;
    public TLRPC.Document h;
    public int f39549i;
    public int f39550j;
    public long f39551k;
    public double f39552l;
    public String f39553m;

    public static Uri a(int i7, int i10, TLRPC.Document document) {
        StringBuilder m10 = i5.c.m(i7, "?account=", "&id=");
        m10.append(document.f28057id);
        m10.append("&hash=");
        m10.append(document.access_hash);
        m10.append("&dc=");
        m10.append(document.dc_id);
        m10.append("&size=");
        m10.append(document.size);
        m10.append("&mime=");
        m10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m10.append("&rid=");
        m10.append(i10);
        m10.append("&name=");
        m10.append(URLEncoder.encode(org.telegram.messenger.w7.B(document), "UTF-8"));
        m10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m10.append(Utilities.f(bArr));
        String sb2 = m10.toString();
        return Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document) + sb2);
    }

    public static t51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        String str2;
        ?? obj = new Object();
        int i11 = 0;
        while (true) {
            if (i11 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    break;
                }
                i11++;
            } else {
                tL_documentAttributeVideo = null;
                break;
            }
        }
        if (tL_documentAttributeVideo != null && (str2 = tL_documentAttributeVideo.video_codec) != null) {
            str = str2.toLowerCase();
        } else {
            str = null;
        }
        obj.f39543a = i7;
        obj.f39548g = document;
        obj.f39545c = document.f28057id;
        obj.d = a(i7, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f39546e = document2.f28057id;
            obj.f39547f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File J = org.telegram.messenger.w7.J(document2, null, false, z10);
            if (J != null && J.exists()) {
                obj.f39547f = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(i7);
                File J2 = org.telegram.messenger.w7.J(document2, null, true, z10);
                if (J2 != null && J2.exists()) {
                    obj.f39547f = Uri.fromFile(J2);
                }
            }
        }
        obj.f39553m = str;
        long j3 = document.size;
        obj.f39551k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f39549i = tL_documentAttributeVideo.f28058w;
            obj.f39550j = tL_documentAttributeVideo.h;
            obj.f39552l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File J3 = org.telegram.messenger.w7.J(document, null, false, z10);
        if (J3 != null && J3.exists()) {
            obj.d = Uri.fromFile(J3);
            return obj;
        }
        org.telegram.messenger.w7.G(i7);
        File J4 = org.telegram.messenger.w7.J(document, null, true, z10);
        if (J4 != null && J4.exists()) {
            obj.d = Uri.fromFile(J4);
        }
        return obj;
    }

    public final boolean b() {
        Uri uri = this.d;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        Uri uri = this.f39547f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f39548g != null) {
            org.telegram.messenger.w7.G(this.f39543a);
            File J = org.telegram.messenger.w7.J(this.f39548g, null, false, z10);
            if (J != null && J.exists()) {
                this.d = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(this.f39543a);
                File J2 = org.telegram.messenger.w7.J(this.f39548g, null, true, z10);
                if (J2 != null && J2.exists()) {
                    this.d = Uri.fromFile(J2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.w7.G(this.f39543a);
            File J3 = org.telegram.messenger.w7.J(this.h, null, false, z10);
            if (J3 != null && J3.exists()) {
                this.f39547f = Uri.fromFile(J3);
                return;
            }
            org.telegram.messenger.w7.G(this.f39543a);
            File J4 = org.telegram.messenger.w7.J(this.h, null, true, z10);
            if (J4 != null && J4.exists()) {
                this.f39547f = Uri.fromFile(J4);
            }
        }
    }
}
