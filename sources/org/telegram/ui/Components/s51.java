package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s51 {
    public int f37925a;
    public boolean f37926b;
    public long f37927c;
    public Uri d;
    public long f37928e;
    public Uri f37929f;
    public TLRPC.Document f37930g;
    public TLRPC.Document h;
    public int f37931i;
    public int f37932j;
    public long f37933k;
    public double f37934l;
    public String f37935m;

    public static Uri a(int i7, int i10, TLRPC.Document document) {
        StringBuilder n10 = jg.g.n(i7, "?account=", "&id=");
        n10.append(document.f26962id);
        n10.append("&hash=");
        n10.append(document.access_hash);
        n10.append("&dc=");
        n10.append(document.dc_id);
        n10.append("&size=");
        n10.append(document.size);
        n10.append("&mime=");
        n10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        n10.append("&rid=");
        n10.append(i10);
        n10.append("&name=");
        n10.append(URLEncoder.encode(org.telegram.messenger.w7.B(document), "UTF-8"));
        n10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        n10.append(Utilities.f(bArr));
        String sb2 = n10.toString();
        return Uri.parse("tg://" + org.telegram.messenger.w7.r(null, document) + sb2);
    }

    public static s51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z9) {
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
        obj.f37925a = i7;
        obj.f37930g = document;
        obj.f37927c = document.f26962id;
        obj.d = a(i7, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f37928e = document2.f26962id;
            obj.f37929f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File J = org.telegram.messenger.w7.J(document2, null, false, z9);
            if (J != null && J.exists()) {
                obj.f37929f = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(i7);
                File J2 = org.telegram.messenger.w7.J(document2, null, true, z9);
                if (J2 != null && J2.exists()) {
                    obj.f37929f = Uri.fromFile(J2);
                }
            }
        }
        obj.f37935m = str;
        long j3 = document.size;
        obj.f37933k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f37931i = tL_documentAttributeVideo.f26963w;
            obj.f37932j = tL_documentAttributeVideo.h;
            obj.f37934l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File J3 = org.telegram.messenger.w7.J(document, null, false, z9);
        if (J3 != null && J3.exists()) {
            obj.d = Uri.fromFile(J3);
            return obj;
        }
        org.telegram.messenger.w7.G(i7);
        File J4 = org.telegram.messenger.w7.J(document, null, true, z9);
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
        Uri uri = this.f37929f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z9) {
        if (!b() && this.f37930g != null) {
            org.telegram.messenger.w7.G(this.f37925a);
            File J = org.telegram.messenger.w7.J(this.f37930g, null, false, z9);
            if (J != null && J.exists()) {
                this.d = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(this.f37925a);
                File J2 = org.telegram.messenger.w7.J(this.f37930g, null, true, z9);
                if (J2 != null && J2.exists()) {
                    this.d = Uri.fromFile(J2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.w7.G(this.f37925a);
            File J3 = org.telegram.messenger.w7.J(this.h, null, false, z9);
            if (J3 != null && J3.exists()) {
                this.f37929f = Uri.fromFile(J3);
                return;
            }
            org.telegram.messenger.w7.G(this.f37925a);
            File J4 = org.telegram.messenger.w7.J(this.h, null, true, z9);
            if (J4 != null && J4.exists()) {
                this.f37929f = Uri.fromFile(J4);
            }
        }
    }
}
