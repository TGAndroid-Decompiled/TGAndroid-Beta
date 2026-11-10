package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class e01 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f33120a;
    public final k9 f33121b;
    public final w70 f33122c;
    public final w70 d;
    public int f33123e;
    public int f33124f;

    public e01(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f33123e = 90;
        this.f33120a = h6Var;
        setOrientation(1);
        k9 k9Var = new k9(context);
        this.f33121b = k9Var;
        k9Var.getImageReceiver().X(1);
        k9Var.getImageReceiver().W(1);
        k9Var.setOnClickListener(new la0(this, 18));
        addView(k9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
        w70 w70Var = new w70(context, null);
        this.f33122c = w70Var;
        w70Var.setTextSize(1, 20.0f);
        w70Var.setGravity(17);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextAlignment(4);
        addView(w70Var, c8.ha.t(-1, -2, 17, 48, 0, 48, 10));
        w70 w70Var2 = new w70(context, null);
        this.d = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        w70Var2.setGravity(17);
        w70Var2.setTextAlignment(4);
        addView(w70Var2, c8.ha.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        w70 w70Var = this.f33122c;
        w70Var.setText(charSequence);
        w70Var.setVisibility(0);
        w70 w70Var2 = this.d;
        w70Var2.setText(charSequence2);
        w70Var2.setMaxWidth(fi.m3.a(charSequence2, w70Var2.getPaint()));
        w70Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setEmoji(int i7) {
        if (this.f33124f != i7) {
            this.f33124f = i7;
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            k9 k9Var = this.f33121b;
            k9Var.setImageDrawable(zg0Var);
            k9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f33123e != i7) {
            this.f33123e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f33124f != i7) {
            k9 k9Var = this.f33121b;
            k9Var.b();
            this.f33124f = i7;
            k9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f33122c.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setText(charSequence);
        w70Var.setMaxWidth(fi.m3.a(charSequence, w70Var.getPaint()));
        w70Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f33120a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        w70 w70Var = this.f33122c;
        w70Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.m6.Uc;
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        if (w70Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.m6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        w70 w70Var2 = this.d;
        w70Var2.setTextColor(w03);
        w70Var2.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        int i12 = this.f33123e;
        if (w70Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f33121b.setLayoutParams(c8.ha.t(i12, i12, 17, 0, i7, 0, 9));
    }
}
