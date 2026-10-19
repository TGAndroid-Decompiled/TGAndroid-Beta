package org.telegram.ui.Cells;

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
import org.telegram.ui.Components.s41;
import org.telegram.ui.r21;
public final class k9 implements ActionMode.Callback {
    public String f22511a = null;
    public final aa f22512b;

    public k9(aa aaVar) {
        this.f22512b = aaVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f22512b.f21997k0 != null && ((this.f22511a != null && !r21.Y().contains(this.f22511a)) || !LanguageDetector.hasSupport())) {
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
        aa aaVar = this.f22512b;
        g gVar = aaVar.m0;
        if (aaVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (aaVar.x()) {
                    if (!aaVar.C()) {
                        CharSequence r10 = aaVar.r();
                        if (r10 != null) {
                            AndroidUtilities.addToClipboard(r10);
                        }
                    }
                    aaVar.u();
                    aaVar.f(true);
                    w7.j0 j0Var = aaVar.D;
                    if (j0Var != null) {
                        j0Var.b();
                        return true;
                    }
                }
            } else if (itemId == 16908319) {
                if (!aaVar.J() && (s10 = aaVar.s(aaVar.W, false)) != null) {
                    aaVar.f22010u = 0;
                    aaVar.v = s10.length();
                    aaVar.u();
                    aaVar.w();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (aaVar.f21997k0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.t tVar = aaVar.f21997k0;
                    CharSequence r11 = aaVar.r();
                    String str = this.f22511a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.l4 l4Var = tVar.f41557a;
                    s41.L(l4Var.L, l4Var.M, str, language, r11, null, gVar2);
                }
                aaVar.u();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (aaVar.x()) {
                    v9 v9Var = aaVar.W;
                    if (v9Var instanceof u1) {
                        messageObject = ((u1) v9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && aaVar.r() != null) {
                        aaVar.I(messageObject, aaVar.f22010u, aaVar.v);
                        aaVar.f(true);
                    }
                }
                aaVar.u();
                return true;
            } else if (itemId == 16908320) {
                aaVar.D();
                aaVar.u();
                return true;
            } else if (itemId == 16908322) {
                aaVar.H();
                aaVar.u();
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
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        aa aaVar;
        v9 v9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f22512b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f22512b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (v9Var = (aaVar = this.f22512b).W) != null) {
            CharSequence s10 = aaVar.s(v9Var, false);
            if (!this.f22512b.b()) {
                findItem3.setVisible(false);
            } else if (this.f22512b.j()) {
                findItem3.setVisible(true);
            } else {
                aa aaVar2 = this.f22512b;
                if (!aaVar2.Z && (aaVar2.f22010u > 0 || aaVar2.v < s10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f22512b instanceof ki.j3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            aa aaVar3 = this.f22512b;
            if (aaVar3 instanceof ki.j3) {
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
        if (this.f22512b.f21997k0 != null && LanguageDetector.hasSupport() && this.f22512b.r() != null) {
            LanguageDetector.detectLanguage(this.f22512b.r().toString(), new j9(this, menu), new j9(this, menu));
        } else {
            this.f22511a = null;
            a(menu);
        }
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
