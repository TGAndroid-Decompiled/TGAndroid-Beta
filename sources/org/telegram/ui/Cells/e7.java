package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.u70;
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f30567a;
    public final b7 f30568b;
    public final TextView f30569c;
    public long d;
    public long f30570e;
    public final int f30571f;
    public final org.telegram.ui.ActionBar.i6 h;

    public e7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30571f = j10.f24773t0;
        this.h = i6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30567a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(q9Var, c8.ma.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30569c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f30568b = new b7(this, i6Var, 1);
        int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f30570e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2131745240;
        } else {
            i7 = 2131745239;
        }
        this.f30569c.setText(gd.M0(i7, null));
        org.telegram.ui.Components.q9 q9Var = this.f30567a;
        q9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f56132k[0]);
        u70 u70Var = new u70(1, null);
        u70Var.a("");
        u70Var.f40247i = 1.8f;
        mq mqVar = new mq(aVar, u70Var, 0, 0);
        mqVar.f37616x = true;
        q9Var.setImageDrawable(mqVar);
    }
}
