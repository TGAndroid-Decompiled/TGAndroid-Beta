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
public final class e11 extends LinearLayout {
    public final int f25857a;
    public final long f25858b;
    public final org.telegram.ui.ActionBar.e6 f25859c;
    public final iv0 d;
    public final j9 f25860e;
    public final y9 f25861f;
    public final org.telegram.ui.Cells.d6 h;
    public final r6 f25862n;
    public MessageObject f25863r;
    public boolean f25864s;
    public boolean v;
    public Utilities.Callback f25865w;
    public boolean f25866x;
    public float f25867y;

    public e11(int i10, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f25867y = -6.0f;
        this.f25857a = i10;
        this.f25858b = j3;
        this.f25859c = e6Var;
        setOrientation(1);
        org.telegram.ui.v8 v8Var = new org.telegram.ui.v8(this, context, 2);
        v8Var.V(ci.b7.e(null, i10, j3, org.telegram.ui.ActionBar.i6.I.q()));
        iv0 iv0Var = new iv0(context, i10);
        this.d = iv0Var;
        v8Var.addView(iv0Var, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
        this.f25860e = new j9((org.telegram.ui.ActionBar.e6) null);
        y9 y9Var = new y9(context);
        this.f25861f = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        v8Var.addView(y9Var, w7.x5.a(42.0f, 8.0f, 0.0f, 0.0f, 12.0f, 42, 83));
        addView(v8Var, w7.x5.q(-1, -2, 7));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(context, 0, null, e6Var);
        this.h = d6Var;
        EditTextBoldCursor textView = d6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        d6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var), PorterDuff.Mode.SRC_IN));
        d6Var.addView(imageView, w7.x5.a(24.0f, 0.0f, 0.0f, 20.0f, 0.0f, 24, 21));
        w7.z5.a(imageView);
        imageView.setOnClickListener(new c90(textView, 19));
        r6 r6Var = new r6(context, false, true, false);
        this.f25862n = r6Var;
        r6Var.f30399n = false;
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, e6Var));
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setGravity(17);
        r6Var.setAllowCancel(true);
        r6Var.setScaleProperty(0.6f);
        d6Var.addView(r6Var, w7.x5.a(50.0f, 0.0f, 0.0f, 44.0f, 0.0f, 56, 117));
        textView.addTextChangedListener(new x01(this));
        addView(d6Var, w7.x5.q(-1, -2, 7));
        iv0Var.setDelegate(new n6.t(this, textView, false, 5));
    }

    public static void b(final Context context, final int i10, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var) {
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
        final org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j10));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 i20 = org.telegram.messenger.bi.i(1, context, e6Var2, true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        i20.customView = linearLayout2;
        if (z11) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        y9 y9Var = new y9(context);
        y9Var.setImageResource(R.drawable.large_user_tag);
        y9Var.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout2.addView(y9Var, w7.x5.t(80, 80, 49, 0, 18, 0, 0));
        int i21 = org.telegram.ui.ActionBar.i6.G6;
        TextView b10 = w7.b6.b(context, 20.0f, i21, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout2.addView(b10, w7.x5.a(-2.0f, 32.0f, 15.0f, 32.0f, 0.0f, -1, 49));
        TextView b11 = w7.b6.b(context, 14.0f, i21, false, null);
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
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20991nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.i6.m1(0.1f, i13));
            spannableStringBuilder.setSpan(new z01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
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
        linearLayout2.addView(b11, w7.x5.a(-2.0f, 32.0f, 10.0f, 32.0f, 25.0f, -1, 49));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout2.addView(linearLayout3, w7.x5.t(-1, -2, 7, 16, 0, 16, 16));
        int i23 = 0;
        LinearLayout linearLayout4 = linearLayout2;
        while (i23 < i22) {
            ?? u1Var = new org.telegram.ui.Cells.u1(context, i19);
            if (i23 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            u1Var.setDelegate(new b11(z14, z11));
            c11 c11Var = new c11(context, e6Var2, u1Var);
            c11Var.V(ci.b7.e(null, i19, j10, org.telegram.ui.ActionBar.i6.I.q()));
            c11Var.addView((View) u1Var, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 87));
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
            linearLayout3.addView(c11Var, w7.x5.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            c11Var.setClipToOutline(true);
            c11Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            org.telegram.ui.ActionBar.f3 f3Var2 = i20;
            LinearLayout linearLayout5 = linearLayout4;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f20189id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new d11(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new d11(AndroidUtilities.dp(160.0f)), 2, 3, 33);
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
            i23++;
            i19 = i10;
            j10 = j3;
            i22 = 2;
            i20 = f3Var2;
            linearLayout4 = linearLayout5;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = i20;
        LinearLayout linearLayout6 = linearLayout4;
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = w7.b6.b(context, 12.0f, org.telegram.ui.ActionBar.i6.f21185y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout = linearLayout6;
            linearLayout.addView(b12, w7.x5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        } else {
            linearLayout = linearLayout6;
        }
        linearLayout.addView(f7, w7.x5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            f7.setText(yh.s3.i2(LocaleController.getString(R.string.Understood)));
            f7.setOnClickListener(new vt(17, f3Var3, zArr));
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
            f7.setText(LocaleController.getString(i15));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    e11.c(context, i10, j3, user, str, z10, z11, e6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            f3Var = f3Var3;
            e6Var2 = e6Var2;
            f7.setOnClickListener(onClickListener);
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var2));
        f3Var.setOnDismissListener(new pr0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j3, user, str, z10, z11, e6Var2);
        } else {
            f3Var.show();
        }
    }

    public static void c(Context context, int i10, long j3, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        boolean z13;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j3));
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.bi.i(1, context, e6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i12.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        TextView b10 = w7.b6.b(context, 20.0f, i13, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.x5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i13, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.x5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
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
        e11 e11Var = new e11(i10, j3, context, e6Var);
        e11Var.setClipToOutline(true);
        e11Var.setOutlineProvider(new ViewOutlineProvider());
        e11Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var));
        e11Var.a(user, str, z10, z11, new Utilities.Callback() {
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
        linearLayout.addView(e11Var, w7.x5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 22, e6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        e9Var.setText(formatString);
        linearLayout.addView(e9Var, w7.x5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(f7, w7.x5.t(-1, 48, 7, 14, 19, 14, 12));
        i12.smoothKeyboardAnimationEnabled = true;
        i12.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, e6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        f7.setOnClickListener(new ei.v3(f7, e11Var, messagesController, j3, user, strArr, i10, i12, z13, e6Var));
        imageView.setOnClickListener(new g3(i12, 3));
        i12.show();
        EditTextBoldCursor textView = e11Var.h.getTextView();
        textView.post(new r1(6, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f25857a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f20189id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f25858b;
        tL_message.peer_id = messagesController.getPeer(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f25864s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f25863r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new d11((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new d11((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f25863r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        iv0 iv0Var = this.d;
        iv0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        iv0Var.S7 = z13;
        this.f25863r.generateLayout(null);
        this.d.X3(this.f25863r, null, false, false, false, false);
        j9 j9Var = this.f25860e;
        j9Var.r(user);
        this.f25861f.e(user, j9Var);
        this.f25865w = callback;
        this.f25866x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.o(str, LocaleController.getString(i10), false);
        this.f25866x = false;
    }
}
