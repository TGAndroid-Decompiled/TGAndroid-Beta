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
    public final String f36693a;
    public final qx0 f36694b;

    public px0(qx0 qx0Var, String str) {
        this.f36694b = qx0Var;
        this.f36693a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f36693a));
        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this.f36694b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.f36694b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.qc();
        } else {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.f30583b.setText(string);
            b10 = a02.b(ybVar, 1500);
        }
        b10.j();
    }
}
