package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ex0 extends ClickableSpan {
    public final String f37009a;
    public final fx0 f37010b;

    public ex0(fx0 fx0Var, String str) {
        this.f37010b = fx0Var;
        this.f37009a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.oc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f37009a));
        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this.f37010b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.g6 resourceProvider = this.f37010b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.oc();
        } else {
            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), resourceProvider);
            wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            wbVar.f32176b.setText(string);
            b10 = a02.b(wbVar, 1500);
        }
        b10.j();
    }
}
