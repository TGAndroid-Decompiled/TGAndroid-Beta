package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class y11 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f32820a;
    public final x9 f32821b;
    public final d90 f32822c;
    public final d90 d;
    public int f32823e;
    public int f32824f;

    public y11(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f32823e = 90;
        this.f32820a = f6Var;
        setOrientation(1);
        x9 x9Var = new x9(context);
        this.f32821b = x9Var;
        x9Var.getImageReceiver().setAutoRepeatCount(1);
        x9Var.getImageReceiver().setAutoRepeat(1);
        x9Var.setOnClickListener(new x70(this, 22));
        addView(x9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        d90 d90Var = new d90(context, null);
        this.f32822c = d90Var;
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
        d();
    }

    @Override
    public final void d() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32820a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        d90 d90Var = this.f32822c;
        d90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (d90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        d90 d90Var2 = this.d;
        d90Var2.setTextColor(v03);
        d90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        int i13 = this.f32823e;
        if (d90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f32821b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f32824f != i10) {
            this.f32824f = i10;
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            x9 x9Var = this.f32821b;
            x9Var.setImageDrawable(xi0Var);
            x9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f32823e != i10) {
            this.f32823e = i10;
            d();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f32824f != i10) {
            x9 x9Var = this.f32821b;
            x9Var.b();
            this.f32824f = i10;
            x9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32822c.setVisibility(8);
        d90 d90Var = this.d;
        d90Var.setText(charSequence);
        d90Var.setMaxWidth(di.f4.a(charSequence, d90Var.getPaint()));
        d90Var.requestLayout();
        d();
    }
}
