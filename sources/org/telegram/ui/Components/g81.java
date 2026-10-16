package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g81 {
    public int f24910a;
    public boolean f24911b;
    public long f24912c;
    public Uri d;
    public long e;
    public Uri f24913f;
    public TLRPC.Document f24914g;
    public TLRPC.Document h;
    public int f24915i;
    public int f24916j;
    public long f24917k;
    public double f24918l;
    public String f24919m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder l4 = i2.d.l(i10, "?account=", "&id=");
        l4.append(document.f18922id);
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

    public static g81 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f24910a = i10;
        obj.f24914g = document;
        obj.f24912c = document.f18922id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.f18922id;
            obj.f24913f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f24913f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f24913f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f24919m = str;
        long j10 = document.size;
        obj.f24917k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f24915i = tL_documentAttributeVideo.f18923w;
            obj.f24916j = tL_documentAttributeVideo.h;
            obj.f24918l = j10 / d;
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
        Uri uri = this.f24913f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f24914g != null) {
            File pathToAttach = FileLoader.getInstance(this.f24910a).getPathToAttach(this.f24914g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f24910a).getPathToAttach(this.f24914g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f24910a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f24913f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f24910a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f24913f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
