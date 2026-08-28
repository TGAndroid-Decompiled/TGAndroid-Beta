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
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final int f27309a;
    public final org.telegram.ui.ActionBar.b6 f27310b;
    public int f27311c;
    public boolean d;
    public TL_aicompose.AiComposeTone f27312e;
    public boolean f27313f;
    public final o9 h;
    public final TextView f27314n;
    public float f27315r;

    public c0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = true;
        this.f27309a = i9;
        this.f27310b = b6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        o9 o9Var = new o9(context);
        this.h = o9Var;
        NotificationCenter.listenEmojiLoading(o9Var);
        linearLayout.addView(o9Var, g7.e6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f27314n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, g7.e6.t(-2, -2, 49, 0, 2, 0, 0));
        g7.g6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f10 - this.f27315r) < 0.01f) {
            return;
        }
        this.f27315r = f10;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f27310b;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        int d = i0.a.d(f10, v02, org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        int d9 = i0.a.d(f10, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (!this.f27313f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        o9 o9Var = this.h;
        o9Var.setColorFilter(porterDuffColorFilter);
        o9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        o9Var.invalidate();
        this.f27314n.setTextColor(d9);
    }

    @Override
    public final void d() {
        int v02;
        a(this.f27315r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.b6 b6Var = this.f27310b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var);
        }
        int i9 = this.f27311c;
        setBackground(org.telegram.ui.ActionBar.f6.Y(v02, i9, i9));
    }

    public int[] getColorKeys() {
        return null;
    }
}
