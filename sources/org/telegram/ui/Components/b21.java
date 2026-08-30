package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b21 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f23543a;
    public final p9 f23544b;
    public final e90 f23545c;
    public final e90 d;
    public int e;
    public int f23546f;

    public b21(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 90;
        this.f23543a = f6Var;
        setOrientation(1);
        p9 p9Var = new p9(context);
        this.f23544b = p9Var;
        p9Var.getImageReceiver().setAutoRepeatCount(1);
        p9Var.getImageReceiver().setAutoRepeat(1);
        p9Var.setOnClickListener(new z70(this, 22));
        addView(p9Var, k7.b6.t(90, 90, 17, 0, 9, 0, 9));
        e90 e90Var = new e90(context, null);
        this.f23545c = e90Var;
        e90Var.setTextSize(1, 20.0f);
        e90Var.setGravity(17);
        e90Var.setTypeface(AndroidUtilities.bold());
        e90Var.setTextAlignment(4);
        addView(e90Var, k7.b6.t(-1, -2, 17, 48, 0, 48, 10));
        e90 e90Var2 = new e90(context, null);
        this.d = e90Var2;
        e90Var2.setTextSize(1, 14.0f);
        e90Var2.setGravity(17);
        e90Var2.setTextAlignment(4);
        addView(e90Var2, k7.b6.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23543a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        e90 e90Var = this.f23545c;
        e90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.f19966gc;
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (e90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        e90 e90Var2 = this.d;
        e90Var2.setTextColor(v03);
        e90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        int i13 = this.e;
        if (e90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f23544b.setLayoutParams(k7.b6.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f23546f != i10) {
            this.f23546f = i10;
            gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(90.0f), kh.a2.j(i10, ""), AndroidUtilities.dp(90.0f));
            p9 p9Var = this.f23544b;
            p9Var.setImageDrawable(gj0Var);
            p9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f23546f != i10) {
            p9 p9Var = this.f23544b;
            p9Var.b();
            this.f23546f = i10;
            p9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f23545c.setVisibility(8);
        e90 e90Var = this.d;
        e90Var.setText(charSequence);
        e90Var.setMaxWidth(ph.f3.a(charSequence, e90Var.getPaint()));
        e90Var.requestLayout();
        e();
    }
}
