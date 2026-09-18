package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class g60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f24098a;
    public final TLRPC.TL_chatInviteImporter f24099b;

    public g60(org.telegram.ui.ActionBar.g3[] g3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f24098a = g3VarArr;
        this.f24099b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f24098a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.m4(this.f24099b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
