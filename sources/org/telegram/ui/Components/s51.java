package org.telegram.ui.Components;

import a8.wa;
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
import o2.h;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n;
import org.telegram.ui.hy0;
import p2.e;
import pb.b;
import q2.m;
import r2.c;
import r2.l;
import s2.t;
import sa.d;
import sg.i0;
import w7.s;
import x2.a;
import x2.f0;
public class s51 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.ls {
    public static int f37896j0;
    public static final HashSet f37897k0 = new HashSet();
    public static HashMap f37898l0;
    public boolean D;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public p51 J;
    public l51 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public o51 O;
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
    public x2.x0 Z;
    public final int f37899a;
    public final Handler f37900a0;
    public org.telegram.messenger.q5 f37901b;
    public final boolean f37902b0;
    public boolean f37903c;
    public boolean f37904c0;
    public l2.i0 d;
    public int f37905d0;
    public l2.i0 f37906e;
    public boolean f37907e0;
    public final a3.s f37908f;
    public long f37909f0;
    public long f37910g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.wn0 f37911h0;
    public final ArrayList f37912i0;
    public TextureView f37913n;
    public SurfaceView f37914r;
    public Surface f37915s;
    public boolean f37916w;
    public boolean f37917x;
    public boolean f37918y;

    public s51() {
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
            if (f37898l0 == null) {
                f37898l0 = new HashMap();
            }
            Boolean bool = (Boolean) f37898l0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!org.telegram.messenger.qp.e1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i7 = 0; i7 < codecCount; i7++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
                    if (!codecInfoAt.isEncoder() && u2.w.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f37898l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f37898l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static q51 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((o51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                q51 q51Var = (q51) obj2;
                if (q51Var.b()) {
                    return q51Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z9) {
        o51 o51Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!org.telegram.messenger.qp.s1(i7).F6 && arrayList != null) {
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
                    q51 d = q51.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.f26958id), i10, z9);
                    if (d.f37156i > 0 && d.f37157j > 0) {
                        if (document3 == document) {
                            d.f37151b = true;
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
            q51 q51Var = (q51) arrayList3.get(i13);
            String str2 = q51Var.f37160m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(q51Var.f37160m) && !"hevc".equals(q51Var.f37160m) && !"h265".equals(q51Var.f37160m) && !"vp9".equals(q51Var.f37160m)) || D0(q51Var.f37160m))) {
                arrayList4.add(q51Var);
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
            q51 q51Var2 = (q51) obj;
            if (q51Var2.f37151b) {
                arrayList6.add(new o51(q51Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        o51Var = (o51) obj2;
                        if (!o51Var.f36516a && o51Var.f36517b == q51Var2.f37156i && o51Var.f36518c == q51Var2.f37157j) {
                            break;
                        }
                    } else {
                        o51Var = null;
                        break;
                    }
                }
                if (o51Var != null && !org.telegram.messenger.iz.R0) {
                    o51Var.d.add(q51Var2);
                } else {
                    arrayList6.add(new o51(q51Var2));
                }
            }
        }
        return arrayList6;
    }

    public static q51 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((o51) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                q51 q51Var = (q51) obj2;
                if (q51Var.f37151b && q51Var.b()) {
                    return q51Var;
                }
            }
        }
        int size3 = arrayList.size();
        q51 q51Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((o51) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                q51 q51Var3 = (q51) obj4;
                if (!q51Var3.f37151b && D0(q51Var3.f37160m) && (q51Var2 == null || (i7 = q51Var3.f37156i * q51Var3.f37157j) > (i10 = q51Var2.f37156i * q51Var2.f37157j) || (i7 == i10 && q51Var3.f37159l < q51Var2.f37159l))) {
                    q51Var2 = q51Var3;
                }
            }
        }
        if (q51Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((o51) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    q51 q51Var4 = (q51) obj6;
                    if (q51Var2 == null || q51Var2.f37156i * q51Var2.f37157j > q51Var4.f37156i * q51Var4.f37157j || q51Var4.f37159l < q51Var2.f37159l) {
                        q51Var2 = q51Var4;
                    }
                }
            }
        }
        return q51Var2;
    }

    public static q51 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((o51) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                q51 q51Var = (q51) obj2;
                if (q51Var.b()) {
                    return q51Var;
                }
            }
        }
        int size3 = arrayList.size();
        q51 q51Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((o51) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                q51 q51Var3 = (q51) obj4;
                if (!q51Var3.f37151b && (q51Var2 == null || q51Var2.f37156i * q51Var2.f37157j > q51Var3.f37156i * q51Var3.f37157j || q51Var3.f37159l < q51Var2.f37159l)) {
                    if (q51Var3.f37156i <= 900 && q51Var3.f37157j <= 900) {
                        q51Var2 = q51Var3;
                    }
                }
            }
        }
        if (q51Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((o51) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    q51 q51Var4 = (q51) obj6;
                    if (q51Var2 == null || q51Var2.f37156i * q51Var2.f37157j > q51Var4.f37156i * q51Var4.f37157j || q51Var4.f37159l < q51Var2.f37159l) {
                        q51Var2 = q51Var4;
                    }
                }
            }
        }
        return q51Var2;
    }

    public static void n0(org.telegram.messenger.ij ijVar, boolean z9) {
        if (ijVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25555b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.ij.B0(ijVar.f23237k) + "_" + ijVar.f1() + "loop", z9).apply();
    }

    public static void o0(o51 o51Var, org.telegram.messenger.ij ijVar) {
        String str;
        if (ijVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
        int f12 = ijVar.f1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f25555b.getSharedPreferences("media_saved_pos", 0).edit();
        if (o51Var == null) {
            edit.remove(B0 + "_" + f12 + "q2");
        } else {
            String str2 = B0 + "_" + f12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o51Var.f36517b);
            sb2.append("x");
            sb2.append(o51Var.f36518c);
            if (o51Var.f36516a) {
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
    public final void A(m2.a aVar, int i7) {
        if (i7 == 1) {
            p51 p51Var = this.J;
            if (p51Var != null) {
                p51Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f37912i0;
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
        if (this.f37913n != textureView) {
            this.f37913n = textureView;
            l2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.z1(textureView);
        }
    }

    public final void B0(float f10) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.T(f10);
        }
        l2.i0 i0Var2 = this.f37906e;
        if (i0Var2 != null) {
            i0Var2.T(f10);
        }
    }

    @Override
    public final void C(int i7, boolean z9) {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            boolean u10 = i0Var.u();
            int i10 = this.d.i();
            if (this.M != u10 || this.L != i10) {
                this.J.onStateChanged(u10, i10);
                this.M = u10;
                this.L = i10;
            }
        }
        if (z9 && i7 == 3 && !c0() && this.W) {
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.H4, this);
        }
        if (!this.G && i7 == 3) {
            this.G = true;
            if (this.H && this.I) {
                h0();
            }
        }
        if (i7 != 3) {
            this.f37900a0.removeCallbacksAndMessages(null);
            l51 l51Var = this.K;
            if (l51Var != null) {
                l51Var.F(false, null);
            }
        }
    }

    public final void C0(org.telegram.messenger.q5 q5Var) {
        this.f37901b = q5Var;
        if (q5Var != null) {
            this.d.f17882s0 = new j51(q5Var);
            return;
        }
        this.d.f17882s0 = null;
    }

    @Override
    public final void D(e2.q1 q1Var) {
        org.telegram.ui.wn0 wn0Var = this.f37911h0;
        if (wn0Var != null) {
            org.telegram.messenger.g0.h3(wn0Var);
        }
    }

    public final void I() {
        int i7;
        l2.j jVar;
        int i10;
        HashMap hashMap = new HashMap();
        hashMap.put(m2.j.f19558c.f19559a, 144179200);
        b3.e eVar = new b3.e();
        boolean z9 = this.f37903c;
        int i11 = 1000;
        if (z9) {
            i7 = 1000;
        } else {
            i7 = 100;
        }
        if (!z9) {
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
            if (this.K != null) {
                jVar = new m51(org.telegram.messenger.t0.f25555b, this);
            } else {
                jVar = new l2.j(org.telegram.messenger.t0.f25555b);
            }
            jVar.f17896c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.f25555b);
            a8.ia.p(!nVar.f17961z);
            nVar.f17941c = new l2.m(jVar, 2);
            a3.s sVar = this.f37908f;
            a8.ia.p(!nVar.f17961z);
            sVar.getClass();
            nVar.f17942e = new l2.m(sVar, 1);
            a8.ia.p(!nVar.f17961z);
            nVar.f17943f = new l2.m(hVar, 0);
            l2.i0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.e eVar2 = this.d.f17881s;
            eVar2.getClass();
            eVar2.f19529f.a(this);
            this.d.f17870m.a(this);
            this.d.f17884t0.add(this);
            TextureView textureView = this.f37913n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f37915s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f37914r;
                    if (surfaceView != null) {
                        l2.i0 i0Var = this.d;
                        i0Var.F1();
                        i0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f37917x);
            l2.i0 i0Var2 = this.d;
            if (this.V) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            i0Var2.k(i10);
        }
        if (this.f37918y && this.f37906e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.f25555b);
            a3.s sVar2 = this.f37908f;
            a8.ia.p(!nVar2.f17961z);
            sVar2.getClass();
            nVar2.f17942e = new l2.m(sVar2, 1);
            a8.ia.p(true ^ nVar2.f17961z);
            nVar2.f17943f = new l2.m(hVar, 0);
            l2.i0 a11 = nVar2.a();
            this.f37906e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.f37906e.f17870m.a(new h2.z(this, 1));
            this.f37906e.X(this.f37917x);
        }
    }

    public final long K() {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (this.f37916w) {
                return i0Var.d0();
            }
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final g7.c Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String i7 = rf.b.i("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            v4.v0 v0Var = new v4.v0(this.Q, str5, i7);
            v0Var.f57090g = str2;
            v0Var.h = str3;
            return new g7.c(new wf.e(v0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((o51) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                q51 q51Var = (q51) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(q51Var.f37152c);
                String sb3 = sb2.toString();
                TLRPC.Document document = q51Var.f37155g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.v0 v0Var2 = new v4.v0(q51Var.d, str4, sb3);
                v0Var2.f57090g = str2;
                v0Var2.h = str3;
                int i12 = q51Var.f37156i;
                int i13 = q51Var.f37157j;
                v0Var2.f57085a = i12;
                v0Var2.f57086b = i13;
                arrayList.add(new wf.e(v0Var2));
                arrayList2 = arrayList4;
            }
        }
        return new g7.c(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            e2.u uVar = i0Var.S;
            if (uVar != null && uVar.f10611o != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((o51) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        q51 q51Var = (q51) obj2;
                        if (q51Var.f37152c == uVar.f10611o) {
                            return q51Var.f37155g;
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
        long j3 = this.f37910g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.l();
        }
        return 0L;
    }

    public final int T() {
        if (this.f37905d0 == -1) {
            try {
                if (this.f37904c0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).f36516a) {
                            return i7;
                        }
                    }
                }
                l2.i0 i0Var = this.d;
                if (i0Var != null) {
                    i0Var.F1();
                    e2.u uVar = i0Var.S;
                    if (uVar != null) {
                        for (int i10 = 0; i10 < Y(); i10++) {
                            o51 Z = Z(i10);
                            if (!Z.f36516a && uVar.f10621z == Z.f36517b && uVar.A == Z.f36518c && uVar.f10606j == ((int) Math.floor(((q51) Z.d.get(0)).f37159l * 8.0d))) {
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
        return this.f37905d0;
    }

    public final long U() {
        long j3 = this.f37909f0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            return i0Var.getDuration();
        }
        return 0L;
    }

    public final fi.d7 V(fi.d7 d7Var) {
        fi.d7 d7Var2 = d7Var;
        if (d7Var == null) {
            d7Var2 = new Object();
        }
        try {
            l2.i0 i0Var = this.d;
            i0Var.F1();
            MediaFormat mediaFormat = ((u2.r) i0Var.f17859g[0]).f56195f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    d7Var2.f11793b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    d7Var2.f11792a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return d7Var2;
    }

    public final o51 W(Boolean bool) {
        o51 o51Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            o51 Z = Z(i7);
            if (Z.f36516a == bool.booleanValue() && (o51Var == null || o51Var.f36517b * o51Var.f36518c < Z.f36517b * Z.f36518c)) {
                o51Var = Z;
            }
        }
        return o51Var;
    }

    public final int Y() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final o51 Z(int i7) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            return (o51) this.N.get(i7);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(e2.x1 x1Var) {
        if (!Objects.equals(x1Var, e2.x1.d)) {
            this.J.onVideoSizeChanged(x1Var.f10649a, x1Var.f10650b, 0, x1Var.f10651c);
        }
    }

    public final boolean c0() {
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.F1();
            if (i0Var.f17851b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d0() {
        if (!this.f37918y || !this.I) {
            l2.i0 i0Var = this.d;
            if (i0Var != null && i0Var.u()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.H4 && ((s51) objArr[0]) != this && d0() && !this.D) {
            g0();
        }
    }

    public final Uri e0(ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.P = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z9 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList3 = ((o51) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                q51 q51Var = (q51) obj2;
                long j3 = q51Var.f37152c;
                Uri uri = q51Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(q51Var.f37153e, q51Var.f37154f);
                if (q51Var.f37154f != null) {
                    this.P.add(q51Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(q51Var.f37159l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(q51Var.f37156i);
                    sb3.append("x");
                    sb3.append(q51Var.f37157j);
                    String str2 = q51Var.f37160m;
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
                    if (q51Var.b() && q51Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(q51Var.f37152c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(q51Var.f37150a);
                    sb3.append("\"\n");
                    if (q51Var.c()) {
                        sb3.append(q51Var.f37154f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(q51Var.f37153e);
                        sb3.append("\n\n");
                    }
                    arrayList2.add(sb3.toString());
                    z9 = true;
                }
            }
        }
        if (!z9) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb2.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb2.toString().getBytes(), 2));
    }

    public final x2.a f0(long j3, Uri uri, String str) {
        boolean z9;
        e2.e0 e0Var;
        e2.g0 g0Var;
        q2.m mVar;
        q2.m mVar2;
        e2.d0 d0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        e2.z zVar = new e2.z();
        e2.c0 c0Var = new e2.c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14397e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (c0Var.f10195b != null && c0Var.f10194a == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        a8.ia.p(z9);
        if (uri != null) {
            if (c0Var.f10194a != null) {
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
            di.c1 c1Var = new di.c1(this, j3, 6);
            u5.e eVar = new u5.e(new f3.m(), 10);
            Object obj = new Object();
            pb.b bVar = new pb.b(4);
            g0Var.getClass();
            l0Var.f10350b.getClass();
            e2.d0 d0Var2 = l0Var.f10350b.f10261c;
            if (d0Var2 == null) {
                mVar2 = q2.m.A;
            } else {
                synchronized (obj) {
                    try {
                        if (!d0Var2.equals(null)) {
                            mVar = org.telegram.ui.hy0.o(d0Var2);
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
            return new x2.y0(l0Var, c1Var, eVar, mVar2, bVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new x2.x0(extendedDefaultDataSourceFactory, new f3.m());
                }
                return this.Z.b(l0Var);
            }
            if (this.X == null) {
                this.X = new x2.f0(extendedDefaultDataSourceFactory) {
                    public final wa f2660a;
                    public final g f2661b;
                    public final hy0 f2662c;
                    public final d d;
                    public final b f2663e;
                    public final long f2664f;
                    public final long f2665g;

                    {
                        wa waVar = new wa(extendedDefaultDataSourceFactory);
                        this.f2660a = waVar;
                        this.f2661b = extendedDefaultDataSourceFactory;
                        this.f2662c = new hy0(6);
                        this.f2663e = new b(4);
                        this.f2664f = 30000L;
                        this.f2665g = 5000000L;
                        this.d = new d(27);
                        ((w0) waVar.d).f3392a = true;
                    }

                    @Override
                    public final f0 a(s sVar) {
                        w0 w0Var = (w0) this.f2660a.d;
                        w0Var.getClass();
                        w0Var.f3394c = sVar;
                        return this;
                    }

                    @Override
                    public final a b(l0 l0Var2) {
                        q qVar;
                        l0Var2.f10350b.getClass();
                        e eVar2 = new e();
                        List list2 = l0Var2.f10350b.f10262e;
                        if (!list2.isEmpty()) {
                            qVar = new i0(8, eVar2, list2);
                        } else {
                            qVar = eVar2;
                        }
                        return new h(l0Var2, this.f2661b, qVar, this.f2660a, this.d, this.f2662c.t(l0Var2), this.f2663e, this.f2664f, this.f2665g);
                    }

                    @Override
                    public final f0 c(boolean z10) {
                        ((w0) this.f2660a.d).f3392a = z10;
                        return this;
                    }

                    @Override
                    public final f0 d(int i7) {
                        ((w0) this.f2660a.d).f3393b = i7;
                        return this;
                    }
                };
            }
            return b(l0Var);
        }
        if (this.Y == null) {
            this.Y = new x2.f0(extendedDefaultDataSourceFactory) {
                public final n f2666a;
                public c f2667b;
                public s f2668c;
                public final hy0 f2672i = new hy0(6);
                public final d f2670f = new d(23);
                public final s0.b f2671g = s2.d.J;
                public final b f2673j = new b(4);
                public final d h = new d(27);
                public final int f2675l = 1;
                public final long f2676m = -9223372036854775807L;
                public final boolean f2674k = true;
                public int f2669e = 3;
                public boolean d = true;

                {
                    this.f2666a = new n(extendedDefaultDataSourceFactory);
                }

                @Override
                public final f0 a(s sVar) {
                    this.f2668c = sVar;
                    return this;
                }

                @Override
                public final f0 c(boolean z10) {
                    this.d = z10;
                    return this;
                }

                @Override
                public final f0 d(int i7) {
                    this.f2669e = i7;
                    return this;
                }

                @Override
                public final l b(l0 l0Var2) {
                    l0Var2.f10350b.getClass();
                    if (this.f2667b == null) {
                        ?? obj2 = new Object();
                        obj2.f54193a = new s(5, false);
                        obj2.f54195c = 3;
                        this.f2667b = obj2;
                    }
                    s sVar = this.f2668c;
                    if (sVar != null) {
                        this.f2667b.f54193a = sVar;
                    }
                    c cVar = this.f2667b;
                    cVar.f54194b = this.d;
                    cVar.f54195c = this.f2669e;
                    List list2 = l0Var2.f10350b.f10262e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2670f;
                    if (!isEmpty) {
                        tVar = new j2.n(tVar, list2, false, 29);
                    }
                    m t6 = this.f2672i.t(l0Var2);
                    this.f2671g.getClass();
                    n nVar = this.f2666a;
                    b bVar2 = this.f2673j;
                    return new l(l0Var2, nVar, cVar, this.h, t6, bVar2, new s2.d(nVar, bVar2, tVar), this.f2676m, this.f2674k, this.f2675l);
                }
            };
        }
        return b(l0Var);
    }

    public void g0() {
        this.I = false;
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X(false);
        }
        l2.i0 i0Var2 = this.f37906e;
        if (i0Var2 != null) {
            i0Var2.X(false);
        }
        if (this.K != null) {
            this.f37900a0.removeCallbacksAndMessages(null);
            this.K.F(false, null);
        }
    }

    public void h0() {
        this.I = true;
        if (this.f37918y && (!this.H || !this.G)) {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(false);
            }
            l2.i0 i0Var2 = this.f37906e;
            if (i0Var2 != null) {
                i0Var2.X(false);
                return;
            }
            return;
        }
        l2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(true);
        }
        l2.i0 i0Var4 = this.f37906e;
        if (i0Var4 != null) {
            i0Var4.X(true);
        }
    }

    public final void i0(long j3, Uri uri, String str) {
        String str2 = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.S = str;
        this.R = null;
        this.T = null;
        boolean z9 = false;
        this.U = false;
        this.f37904c0 = false;
        this.f37907e0 = false;
        this.G = false;
        this.f37918y = false;
        this.F = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z9 = true;
        }
        this.f37916w = z9;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, o51 o51Var) {
        int i7;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = o51Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f37904c0 = false;
        this.G = false;
        this.f37918y = false;
        this.F = null;
        this.f37916w = true;
        I();
        this.f37907e0 = false;
        if (o51Var != null && (arrayList2 = this.N) != null) {
            i7 = arrayList2.indexOf(o51Var);
        } else {
            i7 = -1;
        }
        this.f37905d0 = i7;
        w0(true, o51Var);
        if (this.f37904c0) {
            this.f37905d0 = -1;
        }
    }

    public final void l0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        x2.x xVar = null;
        this.N = null;
        this.O = null;
        this.Q = uri;
        this.R = uri2;
        this.S = str;
        this.T = str2;
        this.U = true;
        this.f37907e0 = false;
        this.f37918y = true;
        this.H = false;
        this.G = false;
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
        this.f37906e.u1(xVar2, true);
        this.f37906e.a();
        f37897k0.add(Integer.valueOf(this.f37899a));
    }

    public final void m0() {
        f37897k0.remove(Integer.valueOf(this.f37899a));
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            i0Var.X0();
            this.d = null;
        }
        l2.i0 i0Var2 = this.f37906e;
        if (i0Var2 != null) {
            i0Var2.X0();
            this.f37906e = null;
        }
        if (this.W) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.H4);
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.f37910g0 = -9223372036854775807L;
        this.f37909f0 = -9223372036854775807L;
        p51 p51Var = this.J;
        if (p51Var != null) {
            p51Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        p51 p51Var = this.J;
        if (p51Var != null) {
            p51Var.onSeekStarted(aVar);
        }
    }

    public void p0(long j3) {
        q0(j3, false);
    }

    public final void q0(long j3, boolean z9) {
        l2.t1 t1Var;
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
            if (z9) {
                t1Var = l2.t1.d;
            } else {
                t1Var = l2.t1.f18048c;
            }
            i0Var.w1(t1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z9, Runnable runnable) {
        l2.t1 t1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f37912i0.add(runnable);
            }
            l2.i0 i0Var = this.d;
            if (z9) {
                t1Var = l2.t1.d;
            } else {
                t1Var = l2.t1.f18048c;
            }
            i0Var.w1(t1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void s0(boolean z9) {
        int i7;
        if (this.V != z9) {
            this.V = z9;
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                if (z9) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                i0Var.k(i7);
            }
        }
    }

    public final void t0(boolean z9) {
        float f10;
        l2.i0 i0Var = this.d;
        float f11 = 1.0f;
        if (i0Var != null) {
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            i0Var.T(f10);
        }
        l2.i0 i0Var2 = this.f37906e;
        if (i0Var2 != null) {
            if (z9) {
                f11 = 0.0f;
            }
            i0Var2.T(f11);
        }
    }

    @Override
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.wn0 wn0Var = this.f37911h0;
        if (wn0Var != null) {
            org.telegram.messenger.g0.h3(wn0Var);
        }
    }

    public void u0(boolean z9) {
        this.I = z9;
        if (z9 && this.f37918y && (!this.H || !this.G)) {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                i0Var.X(false);
            }
            l2.i0 i0Var2 = this.f37906e;
            if (i0Var2 != null) {
                i0Var2.X(false);
                return;
            }
            return;
        }
        this.f37917x = z9;
        l2.i0 i0Var3 = this.d;
        if (i0Var3 != null) {
            i0Var3.X(z9);
        }
        l2.i0 i0Var4 = this.f37906e;
        if (i0Var4 != null) {
            i0Var4.X(z9);
        }
    }

    public void v0(float f10) {
        try {
            l2.i0 i0Var = this.d;
            if (i0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                i0Var.e(new e2.w0(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void w0(boolean r21, org.telegram.ui.Components.o51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s51.w0(boolean, org.telegram.ui.Components.o51):void");
    }

    public final void x0(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        l2.i0 i0Var = this.d;
        if (i0Var != null) {
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
            i0Var.D(new e2.e(i13, 0, i12, 1, false, 0, true), false);
        }
        l2.i0 i0Var2 = this.f37906e;
        if (i0Var2 != null) {
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
            i0Var2.D(new e2.e(i11, 0, i10, 1, false, 0, true), true);
        }
    }

    @Override
    public final void y(e2.v0 v0Var) {
        org.telegram.messenger.g0.h3(new k51(0, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.f37915s != surface) {
            this.f37915s = surface;
            l2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f37914r != surfaceView) {
            this.f37914r = surfaceView;
            l2.i0 i0Var = this.d;
            if (i0Var == null) {
                return;
            }
            i0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            i0Var.S(holder);
        }
    }

    public s51(boolean z9, boolean z10) {
        int i7 = f37896j0;
        f37896j0 = i7 + 1;
        this.f37899a = i7;
        this.f37900a0 = new Handler(Looper.getMainLooper());
        this.f37904c0 = false;
        this.f37905d0 = -1;
        this.f37909f0 = -9223372036854775807L;
        this.f37910g0 = -9223372036854775807L;
        this.f37912i0 = new ArrayList();
        this.f37902b0 = z10;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.f25555b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.f25555b, new nb.a(1));
        this.f37908f = sVar;
        if (z10) {
            a3.n j3 = sVar.j();
            j3.getClass();
            a3.m mVar = new a3.m(j3);
            mVar.I.add(1);
            sVar.b(new a3.n(mVar));
        }
        this.L = 1;
        this.W = z9;
        if (z9) {
            org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.H4);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
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
    public final void P(boolean z9) {
    }

    @Override
    public final void b(x2.c0 c0Var) {
    }

    @Override
    public final void c(int i7) {
    }

    @Override
    public final void e(int i7) {
    }

    @Override
    public final void f(boolean z9) {
    }

    @Override
    public final void g(int i7) {
    }

    @Override
    public final void h(boolean z9) {
    }

    @Override
    public final void i(int i7) {
    }

    @Override
    public final void j(boolean z9) {
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
    public final void t(boolean z9) {
    }

    @Override
    public final void w(e2.x1 x1Var) {
    }

    @Override
    public final void x(g2.d dVar) {
    }

    @Override
    public final void z(l2.d dVar) {
    }

    @Override
    public final void E(e2.c1 c1Var, wf.b bVar) {
    }

    @Override
    public final void J(int i7, int i10) {
    }

    @Override
    public final void L(e2.l1 l1Var, int i7) {
    }

    @Override
    public final void k(int i7, boolean z9) {
    }

    @Override
    public final void r(m2.a aVar, x2.c0 c0Var) {
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
    }

    @Override
    public final void d(m2.a aVar, int i7, long j3) {
    }

    @Override
    public final void s(e2.b1 b1Var, e2.b1 b1Var2, int i7) {
    }
}
