package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f25128a;
    public final org.telegram.ui.ActionBar.g6 f25129b;
    public int f25130c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f25131f;
    public final u9 h;
    public final TextView f25132n;
    public float f25133r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f25128a = i10;
        this.f25129b = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        u9 u9Var = new u9(context);
        this.h = u9Var;
        NotificationCenter.listenEmojiLoading(u9Var);
        linearLayout.addView(u9Var, w7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f25132n = textView;
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
        if (!z10 && Math.abs(f7 - this.f25133r) < 0.01f) {
            return;
        }
        this.f25133r = f7;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25129b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int f10 = i0.a.f(f7, w02, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        int f11 = i0.a.f(f7, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        if (!this.f25131f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        u9 u9Var = this.h;
        u9Var.setColorFilter(porterDuffColorFilter);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        u9Var.invalidate();
        this.f25132n.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(this.f25133r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25129b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var);
        }
        int i10 = this.f25130c;
        setBackground(org.telegram.ui.ActionBar.k6.Z(w02, i10, i10));
    }
}
