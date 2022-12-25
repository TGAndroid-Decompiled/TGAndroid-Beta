package org.telegram.p009ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.p009ui.Components.voip.VoIPHelper;

public class VoIPFeedbackActivity extends Activity {
    @Override
    protected void onCreate(Bundle bundle) {
        getWindow().addFlags(524288);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new View(this));
        VoIPHelper.showRateAlert(this, new Runnable() {
            @Override
            public final void run() {
                VoIPFeedbackActivity.this.finish();
            }
        }, getIntent().getBooleanExtra("call_video", false), getIntent().getLongExtra("call_id", 0L), getIntent().getLongExtra("call_access_hash", 0L), getIntent().getIntExtra("account", 0), false);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
