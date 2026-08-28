package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.c;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.s0;
import e.a;
import g5.b;
import h3.f1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l3.i;
import m4.g;
import n4.e;
import n5.e0;
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
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fk0;
import p4.q;
import v9.d;
public class k61 implements h3.a2, e5.t, i3.b, NotificationCenter.NotificationCenterDelegate {
    public static int f29995f0;
    public static final HashSet f29996g0 = new HashSet();
    public static HashMap f29997h0;
    public boolean A;
    public Uri B;
    public boolean C;
    public boolean D;
    public boolean E;
    public h61 F;
    public d61 G;
    public int H;
    public boolean I;
    public ArrayList J;
    public g61 K;
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
    public j4.t0 V;
    public final Handler W;
    public final boolean X;
    public boolean Y;
    public int Z;
    public final int f29998a;
    public boolean f29999a0;
    public DispatchQueue f30000b;
    public long f30001b0;
    public boolean f30002c;
    public long f30003c0;
    public h3.k0 d;
    public org.telegram.ui.gq0 f30004d0;
    public h3.k2 f30005e;
    public final ArrayList f30006e0;
    public final b5.r f30007f;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView f30008n;
    public SurfaceView f30009r;
    public Surface f30010s;
    public boolean v;
    public boolean f30011w;
    public boolean f30012x;
    public boolean f30013y;

    public k61() {
        this(true, false);
    }

    public static void J(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void K(g61 g61Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (g61Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g61Var.f28661b);
            sb2.append("x");
            sb2.append(g61Var.f28662c);
            if (g61Var.f28660a) {
                str = "s";
            } else {
                str = "";
            }
            sb2.append(str);
            edit.putString(str2, sb2.toString());
        }
        edit.apply();
    }

