package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z11 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f30447a;
    public final u9 f30448b;
    public final c90 f30449c;
    public final c90 d;
    public int e;
    public int f30450f;

    public z11(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 90;
        this.f30447a = e6Var;
        setOrientation(1);
        u9 u9Var = new u9(context);
        this.f30448b = u9Var;
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        u9Var.getImageReceiver().setAutoRepeat(1);
        u9Var.setOnClickListener(new x70(this, 22));
        addView(u9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        c90 c90Var = new c90(context, null);
        this.f30449c = c90Var;
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
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30447a;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        c90 c90Var = this.f30449c;
        c90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        if (c90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.i6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        c90 c90Var2 = this.d;
        c90Var2.setTextColor(v03);
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        int i13 = this.e;
        if (c90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f30448b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f30450f != i10) {
            this.f30450f = i10;
            xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            u9 u9Var = this.f30448b;
            u9Var.setImageDrawable(xi0Var);
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
        if (this.f30450f != i10) {
            u9 u9Var = this.f30448b;
            u9Var.b();
            this.f30450f = i10;
            u9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f30449c.setVisibility(8);
        c90 c90Var = this.d;
        c90Var.setText(charSequence);
        c90Var.setMaxWidth(ci.f4.a(charSequence, c90Var.getPaint()));
        c90Var.requestLayout();
        e();
    }
}
