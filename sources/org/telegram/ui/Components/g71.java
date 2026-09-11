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
import ji.u4;
import m2.e;
import m2.t;
import n2.m;
import n7.z0;
import na.d;
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
import org.telegram.ui.sw0;
import p2.s;
import qb.b;
import u2.e0;
import y2.o;
public class g71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f26295j0;
    public static final HashSet f26296k0 = new HashSet();
    public static HashMap f26297l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public d71 J;
    public z61 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public c71 O;
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
    public u2.v0 Z;
    public final int f26298a;
    public final Handler f26299a0;
    public DispatchQueue f26300b;
    public final boolean f26301b0;
    public boolean f26302c;
    public boolean f26303c0;
    public i2.f0 d;
    public int f26304d0;
    public i2.f0 f26305e;
    public boolean f26306e0;
    public final x2.p f26307f;
    public long f26308f0;
    public long f26309g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.ir0 f26310h0;
    public final ArrayList f26311i0;
    public TextureView f26312n;
    public SurfaceView f26313r;
    public Surface f26314s;
    public boolean v;
    public boolean f26315w;
    public boolean f26316x;
    public boolean f26317y;

    public g71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(c71 c71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (c71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c71Var.f24916b);
            sb2.append("x");
            sb2.append(c71Var.f24917c);
            if (c71Var.f24915a) {
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f26297l0 == null) {
                f26297l0 = new HashMap();
            }
            Boolean bool = (Boolean) f26297l0.get(concat);
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
                                f26297l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f26297l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static e71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                if (e71Var.b()) {
                    return e71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        c71 c71Var;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    e71 d = e71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f19875id), i11, z10);
                    if (d.f25585i > 0 && d.f25586j > 0) {
                        if (document3 == document) {
                            d.f25580b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            e71 e71Var = (e71) arrayList3.get(i14);
            String str2 = e71Var.f25589m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(e71Var.f25589m) && !"hevc".equals(e71Var.f25589m) && !"h265".equals(e71Var.f25589m) && !"vp9".equals(e71Var.f25589m)) || Y(e71Var.f25589m))) {
                arrayList4.add(e71Var);
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
            e71 e71Var2 = (e71) obj;
            if (e71Var2.f25580b) {
                arrayList6.add(new c71(e71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        c71Var = (c71) obj2;
                        if (!c71Var.f24915a && c71Var.f24916b == e71Var2.f25585i && c71Var.f24917c == e71Var2.f25586j) {
                            break;
                        }
                    } else {
                        c71Var = null;
                        break;
                    }
                }
                if (c71Var != null && !SharedConfig.debugVideoQualities) {
                    c71Var.d.add(e71Var2);
                } else {
                    arrayList6.add(new c71(e71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static e71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                e71 e71Var = (e71) obj2;
                if (e71Var.f25580b && e71Var.b()) {
                    return e71Var;
                }
            }
        }
        int size3 = arrayList.size();
        e71 e71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((c71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                e71 e71Var3 = (e71) obj4;
                if (!e71Var3.f25580b && Y(e71Var3.f25589m) && (e71Var2 == null || (i10 = e71Var3.f25585i * e71Var3.f25586j) > (i11 = e71Var2.f25585i * e71Var2.f25586j) || (i10 == i11 && e71Var3.f25588l < e71Var2.f25588l))) {
                    e71Var2 = e71Var3;
                }
            }
        }
        if (e71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((c71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    e71 e71Var4 = (e71) obj6;
                    if (e71Var2 == null || e71Var2.f25585i * e71Var2.f25586j > e71Var4.f25585i * e71Var4.f25586j || e71Var4.f25588l < e71Var2.f25588l) {
                        e71Var2 = e71Var4;
                    }
                }
            }
        }
        return e71Var2;
    }

    public static e71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((c71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                if (e71Var.b()) {
                    return e71Var;
                }
            }
        }
        int size3 = arrayList.size();
        e71 e71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((c71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                e71 e71Var3 = (e71) obj4;
                if (!e71Var3.f25580b && (e71Var2 == null || e71Var2.f25585i * e71Var2.f25586j > e71Var3.f25585i * e71Var3.f25586j || e71Var3.f25588l < e71Var2.f25588l)) {
                    if (e71Var3.f25585i <= 900 && e71Var3.f25586j <= 900) {
                        e71Var2 = e71Var3;
                    }
                }
            }
        }
        if (e71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((c71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    e71 e71Var4 = (e71) obj6;
                    if (e71Var2 == null || e71Var2.f25585i * e71Var2.f25586j > e71Var4.f25585i * e71Var4.f25586j || e71Var4.f25588l < e71Var2.f25588l) {
                        e71Var2 = e71Var4;
                    }
                }
            }
        }
        return e71Var2;
    }

    public final u2.a A(Uri uri, String str, long j3) {
        boolean z10;
        b2.d0 d0Var;
        b2.f0 f0Var;
        n2.m mVar;
        n2.m mVar2;
        b2.c0 c0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.y yVar = new b2.y();
        b2.b0 b0Var = new b2.b0();
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var = e9.a1.f8920e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        if (b0Var.f1971b != null && b0Var.f1970a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f1970a != null) {
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
            bi.p1 p1Var = new bi.p1(this, j3, 7);
            rg.p2 p2Var = new rg.p2(new c3.m(), 4);
            Object obj = new Object();
            rb.a aVar = new rb.a(26);
            f0Var.getClass();
            k0Var.f2127b.getClass();
            b2.c0 c0Var2 = k0Var.f2127b.f2034c;
            if (c0Var2 == null) {
                mVar2 = n2.m.f16404z;
            } else {
                synchronized (obj) {
                    try {
                        if (!c0Var2.equals(null)) {
                            mVar = m2.t.s(c0Var2);
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
            return new u2.w0(k0Var, p1Var, p2Var, mVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.v0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(k0Var);
            }
            if (this.X == null) {
                this.X = new u2.e0(extendedDefaultDataSourceFactory) {
                    public final a f1684a;
                    public final g f1685b;
                    public final t f1686c;
                    public final b d;
                    public final rb.a f1687e;
                    public final long f1688f;
                    public final long f1689g;

                    {
                        a aVar2 = new a(extendedDefaultDataSourceFactory);
                        this.f1684a = aVar2;
                        this.f1685b = extendedDefaultDataSourceFactory;
                        this.f1686c = new t(4);
                        this.f1687e = new rb.a(26);
                        this.f1688f = 30000L;
                        this.f1689g = 5000000L;
                        this.d = new b(23);
                        ((p) aVar2.d).f2232b = true;
                    }

                    @Override
                    public final u2.a a(k0 k0Var2) {
                        o oVar;
                        k0Var2.f2127b.getClass();
                        e eVar = new e();
                        List list2 = k0Var2.f2127b.f2035e;
                        if (!list2.isEmpty()) {
                            oVar = new z0(17, eVar, list2);
                        } else {
                            oVar = eVar;
                        }
                        return new l2.g(k0Var2, this.f1685b, oVar, this.f1684a, this.d, this.f1686c.w(k0Var2), this.f1687e, this.f1688f, this.f1689g);
                    }

                    @Override
                    public final e0 b(boolean z11) {
                        ((p) this.f1684a.d).f2232b = z11;
                        return this;
                    }

                    @Override
                    public final e0 c() {
                        ((p) this.f1684a.d).getClass();
                        return this;
                    }

                    @Override
                    public final e0 d(rb.a aVar2) {
                        p pVar = (p) this.f1684a.d;
                        pVar.getClass();
                        pVar.f2233c = aVar2;
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.e0(extendedDefaultDataSourceFactory) {
                public final u4 f1690a;
                public c f1691b;
                public rb.a f1692c;
                public final t h = new t(4);
                public final d f1693e = new Object();
                public final sw0 f1694f = p2.c.E;
                public final rb.a f1696i = new rb.a(26);
                public final b f1695g = new b(23);
                public final int f1698k = 1;
                public final long f1699l = -9223372036854775807L;
                public final boolean f1697j = true;
                public boolean d = true;

                {
                    this.f1690a = new u4(extendedDefaultDataSourceFactory, 8);
                }

                @Override
                public final e0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final e0 d(rb.a aVar2) {
                    this.f1692c = aVar2;
                    return this;
                }

                @Override
                public final l a(k0 k0Var2) {
                    k0Var2.f2127b.getClass();
                    if (this.f1691b == null) {
                        ?? obj2 = new Object();
                        obj2.f16843a = new rb.a(28);
                        this.f1691b = obj2;
                    }
                    rb.a aVar2 = this.f1692c;
                    if (aVar2 != null) {
                        this.f1691b.f16843a = aVar2;
                    }
                    c cVar = this.f1691b;
                    cVar.f16844b = this.d;
                    cVar.getClass();
                    List list2 = k0Var2.f2127b.f2035e;
                    boolean isEmpty = list2.isEmpty();
                    s sVar = this.f1693e;
                    if (!isEmpty) {
                        sVar = new z0(10, sVar, list2);
                    }
                    m w10 = this.h.w(k0Var2);
                    this.f1694f.getClass();
                    u4 u4Var = this.f1690a;
                    rb.a aVar3 = this.f1696i;
                    return new l(k0Var2, u4Var, cVar, this.f1695g, w10, aVar3, new p2.c(u4Var, aVar3, sVar), this.f1699l, this.f1697j, this.f1698k);
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X(false);
        }
        i2.f0 f0Var2 = this.f26305e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.K != null) {
            this.f26299a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f26316x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.f26305e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(true);
        }
        i2.f0 f0Var4 = this.f26305e;
        if (f0Var4 != null) {
            f0Var4.X(true);
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
        this.f26303c0 = false;
        this.f26306e0 = false;
        this.G = false;
        this.f26316x = false;
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

    public final void F(ArrayList arrayList, c71 c71Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = c71Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f26303c0 = false;
        this.G = false;
        this.f26316x = false;
        this.F = null;
        this.v = true;
        i();
        this.f26306e0 = false;
        if (c71Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(c71Var);
        } else {
            i10 = -1;
        }
        this.f26304d0 = i10;
        R(true, c71Var);
        if (this.f26303c0) {
            this.f26304d0 = -1;
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
        this.f26306e0 = false;
        this.f26316x = true;
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
        this.f26305e.q1(wVar2, true);
        this.f26305e.b();
        f26296k0.add(Integer.valueOf(this.f26298a));
    }

    public final void H() {
        f26296k0.remove(Integer.valueOf(this.f26298a));
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U0();
            this.d = null;
        }
        i2.f0 f0Var2 = this.f26305e;
        if (f0Var2 != null) {
            f0Var2.U0();
            this.f26305e = null;
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
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (z10) {
                p1Var = i2.p1.d;
            } else {
                p1Var = i2.p1.f11695c;
            }
            f0Var.s1(p1Var);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        i2.p1 p1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f26311i0.add(runnable);
            }
            i2.f0 f0Var = this.d;
            if (z10) {
                p1Var = i2.p1.d;
            } else {
                p1Var = i2.p1.f11695c;
            }
            f0Var.s1(p1Var);
            this.d.W0(5, j3);
        }
    }

    public final void N(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                f0Var.j(i10);
            }
        }
    }

    public final void O(boolean z10) {
        float f7;
        i2.f0 f0Var = this.d;
        float f10 = 1.0f;
        if (f0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            f0Var.U(f7);
        }
        i2.f0 f0Var2 = this.f26305e;
        if (f0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            f0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f26316x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.f26305e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f26315w = z10;
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        i2.f0 f0Var4 = this.f26305e;
        if (f0Var4 != null) {
            f0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                f0Var.f(new b2.v0(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.c71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g71.R(boolean, org.telegram.ui.Components.c71):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            f0Var.K0(new b2.e(0, 0, i12, 1, 0, false), false);
        }
        i2.f0 f0Var2 = this.f26305e;
        if (f0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            f0Var2.K0(new b2.e(0, 0, i11, 1, 0, false), true);
        }
    }

    public final void T(Surface surface) {
        if (this.f26314s != surface) {
            this.f26314s = surface;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.n(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f26313r != surfaceView) {
            this.f26313r = surfaceView;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.u1(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f26312n != textureView) {
            this.f26312n = textureView;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.v1(textureView);
        }
    }

    public final void W(float f7) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U(f7);
        }
        i2.f0 f0Var2 = this.f26305e;
        if (f0Var2 != null) {
            f0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f26300b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.m0 = new org.telegram.messenger.b1(dispatchQueue);
            return;
        }
        this.d.m0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((g71) objArr[0]) != this && y() && !this.f26317y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            d71 d71Var = this.J;
            if (d71Var != null) {
                d71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f26311i0;
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
        i2.m mVar;
        y2.d dVar = new y2.d();
        boolean z10 = this.f26302c;
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
        i2.l.a(i10, 0, "bufferForPlaybackMs", "0");
        i2.l.a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.l.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        i2.l.a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.l.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.l.a(0, 0, "backBufferDurationMs", "0");
        i2.l lVar = new i2.l(dVar, i10, i11);
        if (this.d == null) {
            if (this.K != null) {
                mVar = new a71(ApplicationLoader.applicationContext, this);
            } else {
                mVar = new i2.m(ApplicationLoader.applicationContext);
            }
            mVar.f11636c = 2;
            i2.q qVar = new i2.q(ApplicationLoader.applicationContext);
            e2.d.g(!qVar.v);
            qVar.f11701c = new i2.p(mVar, 2);
            x2.p pVar = this.f26307f;
            e2.d.g(!qVar.v);
            pVar.getClass();
            qVar.f11702e = new i2.p(pVar, 1);
            e2.d.g(!qVar.v);
            qVar.f11703f = new i2.p(lVar, 0);
            e2.d.g(!qVar.v);
            qVar.v = true;
            i2.f0 f0Var = new i2.f0(qVar);
            this.d = f0Var;
            j2.f fVar = f0Var.f11533s;
            fVar.getClass();
            fVar.f13180f.a(this);
            this.d.f11526m.a(this);
            this.d.f11528n0.add(this);
            TextureView textureView = this.f26312n;
            if (textureView != null) {
                this.d.v1(textureView);
            } else {
                Surface surface = this.f26314s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.f26313r;
                    if (surfaceView != null) {
                        this.d.u1(surfaceView);
                    }
                }
            }
            this.d.X(this.f26315w);
            i2.f0 f0Var2 = this.d;
            if (this.V) {
                i12 = 2;
            }
            f0Var2.j(i12);
        }
        if (this.f26316x && this.f26305e == null) {
            i2.q qVar2 = new i2.q(ApplicationLoader.applicationContext);
            x2.p pVar2 = this.f26307f;
            e2.d.g(!qVar2.v);
            pVar2.getClass();
            qVar2.f11702e = new i2.p(pVar2, 1);
            e2.d.g(!qVar2.v);
            qVar2.f11703f = new i2.p(lVar, 0);
            e2.d.g(!qVar2.v);
            qVar2.v = true;
            i2.f0 f0Var3 = new i2.f0(qVar2);
            this.f26305e = f0Var3;
            f0Var3.f11526m.a(new y61(this));
            this.f26305e.X(this.f26315w);
        }
    }

    public final long j() {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.v) {
                return f0Var.c0();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final pf.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i10 = org.telegram.ui.Cells.p6.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            pf.e eVar = new pf.e(this.Q, str5, i10);
            eVar.f44062e = str2;
            eVar.f44063f = str3;
            return new pf.g(new pf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((c71) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                e71 e71Var = (e71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(e71Var.f25581c);
                String sb3 = sb2.toString();
                TLRPC.Document document = e71Var.f25584g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                pf.e eVar2 = new pf.e(e71Var.d, str4, sb3);
                eVar2.f44062e = str2;
                eVar2.f44063f = str3;
                int i13 = e71Var.f25585i;
                int i14 = e71Var.f25586j;
                eVar2.f44059a = i13;
                eVar2.f44060b = i14;
                arrayList.add(new pf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new pf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.B1();
            b2.s sVar = f0Var.Q;
            if (sVar != null && sVar.f2366n != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((c71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        e71 e71Var = (e71) obj2;
                        if (e71Var.f25581c == sVar.f2366n) {
                            return e71Var.f25584g;
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
        long j3 = this.f26309g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.J0();
        }
        return 0L;
    }

    public final int o() {
        if (this.f26304d0 == -1) {
            try {
                if (this.f26303c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f24915a) {
                            return i10;
                        }
                    }
                }
                i2.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.B1();
                    b2.s sVar = f0Var.Q;
                    if (sVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            c71 u10 = u(i11);
                            if (!u10.f24915a && sVar.f2376y == u10.f24916b && sVar.f2377z == u10.f24917c && sVar.f2362j == ((int) Math.floor(((e71) u10.d.get(0)).f25588l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e7) {
                FileLog.e(e7);
                return -1;
            }
        }
        return this.f26304d0;
    }

    @Override
    public final void onCues(d2.c cVar) {
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new jn0(22, this, u0Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean u10 = f0Var.u();
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
            this.f26299a0.removeCallbacksAndMessages(null);
            z61 z61Var = this.K;
            if (z61Var != null) {
                z61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f26309g0 = -9223372036854775807L;
        this.f26308f0 = -9223372036854775807L;
        d71 d71Var = this.J;
        if (d71Var != null) {
            d71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        d71 d71Var = this.J;
        if (d71Var != null) {
            d71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        org.telegram.ui.ir0 ir0Var = this.f26310h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.ir0 ir0Var = this.f26310h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (!Objects.equals(x1Var, b2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f2417a, x1Var.f2418b, 0, x1Var.f2419c);
        }
    }

    public final long p() {
        long j3 = this.f26308f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final di.n8 q(di.n8 n8Var) {
        di.n8 n8Var2 = n8Var;
        if (n8Var == null) {
            n8Var2 = new Object();
        }
        try {
            i2.f0 f0Var = this.d;
            f0Var.B1();
            MediaFormat mediaFormat = ((r2.r) f0Var.f11515g[0]).f44851d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    n8Var2.f7691b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    n8Var2.f7690a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return n8Var2;
    }

    public final c71 r(Boolean bool) {
        c71 c71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            c71 u10 = u(i10);
            if (u10.f24915a == bool.booleanValue() && (c71Var == null || c71Var.f24916b * c71Var.f24917c < u10.f24916b * u10.f24917c)) {
                c71Var = u10;
            }
        }
        return c71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final c71 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (c71) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.B1();
            if (f0Var.Z == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f26316x || !this.I) {
            i2.f0 f0Var = this.d;
            if (f0Var != null && f0Var.u()) {
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
            ArrayList arrayList3 = ((c71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                e71 e71Var = (e71) obj2;
                long j3 = e71Var.f25581c;
                Uri uri = e71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(e71Var.f25582e, e71Var.f25583f);
                if (e71Var.f25583f != null) {
                    this.P.add(e71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(e71Var.f25588l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(e71Var.f25585i);
                    sb3.append("x");
                    sb3.append(e71Var.f25586j);
                    String str2 = e71Var.f25589m;
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
                    if (e71Var.b() && e71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(e71Var.f25581c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(e71Var.f25579a);
                    sb3.append("\"\n");
                    if (e71Var.c()) {
                        sb3.append(e71Var.f25583f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(e71Var.f25582e);
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

    public g71(boolean z10, boolean z11) {
        int i10 = f26295j0;
        f26295j0 = i10 + 1;
        this.f26298a = i10;
        this.f26299a0 = new Handler(Looper.getMainLooper());
        this.f26303c0 = false;
        this.f26304d0 = -1;
        this.f26308f0 = -9223372036854775807L;
        this.f26309g0 = -9223372036854775807L;
        this.f26311i0 = new ArrayList();
        this.f26301b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new rb.a(25));
        this.f26307f = pVar;
        if (z11) {
            x2.i e7 = pVar.e();
            e7.getClass();
            x2.h hVar = new x2.h(e7);
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
    public final void a(i2.h hVar) {
    }

    @Override
    public final void c(u2.b0 b0Var) {
    }

    @Override
    public final void d(b2.x1 x1Var) {
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
    public final void b(b2.b1 b1Var, pf.b bVar) {
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
