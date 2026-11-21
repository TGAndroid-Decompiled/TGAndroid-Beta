package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.w70;
public final class f7 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f30647a;
    public final c7 f30648b;
    public final TextView f30649c;
    public long d;
    public long f30650e;
    public final int f30651f;
    public final org.telegram.ui.ActionBar.h6 h;

    public f7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30651f = j10.f24798t0;
        this.h = h6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30647a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(q9Var, c8.ma.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30649c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f30648b = new c7(this, h6Var, 1);
        int i7 = org.telegram.ui.ActionBar.m6.f29470i6;
        Drawable a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f30650e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2131745239;
        } else {
            i7 = 2131745238;
        }
        this.f30649c.setText(gd.N0(i7, null));
        org.telegram.ui.Components.q9 q9Var = this.f30647a;
        q9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f56173k[0]);
        w70 w70Var = new w70(1, null);
        w70Var.a("");
        w70Var.f41695i = 1.8f;
        oq oqVar = new oq(aVar, w70Var, 0, 0);
        oqVar.f38345x = true;
        q9Var.setImageDrawable(oqVar);
    }
}
