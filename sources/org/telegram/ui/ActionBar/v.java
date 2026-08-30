package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
public final class v implements Runnable {
    public final int f20603a = 1;
    public final boolean f20604b;
    public final Object f20605c;
    public final Object d;
    public final Object e;

    public v(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z4, BroadcastReceiver.PendingResult pendingResult) {
        this.f20605c = intent;
        this.d = context;
        this.f20604b = z4;
        this.e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f20603a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    p2 p2Var = (p2) this.f20605c;
                    if (p2Var != null) {
                        p2Var.onTransitionAnimationStart(false, false);
                    }
                    ((p2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f20604b);
                    return;
                }
                return;
            default:
                Intent intent2 = (Intent) this.f20605c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
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
                    if (this.f20604b) {
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

    public v(ActionBarLayout actionBarLayout, p2 p2Var, p2 p2Var2, boolean z4) {
        this.e = actionBarLayout;
        this.f20605c = p2Var;
        this.d = p2Var2;
        this.f20604b = z4;
    }
}
