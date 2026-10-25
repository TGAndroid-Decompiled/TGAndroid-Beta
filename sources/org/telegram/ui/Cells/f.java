package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x61;
public final class f implements Runnable {
    public final j f24049a;

    public f(j jVar) {
        this.f24049a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f24049a;
        aa0 aa0Var = jVar.f24270w;
        if (aa0Var != null) {
            CharacterStyle characterStyle = aa0Var.f26445i;
            if (characterStyle instanceof x61) {
                obj = ((x61) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f24272y;
            final float f7 = jVar.f24271x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f24270w.f26445i;
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, jVar.getContext(), (org.telegram.ui.ActionBar.u6) null, false);
                k3Var.fixNavigationBar();
                k3Var.title = str;
                k3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f24049a;
                        org.telegram.ui.ActionBar.r2 r2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.t.q(R.string.UsernameCopied, wc.b0(r2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.t.q(R.string.LinkCopied, wc.b0(r2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.t.q(R.string.HashtagCopied, wc.b0(r2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                k3Var.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                k3Var.onClickListener = onClickListener;
                k3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.f24049a.e();
                    }
                });
                k3Var.show();
            }
            jVar.f24270w = null;
        }
    }
}
