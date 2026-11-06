package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class d01 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f32739a;
    public final l9 f32740b;
    public final w70 f32741c;
    public final w70 d;
    public int f32742e;
    public int f32743f;

    public d01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f32742e = 90;
        this.f32739a = f6Var;
        setOrientation(1);
        l9 l9Var = new l9(context);
        this.f32740b = l9Var;
        l9Var.getImageReceiver().X(1);
        l9Var.getImageReceiver().W(1);
        l9Var.setOnClickListener(new la0(this, 18));
        addView(l9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
        w70 w70Var = new w70(context, null);
        this.f32741c = w70Var;
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
        w70 w70Var = this.f32741c;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setEmoji(int i7) {
        if (this.f32743f != i7) {
            this.f32743f = i7;
            zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            l9 l9Var = this.f32740b;
            l9Var.setImageDrawable(zg0Var);
            l9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f32742e != i7) {
            this.f32742e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f32743f != i7) {
            l9 l9Var = this.f32740b;
            l9Var.b();
            this.f32743f = i7;
            l9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32741c.setVisibility(8);
        w70 w70Var = this.d;
        w70Var.setText(charSequence);
        w70Var.setMaxWidth(fi.m3.a(charSequence, w70Var.getPaint()));
        w70Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f32739a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        w70 w70Var = this.f32741c;
        w70Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        if (w70Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.k6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        w70 w70Var2 = this.d;
        w70Var2.setTextColor(w03);
        w70Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        int i12 = this.f32742e;
        if (w70Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f32740b.setLayoutParams(c8.ha.t(i12, i12, 17, 0, i7, 0, 9));
    }
}
