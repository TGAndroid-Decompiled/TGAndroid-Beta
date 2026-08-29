package org.telegram.ui.Components;

import a3.c;
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
import bb.a;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.s0;
import f7.v;
import j3.f1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import nh.d6;
import o4.h;
import oc.i;
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
import p4.e;
import q4.j;
import q4.m;
import r4.q;
public class x61 implements j3.a2, g5.t, k3.b, NotificationCenter.NotificationCenterDelegate {
    public static int f34625f0;
    public static final HashSet f34626g0 = new HashSet();
    public static HashMap f34627h0;
    public boolean A;
    public Uri B;
    public boolean C;
    public boolean D;
    public boolean E;
    public u61 F;
    public q61 G;
    public int H;
    public boolean I;
    public ArrayList J;
    public t61 K;
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
    public l4.t0 V;
    public final Handler W;
    public final boolean X;
    public boolean Y;
    public int Z;
    public final int f34628a;
    public boolean f34629a0;
    public DispatchQueue f34630b;
    public long f34631b0;
    public boolean f34632c;
    public long f34633c0;
    public j3.k0 d;
    public org.telegram.ui.gq0 f34634d0;
    public j3.k2 f34635e;
    public final ArrayList f34636e0;
    public final d5.p f34637f;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView f34638n;
    public SurfaceView f34639r;
    public Surface f34640s;
    public boolean v;
    public boolean f34641w;
    public boolean f34642x;
    public boolean f34643y;

    public x61() {
        this(true, false);
    }

