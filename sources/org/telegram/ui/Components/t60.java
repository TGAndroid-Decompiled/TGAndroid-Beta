package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class t60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f28477a;
    public final TLRPC.TL_chatInviteImporter f28478b;

    public t60(org.telegram.ui.ActionBar.e3[] e3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f28477a = e3VarArr;
        this.f28478b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f28477a[0].dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f28478b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
