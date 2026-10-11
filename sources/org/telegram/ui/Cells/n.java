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
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.v11;
import org.telegram.ui.Components.v61;
public final class n extends FrameLayout {
    public final org.telegram.ui.Components.y9 f22470a;
    public final org.telegram.ui.ActionBar.h5 f22471b;
    public final org.telegram.ui.ActionBar.h5 f22472c;
    public final org.telegram.ui.Components.j9 d;
    public final ImageView f22473e;
    public TLRPC.Chat f22474f;
    public boolean h;
    public final int f22475n;
    public final dq f22476r;

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
        this.f22475n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f22470a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
        addView(y9Var, w7.x5.a(48.0f, f7, 6.0f, f10, 6.0f, 48, i17));
        if (z10) {
            dq dqVar = new dq(context, 21, null);
            this.f22476r = dqVar;
            dqVar.b(-1, org.telegram.ui.ActionBar.h6.f20786d6, org.telegram.ui.ActionBar.h6.f20915k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
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
            addView(dqVar, w7.x5.a(24.0f, f16, 32.0f, f17, 0.0f, 24, i18));
        }
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f22471b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
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
        addView(h5Var, w7.x5.a(20.0f, f18, 9.5f, f12, 0.0f, -1, i19));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f22472c = h5Var2;
        h5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.h6.f21171y6;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
        h5Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
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
        addView(h5Var2, w7.x5.a(20.0f, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f, -1, i21));
        ImageView imageView = new ImageView(context);
        this.f22473e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i20, false), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, w7.x5.a(48.0f, f14, 6.0f, f15, 0.0f, 48, i22));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f22475n;
        String t10 = a1.g.t(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f22474f = chat;
        org.telegram.ui.Components.j9 j9Var = this.d;
        j9Var.k(i10, chat);
        this.f22471b.l(chat.title, false);
        StringBuilder v = a1.g.v(t10);
        v.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v.toString());
        spannableStringBuilder.setSpan(new v61("", (v11) null), t10.length(), spannableStringBuilder.length(), 33);
        this.f22472c.l(spannableStringBuilder, false);
        this.f22470a.e(chat, j9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f22474f;
    }

    public ImageView getDeleteButton() {
        return this.f22473e;
    }

    public org.telegram.ui.ActionBar.h5 getNameTextView() {
        return this.f22471b;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f22472c;
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
