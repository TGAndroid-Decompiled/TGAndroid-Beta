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
import org.telegram.ui.Components.c51;
import org.telegram.ui.e41;
public final class l9 implements ActionMode.Callback {
    public String f22457a = null;
    public final ba f22458b;

    public l9(ba baVar) {
        this.f22458b = baVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f22458b.f21899k0 != null && ((this.f22457a != null && !e41.Y().contains(this.f22457a)) || !LanguageDetector.hasSupport())) {
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
        ba baVar = this.f22458b;
        g gVar = baVar.m0;
        if (baVar.x()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                if (baVar.x()) {
                    if (!baVar.C()) {
                        CharSequence r10 = baVar.r();
                        if (r10 != null) {
                            AndroidUtilities.addToClipboard(r10);
                        }
                    }
                    baVar.u();
                    baVar.f(true);
                    w7.h0 h0Var = baVar.D;
                    if (h0Var != null) {
                        h0Var.b();
                        return true;
                    }
                }
            } else if (itemId == 16908319) {
                if (!baVar.J() && (s10 = baVar.s(baVar.W, false)) != null) {
                    baVar.f21912u = 0;
                    baVar.v = s10.length();
                    baVar.u();
                    baVar.w();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (baVar.f21899k0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.t tVar = baVar.f21899k0;
                    CharSequence r11 = baVar.r();
                    String str = this.f22457a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.h4 h4Var = tVar.f42053a;
                    c51.L(h4Var.L, h4Var.M, str, language, r11, null, gVar2);
                }
                baVar.u();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (baVar.x()) {
                    w9 w9Var = baVar.W;
                    if (w9Var instanceof u1) {
                        messageObject = ((u1) w9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && baVar.r() != null) {
                        baVar.I(baVar.f21912u, baVar.v, messageObject);
                        baVar.f(true);
                    }
                }
                baVar.u();
                return true;
            } else if (itemId == 16908320) {
                baVar.D();
                baVar.u();
                return true;
            } else if (itemId == 16908322) {
                baVar.H();
                baVar.u();
                return true;
            } else {
                baVar.f(false);
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
        ba baVar;
        w9 w9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f22458b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f22458b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (w9Var = (baVar = this.f22458b).W) != null) {
            CharSequence s10 = baVar.s(w9Var, false);
            if (!this.f22458b.b()) {
                findItem3.setVisible(false);
            } else if (this.f22458b.j()) {
                findItem3.setVisible(true);
            } else {
                ba baVar2 = this.f22458b;
                if (!baVar2.Z && (baVar2.f21912u > 0 || baVar2.v < s10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f22458b instanceof ii.k3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            ba baVar3 = this.f22458b;
            if (baVar3 instanceof ii.k3) {
                try {
                    aa aaVar = baVar3.C;
                    if (aaVar != null) {
                        context = aaVar.getContext();
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
        if (this.f22458b.f21899k0 != null && LanguageDetector.hasSupport() && this.f22458b.r() != null) {
            LanguageDetector.detectLanguage(this.f22458b.r().toString(), new k9(this, menu), new k9(this, menu));
        } else {
            this.f22457a = null;
            a(menu);
        }
        return true;
    }

    @Override
    public final void onDestroyActionMode(ActionMode actionMode) {
    }
}
