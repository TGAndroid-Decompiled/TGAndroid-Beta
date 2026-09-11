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
public final class pa0 implements Menu {
    public final n70 f29343a;
    public final y2 f29344b;
    public final Runnable f29345c;

    public pa0(n70 n70Var, y2 y2Var, Runnable runnable) {
        this.f29343a = n70Var;
        this.f29344b = y2Var;
        this.f29345c = runnable;
    }

    @Override
    public final MenuItem add(int i10) {
        return null;
    }

    @Override
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override
    public final SubMenu addSubMenu(int i10) {
        return null;
    }

    @Override
    public final MenuItem findItem(int i10) {
        return null;
    }

    @Override
    public final MenuItem getItem(int i10) {
        return null;
    }

    @Override
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean performIdentifierAction(int i10, int i11) {
        return false;
    }

    @Override
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
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
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return null;
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        Runnable runnable = this.f29345c;
        if (runnable == null || !org.telegram.ui.ActionBar.x4.f21506r.contains(Integer.valueOf(i11)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            m8 m8Var = new m8(this, i11, 5);
            n70 n70Var = this.f29343a;
            n70Var.c(0, charSequence, m8Var, false);
            if (runnable != null && org.telegram.ui.ActionBar.x4.f21506r.contains(Integer.valueOf(i11))) {
                n70Var.M(runnable);
            }
        }
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        add(i10, i11, i12, LocaleController.getString(i13));
        return null;
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void removeGroup(int i10) {
    }

    @Override
    public final void removeItem(int i10) {
    }

    @Override
    public final void setQwertyMode(boolean z10) {
    }

    @Override
    public final void setGroupEnabled(int i10, boolean z10) {
    }

    @Override
    public final void setGroupVisible(int i10, boolean z10) {
    }

    @Override
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
    }
}
