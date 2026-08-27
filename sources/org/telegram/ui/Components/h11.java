package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class h11 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f28898a;

    public final n9 f28899b;

    public final p80 f28900c;
    public final p80 d;

    public int f28901e;

    public int f28902f;

    public h11(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28901e = 90;
        this.f28898a = c6Var;
        setOrientation(1);
        n9 n9Var = new n9(context);
        this.f28899b = n9Var;
        n9Var.getImageReceiver().setAutoRepeatCount(1);
        n9Var.getImageReceiver().setAutoRepeat(1);
        n9Var.setOnClickListener(new l70(this, 22));
        addView(n9Var, h7.z5.t(90, 90, 17, 0, 9, 0, 9));
        p80 p80Var = new p80(context, null);
        this.f28900c = p80Var;
        p80Var.setTextSize(1, 20.0f);
        p80Var.setGravity(17);
        p80Var.setTypeface(AndroidUtilities.bold());
        p80Var.setTextAlignment(4);
        addView(p80Var, h7.z5.t(-1, -2, 17, 48, 0, 48, 10));
        p80 p80Var2 = new p80(context, null);
        this.d = p80Var2;
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setGravity(17);
        p80Var2.setTextAlignment(4);
        addView(p80Var2, h7.z5.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28898a;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        p80 p80Var = this.f28900c;
        p80Var.setTextColor(iV0);
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (p80Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.g6.B6;
        }
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        p80 p80Var2 = this.d;
        p80Var2.setTextColor(iV1);
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i12 = this.f28901e;
        this.f28899b.setLayoutParams(h7.z5.t(i12, i12, 17, 0, p80Var.getVisibility() == 0 ? 0 : 9, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f28902f != i10) {
            this.f28902f = i10;
            oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(90.0f), i0.a.k(i10, ""), AndroidUtilities.dp(90.0f));
            n9 n9Var = this.f28899b;
            n9Var.setImageDrawable(oi0Var);
            n9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f28901e != i10) {
            this.f28901e = i10;
            d();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f28902f != i10) {
            n9 n9Var = this.f28899b;
            n9Var.b();
            this.f28902f = i10;
            n9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28900c.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setText(charSequence);
        p80Var.setMaxWidth(lh.w3.a(charSequence, p80Var.getPaint()));
        p80Var.requestLayout();
        d();
    }
}
