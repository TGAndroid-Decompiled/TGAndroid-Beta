package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
public final class a11 extends LinearLayout {
    public final int f24594a;
    public final long f24595b;
    public final org.telegram.ui.ActionBar.g6 f24596c;
    public final dv0 d;
    public final h9 e;
    public final w9 f24597f;
    public final org.telegram.ui.Cells.d6 h;
    public final q6 f24598n;
    public MessageObject f24599r;
    public boolean f24600s;
    public boolean v;
    public Utilities.Callback f24601w;
    public boolean f24602x;
    public float f24603y;

    public a11(int i10, long j10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24603y = -6.0f;
        this.f24594a = i10;
        this.f24595b = j10;
        this.f24596c = g6Var;
        setOrientation(1);
        org.telegram.ui.y8 y8Var = new org.telegram.ui.y8(this, context, 2);
        y8Var.U(ei.r6.e(null, i10, j10, org.telegram.ui.ActionBar.k6.I.q()));
        dv0 dv0Var = new dv0(context, i10);
        this.d = dv0Var;
        y8Var.addView(dv0Var, w7.z5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new h9((org.telegram.ui.ActionBar.g6) null);
        w9 w9Var = new w9(context);
        this.f24597f = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        y8Var.addView(w9Var, w7.z5.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(y8Var, w7.z5.q(-1, -2, 7));
        org.telegram.ui.Cells.d6 d6Var = new org.telegram.ui.Cells.d6(context, 0, null, g6Var);
        this.h = d6Var;
        EditTextBoldCursor textView = d6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        d6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21571y6, g6Var, PorterDuff.Mode.SRC_IN);
        d6Var.addView(imageView, w7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        w7.b6.a(imageView);
        imageView.setOnClickListener(new v80(textView, 19));
        q6 q6Var = new q6(context, false, true, false);
        this.f24598n = q6Var;
        q6Var.f29776n = false;
        q6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(q6Var, org.telegram.ui.ActionBar.k6.f21421q7, g6Var);
        q6Var.setTextSize(AndroidUtilities.dp(14.0f));
        q6Var.setGravity(17);
        q6Var.setAllowCancel(true);
        q6Var.setScaleProperty(0.6f);
        d6Var.addView(q6Var, w7.z5.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new t01(this));
        addView(d6Var, w7.z5.q(-1, -2, 7));
        dv0Var.setDelegate(new mi.q(this, textView, false, 10));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.g6 g6Var) {
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
        long j11 = j10;
        TLRPC.Chat chat = MessagesController.getInstance(i19).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        final org.telegram.ui.ActionBar.h3 j12 = org.telegram.messenger.sl.j(1, context, g6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j12.customView = linearLayout;
        if (z11) {
            i11 = -6988581;
        } else if (z10) {
            i11 = -12539616;
        } else {
            i11 = -6905171;
        }
        w9 w9Var = new w9(context);
        w9Var.setImageResource(R.drawable.large_user_tag);
        w9Var.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(w9Var, w7.z5.t(80, 80, 49, 0, 18, 0, 0));
        int i20 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i20, true, null);
        b10.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        b10.setText(LocaleController.getString(i12));
        linearLayout.addView(b10, w7.z5.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView b11 = w7.d6.b(context, 14.0f, i20, false, null);
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
            spannableStringBuilder.setSpan(new m10(org.telegram.ui.ActionBar.k6.f21373nd, null), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, i13));
            spannableStringBuilder.setSpan(new v01(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        int i21 = 2;
        b11.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(b11, w7.z5.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 7, 16, 0, 16, 16));
        int i22 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        while (i22 < i21) {
            ?? t1Var = new org.telegram.ui.Cells.t1(context, i19);
            if (i22 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            t1Var.setDelegate(new x01(z14, z11));
            ?? y01Var = new y01(context, g6Var, t1Var);
            y01Var.U(ei.r6.e(null, i19, j11, org.telegram.ui.ActionBar.k6.I.q()));
            y01Var.addView(t1Var, w7.z5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            if (i22 == 1) {
                i16 = 6;
            } else {
                i16 = 0;
            }
            if (i22 == 0) {
                i17 = 6;
            } else {
                i17 = 0;
            }
            linearLayout3.addView(y01Var, w7.z5.p(0, -1, 1.0f, 119, i16, 0, i17, 0));
            y01Var.setClipToOutline(true);
            y01Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            int i23 = i22;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f20490id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new z01(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new z01(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            t1Var.N7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            t1Var.S7 = z15;
            messageObject.generateLayout(null);
            t1Var.W3(messageObject, null, false, false, false, false);
            t1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i19 = i10;
            i21 = 2;
            linearLayout3 = linearLayout4;
            i22 = i23 + 1;
            j11 = j10;
        }
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView b12 = w7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.k6.f21571y6, false, null);
            b12.setGravity(1);
            b12.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(b12, w7.z5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(g10, w7.z5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            g10.setText(ai.l7.H2(LocaleController.getString(R.string.Understood)));
            g10.setOnClickListener(new ca(28, j12, zArr));
            h3Var = j12;
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
            h3Var = j12;
            g10.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.h3.this.dismiss();
                    a11.c(context, i10, j10, user, str, z10, z11, g6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        h3Var.smoothKeyboardAnimationEnabled = true;
        h3Var.setBackgroundColorKey(org.telegram.ui.ActionBar.k6.f21183d6);
        h3Var.setOnDismissListener(new kr0(zArr, 14));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j10, user, str, z10, z11, g6Var);
        } else {
            h3Var.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        boolean z13;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.sl.j(1, context, g6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j11.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        TextView b10 = w7.d6.b(context, 20.0f, i12, true, null);
        b10.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(b10, w7.z5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.r6.t(imageView, i12, g6Var, PorterDuff.Mode.SRC_IN);
        int i13 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        linearLayout2.addView(imageView, w7.z5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
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
        a11 a11Var = new a11(i10, j10, context, g6Var);
        a11Var.setClipToOutline(true);
        a11Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, a11Var, g6Var);
        a11Var.a(user, str, z10, z11, new Utilities.Callback() {
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
                g10.i(LocaleController.getString(i14), true, true);
            }
        });
        linearLayout.addView(a11Var, w7.z5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context, 22, g6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        e9Var.setText(formatString);
        linearLayout.addView(e9Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(g10, w7.z5.t(-1, 48, 7, 14, 19, 14, 12));
        j11.smoothKeyboardAnimationEnabled = true;
        j11.setBackgroundColorKey(org.telegram.ui.ActionBar.k6.f21125a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        g10.setOnClickListener(new gi.l3(g10, a11Var, messagesController, j10, user, strArr, i10, j11, z13, g6Var));
        imageView.setOnClickListener(new e3(j11, 3));
        j11.show();
        EditTextBoldCursor textView = a11Var.h.getTextView();
        textView.post(new n70(textView, 5));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f24594a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f20490id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f24595b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f24600s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f24599r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new z01((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new z01((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f24599r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        dv0 dv0Var = this.d;
        dv0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        dv0Var.S7 = z13;
        this.f24599r.generateLayout(null);
        dv0Var.W3(this.f24599r, null, false, false, false, false);
        h9 h9Var = this.e;
        h9Var.r(user);
        this.f24597f.e(user, h9Var);
        this.f24601w = callback;
        this.f24602x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f24602x = false;
    }
}
