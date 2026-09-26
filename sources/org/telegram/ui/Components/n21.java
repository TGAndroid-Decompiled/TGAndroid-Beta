package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n21 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26653a;
    public final w9 f26654b;
    public final o90 f26655c;
    public final o90 d;
    public int e;
    public int f26656f;

    public n21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f26653a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f26654b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new j80(this, 22));
        addView(w9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        o90 o90Var = new o90(context, null);
        this.f26655c = o90Var;
        o90Var.setTextSize(1, 20.0f);
        o90Var.setGravity(17);
        o90Var.setTypeface(AndroidUtilities.bold());
        o90Var.setTextAlignment(4);
        addView(o90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        o90 o90Var2 = new o90(context, null);
        this.d = o90Var2;
        o90Var2.setTextSize(1, 14.0f);
        o90Var2.setGravity(17);
        o90Var2.setTextAlignment(4);
        addView(o90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26653a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        o90 o90Var = this.f26655c;
        o90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (o90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        o90 o90Var2 = this.d;
        o90Var2.setTextColor(v03);
        o90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        int i13 = this.e;
        if (o90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26654b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26656f != i10) {
            this.f26656f = i10;
            jj0 jj0Var = new jj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f26654b;
            w9Var.setImageDrawable(jj0Var);
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
        if (this.f26656f != i10) {
            w9 w9Var = this.f26654b;
            w9Var.b();
            this.f26656f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26655c.setVisibility(8);
        o90 o90Var = this.d;
        o90Var.setText(charSequence);
        o90Var.setMaxWidth(ci.e4.a(charSequence, o90Var.getPaint()));
        o90Var.requestLayout();
        e();
    }
}
