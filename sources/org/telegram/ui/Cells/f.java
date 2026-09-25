package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z51;
public final class f implements Runnable {
    public final j f20273a;

    public f(j jVar) {
        this.f20273a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f20273a;
        o90 o90Var = jVar.f20485w;
        if (o90Var != null) {
            CharacterStyle characterStyle = o90Var.f26972i;
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
            final StaticLayout staticLayout = jVar.f20487y;
            final float f7 = jVar.f20486x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f20485w.f26972i;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, jVar.getContext(), (org.telegram.ui.ActionBar.d6) null, false);
                e3Var.fixNavigationBar();
                e3Var.title = str;
                e3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f20273a;
                        org.telegram.ui.ActionBar.m2 m2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.f0.p(R.string.UsernameCopied, xc.a0(m2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.f0.p(R.string.LinkCopied, xc.a0(m2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.f0.p(R.string.HashtagCopied, xc.a0(m2Var), R.raw.copy, 36);
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
                        f.this.f20273a.e();
                    }
                });
                e3Var.show();
            }
            jVar.f20485w = null;
        }
    }
}
