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
public final class i11 extends LinearLayout {
    public final int f29142a;
    public final long f29143b;
    public final org.telegram.ui.ActionBar.u6 f29144c;
    public final hv0 d;
    public final j9 e;
    public final y9 f29145f;
    public final org.telegram.ui.Cells.h6 h;
    public final s6 f29146n;
    public MessageObject f29147r;
    public boolean f29148s;
    public boolean v;
    public Utilities.Callback f29149w;
    public boolean f29150x;
    public float f29151y;

    public i11(int i10, long j10, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f29151y = -6.0f;
        this.f29142a = i10;
        this.f29143b = j10;
        this.f29144c = u6Var;
        setOrientation(1);
        org.telegram.ui.a9 a9Var = new org.telegram.ui.a9(this, context, 2);
        a9Var.U(fi.o6.e(null, i10, j10, org.telegram.ui.ActionBar.y6.I.q()));
        hv0 hv0Var = new hv0(context, i10);
        this.d = hv0Var;
        a9Var.addView(hv0Var, gb1.h(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.e = new j9((org.telegram.ui.ActionBar.u6) null);
        y9 y9Var = new y9(context);
        this.f29145f = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        a9Var.addView(y9Var, gb1.h(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(a9Var, gb1.u(-1, -2, 7));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, 0, null, u6Var);
        this.h = h6Var;
        EditTextBoldCursor textView = h6Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        h6Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23748y6, u6Var, PorterDuff.Mode.SRC_IN);
        h6Var.addView(imageView, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        gb1.b(imageView);
        imageView.setOnClickListener(new w80(textView, 18));
        s6 s6Var = new s6(context, false, true, false);
        this.f29146n = s6Var;
        s6Var.f32444n = false;
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.f23598q7, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setGravity(17);
        s6Var.setAllowCancel(true);
        s6Var.setScaleProperty(0.6f);
        h6Var.addView(s6Var, gb1.h(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new b11(this));
        addView(h6Var, gb1.u(-1, -2, 7));
        hv0Var.setDelegate(new m4.c(this, textView, false, 10));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, final org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        boolean z13;
        int i15;
        org.telegram.ui.ActionBar.k3 k3Var;
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
        final org.telegram.ui.ActionBar.k3 i20 = org.telegram.messenger.vh.i(1, context, u6Var, true);
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
        y9 y9Var = new y9(context);
        y9Var.setImageResource(R.drawable.large_user_tag);
        y9Var.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(80.0f), i11));
        linearLayout.addView(y9Var, gb1.x(80, 80, 49, 0, 18, 0, 0));
        int i21 = org.telegram.ui.ActionBar.y6.G6;
        TextView L = gb1.L(context, 20.0f, i21, true, null);
        L.setGravity(17);
        if (z11) {
            i12 = R.string.TagInfoOwnerTitle;
        } else if (z10) {
            i12 = R.string.TagInfoAdminTitle;
        } else {
            i12 = R.string.TagInfoMemberTitle;
        }
        L.setText(LocaleController.getString(i12));
        linearLayout.addView(L, gb1.h(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView L2 = gb1.L(context, 14.0f, i21, false, null);
        L2.setGravity(17);
        L2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
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
            spannableStringBuilder.setSpan(new p10(org.telegram.ui.ActionBar.y6.f23547nd, null), 0, spannableStringBuilder.length(), 33);
        } else {
            if (z11) {
                i13 = -6988581;
            } else {
                i13 = -12539616;
            }
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, i13));
            spannableStringBuilder.setSpan(new d11(i13, paint, str2), 0, spannableStringBuilder.length(), 33);
        }
        if (z11) {
            i14 = R.string.TagInfoOwnerText;
        } else if (z10) {
            i14 = R.string.TagInfoAdminText;
        } else {
            i14 = R.string.TagInfoMemberText;
        }
        int i22 = 2;
        L2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(L2, gb1.h(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, gb1.x(-1, -2, 7, 16, 0, 16, 16));
        int i23 = 0;
        LinearLayout linearLayout3 = linearLayout2;
        while (i23 < i22) {
            ?? s1Var = new org.telegram.ui.Cells.s1(context, i19);
            if (i23 == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            s1Var.setDelegate(new f11(z14, z11));
            ?? g11Var = new g11(context, u6Var, s1Var);
            g11Var.U(fi.o6.e(null, i19, j11, org.telegram.ui.ActionBar.y6.I.q()));
            g11Var.addView(s1Var, gb1.h(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
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
            linearLayout3.addView(g11Var, gb1.t(0, -1, 1.0f, 119, i16, 0, i17, 0));
            g11Var.setClipToOutline(true);
            g11Var.setOutlineProvider(new ViewOutlineProvider());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout4 = linearLayout3;
            int i24 = i23;
            tL_message.from_id = MessagesController.getInstance(i19).getPeer(user.f22176id);
            tL_message.peer_id = MessagesController.getInstance(i19).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i19).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i19, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new h11(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new h11(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            s1Var.N7 = true;
            if (ChatObject.isChannel(chat) && chat.megagroup) {
                z15 = true;
            } else {
                z15 = false;
            }
            s1Var.S7 = z15;
            messageObject.generateLayout(null);
            s1Var.Z3(messageObject, null, false, false, false, false);
            s1Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i19 = i10;
            i22 = 2;
            linearLayout3 = linearLayout4;
            i23 = i24 + 1;
            j11 = j10;
        }
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        if ((ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user))) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView L3 = gb1.L(context, 12.0f, org.telegram.ui.ActionBar.y6.f23748y6, false, null);
            L3.setGravity(1);
            L3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(L3, gb1.o(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(f7, gb1.x(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (!z13) {
            f7.setText(bi.h7.H2(LocaleController.getString(R.string.Understood)));
            f7.setOnClickListener(new ga(28, i20, zArr));
            k3Var = i20;
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
            k3Var = i20;
            f7.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.k3.this.dismiss();
                    i11.c(context, i10, j10, user, str, z10, z11, u6Var);
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                        zArr2[0] = true;
                    }
                }
            });
        }
        k3Var.smoothKeyboardAnimationEnabled = true;
        k3Var.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.f23356d6);
        k3Var.setOnDismissListener(new mp0(zArr, 19));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) <= 0 && z13) {
            c(context, i10, j10, user, str, z10, z11, u6Var);
        } else {
            k3Var.show();
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var) {
        final boolean z12;
        int i11;
        String str2;
        String formatString;
        boolean z13;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.k3 i12 = org.telegram.messenger.vh.i(1, context, u6Var, true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        i12.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i13 = org.telegram.ui.ActionBar.y6.G6;
        TextView L = gb1.L(context, 20.0f, i13, true, null);
        L.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(L, gb1.t(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.f7.t(imageView, i13, u6Var, PorterDuff.Mode.SRC_IN);
        int i14 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 1, AndroidUtilities.dp(18.0f));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        linearLayout2.addView(imageView, gb1.x(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, gb1.o(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
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
        i11 i11Var = new i11(i10, j10, context, u6Var);
        i11Var.setClipToOutline(true);
        i11Var.setOutlineProvider(new ViewOutlineProvider());
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, i11Var, u6Var);
        i11Var.a(user, str, z10, z11, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i15;
                String str3 = (String) obj;
                strArr[0] = str3;
                boolean isEmpty = TextUtils.isEmpty(str3);
                boolean z14 = z12;
                if (isEmpty && !z10 && z14) {
                    i15 = R.string.MemberTagButtonRemove;
                } else if (z14) {
                    i15 = R.string.MemberTagButtonEdit;
                } else {
                    i15 = R.string.MemberTagButtonAdd;
                }
                f7.i(LocaleController.getString(i15), true, true);
            }
        });
        linearLayout.addView(i11Var, gb1.v(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context, 22, u6Var);
        if (UserObject.isUserSelf(user)) {
            formatString = LocaleController.getString(R.string.MemberTagSelfInfo);
        } else {
            formatString = LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user));
        }
        i9Var.setText(formatString);
        linearLayout.addView(i9Var, gb1.x(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(f7, gb1.x(-1, 48, 7, 14, 19, 14, 12));
        i12.smoothKeyboardAnimationEnabled = true;
        i12.setBackgroundColorKey(org.telegram.ui.ActionBar.y6.f23299a7);
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        f7.setOnClickListener(new hi.u3(f7, i11Var, messagesController, j10, user, strArr, i10, i12, z13, u6Var));
        imageView.setOnClickListener(new g3(i12, 3));
        i12.show();
        EditTextBoldCursor textView = i11Var.h.getTextView();
        textView.post(new o70(textView, 5));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        boolean z12;
        boolean z13;
        int i10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i11 = this.f29142a;
        tL_message.from_id = MessagesController.getInstance(i11).getPeer(user.f22176id);
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f29143b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i11).getCurrentTime();
        tL_message.out = false;
        this.f29148s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i11, tL_message, true, false);
        this.f29147r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new h11((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new h11((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f29147r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        if (chat != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        hv0 hv0Var = this.d;
        hv0Var.N7 = z12;
        if (ChatObject.isChannel(chat) && chat.megagroup) {
            z13 = true;
        } else {
            z13 = false;
        }
        hv0Var.S7 = z13;
        this.f29147r.generateLayout(null);
        hv0Var.Z3(this.f29147r, null, false, false, false, false);
        j9 j9Var = this.e;
        j9Var.r(user);
        this.f29145f.f(user, j9Var);
        this.f29149w = callback;
        this.f29150x = true;
        if (TextUtils.isEmpty(str) && !z10) {
            i10 = R.string.MemberTagHintAdd;
        } else {
            i10 = R.string.MemberTagHintEdit;
        }
        this.h.n(str, LocaleController.getString(i10), false);
        this.f29150x = false;
    }
}
