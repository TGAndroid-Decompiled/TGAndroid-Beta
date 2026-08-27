package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
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

public final class kz0 extends LinearLayout {

    public final int f30227a;

    public final long f30228b;

    public final org.telegram.ui.ActionBar.c6 f30229c;
    public final mt0 d;

    public final y8 f30230e;

    public final n9 f30231f;
    public final org.telegram.ui.Cells.z5 h;

    public final j6 f30232n;

    public MessageObject f30233r;

    public boolean f30234s;
    public boolean v;

    public Utilities.Callback f30235w;

    public boolean f30236x;

    public float f30237y;

    public kz0(int i10, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30237y = -6.0f;
        this.f30227a = i10;
        this.f30228b = j10;
        this.f30229c = c6Var;
        setOrientation(1);
        gh.q4 q4Var = new gh.q4(this, context, 3);
        q4Var.V(lh.q6.e(null, i10, j10, org.telegram.ui.ActionBar.g6.I.q()));
        mt0 mt0Var = new mt0(context, i10);
        this.d = mt0Var;
        q4Var.addView(mt0Var, h7.z5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
        this.f30230e = new y8((org.telegram.ui.ActionBar.c6) null);
        n9 n9Var = new n9(context);
        this.f30231f = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
        q4Var.addView(n9Var, h7.z5.d(42, 42.0f, 83, 8.0f, 0.0f, 0.0f, 12.0f));
        addView(q4Var, h7.z5.q(-1, -2, 7));
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, 0, null, c6Var);
        this.h = z5Var;
        EditTextBoldCursor textView = z5Var.getTextView();
        textView.setEnabled(true);
        textView.setSingleLine(true);
        textView.setImeOptions(6);
        z5Var.setTextRight(114);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_delete_old);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var), PorterDuff.Mode.SRC_IN));
        z5Var.addView(imageView, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 20.0f, 0.0f));
        h7.b6.a(imageView);
        imageView.setOnClickListener(new l70(textView, 20));
        j6 j6Var = new j6(context, false, true, false);
        this.f30232n = j6Var;
        j6Var.f29635n = false;
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(17);
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        z5Var.addView(j6Var, h7.z5.d(56, 50.0f, 117, 0.0f, 0.0f, 44.0f, 0.0f));
        textView.addTextChangedListener(new dz0(this));
        addView(z5Var, h7.z5.q(-1, -2, 7));
        mt0Var.setDelegate(new org.telegram.ui.i6(4, this, textView));
    }

    public static void b(final Context context, final int i10, final long j10, final TLRPC.User user, final String str, final boolean z10, final boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        org.telegram.ui.ActionBar.e3 e3Var;
        int i11;
        int i12 = i10;
        long j11 = j10;
        final org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
        if (chat == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var2, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3VarO.customView = linearLayout;
        int i13 = z11 ? -6988581 : z10 ? -12539616 : -6905171;
        n9 n9Var = new n9(context);
        n9Var.setImageResource(R.drawable.large_user_tag);
        n9Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), i13));
        linearLayout.addView(n9Var, h7.z5.t(80, 80, 49, 0, 18, 0, 0));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        TextView textViewB = h7.d6.b(context, 20.0f, i14, true, null);
        textViewB.setGravity(17);
        textViewB.setText(LocaleController.getString(z11 ? R.string.TagInfoOwnerTitle : z10 ? R.string.TagInfoAdminTitle : R.string.TagInfoMemberTitle));
        linearLayout.addView(textViewB, h7.z5.d(-1, -2.0f, 49, 32.0f, 15.0f, 32.0f, 0.0f));
        TextView textViewB2 = h7.d6.b(context, 14.0f, i14, false, null);
        textViewB2.setGravity(17);
        textViewB2.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        if (str == null) {
            if (z11) {
                i11 = R.string.ChatTagOwner;
            } else if (z10) {
                i11 = R.string.ChatTagAdmin;
            } else {
                string = "";
            }
            string = LocaleController.getString(i11);
        } else {
            string = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (z11 || z10) {
            int i15 = z11 ? -6988581 : -12539616;
            Paint paint = new Paint(1);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i15));
            spannableStringBuilder.setSpan(new fz0(i15, paint, string), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23240nd, false)), 0, spannableStringBuilder.length(), 33);
        }
        textViewB2.setText(AndroidUtilities.replaceCharSequence("un1", AndroidUtilities.replaceTags(LocaleController.formatString(z11 ? R.string.TagInfoOwnerText : z10 ? R.string.TagInfoAdminText : R.string.TagInfoMemberText, UserObject.getFirstName(user), chat.title)), spannableStringBuilder));
        linearLayout.addView(textViewB2, h7.z5.d(-1, -2.0f, 49, 32.0f, 10.0f, 32.0f, 25.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, h7.z5.t(-1, -2, 7, 16, 0, 16, 16));
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            gz0 gz0Var = new gz0(context, i12);
            gz0Var.setDelegate(new hz0(i16 == 1, z11));
            iz0 iz0Var = new iz0(context, c6Var2, gz0Var);
            iz0Var.V(lh.q6.e(null, i12, j11, org.telegram.ui.ActionBar.g6.I.q()));
            iz0Var.addView(gz0Var, h7.z5.d(-1, -2.0f, 87, 0.0f, 12.0f, 0.0f, 12.0f));
            linearLayout2.addView(iz0Var, h7.z5.p(0, -1, 1.0f, 119, i16 == 1 ? 6 : 0, 0, i16 == 0 ? 6 : 0, 0));
            iz0Var.setClipToOutline(true);
            iz0Var.setOutlineProvider(new cz0());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            LinearLayout linearLayout3 = linearLayout2;
            org.telegram.ui.ActionBar.e3 e3Var2 = e3VarO;
            tL_message.from_id = MessagesController.getInstance(i12).getPeer(user.f22527id);
            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(j11);
            tL_message.message = "";
            tL_message.date = ConnectionsManager.getInstance(i12).getCurrentTime();
            tL_message.out = false;
            MessageObject messageObject = new MessageObject(i12, tL_message, true, false);
            messageObject.forceAvatar = true;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("_\n_  ");
            spannableStringBuilder2.setSpan(new jz0(AndroidUtilities.dp(200.0f)), 0, 1, 33);
            spannableStringBuilder2.setSpan(new jz0(AndroidUtilities.dp(160.0f)), 2, 3, 33);
            messageObject.messageText = spannableStringBuilder2;
            gz0Var.J7 = true;
            gz0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
            messageObject.generateLayout(null);
            gz0Var.W3(messageObject, null, false, false, false, false);
            gz0Var.setTranslationX(-AndroidUtilities.dp(140.0f));
            i16++;
            i12 = i10;
            j11 = j10;
            e3VarO = e3Var2;
            linearLayout2 = linearLayout3;
        }
        final org.telegram.ui.ActionBar.e3 e3Var3 = e3VarO;
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var2, true);
        boolean z13 = (ChatObject.canManageTags(chat) && (!z10 || ((!z11 && z12) || UserObject.isUserSelf(user)))) || (ChatObject.canManageMyTag(chat) && UserObject.isUserSelf(user));
        if (!z13 && !ChatObject.canManageTags(chat) && !chat.creator && chat.admin_rights == null && !z11) {
            TextView textViewB3 = h7.d6.b(context, 12.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, null);
            textViewB3.setGravity(1);
            textViewB3.setText(LocaleController.getString(R.string.CantEditTagAdmins));
            linearLayout.addView(textViewB3, h7.z5.k(32.0f, 0.0f, 32.0f, 0.0f, -1, -2));
        }
        linearLayout.addView(dVarG, h7.z5.t(-1, 48, 7, 16, 16, 16, 16));
        final boolean[] zArr = new boolean[1];
        if (z13) {
            dVarG.setText(LocaleController.getString(UserObject.isUserSelf(user) ? TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddMyTag : R.string.TagInfoButtonEditMyTag : TextUtils.isEmpty(str) ? R.string.TagInfoButtonAddTag : R.string.TagInfoButtonEditTag));
            View.OnClickListener onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    e3Var3.dismiss();
                    kz0.c(context, i10, j10, user, str, z10, z11, c6Var2);
                    boolean[] zArr2 = zArr;
                    if (zArr2[0]) {
                        return;
                    }
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr2[0] = true;
                }
            };
            e3Var = e3Var3;
            c6Var2 = c6Var2;
            dVarG.setOnClickListener(onClickListener);
        } else {
            dVarG.setText(hh.i5.g2(LocaleController.getString(R.string.Understood)));
            dVarG.setOnClickListener(new xh0(5, e3Var3, zArr));
            e3Var = e3Var3;
        }
        e3Var.smoothKeyboardAnimationEnabled = true;
        e3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var2));
        e3Var.setOnDismissListener(new up0(zArr, 13));
        if (MessagesController.getGlobalMainSettings().getInt("showchattagsinfo", 3) > 0 || !z13) {
            e3Var.show();
        } else {
            c(context, i10, j10, user, str, z10, z11, c6Var2);
        }
    }

    public static void c(Context context, int i10, long j10, TLRPC.User user, String str, final boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getChat(Long.valueOf(-j10));
        boolean z12 = false;
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, true, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3VarO.customView = linearLayout;
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        TextView textViewB = h7.d6.b(context, 20.0f, i12, true, null);
        textViewB.setText(LocaleController.getString(R.string.MemberTagTitle));
        linearLayout2.addView(textViewB, h7.z5.p(0, -2, 1.0f, 19, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, AndroidUtilities.dp(18.0f)));
        linearLayout2.addView(imageView, h7.z5.t(32, 32, 21, 0, 0, 10, 0));
        linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 6.0f, 0.0f, 6.0f, -1, -2));
        final lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        final boolean z13 = !TextUtils.isEmpty(str) || z10;
        if (TextUtils.isEmpty(str) && !z10 && z13) {
            i11 = R.string.MemberTagButtonRemove;
        } else {
            i11 = z13 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
        }
        dVarG.setText(LocaleController.getString(i11));
        final String[] strArr = {str == null ? "" : str};
        kz0 kz0Var = new kz0(i10, j10, context, c6Var);
        kz0Var.setClipToOutline(true);
        kz0Var.setOutlineProvider(new ez0());
        kz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
        kz0Var.a(user, str, z10, z11, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                int i13;
                String str2 = (String) obj;
                strArr[0] = str2;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                boolean z14 = z13;
                if (zIsEmpty && !z10 && z14) {
                    i13 = R.string.MemberTagButtonRemove;
                } else {
                    i13 = z14 ? R.string.MemberTagButtonEdit : R.string.MemberTagButtonAdd;
                }
                dVarG.g(LocaleController.getString(i13), true, true);
            }
        });
        linearLayout.addView(kz0Var, h7.z5.r(-1, -2, 7, 12.0f, 12.0f, 12.0f, 1.66f));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 22, c6Var);
        x8Var.setText(UserObject.isUserSelf(user) ? LocaleController.getString(R.string.MemberTagSelfInfo) : LocaleController.formatString(R.string.MemberTagTheirInfo, UserObject.getUserName(user)));
        linearLayout.addView(x8Var, h7.z5.t(-1, -2, 7, 0, 0, 0, 0));
        linearLayout.addView(dVarG, h7.z5.t(-1, 48, 7, 14, 19, 14, 12));
        e3VarO.smoothKeyboardAnimationEnabled = true;
        e3VarO.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, c6Var));
        if (TextUtils.isEmpty(str) && !z10 && !z11) {
            z12 = true;
        }
        dVarG.setOnClickListener(new nh.j3(dVarG, kz0Var, messagesController, j10, user, strArr, i10, e3VarO, z12, c6Var));
        imageView.setOnClickListener(new z2(e3VarO, 3));
        e3VarO.show();
        EditTextBoldCursor textView = kz0Var.h.getTextView();
        textView.post(new p1(7, textView));
    }

    public final void a(TLRPC.User user, String str, boolean z10, boolean z11, Utilities.Callback callback) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = this.f30227a;
        tL_message.from_id = MessagesController.getInstance(i10).getPeer(user.f22527id);
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f30228b;
        tL_message.peer_id = messagesController.getPeer(j10);
        tL_message.message = "";
        tL_message.date = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_message.out = false;
        this.f30234s = z10;
        this.v = z11;
        MessageObject messageObject = new MessageObject(i10, tL_message, true, false);
        this.f30233r = messageObject;
        messageObject.forceAvatar = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_\n_  ");
        spannableStringBuilder.setSpan(new jz0((int) Math.min(AndroidUtilities.displaySize.x * 0.5f, AndroidUtilities.dp(200.0f))), 0, 1, 33);
        spannableStringBuilder.setSpan(new jz0((int) Math.min(AndroidUtilities.displaySize.x * 0.44f, AndroidUtilities.dp(160.0f))), 2, 3, 33);
        this.f30233r.messageText = spannableStringBuilder;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        boolean z12 = chat != null;
        mt0 mt0Var = this.d;
        mt0Var.J7 = z12;
        mt0Var.O7 = ChatObject.isChannel(chat) && chat.megagroup;
        this.f30233r.generateLayout(null);
        this.d.W3(this.f30233r, null, false, false, false, false);
        y8 y8Var = this.f30230e;
        y8Var.r(user);
        this.f30231f.e(user, y8Var);
        this.f30235w = callback;
        this.f30236x = true;
        this.h.n(str, LocaleController.getString((!TextUtils.isEmpty(str) || z10) ? R.string.MemberTagHintEdit : R.string.MemberTagHintAdd), false);
        this.f30236x = false;
    }
}
