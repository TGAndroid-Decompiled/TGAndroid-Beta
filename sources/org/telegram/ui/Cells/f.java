package org.telegram.ui.Cells;

import android.content.DialogInterface;
import android.text.StaticLayout;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.z80;
public final class f implements Runnable {
    public final j f24303a;

    public f(j jVar) {
        this.f24303a = jVar;
    }

    @Override
    public final void run() {
        String obj;
        j jVar = this.f24303a;
        z80 z80Var = jVar.f24525w;
        if (z80Var != null) {
            CharacterStyle characterStyle = z80Var.f35285i;
            if (characterStyle instanceof a51) {
                obj = ((a51) characterStyle).getURL();
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
            final StaticLayout staticLayout = jVar.f24527y;
            final float f9 = jVar.f24526x;
            if (jVar.getContext() != null) {
                final ClickableSpan clickableSpan = (ClickableSpan) jVar.f24525w.f35285i;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(jVar.getContext(), null, false, false);
                f3Var.fixNavigationBar();
                f3Var.title = str;
                f3Var.bigTitle = false;
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j jVar2 = f.this.f24303a;
                        org.telegram.ui.ActionBar.o2 o2Var = jVar2.D;
                        if (i10 == 0) {
                            jVar2.d(clickableSpan, staticLayout, f9);
                        } else if (i10 == 1) {
                            String str2 = str;
                            AndroidUtilities.addToClipboard(str2);
                            if (AndroidUtilities.shouldShowClipboardToast()) {
                                if (str2.startsWith("@")) {
                                    j7.l1.v(R.string.UsernameCopied, tc.a0(o2Var), R.raw.copy, 36);
                                } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                    j7.l1.v(R.string.LinkCopied, tc.a0(o2Var), R.raw.copy, 36);
                                } else {
                                    j7.l1.v(R.string.HashtagCopied, tc.a0(o2Var), R.raw.copy, 36);
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
                        f.this.f24303a.e();
                    }
                });
                f3Var.show();
            }
            jVar.f24525w = null;
        }
    }
}
