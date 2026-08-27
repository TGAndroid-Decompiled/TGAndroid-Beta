package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r41;

public final class f implements Runnable {

    public final j f24324a;

    public f(j jVar) {
        this.f24324a = jVar;
    }

    @Override
    public final void run() {
        String url;
        j jVar = this.f24324a;
        q80 q80Var = jVar.f24512w;
        if (q80Var != null) {
            CharacterStyle characterStyle = q80Var.f31841i;
            if (characterStyle instanceof r41) {
                url = ((r41) characterStyle).getURL();
            } else {
                url = characterStyle instanceof URLSpan ? ((URLSpan) characterStyle).getURL() : characterStyle.toString();
            }
            final String str = url;
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.f24514y;
            final float f10 = jVar.f24513x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f24512w.f31841i;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(jVar.getContext(), null, false, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = this.f24175a.f24324a;
                        org.telegram.ui.ActionBar.n2 n2Var = jVar2.D;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                            return;
                        }
                        if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.y1.q(R.string.UsernameCopied, mc.a0(n2Var), R.raw.copy, 36);
                                } else if (str2.startsWith("#") || str2.startsWith("$")) {
                                    org.telegram.messenger.y1.q(R.string.HashtagCopied, mc.a0(n2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.y1.q(R.string.LinkCopied, mc.a0(n2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                e3Var.items = charSequenceArr;
                e3Var.onClickListener = onClickListener;
                e3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f24230a.f24324a.e();
                    }
                });
                e3Var.show();
            }
            jVar.f24512w = null;
        }
    }
}
