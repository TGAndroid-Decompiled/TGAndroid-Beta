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
import org.telegram.ui.Components.k31;
import org.telegram.ui.b31;
public final class h9 implements ActionMode.Callback {
    public String f24464a = null;
    public final x9 f24465b;

    public h9(x9 x9Var) {
        this.f24465b = x9Var;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f24465b.f25953l0 != null && ((this.f24464a != null && !b31.Y().contains(this.f24464a)) || !LanguageDetector.hasSupport())) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        MessageObject messageObject;
        CharSequence t10;
        x9 x9Var = this.f24465b;
        g gVar = x9Var.f25964r0;
        if (x9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                x9Var.g();
                return true;
            } else if (itemId == 16908319) {
                if (!x9Var.K() && (t10 = x9Var.t(x9Var.W, false)) != null) {
                    x9Var.f25969u = 0;
                    x9Var.v = t10.length();
                    x9Var.v();
                    x9Var.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (x9Var.f25953l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.v vVar = x9Var.f25953l0;
                    CharSequence s10 = x9Var.s();
                    String str = this.f24464a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.m4 m4Var = vVar.f43384a;
                    k31.J(m4Var.H, m4Var.I, str, language, s10, null, gVar2);
                }
                x9Var.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (x9Var.y()) {
                    s9 s9Var = x9Var.W;
                    if (s9Var instanceof s1) {
                        messageObject = ((s1) s9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && x9Var.s() != null) {
                        x9Var.J(x9Var.f25969u, x9Var.v, messageObject);
                        x9Var.f(true);
                    }
                }
                x9Var.v();
                return true;
            } else if (itemId == 16908320) {
                x9Var.E();
                x9Var.v();
                return true;
            } else if (itemId == 16908322) {
                x9Var.I();
                x9Var.v();
                return true;
            } else {
                x9Var.f(false);
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
            this.f24465b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        x9 x9Var;
        s9 s9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f24465b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f24465b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (s9Var = (x9Var = this.f24465b).W) != null) {
            CharSequence t10 = x9Var.t(s9Var, false);
            if (!this.f24465b.b()) {
                findItem3.setVisible(false);
            } else if (this.f24465b.k()) {
                findItem3.setVisible(true);
            } else {
                x9 x9Var2 = this.f24465b;
                if (!x9Var2.Z && (x9Var2.f25969u > 0 || x9Var2.v < t10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f24465b instanceof th.d3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            x9 x9Var3 = this.f24465b;
            if (x9Var3 instanceof th.d3) {
                try {
                    w9 w9Var = x9Var3.C;
                    if (w9Var != null) {
                        context = w9Var.getContext();
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                        if (clipboardManager.hasPrimaryClip()) {
                            z10 = true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            findItem5.setVisible(z10);
        }
        if (this.f24465b.f25953l0 != null && LanguageDetector.hasSupport() && this.f24465b.s() != null) {
            LanguageDetector.detectLanguage(this.f24465b.s().toString(), new g9(this, menu), new g9(this, menu));
        } else {
            this.f24464a = null;
            a(menu);
        }
        return true;
    }
}
