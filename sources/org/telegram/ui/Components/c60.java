package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class c60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f27349a;
    public final TLRPC.TL_chatInviteImporter f27350b;

    public c60(org.telegram.ui.ActionBar.f3[] f3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f27349a = f3VarArr;
        this.f27350b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f27349a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f27350b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
