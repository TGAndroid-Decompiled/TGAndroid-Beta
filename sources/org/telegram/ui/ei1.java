package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
public final class ei1 extends LinearLayout {
    public final ii1 f36511a;

    public ei1(ii1 ii1Var, Activity activity) {
        super(activity);
        this.f36511a = ii1Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.f36511a.B.getText();
        if (sharedState != null && !TextUtils.isEmpty(text)) {
            StringBuilder sb = new StringBuilder(text);
            sb.append(", ");
            if (sharedState.getPrivateCall() != null && sharedState.getPrivateCall().video) {
                sb.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
            } else {
                sb.append(LocaleController.getString(R.string.VoipInCallBranding));
            }
            long callDuration = sharedState.getCallDuration();
            if (callDuration > 0) {
                sb.append(", ");
                sb.append(LocaleController.formatDuration((int) (callDuration / 1000)));
            }
            accessibilityNodeInfo.setText(sb);
        }
    }
}
