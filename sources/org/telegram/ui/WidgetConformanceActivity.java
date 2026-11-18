package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
public final class WidgetConformanceActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        super.onCreate(bundle);
        boolean z10 = org.telegram.messenger.s2.f26723a;
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
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.j10.i(i7).p()) {
                org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                a02.f27054a.c(new org.telegram.messenger.pq(a02, 1));
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
    }
}
