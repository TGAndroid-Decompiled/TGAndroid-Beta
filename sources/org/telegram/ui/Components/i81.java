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
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import b2.p0;
import c5.f;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m.h;
import m.h3;
import m2.e;
import m2.t;
import n2.m;
import n3.b;
import o2.c;
import o2.l;
import oa.d;
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
import org.telegram.ui.ps0;
import t7.u;
import u2.f0;
import y2.n;
public class i81 implements b2.e1, b2.a2, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f25580j0;
    public static final HashSet f25581k0 = new HashSet();
    public static HashMap f25582l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public f81 J;
    public b81 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public e81 O;
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
    public final int f25583a;
    public final Handler f25584a0;
    public DispatchQueue f25585b;
    public final boolean f25586b0;
    public boolean f25587c;
    public boolean f25588c0;
    public i2.h0 d;
    public int f25589d0;
    public i2.h0 e;
    public boolean f25590e0;
    public final x2.n f25591f;
    public long f25592f0;
    public long f25593g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.mr0 f25594h0;
    public final ArrayList f25595i0;
    public TextureView f25596n;
    public SurfaceView f25597r;
    public Surface f25598s;
    public boolean v;
    public boolean f25599w;
    public boolean f25600x;
    public boolean f25601y;

    public i81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(e81 e81Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (e81Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e81Var.f24329b);
            sb2.append("x");
            sb2.append(e81Var.f24330c);
            if (e81Var.f24328a) {
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
            if (f25582l0 == null) {
                f25582l0 = new HashMap();
            }
            Boolean bool = (Boolean) f25582l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && r2.w.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f25582l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f25582l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static g81 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((e81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                g81 g81Var = (g81) obj2;
                if (g81Var.b()) {
                    return g81Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        e81 e81Var;
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
                    g81 d = g81.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f18922id), i11, z10);
                    if (d.f24915i > 0 && d.f24916j > 0) {
                        if (document3 == document) {
                            d.f24911b = true;
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
            g81 g81Var = (g81) arrayList3.get(i14);
            String str2 = g81Var.f24919m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(g81Var.f24919m) && !"hevc".equals(g81Var.f24919m) && !"h265".equals(g81Var.f24919m) && !"vp9".equals(g81Var.f24919m)) || Y(g81Var.f24919m))) {
                arrayList4.add(g81Var);
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
            g81 g81Var2 = (g81) obj;
            if (g81Var2.f24911b) {
                arrayList6.add(new e81(g81Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        e81Var = (e81) obj2;
                        if (!e81Var.f24328a && e81Var.f24329b == g81Var2.f24915i && e81Var.f24330c == g81Var2.f24916j) {
                            break;
                        }
                    } else {
                        e81Var = null;
                        break;
                    }
                }
                if (e81Var != null && !SharedConfig.debugVideoQualities) {
                    e81Var.d.add(g81Var2);
                } else {
                    arrayList6.add(new e81(g81Var2));
                }
            }
        }
        return arrayList6;
    }

    public static g81 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((e81) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                g81 g81Var = (g81) obj2;
                if (g81Var.f24911b && g81Var.b()) {
                    return g81Var;
                }
            }
        }
        int size3 = arrayList.size();
        g81 g81Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((e81) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                g81 g81Var3 = (g81) obj4;
                if (!g81Var3.f24911b && Y(g81Var3.f24919m) && (g81Var2 == null || (i10 = g81Var3.f24915i * g81Var3.f24916j) > (i11 = g81Var2.f24915i * g81Var2.f24916j) || (i10 == i11 && g81Var3.f24918l < g81Var2.f24918l))) {
                    g81Var2 = g81Var3;
                }
            }
        }
        if (g81Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((e81) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    g81 g81Var4 = (g81) obj6;
                    if (g81Var2 == null || g81Var2.f24915i * g81Var2.f24916j > g81Var4.f24915i * g81Var4.f24916j || g81Var4.f24918l < g81Var2.f24918l) {
                        g81Var2 = g81Var4;
                    }
                }
            }
        }
        return g81Var2;
    }

    public static g81 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((e81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                g81 g81Var = (g81) obj2;
                if (g81Var.b()) {
                    return g81Var;
                }
            }
        }
        int size3 = arrayList.size();
        g81 g81Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((e81) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                g81 g81Var3 = (g81) obj4;
                if (!g81Var3.f24911b && (g81Var2 == null || g81Var2.f24915i * g81Var2.f24916j > g81Var3.f24915i * g81Var3.f24916j || g81Var3.f24918l < g81Var2.f24918l)) {
                    if (g81Var3.f24915i <= 900 && g81Var3.f24916j <= 900) {
                        g81Var2 = g81Var3;
                    }
                }
            }
        }
        if (g81Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((e81) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    g81 g81Var4 = (g81) obj6;
                    if (g81Var2 == null || g81Var2.f24915i * g81Var2.f24916j > g81Var4.f24915i * g81Var4.f24916j || g81Var4.f24918l < g81Var2.f24918l) {
                        g81Var2 = g81Var4;
                    }
                }
            }
        }
        return g81Var2;
    }

    public final u2.a A(Uri uri, String str, long j10) {
        boolean z10;
        b2.i0 i0Var;
        b2.k0 k0Var;
        n2.m mVar;
        n2.m mVar2;
        b2.h0 h0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var = new b2.g0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        b2.i0 i0Var2 = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        if (g0Var.f2145b != null && g0Var.f2144a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v7.u6.p(z10);
        if (uri != null) {
            if (g0Var.f2144a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            i0Var = i0Var2;
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            i0Var = i0Var2;
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0("", new b2.e0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        if (j10 != 0) {
            bi.p1 p1Var = new bi.p1(this, j10, 7);
            rg.b0 b0Var = new rg.b0(new c3.m(), 8);
            Object obj = new Object();
            oa.d dVar = new oa.d(27);
            k0Var.getClass();
            p0Var.f2282b.getClass();
            b2.h0 h0Var2 = p0Var.f2282b.f2194c;
            if (h0Var2 == null) {
                mVar2 = n2.m.f15678z;
            } else {
                synchronized (obj) {
                    try {
                        if (!h0Var2.equals(null)) {
                            mVar = m.h3.v(h0Var2);
                        } else {
                            mVar = null;
                        }
                        mVar.getClass();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                mVar2 = mVar;
            }
            return new u2.y0(p0Var, p1Var, b0Var, mVar2, dVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.x0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(p0Var);
            }
            if (this.X == null) {
                this.X = new u2.f0(extendedDefaultDataSourceFactory) {
                    public final a f1821a;
                    public final g f1822b;
                    public final h3 f1823c;
                    public final d d;
                    public final d e;
                    public final long f1824f;
                    public final long f1825g;

                    {
                        a aVar = new a(extendedDefaultDataSourceFactory);
                        this.f1821a = aVar;
                        this.f1822b = extendedDefaultDataSourceFactory;
                        this.f1823c = new h3(5);
                        this.e = new d(27);
                        this.f1824f = 30000L;
                        this.f1825g = 5000000L;
                        this.d = new d(24);
                        ((f) aVar.d).f4361b = true;
                    }

                    @Override
                    public final u2.a a(p0 p0Var2) {
                        n nVar;
                        p0Var2.f2282b.getClass();
                        e eVar = new e();
                        List list2 = p0Var2.f2282b.e;
                        if (!list2.isEmpty()) {
                            nVar = new t(24, eVar, list2);
                        } else {
                            nVar = eVar;
                        }
                        return new l2.g(p0Var2, this.f1822b, nVar, this.f1821a, this.d, this.f1823c.B(p0Var2), this.e, this.f1824f, this.f1825g);
                    }

                    @Override
                    public final f0 b(boolean z11) {
                        ((f) this.f1821a.d).f4361b = z11;
                        return this;
                    }

                    @Override
                    public final f0 c(int i10) {
                        ((f) this.f1821a.d).f4360a = i10;
                        return this;
                    }

                    @Override
                    public final f0 d(u uVar) {
                        f fVar = (f) this.f1821a.d;
                        fVar.getClass();
                        fVar.f4362c = uVar;
                        return this;
                    }
                };
            }
            return a(p0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.f0(extendedDefaultDataSourceFactory) {
                public final h f1826a;
                public c f1827b;
                public u f1828c;
                public final h3 f1831i = new h3(5);
                public final pb.a f1829f = new pb.a(19);
                public final ps0 f1830g = p2.d.J;
                public final d f1832j = new d(27);
                public final d h = new d(24);
                public final int f1834l = 1;
                public final long f1835m = -9223372036854775807L;
                public final boolean f1833k = true;
                public int e = 3;
                public boolean d = true;

                {
                    this.f1826a = new h(extendedDefaultDataSourceFactory, 4);
                }

                @Override
                public final f0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 c(int i10) {
                    this.e = i10;
                    return this;
                }

                @Override
                public final f0 d(u uVar) {
                    this.f1828c = uVar;
                    return this;
                }

                @Override
                public final l a(p0 p0Var2) {
                    p0Var2.f2282b.getClass();
                    if (this.f1827b == null) {
                        ?? obj2 = new Object();
                        obj2.f16176a = new u(28);
                        obj2.f16178c = 3;
                        this.f1827b = obj2;
                    }
                    u uVar = this.f1828c;
                    if (uVar != null) {
                        this.f1827b.f16176a = uVar;
                    }
                    c cVar = this.f1827b;
                    cVar.f16177b = this.d;
                    cVar.f16178c = this.e;
                    List list2 = p0Var2.f2282b.e;
                    boolean isEmpty = list2.isEmpty();
                    p2.t tVar = this.f1829f;
                    if (!isEmpty) {
                        tVar = new b(12, tVar, list2);
                    }
                    m B = this.f1831i.B(p0Var2);
                    this.f1830g.getClass();
                    h hVar = this.f1826a;
                    d dVar2 = this.f1832j;
                    return new l(p0Var2, hVar, cVar, this.h, B, dVar2, new p2.d(hVar, dVar2, tVar), this.f1835m, this.f1833k, this.f1834l);
                }
            };
        }
        return a(p0Var);
    }

    public void B() {
        this.I = false;
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.X(false);
        }
        i2.h0 h0Var2 = this.e;
        if (h0Var2 != null) {
            h0Var2.X(false);
        }
        if (this.K != null) {
            this.f25584a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f25600x && (!this.H || !this.G)) {
            i2.h0 h0Var = this.d;
            if (h0Var != null) {
                h0Var.X(false);
            }
            i2.h0 h0Var2 = this.e;
            if (h0Var2 != null) {
                h0Var2.X(false);
                return;
            }
            return;
        }
        i2.h0 h0Var3 = this.d;
        if (h0Var3 != null) {
            h0Var3.X(true);
        }
        i2.h0 h0Var4 = this.e;
        if (h0Var4 != null) {
            h0Var4.X(true);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j10) {
        String str2 = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z10 = false;
        this.U = false;
        this.f25588c0 = false;
        this.f25590e0 = false;
        this.G = false;
        this.f25600x = false;
        this.F = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        i();
        this.d.u1(A(uri, str, j10), true);
        this.d.b();
    }

    public final void F(ArrayList arrayList, e81 e81Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = e81Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f25588c0 = false;
        this.G = false;
        this.f25600x = false;
        this.F = null;
        this.v = true;
        i();
        this.f25590e0 = false;
        if (e81Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(e81Var);
        } else {
            i10 = -1;
        }
        this.f25589d0 = i10;
        R(true, e81Var);
        if (this.f25588c0) {
            this.f25589d0 = -1;
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
        this.f25590e0 = false;
        this.f25600x = true;
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
        this.d.u1(xVar, true);
        this.d.b();
        this.e.u1(xVar2, true);
        this.e.b();
        f25581k0.add(Integer.valueOf(this.f25583a));
    }

    public final void H() {
        f25581k0.remove(Integer.valueOf(this.f25583a));
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.X0();
            this.d = null;
        }
        i2.h0 h0Var2 = this.e;
        if (h0Var2 != null) {
            h0Var2.X0();
            this.e = null;
        }
        if (this.W) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j10) {
        L(j10, false);
    }

    public final void L(long j10, boolean z10) {
        i2.t1 t1Var;
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            if (z10) {
                t1Var = i2.t1.d;
            } else {
                t1Var = i2.t1.f11196c;
            }
            h0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void M(long j10, boolean z10, Runnable runnable) {
        i2.t1 t1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f25595i0.add(runnable);
            }
            i2.h0 h0Var = this.d;
            if (z10) {
                t1Var = i2.t1.d;
            } else {
                t1Var = i2.t1.f11196c;
            }
            h0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void N(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.h0 h0Var = this.d;
            if (h0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                h0Var.j(i10);
            }
        }
    }

    public final void O(boolean z10) {
        float f7;
        i2.h0 h0Var = this.d;
        float f10 = 1.0f;
        if (h0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            h0Var.U(f7);
        }
        i2.h0 h0Var2 = this.e;
        if (h0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            h0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f25600x && (!this.H || !this.G)) {
            i2.h0 h0Var = this.d;
            if (h0Var != null) {
                h0Var.X(false);
            }
            i2.h0 h0Var2 = this.e;
            if (h0Var2 != null) {
                h0Var2.X(false);
                return;
            }
            return;
        }
        this.f25599w = z10;
        i2.h0 h0Var3 = this.d;
        if (h0Var3 != null) {
            h0Var3.X(z10);
        }
        i2.h0 h0Var4 = this.e;
        if (h0Var4 != null) {
            h0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.h0 h0Var = this.d;
            if (h0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                h0Var.f(new b2.a1(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.e81 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i81.R(boolean, org.telegram.ui.Components.e81):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            h0Var.N0(new b2.f(0, 0, i12, 1, false, 0, true), false);
        }
        i2.h0 h0Var2 = this.e;
        if (h0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            h0Var2.N0(new b2.f(0, 0, i11, 1, false, 0, true), true);
        }
    }

    public final void T(Surface surface) {
        if (this.f25598s != surface) {
            this.f25598s = surface;
            i2.h0 h0Var = this.d;
            if (h0Var == null) {
                return;
            }
            h0Var.y1(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f25597r != surfaceView) {
            this.f25597r = surfaceView;
            i2.h0 h0Var = this.d;
            if (h0Var == null) {
                return;
            }
            h0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            h0Var.T(holder);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f25596n != textureView) {
            this.f25596n = textureView;
            i2.h0 h0Var = this.d;
            if (h0Var == null) {
                return;
            }
            h0Var.z1(textureView);
        }
    }

    public final void W(float f7) {
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.U(f7);
        }
        i2.h0 h0Var2 = this.e;
        if (h0Var2 != null) {
            h0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f25585b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.f11017s0 = new org.telegram.messenger.f1(dispatchQueue);
            return;
        }
        this.d.f11017s0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((i81) objArr[0]) != this && y() && !this.f25601y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            f81 f81Var = this.J;
            if (f81Var != null) {
                f81Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f25595i0;
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
        i2.k kVar;
        HashMap hashMap = new HashMap();
        hashMap.put(j2.k.f12558c.f12559a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.f25587c;
        int i11 = 1000;
        if (z10) {
            i10 = 1000;
        } else {
            i10 = 100;
        }
        if (!z10) {
            i11 = 2000;
        }
        int i12 = i11;
        int i13 = 0;
        i2.i.a(i10, 0, "bufferForPlaybackMs", "0");
        i2.i.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.i.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        i2.i.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.i.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.i.a(0, 0, "backBufferDurationMs", "0");
        i2.i iVar = new i2.i(dVar, 50000, i10, i10, i12, i12, false, hashMap);
        if (this.d == null) {
            if (this.K != null) {
                kVar = new c81(ApplicationLoader.applicationContext, this);
            } else {
                kVar = new i2.k(ApplicationLoader.applicationContext);
            }
            kVar.f11066c = 1;
            i2.o oVar = new i2.o(ApplicationLoader.applicationContext);
            v7.u6.p(!oVar.f11124z);
            oVar.f11105c = new i2.n(kVar, 2);
            x2.n nVar = this.f25591f;
            v7.u6.p(!oVar.f11124z);
            nVar.getClass();
            oVar.e = new i2.n(nVar, 1);
            v7.u6.p(!oVar.f11124z);
            oVar.f11106f = new i2.n(iVar, 0);
            i2.h0 a2 = oVar.a();
            this.d = a2;
            j2.f fVar = a2.f11016s;
            fVar.getClass();
            fVar.f12532f.a(this);
            this.d.f11005m.a(this);
            this.d.f11019t0.add(this);
            TextureView textureView = this.f25596n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f25598s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f25597r;
                    if (surfaceView != null) {
                        i2.h0 h0Var = this.d;
                        h0Var.F1();
                        h0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f25599w);
            i2.h0 h0Var2 = this.d;
            if (this.V) {
                i13 = 2;
            }
            h0Var2.j(i13);
        }
        if (this.f25600x && this.e == null) {
            i2.o oVar2 = new i2.o(ApplicationLoader.applicationContext);
            x2.n nVar2 = this.f25591f;
            v7.u6.p(!oVar2.f11124z);
            nVar2.getClass();
            oVar2.e = new i2.n(nVar2, 1);
            v7.u6.p(true ^ oVar2.f11124z);
            oVar2.f11106f = new i2.n(iVar, 0);
            i2.h0 a10 = oVar2.a();
            this.e = a10;
            a10.f11005m.a(new e2.z(this, 1));
            this.e.X(this.f25599w);
        }
    }

    public final long j() {
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            if (this.v) {
                return h0Var.d0();
            }
            return h0Var.getDuration();
        }
        return 0L;
    }

    public final qf.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String h = t8.b.h("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            qf.e eVar = new qf.e(this.Q, str5, h);
            eVar.e = str2;
            eVar.f43112f = str3;
            return new qf.g(new qf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((e81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                g81 g81Var = (g81) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(g81Var.f24912c);
                String sb3 = sb2.toString();
                TLRPC.Document document = g81Var.f24914g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                qf.e eVar2 = new qf.e(g81Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f43112f = str3;
                int i12 = g81Var.f24915i;
                int i13 = g81Var.f24916j;
                eVar2.f43109a = i12;
                eVar2.f43110b = i13;
                arrayList.add(new qf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new qf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.F1();
            b2.x xVar = h0Var.S;
            if (xVar != null && xVar.f2519o != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((e81) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        g81 g81Var = (g81) obj2;
                        if (g81Var.f24912c == xVar.f2519o) {
                            return g81Var.f24914g;
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
        long j10 = this.f25593g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            return h0Var.M0();
        }
        return 0L;
    }

    public final int o() {
        if (this.f25589d0 == -1) {
            try {
                if (this.f25588c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f24328a) {
                            return i10;
                        }
                    }
                }
                i2.h0 h0Var = this.d;
                if (h0Var != null) {
                    h0Var.F1();
                    b2.x xVar = h0Var.S;
                    if (xVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            e81 u10 = u(i11);
                            if (!u10.f24328a && xVar.f2529z == u10.f24329b && xVar.A == u10.f24330c && xVar.f2514j == ((int) Math.floor(((g81) u10.d.get(0)).f24918l * 8.0d))) {
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
        return this.f25589d0;
    }

    @Override
    public final void onCues(d2.c cVar) {
    }

    @Override
    public final void onPlayerError(b2.z0 z0Var) {
        AndroidUtilities.runOnUIThread(new n51(3, this, z0Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            boolean t10 = h0Var.t();
            int d = this.d.d();
            if (this.M != t10 || this.L != d) {
                this.J.onStateChanged(t10, d);
                this.M = t10;
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
            this.f25584a0.removeCallbacksAndMessages(null);
            b81 b81Var = this.K;
            if (b81Var != null) {
                b81Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f25593g0 = -9223372036854775807L;
        this.f25592f0 = -9223372036854775807L;
        f81 f81Var = this.J;
        if (f81Var != null) {
            f81Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        f81 f81Var = this.J;
        if (f81Var != null) {
            f81Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        org.telegram.ui.mr0 mr0Var = this.f25594h0;
        if (mr0Var != null) {
            AndroidUtilities.runOnUIThread(mr0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.w1 w1Var) {
        org.telegram.ui.mr0 mr0Var = this.f25594h0;
        if (mr0Var != null) {
            AndroidUtilities.runOnUIThread(mr0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.b2 b2Var) {
        if (!Objects.equals(b2Var, b2.b2.d)) {
            this.J.onVideoSizeChanged(b2Var.f2087a, b2Var.f2088b, 0, b2Var.f2089c);
        }
    }

    public final long p() {
        long j10 = this.f25592f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            return h0Var.getDuration();
        }
        return 0L;
    }

    public final di.j8 q(di.j8 j8Var) {
        di.j8 j8Var2 = j8Var;
        if (j8Var == null) {
            j8Var2 = new Object();
        }
        try {
            i2.h0 h0Var = this.d;
            h0Var.F1();
            MediaFormat mediaFormat = ((r2.r) h0Var.f10994g[0]).f43625f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    j8Var2.f7125b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    j8Var2.f7124a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return j8Var2;
    }

    public final e81 r(Boolean bool) {
        e81 e81Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            e81 u10 = u(i10);
            if (u10.f24328a == bool.booleanValue() && (e81Var == null || e81Var.f24329b * e81Var.f24330c < u10.f24329b * u10.f24330c)) {
                e81Var = u10;
            }
        }
        return e81Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final e81 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (e81) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.h0 h0Var = this.d;
        if (h0Var != null) {
            h0Var.F1();
            if (h0Var.f10987b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f25600x || !this.I) {
            i2.h0 h0Var = this.d;
            if (h0Var != null && h0Var.t()) {
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
            ArrayList arrayList3 = ((e81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                g81 g81Var = (g81) obj2;
                long j10 = g81Var.f24912c;
                Uri uri = g81Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(g81Var.e, g81Var.f24913f);
                if (g81Var.f24913f != null) {
                    this.P.add(g81Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(g81Var.f24918l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(g81Var.f24915i);
                    sb3.append("x");
                    sb3.append(g81Var.f24916j);
                    String str2 = g81Var.f24919m;
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
                    if (g81Var.b() && g81Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(g81Var.f24912c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(g81Var.f24910a);
                    sb3.append("\"\n");
                    if (g81Var.c()) {
                        sb3.append(g81Var.f24913f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(g81Var.e);
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

    public i81(boolean z10, boolean z11) {
        int i10 = f25580j0;
        f25580j0 = i10 + 1;
        this.f25583a = i10;
        this.f25584a0 = new Handler(Looper.getMainLooper());
        this.f25588c0 = false;
        this.f25589d0 = -1;
        this.f25592f0 = -9223372036854775807L;
        this.f25593g0 = -9223372036854775807L;
        this.f25595i0 = new ArrayList();
        this.f25586b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.n nVar = new x2.n(ApplicationLoader.applicationContext, new oa.d(26));
        this.f25591f = nVar;
        if (z11) {
            x2.i j10 = nVar.j();
            j10.getClass();
            x2.h hVar = new x2.h(j10);
            hVar.I.add(1);
            nVar.b(new x2.i(hVar));
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
    public final void onPositionDiscontinuity(b2.f1 f1Var, b2.f1 f1Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override
    public final void a(i2.e eVar) {
    }

    @Override
    public final void b(u2.c0 c0Var) {
    }

    @Override
    public final void c(b2.b2 b2Var) {
    }

    @Override
    public final void h(b2.z0 z0Var) {
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
    }

    @Override
    public final void onAvailableCommandsChanged(b2.c1 c1Var) {
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
    public final void onMediaMetadataChanged(b2.s0 s0Var) {
    }

    @Override
    public final void onMetadata(b2.u0 u0Var) {
    }

    @Override
    public final void onPlaybackParametersChanged(b2.a1 a1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.z0 z0Var) {
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.s0 s0Var) {
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
    public final void d(b2.g1 g1Var, qf.b bVar) {
    }

    @Override
    public final void e(j2.a aVar, u2.c0 c0Var) {
    }

    @Override
    public final void onEvents(b2.g1 g1Var, b2.d1 d1Var) {
    }

    @Override
    public final void onMediaItemTransition(b2.p0 p0Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(b2.p1 p1Var, int i10) {
    }

    @Override
    public final void f(j2.a aVar, int i10, long j10) {
    }
}
