package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kx0 extends ClickableSpan {
    public final String f35601a;
    public final lx0 f35602b;

    public kx0(lx0 lx0Var, String str) {
        this.f35602b = lx0Var;
        this.f35601a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ic b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f35601a));
        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this.f35602b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.f6 resourceProvider = this.f35602b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.ic();
        } else {
            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), resourceProvider);
            qbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            qbVar.f28137b.setText(string);
            b10 = a02.b(qbVar, 1500);
        }
        b10.j();
    }
}
