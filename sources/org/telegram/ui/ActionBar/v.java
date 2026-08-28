package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
public final class v implements Runnable {
    public final int f23835a = 1;
    public final boolean f23836b;
    public final Object f23837c;
    public final Object d;
    public final Object f23838e;

    public v(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f23837c = intent;
        this.d = context;
        this.f23836b = z10;
        this.f23838e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f23835a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23838e;
                if (actionBarLayout.f22655e == this) {
                    actionBarLayout.f22655e = null;
                    o2 o2Var = (o2) this.f23837c;
                    if (o2Var != null) {
                        o2Var.onTransitionAnimationStart(false, false);
                    }
                    ((o2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f23836b);
                    return;
                }
                return;
            default:
                Intent intent2 = (Intent) this.f23837c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f23838e;
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
                    if (this.f23836b) {
                        pendingResult.setResultCode(a2);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th) {
                    pendingResult.finish();
                    throw th;
                }
        }
    }

    public v(ActionBarLayout actionBarLayout, o2 o2Var, o2 o2Var2, boolean z10) {
        this.f23838e = actionBarLayout;
        this.f23837c = o2Var;
        this.d = o2Var2;
        this.f23836b = z10;
    }
}
