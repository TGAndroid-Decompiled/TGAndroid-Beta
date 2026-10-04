package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b81 {
    public int f24852a;
    public boolean f24853b;
    public long f24854c;
    public Uri d;
    public long f24855e;
    public Uri f24856f;
    public TLRPC.Document f24857g;
    public TLRPC.Document h;
    public int f24858i;
    public int f24859j;
    public long f24860k;
    public double f24861l;
    public String f24862m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder j3 = hg.k0.j(i10, "?account=", "&id=");
        j3.append(document.f20044id);
        j3.append("&hash=");
        j3.append(document.access_hash);
        j3.append("&dc=");
        j3.append(document.dc_id);
        j3.append("&size=");
        j3.append(document.size);
        j3.append("&mime=");
        j3.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        j3.append("&rid=");
        j3.append(i11);
        j3.append("&name=");
        j3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        j3.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        j3.append(Utilities.bytesToHex(bArr));
        String sb2 = j3.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static b81 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f24852a = i10;
        obj.f24857g = document;
        obj.f24854c = document.f20044id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f24855e = document2.f20044id;
            obj.f24856f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f24856f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f24856f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f24862m = str;
        long j3 = document.size;
        obj.f24860k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f24858i = tL_documentAttributeVideo.f20045w;
            obj.f24859j = tL_documentAttributeVideo.h;
            obj.f24861l = j3 / d;
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
        Uri uri = this.f24856f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f24857g != null) {
            File pathToAttach = FileLoader.getInstance(this.f24852a).getPathToAttach(this.f24857g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f24852a).getPathToAttach(this.f24857g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f24852a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f24856f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f24852a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f24856f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
