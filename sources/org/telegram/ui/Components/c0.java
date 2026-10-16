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
    public final int f23588a;
    public final org.telegram.ui.ActionBar.c6 f23589b;
    public int f23590c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f23591f;
    public final z9 h;
    public final TextView f23592n;
    public float f23593r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = true;
        this.f23588a = i10;
        this.f23589b = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.a(-2.0f, 0.0f, 2.0f, 0.0f, 2.0f, -2, 17));
        z9 z9Var = new z9(context);
        this.h = z9Var;
        NotificationCenter.listenEmojiLoading(z9Var);
        linearLayout.addView(z9Var, w7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f23592n = textView;
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
        if (!z10 && Math.abs(f7 - this.f23593r) < 0.01f) {
            return;
        }
        this.f23593r = f7;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23589b;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int d = i0.a.d(f7, w02, org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.g6.w0(i10, c6Var), org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        if (!this.f23591f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        z9 z9Var = this.h;
        z9Var.setColorFilter(porterDuffColorFilter);
        z9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        z9Var.invalidate();
        this.f23592n.setTextColor(d10);
    }

    @Override
    public final void d() {
        int w02;
        a(this.f23593r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23589b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var);
        }
        int i10 = this.f23590c;
        setBackground(org.telegram.ui.ActionBar.g6.Z(w02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}
