package org.telegram.ui.Components;

import ab.a;
import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.l;
import h3.f1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k5.i;
import l3.b;
import m4.g;
import m5.o;
import n4.e;
import o4.j;
import o4.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.i6;
import org.telegram.ui.j70;
import p4.c;
import p4.q;

public class m61 implements h3.a2, e5.s, i3.b, NotificationCenter.NotificationCenterDelegate {

    public static int f30587f0;

    public static final HashSet f30588g0 = new HashSet();

    public static HashMap f30589h0;
    public boolean A;
    public Uri B;
    public boolean C;
    public boolean D;
    public boolean E;
    public j61 F;
    public f61 G;
    public int H;
    public boolean I;
    public ArrayList J;
    public i61 K;
    public ArrayList L;
    public Uri M;
    public Uri N;
    public String O;
    public String P;
    public boolean Q;
    public boolean R;
    public final boolean S;
    public DashMediaSource$Factory T;
    public HlsMediaSource$Factory U;
    public j4.s0 V;
    public final Handler W;
    public final boolean X;
    public boolean Y;
    public int Z;

    public final int f30590a;

    public boolean f30591a0;

    public DispatchQueue f30592b;

    public long f30593b0;

    public boolean f30594c;

    public long f30595c0;
    public h3.k0 d;

    public org.telegram.ui.hq0 f30596d0;

    public h3.k2 f30597e;

    public final ArrayList f30598e0;

    public final b5.q f30599f;
    public final ExtendedDefaultDataSourceFactory h;

    public TextureView f30600n;

    public SurfaceView f30601r;

    public Surface f30602s;
    public boolean v;

    public boolean f30603w;

    public boolean f30604x;

    public boolean f30605y;

    public m61() {
        this(true, false);
    }

    public static void J(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void K(i61 i61Var, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (i61Var == null) {
            editorEdit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i61Var.f29262b);
            sb2.append("x");
            sb2.append(i61Var.f29263c);
            sb2.append(i61Var.f29261a ? "s" : "");
            editorEdit.putString(str, sb2.toString());
        }
        editorEdit.apply();
    }

    public static boolean Y(String str) {
        String strConcat;
        if (str != null) {
            switch (str) {
                case "av1":
                case "av01":
                    strConcat = "video/av01";
                    break;
                case "avc":
                case "h264":
                    strConcat = "video/avc";
                    break;
                case "vp8":
                    strConcat = "video/x-vnd.on2.vp8";
                    break;
                case "vp9":
                    strConcat = "video/x-vnd.on2.vp9";
                    break;
                case "h265":
                case "hevc":
                    strConcat = "video/hevc";
                    break;
                default:
                    try {
                        strConcat = "video/".concat(str);
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return false;
                    }
                    break;
            }
        } else {
            strConcat = null;
        }
        if (strConcat != null) {
            if (f30589h0 == null) {
                f30589h0 = new HashMap();
            }
            Boolean bool = (Boolean) f30589h0.get(strConcat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(strConcat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && y3.w.h(codecInfoAt, strConcat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(strConcat)) {
                                f30589h0.put(strConcat, Boolean.TRUE);
                                return true;
                            }
                        }
                    }
                }
                f30589h0.put(strConcat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static k61 l(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((i61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                k61 k61Var = (k61) obj2;
                if (k61Var.b()) {
                    return k61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList t(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        i61 i61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!MessagesController.getInstance(i10).videoIgnoreAltDocuments && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i12);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i12);
                    i12--;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    k61 k61VarD = k61.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f22386id), i11, z10);
                    if (k61VarD.f30013i > 0 && k61VarD.f30014j > 0) {
                        if (document3 == document) {
                            k61VarD.f30008b = true;
                        }
                        arrayList3.add(k61VarD);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            k61 k61Var = (k61) arrayList3.get(i14);
            String str2 = k61Var.f30017m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(k61Var.f30017m) && !"hevc".equals(k61Var.f30017m) && !"h265".equals(k61Var.f30017m) && !"vp9".equals(k61Var.f30017m)) || Y(k61Var.f30017m))) {
                arrayList4.add(k61Var);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.addAll(arrayList3);
        } else {
            arrayList5.addAll(arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList5.get(i15);
            i15++;
            k61 k61Var2 = (k61) obj;
            if (k61Var2.f30008b) {
                arrayList6.add(new i61(k61Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size2) {
                        i61Var = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i16);
                    i16++;
                    i61Var = (i61) obj2;
                    if (!i61Var.f29261a && i61Var.f29262b == k61Var2.f30013i && i61Var.f29263c == k61Var2.f30014j) {
                        break;
                    }
                }
                if (i61Var == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new i61(k61Var2));
                } else {
                    i61Var.d.add(k61Var2);
                }
            }
        }
        return arrayList6;
    }

