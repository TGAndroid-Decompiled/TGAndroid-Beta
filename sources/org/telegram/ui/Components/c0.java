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
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f25045a;
    public final org.telegram.ui.ActionBar.d6 f25046b;
    public int f25047c;
    public boolean d;
    public TL_aicompose.AiComposeTone f25048e;
    public boolean f25049f;
    public final y9 h;
    public final TextView f25050n;
    public float f25051r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = true;
        this.f25045a = i10;
        this.f25046b = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.a(-2.0f, 0.0f, 2.0f, 0.0f, 2.0f, -2, 17));
        y9 y9Var = new y9(context);
        this.h = y9Var;
        NotificationCenter.listenEmojiLoading(y9Var);
        linearLayout.addView(y9Var, w7.x5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f25050n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.z5.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f25051r) < 0.01f) {
            return;
        }
        this.f25051r = f7;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25046b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int d = i0.a.d(f7, w02, org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        if (!this.f25049f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        y9 y9Var = this.h;
        y9Var.setColorFilter(porterDuffColorFilter);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        y9Var.invalidate();
        this.f25050n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int w02;
        a(this.f25051r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25046b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var);
        }
        int i10 = this.f25047c;
        setBackground(org.telegram.ui.ActionBar.h6.Z(w02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}
