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
import l.d;
import lf.h;
import m2.e;
import n2.n;
import o2.c;
import o2.l;
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
import org.telegram.ui.Cells.f3;
import org.telegram.ui.ja0;
import p2.s;
import qb.b;
import t7.u;
import u2.e0;
import y2.o;
public class t71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f28315j0;
    public static final HashSet f28316k0 = new HashSet();
    public static HashMap f28317l0;
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
    public u2.w0 Z;
    public final int f28318a;
    public final Handler f28319a0;
    public DispatchQueue f28320b;
    public final boolean f28321b0;
    public boolean f28322c;
    public boolean f28323c0;
    public i2.e0 d;
    public int f28324d0;
    public i2.e0 e;
    public boolean f28325e0;
    public final x2.q f28326f;
    public long f28327f0;
    public long f28328g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.jr0 f28329h0;
    public final ArrayList f28330i0;
    public TextureView f28331n;
    public SurfaceView f28332r;
    public Surface f28333s;
    public boolean v;
    public boolean f28334w;
    public boolean f28335x;
    public boolean f28336y;

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
            sb2.append(p71Var.f27182b);
            sb2.append("x");
            sb2.append(p71Var.f27183c);
            if (p71Var.f27181a) {
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
            if (f28317l0 == null) {
                f28317l0 = new HashMap();
            }
            Boolean bool = (Boolean) f28317l0.get(concat);
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
                                f28317l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f28317l0.put(concat, Boolean.FALSE);
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
                    r71 d = r71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f18334id), i11, z10);
                    if (d.f27798i > 0 && d.f27799j > 0) {
                        if (document3 == document) {
                            d.f27794b = true;
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
            String str2 = r71Var.f27802m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(r71Var.f27802m) && !"hevc".equals(r71Var.f27802m) && !"h265".equals(r71Var.f27802m) && !"vp9".equals(r71Var.f27802m)) || Y(r71Var.f27802m))) {
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
            if (r71Var2.f27794b) {
                arrayList6.add(new p71(r71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        p71Var = (p71) obj2;
                        if (!p71Var.f27181a && p71Var.f27182b == r71Var2.f27798i && p71Var.f27183c == r71Var2.f27799j) {
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
                if (r71Var.f27794b && r71Var.b()) {
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
                if (!r71Var3.f27794b && Y(r71Var3.f27802m) && (r71Var2 == null || (i10 = r71Var3.f27798i * r71Var3.f27799j) > (i11 = r71Var2.f27798i * r71Var2.f27799j) || (i10 == i11 && r71Var3.f27801l < r71Var2.f27801l))) {
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
                    if (r71Var2 == null || r71Var2.f27798i * r71Var2.f27799j > r71Var4.f27798i * r71Var4.f27799j || r71Var4.f27801l < r71Var2.f27801l) {
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
                if (!r71Var3.f27794b && (r71Var2 == null || r71Var2.f27798i * r71Var2.f27799j > r71Var3.f27798i * r71Var3.f27799j || r71Var3.f27801l < r71Var2.f27801l)) {
                    if (r71Var3.f27798i <= 900 && r71Var3.f27799j <= 900) {
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
                    if (r71Var2 == null || r71Var2.f27798i * r71Var2.f27799j > r71Var4.f27798i * r71Var4.f27799j || r71Var4.f27801l < r71Var2.f27801l) {
                        r71Var2 = r71Var4;
                    }
                }
            }
        }
        return r71Var2;
    }

    public final u2.a A(Uri uri, String str, long j3) {
        boolean z10;
        b2.d0 d0Var;
        b2.f0 f0Var;
        n2.n nVar;
        n2.n nVar2;
        b2.c0 c0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        if (b0Var.f2939b != null && b0Var.f2938a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f2938a != null) {
                c0Var = new b2.c0(b0Var);
            } else {
                c0Var = null;
            }
            d0Var = d0Var2;
            f0Var = new b2.f0(uri, null, c0Var, null, list, null, a1Var, -9223372036854775807L);
        } else {
            d0Var = d0Var2;
            f0Var = null;
        }
        b2.k0 k0Var = new b2.k0("", new b2.z(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
        if (j3 != 0) {
            ai.z1 z1Var = new ai.z1(this, j3, 7);
            r5.d dVar = new r5.d(new c3.m(), 10);
            Object obj = new Object();
            qb.b bVar = new qb.b(26);
            f0Var.getClass();
            k0Var.f3078b.getClass();
            b2.c0 c0Var2 = k0Var.f3078b.f2995c;
            if (c0Var2 == null) {
                nVar2 = n2.n.f15133z;
            } else {
                synchronized (obj) {
                    try {
                        if (!c0Var2.equals(null)) {
                            nVar = lf.h.x(c0Var2);
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
            return new u2.x0(k0Var, z1Var, dVar, nVar2, bVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.w0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(k0Var);
            }
            if (this.X == null) {
                this.X = new u2.e0(extendedDefaultDataSourceFactory) {
                    public final a f2667a;
                    public final g f2668b;
                    public final h f2669c;
                    public final ob.a d;
                    public final b e;
                    public final long f2670f;
                    public final long f2671g;

                    {
                        a aVar = new a(extendedDefaultDataSourceFactory);
                        this.f2667a = aVar;
                        this.f2668b = extendedDefaultDataSourceFactory;
                        this.f2669c = new h(5);
                        this.e = new b(26);
                        this.f2670f = 30000L;
                        this.f2671g = 5000000L;
                        this.d = new ob.a(23);
                        ((p) aVar.d).f3176b = true;
                    }

                    @Override
                    public final u2.a a(k0 k0Var2) {
                        o oVar;
                        k0Var2.f3078b.getClass();
                        e eVar = new e();
                        List list2 = k0Var2.f3078b.e;
                        if (!list2.isEmpty()) {
                            oVar = new f3(eVar, list2, false, 14);
                        } else {
                            oVar = eVar;
                        }
                        return new l2.g(k0Var2, this.f2668b, oVar, this.f2667a, this.d, this.f2669c.A(k0Var2), this.e, this.f2670f, this.f2671g);
                    }

                    @Override
                    public final e0 b(boolean z11) {
                        ((p) this.f2667a.d).f3176b = z11;
                        return this;
                    }

                    @Override
                    public final e0 c() {
                        ((p) this.f2667a.d).getClass();
                        return this;
                    }

                    @Override
                    public final e0 d(b bVar2) {
                        p pVar = (p) this.f2667a.d;
                        pVar.getClass();
                        pVar.f3177c = bVar2;
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.e0(extendedDefaultDataSourceFactory) {
                public final d f2672a;
                public c f2673b;
                public b f2674c;
                public final h h = new h(5);
                public final u e = new Object();
                public final ja0 f2675f = p2.c.E;
                public final b f2677i = new b(26);
                public final ob.a f2676g = new ob.a(23);
                public final int f2679k = 1;
                public final long f2680l = -9223372036854775807L;
                public final boolean f2678j = true;
                public boolean d = true;

                {
                    this.f2672a = new d(extendedDefaultDataSourceFactory);
                }

                @Override
                public final e0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final e0 d(b bVar2) {
                    this.f2674c = bVar2;
                    return this;
                }

                @Override
                public final l a(k0 k0Var2) {
                    k0Var2.f3078b.getClass();
                    if (this.f2673b == null) {
                        ?? obj2 = new Object();
                        obj2.f15538a = new b(28);
                        this.f2673b = obj2;
                    }
                    b bVar2 = this.f2674c;
                    if (bVar2 != null) {
                        this.f2673b.f15538a = bVar2;
                    }
                    c cVar = this.f2673b;
                    cVar.f15539b = this.d;
                    cVar.getClass();
                    List list2 = k0Var2.f3078b.e;
                    boolean isEmpty = list2.isEmpty();
                    s sVar = this.e;
                    if (!isEmpty) {
                        sVar = new f3(sVar, list2, false, 7);
                    }
                    n A = this.h.A(k0Var2);
                    this.f2675f.getClass();
                    d dVar2 = this.f2672a;
                    b bVar3 = this.f2677i;
                    return new l(k0Var2, dVar2, cVar, this.f2676g, A, bVar3, new p2.c(dVar2, bVar3, sVar), this.f2680l, this.f2678j, this.f2679k);
                }

                @Override
                public final e0 c() {
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
            this.f28319a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f28335x && (!this.H || !this.G)) {
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
        this.f28323c0 = false;
        this.f28325e0 = false;
        this.G = false;
        this.f28335x = false;
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
        this.f28323c0 = false;
        this.G = false;
        this.f28335x = false;
        this.F = null;
        this.v = true;
        i();
        this.f28325e0 = false;
        if (p71Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(p71Var);
        } else {
            i10 = -1;
        }
        this.f28324d0 = i10;
        R(true, p71Var);
        if (this.f28323c0) {
            this.f28324d0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        u2.w wVar = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.R = uri2;
        this.S = str;
        this.T = str2;
        this.U = true;
        this.f28325e0 = false;
        this.f28335x = true;
        this.H = false;
        this.G = false;
        i();
        u2.w wVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.w wVar3 = new u2.w(A(uri3, str3, 0L));
            if (i10 == 0) {
                wVar = wVar3;
            } else {
                wVar2 = wVar3;
            }
        }
        this.d.q1(wVar, true);
        this.d.b();
        this.e.q1(wVar2, true);
        this.e.b();
        f28316k0.add(Integer.valueOf(this.f28318a));
    }

    public final void H() {
        f28316k0.remove(Integer.valueOf(this.f28318a));
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
        i2.p1 p1Var;
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            if (z10) {
                p1Var = i2.p1.d;
            } else {
                p1Var = i2.p1.f10860c;
            }
            e0Var.s1(p1Var);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        i2.p1 p1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f28330i0.add(runnable);
            }
            i2.e0 e0Var = this.d;
            if (z10) {
                p1Var = i2.p1.d;
            } else {
                p1Var = i2.p1.f10860c;
            }
            e0Var.s1(p1Var);
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
        if (z10 && this.f28335x && (!this.H || !this.G)) {
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
        this.f28334w = z10;
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
        if (this.f28333s != surface) {
            this.f28333s = surface;
            i2.e0 e0Var = this.d;
            if (e0Var == null) {
                return;
            }
            e0Var.n(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f28332r != surfaceView) {
            this.f28332r = surfaceView;
            i2.e0 e0Var = this.d;
            if (e0Var == null) {
                return;
            }
            e0Var.u1(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f28331n != textureView) {
            this.f28331n = textureView;
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
        this.f28320b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.m0 = new org.telegram.messenger.c1(dispatchQueue);
            return;
        }
        this.d.m0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((t71) objArr[0]) != this && y() && !this.f28336y) {
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
            ArrayList arrayList = this.f28330i0;
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
        boolean z10 = this.f28322c;
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
            lVar.f10775c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            e2.d.g(!pVar.v);
            pVar.f10840c = new i2.o(lVar, 2);
            x2.q qVar = this.f28326f;
            e2.d.g(!pVar.v);
            qVar.getClass();
            pVar.e = new i2.o(qVar, 1);
            e2.d.g(!pVar.v);
            pVar.f10841f = new i2.o(kVar, 0);
            i2.e0 a2 = pVar.a();
            this.d = a2;
            j2.f fVar = a2.f10675s;
            fVar.getClass();
            fVar.f12579f.a(this);
            this.d.f10668m.a(this);
            this.d.f10670n0.add(this);
            TextureView textureView = this.f28331n;
            if (textureView != null) {
                this.d.v1(textureView);
            } else {
                Surface surface = this.f28333s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.f28332r;
                    if (surfaceView != null) {
                        this.d.u1(surfaceView);
                    }
                }
            }
            this.d.X(this.f28334w);
            i2.e0 e0Var = this.d;
            if (this.V) {
                i12 = 2;
            }
            e0Var.j(i12);
        }
        if (this.f28335x && this.e == null) {
            i2.p pVar2 = new i2.p(ApplicationLoader.applicationContext);
            x2.q qVar2 = this.f28326f;
            e2.d.g(!pVar2.v);
            qVar2.getClass();
            pVar2.e = new i2.o(qVar2, 1);
            e2.d.g(!pVar2.v);
            pVar2.f10841f = new i2.o(kVar, 0);
            i2.e0 a10 = pVar2.a();
            this.e = a10;
            a10.f10668m.a(new ki.e0(this, 1));
            this.e.X(this.f28334w);
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
            String g10 = v7.j0.g("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            of.e eVar = new of.e(this.Q, str5, g10);
            eVar.e = str2;
            eVar.f15697f = str3;
            return new of.g(new of.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((p71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                r71 r71Var = (r71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(r71Var.f27795c);
                String sb3 = sb2.toString();
                TLRPC.Document document = r71Var.f27797g;
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
                eVar2.f15697f = str3;
                int i12 = r71Var.f27798i;
                int i13 = r71Var.f27799j;
                eVar2.f15694a = i12;
                eVar2.f15695b = i13;
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
            if (sVar != null && sVar.f3305n != 0 && (arrayList = this.N) != null) {
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
                        if (r71Var.f27795c == sVar.f3305n) {
                            return r71Var.f27797g;
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
        long j3 = this.f28328g0;
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
        if (this.f28324d0 == -1) {
            try {
                if (this.f28323c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f27181a) {
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
                            if (!u10.f27181a && sVar.f3315y == u10.f27182b && sVar.f3316z == u10.f27183c && sVar.f3301j == ((int) Math.floor(((r71) u10.d.get(0)).f27801l * 8.0d))) {
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
        return this.f28324d0;
    }

    @Override
    public final void onCues(d2.d dVar) {
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new wn0(22, this, u0Var));
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
            this.f28319a0.removeCallbacksAndMessages(null);
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
        this.f28328g0 = -9223372036854775807L;
        this.f28327f0 = -9223372036854775807L;
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
        org.telegram.ui.jr0 jr0Var = this.f28329h0;
        if (jr0Var != null) {
            AndroidUtilities.runOnUIThread(jr0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.jr0 jr0Var = this.f28329h0;
        if (jr0Var != null) {
            AndroidUtilities.runOnUIThread(jr0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (!Objects.equals(x1Var, b2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f3352a, x1Var.f3353b, 0, x1Var.f3354c);
        }
    }

    public final long p() {
        long j3 = this.f28327f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var.getDuration();
        }
        return 0L;
    }

    public final ci.n8 q(ci.n8 n8Var) {
        ci.n8 n8Var2 = n8Var;
        if (n8Var == null) {
            n8Var2 = new Object();
        }
        try {
            i2.e0 e0Var = this.d;
            e0Var.B1();
            MediaFormat mediaFormat = ((r2.r) e0Var.f10657g[0]).f42280d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    n8Var2.f5079b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    n8Var2.f5078a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return n8Var2;
    }

    public final p71 r(Boolean bool) {
        p71 p71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            p71 u10 = u(i10);
            if (u10.f27181a == bool.booleanValue() && (p71Var == null || p71Var.f27182b * p71Var.f27183c < u10.f27182b * u10.f27183c)) {
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
        if (!this.f28335x || !this.I) {
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
                long j3 = r71Var.f27795c;
                Uri uri = r71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(r71Var.e, r71Var.f27796f);
                if (r71Var.f27796f != null) {
                    this.P.add(r71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(r71Var.f27801l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(r71Var.f27798i);
                    sb3.append("x");
                    sb3.append(r71Var.f27799j);
                    String str2 = r71Var.f27802m;
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
                    sb3.append(r71Var.f27795c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(r71Var.f27793a);
                    sb3.append("\"\n");
                    if (r71Var.c()) {
                        sb3.append(r71Var.f27796f);
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
        int i10 = f28315j0;
        f28315j0 = i10 + 1;
        this.f28318a = i10;
        this.f28319a0 = new Handler(Looper.getMainLooper());
        this.f28323c0 = false;
        this.f28324d0 = -1;
        this.f28327f0 = -9223372036854775807L;
        this.f28328g0 = -9223372036854775807L;
        this.f28330i0 = new ArrayList();
        this.f28321b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.q qVar = new x2.q(ApplicationLoader.applicationContext, new qb.b(25));
        this.f28326f = qVar;
        if (z11) {
            x2.j e = qVar.e();
            e.getClass();
            x2.i iVar = new x2.i(e);
            iVar.E.add(1);
            qVar.b(new x2.j(iVar));
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
    public final void b(u2.b0 b0Var) {
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
    public final void d(b2.b1 b1Var, of.b bVar) {
    }

    @Override
    public final void e(j2.a aVar, u2.b0 b0Var) {
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
