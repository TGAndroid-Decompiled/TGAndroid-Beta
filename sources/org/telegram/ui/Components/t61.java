package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t61 {
    public int f30456a;
    public boolean f30457b;
    public long f30458c;
    public Uri d;
    public long e;
    public Uri f30459f;
    public TLRPC.Document f30460g;
    public TLRPC.Document h;
    public int f30461i;
    public int f30462j;
    public long f30463k;
    public double f30464l;
    public String f30465m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder l4 = i0.a.l(i10, "?account=", "&id=");
        l4.append(document.f19799id);
        l4.append("&hash=");
        l4.append(document.access_hash);
        l4.append("&dc=");
        l4.append(document.dc_id);
        l4.append("&size=");
        l4.append(document.size);
        l4.append("&mime=");
        l4.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        l4.append("&rid=");
        l4.append(i11);
        l4.append("&name=");
        l4.append(URLEncoder.encode(org.telegram.messenger.b8.B(document), "UTF-8"));
        l4.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        l4.append(Utilities.f(bArr));
        String sb2 = l4.toString();
        return Uri.parse("tg://" + org.telegram.messenger.b8.r(null, document) + sb2);
    }

    public static t61 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        String str2;
        ?? obj = new Object();
        int i12 = 0;
        while (true) {
            if (i12 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    break;
                }
                i12++;
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
        obj.f30456a = i10;
        obj.f30460g = document;
        obj.f30458c = document.f19799id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.f19799id;
            obj.f30459f = a(i10, i11, document2);
            org.telegram.messenger.b8.G(i10);
            File K = org.telegram.messenger.b8.K(document2, null, false, z10);
            if (K != null && K.exists()) {
                obj.f30459f = Uri.fromFile(K);
            } else {
                org.telegram.messenger.b8.G(i10);
                File K2 = org.telegram.messenger.b8.K(document2, null, true, z10);
                if (K2 != null && K2.exists()) {
                    obj.f30459f = Uri.fromFile(K2);
                }
            }
        }
        obj.f30465m = str;
        long j10 = document.size;
        obj.f30463k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f30461i = tL_documentAttributeVideo.f19800w;
            obj.f30462j = tL_documentAttributeVideo.h;
            obj.f30464l = j10 / d;
        }
        org.telegram.messenger.b8.G(i10);
        File K3 = org.telegram.messenger.b8.K(document, null, false, z10);
        if (K3 != null && K3.exists()) {
            obj.d = Uri.fromFile(K3);
            return obj;
        }
        org.telegram.messenger.b8.G(i10);
        File K4 = org.telegram.messenger.b8.K(document, null, true, z10);
        if (K4 != null && K4.exists()) {
            obj.d = Uri.fromFile(K4);
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
        Uri uri = this.f30459f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f30460g != null) {
            org.telegram.messenger.b8.G(this.f30456a);
            File K = org.telegram.messenger.b8.K(this.f30460g, null, false, z10);
            if (K != null && K.exists()) {
                this.d = Uri.fromFile(K);
            } else {
                org.telegram.messenger.b8.G(this.f30456a);
                File K2 = org.telegram.messenger.b8.K(this.f30460g, null, true, z10);
                if (K2 != null && K2.exists()) {
                    this.d = Uri.fromFile(K2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.b8.G(this.f30456a);
            File K3 = org.telegram.messenger.b8.K(this.h, null, false, z10);
            if (K3 != null && K3.exists()) {
                this.f30459f = Uri.fromFile(K3);
                return;
            }
            org.telegram.messenger.b8.G(this.f30456a);
            File K4 = org.telegram.messenger.b8.K(this.h, null, true, z10);
            if (K4 != null && K4.exists()) {
                this.f30459f = Uri.fromFile(K4);
            }
        }
    }
}
