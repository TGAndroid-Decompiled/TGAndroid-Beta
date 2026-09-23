package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class h60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f24526a;
    public final TLRPC.TL_chatInviteImporter f24527b;

    public h60(org.telegram.ui.ActionBar.f3[] f3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f24526a = f3VarArr;
        this.f24527b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f24526a[0].dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f24527b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
