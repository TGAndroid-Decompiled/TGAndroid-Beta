package org.telegram.ui.Components;

import a8.xa;
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
import b3.r;
import bg.w0;
import e2.l0;
import j$.util.Objects;
import j2.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import nb.a;
import o2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.nd0;
import p2.e;
import pb.b;
import q2.m;
import r0.f1;
import r2.c;
import r2.k;
import s2.d;
import s2.t;
import sg.h0;
import x2.f0;
public class f61 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.fs {
    public static int f34959k0;
    public static final HashSet f34960l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public d61 K;
    public z51 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public c61 P;
    public ArrayList Q;
    public Uri R;
    public Uri S;
    public String T;
    public String U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public DashMediaSource$Factory Y;
    public HlsMediaSource$Factory Z;
    public final int f34961a;
    public x2.x0 f34962a0;
    public org.telegram.messenger.r5 f34963b;
    public final Handler f34964b0;
    public boolean f34965c;
    public final boolean f34966c0;
    public l2.f0 d;
    public boolean f34967d0;
    public l2.f0 f34968e;
    public int f34969e0;
    public final a3.s f34970f;
    public boolean f34971f0;
    public long f34972g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long f34973h0;
    public org.telegram.ui.zn0 f34974i0;
    public final ArrayList f34975j0;
    public TextureView f34976n;
    public SurfaceView f34977r;
    public Surface f34978s;
    public boolean f34979w;
    public boolean f34980x;
    public boolean f34981y;

    public f61() {
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
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (m0 == null) {
                m0 = new HashMap();
            }
            Boolean bool = (Boolean) m0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!org.telegram.messenger.mp.g1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i7 = 0; i7 < codecCount; i7++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                    if (!codecInfoAt.isEncoder() && u2.w.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                m0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                m0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static e61 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((c61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                e61 e61Var = (e61) obj2;
                if (e61Var.b()) {
                    return e61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        c61 c61Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.mp.u1(i7).I6 && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i11 = 0;
        while (i11 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i11);
                    i11--;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            i11++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i12);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    e61 d = e61.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.f28409id), i10, z10);
                    if (d.f34628i > 0 && d.f34629j > 0) {
                        if (document3 == document) {
                            d.f34623b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            e61 e61Var = (e61) arrayList3.get(i13);
            String str2 = e61Var.f34632m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(e61Var.f34632m) && !"hevc".equals(e61Var.f34632m) && !"h265".equals(e61Var.f34632m) && !"vp9".equals(e61Var.f34632m)) || D0(e61Var.f34632m))) {
                arrayList4.add(e61Var);
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
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList5.get(i14);
            i14++;
            e61 e61Var2 = (e61) obj;
            if (e61Var2.f34623b) {
                arrayList6.add(new c61(e61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        c61Var = (c61) obj2;
                        if (!c61Var.f33902a && c61Var.f33903b == e61Var2.f34628i && c61Var.f33904c == e61Var2.f34629j) {
                            break;
                        }
                    } else {
                        c61Var = null;
                        break;
                    }
                }
                if (c61Var != null && !org.telegram.messenger.bz.R0) {
                    c61Var.d.add(e61Var2);
                } else {
                    arrayList6.add(new c61(e61Var2));
                }
            }
        }
        return arrayList6;
    }

