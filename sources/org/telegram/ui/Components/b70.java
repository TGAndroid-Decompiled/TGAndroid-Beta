package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class b70 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f24968a;
    public final TLRPC.TL_chatInviteImporter f24969b;

    public b70(org.telegram.ui.ActionBar.h3[] h3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f24968a = h3VarArr;
        this.f24969b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f24968a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.o4(this.f24969b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
