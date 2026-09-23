package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.xc;
public final class f implements Runnable {
    public final j f20021a;

    public f(j jVar) {
        this.f20021a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f20021a;
        e90 e90Var = jVar.f20259w;
        if (e90Var != null) {
            CharacterStyle characterStyle = e90Var.f23625i;
            if (characterStyle instanceof l51) {
                obj = ((l51) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f20261y;
            final float f7 = jVar.f20260x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f20259w.f23625i;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, jVar.getContext(), (org.telegram.ui.ActionBar.d6) null, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f20021a;
                        org.telegram.ui.ActionBar.n2 n2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.z0.o(R.string.UsernameCopied, xc.a0(n2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.z0.o(R.string.LinkCopied, xc.a0(n2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.z0.o(R.string.HashtagCopied, xc.a0(n2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                f3Var.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                f3Var.onClickListener = onClickListener;
                f3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.f20021a.e();
                    }
                });
                f3Var.show();
            }
            jVar.f20259w = null;
        }
    }
}
