package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p41;
public final class f implements Runnable {
    public final j f24324a;

    public f(j jVar) {
        this.f24324a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f24324a;
        m80 m80Var = jVar.f24537w;
        if (m80Var != null) {
            CharacterStyle characterStyle = m80Var.f30768i;
            if (characterStyle instanceof p41) {
                obj = ((p41) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f24539y;
            final float f10 = jVar.f24538x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f24537w.f30768i;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(jVar.getContext(), null, false, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        j jVar2 = f.this.f24324a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.D;
                        if (i9 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f10);
                        } else if (i9 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.l0.p(R.string.UsernameCopied, oc.a0(o2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.l0.p(R.string.LinkCopied, oc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.l0.p(R.string.HashtagCopied, oc.a0(o2Var), R.raw.copy, 36);
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
                        f.this.f24324a.e();
                    }
                });
                f3Var.show();
            }
            jVar.f24537w = null;
        }
    }
}
