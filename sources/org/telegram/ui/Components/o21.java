package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o21 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f26833a;
    public final w9 f26834b;
    public final l90 f26835c;
    public final l90 d;
    public int e;
    public int f26836f;

    public o21(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 90;
        this.f26833a = e6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f26834b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new g80(this, 22));
        addView(w9Var, w7.y5.t(90, 90, 17, 0, 9, 0, 9));
        l90 l90Var = new l90(context, null);
        this.f26835c = l90Var;
        l90Var.setTextSize(1, 20.0f);
        l90Var.setGravity(17);
        l90Var.setTypeface(AndroidUtilities.bold());
        l90Var.setTextAlignment(4);
        addView(l90Var, w7.y5.t(-1, -2, 17, 48, 0, 48, 10));
        l90 l90Var2 = new l90(context, null);
        this.d = l90Var2;
        l90Var2.setTextSize(1, 14.0f);
        l90Var2.setGravity(17);
        l90Var2.setTextAlignment(4);
        addView(l90Var2, w7.y5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f26833a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        l90 l90Var = this.f26835c;
        l90Var.setTextColor(v02);
        int i12 = org.telegram.ui.ActionBar.j6.gc;
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        if (l90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.j6.B6;
        }
        int v03 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        l90 l90Var2 = this.d;
        l90Var2.setTextColor(v03);
        l90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        int i13 = this.e;
        if (l90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26834b.setLayoutParams(w7.y5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26836f != i10) {
            this.f26836f = i10;
            ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f26834b;
            w9Var.setImageDrawable(ij0Var);
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
        if (this.f26836f != i10) {
            w9 w9Var = this.f26834b;
            w9Var.b();
            this.f26836f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26835c.setVisibility(8);
        l90 l90Var = this.d;
        l90Var.setText(charSequence);
        l90Var.setMaxWidth(ci.f4.a(charSequence, l90Var.getPaint()));
        l90Var.requestLayout();
        e();
    }
}
