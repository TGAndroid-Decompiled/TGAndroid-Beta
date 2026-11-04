package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class na1 implements org.telegram.ui.ActionBar.p1, OnSuccessListener, t2.v, v5.b, ta.a, u5.e, OnFailureListener, androidx.car.app.utils.b, e3.r, g2.k, cl0, nw, OnCompleteListener, Continuation {
    public final int f47926a;
    public final Object f47927b;
    public final Object f47928c;

    public na1(int i3, Object obj, Object obj2) {
        this.f47926a = i3;
        this.f47927b = obj;
        this.f47928c = obj2;
    }

    @Override
    public boolean G() {
        switch (this.f47926a) {
            case 26:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean N(uw uwVar) {
        switch (this.f47926a) {
            case 26:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int a(Object obj) {
        Context context = (Context) this.f47927b;
        d2.v vVar = (d2.v) this.f47928c;
        t2.o oVar = (t2.o) obj;
        String str = oVar.f54853b;
        if ((!str.equals(vVar.f8489s) && !str.equals(t2.w.c(vVar))) || !oVar.c(context, vVar, false) || !oVar.d(vVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public void accept(Object obj) {
        b8.kg kgVar = (b8.kg) this.f47927b;
        ((w2.k0) obj).d(kgVar.f2722b, (w2.g0) kgVar.f2723c, (w2.c0) this.f47928c);
    }

    @Override
    public Object apply(Object obj) {
        k5.d[] values;
        u5.g gVar = (u5.g) this.f47927b;
        n5.i iVar = (n5.i) this.f47928c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        u5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f55712b);
        for (k5.d dVar : k5.d.values()) {
            if (dVar != iVar.f20247c) {
                int size = aVar.f55712b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < d.size(); i3++) {
            sb2.append(((u5.b) d.get(i3)).f55715a);
            if (i3 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new u5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            u5.b bVar = (u5.b) listIterator.next();
            long j11 = bVar.f55715a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                g2.f0 c2 = bVar.f55717c.c();
                for (u5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c2.a(fVar.f55718a, fVar.f55719b);
                }
                listIterator.set(new u5.b(j11, bVar.f55716b, c2.b()));
            }
        }
        return d;
    }

    @Override
    public e3.o[] b(Uri uri, Map map) {
        e3.o aVar;
        w2.q qVar = (w2.q) this.f47927b;
        d2.v vVar = (d2.v) this.f47928c;
        if (qVar.f57195c.l(vVar)) {
            aVar = new b4.h(qVar.f57195c.h(vVar), null);
        } else {
            aVar = new m3.a(vVar);
        }
        return new e3.o[]{aVar};
    }

    @Override
    public void c(ta.b bVar) {
        ((ta.a) this.f47927b).c(bVar);
        ((ta.a) this.f47928c).c(bVar);
    }

    @Override
    public void call() {
        int i3 = CarAppNotificationBroadcastReceiver.f1524a;
        ((IStartCarApp) this.f47927b).startCarApp((Intent) this.f47928c);
    }

    @Override
    public Object d() {
        switch (this.f47926a) {
            case 12:
                Iterable iterable = (Iterable) this.f47928c;
                u5.g gVar = (u5.g) ((u5.d) ((ha.c) this.f47927b).f14374c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + u5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ha.c cVar = (ha.c) this.f47927b;
                for (Map.Entry entry : ((HashMap) this.f47928c).entrySet()) {
                    ((u5.g) ((u5.c) cVar.f14378i)).e(((Integer) entry.getValue()).intValue(), q5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void e(int i3) {
        switch (this.f47926a) {
            case 24:
                xg.v vVar = (xg.v) this.f47927b;
                xg.v vVar2 = (xg.v) this.f47928c;
                if (i3 == 1) {
                    vVar.a(null);
                    return;
                } else if (i3 != 3) {
                    vVar2.a(null);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f47927b;
                org.telegram.messenger.u10 u10Var2 = (org.telegram.messenger.u10) this.f47928c;
                if (i3 == 1) {
                    u10Var.a(null);
                    return;
                } else if (i3 != 3) {
                    u10Var2.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f47926a) {
            case 0:
                ra1.b0((ra1) this.f47927b, (byte[]) this.f47928c);
                return;
            case 1:
                zb1 zb1Var = (zb1) this.f47927b;
                ((boolean[]) this.f47928c)[0] = true;
                zb1Var.f52637q0 = 17;
                Intent intent = new Intent(zb1Var.f52607b, VoIPService.class);
                intent.putExtra("user_id", zb1Var.d.f27150id);
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", false);
                intent.putExtra("video_call", false);
                intent.putExtra("can_video_call", false);
                intent.putExtra("account", zb1Var.f52604a);
                try {
                    zb1Var.f52607b.startService(intent);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 3:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) this.f47927b;
                n8Var.getClass();
                s1Var.dismiss();
                org.telegram.ui.Wallet.e8 e8Var = new org.telegram.ui.Wallet.e8();
                e8Var.f42485r = !((Boolean) this.f47928c).booleanValue();
                n8Var.presentFragment(e8Var);
                return;
            case 4:
                ((Runnable) this.f47927b).run();
                ((org.telegram.ui.ActionBar.t2) this.f47928c).dismiss();
                return;
            case 5:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f47928c;
                sf.b h = s1Var.h(i3, true, true);
                h.d();
                org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8((org.telegram.ui.Wallet.n8) this.f47927b, h, 1);
                org.telegram.ui.Wallet.k0.H("disableBackupWithoutUpdatingPhrase");
                k0Var.m0(new g2.p0((Object) k0Var, (Object) new e51(1, k0Var, j8Var), true, false, 4));
                return;
            case 7:
                org.telegram.ui.web.n.d0((org.telegram.ui.web.n) this.f47927b, (HashSet) this.f47928c);
                return;
            case 8:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.f47927b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = org.telegram.messenger.hp.s1(w0Var.N).q1(w0Var.V);
                ConnectionsManager.getInstance(w0Var.N).sendRequest(allowsendmessage, new ai.r6(w0Var, (String[]) this.f47928c, s1Var, 21));
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.f47927b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f47928c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 10:
                sf.c.q((Context) this.f47927b, Uri.parse((String) this.f47928c), true, false);
                return;
            case 18:
                vg.i0 i0Var = (vg.i0) this.f47927b;
                ArrayList arrayList = (ArrayList) this.f47928c;
                i0Var.dismiss();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = org.telegram.messenger.hp.i1((TLRPC.Chat) arrayList.get(i10));
                    tL_channels_updateUsername.username = "";
                    ConnectionsManager.getInstance(i0Var.f28583a).sendRequest(tL_channels_updateUsername, new vg.u(i0Var, 1), 64);
                }
                return;
            case 22:
                ((AtomicBoolean) this.f47927b).set(true);
                ((xg.r0) this.f47928c).run();
                return;
            default:
                ((xg.v) this.f47927b).a((TLRPC.TL_premiumGiftCodeOption) this.f47928c);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((za.f) this.f47927b).a((Intent) this.f47928c);
    }

    @Override
    public void onFailure(Exception exc) {
        ug.n1 n1Var = (ug.n1) this.f47927b;
        Bitmap bitmap = (Bitmap) this.f47928c;
        n1Var.C0 = false;
        org.telegram.messenger.a8.g(exc, true);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ib.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n1Var.isAttachedToWindow()) {
            org.telegram.messenger.g0.i3(new u9.a(3, n1Var, bitmap), 2000L);
        } else {
            n1Var.D0 = true;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        org.telegram.messenger.a8.b("wear-auth: /token delivered to " + ((String) ((b8.ke) this.f47927b).d));
        ((gi.d) this.f47928c).setLoading(false);
        qc1.d = null;
        org.telegram.ui.ActionBar.t2 t2Var = qc1.f48862c;
        if (t2Var != null) {
            t2Var.dismiss();
            qc1.f48862c = null;
        }
    }

    @Override
    public Object then(Task task) {
        za.g gVar = (za.g) this.f47927b;
        String str = (String) this.f47928c;
        synchronized (gVar) {
            ((a0.f) gVar.f60294b).remove(str);
        }
        return task;
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        switch (this.f47926a) {
            case 26:
                xg.g0 g0Var = (xg.g0) this.f47927b;
                String str = (String) this.f47928c;
                long j10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j10 = ((org.telegram.messenger.pr) arrayList.get(i11)).f24797a;
                    g0Var.f36105p1.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                uwVar.finishFragment();
                xg.j.h(j10);
                return true;
            default:
                yg.e eVar = (yg.e) this.f47927b;
                String str2 = (String) this.f47928c;
                long j11 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j11 = ((org.telegram.messenger.pr) arrayList.get(i12)).f24797a;
                    eVar.f59444e.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                uwVar.finishFragment();
                xg.j.h(j11);
                return true;
        }
    }
}
