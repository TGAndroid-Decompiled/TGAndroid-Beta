package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;
public final class d0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f32835a;
    public final org.telegram.ui.ActionBar.h6 f32836b;
    public int f32837c;
    public boolean d;
    public TL_aicompose.AiComposeTone f32838e;
    public boolean f32839f;
    public final k9 h;
    public final TextView f32840n;
    public float f32841r;

    public d0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = true;
        this.f32835a = i7;
        this.f32836b = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        k9 k9Var = new k9(context);
        this.h = k9Var;
        org.telegram.messenger.qs.i(k9Var);
        linearLayout.addView(k9Var, c8.ha.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f32840n = textView;
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
        if (!z9 && Math.abs(f10 - this.f32841r) < 0.01f) {
            return;
        }
        this.f32841r = f10;
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32836b;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.m6.w0(i7, h6Var), org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        if (!this.f32839f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        k9 k9Var = this.h;
        k9Var.setColorFilter(porterDuffColorFilter);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
        this.f32840n.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(true, this.f32841r);
        boolean z9 = this.d;
        org.telegram.ui.ActionBar.h6 h6Var = this.f32836b;
        if (z9) {
            w02 = org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27982i6, h6Var);
        }
        int i7 = this.f32837c;
        setBackground(org.telegram.ui.ActionBar.m6.a0(w02, i7, i7));
    }
}
