package org.telegram.ui.Components;

import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import j$.util.Objects;
public final class z90 implements Menu {
    public final z60 f32986a;
    public final r2 f32987b;
    public final Runnable f32988c;
    public final ct d;

    public z90(z60 z60Var, mt mtVar) {
        Objects.requireNonNull(mtVar);
        r2 r2Var = new r2(mtVar, 5);
        Runnable onPremiumMenuLockClickListener = mtVar.getOnPremiumMenuLockClickListener();
        ct ctVar = new ct(mtVar, 2);
        this.f32986a = z60Var;
        this.f32987b = r2Var;
        this.f32988c = onPremiumMenuLockClickListener;
        this.d = ctVar;
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
        ct ctVar;
        if (i11 != 2131296502 || (ctVar = this.d) == null || ((Boolean) ctVar.run()).booleanValue()) {
            Runnable runnable = this.f32988c;
            if ((i11 != 2131296503 || runnable == null) && (runnable == null || !org.telegram.ui.ActionBar.s4.f20774r.contains(Integer.valueOf(i11)) || !org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).A3())) {
                qq qqVar = new qq(this, i11, 2);
                z60 z60Var = this.f32986a;
                z60Var.c(0, charSequence, qqVar, false);
                if (runnable != null && org.telegram.ui.ActionBar.s4.f20774r.contains(Integer.valueOf(i11))) {
                    z60Var.M(runnable);
                }
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
        add(i10, i11, i12, org.telegram.messenger.cd.L0(i13, null));
        return null;
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
    public final void clear() {
    }

    @Override
    public final void close() {
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
