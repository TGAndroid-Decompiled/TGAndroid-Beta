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
public final class f01 extends LinearLayout {
    public final int f24736a;
    public final long f24737b;
    public final org.telegram.ui.ActionBar.f6 f24738c;
    public final du0 d;
    public final z8 e;
    public final p9 f24739f;
    public final org.telegram.ui.Cells.c6 h;
    public final k6 f24740n;
    public MessageObject f24741r;
    public boolean f24742s;
    public boolean v;
    public Utilities.Callback f24743w;
    public boolean f24744x;
    public float f24745y;

    public f01(int i10, long j10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f24745y = -6.0f;
        this.f24736a = i10;
        this.f24737b = j10;
        this.f24738c = f6Var;
        setOrientation(1);
        kh.j4 j4Var = new kh.j4(this, context, 3);
        j4Var.V(ph.l5.e(null, i10, j10, org.telegram.ui.ActionBar.j6.I.q()));
        du0 du0Var = new du0(context, i10);
        this.d = du0Var;
        j4Var.addView(du0Var, k7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new z8((org.telegram.ui.ActionBar.f6) null);
        p9 p9Var = new p9(context);
        this.f24739f = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        j4Var.addView(p9Var, k7.b6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(j4Var, k7.b6.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, f6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, k7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        k7.d6.a(imageView);
        imageView.setOnClickListener(new z70(textView, 20));
        k6 k6Var = new k6(context, false, true, false);
        this.f24740n = k6Var;
        k6Var.f26169n = false;
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20141q7, f6Var));
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setGravity(17);
        k6Var.setAllowCancel(true);
        k6Var.setScaleProperty(0.6f);
        c6Var.addView(k6Var, k7.b6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new yz0(this));
        addView(c6Var, k7.b6.q(-1, -2, 7));
        du0Var.setDelegate(new n7.qa(13, this, textView));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z4, final boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z12;
        int i15;
        org.telegram.ui.ActionBar.g3 g3Var;
        boolean z13;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        if (z10) {
            i11 = -6988581;
        } else if (z4) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        p9 p9Var = new p9(context);
        p9Var.setImageResource(R.drawable.large_user_tag);
        p9Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(p9Var, k7.b6.t(80, 80, 49, 0, 18, 0, 0));
        int i20 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = k7.f6.b(context, 20.0f, i20, true, null);
        b10.setGravity(17);
        if (z10) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z4) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout.addView(b10, k7.b6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = k7.f6.b(context, 14.0f, i20, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z10) {
                i18 = R.string.ChatTagOwner;
            } else if (!z4) {
                str2 = "";
            } else {
                i18 = R.string.ChatTagAdmin;
            }
            str2 = LocaleController.getString(i18);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!z10 && !z4) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20091nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z10) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
            spannableStringBuilder.setSpan(new a01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z10) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z4) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, k7.b6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.b6.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            ?? t1Var = new org.telegram.ui.Cells.t1(context, i19);
            if (i21 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            t1Var.setDelegate(new c01(z13, z10));
            ?? d01Var = new d01(context, f6Var2, t1Var);
            d01Var.V(ph.l5.e(null, i19, j11, org.telegram.ui.ActionBar.j6.I.q()));
            d01Var.addView(t1Var, k7.b6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout3.addView(d01Var, k7.b6.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            d01Var.setClipToOutline(true);
            d01Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            org.telegram.ui.ActionBar.g3 g3Var2 = o10;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f19331id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new e01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new e01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            t1Var.K7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z14 = true;
            } else {
                z14 = false;
            }
            t1Var.P7 = z14;
            messageObject.generateLayout(null);
            t1Var.X3(messageObject, null, false, false, false, false);
            t1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i21++;
            i19 = i10;
            j11 = j10;
            o10 = g3Var2;
            linearLayout3 = linearLayout4;
        }
        final org.telegram.ui.ActionBar.g3 g3Var3 = o10;
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z4 || ((!z10 && z11) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z10) {
            TextView b12 = k7.f6.b(context, 12.0f, org.telegram.ui.ActionBar.j6.f20281y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, k7.b6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(p10, k7.b6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z12) {
            p10.setText(lh.g5.g2(LocaleController.getString(R.string.Understood)));
            p10.setOnClickListener(new rx0(2, g3Var3, zArr));
            g3Var = g3Var3;
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
            p10.setText(LocaleController.getString(i15));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.g3.this.dismiss();
                    f01.c(context, i10, j10, user, str, z4, z10, f6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            g3Var = g3Var3;
            f6Var2 = f6Var2;
            p10.setOnClickListener(onClickListener);
        }
        g3Var.smoothKeyboardAnimationEnabled = true;
        g3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var2));
        g3Var.setOnDismissListener(new nq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z12) {
            c(context, i10, j10, user, str, z4, z10, f6Var2);
        } else {
            g3Var.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z4, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        final boolean z11;
        int i11;
        String str2;
        String formatString;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z12 = false;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = k7.f6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, k7.b6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19996i6, f6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, k7.b6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        if (TextUtils.isEmpty(str) && !z4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (TextUtils.isEmpty(str) && !z4 && z11) {
            i11 = R.string.MemberTagButtonRemove;
        } else if (z11) {
            i11 = R.string.MemberTagButtonEdit;
        } else {
            i11 = R.string.MemberTagButtonAdd;
        }
        p10.setText(LocaleController.getString(i11));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        f01 f01Var = new f01(i10, j10, context, f6Var);
        f01Var.setClipToOutline(true);
        f01Var.setOutlineProvider(new ViewOutlineProvider());
        f01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
        f01Var.a(user, str, z4, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i13;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z13 = z11;
                if (isEmpty && !z4 && z13) {
                    i13 = R.string.MemberTagButtonRemove;
                } else if (z13) {
                    i13 = R.string.MemberTagButtonEdit;
                } else {
                    i13 = R.string.MemberTagButtonAdd;
                }
                p10.g(LocaleController.getString(i13), true, true);
            }
        });
        linearLayout.addView(f01Var, k7.b6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context, 22, f6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        a9Var.setText(formatString);
        linearLayout.addView(a9Var, k7.b6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(p10, k7.b6.t(-1, 48, 7, 14, 19, 14, 12));
        o10.smoothKeyboardAnimationEnabled = true;
        o10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, f6Var));
        if (TextUtils.isEmpty(str) && !z4 && !z10) {
            z12 = true;
        }
        p10.setOnClickListener(new uz0(p10, f01Var, messagesController, j10, user, strArr, i10, o10, z12, f6Var));
        imageView.setOnClickListener(new a3(o10, 3));
        o10.show();
        EditTextBoldCursor textView = f01Var.h.getTextView();
        textView.post(new q1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z4, boolean z10, Utilities.Callback callback) {
        boolean z11;
        boolean z12;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f24736a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f19331id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f24737b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f24742s = z4;
        this.v = z10;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f24741r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new e01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new e01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f24741r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        du0 du0Var = this.d;
        du0Var.K7 = z11;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z12 = true;
        } else {
            z12 = false;
        }
        du0Var.P7 = z12;
        this.f24741r.generateLayout(null);
        this.d.X3(this.f24741r, null, false, false, false, false);
        z8 z8Var = this.e;
        z8Var.r(user);
        this.f24739f.e(user, z8Var);
        this.f24743w = callback;
        this.f24744x = true;
        if (TextUtils.isEmpty(str) && !z4) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f24744x = false;
    }
}
