package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class t70 extends org.telegram.ui.ActionBar.e3 {

    public static final int f32675r = 0;

    public final String f32676b;

    public final org.telegram.ui.ActionBar.n2 f32677c;
    public final TLRPC.ChatInvite d;

    public final TLRPC.Chat f32678e;

    public final TextView f32679f;
    public final RadialProgressView h;

    public mc f32680n;

    public t70(Context context, TLObject tLObject, String str, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        final long j10;
        LinearLayout linearLayout;
        n9 n9Var;
        TLRPC.ChatInvite chatInvite;
        boolean z10;
        String str2;
        boolean z11;
        boolean z12;
        String str3;
        int iMax;
        TLRPC.ChatFull chatFull;
        String str4;
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        int i11;
        int i12;
        ll0 ll0Var;
        final boolean z13;
        boolean zIsEmpty;
        String lowerCase;
        int i13;
        TLRPC.ChatInvite chatInvite2;
        int i14;
        int i15;
        float f10;
        boolean z14;
        String string;
        super(context, c6Var, false, false);
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        this.f32677c = n2Var;
        if (!(tLObject instanceof TLRPC.ChatInvite)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f32678e = chat;
                j10 = chat.f22380id;
            } else {
                j10 = 0;
            }
            this.f32676b = str;
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClickable(true);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(linearLayout);
            NestedScrollView nestedScrollView = new NestedScrollView(context, null);
            nestedScrollView.addView(frameLayout);
            setCustomView(nestedScrollView);
            ImageView imageView = new ImageView(context);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
            imageView.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
            imageView.setImageResource(R.drawable.ic_layer_close);
            imageView.setOnClickListener(new l70(this, 1));
            int iDp = AndroidUtilities.dp(8.0f);
            imageView.setPadding(iDp, iDp, iDp, iDp);
            frameLayout.addView(imageView, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
            n9Var = new n9(context);
            n9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
            linearLayout.addView(n9Var, h7.z5.t(90, 90, 49, 0, 27, 0, 0));
            chatInvite = this.d;
            if (chatInvite != null) {
                if (chatInvite.chat != null) {
                    y8 y8Var = new y8(this.d.chat);
                    TLRPC.ChatInvite chatInvite3 = this.d;
                    TLRPC.Chat chat2 = chatInvite3.chat;
                    str3 = chat2.title;
                    iMax = chat2.participants_count;
                    n9Var.f30898a.setForUserOrChat(chat2, y8Var, chatInvite3);
                    n9Var.d();
                } else {
                    y8 y8Var2 = new y8((org.telegram.ui.ActionBar.c6) null);
                    y8Var2.n(0L, this.d.title, null);
                    TLRPC.ChatInvite chatInvite4 = this.d;
                    String str5 = chatInvite4.title;
                    iMax = chatInvite4.participants_count;
                    n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite4.photo.sizes, 50), this.d.photo), "50_50", y8Var2, this.d);
                    str3 = str5;
                }
                TLRPC.ChatInvite chatInvite5 = this.d;
                str2 = chatInvite5.about;
                z11 = chatInvite5.verified;
                z12 = chatInvite5.fake;
                z10 = chatInvite5.scam;
            } else if (this.f32678e != null) {
                y8 y8Var3 = new y8(this.f32678e);
                String str6 = this.f32678e.title;
                chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.f32678e.f22380id);
                if (chatFull != null) {
                    str4 = chatFull.about;
                } else {
                    str4 = null;
                }
                int i16 = this.f32678e.participants_count;
                if (chatFull != null) {
                    i10 = chatFull.participants_count;
                } else {
                    i10 = 0;
                }
                iMax = Math.max(i16, i10);
                TLRPC.Chat chat3 = this.f32678e;
                n9Var.f30898a.setForUserOrChat(chat3, y8Var3, chat3);
                n9Var.d();
                TLRPC.Chat chat4 = this.f32678e;
                z11 = chat4.verified;
                z12 = chat4.fake;
                z10 = chat4.scam;
                String str7 = str4;
                str3 = str6;
                str2 = str7;
            } else {
                z10 = false;
                str2 = null;
                z11 = false;
                z12 = false;
                str3 = null;
                iMax = 0;
            }
            h5Var = new org.telegram.ui.ActionBar.h5(context);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(20);
            i11 = org.telegram.ui.ActionBar.g6.f23161j5;
            h5Var.setTextColor(getThemedColor(i11));
            h5Var.l(str3, false);
            h5Var.setGravity(17);
            if (iMax > 0) {
                i12 = 0;
            } else {
                i12 = 20;
            }
            linearLayout.addView(h5Var, h7.z5.t(-2, -2, 49, 10, 10, 10, i12));
            if (!z10 || z12) {
                if (z10) {
                    ll0Var = org.telegram.ui.ActionBar.g6.f23103g1;
                } else {
                    ll0Var = org.telegram.ui.ActionBar.g6.f23120h1;
                }
                h5Var.i(ll0Var);
            } else if (z11) {
                h5Var.i(new dq(org.telegram.ui.ActionBar.g6.f23085f1, org.telegram.ui.ActionBar.g6.f23139i1));
            }
            TLRPC.ChatInvite chatInvite6 = this.d;
            z13 = (chatInvite6 == null && ((chatInvite6.channel && !chatInvite6.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite6.chat))) || (ChatObject.isChannel(this.f32678e) && !this.f32678e.megagroup);
            zIsEmpty = TextUtils.isEmpty(str2);
            TextView textViewH = org.telegram.messenger.y1.h(context, 1, 13.0f);
            int i17 = org.telegram.ui.ActionBar.g6.f23300r5;
            textViewH.setTextColor(getThemedColor(i17));
            textViewH.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textViewH.setEllipsize(truncateAt);
            if (z13) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
            }
            textViewH.setText(lowerCase);
            if (zIsEmpty) {
                i13 = 20;
            } else {
                i13 = 0;
            }
            linearLayout.addView(textViewH, h7.z5.t(-2, -2, 49, 10, 0, 10, i13));
            if (!zIsEmpty) {
                TextView textView = new TextView(context);
                textView.setGravity(17);
                textView.setText(str2);
                textView.setTextColor(getThemedColor(i11));
                textView.setTextSize(1, 15.0f);
                linearLayout.addView(textView, h7.z5.t(-1, -2, 48, 24, 10, 24, 20));
            }
            chatInvite2 = this.d;
            if (chatInvite2 != null || chatInvite2.request_needed) {
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                linearLayout.addView(frameLayout2, h7.z5.n(-1, -2));
                RadialProgressView radialProgressView = new RadialProgressView(getContext(), c6Var);
                this.h = radialProgressView;
                int i18 = org.telegram.ui.ActionBar.g6.Oh;
                radialProgressView.setProgressColor(getThemedColor(i18));
                radialProgressView.setSize(AndroidUtilities.dp(32.0f));
                radialProgressView.setVisibility(4);
                frameLayout2.addView(radialProgressView, h7.z5.e(48, 48, 17));
                TextView textView2 = new TextView(getContext());
                this.f32679f = textView2;
                int iDp2 = AndroidUtilities.dp(24.0f);
                int themedColor = getThemedColor(i18);
                int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
                textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, themedColor, themedColor2, themedColor2));
                textView2.setEllipsize(truncateAt);
                textView2.setGravity(17);
                textView2.setSingleLine(true);
                if (z13) {
                    i14 = R.string.RequestToJoinChannel;
                } else {
                    i14 = R.string.RequestToJoinGroup;
                }
                textView2.setText(LocaleController.getString(i14));
                textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
                textView2.setTextSize(1, 14.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        t70.s(this.f31817a, z13, j10);
                    }
                });
                frameLayout2.addView(textView2, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
                TextView textView3 = new TextView(getContext());
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                if (z13) {
                    i15 = R.string.RequestToJoinChannelDescription;
                } else {
                    i15 = R.string.RequestToJoinGroupDescription;
                }
                textView3.setText(LocaleController.getString(i15));
                textView3.setTextColor(getThemedColor(i17));
                linearLayout.addView(textView3, h7.z5.t(-1, -2, 48, 24, 17, 24, 15));
            }
            int i19 = 3;
            if (chatInvite2.participants.isEmpty()) {
                f10 = 24.0f;
                z14 = false;
            } else {
                int iMin = Math.min(this.d.participants.size(), 3);
                b9 b9Var = new b9(context, false);
                b9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
                float f11 = 38;
                b9Var.setSize(AndroidUtilities.dp(f11));
                b9Var.setCount(iMin);
                b9Var.setStepFactor(0.65f);
                for (int i20 = 0; i20 < iMin; i20++) {
                    b9Var.b(i20, this.d.participants.get(i20), UserConfig.selectedAccount);
                }
                f10 = 24.0f;
                b9Var.a(false);
                linearLayout.addView(b9Var, h7.z5.t((int) ((((0.65f * f11) + 1.0f) * (iMin - 1)) + f11), 44, 17, 0, 2, 0, 4));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 13.0f);
                textView4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23300r5));
                textView4.setGravity(17);
                if (iMin == 1) {
                    z14 = false;
                    string = w(textView4, this.d, 0).toString();
                } else {
                    z14 = false;
                    if (iMin == 2) {
                        string = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, w(textView4, this.d, 0), w(textView4, this.d, 1));
                    } else if (iMax == 3) {
                        string = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, w(textView4, this.d, 0), w(textView4, this.d, 1), w(textView4, this.d, 2));
                    } else {
                        int iMax2 = Math.max(iMax - iMin, 2);
                        string = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", iMax2), w(textView4, this.d, 0), w(textView4, this.d, 1), Integer.valueOf(iMax2));
                    }
                }
                textView4.setText(string);
                linearLayout.addView(textView4, h7.z5.t(-2, -2, 49, 10, 0, 10, 24));
            }
            TLRPC.ChatInvite chatInvite7 = this.d;
            if ((chatInvite7.channel && !chatInvite7.megagroup) || (ChatObject.isChannel(chatInvite7.chat) && !this.d.chat.megagroup)) {
                z14 = true;
            }
            TextView textView5 = new TextView(getContext());
            int iDp3 = AndroidUtilities.dp(f10);
            int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
            int themedColor4 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
            textView5.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, themedColor3, themedColor4, themedColor4));
            h7.b6.b(textView5, 0.02f, 1.2f);
            textView5.setEllipsize(TextUtils.TruncateAt.END);
            textView5.setGravity(17);
            textView5.setSingleLine(true);
            textView5.setText(LocaleController.getString(z14 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
            textView5.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
            textView5.setTextSize(1, 14.0f);
            textView5.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView5, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 14));
            textView5.setOnClickListener(new gh.o(this, j10, i19));
            return;
        }
        TLRPC.ChatInvite chatInvite8 = (TLRPC.ChatInvite) tLObject;
        this.d = chatInvite8;
        TLRPC.Chat chat5 = chatInvite8.chat;
        j10 = chat5 != null ? -chat5.f22380id : 0L;
        this.f32676b = str;
        linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView(linearLayout);
        NestedScrollView nestedScrollView2 = new NestedScrollView(context, null);
        nestedScrollView2.addView(frameLayout3);
        setCustomView(nestedScrollView2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        imageView2.setColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ji));
        imageView2.setImageResource(R.drawable.ic_layer_close);
        imageView2.setOnClickListener(new l70(this, 1));
        int iDp4 = AndroidUtilities.dp(8.0f);
        imageView2.setPadding(iDp4, iDp4, iDp4, iDp4);
        frameLayout3.addView(imageView2, h7.z5.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(n9Var, h7.z5.t(90, 90, 49, 0, 27, 0, 0));
        chatInvite = this.d;
        if (chatInvite != null) {
            if (chatInvite.chat != null) {
                y8 y8Var4 = new y8(this.d.chat);
                TLRPC.ChatInvite chatInvite9 = this.d;
                TLRPC.Chat chat6 = chatInvite9.chat;
                str3 = chat6.title;
                iMax = chat6.participants_count;
                n9Var.f30898a.setForUserOrChat(chat6, y8Var4, chatInvite9);
                n9Var.d();
            } else {
                y8 y8Var5 = new y8((org.telegram.ui.ActionBar.c6) null);
                y8Var5.n(0L, this.d.title, null);
                TLRPC.ChatInvite chatInvite10 = this.d;
                String str8 = chatInvite10.title;
                iMax = chatInvite10.participants_count;
                n9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite10.photo.sizes, 50), this.d.photo), "50_50", y8Var5, this.d);
                str3 = str8;
            }
            TLRPC.ChatInvite chatInvite11 = this.d;
            str2 = chatInvite11.about;
            z11 = chatInvite11.verified;
            z12 = chatInvite11.fake;
            z10 = chatInvite11.scam;
        } else if (this.f32678e != null) {
            y8 y8Var6 = new y8(this.f32678e);
            String str9 = this.f32678e.title;
            chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.f32678e.f22380id);
            if (chatFull != null) {
                str4 = chatFull.about;
            } else {
                str4 = null;
            }
            int i110 = this.f32678e.participants_count;
            if (chatFull != null) {
                i10 = chatFull.participants_count;
            } else {
                i10 = 0;
            }
            iMax = Math.max(i110, i10);
            TLRPC.Chat chat7 = this.f32678e;
            n9Var.f30898a.setForUserOrChat(chat7, y8Var6, chat7);
            n9Var.d();
            TLRPC.Chat chat8 = this.f32678e;
            z11 = chat8.verified;
            z12 = chat8.fake;
            z10 = chat8.scam;
            String str10 = str4;
            str3 = str9;
            str2 = str10;
        } else {
            z10 = false;
            str2 = null;
            z11 = false;
            z12 = false;
            str3 = null;
            iMax = 0;
        }
        h5Var = new org.telegram.ui.ActionBar.h5(context);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(20);
        i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        h5Var.setTextColor(getThemedColor(i11));
        h5Var.l(str3, false);
        h5Var.setGravity(17);
        if (iMax > 0) {
            i12 = 0;
        } else {
            i12 = 20;
        }
        linearLayout.addView(h5Var, h7.z5.t(-2, -2, 49, 10, 10, 10, i12));
        if (z10) {
            if (z10) {
                ll0Var = org.telegram.ui.ActionBar.g6.f23103g1;
            } else {
                ll0Var = org.telegram.ui.ActionBar.g6.f23120h1;
            }
            h5Var.i(ll0Var);
        } else {
            if (z10) {
                ll0Var = org.telegram.ui.ActionBar.g6.f23103g1;
            } else {
                ll0Var = org.telegram.ui.ActionBar.g6.f23120h1;
            }
            h5Var.i(ll0Var);
        }
        TLRPC.ChatInvite chatInvite12 = this.d;
        if (chatInvite12 == null) {
        }
        zIsEmpty = TextUtils.isEmpty(str2);
        TextView textViewH2 = org.telegram.messenger.y1.h(context, 1, 13.0f);
        int i111 = org.telegram.ui.ActionBar.g6.f23300r5;
        textViewH2.setTextColor(getThemedColor(i111));
        textViewH2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        textViewH2.setEllipsize(truncateAt2);
        if (z13) {
            lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
        } else {
            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
        }
        textViewH2.setText(lowerCase);
        if (zIsEmpty) {
            i13 = 0;
        } else {
            i13 = 20;
        }
        linearLayout.addView(textViewH2, h7.z5.t(-2, -2, 49, 10, 0, 10, i13));
        if (!zIsEmpty) {
            TextView textView6 = new TextView(context);
            textView6.setGravity(17);
            textView6.setText(str2);
            textView6.setTextColor(getThemedColor(i11));
            textView6.setTextSize(1, 15.0f);
            linearLayout.addView(textView6, h7.z5.t(-1, -2, 48, 24, 10, 24, 20));
        }
        chatInvite2 = this.d;
        if (chatInvite2 != null) {
        }
        FrameLayout frameLayout4 = new FrameLayout(getContext());
        linearLayout.addView(frameLayout4, h7.z5.n(-1, -2));
        RadialProgressView radialProgressView2 = new RadialProgressView(getContext(), c6Var);
        this.h = radialProgressView2;
        int i112 = org.telegram.ui.ActionBar.g6.Oh;
        radialProgressView2.setProgressColor(getThemedColor(i112));
        radialProgressView2.setSize(AndroidUtilities.dp(32.0f));
        radialProgressView2.setVisibility(4);
        frameLayout4.addView(radialProgressView2, h7.z5.e(48, 48, 17));
        TextView textView7 = new TextView(getContext());
        this.f32679f = textView7;
        int iDp5 = AndroidUtilities.dp(24.0f);
        int themedColor5 = getThemedColor(i112);
        int themedColor6 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        textView7.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp5, iDp5, iDp5, iDp5, themedColor5, themedColor6, themedColor6));
        textView7.setEllipsize(truncateAt2);
        textView7.setGravity(17);
        textView7.setSingleLine(true);
        if (z13) {
            i14 = R.string.RequestToJoinChannel;
        } else {
            i14 = R.string.RequestToJoinGroup;
        }
        textView7.setText(LocaleController.getString(i14));
        textView7.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
        textView7.setTextSize(1, 14.0f);
        textView7.setTypeface(AndroidUtilities.bold());
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                t70.s(this.f31817a, z13, j10);
            }
        });
        frameLayout4.addView(textView7, h7.z5.t(-1, 48, 8388611, 14, 0, 14, 0));
        TextView textView8 = new TextView(getContext());
        textView8.setGravity(17);
        textView8.setTextSize(1, 14.0f);
        if (z13) {
            i15 = R.string.RequestToJoinChannelDescription;
        } else {
            i15 = R.string.RequestToJoinGroupDescription;
        }
        textView8.setText(LocaleController.getString(i15));
        textView8.setTextColor(getThemedColor(i111));
        linearLayout.addView(textView8, h7.z5.t(-1, -2, 48, 24, 17, 24, 15));
    }

    public static void m(t70 t70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        t70 t70Var2;
        if (!(chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk)) {
            updates = null;
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                o70 o70Var = new o70(t70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j10, 1);
                t70Var2 = t70Var;
                AndroidUtilities.runOnUIThread(o70Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(t70Var2, tL_error, updates, tL_messages_importChatInvite, 20));
        }
        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
        MessagesController.getInstance(t70Var.currentAccount).processUpdates(updates2, false);
        updates = updates2;
        t70Var2 = t70Var;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(t70Var2, tL_error, updates, tL_messages_importChatInvite, 20));
    }

    public static void n(t70 t70Var, TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.f32677c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            y4.f0(t70Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        MessagesController.getInstance(t70Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(t70Var.currentAccount).putChats(updates.chats, false);
        long j10 = chat.f22380id;
        boolean z10 = !ChatObject.isChannelAndNotMegaGroup(chat);
        t70Var.getClass();
        Bundle bundleH = com.google.android.recaptcha.internal.a.h(j10, "chat_id");
        MessagesController messagesController = MessagesController.getInstance(t70Var.currentAccount);
        org.telegram.ui.ActionBar.n2 n2Var2 = t70Var.f32677c;
        if (messagesController.checkCanOpenChat(bundleH, n2Var2)) {
            n2Var2.presentFragment(new s70(t70Var, bundleH, z10, j10), n2Var2 instanceof org.telegram.ui.rn);
        }
    }

    public static void p(t70 t70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(t70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void q(t70 t70Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j10) {
        MessagesController.getInstance(t70Var.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(t70Var.currentAccount).openGuardBotWebApp(j10, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public static void r(t70 t70Var, long j10) {
        t70Var.dismiss();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = t70Var.f32676b;
        ConnectionsManager.getInstance(t70Var.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new gh.p5(t70Var, j10, tL_messages_importChatInvite), 2);
    }

    public static void s(final t70 t70Var, boolean z10, long j10) {
        TLRPC.Chat chat = t70Var.f32678e;
        final int i10 = 0;
        AndroidUtilities.runOnUIThread(new Runnable(t70Var) {

            public final t70 f32098b;

            {
                this.f32098b = t70Var;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        t70 t70Var2 = this.f32098b;
                        if (!t70Var2.isDismissed()) {
                            t70Var2.f32679f.setVisibility(4);
                            t70Var2.h.setVisibility(0);
                        }
                        break;
                    default:
                        this.f32098b.dismiss();
                        break;
                }
            }
        }, 400L);
        if (t70Var.d != null || chat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = t70Var.f32676b;
            ConnectionsManager.getInstance(t70Var.currentAccount).sendRequest(tL_messages_importChatInvite, new hh.h(t70Var, j10, z10, tL_messages_importChatInvite), 2);
        } else {
            final int i11 = 1;
            MessagesController.getInstance(t70Var.currentAccount).addUserToChat(chat.f22380id, UserConfig.getInstance(t70Var.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(t70Var) {

                public final t70 f32098b;

                {
                    this.f32098b = t70Var;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            t70 t70Var2 = this.f32098b;
                            if (!t70Var2.isDismissed()) {
                                t70Var2.f32679f.setVisibility(4);
                                t70Var2.h.setVisibility(0);
                            }
                            break;
                        default:
                            this.f32098b.dismiss();
                            break;
                    }
                }
            }, new eh.q(6, t70Var, z10));
        }
    }

    public static void t(t70 t70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        t70 t70Var2;
        if (!(tLObject instanceof TLRPC.TL_chatInviteJoinResultOk)) {
            if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                o70 o70Var = new o70(t70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j10, 0);
                t70Var2 = t70Var;
                AndroidUtilities.runOnUIThread(o70Var);
            }
            AndroidUtilities.runOnUIThread(new cg.c(t70Var2, tL_error, z10, tL_messages_importChatInvite, 15));
        }
        MessagesController.getInstance(t70Var.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        t70Var2 = t70Var;
        AndroidUtilities.runOnUIThread(new cg.c(t70Var2, tL_error, z10, tL_messages_importChatInvite, 15));
    }

    public static void u(t70 t70Var, TLRPC.TL_error tL_error, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        org.telegram.ui.ActionBar.n2 n2Var = t70Var.f32677c;
        if (n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                t70Var.setOnDismissListener(new p70(1, t70Var, z10));
            } else {
                y4.f0(t70Var.currentAccount, tL_error, n2Var, tL_messages_importChatInvite, new Object[0]);
            }
        }
        t70Var.dismiss();
    }

    public static CharSequence w(TextView textView, TLRPC.ChatInvite chatInvite, int i10) {
        String str = chatInvite.participants.get(i10).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    public static void x(Context context, org.telegram.ui.ActionBar.n2 n2Var, mc mcVar, boolean z10) {
        if (context == null) {
            if (n2Var != null) {
                n2Var.getContext();
                return;
            }
            return;
        }
        if (mcVar == null) {
            mcVar = mc.a0(n2Var);
        }
        bc bcVar = new bc(context, n2Var.getResourceProvider());
        bcVar.f27063a.f(R.raw.timer_3, 28, 28, null);
        bcVar.f27064b.setText(LocaleController.getString(R.string.RequestToJoinSent));
        bcVar.f27065c.setText(z10 ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        mcVar.b(bcVar, 2750).j();
    }
}
