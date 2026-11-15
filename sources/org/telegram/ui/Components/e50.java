package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class e50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.u2[] f34188a;
    public final TLRPC.TL_chatInviteImporter f34189b;

    public e50(org.telegram.ui.ActionBar.u2[] u2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f34188a = u2VarArr;
        this.f34189b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f34188a[0].dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.C4(this.f34189b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
