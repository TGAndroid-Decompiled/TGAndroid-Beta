package org.telegram.ui.Wallet;

import a8.xa;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.cz;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.il0;
import org.telegram.ui.sw;
import org.telegram.ui.u91;
import org.telegram.ui.vc1;
import org.telegram.ui.x21;
import org.telegram.ui.yw;
public final class k8 implements org.telegram.ui.ActionBar.q1, OnSuccessListener, p4.l0, h2.j, p4.a1, qi.m, OnFailureListener, u2.v, w5.b, ua.a, androidx.car.app.utils.c, v5.e, il0, sw, f3.r {
    public final int f44073a;
    public final Object f44074b;
    public final Object f44075c;

    public k8(int i7, Object obj, Object obj2) {
        this.f44073a = i7;
        this.f44074b = obj;
        this.f44075c = obj2;
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void a(ji.j jVar) {
        switch (this.f44073a) {
            case 13:
                org.telegram.messenger.g0.h3(new lv0((SpannableString) this.f44074b, jVar, (oi.u4) this.f44075c, 21));
                return;
            default:
                org.telegram.messenger.g0.h3(new lv0((SpannableString) this.f44074b, jVar, (di.m9) this.f44075c, 22));
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        switch (this.f44073a) {
            case 8:
                p4.c1 c1Var = (p4.c1) this.f44074b;
                e2.q1 q1Var = (e2.q1) this.f44075c;
                p4.g1 g1Var = (p4.g1) obj;
                c1Var.getClass();
                h9.l0 l0Var = q1Var.H;
                if (!l0Var.isEmpty()) {
                    e2.p1 c10 = q1Var.a().c();
                    h9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        e2.n1 n1Var = (e2.n1) it.next();
                        e2.m1 m1Var = (e2.m1) c1Var.d.f13740n.get(n1Var.f10237a.f10210b);
                        if (m1Var != null && n1Var.f10237a.f10209a == m1Var.f10209a) {
                            c10.a(new e2.n1(m1Var, n1Var.f10238b));
                        } else {
                            c10.a(n1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                g1Var.q0(q1Var);
                return;
            case 9:
                p4.v vVar = (p4.v) this.f44075c;
                p4.g1 g1Var2 = (p4.g1) obj;
                p4.d0 d0Var = (p4.d0) ((p4.c1) this.f44074b).f54600a.get();
                if (d0Var != null && !d0Var.j()) {
                    d0Var.g(vVar, false);
                    return;
                }
                return;
            case 10:
                p4.c1 c1Var2 = (p4.c1) this.f44074b;
                Surface surface = (Surface) this.f44075c;
                p4.g1 g1Var3 = (p4.g1) obj;
                ((p4.d0) c1Var2.f54600a.get()).getClass();
                if (surface == null) {
                    g1Var3.S(null);
                    c1Var2.f54605i = null;
                    return;
                }
                p4.b1 b1Var = new p4.b1(surface);
                c1Var2.f54605i = b1Var;
                g1Var3.S(b1Var);
                return;
            default:
                xa xaVar = (xa) this.f44074b;
                ((x2.j0) obj).k(xaVar.f713b, (x2.f0) xaVar.f714c, (x2.b0) this.f44075c);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        l5.d[] values;
        v5.g gVar = (v5.g) this.f44074b;
        o5.i iVar = (o5.i) this.f44075c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        v5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f58704b);
        for (l5.d dVar : l5.d.values()) {
            if (dVar != iVar.f21349c) {
                int size = aVar.f58704b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i7 = 0; i7 < d.size(); i7++) {
            sb2.append(((v5.b) d.get(i7)).f58707a);
            if (i7 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j3 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new v5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            v5.b bVar = (v5.b) listIterator.next();
            long j10 = bVar.f58707a;
            if (hashMap.containsKey(Long.valueOf(j10))) {
                h2.e0 c10 = bVar.f58709c.c();
                for (v5.f fVar : (Set) hashMap.get(Long.valueOf(j10))) {
                    c10.a(fVar.f58710a, fVar.f58711b);
                }
                listIterator.set(new v5.b(j10, bVar.f58708b, c10.b()));
            }
        }
        return d;
    }

    @Override
    public void b(ua.b bVar) {
        ((ua.a) this.f44074b).b(bVar);
        ((ua.a) this.f44075c).b(bVar);
    }

    @Override
    public int c(Object obj) {
        Context context = (Context) this.f44074b;
        e2.u uVar = (e2.u) this.f44075c;
        u2.o oVar = (u2.o) obj;
        String str = oVar.f57771b;
        if ((!str.equals(uVar.f10451s) && !str.equals(u2.w.c(uVar))) || !oVar.c(context, uVar, false) || !oVar.d(uVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void call() {
        int i7 = CarAppNotificationBroadcastReceiver.f2045a;
        ((IStartCarApp) this.f44074b).startCarApp((Intent) this.f44075c);
    }

    @Override
    public f3.o[] d(Uri uri, Map map) {
        f3.o aVar;
        x2.p pVar = (x2.p) this.f44074b;
        e2.u uVar = (e2.u) this.f44075c;
        if (pVar.f59629c.L(uVar)) {
            aVar = new c4.h(pVar.f59629c.f(uVar), null);
        } else {
            aVar = new n3.a(uVar);
        }
        return new f3.o[]{aVar};
    }

    @Override
    public void e(int i7) {
        switch (this.f44073a) {
            case 25:
                wg.t tVar = (wg.t) this.f44074b;
                wg.t tVar2 = (wg.t) this.f44075c;
                if (i7 == 1) {
                    tVar.a(null);
                    return;
                } else if (i7 != 3) {
                    tVar2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                z10 z10Var = (z10) this.f44074b;
                z10 z10Var2 = (z10) this.f44075c;
                if (i7 == 1) {
                    z10Var.a(null);
                    return;
                } else if (i7 != 3) {
                    z10Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void f(p4.v vVar) {
        switch (this.f44073a) {
            case 6:
                ((p4.d) this.f44075c).f(((p4.m0) this.f44074b).h.f54635t);
                return;
            default:
                p4.m0 m0Var = (p4.m0) this.f44074b;
                m0Var.getClass();
                String str = ((q4.h) this.f44075c).f55221a;
                if (TextUtils.isEmpty(str)) {
                    h2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                p4.g1 g1Var = m0Var.h.f54635t;
                if (!g1Var.p0(17)) {
                    h2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                e2.l1 y02 = g1Var.y0();
                e2.k1 k1Var = new e2.k1();
                for (int i7 = 0; i7 < y02.o(); i7++) {
                    if (TextUtils.equals(y02.m(i7, k1Var, 0L).f10162c.f10185a, str)) {
                        g1Var.Q(i7);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object g() {
        switch (this.f44073a) {
            case 17:
                Iterable iterable = (Iterable) this.f44075c;
                v5.g gVar = (v5.g) ((v5.d) ((ia.c) this.f44074b).f15875c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + v5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ia.c cVar = (ia.c) this.f44074b;
                for (Map.Entry entry : ((HashMap) this.f44075c).entrySet()) {
                    ((v5.g) ((v5.c) cVar.f15879i)).e(((Integer) entry.getValue()).intValue(), r5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f44073a) {
            case 0:
                ((Runnable) this.f44074b).run();
                ((org.telegram.ui.ActionBar.u2) this.f44075c).dismiss();
                return;
            case 1:
                l0 l0Var = (l0) this.f44075c;
                vf.b h = t1Var.h(i7, true, true);
                h.d();
                l8 l8Var = new l8((p8) this.f44074b, h, 1);
                l0.H("disableBackupWithoutUpdatingPhrase");
                l0Var.m0(new h2.n0((Object) l0Var, (Object) new x21(3, l0Var, l8Var), true, false, 4));
                return;
            case 3:
                org.telegram.ui.web.m.d0((org.telegram.ui.web.m) this.f44074b, (HashSet) this.f44075c);
                return;
            case 4:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f44074b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = np.s1(v0Var.N).q1(v0Var.V);
                ConnectionsManager.getInstance(v0Var.N).sendRequest(allowsendmessage, new bi.j6(v0Var, (String[]) this.f44075c, t1Var, 21));
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.f44074b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f44075c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 20:
                ug.j0 j0Var = (ug.j0) this.f44074b;
                ArrayList arrayList = (ArrayList) this.f44075c;
                j0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = np.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(j0Var.f29679a).sendRequest(tL_channels_updateUsername, new ug.u(j0Var, 1), 64);
                }
                return;
            case 23:
                ((AtomicBoolean) this.f44074b).set(true);
                ((wg.p0) this.f44075c).run();
                return;
            default:
                ((wg.t) this.f44074b).a((TLRPC.TL_premiumGiftCodeOption) this.f44075c);
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f44073a) {
            case 11:
                p4.a1 a1Var = (p4.a1) this.f44074b;
                p4.q0 q0Var = (p4.q0) this.f44075c;
                if (d0Var.j()) {
                    return c8.r9.b(new p4.m1(-100));
                }
                return h2.l0.g0((m9.y) a1Var.k(d0Var, vVar, i7), new km(d0Var, vVar, q0Var, 10));
            default:
                p4.a1 a1Var2 = (p4.a1) this.f44074b;
                p4.z0 z0Var = (p4.z0) this.f44075c;
                if (d0Var.j()) {
                    return c8.r9.b(new p4.m1(-100));
                }
                return h2.l0.g0((m9.y) a1Var2.k(d0Var, vVar, i7), new km(d0Var, vVar, z0Var, 11));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        tg.n1 n1Var = (tg.n1) this.f44074b;
        Bitmap bitmap = (Bitmap) this.f44075c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof lb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(19, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((a8.r7) this.f44074b).d));
        ((hi.d) this.f44075c).setLoading(false);
        vc1.d = null;
        org.telegram.ui.ActionBar.u2 u2Var = vc1.f52197c;
        if (u2Var != null) {
            u2Var.dismiss();
            vc1.f52197c = null;
        }
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        wg.e0 e0Var = (wg.e0) this.f44074b;
        String str = (String) this.f44075c;
        long j3 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            j3 = ((ur) arrayList.get(i11)).f26860a;
            e0Var.f35940s1.getSendMessagesHelper().r0(cz.b(str, j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ywVar.finishFragment();
        wg.h.h(j3);
        return true;
    }
}
