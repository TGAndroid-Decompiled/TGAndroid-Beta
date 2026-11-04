package org.telegram.ui.Components;

import a3.s;
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
import b8.kg;
import cg.v0;
import d2.n0;
import i2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k4.j;
import kb.a;
import mb.b;
import n2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i9;
import p2.m;
import q2.c;
import q2.l;
import r2.d;
import r2.t;
import ra.e;
import w2.f0;
public class m51 implements d2.c1, d2.z1, l2.b, org.telegram.messenger.cs {
    public static int f36000k0;
    public static final HashSet f36001l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public k51 K;
    public g51 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public j51 P;
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
    public final int f36002a;
    public w2.x0 f36003a0;
    public org.telegram.messenger.q5 f36004b;
    public final Handler f36005b0;
    public boolean f36006c;
    public final boolean f36007c0;
    public k2.i0 d;
    public boolean f36008d0;
    public k2.i0 f36009e;
    public int f36010e0;
    public final z2.n f36011f;
    public boolean f36012f0;
    public long f36013g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long f36014h0;
    public org.telegram.ui.xm0 f36015i0;
    public final ArrayList f36016j0;
    public TextureView f36017n;
    public SurfaceView f36018r;
    public Surface f36019s;
    public boolean f36020w;
    public boolean f36021x;
    public boolean f36022y;

    public m51() {
        this(true, false);
    }

