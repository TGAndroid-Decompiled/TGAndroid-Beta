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
import k2.u;
import lf.i;
import m2.e;
import n2.m;
import n7.a1;
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
import org.telegram.ui.rs;
import p2.d;
import p2.t;
import qb.b;
import u2.e0;
import y2.o;
public class f71 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f23878j0;
    public static final HashSet f23879k0 = new HashSet();
    public static HashMap f23880l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public c71 J;
    public y61 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public b71 O;
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
    public u2.u0 Z;
    public final int f23881a;
    public final Handler f23882a0;
    public DispatchQueue f23883b;
    public final boolean f23884b0;
    public boolean f23885c;
    public boolean f23886c0;
    public i2.f0 d;
    public int f23887d0;
    public i2.f0 e;
    public boolean f23888e0;
    public final x2.p f23889f;
    public long f23890f0;
    public long f23891g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.cr0 f23892h0;
    public final ArrayList f23893i0;
    public TextureView f23894n;
    public SurfaceView f23895r;
    public Surface f23896s;
    public boolean v;
    public boolean f23897w;
    public boolean f23898x;
    public boolean f23899y;

    public f71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(b71 b71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (b71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b71Var.f22595b);
            sb2.append("x");
            sb2.append(b71Var.f22596c);
            if (b71Var.f22594a) {
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
            if (f23880l0 == null) {
                f23880l0 = new HashMap();
            }
            Boolean bool = (Boolean) f23880l0.get(concat);
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
                                f23880l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f23880l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static d71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((b71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                d71 d71Var = (d71) obj2;
                if (d71Var.b()) {
                    return d71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        b71 b71Var;
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
                    d71 d = d71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f18089id), i11, z10);
                    if (d.f23305i > 0 && d.f23306j > 0) {
                        if (document3 == document) {
                            d.f23301b = true;
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
            d71 d71Var = (d71) arrayList3.get(i14);
            String str2 = d71Var.f23309m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(d71Var.f23309m) && !"hevc".equals(d71Var.f23309m) && !"h265".equals(d71Var.f23309m) && !"vp9".equals(d71Var.f23309m)) || Y(d71Var.f23309m))) {
                arrayList4.add(d71Var);
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
            d71 d71Var2 = (d71) obj;
            if (d71Var2.f23301b) {
                arrayList6.add(new b71(d71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        b71Var = (b71) obj2;
                        if (!b71Var.f22594a && b71Var.f22595b == d71Var2.f23305i && b71Var.f22596c == d71Var2.f23306j) {
                            break;
                        }
                    } else {
                        b71Var = null;
                        break;
                    }
                }
                if (b71Var != null && !SharedConfig.debugVideoQualities) {
                    b71Var.d.add(d71Var2);
                } else {
                    arrayList6.add(new b71(d71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static d71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((b71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                d71 d71Var = (d71) obj2;
                if (d71Var.f23301b && d71Var.b()) {
                    return d71Var;
                }
            }
        }
        int size3 = arrayList.size();
        d71 d71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((b71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                d71 d71Var3 = (d71) obj4;
                if (!d71Var3.f23301b && Y(d71Var3.f23309m) && (d71Var2 == null || (i10 = d71Var3.f23305i * d71Var3.f23306j) > (i11 = d71Var2.f23305i * d71Var2.f23306j) || (i10 == i11 && d71Var3.f23308l < d71Var2.f23308l))) {
                    d71Var2 = d71Var3;
                }
            }
        }
        if (d71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((b71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    d71 d71Var4 = (d71) obj6;
                    if (d71Var2 == null || d71Var2.f23305i * d71Var2.f23306j > d71Var4.f23305i * d71Var4.f23306j || d71Var4.f23308l < d71Var2.f23308l) {
                        d71Var2 = d71Var4;
                    }
                }
            }
        }
        return d71Var2;
    }

    public static d71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((b71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                d71 d71Var = (d71) obj2;
                if (d71Var.b()) {
                    return d71Var;
                }
            }
        }
        int size3 = arrayList.size();
        d71 d71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((b71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                d71 d71Var3 = (d71) obj4;
                if (!d71Var3.f23301b && (d71Var2 == null || d71Var2.f23305i * d71Var2.f23306j > d71Var3.f23305i * d71Var3.f23306j || d71Var3.f23308l < d71Var2.f23308l)) {
                    if (d71Var3.f23305i <= 900 && d71Var3.f23306j <= 900) {
                        d71Var2 = d71Var3;
                    }
                }
            }
        }
        if (d71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((b71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    d71 d71Var4 = (d71) obj6;
                    if (d71Var2 == null || d71Var2.f23305i * d71Var2.f23306j > d71Var4.f23305i * d71Var4.f23306j || d71Var4.f23308l < d71Var2.f23308l) {
                        d71Var2 = d71Var4;
                    }
                }
            }
        }
        return d71Var2;
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
        e9.a1 a1Var = e9.a1.e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        if (b0Var.f2931b != null && b0Var.f2930a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f2930a != null) {
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
            k0Var.f3070b.getClass();
            b2.c0 c0Var2 = k0Var.f3070b.f2987c;
            if (c0Var2 == null) {
                mVar2 = n2.m.f14884z;
            } else {
                synchronized (obj) {
                    try {
                        if (!c0Var2.equals(null)) {
                            mVar = lf.i.x(c0Var2);
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
            return new u2.v0(k0Var, z1Var, dVar, mVar2, bVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.u0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(k0Var);
            }
            if (this.X == null) {
                this.X = new u2.e0(extendedDefaultDataSourceFactory) {
                    public final a f2659a;
                    public final g f2660b;
                    public final i f2661c;
                    public final ob.a d;
                    public final b e;
                    public final long f2662f;
                    public final long f2663g;

                    {
                        a aVar = new a(extendedDefaultDataSourceFactory);
                        this.f2659a = aVar;
                        this.f2660b = extendedDefaultDataSourceFactory;
                        this.f2661c = new i(5);
                        this.e = new b(26);
                        this.f2662f = 30000L;
                        this.f2663g = 5000000L;
                        this.d = new ob.a(23);
                        ((p) aVar.d).f3168b = true;
                    }

                    @Override
                    public final u2.a a(k0 k0Var2) {
                        o oVar;
                        k0Var2.f3070b.getClass();
                        e eVar = new e();
                        List list2 = k0Var2.f3070b.e;
                        if (!list2.isEmpty()) {
                            oVar = new a1(17, eVar, list2);
                        } else {
                            oVar = eVar;
                        }
                        return new l2.g(k0Var2, this.f2660b, oVar, this.f2659a, this.d, this.f2661c.A(k0Var2), this.e, this.f2662f, this.f2663g);
                    }

                    @Override
                    public final e0 b(boolean z11) {
                        ((p) this.f2659a.d).f3168b = z11;
                        return this;
                    }

                    @Override
                    public final e0 c() {
                        ((p) this.f2659a.d).getClass();
                        return this;
                    }

                    @Override
                    public final e0 d(b bVar2) {
                        p pVar = (p) this.f2659a.d;
                        pVar.getClass();
                        pVar.f3169c = bVar2;
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.e0(extendedDefaultDataSourceFactory) {
                public final u f2664a;
                public c f2665b;
                public b f2666c;
                public final i h = new i(5);
                public final t7.u e = new Object();
                public final rs f2667f = d.E;
                public final b f2669i = new b(26);
                public final ob.a f2668g = new ob.a(23);
                public final int f2671k = 1;
                public final long f2672l = -9223372036854775807L;
                public final boolean f2670j = true;
                public boolean d = true;

                {
                    this.f2664a = new u(extendedDefaultDataSourceFactory, 9);
                }

                @Override
                public final e0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final e0 d(b bVar2) {
                    this.f2666c = bVar2;
                    return this;
                }

                @Override
                public final l a(k0 k0Var2) {
                    k0Var2.f3070b.getClass();
                    if (this.f2665b == null) {
                        ?? obj2 = new Object();
                        obj2.f15342a = new b(28);
                        this.f2665b = obj2;
                    }
                    b bVar2 = this.f2666c;
                    if (bVar2 != null) {
                        this.f2665b.f15342a = bVar2;
                    }
                    c cVar = this.f2665b;
                    cVar.f15343b = this.d;
                    cVar.getClass();
                    List list2 = k0Var2.f3070b.e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.e;
                    if (!isEmpty) {
                        tVar = new a1(10, tVar, list2);
                    }
                    m A = this.h.A(k0Var2);
                    this.f2667f.getClass();
                    u uVar = this.f2664a;
                    b bVar3 = this.f2669i;
                    return new l(k0Var2, uVar, cVar, this.f2668g, A, bVar3, new d(uVar, bVar3, tVar), this.f2672l, this.f2670j, this.f2671k);
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
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.K != null) {
            this.f23882a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f23898x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.e;
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
        i2.f0 f0Var4 = this.e;
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
        this.f23886c0 = false;
        this.f23888e0 = false;
        this.G = false;
        this.f23898x = false;
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

    public final void F(ArrayList arrayList, b71 b71Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = b71Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f23886c0 = false;
        this.G = false;
        this.f23898x = false;
        this.F = null;
        this.v = true;
        i();
        this.f23888e0 = false;
        if (b71Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(b71Var);
        } else {
            i10 = -1;
        }
        this.f23887d0 = i10;
        R(true, b71Var);
        if (this.f23886c0) {
            this.f23887d0 = -1;
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
        this.f23888e0 = false;
        this.f23898x = true;
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
        f23879k0.add(Integer.valueOf(this.f23881a));
    }

    public final void H() {
        f23879k0.remove(Integer.valueOf(this.f23881a));
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U0();
            this.d = null;
        }
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.U0();
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
        i2.q1 q1Var;
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (z10) {
                q1Var = i2.q1.d;
            } else {
                q1Var = i2.q1.f10851c;
            }
            f0Var.s1(q1Var);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        i2.q1 q1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f23893i0.add(runnable);
            }
            i2.f0 f0Var = this.d;
            if (z10) {
                q1Var = i2.q1.d;
            } else {
                q1Var = i2.q1.f10851c;
            }
            f0Var.s1(q1Var);
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
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            f0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f23898x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f23897w = z10;
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        i2.f0 f0Var4 = this.e;
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

    public final void R(boolean r21, org.telegram.ui.Components.b71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f71.R(boolean, org.telegram.ui.Components.b71):void");
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
        i2.f0 f0Var2 = this.e;
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
        if (this.f23896s != surface) {
            this.f23896s = surface;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.n(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f23895r != surfaceView) {
            this.f23895r = surfaceView;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.u1(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f23894n != textureView) {
            this.f23894n = textureView;
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
        i2.f0 f0Var2 = this.e;
        if (f0Var2 != null) {
            f0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f23883b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.m0 = new org.telegram.messenger.d1(dispatchQueue);
            return;
        }
        this.d.m0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((f71) objArr[0]) != this && y() && !this.f23899y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            c71 c71Var = this.J;
            if (c71Var != null) {
                c71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f23893i0;
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
        boolean z10 = this.f23885c;
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
                lVar = new z61(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new i2.l(ApplicationLoader.applicationContext);
            }
            lVar.f10760c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            e2.d.g(!pVar.v);
            pVar.f10798c = new i2.o(lVar, 2);
            x2.p pVar2 = this.f23889f;
            e2.d.g(!pVar.v);
            pVar2.getClass();
            pVar.e = new i2.o(pVar2, 1);
            e2.d.g(!pVar.v);
            pVar.f10799f = new i2.o(kVar, 0);
            e2.d.g(!pVar.v);
            pVar.v = true;
            i2.f0 f0Var = new i2.f0(pVar);
            this.d = f0Var;
            j2.f fVar = f0Var.f10675s;
            fVar.getClass();
            fVar.f12567f.a(this);
            this.d.f10668m.a(this);
            this.d.f10670n0.add(this);
            TextureView textureView = this.f23894n;
            if (textureView != null) {
                this.d.v1(textureView);
            } else {
                Surface surface = this.f23896s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.f23895r;
                    if (surfaceView != null) {
                        this.d.u1(surfaceView);
                    }
                }
            }
            this.d.X(this.f23897w);
            i2.f0 f0Var2 = this.d;
            if (this.V) {
                i12 = 2;
            }
            f0Var2.j(i12);
        }
        if (this.f23898x && this.e == null) {
            i2.p pVar3 = new i2.p(ApplicationLoader.applicationContext);
            x2.p pVar4 = this.f23889f;
            e2.d.g(!pVar3.v);
            pVar4.getClass();
            pVar3.e = new i2.o(pVar4, 1);
            e2.d.g(!pVar3.v);
            pVar3.f10799f = new i2.o(kVar, 0);
            e2.d.g(!pVar3.v);
            pVar3.v = true;
            i2.f0 f0Var3 = new i2.f0(pVar3);
            this.e = f0Var3;
            f0Var3.f10668m.a(new x61(this));
            this.e.X(this.f23897w);
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

    public final of.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i10 = org.telegram.ui.Cells.q3.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            of.e eVar = new of.e(this.Q, str5, i10);
            eVar.e = str2;
            eVar.f15501f = str3;
            return new of.g(new of.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((b71) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                d71 d71Var = (d71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(d71Var.f23302c);
                String sb3 = sb2.toString();
                TLRPC.Document document = d71Var.f23304g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                of.e eVar2 = new of.e(d71Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f15501f = str3;
                int i13 = d71Var.f23305i;
                int i14 = d71Var.f23306j;
                eVar2.f15498a = i13;
                eVar2.f15499b = i14;
                arrayList.add(new of.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new of.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.B1();
            b2.s sVar = f0Var.Q;
            if (sVar != null && sVar.f3297n != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((b71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        d71 d71Var = (d71) obj2;
                        if (d71Var.f23302c == sVar.f3297n) {
                            return d71Var.f23304g;
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
        long j3 = this.f23891g0;
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
        if (this.f23887d0 == -1) {
            try {
                if (this.f23886c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f22594a) {
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
                            b71 u10 = u(i11);
                            if (!u10.f22594a && sVar.f3307y == u10.f22595b && sVar.f3308z == u10.f22596c && sVar.f3293j == ((int) Math.floor(((d71) u10.d.get(0)).f23308l * 8.0d))) {
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
        return this.f23887d0;
    }

    @Override
    public final void onCues(d2.d dVar) {
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new ar0(16, this, u0Var));
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
            this.f23882a0.removeCallbacksAndMessages(null);
            y61 y61Var = this.K;
            if (y61Var != null) {
                y61Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f23891g0 = -9223372036854775807L;
        this.f23890f0 = -9223372036854775807L;
        c71 c71Var = this.J;
        if (c71Var != null) {
            c71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        c71 c71Var = this.J;
        if (c71Var != null) {
            c71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        org.telegram.ui.cr0 cr0Var = this.f23892h0;
        if (cr0Var != null) {
            AndroidUtilities.runOnUIThread(cr0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.cr0 cr0Var = this.f23892h0;
        if (cr0Var != null) {
            AndroidUtilities.runOnUIThread(cr0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (!Objects.equals(x1Var, b2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f3344a, x1Var.f3345b, 0, x1Var.f3346c);
        }
    }

    public final long p() {
        long j3 = this.f23890f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final ci.k8 q(ci.k8 k8Var) {
        ci.k8 k8Var2 = k8Var;
        if (k8Var == null) {
            k8Var2 = new Object();
        }
        try {
            i2.f0 f0Var = this.d;
            f0Var.B1();
            MediaFormat mediaFormat = ((r2.r) f0Var.f10657g[0]).f41933d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    k8Var2.f4903b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    k8Var2.f4902a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return k8Var2;
    }

    public final b71 r(Boolean bool) {
        b71 b71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            b71 u10 = u(i10);
            if (u10.f22594a == bool.booleanValue() && (b71Var == null || b71Var.f22595b * b71Var.f22596c < u10.f22595b * u10.f22596c)) {
                b71Var = u10;
            }
        }
        return b71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final b71 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (b71) this.N.get(i10);
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
        if (!this.f23898x || !this.I) {
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
            ArrayList arrayList3 = ((b71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                d71 d71Var = (d71) obj2;
                long j3 = d71Var.f23302c;
                Uri uri = d71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(d71Var.e, d71Var.f23303f);
                if (d71Var.f23303f != null) {
                    this.P.add(d71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(d71Var.f23308l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(d71Var.f23305i);
                    sb3.append("x");
                    sb3.append(d71Var.f23306j);
                    String str2 = d71Var.f23309m;
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
                    if (d71Var.b() && d71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(d71Var.f23302c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(d71Var.f23300a);
                    sb3.append("\"\n");
                    if (d71Var.c()) {
                        sb3.append(d71Var.f23303f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(d71Var.e);
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

    public f71(boolean z10, boolean z11) {
        int i10 = f23878j0;
        f23878j0 = i10 + 1;
        this.f23881a = i10;
        this.f23882a0 = new Handler(Looper.getMainLooper());
        this.f23886c0 = false;
        this.f23887d0 = -1;
        this.f23890f0 = -9223372036854775807L;
        this.f23891g0 = -9223372036854775807L;
        this.f23893i0 = new ArrayList();
        this.f23884b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new qb.b(25));
        this.f23889f = pVar;
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
