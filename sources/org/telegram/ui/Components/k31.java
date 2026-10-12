package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k31 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f27742a;
    public final y9 f27743b;
    public final ia0 f27744c;
    public final ia0 d;
    public int f27745e;
    public int f27746f;

    public k31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27745e = 90;
        this.f27742a = c6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f27743b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new f90(this, 22));
        addView(y9Var, w7.w5.t(90, 90, 17, 0, 9, 0, 9));
        ia0 ia0Var = new ia0(context, null);
        this.f27744c = ia0Var;
        ia0Var.setTextSize(1, 20.0f);
        ia0Var.setGravity(17);
        ia0Var.setTypeface(AndroidUtilities.bold());
        ia0Var.setTextAlignment(4);
        addView(ia0Var, w7.w5.t(-1, -2, 17, 48, 0, 48, 10));
        ia0 ia0Var2 = new ia0(context, null);
        this.d = ia0Var2;
        ia0Var2.setTextSize(1, 14.0f);
        ia0Var2.setGravity(17);
        ia0Var2.setTextAlignment(4);
        addView(ia0Var2, w7.w5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        ia0 ia0Var = this.f27744c;
        ia0Var.setText(charSequence);
        ia0Var.setVisibility(0);
        ia0 ia0Var2 = this.d;
        ia0Var2.setText(charSequence2);
        ia0Var2.setMaxWidth(ci.d4.a(charSequence2, ia0Var2.getPaint()));
        ia0Var2.requestLayout();
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27742a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        ia0 ia0Var = this.f27744c;
        ia0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        if (ia0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        ia0 ia0Var2 = this.d;
        ia0Var2.setTextColor(w03);
        ia0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        int i13 = this.f27745e;
        if (ia0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f27743b.setLayoutParams(w7.w5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f27746f != i10) {
            this.f27746f = i10;
            fk0 fk0Var = new fk0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f27743b;
            y9Var.setImageDrawable(fk0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f27745e != i10) {
            this.f27745e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f27746f != i10) {
            y9 y9Var = this.f27743b;
            y9Var.b();
            this.f27746f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f27744c.setVisibility(8);
        ia0 ia0Var = this.d;
        ia0Var.setText(charSequence);
        ia0Var.setMaxWidth(ci.d4.a(charSequence, ia0Var.getPaint()));
        ia0Var.requestLayout();
        e();
    }
}
