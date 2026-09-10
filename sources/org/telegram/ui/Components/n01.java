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
public final class n01 extends LinearLayout {
    public final int f25354a;
    public final long f25355b;
    public final org.telegram.ui.ActionBar.f6 f25356c;
    public final nu0 d;
    public final g9 e;
    public final w9 f25357f;
    public final org.telegram.ui.Cells.e6 h;
    public final o6 f25358n;
    public MessageObject f25359r;
    public boolean f25360s;
    public boolean v;
    public Utilities.Callback f25361w;
    public boolean f25362x;
    public float f25363y;

    public n01(int i10, long j3, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f25363y = -6.0f;
        this.f25354a = i10;
        this.f25355b = j3;
        this.f25356c = f6Var;
        setOrientation(1);
        org.telegram.ui.w8 w8Var = new org.telegram.ui.w8(this, context, 2);
        w8Var.V(bi.e8.e(null, i10, j3, org.telegram.ui.ActionBar.j6.I.q()));
        nu0 nu0Var = new nu0(context, i10);
        this.d = nu0Var;
        w8Var.addView(nu0Var, w7.a6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new g9((org.telegram.ui.ActionBar.f6) null);
        w9 w9Var = new w9(context);
        this.f25357f = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        w8Var.addView(w9Var, w7.a6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(w8Var, w7.a6.q(-1, -2, 7));
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, 0, null, f6Var);
        this.h = e6Var;
        EditTextBoldCursor textView = e6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        e6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var), PorterDuff.Mode.SRC_IN));
        e6Var.addView(imageView, w7.a6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.c6.a(imageView);
        imageView.setOnClickListener(new g80(textView, 20));
        o6 o6Var = new o6(context, false, true, false);
        this.f25358n = o6Var;
        o6Var.f25682n = false;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setGravity(17);
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        e6Var.addView(o6Var, w7.a6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new g01(this));
        addView(e6Var, w7.a6.q(-1, -2, 7));
        nu0Var.setDelegate(new n7.a1(this, textView, false, 6));
    }

    public static void b(final Context context, final int i10, final long j3, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z13;
        int i15;
        org.telegram.ui.ActionBar.h3 h3Var;
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
        final org.telegram.ui.ActionBar.h3 i20 = org.telegram.messenger.em.i(1, context, f6Var2, true);
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
        w9Var.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(w9Var, w7.a6.t(80, 80, 49, 0, 18, 0, 0));
        int i21 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.e6.b(context, 20.0f, i21, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout.addView(b10, w7.a6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.e6.b(context, 14.0f, i21, false, null);
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
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18115nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, i13));
            spannableStringBuilder.setSpan(new i01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
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
        linearLayout.addView(b11, w7.a6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.a6.t(-1, -2, 7, 16, 0, 16, 16));
        int i23 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        while (i23 < i22) {
            ?? t1Var = new org.telegram.ui.Cells.t1(context, i19);
            if (i23 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            t1Var.setDelegate(new k01(z14, z11));
            ?? l01Var = new l01(context, f6Var2, t1Var);
            l01Var.V(bi.e8.e(null, i19, j10, org.telegram.ui.ActionBar.j6.I.q()));
            l01Var.addView(t1Var, w7.a6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout3.addView(l01Var, w7.a6.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            l01Var.setClipToOutline(true);
            l01Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            int i24 = i23;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f17342id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j10);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new m01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new m01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            t1Var.N7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            t1Var.S7 = z15;
            messageObject.generateLayout(null);
            t1Var.X3(messageObject, null, false, false, false, false);
            t1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i19 = i10;
            i23 = i24 + 1;
            linearLayout3 = linearLayout4;
            i22 = 2;
            j10 = j3;
        }
        bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = w7.e6.b(context, 12.0f, org.telegram.ui.ActionBar.j6.f18306y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, w7.a6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(g10, w7.a6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            g10.setText(xh.x3.g2(LocaleController.getString(R.string.Understood)));
            g10.setOnClickListener(new u10(14, i20, zArr));
            h3Var = i20;
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
                    org.telegram.ui.ActionBar.h3.this.dismiss();
                    n01.c(context, i10, j3, user, str, z10, z11, f6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            h3Var = i20;
            f6Var2 = f6Var2;
            g10.setOnClickListener(onClickListener);
        }
        h3Var.smoothKeyboardAnimationEnabled = true;
        h3Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var2));
        h3Var.setOnDismissListener(new uq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j3, user, str, z10, z11, f6Var2);
        } else {
            h3Var.show();
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
        org.telegram.ui.ActionBar.h3 i12 = org.telegram.messenger.em.i(1, context, f6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i12.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        TextView b10 = w7.e6.b(context, 20.0f, i13, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.a6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i13, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, w7.a6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final bi.d g10 = org.telegram.messenger.em.g(24, context, f6Var, true);
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
        n01 n01Var = new n01(i10, j3, context, f6Var);
        n01Var.setClipToOutline(true);
        n01Var.setOutlineProvider(new ViewOutlineProvider());
        n01Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var));
        n01Var.a(user, str, z10, z11, new Utilities.Callback() {
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
                g10.g(LocaleController.getString(i14), true, true);
            }
        });
        linearLayout.addView(n01Var, w7.a6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context, 22, f6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        f9Var.setText(formatString);
        linearLayout.addView(f9Var, w7.a6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(g10, w7.a6.t(-1, 48, 7, 14, 19, 14, 12));
        i12.smoothKeyboardAnimationEnabled = true;
        i12.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        g10.setOnClickListener(new di.y3(g10, n01Var, messagesController, j3, user, strArr, i10, i12, z13, f6Var));
        imageView.setOnClickListener(new d3(i12, 3));
        i12.show();
        EditTextBoldCursor textView = n01Var.h.getTextView();
        textView.post(new s1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f25354a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f17342id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f25355b;
        tL_message.peer_id = messagesController.getPeer(j3);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f25360s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f25359r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new m01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new m01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f25359r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j3));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        nu0 nu0Var = this.d;
        nu0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        nu0Var.S7 = z13;
        this.f25359r.generateLayout(null);
        this.d.X3(this.f25359r, null, false, false, false, false);
        g9 g9Var = this.e;
        g9Var.r(user);
        this.f25357f.e(user, g9Var);
        this.f25361w = callback;
        this.f25362x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f25362x = false;
    }
}
