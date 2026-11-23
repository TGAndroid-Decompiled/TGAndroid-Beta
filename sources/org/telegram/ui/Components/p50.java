package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class p50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.w2[] f38506a;
    public final TLRPC.TL_chatInviteImporter f38507b;

    public p50(org.telegram.ui.ActionBar.w2[] w2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f38506a = w2VarArr;
        this.f38507b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f38506a[0].dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.D4(this.f38507b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
