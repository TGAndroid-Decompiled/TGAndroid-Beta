package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f25383a;
    public final w9 f25384b;
    public final m90 f25385c;
    public final m90 d;
    public int e;
    public int f25386f;

    public n21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.f25383a = f6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f25384b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new g80(this, 22));
        addView(w9Var, w7.a6.t(90, 90, 17, 0, 9, 0, 9));
        m90 m90Var = new m90(context, null);
        this.f25385c = m90Var;
        m90Var.setTextSize(1, 20.0f);
        m90Var.setGravity(17);
        m90Var.setTypeface(AndroidUtilities.bold());
        m90Var.setTextAlignment(4);
        addView(m90Var, w7.a6.t(-1, -2, 17, 48, 0, 48, 10));
        m90 m90Var2 = new m90(context, null);
        this.d = m90Var2;
        m90Var2.setTextSize(1, 14.0f);
        m90Var2.setGravity(17);
        m90Var2.setTextAlignment(4);
        addView(m90Var2, w7.a6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25383a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        m90 m90Var = this.f25385c;
        m90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (m90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        m90 m90Var2 = this.d;
        m90Var2.setTextColor(v03);
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        int i13 = this.e;
        if (m90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f25384b.setLayoutParams(w7.a6.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f25386f != i10) {
            this.f25386f = i10;
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f25384b;
            w9Var.setImageDrawable(hj0Var);
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
        if (this.f25386f != i10) {
            w9 w9Var = this.f25384b;
            w9Var.b();
            this.f25386f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25385c.setVisibility(8);
        m90 m90Var = this.d;
        m90Var.setText(charSequence);
        m90Var.setMaxWidth(bi.x4.a(charSequence, m90Var.getPaint()));
        m90Var.requestLayout();
        e();
    }
}
