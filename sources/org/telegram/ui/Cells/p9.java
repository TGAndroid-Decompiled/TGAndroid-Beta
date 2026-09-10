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
import org.telegram.ui.Components.i41;
import org.telegram.ui.k41;
public final class p9 implements ActionMode.Callback {
    public String f19693a = null;
    public final fa f19694b;

    public p9(fa faVar) {
        this.f19694b = faVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f19694b.f19148l0 != null && ((this.f19693a != null && !k41.Y().contains(this.f19693a)) || !LanguageDetector.hasSupport())) {
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
        fa faVar = this.f19694b;
        g gVar = faVar.f19159r0;
        if (faVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                faVar.g();
                return true;
            } else if (itemId == 16908319) {
                if (!faVar.K() && (t10 = faVar.t(faVar.W, false)) != null) {
                    faVar.f19164u = 0;
                    faVar.v = t10.length();
                    faVar.v();
                    faVar.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (faVar.f19148l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.u uVar = faVar.f19148l0;
                    CharSequence s10 = faVar.s();
                    String str = this.f19693a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.j4 j4Var = uVar.f37065a;
                    i41.K(j4Var.L, j4Var.M, str, language, s10, null, gVar2);
                }
                faVar.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (faVar.y()) {
                    aa aaVar = faVar.W;
                    if (aaVar instanceof t1) {
                        messageObject = ((t1) aaVar).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && faVar.s() != null) {
                        faVar.J(faVar.f19164u, faVar.v, messageObject);
                        faVar.f(true);
                    }
                }
                faVar.v();
                return true;
            } else if (itemId == 16908320) {
                faVar.E();
                faVar.v();
                return true;
            } else if (itemId == 16908322) {
                faVar.I();
                faVar.v();
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
    public final void onDestroyActionMode(ActionMode actionMode) {
        if (Build.VERSION.SDK_INT < 23) {
            this.f19694b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        fa faVar;
        aa aaVar;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f19694b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f19694b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (aaVar = (faVar = this.f19694b).W) != null) {
            CharSequence t10 = faVar.t(aaVar, false);
            if (!this.f19694b.b()) {
                findItem3.setVisible(false);
            } else if (this.f19694b.k()) {
                findItem3.setVisible(true);
            } else {
                fa faVar2 = this.f19694b;
                if (!faVar2.Z && (faVar2.f19164u > 0 || faVar2.v < t10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f19694b instanceof hi.m3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            fa faVar3 = this.f19694b;
            if (faVar3 instanceof hi.m3) {
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
        if (this.f19694b.f19148l0 != null && LanguageDetector.hasSupport() && this.f19694b.s() != null) {
            LanguageDetector.detectLanguage(this.f19694b.s().toString(), new o9(this, menu), new o9(this, menu));
        } else {
            this.f19693a = null;
            a(menu);
        }
        return true;
    }
}
