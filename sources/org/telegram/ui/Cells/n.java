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
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n01;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.x9 f22308a;
    public final org.telegram.ui.ActionBar.j5 f22309b;
    public final org.telegram.ui.ActionBar.j5 f22310c;
    public final org.telegram.ui.Components.i9 d;
    public final ImageView f22311e;
    public TLRPC.Chat f22312f;
    public boolean h;
    public final int f22313n;
    public final mp f22314r;

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
        this.f22313n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.f22308a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
        addView(x9Var, w7.x5.d(48, 48.0f, i17, f7, 6.0f, f10, 6.0f));
        if (z10) {
            mp mpVar = new mp(context, 21, null);
            this.f22314r = mpVar;
            mpVar.b(-1, org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.f20792k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
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
            addView(mpVar, w7.x5.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f22309b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        j5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 48);
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
        addView(j5Var, w7.x5.d(-1, 20.0f, i19, f18, 9.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f22310c = j5Var2;
        j5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.j6.f21042y6;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        j5Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        j5Var2.setGravity(i14 | 48);
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
        addView(j5Var2, w7.x5.d(-1, 20.0f, i21, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f22311e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), 1, -1));
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
        addView(imageView, w7.x5.d(48, 48.0f, i22, f14, 6.0f, f15, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f22313n;
        String s10 = a4.a.s(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f22312f = chat;
        org.telegram.ui.Components.i9 i9Var = this.d;
        i9Var.k(i10, chat);
        this.f22309b.l(chat.title, false);
        StringBuilder u10 = a4.a.u(s10);
        u10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u10.toString());
        spannableStringBuilder.setSpan(new l51("", (n01) null), s10.length(), spannableStringBuilder.length(), 33);
        this.f22310c.l(spannableStringBuilder, false);
        this.f22308a.e(chat, i9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f22312f;
    }

    public ImageView getDeleteButton() {
        return this.f22311e;
    }

    public org.telegram.ui.ActionBar.j5 getNameTextView() {
        return this.f22309b;
    }

    public org.telegram.ui.ActionBar.j5 getStatusTextView() {
        return this.f22310c;
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
