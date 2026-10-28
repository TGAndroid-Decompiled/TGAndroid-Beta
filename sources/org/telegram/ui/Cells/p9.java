package org.telegram.ui.Cells;

import a8.ye;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g51;
import org.telegram.ui.a31;
public final class p9 implements ActionMode.Callback {
    public String f24782a = null;
    public final fa f24783b;

    public p9(fa faVar) {
        this.f24783b = faVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f24783b.f24107k0 != null && ((this.f24782a != null && !a31.Z().contains(this.f24782a)) || !LanguageDetector.hasSupport())) {
            z10 = true;
        } else {
            z10 = false;
        }
        findItem.setVisible(z10);
    }

    @Override
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        MessageObject messageObject;
        CharSequence s10;
        fa faVar = this.f24783b;
        g gVar = faVar.m0;
        if (faVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (faVar.x() && faVar.b()) {
                    if (!faVar.C()) {
                        CharSequence r6 = faVar.r();
                        if (r6 != null) {
                            AndroidUtilities.addToClipboard(r6);
                        }
                    }
                    faVar.u();
                    faVar.f(true);
                    ye yeVar = faVar.D;
                    if (yeVar != null) {
                        yeVar.b();
                        return true;
                    }
                }
            } else if (itemId == 16908319) {
                if (!faVar.J() && (s10 = faVar.s(faVar.W, false)) != null) {
                    faVar.f24120u = 0;
                    faVar.v = s10.length();
                    faVar.u();
                    faVar.w();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (faVar.f24107k0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.s sVar = faVar.f24107k0;
                    CharSequence r10 = faVar.r();
                    String str = this.f24782a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.j4 j4Var = sVar.f43196a;
                    g51.T(j4Var.L, j4Var.M, str, language, r10, null, gVar2);
                }
                faVar.u();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (faVar.x()) {
                    aa aaVar = faVar.W;
                    if (aaVar instanceof s1) {
                        messageObject = ((s1) aaVar).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && faVar.r() != null) {
                        faVar.I(messageObject, faVar.f24120u, faVar.v);
                        faVar.f(true);
                    }
                }
                faVar.u();
                return true;
            } else if (itemId == 16908320) {
                faVar.D();
                faVar.u();
                return true;
            } else if (itemId == 16908322) {
                faVar.H();
                faVar.u();
                return true;
            } else {
                faVar.f(false);
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
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        fa faVar;
        aa aaVar;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f24783b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f24783b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (aaVar = (faVar = this.f24783b).W) != null) {
            CharSequence s10 = faVar.s(aaVar, false);
            if (!this.f24783b.b()) {
                findItem3.setVisible(false);
            } else if (this.f24783b.j()) {
                findItem3.setVisible(true);
            } else {
                fa faVar2 = this.f24783b;
                if (!faVar2.Z && (faVar2.f24120u > 0 || faVar2.v < s10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f24783b instanceof li.j3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            fa faVar3 = this.f24783b;
            if (faVar3 instanceof li.j3) {
                try {
                    ea eaVar = faVar3.C;
                    if (eaVar != null) {
                        context = eaVar.getContext();
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
        if (this.f24783b.f24107k0 != null && LanguageDetector.hasSupport() && this.f24783b.r() != null) {
            LanguageDetector.detectLanguage(this.f24783b.r().toString(), new o9(this, menu), new o9(this, menu));
        } else {
            this.f24782a = null;
            a(menu);
        }
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
