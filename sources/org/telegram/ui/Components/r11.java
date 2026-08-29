package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r11 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f32158a;
    public final t9 f32159b;
    public final y80 f32160c;
    public final y80 d;
    public int f32161e;
    public int f32162f;

    public r11(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f32161e = 90;
        this.f32158a = c6Var;
        setOrientation(1);
        t9 t9Var = new t9(context);
        this.f32159b = t9Var;
        t9Var.getImageReceiver().setAutoRepeatCount(1);
        t9Var.getImageReceiver().setAutoRepeat(1);
        t9Var.setOnClickListener(new u70(this, 22));
        addView(t9Var, i7.f6.t(90, 90, 17, 0, 9, 0, 9));
        y80 y80Var = new y80(context, null);
        this.f32160c = y80Var;
        y80Var.setTextSize(1, 20.0f);
        y80Var.setGravity(17);
        y80Var.setTypeface(AndroidUtilities.bold());
        y80Var.setTextAlignment(4);
        addView(y80Var, i7.f6.t(-1, -2, 17, 48, 0, 48, 10));
        y80 y80Var2 = new y80(context, null);
        this.d = y80Var2;
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setGravity(17);
        y80Var2.setTextAlignment(4);
        addView(y80Var2, i7.f6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f32158a;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        y80 y80Var = this.f32160c;
        y80Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.g6.gc;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        if (y80Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.g6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        y80 y80Var2 = this.d;
        y80Var2.setTextColor(v03);
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        int i13 = this.f32161e;
        if (y80Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f32159b.setLayoutParams(i7.f6.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f32162f != i10) {
            this.f32162f = i10;
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(90.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(90.0f));
            t9 t9Var = this.f32159b;
            t9Var.setImageDrawable(xi0Var);
            t9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f32161e != i10) {
            this.f32161e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f32162f != i10) {
            t9 t9Var = this.f32159b;
            t9Var.b();
            this.f32162f = i10;
            t9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32160c.setVisibility(8);
        y80 y80Var = this.d;
        y80Var.setText(charSequence);
        y80Var.setMaxWidth(nh.t3.a(charSequence, y80Var.getPaint()));
        y80Var.requestLayout();
        e();
    }
}
