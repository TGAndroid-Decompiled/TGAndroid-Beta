package org.telegram.ui.Components;

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
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
public class i71 implements j3.y1, i5.t, k3.b, NotificationCenter.NotificationCenterDelegate {
    public static int f25617g0;
    public static final HashSet f25618h0 = new HashSet();
    public static HashMap f25619i0;
    public boolean B;
    public Uri C;
    public boolean D;
    public boolean E;
    public boolean F;
    public f71 G;
    public b71 H;
    public int I;
    public boolean J;
    public ArrayList K;
    public e71 L;
    public ArrayList M;
    public Uri N;
    public Uri O;
    public String P;
    public String Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public DashMediaSource$Factory U;
    public HlsMediaSource$Factory V;
    public a4.k W;
    public final Handler X;
    public final boolean Y;
    public boolean Z;
    public final int f25620a;
    public int f25621a0;
    public DispatchQueue f25622b;
    public boolean f25623b0;
    public boolean f25624c;
    public long f25625c0;
    public j3.f0 d;
    public long f25626d0;
    public j3.i2 e;
    public org.telegram.ui.tq0 f25627e0;
    public final f5.p f25628f;
    public final ArrayList f25629f0;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView f25630n;
    public SurfaceView f25631r;
    public Surface f25632s;
    public boolean v;
    public boolean f25633w;
    public boolean f25634x;
    public boolean f25635y;

