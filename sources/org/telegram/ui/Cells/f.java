package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.qc;
public final class f implements Runnable {
    public final j f21012a;

    public f(j jVar) {
        this.f21012a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f21012a;
        g90 g90Var = jVar.f21206w;
        if (g90Var != null) {
            CharacterStyle characterStyle = g90Var.f25098i;
            if (characterStyle instanceof m51) {
                obj = ((m51) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f21208y;
            final float f10 = jVar.f21207x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f21206w.f25098i;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(jVar.getContext(), null, false, false);
                g3Var.fixNavigationBar();
                g3Var.title = str;
                g3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f21012a;
                        org.telegram.ui.ActionBar.p2 p2Var = jVar2.E;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    kf.k0.v(R.string.UsernameCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    kf.k0.v(R.string.LinkCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else {
                                    kf.k0.v(R.string.HashtagCopied, qc.a0(p2Var), R.raw.copy, 36);
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
                        f.this.f21012a.e();
                    }
                });
                g3Var.show();
            }
            jVar.f21206w = null;
        }
    }
}
