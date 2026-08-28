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
public final class iz0 extends LinearLayout {
    public final int f29548a;
    public final long f29549b;
    public final org.telegram.ui.ActionBar.b6 f29550c;
    public final kt0 d;
    public final z8 f29551e;
    public final o9 f29552f;
    public final org.telegram.ui.Cells.c6 h;
    public final j6 f29553n;
    public MessageObject f29554r;
    public boolean f29555s;
    public boolean v;
    public Utilities.Callback f29556w;
    public boolean f29557x;
    public float f29558y;

    public iz0(int i9, long j10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f29558y = -6.0f;
        this.f29548a = i9;
        this.f29549b = j10;
        this.f29550c = b6Var;
        setOrientation(1);
        fh.x4 x4Var = new fh.x4(this, context, 3);
        x4Var.V(kh.r6.e(null, i9, j10, org.telegram.ui.ActionBar.f6.I.q()));
        kt0 kt0Var = new kt0(context, i9);
        this.d = kt0Var;
        x4Var.addView(kt0Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f29551e = new z8((org.telegram.ui.ActionBar.b6) null);
        o9 o9Var = new o9(context);
        this.f29552f = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        x4Var.addView(o9Var, g7.e6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(x4Var, g7.e6.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, b6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        g7.g6.a(imageView);
        imageView.setOnClickListener(new h70(textView, 20));
        j6 j6Var = new j6(context, false, true, false);
        this.f29553n = j6Var;
        j6Var.f29650n = false;
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(17);
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        c6Var.addView(j6Var, g7.e6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new bz0(this));
        addView(c6Var, g7.e6.q(-1, -2, 7));
        kt0Var.setDelegate(new org.telegram.ui.Cells.e3(3, this, textView));
    }

    public static void b(final Context context, final int i9, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        boolean z13;
        int i14;
        org.telegram.ui.ActionBar.f3 f3Var;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        int i17;
        int i18 = i9;
        long j11 = j10;
        final org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 j12 = org.telegram.messenger.ll.j(context, b6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j12.customView = linearLayout;
        if (z11) {
            i10 = -6988581;
        } else if (z10) {
            i10 = -12539616;
        } else {
            i10 = -6905171;
        }
        o9 o9Var = new o9(context);
        o9Var.setImageResource(R.drawable.large_user_tag);
        o9Var.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), i10));
        linearLayout.addView(o9Var, g7.e6.t(80, 80, 49, 0, 18, 0, 0));
        int i19 = org.telegram.ui.ActionBar.f6.G6;
        TextView b10 = g7.i6.b(context, 20.0f, i19, true, null);
        b10.setGravity(17);
        if (z11) {
            i11 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i11 = R.string.TagInfoAdminTitle;
        } else {
            i11 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i11));
        linearLayout.addView(b10, g7.e6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = g7.i6.b(context, 14.0f, i19, false, null);
        b11.setGravity(17);
        b11.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z11) {
                i17 = R.string.ChatTagOwner;
            } else if (!z10) {
                str2 = "";
            } else {
                i17 = R.string.ChatTagAdmin;
            }
            str2 = LocaleController.getString(i17);
        } else {
            str2 = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!z11 && !z10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i12 = -6988581;
            } else {
                i12 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i12));
            spannableStringBuilder.setSpan(new dz0(i12, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i13 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i13 = R.string.TagInfoAdminText;
        } else {
            i13 = R.string.TagInfoMemberText;
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i13, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, g7.e6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, g7.e6.t(-1, -2, 7, 16, 0, 16, 16));
        int i20 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            ?? t1Var = new org.telegram.ui.Cells.t1(context, i18);
            if (i20 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            t1Var.setDelegate(new fz0(z14, z11));
            ?? gz0Var = new gz0(context, b6Var2, t1Var);
            gz0Var.V(kh.r6.e(null, i18, j11, org.telegram.ui.ActionBar.f6.I.q()));
            gz0Var.addView(t1Var, g7.e6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i20 == 1) {
                i15 = 6;
            } else {
                i15 = 0;
            }
            if (i20 == 0) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            linearLayout3.addView(gz0Var, g7.e6.p(0, -1, 1.0f, 119, i15, 0, i16, 0));
            gz0Var.setClipToOutline(true);
            gz0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            org.telegram.ui.ActionBar.f3 f3Var2 = j12;
            tL_message.from_id = MessagesController.getInstance(i18).getPeer(user.f22527id);
            tL_message.peer_id = MessagesController.getInstance(i18).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i18).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i18, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new hz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new hz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            t1Var.J7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            t1Var.O7 = z15;
            messageObject.generateLayout(null);
            t1Var.X3(messageObject, null, false, false, false, false);
            t1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i20++;
            i18 = i9;
            j11 = j10;
            j12 = f3Var2;
            linearLayout3 = linearLayout4;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = j12;
        kh.d i22 = org.telegram.messenger.ll.i(24, context, b6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = g7.i6.b(context, 12.0f, org.telegram.ui.ActionBar.f6.f23369y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, g7.e6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(i22, g7.e6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            i22.setText(gh.k5.g2(LocaleController.getString(R.string.Understood)));
            i22.setOnClickListener(new vh0(4, f3Var3, zArr));
            f3Var = f3Var3;
        } else {
            if (UserObject.isUserSelf(user)) {
                if (TextUtils.isEmpty(str)) {
                    i14 = R.string.TagInfoButtonAddMyTag;
                } else {
                    i14 = R.string.TagInfoButtonEditMyTag;
                }
            } else if (TextUtils.isEmpty(str)) {
                i14 = R.string.TagInfoButtonAddTag;
            } else {
                i14 = R.string.TagInfoButtonEditTag;
            }
            i22.setText(LocaleController.getString(i14));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    iz0.c(context, i9, j10, user, str, z10, z11, b6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            f3Var = f3Var3;
            b6Var2 = b6Var2;
            i22.setOnClickListener(onClickListener);
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var2));
        f3Var.setOnDismissListener(new tp0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i9, j10, user, str, z10, z11, b6Var2);
        } else {
            f3Var.show();
        }
    }

    public static void c(Context context, int i9, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        final boolean z12;
        int i10;
        String str2;
        String formatString;
        MessagesController messagesController = MessagesController.getInstance(i9);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z13 = false;
        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, b6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        TextView b10 = g7.i6.b(context, 20.0f, i11, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, g7.e6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, g7.e6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final kh.d i12 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        if (TextUtils.isEmpty(str) && !z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(str) && !z10 && z12) {
            i10 = R.string.MemberTagButtonRemove;
        } else if (z12) {
            i10 = R.string.MemberTagButtonEdit;
        } else {
            i10 = R.string.MemberTagButtonAdd;
        }
        i12.setText(LocaleController.getString(i10));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        iz0 iz0Var = new iz0(i9, j10, context, b6Var);
        iz0Var.setClipToOutline(true);
        iz0Var.setOutlineProvider(new ViewOutlineProvider());
        iz0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
        iz0Var.a(user, str, z10, z11, new Utilities.Callback() {
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
                i12.g(LocaleController.getString(i13), true, true);
            }
        });
        linearLayout.addView(iz0Var, g7.e6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 22, b6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        b9Var.setText(formatString);
        linearLayout.addView(b9Var, g7.e6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(i12, g7.e6.t(-1, 48, 7, 14, 19, 14, 12));
        j11.smoothKeyboardAnimationEnabled = true;
        j11.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        }
        i12.setOnClickListener(new mh.l3(i12, iz0Var, messagesController, j10, user, strArr, i9, j11, z13, b6Var));
        imageView.setOnClickListener(new z2(j11, 3));
        j11.show();
        EditTextBoldCursor textView = iz0Var.h.getTextView();
        textView.post(new p1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i9;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f29548a;
        tL_message.from_id = MessagesController.getInstance(i10).getPeer(user.f22527id);
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f29549b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f29555s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i10, tL_message, true, false);
        this.f29554r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new hz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new hz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f29554r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        kt0 kt0Var = this.d;
        kt0Var.J7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        kt0Var.O7 = z13;
        this.f29554r.generateLayout(null);
        this.d.X3(this.f29554r, null, false, false, false, false);
        z8 z8Var = this.f29551e;
        z8Var.r(user);
        this.f29552f.e(user, z8Var);
        this.f29556w = callback;
        this.f29557x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i9 = R.string.MemberTagHintAdd;
        } else {
            i9 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i9), false);
        this.f29557x = false;
    }
}
