package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o01 extends LinearLayout {
    public final int f26941a;
    public final long f26942b;
    public final org.telegram.ui.ActionBar.f6 f26943c;
    public final ru0 d;
    public final g9 e;
    public final v9 f26944f;
    public final org.telegram.ui.Cells.e6 h;
    public final o6 f26945n;
    public MessageObject f26946r;
    public boolean f26947s;
    public boolean v;
    public Utilities.Callback f26948w;
    public boolean f26949x;
    public float f26950y;

    public o01(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26950y = -6.0f;
        this.f26941a = i10;
        this.f26942b = j3;
        this.f26943c = f6Var;
        setOrientation(1);
        org.telegram.ui.x8 x8Var = new org.telegram.ui.x8(this, context, 2);
        x8Var.V(ci.d7.e(null, i10, j3, org.telegram.ui.ActionBar.j6.I.q()));
        ru0 ru0Var = new ru0(context, i10);
        this.d = ru0Var;
        x8Var.addView(ru0Var, w7.y5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new g9((org.telegram.ui.ActionBar.f6) null);
        v9 v9Var = new v9(context);
        this.f26944f = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        x8Var.addView(v9Var, w7.y5.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(x8Var, w7.y5.q(-1, -2, 7));
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, f6Var);
        this.h = e6Var;
        EditTextBoldCursor textView = e6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        e6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19492y6, f6Var), PorterDuff.Mode.SRC_IN));
        e6Var.addView(imageView, w7.y5.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.a6.a(imageView);
        imageView.setOnClickListener(new i80(textView, 20));
        o6 o6Var = new o6(context, false, true, false);
        this.f26945n = o6Var;
        o6Var.f26997n = false;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19348q7, f6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setGravity(17);
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        e6Var.addView(o6Var, w7.y5.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new h01(this));
        addView(e6Var, w7.y5.q(-1, -2, 7));
        ru0Var.setDelegate(new m5.e(this, textView, false, 8));
    }

    public static void b(final Context context, final int i10, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z13;
        LinearLayout linearLayout;
        int i15;
        org.telegram.ui.ActionBar.f3 f3Var;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        int i18;
        int i19 = i10;
        long j10 = j3;
        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.rk.j(1, context, f6Var2, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        j11.customView = linearLayout2;
        if (z11) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        v9 v9Var = new v9(context);
        v9Var.setImageResource(R.drawable.large_user_tag);
        v9Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout2.addView(v9Var, w7.y5.t(80, 80, 49, 0, 18, 0, 0));
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.c6.b(context, 20.0f, i20, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout2.addView(b10, w7.y5.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.c6.b(context, 14.0f, i20, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z11) {
                i18 = R.string.ChatTagOwner;
            } else if (!z10) {
                str2 = "";
            } else {
                i18 = R.string.ChatTagAdmin;
            }
            str2 = LocaleController.getString(i18);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!z11 && !z10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19299nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
            spannableStringBuilder.setSpan(new j01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout2.addView(b11, w7.y5.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.y5.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        LinearLayout linearLayout4 = linearLayout2;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            ?? u1Var = new org.telegram.ui.Cells.u1(context, i19);
            if (i21 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            u1Var.setDelegate(new l01(z14, z11));
            m01 m01Var = new m01(context, f6Var2, u1Var);
            m01Var.V(ci.d7.e(null, i19, j10, org.telegram.ui.ActionBar.j6.I.q()));
            m01Var.addView((View) u1Var, w7.y5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i21 == 1) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            if (i21 == 0) {
                i17 = 6;
            } else {
                i17 = 0;
            }
            linearLayout3.addView(m01Var, w7.y5.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            m01Var.setClipToOutline(true);
            m01Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            org.telegram.ui.ActionBar.f3 f3Var2 = j11;
            LinearLayout linearLayout5 = linearLayout4;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f18490id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new n01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new n01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            u1Var.N7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            u1Var.S7 = z15;
            messageObject.generateLayout(null);
            u1Var.X3(messageObject, null, false, false, false, false);
            u1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i21++;
            i19 = i10;
            j10 = j3;
            j11 = f3Var2;
            linearLayout4 = linearLayout5;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = j11;
        LinearLayout linearLayout6 = linearLayout4;
        ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = w7.c6.b(context, 12.0f, org.telegram.ui.ActionBar.j6.f19492y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout = linearLayout6;
            linearLayout.addView(b12, w7.y5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        } else {
            linearLayout = linearLayout6;
        }
        linearLayout.addView(g10, w7.y5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            g10.setText(yh.y3.g2(LocaleController.getString(R.string.Understood)));
            g10.setOnClickListener(new dt(17, f3Var3, zArr));
            f3Var = f3Var3;
        } else {
            if (UserObject.isUserSelf(user)) {
                if (TextUtils.isEmpty(str)) {
                    i15 = R.string.TagInfoButtonAddMyTag;
                } else {
                    i15 = R.string.TagInfoButtonEditMyTag;
                }
            } else if (TextUtils.isEmpty(str)) {
                i15 = R.string.TagInfoButtonAddTag;
            } else {
                i15 = R.string.TagInfoButtonEditTag;
            }
            g10.setText(LocaleController.getString(i15));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    o01.c(context, i10, j3, user, str, z10, z11, f6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            f3Var = f3Var3;
            f6Var2 = f6Var2;
            g10.setOnClickListener(onClickListener);
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var2));
        f3Var.setOnDismissListener(new yq0(zArr, 14));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j3, user, str, z10, z11, f6Var2);
        } else {
            f3Var.show();
        }
    }

    public static void c(Context context, int i10, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        boolean z13;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.rk.j(1, context, f6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.c6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.y5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.y5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.y5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i11 = R.string.MemberTagButtonRemove;
        } else if (z12) {
            i11 = R.string.MemberTagButtonEdit;
        } else {
            i11 = R.string.MemberTagButtonAdd;
        }
        g10.setText(LocaleController.getString(i11));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        o01 o01Var = new o01(i10, j3, context, f6Var);
        o01Var.setClipToOutline(true);
        o01Var.setOutlineProvider(new ViewOutlineProvider());
        o01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19109d6, f6Var));
        o01Var.a(user, str, z10, z11, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z14 = z12;
                if (isEmpty && !z10 && z14) {
                    i13 = R.string.MemberTagButtonRemove;
                } else if (z14) {
                    i13 = R.string.MemberTagButtonEdit;
                } else {
                    i13 = R.string.MemberTagButtonAdd;
                }
                g10.g(LocaleController.getString(i13), true, true);
            }
        });
        linearLayout.addView(o01Var, w7.y5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 22, f6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        f9Var.setText(formatString);
        linearLayout.addView(f9Var, w7.y5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(g10, w7.y5.t(-1, 48, 7, 14, 19, 14, 12));
        j10.smoothKeyboardAnimationEnabled = true;
        j10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, f6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        g10.setOnClickListener(new ei.v3(g10, o01Var, messagesController, j3, user, strArr, i10, j10, z13, f6Var));
        imageView.setOnClickListener(new d3(j10, 3));
        j10.show();
        EditTextBoldCursor textView = o01Var.h.getTextView();
        textView.post(new q1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f26941a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f18490id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f26942b;
        tL_message.peer_id = messagesController.getPeer(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f26947s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f26946r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new n01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new n01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f26946r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        ru0 ru0Var = this.d;
        ru0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        ru0Var.S7 = z13;
        this.f26946r.generateLayout(null);
        this.d.X3(this.f26946r, null, false, false, false, false);
        g9 g9Var = this.e;
        g9Var.r(user);
        this.f26944f.e(user, g9Var);
        this.f26948w = callback;
        this.f26949x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f26949x = false;
    }
}
