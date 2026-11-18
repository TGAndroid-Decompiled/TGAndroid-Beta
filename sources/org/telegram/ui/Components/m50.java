package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.x2[] f37368a;
    public final TLRPC.TL_chatInviteImporter f37369b;

    public m50(org.telegram.ui.ActionBar.x2[] x2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f37368a = x2VarArr;
        this.f37369b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f37368a[0].dismiss();
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.D4(this.f37369b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