    public static k61 w(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((i61) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                k61 k61Var = (k61) obj2;
                if (k61Var.f30008b && k61Var.b()) {
                    return k61Var;
                }
            }
        }
        int size3 = arrayList.size();
        k61 k61Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((i61) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                k61 k61Var3 = (k61) obj4;
                if (!k61Var3.f30008b && Y(k61Var3.f30017m) && (k61Var2 == null || (i10 = k61Var3.f30013i * k61Var3.f30014j) > (i11 = k61Var2.f30013i * k61Var2.f30014j) || (i10 == i11 && k61Var3.f30016l < k61Var2.f30016l))) {
                    k61Var2 = k61Var3;
                }
            }
        }
        if (k61Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((i61) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    k61 k61Var4 = (k61) obj6;
                    if (k61Var2 == null || k61Var2.f30013i * k61Var2.f30014j > k61Var4.f30013i * k61Var4.f30014j || k61Var4.f30016l < k61Var2.f30016l) {
                        k61Var2 = k61Var4;
                    }
                }
            }
        }
        return k61Var2;
    }

    public static k61 x(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((i61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                k61 k61Var = (k61) obj2;
                if (k61Var.b()) {
                    return k61Var;
                }
            }
        }
        int size3 = arrayList.size();
        k61 k61Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((i61) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                k61 k61Var3 = (k61) obj4;
                if (!k61Var3.f30008b && (k61Var2 == null || k61Var2.f30013i * k61Var2.f30014j > k61Var3.f30013i * k61Var3.f30014j || k61Var3.f30016l < k61Var2.f30016l)) {
                    if (k61Var3.f30013i <= 900 && k61Var3.f30014j <= 900) {
                        k61Var2 = k61Var3;
                    }
                }
            }
        }
        if (k61Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((i61) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    k61 k61Var4 = (k61) obj6;
                    if (k61Var2 == null || k61Var2.f30013i * k61Var2.f30014j > k61Var4.f30013i * k61Var4.f30014j || k61Var4.f30016l < k61Var2.f30016l) {
                        k61Var2 = k61Var4;
                    }
                }
            }
        }
        return k61Var2;
    }

    public final Uri A(ArrayList arrayList) {
        String strConcat;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.L = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((i61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                k61 k61Var = (k61) obj2;
                long j10 = k61Var.f30009c;
                Uri uri = k61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(k61Var.f30010e, k61Var.f30011f);
                if (k61Var.f30011f != null) {
                    this.L.add(k61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(k61Var.f30016l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(k61Var.f30013i);
                    sb3.append("x");
                    sb3.append(k61Var.f30014j);
                    String str = k61Var.f30017m;
                    if (str != null) {
                        switch (str) {
                            case "av1":
                            case "av01":
                                strConcat = "video/av01";
                                break;
                            case "avc":
                            case "h264":
                                strConcat = "video/avc";
                                break;
                            case "vp8":
                                strConcat = "video/x-vnd.on2.vp8";
                                break;
                            case "vp9":
                                strConcat = "video/x-vnd.on2.vp9";
                                break;
                            case "h265":
                            case "hevc":
                                strConcat = "video/hevc";
                                break;
                            default:
                                strConcat = "video/".concat(str);
                                break;
                        }
                    } else {
                        strConcat = null;
                    }
                    if (strConcat != null) {
                        sb3.append(",MIME=\"");
                        sb3.append(strConcat);
                        sb3.append("\"");
                    }
                    if (k61Var.b() && k61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(k61Var.f30009c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(k61Var.f30007a);
                    sb3.append("\"\n");
                    if (k61Var.c()) {
                        sb3.append(k61Var.f30011f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(k61Var.f30010e);
                        sb3.append("\n\n");
                    }
                    arrayList2.add(sb3.toString());
                    z10 = true;
                }
            }
        }
        if (!z10) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb2.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb2.toString().getBytes(), 2));
    }

    public final j4.a B(Uri uri, String str, long j10) {
        h3.x0 x0Var = new h3.x0();
        p8.x xVar = p8.z.f45604b;
        p8.l0 l0Var = p8.l0.f45555e;
        List list = Collections.EMPTY_LIST;
        p8.l0 l0Var2 = p8.l0.f45555e;
        h3.d1 d1Var = h3.d1.f7806c;
        h3.c1 c1Var = uri != null ? new h3.c1(uri, null, list, l0Var2) : null;
        h3.f1 f1Var = new h3.f1("", new h3.z0(x0Var), c1Var, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, d1Var);
        if (j10 != 0) {
            d3.e eVar = new d3.e(this, j10, 7);
            h3.x xVar2 = new h3.x(new m3.i(), 18);
            ab.a aVar = new ab.a(4);
            c1Var.getClass();
            h3.c1 c1Var2 = f1Var.f7830b;
            c1Var2.getClass();
            c1Var2.getClass();
            return new j4.t0(f1Var, eVar, xVar2, l3.j.f15396m, aVar, 1048576);
        }
        str.getClass();
        boolean zEquals = str.equals("hls");
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        if (zEquals) {
            if (this.U == null) {
                this.U = new j4.b0(extendedDefaultDataSourceFactory) {

                    public final o f2944a;

                    public final b f2948f = new b();

                    public final za.b f2946c = new za.b(20);
                    public final j70 d = c.A;

                    public final o4.c f2945b = j.f19222a;

                    public final a f2949g = new a(4);

                    public final za.b f2947e = new za.b(9);

                    public final int f2950i = 1;

                    public final long f2951j = -9223372036854775807L;
                    public final boolean h = true;

                    {
                        this.f2944a = new o(extendedDefaultDataSourceFactory, 3);
                    }

                    @Override
                    public final m a(f1 f1Var2) {
                        f1Var2.f7830b.getClass();
                        List list2 = f1Var2.f7830b.f7796b;
                        boolean zIsEmpty = list2.isEmpty();
                        q i6Var = this.f2946c;
                        if (!zIsEmpty) {
                            i6Var = new i6(i6Var, list2, false, 14);
                        }
                        l3.j jVarC = this.f2948f.c(f1Var2);
                        this.d.getClass();
                        o oVar = this.f2944a;
                        a aVar2 = this.f2949g;
                        return new m(f1Var2, oVar, this.f2945b, this.f2947e, jVarC, aVar2, new c(oVar, aVar2, i6Var), this.f2951j, this.h, this.f2950i);
                    }
                };
            }
            return a(f1Var);
        }
        if (str.equals("dash")) {
            if (this.T == null) {
                this.T = new j4.b0(extendedDefaultDataSourceFactory) {

                    public final i f2939a;

                    public final l f2940b;

                    public final b f2941c = new b();

                    public final a f2942e = new a(4);

                    public final long f2943f = 30000;
                    public final za.b d = new za.b(9);

                    {
                        this.f2939a = new i(extendedDefaultDataSourceFactory, 28);
                        this.f2940b = extendedDefaultDataSourceFactory;
                    }

                    @Override
                    public final j4.a a(f1 f1Var2) {
                        f1Var2.f7830b.getClass();
                        e eVar2 = new e();
                        List list2 = f1Var2.f7830b.f7796b;
                        return new g(f1Var2, this.f2940b, !list2.isEmpty() ? new g5.b(7, eVar2, list2) : eVar2, this.f2939a, this.d, this.f2941c.c(f1Var2), this.f2942e, this.f2943f);
                    }
                };
            }
            return a(f1Var);
        }
        if (this.V == null) {
            this.V = new j4.s0(extendedDefaultDataSourceFactory, new m3.i());
        }
        return this.V.a(f1Var);
    }

    public void C() {
        this.E = false;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.o(false);
        }
        h3.k2 k2Var = this.f30597e;
        if (k2Var != null) {
            k2Var.o(false);
        }
        if (this.G != null) {
            this.W.removeCallbacksAndMessages(null);
            this.G.onVisualizerUpdate(false, true, null);
        }
    }

    public void D() {
        this.E = true;
        if (!this.f30604x || (this.D && this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(true);
            }
            h3.k2 k2Var = this.f30597e;
            if (k2Var != null) {
                k2Var.o(true);
                return;
            }
            return;
        }
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(false);
        }
        h3.k2 k2Var2 = this.f30597e;
        if (k2Var2 != null) {
            k2Var2.o(false);
        }
    }

    public final void E(Uri uri, String str) {
        F(uri, str, 0L);
    }

    public final void F(Uri uri, String str, long j10) {
        this.J = null;
        this.K = null;
        this.M = uri;
        this.O = str;
        this.N = null;
        this.P = null;
        boolean z10 = false;
        this.Q = false;
        this.Y = false;
        this.f30591a0 = false;
        this.C = false;
        this.f30604x = false;
        this.B = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        j();
        this.d.e0(B(uri, str, j10), true);
        this.d.a();
    }

    public final void G(ArrayList arrayList, i61 i61Var) {
        ArrayList arrayList2;
        this.J = arrayList;
        this.K = i61Var;
        this.M = null;
        this.O = "hls";
        this.N = null;
        this.P = null;
        this.Q = false;
        this.Y = false;
        this.C = false;
        this.f30604x = false;
        this.B = null;
        this.v = true;
        j();
        this.f30591a0 = false;
        this.Z = (i61Var == null || (arrayList2 = this.J) == null) ? -1 : arrayList2.indexOf(i61Var);
        S(true, i61Var);
        if (this.Y) {
            this.Z = -1;
        }
    }

    public final void H(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        j4.s sVar = null;
        this.J = null;
        this.K = null;
        this.M = uri;
        this.N = uri2;
        this.O = str;
        this.P = str2;
        this.Q = true;
        this.f30591a0 = false;
        this.f30604x = true;
        this.D = false;
        this.C = false;
        j();
        j4.s sVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            j4.s sVar3 = new j4.s(B(uri3, str3, 0L));
            if (i10 == 0) {
                sVar = sVar3;
            } else {
                sVar2 = sVar3;
            }
        }
        this.d.e0(sVar, true);
        this.d.a();
        h3.k2 k2Var = this.f30597e;
        k2Var.Q();
        k2Var.f8006b.e0(sVar2, true);
        this.f30597e.a();
        f30588g0.add(Integer.valueOf(this.f30590a));
    }

    public final void I() {
        f30588g0.remove(Integer.valueOf(this.f30590a));
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.N();
            this.d = null;
        }
        h3.k2 k2Var = this.f30597e;
        if (k2Var != null) {
            k2Var.N();
            this.f30597e = null;
        }
        if (this.S) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void L(long j10) {
        M(j10, false);
    }

    public final void M(long j10, boolean z10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.f0(z10 ? h3.j2.d : h3.j2.f7952c);
            this.d.P(5, j10);
        }
    }

    public final void N(long j10, boolean z10, Runnable runnable) {
        if (this.d != null) {
            if (runnable != null) {
                this.f30598e0.add(runnable);
            }
            this.d.f0(z10 ? h3.j2.d : h3.j2.f7952c);
            this.d.P(5, j10);
        }
    }

    public final void O(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.e(z10 ? 2 : 0);
            }
        }
    }

    public final void P(boolean z10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(z10 ? 0.0f : 1.0f);
        }
        h3.k2 k2Var = this.f30597e;
        if (k2Var != null) {
            k2Var.R(z10 ? 0.0f : 1.0f);
        }
    }

    public void Q(boolean z10) {
        this.E = z10;
        if (z10 && this.f30604x && (!this.D || !this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            h3.k2 k2Var = this.f30597e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        this.f30603w = z10;
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(z10);
        }
        h3.k2 k2Var2 = this.f30597e;
        if (k2Var2 != null) {
            k2Var2.o(z10);
        }
    }

    public void R(float f10) {
        try {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.setPlaybackParameters(new h3.x1(f10, f10 > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    public final void S(boolean z10, i61 i61Var) {
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        int i12;
        b5.w wVar;
        int i13;
        i61 i61Var2;
        i61 i61VarS;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        boolean zK = k0Var.K();
        long jD = this.d.D();
        if (!z10) {
            this.f30595c0 = jD;
            this.f30593b0 = this.d.getDuration();
        }
        this.K = i61Var;
        b5.q qVar = this.f30599f;
        int i14 = 0;
        if (i61Var == null) {
            Uri uriA = A(this.J);
            int i15 = 0;
            while (true) {
                if (i15 >= u()) {
                    i61Var2 = null;
                    break;
                }
                i61 i61VarV = v(i15);
                if (i61VarV.f29261a) {
                    i61Var2 = i61VarV;
                    break;
                }
                i15++;
            }
            if (i61Var2 != null) {
                ArrayList arrayList = i61Var2.d;
                if (arrayList.size() == 1 && ((k61) arrayList.get(0)).b()) {
                    this.f30591a0 = false;
                    this.Y = true;
                    this.K = i61Var2;
                    this.d.e0(B(i61Var2.a().d, "other", 0L), false);
                } else if (uriA == null) {
                    this.Y = false;
                    b5.i iVarE = qVar.e();
                    iVarE.getClass();
                    b5.h hVar = new b5.h(iVarE);
                    hVar.c();
                    qVar.j(new b5.i(hVar));
                    if (!this.f30591a0) {
                        this.f30591a0 = true;
                        this.d.e0(B(uriA, "hls", 0L), false);
                    }
                } else {
                    i61VarS = s(Boolean.TRUE);
                    if (i61VarS == null) {
                        i61VarS = s(Boolean.FALSE);
                    }
                    if (i61VarS != null || i61VarS.d.isEmpty()) {
                        return;
                    }
                    this.f30591a0 = false;
                    this.K = i61VarS;
                    this.Y = i61VarS.f29261a;
                    this.d.e0(B(i61VarS.a().d, "other", 0L), false);
                }
                i14 = 1;
            } else {
                if (uriA == null) {
                    i61VarS = s(Boolean.TRUE);
                    if (i61VarS == null) {
                        i61VarS = s(Boolean.FALSE);
                    }
                    if (i61VarS != null) {
                        return;
                    } else {
                        return;
                    }
                }
                this.Y = false;
                b5.i iVarE2 = qVar.e();
                iVarE2.getClass();
                b5.h hVar2 = new b5.h(iVarE2);
                hVar2.c();
                qVar.j(new b5.i(hVar2));
                if (!this.f30591a0) {
                    this.f30591a0 = true;
                    this.d.e0(B(uriA, "hls", 0L), false);
                }
                i14 = 1;
            }
            z11 = zK;
        } else {
            ArrayList arrayList2 = i61Var.d;
            this.Y = false;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri uriA2 = arrayList2.size() > 1 ? A(this.J) : null;
            if (uriA2 == null || arrayList2.size() == 1 || qVar.f1990c == null) {
                z11 = zK;
                this.f30591a0 = false;
                this.d.e0(B(i61Var.a().d, "other", 0L), false);
                i14 = 1;
            } else {
                if (this.f30591a0) {
                    i10 = 0;
                } else {
                    this.f30591a0 = true;
                    this.d.e0(B(uriA2, "hls", 0L), false);
                    i10 = 1;
                }
                b5.i iVarE3 = qVar.e();
                iVarE3.getClass();
                b5.h hVar3 = new b5.h(iVarE3);
                hVar3.c();
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    int i17 = i16 + 1;
                    k61 k61Var = (k61) arrayList2.get(i16);
                    try {
                        int iIndexOf = this.L.indexOf(k61Var);
                        b5.u uVar = qVar.f1990c;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= uVar.f1983a) {
                                z12 = zK;
                                i11 = i10;
                                i12 = size;
                                wVar = null;
                                break;
                            }
                            j4.j1 j1Var = uVar.f1985c[i18];
                            z12 = zK;
                            while (i14 < j1Var.f12593a) {
                                try {
                                    j4.i1 i1VarA = j1Var.a(i14);
                                    i11 = i10;
                                    i12 = size;
                                    int i19 = 0;
                                    while (i19 < i1VarA.f12583a) {
                                        try {
                                            h3.t0 t0Var = i1VarA.d[i19];
                                            int i20 = i18;
                                            try {
                                                i13 = Integer.parseInt(t0Var.f8184a);
                                            } catch (Exception unused) {
                                                i13 = -1;
                                            }
                                            if (i13 >= 0 && iIndexOf == i13) {
                                                wVar = new b5.w(i1VarA, i19);
                                                break;
                                            }
                                            int i21 = iIndexOf;
                                            if (t0Var.G == k61Var.f30013i && t0Var.H == k61Var.f30014j) {
                                                wVar = new b5.w(i1VarA, i19);
                                                break;
                                            } else {
                                                i19++;
                                                i18 = i20;
                                                iIndexOf = i21;
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            FileLog.e(e);
                                            wVar = null;
                                            break;
                                        }
                                    }
                                    i14++;
                                    i10 = i11;
                                    size = i12;
                                } catch (Exception e10) {
                                    e = e10;
                                    i11 = i10;
                                    i12 = size;
                                    FileLog.e(e);
                                    wVar = null;
                                    if (wVar == null) {
                                        hVar3.f2015y.put(wVar.f1992a, wVar);
                                    }
                                    i10 = i11;
                                    i16 = i17;
                                    zK = z12;
                                    size = i12;
                                    i14 = 0;
                                }
                            }
                            i18++;
                            zK = z12;
                            i14 = 0;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z12 = zK;
                    }
                    if (wVar == null) {
                        hVar3.f2015y.put(wVar.f1992a, wVar);
                    }
                    i10 = i11;
                    i16 = i17;
                    zK = z12;
                    size = i12;
                    i14 = 0;
                }
                z11 = zK;
                qVar.j(new b5.i(hVar3));
                i14 = i10;
            }
        }
        if (i14 != 0) {
            this.d.a();
            if (!z10) {
                this.d.P(5, jD);
                if (z11) {
                    this.d.o(true);
                }
            }
            org.telegram.ui.hq0 hq0Var = this.f30596d0;
            if (hq0Var != null) {
                AndroidUtilities.runOnUIThread(hq0Var);
            }
            f30588g0.add(Integer.valueOf(this.f30590a));
        }
    }

    public final void T(int i10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.d0(new j3.e(0, 0, i10 == 0 ? 2 : 1, 1, 0), false);
        }
        h3.k2 k2Var = this.f30597e;
        if (k2Var != null) {
            j3.e eVar = new j3.e(0, 0, i10 == 0 ? 2 : 1, 1, 0);
            k2Var.Q();
            k2Var.f8006b.d0(eVar, true);
        }
    }

    public final void U(Surface surface) {
        if (this.f30602s == surface) {
            return;
        }
        this.f30602s = surface;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.h0(surface);
    }

    public final void V(SurfaceView surfaceView) {
        if (this.f30601r == surfaceView) {
            return;
        }
        this.f30601r = surfaceView;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.i0(surfaceView);
    }

    public final void W(TextureView textureView) {
        if (this.f30600n == textureView) {
            return;
        }
        this.f30600n = textureView;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return;
        }
        k0Var.j0(textureView);
    }

    public final void X(float f10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(f10);
        }
        h3.k2 k2Var = this.f30597e;
        if (k2Var != null) {
            k2Var.R(f10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.playerDidStartPlaying || ((m61) objArr[0]) == this || !z() || this.f30605y) {
            return;
        }
        C();
    }

    @Override
    public final void f(i3.a aVar) {
        j61 j61Var = this.F;
        if (j61Var != null) {
            j61Var.onSeekFinished(aVar);
        }
        ArrayList arrayList = this.f30598e0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void j() {
        h3.j jVar = this.f30594c ? new h3.j(new com.google.android.exoplayer2.upstream.r(), 1000, 1000) : new h3.j(new com.google.android.exoplayer2.upstream.r(), 100, 5000);
        if (this.d == null) {
            h3.l g61Var = this.G != null ? new g61(ApplicationLoader.applicationContext, this) : new h3.l(ApplicationLoader.applicationContext);
            g61Var.f8010c = 2;
            h3.r rVar = new h3.r(ApplicationLoader.applicationContext);
            d5.a.i(!rVar.f8105s);
            rVar.f8091c = new h3.o(g61Var, 2);
            b5.q qVar = this.f30599f;
            d5.a.i(!rVar.f8105s);
            qVar.getClass();
            rVar.f8092e = new h3.o(qVar, 1);
            d5.a.i(!rVar.f8105s);
            rVar.f8093f = new h3.o(jVar, 0);
            d5.a.i(!rVar.f8105s);
            rVar.f8105s = true;
            h3.k0 k0Var = new h3.k0(rVar, null);
            this.d = k0Var;
            i3.f fVar = k0Var.f7987r;
            fVar.getClass();
            fVar.f10534f.a(this);
            this.d.f7980l.a(this);
            this.d.m0.add(this);
            TextureView textureView = this.f30600n;
            if (textureView != null) {
                this.d.j0(textureView);
            } else {
                Surface surface = this.f30602s;
                if (surface != null) {
                    this.d.h0(surface);
                } else {
                    SurfaceView surfaceView = this.f30601r;
                    if (surfaceView != null) {
                        this.d.i0(surfaceView);
                    }
                }
            }
            this.d.o(this.f30603w);
            this.d.e(this.R ? 2 : 0);
        }
        if (this.f30604x && this.f30597e == null) {
            h3.r rVar2 = new h3.r(ApplicationLoader.applicationContext);
            b5.q qVar2 = this.f30599f;
            d5.a.i(!rVar2.f8105s);
            qVar2.getClass();
            rVar2.f8092e = new h3.o(qVar2, 1);
            d5.a.i(!rVar2.f8105s);
            rVar2.f8093f = new h3.o(jVar, 0);
            d5.a.i(!rVar2.f8105s);
            rVar2.f8105s = true;
            h3.k2 k2Var = new h3.k2(rVar2);
            this.f30597e = k2Var;
            k2Var.k(new e61(this));
            this.f30597e.o(this.f30603w);
        }
    }

    public final long k() {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return this.v ? k0Var.t() : k0Var.getDuration();
        }
        return 0L;
    }

    public final xe.g m(String str, String str2, String str3) {
        if (this.J == null) {
            if (this.M == null) {
                return null;
            }
            String strE = s3.c.e("/mtproto_", str);
            String queryParameter = this.M.getQueryParameter("mime");
            f2.e1 e1Var = new f2.e1(this.M, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, strE);
            e1Var.f5652g = str2;
            e1Var.h = str3;
            return new xe.g(new xe.f(e1Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((i61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                k61 k61Var = (k61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(k61Var.f30009c);
                String string = sb2.toString();
                TLRPC.Document document = k61Var.f30012g;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                f2.e1 e1Var2 = new f2.e1(k61Var.d, str4, string);
                e1Var2.f5652g = str2;
                e1Var2.h = str3;
                int i12 = k61Var.f30013i;
                int i13 = k61Var.f30014j;
                e1Var2.f5647a = i12;
                e1Var2.f5648b = i13;
                arrayList.add(new xe.f(e1Var2));
                arrayList2 = arrayList4;
            }
        }
        return new xe.g(arrayList);
    }

    public final TLRPC.Document n() {
        ArrayList arrayList;
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return null;
        }
        k0Var.q0();
        h3.t0 t0Var = k0Var.P;
        if (t0Var == null || t0Var.f8192w == 0 || (arrayList = this.J) == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((i61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                k61 k61Var = (k61) obj2;
                if (k61Var.f30009c == t0Var.f8192w) {
                    return k61Var.f30012g;
                }
            }
        }
        return null;
    }

    public final long o() {
        long j10 = this.f30595c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.D();
        }
        return 0L;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerError(h3.v1 v1Var) {
        AndroidUtilities.runOnUIThread(new lg0(28, this, v1Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            boolean zH = k0Var.h();
            int iB = this.d.b();
            if (this.I != zH || this.H != iB) {
                this.F.onStateChanged(zH, iB);
                this.I = zH;
                this.H = iB;
            }
        }
        if (z10 && i10 == 3 && !y() && this.S) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.C && i10 == 3) {
            this.C = true;
            if (this.D && this.E) {
                D();
            }
        }
        if (i10 != 3) {
            this.W.removeCallbacksAndMessages(null);
            f61 f61Var = this.G;
            if (f61Var != null) {
                f61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(i3.a aVar) {
        this.f30595c0 = -9223372036854775807L;
        this.f30593b0 = -9223372036854775807L;
        j61 j61Var = this.F;
        if (j61Var != null) {
            j61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(i3.a aVar) {
        j61 j61Var = this.F;
        if (j61Var != null) {
            j61Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTracksChanged(h3.u2 u2Var) {
        org.telegram.ui.hq0 hq0Var = this.f30596d0;
        if (hq0Var != null) {
            AndroidUtilities.runOnUIThread(hq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(e5.x xVar) {
        this.F.onVideoSizeChanged(xVar.f5308a, xVar.f5309b, xVar.f5310c, xVar.d);
    }

    public final int p() {
        if (this.Z == -1) {
            try {
                if (this.Y) {
                    for (int i10 = 0; i10 < u(); i10++) {
                        if (v(i10).f29261a) {
                            return i10;
                        }
                    }
                }
                h3.k0 k0Var = this.d;
                if (k0Var != null) {
                    k0Var.q0();
                    h3.t0 t0Var = k0Var.P;
                    if (t0Var != null) {
                        for (int i11 = 0; i11 < u(); i11++) {
                            i61 i61VarV = v(i11);
                            if (!i61VarV.f29261a && t0Var.G == i61VarV.f29262b && t0Var.H == i61VarV.f29263c && t0Var.f8189n == ((int) Math.floor(((k61) i61VarV.d.get(0)).f30016l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e9) {
                FileLog.e(e9);
                return -1;
            }
        }
        return this.Z;
    }

    public final long q() {
        long j10 = this.f30593b0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final lh.y7 r(lh.y7 y7Var) {
        if (y7Var == null) {
            y7Var = new lh.y7();
        }
        try {
            h3.k0 k0Var = this.d;
            k0Var.q0();
            MediaFormat mediaFormat = ((y3.q) k0Var.f7971g[0]).K;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    y7Var.f17121b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    y7Var.f17120a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return y7Var;
    }

    public final i61 s(Boolean bool) {
        i61 i61Var = null;
        for (int i10 = 0; i10 < u(); i10++) {
            i61 i61VarV = v(i10);
            if (i61VarV.f29261a == bool.booleanValue() && (i61Var == null || i61Var.f29262b * i61Var.f29263c < i61VarV.f29262b * i61VarV.f29263c)) {
                i61Var = i61VarV;
            }
        }
        return i61Var;
    }

    public final int u() {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final i61 v(int i10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return s(Boolean.FALSE);
        }
        return (i10 < 0 || i10 >= arrayList.size()) ? s(Boolean.FALSE) : (i61) this.J.get(i10);
    }

    public final boolean y() {
        h3.k0 k0Var = this.d;
        if (k0Var == null) {
            return false;
        }
        k0Var.q0();
        return k0Var.f7961a0 == 0.0f;
    }

    public final boolean z() {
        if (this.f30604x && this.E) {
            return true;
        }
        h3.k0 k0Var = this.d;
        return k0Var != null && k0Var.h();
    }

    public m61(boolean z10, boolean z11) {
        int i10 = f30587f0;
        f30587f0 = i10 + 1;
        this.f30590a = i10;
        this.W = new Handler(Looper.getMainLooper());
        this.Y = false;
        this.Z = -1;
        this.f30593b0 = -9223372036854775807L;
        this.f30595c0 = -9223372036854775807L;
        this.f30598e0 = new ArrayList();
        this.X = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        b5.q qVar = new b5.q(ApplicationLoader.applicationContext, new ab.a(3));
        this.f30599f = qVar;
        if (z11) {
            b5.i iVarE = qVar.e();
            iVarE.getClass();
            b5.h hVar = new b5.h(iVarE);
            hVar.f2016z.add(1);
            qVar.j(new b5.i(hVar));
        }
        this.H = 1;
        this.S = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(r4.d dVar) {
    }

    @Override
    public final void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.F.onRenderedFirstFrame();
    }

    @Override
    public final void a(h3.v1 v1Var) {
    }

    @Override
    public final void b(j4.x xVar) {
    }

    @Override
    public final void d(e5.x xVar) {
    }

    @Override
    public final void e(int i10) {
    }

    @Override
    public final void h(k3.f fVar) {
    }

    @Override
    public final void onAudioAttributesChanged(j3.e eVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(h3.y1 y1Var) {
    }

    @Override
    public final void onDeviceInfoChanged(h3.m mVar) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
    }

    @Override
    public final void onMediaMetadataChanged(h3.h1 h1Var) {
    }

    @Override
    public final void onMetadata(z3.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(h3.x1 x1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(h3.v1 v1Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onSeekProcessed() {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void c(h3.c2 c2Var, g5.b bVar) {
    }

    @Override
    public final void g(i3.a aVar, j4.x xVar) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override
    public final void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override
    public final void onMediaItemTransition(h3.f1 f1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(h3.s2 s2Var, int i10) {
    }

    @Override
    public final void i(i3.a aVar, int i10, long j10) {
    }
}
