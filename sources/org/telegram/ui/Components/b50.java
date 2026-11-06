package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class b50 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.v2[] f32002a;
    public final TLRPC.TL_chatInviteImporter f32003b;

    public b50(org.telegram.ui.ActionBar.v2[] v2VarArr, TLRPC.TL_chatInviteImporter tL_chatInviteImporter) {
        this.f32002a = v2VarArr;
        this.f32003b = tL_chatInviteImporter;
    }

    @Override
    public final void onClick(View view) {
        this.f32002a[0].dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            T.presentFragment(ProfileActivity.A4(this.f32003b.user_id));
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
