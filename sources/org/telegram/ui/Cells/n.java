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
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.s01;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.p9 f21383a;
    public final org.telegram.ui.ActionBar.k5 f21384b;
    public final org.telegram.ui.ActionBar.k5 f21385c;
    public final org.telegram.ui.Components.z8 d;
    public final ImageView e;
    public TLRPC.Chat f21386f;
    public boolean h;
    public final int f21387n;
    public final kp f21388r;

    public n(Context context, View.OnClickListener onClickListener, boolean z4, int i10) {
        super(context);
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        float f16;
        int i16;
        float f17;
        float f18;
        this.f21387n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f21383a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = i10 + 12;
        }
        if (z10) {
            f11 = i10 + 12;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.b6.d(48, 48.0f, i17, f10, 6.0f, f11, 6.0f));
        if (z4) {
            kp kpVar = new kp(context, 21, null);
            this.f21388r = kpVar;
            kpVar.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i18 = i16 | 48;
            if (z11) {
                f17 = 0.0f;
            } else {
                f17 = i10 + 42;
            }
            if (z11) {
                f18 = i10 + 42;
            } else {
                f18 = 0.0f;
            }
            addView(kpVar, k7.b6.d(24, 24.0f, i18, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f21384b = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z12) {
            f12 = 62;
        } else {
            f12 = i10 + 73;
        }
        float f19 = f12;
        if (z12) {
            f13 = i10 + 73;
        } else {
            f13 = 62;
        }
        addView(k5Var, k7.b6.d(-1, 20.0f, i19, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f21385c = k5Var2;
        k5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.j6.f20256y6;
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        k5Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        k5Var2.setGravity(i14 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z13) {
            f14 = 62;
        } else {
            f14 = i10 + 73;
        }
        addView(k5Var2, k7.b6.d(-1, 20.0f, i21, f14, 32.5f, z13 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i20, false), PorterDuff.Mode.MULTIPLY));
        boolean z14 = LocaleController.isRTL;
        int i22 = (z14 ? 3 : 5) | 48;
        if (z14) {
            f15 = 7.0f;
        } else {
            f15 = 0.0f;
        }
        if (z14) {
            f16 = 0.0f;
        } else {
            f16 = 7.0f;
        }
        addView(imageView, k7.b6.d(48, 48.0f, i22, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z4) {
        StringBuilder sb = new StringBuilder();
        int i10 = this.f21387n;
        String r10 = android.support.v4.media.a.r(sb, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f21386f = chat;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.k(i10, chat);
        this.f21384b.l(chat.title, false);
        StringBuilder l10 = e2.c.l(r10);
        l10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l10.toString());
        spannableStringBuilder.setSpan(new m51("", (s01) null), r10.length(), spannableStringBuilder.length(), 33);
        this.f21385c.l(spannableStringBuilder, false);
        this.f21383a.e(chat, z8Var);
        this.h = z4;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f21386f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.k5 getNameTextView() {
        return this.f21384b;
    }

    public org.telegram.ui.ActionBar.k5 getStatusTextView() {
        return this.f21385c;
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
