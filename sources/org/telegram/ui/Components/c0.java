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
    public final int f25094a;
    public final org.telegram.ui.ActionBar.d6 f25095b;
    public int f25096c;
    public boolean d;
    public TL_aicompose.AiComposeTone f25097e;
    public boolean f25098f;
    public final w9 h;
    public final TextView f25099n;
    public float f25100r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = true;
        this.f25094a = i10;
        this.f25095b = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        w9 w9Var = new w9(context);
        this.h = w9Var;
        NotificationCenter.listenEmojiLoading(w9Var);
        linearLayout.addView(w9Var, w7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f25099n = textView;
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
        if (!z10 && Math.abs(f7 - this.f25100r) < 0.01f) {
            return;
        }
        this.f25100r = f7;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25095b;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.i6.v0(i10, d6Var), org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        if (!this.f25098f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        w9 w9Var = this.h;
        w9Var.setColorFilter(porterDuffColorFilter);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
        this.f25099n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f25100r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25095b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, d6Var);
        }
        int i10 = this.f25096c;
        setBackground(org.telegram.ui.ActionBar.i6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}
