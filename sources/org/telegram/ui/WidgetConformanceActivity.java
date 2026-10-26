package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
public final class WidgetConformanceActivity extends Activity {
    public TextView f37603a;
    public ScrollView f37604b;
    public Thread f37605c;

    public static boolean a(Intent intent) {
        if (!intent.getBooleanExtra("clearHeights", false)) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                MessagesStorage.getInstance(i10).clearWidgetHeights();
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
        return true;
    }

    public final void b(Intent intent) {
        String str;
        WidgetConformanceActivity widgetConformanceActivity;
        vh1 vh1Var;
        if (this.f37604b == null) {
            this.f37603a.setTypeface(Typeface.MONOSPACE);
            this.f37603a.setTextSize(11.0f);
            int dp = AndroidUtilities.dp(12.0f);
            this.f37603a.setPadding(dp, dp, dp, dp);
            ScrollView scrollView = new ScrollView(this);
            this.f37604b = scrollView;
            scrollView.addView(this.f37603a);
            setContentView(this.f37604b);
        }
        int intExtra = intent.getIntExtra("width", 390);
        String str2 = "dark";
        boolean booleanExtra = intent.getBooleanExtra("dark", false);
        String stringExtra = intent.getStringExtra("filter");
        String str3 = "attacks";
        boolean booleanExtra2 = intent.getBooleanExtra("attacks", false);
        TextView textView = this.f37603a;
        StringBuilder sb2 = new StringBuilder();
        if (!booleanExtra2) {
            StringBuilder k10 = ic.a.k(intExtra, "conformance · width ", " · ");
            if (!booleanExtra) {
                str2 = "light";
            }
            k10.append(str2);
            str3 = k10.toString();
        }
        sb2.append(str3);
        if (stringExtra != null) {
            str = " · ".concat(stringExtra);
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\n");
        textView.setText(sb2.toString());
        hl0 hl0Var = new hl0(this, 27);
        if (booleanExtra2) {
            vh1Var = new vh1(new org.telegram.ui.Components.qa1(this, stringExtra, hl0Var), 1);
            widgetConformanceActivity = this;
        } else {
            widgetConformanceActivity = this;
            vh1Var = new vh1(new org.telegram.ui.Components.za1(widgetConformanceActivity, intExtra, booleanExtra, stringExtra, hl0Var), 2);
        }
        Thread thread = new Thread(vh1Var, "WidgetConformance");
        widgetConformanceActivity.f37605c = thread;
        thread.start();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        super.onCreate(bundle);
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            finish();
        } else if (a(getIntent())) {
            finish();
        } else {
            this.f37603a = new TextView(this);
            b(getIntent());
        }
    }

    @Override
    public final void onDestroy() {
        Thread thread = this.f37605c;
        if (thread != null) {
            thread.interrupt();
        }
        super.onDestroy();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!a(intent) && this.f37603a != null) {
            Thread thread = this.f37605c;
            if (thread == null || !thread.isAlive()) {
                b(intent);
            }
        }
    }
}
