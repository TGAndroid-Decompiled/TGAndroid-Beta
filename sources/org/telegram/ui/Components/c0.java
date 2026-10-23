package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final int f25075a;
    public final org.telegram.ui.ActionBar.d6 f25076b;
    public int f25077c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f25078f;
    public final w9 h;
    public final TextView f25079n;
    public float f25080r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = true;
        this.f25075a = i10;
        this.f25076b = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        w9 w9Var = new w9(context);
        this.h = w9Var;
        NotificationCenter.listenEmojiLoading(w9Var);
        linearLayout.addView(w9Var, w7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f25079n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.z5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.b6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f25080r) < 0.01f) {
            return;
        }
        this.f25080r = f7;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25076b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int f10 = i0.a.f(f7, w02, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int f11 = i0.a.f(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        if (!this.f25078f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        w9 w9Var = this.h;
        w9Var.setColorFilter(porterDuffColorFilter);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
        this.f25079n.setTextColor(f11);
    }

    @Override
    public final void d() {
        int w02;
        a(this.f25080r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25076b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21083i6, d6Var);
        }
        int i10 = this.f25077c;
        setBackground(org.telegram.ui.ActionBar.h6.Z(w02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}
