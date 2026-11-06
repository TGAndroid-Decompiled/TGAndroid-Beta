package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class h90 implements Menu {
    public final k60 f34230a;
    public final s2 f34231b;
    public final Runnable f34232c;
    public final qs d;

    public h90(k60 k60Var, ys ysVar) {
        Objects.requireNonNull(ysVar);
        s2 s2Var = new s2(ysVar, 5);
        Runnable onPremiumMenuLockClickListener = ysVar.getOnPremiumMenuLockClickListener();
        qs qsVar = new qs(ysVar, 2);
        this.f34230a = k60Var;
        this.f34231b = s2Var;
        this.f34232c = onPremiumMenuLockClickListener;
        this.d = qsVar;
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
        qs qsVar;
        if (i10 != 2131296502 || (qsVar = this.d) == null || ((Boolean) qsVar.run()).booleanValue()) {
            Runnable runnable = this.f34232c;
            if ((i10 != 2131296503 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.k4.f27735r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).D3())) {
                r2 r2Var = new r2(this, i10, 7);
                k60 k60Var = this.f34230a;
                k60Var.c(0, charSequence, r2Var, false);
                if (runnable != null && org.telegram.ui.ActionBar.k4.f27735r.contains(Integer.valueOf(i10))) {
                    k60Var.M(runnable);
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
        add(i7, i10, i11, org.telegram.messenger.hd.M0(i12, null));
        return null;
    }

    @Override
    public final void removeGroup(int i7) {
    }

    @Override
    public final void removeItem(int i7) {
    }

    @Override
    public final void setQwertyMode(boolean z9) {
    }

    @Override
    public final void clear() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void setGroupEnabled(int i7, boolean z9) {
    }

    @Override
    public final void setGroupVisible(int i7, boolean z9) {
    }

    @Override
    public final void setGroupCheckable(int i7, boolean z9, boolean z10) {
    }
}
