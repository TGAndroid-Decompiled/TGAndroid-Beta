package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z51;
public final class f implements Runnable {
    public final j f19103a;

    public f(j jVar) {
        this.f19103a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f19103a;
        n90 n90Var = jVar.f19332w;
        if (n90Var != null) {
            CharacterStyle characterStyle = n90Var.f25465i;
            if (characterStyle instanceof z51) {
                obj = ((z51) characterStyle).getURL();
            } else if (characterStyle instanceof URLSpan) {
                obj = ((URLSpan) characterStyle).getURL();
            } else {
                obj = characterStyle.toString();
            }
            final String str = obj;
            try {
                jVar.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
            final StaticLayout staticLayout = jVar.f19334y;
            final float f7 = jVar.f19333x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f19332w.f25465i;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, jVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                h3Var.fixNavigationBar();
                h3Var.title = str;
                h3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f19103a;
                        org.telegram.ui.ActionBar.p2 p2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.a2.o(R.string.UsernameCopied, wc.a0(p2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.a2.o(R.string.LinkCopied, wc.a0(p2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.a2.o(R.string.HashtagCopied, wc.a0(p2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                h3Var.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                h3Var.onClickListener = onClickListener;
                h3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.f19103a.e();
                    }
                });
                h3Var.show();
            }
            jVar.f19332w = null;
        }
    }
}
