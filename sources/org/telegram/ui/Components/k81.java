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
import la.h;
import m2.e;
import n2.m;
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
import org.telegram.ui.a80;
import p2.s;
import t7.t;
import u2.e0;
import y2.n;
public class k81 implements b2.z0, b2.w1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f27875j0;
    public static final HashSet f27876k0 = new HashSet();
    public static HashMap f27877l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public h81 J;
    public d81 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public g81 O;
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
    public final int f27878a;
    public final Handler f27879a0;
    public DispatchQueue f27880b;
    public final boolean f27881b0;
    public boolean f27882c;
    public boolean f27883c0;
    public i2.f0 d;
    public int f27884d0;
    public i2.f0 f27885e;
    public boolean f27886e0;
    public final x2.p f27887f;
    public long f27888f0;
    public long f27889g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.ir0 f27890h0;
    public final ArrayList f27891i0;
    public TextureView f27892n;
    public SurfaceView f27893r;
    public Surface f27894s;
    public boolean v;
    public boolean f27895w;
    public boolean f27896x;
    public boolean f27897y;

    public k81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(g81 g81Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (g81Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g81Var.f26619b);
            sb2.append("x");
            sb2.append(g81Var.f26620c);
            if (g81Var.f26618a) {
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
            if (f27877l0 == null) {
                f27877l0 = new HashMap();
            }
            Boolean bool = (Boolean) f27877l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && r2.x.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f27877l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f27877l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static i81 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((g81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                i81 i81Var = (i81) obj2;
                if (i81Var.b()) {
                    return i81Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        g81 g81Var;
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
                    i81 d = i81.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f20044id), i11, z10);
                    if (d.f27274i > 0 && d.f27275j > 0) {
                        if (document3 == document) {
                            d.f27269b = true;
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
            i81 i81Var = (i81) arrayList3.get(i14);
            String str2 = i81Var.f27278m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(i81Var.f27278m) && !"hevc".equals(i81Var.f27278m) && !"h265".equals(i81Var.f27278m) && !"vp9".equals(i81Var.f27278m)) || Y(i81Var.f27278m))) {
                arrayList4.add(i81Var);
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
            i81 i81Var2 = (i81) obj;
            if (i81Var2.f27269b) {
                arrayList6.add(new g81(i81Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        g81Var = (g81) obj2;
                        if (!g81Var.f26618a && g81Var.f26619b == i81Var2.f27274i && g81Var.f26620c == i81Var2.f27275j) {
                            break;
                        }
                    } else {
                        g81Var = null;
                        break;
                    }
                }
                if (g81Var != null && !SharedConfig.debugVideoQualities) {
                    g81Var.d.add(i81Var2);
                } else {
                    arrayList6.add(new g81(i81Var2));
                }
            }
        }
        return arrayList6;
    }

    public static i81 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((g81) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                i81 i81Var = (i81) obj2;
                if (i81Var.f27269b && i81Var.b()) {
                    return i81Var;
                }
            }
        }
        int size3 = arrayList.size();
        i81 i81Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((g81) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                i81 i81Var3 = (i81) obj4;
                if (!i81Var3.f27269b && Y(i81Var3.f27278m) && (i81Var2 == null || (i10 = i81Var3.f27274i * i81Var3.f27275j) > (i11 = i81Var2.f27274i * i81Var2.f27275j) || (i10 == i11 && i81Var3.f27277l < i81Var2.f27277l))) {
                    i81Var2 = i81Var3;
                }
            }
        }
        if (i81Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((g81) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    i81 i81Var4 = (i81) obj6;
                    if (i81Var2 == null || i81Var2.f27274i * i81Var2.f27275j > i81Var4.f27274i * i81Var4.f27275j || i81Var4.f27277l < i81Var2.f27277l) {
                        i81Var2 = i81Var4;
                    }
                }
            }
        }
        return i81Var2;
    }

    public static i81 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((g81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                i81 i81Var = (i81) obj2;
                if (i81Var.b()) {
                    return i81Var;
                }
            }
        }
        int size3 = arrayList.size();
        i81 i81Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((g81) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                i81 i81Var3 = (i81) obj4;
                if (!i81Var3.f27269b && (i81Var2 == null || i81Var2.f27274i * i81Var2.f27275j > i81Var3.f27274i * i81Var3.f27275j || i81Var3.f27277l < i81Var2.f27277l)) {
                    if (i81Var3.f27274i <= 900 && i81Var3.f27275j <= 900) {
                        i81Var2 = i81Var3;
                    }
                }
            }
        }
        if (i81Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((g81) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    i81 i81Var4 = (i81) obj6;
                    if (i81Var2 == null || i81Var2.f27274i * i81Var2.f27275j > i81Var4.f27274i * i81Var4.f27275j || i81Var4.f27277l < i81Var2.f27277l) {
                        i81Var2 = i81Var4;
                    }
                }
            }
        }
        return i81Var2;
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
        e9.a1 a1Var = e9.a1.f8715e;
        b2.d0 d0Var2 = new b2.d0();
        b2.g0 g0Var = b2.g0.d;
        if (b0Var.f3244b != null && b0Var.f3243a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.g(z10);
        if (uri != null) {
            if (b0Var.f3243a != null) {
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
            rb.a aVar = new rb.a(26);
            f0Var.getClass();
            k0Var.f3400b.getClass();
            b2.c0 c0Var2 = k0Var.f3400b.f3307c;
            if (c0Var2 == null) {
                mVar2 = n2.m.f16522z;
            } else {
                synchronized (obj) {
                    try {
                        if (!c0Var2.equals(null)) {
                            mVar = la.h.x(c0Var2);
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
            return new u2.w0(k0Var, z1Var, dVar, mVar2, aVar, 1048576, null);
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
                    public final a f2957a;
                    public final g f2958b;
                    public final h f2959c;
                    public final t d;
                    public final rb.a f2960e;
                    public final long f2961f;
                    public final long f2962g;

                    {
                        a aVar2 = new a(extendedDefaultDataSourceFactory);
                        this.f2957a = aVar2;
                        this.f2958b = extendedDefaultDataSourceFactory;
                        this.f2959c = new h(6);
                        this.f2960e = new rb.a(26);
                        this.f2961f = 30000L;
                        this.f2962g = 5000000L;
                        this.d = new Object();
                        ((p) aVar2.d).f3505b = true;
                    }

                    @Override
                    public final u2.a a(k0 k0Var2) {
                        n nVar;
                        k0Var2.f3400b.getClass();
                        e eVar = new e();
                        List list2 = k0Var2.f3400b.f3308e;
                        if (!list2.isEmpty()) {
                            nVar = new n6.t(17, eVar, list2);
                        } else {
                            nVar = eVar;
                        }
                        return new l2.h(k0Var2, this.f2958b, nVar, this.f2957a, this.d, this.f2959c.B(k0Var2), this.f2960e, this.f2961f, this.f2962g);
                    }

                    @Override
                    public final e0 b(boolean z11) {
                        ((p) this.f2957a.d).f3505b = z11;
                        return this;
                    }

                    @Override
                    public final e0 c(ob.a aVar2) {
                        p pVar = (p) this.f2957a.d;
                        pVar.getClass();
                        pVar.f3506c = aVar2;
                        return this;
                    }

                    @Override
                    public final e0 d() {
                        ((p) this.f2957a.d).getClass();
                        return this;
                    }
                };
            }
            return a(k0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.e0(extendedDefaultDataSourceFactory) {
                public final m2.t f2963a;
                public c f2964b;
                public ob.a f2965c;
                public final h h = new h(6);
                public final t f2966e = new Object();
                public final a80 f2967f = p2.c.E;
                public final rb.a f2969i = new rb.a(26);
                public final t f2968g = new Object();
                public final int f2971k = 1;
                public final long f2972l = -9223372036854775807L;
                public final boolean f2970j = true;
                public boolean d = true;

                {
                    this.f2963a = new m2.t(extendedDefaultDataSourceFactory, 4);
                }

                @Override
                public final e0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final e0 c(ob.a aVar2) {
                    this.f2965c = aVar2;
                    return this;
                }

                @Override
                public final l a(k0 k0Var2) {
                    k0Var2.f3400b.getClass();
                    if (this.f2964b == null) {
                        ?? obj2 = new Object();
                        obj2.f16956a = new ob.a(28);
                        this.f2964b = obj2;
                    }
                    ob.a aVar2 = this.f2965c;
                    if (aVar2 != null) {
                        this.f2964b.f16956a = aVar2;
                    }
                    c cVar = this.f2964b;
                    cVar.f16957b = this.d;
                    cVar.getClass();
                    List list2 = k0Var2.f3400b.f3308e;
                    boolean isEmpty = list2.isEmpty();
                    s sVar = this.f2966e;
                    if (!isEmpty) {
                        sVar = new n6.t(10, sVar, list2);
                    }
                    m B = this.h.B(k0Var2);
                    this.f2967f.getClass();
                    m2.t tVar = this.f2963a;
                    rb.a aVar3 = this.f2969i;
                    return new l(k0Var2, tVar, cVar, this.f2968g, B, aVar3, new p2.c(tVar, aVar3, sVar), this.f2972l, this.f2970j, this.f2971k);
                }

                @Override
                public final e0 d() {
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
        i2.f0 f0Var2 = this.f27885e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.K != null) {
            this.f27879a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f27896x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.f27885e;
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
        i2.f0 f0Var4 = this.f27885e;
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
        this.f27883c0 = false;
        this.f27886e0 = false;
        this.G = false;
        this.f27896x = false;
        this.F = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.v = z10;
        i();
        this.d.s1(A(uri, str, j3), true);
        this.d.b();
    }

    public final void F(ArrayList arrayList, g81 g81Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = g81Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f27883c0 = false;
        this.G = false;
        this.f27896x = false;
        this.F = null;
        this.v = true;
        i();
        this.f27886e0 = false;
        if (g81Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(g81Var);
        } else {
            i10 = -1;
        }
        this.f27884d0 = i10;
        R(true, g81Var);
        if (this.f27883c0) {
            this.f27884d0 = -1;
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
        this.f27886e0 = false;
        this.f27896x = true;
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
        this.d.s1(wVar, true);
        this.d.b();
        this.f27885e.s1(wVar2, true);
        this.f27885e.b();
        f27876k0.add(Integer.valueOf(this.f27878a));
    }

    public final void H() {
        f27876k0.remove(Integer.valueOf(this.f27878a));
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U0();
            this.d = null;
        }
        i2.f0 f0Var2 = this.f27885e;
        if (f0Var2 != null) {
            f0Var2.U0();
            this.f27885e = null;
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
                q1Var = i2.q1.f11872c;
            }
            f0Var.u1(q1Var);
            this.d.W0(5, j3);
        }
    }

    public final void M(long j3, boolean z10, Runnable runnable) {
        i2.q1 q1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f27891i0.add(runnable);
            }
            i2.f0 f0Var = this.d;
            if (z10) {
                q1Var = i2.q1.d;
            } else {
                q1Var = i2.q1.f11872c;
            }
            f0Var.u1(q1Var);
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
        i2.f0 f0Var2 = this.f27885e;
        if (f0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            f0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f27896x && (!this.H || !this.G)) {
            i2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            i2.f0 f0Var2 = this.f27885e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f27895w = z10;
        i2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        i2.f0 f0Var4 = this.f27885e;
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

    public final void R(boolean r21, org.telegram.ui.Components.g81 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k81.R(boolean, org.telegram.ui.Components.g81):void");
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
        i2.f0 f0Var2 = this.f27885e;
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
        if (this.f27894s != surface) {
            this.f27894s = surface;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.n(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f27893r != surfaceView) {
            this.f27893r = surfaceView;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.w1(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f27892n != textureView) {
            this.f27892n = textureView;
            i2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.x1(textureView);
        }
    }

    public final void W(float f7) {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.U(f7);
        }
        i2.f0 f0Var2 = this.f27885e;
        if (f0Var2 != null) {
            f0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f27880b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.m0 = new org.telegram.messenger.d1(dispatchQueue);
            return;
        }
        this.d.m0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((k81) objArr[0]) != this && y() && !this.f27897y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            h81 h81Var = this.J;
            if (h81Var != null) {
                h81Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f27891i0;
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
        boolean z10 = this.f27882c;
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
                lVar = new e81(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new i2.l(ApplicationLoader.applicationContext);
            }
            lVar.f11776c = 1;
            i2.p pVar = new i2.p(ApplicationLoader.applicationContext);
            e2.d.g(!pVar.v);
            pVar.f11817c = new i2.o(lVar, 2);
            x2.p pVar2 = this.f27887f;
            e2.d.g(!pVar.v);
            pVar2.getClass();
            pVar.f11818e = new i2.o(pVar2, 1);
            e2.d.g(!pVar.v);
            pVar.f11819f = new i2.o(kVar, 0);
            i2.f0 a2 = pVar.a();
            this.d = a2;
            j2.f fVar = a2.f11683s;
            fVar.getClass();
            fVar.f13694f.a(this);
            this.d.f11676m.a(this);
            this.d.f11678n0.add(this);
            TextureView textureView = this.f27892n;
            if (textureView != null) {
                this.d.x1(textureView);
            } else {
                Surface surface = this.f27894s;
                if (surface != null) {
                    this.d.n(surface);
                } else {
                    SurfaceView surfaceView = this.f27893r;
                    if (surfaceView != null) {
                        this.d.w1(surfaceView);
                    }
                }
            }
            this.d.X(this.f27895w);
            i2.f0 f0Var = this.d;
            if (this.V) {
                i12 = 2;
            }
            f0Var.j(i12);
        }
        if (this.f27896x && this.f27885e == null) {
            i2.p pVar3 = new i2.p(ApplicationLoader.applicationContext);
            x2.p pVar4 = this.f27887f;
            e2.d.g(!pVar3.v);
            pVar4.getClass();
            pVar3.f11818e = new i2.o(pVar4, 1);
            e2.d.g(!pVar3.v);
            pVar3.f11819f = new i2.o(kVar, 0);
            i2.f0 a10 = pVar3.a();
            this.f27885e = a10;
            a10.f11676m.a(new ki.j0(this, 1));
            this.f27885e.X(this.f27895w);
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
            String i10 = sc.v.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            pf.e eVar = new pf.e(this.Q, str5, i10);
            eVar.f45572e = str2;
            eVar.f45573f = str3;
            return new pf.g(new pf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ArrayList arrayList3 = ((g81) obj).d;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                i81 i81Var = (i81) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(i81Var.f27270c);
                String sb3 = sb2.toString();
                TLRPC.Document document = i81Var.f27273g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                pf.e eVar2 = new pf.e(i81Var.d, str4, sb3);
                eVar2.f45572e = str2;
                eVar2.f45573f = str3;
                int i13 = i81Var.f27274i;
                int i14 = i81Var.f27275j;
                eVar2.f45569a = i13;
                eVar2.f45570b = i14;
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
            f0Var.D1();
            b2.s sVar = f0Var.Q;
            if (sVar != null && sVar.f3639n != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((g81) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        i81 i81Var = (i81) obj2;
                        if (i81Var.f27270c == sVar.f3639n) {
                            return i81Var.f27273g;
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
        long j3 = this.f27889g0;
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
        if (this.f27884d0 == -1) {
            try {
                if (this.f27883c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f26618a) {
                            return i10;
                        }
                    }
                }
                i2.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.D1();
                    b2.s sVar = f0Var.Q;
                    if (sVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            g81 u10 = u(i11);
                            if (!u10.f26618a && sVar.f3649y == u10.f26619b && sVar.f3650z == u10.f26620c && sVar.f3635j == ((int) Math.floor(((i81) u10.d.get(0)).f27277l * 8.0d))) {
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
        return this.f27884d0;
    }

    @Override
    public final void onCues(d2.d dVar) {
    }

    @Override
    public final void onPlayerError(b2.u0 u0Var) {
        AndroidUtilities.runOnUIThread(new ci0(27, this, u0Var));
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
            this.f27879a0.removeCallbacksAndMessages(null);
            d81 d81Var = this.K;
            if (d81Var != null) {
                d81Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f27889g0 = -9223372036854775807L;
        this.f27888f0 = -9223372036854775807L;
        h81 h81Var = this.J;
        if (h81Var != null) {
            h81Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        h81 h81Var = this.J;
        if (h81Var != null) {
            h81Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.q1 q1Var) {
        org.telegram.ui.ir0 ir0Var = this.f27890h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.s1 s1Var) {
        org.telegram.ui.ir0 ir0Var = this.f27890h0;
        if (ir0Var != null) {
            AndroidUtilities.runOnUIThread(ir0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.x1 x1Var) {
        if (!Objects.equals(x1Var, b2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f3690a, x1Var.f3691b, 0, x1Var.f3692c);
        }
    }

    public final long p() {
        long j3 = this.f27888f0;
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
            f0Var.D1();
            MediaFormat mediaFormat = ((r2.s) f0Var.f11665g[0]).f46914d0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    k8Var2.f5324b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    k8Var2.f5323a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return k8Var2;
    }

    public final g81 r(Boolean bool) {
        g81 g81Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            g81 u10 = u(i10);
            if (u10.f26618a == bool.booleanValue() && (g81Var == null || g81Var.f26619b * g81Var.f26620c < u10.f26619b * u10.f26620c)) {
                g81Var = u10;
            }
        }
        return g81Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final g81 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (g81) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.D1();
            if (f0Var.Z == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f27896x || !this.I) {
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
            ArrayList arrayList3 = ((g81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                i81 i81Var = (i81) obj2;
                long j3 = i81Var.f27270c;
                Uri uri = i81Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(i81Var.f27271e, i81Var.f27272f);
                if (i81Var.f27272f != null) {
                    this.P.add(i81Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(i81Var.f27277l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(i81Var.f27274i);
                    sb3.append("x");
                    sb3.append(i81Var.f27275j);
                    String str2 = i81Var.f27278m;
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
                    if (i81Var.b() && i81Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(i81Var.f27270c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(i81Var.f27268a);
                    sb3.append("\"\n");
                    if (i81Var.c()) {
                        sb3.append(i81Var.f27272f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(i81Var.f27271e);
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

    public k81(boolean z10, boolean z11) {
        int i10 = f27875j0;
        f27875j0 = i10 + 1;
        this.f27878a = i10;
        this.f27879a0 = new Handler(Looper.getMainLooper());
        this.f27883c0 = false;
        this.f27884d0 = -1;
        this.f27888f0 = -9223372036854775807L;
        this.f27889g0 = -9223372036854775807L;
        this.f27891i0 = new ArrayList();
        this.f27881b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.p pVar = new x2.p(ApplicationLoader.applicationContext, new Object());
        this.f27887f = pVar;
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
    public final void a(i2.g gVar) {
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
