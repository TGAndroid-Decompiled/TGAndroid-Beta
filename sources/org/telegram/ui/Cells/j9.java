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
import org.telegram.ui.n31;
public final class j9 implements ActionMode.Callback {
    public String f21268a = null;
    public final z9 f21269b;

    public j9(z9 z9Var) {
        this.f21269b = z9Var;
    }

    public final void a(Menu menu) {
        boolean z4;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f21269b.f22685l0 != null && ((this.f21268a != null && !n31.Y().contains(this.f21268a)) || !LanguageDetector.hasSupport())) {
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
        z9 z9Var = this.f21269b;
        g gVar = z9Var.f22696r0;
        if (z9Var.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                z9Var.g();
                return true;
            } else if (itemId == 16908319) {
                if (!z9Var.K() && (t6 = z9Var.t(z9Var.W, false)) != null) {
                    z9Var.f22701u = 0;
                    z9Var.v = t6.length();
                    z9Var.v();
                    z9Var.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (z9Var.f22685l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.v vVar = z9Var.f22685l0;
                    CharSequence s6 = z9Var.s();
                    String str = this.f21268a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.l4 l4Var = vVar.f39030a;
                    v31.J(l4Var.I, l4Var.J, str, language, s6, null, gVar2);
                }
                z9Var.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (z9Var.y()) {
                    u9 u9Var = z9Var.W;
                    if (u9Var instanceof t1) {
                        messageObject = ((t1) u9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && z9Var.s() != null) {
                        z9Var.J(z9Var.f22701u, z9Var.v, messageObject);
                        z9Var.f(true);
                    }
                }
                z9Var.v();
                return true;
            } else if (itemId == 16908320) {
                z9Var.E();
                z9Var.v();
                return true;
            } else if (itemId == 16908322) {
                z9Var.I();
                z9Var.v();
                return true;
            } else {
                z9Var.f(false);
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
            this.f21269b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        z9 z9Var;
        u9 u9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f21269b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f21269b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z4 = false;
        if (findItem3 != null && (u9Var = (z9Var = this.f21269b).W) != null) {
            CharSequence t6 = z9Var.t(u9Var, false);
            if (!this.f21269b.b()) {
                findItem3.setVisible(false);
            } else if (this.f21269b.k()) {
                findItem3.setVisible(true);
            } else {
                z9 z9Var2 = this.f21269b;
                if (!z9Var2.Z && (z9Var2.f22701u > 0 || z9Var2.v < t6.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f21269b instanceof vh.f3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            z9 z9Var3 = this.f21269b;
            if (z9Var3 instanceof vh.f3) {
                try {
                    y9 y9Var = z9Var3.C;
                    if (y9Var != null) {
                        context = y9Var.getContext();
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
        if (this.f21269b.f22685l0 != null && LanguageDetector.hasSupport() && this.f21269b.s() != null) {
            LanguageDetector.detectLanguage(this.f21269b.s().toString(), new i9(this, menu), new i9(this, menu));
        } else {
            this.f21268a = null;
            a(menu);
        }
        return true;
    }
}
