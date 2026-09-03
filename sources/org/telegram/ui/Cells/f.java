package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.qc;
public final class f implements Runnable {
    public final j f22788a;

    public f(j jVar) {
        this.f22788a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f22788a;
        h90 h90Var = jVar.f22999w;
        if (h90Var != null) {
            CharacterStyle characterStyle = h90Var.f27423i;
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
            final StaticLayout staticLayout = jVar.f23001y;
            final float f10 = jVar.f23000x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f22999w.f27423i;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(jVar.getContext(), null, false, false);
                h3Var.fixNavigationBar();
                h3Var.title = str;
                h3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f22788a;
                        org.telegram.ui.ActionBar.p2 p2Var = jVar2.E;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    l.d.v(R.string.UsernameCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    l.d.v(R.string.LinkCopied, qc.a0(p2Var), R.raw.copy, 36);
                                } else {
                                    l.d.v(R.string.HashtagCopied, qc.a0(p2Var), R.raw.copy, 36);
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
                        f.this.f22788a.e();
                    }
                });
                h3Var.show();
            }
            jVar.f22999w = null;
        }
    }
}