    public static e61 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((c61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                e61 e61Var = (e61) obj2;
                if (e61Var.f34623b && e61Var.b()) {
                    return e61Var;
                }
            }
        }
        int size3 = arrayList.size();
        e61 e61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((c61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                e61 e61Var3 = (e61) obj4;
                if (!e61Var3.f34623b && D0(e61Var3.f34632m) && (e61Var2 == null || (i7 = e61Var3.f34628i * e61Var3.f34629j) > (i10 = e61Var2.f34628i * e61Var2.f34629j) || (i7 == i10 && e61Var3.f34631l < e61Var2.f34631l))) {
                    e61Var2 = e61Var3;
                }
            }
        }
        if (e61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((c61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    e61 e61Var4 = (e61) obj6;
                    if (e61Var2 == null || e61Var2.f34628i * e61Var2.f34629j > e61Var4.f34628i * e61Var4.f34629j || e61Var4.f34631l < e61Var2.f34631l) {
                        e61Var2 = e61Var4;
                    }
                }
            }
        }
        return e61Var2;
    }

    public static e61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((c61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                e61 e61Var = (e61) obj2;
                if (e61Var.b()) {
                    return e61Var;
                }
            }
        }
        int size3 = arrayList.size();
        e61 e61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((c61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                e61 e61Var3 = (e61) obj4;
                if (!e61Var3.f34623b && (e61Var2 == null || e61Var2.f34628i * e61Var2.f34629j > e61Var3.f34628i * e61Var3.f34629j || e61Var3.f34631l < e61Var2.f34631l)) {
                    if (e61Var3.f34628i <= 900 && e61Var3.f34629j <= 900) {
                        e61Var2 = e61Var3;
                    }
                }
            }
        }
        if (e61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((c61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    e61 e61Var4 = (e61) obj6;
                    if (e61Var2 == null || e61Var2.f34628i * e61Var2.f34629j > e61Var4.f34628i * e61Var4.f34629j || e61Var4.f34631l < e61Var2.f34631l) {
                        e61Var2 = e61Var4;
                    }
                }
            }
        }
        return e61Var2;
    }

    public static void n0(org.telegram.messenger.fj fjVar, boolean z10) {
        if (fjVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.fj.B0(fjVar.f23965k) + "_" + fjVar.e1() + "loop", z10).apply();
    }

    public static void o0(c61 c61Var, org.telegram.messenger.fj fjVar) {
        String str;
        if (fjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
        int e12 = fjVar.e1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26913b.getSharedPreferences("media_saved_pos", 0).edit();
        if (c61Var == null) {
            edit.remove(B0 + "_" + e12 + "q2");
        } else {
            String str2 = B0 + "_" + e12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c61Var.f33903b);
            sb2.append("x");
            sb2.append(c61Var.f33904c);
            if (c61Var.f33902a) {
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
        if (this.f34976n != textureView) {
            this.f34976n = textureView;
            l2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.z1(textureView);
        }
    }

    public final void B0(float f10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.T(f10);
        }
        l2.f0 f0Var2 = this.f34968e;
        if (f0Var2 != null) {
            f0Var2.T(f10);
        }
    }

    @Override
    public final void C(m2.a aVar, int i7) {
        if (i7 == 1) {
            d61 d61Var = this.K;
            if (d61Var != null) {
                d61Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f34975j0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void C0(org.telegram.messenger.r5 r5Var) {
        this.f34963b = r5Var;
        if (r5Var != null) {
            this.d.f19345s0 = new y51(r5Var);
            return;
        }
        this.d.f19345s0 = null;
    }

    @Override
    public final void D(int i7, boolean z10) {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean u10 = f0Var.u();
            int i10 = this.d.i();
            if (this.N != u10 || this.M != i10) {
                this.K.onStateChanged(u10, i10);
                this.N = u10;
                this.M = i10;
            }
        }
        if (z10 && i7 == 3 && !c0() && this.X) {
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.K4, this);
        }
        if (!this.H && i7 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i7 != 3) {
            this.f34964b0.removeCallbacksAndMessages(null);
            z51 z51Var = this.L;
            if (z51Var != null) {
                z51Var.x(false, null);
            }
        }
    }

    @Override
    public final void E(e2.q1 q1Var) {
        org.telegram.ui.zn0 zn0Var = this.f34974i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public final void I() {
        int i7;
        l2.j jVar;
        int i10;
        HashMap hashMap = new HashMap();
        hashMap.put(m2.i.f20518c.f20519a, 144179200);
        b3.e eVar = new b3.e();
        boolean z10 = this.f34965c;
        int i11 = 1000;
        if (z10) {
            i7 = 1000;
        } else {
            i7 = 100;
        }
        if (!z10) {
            i11 = 2000;
        }
        int i12 = i11;
        l2.h.a(i7, 0, "bufferForPlaybackMs", "0");
        l2.h.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l2.h.a(50000, i7, "minBufferMs", "bufferForPlaybackMs");
        l2.h.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        l2.h.a(0, 0, "backBufferDurationMs", "0");
        l2.h hVar = new l2.h(eVar, 50000, i7, i7, i12, i12, false, hashMap);
        if (this.d == null) {
            if (this.L != null) {
                jVar = new a61(org.telegram.messenger.t0.f26913b, this);
            } else {
                jVar = new l2.j(org.telegram.messenger.t0.f26913b);
            }
            jVar.f19412c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.f26913b);
            a8.la.p(!nVar.f19474z);
            nVar.f19454c = new l2.m(jVar, 2);
            a3.s sVar = this.f34970f;
            a8.la.p(!nVar.f19474z);
            sVar.getClass();
            nVar.f19455e = new l2.m(sVar, 1);
            a8.la.p(!nVar.f19474z);
            nVar.f19456f = new l2.m(hVar, 0);
            l2.f0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.d dVar = this.d.f19344s;
            dVar.getClass();
            dVar.f20489f.a(this);
            this.d.f19333m.a(this);
            this.d.f19347t0.add(this);
            TextureView textureView = this.f34976n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f34978s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f34977r;
                    if (surfaceView != null) {
                        l2.f0 f0Var = this.d;
                        f0Var.F1();
                        f0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f34980x);
            l2.f0 f0Var2 = this.d;
            if (this.W) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            f0Var2.k(i10);
        }
        if (this.f34981y && this.f34968e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.f26913b);
            a3.s sVar2 = this.f34970f;
            a8.la.p(!nVar2.f19474z);
            sVar2.getClass();
            nVar2.f19455e = new l2.m(sVar2, 1);
            a8.la.p(true ^ nVar2.f19474z);
            nVar2.f19456f = new l2.m(hVar, 0);
            l2.f0 a11 = nVar2.a();
            this.f34968e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.f34968e.f19333m.a(new h2.z(this, 1));
            this.f34968e.X(this.f34980x);
        }
    }

    public final long K() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.f34979w) {
                return f0Var.d0();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final oi.y3 Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String k10 = p5.c.k("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            v4.x0 x0Var = new v4.x0(this.R, str5, k10);
            x0Var.f59259g = str2;
            x0Var.h = str3;
            return new oi.y3(new wf.e(x0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ArrayList arrayList3 = ((c61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                e61 e61Var = (e61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(e61Var.f34624c);
                String sb3 = sb2.toString();
                TLRPC.Document document = e61Var.f34627g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.x0 x0Var2 = new v4.x0(e61Var.d, str4, sb3);
                x0Var2.f59259g = str2;
                x0Var2.h = str3;
                int i11 = e61Var.f34628i;
                int i12 = e61Var.f34629j;
                x0Var2.f59254a = i11;
                x0Var2.f59255b = i12;
                arrayList.add(new wf.e(x0Var2));
                arrayList2 = arrayList4;
            }
        }
        ?? obj3 = new Object();
        obj3.f22503a = arrayList;
        return obj3;
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            e2.u uVar = f0Var.S;
            if (uVar != null && uVar.f10762o != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((c61) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        e61 e61Var = (e61) obj2;
                        if (e61Var.f34624c == uVar.f10762o) {
                            return e61Var.f34627g;
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
        long j3 = this.f34973h0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.l();
        }
        return 0L;
    }

    public final int T() {
        if (this.f34969e0 == -1) {
            try {
                if (this.f34967d0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).f33902a) {
                            return i7;
                        }
                    }
                }
                l2.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.F1();
                    e2.u uVar = f0Var.S;
                    if (uVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            c61 Z = Z(i10);
                            if (!Z.f33902a && uVar.f10772z == Z.f33903b && uVar.A == Z.f33904c && uVar.f10757j == ((int) Math.floor(((e61) Z.d.get(0)).f34631l * 8.0d))) {
                                return i10;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return -1;
            }
        }
        return this.f34969e0;
    }

    public final long U() {
        long j3 = this.f34972g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final hi.c7 V(hi.c7 c7Var) {
        hi.c7 c7Var2 = c7Var;
        if (c7Var == null) {
            c7Var2 = new Object();
        }
        try {
            l2.f0 f0Var = this.d;
            f0Var.F1();
            MediaFormat mediaFormat = ((u2.r) f0Var.f19322g[0]).f58363g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    c7Var2.f14313b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    c7Var2.f14312a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return c7Var2;
    }

    public final c61 W(Boolean bool) {
        c61 c61Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            c61 Z = Z(i7);
            if (Z.f33902a == bool.booleanValue() && (c61Var == null || c61Var.f33903b * c61Var.f33904c < Z.f33903b * Z.f33904c)) {
                c61Var = Z;
            }
        }
        return c61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final c61 Z(int i7) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            return (c61) this.O.get(i7);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(e2.x1 x1Var) {
        if (!Objects.equals(x1Var, e2.x1.d)) {
            this.K.onVideoSizeChanged(x1Var.f10800a, x1Var.f10801b, 0, x1Var.f10802c);
        }
    }

    public final boolean c0() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            if (f0Var.f19314b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d0() {
        if (!this.f34981y || !this.J) {
            l2.f0 f0Var = this.d;
            if (f0Var != null && f0Var.u()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.K4 && ((f61) objArr[0]) != this && d0() && !this.E) {
            g0();
        }
    }

    public final Uri e0(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.Q = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList3 = ((c61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                e61 e61Var = (e61) obj2;
                long j3 = e61Var.f34624c;
                Uri uri = e61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(e61Var.f34625e, e61Var.f34626f);
                if (e61Var.f34626f != null) {
                    this.Q.add(e61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(e61Var.f34631l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(e61Var.f34628i);
                    sb3.append("x");
                    sb3.append(e61Var.f34629j);
                    String str2 = e61Var.f34632m;
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
                    if (e61Var.b() && e61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(e61Var.f34624c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(e61Var.f34622a);
                    sb3.append("\"\n");
                    if (e61Var.c()) {
                        sb3.append(e61Var.f34626f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(e61Var.f34625e);
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

    public final x2.a f0(long j3, Uri uri, String str) {
        boolean z10;
        e2.e0 e0Var;
        e2.g0 g0Var;
        q2.m mVar;
        q2.m mVar2;
        e2.d0 d0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14071e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (c0Var.f10346b != null && c0Var.f10345a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.la.p(z10);
        if (uri != null) {
            if (c0Var.f10345a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            e0Var = e0Var2;
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            e0Var = e0Var2;
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0("", new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        if (j3 != 0) {
            ai.d0 d0Var2 = new ai.d0(this, j3, 7);
            tg.z1 z1Var = new tg.z1(new f3.m(), 15);
            Object obj = new Object();
            qb.a aVar = new qb.a(4);
            g0Var.getClass();
            l0Var.f10501b.getClass();
            e2.d0 d0Var3 = l0Var.f10501b.f10412c;
            if (d0Var3 == null) {
                mVar2 = q2.m.A;
            } else {
                synchronized (obj) {
                    try {
                        if (!d0Var3.equals(null)) {
                            mVar = org.telegram.ui.nd0.o(d0Var3);
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
            return new x2.y0(l0Var, d0Var2, z1Var, mVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.f34962a0 == null) {
                    this.f34962a0 = new x2.x0(extendedDefaultDataSourceFactory, new f3.m());
                }
                return this.f34962a0.b(l0Var);
            }
            if (this.Y == null) {
                this.Y = new x2.f0(extendedDefaultDataSourceFactory) {
                    public final xa f2608a;
                    public final g f2609b;
                    public final nd0 f2610c;
                    public final a d;
                    public final qb.a f2611e;
                    public final long f2612f;
                    public final long f2613g;

                    {
                        xa xaVar = new xa(extendedDefaultDataSourceFactory);
                        this.f2608a = xaVar;
                        this.f2609b = extendedDefaultDataSourceFactory;
                        this.f2610c = new nd0(7);
                        this.f2611e = new qb.a(4);
                        this.f2612f = 30000L;
                        this.f2613g = 5000000L;
                        this.d = new a(28);
                        ((w0) xaVar.d).f3354a = true;
                    }

                    @Override
                    public final f0 a(a aVar2) {
                        w0 w0Var = (w0) this.f2608a.d;
                        w0Var.getClass();
                        w0Var.f3356c = aVar2;
                        return this;
                    }

                    @Override
                    public final x2.a b(l0 l0Var2) {
                        r rVar;
                        l0Var2.f10501b.getClass();
                        e eVar = new e();
                        List list2 = l0Var2.f10501b.f10413e;
                        if (!list2.isEmpty()) {
                            rVar = new h0(8, eVar, list2);
                        } else {
                            rVar = eVar;
                        }
                        return new h(l0Var2, this.f2609b, rVar, this.f2608a, this.d, this.f2610c.s(l0Var2), this.f2611e, this.f2612f, this.f2613g);
                    }

                    @Override
                    public final f0 c(boolean z11) {
                        ((w0) this.f2608a.d).f3354a = z11;
                        return this;
                    }

                    @Override
                    public final f0 d(int i7) {
                        ((w0) this.f2608a.d).f3355b = i7;
                        return this;
                    }
                };
            }
            return b(l0Var);
        }
        if (this.Z == null) {
            this.Z = new x2.f0(extendedDefaultDataSourceFactory) {
                public final c5 f2614a;
                public c f2615b;
                public a f2616c;
                public final nd0 f2620i = new nd0(7);
                public final b f2618f = new b(24);
                public final f1 f2619g = d.K;
                public final qb.a f2621j = new qb.a(4);
                public final a h = new a(28);
                public final int f2623l = 1;
                public final long f2624m = -9223372036854775807L;
                public final boolean f2622k = true;
                public int f2617e = 3;
                public boolean d = true;

                {
                    this.f2614a = new c5(extendedDefaultDataSourceFactory);
                }

                @Override
                public final f0 a(a aVar2) {
                    this.f2616c = aVar2;
                    return this;
                }

                @Override
                public final f0 c(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 d(int i7) {
                    this.f2617e = i7;
                    return this;
                }

                @Override
                public final k b(l0 l0Var2) {
                    l0Var2.f10501b.getClass();
                    if (this.f2615b == null) {
                        ?? obj2 = new Object();
                        obj2.f56341a = new a(6);
                        obj2.f56343c = 3;
                        this.f2615b = obj2;
                    }
                    a aVar2 = this.f2616c;
                    if (aVar2 != null) {
                        this.f2615b.f56341a = aVar2;
                    }
                    c cVar = this.f2615b;
                    cVar.f56342b = this.d;
                    cVar.f56343c = this.f2617e;
                    List list2 = l0Var2.f10501b.f10413e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2618f;
                    if (!isEmpty) {
                        tVar = new k8.a(tVar, list2, false, 29);
                    }
                    m s5 = this.f2620i.s(l0Var2);
                    this.f2619g.getClass();
                    c5 c5Var = this.f2614a;
                    qb.a aVar3 = this.f2621j;
                    return new k(l0Var2, c5Var, cVar, this.h, s5, aVar3, new d(c5Var, aVar3, tVar), this.f2624m, this.f2622k, this.f2623l);
                }
            };
        }
        return b(l0Var);
    }

    public void g0() {
        this.J = false;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X(false);
        }
        l2.f0 f0Var2 = this.f34968e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.L != null) {
            this.f34964b0.removeCallbacksAndMessages(null);
            this.L.x(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (this.f34981y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f34968e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(true);
        }
        l2.f0 f0Var4 = this.f34968e;
        if (f0Var4 != null) {
            f0Var4.X(true);
        }
    }

    public final void i0(long j3, Uri uri, String str) {
        String str2 = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.T = str;
        this.S = null;
        this.U = null;
        boolean z10 = false;
        this.V = false;
        this.f34967d0 = false;
        this.f34971f0 = false;
        this.H = false;
        this.f34981y = false;
        this.G = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.f34979w = z10;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, c61 c61Var) {
        int i7;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = c61Var;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.f34967d0 = false;
        this.H = false;
        this.f34981y = false;
        this.G = null;
        this.f34979w = true;
        I();
        this.f34971f0 = false;
        if (c61Var != null && (arrayList2 = this.O) != null) {
            i7 = arrayList2.indexOf(c61Var);
        } else {
            i7 = -1;
        }
        this.f34969e0 = i7;
        w0(true, c61Var);
        if (this.f34967d0) {
            this.f34969e0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        x2.x xVar = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.S = uri2;
        this.T = str;
        this.U = str2;
        this.V = true;
        this.f34971f0 = false;
        this.f34981y = true;
        this.I = false;
        this.H = false;
        I();
        x2.x xVar2 = null;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            x2.x xVar3 = new x2.x(f0(0L, uri3, str3));
            if (i7 == 0) {
                xVar = xVar3;
            } else {
                xVar2 = xVar3;
            }
        }
        this.d.u1(xVar, true);
        this.d.a();
        this.f34968e.u1(xVar2, true);
        this.f34968e.a();
        f34960l0.add(Integer.valueOf(this.f34961a));
    }

    public final void m0() {
        f34960l0.remove(Integer.valueOf(this.f34961a));
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X0();
            this.d = null;
        }
        l2.f0 f0Var2 = this.f34968e;
        if (f0Var2 != null) {
            f0Var2.X0();
            this.f34968e = null;
        }
        if (this.X) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.K4);
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.f34973h0 = -9223372036854775807L;
        this.f34972g0 = -9223372036854775807L;
        d61 d61Var = this.K;
        if (d61Var != null) {
            d61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        d61 d61Var = this.K;
        if (d61Var != null) {
            d61Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j3) {
        q0(j3, false);
    }

    public final void q0(long j3, boolean z10) {
        l2.p1 p1Var;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (z10) {
                p1Var = l2.p1.d;
            } else {
                p1Var = l2.p1.f19524c;
            }
            f0Var.w1(p1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z10, Runnable runnable) {
        l2.p1 p1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f34975j0.add(runnable);
            }
            l2.f0 f0Var = this.d;
            if (z10) {
                p1Var = l2.p1.d;
            } else {
                p1Var = l2.p1.f19524c;
            }
            f0Var.w1(p1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void s0(boolean z10) {
        int i7;
        if (this.W != z10) {
            this.W = z10;
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                if (z10) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                f0Var.k(i7);
            }
        }
    }

    public final void t0(boolean z10) {
        float f10;
        l2.f0 f0Var = this.d;
        float f11 = 1.0f;
        if (f0Var != null) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            f0Var.T(f10);
        }
        l2.f0 f0Var2 = this.f34968e;
        if (f0Var2 != null) {
            if (z10) {
                f11 = 0.0f;
            }
            f0Var2.T(f11);
        }
    }

    @Override
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.zn0 zn0Var = this.f34974i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.f34981y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f34968e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f34980x = z10;
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        l2.f0 f0Var4 = this.f34968e;
        if (f0Var4 != null) {
            f0Var4.X(z10);
        }
    }

    public void v0(float f10) {
        try {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                f0Var.e(new e2.w0(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void w0(boolean r21, org.telegram.ui.Components.c61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f61.w0(boolean, org.telegram.ui.Components.c61):void");
    }

    public final void x0(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (i7 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if (i7 == 0) {
                i13 = 1;
            } else {
                i13 = 3;
            }
            f0Var.D(new e2.e(i13, 0, i12, 1, false, 0, true), false);
        }
        l2.f0 f0Var2 = this.f34968e;
        if (f0Var2 != null) {
            if (i7 == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i7 == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f0Var2.D(new e2.e(i11, 0, i10, 1, false, 0, true), true);
        }
    }

    @Override
    public final void y(e2.v0 v0Var) {
        org.telegram.messenger.g0.g3(new hn0(20, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.f34978s != surface) {
            this.f34978s = surface;
            l2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f34977r != surfaceView) {
            this.f34977r = surfaceView;
            l2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            f0Var.S(holder);
        }
    }

    public f61(boolean z10, boolean z11) {
        int i7 = f34959k0;
        f34959k0 = i7 + 1;
        this.f34961a = i7;
        this.f34964b0 = new Handler(Looper.getMainLooper());
        this.f34967d0 = false;
        this.f34969e0 = -1;
        this.f34972g0 = -9223372036854775807L;
        this.f34973h0 = -9223372036854775807L;
        this.f34975j0 = new ArrayList();
        this.f34966c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.f26913b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.f26913b, new nb.a(1));
        this.f34970f = sVar;
        if (z11) {
            a3.n j3 = sVar.j();
            j3.getClass();
            a3.m mVar = new a3.m(j3);
            mVar.I.add(1);
            sVar.b(new a3.n(mVar));
        }
        this.M = 1;
        this.X = z10;
        if (z10) {
            org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.K4);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override
    public final void B(List list) {
    }

    @Override
    public final void F(e2.z0 z0Var) {
    }

    @Override
    public final void G(e2.v0 v0Var) {
    }

    @Override
    public final void H(e2.w0 w0Var) {
    }

    @Override
    public final void M(e2.q0 q0Var) {
    }

    @Override
    public final void O(e2.y0 y0Var) {
    }

    @Override
    public final void P(boolean z10) {
    }

    @Override
    public final void b(x2.c0 c0Var) {
    }

    @Override
    public final void d(int i7) {
    }

    @Override
    public final void e(int i7) {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void g(int i7) {
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void i(int i7) {
    }

    @Override
    public final void j(boolean z10) {
    }

    @Override
    public final void l(float f10) {
    }

    @Override
    public final void m(int i7) {
    }

    @Override
    public final void n(e2.o0 o0Var) {
    }

    @Override
    public final void o(e2.e eVar) {
    }

    @Override
    public final void p(e2.o0 o0Var) {
    }

    @Override
    public final void q(e2.v0 v0Var) {
    }

    @Override
    public final void t(boolean z10) {
    }

    @Override
    public final void w(e2.x1 x1Var) {
    }

    @Override
    public final void x(g2.c cVar) {
    }

    @Override
    public final void z(l2.d dVar) {
    }

    @Override
    public final void A(e2.c1 c1Var, ji.j jVar) {
    }

    @Override
    public final void J(int i7, int i10) {
    }

    @Override
    public final void L(e2.l1 l1Var, int i7) {
    }

    @Override
    public final void k(int i7, boolean z10) {
    }

    @Override
    public final void r(m2.a aVar, x2.c0 c0Var) {
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
    }

    @Override
    public final void c(m2.a aVar, int i7, long j3) {
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
