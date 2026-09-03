package org.telegram.ui.Components;

import android.net.Uri;
import java.io.File;
import java.net.URLEncoder;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g71 {
    public int f25074a;
    public boolean f25075b;
    public long f25076c;
    public Uri d;
    public long e;
    public Uri f25077f;
    public TLRPC.Document f25078g;
    public TLRPC.Document h;
    public int f25079i;
    public int f25080j;
    public long f25081k;
    public double f25082l;
    public String f25083m;

    public static Uri a(int i10, int i11, TLRPC.Document document) {
        StringBuilder m9 = kf.k0.m(i10, "?account=", "&id=");
        m9.append(document.f19165id);
        m9.append("&hash=");
        m9.append(document.access_hash);
        m9.append("&dc=");
        m9.append(document.dc_id);
        m9.append("&size=");
        m9.append(document.size);
        m9.append("&mime=");
        m9.append(URLEncoder.encode(document.mime_type, "UTF-8"));
        m9.append("&rid=");
        m9.append(i11);
        m9.append("&name=");
        m9.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
        m9.append("&reference=");
        byte[] bArr = document.file_reference;
        if (bArr == null) {
            bArr = new byte[0];
        }
        m9.append(Utilities.bytesToHex(bArr));
        String sb = m9.toString();
        return Uri.parse("tg://" + MessageObject.getFileName(document) + sb);
    }

    public static g71 d(int i10, TLRPC.Document document, TLRPC.Document document2, int i11, boolean z4) {
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
        obj.f25074a = i10;
        obj.f25078g = document;
        obj.f25076c = document.f19165id;
        obj.d = a(i10, i11, document);
        if (document2 != null) {
            obj.h = document2;
            obj.e = document2.f19165id;
            obj.f25077f = a(i10, i11, document2);
            File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(document2, null, false, z4);
            if (pathToAttach != null && pathToAttach.exists()) {
                obj.f25077f = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(i10).getPathToAttach(document2, null, true, z4);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    obj.f25077f = Uri.fromFile(pathToAttach2);
                }
            }
        }
        obj.f25083m = str;
        long j10 = document.size;
        obj.f25081k = j10;
        if (tL_documentAttributeVideo != null) {
            double d = tL_documentAttributeVideo.duration;
            obj.f25079i = tL_documentAttributeVideo.f19166w;
            obj.f25080j = tL_documentAttributeVideo.h;
            obj.f25082l = j10 / d;
        }
        File pathToAttach3 = FileLoader.getInstance(i10).getPathToAttach(document, null, false, z4);
        if (pathToAttach3 != null && pathToAttach3.exists()) {
            obj.d = Uri.fromFile(pathToAttach3);
            return obj;
        }
        File pathToAttach4 = FileLoader.getInstance(i10).getPathToAttach(document, null, true, z4);
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
        Uri uri = this.f25077f;
        if (uri != null && "file".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public final void e(boolean z4) {
        if (!b() && this.f25078g != null) {
            File pathToAttach = FileLoader.getInstance(this.f25074a).getPathToAttach(this.f25078g, null, false, z4);
            if (pathToAttach != null && pathToAttach.exists()) {
                this.d = Uri.fromFile(pathToAttach);
            } else {
                File pathToAttach2 = FileLoader.getInstance(this.f25074a).getPathToAttach(this.f25078g, null, true, z4);
                if (pathToAttach2 != null && pathToAttach2.exists()) {
                    this.d = Uri.fromFile(pathToAttach2);
                }
            }
        }
        if (!c() && this.h != null) {
            File pathToAttach3 = FileLoader.getInstance(this.f25074a).getPathToAttach(this.h, null, false, z4);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.f25077f = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.f25074a).getPathToAttach(this.h, null, true, z4);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                this.f25077f = Uri.fromFile(pathToAttach4);
            }
        }
    }
}
