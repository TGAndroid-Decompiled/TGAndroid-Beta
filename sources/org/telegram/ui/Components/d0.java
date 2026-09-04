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
public final class d0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f25160a;
    public final org.telegram.ui.ActionBar.f6 f25161b;
    public int f25162c;
    public boolean d;
    public TL_aicompose.AiComposeTone f25163e;
    public boolean f25164f;
    public final x9 h;
    public final TextView f25165n;
    public float f25166r;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = true;
        this.f25160a = i10;
        this.f25161b = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        x9 x9Var = new x9(context);
        this.h = x9Var;
        NotificationCenter.listenEmojiLoading(x9Var);
        linearLayout.addView(x9Var, w7.x5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f25165n = textView;
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
        if (!z10 && Math.abs(f7 - this.f25166r) < 0.01f) {
            return;
        }
        this.f25166r = f7;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25161b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (!this.f25164f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        x9 x9Var = this.h;
        x9Var.setColorFilter(porterDuffColorFilter);
        x9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        x9Var.invalidate();
        this.f25165n.setTextColor(d10);
    }

    @Override
    public final void d() {
        int v02;
        a(this.f25166r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.f25161b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, f6Var);
        }
        int i10 = this.f25162c;
        setBackground(org.telegram.ui.ActionBar.j6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}
