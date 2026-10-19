package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v21 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f31124a;
    public final w9 f31125b;
    public final x90 f31126c;
    public final x90 d;
    public int e;
    public int f31127f;

    public v21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f31124a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f31125b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new u80(this, 21));
        addView(w9Var, w7.z5.t(90, 90, 17, 0, 9, 0, 9));
        x90 x90Var = new x90(context, null);
        this.f31126c = x90Var;
        x90Var.setTextSize(1, 20.0f);
        x90Var.setGravity(17);
        x90Var.setTypeface(AndroidUtilities.bold());
        x90Var.setTextAlignment(4);
        addView(x90Var, w7.z5.t(-1, -2, 17, 48, 0, 48, 10));
        x90 x90Var2 = new x90(context, null);
        this.d = x90Var2;
        x90Var2.setTextSize(1, 14.0f);
        x90Var2.setGravity(17);
        x90Var2.setTextAlignment(4);
        addView(x90Var2, w7.z5.t(-1, -2, 17, 48, 0, 48, 17));
        d();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        x90 x90Var = this.f31126c;
        x90Var.setText(charSequence);
        x90Var.setVisibility(0);
        x90 x90Var2 = this.d;
        x90Var2.setText(charSequence2);
        x90Var2.setMaxWidth(ei.x3.a(charSequence2, x90Var2.getPaint()));
        x90Var2.requestLayout();
        d();
    }

    @Override
    public final void d() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31124a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        x90 x90Var = this.f31126c;
        x90Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.h6.f21046gc;
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (x90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        x90 x90Var2 = this.d;
        x90Var2.setTextColor(w03);
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        int i13 = this.e;
        if (x90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f31125b.setLayoutParams(w7.z5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f31127f != i10) {
            this.f31127f = i10;
            uj0 uj0Var = new uj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f31125b;
            w9Var.setImageDrawable(uj0Var);
            w9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            d();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f31127f != i10) {
            w9 w9Var = this.f31125b;
            w9Var.b();
            this.f31127f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f31126c.setVisibility(8);
        x90 x90Var = this.d;
        x90Var.setText(charSequence);
        x90Var.setMaxWidth(ei.x3.a(charSequence, x90Var.getPaint()));
        x90Var.requestLayout();
        d();
    }
}
