package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r71 {
    public int f26616a;
    public boolean f26617b;
    public long f26618c;
    public Uri d;
    public long e;
    public Uri f26619f;
    public TLRPC.Document f26620g;
    public TLRPC.Document h;
    public int f26621i;
    public int f26622j;
    public long f26623k;
    public double f26624l;
    public String f26625m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder m10 = hc.b.m(i10, "?account=", "&id=");
        m10.append(document.f17201id);
        m10.append("&hash=");
        m10.append(document.access_hash);
        m10.append("&dc=");
        m10.append(document.dc_id);
        m10.append("&size=");
        m10.append(document.size);
        m10.append("&mime=");
        m10.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m10.append("&rid=");
        m10.append(i11);
        m10.append("&name=");
        m10.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        m10.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m10.append(Utilities.bytesToHex(bArr));
        String sb2 = m10.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb2);
    }

    public static r71 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z10) {
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
        obj.f26616a = i10;
        obj.f26620g = document;
        obj.f26618c = document.f17201id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.f17201id;
            obj.f26619f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f26619f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f26619f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f26625m = str;
        long j3 = document.size;
        obj.f26623k = j3;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f26621i = tL_documentAttributeVideo.f17202w;
            obj.f26622j = tL_documentAttributeVideo.h;
            obj.f26624l = j3 / d;
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
        Uri uri = this.f26619f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        if (!b() && this.f26620g != null) {
            File pathToAttach = FileLoader.getInstance(this.f26616a).getPathToAttach(this.f26620g, null, false, z10);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f26616a).getPathToAttach(this.f26620g, null, true, z10);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f26616a).getPathToAttach(this.h, null, false, z10);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f26619f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f26616a).getPathToAttach(this.h, null, true, z10);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f26619f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
