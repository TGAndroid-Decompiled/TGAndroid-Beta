package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class x90 implements Menu {
    public final x60 f34624a;
    public final v2 f34625b;
    public final Runnable f34626c;

    public x90(x60 x60Var, v2 v2Var, Runnable runnable) {
        this.f34624a = x60Var;
        this.f34625b = v2Var;
        this.f34626c = runnable;
    }

    @Override
    public final MenuItem add(int i9) {
        return null;
    }

    @Override
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override
    public final SubMenu addSubMenu(int i9) {
        return null;
    }

    @Override
    public final MenuItem findItem(int i9) {
        return null;
    }

    @Override
    public final MenuItem getItem(int i9) {
        return null;
    }

    @Override
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean performIdentifierAction(int i9, int i10) {
        return false;
    }

    @Override
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        return false;
    }

    @Override
    public final int size() {
        return 0;
    }

    @Override
    public final MenuItem add(CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return null;
    }

    @Override
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        Runnable runnable = this.f34626c;
        if (runnable == null || !org.telegram.ui.ActionBar.v4.f23872r.contains(Integer.valueOf(i10)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            qd qdVar = new qd(this, i10, 3);
            x60 x60Var = this.f34624a;
            x60Var.c(0, charSequence, qdVar, false);
            if (runnable != null && org.telegram.ui.ActionBar.v4.f23872r.contains(Integer.valueOf(i10))) {
                x60Var.M(runnable);
            }
        }
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        add(i9, i10, i11, LocaleController.getString(i12));
        return null;
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void removeGroup(int i9) {
    }

    @Override
    public final void removeItem(int i9) {
    }

    @Override
    public final void setQwertyMode(boolean z10) {
    }

    @Override
    public final void setGroupEnabled(int i9, boolean z10) {
    }

    @Override
    public final void setGroupVisible(int i9, boolean z10) {
    }

    @Override
    public final void setGroupCheckable(int i9, boolean z10, boolean z11) {
    }
}
