package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
public final class w implements Runnable {
    public final int f23909a = 1;
    public final boolean f23910b;
    public final Object f23911c;
    public final Object d;
    public final Object f23912e;

    public w(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f23911c = intent;
        this.d = context;
        this.f23910b = z10;
        this.f23912e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f23909a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23912e;
                if (actionBarLayout.f22667e == this) {
                    actionBarLayout.f22667e = null;
                    o2 o2Var = (o2) this.f23911c;
                    if (o2Var != null) {
                        o2Var.onTransitionAnimationStart(false, false);
                    }
                    ((o2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f23910b);
                    return;
                }
                return;
            default:
                Intent intent2 = (Intent) this.f23911c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f23912e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        a2 = FirebaseInstanceIdReceiver.b(intent);
                    } else {
                        a2 = FirebaseInstanceIdReceiver.a(context, intent2);
                    }
                    if (this.f23910b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
        }
    }

    public w(ActionBarLayout actionBarLayout, o2 o2Var, o2 o2Var2, boolean z10) {
        this.f23912e = actionBarLayout;
        this.f23911c = o2Var;
        this.d = o2Var2;
        this.f23910b = z10;
    }
}
