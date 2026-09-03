package org.telegram.ui.Components;

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
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
public class j71 implements j3.y1, i5.t, k3.b, NotificationCenter.NotificationCenterDelegate {
    public static int f28040g0;
    public static final HashSet f28041h0 = new HashSet();
    public static HashMap f28042i0;
    public boolean B;
    public Uri C;
    public boolean D;
    public boolean E;
    public boolean F;
    public g71 G;
    public c71 H;
    public int I;
    public boolean J;
    public ArrayList K;
    public f71 L;
    public ArrayList M;
    public Uri N;
    public Uri O;
    public String P;
    public String Q;
    public boolean R;
    public boolean S;
    public final boolean T;
    public DashMediaSource$Factory U;
    public HlsMediaSource$Factory V;
    public a4.k W;
    public final Handler X;
    public final boolean Y;
    public boolean Z;
    public final int f28043a;
    public int f28044a0;
    public DispatchQueue f28045b;
    public boolean f28046b0;
    public boolean f28047c;
    public long f28048c0;
    public j3.f0 d;
    public long f28049d0;
    public j3.i2 f28050e;
    public org.telegram.ui.tq0 f28051e0;
    public final f5.p f28052f;
    public final ArrayList f28053f0;
    public final ExtendedDefaultDataSourceFactory h;
    public TextureView f28054n;
    public SurfaceView f28055r;
    public Surface f28056s;
    public boolean v;
    public boolean f28057w;
    public boolean f28058x;
    public boolean f28059y;

