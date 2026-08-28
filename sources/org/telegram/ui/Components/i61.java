package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i61 {
    public int f29357a;
    public boolean f29358b;
    public long f29359c;
    public Uri d;
    public long f29360e;
    public Uri f29361f;
    public TLRPC.Document f29362g;
    public TLRPC.Document h;
    public int f29363i;
    public int f29364j;
    public long f29365k;
    public double f29366l;
    public String f29367m;

    public static Uri a(int i9, int i10, TLRPC.Document document) {
        StringBuilder p6 = j3.r0.p(i9, "?account=", "&id=");
        p6.append(document.f22386id);
        p6.append("&hash=");
        p6.append(document.access_hash);
        p6.append("&dc=");
        p6.append(document.dc_id);
        p6.append("&size=");
        p6.append(document.size);
        p6.append("&mime=");
        p6.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        p6.append("&rid=");
        p6.append(i10);
        p6.append("&name=");
        p6.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        p6.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        p6.append(Utilities.bytesToHex(bArr));
        String sb2 = p6.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static i61 d(int i9, TLRPC.Document document, TLRPC.Document document2, int i10, boolean z10) {
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
        obj.f29357a = i9;
        obj.f29362g = document;
        obj.f29359c = document.f22386id;
        obj.d = a(i9, i10, document);
        if (document2 != null) {
            obj.h = document2;
            obj.f29360e = document2.f22386id;
            obj.f29361f = a(i9, i10, document2);
            File pathToAttach = FileLoader.getInstance(i9).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f29361f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i9).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f29361f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f29367m = str;
        long j10 = document.size;
        obj.f29365k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f29363i = tL_documentAttributeVideo.f22387w;
            obj.f29364j = tL_documentAttributeVideo.h;
            obj.f29366l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i9).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            obj.d = Uri.fromFile(pathToAttach3);
            return obj;
        }
        File pathToAttach4 = FileLoader.getInstance(i9).getPathToAttach(document, null, true, z10);
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
        Uri uri = this.f29361f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f29362g != null) {
            File pathToAttach = FileLoader.getInstance(this.f29357a).getPathToAttach(this.f29362g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f29357a).getPathToAttach(this.f29362g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f29357a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f29361f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f29357a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f29361f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
