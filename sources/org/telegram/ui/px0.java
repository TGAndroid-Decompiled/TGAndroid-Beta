package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class px0 extends ClickableSpan {
    public final String f36792a;
    public final qx0 f36793b;

    public px0(qx0 qx0Var, String str) {
        this.f36793b = qx0Var;
        this.f36792a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.rc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f36792a));
        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this.f36793b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.f36793b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.rc();
        } else {
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(a02.W(), resourceProvider);
            zbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            zbVar.f30942b.setText(string);
            b10 = a02.b(zbVar, 1500);
        }
        b10.j();
    }
}
