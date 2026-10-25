package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jx0 extends ClickableSpan {
    public final String f40758a;
    public final kx0 f40759b;

    public jx0(kx0 kx0Var, String str) {
        this.f40759b = kx0Var;
        this.f40758a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f40758a));
        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this.f40759b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.u6 resourceProvider = this.f40759b.d.getResourceProvider();
        b02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.qc();
        } else {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.f34998b.setText(string);
            b10 = b02.b(ybVar, 1500);
        }
        b10.j();
    }
}
