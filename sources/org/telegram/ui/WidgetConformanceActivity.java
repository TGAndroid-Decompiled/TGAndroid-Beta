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
    public TextView f37627a;
    public ScrollView f37628b;
    public Thread f37629c;

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
        xh1 xh1Var;
        if (this.f37628b == null) {
            this.f37627a.setTypeface(Typeface.MONOSPACE);
            this.f37627a.setTextSize(11.0f);
            int dp = AndroidUtilities.dp(12.0f);
            this.f37627a.setPadding(dp, dp, dp, dp);
            ScrollView scrollView = new ScrollView(this);
            this.f37628b = scrollView;
            scrollView.addView(this.f37627a);
            setContentView(this.f37628b);
        }
        int intExtra = intent.getIntExtra("width", 390);
        String str2 = "dark";
        boolean booleanExtra = intent.getBooleanExtra("dark", false);
        String stringExtra = intent.getStringExtra("filter");
        String str3 = "attacks";
        boolean booleanExtra2 = intent.getBooleanExtra("attacks", false);
        TextView textView = this.f37627a;
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
        jl0 jl0Var = new jl0(this, 27);
        if (booleanExtra2) {
            xh1Var = new xh1(new org.telegram.ui.Components.ra1(this, stringExtra, jl0Var), 1);
            widgetConformanceActivity = this;
        } else {
            widgetConformanceActivity = this;
            xh1Var = new xh1(new org.telegram.ui.Components.ab1(widgetConformanceActivity, intExtra, booleanExtra, stringExtra, jl0Var), 2);
        }
        Thread thread = new Thread(xh1Var, "WidgetConformance");
        widgetConformanceActivity.f37629c = thread;
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
            this.f37627a = new TextView(this);
            b(getIntent());
        }
    }

    @Override
    public final void onDestroy() {
        Thread thread = this.f37629c;
        if (thread != null) {
            thread.interrupt();
        }
        super.onDestroy();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!a(intent) && this.f37627a != null) {
            Thread thread = this.f37629c;
            if (thread == null || !thread.isAlive()) {
                b(intent);
            }
        }
    }
}
