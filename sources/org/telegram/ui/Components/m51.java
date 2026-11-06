package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m51 {
    public int f35924a;
    public boolean f35925b;
    public long f35926c;
    public Uri d;
    public long f35927e;
    public Uri f35928f;
    public TLRPC.Document f35929g;
    public TLRPC.Document h;
    public int f35930i;
    public int f35931j;
    public long f35932k;
    public double f35933l;
    public String f35934m;

    public static Uri a(int i7, int i10, TLRPC.Document document) {
        StringBuilder n10 = jg.g.n(i7, "?account=", "&id=");
        n10.append(document.f26958id);
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

    public static m51 d(int i7, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z9) {
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
        obj.f35924a = i7;
        obj.f35929g = document;
        obj.f35926c = document.f26958id;
        obj.d = a(i7, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f35927e = document2.f26958id;
            obj.f35928f = a(i7, i10, document2);
            org.telegram.messenger.w7.G(i7);
            File K = org.telegram.messenger.w7.K(document2, null, false, z9);
            if (K != null && K.exists()) {
                obj.f35928f = Uri.fromFile(K);
            } else {
                org.telegram.messenger.w7.G(i7);
                File K2 = org.telegram.messenger.w7.K(document2, null, true, z9);
                if (K2 != null && K2.exists()) {
                    obj.f35928f = Uri.fromFile(K2);
                }
            }
        }
        obj.f35934m = str;
        long j3 = document.size;
        obj.f35932k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f35930i = tL_documentAttributeVideo.f26959w;
            obj.f35931j = tL_documentAttributeVideo.h;
            obj.f35933l = j3 / d;
        }
        org.telegram.messenger.w7.G(i7);
        File K3 = org.telegram.messenger.w7.K(document, null, false, z9);
        if (K3 != null && K3.exists()) {
            obj.d = Uri.fromFile(K3);
            return obj;
        }
        org.telegram.messenger.w7.G(i7);
        File K4 = org.telegram.messenger.w7.K(document, null, true, z9);
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
        Uri uri = this.f35928f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z9) {
        if (!b() && this.f35929g != null) {
            org.telegram.messenger.w7.G(this.f35924a);
            File K = org.telegram.messenger.w7.K(this.f35929g, null, false, z9);
            if (K != null && K.exists()) {
                this.d = Uri.fromFile(K);
            } else {
                org.telegram.messenger.w7.G(this.f35924a);
                File K2 = org.telegram.messenger.w7.K(this.f35929g, null, true, z9);
                if (K2 != null && K2.exists()) {
                    this.d = Uri.fromFile(K2);
                }
            }
        }
        if (!c() && this.h != null) {
            org.telegram.messenger.w7.G(this.f35924a);
            File K3 = org.telegram.messenger.w7.K(this.h, null, false, z9);
            if (K3 != null && K3.exists()) {
                this.f35928f = Uri.fromFile(K3);
                return;
            }
            org.telegram.messenger.w7.G(this.f35924a);
            File K4 = org.telegram.messenger.w7.K(this.h, null, true, z9);
            if (K4 != null && K4.exists()) {
                this.f35928f = Uri.fromFile(K4);
            }
        }
    }
}
