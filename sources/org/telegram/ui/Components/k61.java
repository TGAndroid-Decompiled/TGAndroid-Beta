package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class k61 {

    public int f30007a;

    public boolean f30008b;

    public long f30009c;
    public Uri d;

    public long f30010e;

    public Uri f30011f;

    public TLRPC.Document f30012g;
    public TLRPC.Document h;

    public int f30013i;

    public int f30014j;

    public long f30015k;

    public double f30016l;

    public String f30017m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder sbO = i0.a.o(i10, "?account=", "&id=");
        sbO.append(document.f22386id);
        sbO.append("&hash=");
        sbO.append(document.access_hash);
        sbO.append("&dc=");
        sbO.append(document.dc_id);
        sbO.append("&size=");
        sbO.append(document.size);
        sbO.append("&mime=");
        sbO.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        sbO.append("&rid=");
        sbO.append(i11);
        sbO.append("&name=");
        sbO.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        sbO.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sbO.append(Utilities.bytesToHex(bArr));
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sbO.toString());
    }

    public static k61 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
        String str;
        k61 k61Var = new k61();
        int i12 = 0;
        while (true) {
            if (i12 >= document.attributes.size()) {
                tL_documentAttributeVideo = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                break;
            }
            i12++;
        }
        String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
        k61Var.f30007a = i10;
        k61Var.f30012g = document;
        k61Var.f30009c = document.f22386id;
        k61Var.d = a(i10, i11, document);
        if (document2 != null) {
            k61Var.h = document2;
            k61Var.f30010e = document2.f22386id;
            k61Var.f30011f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    k61Var.f30011f = Uri.fromFile(pathToAttach2);
                }
            } else {
                k61Var.f30011f = Uri.fromFile(pathToAttach);
            }
        }
        k61Var.f30017m = lowerCase;
        long j10 = document.size;
        k61Var.f30015k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            k61Var.f30013i = tL_documentAttributeVideo.f22387w;
            k61Var.f30014j = tL_documentAttributeVideo.h;
            k61Var.f30016l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            k61Var.d = Uri.fromFile(pathToAttach3);
            return k61Var;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z10);
        if (pathToAttach4 != null && pathToAttach4.exists()) {
            k61Var.d = Uri.fromFile(pathToAttach4);
        }
        return k61Var;
    }

    public final boolean b() {
        Uri uri = this.d;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final boolean c() {
        Uri uri = this.f30011f;
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public final void e(boolean z10) {
        if (!b() && this.f30012g != null) {
            File pathToAttach = FileLoader.getInstance(this.f30007a).getPathToAttach(this.f30012g, null, false, z10);
            if (pathToAttach == null || !pathToAttach.exists()) {
                File pathToAttach2 = FileLoader.getInstance(this.f30007a).getPathToAttach(this.f30012g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            } else {
                this.d = Uri.fromFile(pathToAttach);
            }
        }
        if (c() || this.h == null) {
            return;
        }
        File pathToAttach3 = FileLoader.getInstance(this.f30007a).getPathToAttach(this.h, null, false, z10);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            this.f30011f = Uri.fromFile(pathToAttach3);
            return;
        }
        File pathToAttach4 = FileLoader.getInstance(this.f30007a).getPathToAttach(this.h, null, true, z10);
        if (pathToAttach4 == null || !pathToAttach4.exists()) {
            return;
        }
        this.f30011f = Uri.fromFile(pathToAttach4);
    }
}
