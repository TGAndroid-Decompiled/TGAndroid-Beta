package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v61 {
    public int f33472a;
    public boolean f33473b;
    public long f33474c;
    public Uri d;
    public long f33475e;
    public Uri f33476f;
    public TLRPC.Document f33477g;
    public TLRPC.Document h;
    public int f33478i;
    public int f33479j;
    public long f33480k;
    public double f33481l;
    public String f33482m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder o10 = j7.l1.o(i10, "?account=", "&id=");
        o10.append(document.f22398id);
        o10.append("&hash=");
        o10.append(document.access_hash);
        o10.append("&dc=");
        o10.append(document.dc_id);
        o10.append("&size=");
        o10.append(document.size);
        o10.append("&mime=");
        o10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        o10.append("&rid=");
        o10.append(i11);
        o10.append("&name=");
        o10.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        o10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        o10.append(Utilities.bytesToHex(bArr));
        String sb2 = o10.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static v61 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f33472a = i10;
        obj.f33477g = document;
        obj.f33474c = document.f22398id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f33475e = document2.f22398id;
            obj.f33476f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f33476f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f33476f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f33482m = str;
        long j10 = document.size;
        obj.f33480k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f33478i = tL_documentAttributeVideo.f22399w;
            obj.f33479j = tL_documentAttributeVideo.h;
            obj.f33481l = j10 / d;
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
        Uri uri = this.f33476f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f33477g != null) {
            File pathToAttach = FileLoader.getInstance(this.f33472a).getPathToAttach(this.f33477g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f33472a).getPathToAttach(this.f33477g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f33472a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f33476f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f33472a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f33476f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
