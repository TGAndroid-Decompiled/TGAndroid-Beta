package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r51 {
    public int f37510a;
    public boolean f37511b;
    public long f37512c;
    public Uri d;
    public long f37513e;
    public Uri f37514f;
    public TLRPC.Document f37515g;
    public TLRPC.Document h;
    public int f37516i;
    public int f37517j;
    public long f37518k;
    public double f37519l;
    public String f37520m;

    public static Uri a(int i7, int i10, TLRPC.Document document) {
        StringBuilder n10 = jg.g.n(i7, "?account=", "&id=");
        n10.append(document.f26966id);
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

    public static r51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z9) {
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
        obj.f37510a = i7;
        obj.f37515g = document;
        obj.f37512c = document.f26966id;
        obj.d = a(i7, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f37513e = document2.f26966id;
            obj.f37514f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File J = org.telegram.messenger.w7.J(document2, null, false, z9);
            if (J != null && J.exists()) {
                obj.f37514f = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(i7);
                File J2 = org.telegram.messenger.w7.J(document2, null, true, z9);
                if (J2 != null && J2.exists()) {
                    obj.f37514f = Uri.fromFile(J2);
                }
            }
        }
        obj.f37520m = str;
        long j3 = document.size;
        obj.f37518k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f37516i = tL_documentAttributeVideo.f26967w;
            obj.f37517j = tL_documentAttributeVideo.h;
            obj.f37519l = j3 / d;
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
        Uri uri = this.f37514f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z9) {
        if (!b() && this.f37515g != null) {
            org.telegram.messenger.w7.G(this.f37510a);
            File J = org.telegram.messenger.w7.J(this.f37515g, null, false, z9);
            if (J != null && J.exists()) {
                this.d = Uri.fromFile(J);
            } else {
                org.telegram.messenger.w7.G(this.f37510a);
                File J2 = org.telegram.messenger.w7.J(this.f37515g, null, true, z9);
                if (J2 != null && J2.exists()) {
                    this.d = Uri.fromFile(J2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.w7.G(this.f37510a);
            File J3 = org.telegram.messenger.w7.J(this.h, null, false, z9);
            if (J3 != null && J3.exists()) {
                this.f37514f = Uri.fromFile(J3);
                return;
            }
            org.telegram.messenger.w7.G(this.f37510a);
            File J4 = org.telegram.messenger.w7.J(this.h, null, true, z9);
            if (J4 != null && J4.exists()) {
                this.f37514f = Uri.fromFile(J4);
            }
        }
    }
}
