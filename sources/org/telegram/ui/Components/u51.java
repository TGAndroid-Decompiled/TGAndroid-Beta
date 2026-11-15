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
import b3.q;
import bg.v0;
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
import org.telegram.ui.Components.cf;
import org.telegram.ui.ld0;
import p2.e;
import pb.b;
import q2.n;
import r2.c;
import r2.j;
import r2.l;
import s2.d;
import s2.t;
import sg.h0;
import x2.e0;
public class u51 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.is {
    public static int f39910k0;
    public static final HashSet f39911l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public s51 K;
    public o51 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public r51 P;
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
    public final int f39912a;
    public x2.w0 f39913a0;
    public org.telegram.messenger.q5 f39914b;
    public final Handler f39915b0;
    public boolean f39916c;
    public final boolean f39917c0;
    public l2.f0 d;
    public boolean f39918d0;
    public l2.f0 f39919e;
    public int f39920e0;
    public final a3.s f39921f;
    public boolean f39922f0;
    public long f39923g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long f39924h0;
    public org.telegram.ui.wn0 f39925i0;
    public final ArrayList f39926j0;
    public TextureView f39927n;
    public SurfaceView f39928r;
    public Surface f39929s;
    public boolean f39930w;
    public boolean f39931x;
    public boolean f39932y;

