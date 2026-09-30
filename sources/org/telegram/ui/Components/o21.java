package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o21 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26909a;
    public final w9 f26910b;
    public final p90 f26911c;
    public final p90 d;
    public int e;
    public int f26912f;

    public o21(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 90;
        this.f26909a = d6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f26910b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new k80(this, 22));
        addView(w9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        p90 p90Var = new p90(context, null);
        this.f26911c = p90Var;
        p90Var.setTextSize(1, 20.0f);
        p90Var.setGravity(17);
        p90Var.setTypeface(AndroidUtilities.bold());
        p90Var.setTextAlignment(4);
        addView(p90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        p90 p90Var2 = new p90(context, null);
        this.d = p90Var2;
        p90Var2.setTextSize(1, 14.0f);
        p90Var2.setGravity(17);
        p90Var2.setTextAlignment(4);
        addView(p90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26909a;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        p90 p90Var = this.f26911c;
        p90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (p90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        p90 p90Var2 = this.d;
        p90Var2.setTextColor(v03);
        p90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        int i13 = this.e;
        if (p90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26910b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26912f != i10) {
            this.f26912f = i10;
            kj0 kj0Var = new kj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f26910b;
            w9Var.setImageDrawable(kj0Var);
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
        if (this.f26912f != i10) {
            w9 w9Var = this.f26910b;
            w9Var.b();
            this.f26912f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26911c.setVisibility(8);
        p90 p90Var = this.d;
        p90Var.setText(charSequence);
        p90Var.setMaxWidth(ci.e4.a(charSequence, p90Var.getPaint()));
        p90Var.requestLayout();
        e();
    }
}
