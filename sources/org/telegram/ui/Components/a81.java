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
import b2.o0;
import c5.f;
import g2.g;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l2.h;
import m.g3;
import m2.e;
import mi.q;
import o2.c;
import o2.l;
import oa.d;
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
import org.telegram.ui.hk0;
import t7.u;
import u2.f0;
import y2.n;
public class a81 implements b2.d1, b2.z1, j2.b, NotificationCenter.NotificationCenterDelegate {
    public static int f24519j0;
    public static final HashSet f24520k0 = new HashSet();
    public static HashMap f24521l0;
    public boolean E;
    public Uri F;
    public boolean G;
    public boolean H;
    public boolean I;
    public x71 J;
    public t71 K;
    public int L;
    public boolean M;
    public ArrayList N;
    public w71 O;
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
    public final int f24522a;
    public final Handler f24523a0;
    public DispatchQueue f24524b;
    public final boolean f24525b0;
    public boolean f24526c;
    public boolean f24527c0;
    public i2.g0 d;
    public int f24528d0;
    public i2.g0 e;
    public boolean f24529e0;
    public final x2.n f24530f;
    public long f24531f0;
    public long f24532g0;
    public final ExtendedDefaultDataSourceFactory h;
    public org.telegram.ui.rq0 f24533h0;
    public final ArrayList f24534i0;
    public TextureView f24535n;
    public SurfaceView f24536r;
    public Surface f24537s;
    public boolean v;
    public boolean f24538w;
    public boolean f24539x;
    public boolean f24540y;

    public a81() {
        this(true, false);
    }

