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
import org.telegram.ui.ActionBar.FloatingToolbar;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;

public final class MenuToItemOptions implements Menu {
    public final ItemOptions itemOptions;
    public final EditTextEmoji$$ExternalSyntheticLambda2 onMenuClicked;
    public final Runnable premiumLock;

    public MenuToItemOptions(ItemOptions itemOptions, EditTextEmoji$$ExternalSyntheticLambda2 editTextEmoji$$ExternalSyntheticLambda2, Runnable runnable) {
        this.itemOptions = itemOptions;
        this.onMenuClicked = editTextEmoji$$ExternalSyntheticLambda2;
        this.premiumLock = runnable;
    }

    @Override
    public final MenuItem add(int i) {
        return null;
    }

    @Override
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override
    public final SubMenu addSubMenu(int i) {
        return null;
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final MenuItem findItem(int i) {
        return null;
    }

    @Override
    public final MenuItem getItem(int i) {
        return null;
    }

    @Override
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean performIdentifierAction(int i, int i2) {
        return false;
    }

    @Override
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return false;
    }

    @Override
    public final void removeGroup(int i) {
    }

    @Override
    public final void removeItem(int i) {
    }

    @Override
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
    }

    @Override
    public final void setGroupEnabled(int i, boolean z) {
    }

    @Override
    public final void setGroupVisible(int i, boolean z) {
    }

    @Override
    public final void setQwertyMode(boolean z) {
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
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        Runnable runnable = this.premiumLock;
        if (runnable == null || !FloatingToolbar.premiumOptions.contains(Integer.valueOf(i2)) || !MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74 = new ArticleViewer$$ExternalSyntheticLambda74(this, i2, 25);
            ItemOptions itemOptions = this.itemOptions;
            itemOptions.add(0, charSequence, articleViewer$$ExternalSyntheticLambda74, false);
            if (runnable != null && FloatingToolbar.premiumOptions.contains(Integer.valueOf(i2))) {
                itemOptions.putPremiumLock(runnable);
            }
        }
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override
    public final MenuItem add(int i, int i2, int i3, int i4) {
        add(i, i2, i3, LocaleController.getString(i4));
        return null;
    }
}
