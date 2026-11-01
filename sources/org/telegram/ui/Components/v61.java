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
import c5.e;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jb.b;
import l2.f;
import l2.h;
import li.k;
import n2.m;
import o2.c;
import o2.l;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.utils.twidget.t;
import p2.d;
import t7.u;
import u2.f0;
import y2.n;
public class v61 implements b2.d1, b2.a2, j2.b, org.telegram.messenger.vs {
    public static int f31195j0;
    public static final HashSet f31196k0 = new HashSet();
    public static HashMap f31197l0;
    public boolean D;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public t61 J;
    public p61 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public s61 O;
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
    public final int f31198a;
    public final Handler f31199a0;
    public org.telegram.messenger.s5 f31200b;
    public final boolean f31201b0;
    public boolean f31202c;
    public boolean f31203c0;
    public i2.i0 d;
    public int f31204d0;
    public i2.i0 e;
    public boolean f31205e0;
    public final x2.o f31206f;
    public long f31207f0;
    public long f31208g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.oo0 f31209h0;
    public final ArrayList f31210i0;
    public TextureView f31211n;
    public SurfaceView f31212r;
    public Surface f31213s;
    public boolean f31214w;
    public boolean f31215x;
    public boolean f31216y;

    public v61() {
        this(true, false);
    }

    public static boolean D0(String str) {
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
                        org.telegram.messenger.f8.g(e, true);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f31197l0 == null) {
                f31197l0 = new HashMap();
            }
            Boolean bool = (Boolean) f31197l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!org.telegram.messenger.wp.d1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && r2.w.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f31197l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f31197l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static u61 L(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((s61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                u61 u61Var = (u61) obj2;
                if (u61Var.b()) {
                    return u61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        s61 s61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.wp.r1(i10).G6 && arrayList != null) {
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
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    u61 d = u61.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f19800id), i11, z10);
                    if (d.f30875i > 0 && d.f30876j > 0) {
                        if (document3 == document) {
                            d.f30871b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i14 = 0; i14 < arrayList3.size(); i14++) {
            u61 u61Var = (u61) arrayList3.get(i14);
            String str2 = u61Var.f30879m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(u61Var.f30879m) && !"hevc".equals(u61Var.f30879m) && !"h265".equals(u61Var.f30879m) && !"vp9".equals(u61Var.f30879m)) || D0(u61Var.f30879m))) {
                arrayList4.add(u61Var);
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
            u61 u61Var2 = (u61) obj;
            if (u61Var2.f30871b) {
                arrayList6.add(new s61(u61Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        s61Var = (s61) obj2;
                        if (!s61Var.f30224a && s61Var.f30225b == u61Var2.f30875i && s61Var.f30226c == u61Var2.f30876j) {
                            break;
                        }
                    } else {
                        s61Var = null;
                        break;
                    }
                }
                if (s61Var != null && !org.telegram.messenger.uz.R0) {
                    s61Var.d.add(u61Var2);
                } else {
                    arrayList6.add(new s61(u61Var2));
                }
            }
        }
        return arrayList6;
    }

