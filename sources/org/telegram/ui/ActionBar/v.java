package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

public final class v implements Runnable {

    public final int f23848a = 1;

    public final boolean f23849b;

    public final Object f23850c;
    public final Object d;

    public final Object f23851e;

    public v(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f23850c = intent;
        this.d = context;
        this.f23849b = z10;
        this.f23851e = pendingResult;
    }

    @Override
    public final void run() {
        switch (this.f23848a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f23851e;
                if (actionBarLayout.f22655e != this) {
                    return;
                }
                actionBarLayout.f22655e = null;
                n2 n2Var = (n2) this.f23850c;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                ((n2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.f23849b);
                return;
            default:
                Intent intent = (Intent) this.f23850c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f23851e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int iB = intent2 != null ? FirebaseInstanceIdReceiver.b(intent2) : FirebaseInstanceIdReceiver.a(context, intent);
                    if (this.f23849b) {
                        pendingResult.setResultCode(iB);
                        break;
                    }
                    return;
                } finally {
                    pendingResult.finish();
                }
        }
    }

    public v(ActionBarLayout actionBarLayout, n2 n2Var, n2 n2Var2, boolean z10) {
        this.f23851e = actionBarLayout;
        this.f23850c = n2Var;
        this.d = n2Var2;
        this.f23849b = z10;
    }
}
