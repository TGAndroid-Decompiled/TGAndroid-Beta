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
import org.telegram.ui.md0;
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
public class i61 implements e2.a1, e2.w1, m2.b, org.telegram.messenger.fs {
    public static int f36159k0;
    public static final HashSet f36160l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public g61 K;
    public c61 L;
    public int M;
    public boolean N;
    public ArrayList O;
    public f61 P;
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
    public final int f36161a;
    public x2.x0 f36162a0;
    public org.telegram.messenger.r5 f36163b;
    public final Handler f36164b0;
    public boolean f36165c;
    public final boolean f36166c0;
    public l2.f0 d;
    public boolean f36167d0;
    public l2.f0 f36168e;
    public int f36169e0;
    public final a3.s f36170f;
    public boolean f36171f0;
    public long f36172g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long f36173h0;
    public org.telegram.ui.zn0 f36174i0;
    public final ArrayList f36175j0;
    public TextureView f36176n;
    public SurfaceView f36177r;
    public Surface f36178s;
    public boolean f36179w;
    public boolean f36180x;
    public boolean f36181y;

    public i61() {
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

    public static h61 N(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                if (h61Var.b()) {
                    return h61Var;
                }
            }
        }
        return null;
    }

    public static ArrayList X(int i7, TLRPC.Document document, ArrayList arrayList, int i10, boolean z10) {
        f61 f61Var;
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
                    h61 d = h61.d(i7, document3, (TLRPC.Document) longSparseArray.get(document3.f28437id), i10, z10);
                    if (d.f35812i > 0 && d.f35813j > 0) {
                        if (document3 == document) {
                            d.f35807b = true;
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
            h61 h61Var = (h61) arrayList3.get(i13);
            String str2 = h61Var.f35816m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(h61Var.f35816m) && !"hevc".equals(h61Var.f35816m) && !"h265".equals(h61Var.f35816m) && !"vp9".equals(h61Var.f35816m)) || D0(h61Var.f35816m))) {
                arrayList4.add(h61Var);
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
            h61 h61Var2 = (h61) obj;
            if (h61Var2.f35807b) {
                arrayList6.add(new f61(h61Var2));
            } else {
                int size2 = arrayList6.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size2) {
                        Object obj2 = arrayList6.get(i15);
                        i15++;
                        f61Var = (f61) obj2;
                        if (!f61Var.f35099a && f61Var.f35100b == h61Var2.f35812i && f61Var.f35101c == h61Var2.f35813j) {
                            break;
                        }
                    } else {
                        f61Var = null;
                        break;
                    }
                }
                if (f61Var != null && !org.telegram.messenger.bz.R0) {
                    f61Var.d.add(h61Var2);
                } else {
                    arrayList6.add(new f61(h61Var2));
                }
            }
        }
        return arrayList6;
    }

    public static h61 a0(ArrayList arrayList) {
        int i7;
        int i10;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                h61 h61Var = (h61) obj2;
                if (h61Var.f35807b && h61Var.b()) {
                    return h61Var;
                }
            }
        }
        int size3 = arrayList.size();
        h61 h61Var2 = null;
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            ArrayList arrayList3 = ((f61) obj3).d;
            int size4 = arrayList3.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                h61 h61Var3 = (h61) obj4;
                if (!h61Var3.f35807b && D0(h61Var3.f35816m) && (h61Var2 == null || (i7 = h61Var3.f35812i * h61Var3.f35813j) > (i10 = h61Var2.f35812i * h61Var2.f35813j) || (i7 == i10 && h61Var3.f35815l < h61Var2.f35815l))) {
                    h61Var2 = h61Var3;
                }
            }
        }
        if (h61Var2 == null) {
            int size5 = arrayList.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList.get(i15);
                i15++;
                ArrayList arrayList4 = ((f61) obj5).d;
                int size6 = arrayList4.size();
                int i16 = 0;
                while (i16 < size6) {
                    Object obj6 = arrayList4.get(i16);
                    i16++;
                    h61 h61Var4 = (h61) obj6;
                    if (h61Var2 == null || h61Var2.f35812i * h61Var2.f35813j > h61Var4.f35812i * h61Var4.f35813j || h61Var4.f35815l < h61Var2.f35815l) {
                        h61Var2 = h61Var4;
                    }
                }
            }
        }
        return h61Var2;
    }

    public static h61 b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ArrayList arrayList2 = ((f61) obj).d;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                if (h61Var.b()) {
                    return h61Var;
                }
            }
        }
        int size3 = arrayList.size();
        h61 h61Var2 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            ArrayList arrayList3 = ((f61) obj3).d;
            int size4 = arrayList3.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList3.get(i12);
                i12++;
                h61 h61Var3 = (h61) obj4;
                if (!h61Var3.f35807b && (h61Var2 == null || h61Var2.f35812i * h61Var2.f35813j > h61Var3.f35812i * h61Var3.f35813j || h61Var3.f35815l < h61Var2.f35815l)) {
                    if (h61Var3.f35812i <= 900 && h61Var3.f35813j <= 900) {
                        h61Var2 = h61Var3;
                    }
                }
            }
        }
        if (h61Var2 == null) {
            int size5 = arrayList.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj5 = arrayList.get(i13);
                i13++;
                ArrayList arrayList4 = ((f61) obj5).d;
                int size6 = arrayList4.size();
                int i14 = 0;
                while (i14 < size6) {
                    Object obj6 = arrayList4.get(i14);
                    i14++;
                    h61 h61Var4 = (h61) obj6;
                    if (h61Var2 == null || h61Var2.f35812i * h61Var2.f35813j > h61Var4.f35812i * h61Var4.f35813j || h61Var4.f35815l < h61Var2.f35815l) {
                        h61Var2 = h61Var4;
                    }
                }
            }
        }
        return h61Var2;
    }

    public static void n0(org.telegram.messenger.fj fjVar, boolean z10) {
        if (fjVar == null) {
            return;
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26941b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(org.telegram.messenger.fj.B0(fjVar.f23993k) + "_" + fjVar.e1() + "loop", z10).apply();
    }

    public static void o0(f61 f61Var, org.telegram.messenger.fj fjVar) {
        String str;
        if (fjVar == null) {
            return;
        }
        long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
        int e12 = fjVar.e1();
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26941b.getSharedPreferences("media_saved_pos", 0).edit();
        if (f61Var == null) {
            edit.remove(B0 + "_" + e12 + "q2");
        } else {
            String str2 = B0 + "_" + e12 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f61Var.f35100b);
            sb2.append("x");
            sb2.append(f61Var.f35101c);
            if (f61Var.f35099a) {
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
        if (this.f36176n != textureView) {
            this.f36176n = textureView;
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
        l2.f0 f0Var2 = this.f36168e;
        if (f0Var2 != null) {
            f0Var2.T(f10);
        }
    }

    @Override
    public final void C(m2.a aVar, int i7) {
        if (i7 == 1) {
            g61 g61Var = this.K;
            if (g61Var != null) {
                g61Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f36175j0;
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
        this.f36163b = r5Var;
        if (r5Var != null) {
            this.d.f19373s0 = new b61(r5Var);
            return;
        }
        this.d.f19373s0 = null;
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
            this.f36164b0.removeCallbacksAndMessages(null);
            c61 c61Var = this.L;
            if (c61Var != null) {
                c61Var.x(false, null);
            }
        }
    }

    @Override
    public final void E(e2.q1 q1Var) {
        org.telegram.ui.zn0 zn0Var = this.f36174i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public final void I() {
        int i7;
        l2.j jVar;
        int i10;
        HashMap hashMap = new HashMap();
        hashMap.put(m2.i.f20546c.f20547a, 144179200);
        b3.e eVar = new b3.e();
        boolean z10 = this.f36165c;
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
                jVar = new d61(org.telegram.messenger.t0.f26941b, this);
            } else {
                jVar = new l2.j(org.telegram.messenger.t0.f26941b);
            }
            jVar.f19440c = 1;
            l2.n nVar = new l2.n(org.telegram.messenger.t0.f26941b);
            a8.la.p(!nVar.f19502z);
            nVar.f19482c = new l2.m(jVar, 2);
            a3.s sVar = this.f36170f;
            a8.la.p(!nVar.f19502z);
            sVar.getClass();
            nVar.f19483e = new l2.m(sVar, 1);
            a8.la.p(!nVar.f19502z);
            nVar.f19484f = new l2.m(hVar, 0);
            l2.f0 a10 = nVar.a();
            this.d = a10;
            a10.D(new e2.e(3, 0, 1, 1, false, 0, true), false);
            m2.d dVar = this.d.f19372s;
            dVar.getClass();
            dVar.f20517f.a(this);
            this.d.f19361m.a(this);
            this.d.f19375t0.add(this);
            TextureView textureView = this.f36176n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f36178s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f36177r;
                    if (surfaceView != null) {
                        l2.f0 f0Var = this.d;
                        f0Var.F1();
                        f0Var.S(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f36180x);
            l2.f0 f0Var2 = this.d;
            if (this.W) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            f0Var2.k(i10);
        }
        if (this.f36181y && this.f36168e == null) {
            l2.n nVar2 = new l2.n(org.telegram.messenger.t0.f26941b);
            a3.s sVar2 = this.f36170f;
            a8.la.p(!nVar2.f19502z);
            sVar2.getClass();
            nVar2.f19483e = new l2.m(sVar2, 1);
            a8.la.p(true ^ nVar2.f19502z);
            nVar2.f19484f = new l2.m(hVar, 0);
            l2.f0 a11 = nVar2.a();
            this.f36168e = a11;
            a11.D(new e2.e(2, 0, 1, 1, false, 0, true), false);
            this.f36168e.f19361m.a(new h2.z(this, 1));
            this.f36168e.X(this.f36180x);
        }
    }

    public final long K() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.f36179w) {
                return f0Var.d0();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final oi.z3 Q(String str, String str2, String str3) {
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
            x0Var.f59297g = str2;
            x0Var.h = str3;
            return new oi.z3(new wf.e(x0Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ArrayList arrayList3 = ((f61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(h61Var.f35808c);
                String sb3 = sb2.toString();
                TLRPC.Document document = h61Var.f35811g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                v4.x0 x0Var2 = new v4.x0(h61Var.d, str4, sb3);
                x0Var2.f59297g = str2;
                x0Var2.h = str3;
                int i11 = h61Var.f35812i;
                int i12 = h61Var.f35813j;
                x0Var2.f59292a = i11;
                x0Var2.f59293b = i12;
                arrayList.add(new wf.e(x0Var2));
                arrayList2 = arrayList4;
            }
        }
        ?? obj3 = new Object();
        obj3.f22589a = arrayList;
        return obj3;
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            e2.u uVar = f0Var.S;
            if (uVar != null && uVar.f10791o != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ArrayList arrayList2 = ((f61) obj).d;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        h61 h61Var = (h61) obj2;
                        if (h61Var.f35808c == uVar.f10791o) {
                            return h61Var.f35811g;
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
        long j3 = this.f36173h0;
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
        if (this.f36169e0 == -1) {
            try {
                if (this.f36167d0) {
                    for (int i7 = 0; i7 < Y(); i7++) {
                        if (Z(i7).f35099a) {
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
                            f61 Z = Z(i10);
                            if (!Z.f35099a && uVar.f10801z == Z.f35100b && uVar.A == Z.f35101c && uVar.f10786j == ((int) Math.floor(((h61) Z.d.get(0)).f35815l * 8.0d))) {
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
        return this.f36169e0;
    }

    public final long U() {
        long j3 = this.f36172g0;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final hi.b7 V(hi.b7 b7Var) {
        hi.b7 b7Var2 = b7Var;
        if (b7Var == null) {
            b7Var2 = new Object();
        }
        try {
            l2.f0 f0Var = this.d;
            f0Var.F1();
            MediaFormat mediaFormat = ((u2.r) f0Var.f19350g[0]).f58404g0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    b7Var2.f14294b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    b7Var2.f14293a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return b7Var2;
    }

    public final f61 W(Boolean bool) {
        f61 f61Var = null;
        for (int i7 = 0; i7 < Y(); i7++) {
            f61 Z = Z(i7);
            if (Z.f35099a == bool.booleanValue() && (f61Var == null || f61Var.f35100b * f61Var.f35101c < Z.f35100b * Z.f35101c)) {
                f61Var = Z;
            }
        }
        return f61Var;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final f61 Z(int i7) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            return (f61) this.O.get(i7);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(e2.x1 x1Var) {
        if (!Objects.equals(x1Var, e2.x1.d)) {
            this.K.onVideoSizeChanged(x1Var.f10829a, x1Var.f10830b, 0, x1Var.f10831c);
        }
    }

    public final boolean c0() {
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.F1();
            if (f0Var.f19342b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d0() {
        if (!this.f36181y || !this.J) {
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
        if (i7 == org.telegram.messenger.ks.K4 && ((i61) objArr[0]) != this && d0() && !this.E) {
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
            ArrayList arrayList3 = ((f61) obj).d;
            int size2 = arrayList3.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                h61 h61Var = (h61) obj2;
                long j3 = h61Var.f35808c;
                Uri uri = h61Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j3, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(h61Var.f35809e, h61Var.f35810f);
                if (h61Var.f35810f != null) {
                    this.Q.add(h61Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(h61Var.f35815l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(h61Var.f35812i);
                    sb3.append("x");
                    sb3.append(h61Var.f35813j);
                    String str2 = h61Var.f35816m;
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
                    if (h61Var.b() && h61Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(h61Var.f35808c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(h61Var.f35806a);
                    sb3.append("\"\n");
                    if (h61Var.c()) {
                        sb3.append(h61Var.f35810f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(h61Var.f35809e);
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
        h9.t1 t1Var = h9.t1.f14100e;
        e2.e0 e0Var2 = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (c0Var.f10375b != null && c0Var.f10374a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        a8.la.p(z10);
        if (uri != null) {
            if (c0Var.f10374a != null) {
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
            tg.o1 o1Var = new tg.o1(new f3.m(), 16);
            Object obj = new Object();
            qb.a aVar = new qb.a(4);
            g0Var.getClass();
            l0Var.f10530b.getClass();
            e2.d0 d0Var3 = l0Var.f10530b.f10441c;
            if (d0Var3 == null) {
                mVar2 = q2.m.A;
            } else {
                synchronized (obj) {
                    try {
                        if (!d0Var3.equals(null)) {
                            mVar = org.telegram.ui.md0.o(d0Var3);
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
            return new x2.y0(l0Var, d0Var2, o1Var, mVar2, aVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.f36162a0 == null) {
                    this.f36162a0 = new x2.x0(extendedDefaultDataSourceFactory, new f3.m());
                }
                return this.f36162a0.b(l0Var);
            }
            if (this.Y == null) {
                this.Y = new x2.f0(extendedDefaultDataSourceFactory) {
                    public final xa f2620a;
                    public final g f2621b;
                    public final md0 f2622c;
                    public final a d;
                    public final qb.a f2623e;
                    public final long f2624f;
                    public final long f2625g;

                    {
                        xa xaVar = new xa(extendedDefaultDataSourceFactory);
                        this.f2620a = xaVar;
                        this.f2621b = extendedDefaultDataSourceFactory;
                        this.f2622c = new md0(7);
                        this.f2623e = new qb.a(4);
                        this.f2624f = 30000L;
                        this.f2625g = 5000000L;
                        this.d = new a(28);
                        ((w0) xaVar.d).f3366a = true;
                    }

                    @Override
                    public final f0 a(a aVar2) {
                        w0 w0Var = (w0) this.f2620a.d;
                        w0Var.getClass();
                        w0Var.f3368c = aVar2;
                        return this;
                    }

                    @Override
                    public final x2.a b(l0 l0Var2) {
                        r rVar;
                        l0Var2.f10530b.getClass();
                        e eVar = new e();
                        List list2 = l0Var2.f10530b.f10442e;
                        if (!list2.isEmpty()) {
                            rVar = new h0(8, eVar, list2);
                        } else {
                            rVar = eVar;
                        }
                        return new h(l0Var2, this.f2621b, rVar, this.f2620a, this.d, this.f2622c.s(l0Var2), this.f2623e, this.f2624f, this.f2625g);
                    }

                    @Override
                    public final f0 c(boolean z11) {
                        ((w0) this.f2620a.d).f3366a = z11;
                        return this;
                    }

                    @Override
                    public final f0 d(int i7) {
                        ((w0) this.f2620a.d).f3367b = i7;
                        return this;
                    }
                };
            }
            return b(l0Var);
        }
        if (this.Z == null) {
            this.Z = new x2.f0(extendedDefaultDataSourceFactory) {
                public final c5 f2626a;
                public c f2627b;
                public a f2628c;
                public final md0 f2632i = new md0(7);
                public final b f2630f = new b(24);
                public final f1 f2631g = d.K;
                public final qb.a f2633j = new qb.a(4);
                public final a h = new a(28);
                public final int f2635l = 1;
                public final long f2636m = -9223372036854775807L;
                public final boolean f2634k = true;
                public int f2629e = 3;
                public boolean d = true;

                {
                    this.f2626a = new c5(extendedDefaultDataSourceFactory);
                }

                @Override
                public final f0 a(a aVar2) {
                    this.f2628c = aVar2;
                    return this;
                }

                @Override
                public final f0 c(boolean z11) {
                    this.d = z11;
                    return this;
                }

                @Override
                public final f0 d(int i7) {
                    this.f2629e = i7;
                    return this;
                }

                @Override
                public final k b(l0 l0Var2) {
                    l0Var2.f10530b.getClass();
                    if (this.f2627b == null) {
                        ?? obj2 = new Object();
                        obj2.f56382a = new a(6);
                        obj2.f56384c = 3;
                        this.f2627b = obj2;
                    }
                    a aVar2 = this.f2628c;
                    if (aVar2 != null) {
                        this.f2627b.f56382a = aVar2;
                    }
                    c cVar = this.f2627b;
                    cVar.f56383b = this.d;
                    cVar.f56384c = this.f2629e;
                    List list2 = l0Var2.f10530b.f10442e;
                    boolean isEmpty = list2.isEmpty();
                    t tVar = this.f2630f;
                    if (!isEmpty) {
                        tVar = new k8.a(tVar, list2, false, 29);
                    }
                    m s5 = this.f2632i.s(l0Var2);
                    this.f2631g.getClass();
                    c5 c5Var = this.f2626a;
                    qb.a aVar3 = this.f2633j;
                    return new k(l0Var2, c5Var, cVar, this.h, s5, aVar3, new d(c5Var, aVar3, tVar), this.f2636m, this.f2634k, this.f2635l);
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
        l2.f0 f0Var2 = this.f36168e;
        if (f0Var2 != null) {
            f0Var2.X(false);
        }
        if (this.L != null) {
            this.f36164b0.removeCallbacksAndMessages(null);
            this.L.x(false, null);
        }
    }

    public void h0() {
        this.J = true;
        if (this.f36181y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f36168e;
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
        l2.f0 f0Var4 = this.f36168e;
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
        this.f36167d0 = false;
        this.f36171f0 = false;
        this.H = false;
        this.f36181y = false;
        this.G = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z10 = true;
        }
        this.f36179w = z10;
        I();
        this.d.u1(f0(j3, uri, str), true);
        this.d.a();
    }

    public final void j0(Uri uri, String str) {
        i0(0L, uri, str);
    }

    public final void k0(ArrayList arrayList, f61 f61Var) {
        int i7;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = f61Var;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.f36167d0 = false;
        this.H = false;
        this.f36181y = false;
        this.G = null;
        this.f36179w = true;
        I();
        this.f36171f0 = false;
        if (f61Var != null && (arrayList2 = this.O) != null) {
            i7 = arrayList2.indexOf(f61Var);
        } else {
            i7 = -1;
        }
        this.f36169e0 = i7;
        w0(true, f61Var);
        if (this.f36167d0) {
            this.f36169e0 = -1;
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
        this.f36171f0 = false;
        this.f36181y = true;
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
        this.f36168e.u1(xVar2, true);
        this.f36168e.a();
        f36160l0.add(Integer.valueOf(this.f36161a));
    }

    public final void m0() {
        f36160l0.remove(Integer.valueOf(this.f36161a));
        l2.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.X0();
            this.d = null;
        }
        l2.f0 f0Var2 = this.f36168e;
        if (f0Var2 != null) {
            f0Var2.X0();
            this.f36168e = null;
        }
        if (this.X) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.K4);
        }
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
        this.f36173h0 = -9223372036854775807L;
        this.f36172g0 = -9223372036854775807L;
        g61 g61Var = this.K;
        if (g61Var != null) {
            g61Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
        g61 g61Var = this.K;
        if (g61Var != null) {
            g61Var.onSeekStarted(aVar);
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
                p1Var = l2.p1.f19552c;
            }
            f0Var.w1(p1Var);
            this.d.Z0(5, j3);
        }
    }

    public final void r0(long j3, boolean z10, Runnable runnable) {
        l2.p1 p1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f36175j0.add(runnable);
            }
            l2.f0 f0Var = this.d;
            if (z10) {
                p1Var = l2.p1.d;
            } else {
                p1Var = l2.p1.f19552c;
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
        l2.f0 f0Var2 = this.f36168e;
        if (f0Var2 != null) {
            if (z10) {
                f11 = 0.0f;
            }
            f0Var2.T(f11);
        }
    }

    @Override
    public final void u(e2.s1 s1Var) {
        org.telegram.ui.zn0 zn0Var = this.f36174i0;
        if (zn0Var != null) {
            org.telegram.messenger.g0.g3(zn0Var);
        }
    }

    public void u0(boolean z10) {
        this.J = z10;
        if (z10 && this.f36181y && (!this.I || !this.H)) {
            l2.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.X(false);
            }
            l2.f0 f0Var2 = this.f36168e;
            if (f0Var2 != null) {
                f0Var2.X(false);
                return;
            }
            return;
        }
        this.f36180x = z10;
        l2.f0 f0Var3 = this.d;
        if (f0Var3 != null) {
            f0Var3.X(z10);
        }
        l2.f0 f0Var4 = this.f36168e;
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

    public final void w0(boolean r21, org.telegram.ui.Components.f61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i61.w0(boolean, org.telegram.ui.Components.f61):void");
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
        l2.f0 f0Var2 = this.f36168e;
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
        org.telegram.messenger.g0.g3(new fm0(22, this, v0Var));
    }

    public final void y0(Surface surface) {
        if (this.f36178s != surface) {
            this.f36178s = surface;
            l2.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.y1(surface);
        }
    }

    public final void z0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f36177r != surfaceView) {
            this.f36177r = surfaceView;
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

    public i61(boolean z10, boolean z11) {
        int i7 = f36159k0;
        f36159k0 = i7 + 1;
        this.f36161a = i7;
        this.f36164b0 = new Handler(Looper.getMainLooper());
        this.f36167d0 = false;
        this.f36169e0 = -1;
        this.f36172g0 = -9223372036854775807L;
        this.f36173h0 = -9223372036854775807L;
        this.f36175j0 = new ArrayList();
        this.f36166c0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(org.telegram.messenger.t0.f26941b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        a3.s sVar = new a3.s(org.telegram.messenger.t0.f26941b, new nb.a(1));
        this.f36170f = sVar;
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
    public final void A(e2.c1 c1Var, ji.l lVar) {
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
