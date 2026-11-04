package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class d90 implements Menu {
    public final f60 f33023a;
    public final p2 f33024b;
    public final Runnable f33025c;
    public final qs d;

    public d90(f60 f60Var, xs xsVar) {
        Objects.requireNonNull(xsVar);
        p2 p2Var = new p2(xsVar, 5);
        Runnable onPremiumMenuLockClickListener = xsVar.getOnPremiumMenuLockClickListener();
        qs qsVar = new qs(xsVar, 2);
        this.f33023a = f60Var;
        this.f33024b = p2Var;
        this.f33025c = onPremiumMenuLockClickListener;
        this.d = qsVar;
    }

    @Override
    public final MenuItem add(int i3) {
        return null;
    }

    @Override
    public final int addIntentOptions(int i3, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        return 0;
    }

    @Override
    public final SubMenu addSubMenu(int i3) {
        return null;
    }

    @Override
    public final MenuItem findItem(int i3) {
        return null;
    }

    @Override
    public final MenuItem getItem(int i3) {
        return null;
    }

    @Override
    public final boolean hasVisibleItems() {
        return false;
    }

    @Override
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return false;
    }

    @Override
    public final boolean performIdentifierAction(int i3, int i10) {
        return false;
    }

    @Override
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i10) {
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
    public final SubMenu addSubMenu(int i3, int i10, int i11, int i12) {
        return null;
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, CharSequence charSequence) {
        qs qsVar;
        if (i10 != 2131296502 || (qsVar = this.d) == null || ((Boolean) qsVar.run()).booleanValue()) {
            Runnable runnable = this.f33025c;
            if ((i10 != 2131296503 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.k4.f27766r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).D3())) {
                o2 o2Var = new o2(this, i10, 7);
                f60 f60Var = this.f33023a;
                f60Var.c(0, charSequence, o2Var, false);
                if (runnable != null && org.telegram.ui.ActionBar.k4.f27766r.contains(Integer.valueOf(i10))) {
                    f60Var.M(runnable);
                }
            }
        }
        return null;
    }

    @Override
    public final SubMenu addSubMenu(int i3, int i10, int i11, CharSequence charSequence) {
        return null;
    }

    @Override
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    @Override
    public final MenuItem add(int i3, int i10, int i11, int i12) {
        add(i3, i10, i11, org.telegram.messenger.bd.M0(i12, null));
        return null;
    }

    @Override
    public final void removeGroup(int i3) {
    }

    @Override
    public final void removeItem(int i3) {
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
    public final void setGroupEnabled(int i3, boolean z10) {
    }

    @Override
    public final void setGroupVisible(int i3, boolean z10) {
    }

    @Override
    public final void setGroupCheckable(int i3, boolean z10, boolean z11) {
    }
}
