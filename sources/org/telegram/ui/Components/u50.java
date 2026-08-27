package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class u50 extends ClickableSpan {

    public final org.telegram.ui.ActionBar.e3[] f32975a;

    public final TLRPC.TL_chatInviteImporter f32976b;

    public u50(org.telegram.ui.ActionBar.e3[] e3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f32975a = e3VarArr;
        this.f32976b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f32975a[0].dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            n2VarU.presentFragment(ProfileActivity.m4(this.f32976b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
