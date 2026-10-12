package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.zc;
public final class f implements Runnable {
    public final j f21820a;

    public f(j jVar) {
        this.f21820a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f21820a;
        ja0 ja0Var = jVar.f22074w;
        if (ja0Var != null) {
            CharacterStyle characterStyle = ja0Var.f27429i;
            if (characterStyle instanceof y61) {
                obj = ((y61) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f22076y;
            final float f7 = jVar.f22075x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f22074w.f27429i;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, jVar.getContext(), (org.telegram.ui.ActionBar.c6) null, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f21820a;
                        org.telegram.ui.ActionBar.m2 m2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.v0.q(R.string.UsernameCopied, zc.a0(m2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.v0.q(R.string.LinkCopied, zc.a0(m2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.v0.q(R.string.HashtagCopied, zc.a0(m2Var), R.raw.copy, 36);
                                }
                            }
                        }
                    }
                };
                e3Var.items = new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
                e3Var.onClickListener = onClickListener;
                e3Var.setOnHideListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        f.this.f21820a.e();
                    }
                });
                e3Var.show();
            }
            jVar.f22074w = null;
        }
    }
}
