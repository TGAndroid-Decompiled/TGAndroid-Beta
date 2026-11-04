package org.telegram.ui.ActionBar;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import b8.ke;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.y00;
import org.telegram.ui.lp0;
import org.telegram.ui.xm0;
import org.webrtc.GlGenericDrawer;
public final class e3 implements r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.u0, p1, g2.k, pi.m, qe.b, t0.e, v5.b, t9.d, tg.z, tg.j1, OnSuccessListener, ec, ta.a {
    public final int f27473a;
    public final Object f27474b;

    public e3(Object obj, int i3) {
        this.f27473a = i3;
        this.f27474b = obj;
    }

    @Override
    public void F(float f10, int i3) {
        int i10 = this.f27473a;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        switch (this.f27473a) {
            case 0:
                j3 j3Var = (j3) this.f27474b;
                j3Var.f27671s = k1Var.f54026a.f(2).d;
                j3Var.invalidate();
                return r0.k1.f54025b;
            default:
                l3 l3Var = (l3) this.f27474b;
                l3Var.f28308e = k1Var;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
                if (!l3Var.f28309f.equals(I0) || !l3Var.h.equals(I02)) {
                    org.telegram.messenger.g0.f22602m = I0.f14496b;
                    org.telegram.messenger.g0.f22603n = I0.d;
                    l3Var.f28309f = I0;
                    l3Var.h = I02;
                    l3Var.requestLayout();
                }
                int childCount = l3Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = l3Var.getChildAt(i3);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                }
                l3Var.invalidate();
                return r0.k1.f54025b;
        }
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.f27473a) {
            case 8:
                ((Switch) this.f27474b).invalidate();
                return;
            default:
                th.b.a((th.b) this.f27474b);
                return;
        }
    }

    @Override
    public Typeface a() {
        return tg.b0.a((Font) this.f27474b);
    }

    @Override
    public void accept(Object obj) {
        ((p2.j) obj).a((v7.s) this.f27474b);
    }

    @Override
    public void c(ta.b bVar) {
        w9.a aVar = (w9.a) this.f27474b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f57422b.set((w9.a) bVar.get());
    }

    @Override
    public Object d() {
        SQLiteDatabase a10;
        int i3 = this.f27473a;
        Object obj = this.f27474b;
        switch (i3) {
            case 11:
                u5.g gVar = (u5.g) ((u5.c) obj);
                gVar.getClass();
                int i10 = q5.a.f53790e;
                ui.f fVar = new ui.f(13, false);
                fVar.f56390b = null;
                fVar.f56391c = new ArrayList();
                fVar.d = null;
                fVar.f56392e = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    q5.a aVar = (q5.a) u5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new hr(gVar, hashMap, fVar, 11));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 12:
                u5.g gVar2 = (u5.g) ((u5.d) obj);
                long o10 = gVar2.f55722b.o() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(o10)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i11 = rawQuery.getInt(0);
                        gVar2.e(i11, q5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 13:
                u5.g gVar3 = (u5.g) ((u5.c) ((ha.c) obj).f14378i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f55722b.o()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                za.p pVar = (za.p) obj;
                for (n5.i iVar : (Iterable) ((u5.g) ((u5.d) pVar.f60312b)).c(new s0.b(26))) {
                    ((p7.d) pVar.f60313c).E(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f27473a) {
            case 5:
                ((org.telegram.ui.web.y) this.f27474b).run();
                return;
            case 19:
                ((xm0) this.f27474b).run();
                return;
            case 20:
                ((ug.z) this.f27474b).f56317a.P1.r();
                return;
            default:
                ((xg.r0) this.f27474b).run();
                return;
        }
    }

    @Override
    public void l(int i3) {
        boolean z10;
        int i10;
        pi.a aVar = (pi.a) this.f27474b;
        pi.q qVar = aVar.f53523a;
        pi.d dVar = aVar.f53528g;
        if (Build.VERSION.SDK_INT >= 31 && dVar != null) {
            ArrayList arrayList = dVar.f53558a;
            if (pi.q.f().f53625a) {
                if (x7.u.a(i3, 4) || x7.u.a(i3, 2)) {
                    ri.a e10 = qVar.e();
                    ViewGroup viewGroup = aVar.f53533m;
                    if (viewGroup != null) {
                        e10.b(viewGroup.getY(), aVar.f53532l.getWidth(), aVar.f53533m.getY() + aVar.f53533m.getHeight());
                    }
                    dVar.f53559b = e10.f54544b;
                    while (dVar.f53559b > arrayList.size()) {
                        arrayList.add(new pi.b(arrayList.size()));
                    }
                    for (int i11 = 0; i11 < dVar.f53559b; i11++) {
                        pi.b bVar = (pi.b) arrayList.get(i11);
                        bVar.f53535a.set(e10.c(i11));
                        bVar.b(dVar.f53568m, dVar.f53569n, dVar.f53570o);
                        bVar.c(dVar.f53566k);
                        int i12 = dVar.f53571p;
                        int i13 = dVar.f53572q;
                        int i14 = dVar.f53573r;
                        int i15 = dVar.f53574s;
                        bVar.f53553u = i12;
                        bVar.v = i13;
                        bVar.f53554w = i14;
                        bVar.f53555x = i15;
                    }
                }
                dVar.f53560c = aVar.f53534n;
                dVar.d = aVar.f53532l;
                int i16 = 1;
                if (qVar.f53609j > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = !z10;
                if (dVar.f53567l != z11) {
                    dVar.f53567l = z11;
                    if (!z10) {
                        i10 = 5;
                    } else {
                        i10 = 1;
                    }
                    dVar.f53568m = i10;
                    if (!z10) {
                        i16 = 10;
                    }
                    dVar.f53569n = i16;
                    dVar.f53570o = Math.max(i10, i16);
                    for (int i17 = 0; i17 < dVar.f53559b; i17++) {
                        ((pi.b) arrayList.get(i17)).b(dVar.f53568m, dVar.f53569n, dVar.f53570o);
                    }
                    dVar.f();
                }
                int i18 = qVar.f53610k;
                int i19 = qVar.f53611l;
                dVar.f53575t = i18;
                dVar.f53576u = i19;
                dVar.f();
                dVar.e();
                Runnable runnable = aVar.f53530j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        ug.d2 d2Var = (ug.d2) this.f27474b;
        if (z10 && !z11 && (B = imageReceiver.B()) != null) {
            d2Var.q(B);
        }
    }

    @Override
    public boolean m(y00 y00Var, int i3, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.f27474b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i3 & 1) != 0) {
            try {
                ((t0.h) y00Var.f40562a).b();
                Parcelable parcelable = (Parcelable) ((t0.h) y00Var.f40562a).e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) y00Var.f40562a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i10 >= 31) {
            dVar = new l2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.f53999b = clipData;
            eVar.f54000c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.d());
        dVar.setExtras(bundle);
        if (r0.i0.h(sVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public void o() {
        float f10;
        lp0 lp0Var = (lp0) this.f27474b;
        TextView textView = lp0Var.f55972i1;
        boolean a10 = lp0Var.f55981p0.a();
        ImageView imageView = lp0Var.f55970g1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override
    public void onSuccess(Object obj) {
        int i3 = this.f27473a;
        Object obj2 = this.f27474b;
        switch (i3) {
            case 21:
                ug.n1 n1Var = (ug.n1) obj2;
                wb.b bVar = (wb.b) obj;
                n1Var.D0 = true;
                n1Var.C0 = false;
                return;
            case 22:
                ai.g3 g3Var = (ai.g3) obj2;
                wb.b bVar2 = (wb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f57447a.size(); i10++) {
                    wb.a aVar = (wb.a) bVar2.f57447a.get(i10);
                    ?? obj3 = new Object();
                    obj3.f55886a = aVar.f57443a;
                    obj3.f55887b = aVar.d;
                    obj3.f55888c = aVar.f57446e;
                    obj3.d = aVar.f57444b;
                    obj3.f55889e = aVar.f57445c;
                    arrayList.add(obj3);
                }
                g3Var.a(arrayList);
                return;
            default:
                ug.c2 c2Var = (ug.c2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    return;
                }
                int i11 = ((tb.a) list.get(0)).f55079c;
                String str = null;
                if (x7.d0.f58262a == null) {
                    x7.d0.f58262a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = x7.d0.f58262a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                c2Var.f55901d0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((tb.a) list.get(0)).f55079c);
                sb2.append(" ");
                sb2.append(c2Var.f55901d0);
                sb2.append(" ");
                k2.p1.w(((tb.a) list.get(0)).f55077a, sb2);
                org.telegram.messenger.i6.g(c2Var.f55901d0);
                return;
        }
    }

    @Override
    public Object q1(ke keVar) {
        String str;
        z9.p pVar;
        aa.g gVar;
        int i3;
        int i10;
        int i11;
        Throwable th2;
        String str2;
        v9.b bVar;
        String str3;
        String str4;
        int i12;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ha.b a10;
        switch (this.f27473a) {
            case 15:
                return this.f27474b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f27474b;
                int i13 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                n9.h hVar = (n9.h) keVar.a(n9.h.class);
                t9.p n4 = keVar.n(w9.a.class);
                t9.p n10 = keVar.n(o9.a.class);
                t9.p n11 = keVar.n(cb.a.class);
                ExecutorService executorService = (ExecutorService) keVar.g(crashlyticsRegistrar.f7937c);
                hVar.a();
                Context context = hVar.f20296a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                aa.g gVar2 = new aa.g((ExecutorService) keVar.g(crashlyticsRegistrar.f7935a), (ExecutorService) keVar.g(crashlyticsRegistrar.f7936b));
                fa.f fVar = new fa.f(context);
                z9.s sVar = new z9.s(hVar);
                z9.v vVar = new z9.v(context, packageName, (ua.e) keVar.a(ua.e.class), sVar);
                w9.a aVar = new w9.a(n4);
                androidx.emoji2.text.f fVar2 = new androidx.emoji2.text.f(n10);
                z9.i iVar = new z9.i(sVar, fVar);
                eb.c cVar = eb.c.f9925a;
                eb.d dVar = eb.d.f9927a;
                eb.c cVar2 = eb.c.f9925a;
                eb.a a11 = eb.c.a(dVar);
                if (a11.f9918b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " already registered.");
                } else {
                    a11.f9918b = iVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " registered.");
                    a11.f9917a.countDown();
                }
                z9.p pVar2 = new z9.p(hVar, vVar, aVar, sVar, new v9.a(fVar2), new v9.a(fVar2), fVar, iVar, new nh(n11, 27), gVar2);
                aa.g gVar3 = pVar2.f60227n;
                hVar.a();
                String str5 = hVar.f20298c.f20310b;
                int e10 = z9.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = z9.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                if (e10 != 0) {
                    str = context.getResources().getString(e10);
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                int e11 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    pVar = pVar2;
                    gVar = gVar3;
                    i3 = 2;
                    i10 = 0;
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    i3 = 2;
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    i10 = 0;
                    if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
                        pVar = pVar2;
                        gVar = gVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    } else {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new z9.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            gVar3 = gVar3;
                            pVar2 = pVar2;
                        }
                        pVar = pVar2;
                        gVar = gVar3;
                    }
                    th2 = null;
                    i11 = 3;
                }
                String f10 = t4.c.f("Mapping file ID is: ", str);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", f10, th2);
                }
                int size = arrayList.size();
                int i16 = i10;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    z9.d dVar2 = (z9.d) obj;
                    String str6 = dVar2.f60170a;
                    String str7 = dVar2.f60171b;
                    String str8 = dVar2.f60172c;
                    int i17 = size;
                    StringBuilder n12 = com.google.android.recaptcha.internal.a.n("Build id for ", str6, " on ", str7, ": ");
                    n12.append(str8);
                    String sb2 = n12.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i3;
                try {
                    z9.a a12 = z9.a.a(context, vVar, str5, str, arrayList, new w9.b(context));
                    String str9 = "Installer package name is: " + a12.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i18)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    kb.a aVar2 = new kb.a(7);
                    String str10 = a12.f60162f;
                    String str11 = a12.f60163g;
                    String d = vVar.d();
                    nb.a aVar3 = new nb.a(29);
                    gi.v5 v5Var = new gi.v5(aVar3, 3);
                    android.support.v4.media.c cVar3 = new android.support.v4.media.c(fVar);
                    Locale locale = Locale.US;
                    be.t tVar = new be.t(a1.g.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), aVar2);
                    String str12 = Build.MANUFACTURER;
                    String str13 = z9.v.h;
                    String C = a1.g.C(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e14 = z9.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = z9.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    if (e14 != 0) {
                        str3 = context.getResources().getString(e14);
                    } else {
                        str3 = null;
                    }
                    String[] strArr = {str3, str5, str11, str10};
                    ArrayList arrayList2 = new ArrayList();
                    int i19 = i10;
                    while (i19 < 4) {
                        String str14 = strArr[i19];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
                        }
                        i19++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i20 = i10;
                    while (i20 < size2) {
                        Object obj2 = arrayList2.get(i20);
                        i20++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    if (sb4.length() > 0) {
                        str4 = z9.g.i(sb4);
                    } else {
                        str4 = null;
                    }
                    if (d != null) {
                        i12 = 4;
                    } else {
                        i12 = 1;
                    }
                    ha.e eVar = new ha.e(str5, C, replaceAll, replaceAll2, vVar, str4, str11, str10, t4.c.b(i12));
                    ?? obj3 = new Object();
                    AtomicReference atomicReference = new AtomicReference();
                    obj3.h = atomicReference;
                    obj3.f14378i = new AtomicReference(new TaskCompletionSource());
                    obj3.f14372a = context;
                    obj3.f14373b = eVar;
                    obj3.d = aVar3;
                    obj3.f14374c = v5Var;
                    obj3.f14375e = cVar3;
                    obj3.f14376f = tVar;
                    obj3.f14377g = sVar;
                    atomicReference.set(ra.e.s2(aVar3));
                    AtomicReference atomicReference2 = (AtomicReference) obj3.f14378i;
                    AtomicReference atomicReference3 = (AtomicReference) obj3.h;
                    if (((Context) obj3.f14372a).getSharedPreferences("com.google.firebase.crashlytics", i10).getString("existing_instance_identifier", "").equals((String) ((ha.e) obj3.f14373b).f14384f) && (a10 = obj3.a(1)) != null) {
                        atomicReference3.set(a10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                        onSuccessTask = Tasks.forResult(null);
                    } else {
                        ha.b a13 = obj3.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        z9.s sVar2 = (z9.s) obj3.f14377g;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.f60240c) {
                            task = sVar2.d.getTask();
                        }
                        onSuccessTask = aa.b.a(task2, task).onSuccessTask(gVar2.f286a, new p4.q(obj3, gVar2, false));
                    }
                    onSuccessTask.addOnFailureListener(executorService, new u9.j(9));
                    z9.p pVar3 = pVar;
                    fa.f fVar3 = pVar3.h;
                    Context context2 = pVar3.f60216a;
                    boolean c2 = z9.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", z9.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str15 = a12.f60159b;
                    if (!c2) {
                        str2 = "FirebaseCrashlytics";
                        if (Log.isLoggable(str2, 2)) {
                            Log.v(str2, "Configured not to require a build ID.", null);
                        }
                    } else {
                        str2 = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str15)) {
                            Log.e(str2, ".");
                            Log.e(str2, ".     |  | ");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".   \\ |  | /");
                            Log.e(str2, ".    \\    /");
                            Log.e(str2, ".     \\  /");
                            Log.e(str2, ".      \\/");
                            Log.e(str2, ".");
                            Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str2, ".");
                            Log.e(str2, ".      /\\");
                            Log.e(str2, ".     /  \\");
                            Log.e(str2, ".    /    \\");
                            Log.e(str2, ".   / |  | \\");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    }
                    String str16 = new z9.e().f60175a;
                    try {
                        pVar3.f60219e = new w9.b(5, "crash_marker", fVar3);
                        pVar3.d = new w9.b(5, "initialization_marker", fVar3);
                        aa.g gVar4 = gVar;
                        m.o3 o3Var = new m.o3(str16, fVar3, gVar4);
                        ba.f fVar4 = new ba.f(fVar3);
                        ia.a[] aVarArr = {new kb.a(11)};
                        ?? obj4 = new Object();
                        obj4.f55094a = aVarArr;
                        obj4.f55095b = new v7.s(10);
                        ((t9.p) pVar3.f60226m.f36540b).a(new u9.j(16));
                        pVar3.f60220f = new z9.m(pVar3.f60216a, pVar3.f60221g, pVar3.f60217b, pVar3.h, pVar3.f60219e, a12, o3Var, fVar4, z9.x.d(pVar3.f60216a, pVar3.f60221g, pVar3.h, a12, fVar4, o3Var, obj4, obj3, pVar3.f60218c, pVar3.f60224k, pVar3.f60227n), pVar3.f60225l, pVar3.f60223j, pVar3.f60224k, pVar3.f60227n);
                        w9.b bVar2 = pVar3.d;
                        fa.f fVar5 = (fa.f) bVar2.f57425c;
                        fVar5.getClass();
                        boolean exists = new File((File) fVar5.d, (String) bVar2.f57424b).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) gVar4.f286a.f282a.submit(new d5.f(pVar3, 2)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        z9.m mVar = pVar3.f60220f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar.f60198e.f286a.a(new xh.i(1, mVar, str16));
                        z9.r rVar = new z9.r(new y3.b(mVar), obj3, defaultUncaughtExceptionHandler, mVar.f60202j);
                        mVar.f60206n = rVar;
                        Thread.setDefaultUncaughtExceptionHandler(rVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            pVar3.f60220f.e(str16);
                        }
                        if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            pVar3.b(obj3);
                        } else {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            gVar4.f286a.a(new z9.n(pVar3, obj3, 0));
                        }
                    } catch (Exception e15) {
                        Log.e(str2, "Crashlytics was not started due to an exception during initialization", e15);
                        pVar3.f60220f = null;
                    }
                    bVar = new v9.b(pVar3);
                } catch (PackageManager.NameNotFoundException e16) {
                    str2 = "FirebaseCrashlytics";
                    Log.e(str2, "Error retrieving app package info.", e16);
                    bVar = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String e17 = t4.c.e(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, e17, null);
                    }
                }
                return bVar;
        }
    }

    @Override
    public void run(Bitmap bitmap, int i3) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.f27474b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            org.telegram.messenger.g0.h3(new p11(10, rVar, bitmap));
        }
    }

    public e3(ne.h hVar, r4.s0 s0Var) {
        this.f27473a = 9;
        this.f27474b = hVar;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    private final void b(float f10, int i3) {
    }

    private final void e(float f10, int i3) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