    public u51() {
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
            if (!org.telegram.messenger.np.e1().getBoolean("unsupport_".concat(concat), false)) {
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

    public static t51 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((r51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                t51 t51Var = (t51) obj2;
                if (t51Var.b()) {
                    return t51Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        r51 r51Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.np.s1(i7).G6 && arrayList != null) {
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
                    t51 d = t51.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.f28057id), i10, z10);
                    if (d.f39549i > 0 && d.f39550j > 0) {
                        if (document3 == document) {
                            d.f39544b = true;
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
            t51 t51Var = (t51) arrayList3.get(i13);
            String str2 = t51Var.f39553m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(t51Var.f39553m) && !"hevc".equals(t51Var.f39553m) && !"h265".equals(t51Var.f39553m) && !"vp9".equals(t51Var.f39553m)) || D0(t51Var.f39553m))) {
                arrayList4.add(t51Var);
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
            t51 t51Var2 = (t51) obj;
            if (t51Var2.f39544b) {
                arrayList6.add(new r51(t51Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        r51Var = (r51) obj2;
                        if (!r51Var.f38885a && r51Var.f38886b == t51Var2.f39549i && r51Var.f38887c == t51Var2.f39550j) {
                            break;
                        }
                    } else {
                        r51Var = null;
                        break;
                    }
                }
                if (r51Var != null && !org.telegram.messenger.gz.R0) {
                    r51Var.d.add(t51Var2);
                } else {
                    arrayList6.add(new r51(t51Var2));
                }
            }
        }
        return arrayList6;
    }

    public static t51 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((r51) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                t51 t51Var = (t51) obj2;
                if (t51Var.f39544b && t51Var.b()) {
                    return t51Var;
                }
            }
        }
        int size3 = arrayList.size();
        t51 t51Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((r51) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                t51 t51Var3 = (t51) obj4;
                if (!t51Var3.f39544b && D0(t51Var3.f39553m) && (t51Var2 == null || (i7 = t51Var3.f39549i * t51Var3.f39550j) > (i10 = t51Var2.f39549i * t51Var2.f39550j) || (i7 == i10 && t51Var3.f39552l < t51Var2.f39552l))) {
                    t51Var2 = t51Var3;
                }
            }
        }
        if (t51Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((r51) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    t51 t51Var4 = (t51) obj6;
                    if (t51Var2 == null || t51Var2.f39549i * t51Var2.f39550j > t51Var4.f39549i * t51Var4.f39550j || t51Var4.f39552l < t51Var2.f39552l) {
                        t51Var2 = t51Var4;
                    }
                }
            }
        }
        return t51Var2;
    }

    public static t51 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((r51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                t51 t51Var = (t51) obj2;
                if (t51Var.b()) {
                    return t51Var;
                }
            }
        }
        int size3 = arrayList.size();
        t51 t51Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((r51) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                t51 t51Var3 = (t51) obj4;
                if (!t51Var3.f39544b && (t51Var2 == null || t51Var2.f39549i * t51Var2.f39550j > t51Var3.f39549i * t51Var3.f39550j || t51Var3.f39552l < t51Var2.f39552l)) {
                    if (t51Var3.f39549i <= 900 && t51Var3.f39550j <= 900) {
                        t51Var2 = t51Var3;
                    }
                }
            }
        }
        if (t51Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((r51) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    t51 t51Var4 = (t51) obj6;
                    if (t51Var2 == null || t51Var2.f39549i * t51Var2.f39550j > t51Var4.f39549i * t51Var4.f39550j || t51Var4.f39552l < t51Var2.f39552l) {
                        t51Var2 = t51Var4;
                    }
                }
            }
        }
        return t51Var2;
    }

    public static void n0(org.telegram.messenger.gj gjVar, boolean z10) {
        if (gjVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26609b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.gj.B0(gjVar.f23819k) + "_" + gjVar.e1() + "loop", z10).apply();
    }

    public static void o0(r51 r51Var, org.telegram.messenger.gj gjVar) {
        String str;
        if (gjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
        int e12 = gjVar.e1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26609b.getSharedPreferences("media_saved_pos", 0).edit();
        if (r51Var == null) {
            edit.remove(B0 + "_" + e12 + "q2");
        } else {
            String str2 = B0 + "_" + e12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r51Var.f38886b);
            sb2.append("x");
            sb2.append(r51Var.f38887c);
            if (r51Var.f38885a) {
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
        if (this.f39927n != textureView) {
            this.f39927n = textureView;
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
        l2.f0 f0Var2 = this.f39919e;
        if (f0Var2 != null) {
            f0Var2.T(f10);
        }
    }

    @Override
    public final void C(m2.a aVar, int i7) {
        if (i7 == 1) {
            s51 s51Var = this.K;
            if (s51Var != null) {
                s51Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f39926j0;
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

    public final void C0(org.telegram.messenger.q5 q5Var) {
        this.f39914b = q5Var;
        if (q5Var != null) {
            this.d.f18981s0 = new n51(q5Var);
            return;
        }
        this.d.f18981s0 = null;
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
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.H4, this);
        }
        if (!this.H && i7 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i7 != 3) {
            this.f39915b0.removeCallbacksAndMessages(null);
            o51 o51Var = this.L;
            if (o51Var != null) {
                o51Var.A(false, null);
            }
        }
    }

    @Override
    public final void E(e2.q1 q1Var) {
        org.telegram.ui.wn0 wn0Var = this.f39925i0;
        if (wn0Var != null) {
            org.telegram.messenger.g0.h3(wn0Var);
        }
    }

    public final void I() {
        int i7;
        l2.j jVar;
        int i10;
        HashMap hashMap = new HashMap();
        hashMap.put(m2.j.f20157c.f20158a, 144179200);
        b3.e eVar = new b3.e();
        boolean z10 = this.f39916c;
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
                jVar = new p51(org.telegram.messenger.t0.f26609b, this);
            } else {
                jVar = new l2.j(org.telegram.messenger.t0.f26609b);
            }
            jVar.f19048c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.f26609b);
            a8.ja.p(!nVar.f19110z);
            nVar.f19090c = new l2.m(jVar, 2);
            a3.s sVar = this.f39921f;
            a8.ja.p(!nVar.f19110z);
            sVar.getClass();
            nVar.f19091e = new l2.m(sVar, 1);
            a8.ja.p(!nVar.f19110z);
            nVar.f19092f = new l2.m(hVar, 0);
            l2.f0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.e eVar2 = this.d.f18980s;
            eVar2.getClass();
            eVar2.f20128f.a(this);
            this.d.f18969m.a(this);
            this.d.f18983t0.add(this);
            TextureView textureView = this.f39927n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f39929s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f39928r;
                    if (surfaceView != null) {
                        l2.f0 f0Var = this.d;
                        f0Var.F1();
                        f0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f39931x);
            l2.f0 f0Var2 = this.d;
            if (this.W) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            f0Var2.k(i10);
        }
        if (this.f39932y && this.f39919e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.f26609b);
            a3.s sVar2 = this.f39921f;
            a8.ja.p(!nVar2.f19110z);
            sVar2.getClass();
            nVar2.f19091e = new l2.m(sVar2, 1);
            a8.ja.p(true ^ nVar2.f19110z);
            nVar2.f19092f = new l2.m(hVar, 0);
            l2.f0 a11 = nVar2.a();
            this.f39919e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.f39919e.f18969m.a(new h2.z(this, 1));
            this.f39919e.X(this.f39931x);
        }
    }

    public final long K() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.f39930w) {
                return f0Var.d0();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final f5.k Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String k10 = r.b.k("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            v4.w0 w0Var = new v4.w0(this.R, str5, k10);
            w0Var.f58673g = str2;
            w0Var.h = str3;
            return new f5.k(new wf.e(w0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ArrayList arrayList3 = ((r51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                t51 t51Var = (t51) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(t51Var.f39545c);
                String sb3 = sb2.toString();
                TLRPC.Document document = t51Var.f39548g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.w0 w0Var2 = new v4.w0(t51Var.d, str4, sb3);
                w0Var2.f58673g = str2;
                w0Var2.h = str3;
                int i11 = t51Var.f39549i;
                int i12 = t51Var.f39550j;
                w0Var2.f58668a = i11;
                w0Var2.f58669b = i12;
                arrayList.add(new wf.e(w0Var2));
                arrayList2 = arrayList4;
            }
        }
        ?? obj3 = new Object();
        obj3.f10991a = arrayList;
        return obj3;
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            e2.u uVar = f0Var.S;
            if (uVar != null && uVar.f10447o != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((r51) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        t51 t51Var = (t51) obj2;
                        if (t51Var.f39545c == uVar.f10447o) {
                            return t51Var.f39548g;
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
        long j3 = this.f39924h0;
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
        if (this.f39920e0 == -1) {
            try {
                if (this.f39918d0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).f38885a) {
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
                            r51 Z = Z(i10);
                            if (!Z.f38885a && uVar.f10457z == Z.f38886b && uVar.A == Z.f38887c && uVar.f10442j == ((int) Math.floor(((t51) Z.d.get(0)).f39552l * 8.0d))) {
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
        return this.f39920e0;
    }

    public final long U() {
        long j3 = this.f39923g0;
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
            MediaFormat mediaFormat = ((u2.r) f0Var.f18958g[0]).f57795g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    c7Var2.f13984b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    c7Var2.f13983a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return c7Var2;
    }

    public final r51 W(Boolean bool) {
        r51 r51Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            r51 Z = Z(i7);
            if (Z.f38885a == bool.booleanValue() && (r51Var == null || r51Var.f38886b * r51Var.f38887c < Z.f38886b * Z.f38887c)) {
                r51Var = Z;
            }
        }
        return r51Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final r51 Z(int i7) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            return (r51) this.O.get(i7);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void b(e2.x1 x1Var) {
        if (!Objects.equals(x1Var, e2.x1.d)) {
            this.K.onVideoSizeChanged(x1Var.f10485a, x1Var.f10486b, 0, x1Var.f10487c);
        }
    }

    public final boolean c0() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            if (f0Var.f18950b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d0() {
        if (!this.f39932y || !this.J) {
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
        if (i7 == org.telegram.messenger.ns.H4 && ((u51) objArr[0]) != this && d0() && !this.E) {
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
            ArrayList arrayList3 = ((r51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                t51 t51Var = (t51) obj2;
                long j3 = t51Var.f39545c;
                Uri uri = t51Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(t51Var.f39546e, t51Var.f39547f);
                if (t51Var.f39547f != null) {
                    this.Q.add(t51Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(t51Var.f39552l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(t51Var.f39549i);
                    sb3.append("x");
                    sb3.append(t51Var.f39550j);
                    String str2 = t51Var.f39553m;
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
                    if (t51Var.b() && t51Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(t51Var.f39545c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(t51Var.f39543a);
                    sb3.append("\"\n");
                    if (t51Var.c()) {
                        sb3.append(t51Var.f39547f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(t51Var.f39546e);
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
        q2.n nVar;
        q2.n nVar2;
        e2.d0 d0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.s1 s1Var = h9.s1.f13749e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (c0Var.f10031b != null && c0Var.f10030a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.ja.p(z10);
        if (uri != null) {
            if (c0Var.f10030a != null) {
                d0Var = new e2.d0(c0Var);
            } else {
                d0Var = null;
            }
            e0Var = e0Var2;
            g0Var = new e2.g0(uri, null, d0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            e0Var = e0Var2;
            g0Var = null;
        }
        e2.l0 l0Var = new e2.l0("", new e2.a0(zVar), g0Var, new e2.f0(e0Var), e2.o0.L, h0Var);
        if (j3 != 0) {
            ai.d0 d0Var2 = new ai.d0(this, j3, 7);
            tg.z1 z1Var = new tg.z1(new f3.m(), 14);
            Object obj = new Object();
            qb.a aVar = new qb.a(4);
            g0Var.getClass();
            l0Var.f10186b.getClass();
            e2.d0 d0Var3 = l0Var.f10186b.f10097c;
            if (d0Var3 == null) {
                nVar2 = q2.n.A;
            } else {
                synchronized (obj) {
                    try {
                        if (!d0Var3.equals(null)) {
                            nVar = org.telegram.ui.ld0.o(d0Var3);
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
            return new x2.x0(l0Var, d0Var2, z1Var, nVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.f39913a0 == null) {
                    this.f39913a0 = new x2.w0(extendedDefaultDataSourceFactory, new f3.m());
                }
                return this.f39913a0.b(l0Var);
            }
            if (this.Y == null) {
                this.Y = new x2.e0(extendedDefaultDataSourceFactory) {
                    public final xa f2616a;
                    public final g f2617b;
                    public final ld0 f2618c;
                    public final a d;
                    public final qb.a f2619e;
                    public final long f2620f;
                    public final long f2621g;

                    {
                        xa xaVar = new xa(extendedDefaultDataSourceFactory);
                        this.f2616a = xaVar;
                        this.f2617b = extendedDefaultDataSourceFactory;
                        this.f2618c = new ld0(7);
                        this.f2619e = new qb.a(4);
                        this.f2620f = 30000L;
                        this.f2621g = 5000000L;
                        this.d = new a(28);
                        ((v0) xaVar.d).f3346a = true;
                    }

                    @Override
                    public final e0 a(a aVar2) {
                        v0 v0Var = (v0) this.f2616a.d;
                        v0Var.getClass();
                        v0Var.f3348c = aVar2;
                        return this;
                    }

                    @Override
                    public final x2.a b(l0 l0Var2) {
                        q qVar;
                        l0Var2.f10186b.getClass();
                        e eVar = new e();
                        List list2 = l0Var2.f10186b.f10098e;
                        if (!list2.isEmpty()) {
                            qVar = new h0(8, eVar, list2);
                        } else {
                            qVar = eVar;
                        }
                        return new h(l0Var2, this.f2617b, qVar, this.f2616a, this.d, this.f2618c.s(l0Var2), this.f2619e, this.f2620f, this.f2621g);
                    }

                    @Override
                    public final e0 c(boolean z11) {
                        ((v0) this.f2616a.d).f3346a = z11;
                        return this;
                    }

                    @Override
                    public final e0 d(int i7) {
                        ((v0) this.f2616a.d).f3347b = i7;
                        return this;
                    }
                };
            }
            return b(l0Var);
        }
        if (this.Z == null) {
            this.Z = new x2.e0(extendedDefaultDataSourceFactory) {
                public final cf f2622a;
                public c f2623b;
                public a f2624c;
                public final ld0 f2628i = new ld0(7);
                public final b f2626f = new b(24);
                public final j f2627g = d.K;
                public final qb.a f2629j = new qb.a(4);
                public final a h = new a(28);
                public final int f2631l = 1;
                public final long f2632m = -9223372036854775807L;
                public final boolean f2630k = true;
                public int f2625e = 3;
                public boolean d = true;

                {
                    this.f2622a = new cf(extendedDefaultDataSourceFactory);
                }

                @Override
                public final e0 a(a aVar2) {
                    this.f2624c = aVar2;
                    return this;
                }

                @Override
                public final e0 c(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final e0 d(int i7) {
                    this.f2625e = i7;
                    return this;
                }

                @Override
                public final l b(l0 l0Var2) {
                    l0Var2.f10186b.getClass();
                    if (this.f2623b == null) {
                        ?? obj2 = new Object();
                        obj2.f55766a = new a(6);
                        obj2.f55768c = 3;
                        this.f2623b = obj2;
                    }
                    a aVar2 = this.f2624c;
                    if (aVar2 != null) {
                        this.f2623b.f55766a = aVar2;
                    }
                    c cVar = this.f2623b;
                    cVar.f55767b = this.d;
                    cVar.f55768c = this.f2625e;
                    List list2 = l0Var2.f10186b.f10098e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2626f;
                    if (!isEmpty) {
                        tVar = new k8.a(tVar, list2, false, 29);
                    }
                    n s5 = this.f2628i.s(l0Var2);
                    this.f2627g.getClass();
                    cf cfVar = this.f2622a;
                    qb.a aVar3 = this.f2629j;
                    return new l(l0Var2, cfVar, cVar, this.h, s5, aVar3, new d(cfVar, aVar3, tVar), this.f2632m, this.f2630k, this.f2631l);
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
        l2.f0 f0Var2 = this.f39919e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.L != null) {
            this.f39915b0.removeCallbacksAndMessages(null);
            this.L.A(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (this.f39932y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f39919e;
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
        l2.f0 f0Var4 = this.f39919e;
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
        this.f39918d0 = false;
        this.f39922f0 = false;
        this.H = false;
        this.f39932y = false;
        this.G = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.f39930w = z10;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, r51 r51Var) {
        int i7;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = r51Var;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.f39918d0 = false;
        this.H = false;
        this.f39932y = false;
        this.G = null;
        this.f39930w = true;
        I();
        this.f39922f0 = false;
        if (r51Var != null && (arrayList2 = this.O) != null) {
            i7 = arrayList2.indexOf(r51Var);
        } else {
            i7 = -1;
        }
        this.f39920e0 = i7;
        w0(true, r51Var);
        if (this.f39918d0) {
            this.f39920e0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        x2.w wVar = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.S = uri2;
        this.T = str;
        this.U = str2;
        this.V = true;
        this.f39922f0 = false;
        this.f39932y = true;
        this.I = false;
        this.H = false;
        I();
        x2.w wVar2 = null;
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            x2.w wVar3 = new x2.w(f0(0L, uri3, str3));
            if (i7 == 0) {
                wVar = wVar3;
            } else {
                wVar2 = wVar3;
            }
        }
        this.d.u1(wVar, true);
        this.d.a();
        this.f39919e.u1(wVar2, true);
        this.f39919e.a();
        f39911l0.add(Integer.valueOf(this.f39912a));
    }

    public final void m0() {
        f39911l0.remove(Integer.valueOf(this.f39912a));
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X0();
            this.d = null;
        }
        l2.f0 f0Var2 = this.f39919e;
        if (f0Var2 != null) {
            f0Var2.X0();
            this.f39919e = null;
        }
        if (this.X) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.H4);
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.f39924h0 = -9223372036854775807L;
        this.f39923g0 = -9223372036854775807L;
        s51 s51Var = this.K;
        if (s51Var != null) {
            s51Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        s51 s51Var = this.K;
        if (s51Var != null) {
            s51Var.onSeekStarted(aVar);
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
                p1Var = l2.p1.f19160c;
            }
            f0Var.w1(p1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z10, Runnable runnable) {
        l2.p1 p1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f39926j0.add(runnable);
            }
            l2.f0 f0Var = this.d;
            if (z10) {
                p1Var = l2.p1.d;
            } else {
                p1Var = l2.p1.f19160c;
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
        l2.f0 f0Var2 = this.f39919e;
        if (f0Var2 != null) {
            if (z10) {
                f11 = 0.0f;
            }
            f0Var2.T(f11);
        }
    }

    @Override
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.wn0 wn0Var = this.f39925i0;
        if (wn0Var != null) {
            org.telegram.messenger.g0.h3(wn0Var);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.f39932y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f39919e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f39931x = z10;
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        l2.f0 f0Var4 = this.f39919e;
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

    public final void w0(boolean r21, org.telegram.ui.Components.r51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u51.w0(boolean, org.telegram.ui.Components.r51):void");
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
        l2.f0 f0Var2 = this.f39919e;
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
        org.telegram.messenger.g0.h3(new hh0(25, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.f39929s != surface) {
            this.f39929s = surface;
            l2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f39928r != surfaceView) {
            this.f39928r = surfaceView;
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

    public u51(boolean z10, boolean z11) {
        int i7 = f39910k0;
        f39910k0 = i7 + 1;
        this.f39912a = i7;
        this.f39915b0 = new Handler(Looper.getMainLooper());
        this.f39918d0 = false;
        this.f39920e0 = -1;
        this.f39923g0 = -9223372036854775807L;
        this.f39924h0 = -9223372036854775807L;
        this.f39926j0 = new ArrayList();
        this.f39917c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.f26609b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.f26609b, new nb.a(1));
        this.f39921f = sVar;
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
            org.telegram.messenger.ns.e().b(this, org.telegram.messenger.ns.H4);
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
    public final void a(int i7) {
    }

    @Override
    public final void c(boolean z10) {
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
    public final void j(float f10) {
    }

    @Override
    public final void k(x2.b0 b0Var) {
    }

    @Override
    public final void l(int i7) {
    }

    @Override
    public final void m(e2.o0 o0Var) {
    }

    @Override
    public final void n(e2.e eVar) {
    }

    @Override
    public final void o(e2.o0 o0Var) {
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
    public final void i(int i7, boolean z10) {
    }

    @Override
    public final void r(m2.a aVar, x2.b0 b0Var) {
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
    }

    @Override
    public final void p(m2.a aVar, int i7, long j3) {
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
