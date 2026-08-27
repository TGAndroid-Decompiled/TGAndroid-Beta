package org.telegram.ui.Cells;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b31;
import org.telegram.ui.a31;

public final class g9 implements ActionMode.Callback {

    public String f24403a = null;

    public final w9 f24404b;

    public g9(w9 w9Var) {
        this.f24404b = w9Var;
    }

    public final void a(Menu menu) {
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem menuItemFindItem = menu.findItem(3);
        if (menuItemFindItem == null) {
            return;
        }
        menuItemFindItem.setVisible((this.f24404b.f25879l0 == null || ((this.f24403a == null || a31.Y().contains(this.f24403a)) && LanguageDetector.hasSupport())) ? false : true);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence charSequenceT;
        w9 w9Var = this.f24404b;
        g gVar = w9Var.f25890r0;
        if (w9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                w9Var.g();
                return true;
            }
            if (itemId != 16908319) {
                if (itemId == 3) {
                    if (w9Var.f25879l0 != null) {
                        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                        org.telegram.ui.u uVar = w9Var.f25879l0;
                        CharSequence charSequenceS = w9Var.s();
                        String str = this.f24403a;
                        g gVar2 = new g(this, 8);
                        org.telegram.ui.m4 m4Var = uVar.f43046a;
                        b31.K(m4Var.H, m4Var.I, str, language, charSequenceS, null, gVar2);
                    }
                    w9Var.v();
                    return true;
                }
                if (itemId == R.id.menu_quote) {
                    if (w9Var.y()) {
                        r9 r9Var = w9Var.W;
                        MessageObject messageObject = r9Var instanceof s1 ? ((s1) r9Var).getMessageObject() : null;
                        if (messageObject != null && w9Var.s() != null) {
                            w9Var.J(w9Var.f25895u, w9Var.v, messageObject);
                            w9Var.f(true);
                        }
                    }
                    w9Var.v();
                    return true;
                }
                if (itemId == 16908320) {
                    w9Var.E();
                    w9Var.v();
                    return true;
                }
                if (itemId != 16908322) {
                    w9Var.f(false);
                    return true;
                }
                w9Var.I();
                w9Var.v();
                return true;
            }
            if (!w9Var.K() && (charSequenceT = w9Var.t(w9Var.W, false)) != null) {
                w9Var.f25895u = 0;
                w9Var.v = charSequenceT.length();
                w9Var.v();
                w9Var.x();
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                return true;
            }
        }
        return true;
    }

    @Override
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.add(0, 16908321, 0, 17039361);
        menu.add(0, R.id.menu_quote, 1, LocaleController.getString(R.string.Quote));
        menu.add(0, 3, 2, LocaleController.getString(R.string.TranslateMessage));
        menu.add(0, 16908320, 3, 17039363);
        menu.add(0, 16908322, 4, 17039371);
        menu.add(0, 16908319, 5, 17039373);
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
        if (Build.VERSION.SDK_INT < 23) {
            this.f24404b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        ClipboardManager clipboardManager;
        w9 w9Var;
        r9 r9Var;
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_quote);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.f24404b.e());
        }
        MenuItem menuItemFindItem2 = menu.findItem(16908321);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(this.f24404b.b());
        }
        MenuItem menuItemFindItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (menuItemFindItem3 != null && (r9Var = (w9Var = this.f24404b).W) != null) {
            CharSequence charSequenceT = w9Var.t(r9Var, false);
            if (!this.f24404b.b()) {
                menuItemFindItem3.setVisible(false);
            } else if (this.f24404b.k()) {
                menuItemFindItem3.setVisible(true);
            } else {
                w9 w9Var2 = this.f24404b;
                if (w9Var2.Z || (w9Var2.f25895u <= 0 && w9Var2.v >= charSequenceT.length() - 1)) {
                    menuItemFindItem3.setVisible(false);
                } else {
                    menuItemFindItem3.setVisible(true);
                }
            }
        }
        MenuItem menuItemFindItem4 = menu.findItem(16908320);
        if (menuItemFindItem4 != null) {
            menuItemFindItem4.setVisible(this.f24404b instanceof rh.d3);
        }
        MenuItem menuItemFindItem5 = menu.findItem(16908322);
        if (menuItemFindItem5 != null) {
            w9 w9Var3 = this.f24404b;
            if (w9Var3 instanceof rh.d3) {
                try {
                    v9 v9Var = w9Var3.C;
                    Context context = v9Var != null ? v9Var.getContext() : ApplicationLoader.applicationContext;
                    if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null && clipboardManager.hasPrimaryClip()) {
                        z10 = true;
                    }
                } catch (Exception unused) {
                }
            }
            menuItemFindItem5.setVisible(z10);
        }
        if (this.f24404b.f25879l0 == null || !LanguageDetector.hasSupport() || this.f24404b.s() == null) {
            this.f24403a = null;
            a(menu);
        } else {
            LanguageDetector.detectLanguage(this.f24404b.s().toString(), new f9(this, menu), new f9(this, menu));
        }
        return true;
    }
}
