package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class z60 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f33162a;
    public final TLRPC.TL_chatInviteImporter f33163b;

    public z60(org.telegram.ui.ActionBar.h3[] h3VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f33162a = h3VarArr;
        this.f33163b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f33162a[0].dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(ProfileActivity.o4(this.f33163b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
