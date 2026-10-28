package org.telegram.ui.Components;

import a8.ng;
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
import d5.f;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k6.c;
import li.e3;
import m2.e;
import m4.w1;
import n2.m;
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
import org.telegram.ui.li1;
import p2.t;
import pa.d;
import u2.a;
import u2.f0;
import u7.s;
import y2.n;
public class t81 implements b2.e1, b2.a2, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f32881j0;
    public static final HashSet f32882k0 = new HashSet();
    public static HashMap f32883l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public q81 J;
    public m81 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public p81 O;
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
    public final int f32884a;
    public final Handler f32885a0;
    public DispatchQueue f32886b;
    public final boolean f32887b0;
    public boolean f32888c;
    public boolean f32889c0;
    public i2.j0 d;
    public int f32890d0;
    public i2.j0 e;
    public boolean f32891e0;
    public final x2.o f32892f;
    public long f32893f0;
    public long f32894g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.zq0 f32895h0;
    public final ArrayList f32896i0;
    public TextureView f32897n;
    public SurfaceView f32898r;
    public Surface f32899s;
    public boolean v;
    public boolean f32900w;
    public boolean f32901x;
    public boolean f32902y;

    public t81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(p81 p81Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (p81Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p81Var.f31525b);
            sb2.append("x");
            sb2.append(p81Var.f31526c);
            if (p81Var.f31524a) {
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
            if (f32883l0 == null) {
                f32883l0 = new HashMap();
            }
            Boolean bool = (Boolean) f32883l0.get(concat);
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
                                f32883l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f32883l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static r81 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r81 r81Var = (r81) obj2;
                if (r81Var.b()) {
                    return r81Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        p81 p81Var;
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
                    r81 d = r81.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f22034id), i11, z10);
                    if (d.f32177i > 0 && d.f32178j > 0) {
                        if (document3 == document) {
                            d.f32173b = true;
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
            r81 r81Var = (r81) arrayList3.get(i14);
            String str2 = r81Var.f32181m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(r81Var.f32181m) && !"hevc".equals(r81Var.f32181m) && !"h265".equals(r81Var.f32181m) && !"vp9".equals(r81Var.f32181m)) || Y(r81Var.f32181m))) {
                arrayList4.add(r81Var);
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
            r81 r81Var2 = (r81) obj;
            if (r81Var2.f32173b) {
                arrayList6.add(new p81(r81Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        p81Var = (p81) obj2;
                        if (!p81Var.f31524a && p81Var.f31525b == r81Var2.f32177i && p81Var.f31526c == r81Var2.f32178j) {
                            break;
                        }
                    } else {
                        p81Var = null;
                        break;
                    }
                }
                if (p81Var != null && !SharedConfig.debugVideoQualities) {
                    p81Var.d.add(r81Var2);
                } else {
                    arrayList6.add(new p81(r81Var2));
                }
            }
        }
        return arrayList6;
    }

    public static r81 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((p81) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                r81 r81Var = (r81) obj2;
                if (r81Var.f32173b && r81Var.b()) {
                    return r81Var;
                }
            }
        }
        int size3 = arrayList.size();
        r81 r81Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((p81) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                r81 r81Var3 = (r81) obj4;
                if (!r81Var3.f32173b && Y(r81Var3.f32181m) && (r81Var2 == null || (i10 = r81Var3.f32177i * r81Var3.f32178j) > (i11 = r81Var2.f32177i * r81Var2.f32178j) || (i10 == i11 && r81Var3.f32180l < r81Var2.f32180l))) {
                    r81Var2 = r81Var3;
                }
            }
        }
        if (r81Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((p81) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    r81 r81Var4 = (r81) obj6;
                    if (r81Var2 == null || r81Var2.f32177i * r81Var2.f32178j > r81Var4.f32177i * r81Var4.f32178j || r81Var4.f32180l < r81Var2.f32180l) {
                        r81Var2 = r81Var4;
                    }
                }
            }
        }
        return r81Var2;
    }

    public static r81 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((p81) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                r81 r81Var = (r81) obj2;
                if (r81Var.b()) {
                    return r81Var;
                }
            }
        }
        int size3 = arrayList.size();
        r81 r81Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((p81) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                r81 r81Var3 = (r81) obj4;
                if (!r81Var3.f32173b && (r81Var2 == null || r81Var2.f32177i * r81Var2.f32178j > r81Var3.f32177i * r81Var3.f32178j || r81Var3.f32180l < r81Var2.f32180l)) {
                    if (r81Var3.f32177i <= 900 && r81Var3.f32178j <= 900) {
                        r81Var2 = r81Var3;
                    }
                }
            }
        }
        if (r81Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((p81) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    r81 r81Var4 = (r81) obj6;
                    if (r81Var2 == null || r81Var2.f32177i * r81Var2.f32178j > r81Var4.f32177i * r81Var4.f32178j || r81Var4.f32180l < r81Var2.f32180l) {
                        r81Var2 = r81Var4;
                    }
                }
            }
        }
        return r81Var2;
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
        f9.s1 s1Var = f9.s1.e;
        b2.i0 i0Var2 = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        if (g0Var.f3208b != null && g0Var.f3207a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.yb.p(z10);
        if (uri != null) {
            if (g0Var.f3207a != null) {
                h0Var = new b2.h0(g0Var);
            } else {
                h0Var = null;
            }
            i0Var = i0Var2;
            k0Var = new b2.k0(uri, null, h0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = i0Var2;
            k0Var = null;
        }
        b2.p0 p0Var = new b2.p0("", new b2.e0(d0Var), k0Var, new b2.j0(i0Var), b2.s0.L, l0Var);
        if (j10 != 0) {
            di.d1 d1Var = new di.d1(this, j10, 7);
            org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(new c3.m(), 22);
            Object obj = new Object();
            u7.s sVar = new u7.s(26);
            k0Var.getClass();
            p0Var.f3345b.getClass();
            b2.h0 h0Var2 = p0Var.f3345b.f3257c;
            if (h0Var2 == null) {
                mVar2 = n2.m.f18628z;
            } else {
                synchronized (obj) {
                    try {
                        if (!h0Var2.equals(null)) {
                            mVar = k6.c.r(h0Var2);
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
            return new u2.y0(p0Var, d1Var, j1Var, mVar2, sVar, 1048576, null);
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
                    public final ng f2882a;
                    public final g f2883b;
                    public final c f2884c;
                    public final d d;
                    public final s e;
                    public final long f2885f;
                    public final long f2886g;

                    {
                        ng ngVar = new ng(extendedDefaultDataSourceFactory);
                        this.f2882a = ngVar;
                        this.f2883b = extendedDefaultDataSourceFactory;
                        this.f2884c = new c(8);
                        this.e = new s(26);
                        this.f2885f = 30000L;
                        this.f2886g = 5000000L;
                        this.d = new Object();
                        ((f) ngVar.d).f7971b = true;
                    }

                    @Override
                    public final a a(p0 p0Var2) {
                        n nVar;
                        p0Var2.f3345b.getClass();
                        e eVar = new e();
                        List list2 = p0Var2.f3345b.e;
                        if (!list2.isEmpty()) {
                            nVar = new m4.c(20, eVar, list2);
                        } else {
                            nVar = eVar;
                        }
                        return new l2.g(p0Var2, this.f2883b, nVar, this.f2882a, this.d, this.f2884c.u(p0Var2), this.e, this.f2885f, this.f2886g);
                    }

                    @Override
                    public final f0 b(qb.a aVar) {
                        f fVar = (f) this.f2882a.d;
                        fVar.getClass();
                        fVar.f7972c = aVar;
                        return this;
                    }

                    @Override
                    public final f0 c(boolean z11) {
                        ((f) this.f2882a.d).f7971b = z11;
                        return this;
                    }

                    @Override
                    public final f0 d(int i10) {
                        ((f) this.f2882a.d).f7970a = i10;
                        return this;
                    }
                };
            }
            return a(p0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.f0(extendedDefaultDataSourceFactory) {
                public final e3 f2887a;
                public o2.c f2888b;
                public qb.a f2889c;
                public final c f2892i = new c(8);
                public final d f2890f = new Object();
                public final li1 f2891g = p2.d.J;
                public final s f2893j = new s(26);
                public final d h = new Object();
                public final int f2895l = 1;
                public final long f2896m = -9223372036854775807L;
                public final boolean f2894k = true;
                public int e = 3;
                public boolean d = true;

                {
                    this.f2887a = new e3(extendedDefaultDataSourceFactory, 5);
                }

                @Override
                public final f0 b(qb.a aVar) {
                    this.f2889c = aVar;
                    return this;
                }

                @Override
                public final f0 c(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 d(int i10) {
                    this.e = i10;
                    return this;
                }

                @Override
                public final l a(p0 p0Var2) {
                    p0Var2.f3345b.getClass();
                    if (this.f2888b == null) {
                        ?? obj2 = new Object();
                        obj2.f18983a = new qb.a(28);
                        obj2.f18985c = 3;
                        this.f2888b = obj2;
                    }
                    qb.a aVar = this.f2889c;
                    if (aVar != null) {
                        this.f2888b.f18983a = aVar;
                    }
                    o2.c cVar = this.f2888b;
                    cVar.f18984b = this.d;
                    cVar.f18985c = this.e;
                    List list2 = p0Var2.f3345b.e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2890f;
                    if (!isEmpty) {
                        tVar = new w1(16, tVar, list2);
                    }
                    m u10 = this.f2892i.u(p0Var2);
                    this.f2891g.getClass();
                    e3 e3Var = this.f2887a;
                    s sVar2 = this.f2893j;
                    return new l(p0Var2, e3Var, cVar, this.h, u10, sVar2, new p2.d(e3Var, sVar2, tVar), this.f2896m, this.f2894k, this.f2895l);
                }
            };
        }
        return a(p0Var);
    }

    public void B() {
        this.I = false;
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.X(false);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.X(false);
        }
        if (this.K != null) {
            this.f32885a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f32901x && (!this.H || !this.G)) {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.X(false);
            }
            i2.j0 j0Var2 = this.e;
            if (j0Var2 != null) {
                j0Var2.X(false);
                return;
            }
            return;
        }
        i2.j0 j0Var3 = this.d;
        if (j0Var3 != null) {
            j0Var3.X(true);
        }
        i2.j0 j0Var4 = this.e;
        if (j0Var4 != null) {
            j0Var4.X(true);
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
        this.f32889c0 = false;
        this.f32891e0 = false;
        this.G = false;
        this.f32901x = false;
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
        this.d.a();
    }

    public final void F(ArrayList arrayList, p81 p81Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = p81Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f32889c0 = false;
        this.G = false;
        this.f32901x = false;
        this.F = null;
        this.v = true;
        i();
        this.f32891e0 = false;
        if (p81Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(p81Var);
        } else {
            i10 = -1;
        }
        this.f32890d0 = i10;
        R(true, p81Var);
        if (this.f32889c0) {
            this.f32890d0 = -1;
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
        this.f32891e0 = false;
        this.f32901x = true;
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
        this.d.a();
        this.e.u1(xVar2, true);
        this.e.a();
        f32882k0.add(Integer.valueOf(this.f32884a));
    }

    public final void H() {
        f32882k0.remove(Integer.valueOf(this.f32884a));
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.X0();
            this.d = null;
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.X0();
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
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            if (z10) {
                t1Var = i2.t1.d;
            } else {
                t1Var = i2.t1.f13765c;
            }
            j0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void M(long j10, boolean z10, Runnable runnable) {
        i2.t1 t1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f32896i0.add(runnable);
            }
            i2.j0 j0Var = this.d;
            if (z10) {
                t1Var = i2.t1.d;
            } else {
                t1Var = i2.t1.f13765c;
            }
            j0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void N(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                j0Var.j(i10);
            }
        }
    }

    public final void O(boolean z10) {
        float f7;
        i2.j0 j0Var = this.d;
        float f10 = 1.0f;
        if (j0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            j0Var.U(f7);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            j0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f32901x && (!this.H || !this.G)) {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                j0Var.X(false);
            }
            i2.j0 j0Var2 = this.e;
            if (j0Var2 != null) {
                j0Var2.X(false);
                return;
            }
            return;
        }
        this.f32900w = z10;
        i2.j0 j0Var3 = this.d;
        if (j0Var3 != null) {
            j0Var3.X(z10);
        }
        i2.j0 j0Var4 = this.e;
        if (j0Var4 != null) {
            j0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.j0 j0Var = this.d;
            if (j0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                j0Var.f(new b2.a1(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.p81 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t81.R(boolean, org.telegram.ui.Components.p81):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            j0Var.N0(new b2.f(0, 0, i12, 1, false, 0, true), false);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            j0Var2.N0(new b2.f(0, 0, i11, 1, false, 0, true), true);
        }
    }

    public final void T(Surface surface) {
        if (this.f32899s != surface) {
            this.f32899s = surface;
            i2.j0 j0Var = this.d;
            if (j0Var == null) {
                return;
            }
            j0Var.y1(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f32898r != surfaceView) {
            this.f32898r = surfaceView;
            i2.j0 j0Var = this.d;
            if (j0Var == null) {
                return;
            }
            j0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            j0Var.T(holder);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f32897n != textureView) {
            this.f32897n = textureView;
            i2.j0 j0Var = this.d;
            if (j0Var == null) {
                return;
            }
            j0Var.z1(textureView);
        }
    }

    public final void W(float f7) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.U(f7);
        }
        i2.j0 j0Var2 = this.e;
        if (j0Var2 != null) {
            j0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f32886b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.f13614s0 = new l81(dispatchQueue);
            return;
        }
        this.d.f13614s0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((t81) objArr[0]) != this && y() && !this.f32902y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            q81 q81Var = this.J;
            if (q81Var != null) {
                q81Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f32896i0;
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
        hashMap.put(j2.j.f15225c.f15226a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.f32888c;
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
                kVar = new n81(ApplicationLoader.applicationContext, this);
            } else {
                kVar = new i2.k(ApplicationLoader.applicationContext);
            }
            kVar.f13633c = 1;
            i2.o oVar = new i2.o(ApplicationLoader.applicationContext);
            a8.yb.p(!oVar.f13690z);
            oVar.f13671c = new i2.n(kVar, 2);
            x2.o oVar2 = this.f32892f;
            a8.yb.p(!oVar.f13690z);
            oVar2.getClass();
            oVar.e = new i2.n(oVar2, 1);
            a8.yb.p(!oVar.f13690z);
            oVar.f13672f = new i2.n(iVar, 0);
            i2.j0 a2 = oVar.a();
            this.d = a2;
            j2.e eVar = a2.f13613s;
            eVar.getClass();
            eVar.f15199f.a(this);
            this.d.f13602m.a(this);
            this.d.f13616t0.add(this);
            TextureView textureView = this.f32897n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f32899s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f32898r;
                    if (surfaceView != null) {
                        i2.j0 j0Var = this.d;
                        j0Var.F1();
                        j0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f32900w);
            i2.j0 j0Var2 = this.d;
            if (this.V) {
                i13 = 2;
            }
            j0Var2.j(i13);
        }
        if (this.f32901x && this.e == null) {
            i2.o oVar3 = new i2.o(ApplicationLoader.applicationContext);
            x2.o oVar4 = this.f32892f;
            a8.yb.p(!oVar3.f13690z);
            oVar4.getClass();
            oVar3.e = new i2.n(oVar4, 1);
            a8.yb.p(true ^ oVar3.f13690z);
            oVar3.f13672f = new i2.n(iVar, 0);
            i2.j0 a10 = oVar3.a();
            this.e = a10;
            a10.f13602m.a(new e2.z(this, 1));
            this.e.X(this.f32900w);
        }
    }

    public final long j() {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            if (this.v) {
                return j0Var.d0();
            }
            return j0Var.getDuration();
        }
        return 0L;
    }

    public final rf.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String j10 = b10.j("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            rf.e eVar = new rf.e(this.Q, str5, j10);
            eVar.e = str2;
            eVar.f47385f = str3;
            return new rf.g(new rf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((p81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                r81 r81Var = (r81) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(r81Var.f32174c);
                String sb3 = sb2.toString();
                TLRPC.Document document = r81Var.f32176g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                rf.e eVar2 = new rf.e(r81Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f47385f = str3;
                int i12 = r81Var.f32177i;
                int i13 = r81Var.f32178j;
                eVar2.f47382a = i12;
                eVar2.f47383b = i13;
                arrayList.add(new rf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new rf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.F1();
            b2.x xVar = j0Var.S;
            if (xVar != null && xVar.f3582o != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((p81) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        r81 r81Var = (r81) obj2;
                        if (r81Var.f32174c == xVar.f3582o) {
                            return r81Var.f32176g;
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
        long j10 = this.f32894g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            return j0Var.M0();
        }
        return 0L;
    }

    public final int o() {
        if (this.f32890d0 == -1) {
            try {
                if (this.f32889c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f31524a) {
                            return i10;
                        }
                    }
                }
                i2.j0 j0Var = this.d;
                if (j0Var != null) {
                    j0Var.F1();
                    b2.x xVar = j0Var.S;
                    if (xVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            p81 u10 = u(i11);
                            if (!u10.f31524a && xVar.f3592z == u10.f31525b && xVar.A == u10.f31526c && xVar.f3577j == ((int) Math.floor(((r81) u10.d.get(0)).f32180l * 8.0d))) {
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
        return this.f32890d0;
    }

    @Override
    public final void onCues(d2.c cVar) {
    }

    @Override
    public final void onPlayerError(b2.z0 z0Var) {
        AndroidUtilities.runOnUIThread(new d71(2, this, z0Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            boolean t10 = j0Var.t();
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
            this.f32885a0.removeCallbacksAndMessages(null);
            m81 m81Var = this.K;
            if (m81Var != null) {
                m81Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f32894g0 = -9223372036854775807L;
        this.f32893f0 = -9223372036854775807L;
        q81 q81Var = this.J;
        if (q81Var != null) {
            q81Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        q81 q81Var = this.J;
        if (q81Var != null) {
            q81Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.u1 u1Var) {
        org.telegram.ui.zq0 zq0Var = this.f32895h0;
        if (zq0Var != null) {
            AndroidUtilities.runOnUIThread(zq0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.w1 w1Var) {
        org.telegram.ui.zq0 zq0Var = this.f32895h0;
        if (zq0Var != null) {
            AndroidUtilities.runOnUIThread(zq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.b2 b2Var) {
        if (!Objects.equals(b2Var, b2.b2.d)) {
            this.J.onVideoSizeChanged(b2Var.f3150a, b2Var.f3151b, 0, b2Var.f3152c);
        }
    }

    public final long p() {
        long j10 = this.f32893f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            return j0Var.getDuration();
        }
        return 0L;
    }

    public final fi.v7 q(fi.v7 v7Var) {
        fi.v7 v7Var2 = v7Var;
        if (v7Var == null) {
            v7Var2 = new Object();
        }
        try {
            i2.j0 j0Var = this.d;
            j0Var.F1();
            MediaFormat mediaFormat = ((r2.r) j0Var.f13591g[0]).f47281f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    v7Var2.f11823b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    v7Var2.f11822a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return v7Var2;
    }

    public final p81 r(Boolean bool) {
        p81 p81Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            p81 u10 = u(i10);
            if (u10.f31524a == bool.booleanValue() && (p81Var == null || p81Var.f31525b * p81Var.f31526c < u10.f31525b * u10.f31526c)) {
                p81Var = u10;
            }
        }
        return p81Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final p81 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (p81) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.F1();
            if (j0Var.f13584b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f32901x || !this.I) {
            i2.j0 j0Var = this.d;
            if (j0Var != null && j0Var.t()) {
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
            ArrayList arrayList3 = ((p81) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                r81 r81Var = (r81) obj2;
                long j10 = r81Var.f32174c;
                Uri uri = r81Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(r81Var.e, r81Var.f32175f);
                if (r81Var.f32175f != null) {
                    this.P.add(r81Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(r81Var.f32180l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(r81Var.f32177i);
                    sb3.append("x");
                    sb3.append(r81Var.f32178j);
                    String str2 = r81Var.f32181m;
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
                    if (r81Var.b() && r81Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(r81Var.f32174c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(r81Var.f32172a);
                    sb3.append("\"\n");
                    if (r81Var.c()) {
                        sb3.append(r81Var.f32175f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(r81Var.e);
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

    public t81(boolean z10, boolean z11) {
        int i10 = f32881j0;
        f32881j0 = i10 + 1;
        this.f32884a = i10;
        this.f32885a0 = new Handler(Looper.getMainLooper());
        this.f32889c0 = false;
        this.f32890d0 = -1;
        this.f32893f0 = -9223372036854775807L;
        this.f32894g0 = -9223372036854775807L;
        this.f32896i0 = new ArrayList();
        this.f32887b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.o oVar = new x2.o(ApplicationLoader.applicationContext, new qb.a(26));
        this.f32892f = oVar;
        if (z11) {
            x2.j j10 = oVar.j();
            j10.getClass();
            x2.i iVar = new x2.i(j10);
            iVar.I.add(1);
            oVar.b(new x2.j(iVar));
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
    public final void d(j2.a aVar, u2.c0 c0Var) {
    }

    @Override
    public final void e(b2.g1 g1Var, n4.s sVar) {
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
