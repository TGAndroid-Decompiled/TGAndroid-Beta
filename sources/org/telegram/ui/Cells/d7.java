package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.j70;
public final class d7 extends FrameLayout {
    public final org.telegram.ui.Components.i9 f30146a;
    public final a7 f30147b;
    public final TextView f30148c;
    public long d;
    public long f30149e;
    public final int f30150f;
    public final org.telegram.ui.ActionBar.e6 h;

    public d7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30150f = m10.f24940t0;
        this.h = e6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30146a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(i9Var, c8.ja.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30148c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ja.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f30147b = new a7(this, e6Var, 1);
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        Drawable a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.f30149e;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i7;
        if (z10) {
            i7 = 2131745435;
        } else {
            i7 = 2131745434;
        }
        this.f30148c.setText(hd.M0(i7, null));
        org.telegram.ui.Components.i9 i9Var = this.f30146a;
        i9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.f55558k[0]);
        j70 j70Var = new j70(1, null);
        j70Var.a("");
        j70Var.f35897i = 1.8f;
        fq fqVar = new fq(aVar, j70Var, 0, 0);
        fqVar.f34682x = true;
        i9Var.setImageDrawable(fqVar);
    }
}
