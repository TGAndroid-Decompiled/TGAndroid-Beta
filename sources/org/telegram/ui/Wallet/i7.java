package org.telegram.ui.Wallet;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.n10;
public final class i7 implements Callable {
    public final int f42655a;
    public final Object f42656b;
    public final Object f42657c;
    public final Object d;
    public final Object f42658e;
    public final Object f42659f;
    public final Object f42660g;

    public i7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.f42655a = i3;
        this.f42656b = obj;
        this.f42657c = obj2;
        this.d = obj3;
        this.f42658e = obj4;
        this.f42659f = obj5;
        this.f42660g = obj6;
    }

    @Override
    public final Object call() {
        Void lambda$emulateSendNFT$20;
        za.t tVar;
        switch (this.f42655a) {
            case 0:
                lambda$emulateSendNFT$20 = ((WalletEngine2) this.f42656b).lambda$emulateSendNFT$20((AtomicBoolean) this.f42657c, (String) this.d, (String) this.f42658e, (String) this.f42659f, (n10) this.f42660g);
                return lambda$emulateSendNFT$20;
            default:
                Context context = (Context) this.f42656b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f42657c;
                org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
                n9.h hVar = (n9.h) this.f42658e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f42659f;
                ua.e eVar = (ua.e) this.f42660g;
                synchronized (za.t.class) {
                    try {
                        WeakReference weakReference = za.t.d;
                        if (weakReference != null) {
                            tVar = (za.t) weakReference.get();
                        } else {
                            tVar = null;
                        }
                        if (tVar == null) {
                            za.t tVar2 = new za.t(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            tVar2.b();
                            za.t.d = new WeakReference(tVar2);
                            tVar = tVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new za.u(h4Var, tVar, new z7.q0(hVar, firebaseMessaging, eVar), context, scheduledThreadPoolExecutor);
        }
    }
}
