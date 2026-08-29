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
public final class uz0 extends LinearLayout {
    public final int f33397a;
    public final long f33398b;
    public final org.telegram.ui.ActionBar.c6 f33399c;
    public final vt0 d;
    public final e9 f33400e;
    public final t9 f33401f;
    public final org.telegram.ui.Cells.a6 h;
    public final o6 f33402n;
    public MessageObject f33403r;
    public boolean f33404s;
    public boolean v;
    public Utilities.Callback f33405w;
    public boolean f33406x;
    public float f33407y;

    public uz0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33407y = -6.0f;
        this.f33397a = i10;
        this.f33398b = j10;
        this.f33399c = c6Var;
        setOrientation(1);
        ih.j4 j4Var = new ih.j4(this, context, 3);
        j4Var.V(nh.f6.e(null, i10, j10, org.telegram.ui.ActionBar.g6.I.q()));
        vt0 vt0Var = new vt0(context, i10);
        this.d = vt0Var;
        j4Var.addView(vt0Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f33400e = new e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.f33401f = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        j4Var.addView(t9Var, i7.f6.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(j4Var, i7.f6.q(-1, -2, 7));
        org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, 0, null, c6Var);
        this.h = a6Var;
        EditTextBoldCursor textView = a6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        a6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var), PorterDuff.Mode.SRC_IN));
        a6Var.addView(imageView, i7.f6.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        i7.h6.a(imageView);
        imageView.setOnClickListener(new u70(textView, 20));
        o6 o6Var = new o6(context, false, true, false);
        this.f33402n = o6Var;
        o6Var.f31268n = false;
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var));
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setGravity(17);
        o6Var.setAllowCancel(true);
        o6Var.setScaleProperty(0.6f);
        a6Var.addView(o6Var, i7.f6.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new nz0(this));
        addView(a6Var, i7.f6.q(-1, -2, 7));
        vt0Var.setDelegate(new oc.i(this, textView, false, 6));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var) {
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
        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        if (z11) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        t9 t9Var = new t9(context);
        t9Var.setImageResource(R.drawable.large_user_tag);
        t9Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(t9Var, i7.f6.t(80, 80, 49, 0, 18, 0, 0));
        int i20 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = i7.j6.b(context, 20.0f, i20, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout.addView(b10, i7.f6.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = i7.j6.b(context, 14.0f, i20, false, null);
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
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23248nd, false)), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i13));
            spannableStringBuilder.setSpan(new pz0(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, i7.f6.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, i7.f6.t(-1, -2, 7, 16, 0, 16, 16));
        int i21 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            ?? s1Var = new org.telegram.ui.Cells.s1(context, i19);
            if (i21 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            s1Var.setDelegate(new rz0(z14, z11));
            ?? sz0Var = new sz0(context, c6Var2, s1Var);
            sz0Var.V(nh.f6.e(null, i19, j11, org.telegram.ui.ActionBar.g6.I.q()));
            sz0Var.addView(s1Var, i7.f6.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout3.addView(sz0Var, i7.f6.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            sz0Var.setClipToOutline(true);
            sz0Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            org.telegram.ui.ActionBar.f3 f3Var2 = q6;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f22539id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new tz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new tz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            s1Var.J7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            s1Var.O7 = z15;
            messageObject.generateLayout(null);
            s1Var.X3(messageObject, null, false, false, false, false);
            s1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i21++;
            i19 = i10;
            j11 = j10;
            q6 = f3Var2;
            linearLayout3 = linearLayout4;
        }
        final org.telegram.ui.ActionBar.f3 f3Var3 = q6;
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var2, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = i7.j6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.f23433y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, i7.f6.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(o10, i7.f6.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            o10.setText(jh.h5.g2(LocaleController.getString(R.string.Understood)));
            o10.setOnClickListener(new fi0(5, f3Var3, zArr));
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
            o10.setText(LocaleController.getString(i15));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f3.this.dismiss();
                    uz0.c(context, i10, j10, user, str, z10, z11, c6Var2);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            };
            f3Var = f3Var3;
            c6Var2 = c6Var2;
            o10.setOnClickListener(onClickListener);
        }
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var2));
        f3Var.setOnDismissListener(new fq0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j10, user, str, z10, z11, c6Var2);
        } else {
            f3Var.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z13 = false;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        q6.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        TextView b10 = i7.j6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, i7.f6.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, i7.f6.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
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
        o10.setText(LocaleController.getString(i11));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        uz0 uz0Var = new uz0(i10, j10, context, c6Var);
        uz0Var.setClipToOutline(true);
        uz0Var.setOutlineProvider(new ViewOutlineProvider());
        uz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        uz0Var.a(user, str, z10, z11, new Utilities.Callback() {
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
                o10.g(LocaleController.getString(i13), true, true);
            }
        });
        linearLayout.addView(uz0Var, i7.f6.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context, 22, c6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        y8Var.setText(formatString);
        linearLayout.addView(y8Var, i7.f6.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(o10, i7.f6.t(-1, 48, 7, 14, 19, 14, 12));
        q6.smoothKeyboardAnimationEnabled = true;
        q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        }
        o10.setOnClickListener(new jz0(o10, uz0Var, messagesController, j10, user, strArr, i10, q6, z13, c6Var));
        imageView.setOnClickListener(new d3(q6, 3));
        q6.show();
        EditTextBoldCursor textView = uz0Var.h.getTextView();
        textView.post(new s1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f33397a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f22539id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f33398b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f33404s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f33403r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new tz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new tz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f33403r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        vt0 vt0Var = this.d;
        vt0Var.J7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        vt0Var.O7 = z13;
        this.f33403r.generateLayout(null);
        this.d.X3(this.f33403r, null, false, false, false, false);
        e9 e9Var = this.f33400e;
        e9Var.r(user);
        this.f33401f.e(user, e9Var);
        this.f33405w = callback;
        this.f33406x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f33406x = false;
    }
}
