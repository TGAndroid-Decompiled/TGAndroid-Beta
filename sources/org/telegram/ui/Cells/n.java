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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hp;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.t9 f24722a;
    public final org.telegram.ui.ActionBar.h5 f24723b;
    public final org.telegram.ui.ActionBar.h5 f24724c;
    public final org.telegram.ui.Components.e9 d;
    public final ImageView f24725e;
    public TLRPC.Chat f24726f;
    public boolean h;
    public final int f24727n;
    public final hp f24728r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        int i11;
        float f9;
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
        this.f24727n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24722a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            f9 = 0.0f;
        } else {
            f9 = i10 + 12;
        }
        if (z11) {
            f10 = i10 + 12;
        } else {
            f10 = 0.0f;
        }
        addView(t9Var, i7.f6.d(48, 48.0f, i17, f9, 6.0f, f10, 6.0f));
        if (z10) {
            hp hpVar = new hp(context, 21, null);
            this.f24728r = hpVar;
            hpVar.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
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
            addView(hpVar, i7.f6.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24723b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
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
        addView(h5Var, i7.f6.d(-1, 20.0f, i19, f18, 9.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24724c = h5Var2;
        h5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.g6.f23433y6;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        h5Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        h5Var2.setGravity(i14 | 48);
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
        addView(h5Var2, i7.f6.d(-1, 20.0f, i21, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f24725e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i20, false), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, i7.f6.d(48, 48.0f, i22, f14, 6.0f, f15, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f24727n;
        String q6 = a4.w.q(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f24726f = chat;
        org.telegram.ui.Components.e9 e9Var = this.d;
        e9Var.k(i10, chat);
        this.f24723b.l(chat.title, false);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(q6);
        n10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n10.toString());
        spannableStringBuilder.setSpan(new a51("", (h01) null), q6.length(), spannableStringBuilder.length(), 33);
        this.f24724c.l(spannableStringBuilder, false);
        this.f24722a.e(chat, e9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f24726f;
    }

    public ImageView getDeleteButton() {
        return this.f24725e;
    }

    public org.telegram.ui.ActionBar.h5 getNameTextView() {
        return this.f24723b;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24724c;
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
