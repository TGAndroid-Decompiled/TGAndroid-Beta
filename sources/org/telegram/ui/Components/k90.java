package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class k90 implements Menu {
    public final m60 f36330a;
    public final q2 f36331b;
    public final Runnable f36332c;
    public final xs d;

    public k90(m60 m60Var, ft ftVar) {
        Objects.requireNonNull(ftVar);
        q2 q2Var = new q2(ftVar, 7);
        Runnable onPremiumMenuLockClickListener = ftVar.getOnPremiumMenuLockClickListener();
        xs xsVar = new xs(ftVar, 2);
        this.f36330a = m60Var;
        this.f36331b = q2Var;
        this.f36332c = onPremiumMenuLockClickListener;
        this.d = xsVar;
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
        xs xsVar;
        if (i10 != 2131296502 || (xsVar = this.d) == null || ((Boolean) xsVar.run()).booleanValue()) {
            Runnable runnable = this.f36332c;
            if ((i10 != 2131296503 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.i4.f28684r.contains(Integer.valueOf(i10)) || !org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).D3())) {
                a2 a2Var = new a2(this, i10, 10);
                m60 m60Var = this.f36330a;
                m60Var.c(0, charSequence, a2Var, false);
                if (runnable != null && org.telegram.ui.ActionBar.i4.f28684r.contains(Integer.valueOf(i10))) {
                    m60Var.M(runnable);
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
