package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class w90 implements Menu {
    public final a70 f41732a;
    public final z2 f41733b;
    public final Runnable f41734c;
    public final ft d;

    public w90(a70 a70Var, ot otVar) {
        Objects.requireNonNull(otVar);
        z2 z2Var = new z2(otVar, 7);
        Runnable onPremiumMenuLockClickListener = otVar.getOnPremiumMenuLockClickListener();
        ft ftVar = new ft(otVar, 2);
        this.f41732a = a70Var;
        this.f41733b = z2Var;
        this.f41734c = onPremiumMenuLockClickListener;
        this.d = ftVar;
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
        ft ftVar;
        if (i10 != 2131296504 || (ftVar = this.d) == null || ((Boolean) ftVar.run()).booleanValue()) {
            Runnable runnable = this.f41734c;
            if ((i10 != 2131296505 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.l4.f29218r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).K3())) {
                org.telegram.ui.ii iiVar = new org.telegram.ui.ii(this, i10, 13);
                a70 a70Var = this.f41732a;
                a70Var.c(0, charSequence, iiVar, false);
                if (runnable != null && org.telegram.ui.ActionBar.l4.f29218r.contains(Integer.valueOf(i10))) {
                    a70Var.N(runnable);
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
        add(i7, i10, i11, org.telegram.messenger.hd.N0(i12, null));
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
