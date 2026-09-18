package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f22297a;
    public final u9 f22298b;
    public final c90 f22299c;
    public final c90 d;
    public int e;
    public int f22300f;

    public a21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.f22297a = f6Var;
        setOrientation(1);
        u9 u9Var = new u9(context);
        this.f22298b = u9Var;
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        u9Var.getImageReceiver().setAutoRepeat(1);
        u9Var.setOnClickListener(new x70(this, 22));
        addView(u9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        c90 c90Var = new c90(context, null);
        this.f22299c = c90Var;
        c90Var.setTextSize(1, 20.0f);
        c90Var.setGravity(17);
        c90Var.setTypeface(AndroidUtilities.bold());
        c90Var.setTextAlignment(4);
        addView(c90Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        c90 c90Var2 = new c90(context, null);
        this.d = c90Var2;
        c90Var2.setTextSize(1, 14.0f);
        c90Var2.setGravity(17);
        c90Var2.setTextAlignment(4);
        addView(c90Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22297a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        c90 c90Var = this.f22299c;
        c90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (c90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        c90 c90Var2 = this.d;
        c90Var2.setTextColor(v03);
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        int i13 = this.e;
        if (c90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f22298b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f22300f != i10) {
            this.f22300f = i10;
            yi0 yi0Var = new yi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            u9 u9Var = this.f22298b;
            u9Var.setImageDrawable(yi0Var);
            u9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f22300f != i10) {
            u9 u9Var = this.f22298b;
            u9Var.b();
            this.f22300f = i10;
            u9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f22299c.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setText(charSequence);
        c90Var.setMaxWidth(ci.f4.a(charSequence, c90Var.getPaint()));
        c90Var.requestLayout();
        e();
    }
}
