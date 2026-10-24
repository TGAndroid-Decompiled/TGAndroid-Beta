package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class z21 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f33135a;
    public final u9 f33136b;
    public final w90 f33137c;
    public final w90 d;
    public int e;
    public int f33138f;

    public z21(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 90;
        this.f33135a = g6Var;
        setOrientation(1);
        u9 u9Var = new u9(context);
        this.f33136b = u9Var;
        u9Var.getImageReceiver().setAutoRepeatCount(1);
        u9Var.getImageReceiver().setAutoRepeat(1);
        u9Var.setOnClickListener(new t80(this, 21));
        addView(u9Var, w7.z5.t(90, 90, 17, 0, 9, 0, 9));
        w90 w90Var = new w90(context, null);
        this.f33137c = w90Var;
        w90Var.setTextSize(1, 20.0f);
        w90Var.setGravity(17);
        w90Var.setTypeface(AndroidUtilities.bold());
        w90Var.setTextAlignment(4);
        addView(w90Var, w7.z5.t(-1, -2, 17, 48, 0, 48, 10));
        w90 w90Var2 = new w90(context, null);
        this.d = w90Var2;
        w90Var2.setTextSize(1, 14.0f);
        w90Var2.setGravity(17);
        w90Var2.setTextAlignment(4);
        addView(w90Var2, w7.z5.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        w90 w90Var = this.f33137c;
        w90Var.setText(charSequence);
        w90Var.setVisibility(0);
        w90 w90Var2 = this.d;
        w90Var2.setText(charSequence2);
        w90Var2.setMaxWidth(ei.x3.a(charSequence2, w90Var2.getPaint()));
        w90Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21243gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f33138f != i10) {
            this.f33138f = i10;
            xj0 xj0Var = new xj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            u9 u9Var = this.f33136b;
            u9Var.setImageDrawable(xj0Var);
            u9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            updateColors();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f33138f != i10) {
            u9 u9Var = this.f33136b;
            u9Var.b();
            this.f33138f = i10;
            u9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f33137c.setVisibility(8);
        w90 w90Var = this.d;
        w90Var.setText(charSequence);
        w90Var.setMaxWidth(ei.x3.a(charSequence, w90Var.getPaint()));
        w90Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33135a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        w90 w90Var = this.f33137c;
        w90Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.k6.f21243gc;
        w90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        if (w90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.k6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        w90 w90Var2 = this.d;
        w90Var2.setTextColor(w03);
        w90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        int i13 = this.e;
        if (w90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f33136b.setLayoutParams(w7.z5.t(i13, i13, 17, 0, i10, 0, 9));
    }
}