    public i71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z4) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z4).apply();
    }

    public static void J(e71 e71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (e71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(e71Var.f24504b);
            sb.append("x");
            sb.append(e71Var.f24505c);
            if (e71Var.f24503a) {
                str = "s";
            } else {
                str = "";
            }
            sb.append(str);
            edit.putString(str2, sb.toString());
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f25619i0 == null) {
                f25619i0 = new HashMap();
            }
            Boolean bool = (Boolean) f25619i0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && d4.y.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f25619i0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f25619i0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static g71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((e71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                g71 g71Var = (g71) obj2;
                if (g71Var.b()) {
                    return g71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z4) {
        e71 e71Var;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    g71 d = g71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f19165id), i11, z4);
                    if (d.f25079i > 0 && d.f25080j > 0) {
                        if (document3 == document) {
                            d.f25075b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            g71 g71Var = (g71) arrayList3.get(i14);
            String str2 = g71Var.f25083m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(g71Var.f25083m) && !"hevc".equals(g71Var.f25083m) && !"h265".equals(g71Var.f25083m) && !"vp9".equals(g71Var.f25083m)) || Y(g71Var.f25083m))) {
                arrayList4.add(g71Var);
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
            g71 g71Var2 = (g71) obj;
            if (g71Var2.f25075b) {
                arrayList6.add(new e71(g71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        e71Var = (e71) obj2;
                        if (!e71Var.f24503a && e71Var.f24504b == g71Var2.f25079i && e71Var.f24505c == g71Var2.f25080j) {
                            break;
                        }
                    } else {
                        e71Var = null;
                        break;
                    }
                }
                if (e71Var != null && !SharedConfig.debugVideoQualities) {
                    e71Var.d.add(g71Var2);
                } else {
                    arrayList6.add(new e71(g71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static g71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((e71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                g71 g71Var = (g71) obj2;
                if (g71Var.f25075b && g71Var.b()) {
                    return g71Var;
                }
            }
        }
        int size3 = arrayList.size();
        g71 g71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((e71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                g71 g71Var3 = (g71) obj4;
                if (!g71Var3.f25075b && Y(g71Var3.f25083m) && (g71Var2 == null || (i10 = g71Var3.f25079i * g71Var3.f25080j) > (i11 = g71Var2.f25079i * g71Var2.f25080j) || (i10 == i11 && g71Var3.f25082l < g71Var2.f25082l))) {
                    g71Var2 = g71Var3;
                }
            }
        }
        if (g71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((e71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    g71 g71Var4 = (g71) obj6;
                    if (g71Var2 == null || g71Var2.f25079i * g71Var2.f25080j > g71Var4.f25079i * g71Var4.f25080j || g71Var4.f25082l < g71Var2.f25082l) {
                        g71Var2 = g71Var4;
                    }
                }
            }
        }
        return g71Var2;
    }

    public static g71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((e71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                g71 g71Var = (g71) obj2;
                if (g71Var.b()) {
                    return g71Var;
                }
            }
        }
        int size3 = arrayList.size();
        g71 g71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((e71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                g71 g71Var3 = (g71) obj4;
                if (!g71Var3.f25075b && (g71Var2 == null || g71Var2.f25079i * g71Var2.f25080j > g71Var3.f25079i * g71Var3.f25080j || g71Var3.f25082l < g71Var2.f25082l)) {
                    if (g71Var3.f25079i <= 900 && g71Var3.f25080j <= 900) {
                        g71Var2 = g71Var3;
                    }
                }
            }
        }
        if (g71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((e71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    g71 g71Var4 = (g71) obj6;
                    if (g71Var2 == null || g71Var2.f25079i * g71Var2.f25080j > g71Var4.f25079i * g71Var4.f25080j || g71Var4.f25082l < g71Var2.f25082l) {
                        g71Var2 = g71Var4;
                    }
                }
            }
        }
        return g71Var2;
    }

    public final o4.a A(Uri uri, String str, long j10) {
        boolean z4;
        o3.p pVar;
        j3.y0 y0Var;
        g5.o0 o0Var;
        o3.p pVar2;
        j3.w0 w0Var;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        j3.s0 s0Var = new j3.s0();
        j3.v0 v0Var = new j3.v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.e;
        j3.z0 z0Var = j3.z0.f8878c;
        if (v0Var.f8834b != null && v0Var.f8833a == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        if (uri != null) {
            if (v0Var.f8833a != null) {
                w0Var = new j3.w0(v0Var);
            } else {
                w0Var = null;
            }
            pVar = null;
            y0Var = new j3.y0(uri, null, w0Var, null, list, null, i0Var, null);
        } else {
            pVar = null;
            y0Var = null;
        }
        j3.c1 c1Var = new j3.c1("", new j3.t0(s0Var), y0Var, new j3.x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.e1.V, z0Var);
        if (j10 != 0) {
            f3.e eVar = new f3.e(this, j10, 6);
            lh.m5 m5Var = new lh.m5(new Object(), 14);
            Object obj = new Object();
            z9.d dVar = new z9.d(6);
            y0Var.getClass();
            c1Var.f8431b.getClass();
            j3.w0 w0Var2 = c1Var.f8431b.f8873c;
            if (w0Var2 != null && h5.d0.f6924a >= 18) {
                synchronized (obj) {
                    try {
                        if (!w0Var2.equals(pVar)) {
                            pVar2 = l7.w0.n(w0Var2);
                        } else {
                            pVar2 = pVar;
                        }
                        pVar2.getClass();
                    } finally {
                    }
                }
            } else {
                pVar2 = o3.p.f16258p;
            }
            return new o4.f0(c1Var, eVar, m5Var, pVar2, dVar, 1048576);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.W == null) {
                    this.W = new a4.k(extendedDefaultDataSourceFactory, (r3.i) new Object());
                }
                a4.k kVar = this.W;
                kVar.getClass();
                y0Var.getClass();
                return new o4.f0(c1Var, (g5.l) kVar.f85b, (lh.m5) kVar.f86c, ((l7.w0) kVar.d).r(c1Var), (z9.d) kVar.e, kVar.f84a);
            }
            if (this.U == null) {
                this.U = new DashMediaSource$Factory(extendedDefaultDataSourceFactory);
            }
            DashMediaSource$Factory dashMediaSource$Factory = this.U;
            dashMediaSource$Factory.getClass();
            j3.y0 y0Var2 = c1Var.f8431b;
            y0Var2.getClass();
            g5.o0 eVar2 = new s4.e();
            List list2 = y0Var2.e;
            if (!list2.isEmpty()) {
                o0Var = new f7.b(29, eVar2, list2);
            } else {
                o0Var = eVar2;
            }
            return new r4.g(c1Var, dashMediaSource$Factory.f2620b, o0Var, dashMediaSource$Factory.f2619a, dashMediaSource$Factory.d, dashMediaSource$Factory.f2621c.r(c1Var), dashMediaSource$Factory.e, dashMediaSource$Factory.f2622f, dashMediaSource$Factory.f2623g);
        }
        if (this.V == null) {
            this.V = new HlsMediaSource$Factory(extendedDefaultDataSourceFactory);
        }
        HlsMediaSource$Factory hlsMediaSource$Factory = this.V;
        o3.c cVar = hlsMediaSource$Factory.f2624a;
        j3.y0 y0Var3 = c1Var.f8431b;
        y0Var3.getClass();
        u4.p pVar3 = hlsMediaSource$Factory.f2626c;
        List list3 = y0Var3.e;
        if (!list3.isEmpty()) {
            pVar3 = new q5.c0(10, pVar3, list3);
        }
        t4.c cVar2 = hlsMediaSource$Factory.f2625b;
        h7.u uVar = hlsMediaSource$Factory.e;
        o3.p r10 = hlsMediaSource$Factory.f2627f.r(c1Var);
        z9.d dVar2 = hlsMediaSource$Factory.f2628g;
        hlsMediaSource$Factory.d.getClass();
        return new t4.m(c1Var, cVar, cVar2, uVar, r10, dVar2, new u4.c(cVar, dVar2, pVar3), hlsMediaSource$Factory.f2630j, hlsMediaSource$Factory.h, hlsMediaSource$Factory.f2629i);
    }

    public void B() {
        this.F = false;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.p(false);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.p(false);
        }
        if (this.H != null) {
            this.X.removeCallbacksAndMessages(null);
            this.H.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.F = true;
        if (this.f25634x && (!this.E || !this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(false);
            }
            j3.i2 i2Var = this.e;
            if (i2Var != null) {
                i2Var.p(false);
                return;
            }
            return;
        }
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(true);
        }
        j3.i2 i2Var2 = this.e;
        if (i2Var2 != null) {
            i2Var2.p(true);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j10) {
        String str2 = null;
        this.K = null;
        this.L = null;
        this.N = uri;
        this.P = str;
        this.O = null;
        this.Q = null;
        boolean z4 = false;
        this.R = false;
        this.Z = false;
        this.f25623b0 = false;
        this.D = false;
        this.f25634x = false;
        this.C = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z4 = true;
        }
        this.v = z4;
        i();
        this.d.X(A(uri, str, j10), true);
        this.d.b();
    }

    public final void F(ArrayList arrayList, e71 e71Var) {
        int i10;
        ArrayList arrayList2;
        this.K = arrayList;
        this.L = e71Var;
        this.N = null;
        this.P = "hls";
        this.O = null;
        this.Q = null;
        this.R = false;
        this.Z = false;
        this.D = false;
        this.f25634x = false;
        this.C = null;
        this.v = true;
        i();
        this.f25623b0 = false;
        if (e71Var != null && (arrayList2 = this.K) != null) {
            i10 = arrayList2.indexOf(e71Var);
        } else {
            i10 = -1;
        }
        this.f25621a0 = i10;
        R(true, e71Var);
        if (this.Z) {
            this.f25621a0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        o4.m mVar = null;
        this.K = null;
        this.L = null;
        this.N = uri;
        this.O = uri2;
        this.P = str;
        this.Q = str2;
        this.R = true;
        this.f25623b0 = false;
        this.f25634x = true;
        this.E = false;
        this.D = false;
        i();
        o4.m mVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            o4.m mVar3 = new o4.m(A(uri3, str3, 0L));
            if (i10 == 0) {
                mVar = mVar3;
            } else {
                mVar2 = mVar3;
            }
        }
        this.d.X(mVar, true);
        this.d.b();
        j3.i2 i2Var = this.e;
        i2Var.L();
        i2Var.f8609b.X(mVar2, true);
        this.e.b();
        f25618h0.add(Integer.valueOf(this.f25620a));
    }

    public final void H() {
        f25618h0.remove(Integer.valueOf(this.f25620a));
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.J();
            this.d = null;
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.J();
            this.e = null;
        }
        if (this.T) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j10) {
        L(j10, false);
    }

    public final void L(long j10, boolean z4) {
        j3.h2 h2Var;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (z4) {
                h2Var = j3.h2.d;
            } else {
                h2Var = j3.h2.f8591c;
            }
            f0Var.Y(h2Var);
            j3.f0 f0Var2 = this.d;
            f0Var2.K(f0Var2.x(), 5, j10);
        }
    }

    public final void M(long j10, boolean z4, Runnable runnable) {
        j3.h2 h2Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f25629f0.add(runnable);
            }
            j3.f0 f0Var = this.d;
            if (z4) {
                h2Var = j3.h2.d;
            } else {
                h2Var = j3.h2.f8591c;
            }
            f0Var.Y(h2Var);
            j3.f0 f0Var2 = this.d;
            f0Var2.K(f0Var2.x(), 5, j10);
        }
    }

    public final void N(boolean z4) {
        int i10;
        if (this.S != z4) {
            this.S = z4;
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                if (z4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                f0Var.e(i10);
            }
        }
    }

    public final void O(boolean z4) {
        float f10;
        j3.f0 f0Var = this.d;
        float f11 = 1.0f;
        if (f0Var != null) {
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            f0Var.d0(f10);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            if (z4) {
                f11 = 0.0f;
            }
            i2Var.M(f11);
        }
    }

    public void P(boolean z4) {
        this.F = z4;
        if (z4 && this.f25634x && (!this.E || !this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(false);
            }
            j3.i2 i2Var = this.e;
            if (i2Var != null) {
                i2Var.p(false);
                return;
            }
            return;
        }
        this.f25633w = z4;
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(z4);
        }
        j3.i2 i2Var2 = this.e;
        if (i2Var2 != null) {
            i2Var2.p(z4);
        }
    }

    public void Q(float f10) {
        try {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                f0Var.a(new j3.v1(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.e71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i71.R(boolean, org.telegram.ui.Components.e71):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            f0Var.W(new l3.d(0, 0, i12, 1, 0), false);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            l3.d dVar = new l3.d(0, 0, i11, 1, 0);
            i2Var.L();
            i2Var.f8609b.W(dVar, true);
        }
    }

    public final void T(Surface surface) {
        if (this.f25632s != surface) {
            this.f25632s = surface;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.a0(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f25631r != surfaceView) {
            this.f25631r = surfaceView;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.b0(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f25630n != textureView) {
            this.f25630n = textureView;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.c0(textureView);
        }
    }

    public final void W(float f10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.d0(f10);
        }
        j3.i2 i2Var = this.e;
        if (i2Var != null) {
            i2Var.M(f10);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f25622b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.f8534i0 = new org.telegram.messenger.c1(dispatchQueue);
            return;
        }
        this.d.f8534i0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((i71) objArr[0]) != this && y() && !this.f25635y) {
            B();
        }
    }

    @Override
    public final void h(k3.a aVar, int i10) {
        if (i10 == 1) {
            f71 f71Var = this.G;
            if (f71Var != null) {
                f71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f25629f0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void i() {
        int i10;
        j3.l lVar;
        g5.q qVar = new g5.q();
        boolean z4 = this.f25624c;
        int i11 = 1000;
        if (z4) {
            i10 = 1000;
        } else {
            i10 = 100;
        }
        if (!z4) {
            i11 = 5000;
        }
        int i12 = 0;
        j3.j.a(i10, 0, "bufferForPlaybackMs", "0");
        j3.j.a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j3.j.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        j3.j.a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j3.j.a(50000, 50000, "maxBufferMs", "minBufferMs");
        j3.j.a(0, 0, "backBufferDurationMs", "0");
        j3.j jVar = new j3.j(qVar, i10, i11);
        if (this.d == null) {
            if (this.H != null) {
                lVar = new c71(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new j3.l(ApplicationLoader.applicationContext);
            }
            lVar.f8646c = 2;
            j3.p pVar = new j3.p(ApplicationLoader.applicationContext);
            h5.a.i(!pVar.f8764s);
            pVar.f8751c = new gg.f(lVar, 8);
            f5.p pVar2 = this.f25628f;
            h5.a.i(!pVar.f8764s);
            pVar2.getClass();
            pVar.e = new gg.f(pVar2, 7);
            h5.a.i(!pVar.f8764s);
            pVar.f8752f = new gg.f(jVar, 6);
            h5.a.i(!pVar.f8764s);
            pVar.f8764s = true;
            j3.f0 f0Var = new j3.f0(pVar, null);
            this.d = f0Var;
            k3.f fVar = f0Var.f8543q;
            fVar.getClass();
            fVar.f9690f.a(this);
            this.d.f8538l.a(this);
            this.d.f8536j0.add(this);
            TextureView textureView = this.f25630n;
            if (textureView != null) {
                this.d.c0(textureView);
            } else {
                Surface surface = this.f25632s;
                if (surface != null) {
                    this.d.a0(surface);
                } else {
                    SurfaceView surfaceView = this.f25631r;
                    if (surfaceView != null) {
                        this.d.b0(surfaceView);
                    }
                }
            }
            this.d.p(this.f25633w);
            j3.f0 f0Var2 = this.d;
            if (this.S) {
                i12 = 2;
            }
            f0Var2.e(i12);
        }
        if (this.f25634x && this.e == null) {
            j3.p pVar3 = new j3.p(ApplicationLoader.applicationContext);
            f5.p pVar4 = this.f25628f;
            h5.a.i(!pVar3.f8764s);
            pVar4.getClass();
            pVar3.e = new gg.f(pVar4, 7);
            h5.a.i(!pVar3.f8764s);
            pVar3.f8752f = new gg.f(jVar, 6);
            h5.a.i(!pVar3.f8764s);
            pVar3.f8764s = true;
            j3.i2 i2Var = new j3.i2(pVar3);
            this.e = i2Var;
            i2Var.n(new a71(this));
            this.e.p(this.f25633w);
        }
    }

    public final long j() {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.v) {
                return f0Var.s();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final af.j l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.K == null) {
            if (this.N == null) {
                return null;
            }
            String e = vh.w2.e("/mtproto_", str);
            String queryParameter = this.N.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            af.h hVar = new af.h(this.N, str5, e);
            hVar.e = str2;
            hVar.f176f = str3;
            return new af.j(new af.i(hVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.K;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((e71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                g71 g71Var = (g71) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb.append(g71Var.f25076c);
                String sb2 = sb.toString();
                TLRPC.Document document = g71Var.f25078g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                af.h hVar2 = new af.h(g71Var.d, str4, sb2);
                hVar2.e = str2;
                hVar2.f176f = str3;
                int i12 = g71Var.f25079i;
                int i13 = g71Var.f25080j;
                hVar2.f173a = i12;
                hVar2.f174b = i13;
                arrayList.add(new af.i(hVar2));
                arrayList2 = arrayList4;
            }
        }
        return new af.j(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.j0();
            j3.n0 n0Var = f0Var.N;
            if (n0Var != null && n0Var.f8724w != 0 && (arrayList = this.K) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((e71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        g71 g71Var = (g71) obj2;
                        if (g71Var.f25076c == n0Var.f8724w) {
                            return g71Var.f25078g;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long n() {
        long j10 = this.f25626d0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.C();
        }
        return 0L;
    }

    public final int o() {
        if (this.f25621a0 == -1) {
            try {
                if (this.Z) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f24503a) {
                            return i10;
                        }
                    }
                }
                j3.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.j0();
                    j3.n0 n0Var = f0Var.N;
                    if (n0Var != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            e71 u10 = u(i11);
                            if (!u10.f24503a && n0Var.H == u10.f24504b && n0Var.I == u10.f24505c && n0Var.f8721n == ((int) Math.floor(((g71) u10.d.get(0)).f25082l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
        return this.f25621a0;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerError(j3.t1 t1Var) {
        AndroidUtilities.runOnUIThread(new k41(3, this, t1Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z4, int i10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean j10 = f0Var.j();
            int c3 = this.d.c();
            if (this.J != j10 || this.I != c3) {
                this.G.onStateChanged(j10, c3);
                this.J = j10;
                this.I = c3;
            }
        }
        if (z4 && i10 == 3 && !x() && this.T) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.D && i10 == 3) {
            this.D = true;
            if (this.E && this.F) {
                C();
            }
        }
        if (i10 != 3) {
            this.X.removeCallbacksAndMessages(null);
            b71 b71Var = this.H;
            if (b71Var != null) {
                b71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
        this.f25626d0 = -9223372036854775807L;
        this.f25625c0 = -9223372036854775807L;
        f71 f71Var = this.G;
        if (f71Var != null) {
            f71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(k3.a aVar) {
        f71 f71Var = this.G;
        if (f71Var != null) {
            f71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTracksChanged(j3.q2 q2Var) {
        org.telegram.ui.tq0 tq0Var = this.f25627e0;
        if (tq0Var != null) {
            AndroidUtilities.runOnUIThread(tq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(i5.y yVar) {
        if (!Objects.equals(yVar, i5.y.e)) {
            this.G.onVideoSizeChanged(yVar.f7324a, yVar.f7325b, yVar.f7326c, yVar.d);
        }
    }

    public final long p() {
        long j10 = this.f25625c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final ph.s6 q(ph.s6 s6Var) {
        ph.s6 s6Var2 = s6Var;
        if (s6Var == null) {
            s6Var2 = new Object();
        }
        try {
            j3.f0 f0Var = this.d;
            f0Var.j0();
            MediaFormat mediaFormat = ((d4.r) f0Var.f8530g[0]).X;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    s6Var2.f42374b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    s6Var2.f42373a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return s6Var2;
    }

    public final e71 r(Boolean bool) {
        e71 e71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            e71 u10 = u(i10);
            if (u10.f24503a == bool.booleanValue() && (e71Var == null || e71Var.f24504b * e71Var.f24505c < u10.f24504b * u10.f24505c)) {
                e71Var = u10;
            }
        }
        return e71Var;
    }

    public final int t() {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final e71 u(int i10) {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (e71) this.K.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.j0();
            if (f0Var.Y == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f25634x || !this.F) {
            j3.f0 f0Var = this.d;
            if (f0Var != null && f0Var.j()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Uri z(ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.M = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((e71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                g71 g71Var = (g71) obj2;
                long j10 = g71Var.f25076c;
                Uri uri = g71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(g71Var.e, g71Var.f25077f);
                if (g71Var.f25077f != null) {
                    this.M.add(g71Var);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(g71Var.f25082l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(g71Var.f25079i);
                    sb2.append("x");
                    sb2.append(g71Var.f25080j);
                    String str2 = g71Var.f25083m;
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
                        sb2.append(",MIME=\"");
                        sb2.append(str);
                        sb2.append("\"");
                    }
                    if (g71Var.b() && g71Var.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(g71Var.f25076c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(g71Var.f25074a);
                    sb2.append("\"\n");
                    if (g71Var.c()) {
                        sb2.append(g71Var.f25077f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(g71Var.e);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z4 = true;
                }
            }
        }
        if (!z4) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    public i71(boolean z4, boolean z10) {
        int i10 = f25617g0;
        f25617g0 = i10 + 1;
        this.f25620a = i10;
        this.X = new Handler(Looper.getMainLooper());
        this.Z = false;
        this.f25621a0 = -1;
        this.f25625c0 = -9223372036854775807L;
        this.f25626d0 = -9223372036854775807L;
        this.f25629f0 = new ArrayList();
        this.Y = z10;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        f5.p pVar = new f5.p(ApplicationLoader.applicationContext, new cb.b(6));
        this.f25628f = pVar;
        if (z10) {
            f5.h e = pVar.e();
            e.getClass();
            f5.g gVar = new f5.g(e);
            gVar.f5978z.add(1);
            pVar.k(new f5.h(gVar));
        }
        this.I = 1;
        this.T = z4;
        if (z4) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(v4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.G.onRenderedFirstFrame();
    }

    @Override
    public final void b(j3.t1 t1Var) {
    }

    @Override
    public final void d(n3.f fVar) {
    }

    @Override
    public final void f(o4.r rVar) {
    }

    @Override
    public final void g(i5.y yVar) {
    }

    @Override
    public final void onAudioAttributesChanged(l3.d dVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(j3.w1 w1Var) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z4) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z4) {
    }

    @Override
    public final void onLoadingChanged(boolean z4) {
    }

    @Override
    public final void onMediaMetadataChanged(j3.e1 e1Var) {
    }

    @Override
    public final void onMetadata(e4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(j3.v1 v1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(j3.t1 t1Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void a(j3.a2 a2Var, f7.b bVar) {
    }

    @Override
    public final void c(k3.a aVar, o4.r rVar) {
    }

    @Override
    public final void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
    }

    @Override
    public final void onMediaItemTransition(j3.c1 c1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(j3.o2 o2Var, int i10) {
    }

    @Override
    public final void e(k3.a aVar, int i10, long j10) {
    }
}
