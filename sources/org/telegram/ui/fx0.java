package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fx0 extends ClickableSpan {
    public final String f37034a;
    public final gx0 f37035b;

    public fx0(gx0 gx0Var, String str) {
        this.f37035b = gx0Var;
        this.f37034a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.ic b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f37034a));
        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this.f37035b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.g6 resourceProvider = this.f37035b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.ic();
        } else {
            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), resourceProvider);
            qbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            qbVar.f30359b.setText(string);
            b10 = a02.b(qbVar, 1500);
        }
        b10.j();
    }
}
