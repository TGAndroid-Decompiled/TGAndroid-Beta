package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class r50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.z2[] f29835a;
    public final TLRPC.TL_chatInviteImporter f29836b;

    public r50(org.telegram.ui.ActionBar.z2[] z2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f29835a = z2VarArr;
        this.f29836b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f29835a[0].dismiss();
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.z4(this.f29836b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
