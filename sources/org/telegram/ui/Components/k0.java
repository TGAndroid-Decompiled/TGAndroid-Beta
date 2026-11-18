package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class k0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final int f36588a;
    public final org.telegram.ui.ActionBar.i6 f36589b;
    public int f36590c;
    public boolean d;
    public TL_aicompose.AiComposeTone f36591e;
    public boolean f36592f;
    public final q9 h;
    public final TextView f36593n;
    public float f36594r;

    public k0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = true;
        this.f36588a = i7;
        this.f36589b = i6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        q9 q9Var = new q9(context);
        this.h = q9Var;
        org.telegram.messenger.ks.i(q9Var);
        linearLayout.addView(q9Var, c8.ma.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f36593n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.ma.t(-2, -2, 49, 0, 2, 0, 0));
        c8.ra.b(this, 0.05f, 1.5f);
        b(true, 0.0f);
    }

    public final void a(String str, CharSequence charSequence, Long l10) {
        int i7;
        this.f36592f = true;
        q9 q9Var = this.h;
        q9Var.setColorFilter(null);
        q9Var.setImageDrawable(org.telegram.messenger.j6.g(str));
        this.f36593n.setText(charSequence);
        int i10 = this.f36588a;
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i7 = 0;
            while (i7 < 4) {
                if (org.telegram.messenger.j10.i(i7).p() && !ConnectionsManager.getInstance(i7).isTestBackend()) {
                    break;
                }
                i7++;
            }
        }
        i7 = i10;
        if (l10 != null) {
            q9Var.setAnimatedEmojiDrawable(new o5(9, i10, l10.longValue()));
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            org.telegram.messenger.ri.d0(i7).n0(tL_inputStickerSetShortName, null, false, false, new li.d(26, this, str));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
    }

    public final void b(boolean z10, float f10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f10 - this.f36594r) < 0.01f) {
            return;
        }
        this.f36594r = f10;
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36589b;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        if (!this.f36592f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        q9 q9Var = this.h;
        q9Var.setColorFilter(porterDuffColorFilter);
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        q9Var.invalidate();
        this.f36593n.setTextColor(f12);
    }

    @Override
    public final void updateColors() {
        int w02;
        b(true, this.f36594r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36589b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29486i6, i6Var);
        }
        int i7 = this.f36590c;
        setBackground(org.telegram.ui.ActionBar.n6.a0(w02, i7, i7));
    }
}
