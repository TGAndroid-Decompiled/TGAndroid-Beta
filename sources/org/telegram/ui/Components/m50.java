package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f37383a;
    public final TLRPC.TL_chatInviteImporter f37384b;

    public m50(org.telegram.ui.ActionBar.w2[] w2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f37383a = w2VarArr;
        this.f37384b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f37383a[0].dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.D4(this.f37384b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