    public static void J(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void K(t61 t61Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (t61Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(t61Var.f32884b);
            sb2.append("x");
            sb2.append(t61Var.f32885c);
            if (t61Var.f32883a) {
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
            char c3 = 65535;
            switch (str.hashCode()) {
                case 96924:
                    if (str.equals("av1")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 96974:
                    if (str.equals("avc")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 116926:
                    if (str.equals("vp8")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 116927:
                    if (str.equals("vp9")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 3004662:
                    if (str.equals("av01")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 3148040:
                    if (str.equals("h264")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 3148041:
                    if (str.equals("h265")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 3199082:
                    if (str.equals("hevc")) {
                        c3 = 7;
                        break;
                    }
                    break;
            }
            switch (c3) {
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
            if (f34627h0 == null) {
                f34627h0 = new HashMap();
            }
            Boolean bool = (Boolean) f34627h0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && a4.b0.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f34627h0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f34627h0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static v61 l(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((t61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                v61 v61Var = (v61) obj2;
                if (v61Var.b()) {
                    return v61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList t(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        t61 t61Var;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    v61 d = v61.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f22398id), i11, z10);
                    if (d.f33478i > 0 && d.f33479j > 0) {
                        if (document3 == document) {
                            d.f33473b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            v61 v61Var = (v61) arrayList3.get(i14);
            String str2 = v61Var.f33482m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(v61Var.f33482m) && !"hevc".equals(v61Var.f33482m) && !"h265".equals(v61Var.f33482m) && !"vp9".equals(v61Var.f33482m)) || Y(v61Var.f33482m))) {
                arrayList4.add(v61Var);
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
            v61 v61Var2 = (v61) obj;
            if (v61Var2.f33473b) {
                arrayList6.add(new t61(v61Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        t61Var = (t61) obj2;
                        if (!t61Var.f32883a && t61Var.f32884b == v61Var2.f33478i && t61Var.f32885c == v61Var2.f33479j) {
                            break;
                        }
                    } else {
                        t61Var = null;
                        break;
                    }
                }
                if (t61Var != null && !SharedConfig.debugVideoQualities) {
                    t61Var.d.add(v61Var2);
                } else {
                    arrayList6.add(new t61(v61Var2));
                }
            }
        }
        return arrayList6;
    }

    public static v61 w(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((t61) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                v61 v61Var = (v61) obj2;
                if (v61Var.f33473b && v61Var.b()) {
                    return v61Var;
                }
            }
        }
        int size3 = arrayList.size();
        v61 v61Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((t61) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                v61 v61Var3 = (v61) obj4;
                if (!v61Var3.f33473b && Y(v61Var3.f33482m) && (v61Var2 == null || (i10 = v61Var3.f33478i * v61Var3.f33479j) > (i11 = v61Var2.f33478i * v61Var2.f33479j) || (i10 == i11 && v61Var3.f33481l < v61Var2.f33481l))) {
                    v61Var2 = v61Var3;
                }
            }
        }
        if (v61Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((t61) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    v61 v61Var4 = (v61) obj6;
                    if (v61Var2 == null || v61Var2.f33478i * v61Var2.f33479j > v61Var4.f33478i * v61Var4.f33479j || v61Var4.f33481l < v61Var2.f33481l) {
                        v61Var2 = v61Var4;
                    }
                }
            }
        }
        return v61Var2;
    }

    public static v61 x(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((t61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                v61 v61Var = (v61) obj2;
                if (v61Var.b()) {
                    return v61Var;
                }
            }
        }
        int size3 = arrayList.size();
        v61 v61Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((t61) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                v61 v61Var3 = (v61) obj4;
                if (!v61Var3.f33473b && (v61Var2 == null || v61Var2.f33478i * v61Var2.f33479j > v61Var3.f33478i * v61Var3.f33479j || v61Var3.f33481l < v61Var2.f33481l)) {
                    if (v61Var3.f33478i <= 900 && v61Var3.f33479j <= 900) {
                        v61Var2 = v61Var3;
                    }
                }
            }
        }
        if (v61Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((t61) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    v61 v61Var4 = (v61) obj6;
                    if (v61Var2 == null || v61Var2.f33478i * v61Var2.f33479j > v61Var4.f33478i * v61Var4.f33479j || v61Var4.f33481l < v61Var2.f33481l) {
                        v61Var2 = v61Var4;
                    }
                }
            }
        }
        return v61Var2;
    }

    public final Uri A(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.L = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((t61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                v61 v61Var = (v61) obj2;
                long j10 = v61Var.f33474c;
                Uri uri = v61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(v61Var.f33475e, v61Var.f33476f);
                if (v61Var.f33476f != null) {
                    this.L.add(v61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(v61Var.f33481l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(v61Var.f33478i);
                    sb3.append("x");
                    sb3.append(v61Var.f33479j);
                    String str2 = v61Var.f33482m;
                    if (str2 == null) {
                        str = null;
                    } else {
                        char c3 = 65535;
                        switch (str2.hashCode()) {
                            case 96924:
                                if (str2.equals("av1")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 96974:
                                if (str2.equals("avc")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 116926:
                                if (str2.equals("vp8")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 116927:
                                if (str2.equals("vp9")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 3004662:
                                if (str2.equals("av01")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 3148040:
                                if (str2.equals("h264")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 3148041:
                                if (str2.equals("h265")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case 3199082:
                                if (str2.equals("hevc")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
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
                    if (v61Var.b() && v61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(v61Var.f33474c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(v61Var.f33472a);
                    sb3.append("\"\n");
                    if (v61Var.c()) {
                        sb3.append(v61Var.f33476f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(v61Var.f33475e);
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

    public final l4.a B(Uri uri, String str, long j10) {
        j3.c1 c1Var;
        j3.x0 x0Var = new j3.x0();
        q8.x xVar = q8.z.f46511b;
        q8.l0 l0Var = q8.l0.f46462e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.f46462e;
        j3.d1 d1Var = j3.d1.f10413c;
        if (uri != null) {
            c1Var = new j3.c1(uri, null, null, list, null, l0Var2, null);
        } else {
            c1Var = null;
        }
        j3.f1 f1Var = new j3.f1("", new j3.y0(x0Var), c1Var, new j3.b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.h1.U, d1Var);
        if (j10 != 0) {
            f3.e eVar = new f3.e(this, j10, 7);
            l4.s0 s0Var = new l4.s0(new o3.i(), 0);
            f7.v vVar = new f7.v(4);
            c1Var.getClass();
            j3.c1 c1Var2 = f1Var.f10437b;
            c1Var2.getClass();
            c1Var2.getClass();
            return new l4.u0(f1Var, eVar, s0Var, n3.i.f17106o, vVar, 1048576);
        }
        str.getClass();
        boolean equals = str.equals("hls");
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        if (!equals) {
            if (!str.equals("dash")) {
                if (this.V == null) {
                    this.V = new l4.t0(extendedDefaultDataSourceFactory, new o3.i());
                }
                return this.V.a(f1Var);
            }
            if (this.T == null) {
                this.T = new l4.b0(extendedDefaultDataSourceFactory) {
                    public final d6 f3516a;
                    public final l f3517b;
                    public final c f3518c = new c();
                    public final v f3519e = new v(4);
                    public final long f3520f = 30000;
                    public final a d = new a(12);

                    {
                        this.f3516a = new d6(extendedDefaultDataSourceFactory, 4);
                        this.f3517b = extendedDefaultDataSourceFactory;
                    }

                    @Override
                    public final l4.a a(f1 f1Var2) {
                        s0 s0Var2;
                        f1Var2.f10437b.getClass();
                        e eVar2 = new e();
                        List list2 = f1Var2.f10437b.f10403c;
                        if (!list2.isEmpty()) {
                            s0Var2 = new g9.l(eVar2, list2, false, 15);
                        } else {
                            s0Var2 = eVar2;
                        }
                        return new h(f1Var2, this.f3517b, s0Var2, this.f3516a, this.d, this.f3518c.b(f1Var2), this.f3519e, this.f3520f);
                    }
                };
            }
            return a(f1Var);
        }
        if (this.U == null) {
            this.U = new l4.b0(extendedDefaultDataSourceFactory) {
                public final o1.a f3521a;
                public final c f3525f = new c();
                public final v f3523c = new v(22);
                public final r.a d = r4.c.A;
                public final q4.c f3522b = j.f46282a;
                public final v f3526g = new v(4);
                public final a f3524e = new a(12);
                public final int f3527i = 1;
                public final long f3528j = -9223372036854775807L;
                public final boolean h = true;

                {
                    this.f3521a = new o1.a(extendedDefaultDataSourceFactory, 15);
                }

                @Override
                public final m a(f1 f1Var2) {
                    f1Var2.f10437b.getClass();
                    List list2 = f1Var2.f10437b.f10403c;
                    boolean isEmpty = list2.isEmpty();
                    q qVar = this.f3523c;
                    if (!isEmpty) {
                        qVar = new i(qVar, list2, false, 22);
                    }
                    n3.i b10 = this.f3525f.b(f1Var2);
                    this.d.getClass();
                    o1.a aVar = this.f3521a;
                    v vVar2 = this.f3526g;
                    return new m(f1Var2, aVar, this.f3522b, this.f3524e, b10, vVar2, new r4.c(aVar, vVar2, qVar), this.f3528j, this.h, this.f3527i);
                }
            };
        }
        return a(f1Var);
    }

    public void C() {
        this.E = false;
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.o(false);
        }
        j3.k2 k2Var = this.f34635e;
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
        if (this.f34642x && (!this.D || !this.C)) {
            j3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            j3.k2 k2Var = this.f34635e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        j3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(true);
        }
        j3.k2 k2Var2 = this.f34635e;
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
        this.f34629a0 = false;
        this.C = false;
        this.f34642x = false;
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

    public final void G(ArrayList arrayList, t61 t61Var) {
        int i10;
        ArrayList arrayList2;
        this.J = arrayList;
        this.K = t61Var;
        this.M = null;
        this.O = "hls";
        this.N = null;
        this.P = null;
        this.Q = false;
        this.Y = false;
        this.C = false;
        this.f34642x = false;
        this.B = null;
        this.v = true;
        j();
        this.f34629a0 = false;
        if (t61Var != null && (arrayList2 = this.J) != null) {
            i10 = arrayList2.indexOf(t61Var);
        } else {
            i10 = -1;
        }
        this.Z = i10;
        S(true, t61Var);
        if (this.Y) {
            this.Z = -1;
        }
    }

    public final void H(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        l4.s sVar = null;
        this.J = null;
        this.K = null;
        this.M = uri;
        this.N = uri2;
        this.O = str;
        this.P = str2;
        this.Q = true;
        this.f34629a0 = false;
        this.f34642x = true;
        this.D = false;
        this.C = false;
        j();
        l4.s sVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            l4.s sVar3 = new l4.s(B(uri3, str3, 0L));
            if (i10 == 0) {
                sVar = sVar3;
            } else {
                sVar2 = sVar3;
            }
        }
        this.d.e0(sVar, true);
        this.d.a();
        j3.k2 k2Var = this.f34635e;
        k2Var.Q();
        k2Var.f10613b.e0(sVar2, true);
        this.f34635e.a();
        f34626g0.add(Integer.valueOf(this.f34628a));
    }

    public final void I() {
        f34626g0.remove(Integer.valueOf(this.f34628a));
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.N();
            this.d = null;
        }
        j3.k2 k2Var = this.f34635e;
        if (k2Var != null) {
            k2Var.N();
            this.f34635e = null;
        }
        if (this.S) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void L(long j10) {
        M(j10, false);
    }

    public final void M(long j10, boolean z10) {
        j3.j2 j2Var;
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (z10) {
                j2Var = j3.j2.d;
            } else {
                j2Var = j3.j2.f10559c;
            }
            k0Var.f0(j2Var);
            this.d.P(5, j10);
        }
    }

    public final void N(long j10, boolean z10, Runnable runnable) {
        j3.j2 j2Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f34636e0.add(runnable);
            }
            j3.k0 k0Var = this.d;
            if (z10) {
                j2Var = j3.j2.d;
            } else {
                j2Var = j3.j2.f10559c;
            }
            k0Var.f0(j2Var);
            this.d.P(5, j10);
        }
    }

    public final void O(boolean z10) {
        int i10;
        if (this.R != z10) {
            this.R = z10;
            j3.k0 k0Var = this.d;
            if (k0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                k0Var.e(i10);
            }
        }
    }

    public final void P(boolean z10) {
        float f9;
        j3.k0 k0Var = this.d;
        float f10 = 1.0f;
        if (k0Var != null) {
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            k0Var.k0(f9);
        }
        j3.k2 k2Var = this.f34635e;
        if (k2Var != null) {
            if (z10) {
                f10 = 0.0f;
            }
            k2Var.R(f10);
        }
    }

    public void Q(boolean z10) {
        this.E = z10;
        if (z10 && this.f34642x && (!this.D || !this.C)) {
            j3.k0 k0Var = this.d;
            if (k0Var != null) {
                k0Var.o(false);
            }
            j3.k2 k2Var = this.f34635e;
            if (k2Var != null) {
                k2Var.o(false);
                return;
            }
            return;
        }
        this.f34641w = z10;
        j3.k0 k0Var2 = this.d;
        if (k0Var2 != null) {
            k0Var2.o(z10);
        }
        j3.k2 k2Var2 = this.f34635e;
        if (k2Var2 != null) {
            k2Var2.o(z10);
        }
    }

    public void R(float f9) {
        try {
            j3.k0 k0Var = this.d;
            if (k0Var != null) {
                float f10 = 1.0f;
                if (f9 > 1.0f) {
                    f10 = 0.98f;
                }
                k0Var.setPlaybackParameters(new j3.x1(f9, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void S(boolean r21, org.telegram.ui.Components.t61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x61.S(boolean, org.telegram.ui.Components.t61):void");
    }

    public final void T(int i10) {
        int i11;
        int i12;
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            k0Var.d0(new l3.e(0, 0, i12, 1, 0), false);
        }
        j3.k2 k2Var = this.f34635e;
        if (k2Var != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            l3.e eVar = new l3.e(0, 0, i11, 1, 0);
            k2Var.Q();
            k2Var.f10613b.d0(eVar, true);
        }
    }

    public final void U(Surface surface) {
        if (this.f34640s != surface) {
            this.f34640s = surface;
            j3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.h0(surface);
        }
    }

    public final void V(SurfaceView surfaceView) {
        if (this.f34639r != surfaceView) {
            this.f34639r = surfaceView;
            j3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.i0(surfaceView);
        }
    }

    public final void W(TextureView textureView) {
        if (this.f34638n != textureView) {
            this.f34638n = textureView;
            j3.k0 k0Var = this.d;
            if (k0Var == null) {
                return;
            }
            k0Var.j0(textureView);
        }
    }

    public final void X(float f9) {
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.k0(f9);
        }
        j3.k2 k2Var = this.f34635e;
        if (k2Var != null) {
            k2Var.R(f9);
        }
    }

    @Override
    public final void c(k3.a aVar) {
        u61 u61Var = this.F;
        if (u61Var != null) {
            u61Var.onSeekFinished(aVar);
        }
        ArrayList arrayList = this.f34636e0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((x61) objArr[0]) != this && z() && !this.f34643y) {
            C();
        }
    }

    public final void j() {
        j3.j jVar;
        j3.l lVar;
        if (this.f34632c) {
            jVar = new j3.j(new com.google.android.exoplayer2.upstream.r(), 1000, 1000);
        } else {
            jVar = new j3.j(new com.google.android.exoplayer2.upstream.r(), 100, 5000);
        }
        if (this.d == null) {
            if (this.G != null) {
                lVar = new r61(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new j3.l(ApplicationLoader.applicationContext);
            }
            int i10 = 2;
            lVar.f10617c = 2;
            j3.r rVar = new j3.r(ApplicationLoader.applicationContext);
            f5.a.i(!rVar.f10722s);
            rVar.f10708c = new j3.o(lVar, 2);
            d5.p pVar = this.f34637f;
            f5.a.i(!rVar.f10722s);
            pVar.getClass();
            rVar.f10709e = new j3.o(pVar, 1);
            f5.a.i(!rVar.f10722s);
            rVar.f10710f = new j3.o(jVar, 0);
            f5.a.i(!rVar.f10722s);
            rVar.f10722s = true;
            j3.k0 k0Var = new j3.k0(rVar, null);
            this.d = k0Var;
            k3.f fVar = k0Var.f10594r;
            fVar.getClass();
            fVar.f13417f.a(this);
            this.d.f10587l.a(this);
            this.d.m0.add(this);
            TextureView textureView = this.f34638n;
            if (textureView != null) {
                this.d.j0(textureView);
            } else {
                Surface surface = this.f34640s;
                if (surface != null) {
                    this.d.h0(surface);
                } else {
                    SurfaceView surfaceView = this.f34639r;
                    if (surfaceView != null) {
                        this.d.i0(surfaceView);
                    }
                }
            }
            this.d.o(this.f34641w);
            j3.k0 k0Var2 = this.d;
            if (!this.R) {
                i10 = 0;
            }
            k0Var2.e(i10);
        }
        if (this.f34642x && this.f34635e == null) {
            j3.r rVar2 = new j3.r(ApplicationLoader.applicationContext);
            d5.p pVar2 = this.f34637f;
            f5.a.i(!rVar2.f10722s);
            pVar2.getClass();
            rVar2.f10709e = new j3.o(pVar2, 1);
            f5.a.i(!rVar2.f10722s);
            rVar2.f10710f = new j3.o(jVar, 0);
            f5.a.i(!rVar2.f10722s);
            rVar2.f10722s = true;
            j3.k2 k2Var = new j3.k2(rVar2);
            this.f34635e = k2Var;
            k2Var.l(new p61(this));
            this.f34635e.o(this.f34641w);
        }
    }

    public final long k() {
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            if (this.v) {
                return k0Var.s();
            }
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final ze.g m(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.J == null) {
            if (this.M == null) {
                return null;
            }
            String e10 = u3.c.e("/mtproto_", str);
            String queryParameter = this.M.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            f2.d1 d1Var = new f2.d1(this.M, str5, e10);
            d1Var.f6295g = str2;
            d1Var.h = str3;
            return new ze.g(new ze.f(d1Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.J;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((t61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                v61 v61Var = (v61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(v61Var.f33474c);
                String sb3 = sb2.toString();
                TLRPC.Document document = v61Var.f33477g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                f2.d1 d1Var2 = new f2.d1(v61Var.d, str4, sb3);
                d1Var2.f6295g = str2;
                d1Var2.h = str3;
                int i12 = v61Var.f33478i;
                int i13 = v61Var.f33479j;
                d1Var2.f6290a = i12;
                d1Var2.f6291b = i13;
                arrayList.add(new ze.f(d1Var2));
                arrayList2 = arrayList4;
            }
        }
        return new ze.g(arrayList);
    }

    public final TLRPC.Document n() {
        ArrayList arrayList;
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.q0();
            j3.t0 t0Var = k0Var.P;
            if (t0Var != null && t0Var.f10805w != 0 && (arrayList = this.J) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((t61) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        v61 v61Var = (v61) obj2;
                        if (v61Var.f33474c == t0Var.f10805w) {
                            return v61Var.f33477g;
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
        long j10 = this.f34633c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.D();
        }
        return 0L;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerError(j3.v1 v1Var) {
        AndroidUtilities.runOnUIThread(new ii0(25, this, v1Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            boolean h = k0Var.h();
            int b10 = this.d.b();
            if (this.I != h || this.H != b10) {
                this.F.onStateChanged(h, b10);
                this.I = h;
                this.H = b10;
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
            q61 q61Var = this.G;
            if (q61Var != null) {
                q61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
        this.f34633c0 = -9223372036854775807L;
        this.f34631b0 = -9223372036854775807L;
        u61 u61Var = this.F;
        if (u61Var != null) {
            u61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(k3.a aVar) {
        u61 u61Var = this.F;
        if (u61Var != null) {
            u61Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTracksChanged(j3.t2 t2Var) {
        org.telegram.ui.gq0 gq0Var = this.f34634d0;
        if (gq0Var != null) {
            AndroidUtilities.runOnUIThread(gq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(g5.y yVar) {
        this.F.onVideoSizeChanged(yVar.f7106a, yVar.f7107b, yVar.f7108c, yVar.d);
    }

    public final int p() {
        if (this.Z == -1) {
            try {
                if (this.Y) {
                    for (int i10 = 0; i10 < u(); i10++) {
                        if (v(i10).f32883a) {
                            return i10;
                        }
                    }
                }
                j3.k0 k0Var = this.d;
                if (k0Var != null) {
                    k0Var.q0();
                    j3.t0 t0Var = k0Var.P;
                    if (t0Var != null) {
                        for (int i11 = 0; i11 < u(); i11++) {
                            t61 v = v(i11);
                            if (!v.f32883a && t0Var.G == v.f32884b && t0Var.H == v.f32885c && t0Var.f10802n == ((int) Math.floor(((v61) v.d.get(0)).f33481l * 8.0d))) {
                                return i11;
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
        long j10 = this.f34631b0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            return k0Var.getDuration();
        }
        return 0L;
    }

    public final nh.n7 r(nh.n7 n7Var) {
        nh.n7 n7Var2 = n7Var;
        if (n7Var == null) {
            n7Var2 = new Object();
        }
        try {
            j3.k0 k0Var = this.d;
            k0Var.q0();
            MediaFormat mediaFormat = ((a4.t) k0Var.f10578g[0]).K;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    n7Var2.f18193b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    n7Var2.f18192a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return n7Var2;
    }

    public final t61 s(Boolean bool) {
        t61 t61Var = null;
        for (int i10 = 0; i10 < u(); i10++) {
            t61 v = v(i10);
            if (v.f32883a == bool.booleanValue() && (t61Var == null || t61Var.f32884b * t61Var.f32885c < v.f32884b * v.f32885c)) {
                t61Var = v;
            }
        }
        return t61Var;
    }

    public final int u() {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final t61 v(int i10) {
        ArrayList arrayList = this.J;
        if (arrayList == null) {
            return s(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (t61) this.J.get(i10);
        }
        return s(Boolean.FALSE);
    }

    public final boolean y() {
        j3.k0 k0Var = this.d;
        if (k0Var != null) {
            k0Var.q0();
            if (k0Var.f10568a0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean z() {
        if (!this.f34642x || !this.E) {
            j3.k0 k0Var = this.d;
            if (k0Var != null && k0Var.h()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public x61(boolean z10, boolean z11) {
        int i10 = f34625f0;
        f34625f0 = i10 + 1;
        this.f34628a = i10;
        this.W = new Handler(Looper.getMainLooper());
        this.Y = false;
        this.Z = -1;
        this.f34631b0 = -9223372036854775807L;
        this.f34633c0 = -9223372036854775807L;
        this.f34636e0 = new ArrayList();
        this.X = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        d5.p pVar = new d5.p(ApplicationLoader.applicationContext, new ab.b(5));
        this.f34637f = pVar;
        if (z11) {
            d5.h e10 = pVar.e();
            e10.getClass();
            d5.g gVar = new d5.g(e10);
            gVar.f5405z.add(1);
            pVar.j(new d5.h(gVar));
        }
        this.H = 1;
        this.S = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(t4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(j3.b2 b2Var, j3.b2 b2Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.F.onRenderedFirstFrame();
    }

    @Override
    public final void a(j3.v1 v1Var) {
    }

    @Override
    public final void d(g5.y yVar) {
    }

    @Override
    public final void e(int i10) {
    }

    @Override
    public final void f(m3.f fVar) {
    }

    @Override
    public final void h(l4.x xVar) {
    }

    @Override
    public final void onAudioAttributesChanged(l3.e eVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(j3.y1 y1Var) {
    }

    @Override
    public final void onDeviceInfoChanged(j3.m mVar) {
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
    public final void onMediaMetadataChanged(j3.h1 h1Var) {
    }

    @Override
    public final void onMetadata(b4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(j3.x1 x1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(j3.v1 v1Var) {
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
    public final void onVolumeChanged(float f9) {
    }

    @Override
    public final void b(k3.a aVar, l4.x xVar) {
    }

    @Override
    public final void g(j3.c2 c2Var, g9.l lVar) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i10, boolean z10) {
    }

    @Override
    public final void onEvents(j3.c2 c2Var, j3.z1 z1Var) {
    }

    @Override
    public final void onMediaItemTransition(j3.f1 f1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(j3.r2 r2Var, int i10) {
    }

    @Override
    public final void i(int i10, long j10, k3.a aVar) {
    }
}
