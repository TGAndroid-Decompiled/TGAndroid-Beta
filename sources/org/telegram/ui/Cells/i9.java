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
import org.telegram.ui.Components.v31;
import org.telegram.ui.t31;
public final class i9 implements ActionMode.Callback {
    public String f21194a = null;
    public final y9 f21195b;

    public i9(y9 y9Var) {
        this.f21195b = y9Var;
    }

    public final void a(Menu menu) {
        boolean z4;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f21195b.f22621l0 != null && ((this.f21194a != null && !t31.Y().contains(this.f21194a)) || !LanguageDetector.hasSupport())) {
            z4 = true;
        } else {
            z4 = false;
        }
        findItem.setVisible(z4);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        MessageObject messageObject;
        CharSequence t6;
        y9 y9Var = this.f21195b;
        g gVar = y9Var.f22632r0;
        if (y9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                y9Var.g();
                return true;
            } else if (itemId == 16908319) {
                if (!y9Var.K() && (t6 = y9Var.t(y9Var.W, false)) != null) {
                    y9Var.f22637u = 0;
                    y9Var.v = t6.length();
                    y9Var.v();
                    y9Var.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (y9Var.f22621l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.v vVar = y9Var.f22621l0;
                    CharSequence s6 = y9Var.s();
                    String str = this.f21194a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.n4 n4Var = vVar.f38935a;
                    v31.J(n4Var.I, n4Var.J, str, language, s6, null, gVar2);
                }
                y9Var.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (y9Var.y()) {
                    t9 t9Var = y9Var.W;
                    if (t9Var instanceof s1) {
                        messageObject = ((s1) t9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && y9Var.s() != null) {
                        y9Var.J(y9Var.f22637u, y9Var.v, messageObject);
                        y9Var.f(true);
                    }
                }
                y9Var.v();
                return true;
            } else if (itemId == 16908320) {
                y9Var.E();
                y9Var.v();
                return true;
            } else if (itemId == 16908322) {
                y9Var.I();
                y9Var.v();
                return true;
            } else {
                y9Var.f(false);
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
            this.f21195b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        y9 y9Var;
        t9 t9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f21195b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f21195b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z4 = false;
        if (findItem3 != null && (t9Var = (y9Var = this.f21195b).W) != null) {
            CharSequence t6 = y9Var.t(t9Var, false);
            if (!this.f21195b.b()) {
                findItem3.setVisible(false);
            } else if (this.f21195b.k()) {
                findItem3.setVisible(true);
            } else {
                y9 y9Var2 = this.f21195b;
                if (!y9Var2.Z && (y9Var2.f22637u > 0 || y9Var2.v < t6.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f21195b instanceof vh.g3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            y9 y9Var3 = this.f21195b;
            if (y9Var3 instanceof vh.g3) {
                try {
                    x9 x9Var = y9Var3.C;
                    if (x9Var != null) {
                        context = x9Var.getContext();
                    } else {
                        context = ApplicationLoader.applicationContext;
                    }
                    if (context != null && (clipboardManager = (ClipboardManager) context.getSystemService("clipboard")) != null) {
                        if (clipboardManager.hasPrimaryClip()) {
                            z4 = true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            findItem5.setVisible(z4);
        }
        if (this.f21195b.f22621l0 != null && LanguageDetector.hasSupport() && this.f21195b.s() != null) {
            LanguageDetector.detectLanguage(this.f21195b.s().toString(), new h9(this, menu), new h9(this, menu));
        } else {
            this.f21194a = null;
            a(menu);
        }
        return true;
    }
}
