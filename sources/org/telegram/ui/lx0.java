package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lx0 extends ClickableSpan {
    public final String f41274a;
    public final mx0 f41275b;

    public lx0(mx0 mx0Var, String str) {
        this.f41275b = mx0Var;
        this.f41274a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f41274a));
        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this.f41275b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.u6 resourceProvider = this.f41275b.d.getResourceProvider();
        b02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.qc();
        } else {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.f35028b.setText(string);
            b10 = b02.b(ybVar, 1500);
        }
        b10.j();
    }
}
