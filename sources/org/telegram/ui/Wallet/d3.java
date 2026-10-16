package org.telegram.ui.Wallet;

import android.content.Context;
public final class d3 extends tg.s {
    public final e3 f32778x;

    public d3(e3 e3Var, Context context, a3 a3Var) {
        super(context, a3Var);
        this.f32778x = e3Var;
    }

    @Override
    public final void a() {
        e3 e3Var = this.f32778x;
        e3Var.f32846o = true;
        setPaused(true);
        setVisibility(8);
        e3Var.f32822a.invalidate();
    }
}
