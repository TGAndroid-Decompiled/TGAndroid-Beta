package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bx0 extends ClickableSpan {
    public final String f35752a;
    public final cx0 f35753b;

    public bx0(cx0 cx0Var, String str) {
        this.f35753b = cx0Var;
        this.f35752a = str;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.qc b10;
        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.f35752a));
        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this.f35753b.d);
        String string = LocaleController.getString(R.string.LinkCopied);
        org.telegram.ui.ActionBar.d6 resourceProvider = this.f35753b.d.getResourceProvider();
        a02.getClass();
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            b10 = new org.telegram.ui.Components.qc();
        } else {
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), resourceProvider);
            ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ybVar.f32624b.setText(string);
            b10 = a02.b(ybVar, 1500);
        }
        b10.j();
    }
}
