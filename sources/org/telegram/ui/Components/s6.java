package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f27781a;
    public final Runnable f27782b;

    public s6(int i10, Runnable runnable) {
        this.f27781a = i10;
        this.f27782b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27781a) {
            case 0:
                this.f27782b.run();
                return;
            case 1:
                Runnable runnable = this.f27782b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27782b.run();
                return;
        }
    }
}