    public static u61 a0(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((s61) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                u61 u61Var = (u61) obj2;
                if (u61Var.f30871b && u61Var.b()) {
                    return u61Var;
                }
            }
        }
        int size3 = arrayList.size();
        u61 u61Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((s61) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                u61 u61Var3 = (u61) obj4;
                if (!u61Var3.f30871b && D0(u61Var3.f30879m) && (u61Var2 == null || (i10 = u61Var3.f30875i * u61Var3.f30876j) > (i11 = u61Var2.f30875i * u61Var2.f30876j) || (i10 == i11 && u61Var3.f30878l < u61Var2.f30878l))) {
                    u61Var2 = u61Var3;
                }
            }
        }
        if (u61Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((s61) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    u61 u61Var4 = (u61) obj6;
                    if (u61Var2 == null || u61Var2.f30875i * u61Var2.f30876j > u61Var4.f30875i * u61Var4.f30876j || u61Var4.f30878l < u61Var2.f30878l) {
                        u61Var2 = u61Var4;
                    }
                }
            }
        }
        return u61Var2;
    }

    public static u61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((s61) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                u61 u61Var = (u61) obj2;
                if (u61Var.b()) {
                    return u61Var;
                }
            }
        }
        int size3 = arrayList.size();
        u61 u61Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((s61) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                u61 u61Var3 = (u61) obj4;
                if (!u61Var3.f30871b && (u61Var2 == null || u61Var2.f30875i * u61Var2.f30876j > u61Var3.f30875i * u61Var3.f30876j || u61Var3.f30878l < u61Var2.f30878l)) {
                    if (u61Var3.f30875i <= 900 && u61Var3.f30876j <= 900) {
                        u61Var2 = u61Var3;
                    }
                }
            }
        }
        if (u61Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((s61) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    u61 u61Var4 = (u61) obj6;
                    if (u61Var2 == null || u61Var2.f30875i * u61Var2.f30876j > u61Var4.f30875i * u61Var4.f30876j || u61Var4.f30878l < u61Var2.f30878l) {
                        u61Var2 = u61Var4;
                    }
                }
            }
        }
        return u61Var2;
    }

    public static void n0(org.telegram.messenger.kj kjVar, boolean z10) {
        if (kjVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.kj.B0(kjVar.f16690k) + "_" + kjVar.f1() + "loop", z10).apply();
    }

    public static void o0(s61 s61Var, org.telegram.messenger.kj kjVar) {
        String str;
        if (kjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
        int f12 = kjVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.w0.f18945b.getSharedPreferences("media_saved_pos", 0).edit();
        if (s61Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str2 = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(s61Var.f30225b);
            sb2.append("x");
            sb2.append(s61Var.f30226c);
            if (s61Var.f30224a) {
                str = "s";
            } else {
                str = "";
            }
            sb2.append(str);
            edit.putString(str2, sb2.toString());
        }
        edit.apply();
    }

    public final void A0(TextureView textureView) {
        if (this.f31211n != textureView) {
            this.f31211n = textureView;
            i2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.z1(textureView);
        }
    }

    @Override
    public final void B(j2.a aVar, int i10) {
        if (i10 == 1) {
            t61 t61Var = this.J;
            if (t61Var != null) {
                t61Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f31210i0;
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

    public final void B0(float f7) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.S(f7);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.S(f7);
        }
    }

    public final void C0(org.telegram.messenger.s5 s5Var) {
        this.f31200b = s5Var;
        if (s5Var != null) {
            this.d.f7929s0 = new o61(s5Var);
            return;
        }
        this.d.f7929s0 = null;
    }

    public final void G() {
        int i10;
        i2.j jVar;
        HashMap hashMap = new HashMap();
        hashMap.put(j2.l.f9381c.f9382a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.f31202c;
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
        i2.h.a(i10, 0, "bufferForPlaybackMs", "0");
        i2.h.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i2.h.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        i2.h.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        i2.h.a(0, 0, "backBufferDurationMs", "0");
        i2.h hVar = new i2.h(dVar, 50000, i10, i10, i12, i12, false, hashMap);
        if (this.d == null) {
            if (this.K != null) {
                jVar = new q61(org.telegram.messenger.w0.f18945b, this);
            } else {
                jVar = new i2.j(org.telegram.messenger.w0.f18945b);
            }
            jVar.f7941c = 1;
            i2.n nVar = new i2.n(org.telegram.messenger.w0.f18945b);
            v7.t6.p(!nVar.f8009z);
            nVar.f7990c = new i2.m(jVar, 2);
            x2.o oVar = this.f31206f;
            v7.t6.p(!nVar.f8009z);
            oVar.getClass();
            nVar.e = new i2.m(oVar, 1);
            v7.t6.p(!nVar.f8009z);
            nVar.f7991f = new i2.m(hVar, 0);
            i2.i0 a2 = nVar.a();
            this.d = a2;
            j2.g gVar = a2.f7928s;
            gVar.getClass();
            gVar.f9355f.a(this);
            this.d.f7917m.a(this);
            this.d.f7931t0.add(this);
            TextureView textureView = this.f31211n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f31213s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f31212r;
                    if (surfaceView != null) {
                        i2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.R(surfaceView.getHolder());
                    }
                }
            }
            this.d.W(this.f31215x);
            i2.i0 i0Var2 = this.d;
            if (this.V) {
                i13 = 2;
            }
            i0Var2.k(i13);
        }
        if (this.f31216y && this.e == null) {
            i2.n nVar2 = new i2.n(org.telegram.messenger.w0.f18945b);
            x2.o oVar2 = this.f31206f;
            v7.t6.p(!nVar2.f8009z);
            oVar2.getClass();
            nVar2.e = new i2.m(oVar2, 1);
            v7.t6.p(true ^ nVar2.f8009z);
            nVar2.f7991f = new i2.m(hVar, 0);
            i2.i0 a10 = nVar2.a();
            this.e = a10;
            a10.f7917m.a(new e2.z(this, 3));
            this.e.W(this.f31215x);
        }
    }

    @Override
    public final void H(b2.y0 y0Var) {
        org.telegram.messenger.i0.g3(new hi0(24, this, y0Var));
    }

    public final long J() {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (this.f31214w) {
                return i0Var.c0();
            }
            return i0Var.getDuration();
        }
        return 0L;
    }

    @Override
    public final void K(int i10, boolean z10) {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean t10 = i0Var.t();
            int h = this.d.h();
            if (this.M != t10 || this.L != h) {
                this.J.onStateChanged(t10, h);
                this.M = t10;
                this.L = h;
            }
        }
        if (z10 && i10 == 3 && !c0() && this.W) {
            org.telegram.messenger.at.e().k(org.telegram.messenger.at.H4, this);
        }
        if (!this.G && i10 == 3) {
            this.G = true;
            if (this.H && this.I) {
                h0();
            }
        }
        if (i10 != 3) {
            this.f31199a0.removeCallbacksAndMessages(null);
            p61 p61Var = this.K;
            if (p61Var != null) {
                p61Var.B(false, null);
            }
        }
    }

    @Override
    public final void N(b2.w1 w1Var) {
        org.telegram.ui.oo0 oo0Var = this.f31209h0;
        if (oo0Var != null) {
            org.telegram.messenger.i0.g3(oo0Var);
        }
    }

    public final bi.j4 Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String h = sc.e.h("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            hf.e eVar = new hf.e(this.Q, str5, h);
            eVar.e = str2;
            eVar.f7673f = str3;
            return new bi.j4(new hf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((s61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                u61 u61Var = (u61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(u61Var.f30872c);
                String sb3 = sb2.toString();
                TLRPC.Document document = u61Var.f30874g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                hf.e eVar2 = new hf.e(u61Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f7673f = str3;
                int i12 = u61Var.f30875i;
                int i13 = u61Var.f30876j;
                eVar2.f7670a = i12;
                eVar2.f7671b = i13;
                arrayList.add(new hf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new bi.j4(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            b2.x xVar = i0Var.S;
            if (xVar != null && xVar.f2419o != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((s61) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        u61 u61Var = (u61) obj2;
                        if (u61Var.f30872c == xVar.f2419o) {
                            return u61Var.f30874g;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long S() {
        long j10 = this.f31208g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.M0();
        }
        return 0L;
    }

    public final int T() {
        if (this.f31204d0 == -1) {
            try {
                if (this.f31203c0) {
                    for (int i10 = 0; i10 < Y(); i10++) {
                        if (Z(i10).f30224a) {
                            return i10;
                        }
                    }
                }
                i2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    b2.x xVar = i0Var.S;
                    if (xVar != null) {
                        for (int i11 = 0; i11 < Y(); i11++) {
                            s61 Z = Z(i11);
                            if (!Z.f30224a && xVar.f2429z == Z.f30225b && xVar.A == Z.f30226c && xVar.f2414j == ((int) Math.floor(((u61) Z.d.get(0)).f30878l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return -1;
            }
        }
        return this.f31204d0;
    }

    public final long U() {
        long j10 = this.f31207f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final vh.m5 V(vh.m5 m5Var) {
        vh.m5 m5Var2 = m5Var;
        if (m5Var == null) {
            m5Var2 = new Object();
        }
        try {
            i2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((r2.r) i0Var.f7906g[0]).f46274f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    m5Var2.f51498b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    m5Var2.f51497a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return m5Var2;
    }

    public final s61 W(Boolean bool) {
        s61 s61Var = null;
        for (int i10 = 0; i10 < Y(); i10++) {
            s61 Z = Z(i10);
            if (Z.f30224a == bool.booleanValue() && (s61Var == null || s61Var.f30225b * s61Var.f30226c < Z.f30225b * Z.f30226c)) {
                s61Var = Z;
            }
        }
        return s61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final s61 Z(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (s61) this.N.get(i10);
        }
        return W(Boolean.FALSE);
    }

    public final boolean c0() {
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            if (i0Var.f7899b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d(b2.b2 b2Var) {
        if (!Objects.equals(b2Var, b2.b2.d)) {
            this.J.onVideoSizeChanged(b2Var.f1987a, b2Var.f1988b, 0, b2Var.f1989c);
        }
    }

    public final boolean d0() {
        if (!this.f31216y || !this.I) {
            i2.i0 i0Var = this.d;
            if (i0Var != null && i0Var.t()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.H4 && ((v61) objArr[0]) != this && d0() && !this.D) {
            g0();
        }
    }

    public final Uri e0(ArrayList arrayList) {
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
            ArrayList arrayList3 = ((s61) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                u61 u61Var = (u61) obj2;
                long j10 = u61Var.f30872c;
                Uri uri = u61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(u61Var.e, u61Var.f30873f);
                if (u61Var.f30873f != null) {
                    this.P.add(u61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(u61Var.f30878l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(u61Var.f30875i);
                    sb3.append("x");
                    sb3.append(u61Var.f30876j);
                    String str2 = u61Var.f30879m;
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
                    if (u61Var.b() && u61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(u61Var.f30872c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(u61Var.f30870a);
                    sb3.append("\"\n");
                    if (u61Var.c()) {
                        sb3.append(u61Var.f30873f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(u61Var.e);
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

    public final u2.a f0(long j10, Uri uri, String str) {
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
        if (g0Var.f2042b != null && g0Var.f2041a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v7.t6.p(z10);
        if (uri != null) {
            if (g0Var.f2041a != null) {
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
            m4.x0 x0Var = new m4.x0(this, j10, 5);
            rh.d0 d0Var2 = new rh.d0(new c3.m(), 19);
            Object obj = new Object();
            hb.a aVar = new hb.a(27);
            k0Var.getClass();
            p0Var.f2182b.getClass();
            b2.h0 h0Var2 = p0Var.f2182b.f2093c;
            if (h0Var2 == null) {
                mVar2 = n2.m.f13466m;
            } else {
                synchronized (obj) {
                    try {
                        if (!h0Var2.equals(null)) {
                            mVar = li.k.n(h0Var2);
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
            return new u2.y0(p0Var, x0Var, d0Var2, mVar2, aVar, 1048576, null);
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
                    public final a f1719a;
                    public final g f1720b;
                    public final k f1721c;
                    public final kb.a d;
                    public final hb.a e;
                    public final long f1722f;
                    public final long f1723g;

                    {
                        a aVar2 = new a(extendedDefaultDataSourceFactory);
                        this.f1719a = aVar2;
                        this.f1720b = extendedDefaultDataSourceFactory;
                        this.f1721c = new k(7);
                        this.e = new hb.a(27);
                        this.f1722f = 30000L;
                        this.f1723g = 5000000L;
                        this.d = new kb.a(21);
                        ((e) aVar2.d).f3776b = true;
                    }

                    @Override
                    public final u2.a a(p0 p0Var2) {
                        n nVar;
                        p0Var2.f2182b.getClass();
                        m2.e eVar = new m2.e();
                        List list2 = p0Var2.f2182b.e;
                        if (!list2.isEmpty()) {
                            nVar = new m5.e(25, eVar, list2);
                        } else {
                            nVar = eVar;
                        }
                        return new h(p0Var2, this.f1720b, nVar, this.f1719a, this.d, this.f1721c.s(p0Var2), this.e, this.f1722f, this.f1723g);
                    }

                    @Override
                    public final f0 b(boolean z11) {
                        ((e) this.f1719a.d).f3776b = z11;
                        return this;
                    }

                    @Override
                    public final f0 c(int i10) {
                        ((e) this.f1719a.d).f3775a = i10;
                        return this;
                    }

                    @Override
                    public final f0 d(u uVar) {
                        e eVar = (e) this.f1719a.d;
                        eVar.getClass();
                        eVar.f3777c = uVar;
                        return this;
                    }
                };
            }
            return a(p0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.f0(extendedDefaultDataSourceFactory) {
                public final f f1724a;
                public c f1725b;
                public u f1726c;
                public final k f1729i = new k(7);
                public final b f1727f = new b(17);
                public final t f1728g = d.J;
                public final hb.a f1730j = new hb.a(27);
                public final kb.a h = new kb.a(21);
                public final int f1732l = 1;
                public final long f1733m = -9223372036854775807L;
                public final boolean f1731k = true;
                public int e = 3;
                public boolean d = true;

                {
                    this.f1724a = new f(extendedDefaultDataSourceFactory, 6);
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
                    this.f1726c = uVar;
                    return this;
                }

                @Override
                public final l a(p0 p0Var2) {
                    p0Var2.f2182b.getClass();
                    if (this.f1725b == null) {
                        ?? obj2 = new Object();
                        obj2.f13974a = new u(28);
                        obj2.f13976c = 3;
                        this.f1725b = obj2;
                    }
                    u uVar = this.f1726c;
                    if (uVar != null) {
                        this.f1725b.f13974a = uVar;
                    }
                    c cVar = this.f1725b;
                    cVar.f13975b = this.d;
                    cVar.f13976c = this.e;
                    List list2 = p0Var2.f2182b.e;
                    boolean isEmpty = list2.isEmpty();
                    p2.t tVar = this.f1727f;
                    if (!isEmpty) {
                        tVar = new m5.e(17, tVar, list2);
                    }
                    m s10 = this.f1729i.s(p0Var2);
                    this.f1728g.getClass();
                    f fVar = this.f1724a;
                    hb.a aVar2 = this.f1730j;
                    return new l(p0Var2, fVar, cVar, this.h, s10, aVar2, new d(fVar, aVar2, tVar), this.f1733m, this.f1731k, this.f1732l);
                }
            };
        }
        return a(p0Var);
    }

    public void g0() {
        this.I = false;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.W(false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.W(false);
        }
        if (this.K != null) {
            this.f31199a0.removeCallbacksAndMessages(null);
            this.K.B(false, null);
        }
    }

    public void h0() {
        this.I = true;
        if (this.f31216y && (!this.H || !this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.W(false);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.W(false);
                return;
            }
            return;
        }
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.W(true);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.W(true);
        }
    }

    public final void i0(long j10, Uri uri, String str) {
        String str2 = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z10 = false;
        this.U = false;
        this.f31203c0 = false;
        this.f31205e0 = false;
        this.G = false;
        this.f31216y = false;
        this.F = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.f31214w = z10;
        G();
        this.d.u1(f0(j10, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, s61 s61Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = s61Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f31203c0 = false;
        this.G = false;
        this.f31216y = false;
        this.F = null;
        this.f31214w = true;
        G();
        this.f31205e0 = false;
        if (s61Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(s61Var);
        } else {
            i10 = -1;
        }
        this.f31204d0 = i10;
        w0(true, s61Var);
        if (this.f31203c0) {
            this.f31204d0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
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
        this.f31205e0 = false;
        this.f31216y = true;
        this.H = false;
        this.G = false;
        G();
        u2.x xVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            u2.x xVar3 = new u2.x(f0(0L, uri3, str3));
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
        f31196k0.add(Integer.valueOf(this.f31198a));
    }

    public final void m0() {
        f31196k0.remove(Integer.valueOf(this.f31198a));
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            i0Var2.X0();
            this.e = null;
        }
        if (this.W) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.H4);
        }
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f31208g0 = -9223372036854775807L;
        this.f31207f0 = -9223372036854775807L;
        t61 t61Var = this.J;
        if (t61Var != null) {
            t61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        t61 t61Var = this.J;
        if (t61Var != null) {
            t61Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j10) {
        q0(j10, false);
    }

    public final void q0(long j10, boolean z10) {
        i2.v1 v1Var;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (z10) {
                v1Var = i2.v1.d;
            } else {
                v1Var = i2.v1.f8102c;
            }
            i0Var.w1(v1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void r0(long j10, boolean z10, Runnable runnable) {
        i2.v1 v1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f31210i0.add(runnable);
            }
            i2.i0 i0Var = this.d;
            if (z10) {
                v1Var = i2.v1.d;
            } else {
                v1Var = i2.v1.f8102c;
            }
            i0Var.w1(v1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void s0(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                i0Var.k(i10);
            }
        }
    }

    public final void t0(boolean z10) {
        float f7;
        i2.i0 i0Var = this.d;
        float f10 = 1.0f;
        if (i0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            i0Var.S(f7);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            i0Var2.S(f10);
        }
    }

    public void u0(boolean z10) {
        this.I = z10;
        if (z10 && this.f31216y && (!this.H || !this.G)) {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.W(false);
            }
            i2.i0 i0Var2 = this.e;
            if (i0Var2 != null) {
                i0Var2.W(false);
                return;
            }
            return;
        }
        this.f31215x = z10;
        i2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.W(z10);
        }
        i2.i0 i0Var4 = this.e;
        if (i0Var4 != null) {
            i0Var4.W(z10);
        }
    }

    public void v0(float f7) {
        try {
            i2.i0 i0Var = this.d;
            if (i0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                i0Var.c(new b2.z0(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void w(b2.u1 u1Var) {
        org.telegram.ui.oo0 oo0Var = this.f31209h0;
        if (oo0Var != null) {
            org.telegram.messenger.i0.g3(oo0Var);
        }
    }

    public final void w0(boolean r21, org.telegram.ui.Components.s61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v61.w0(boolean, org.telegram.ui.Components.s61):void");
    }

    public final void x0(int i10) {
        int i11;
        int i12;
        i2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            i0Var.N0(new b2.f(0, 0, i12, 1, false, 0, true), false);
        }
        i2.i0 i0Var2 = this.e;
        if (i0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            i0Var2.N0(new b2.f(0, 0, i11, 1, false, 0, true), true);
        }
    }

    public final void y0(Surface surface) {
        if (this.f31213s != surface) {
            this.f31213s = surface;
            i2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f31212r != surfaceView) {
            this.f31212r = surfaceView;
            i2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            i0Var.R(holder);
        }
    }

    public v61(boolean z10, boolean z11) {
        int i10 = f31195j0;
        f31195j0 = i10 + 1;
        this.f31198a = i10;
        this.f31199a0 = new Handler(Looper.getMainLooper());
        this.f31203c0 = false;
        this.f31204d0 = -1;
        this.f31207f0 = -9223372036854775807L;
        this.f31208g0 = -9223372036854775807L;
        this.f31210i0 = new ArrayList();
        this.f31201b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.w0.f18945b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.o oVar = new x2.o(org.telegram.messenger.w0.f18945b, new t7.u(25));
        this.f31206f = oVar;
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
            org.telegram.messenger.at.e().b(this, org.telegram.messenger.at.H4);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override
    public final void A(d2.d dVar) {
    }

    @Override
    public final void D(b2.c1 c1Var) {
    }

    @Override
    public final void E(b2.y0 y0Var) {
    }

    @Override
    public final void F(b2.u0 u0Var) {
    }

    @Override
    public final void I(List list) {
    }

    @Override
    public final void P(boolean z10) {
    }

    @Override
    public final void a(int i10) {
    }

    @Override
    public final void b(i2.d dVar) {
    }

    @Override
    public final void c(int i10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void g(boolean z10) {
    }

    @Override
    public final void h(int i10) {
    }

    @Override
    public final void i(b2.s0 s0Var) {
    }

    @Override
    public final void j(u2.c0 c0Var) {
    }

    @Override
    public final void k(boolean z10) {
    }

    @Override
    public final void l(b2.b2 b2Var) {
    }

    @Override
    public final void m(b2.s0 s0Var) {
    }

    @Override
    public final void p(b2.b1 b1Var) {
    }

    @Override
    public final void q(float f7) {
    }

    @Override
    public final void u(int i10) {
    }

    @Override
    public final void v(b2.y0 y0Var) {
    }

    @Override
    public final void x(boolean z10) {
    }

    @Override
    public final void y(b2.f fVar) {
    }

    @Override
    public final void z(b2.z0 z0Var) {
    }

    @Override
    public final void C(int i10, b2.p0 p0Var) {
    }

    @Override
    public final void M(int i10, int i11) {
    }

    @Override
    public final void O(b2.o1 o1Var, int i10) {
    }

    @Override
    public final void n(j2.a aVar, u2.c0 c0Var) {
    }

    @Override
    public final void o(int i10, boolean z10) {
    }

    @Override
    public final void r(b2.f1 f1Var, hf.b bVar) {
    }

    @Override
    public final void s(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
    }

    @Override
    public final void t(j2.a aVar, int i10, long j10) {
    }
}
