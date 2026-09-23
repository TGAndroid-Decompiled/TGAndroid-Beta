package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y11 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f30131a;
    public final w9 f30132b;
    public final d90 f30133c;
    public final d90 d;
    public int e;
    public int f30134f;

    public y11(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f30131a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f30132b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new y70(this, 22));
        addView(w9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        d90 d90Var = new d90(context, null);
        this.f30133c = d90Var;
        d90Var.setTextSize(1, 20.0f);
        d90Var.setGravity(17);
        d90Var.setTypeface(AndroidUtilities.bold());
        d90Var.setTextAlignment(4);
        addView(d90Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        d90 d90Var2 = new d90(context, null);
        this.d = d90Var2;
        d90Var2.setTextSize(1, 14.0f);
        d90Var2.setGravity(17);
        d90Var2.setTextAlignment(4);
        addView(d90Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30131a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        d90 d90Var = this.f30133c;
        d90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (d90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        d90 d90Var2 = this.d;
        d90Var2.setTextColor(v03);
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        int i13 = this.e;
        if (d90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f30132b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f30134f != i10) {
            this.f30134f = i10;
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f30132b;
            w9Var.setImageDrawable(yi0Var);
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
        if (this.f30134f != i10) {
            w9 w9Var = this.f30132b;
            w9Var.b();
            this.f30134f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f30133c.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(ci.e4.a(charSequence, d90Var.getPaint()));
        d90Var.requestLayout();
        e();
    }
}
