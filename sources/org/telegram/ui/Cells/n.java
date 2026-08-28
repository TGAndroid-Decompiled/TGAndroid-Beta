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
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.vz0;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.o9 f24723a;
    public final org.telegram.ui.ActionBar.h5 f24724b;
    public final org.telegram.ui.ActionBar.h5 f24725c;
    public final org.telegram.ui.Components.z8 d;
    public final ImageView f24726e;
    public TLRPC.Chat f24727f;
    public boolean h;
    public final int f24728n;
    public final dp f24729r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i9) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        float f14;
        float f15;
        float f16;
        int i15;
        float f17;
        float f18;
        this.f24728n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24723a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i16 = i10 | 48;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = i9 + 12;
        }
        if (z11) {
            f11 = i9 + 12;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(48, 48.0f, i16, f10, 6.0f, f11, 6.0f));
        if (z10) {
            dp dpVar = new dp(context, 21, null);
            this.f24729r = dpVar;
            dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i17 = i15 | 48;
            if (z12) {
                f17 = 0.0f;
            } else {
                f17 = i9 + 42;
            }
            if (z12) {
                f18 = i9 + 42;
            } else {
                f18 = 0.0f;
            }
            addView(dpVar, g7.e6.d(24, 24.0f, i17, f17, 32.0f, f18, 0.0f));
        }
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24724b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z13) {
            f12 = 62;
        } else {
            f12 = i9 + 73;
        }
        float f19 = f12;
        if (z13) {
            f13 = i9 + 73;
        } else {
            f13 = 62;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i18, f19, 9.5f, f13, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24725c = h5Var2;
        h5Var2.setTextSize(14);
        int i19 = org.telegram.ui.ActionBar.f6.f23369y6;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i19, false));
        h5Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        h5Var2.setGravity(i13 | 48);
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z14) {
            f14 = 62;
        } else {
            f14 = i9 + 73;
        }
        addView(h5Var2, g7.e6.d(-1, 20.0f, i20, f14, 32.5f, z14 ? i9 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f24726e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i19, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        int i21 = (z15 ? 3 : 5) | 48;
        if (z15) {
            f15 = 7.0f;
        } else {
            f15 = 0.0f;
        }
        if (z15) {
            f16 = 0.0f;
        } else {
            f16 = 7.0f;
        }
        addView(imageView, g7.e6.d(48, 48.0f, i21, f15, 6.0f, f16, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i9 = this.f24728n;
        String r10 = aa.d.r(sb2, MessagesController.getInstance(i9).linkPrefix, "/");
        this.f24727f = chat;
        org.telegram.ui.Components.z8 z8Var = this.d;
        z8Var.k(i9, chat);
        this.f24724b.l(chat.title, false);
        StringBuilder n10 = e2.c.n(r10);
        n10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n10.toString());
        spannableStringBuilder.setSpan(new p41("", (vz0) null), r10.length(), spannableStringBuilder.length(), 33);
        this.f24725c.l(spannableStringBuilder, false);
        this.f24723a.e(chat, z8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f24727f;
    }

    public ImageView getDeleteButton() {
        return this.f24726e;
    }

    public org.telegram.ui.ActionBar.h5 getNameTextView() {
        return this.f24724b;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24725c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.h) {
            i11 = 12;
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11 + 60), 1073741824));
    }
}
