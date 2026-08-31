package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c21 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f25758a;
    public final p9 f25759b;
    public final g90 f25760c;
    public final g90 d;
    public int f25761e;
    public int f25762f;

    public c21(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25761e = 90;
        this.f25758a = g6Var;
        setOrientation(1);
        p9 p9Var = new p9(context);
        this.f25759b = p9Var;
        p9Var.getImageReceiver().setAutoRepeatCount(1);
        p9Var.getImageReceiver().setAutoRepeat(1);
        p9Var.setOnClickListener(new b80(this, 22));
        addView(p9Var, k7.c6.t(90, 90, 17, 0, 9, 0, 9));
        g90 g90Var = new g90(context, null);
        this.f25760c = g90Var;
        g90Var.setTextSize(1, 20.0f);
        g90Var.setGravity(17);
        g90Var.setTypeface(AndroidUtilities.bold());
        g90Var.setTextAlignment(4);
        addView(g90Var, k7.c6.t(-1, -2, 17, 48, 0, 48, 10));
        g90 g90Var2 = new g90(context, null);
        this.d = g90Var2;
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setGravity(17);
        g90Var2.setTextAlignment(4);
        addView(g90Var2, k7.c6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25758a;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        g90 g90Var = this.f25760c;
        g90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.k6.f21720gc;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        if (g90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.k6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        g90 g90Var2 = this.d;
        g90Var2.setTextColor(v03);
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        int i13 = this.f25761e;
        if (g90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f25759b.setLayoutParams(k7.c6.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f25762f != i10) {
            this.f25762f = i10;
            ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(90.0f), l.d.j(i10, ""), AndroidUtilities.dp(90.0f));
            p9 p9Var = this.f25759b;
            p9Var.setImageDrawable(ij0Var);
            p9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f25761e != i10) {
            this.f25761e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f25762f != i10) {
            p9 p9Var = this.f25759b;
            p9Var.b();
            this.f25762f = i10;
            p9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25760c.setVisibility(8);
        g90 g90Var = this.d;
        g90Var.setText(charSequence);
        g90Var.setMaxWidth(qh.f3.a(charSequence, g90Var.getPaint()));
        g90Var.requestLayout();
        e();
    }
}
