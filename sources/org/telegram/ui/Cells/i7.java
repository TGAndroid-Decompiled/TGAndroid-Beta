package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.z70;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.Components.g9 f22043a;
    public final f7 f22044b;
    public final TextView f22045c;
    public long d;
    public long e;
    public final int f22046f;
    public final org.telegram.ui.ActionBar.p6 h;

    public i7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f22046f = e20.f15506s0;
        this.h = p6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f22043a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
        addView(g9Var, w7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f22045c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.b6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.f22044b = new f7(this, p6Var, 1);
        int i10 = org.telegram.ui.ActionBar.t6.f21021i6;
        Drawable a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.x0(null, i10, false), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(103.0f), 1073741824));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2131745453;
        } else {
            i10 = 2131745452;
        }
        this.f22045c.setText(dd.L0(i10, null));
        org.telegram.ui.Components.g9 g9Var = this.f22043a;
        g9Var.setAnimatedEmojiDrawable(null);
        gg.a aVar = new gg.a(gg.a.f7493k[0]);
        z70 z70Var = new z70(1, null);
        z70Var.a("");
        z70Var.f33064i = 1.8f;
        eq eqVar = new eq(aVar, z70Var, 0, 0);
        eqVar.f25909x = true;
        g9Var.setImageDrawable(eqVar);
    }
}
