package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;
public final class sx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final iy0 f28333a;

    public sx0(iy0 iy0Var) {
        this.f28333a = iy0Var;
    }

    @Override
    public void m(int i10) {
        iy0.B(this.f28333a, i10);
    }

    @Override
    public void run(String str) {
        new w40(r1.getContext(), r1.f25213o0, null, this.f28333a.resourcesProvider).show();
    }
}