    public static boolean Y(String str) {
        String concat;
        if (str == null) {
            concat = null;
        } else {
            char c10 = 65535;
            switch (str.hashCode()) {
                case 96924:
                    if (str.equals("av1")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 96974:
                    if (str.equals("avc")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 116926:
                    if (str.equals("vp8")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116927:
                    if (str.equals("vp9")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3004662:
                    if (str.equals("av01")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3148040:
                    if (str.equals("h264")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3148041:
                    if (str.equals("h265")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3199082:
                    if (str.equals("hevc")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 4:
                    concat = "video/av01";
                    break;
                case 1:
                case 5:
                    concat = "video/avc";
                    break;
                case 2:
                    concat = "video/x-vnd.on2.vp8";
                    break;
                case 3:
                    concat = "video/x-vnd.on2.vp9";
                    break;
                case 6:
                case 7:
                    concat = "video/hevc";
                    break;
                default:
                    try {
                        concat = "video/".concat(str);
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f29997h0 == null) {
                f29997h0 = new HashMap();
            }
            Boolean bool = (Boolean) f29997h0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i9 = 0; i9 < codecCount; i9++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                    if (!codecInfoAt.isEncoder() && y3.w.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f29997h0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f29997h0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static i61 l(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                if (i61Var.b()) {
                    return i61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList t(int i9, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        g61 g61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!MessagesController.getInstance(i9).videoIgnoreAltDocuments && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i11 = 0;
        while (i11 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i11);
                    i11--;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            i11++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i12);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    i61 d = i61.d(i9, document3, (TLRPC.Document) longSparseArray.get(document3.f22386id), i10, z10);
                    if (d.f29363i > 0 && d.f29364j > 0) {
                        if (document3 == document) {
                            d.f29358b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            i61 i61Var = (i61) arrayList3.get(i13);
            String str2 = i61Var.f29367m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(i61Var.f29367m) && !"hevc".equals(i61Var.f29367m) && !"h265".equals(i61Var.f29367m) && !"vp9".equals(i61Var.f29367m)) || Y(i61Var.f29367m))) {
                arrayList4.add(i61Var);
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
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList5.get(i14);
            i14++;
            i61 i61Var2 = (i61) obj;
            if (i61Var2.f29358b) {
                arrayList6.add(new g61(i61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        g61Var = (g61) obj2;
                        if (!g61Var.f28660a && g61Var.f28661b == i61Var2.f29363i && g61Var.f28662c == i61Var2.f29364j) {
                            break;
                        }
                    } else {
                        g61Var = null;
                        break;
                    }
                }
                if (g61Var != null && !SharedConfig.debugVideoQualities) {
                    g61Var.d.add(i61Var2);
                } else {
                    arrayList6.add(new g61(i61Var2));
                }
            }
        }
        return arrayList6;
    }

    public static i61 w(ArrayList arrayList) {
        int i9;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                i61 i61Var = (i61) obj2;
                if (i61Var.f29358b && i61Var.b()) {
                    return i61Var;
                }
            }
        }
        int size3 = arrayList.size();
        i61 i61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((g61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                i61 i61Var3 = (i61) obj4;
                if (!i61Var3.f29358b && Y(i61Var3.f29367m) && (i61Var2 == null || (i9 = i61Var3.f29363i * i61Var3.f29364j) > (i10 = i61Var2.f29363i * i61Var2.f29364j) || (i9 == i10 && i61Var3.f29366l < i61Var2.f29366l))) {
                    i61Var2 = i61Var3;
                }
            }
        }
        if (i61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((g61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    i61 i61Var4 = (i61) obj6;
                    if (i61Var2 == null || i61Var2.f29363i * i61Var2.f29364j > i61Var4.f29363i * i61Var4.f29364j || i61Var4.f29366l < i61Var2.f29366l) {
                        i61Var2 = i61Var4;
                    }
                }
            }
        }
        return i61Var2;
    }

    public static i61 x(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList2 = ((g61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                if (i61Var.b()) {
                    return i61Var;
                }
            }
        }
        int size3 = arrayList.size();
        i61 i61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((g61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                i61 i61Var3 = (i61) obj4;
                if (!i61Var3.f29358b && (i61Var2 == null || i61Var2.f29363i * i61Var2.f29364j > i61Var3.f29363i * i61Var3.f29364j || i61Var3.f29366l < i61Var2.f29366l)) {
                    if (i61Var3.f29363i <= 900 && i61Var3.f29364j <= 900) {
                        i61Var2 = i61Var3;
                    }
                }
            }
        }
        if (i61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((g61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    i61 i61Var4 = (i61) obj6;
                    if (i61Var2 == null || i61Var2.f29363i * i61Var2.f29364j > i61Var4.f29363i * i61Var4.f29364j || i61Var4.f29366l < i61Var2.f29366l) {
                        i61Var2 = i61Var4;
                    }
                }
            }
        }
        return i61Var2;
    }

    public final Uri A(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.L = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ArrayList arrayList3 = ((g61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                long j10 = i61Var.f29359c;
                Uri uri = i61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(i61Var.f29360e, i61Var.f29361f);
                if (i61Var.f29361f != null) {
                    this.L.add(i61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(i61Var.f29366l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(i61Var.f29363i);
                    sb3.append("x");
                    sb3.append(i61Var.f29364j);
                    String str2 = i61Var.f29367m;
                    if (str2 == null) {
                        str = null;
                    } else {
                        char c10 = 65535;
                        switch (str2.hashCode()) {
                            case 96924:
                                if (str2.equals("av1")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 96974:
                                if (str2.equals("avc")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 116926:
                                if (str2.equals("vp8")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 116927:
                                if (str2.equals("vp9")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 3004662:
                                if (str2.equals("av01")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 3148040:
                                if (str2.equals("h264")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 3148041:
                                if (str2.equals("h265")) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                            case 3199082:
                                if (str2.equals("hevc")) {
                                    c10 = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 4:
                                str = "video/av01";
                                break;
                            case 1:
                            case 5:
                                str = "video/avc";
                                break;
                            case 2:
                                str = "video/x-vnd.on2.vp8";
                                break;
                            case 3:
                                str = "video/x-vnd.on2.vp9";
                                break;
                            case 6:
                            case 7:
                                str = "video/hevc";
                                break;
                            default:
                                str = "video/".concat(str2);
                                break;
                        }
                    }
                    if (str != null) {
                        sb3.append(",MIME=\"");
                        sb3.append(str);
                        sb3.append("\"");
                    }
                    if (i61Var.b() && i61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(i61Var.f29359c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(i61Var.f29357a);
                    sb3.append("\"\n");
                    if (i61Var.c()) {
                        sb3.append(i61Var.f29361f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(i61Var.f29360e);
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
        h3.c1 c1Var;
        h3.x0 x0Var = new h3.x0();
        o8.x xVar = o8.z.f19105b;
        o8.l0 l0Var = o8.l0.f19056e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.f19056e;
        h3.d1 d1Var = h3.d1.f9375c;
        if (uri != null) {
            c1Var = new h3.c1(uri, null, null, list, null, l0Var2, null);
        } else {
            c1Var = null;
        }
        h3.f1 f1Var = new h3.f1("", new h3.y0(x0Var), c1Var, new h3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h3.h1.U, d1Var);
        if (j10 != 0) {
            d3.e eVar = new d3.e(this, j10, 7);
            gh.i3 i3Var = new gh.i3(new m3.i(), 27);
            v9.d dVar = new v9.d(4);
            c1Var.getClass();
            h3.c1 c1Var2 = f1Var.f9399b;
            c1Var2.getClass();
            c1Var2.getClass();
            return new j4.u0(f1Var, eVar, i3Var, l3.i.f16639p, dVar, 1048576);
        }
        str.getClass();
        boolean equals = str.equals("hls");
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        if (!equals) {
            if (!str.equals("dash")) {
                if (this.V == null) {
                    this.V = new j4.t0(extendedDefaultDataSourceFactory, new m3.i());
                }
                return this.V.a(f1Var);
            }
            if (this.T == null) {
                this.T = new j4.c0(extendedDefaultDataSourceFactory) {
                    public final c f2502a;
                    public final l f2503b;
                    public final a f2504c = new a();
                    public final d f2505e = new d(4);
                    public final long f2506f = 30000;
                    public final za.a d = new za.a(10);

                    {
                        this.f2502a = new c(extendedDefaultDataSourceFactory, 28);
                        this.f2503b = extendedDefaultDataSourceFactory;
                    }

                    @Override
                    public final j4.a a(f1 f1Var2) {
                        s0 s0Var;
                        f1Var2.f9399b.getClass();
                        s0 eVar2 = new e();
                        List list2 = f1Var2.f9399b.f9364c;
                        if (!list2.isEmpty()) {
                            s0Var = new b(9, eVar2, list2);
                        } else {
                            s0Var = eVar2;
                        }
                        return new g(f1Var2, this.f2503b, s0Var, this.f2502a, this.d, this.f2504c.b(f1Var2), this.f2505e, this.f2506f);
                    }
                };
            }
            return a(f1Var);
        }
        if (this.U == null) {
            this.U = new j4.c0(extendedDefaultDataSourceFactory) {
                public final e0 f2507a;
                public final a f2511f = new a();
                public final ya.b f2509c = new ya.b(20);
                public final fk0 d = p4.c.A;
                public final o4.c f2508b = j.f18875a;
                public final d f2512g = new d(4);
                public final za.a f2510e = new za.a(10);
                public final int f2513i = 1;
                public final long f2514j = -9223372036854775807L;
                public final boolean h = true;

                {
                    this.f2507a = new e0(extendedDefaultDataSourceFactory, 4);
                }

                @Override
                public final m a(f1 f1Var2) {
                    f1Var2.f9399b.getClass();
                    List list2 = f1Var2.f9399b.f9364c;
                    boolean isEmpty = list2.isEmpty();
                    q qVar = this.f2509c;
                    if (!isEmpty) {
                        qVar = new e3(qVar, list2, false, 13);
                    }
                    i b10 = this.f2511f.b(f1Var2);
                    this.d.getClass();
                    e0 e0Var = this.f2507a;
                    d dVar2 = this.f2512g;
                    return new m(f1Var2, e0Var, this.f2508b, this.f2510e, b10, dVar2, new p4.c(e0Var, dVar2, qVar), this.f2514j, this.h, this.f2513i);
                }
            };
        }
        return a(f1Var);
    }

    public void C() {
        this.E = false;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.o(false);
        }
        h3.k2 k2Var = this.f30005e;
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
        if (this.f30012x && (!this.D || !this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            h3.k2 k2Var = this.f30005e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(true);
        }
        h3.k2 k2Var2 = this.f30005e;
        if (k2Var2 != null) {
            k2Var2.o(true);
        }
    }

    public final void E(Uri uri, String str) {
        F(uri, str, 0L);
    }

    public final void F(Uri uri, String str, long j10) {
        String str2 = null;
        this.J = null;
        this.K = null;
        this.M = uri;
        this.O = str;
        this.N = null;
        this.P = null;
        boolean z10 = false;
        this.Q = false;
        this.Y = false;
        this.f29999a0 = false;
        this.C = false;
        this.f30012x = false;
        this.B = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        j();
        this.d.e0(B(uri, str, j10), true);
        this.d.a();
    }

    public final void G(ArrayList arrayList, g61 g61Var) {
        int i9;
        ArrayList arrayList2;
        this.J = arrayList;
        this.K = g61Var;
        this.M = null;
        this.O = "hls";
        this.N = null;
        this.P = null;
        this.Q = false;
        this.Y = false;
        this.C = false;
        this.f30012x = false;
        this.B = null;
        this.v = true;
        j();
        this.f29999a0 = false;
        if (g61Var != null && (arrayList2 = this.J) != null) {
            i9 = arrayList2.indexOf(g61Var);
        } else {
            i9 = -1;
        }
        this.Z = i9;
        S(true, g61Var);
        if (this.Y) {
            this.Z = -1;
        }
    }

    public final void H(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        j4.t tVar = null;
        this.J = null;
        this.K = null;
        this.M = uri;
        this.N = uri2;
        this.O = str;
        this.P = str2;
        this.Q = true;
        this.f29999a0 = false;
        this.f30012x = true;
        this.D = false;
        this.C = false;
        j();
        j4.t tVar2 = null;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            j4.t tVar3 = new j4.t(B(uri3, str3, 0L));
            if (i9 == 0) {
                tVar = tVar3;
            } else {
                tVar2 = tVar3;
            }
        }
        this.d.e0(tVar, true);
        this.d.a();
        h3.k2 k2Var = this.f30005e;
        k2Var.Q();
        k2Var.f9576b.e0(tVar2, true);
        this.f30005e.a();
        f29996g0.add(Integer.valueOf(this.f29998a));
    }

    public final void I() {
        f29996g0.remove(Integer.valueOf(this.f29998a));
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.N();
            this.d = null;
        }
        h3.k2 k2Var = this.f30005e;
        if (k2Var != null) {
            k2Var.N();
            this.f30005e = null;
        }
        if (this.S) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void L(long j10) {
        M(j10, false);
    }

    public final void M(long j10, boolean z10) {
        h3.j2 j2Var;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (z10) {
                j2Var = h3.j2.d;
            } else {
                j2Var = h3.j2.f9522c;
            }
            k0Var.f0(j2Var);
            this.d.P(5, j10);
        }
    }

    public final void N(long j10, boolean z10, Runnable runnable) {
        h3.j2 j2Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f30006e0.add(runnable);
            }
            h3.k0 k0Var = this.d;
            if (z10) {
                j2Var = h3.j2.d;
            } else {
                j2Var = h3.j2.f9522c;
            }
            k0Var.f0(j2Var);
            this.d.P(5, j10);
        }
    }

    public final void O(boolean z10) {
        int i9;
        if (this.R != z10) {
            this.R = z10;
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                if (z10) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                k0Var.e(i9);
            }
        }
    }

    public final void P(boolean z10) {
        float f10;
        h3.k0 k0Var = this.d;
        float f11 = 1.0f;
        if (k0Var != null) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            k0Var.k0(f10);
        }
        h3.k2 k2Var = this.f30005e;
        if (k2Var != null) {
            if (z10) {
                f11 = 0.0f;
            }
            k2Var.R(f11);
        }
    }

    public void Q(boolean z10) {
        this.E = z10;
        if (z10 && this.f30012x && (!this.D || !this.C)) {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            h3.k2 k2Var = this.f30005e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        this.f30011w = z10;
        h3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(z10);
        }
        h3.k2 k2Var2 = this.f30005e;
        if (k2Var2 != null) {
            k2Var2.o(z10);
        }
    }

    public void R(float f10) {
        try {
            h3.k0 k0Var = this.d;
            if (k0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                k0Var.setPlaybackParameters(new h3.x1(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void S(boolean r21, org.telegram.ui.Components.g61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k61.S(boolean, org.telegram.ui.Components.g61):void");
    }

    public final void T(int i9) {
        int i10;
        int i11;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (i9 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            k0Var.d0(new j3.e(0, 0, i11, 1, 0), false);
        }
        h3.k2 k2Var = this.f30005e;
        if (k2Var != null) {
            if (i9 == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            j3.e eVar = new j3.e(0, 0, i10, 1, 0);
            k2Var.Q();
            k2Var.f9576b.d0(eVar, true);
        }
    }

    public final void U(Surface surface) {
        if (this.f30010s != surface) {
            this.f30010s = surface;
            h3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.h0(surface);
        }
    }

    public final void V(SurfaceView surfaceView) {
        if (this.f30009r != surfaceView) {
            this.f30009r = surfaceView;
            h3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.i0(surfaceView);
        }
    }

    public final void W(TextureView textureView) {
        if (this.f30008n != textureView) {
            this.f30008n = textureView;
            h3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.j0(textureView);
        }
    }

    public final void X(float f10) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(f10);
        }
        h3.k2 k2Var = this.f30005e;
        if (k2Var != null) {
            k2Var.R(f10);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.playerDidStartPlaying && ((k61) objArr[0]) != this && z() && !this.f30013y) {
            C();
        }
    }

    @Override
    public final void f(i3.a aVar) {
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onSeekFinished(aVar);
        }
        ArrayList arrayList = this.f30006e0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void j() {
        h3.j jVar;
        h3.l lVar;
        if (this.f30002c) {
            jVar = new h3.j(new com.google.android.exoplayer2.upstream.r(), 1000, 1000);
        } else {
            jVar = new h3.j(new com.google.android.exoplayer2.upstream.r(), 100, 5000);
        }
        if (this.d == null) {
            if (this.G != null) {
                lVar = new e61(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new h3.l(ApplicationLoader.applicationContext);
            }
            int i9 = 2;
            lVar.f9580c = 2;
            h3.r rVar = new h3.r(ApplicationLoader.applicationContext);
            d5.a.i(!rVar.f9685s);
            rVar.f9671c = new h3.o(lVar, 2);
            b5.r rVar2 = this.f30007f;
            d5.a.i(!rVar.f9685s);
            rVar2.getClass();
            rVar.f9672e = new h3.o(rVar2, 1);
            d5.a.i(!rVar.f9685s);
            rVar.f9673f = new h3.o(jVar, 0);
            d5.a.i(!rVar.f9685s);
            rVar.f9685s = true;
            h3.k0 k0Var = new h3.k0(rVar, null);
            this.d = k0Var;
            i3.f fVar = k0Var.f9557r;
            fVar.getClass();
            fVar.f10893f.a(this);
            this.d.f9550l.a(this);
            this.d.m0.add(this);
            TextureView textureView = this.f30008n;
            if (textureView != null) {
                this.d.j0(textureView);
            } else {
                Surface surface = this.f30010s;
                if (surface != null) {
                    this.d.h0(surface);
                } else {
                    SurfaceView surfaceView = this.f30009r;
                    if (surfaceView != null) {
                        this.d.i0(surfaceView);
                    }
                }
            }
            this.d.o(this.f30011w);
            h3.k0 k0Var2 = this.d;
            if (!this.R) {
                i9 = 0;
            }
            k0Var2.e(i9);
        }
        if (this.f30012x && this.f30005e == null) {
            h3.r rVar3 = new h3.r(ApplicationLoader.applicationContext);
            b5.r rVar4 = this.f30007f;
            d5.a.i(!rVar3.f9685s);
            rVar4.getClass();
            rVar3.f9672e = new h3.o(rVar4, 1);
            d5.a.i(!rVar3.f9685s);
            rVar3.f9673f = new h3.o(jVar, 0);
            d5.a.i(!rVar3.f9685s);
            rVar3.f9685s = true;
            h3.k2 k2Var = new h3.k2(rVar3);
            this.f30005e = k2Var;
            k2Var.k(new c61(this));
            this.f30005e.o(this.f30011w);
        }
    }

    public final long k() {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (this.v) {
                return k0Var.t();
            }
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final we.g m(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.J == null) {
            if (this.M == null) {
                return null;
            }
            String d = ta.b.d("/mtproto_", str);
            String queryParameter = this.M.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            f2.g1 g1Var = new f2.g1(this.M, str5, d);
            g1Var.f5364g = str2;
            g1Var.h = str3;
            return new we.g(new we.f(g1Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            ArrayList arrayList3 = ((g61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                i61 i61Var = (i61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(i61Var.f29359c);
                String sb3 = sb2.toString();
                TLRPC.Document document = i61Var.f29362g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                f2.g1 g1Var2 = new f2.g1(i61Var.d, str4, sb3);
                g1Var2.f5364g = str2;
                g1Var2.h = str3;
                int i11 = i61Var.f29363i;
                int i12 = i61Var.f29364j;
                g1Var2.f5359a = i11;
                g1Var2.f5360b = i12;
                arrayList.add(new we.f(g1Var2));
                arrayList2 = arrayList4;
            }
        }
        return new we.g(arrayList);
    }

    public final TLRPC.Document n() {
        ArrayList arrayList;
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.q0();
            h3.t0 t0Var = k0Var.P;
            if (t0Var != null && t0Var.f9768w != 0 && (arrayList = this.J) != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ArrayList arrayList2 = ((g61) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        i61 i61Var = (i61) obj2;
                        if (i61Var.f29359c == t0Var.f9768w) {
                            return i61Var.f29362g;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long o() {
        long j10 = this.f30003c0;
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
        AndroidUtilities.runOnUIThread(new jg0(28, this, v1Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i9) {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            boolean h = k0Var.h();
            int b10 = this.d.b();
            if (this.I != h || this.H != b10) {
                this.F.onStateChanged(h, b10);
                this.I = h;
                this.H = b10;
            }
        }
        if (z10 && i9 == 3 && !y() && this.S) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.C && i9 == 3) {
            this.C = true;
            if (this.D && this.E) {
                D();
            }
        }
        if (i9 != 3) {
            this.W.removeCallbacksAndMessages(null);
            d61 d61Var = this.G;
            if (d61Var != null) {
                d61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i9) {
    }

    @Override
    public final void onRenderedFirstFrame(i3.a aVar) {
        this.f30003c0 = -9223372036854775807L;
        this.f30001b0 = -9223372036854775807L;
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(i3.a aVar) {
        h61 h61Var = this.F;
        if (h61Var != null) {
            h61Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTracksChanged(h3.t2 t2Var) {
        org.telegram.ui.gq0 gq0Var = this.f30004d0;
        if (gq0Var != null) {
            AndroidUtilities.runOnUIThread(gq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(e5.z zVar) {
        this.F.onVideoSizeChanged(zVar.f4954a, zVar.f4955b, zVar.f4956c, zVar.d);
    }

    public final int p() {
        if (this.Z == -1) {
            try {
                if (this.Y) {
                    for (int i9 = 0; i9 < u(); i9++) {
                        if (v(i9).f28660a) {
                            return i9;
                        }
                    }
                }
                h3.k0 k0Var = this.d;
                if (k0Var != null) {
                    k0Var.q0();
                    h3.t0 t0Var = k0Var.P;
                    if (t0Var != null) {
                        for (int i10 = 0; i10 < u(); i10++) {
                            g61 v = v(i10);
                            if (!v.f28660a && t0Var.G == v.f28661b && t0Var.H == v.f28662c && t0Var.f9765n == ((int) Math.floor(((i61) v.d.get(0)).f29366l * 8.0d))) {
                                return i10;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e10) {
                FileLog.e(e10);
                return -1;
            }
        }
        return this.Z;
    }

    public final long q() {
        long j10 = this.f30001b0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final kh.z7 r(kh.z7 z7Var) {
        kh.z7 z7Var2 = z7Var;
        if (z7Var == null) {
            z7Var2 = new Object();
        }
        try {
            h3.k0 k0Var = this.d;
            k0Var.q0();
            MediaFormat mediaFormat = ((y3.q) k0Var.f9541g[0]).K;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    z7Var2.f16465b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    z7Var2.f16464a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return z7Var2;
    }

    public final g61 s(Boolean bool) {
        g61 g61Var = null;
        for (int i9 = 0; i9 < u(); i9++) {
            g61 v = v(i9);
            if (v.f28660a == bool.booleanValue() && (g61Var == null || g61Var.f28661b * g61Var.f28662c < v.f28661b * v.f28662c)) {
                g61Var = v;
            }
        }
        return g61Var;
    }

    public final int u() {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final g61 v(int i9) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return s(Boolean.FALSE);
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            return (g61) this.J.get(i9);
        }
        return s(Boolean.FALSE);
    }

    public final boolean y() {
        h3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.q0();
            if (k0Var.f9531a0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean z() {
        if (!this.f30012x || !this.E) {
            h3.k0 k0Var = this.d;
            if (k0Var != null && k0Var.h()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public k61(boolean z10, boolean z11) {
        int i9 = f29995f0;
        f29995f0 = i9 + 1;
        this.f29998a = i9;
        this.W = new Handler(Looper.getMainLooper());
        this.Y = false;
        this.Z = -1;
        this.f30001b0 = -9223372036854775807L;
        this.f30003c0 = -9223372036854775807L;
        this.f30006e0 = new ArrayList();
        this.X = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        b5.r rVar = new b5.r(ApplicationLoader.applicationContext, new wa.a(3));
        this.f30007f = rVar;
        if (z11) {
            b5.j e10 = rVar.e();
            e10.getClass();
            b5.i iVar = new b5.i(e10);
            iVar.f1531z.add(1);
            rVar.j(new b5.j(iVar));
        }
        this.H = 1;
        this.S = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(r4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(h3.b2 b2Var, h3.b2 b2Var2, int i9) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.F.onRenderedFirstFrame();
    }

    @Override
    public final void a(h3.v1 v1Var) {
    }

    @Override
    public final void b(j4.y yVar) {
    }

    @Override
    public final void d(e5.z zVar) {
    }

    @Override
    public final void e(int i9) {
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
    public final void onPlaybackStateChanged(int i9) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i9) {
    }

    @Override
    public final void onPlayerErrorChanged(h3.v1 v1Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i9) {
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
    public final void g(i3.a aVar, j4.y yVar) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i9, boolean z10) {
    }

    @Override
    public final void onEvents(h3.c2 c2Var, h3.z1 z1Var) {
    }

    @Override
    public final void onMediaItemTransition(h3.f1 f1Var, int i9) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i9) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i9, int i10) {
    }

    @Override
    public final void onTimelineChanged(h3.r2 r2Var, int i9) {
    }

    @Override
    public final void i(i3.a aVar, int i9, long j10) {
    }
}