    public static boolean D0(String str) {
        String concat;
        if (str == null) {
            concat = null;
        } else {
            char c2 = 65535;
            switch (str.hashCode()) {
                case 96924:
                    if (str.equals("av1")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 96974:
                    if (str.equals("avc")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 116926:
                    if (str.equals("vp8")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 116927:
                    if (str.equals("vp9")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3004662:
                    if (str.equals("av01")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3148040:
                    if (str.equals("h264")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3148041:
                    if (str.equals("h265")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3199082:
                    if (str.equals("hevc")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
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
            if (!org.telegram.messenger.hp.e1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i3 = 0; i3 < codecCount; i3++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i3);
                    if (!codecInfoAt.isEncoder() && t2.w.i(codecInfoAt, concat)) {
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

    public static l51 M(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                if (l51Var.b()) {
                    return l51Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i3, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        j51 j51Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.hp.s1(i3).F6 && arrayList != null) {
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
                    l51 d = l51.d(i3, document3, (TLRPC.Document) longSparseArray.get(document3.f27007id), i10, z10);
                    if (d.f35609i > 0 && d.f35610j > 0) {
                        if (document3 == document) {
                            d.f35604b = true;
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
            l51 l51Var = (l51) arrayList3.get(i13);
            String str2 = l51Var.f35613m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(l51Var.f35613m) && !"hevc".equals(l51Var.f35613m) && !"h265".equals(l51Var.f35613m) && !"vp9".equals(l51Var.f35613m)) || D0(l51Var.f35613m))) {
                arrayList4.add(l51Var);
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
            l51 l51Var2 = (l51) obj;
            if (l51Var2.f35604b) {
                arrayList6.add(new j51(l51Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        j51Var = (j51) obj2;
                        if (!j51Var.f34966a && j51Var.f34967b == l51Var2.f35609i && j51Var.f34968c == l51Var2.f35610j) {
                            break;
                        }
                    } else {
                        j51Var = null;
                        break;
                    }
                }
                if (j51Var != null && !org.telegram.messenger.az.R0) {
                    j51Var.d.add(l51Var2);
                } else {
                    arrayList6.add(new j51(l51Var2));
                }
            }
        }
        return arrayList6;
    }

    public static l51 a0(ArrayList arrayList) {
        int i3;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                l51 l51Var = (l51) obj2;
                if (l51Var.f35604b && l51Var.b()) {
                    return l51Var;
                }
            }
        }
        int size3 = arrayList.size();
        l51 l51Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((j51) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                l51 l51Var3 = (l51) obj4;
                if (!l51Var3.f35604b && D0(l51Var3.f35613m) && (l51Var2 == null || (i3 = l51Var3.f35609i * l51Var3.f35610j) > (i10 = l51Var2.f35609i * l51Var2.f35610j) || (i3 == i10 && l51Var3.f35612l < l51Var2.f35612l))) {
                    l51Var2 = l51Var3;
                }
            }
        }
        if (l51Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((j51) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    l51 l51Var4 = (l51) obj6;
                    if (l51Var2 == null || l51Var2.f35609i * l51Var2.f35610j > l51Var4.f35609i * l51Var4.f35610j || l51Var4.f35612l < l51Var2.f35612l) {
                        l51Var2 = l51Var4;
                    }
                }
            }
        }
        return l51Var2;
    }

    public static l51 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((j51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                if (l51Var.b()) {
                    return l51Var;
                }
            }
        }
        int size3 = arrayList.size();
        l51 l51Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((j51) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                l51 l51Var3 = (l51) obj4;
                if (!l51Var3.f35604b && (l51Var2 == null || l51Var2.f35609i * l51Var2.f35610j > l51Var3.f35609i * l51Var3.f35610j || l51Var3.f35612l < l51Var2.f35612l)) {
                    if (l51Var3.f35609i <= 900 && l51Var3.f35610j <= 900) {
                        l51Var2 = l51Var3;
                    }
                }
            }
        }
        if (l51Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((j51) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    l51 l51Var4 = (l51) obj6;
                    if (l51Var2 == null || l51Var2.f35609i * l51Var2.f35610j > l51Var4.f35609i * l51Var4.f35610j || l51Var4.f35612l < l51Var2.f35612l) {
                        l51Var2 = l51Var4;
                    }
                }
            }
        }
        return l51Var2;
    }

    public static void n0(org.telegram.messenger.zi ziVar, boolean z10) {
        if (ziVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.zi.B0(ziVar.f26868k) + "_" + ziVar.f1() + "loop", z10).apply();
    }

    public static void o0(j51 j51Var, org.telegram.messenger.zi ziVar) {
        String str;
        if (ziVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
        int f12 = ziVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25457b.getSharedPreferences("media_saved_pos", 0).edit();
        if (j51Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str2 = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j51Var.f34967b);
            sb2.append("x");
            sb2.append(j51Var.f34968c);
            if (j51Var.f34966a) {
                str = "s";
            } else {
                str = "";
            }
            sb2.append(str);
            edit.putString(str2, sb2.toString());
        }
        edit.apply();
    }

    @Override
    public final void A(l2.a aVar, int i3) {
        if (i3 == 1) {
            k51 k51Var = this.K;
            if (k51Var != null) {
                k51Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f36016j0;
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

    public final void A0(TextureView textureView) {
        if (this.f36017n != textureView) {
            this.f36017n = textureView;
            k2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.z1(textureView);
        }
    }

    @Override
    public final void B(d2.s1 s1Var) {
        org.telegram.ui.xm0 xm0Var = this.f36015i0;
        if (xm0Var != null) {
            org.telegram.messenger.g0.h3(xm0Var);
        }
    }

    public final void B0(float f10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.R(f10);
        }
        k2.i0 i0Var2 = this.f36009e;
        if (i0Var2 != null) {
            i0Var2.R(f10);
        }
    }

    public final void C0(org.telegram.messenger.q5 q5Var) {
        this.f36004b = q5Var;
        if (q5Var != null) {
            this.d.f16573s0 = new e51(q5Var);
            return;
        }
        this.d.f16573s0 = null;
    }

    @Override
    public final void G(int i3, boolean z10) {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean u10 = i0Var.u();
            int h = this.d.h();
            if (this.N != u10 || this.M != h) {
                this.K.onStateChanged(u10, h);
                this.N = u10;
                this.M = h;
            }
        }
        if (z10 && i3 == 3 && !c0() && this.X) {
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.H4, this);
        }
        if (!this.H && i3 == 3) {
            this.H = true;
            if (this.I && this.J) {
                h0();
            }
        }
        if (i3 != 3) {
            this.f36005b0.removeCallbacksAndMessages(null);
            g51 g51Var = this.L;
            if (g51Var != null) {
                g51Var.r(false, null);
            }
        }
    }

    public final void I() {
        int i3;
        k2.j jVar;
        int i10;
        HashMap hashMap = new HashMap();
        hashMap.put(l2.k.f17727c.f17728a, 144179200);
        a3.e eVar = new a3.e();
        boolean z10 = this.f36006c;
        int i11 = 1000;
        if (z10) {
            i3 = 1000;
        } else {
            i3 = 100;
        }
        if (!z10) {
            i11 = 2000;
        }
        int i12 = i11;
        k2.h.a(i3, 0, "bufferForPlaybackMs", "0");
        k2.h.a(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k2.h.a(50000, i3, "minBufferMs", "bufferForPlaybackMs");
        k2.h.a(50000, i12, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k2.h.a(50000, 50000, "maxBufferMs", "minBufferMs");
        k2.h.a(0, 0, "backBufferDurationMs", "0");
        k2.h hVar = new k2.h(eVar, 50000, i3, i3, i12, i12, false, hashMap);
        if (this.d == null) {
            if (this.L != null) {
                jVar = new h51(org.telegram.messenger.t0.f25457b, this);
            } else {
                jVar = new k2.j(org.telegram.messenger.t0.f25457b);
            }
            jVar.f16593c = 1;
            k2.n nVar = new k2.n(org.telegram.messenger.t0.f25457b);
            b8.zb.p(!nVar.f16653z);
            nVar.f16633c = new k2.m(jVar, 2);
            z2.n nVar2 = this.f36011f;
            b8.zb.p(!nVar.f16653z);
            nVar2.getClass();
            nVar.f16634e = new k2.m(nVar2, 1);
            b8.zb.p(!nVar.f16653z);
            nVar.f16635f = new k2.m(hVar, 0);
            k2.i0 a10 = nVar.a();
            this.d = a10;
            a10.A0(new d2.f(3, 0, 1, 1, false, 0, true), false);
            l2.f fVar = this.d.f16572s;
            fVar.getClass();
            fVar.f17698f.a(this);
            this.d.f16561m.a(this);
            this.d.f16575t0.add(this);
            TextureView textureView = this.f36017n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f36019s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f36018r;
                    if (surfaceView != null) {
                        k2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.f36021x);
            k2.i0 i0Var2 = this.d;
            if (this.W) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            i0Var2.k(i10);
        }
        if (this.f36022y && this.f36009e == null) {
            k2.n nVar3 = new k2.n(org.telegram.messenger.t0.f25457b);
            z2.n nVar4 = this.f36011f;
            b8.zb.p(!nVar3.f16653z);
            nVar4.getClass();
            nVar3.f16634e = new k2.m(nVar4, 1);
            b8.zb.p(true ^ nVar3.f16653z);
            nVar3.f16635f = new k2.m(hVar, 0);
            k2.i0 a11 = nVar3.a();
            this.f36009e = a11;
            a11.A0(new d2.f(2, 0, 1, 1, false, 0, true), false);
            this.f36009e.f16561m.a(new g2.a0(this, 1));
            this.f36009e.V(this.f36021x);
        }
    }

    public final long K() {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (this.f36020w) {
                return i0Var.b0();
            }
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final mi.z3 Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String f10 = t4.c.f("/mtproto_", str);
            String queryParameter = this.R.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            tf.e eVar = new tf.e(this.R, str5, f10);
            eVar.f55110e = str2;
            eVar.f55111f = str3;
            return new mi.z3(new tf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ArrayList arrayList3 = ((j51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(l51Var.f35605c);
                String sb3 = sb2.toString();
                TLRPC.Document document = l51Var.f35608g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                tf.e eVar2 = new tf.e(l51Var.d, str4, sb3);
                eVar2.f55110e = str2;
                eVar2.f55111f = str3;
                int i11 = l51Var.f35609i;
                int i12 = l51Var.f35610j;
                eVar2.f55107a = i11;
                eVar2.f55108b = i12;
                arrayList.add(new tf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new mi.z3(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            d2.v vVar = i0Var.S;
            if (vVar != null && vVar.f8485o != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ArrayList arrayList2 = ((j51) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        l51 l51Var = (l51) obj2;
                        if (l51Var.f35605c == vVar.f8485o) {
                            return l51Var.f35608g;
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
        long j10 = this.f36014h0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.N0();
        }
        return 0L;
    }

    public final int T() {
        if (this.f36010e0 == -1) {
            try {
                if (this.f36008d0) {
                    for (int i3 = 0; i3 < Y(); i3++) {
                        if (Z(i3).f34966a) {
                            return i3;
                        }
                    }
                }
                k2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    d2.v vVar = i0Var.S;
                    if (vVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            j51 Z = Z(i10);
                            if (!Z.f34966a && vVar.f8495z == Z.f34967b && vVar.A == Z.f34968c && vVar.f8480j == ((int) Math.floor(((l51) Z.d.get(0)).f35612l * 8.0d))) {
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
        return this.f36010e0;
    }

    public final long U() {
        long j10 = this.f36013g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final gi.e7 V(gi.e7 e7Var) {
        gi.e7 e7Var2 = e7Var;
        if (e7Var == null) {
            e7Var2 = new Object();
        }
        try {
            k2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((t2.r) i0Var.f16550g[0]).f54877g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    e7Var2.f12665b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    e7Var2.f12664a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return e7Var2;
    }

    public final j51 W(Boolean bool) {
        j51 j51Var = null;
        for (int i3 = 0; i3 < Y(); i3++) {
            j51 Z = Z(i3);
            if (Z.f34966a == bool.booleanValue() && (j51Var == null || j51Var.f34967b * j51Var.f34968c < Z.f34967b * Z.f34968c)) {
                j51Var = Z;
            }
        }
        return j51Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final j51 Z(int i3) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i3 >= 0 && i3 < arrayList.size()) {
            return (j51) this.O.get(i3);
        }
        return W(Boolean.FALSE);
    }

    public final boolean c0() {
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            if (i0Var.f16542b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d0() {
        if (!this.f36022y || !this.J) {
            k2.i0 i0Var = this.d;
            if (i0Var != null && i0Var.u()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.H4 && ((m51) objArr[0]) != this && d0() && !this.E) {
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((j51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                l51 l51Var = (l51) obj2;
                long j10 = l51Var.f35605c;
                Uri uri = l51Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(l51Var.f35606e, l51Var.f35607f);
                if (l51Var.f35607f != null) {
                    this.Q.add(l51Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(l51Var.f35612l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(l51Var.f35609i);
                    sb3.append("x");
                    sb3.append(l51Var.f35610j);
                    String str2 = l51Var.f35613m;
                    if (str2 == null) {
                        str = null;
                    } else {
                        char c2 = 65535;
                        switch (str2.hashCode()) {
                            case 96924:
                                if (str2.equals("av1")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 96974:
                                if (str2.equals("avc")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 116926:
                                if (str2.equals("vp8")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 116927:
                                if (str2.equals("vp9")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 3004662:
                                if (str2.equals("av01")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 3148040:
                                if (str2.equals("h264")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 3148041:
                                if (str2.equals("h265")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case 3199082:
                                if (str2.equals("hevc")) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
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
                    if (l51Var.b() && l51Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(l51Var.f35605c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(l51Var.f35603a);
                    sb3.append("\"\n");
                    if (l51Var.c()) {
                        sb3.append(l51Var.f35607f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(l51Var.f35606e);
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

    @Override
    public final void f(d2.a2 a2Var) {
        if (!Objects.equals(a2Var, d2.a2.d)) {
            this.K.onVideoSizeChanged(a2Var.f8030a, a2Var.f8031b, 0, a2Var.f8032c);
        }
    }

    public final w2.a f0(long j10, Uri uri, String str) {
        boolean z10;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory;
        d2.g0 g0Var;
        int i3;
        d2.i0 i0Var;
        p2.m mVar;
        p2.m mVar2;
        d2.f0 f0Var;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory2 = this.h;
        d2.b0 b0Var = new d2.b0();
        d2.e0 e0Var = new d2.e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.f12146e;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        if (e0Var.f8074b != null && e0Var.f8073a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        b8.zb.p(z10);
        if (uri != null) {
            if (e0Var.f8073a != null) {
                f0Var = new d2.f0(e0Var);
            } else {
                f0Var = null;
            }
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            i3 = 1;
            g0Var = g0Var2;
            i0Var = new d2.i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            extendedDefaultDataSourceFactory = extendedDefaultDataSourceFactory2;
            g0Var = g0Var2;
            i3 = 1;
            i0Var = null;
        }
        d2.n0 n0Var = new d2.n0("", new d2.c0(b0Var), i0Var, new d2.h0(g0Var), d2.q0.L, j0Var);
        if (j10 != 0) {
            ei.c1 c1Var = new ei.c1(this, j10, 7);
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(new e3.m(), 27);
            Object obj = new Object();
            kb.a aVar = new kb.a(i3);
            i0Var.getClass();
            n0Var.f8241b.getClass();
            d2.f0 f0Var2 = n0Var.f8241b.f8141c;
            if (f0Var2 == null) {
                mVar2 = p2.m.f53118z;
            } else {
                synchronized (obj) {
                    try {
                        if (!f0Var2.equals(null)) {
                            mVar = k4.j.s(f0Var2);
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
            return new w2.y0(n0Var, c1Var, e3Var, mVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.f36003a0 == null) {
                    this.f36003a0 = new w2.x0(extendedDefaultDataSourceFactory, new e3.m());
                }
                return this.f36003a0.c(n0Var);
            }
            final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory3 = extendedDefaultDataSourceFactory;
            if (this.Y == null) {
                this.Y = new w2.f0(extendedDefaultDataSourceFactory3) {
                    public final kg f2088a;
                    public final g f2089b;
                    public final j f2090c;
                    public final e d;
                    public final a f2091e;
                    public final long f2092f;
                    public final long f2093g;

                    {
                        kg kgVar = new kg(extendedDefaultDataSourceFactory3);
                        this.f2088a = kgVar;
                        this.f2089b = extendedDefaultDataSourceFactory3;
                        this.f2090c = new j(28);
                        this.f2091e = new a(1);
                        this.f2092f = 30000L;
                        this.f2093g = 5000000L;
                        this.d = new e(26);
                        ((v0) kgVar.d).f4757a = true;
                    }

                    @Override
                    public final f0 a(b bVar) {
                        v0 v0Var = (v0) this.f2088a.d;
                        v0Var.getClass();
                        v0Var.f4759c = bVar;
                        return this;
                    }

                    @Override
                    public final f0 b(boolean z11) {
                        ((v0) this.f2088a.d).f4757a = z11;
                        return this;
                    }

                    @Override
                    public final w2.a c(n0 n0Var2) {
                        s sVar;
                        n0Var2.f8241b.getClass();
                        o2.e eVar = new o2.e();
                        List list2 = n0Var2.f8241b.f8142e;
                        if (!list2.isEmpty()) {
                            sVar = new ua.b(2, eVar, list2);
                        } else {
                            sVar = eVar;
                        }
                        return new h(n0Var2, this.f2089b, sVar, this.f2088a, this.d, this.f2090c.x(n0Var2), this.f2091e, this.f2092f, this.f2093g);
                    }

                    @Override
                    public final f0 d(int i10) {
                        ((v0) this.f2088a.d).f4758b = i10;
                        return this;
                    }
                };
            }
            return c(n0Var);
        }
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory4 = extendedDefaultDataSourceFactory;
        if (this.Z == null) {
            this.Z = new w2.f0(extendedDefaultDataSourceFactory4) {
                public final i9 f2094a;
                public c f2095b;
                public b f2096c;
                public final j f2100i = new j(28);
                public final e f2098f = new e(22);
                public final org.telegram.utils.twidget.a f2099g = d.K;
                public final a f2101j = new a(1);
                public final e h = new e(26);
                public final int f2103l = 1;
                public final long f2104m = -9223372036854775807L;
                public final boolean f2102k = true;
                public int f2097e = 3;
                public boolean d = true;

                {
                    this.f2094a = new i9(extendedDefaultDataSourceFactory4, 12);
                }

                @Override
                public final f0 a(b bVar) {
                    this.f2096c = bVar;
                    return this;
                }

                @Override
                public final f0 b(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 d(int i10) {
                    this.f2097e = i10;
                    return this;
                }

                @Override
                public final l c(n0 n0Var2) {
                    n0Var2.f8241b.getClass();
                    if (this.f2095b == null) {
                        ?? obj2 = new Object();
                        obj2.f53671a = new b(4);
                        obj2.f53673c = 3;
                        this.f2095b = obj2;
                    }
                    b bVar = this.f2096c;
                    if (bVar != null) {
                        this.f2095b.f53671a = bVar;
                    }
                    c cVar = this.f2095b;
                    cVar.f53672b = this.d;
                    cVar.f53673c = this.f2097e;
                    List list2 = n0Var2.f8241b.f8142e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2098f;
                    if (!isEmpty) {
                        tVar = new m2.t(tVar, list2, false, 24);
                    }
                    m x10 = this.f2100i.x(n0Var2);
                    this.f2099g.getClass();
                    i9 i9Var = this.f2094a;
                    a aVar2 = this.f2101j;
                    return new l(n0Var2, i9Var, cVar, this.h, x10, aVar2, new d(i9Var, aVar2, tVar), this.f2104m, this.f2102k, this.f2103l);
                }
            };
        }
        return c(n0Var);
    }

    public void g0() {
        this.J = false;
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.V(false);
        }
        k2.i0 i0Var2 = this.f36009e;
        if (i0Var2 != null) {
            i0Var2.V(false);
        }
        if (this.L != null) {
            this.f36005b0.removeCallbacksAndMessages(null);
            this.L.r(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (this.f36022y && (!this.I || !this.H)) {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.V(false);
            }
            k2.i0 i0Var2 = this.f36009e;
            if (i0Var2 != null) {
                i0Var2.V(false);
                return;
            }
            return;
        }
        k2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.V(true);
        }
        k2.i0 i0Var4 = this.f36009e;
        if (i0Var4 != null) {
            i0Var4.V(true);
        }
    }

    public final void i0(long j10, Uri uri, String str) {
        String str2 = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.T = str;
        this.S = null;
        this.U = null;
        boolean z10 = false;
        this.V = false;
        this.f36008d0 = false;
        this.f36012f0 = false;
        this.H = false;
        this.f36022y = false;
        this.G = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.f36020w = z10;
        I();
        this.d.u1(f0(j10, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, j51 j51Var) {
        int i3;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = j51Var;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.f36008d0 = false;
        this.H = false;
        this.f36022y = false;
        this.G = null;
        this.f36020w = true;
        I();
        this.f36012f0 = false;
        if (j51Var != null && (arrayList2 = this.O) != null) {
            i3 = arrayList2.indexOf(j51Var);
        } else {
            i3 = -1;
        }
        this.f36010e0 = i3;
        w0(true, j51Var);
        if (this.f36008d0) {
            this.f36010e0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        w2.x xVar = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.S = uri2;
        this.T = str;
        this.U = str2;
        this.V = true;
        this.f36012f0 = false;
        this.f36022y = true;
        this.I = false;
        this.H = false;
        I();
        w2.x xVar2 = null;
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            w2.x xVar3 = new w2.x(f0(0L, uri3, str3));
            if (i3 == 0) {
                xVar = xVar3;
            } else {
                xVar2 = xVar3;
            }
        }
        this.d.u1(xVar, true);
        this.d.a();
        this.f36009e.u1(xVar2, true);
        this.f36009e.a();
        f36001l0.add(Integer.valueOf(this.f36002a));
    }

    public final void m0() {
        f36001l0.remove(Integer.valueOf(this.f36002a));
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        k2.i0 i0Var2 = this.f36009e;
        if (i0Var2 != null) {
            i0Var2.X0();
            this.f36009e = null;
        }
        if (this.X) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.H4);
        }
    }

    @Override
    public final void o(d2.x0 x0Var) {
        org.telegram.messenger.g0.h3(new p11(5, this, x0Var));
    }

    @Override
    public final void onRenderedFirstFrame(l2.a aVar) {
        this.f36014h0 = -9223372036854775807L;
        this.f36013g0 = -9223372036854775807L;
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(l2.a aVar) {
        k51 k51Var = this.K;
        if (k51Var != null) {
            k51Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j10) {
        q0(j10, false);
    }

    public final void q0(long j10, boolean z10) {
        k2.t1 t1Var;
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (z10) {
                t1Var = k2.t1.d;
            } else {
                t1Var = k2.t1.f16736c;
            }
            i0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void r0(long j10, boolean z10, Runnable runnable) {
        k2.t1 t1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f36016j0.add(runnable);
            }
            k2.i0 i0Var = this.d;
            if (z10) {
                t1Var = k2.t1.d;
            } else {
                t1Var = k2.t1.f16736c;
            }
            i0Var.w1(t1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void s0(boolean z10) {
        int i3;
        if (this.W != z10) {
            this.W = z10;
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                if (z10) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                i0Var.k(i3);
            }
        }
    }

    public final void t0(boolean z10) {
        float f10;
        k2.i0 i0Var = this.d;
        float f11 = 1.0f;
        if (i0Var != null) {
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            i0Var.R(f10);
        }
        k2.i0 i0Var2 = this.f36009e;
        if (i0Var2 != null) {
            if (z10) {
                f11 = 0.0f;
            }
            i0Var2.R(f11);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.f36022y && (!this.I || !this.H)) {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.V(false);
            }
            k2.i0 i0Var2 = this.f36009e;
            if (i0Var2 != null) {
                i0Var2.V(false);
                return;
            }
            return;
        }
        this.f36021x = z10;
        k2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.V(z10);
        }
        k2.i0 i0Var4 = this.f36009e;
        if (i0Var4 != null) {
            i0Var4.V(z10);
        }
    }

    @Override
    public final void v(d2.v1 v1Var) {
        org.telegram.ui.xm0 xm0Var = this.f36015i0;
        if (xm0Var != null) {
            org.telegram.messenger.g0.h3(xm0Var);
        }
    }

    public void v0(float f10) {
        try {
            k2.i0 i0Var = this.d;
            if (i0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                i0Var.c(new d2.y0(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void w0(boolean r21, org.telegram.ui.Components.j51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m51.w0(boolean, org.telegram.ui.Components.j51):void");
    }

    public final void x0(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        k2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (i3 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if (i3 == 0) {
                i13 = 1;
            } else {
                i13 = 3;
            }
            i0Var.A0(new d2.f(i13, 0, i12, 1, false, 0, true), false);
        }
        k2.i0 i0Var2 = this.f36009e;
        if (i0Var2 != null) {
            if (i3 == 0) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i3 == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            i0Var2.A0(new d2.f(i11, 0, i10, 1, false, 0, true), true);
        }
    }

    public final void y0(Surface surface) {
        if (this.f36019s != surface) {
            this.f36019s = surface;
            k2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f36018r != surfaceView) {
            this.f36018r = surfaceView;
            k2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            i0Var.Q(holder);
        }
    }

    public m51(boolean z10, boolean z11) {
        int i3 = f36000k0;
        f36000k0 = i3 + 1;
        this.f36002a = i3;
        this.f36005b0 = new Handler(Looper.getMainLooper());
        this.f36008d0 = false;
        this.f36010e0 = -1;
        this.f36013g0 = -9223372036854775807L;
        this.f36014h0 = -9223372036854775807L;
        this.f36016j0 = new ArrayList();
        this.f36007c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.f25457b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        z2.n nVar = new z2.n(org.telegram.messenger.t0.f25457b, new ra.e(28));
        this.f36011f = nVar;
        if (z11) {
            z2.i j10 = nVar.j();
            j10.getClass();
            z2.h hVar = new z2.h(j10);
            hVar.I.add(1);
            nVar.b(new z2.i(hVar));
        }
        this.M = 1;
        this.X = z10;
        if (z10) {
            org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.H4);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override
    public final void C(d2.q0 q0Var) {
    }

    @Override
    public final void F(List list) {
    }

    @Override
    public final void H(d2.y0 y0Var) {
    }

    @Override
    public final void L(d2.q0 q0Var) {
    }

    @Override
    public final void N(d2.a1 a1Var) {
    }

    @Override
    public final void O(d2.b1 b1Var) {
    }

    @Override
    public final void P(boolean z10) {
    }

    @Override
    public final void a(int i3) {
    }

    @Override
    public final void c(int i3) {
    }

    @Override
    public final void d(w2.c0 c0Var) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void g(int i3) {
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void i(int i3) {
    }

    @Override
    public final void j(d2.x0 x0Var) {
    }

    @Override
    public final void k(f2.c cVar) {
    }

    @Override
    public final void l(d2.x0 x0Var) {
    }

    @Override
    public final void m(d2.s0 s0Var) {
    }

    @Override
    public final void p(boolean z10) {
    }

    @Override
    public final void s(float f10) {
    }

    @Override
    public final void t(k2.d dVar) {
    }

    @Override
    public final void u(d2.f fVar) {
    }

    @Override
    public final void w(int i3) {
    }

    @Override
    public final void x(d2.a2 a2Var) {
    }

    @Override
    public final void y(boolean z10) {
    }

    @Override
    public final void D(l2.a aVar, w2.c0 c0Var) {
    }

    @Override
    public final void E(d2.n1 n1Var, int i3) {
    }

    @Override
    public final void J(int i3, int i10) {
    }

    @Override
    public final void b(d2.e1 e1Var, tf.b bVar) {
    }

    @Override
    public final void n(int i3, d2.n0 n0Var) {
    }

    @Override
    public final void r(int i3, boolean z10) {
    }

    @Override
    public final void q(d2.d1 d1Var, d2.d1 d1Var2, int i3) {
    }

    @Override
    public final void z(l2.a aVar, int i3, long j10) {
    }
}
