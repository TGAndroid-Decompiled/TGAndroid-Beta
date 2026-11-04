package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l51 {
    public int f35603a;
    public boolean f35604b;
    public long f35605c;
    public Uri d;
    public long f35606e;
    public Uri f35607f;
    public TLRPC.Document f35608g;
    public TLRPC.Document h;
    public int f35609i;
    public int f35610j;
    public long f35611k;
    public double f35612l;
    public String f35613m;

    public static Uri a(int i3, int i10, TLRPC.Document document) {
        StringBuilder m10 = k2.p1.m(i3, "?account=", "&id=");
        m10.append(document.f27007id);
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

    public static l51 d(int i3, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
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
        obj.f35603a = i3;
        obj.f35608g = document;
        obj.f35605c = document.f27007id;
        obj.d = a(i3, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f35606e = document2.f27007id;
            obj.f35607f = a(i3, i10, document2);
            org.telegram.messenger.w7.G(i3);
            File K = org.telegram.messenger.w7.K(document2, null, false, z10);
            if (K != null && K.exists()) {
                obj.f35607f = Uri.fromFile(K);
            } else {
                org.telegram.messenger.w7.G(i3);
                File K2 = org.telegram.messenger.w7.K(document2, null, true, z10);
                if (K2 != null && K2.exists()) {
                    obj.f35607f = Uri.fromFile(K2);
                }
            }
        }
        obj.f35613m = str;
        long j10 = document.size;
        obj.f35611k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f35609i = tL_documentAttributeVideo.f27008w;
            obj.f35610j = tL_documentAttributeVideo.h;
            obj.f35612l = j10 / d;
        }
        org.telegram.messenger.w7.G(i3);
        File K3 = org.telegram.messenger.w7.K(document, null, false, z10);
        if (K3 != null && K3.exists()) {
            obj.d = Uri.fromFile(K3);
            return obj;
        }
        org.telegram.messenger.w7.G(i3);
        File K4 = org.telegram.messenger.w7.K(document, null, true, z10);
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
        Uri uri = this.f35607f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f35608g != null) {
            org.telegram.messenger.w7.G(this.f35603a);
            File K = org.telegram.messenger.w7.K(this.f35608g, null, false, z10);
            if (K != null && K.exists()) {
                this.d = Uri.fromFile(K);
            } else {
                org.telegram.messenger.w7.G(this.f35603a);
                File K2 = org.telegram.messenger.w7.K(this.f35608g, null, true, z10);
                if (K2 != null && K2.exists()) {
                    this.d = Uri.fromFile(K2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.w7.G(this.f35603a);
            File K3 = org.telegram.messenger.w7.K(this.h, null, false, z10);
            if (K3 != null && K3.exists()) {
                this.f35607f = Uri.fromFile(K3);
                return;
            }
            org.telegram.messenger.w7.G(this.f35603a);
            File K4 = org.telegram.messenger.w7.K(this.h, null, true, z10);
            if (K4 != null && K4.exists()) {
                this.f35607f = Uri.fromFile(K4);
            }
        }
    }
}
