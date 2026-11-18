package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class u90 implements Menu {
    public final y60 f40272a;
    public final y2 f40273b;
    public final Runnable f40274c;
    public final dt d;

    public u90(y60 y60Var, mt mtVar) {
        Objects.requireNonNull(mtVar);
        y2 y2Var = new y2(mtVar, 7);
        Runnable onPremiumMenuLockClickListener = mtVar.getOnPremiumMenuLockClickListener();
        dt dtVar = new dt(mtVar, 2);
        this.f40272a = y60Var;
        this.f40273b = y2Var;
        this.f40274c = onPremiumMenuLockClickListener;
        this.d = dtVar;
    }

    @Override
    public final MenuItem add(int i7) {
        return null;
    }

    @Override
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override
    public final SubMenu addSubMenu(int i7) {
        return null;
    }

    @Override
    public final MenuItem findItem(int i7) {
        return null;
    }

    @Override
    public final MenuItem getItem(int i7) {
        return null;
    }

    @Override
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean performIdentifierAction(int i7, int i10) {
        return false;
    }

    @Override
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
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
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return null;
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        dt dtVar;
        if (i10 != 2131296502 || (dtVar = this.d) == null || ((Boolean) dtVar.run()).booleanValue()) {
            Runnable runnable = this.f40274c;
            if ((i10 != 2131296503 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.m4.f29233r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).K3())) {
                org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i10, 13);
                y60 y60Var = this.f40272a;
                y60Var.c(0, charSequence, iiVar, false);
                if (runnable != null && org.telegram.ui.ActionBar.m4.f29233r.contains(Integer.valueOf(i10))) {
                    y60Var.N(runnable);
                }
            }
        }
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        add(i7, i10, i11, org.telegram.messenger.gd.M0(i12, null));
        return null;
    }

    @Override
    public final void removeGroup(int i7) {
    }

    @Override
    public final void removeItem(int i7) {
    }

    @Override
    public final void setQwertyMode(boolean z10) {
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void setGroupEnabled(int i7, boolean z10) {
    }

    @Override
    public final void setGroupVisible(int i7, boolean z10) {
    }

    @Override
    public final void setGroupCheckable(int i7, boolean z10, boolean z11) {
    }
}
