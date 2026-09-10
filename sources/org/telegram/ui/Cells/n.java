package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.z51;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.w9 f19537a;
    public final org.telegram.ui.ActionBar.l5 f19538b;
    public final org.telegram.ui.ActionBar.l5 f19539c;
    public final org.telegram.ui.Components.g9 d;
    public final ImageView e;
    public TLRPC.Chat f19540f;
    public boolean h;
    public final int f19541n;
    public final tp f19542r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        int i14;
        int i15;
        float f13;
        float f14;
        float f15;
        int i16;
        float f16;
        float f17;
        this.f19541n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19537a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 12;
        }
        if (z11) {
            f10 = i10 + 12;
        } else {
            f10 = 0.0f;
        }
        addView(w9Var, w7.a6.d(48, 48.0f, i17, f7, 6.0f, f10, 6.0f));
        if (z10) {
            tp tpVar = new tp(context, 21, null);
            this.f19542r = tpVar;
            tpVar.b(-1, org.telegram.ui.ActionBar.j6.f17928d6, org.telegram.ui.ActionBar.j6.f18056k7);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i18 = i16 | 48;
            if (z12) {
                f16 = 0.0f;
            } else {
                f16 = i10 + 42;
            }
            if (z12) {
                f17 = i10 + 42;
            } else {
                f17 = 0.0f;
            }
            addView(tpVar, w7.a6.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f19538b = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        l5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z13) {
            f11 = 62;
        } else {
            f11 = i10 + 73;
        }
        float f18 = f11;
        if (z13) {
            f12 = i10 + 73;
        } else {
            f12 = 62;
        }
        addView(l5Var, w7.a6.d(-1, 20.0f, i19, f18, 9.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f19539c = l5Var2;
        l5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.j6.f18306y6;
        l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        l5Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        l5Var2.setGravity(i14 | 48);
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z14) {
            f13 = 62;
        } else {
            f13 = i10 + 73;
        }
        addView(l5Var2, w7.a6.d(-1, 20.0f, i21, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i20, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        int i22 = (z15 ? 3 : 5) | 48;
        if (z15) {
            f14 = 7.0f;
        } else {
            f14 = 0.0f;
        }
        if (z15) {
            f15 = 0.0f;
        } else {
            f15 = 7.0f;
        }
        addView(imageView, w7.a6.d(48, 48.0f, i22, f14, 6.0f, f15, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f19541n;
        String s10 = a4.a.s(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f19540f = chat;
        org.telegram.ui.Components.g9 g9Var = this.d;
        g9Var.k(i10, chat);
        this.f19538b.l(chat.title, false);
        StringBuilder u10 = a4.a.u(s10);
        u10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u10.toString());
        spannableStringBuilder.setSpan(new z51("", (b11) null), s10.length(), spannableStringBuilder.length(), 33);
        this.f19539c.l(spannableStringBuilder, false);
        this.f19537a.e(chat, g9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f19540f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.l5 getNameTextView() {
        return this.f19538b;
    }

    public org.telegram.ui.ActionBar.l5 getStatusTextView() {
        return this.f19539c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 60), 1073741824));
    }
}
