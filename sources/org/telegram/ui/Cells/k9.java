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
import org.telegram.ui.Components.z21;
import org.telegram.ui.b31;
public final class k9 implements ActionMode.Callback {
    public String f24627a = null;
    public final aa f24628b;

    public k9(aa aaVar) {
        this.f24628b = aaVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f24628b.f24092l0 != null && ((this.f24627a != null && !b31.X().contains(this.f24627a)) || !LanguageDetector.hasSupport())) {
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
        aa aaVar = this.f24628b;
        g gVar = aaVar.f24103r0;
        if (aaVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                aaVar.g();
                return true;
            } else if (itemId == 16908319) {
                if (!aaVar.K() && (t10 = aaVar.t(aaVar.W, false)) != null) {
                    aaVar.f24108u = 0;
                    aaVar.v = t10.length();
                    aaVar.v();
                    aaVar.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (aaVar.f24092l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.t tVar = aaVar.f24092l0;
                    CharSequence s10 = aaVar.s();
                    String str = this.f24627a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.l4 l4Var = tVar.f42796a;
                    z21.J(l4Var.H, l4Var.I, str, language, s10, null, gVar2);
                }
                aaVar.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (aaVar.y()) {
                    v9 v9Var = aaVar.W;
                    if (v9Var instanceof t1) {
                        messageObject = ((t1) v9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && aaVar.s() != null) {
                        aaVar.J(aaVar.f24108u, aaVar.v, messageObject);
                        aaVar.f(true);
                    }
                }
                aaVar.v();
                return true;
            } else if (itemId == 16908320) {
                aaVar.E();
                aaVar.v();
                return true;
            } else if (itemId == 16908322) {
                aaVar.I();
                aaVar.v();
                return true;
            } else {
                aaVar.f(false);
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
            this.f24628b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        aa aaVar;
        v9 v9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f24628b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f24628b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (v9Var = (aaVar = this.f24628b).W) != null) {
            CharSequence t10 = aaVar.t(v9Var, false);
            if (!this.f24628b.b()) {
                findItem3.setVisible(false);
            } else if (this.f24628b.k()) {
                findItem3.setVisible(true);
            } else {
                aa aaVar2 = this.f24628b;
                if (!aaVar2.Z && (aaVar2.f24108u > 0 || aaVar2.v < t10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f24628b instanceof qh.c3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            aa aaVar3 = this.f24628b;
            if (aaVar3 instanceof qh.c3) {
                try {
                    z9 z9Var = aaVar3.C;
                    if (z9Var != null) {
                        context = z9Var.getContext();
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
        if (this.f24628b.f24092l0 != null && LanguageDetector.hasSupport() && this.f24628b.s() != null) {
            LanguageDetector.detectLanguage(this.f24628b.s().toString(), new j9(this, menu), new j9(this, menu));
        } else {
            this.f24627a = null;
            a(menu);
        }
        return true;
    }
}
