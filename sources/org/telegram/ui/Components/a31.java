package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a31 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f23426a;
    public final z9 f23427b;
    public final da0 f23428c;
    public final da0 d;
    public int e;
    public int f23429f;

    public a31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 90;
        this.f23426a = c6Var;
        setOrientation(1);
        z9 z9Var = new z9(context);
        this.f23427b = z9Var;
        z9Var.getImageReceiver().setAutoRepeatCount(1);
        z9Var.getImageReceiver().setAutoRepeat(1);
        z9Var.setOnClickListener(new z80(this, 21));
        addView(z9Var, w7.a6.t(90, 90, 17, 0, 9, 0, 9));
        da0 da0Var = new da0(context, null);
        this.f23428c = da0Var;
        da0Var.setTextSize(1, 20.0f);
        da0Var.setGravity(17);
        da0Var.setTypeface(AndroidUtilities.bold());
        da0Var.setTextAlignment(4);
        addView(da0Var, w7.a6.t(-1, -2, 17, 48, 0, 48, 10));
        da0 da0Var2 = new da0(context, null);
        this.d = da0Var2;
        da0Var2.setTextSize(1, 14.0f);
        da0Var2.setGravity(17);
        da0Var2.setTextAlignment(4);
        addView(da0Var2, w7.a6.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        da0 da0Var = this.f23428c;
        da0Var.setText(charSequence);
        da0Var.setVisibility(0);
        da0 da0Var2 = this.d;
        da0Var2.setText(charSequence2);
        da0Var2.setMaxWidth(di.d4.a(charSequence2, da0Var2.getPaint()));
        da0Var2.requestLayout();
        d();
    }

    @Override
    public final void d() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23426a;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        da0 da0Var = this.f23428c;
        da0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.g6.f19960gc;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        if (da0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.g6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        da0 da0Var2 = this.d;
        da0Var2.setTextColor(w03);
        da0Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        int i13 = this.e;
        if (da0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f23427b.setLayoutParams(w7.a6.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f23429f != i10) {
            this.f23429f = i10;
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            z9 z9Var = this.f23427b;
            z9Var.setImageDrawable(yj0Var);
            z9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            d();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f23429f != i10) {
            z9 z9Var = this.f23427b;
            z9Var.b();
            this.f23429f = i10;
            z9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f23428c.setVisibility(8);
        da0 da0Var = this.d;
        da0Var.setText(charSequence);
        da0Var.setMaxWidth(di.d4.a(charSequence, da0Var.getPaint()));
        da0Var.requestLayout();
        d();
    }
}
