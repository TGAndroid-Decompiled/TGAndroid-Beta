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
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.xz0;

public final class n extends FrameLayout {

    public final org.telegram.ui.Components.n9 f24695a;

    public final org.telegram.ui.ActionBar.h5 f24696b;

    public final org.telegram.ui.ActionBar.h5 f24697c;
    public final org.telegram.ui.Components.y8 d;

    public final ImageView f24698e;

    public TLRPC.Chat f24699f;
    public boolean h;

    public final int f24700n;

    public final bp f24701r;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        this.f24700n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24695a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        addView(n9Var, h7.z5.d(48, 48.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : i10 + 12, 6.0f, z11 ? i10 + 12 : 0.0f, 6.0f));
        if (z10) {
            bp bpVar = new bp(context, 21, null);
            this.f24701r = bpVar;
            bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            addView(bpVar, h7.z5.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : i10 + 42, 32.0f, z12 ? i10 + 42 : 0.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24696b = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(17);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z13 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 62 : i10 + 73, 9.5f, z13 ? i10 + 73 : 62, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.f24697c = h5Var2;
        h5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        h5Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        h5Var2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z14 = LocaleController.isRTL;
        addView(h5Var2, h7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 62 : i10 + 73, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.f24698e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        boolean z15 = LocaleController.isRTL;
        addView(imageView, h7.z5.d(48, 48.0f, (z15 ? 3 : 5) | 48, z15 ? 7.0f : 0.0f, 6.0f, z15 ? 0.0f : 7.0f, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f24700n;
        String strP = a9.p.p(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f24699f = chat;
        org.telegram.ui.Components.y8 y8Var = this.d;
        y8Var.k(i10, chat);
        this.f24696b.l(chat.title, false);
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strP);
        sbO.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sbO.toString());
        spannableStringBuilder.setSpan(new r41("", (xz0) null), strP.length(), spannableStringBuilder.length(), 33);
        this.f24697c.l(spannableStringBuilder, false);
        this.f24695a.e(chat, y8Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f24699f;
    }

    public ImageView getDeleteButton() {
        return this.f24698e;
    }

    public org.telegram.ui.ActionBar.h5 getNameTextView() {
        return this.f24696b;
    }

    public org.telegram.ui.ActionBar.h5 getStatusTextView() {
        return this.f24697c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((this.h ? 12 : 0) + 60), 1073741824));
    }
}
