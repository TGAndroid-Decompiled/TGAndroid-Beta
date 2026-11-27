package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
public final class WidgetConformanceActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        super.onCreate(bundle);
        boolean z = f11.a;
        finish();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("clearHeights", false)) {
            if (intent.getStringExtra("profile") == null) {
                return;
            }
            long longExtra = intent.getLongExtra("bot", 0L);
            String stringExtra = intent.getStringExtra("botUsername");
            if (longExtra == 0 && stringExtra != null) {
                uc7.s1(yac.t0).c2(stringExtra);
            }
            boolean z = f11.a;
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o()) {
                kf7 a0 = kf7.a0(i);
                a0.a.c(new hd7(a0, (byte) 4));
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
    }
}
