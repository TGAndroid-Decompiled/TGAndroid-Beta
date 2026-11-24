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
        boolean z = w01.a;
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
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).o()) {
                ad7 Y = ad7.Y(i);
                Y.a.c(new vb7(Y, (byte) 1));
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
    }
}
