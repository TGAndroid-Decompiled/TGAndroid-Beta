package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
public final class WidgetConformanceActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.w0.w();
        super.onCreate(bundle);
        boolean z10 = org.telegram.messenger.v2.f18578a;
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
        for (int i10 = 0; i10 < 4; i10++) {
            if (org.telegram.messenger.e20.i(i10).p()) {
                org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i10);
                a02.f16331a.c(new org.telegram.messenger.cr(a02, 1));
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
    }
}
