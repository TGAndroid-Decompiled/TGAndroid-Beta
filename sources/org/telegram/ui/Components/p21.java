package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p21 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f27223a;
    public final w9 f27224b;
    public final q90 f27225c;
    public final q90 d;
    public int e;
    public int f27226f;

    public p21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f27223a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f27224b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new l80(this, 22));
        addView(w9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        q90 q90Var = new q90(context, null);
        this.f27225c = q90Var;
        q90Var.setTextSize(1, 20.0f);
        q90Var.setGravity(17);
        q90Var.setTypeface(AndroidUtilities.bold());
        q90Var.setTextAlignment(4);
        addView(q90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        q90 q90Var2 = new q90(context, null);
        this.d = q90Var2;
        q90Var2.setTextSize(1, 14.0f);
        q90Var2.setGravity(17);
        q90Var2.setTextAlignment(4);
        addView(q90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27223a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        q90 q90Var = this.f27225c;
        q90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (q90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        q90 q90Var2 = this.d;
        q90Var2.setTextColor(v03);
        q90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        int i13 = this.e;
        if (q90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f27224b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f27226f != i10) {
            this.f27226f = i10;
            lj0 lj0Var = new lj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f27224b;
            w9Var.setImageDrawable(lj0Var);
            w9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f27226f != i10) {
            w9 w9Var = this.f27224b;
            w9Var.b();
            this.f27226f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f27225c.setVisibility(8);
        q90 q90Var = this.d;
        q90Var.setText(charSequence);
        q90Var.setMaxWidth(ci.e4.a(charSequence, q90Var.getPaint()));
        q90Var.requestLayout();
        e();
    }
}
