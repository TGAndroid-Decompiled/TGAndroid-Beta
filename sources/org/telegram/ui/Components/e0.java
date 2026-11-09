package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f33239a;
    public final org.telegram.ui.ActionBar.g6 f33240b;
    public int f33241c;
    public boolean d;
    public TL_aicompose.AiComposeTone f33242e;
    public boolean f33243f;
    public final l9 h;
    public final TextView f33244n;
    public float f33245r;

    public e0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f33239a = i7;
        this.f33240b = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        l9 l9Var = new l9(context);
        this.h = l9Var;
        org.telegram.messenger.qs.i(l9Var);
        linearLayout.addView(l9Var, c8.ha.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f33244n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.ha.t(-2, -2, 49, 0, 2, 0, 0));
        c8.ka.b(this, 0.05f, 1.5f);
        a(true, 0.0f);
    }

    public final void a(boolean z9, float f10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z9 && Math.abs(f10 - this.f33245r) < 0.01f) {
            return;
        }
        this.f33245r = f10;
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33240b;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int i10 = org.telegram.ui.ActionBar.l6.Ci;
        int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.l6.w0(i7, g6Var), org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        if (!this.f33243f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        l9 l9Var = this.h;
        l9Var.setColorFilter(porterDuffColorFilter);
        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        l9Var.invalidate();
        this.f33244n.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(true, this.f33245r);
        boolean z9 = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33240b;
        if (z9) {
            w02 = org.telegram.ui.ActionBar.l6.r1(0.1f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27957i6, g6Var);
        }
        int i7 = this.f33241c;
        setBackground(org.telegram.ui.ActionBar.l6.a0(w02, i7, i7));
    }
}
