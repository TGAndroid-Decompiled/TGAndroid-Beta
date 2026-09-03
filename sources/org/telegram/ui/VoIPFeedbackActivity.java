package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
public class VoIPFeedbackActivity extends Activity {
    @Override
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        getWindow().addFlags(524288);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new View(this));
        org.telegram.ui.Components.voip.g2.k(this, new sz0(this, 20), getIntent().getBooleanExtra("call_video", false), getIntent().getLongExtra("call_id", 0L), getIntent().getLongExtra("call_access_hash", 0L), getIntent().getIntExtra("account", 0), false);
    }
}
