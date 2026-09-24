package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m21 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26333a;
    public final w9 f26334b;
    public final n90 f26335c;
    public final n90 d;
    public int e;
    public int f26336f;

    public m21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f26333a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f26334b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new i80(this, 22));
        addView(w9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        n90 n90Var = new n90(context, null);
        this.f26335c = n90Var;
        n90Var.setTextSize(1, 20.0f);
        n90Var.setGravity(17);
        n90Var.setTypeface(AndroidUtilities.bold());
        n90Var.setTextAlignment(4);
        addView(n90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        n90 n90Var2 = new n90(context, null);
        this.d = n90Var2;
        n90Var2.setTextSize(1, 14.0f);
        n90Var2.setGravity(17);
        n90Var2.setTextAlignment(4);
        addView(n90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26333a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        n90 n90Var = this.f26335c;
        n90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (n90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        n90 n90Var2 = this.d;
        n90Var2.setTextColor(v03);
        n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        int i13 = this.e;
        if (n90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26334b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26336f != i10) {
            this.f26336f = i10;
            ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f26334b;
            w9Var.setImageDrawable(ij0Var);
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
        if (this.f26336f != i10) {
            w9 w9Var = this.f26334b;
            w9Var.b();
            this.f26336f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26335c.setVisibility(8);
        n90 n90Var = this.d;
        n90Var.setText(charSequence);
        n90Var.setMaxWidth(ci.e4.a(charSequence, n90Var.getPaint()));
        n90Var.requestLayout();
        e();
    }
}
