package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g5 implements Utilities.Callback2 {
    public final int f37068a;
    public final Object f37069b;

    public g5(Object obj, int i10) {
        this.f37068a = i10;
        this.f37069b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        d91 d91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.qy qyVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r9 = false;
        boolean z11 = false;
        switch (this.f37068a) {
            case 0:
                h5 h5Var = (h5) this.f37069b;
                h5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                h5Var.f37410w = false;
                gh.b bVar = h5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, h5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f37069b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var = (org.telegram.ui.Components.s61) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.f61 c10 = org.telegram.ui.Components.f61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26145q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.f61 c11 = org.telegram.ui.Components.f61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26145q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.f61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, 0);
                            int i22 = k9.f38434a;
                            org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.f61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(7, m9Var, i9Var);
                        int i23 = g9.f37096a;
                        org.telegram.ui.Components.f61 J2 = org.telegram.ui.Components.f61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.l0(i9Var.f37777c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.f61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.f61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.f61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f37069b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var2 = (org.telegram.ui.Components.s61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f38497y0).getChat(Long.valueOf(-keVar.f38498z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f38497y0).getChatFull(-keVar.f38498z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f38478f1) {
                    arrayList4.add(org.telegram.ui.Components.f61.g(keVar.C0));
                    d91 d91Var2 = keVar.f38486o1;
                    if (d91Var2 != null && !d91Var2.f36106l) {
                        arrayList4.add(org.telegram.ui.Components.f61.h(5, i10, d91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.f61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    d91 d91Var3 = keVar.f38487p1;
                    if (d91Var3 != null && !d91Var3.f36106l) {
                        arrayList4.add(org.telegram.ui.Components.f61.h(2, i10, d91Var3));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-2, charSequence));
                    }
                }
                if (keVar.f38479g1 && (d91Var = keVar.f38488q1) != null && !d91Var.f36106l) {
                    arrayList4.add(org.telegram.ui.Components.f61.h(2, i10, d91Var));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-3, null));
                }
                if (keVar.f38489r1) {
                    arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.f38490s1));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.f38491t1));
                    arrayList4.add(org.telegram.ui.Components.f61.u(keVar.f38492u1));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f38478f1) {
                        arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.f61.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-5, keVar.D0));
                        int i24 = MessagesController.getInstance(keVar.f38497y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(0, new to0(i11, context, null, false));
                            yqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.f61 i25 = org.telegram.ui.Components.f61.i(1, string);
                        if (keVar.B0 >= i24 && keVar.f38484m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.f61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f38479g1) {
                        arrayList4.add(org.telegram.ui.Components.f61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.f61.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.f61.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f38497y0).getChat(Long.valueOf(-keVar.f38498z0))) && MessagesController.getInstance(keVar.f38497y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, keVar.f38496x0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.f61.A(-7, null));
                }
                if (keVar.f38477e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.f61.p(keVar.f38477e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.f61.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f37069b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var3 = (org.telegram.ui.Components.s61) obj2;
                ge geVar = eeVar.f36474f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f37163n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = ai.gd.f1380a;
                        org.telegram.ui.Components.f61 J3 = org.telegram.ui.Components.f61.J(ai.gd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f26145q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f37164r)) {
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = ai.gd.f1380a;
                        org.telegram.ui.Components.f61 J4 = org.telegram.ui.Components.f61.J(ai.gd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f26145q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f37162f)) {
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.f61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ko koVar = (ko) this.f37069b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.xc.a0(koVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.f38560k0);
                AndroidUtilities.removeFromParent(koVar.f38557h0);
                AndroidUtilities.removeFromParent(koVar.f38559j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new eq((jr) this.f37069b, 1), 1000L);
                return;
            case 6:
                ((n4.s) this.f37069b).F(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                hs hsVar = (hs) this.f37069b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var4 = (org.telegram.ui.Components.s61) obj2;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.V));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.f37594b));
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.f37595c));
                if (TextUtils.isEmpty(hsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.f61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.f61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.f61.B(null));
                }
                if (hsVar.I && hsVar.K) {
                    org.telegram.ui.Components.f61 i29 = org.telegram.ui.Components.f61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(hsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.f61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.d));
                i2.d.B(R.string.AddNotesInfo, arrayList8);
                if (!hsVar.I) {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.f37601x));
                    arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.f37602y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.f61.k(hsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.f61.B(null));
                    org.telegram.ui.Components.f61 e = org.telegram.ui.Components.f61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f26146r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.f61.B(charSequence2));
                if (hsVar.Y) {
                    AndroidUtilities.runOnUIThread(new yr(hsVar, user, 0));
                    hsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new zr(hsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                gt.a((gt) this.f37069b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ct ctVar = (ct) this.f37069b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                gt gtVar = ctVar.f35970a;
                et etVar = gtVar.f37303l;
                if (etVar != null) {
                    String join = TextUtils.join("", gtVar.f37306o);
                    if (callback != null) {
                        qyVar = new org.telegram.ui.Components.qy(7, ctVar, callback);
                    } else {
                        qyVar = null;
                    }
                    etVar.t(charSequence3, join, qyVar);
                    if (callback == null) {
                        gtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.s61 s61Var5 = (org.telegram.ui.Components.s61) obj2;
                st.S((st) this.f37069b, (ArrayList) obj);
                return;
            case 11:
                ey eyVar = (ey) this.f37069b;
                Long l10 = (Long) obj2;
                eyVar.P1 = (Long) obj;
                eyVar.S4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f37069b).run();
                return;
            case 13:
                final wy wyVar = (wy) this.f37069b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var6 = (org.telegram.ui.Components.s61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(2);
                f61Var.f26140l = string2;
                f61Var.f26139k = i30;
                arrayList9.add(f61Var);
                org.telegram.ui.Components.f61 i31 = org.telegram.ui.Components.f61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(wyVar.f42938c);
                arrayList9.add(i31);
                if (wyVar.f42938c) {
                    arrayList9.add(org.telegram.ui.Components.f61.B(null));
                    arrayList9.add(org.telegram.ui.Components.f61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    ai.q5 q5Var = wyVar2.f42939f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(wyVar2.f42938c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.q5 q5Var2 = wyVar3.f42939f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(wyVar3.f42938c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    ai.q5 q5Var = wyVar2.f42939f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(wyVar2.f42938c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.q5 q5Var2 = wyVar3.f42939f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(wyVar3.f42938c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = uy.f42044a;
                    org.telegram.ui.Components.f61 J5 = org.telegram.ui.Components.f61.J(uy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(wyVar.d);
                    arrayList9.add(J5);
                    i2.d.B(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                kb0 kb0Var = (kb0) this.f37069b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                kb0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(kb0Var.f38455b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.g0.q(R.string.AIEditorStyleNotFound, kb0.d(), R.raw.error, 36);
                        return;
                    } else {
                        kb0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                sv0 sv0Var = (sv0) this.f37069b;
                gh.b bVar2 = sv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                sv0Var.f41510s = (Bitmap) obj;
                Paint paint = new Paint(1);
                sv0Var.f41511w = paint;
                Bitmap bitmap2 = sv0Var.f41510s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                sv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                sv0Var.f41511w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                sv0Var.f41512x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, sv0Var.f41501c);
                sv0Var.G.d();
                return;
            case 16:
                zv0 zv0Var = (zv0) this.f37069b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var7 = (org.telegram.ui.Components.s61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.f61 f61Var2 = new org.telegram.ui.Components.f61(2);
                f61Var2.f26140l = string3;
                f61Var2.f26139k = i33;
                arrayList10.add(f61Var2);
                org.telegram.ui.Components.f61 i34 = org.telegram.ui.Components.f61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(zv0Var.f43799r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.f61.A(2, null));
                if (zv0Var.f43799r) {
                    i2.d.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) zv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    hk0 hk0Var = new hk0(5);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23806c = a2;
                    x7Var.d = 20;
                    x7Var.e = hk0Var;
                    zv0Var.f43795b.d((int) Utilities.clamp(zv0Var.f43800s, 10000L, 0L), x7Var, new v3(zv0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.f61.j(3, zv0Var.f43795b));
                    if (zv0Var.f43800s > 0) {
                        str = zv0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.f61.A(4, str));
                    TLRPC.Chat chat3 = zv0Var.getMessagesController().getChat(Long.valueOf(zv0Var.f43794a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        zv0Var.f43796c.setLink(zv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.d.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.f61.j(5, zv0Var.f43796c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37069b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f37069b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f33693r6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.f33701s6.d();
                return;
            case 19:
                p21 p21Var = (p21) this.f37069b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var8 = (org.telegram.ui.Components.s61) obj2;
                org.telegram.ui.Components.a71 a71Var = p21Var.f39924f;
                q21 q21Var = p21Var.v;
                ArrayList arrayList12 = q21Var.h;
                ai.n5 n5Var = p21Var.h;
                if (n5Var.getMeasuredHeight() <= 0) {
                    n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.f61 C = org.telegram.ui.Components.f61.C(n5Var.getMeasuredHeight());
                C.d = -1;
                C.f26147s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((n5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p21Var.f39922b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || p21Var.f39923c != null || p21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || p21Var.f39923c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(p21Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, q21.w(q21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = p21Var.f39922b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p21Var.f39923c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5));
                        org.telegram.ui.Components.f61 k10 = org.telegram.ui.Components.f61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (p21Var.f39922b != null) {
                        for (int i35 = 0; i35 < p21Var.f39922b.options.size(); i35++) {
                            org.telegram.ui.Components.f61 f61Var3 = new org.telegram.ui.Components.f61(30);
                            f61Var3.f26140l = p21Var.f39922b.options.get(i35).text;
                            f61Var3.f26139k = R.drawable.msg_arrowright;
                            f61Var3.d = i35;
                            arrayList11.add(f61Var3);
                            measuredHeight += 50;
                        }
                    } else if (p21Var.f39923c != null) {
                        for (int i36 = 0; i36 < p21Var.f39923c.options.size(); i36++) {
                            org.telegram.ui.Components.f61 f61Var4 = new org.telegram.ui.Components.f61(30);
                            f61Var4.f26140l = p21Var.f39923c.options.get(i36).text;
                            f61Var4.f26139k = R.drawable.msg_arrowright;
                            f61Var4.d = i36;
                            arrayList11.add(f61Var4);
                            measuredHeight += 50;
                        }
                    } else if (p21Var.d != null) {
                        if (p21Var.f39925n == null) {
                            o21 o21Var = new o21(p21Var, p21Var.getContext(), q21.x(q21Var));
                            p21Var.f39925n = o21Var;
                            o21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = p21Var.f39925n.f22398b;
                        if (p21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.f61 k11 = org.telegram.ui.Components.f61.k(p21Var.f39925n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = q21Var.f40264r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(q21.y(q21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.d.B(i13, arrayList11);
                        if (p21Var.f39926r == null) {
                            ei.d dVar = new ei.d(p21Var.getContext(), q21.z(q21Var), true);
                            p21Var.f39927s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(p21Var.getContext());
                            p21Var.f39926r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, q21.A(q21Var)));
                            p21Var.f39926r.addView(p21Var.f39927s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(p21Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d7, q21.B(q21Var)));
                            p21Var.f39926r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ei.d dVar2 = p21Var.f39927s;
                        if (!p21Var.d.optional && TextUtils.isEmpty(p21Var.f39925n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        p21Var.f39927s.setOnClickListener(new y50(p21Var, 26));
                        org.telegram.ui.Components.f61 k12 = org.telegram.ui.Components.f61.k(p21Var.f39926r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.f61) i2.d.h(1, arrayList11)).f26138j = true;
                    if (q21Var.d && p21Var.f39921a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(p21Var.getContext());
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(q21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7)), org.telegram.ui.ActionBar.h6.V0(p21Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20948b7, q21.C(q21Var))), 0, 0);
                        zqVar.f32999w = true;
                        frameLayout2.setBackground(zqVar);
                        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(p21Var.getContext(), null);
                        x90Var.setTextSize(1, 14.0f);
                        x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), q21.D(q21Var)));
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, q21.G(q21Var)));
                        x90Var.setGravity(17);
                        frameLayout2.addView(x90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.f61 k13 = org.telegram.ui.Components.f61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (a71Var != null) {
                    if (q21.H(q21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        a71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    a71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.s61 s61Var9 = (org.telegram.ui.Components.s61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.f61.k(((v21) this.f37069b).X));
                return;
            case 21:
                org.telegram.ui.Components.s61 s61Var10 = (org.telegram.ui.Components.s61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.f61.k(((j31) this.f37069b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f37069b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.s61 s61Var11 = (org.telegram.ui.Components.s61) obj2;
                j61.R((j61) this.f37069b, (ArrayList) obj);
                return;
            case 24:
                i61 i61Var = (i61) this.f37069b;
                ArrayList arrayList13 = i61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = i61Var.f37737a;
                ArrayList arrayList14 = i61Var.d;
                if (tL_error5 != null) {
                    if (i61Var.f37742r) {
                        arrayList14.clear();
                        i61Var.f37742r = false;
                    }
                    i61Var.h = true;
                    i61Var.f37740f = false;
                    int size5 = arrayList13.size();
                    while (i17 < size5) {
                        Object obj7 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i37).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i37).putChats(channels_channelparticipants.chats, false);
                if (i61Var.f37742r) {
                    arrayList14.clear();
                    i61Var.f37742r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i38 = 0;
                while (i38 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i38);
                    i38++;
                    TLObject userOrChat = MessagesController.getInstance(i37).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    i61Var.h = true;
                }
                i61Var.f37740f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                m61 m61Var = (m61) this.f37069b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var12 = (org.telegram.ui.Components.s61) obj2;
                int i39 = m61Var.f38997b0;
                ci.z6 z6Var = m61Var.Z;
                if (z6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.f61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = z6Var.f6184i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = y91.f43356b;
                        org.telegram.ui.Components.f61 J6 = org.telegram.ui.Components.f61.J(y91.class);
                        J6.f26149u = 1;
                        J6.f26153z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f20506id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f26135f = true;
                        J6.v = i39;
                        J6.K(m61Var.f38996a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f26149u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (z6Var.k() || !z6Var.f6193r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.f61 o10 = org.telegram.ui.Components.f61.o(i16, 34);
                                o10.f26149u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.f61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.s61 s61Var13 = (org.telegram.ui.Components.s61) obj2;
                z71.b0((z71) this.f37069b, (ArrayList) obj);
                return;
            case 27:
                j81 j81Var = (j81) this.f37069b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.s61 s61Var14 = (org.telegram.ui.Components.s61) obj2;
                LinearLayout linearLayout = j81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.f61.k(linearLayout));
                }
                LinearLayout linearLayout2 = j81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.f61.k(linearLayout2));
                    return;
                }
                return;
            default:
                ad1 ad1Var = (ad1) this.f37069b;
                gh.b bVar4 = ad1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ad1Var.f35378r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ad1Var.v = paint2;
                Bitmap bitmap5 = ad1Var.f35378r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ad1Var.f35379s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                ad1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ad1Var.f35380w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, ad1Var.f35370b);
                ad1Var.F.d();
                return;
        }
    }
}
