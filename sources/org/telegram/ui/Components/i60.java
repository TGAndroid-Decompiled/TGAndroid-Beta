package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class i60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f25601a;
    public final TLRPC.TL_chatInviteImporter f25602b;

    public i60(org.telegram.ui.ActionBar.g3[] g3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f25601a = g3VarArr;
        this.f25602b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f25601a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f25602b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
