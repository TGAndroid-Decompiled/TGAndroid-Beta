package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.xp;
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.k9 f29088a;
    public final b7 f29089b;
    public final TextView f29090c;
    public long d;
    public long f29091e;
    public final int f29092f;
    public final org.telegram.ui.ActionBar.h6 h;

    public e7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f29092f = p10.f24474s0;
        this.h = h6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29088a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29090c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, h6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f29089b = new b7(this, h6Var, 1);
        int i7 = org.telegram.ui.ActionBar.m6.f27982i6;
        Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f29091e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z9) {
        int i7;
        if (z9) {
            i7 = 2131745435;
        } else {
            i7 = 2131745434;
        }
        this.f29090c.setText(id.M0(i7, null));
        org.telegram.ui.Components.k9 k9Var = this.f29088a;
        k9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f54123k[0]);
        g70 g70Var = new g70(1, null);
        g70Var.a("");
        g70Var.f33826i = 1.8f;
        xp xpVar = new xp(aVar, g70Var, 0, 0);
        xpVar.f40383x = true;
        k9Var.setImageDrawable(xpVar);
    }
}
