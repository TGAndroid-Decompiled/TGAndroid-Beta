package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
public final class v implements Runnable {
    public final int f22314a = 1;
    public final boolean f22315b;
    public final Object f22316c;
    public final Object d;
    public final Object f22317e;

    public v(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z4, BroadcastReceiver.PendingResult pendingResult) {
        this.f22316c = intent;
        this.d = context;
        this.f22315b = z4;
        this.f22317e = pendingResult;
    }

    @Override
    public final void run() {
        Intent intent;
        int a2;
        switch (this.f22314a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f22317e;
                if (actionBarLayout.f21119e == this) {
                    actionBarLayout.f21119e = null;
                    p2 p2Var = (p2) this.f22316c;
                    if (p2Var != null) {
                        p2Var.onTransitionAnimationStart(false, false);
                    }
                    ((p2) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.f22315b);
                    return;
                }
                return;
            default:
                Intent intent2 = (Intent) this.f22316c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f22317e;
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
                    if (this.f22315b) {
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
        this.f22317e = actionBarLayout;
        this.f22316c = p2Var;
        this.d = p2Var2;
        this.f22315b = z4;
    }
}
