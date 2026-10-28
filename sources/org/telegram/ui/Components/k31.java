package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class k31 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f29850a;
    public final y9 f29851b;
    public final aa0 f29852c;
    public final aa0 d;
    public int e;
    public int f29853f;

    public k31(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = 90;
        this.f29850a = u6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f29851b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new x80(this, 20));
        addView(y9Var, kb1.x(90, 90, 17, 0, 9, 0, 9));
        aa0 aa0Var = new aa0(context, null);
        this.f29852c = aa0Var;
        aa0Var.setTextSize(1, 20.0f);
        aa0Var.setGravity(17);
        aa0Var.setTypeface(AndroidUtilities.bold());
        aa0Var.setTextAlignment(4);
        addView(aa0Var, kb1.x(-1, -2, 17, 48, 0, 48, 10));
        aa0 aa0Var2 = new aa0(context, null);
        this.d = aa0Var2;
        aa0Var2.setTextSize(1, 14.0f);
        aa0Var2.setGravity(17);
        aa0Var2.setTextAlignment(4);
        addView(aa0Var2, kb1.x(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        aa0 aa0Var = this.f29852c;
        aa0Var.setText(charSequence);
        aa0Var.setVisibility(0);
        aa0 aa0Var2 = this.d;
        aa0Var2.setText(charSequence2);
        aa0Var2.setMaxWidth(fi.v3.a(charSequence2, aa0Var2.getPaint()));
        aa0Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f29853f != i10) {
            this.f29853f = i10;
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f29851b;
            y9Var.setImageDrawable(yj0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            updateColors();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f29853f != i10) {
            y9 y9Var = this.f29851b;
            y9Var.b();
            this.f29853f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f29852c.setVisibility(8);
        aa0 aa0Var = this.d;
        aa0Var.setText(charSequence);
        aa0Var.setMaxWidth(fi.v3.a(charSequence, aa0Var.getPaint()));
        aa0Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f29850a;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        aa0 aa0Var = this.f29852c;
        aa0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.y6.gc;
        aa0Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        if (aa0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.y6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        aa0 aa0Var2 = this.d;
        aa0Var2.setTextColor(w03);
        aa0Var2.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        int i13 = this.e;
        if (aa0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f29851b.setLayoutParams(kb1.x(i13, i13, 17, 0, i10, 0, 9));
    }
}
