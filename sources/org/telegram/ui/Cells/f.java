package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z90;
public final class f implements Runnable {
    public final j f22346a;

    public f(j jVar) {
        this.f22346a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f22346a;
        z90 z90Var = jVar.f22557w;
        if (z90Var != null) {
            CharacterStyle characterStyle = z90Var.f33177i;
            if (characterStyle instanceof q61) {
                obj = ((q61) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f22559y;
            final float f7 = jVar.f22558x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f22557w.f33177i;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, jVar.getContext(), (org.telegram.ui.ActionBar.g6) null, false);
                h3Var.fixNavigationBar();
                h3Var.title = str;
                h3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f22346a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.v0.p(R.string.UsernameCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.v0.p(R.string.LinkCopied, xc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.v0.p(R.string.HashtagCopied, xc.a0(o2Var), R.raw.copy, 36);
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
                        f.this.f22346a.e();
                    }
                });
                h3Var.show();
            }
            jVar.f22557w = null;
        }
    }
}
