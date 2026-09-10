package org.telegram.ui.Components;

import a5.a;
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
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import b2.k0;
import b2.p;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l2.h;
import l2.i;
import m.e3;
import m2.e;
import n2.n;
import o2.c;
import o2.l;
import og.u0;
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
import org.telegram.ui.js0;
import p2.s;
import t7.u;
import u2.f0;
public class t71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f27358j0;
    public static final HashSet f27359k0 = new HashSet();
    public static HashMap f27360l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public q71 J;
    public m71 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public p71 O;
    public ArrayList P;
    public Uri Q;
    public Uri R;
    public String S;
    public String T;
    public boolean U;
    public boolean V;
    public final boolean W;
    public DashMediaSource$Factory X;
    public HlsMediaSource$Factory Y;
    public u2.x0 Z;
    public final int f27361a;
    public final Handler f27362a0;
    public DispatchQueue f27363b;
    public final boolean f27364b0;
    public boolean f27365c;
    public boolean f27366c0;
    public i2.e0 d;
    public int f27367d0;
    public i2.e0 e;
    public boolean f27368e0;
    public final x2.p f27369f;
    public long f27370f0;
    public long f27371g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.ir0 f27372h0;
    public final ArrayList f27373i0;
    public TextureView f27374n;
    public SurfaceView f27375r;
    public Surface f27376s;
    public boolean v;
    public boolean f27377w;
    public boolean f27378x;
    public boolean f27379y;

    public t71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(p71 p71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (p71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p71Var.f26053b);
            sb2.append("x");
            sb2.append(p71Var.f26054c);
            if (p71Var.f26052a) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f27360l0 == null) {
                f27360l0 = new HashMap();
            }
            Boolean bool = (Boolean) f27360l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && r2.w.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f27360l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f27360l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static r71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                if (r71Var.b()) {
                    return r71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        p71 p71Var;
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
                    r71 d = r71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f17201id), i11, z10);
                    if (d.f26621i > 0 && d.f26622j > 0) {
                        if (document3 == document) {
                            d.f26617b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            r71 r71Var = (r71) arrayList3.get(i14);
            String str2 = r71Var.f26625m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(r71Var.f26625m) && !"hevc".equals(r71Var.f26625m) && !"h265".equals(r71Var.f26625m) && !"vp9".equals(r71Var.f26625m)) || Y(r71Var.f26625m))) {
                arrayList4.add(r71Var);
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
            r71 r71Var2 = (r71) obj;
            if (r71Var2.f26617b) {
                arrayList6.add(new p71(r71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        p71Var = (p71) obj2;
                        if (!p71Var.f26052a && p71Var.f26053b == r71Var2.f26621i && p71Var.f26054c == r71Var2.f26622j) {
                            break;
                        }
                    } else {
                        p71Var = null;
                        break;
                    }
                }
                if (p71Var != null && !SharedConfig.debugVideoQualities) {
                    p71Var.d.add(r71Var2);
                } else {
                    arrayList6.add(new p71(r71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static r71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                r71 r71Var = (r71) obj2;
                if (r71Var.f26617b && r71Var.b()) {
                    return r71Var;
                }
            }
        }
        int size3 = arrayList.size();
        r71 r71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((p71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                r71 r71Var3 = (r71) obj4;
                if (!r71Var3.f26617b && Y(r71Var3.f26625m) && (r71Var2 == null || (i10 = r71Var3.f26621i * r71Var3.f26622j) > (i11 = r71Var2.f26621i * r71Var2.f26622j) || (i10 == i11 && r71Var3.f26624l < r71Var2.f26624l))) {
                    r71Var2 = r71Var3;
                }
            }
        }
        if (r71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((p71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    r71 r71Var4 = (r71) obj6;
                    if (r71Var2 == null || r71Var2.f26621i * r71Var2.f26622j > r71Var4.f26621i * r71Var4.f26622j || r71Var4.f26624l < r71Var2.f26624l) {
                        r71Var2 = r71Var4;
                    }
                }
            }
        }
        return r71Var2;
    }

    public static r71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                if (r71Var.b()) {
                    return r71Var;
                }
            }
        }
        int size3 = arrayList.size();
        r71 r71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((p71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                r71 r71Var3 = (r71) obj4;
                if (!r71Var3.f26617b && (r71Var2 == null || r71Var2.f26621i * r71Var2.f26622j > r71Var3.f26621i * r71Var3.f26622j || r71Var3.f26624l < r71Var2.f26624l)) {
                    if (r71Var3.f26621i <= 900 && r71Var3.f26622j <= 900) {
                        r71Var2 = r71Var3;
                    }
                }
            }
        }
        if (r71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((p71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    r71 r71Var4 = (r71) obj6;
                    if (r71Var2 == null || r71Var2.f26621i * r71Var2.f26622j > r71Var4.f26621i * r71Var4.f26622j || r71Var4.f26624l < r71Var2.f26624l) {
                        r71Var2 = r71Var4;
                    }
                }
            }
        }
        return r71Var2;
    }

    public final u2.a A(Uri uri, String str, long j3) {
        boolean z10;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory;
        b2.d0 d0Var;
        int i10;
        b2.f0 f0Var;
        n2.n nVar;
        n2.n nVar2;
        b2.c0 c0Var;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory2 = this.h;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        if (b0Var.f1632b != null && b0Var.f1631a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f1631a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            d0Var = d0Var2;
            i10 = 1;
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            d0Var = d0Var2;
            i10 = 1;
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0("", new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        if (j3 != 0) {
            bi.za zaVar = new bi.za(this, j3, 6);
            th.e eVar = new th.e(new c3.m(), i10);
            Object obj = new Object();
            rb.a aVar = new rb.a(26);
            f0Var.getClass();
            k0Var.f1771b.getClass();
            b2.c0 c0Var2 = k0Var.f1771b.f1688c;
            if (c0Var2 == null) {
                nVar2 = n2.n.f13739z;
            } else {
                synchronized (obj) {
                    try {
                        if (!c0Var2.equals(null)) {
                            nVar = m.e3.x(c0Var2);
                        } else {
                            nVar = null;
                        }
                        nVar.getClass();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                nVar2 = nVar;
            }
            return new u2.y0(k0Var, zaVar, eVar, nVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.x0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(k0Var);
            }
            final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory3 = extendedDefaultDataSourceFactory;
            if (this.X == null) {
                this.X = new u2.f0(extendedDefaultDataSourceFactory3) {
                    public final a f1359a;
                    public final g f1360b;
                    public final e3 f1361c;
                    public final ob.a d;
                    public final rb.a e;
                    public final long f1362f;
                    public final long f1363g;

                    {
                        a aVar2 = new a(extendedDefaultDataSourceFactory3);
                        this.f1359a = aVar2;
                        this.f1360b = extendedDefaultDataSourceFactory3;
                        this.f1361c = new e3(4);
                        this.e = new rb.a(26);
                        this.f1362f = 30000L;
                        this.f1363g = 5000000L;
                        this.d = new ob.a(23);
                        ((p) aVar2.d).f1869b = true;
                    }

                    @Override
                    public final u2.a a(k0 k0Var2) {
                        y2.p pVar;
                        k0Var2.f1771b.getClass();
                        e eVar2 = new e();
                        List list2 = k0Var2.f1771b.e;
                        if (!list2.isEmpty()) {
                            pVar = new u0(16, eVar2, list2);
                        } else {
                            pVar = eVar2;
                        }
                        return new i(k0Var2, this.f1360b, pVar, this.f1359a, this.d, this.f1361c.z(k0Var2), this.e, this.f1362f, this.f1363g);
                    }

                    @Override
                    public final f0 b(boolean z11) {
                        ((p) this.f1359a.d).f1869b = z11;
                        return this;
                    }

                    @Override
                    public final f0 c() {
                        ((p) this.f1359a.d).getClass();
                        return this;
                    }

                    @Override
                    public final f0 d(rb.a aVar2) {
                        p pVar = (p) this.f1359a.d;
                        pVar.getClass();
                        pVar.f1870c = aVar2;
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory4 = extendedDefaultDataSourceFactory;
        if (this.Y == null) {
            this.Y = new u2.f0(extendedDefaultDataSourceFactory4) {
                public final h f1364a;
                public c f1365b;
                public rb.a f1366c;
                public final e3 h = new e3(4);
                public final u e = new Object();
                public final js0 f1367f = p2.c.E;
                public final rb.a f1369i = new rb.a(26);
                public final ob.a f1368g = new ob.a(23);
                public final int f1371k = 1;
                public final long f1372l = -9223372036854775807L;
                public final boolean f1370j = true;
                public boolean d = true;

                {
                    this.f1364a = new h(extendedDefaultDataSourceFactory4, 6);
                }

                @Override
                public final f0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 d(rb.a aVar2) {
                    this.f1366c = aVar2;
                    return this;
                }

                @Override
                public final l a(k0 k0Var2) {
                    k0Var2.f1771b.getClass();
                    if (this.f1365b == null) {
                        ?? obj2 = new Object();
                        obj2.f14150a = new rb.a(28);
                        this.f1365b = obj2;
                    }
                    rb.a aVar2 = this.f1366c;
                    if (aVar2 != null) {
                        this.f1365b.f14150a = aVar2;
                    }
                    c cVar = this.f1365b;
                    cVar.f14151b = this.d;
                    cVar.getClass();
                    List list2 = k0Var2.f1771b.e;
                    boolean isEmpty = list2.isEmpty();
                    s sVar = this.e;
                    if (!isEmpty) {
                        sVar = new u0(10, sVar, list2);
                    }
                    n z11 = this.h.z(k0Var2);
                    this.f1367f.getClass();
                    h hVar = this.f1364a;
                    rb.a aVar3 = this.f1369i;
                    return new l(k0Var2, hVar, cVar, this.f1368g, z11, aVar3, new p2.c(hVar, aVar3, sVar), this.f1372l, this.f1370j, this.f1371k);
                }

                @Override
                public final f0 c() {
                    return this;
                }
            };
        }
        return a(k0Var);
    }

    public void B() {
        this.I = false;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.X(false);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.X(false);
        }
        if (this.K != null) {
            this.f27362a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f27378x && (!this.H || !this.G)) {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.X(false);
            }
            i2.e0 e0Var2 = this.e;
            if (e0Var2 != null) {
                e0Var2.X(false);
                return;
            }
            return;
        }
        i2.e0 e0Var3 = this.d;
        if (e0Var3 != null) {
            e0Var3.X(true);
        }
        i2.e0 e0Var4 = this.e;
        if (e0Var4 != null) {
            e0Var4.X(true);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j3) {
        String str2 = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z10 = false;
        this.U = false;
        this.f27366c0 = false;
        this.f27368e0 = false;
        this.G = false;
        this.f27378x = false;
        this.F = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        i();
        this.d.q1(A(uri, str, j3), true);
        this.d.b();
    }

    public final void F(ArrayList arrayList, p71 p71Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = p71Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f27366c0 = false;
        this.G = false;
        this.f27378x = false;
        this.F = null;
        this.v = true;
        i();
        this.f27368e0 = false;
        if (p71Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(p71Var);
        } else {
            i10 = -1;
        }
        this.f27367d0 = i10;
        R(true, p71Var);
        if (this.f27366c0) {
            this.f27367d0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        u2.x xVar = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.R = uri2;
        this.S = str;
        this.T = str2;
        this.U = true;
        this.f27368e0 = false;
        this.f27378x = true;
        this.H = false;
        this.G = false;
        i();
        u2.x xVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.x xVar3 = new u2.x(A(uri3, str3, 0L));
            if (i10 == 0) {
                xVar = xVar3;
            } else {
                xVar2 = xVar3;
            }
        }
        this.d.q1(xVar, true);
        this.d.b();
        this.e.q1(xVar2, true);
        this.e.b();
        f27359k0.add(Integer.valueOf(this.f27361a));
    }

    public final void H() {
        f27359k0.remove(Integer.valueOf(this.f27361a));
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.U0();
            this.d = null;
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.U0();
            this.e = null;
        }
        if (this.W) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j3) {
        L(j3, false);
    }

    public final void L(long j3, boolean z10) {
        i2.o1 o1Var;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            if (z10) {
                o1Var = i2.o1.d;
            } else {
                o1Var = i2.o1.f10318c;
            }
            e0Var.s1(o1Var);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        i2.o1 o1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f27373i0.add(runnable);
            }
            i2.e0 e0Var = this.d;
            if (z10) {
                o1Var = i2.o1.d;
            } else {
                o1Var = i2.o1.f10318c;
            }
            e0Var.s1(o1Var);
            this.d.W0(5, j3);
        }
    }

    public final void N(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                e0Var.j(i10);
            }
        }
    }

    public final void O(boolean z10) {
        float f7;
        i2.e0 e0Var = this.d;
        float f10 = 1.0f;
        if (e0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            e0Var.U(f7);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            e0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f27378x && (!this.H || !this.G)) {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                e0Var.X(false);
            }
            i2.e0 e0Var2 = this.e;
            if (e0Var2 != null) {
                e0Var2.X(false);
                return;
            }
            return;
        }
        this.f27377w = z10;
        i2.e0 e0Var3 = this.d;
        if (e0Var3 != null) {
            e0Var3.X(z10);
        }
        i2.e0 e0Var4 = this.e;
        if (e0Var4 != null) {
            e0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.e0 e0Var = this.d;
            if (e0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                e0Var.f(new b2.v0(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.p71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t71.R(boolean, org.telegram.ui.Components.p71):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            e0Var.K0(new b2.e(0, 0, i12, 1, 0, false), false);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            e0Var2.K0(new b2.e(0, 0, i11, 1, 0, false), true);
        }
    }

    public final void T(Surface surface) {
        if (this.f27376s != surface) {
            this.f27376s = surface;
            i2.e0 e0Var = this.d;
            if (e0Var == null) {
                return;
            }
            e0Var.n(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f27375r != surfaceView) {
            this.f27375r = surfaceView;
            i2.e0 e0Var = this.d;
            if (e0Var == null) {
                return;
            }
            e0Var.u1(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f27374n != textureView) {
            this.f27374n = textureView;
            i2.e0 e0Var = this.d;
            if (e0Var == null) {
                return;
            }
            e0Var.v1(textureView);
        }
    }

    public final void W(float f7) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.U(f7);
        }
        i2.e0 e0Var2 = this.e;
        if (e0Var2 != null) {
            e0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f27363b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.m0 = new org.telegram.messenger.e1(dispatchQueue);
            return;
        }
        this.d.m0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((t71) objArr[0]) != this && y() && !this.f27379y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            q71 q71Var = this.J;
            if (q71Var != null) {
                q71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f27373i0;
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
        i2.l lVar;
        y2.d dVar = new y2.d();
        boolean z10 = this.f27365c;
        int i11 = 1000;
        if (z10) {
            i10 = 1000;
        } else {
            i10 = 100;
        }
        if (!z10) {
            i11 = 2000;
        }
        int i12 = 0;
        i2.k.a(i10, 0, "bufferForPlaybackMs", "0");
        i2.k.a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.k.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        i2.k.a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.k.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.k.a(0, 0, "backBufferDurationMs", "0");
        i2.k kVar = new i2.k(dVar, i10, i11);
        if (this.d == null) {
            if (this.K != null) {
                lVar = new n71(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new i2.l(ApplicationLoader.applicationContext);
            }
            lVar.f10262c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            e2.d.g(!pVar.v);
            pVar.f10323c = new i2.o(lVar, 2);
            x2.p pVar2 = this.f27369f;
            e2.d.g(!pVar.v);
            pVar2.getClass();
            pVar.e = new i2.o(pVar2, 1);
            e2.d.g(!pVar.v);
            pVar.f10324f = new i2.o(kVar, 0);
            e2.d.g(!pVar.v);
            pVar.v = true;
            i2.e0 e0Var = new i2.e0(pVar);
            this.d = e0Var;
            j2.e eVar = e0Var.f10157s;
            eVar.getClass();
            eVar.f11465f.a(this);
            this.d.f10150m.a(this);
            this.d.f10152n0.add(this);
            TextureView textureView = this.f27374n;
            if (textureView != null) {
                this.d.v1(textureView);
            } else {
                Surface surface = this.f27376s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.f27375r;
                    if (surfaceView != null) {
                        this.d.u1(surfaceView);
                    }
                }
            }
            this.d.X(this.f27377w);
            i2.e0 e0Var2 = this.d;
            if (this.V) {
                i12 = 2;
            }
            e0Var2.j(i12);
        }
        if (this.f27378x && this.e == null) {
            i2.p pVar3 = new i2.p(ApplicationLoader.applicationContext);
            x2.p pVar4 = this.f27369f;
            e2.d.g(!pVar3.v);
            pVar4.getClass();
            pVar3.e = new i2.o(pVar4, 1);
            e2.d.g(!pVar3.v);
            pVar3.f10324f = new i2.o(kVar, 0);
            e2.d.g(!pVar3.v);
            pVar3.v = true;
            i2.e0 e0Var3 = new i2.e0(pVar3);
            this.e = e0Var3;
            e0Var3.f10150m.a(new l71(this));
            this.e.X(this.f27377w);
        }
    }

    public final long j() {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            if (this.v) {
                return e0Var.c0();
            }
            return e0Var.getDuration();
        }
        return 0L;
    }

    public final of.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i10 = org.telegram.ui.Cells.r6.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            of.e eVar = new of.e(this.Q, str5, i10);
            eVar.e = str2;
            eVar.f14309f = str3;
            return new of.g(new of.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((p71) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                r71 r71Var = (r71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(r71Var.f26618c);
                String sb3 = sb2.toString();
                TLRPC.Document document = r71Var.f26620g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                of.e eVar2 = new of.e(r71Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f14309f = str3;
                int i13 = r71Var.f26621i;
                int i14 = r71Var.f26622j;
                eVar2.f14306a = i13;
                eVar2.f14307b = i14;
                arrayList.add(new of.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new of.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.B1();
            b2.s sVar = e0Var.Q;
            if (sVar != null && sVar.f1998n != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((p71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        r71 r71Var = (r71) obj2;
                        if (r71Var.f26618c == sVar.f1998n) {
                            return r71Var.f26620g;
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
        long j3 = this.f27371g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var.J0();
        }
        return 0L;
    }

    public final int o() {
        if (this.f27367d0 == -1) {
            try {
                if (this.f27366c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f26052a) {
                            return i10;
                        }
                    }
                }
                i2.e0 e0Var = this.d;
                if (e0Var != null) {
                    e0Var.B1();
                    b2.s sVar = e0Var.Q;
                    if (sVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            p71 u10 = u(i11);
                            if (!u10.f26052a && sVar.f2008y == u10.f26053b && sVar.f2009z == u10.f26054c && sVar.f1994j == ((int) Math.floor(((r71) u10.d.get(0)).f26624l * 8.0d))) {
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
        return this.f27367d0;
    }

    @Override
    public final void onCues(d2.c cVar) {
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new yo0(19, this, u0Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            boolean u10 = e0Var.u();
            int d = this.d.d();
            if (this.M != u10 || this.L != d) {
                this.J.onStateChanged(u10, d);
                this.M = u10;
                this.L = d;
            }
        }
        if (z10 && i10 == 3 && !x() && this.W) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.G && i10 == 3) {
            this.G = true;
            if (this.H && this.I) {
                C();
            }
        }
        if (i10 != 3) {
            this.f27362a0.removeCallbacksAndMessages(null);
            m71 m71Var = this.K;
            if (m71Var != null) {
                m71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f27371g0 = -9223372036854775807L;
        this.f27370f0 = -9223372036854775807L;
        q71 q71Var = this.J;
        if (q71Var != null) {
            q71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        q71 q71Var = this.J;
        if (q71Var != null) {
            q71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        org.telegram.ui.ir0 ir0Var = this.f27372h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.ir0 ir0Var = this.f27372h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (!Objects.equals(x1Var, b2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f2045a, x1Var.f2046b, 0, x1Var.f2047c);
        }
    }

    public final long p() {
        long j3 = this.f27370f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var.getDuration();
        }
        return 0L;
    }

    public final bi.q9 q(bi.q9 q9Var) {
        bi.q9 q9Var2 = q9Var;
        if (q9Var == null) {
            q9Var2 = new Object();
        }
        try {
            i2.e0 e0Var = this.d;
            e0Var.B1();
            MediaFormat mediaFormat = ((r2.r) e0Var.f10139g[0]).f41200d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    q9Var2.f3464b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    q9Var2.f3463a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return q9Var2;
    }

    public final p71 r(Boolean bool) {
        p71 p71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            p71 u10 = u(i10);
            if (u10.f26052a == bool.booleanValue() && (p71Var == null || p71Var.f26053b * p71Var.f26054c < u10.f26053b * u10.f26054c)) {
                p71Var = u10;
            }
        }
        return p71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final p71 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (p71) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            e0Var.B1();
            if (e0Var.Z == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f27378x || !this.I) {
            i2.e0 e0Var = this.d;
            if (e0Var != null && e0Var.u()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Uri z(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.P = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((p71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                long j3 = r71Var.f26618c;
                Uri uri = r71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(r71Var.e, r71Var.f26619f);
                if (r71Var.f26619f != null) {
                    this.P.add(r71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(r71Var.f26624l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(r71Var.f26621i);
                    sb3.append("x");
                    sb3.append(r71Var.f26622j);
                    String str2 = r71Var.f26625m;
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
                    if (r71Var.b() && r71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(r71Var.f26618c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(r71Var.f26616a);
                    sb3.append("\"\n");
                    if (r71Var.c()) {
                        sb3.append(r71Var.f26619f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(r71Var.e);
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

    public t71(boolean z10, boolean z11) {
        int i10 = f27358j0;
        f27358j0 = i10 + 1;
        this.f27361a = i10;
        this.f27362a0 = new Handler(Looper.getMainLooper());
        this.f27366c0 = false;
        this.f27367d0 = -1;
        this.f27370f0 = -9223372036854775807L;
        this.f27371g0 = -9223372036854775807L;
        this.f27373i0 = new ArrayList();
        this.f27364b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new Object());
        this.f27369f = pVar;
        if (z11) {
            x2.i e = pVar.e();
            e.getClass();
            x2.h hVar = new x2.h(e);
            hVar.E.add(1);
            pVar.b(new x2.i(hVar));
        }
        this.L = 1;
        this.W = z10;
        if (z10) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override
    public final void a(i2.g gVar) {
    }

    @Override
    public final void b(u2.c0 c0Var) {
    }

    @Override
    public final void c(b2.x1 x1Var) {
    }

    @Override
    public final void h(b2.u0 u0Var) {
    }

    @Override
    public final void onAudioAttributesChanged(b2.e eVar) {
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
    }

    @Override
    public final void onAvailableCommandsChanged(b2.x0 x0Var) {
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
    public final void onMediaMetadataChanged(b2.n0 n0Var) {
    }

    @Override
    public final void onMetadata(b2.p0 p0Var) {
    }

    @Override
    public final void onPlaybackParametersChanged(b2.v0 v0Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.u0 u0Var) {
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.n0 n0Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
    }

    @Override
    public final void onVolumeChanged(float f7) {
    }

    @Override
    public final void d(j2.a aVar, u2.c0 c0Var) {
    }

    @Override
    public final void e(b2.b1 b1Var, n4.y yVar) {
    }

    @Override
    public final void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
    }

    @Override
    public final void onMediaItemTransition(b2.k0 k0Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(b2.k1 k1Var, int i10) {
    }

    @Override
    public final void f(j2.a aVar, int i10, long j3) {
    }
}
