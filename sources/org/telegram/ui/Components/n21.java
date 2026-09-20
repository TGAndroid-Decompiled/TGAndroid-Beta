package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class n21 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f26545a;
    public final v9 f26546b;
    public final k90 f26547c;
    public final k90 d;
    public int e;
    public int f26548f;

    public n21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.f26545a = f6Var;
        setOrientation(1);
        v9 v9Var = new v9(context);
        this.f26546b = v9Var;
        v9Var.getImageReceiver().setAutoRepeatCount(1);
        v9Var.getImageReceiver().setAutoRepeat(1);
        v9Var.setOnClickListener(new f80(this, 22));
        addView(v9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        k90 k90Var = new k90(context, null);
        this.f26547c = k90Var;
        k90Var.setTextSize(1, 20.0f);
        k90Var.setGravity(17);
        k90Var.setTypeface(AndroidUtilities.bold());
        k90Var.setTextAlignment(4);
        addView(k90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        k90 k90Var2 = new k90(context, null);
        this.d = k90Var2;
        k90Var2.setTextSize(1, 14.0f);
        k90Var2.setGravity(17);
        k90Var2.setTextAlignment(4);
        addView(k90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26545a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        k90 k90Var = this.f26547c;
        k90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (k90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        k90 k90Var2 = this.d;
        k90Var2.setTextColor(v03);
        k90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        int i13 = this.e;
        if (k90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26546b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26548f != i10) {
            this.f26548f = i10;
            hj0 hj0Var = new hj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            v9 v9Var = this.f26546b;
            v9Var.setImageDrawable(hj0Var);
            v9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f26548f != i10) {
            v9 v9Var = this.f26546b;
            v9Var.b();
            this.f26548f = i10;
            v9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26547c.setVisibility(8);
        k90 k90Var = this.d;
        k90Var.setText(charSequence);
        k90Var.setMaxWidth(ci.f4.a(charSequence, k90Var.getPaint()));
        k90Var.requestLayout();
        e();
    }
}
