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
import org.telegram.ui.Components.u31;
import org.telegram.ui.h41;
public final class n9 implements ActionMode.Callback {
    public String f22396a = null;
    public final da f22397b;

    public n9(da daVar) {
        this.f22397b = daVar;
    }

    public final void a(Menu menu) {
        boolean z10;
        LocaleController.getInstance().getCurrentLocale().getLanguage();
        MenuItem findItem = menu.findItem(3);
        if (findItem == null) {
            return;
        }
        if (this.f22397b.f21810l0 != null && ((this.f22396a != null && !h41.Y().contains(this.f22396a)) || !LanguageDetector.hasSupport())) {
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
        da daVar = this.f22397b;
        g gVar = daVar.f21821r0;
        if (daVar.y()) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                daVar.g();
                return true;
            } else if (itemId == 16908319) {
                if (!daVar.K() && (t10 = daVar.t(daVar.W, false)) != null) {
                    daVar.f21826u = 0;
                    daVar.v = t10.length();
                    daVar.v();
                    daVar.x();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    return true;
                }
            } else if (itemId == 3) {
                if (daVar.f21810l0 != null) {
                    String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
                    org.telegram.ui.t tVar = daVar.f21810l0;
                    CharSequence s10 = daVar.s();
                    String str = this.f22396a;
                    g gVar2 = new g(this, 8);
                    org.telegram.ui.i4 i4Var = tVar.f40604a;
                    u31.K(i4Var.L, i4Var.M, str, language, s10, null, gVar2);
                }
                daVar.v();
                return true;
            } else if (itemId == R.id.menu_quote) {
                if (daVar.y()) {
                    y9 y9Var = daVar.W;
                    if (y9Var instanceof t1) {
                        messageObject = ((t1) y9Var).getMessageObject();
                    } else {
                        messageObject = null;
                    }
                    if (messageObject != null && daVar.s() != null) {
                        daVar.J(daVar.f21826u, daVar.v, messageObject);
                        daVar.f(true);
                    }
                }
                daVar.v();
                return true;
            } else if (itemId == 16908320) {
                daVar.E();
                daVar.v();
                return true;
            } else if (itemId == 16908322) {
                daVar.I();
                daVar.v();
                return true;
            } else {
                daVar.f(false);
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
            this.f22397b.f(false);
        }
    }

    @Override
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Context context;
        ClipboardManager clipboardManager;
        da daVar;
        y9 y9Var;
        MenuItem findItem = menu.findItem(R.id.menu_quote);
        if (findItem != null) {
            findItem.setVisible(this.f22397b.e());
        }
        MenuItem findItem2 = menu.findItem(16908321);
        if (findItem2 != null) {
            findItem2.setVisible(this.f22397b.b());
        }
        MenuItem findItem3 = menu.findItem(16908319);
        boolean z10 = false;
        if (findItem3 != null && (y9Var = (daVar = this.f22397b).W) != null) {
            CharSequence t10 = daVar.t(y9Var, false);
            if (!this.f22397b.b()) {
                findItem3.setVisible(false);
            } else if (this.f22397b.k()) {
                findItem3.setVisible(true);
            } else {
                da daVar2 = this.f22397b;
                if (!daVar2.Z && (daVar2.f21826u > 0 || daVar2.v < t10.length() - 1)) {
                    findItem3.setVisible(true);
                } else {
                    findItem3.setVisible(false);
                }
            }
        }
        MenuItem findItem4 = menu.findItem(16908320);
        if (findItem4 != null) {
            findItem4.setVisible(this.f22397b instanceof ji.i3);
        }
        MenuItem findItem5 = menu.findItem(16908322);
        if (findItem5 != null) {
            da daVar3 = this.f22397b;
            if (daVar3 instanceof ji.i3) {
                try {
                    ca caVar = daVar3.C;
                    if (caVar != null) {
                        context = caVar.getContext();
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
        if (this.f22397b.f21810l0 != null && LanguageDetector.hasSupport() && this.f22397b.s() != null) {
            LanguageDetector.detectLanguage(this.f22397b.s().toString(), new m9(this, menu), new m9(this, menu));
        } else {
            this.f22396a = null;
            a(menu);
        }
        return true;
    }
}
