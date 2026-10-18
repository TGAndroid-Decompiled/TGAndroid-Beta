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
public final class v01 extends LinearLayout {
    public final int f31134a;
    public final long f31135b;
    public final org.telegram.ui.ActionBar.d6 f31136c;
    public final yu0 d;
    public final h9 e;
    public final w9 f31137f;
    public final org.telegram.ui.Cells.c6 h;
    public final q6 f31138n;
    public MessageObject f31139r;
    public boolean f31140s;
    public boolean v;
    public Utilities.Callback f31141w;
    public boolean f31142x;
    public float f31143y;

    public v01(int i10, long j10, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31143y = -6.0f;
        this.f31134a = i10;
        this.f31135b = j10;
        this.f31136c = d6Var;
        setOrientation(1);
        org.telegram.ui.y8 y8Var = new org.telegram.ui.y8(this, context, 2);
        y8Var.V(ei.r6.e(null, i10, j10, org.telegram.ui.ActionBar.h6.I.q()));
        yu0 yu0Var = new yu0(context, i10);
        this.d = yu0Var;
        y8Var.addView(yu0Var, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
        this.e = new h9((org.telegram.ui.ActionBar.d6) null);
        w9 w9Var = new w9(context);
        this.f31137f = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        y8Var.addView(w9Var, w7.z5.a(42.0f, 8.0f, 0.0f, 0.0f, 12.0f, 42, 83));
        addView(y8Var, w7.z5.q(-1, -2, 7));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, 0, null, d6Var);
        this.h = c6Var;
        EditTextBoldCursor textView = c6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        c6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21381y6, d6Var), PorterDuff.Mode.SRC_IN));
        c6Var.addView(imageView, w7.z5.a(24.0f, 0.0f, 0.0f, 20.0f, 0.0f, 24, 21));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new u80(textView, 19));
        q6 q6Var = new q6(context, false, true, false);
        this.f31138n = q6Var;
        q6Var.f29586n = false;
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21231q7, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setGravity(17);
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        c6Var.addView(q6Var, w7.z5.a(50.0f, 0.0f, 0.0f, 44.0f, 0.0f, 56, 117));
        textView.addTextChangedListener(new o01(this));
        addView(c6Var, w7.z5.q(-1, -2, 7));
        yu0Var.setDelegate(new n2.e(this, textView, false, 8));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z13;
        int i15;
        org.telegram.ui.ActionBar.f3 f3Var;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        int i18;
        int i19 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        final org.telegram.ui.ActionBar.f3 i20 = org.telegram.messenger.kk.i(1, context, d6Var2, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i20.customView = linearLayout;
        if (z11) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        w9 w9Var = new w9(context);
        w9Var.setImageResource(R.drawable.large_user_tag);
        w9Var.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(w9Var, w7.z5.t(80, 80, 49, 0, 18, 0, 0));
        int i21 = org.telegram.ui.ActionBar.h6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i21, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout.addView(b10, w7.z5.a(-2.0f, 32.0f, 15.0f, 32.0f, 0.0f, -1, 49));
        TextView b11 = w7.d6.b(context, 14.0f, i21, false, null);
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
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21183nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i13));
            spannableStringBuilder.setSpan(new q01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        int i22 = 2;
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, w7.z5.a(-2.0f, 32.0f, 10.0f, 32.0f, 25.0f, -1, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 7, 16, 0, 16, 16));
        int i23 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        while (i23 < i22) {
            ?? u1Var = new org.telegram.ui.Cells.u1(context, i19);
            if (i23 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            u1Var.setDelegate(new s01(z14, z11));
            ?? t01Var = new t01(context, d6Var2, u1Var);
            t01Var.V(ei.r6.e(null, i19, j11, org.telegram.ui.ActionBar.h6.I.q()));
            t01Var.addView(u1Var, w7.z5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
            if (i23 == 1) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            if (i23 == 0) {
                i17 = 6;
            } else {
                i17 = 0;
            }
            linearLayout3.addView(t01Var, w7.z5.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            t01Var.setClipToOutline(true);
            t01Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            int i24 = i23;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f20426id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new u01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new u01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
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
            i19 = i10;
            i22 = 2;
            linearLayout3 = linearLayout4;
            i23 = i24 + 1;
            j11 = j10;
        }
        ei.d f7 = org.telegram.messenger.kk.f(24, context, d6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = w7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.h6.f21381y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, w7.z5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(f7, w7.z5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            f7.setText(ai.k7.B2(LocaleController.getString(R.string.Understood)));
            f7.setOnClickListener(new ca(27, i20, zArr));
            f3Var = i20;
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
            f7.setText(LocaleController.getString(i15));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    v01.c(context, i10, j10, user, str, z10, z11, d6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            f3Var = i20;
            d6Var2 = d6Var2;
            f7.setOnClickListener(onClickListener);
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var2));
        f3Var.setOnDismissListener(new fr0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j10, user, str, z10, z11, d6Var2);
        } else {
            f3Var.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        boolean z13;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.kk.i(1, context, d6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i12.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i13, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.z5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.z5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ei.d f7 = org.telegram.messenger.kk.f(24, context, d6Var, true);
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
        f7.setText(LocaleController.getString(i11));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        v01 v01Var = new v01(i10, j10, context, d6Var);
        v01Var.setClipToOutline(true);
        v01Var.setOutlineProvider(new ViewOutlineProvider());
        v01Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
        v01Var.a(user, str, z10, z11, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i14;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z14 = z12;
                if (isEmpty && !z10 && z14) {
                    i14 = R.string.MemberTagButtonRemove;
                } else if (z14) {
                    i14 = R.string.MemberTagButtonEdit;
                } else {
                    i14 = R.string.MemberTagButtonAdd;
                }
                f7.g(LocaleController.getString(i14), true, true);
            }
        });
        linearLayout.addView(v01Var, w7.z5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context, 22, d6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        d9Var.setText(formatString);
        linearLayout.addView(d9Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 7, 14, 19, 14, 12));
        i12.smoothKeyboardAnimationEnabled = true;
        i12.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, d6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        f7.setOnClickListener(new gi.l3(f7, v01Var, messagesController, j10, user, strArr, i10, i12, z13, d6Var));
        imageView.setOnClickListener(new f3(i12, 3));
        i12.show();
        EditTextBoldCursor textView = v01Var.h.getTextView();
        textView.post(new r1(6, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f31134a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f20426id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f31135b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f31140s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f31139r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new u01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new u01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f31139r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        yu0 yu0Var = this.d;
        yu0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        yu0Var.S7 = z13;
        this.f31139r.generateLayout(null);
        yu0Var.X3(this.f31139r, null, false, false, false, false);
        h9 h9Var = this.e;
        h9Var.r(user);
        this.f31137f.e(user, h9Var);
        this.f31141w = callback;
        this.f31142x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f31142x = false;
    }
}
