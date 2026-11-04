package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.xp;
public final class d7 extends FrameLayout {
    public final org.telegram.ui.Components.k9 f29088a;
    public final a7 f29089b;
    public final TextView f29090c;
    public long d;
    public long f29091e;
    public final int f29092f;
    public final org.telegram.ui.ActionBar.e6 h;

    public d7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29092f = h10.f22829t0;
        this.h = e6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29088a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, mf.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29090c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, mf.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f29089b = new a7(this, e6Var, 1);
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i3, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f29091e;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i3;
        if (z10) {
            i3 = 2131745445;
        } else {
            i3 = 2131745444;
        }
        this.f29090c.setText(bd.M0(i3, null));
        org.telegram.ui.Components.k9 k9Var = this.f29088a;
        k9Var.setAnimatedEmojiDrawable(null);
        rg.a aVar = new rg.a(rg.a.f54504k[0]);
        c70 c70Var = new c70(1, null);
        c70Var.a("");
        c70Var.f32584i = 1.8f;
        xp xpVar = new xp(aVar, c70Var, 0, 0);
        xpVar.f40447x = true;
        k9Var.setImageDrawable(xpVar);
    }
}
