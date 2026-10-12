package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dy0 extends ClickableSpan {
    public final String f35403a;
    public final ey0 f35404b;

    public dy0(ey0 ey0Var, String str) {
        this.f35404b = ey0Var;
        this.f35403a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.sc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f35403a));
        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(this.f35404b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.c6 resourceProvider = this.f35404b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.sc();
        } else {
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(a02.W(), resourceProvider);
            acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            acVar.f23513b.setText(string);
            b10 = a02.b(acVar, 1500);
        }
        b10.j();
    }
}
