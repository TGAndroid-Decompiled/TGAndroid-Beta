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
import org.telegram.ui.Components.j41;
import org.telegram.ui.f41;
public final class o9 implements ActionMode.Callback {
    public String f20780a = null;
    public final ea f20781b;

    public o9(ea eaVar) {
        this.f20781b = eaVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f20781b.f20223l0 != null && ((this.f20780a != null && !f41.Y().contains(this.f20780a)) || !LanguageDetector.hasSupport())) {
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
        ea eaVar = this.f20781b;
        g gVar = eaVar.f20234r0;
        if (eaVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                eaVar.g();
                return true;
            } else if (itemId == 16908319) {
                if (!eaVar.K() && (t10 = eaVar.t(eaVar.W, false)) != null) {
                    eaVar.f20239u = 0;
                    eaVar.v = t10.length();
                    eaVar.v();
                    eaVar.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (eaVar.f20223l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.t tVar = eaVar.f20223l0;
                    CharSequence s10 = eaVar.s();
                    String str = this.f20780a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.h4 h4Var = tVar.f37575a;
                    j41.K(h4Var.L, h4Var.M, str, language, s10, null, gVar2);
                }
                eaVar.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (eaVar.y()) {
                    z9 z9Var = eaVar.W;
                    if (z9Var instanceof u1) {
                        messageObject = ((u1) z9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && eaVar.s() != null) {
                        eaVar.J(eaVar.f20239u, eaVar.v, messageObject);
                        eaVar.f(true);
                    }
                }
                eaVar.v();
                return true;
            } else if (itemId == 16908320) {
                eaVar.E();
                eaVar.v();
                return true;
            } else if (itemId == 16908322) {
                eaVar.I();
                eaVar.v();
                return true;
            } else {
                eaVar.f(false);
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
            this.f20781b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        ea eaVar;
        z9 z9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f20781b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f20781b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (z9Var = (eaVar = this.f20781b).W) != null) {
            CharSequence t10 = eaVar.t(z9Var, false);
            if (!this.f20781b.b()) {
                findItem3.setVisible(false);
            } else if (this.f20781b.k()) {
                findItem3.setVisible(true);
            } else {
                ea eaVar2 = this.f20781b;
                if (!eaVar2.Z && (eaVar2.f20239u > 0 || eaVar2.v < t10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f20781b instanceof ii.j3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            ea eaVar3 = this.f20781b;
            if (eaVar3 instanceof ii.j3) {
                try {
                    da daVar = eaVar3.C;
                    if (daVar != null) {
                        context = daVar.getContext();
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
        if (this.f20781b.f20223l0 != null && LanguageDetector.hasSupport() && this.f20781b.s() != null) {
            LanguageDetector.detectLanguage(this.f20781b.s().toString(), new n9(this, menu), new n9(this, menu));
        } else {
            this.f20780a = null;
            a(menu);
        }
        return true;
    }
}
