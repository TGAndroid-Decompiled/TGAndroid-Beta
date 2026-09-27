package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.xc;
public final class f implements Runnable {
    public final j f20274a;

    public f(j jVar) {
        this.f20274a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f20274a;
        q90 q90Var = jVar.f20486w;
        if (q90Var != null) {
            CharacterStyle characterStyle = q90Var.f27627i;
            if (characterStyle instanceof b61) {
                obj = ((b61) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f20488y;
            final float f7 = jVar.f20487x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f20486w.f27627i;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, jVar.getContext(), (org.telegram.ui.ActionBar.e6) null, false);
                g3Var.fixNavigationBar();
                g3Var.title = str;
                g3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f20274a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.l0.o(R.string.UsernameCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.l0.o(R.string.LinkCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.l0.o(R.string.HashtagCopied, xc.a0(o2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                g3Var.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                g3Var.onClickListener = onClickListener;
                g3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.f20274a.e();
                    }
                });
                g3Var.show();
            }
            jVar.f20486w = null;
        }
    }
}
