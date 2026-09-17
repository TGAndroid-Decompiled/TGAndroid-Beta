package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.vc;
public final class f implements Runnable {
    public final j f20068a;

    public f(j jVar) {
        this.f20068a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f20068a;
        d90 d90Var = jVar.f20300w;
        if (d90Var != null) {
            CharacterStyle characterStyle = d90Var.f23240i;
            if (characterStyle instanceof n51) {
                obj = ((n51) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f20302y;
            final float f7 = jVar.f20301x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f20300w.f23240i;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(1, jVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                g3Var.fixNavigationBar();
                g3Var.title = str;
                g3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f20068a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.H;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f7);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    org.telegram.messenger.w1.o(R.string.UsernameCopied, vc.a0(o2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    org.telegram.messenger.w1.o(R.string.LinkCopied, vc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    org.telegram.messenger.w1.o(R.string.HashtagCopied, vc.a0(o2Var), R.raw.copy, 36);
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
                        f.this.f20068a.e();
                    }
                });
                g3Var.show();
            }
            jVar.f20300w = null;
        }
    }
}