    public j71() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z4) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z4).apply();
    }

    public static void J(f71 f71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (f71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(f71Var.f26812b);
            sb.append("x");
            sb.append(f71Var.f26813c);
            if (f71Var.f26811a) {
                str = "s";
            } else {
                str = "";
            }
            sb.append(str);
            edit.putString(str2, sb.toString());
        }
        edit.apply();
    }

    public static boolean Y(String str) {
        String concat;
        if (str == null) {
            concat = null;
        } else {
            char c3 = 65535;
            switch (str.hashCode()) {
                case 96924:
                    if (str.equals("av1")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 96974:
                    if (str.equals("avc")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 116926:
                    if (str.equals("vp8")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 116927:
                    if (str.equals("vp9")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 3004662:
                    if (str.equals("av01")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 3148040:
                    if (str.equals("h264")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 3148041:
                    if (str.equals("h265")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 3199082:
                    if (str.equals("hevc")) {
                        c3 = 7;
                        break;
                    }
                    break;
            }
            switch (c3) {
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return false;
                    }
            }
        }
        if (concat != null) {
            if (f28042i0 == null) {
                f28042i0 = new HashMap();
            }
            Boolean bool = (Boolean) f28042i0.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (!codecInfoAt.isEncoder() && d4.y.h(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                f28042i0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f28042i0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static h71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                if (h71Var.b()) {
                    return h71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z4) {
        f71 f71Var;
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            i12++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i13);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    h71 d = h71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f20851id), i11, z4);
                    if (d.f27402i > 0 && d.f27403j > 0) {
                        if (document3 == document) {
                            d.f27397b = true;
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
            h71 h71Var = (h71) arrayList3.get(i14);
            String str2 = h71Var.f27406m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(h71Var.f27406m) && !"hevc".equals(h71Var.f27406m) && !"h265".equals(h71Var.f27406m) && !"vp9".equals(h71Var.f27406m)) || Y(h71Var.f27406m))) {
                arrayList4.add(h71Var);
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
            h71 h71Var2 = (h71) obj;
            if (h71Var2.f27397b) {
                arrayList6.add(new f71(h71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        f71Var = (f71) obj2;
                        if (!f71Var.f26811a && f71Var.f26812b == h71Var2.f27402i && f71Var.f26813c == h71Var2.f27403j) {
                            break;
                        }
                    } else {
                        f71Var = null;
                        break;
                    }
                }
                if (f71Var != null && !SharedConfig.debugVideoQualities) {
                    f71Var.d.add(h71Var2);
                } else {
                    arrayList6.add(new f71(h71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static h71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                h71 h71Var = (h71) obj2;
                if (h71Var.f27397b && h71Var.b()) {
                    return h71Var;
                }
            }
        }
        int size3 = arrayList.size();
        h71 h71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((f71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                h71 h71Var3 = (h71) obj4;
                if (!h71Var3.f27397b && Y(h71Var3.f27406m) && (h71Var2 == null || (i10 = h71Var3.f27402i * h71Var3.f27403j) > (i11 = h71Var2.f27402i * h71Var2.f27403j) || (i10 == i11 && h71Var3.f27405l < h71Var2.f27405l))) {
                    h71Var2 = h71Var3;
                }
            }
        }
        if (h71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((f71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    h71 h71Var4 = (h71) obj6;
                    if (h71Var2 == null || h71Var2.f27402i * h71Var2.f27403j > h71Var4.f27402i * h71Var4.f27403j || h71Var4.f27405l < h71Var2.f27405l) {
                        h71Var2 = h71Var4;
                    }
                }
            }
        }
        return h71Var2;
    }

    public static h71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((f71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                if (h71Var.b()) {
                    return h71Var;
                }
            }
        }
        int size3 = arrayList.size();
        h71 h71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((f71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                h71 h71Var3 = (h71) obj4;
                if (!h71Var3.f27397b && (h71Var2 == null || h71Var2.f27402i * h71Var2.f27403j > h71Var3.f27402i * h71Var3.f27403j || h71Var3.f27405l < h71Var2.f27405l)) {
                    if (h71Var3.f27402i <= 900 && h71Var3.f27403j <= 900) {
                        h71Var2 = h71Var3;
                    }
                }
            }
        }
        if (h71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((f71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    h71 h71Var4 = (h71) obj6;
                    if (h71Var2 == null || h71Var2.f27402i * h71Var2.f27403j > h71Var4.f27402i * h71Var4.f27403j || h71Var4.f27405l < h71Var2.f27405l) {
                        h71Var2 = h71Var4;
                    }
                }
            }
        }
        return h71Var2;
    }

    public final o4.a A(Uri uri, String str, long j10) {
        boolean z4;
        o3.o oVar;
        j3.y0 y0Var;
        g5.o0 o0Var;
        o3.o oVar2;
        j3.w0 w0Var;
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        j3.s0 s0Var = new j3.s0();
        j3.v0 v0Var = new j3.v0();
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var = s8.i0.f47139e;
        j3.z0 z0Var = j3.z0.f9495c;
        if (v0Var.f9447b != null && v0Var.f9446a == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        h5.a.i(z4);
        if (uri != null) {
            if (v0Var.f9446a != null) {
                w0Var = new j3.w0(v0Var);
            } else {
                w0Var = null;
            }
            oVar = null;
            y0Var = new j3.y0(uri, null, w0Var, null, list, null, i0Var, null);
        } else {
            oVar = null;
            y0Var = null;
        }
        j3.c1 c1Var = new j3.c1("", new j3.t0(s0Var), y0Var, new j3.x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), j3.e1.V, z0Var);
        if (j10 != 0) {
            f3.e eVar = new f3.e(this, j10, 6);
            mh.m5 m5Var = new mh.m5(new Object(), 5);
            Object obj = new Object();
            ab.a aVar = new ab.a(7);
            y0Var.getClass();
            c1Var.f9008b.getClass();
            j3.w0 w0Var2 = c1Var.f9008b.f9489c;
            if (w0Var2 != null && h5.d0.f7237a >= 18) {
                synchronized (obj) {
                    try {
                        if (!w0Var2.equals(oVar)) {
                            oVar2 = l7.w0.l(w0Var2);
                        } else {
                            oVar2 = oVar;
                        }
                        oVar2.getClass();
                    } finally {
                    }
                }
            } else {
                oVar2 = o3.o.f16416k;
            }
            return new o4.f0(c1Var, eVar, m5Var, oVar2, aVar, 1048576);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.W == null) {
                    this.W = new a4.k(extendedDefaultDataSourceFactory, (r3.i) new Object());
                }
                a4.k kVar = this.W;
                kVar.getClass();
                y0Var.getClass();
                return new o4.f0(c1Var, (g5.l) kVar.f93b, (mh.m5) kVar.f94c, ((l7.w0) kVar.d).q(c1Var), (ab.a) kVar.f95e, kVar.f92a);
            }
            if (this.U == null) {
                this.U = new DashMediaSource$Factory(extendedDefaultDataSourceFactory);
            }
            DashMediaSource$Factory dashMediaSource$Factory = this.U;
            dashMediaSource$Factory.getClass();
            j3.y0 y0Var2 = c1Var.f9008b;
            y0Var2.getClass();
            g5.o0 eVar2 = new s4.e();
            List list2 = y0Var2.f9490e;
            if (!list2.isEmpty()) {
                o0Var = new f7.b(29, eVar2, list2);
            } else {
                o0Var = eVar2;
            }
            return new r4.g(c1Var, dashMediaSource$Factory.f2556b, o0Var, dashMediaSource$Factory.f2555a, dashMediaSource$Factory.d, dashMediaSource$Factory.f2557c.q(c1Var), dashMediaSource$Factory.f2558e, dashMediaSource$Factory.f2559f, dashMediaSource$Factory.f2560g);
        }
        if (this.V == null) {
            this.V = new HlsMediaSource$Factory(extendedDefaultDataSourceFactory);
        }
        HlsMediaSource$Factory hlsMediaSource$Factory = this.V;
        oh.h4 h4Var = hlsMediaSource$Factory.f2561a;
        j3.y0 y0Var3 = c1Var.f9008b;
        y0Var3.getClass();
        u4.p pVar = hlsMediaSource$Factory.f2563c;
        List list3 = y0Var3.f9490e;
        if (!list3.isEmpty()) {
            pVar = new q5.c0(10, pVar, list3);
        }
        t4.c cVar = hlsMediaSource$Factory.f2562b;
        z9.d dVar = hlsMediaSource$Factory.f2564e;
        o3.o q10 = hlsMediaSource$Factory.f2565f.q(c1Var);
        ab.a aVar2 = hlsMediaSource$Factory.f2566g;
        hlsMediaSource$Factory.d.getClass();
        return new t4.m(c1Var, h4Var, cVar, dVar, q10, aVar2, new u4.c(h4Var, aVar2, pVar), hlsMediaSource$Factory.f2568j, hlsMediaSource$Factory.h, hlsMediaSource$Factory.f2567i);
    }

    public void B() {
        this.F = false;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.p(false);
        }
        j3.i2 i2Var = this.f28050e;
        if (i2Var != null) {
            i2Var.p(false);
        }
        if (this.H != null) {
            this.X.removeCallbacksAndMessages(null);
            this.H.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.F = true;
        if (this.f28058x && (!this.E || !this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(false);
            }
            j3.i2 i2Var = this.f28050e;
            if (i2Var != null) {
                i2Var.p(false);
                return;
            }
            return;
        }
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(true);
        }
        j3.i2 i2Var2 = this.f28050e;
        if (i2Var2 != null) {
            i2Var2.p(true);
        }
    }

    public final void D(Uri uri, String str) {
        E(uri, str, 0L);
    }

    public final void E(Uri uri, String str, long j10) {
        String str2 = null;
        this.K = null;
        this.L = null;
        this.N = uri;
        this.P = str;
        this.O = null;
        this.Q = null;
        boolean z4 = false;
        this.R = false;
        this.Z = false;
        this.f28046b0 = false;
        this.D = false;
        this.f28058x = false;
        this.C = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z4 = true;
        }
        this.v = z4;
        i();
        this.d.X(A(uri, str, j10), true);
        this.d.a();
    }

    public final void F(ArrayList arrayList, f71 f71Var) {
        int i10;
        ArrayList arrayList2;
        this.K = arrayList;
        this.L = f71Var;
        this.N = null;
        this.P = "hls";
        this.O = null;
        this.Q = null;
        this.R = false;
        this.Z = false;
        this.D = false;
        this.f28058x = false;
        this.C = null;
        this.v = true;
        i();
        this.f28046b0 = false;
        if (f71Var != null && (arrayList2 = this.K) != null) {
            i10 = arrayList2.indexOf(f71Var);
        } else {
            i10 = -1;
        }
        this.f28044a0 = i10;
        R(true, f71Var);
        if (this.Z) {
            this.f28044a0 = -1;
        }
    }

    public final void G(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        o4.m mVar = null;
        this.K = null;
        this.L = null;
        this.N = uri;
        this.O = uri2;
        this.P = str;
        this.Q = str2;
        this.R = true;
        this.f28046b0 = false;
        this.f28058x = true;
        this.E = false;
        this.D = false;
        i();
        o4.m mVar2 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            o4.m mVar3 = new o4.m(A(uri3, str3, 0L));
            if (i10 == 0) {
                mVar = mVar3;
            } else {
                mVar2 = mVar3;
            }
        }
        this.d.X(mVar, true);
        this.d.a();
        j3.i2 i2Var = this.f28050e;
        i2Var.L();
        i2Var.f9201b.X(mVar2, true);
        this.f28050e.a();
        f28041h0.add(Integer.valueOf(this.f28043a));
    }

    public final void H() {
        f28041h0.remove(Integer.valueOf(this.f28043a));
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.J();
            this.d = null;
        }
        j3.i2 i2Var = this.f28050e;
        if (i2Var != null) {
            i2Var.J();
            this.f28050e = null;
        }
        if (this.T) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void K(long j10) {
        L(j10, false);
    }

    public final void L(long j10, boolean z4) {
        j3.h2 h2Var;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (z4) {
                h2Var = j3.h2.d;
            } else {
                h2Var = j3.h2.f9180c;
            }
            f0Var.Y(h2Var);
            j3.f0 f0Var2 = this.d;
            f0Var2.K(f0Var2.x(), 5, j10);
        }
    }

    public final void M(long j10, boolean z4, Runnable runnable) {
        j3.h2 h2Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f28053f0.add(runnable);
            }
            j3.f0 f0Var = this.d;
            if (z4) {
                h2Var = j3.h2.d;
            } else {
                h2Var = j3.h2.f9180c;
            }
            f0Var.Y(h2Var);
            j3.f0 f0Var2 = this.d;
            f0Var2.K(f0Var2.x(), 5, j10);
        }
    }

    public final void N(boolean z4) {
        int i10;
        if (this.S != z4) {
            this.S = z4;
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                if (z4) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                f0Var.e(i10);
            }
        }
    }

    public final void O(boolean z4) {
        float f10;
        j3.f0 f0Var = this.d;
        float f11 = 1.0f;
        if (f0Var != null) {
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            f0Var.d0(f10);
        }
        j3.i2 i2Var = this.f28050e;
        if (i2Var != null) {
            if (z4) {
                f11 = 0.0f;
            }
            i2Var.M(f11);
        }
    }

    public void P(boolean z4) {
        this.F = z4;
        if (z4 && this.f28058x && (!this.E || !this.D)) {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                f0Var.p(false);
            }
            j3.i2 i2Var = this.f28050e;
            if (i2Var != null) {
                i2Var.p(false);
                return;
            }
            return;
        }
        this.f28057w = z4;
        j3.f0 f0Var2 = this.d;
        if (f0Var2 != null) {
            f0Var2.p(z4);
        }
        j3.i2 i2Var2 = this.f28050e;
        if (i2Var2 != null) {
            i2Var2.p(z4);
        }
    }

    public void Q(float f10) {
        try {
            j3.f0 f0Var = this.d;
            if (f0Var != null) {
                float f11 = 1.0f;
                if (f10 > 1.0f) {
                    f11 = 0.98f;
                }
                f0Var.c(new j3.v1(f10, f11));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.f71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.R(boolean, org.telegram.ui.Components.f71):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            f0Var.W(new l3.d(0, 0, i12, 1, 0), false);
        }
        j3.i2 i2Var = this.f28050e;
        if (i2Var != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            l3.d dVar = new l3.d(0, 0, i11, 1, 0);
            i2Var.L();
            i2Var.f9201b.W(dVar, true);
        }
    }

    public final void T(Surface surface) {
        if (this.f28056s != surface) {
            this.f28056s = surface;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.a0(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        if (this.f28055r != surfaceView) {
            this.f28055r = surfaceView;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.b0(surfaceView);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f28054n != textureView) {
            this.f28054n = textureView;
            j3.f0 f0Var = this.d;
            if (f0Var == null) {
                return;
            }
            f0Var.c0(textureView);
        }
    }

    public final void W(float f10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.d0(f10);
        }
        j3.i2 i2Var = this.f28050e;
        if (i2Var != null) {
            i2Var.M(f10);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f28045b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.f9119i0 = new org.telegram.messenger.c1(dispatchQueue);
            return;
        }
        this.d.f9119i0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((j71) objArr[0]) != this && y() && !this.f28059y) {
            B();
        }
    }

    @Override
    public final void h(k3.a aVar, int i10) {
        if (i10 == 1) {
            g71 g71Var = this.G;
            if (g71Var != null) {
                g71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f28053f0;
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
        j3.l lVar;
        g5.q qVar = new g5.q();
        boolean z4 = this.f28047c;
        int i11 = 1000;
        if (z4) {
            i10 = 1000;
        } else {
            i10 = 100;
        }
        if (!z4) {
            i11 = 5000;
        }
        int i12 = 0;
        j3.j.a(i10, 0, "bufferForPlaybackMs", "0");
        j3.j.a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j3.j.a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        j3.j.a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j3.j.a(50000, 50000, "maxBufferMs", "minBufferMs");
        j3.j.a(0, 0, "backBufferDurationMs", "0");
        j3.j jVar = new j3.j(qVar, i10, i11);
        if (this.d == null) {
            if (this.H != null) {
                lVar = new d71(ApplicationLoader.applicationContext, this);
            } else {
                lVar = new j3.l(ApplicationLoader.applicationContext);
            }
            lVar.f9244c = 2;
            j3.p pVar = new j3.p(ApplicationLoader.applicationContext);
            h5.a.i(!pVar.f9370s);
            pVar.f9356c = new hg.f(lVar, 8);
            f5.p pVar2 = this.f28052f;
            h5.a.i(!pVar.f9370s);
            pVar2.getClass();
            pVar.f9357e = new hg.f(pVar2, 7);
            h5.a.i(!pVar.f9370s);
            pVar.f9358f = new hg.f(jVar, 6);
            h5.a.i(!pVar.f9370s);
            pVar.f9370s = true;
            j3.f0 f0Var = new j3.f0(pVar, null);
            this.d = f0Var;
            k3.f fVar = f0Var.f9128q;
            fVar.getClass();
            fVar.f10426f.a(this);
            this.d.f9123l.a(this);
            this.d.f9121j0.add(this);
            TextureView textureView = this.f28054n;
            if (textureView != null) {
                this.d.c0(textureView);
            } else {
                Surface surface = this.f28056s;
                if (surface != null) {
                    this.d.a0(surface);
                } else {
                    SurfaceView surfaceView = this.f28055r;
                    if (surfaceView != null) {
                        this.d.b0(surfaceView);
                    }
                }
            }
            this.d.p(this.f28057w);
            j3.f0 f0Var2 = this.d;
            if (this.S) {
                i12 = 2;
            }
            f0Var2.e(i12);
        }
        if (this.f28058x && this.f28050e == null) {
            j3.p pVar3 = new j3.p(ApplicationLoader.applicationContext);
            f5.p pVar4 = this.f28052f;
            h5.a.i(!pVar3.f9370s);
            pVar4.getClass();
            pVar3.f9357e = new hg.f(pVar4, 7);
            h5.a.i(!pVar3.f9370s);
            pVar3.f9358f = new hg.f(jVar, 6);
            h5.a.i(!pVar3.f9370s);
            pVar3.f9370s = true;
            j3.i2 i2Var = new j3.i2(pVar3);
            this.f28050e = i2Var;
            i2Var.n(new b71(this));
            this.f28050e.p(this.f28057w);
        }
    }

    public final long j() {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            if (this.v) {
                return f0Var.s();
            }
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final bf.h l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.K == null) {
            if (this.N == null) {
                return null;
            }
            String k10 = org.telegram.ui.yh.k("/mtproto_", str);
            String queryParameter = this.N.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            bf.f fVar = new bf.f(this.N, str5, k10);
            fVar.f1953e = str2;
            fVar.f1954f = str3;
            return new bf.h(new bf.g(fVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.K;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((f71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb.append(h71Var.f27398c);
                String sb2 = sb.toString();
                TLRPC.Document document = h71Var.f27401g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                bf.f fVar2 = new bf.f(h71Var.d, str4, sb2);
                fVar2.f1953e = str2;
                fVar2.f1954f = str3;
                int i12 = h71Var.f27402i;
                int i13 = h71Var.f27403j;
                fVar2.f1950a = i12;
                fVar2.f1951b = i13;
                arrayList.add(new bf.g(fVar2));
                arrayList2 = arrayList4;
            }
        }
        return new bf.h(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.j0();
            j3.n0 n0Var = f0Var.N;
            if (n0Var != null && n0Var.f9326w != 0 && (arrayList = this.K) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((f71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        h71 h71Var = (h71) obj2;
                        if (h71Var.f27398c == n0Var.f9326w) {
                            return h71Var.f27401g;
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
        long j10 = this.f28049d0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.C();
        }
        return 0L;
    }

    public final int o() {
        if (this.f28044a0 == -1) {
            try {
                if (this.Z) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f26811a) {
                            return i10;
                        }
                    }
                }
                j3.f0 f0Var = this.d;
                if (f0Var != null) {
                    f0Var.j0();
                    j3.n0 n0Var = f0Var.N;
                    if (n0Var != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            f71 u10 = u(i11);
                            if (!u10.f26811a && n0Var.H == u10.f26812b && n0Var.I == u10.f26813c && n0Var.f9323n == ((int) Math.floor(((h71) u10.d.get(0)).f27405l * 8.0d))) {
                                return i11;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e6) {
                FileLog.e(e6);
                return -1;
            }
        }
        return this.f28044a0;
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onPlayerError(j3.t1 t1Var) {
        AndroidUtilities.runOnUIThread(new q51(2, this, t1Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z4, int i10) {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            boolean j10 = f0Var.j();
            int b10 = this.d.b();
            if (this.J != j10 || this.I != b10) {
                this.G.onStateChanged(j10, b10);
                this.J = j10;
                this.I = b10;
            }
        }
        if (z4 && i10 == 3 && !x() && this.T) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.D && i10 == 3) {
            this.D = true;
            if (this.E && this.F) {
                C();
            }
        }
        if (i10 != 3) {
            this.X.removeCallbacksAndMessages(null);
            c71 c71Var = this.H;
            if (c71Var != null) {
                c71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(k3.a aVar) {
        this.f28049d0 = -9223372036854775807L;
        this.f28048c0 = -9223372036854775807L;
        g71 g71Var = this.G;
        if (g71Var != null) {
            g71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(k3.a aVar) {
        g71 g71Var = this.G;
        if (g71Var != null) {
            g71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTracksChanged(j3.q2 q2Var) {
        org.telegram.ui.tq0 tq0Var = this.f28051e0;
        if (tq0Var != null) {
            AndroidUtilities.runOnUIThread(tq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(i5.y yVar) {
        if (!Objects.equals(yVar, i5.y.f7898e)) {
            this.G.onVideoSizeChanged(yVar.f7899a, yVar.f7900b, yVar.f7901c, yVar.d);
        }
    }

    public final long p() {
        long j10 = this.f28048c0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            return f0Var.getDuration();
        }
        return 0L;
    }

    public final qh.q6 q(qh.q6 q6Var) {
        qh.q6 q6Var2 = q6Var;
        if (q6Var == null) {
            q6Var2 = new Object();
        }
        try {
            j3.f0 f0Var = this.d;
            f0Var.j0();
            MediaFormat mediaFormat = ((d4.r) f0Var.f9115g[0]).X;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    q6Var2.f45962b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    q6Var2.f45961a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return q6Var2;
    }

    public final f71 r(Boolean bool) {
        f71 f71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            f71 u10 = u(i10);
            if (u10.f26811a == bool.booleanValue() && (f71Var == null || f71Var.f26812b * f71Var.f26813c < u10.f26812b * u10.f26813c)) {
                f71Var = u10;
            }
        }
        return f71Var;
    }

    public final int t() {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final f71 u(int i10) {
        ArrayList arrayList = this.K;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (f71) this.K.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        j3.f0 f0Var = this.d;
        if (f0Var != null) {
            f0Var.j0();
            if (f0Var.Y == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f28058x || !this.F) {
            j3.f0 f0Var = this.d;
            if (f0Var != null && f0Var.j()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Uri z(ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.M = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList3 = ((f71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                h71 h71Var = (h71) obj2;
                long j10 = h71Var.f27398c;
                Uri uri = h71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(h71Var.f27399e, h71Var.f27400f);
                if (h71Var.f27400f != null) {
                    this.M.add(h71Var);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(h71Var.f27405l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(h71Var.f27402i);
                    sb2.append("x");
                    sb2.append(h71Var.f27403j);
                    String str2 = h71Var.f27406m;
                    if (str2 == null) {
                        str = null;
                    } else {
                        char c3 = 65535;
                        switch (str2.hashCode()) {
                            case 96924:
                                if (str2.equals("av1")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 96974:
                                if (str2.equals("avc")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 116926:
                                if (str2.equals("vp8")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 116927:
                                if (str2.equals("vp9")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 3004662:
                                if (str2.equals("av01")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 3148040:
                                if (str2.equals("h264")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 3148041:
                                if (str2.equals("h265")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case 3199082:
                                if (str2.equals("hevc")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
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
                        sb2.append(",MIME=\"");
                        sb2.append(str);
                        sb2.append("\"");
                    }
                    if (h71Var.b() && h71Var.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(h71Var.f27398c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(h71Var.f27396a);
                    sb2.append("\"\n");
                    if (h71Var.c()) {
                        sb2.append(h71Var.f27400f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(h71Var.f27399e);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z4 = true;
                }
            }
        }
        if (!z4) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    public j71(boolean z4, boolean z10) {
        int i10 = f28040g0;
        f28040g0 = i10 + 1;
        this.f28043a = i10;
        this.X = new Handler(Looper.getMainLooper());
        this.Z = false;
        this.f28044a0 = -1;
        this.f28048c0 = -9223372036854775807L;
        this.f28049d0 = -9223372036854775807L;
        this.f28053f0 = new ArrayList();
        this.Y = z10;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        f5.p pVar = new f5.p(ApplicationLoader.applicationContext, new db.a(6));
        this.f28052f = pVar;
        if (z10) {
            f5.h e6 = pVar.e();
            e6.getClass();
            f5.g gVar = new f5.g(e6);
            gVar.f6095z.add(1);
            pVar.k(new f5.h(gVar));
        }
        this.I = 1;
        this.T = z4;
        if (z4) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override
    public final void onCues(v4.c cVar) {
    }

    @Override
    public final void onPositionDiscontinuity(j3.z1 z1Var, j3.z1 z1Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.G.onRenderedFirstFrame();
    }

    @Override
    public final void b(j3.t1 t1Var) {
    }

    @Override
    public final void d(n3.f fVar) {
    }

    @Override
    public final void f(o4.r rVar) {
    }

    @Override
    public final void g(i5.y yVar) {
    }

    @Override
    public final void onAudioAttributesChanged(l3.d dVar) {
    }

    @Override
    public final void onAvailableCommandsChanged(j3.w1 w1Var) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z4) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z4) {
    }

    @Override
    public final void onLoadingChanged(boolean z4) {
    }

    @Override
    public final void onMediaMetadataChanged(j3.e1 e1Var) {
    }

    @Override
    public final void onMetadata(e4.c cVar) {
    }

    @Override
    public final void onPlaybackParametersChanged(j3.v1 v1Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(j3.t1 t1Var) {
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z4) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z4) {
    }

    @Override
    public final void onVolumeChanged(float f10) {
    }

    @Override
    public final void a(j3.a2 a2Var, f7.b bVar) {
    }

    @Override
    public final void c(k3.a aVar, o4.r rVar) {
    }

    @Override
    public final void onEvents(j3.a2 a2Var, j3.x1 x1Var) {
    }

    @Override
    public final void onMediaItemTransition(j3.c1 c1Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z4, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(j3.o2 o2Var, int i10) {
    }

    @Override
    public final void e(k3.a aVar, int i10, long j10) {
    }
}
