package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.xp;
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.l9 f29077a;
    public final b7 f29078b;
    public final TextView f29079c;
    public long d;
    public long f29080e;
    public final int f29081f;
    public final org.telegram.ui.ActionBar.g6 h;

    public e7(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29081f = p10.f24470s0;
        this.h = g6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f29077a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f29079c = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f29078b = new b7(this, g6Var, 1);
        int i7 = org.telegram.ui.ActionBar.l6.f27957i6;
        Drawable a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.s6.j(this, a02, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f29080e;
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
        this.f29079c.setText(id.M0(i7, null));
        org.telegram.ui.Components.l9 l9Var = this.f29077a;
        l9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f54124k[0]);
        h70 h70Var = new h70(1, null);
        h70Var.a("");
        h70Var.f34226i = 1.8f;
        xp xpVar = new xp(aVar, h70Var, 0, 0);
        xpVar.f40453x = true;
        l9Var.setImageDrawable(xpVar);
    }
}
