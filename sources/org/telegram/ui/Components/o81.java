package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o81 {
    public int f29091a;
    public boolean f29092b;
    public long f29093c;
    public Uri d;
    public long f29094e;
    public Uri f29095f;
    public TLRPC.Document f29096g;
    public TLRPC.Document h;
    public int f29097i;
    public int f29098j;
    public long f29099k;
    public double f29100l;
    public String f29101m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder l4 = hg.c.l(i10, "?account=", "&id=");
        l4.append(document.f19809id);
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
        l4.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        l4.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        l4.append(Utilities.bytesToHex(bArr));
        String sb2 = l4.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static o81 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f29091a = i10;
        obj.f29096g = document;
        obj.f29093c = document.f19809id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f29094e = document2.f19809id;
            obj.f29095f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f29095f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f29095f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f29101m = str;
        long j3 = document.size;
        obj.f29099k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f29097i = tL_documentAttributeVideo.f19810w;
            obj.f29098j = tL_documentAttributeVideo.h;
            obj.f29100l = j3 / d;
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
        Uri uri = this.f29095f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f29096g != null) {
            File pathToAttach = FileLoader.getInstance(this.f29091a).getPathToAttach(this.f29096g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f29091a).getPathToAttach(this.f29096g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f29091a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f29095f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f29091a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f29095f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
