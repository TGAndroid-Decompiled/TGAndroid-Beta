package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class q81 {
    public int f31854a;
    public boolean f31855b;
    public long f31856c;
    public Uri d;
    public long e;
    public Uri f31857f;
    public TLRPC.Document f31858g;
    public TLRPC.Document h;
    public int f31859i;
    public int f31860j;
    public long f31861k;
    public double f31862l;
    public String f31863m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder k10 = ic.a.k(i10, "?account=", "&id=");
        k10.append(document.f22033id);
        k10.append("&hash=");
        k10.append(document.access_hash);
        k10.append("&dc=");
        k10.append(document.dc_id);
        k10.append("&size=");
        k10.append(document.size);
        k10.append("&mime=");
        k10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        k10.append("&rid=");
        k10.append(i11);
        k10.append("&name=");
        k10.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        k10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        k10.append(Utilities.bytesToHex(bArr));
        String sb2 = k10.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static q81 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f31854a = i10;
        obj.f31858g = document;
        obj.f31856c = document.f22033id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.f22033id;
            obj.f31857f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f31857f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f31857f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f31863m = str;
        long j10 = document.size;
        obj.f31861k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f31859i = tL_documentAttributeVideo.f22034w;
            obj.f31860j = tL_documentAttributeVideo.h;
            obj.f31862l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            obj.d = Uri.fromFile(pathToAttach3);
            return obj;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            obj.d = Uri.fromFile(pathToAttach4);
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
        Uri uri = this.f31857f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f31858g != null) {
            File pathToAttach = FileLoader.getInstance(this.f31854a).getPathToAttach(this.f31858g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f31854a).getPathToAttach(this.f31858g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f31854a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f31857f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f31854a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f31857f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
