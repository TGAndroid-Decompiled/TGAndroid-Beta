package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class j60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f28021a;
    public final TLRPC.TL_chatInviteImporter f28022b;

    public j60(org.telegram.ui.ActionBar.h3[] h3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f28021a = h3VarArr;
        this.f28022b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f28021a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f28022b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
