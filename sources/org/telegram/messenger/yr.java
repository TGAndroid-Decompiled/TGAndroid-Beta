package org.telegram.messenger;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.uv0;
public final class yr implements Runnable {
    public final int f28130a;
    public final Object f28131b;

    public yr(Object obj, int i7) {
        this.f28130a = i7;
        this.f28131b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.f28130a) {
            case 0:
                try {
                    t0.f26895b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f28131b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ls.f(((zs) this.f28131b).f28338a).k(42, new Object[0]);
                return;
            case 2:
                lt ltVar = (lt) this.f28131b;
                ltVar.f25412a = true;
                int i7 = k10.f24932t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = cz.f23425z1;
                    if (i10 < arrayList.size()) {
                        bz bzVar = (bz) arrayList.get(i10);
                        if (!bzVar.f23163c && SystemClock.elapsedRealtime() - bzVar.f23164e >= 120000) {
                            bzVar.f23163c = true;
                            ConnectionsManager.getInstance(i7).checkProxy(bzVar.f23161a, new j1(bzVar, 15));
                            z11 = true;
                        }
                        i10++;
                    } else if (!z11) {
                        ltVar.f25412a = false;
                        ltVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                ot otVar = (ot) this.f28131b;
                try {
                    cz.f23376i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.f26895b);
                    ob.c cVar = FirebaseMessaging.f7551m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.v()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7559g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new fd(otVar, 13));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                vt vtVar = (vt) this.f28131b;
                fv fvVar = vtVar.f27572e;
                if (fvVar == null || !fvVar.H()) {
                    vtVar.f27577w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((cu) this.f28131b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((du) this.f28131b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m1 m1Var = ((fv) this.f28131b).F;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 8:
                ev evVar = (ev) this.f28131b;
                evVar.K = null;
                if (evVar.R != null) {
                    evVar.L = true;
                    View view3 = evVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    du duVar = evVar.R;
                    fv fvVar2 = evVar.f23733a;
                    org.telegram.ui.Cells.r1 r1Var = fvVar2.E;
                    org.telegram.ui.Cells.m1 m1Var2 = fvVar2.F;
                    TL_iv.textButton textbutton = duVar.f23579b;
                    if (r1Var != null && m1Var2 != null) {
                        m1Var2.I1(r1Var, textbutton);
                        return;
                    }
                    return;
                } else if (evVar.N != null) {
                    evVar.L = true;
                    View view4 = evVar.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    evVar.l(evVar.N, true);
                    n2.o0 o0Var = evVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                yv yvVar = (yv) this.f28131b;
                ArrayList arrayList2 = yvVar.f28187f;
                if (!arrayList2.isEmpty()) {
                    yvVar.getMessagesController().U3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((uv0) this.f28131b).a(null);
                return;
            case 11:
                g0.g3((xw) this.f28131b);
                return;
            case 12:
                az azVar = (az) this.f28131b;
                azVar.getNotificationCenter().b(azVar, 138);
                azVar.getNotificationCenter().b(azVar, 140);
                azVar.getNotificationCenter().b(azVar, 139);
                azVar.getNotificationCenter().b(azVar, 144);
                azVar.getNotificationCenter().b(azVar, 145);
                azVar.getNotificationCenter().b(azVar, 146);
                azVar.getNotificationCenter().b(azVar, 136);
                azVar.getNotificationCenter().b(azVar, 135);
                azVar.getNotificationCenter().b(azVar, 142);
                azVar.getNotificationCenter().b(azVar, 143);
                return;
            case 13:
                gj gjVar = (gj) this.f28131b;
                if (gjVar != null && (message = gjVar.f24177k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.f28131b;
                wy wyVar = (wy) b8Var.f341a;
                Location location = (Location) b8Var.f345f;
                if (location != null) {
                    wyVar.f(location);
                } else {
                    wyVar.b();
                }
                b8Var.d();
                return;
            case 15:
                rz rzVar = (rz) this.f28131b;
                android.support.v4.media.session.a0 a0Var = rzVar.f26675b;
                int i11 = k10.f24932t0;
                rzVar.f26676c = i11;
                rzVar.d = g0.b1(np.u1(i11).f25821g7, "auto_lastSelectedDialog", 0L);
                rzVar.f26677e = false;
                rzVar.f26678f = false;
                rzVar.f26679g.clear();
                rzVar.h.b();
                rzVar.f26680i.b();
                rzVar.f26681j.b();
                rzVar.f26682k.b();
                rzVar.f26683l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.f1675b).f1705a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ls.f(((qz) this.f28131b).f26496g.f26676c).k(150, 0);
                return;
            default:
                a10 a10Var = (a10) this.f28131b;
                np npVar = a10Var.f22810n;
                String string = npVar.h7.getString("translating_dialog_languages2", null);
                if (string != null) {
                    for (String str : string.split(";")) {
                        String[] split = str.split("=");
                        if (split.length >= 2) {
                            long parseLong = Long.parseLong(split[0]);
                            String[] split2 = split[1].split(">");
                            if (split2.length == 2) {
                                String str2 = split2[0];
                                String str3 = split2[1];
                                if (str3.length() > 0 && str3.charAt(str3.length() - 1) == '!') {
                                    str3 = com.google.android.gms.internal.vision.e2.k(str3, 1, 0);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ("null".equals(str2)) {
                                    str2 = null;
                                }
                                if ("null".equals(str3)) {
                                    str3 = null;
                                }
                                if (str2 != null) {
                                    a10Var.f22808e.put(Long.valueOf(parseLong), str2);
                                    if (!a10Var.w(str2)) {
                                        a10Var.f22805a.put(parseLong, Boolean.valueOf(!z10));
                                        a10Var.f22806b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        a10Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = npVar.h7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                a10Var.h.add(Long.valueOf(Long.parseLong(str4)));
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yr(az azVar, gj gjVar) {
        this.f28130a = 13;
        this.f28131b = gjVar;
    }
}
