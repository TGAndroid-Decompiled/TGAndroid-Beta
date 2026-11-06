package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.xp;
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.l9 f29069a;
    public final b7 f29070b;
    public final TextView f29071c;
    public long d;
    public long f29072e;
    public final int f29073f;
    public final org.telegram.ui.ActionBar.f6 h;

    public e7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29073f = p10.f24459s0;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29069a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29071c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27956j5, f6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f29070b = new b7(this, f6Var, 1);
        int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f29072e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z9) {
        int i7;
        if (z9) {
            i7 = 2131745436;
        } else {
            i7 = 2131745435;
        }
        this.f29071c.setText(hd.M0(i7, null));
        org.telegram.ui.Components.l9 l9Var = this.f29069a;
        l9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f54019k[0]);
        g70 g70Var = new g70(1, null);
        g70Var.a("");
        g70Var.f33829i = 1.8f;
        xp xpVar = new xp(aVar, g70Var, 0, 0);
        xpVar.f40324x = true;
        l9Var.setImageDrawable(xpVar);
    }
}
