package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c70 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.k3[] f27082a;
    public final TLRPC.TL_chatInviteImporter f27083b;

    public c70(org.telegram.ui.ActionBar.k3[] k3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f27082a = k3VarArr;
        this.f27083b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f27082a[0].dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.t4(this.f27083b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
