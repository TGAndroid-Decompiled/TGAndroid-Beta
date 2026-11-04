package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class x40 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.t2[] f40223a;
    public final TLRPC.TL_chatInviteImporter f40224b;

    public x40(org.telegram.ui.ActionBar.t2[] t2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f40223a = t2VarArr;
        this.f40224b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f40223a[0].dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.A4(this.f40224b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
