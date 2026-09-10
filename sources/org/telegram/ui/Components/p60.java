package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class p60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f26044a;
    public final TLRPC.TL_chatInviteImporter f26045b;

    public p60(org.telegram.ui.ActionBar.h3[] h3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f26044a = h3VarArr;
        this.f26045b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f26044a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f26045b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
