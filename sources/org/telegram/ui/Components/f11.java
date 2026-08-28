package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f11 extends LinearLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f28230a;
    public final o9 f28231b;
    public final l80 f28232c;
    public final l80 d;
    public int f28233e;
    public int f28234f;

    public f11(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f28233e = 90;
        this.f28230a = b6Var;
        setOrientation(1);
        o9 o9Var = new o9(context);
        this.f28231b = o9Var;
        o9Var.getImageReceiver().setAutoRepeatCount(1);
        o9Var.getImageReceiver().setAutoRepeat(1);
        o9Var.setOnClickListener(new h70(this, 22));
        addView(o9Var, g7.e6.t(90, 90, 17, 0, 9, 0, 9));
        l80 l80Var = new l80(context, null);
        this.f28232c = l80Var;
        l80Var.setTextSize(1, 20.0f);
        l80Var.setGravity(17);
        l80Var.setTypeface(AndroidUtilities.bold());
        l80Var.setTextAlignment(4);
        addView(l80Var, g7.e6.t(-1, -2, 17, 48, 0, 48, 10));
        l80 l80Var2 = new l80(context, null);
        this.d = l80Var2;
        l80Var2.setTextSize(1, 14.0f);
        l80Var2.setGravity(17);
        l80Var2.setTextAlignment(4);
        addView(l80Var2, g7.e6.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    @Override
    public final void d() {
        int i9;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f28230a;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        l80 l80Var = this.f28232c;
        l80Var.setTextColor(v02);
        int i11 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        if (l80Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.f6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        l80 l80Var2 = this.d;
        l80Var2.setTextColor(v03);
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        int i12 = this.f28233e;
        if (l80Var.getVisibility() == 0) {
            i9 = 0;
        } else {
            i9 = 9;
        }
        this.f28231b.setLayoutParams(g7.e6.t(i12, i12, 17, 0, i9, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setEmoji(int i9) {
        if (this.f28234f != i9) {
            this.f28234f = i9;
            mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(90.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(90.0f));
            o9 o9Var = this.f28231b;
            o9Var.setImageDrawable(mi0Var);
            o9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i9) {
        if (this.f28233e != i9) {
            this.f28233e = i9;
            d();
        }
    }

    public void setEmojiStatic(int i9) {
        if (this.f28234f != i9) {
            o9 o9Var = this.f28231b;
            o9Var.b();
            this.f28234f = i9;
            o9Var.setImageResource(i9);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f28232c.setVisibility(8);
        l80 l80Var = this.d;
        l80Var.setText(charSequence);
        l80Var.setMaxWidth(kh.x3.a(charSequence, l80Var.getPaint()));
        l80Var.requestLayout();
        d();
    }
}