    public static void I(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z10).apply();
    }

    public static void J(w71 w71Var, MessageObject messageObject) {
        String str;
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id2 = messageObject.getId();
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (w71Var == null) {
            edit.remove(dialogId + "_" + id2 + "q2");
        } else {
            String str2 = dialogId + "_" + id2 + "q2";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(w71Var.f32023b);
            sb2.append("x");
            sb2.append(w71Var.f32024c);
            if (w71Var.f32022a) {
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
            if (f24521l0 == null) {
                f24521l0 = new HashMap();
            }
            Boolean bool = (Boolean) f24521l0.get(concat);
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
                                f24521l0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                f24521l0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static y71 k(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((w71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                y71 y71Var = (y71) obj2;
                if (y71Var.b()) {
                    return y71Var;
                }
            }
        }
        return null;
    }

    public static ArrayList s(int i10, TLRPC.Document document, ArrayList arrayList, int i11, boolean z10) {
        w71 w71Var;
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
                    y71 d = y71.d(i10, document3, (TLRPC.Document) longSparseArray.get(document3.f20278id), i11, z10);
                    if (d.f32562i > 0 && d.f32563j > 0) {
                        if (document3 == document) {
                            d.f32558b = true;
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
            y71 y71Var = (y71) arrayList3.get(i14);
            String str2 = y71Var.f32566m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(y71Var.f32566m) && !"hevc".equals(y71Var.f32566m) && !"h265".equals(y71Var.f32566m) && !"vp9".equals(y71Var.f32566m)) || Y(y71Var.f32566m))) {
                arrayList4.add(y71Var);
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
            y71 y71Var2 = (y71) obj;
            if (y71Var2.f32558b) {
                arrayList6.add(new w71(y71Var2));
            } else {
                int size2 = arrayList6.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        w71Var = (w71) obj2;
                        if (!w71Var.f32022a && w71Var.f32023b == y71Var2.f32562i && w71Var.f32024c == y71Var2.f32563j) {
                            break;
                        }
                    } else {
                        w71Var = null;
                        break;
                    }
                }
                if (w71Var != null && !SharedConfig.debugVideoQualities) {
                    w71Var.d.add(y71Var2);
                } else {
                    arrayList6.add(new w71(y71Var2));
                }
            }
        }
        return arrayList6;
    }

    public static y71 v(ArrayList arrayList) {
        int i10;
        int i11;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ArrayList arrayList2 = ((w71) obj).d;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                y71 y71Var = (y71) obj2;
                if (y71Var.f32558b && y71Var.b()) {
                    return y71Var;
                }
            }
        }
        int size3 = arrayList.size();
        y71 y71Var2 = null;
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList.get(i14);
            i14++;
            ArrayList arrayList3 = ((w71) obj3).d;
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList3.get(i15);
                i15++;
                y71 y71Var3 = (y71) obj4;
                if (!y71Var3.f32558b && Y(y71Var3.f32566m) && (y71Var2 == null || (i10 = y71Var3.f32562i * y71Var3.f32563j) > (i11 = y71Var2.f32562i * y71Var2.f32563j) || (i10 == i11 && y71Var3.f32565l < y71Var2.f32565l))) {
                    y71Var2 = y71Var3;
                }
            }
        }
        if (y71Var2 == null) {
            int size5 = arrayList.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj5 = arrayList.get(i16);
                i16++;
                ArrayList arrayList4 = ((w71) obj5).d;
                int size6 = arrayList4.size();
                int i17 = 0;
                while (i17 < size6) {
                    Object obj6 = arrayList4.get(i17);
                    i17++;
                    y71 y71Var4 = (y71) obj6;
                    if (y71Var2 == null || y71Var2.f32562i * y71Var2.f32563j > y71Var4.f32562i * y71Var4.f32563j || y71Var4.f32565l < y71Var2.f32565l) {
                        y71Var2 = y71Var4;
                    }
                }
            }
        }
        return y71Var2;
    }

    public static y71 w(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ArrayList arrayList2 = ((w71) obj).d;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                y71 y71Var = (y71) obj2;
                if (y71Var.b()) {
                    return y71Var;
                }
            }
        }
        int size3 = arrayList.size();
        y71 y71Var2 = null;
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ArrayList arrayList3 = ((w71) obj3).d;
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                y71 y71Var3 = (y71) obj4;
                if (!y71Var3.f32558b && (y71Var2 == null || y71Var2.f32562i * y71Var2.f32563j > y71Var3.f32562i * y71Var3.f32563j || y71Var3.f32565l < y71Var2.f32565l)) {
                    if (y71Var3.f32562i <= 900 && y71Var3.f32563j <= 900) {
                        y71Var2 = y71Var3;
                    }
                }
            }
        }
        if (y71Var2 == null) {
            int size5 = arrayList.size();
            int i14 = 0;
            while (i14 < size5) {
                Object obj5 = arrayList.get(i14);
                i14++;
                ArrayList arrayList4 = ((w71) obj5).d;
                int size6 = arrayList4.size();
                int i15 = 0;
                while (i15 < size6) {
                    Object obj6 = arrayList4.get(i15);
                    i15++;
                    y71 y71Var4 = (y71) obj6;
                    if (y71Var2 == null || y71Var2.f32562i * y71Var2.f32563j > y71Var4.f32562i * y71Var4.f32563j || y71Var4.f32565l < y71Var2.f32565l) {
                        y71Var2 = y71Var4;
                    }
                }
            }
        }
        return y71Var2;
    }

    public final u2.a A(Uri uri, String str, long j10) {
        boolean z10;
        b2.h0 h0Var;
        b2.j0 j0Var;
        n2.n nVar;
        n2.n nVar2;
        b2.g0 g0Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        b2.c0 c0Var = new b2.c0();
        b2.f0 f0Var = new b2.f0();
        List list = Collections.EMPTY_LIST;
        e9.x1 x1Var = e9.x1.e;
        b2.h0 h0Var2 = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        if (f0Var.f3754b != null && f0Var.f3753a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        v7.u6.p(z10);
        if (uri != null) {
            if (f0Var.f3753a != null) {
                g0Var = new b2.g0(f0Var);
            } else {
                g0Var = null;
            }
            h0Var = h0Var2;
            j0Var = new b2.j0(uri, null, g0Var, null, list, null, x1Var, -9223372036854775807L);
        } else {
            h0Var = h0Var2;
            j0Var = null;
        }
        b2.o0 o0Var = new b2.o0("", new b2.d0(c0Var), j0Var, new b2.i0(h0Var), b2.r0.L, k0Var);
        if (j10 != 0) {
            ci.d1 d1Var = new ci.d1(this, j10, 7);
            qg.g0 g0Var2 = new qg.g0(new c3.m(), 17);
            Object obj = new Object();
            oa.d dVar = new oa.d(27);
            j0Var.getClass();
            o0Var.f3890b.getClass();
            b2.g0 g0Var3 = o0Var.f3890b.f3802c;
            if (g0Var3 == null) {
                nVar2 = n2.n.f17057z;
            } else {
                synchronized (obj) {
                    try {
                        if (!g0Var3.equals(null)) {
                            nVar = m.g3.x(g0Var3);
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
            return new u2.y0(o0Var, d1Var, g0Var2, nVar2, dVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                if (this.Z == null) {
                    this.Z = new u2.x0(extendedDefaultDataSourceFactory, new c3.m());
                }
                return this.Z.a(o0Var);
            }
            if (this.X == null) {
                this.X = new u2.f0(extendedDefaultDataSourceFactory) {
                    public final a f3434a;
                    public final g f3435b;
                    public final g3 f3436c;
                    public final d d;
                    public final d e;
                    public final long f3437f;
                    public final long f3438g;

                    {
                        a aVar = new a(extendedDefaultDataSourceFactory);
                        this.f3434a = aVar;
                        this.f3435b = extendedDefaultDataSourceFactory;
                        this.f3436c = new g3(5);
                        this.e = new d(27);
                        this.f3437f = 30000L;
                        this.f3438g = 5000000L;
                        this.d = new d(24);
                        ((f) aVar.d).f4731b = true;
                    }

                    @Override
                    public final u2.a a(o0 o0Var2) {
                        n nVar3;
                        o0Var2.f3890b.getClass();
                        e eVar = new e();
                        List list2 = o0Var2.f3890b.e;
                        if (!list2.isEmpty()) {
                            nVar3 = new q(22, eVar, list2);
                        } else {
                            nVar3 = eVar;
                        }
                        return new h(o0Var2, this.f3435b, nVar3, this.f3434a, this.d, this.f3436c.B(o0Var2), this.e, this.f3437f, this.f3438g);
                    }

                    @Override
                    public final f0 b(boolean z11) {
                        ((f) this.f3434a.d).f4731b = z11;
                        return this;
                    }

                    @Override
                    public final f0 c(int i10) {
                        ((f) this.f3434a.d).f4730a = i10;
                        return this;
                    }

                    @Override
                    public final f0 d(u uVar) {
                        f fVar = (f) this.f3434a.d;
                        fVar.getClass();
                        fVar.f4732c = uVar;
                        return this;
                    }
                };
            }
            return a(o0Var);
        }
        if (this.Y == null) {
            this.Y = new u2.f0(extendedDefaultDataSourceFactory) {
                public final l2.f f3439a;
                public c f3440b;
                public u f3441c;
                public final g3 f3444i = new g3(5);
                public final pb.a f3442f = new pb.a(19);
                public final hk0 f3443g = p2.e.J;
                public final d f3445j = new d(27);
                public final d h = new d(24);
                public final int f3447l = 1;
                public final long f3448m = -9223372036854775807L;
                public final boolean f3446k = true;
                public int e = 3;
                public boolean d = true;

                {
                    this.f3439a = new l2.f(extendedDefaultDataSourceFactory, 5);
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
                    this.f3441c = uVar;
                    return this;
                }

                @Override
                public final l a(o0 o0Var2) {
                    o0Var2.f3890b.getClass();
                    if (this.f3440b == null) {
                        ?? obj2 = new Object();
                        obj2.f17570a = new u(28);
                        obj2.f17572c = 3;
                        this.f3440b = obj2;
                    }
                    u uVar = this.f3441c;
                    if (uVar != null) {
                        this.f3440b.f17570a = uVar;
                    }
                    c cVar = this.f3440b;
                    cVar.f17571b = this.d;
                    cVar.f17572c = this.e;
                    List list2 = o0Var2.f3890b.e;
                    boolean isEmpty = list2.isEmpty();
                    p2.u uVar2 = this.f3442f;
                    if (!isEmpty) {
                        uVar2 = new n2.e(13, uVar2, list2);
                    }
                    n2.n B = this.f3444i.B(o0Var2);
                    this.f3443g.getClass();
                    l2.f fVar = this.f3439a;
                    d dVar2 = this.f3445j;
                    return new l(o0Var2, fVar, cVar, this.h, B, dVar2, new p2.e(fVar, dVar2, uVar2), this.f3448m, this.f3446k, this.f3447l);
                }
            };
        }
        return a(o0Var);
    }

    public void B() {
        this.I = false;
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.X(false);
        }
        i2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.X(false);
        }
        if (this.K != null) {
            this.f24523a0.removeCallbacksAndMessages(null);
            this.K.onVisualizerUpdate(false, true, null);
        }
    }

    public void C() {
        this.I = true;
        if (this.f24539x && (!this.H || !this.G)) {
            i2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.X(false);
            }
            i2.g0 g0Var2 = this.e;
            if (g0Var2 != null) {
                g0Var2.X(false);
                return;
            }
            return;
        }
        i2.g0 g0Var3 = this.d;
        if (g0Var3 != null) {
            g0Var3.X(true);
        }
        i2.g0 g0Var4 = this.e;
        if (g0Var4 != null) {
            g0Var4.X(true);
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
        this.f24527c0 = false;
        this.f24529e0 = false;
        this.G = false;
        this.f24539x = false;
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
        this.d.b();
    }

    public final void F(ArrayList arrayList, w71 w71Var) {
        int i10;
        ArrayList arrayList2;
        this.N = arrayList;
        this.O = w71Var;
        this.Q = null;
        this.S = "hls";
        this.R = null;
        this.T = null;
        this.U = false;
        this.f24527c0 = false;
        this.G = false;
        this.f24539x = false;
        this.F = null;
        this.v = true;
        i();
        this.f24529e0 = false;
        if (w71Var != null && (arrayList2 = this.N) != null) {
            i10 = arrayList2.indexOf(w71Var);
        } else {
            i10 = -1;
        }
        this.f24528d0 = i10;
        R(true, w71Var);
        if (this.f24527c0) {
            this.f24528d0 = -1;
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
        this.f24529e0 = false;
        this.f24539x = true;
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
        this.d.b();
        this.e.u1(xVar2, true);
        this.e.b();
        f24520k0.add(Integer.valueOf(this.f24522a));
    }

    public final void H() {
        f24520k0.remove(Integer.valueOf(this.f24522a));
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.X0();
            this.d = null;
        }
        i2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.X0();
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
        i2.r1 r1Var;
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            if (z10) {
                r1Var = i2.r1.d;
            } else {
                r1Var = i2.r1.f12580c;
            }
            g0Var.w1(r1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void M(long j10, boolean z10, Runnable runnable) {
        i2.r1 r1Var;
        if (this.d != null) {
            if (runnable != null) {
                this.f24534i0.add(runnable);
            }
            i2.g0 g0Var = this.d;
            if (z10) {
                r1Var = i2.r1.d;
            } else {
                r1Var = i2.r1.f12580c;
            }
            g0Var.w1(r1Var);
            this.d.Z0(5, j10);
        }
    }

    public final void N(boolean z10) {
        int i10;
        if (this.V != z10) {
            this.V = z10;
            i2.g0 g0Var = this.d;
            if (g0Var != null) {
                if (z10) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                g0Var.j(i10);
            }
        }
    }

    public final void O(boolean z10) {
        float f7;
        i2.g0 g0Var = this.d;
        float f10 = 1.0f;
        if (g0Var != null) {
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            g0Var.U(f7);
        }
        i2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            if (z10) {
                f10 = 0.0f;
            }
            g0Var2.U(f10);
        }
    }

    public void P(boolean z10) {
        this.I = z10;
        if (z10 && this.f24539x && (!this.H || !this.G)) {
            i2.g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.X(false);
            }
            i2.g0 g0Var2 = this.e;
            if (g0Var2 != null) {
                g0Var2.X(false);
                return;
            }
            return;
        }
        this.f24538w = z10;
        i2.g0 g0Var3 = this.d;
        if (g0Var3 != null) {
            g0Var3.X(z10);
        }
        i2.g0 g0Var4 = this.e;
        if (g0Var4 != null) {
            g0Var4.X(z10);
        }
    }

    public void Q(float f7) {
        try {
            i2.g0 g0Var = this.d;
            if (g0Var != null) {
                float f10 = 1.0f;
                if (f7 > 1.0f) {
                    f10 = 0.98f;
                }
                g0Var.f(new b2.z0(f7, f10));
            }
        } catch (Exception unused) {
        }
    }

    public final void R(boolean r21, org.telegram.ui.Components.w71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.R(boolean, org.telegram.ui.Components.w71):void");
    }

    public final void S(int i10) {
        int i11;
        int i12;
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            if (i10 == 0) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            g0Var.N0(new b2.f(0, 0, i12, 1, false, 0, true), false);
        }
        i2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            if (i10 == 0) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            g0Var2.N0(new b2.f(0, 0, i11, 1, false, 0, true), true);
        }
    }

    public final void T(Surface surface) {
        if (this.f24537s != surface) {
            this.f24537s = surface;
            i2.g0 g0Var = this.d;
            if (g0Var == null) {
                return;
            }
            g0Var.y1(surface);
        }
    }

    public final void U(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.f24536r != surfaceView) {
            this.f24536r = surfaceView;
            i2.g0 g0Var = this.d;
            if (g0Var == null) {
                return;
            }
            g0Var.F1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            g0Var.T(holder);
        }
    }

    public final void V(TextureView textureView) {
        if (this.f24535n != textureView) {
            this.f24535n = textureView;
            i2.g0 g0Var = this.d;
            if (g0Var == null) {
                return;
            }
            g0Var.z1(textureView);
        }
    }

    public final void W(float f7) {
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.U(f7);
        }
        i2.g0 g0Var2 = this.e;
        if (g0Var2 != null) {
            g0Var2.U(f7);
        }
    }

    public final void X(DispatchQueue dispatchQueue) {
        this.f24524b = dispatchQueue;
        if (dispatchQueue != null) {
            this.d.f12409s0 = new org.telegram.messenger.f1(dispatchQueue);
            return;
        }
        this.d.f12409s0 = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.playerDidStartPlaying && ((a81) objArr[0]) != this && y() && !this.f24540y) {
            B();
        }
    }

    @Override
    public final void g(j2.a aVar, int i10) {
        if (i10 == 1) {
            x71 x71Var = this.J;
            if (x71Var != null) {
                x71Var.onSeekFinished(aVar);
            }
            ArrayList arrayList = this.f24534i0;
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
        i2.j jVar;
        HashMap hashMap = new HashMap();
        hashMap.put(j2.k.f13963c.f13964a, 144179200);
        y2.d dVar = new y2.d();
        boolean z10 = this.f24526c;
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
                jVar = new u71(ApplicationLoader.applicationContext, this);
            } else {
                jVar = new i2.j(ApplicationLoader.applicationContext);
            }
            jVar.f12471c = 1;
            i2.n nVar = new i2.n(ApplicationLoader.applicationContext);
            v7.u6.p(!nVar.f12515z);
            nVar.f12496c = new i2.m(jVar, 2);
            x2.n nVar2 = this.f24530f;
            v7.u6.p(!nVar.f12515z);
            nVar2.getClass();
            nVar.e = new i2.m(nVar2, 1);
            v7.u6.p(!nVar.f12515z);
            nVar.f12497f = new i2.m(hVar, 0);
            i2.g0 a2 = nVar.a();
            this.d = a2;
            j2.f fVar = a2.f12408s;
            fVar.getClass();
            fVar.f13937f.a(this);
            this.d.f12397m.a(this);
            this.d.f12411t0.add(this);
            TextureView textureView = this.f24535n;
            if (textureView != null) {
                this.d.z1(textureView);
            } else {
                Surface surface = this.f24537s;
                if (surface != null) {
                    this.d.y1(surface);
                } else {
                    SurfaceView surfaceView = this.f24536r;
                    if (surfaceView != null) {
                        i2.g0 g0Var = this.d;
                        g0Var.F1();
                        g0Var.T(surfaceView.getHolder());
                    }
                }
            }
            this.d.X(this.f24538w);
            i2.g0 g0Var2 = this.d;
            if (this.V) {
                i13 = 2;
            }
            g0Var2.j(i13);
        }
        if (this.f24539x && this.e == null) {
            i2.n nVar3 = new i2.n(ApplicationLoader.applicationContext);
            x2.n nVar4 = this.f24530f;
            v7.u6.p(!nVar3.f12515z);
            nVar4.getClass();
            nVar3.e = new i2.m(nVar4, 1);
            v7.u6.p(true ^ nVar3.f12515z);
            nVar3.f12497f = new i2.m(hVar, 0);
            i2.g0 a10 = nVar3.a();
            this.e = a10;
            a10.f12397m.a(new e2.z(this, 1));
            this.e.X(this.f24538w);
        }
    }

    public final long j() {
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            if (this.v) {
                return g0Var.d0();
            }
            return g0Var.getDuration();
        }
        return 0L;
    }

    public final qf.g l(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.N == null) {
            if (this.Q == null) {
                return null;
            }
            String g10 = r.c.g("/mtproto_", str);
            String queryParameter = this.Q.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            qf.e eVar = new qf.e(this.Q, str5, g10);
            eVar.e = str2;
            eVar.f44480f = str3;
            return new qf.g(new qf.f(eVar));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.N;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ArrayList arrayList3 = ((w71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                y71 y71Var = (y71) obj2;
                StringBuilder sb2 = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb2.append(y71Var.f32559c);
                String sb3 = sb2.toString();
                TLRPC.Document document = y71Var.f32561g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                qf.e eVar2 = new qf.e(y71Var.d, str4, sb3);
                eVar2.e = str2;
                eVar2.f44480f = str3;
                int i12 = y71Var.f32562i;
                int i13 = y71Var.f32563j;
                eVar2.f44477a = i12;
                eVar2.f44478b = i13;
                arrayList.add(new qf.f(eVar2));
                arrayList2 = arrayList4;
            }
        }
        return new qf.g(arrayList);
    }

    public final TLRPC.Document m() {
        ArrayList arrayList;
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.F1();
            b2.w wVar = g0Var.S;
            if (wVar != null && wVar.f4127o != 0 && (arrayList = this.N) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ArrayList arrayList2 = ((w71) obj).d;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        y71 y71Var = (y71) obj2;
                        if (y71Var.f32559c == wVar.f4127o) {
                            return y71Var.f32561g;
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
        long j10 = this.f24532g0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            return g0Var.M0();
        }
        return 0L;
    }

    public final int o() {
        if (this.f24528d0 == -1) {
            try {
                if (this.f24527c0) {
                    for (int i10 = 0; i10 < t(); i10++) {
                        if (u(i10).f32022a) {
                            return i10;
                        }
                    }
                }
                i2.g0 g0Var = this.d;
                if (g0Var != null) {
                    g0Var.F1();
                    b2.w wVar = g0Var.S;
                    if (wVar != null) {
                        for (int i11 = 0; i11 < t(); i11++) {
                            w71 u10 = u(i11);
                            if (!u10.f32022a && wVar.f4137z == u10.f32023b && wVar.A == u10.f32024c && wVar.f4122j == ((int) Math.floor(((y71) u10.d.get(0)).f32565l * 8.0d))) {
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
        return this.f24528d0;
    }

    @Override
    public final void onCues(d2.c cVar) {
    }

    @Override
    public final void onPlayerError(b2.y0 y0Var) {
        AndroidUtilities.runOnUIThread(new go0(21, this, y0Var));
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            boolean t10 = g0Var.t();
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
            this.f24523a0.removeCallbacksAndMessages(null);
            t71 t71Var = this.K;
            if (t71Var != null) {
                t71Var.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
        this.f24532g0 = -9223372036854775807L;
        this.f24531f0 = -9223372036854775807L;
        x71 x71Var = this.J;
        if (x71Var != null) {
            x71Var.onRenderedFirstFrame(aVar);
        }
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
        x71 x71Var = this.J;
        if (x71Var != null) {
            x71Var.onSeekStarted(aVar);
        }
    }

    @Override
    public final void onTrackSelectionParametersChanged(b2.t1 t1Var) {
        org.telegram.ui.rq0 rq0Var = this.f24533h0;
        if (rq0Var != null) {
            AndroidUtilities.runOnUIThread(rq0Var);
        }
    }

    @Override
    public final void onTracksChanged(b2.v1 v1Var) {
        org.telegram.ui.rq0 rq0Var = this.f24533h0;
        if (rq0Var != null) {
            AndroidUtilities.runOnUIThread(rq0Var);
        }
    }

    @Override
    public final void onVideoSizeChanged(b2.a2 a2Var) {
        if (!Objects.equals(a2Var, b2.a2.d)) {
            this.J.onVideoSizeChanged(a2Var.f3696a, a2Var.f3697b, 0, a2Var.f3698c);
        }
    }

    public final long p() {
        long j10 = this.f24531f0;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            return g0Var.getDuration();
        }
        return 0L;
    }

    public final ei.z7 q(ei.z7 z7Var) {
        ei.z7 z7Var2 = z7Var;
        if (z7Var == null) {
            z7Var2 = new Object();
        }
        try {
            i2.g0 g0Var = this.d;
            g0Var.F1();
            MediaFormat mediaFormat = ((r2.r) g0Var.f12386g[0]).f44981f0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    z7Var2.f10242b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    z7Var2.f10241a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return z7Var2;
    }

    public final w71 r(Boolean bool) {
        w71 w71Var = null;
        for (int i10 = 0; i10 < t(); i10++) {
            w71 u10 = u(i10);
            if (u10.f32022a == bool.booleanValue() && (w71Var == null || w71Var.f32023b * w71Var.f32024c < u10.f32023b * u10.f32024c)) {
                w71Var = u10;
            }
        }
        return w71Var;
    }

    public final int t() {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final w71 u(int i10) {
        ArrayList arrayList = this.N;
        if (arrayList == null) {
            return r(Boolean.FALSE);
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            return (w71) this.N.get(i10);
        }
        return r(Boolean.FALSE);
    }

    public final boolean x() {
        i2.g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.F1();
            if (g0Var.f12379b0 == 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean y() {
        if (!this.f24539x || !this.I) {
            i2.g0 g0Var = this.d;
            if (g0Var != null && g0Var.t()) {
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
            ArrayList arrayList3 = ((w71) obj).d;
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                y71 y71Var = (y71) obj2;
                long j10 = y71Var.f32559c;
                Uri uri = y71Var.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j10, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(y71Var.e, y71Var.f32560f);
                if (y71Var.f32560f != null) {
                    this.P.add(y71Var);
                    StringBuilder sb3 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb3.append((int) Math.floor(y71Var.f32565l * 8.0d));
                    sb3.append(",RESOLUTION=");
                    sb3.append(y71Var.f32562i);
                    sb3.append("x");
                    sb3.append(y71Var.f32563j);
                    String str2 = y71Var.f32566m;
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
                    if (y71Var.b() && y71Var.c()) {
                        sb3.append(",CACHED=\"true\"");
                    }
                    sb3.append(",DOCID=\"");
                    sb3.append(y71Var.f32559c);
                    sb3.append("\",ACCOUNT=\"");
                    sb3.append(y71Var.f32557a);
                    sb3.append("\"\n");
                    if (y71Var.c()) {
                        sb3.append(y71Var.f32560f);
                        sb3.append("\n\n");
                    } else {
                        sb3.append("mtproto:");
                        sb3.append(y71Var.e);
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

    public a81(boolean z10, boolean z11) {
        int i10 = f24519j0;
        f24519j0 = i10 + 1;
        this.f24522a = i10;
        this.f24523a0 = new Handler(Looper.getMainLooper());
        this.f24527c0 = false;
        this.f24528d0 = -1;
        this.f24531f0 = -9223372036854775807L;
        this.f24532g0 = -9223372036854775807L;
        this.f24534i0 = new ArrayList();
        this.f24525b0 = z11;
        this.h = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        x2.n nVar = new x2.n(ApplicationLoader.applicationContext, new oa.d(26));
        this.f24530f = nVar;
        if (z11) {
            x2.i j10 = nVar.j();
            j10.getClass();
            x2.h hVar = new x2.h(j10);
            hVar.I.add(1);
            nVar.b(new x2.i(hVar));
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
    public final void onPositionDiscontinuity(b2.e1 e1Var, b2.e1 e1Var2, int i10) {
    }

    @Override
    public void onRenderedFirstFrame() {
        this.J.onRenderedFirstFrame();
    }

    @Override
    public final void a(i2.d dVar) {
    }

    @Override
    public final void b(u2.c0 c0Var) {
    }

    @Override
    public final void c(b2.a2 a2Var) {
    }

    @Override
    public final void h(b2.y0 y0Var) {
    }

    @Override
    public final void onAudioAttributesChanged(b2.f fVar) {
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
    }

    @Override
    public final void onAvailableCommandsChanged(b2.b1 b1Var) {
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
    public final void onMediaMetadataChanged(b2.r0 r0Var) {
    }

    @Override
    public final void onMetadata(b2.t0 t0Var) {
    }

    @Override
    public final void onPlaybackParametersChanged(b2.z0 z0Var) {
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
    }

    @Override
    public final void onPlayerErrorChanged(b2.y0 y0Var) {
    }

    @Override
    public final void onPlaylistMetadataChanged(b2.r0 r0Var) {
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
    public final void d(b2.f1 f1Var, qf.b bVar) {
    }

    @Override
    public final void e(j2.a aVar, u2.c0 c0Var) {
    }

    @Override
    public final void onEvents(b2.f1 f1Var, b2.c1 c1Var) {
    }

    @Override
    public final void onMediaItemTransition(b2.o0 o0Var, int i10) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
    }

    @Override
    public final void onTimelineChanged(b2.o1 o1Var, int i10) {
    }

    @Override
    public final void f(j2.a aVar, int i10, long j10) {
    }
}
