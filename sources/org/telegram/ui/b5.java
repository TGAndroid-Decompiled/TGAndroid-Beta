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
public final class b5 implements Utilities.Callback2 {
    public final int f36684a;
    public final Object f36685b;

    public b5(Object obj, int i10) {
        this.f36684a = i10;
        this.f36685b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        boolean z10;
        f91 f91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        tm tmVar;
        float f9;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z11;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        switch (this.f36684a) {
            case 0:
                c5 c5Var = (c5) this.f36685b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f36999w = false;
                qg.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                rg.c.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                h9 h9Var = (h9) this.f36685b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var = (org.telegram.ui.Components.k51) obj2;
                boolean isEmpty = h9Var.G.isEmpty();
                ArrayList arrayList2 = h9Var.C;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.w41 c3 = org.telegram.ui.Components.w41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.f34305q = true;
                    arrayList.add(c3);
                    if (!h9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.w41 c6 = org.telegram.ui.Components.w41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c6.f34305q = true;
                        arrayList.add(c6);
                    }
                    arrayList.add(org.telegram.ui.Components.w41.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = h9Var.G;
                    int size = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList3.get(i16);
                        i16++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = h9Var.getMessagesController().getChat(l10)) != null) {
                            l8 l8Var = new l8(h9Var, 0);
                            int i17 = f9.f38042a;
                            org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(f9.class);
                            J.G = chat;
                            J.D = l8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.w41.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj4 = arrayList2.get(i18);
                        i18++;
                        d9 d9Var = (d9) obj4;
                        nh.r7 r7Var = new nh.r7(15, h9Var, d9Var);
                        int i19 = b9.f36728a;
                        org.telegram.ui.Components.w41 J2 = org.telegram.ui.Components.w41.J(b9.class);
                        J2.G = d9Var;
                        J2.D = r7Var;
                        J2.K(h9Var.l0(d9Var.f37412c));
                        arrayList.add(J2);
                    }
                    if (!h9Var.F) {
                        arrayList.add(org.telegram.ui.Components.w41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.w41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.w41.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                de deVar = (de) this.f36685b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var2 = (org.telegram.ui.Components.k51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(deVar.f37524u0).getChat(Long.valueOf(-deVar.f37525v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(deVar.f37524u0).getChatFull(-deVar.f37525v0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (deVar.f37505b1) {
                    arrayList4.add(org.telegram.ui.Components.w41.g(deVar.f37528y0));
                    f91 f91Var2 = deVar.f37514k1;
                    if (f91Var2 != null && !f91Var2.f38078l) {
                        arrayList4.add(org.telegram.ui.Components.w41.h(5, i10, f91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.w41.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    f91 f91Var3 = deVar.l1;
                    if (f91Var3 != null && !f91Var3.f38078l) {
                        arrayList4.add(org.telegram.ui.Components.w41.h(2, i10, f91Var3));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-2, charSequence));
                    }
                }
                if (deVar.f37506c1 && (f91Var = deVar.f37515m1) != null && !f91Var.f38078l) {
                    arrayList4.add(org.telegram.ui.Components.w41.h(2, i10, f91Var));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-3, null));
                }
                if (deVar.f37516n1) {
                    arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.f37517o1));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.f37518p1));
                    arrayList4.add(org.telegram.ui.Components.w41.u(deVar.f37519q1));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-4, deVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (deVar.f37505b1) {
                        arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.w41.k(deVar.C0));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-5, deVar.f37529z0));
                        int i20 = MessagesController.getInstance(deVar.f37524u0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (deVar.f37527x0 < i20) {
                            i11 = i20;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(0, new ko0(i11, context, null, false));
                            iqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.w41 i21 = org.telegram.ui.Components.w41.i(1, string);
                        if (deVar.f37527x0 >= i20 && deVar.f37512i1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i21.K(z10);
                        arrayList4.add(i21);
                        arrayList4.add(org.telegram.ui.Components.w41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (deVar.f37506c1) {
                        arrayList4.add(org.telegram.ui.Components.w41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.w41.j(3, deVar.I0));
                        arrayList4.add(org.telegram.ui.Components.w41.A(-6, deVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(deVar.f37524u0).getChat(Long.valueOf(-deVar.f37525v0))) && MessagesController.getInstance(deVar.f37524u0).starrefConnectAllowed) {
                    arrayList4.add(ph.f.a(4, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uj, deVar.f37523t0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.w41.A(-7, null));
                }
                if (deVar.f37504a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.w41.p(deVar.f37504a1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.w41.A(-10, null));
                    return;
                }
            case 3:
                xd xdVar = (xd) this.f36685b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var3 = (org.telegram.ui.Components.k51) obj2;
                zd zdVar = xdVar.f44557f;
                int i22 = xdVar.d;
                if (i22 == 0) {
                    ArrayList arrayList6 = zdVar.f45143n;
                    int size3 = arrayList6.size();
                    while (i15 < size3) {
                        Object obj5 = arrayList6.get(i15);
                        i15++;
                        int i23 = jh.ca.f11886a;
                        org.telegram.ui.Components.w41 J3 = org.telegram.ui.Components.w41.J(jh.ca.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f34305q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(zdVar.f45144r)) {
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i22 == 1) {
                    ArrayList arrayList7 = zdVar.h;
                    int size4 = arrayList7.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList7.get(i15);
                        i15++;
                        int i24 = jh.ca.f11886a;
                        org.telegram.ui.Components.w41 J4 = org.telegram.ui.Components.w41.J(jh.ca.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f34305q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(zdVar.f45142f)) {
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.w41.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ko koVar = (ko) this.f36685b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.tc.a0(koVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.f39949g0);
                AndroidUtilities.removeFromParent(koVar.f39944d0);
                AndroidUtilities.removeFromParent(koVar.f39948f0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new eq((jr) this.f36685b, 1), 1000L);
                return;
            case 6:
                ((g9.l) this.f36685b).o(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                hs hsVar = (hs) this.f36685b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var4 = (org.telegram.ui.Components.k51) obj2;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.R));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.f39004b));
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.f39005c));
                if (TextUtils.isEmpty(hsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.G) {
                    arrayList8.add(org.telegram.ui.Components.w41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.w41.B(null));
                }
                if (hsVar.E && hsVar.G) {
                    org.telegram.ui.Components.w41 i25 = org.telegram.ui.Components.w41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i25.K(hsVar.T);
                    arrayList8.add(i25);
                    arrayList8.add(org.telegram.ui.Components.w41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.d));
                th.A(R.string.AddNotesInfo, arrayList8);
                if (!hsVar.E) {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.f39012x));
                    arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.f39013y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.w41.k(hsVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.w41.B(null));
                    org.telegram.ui.Components.w41 e10 = org.telegram.ui.Components.w41.e(1, LocaleController.getString(R.string.DeleteContact));
                    e10.f34306r = true;
                    arrayList8.add(e10);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.w41.B(charSequence2));
                if (hsVar.U) {
                    AndroidUtilities.runOnUIThread(new yr(hsVar, user, 0));
                    hsVar.U = false;
                    AndroidUtilities.runOnUIThread(new zr(hsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                ht.a((ht) this.f36685b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                dt dtVar = (dt) this.f36685b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.f37629a;
                ft ftVar = htVar.f39032l;
                if (ftVar != null) {
                    String join = TextUtils.join("", htVar.f39035o);
                    if (callback != null) {
                        tmVar = new tm(19, dtVar, callback);
                    } else {
                        tmVar = null;
                    }
                    ftVar.F(charSequence3, join, tmVar);
                    if (callback == null) {
                        htVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.k51 k51Var5 = (org.telegram.ui.Components.k51) obj2;
                tt.R((tt) this.f36685b, (ArrayList) obj);
                return;
            case 11:
                fy fyVar = (fy) this.f36685b;
                Long l11 = (Long) obj2;
                fyVar.L1 = (Long) obj;
                fyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f36685b).run();
                return;
            case 13:
                final xy xyVar = (xy) this.f36685b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var6 = (org.telegram.ui.Components.k51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i26 = R.raw.topics_top;
                org.telegram.ui.Components.w41 w41Var = new org.telegram.ui.Components.w41(2);
                w41Var.f34300l = string2;
                w41Var.f34299k = i26;
                arrayList9.add(w41Var);
                org.telegram.ui.Components.w41 i27 = org.telegram.ui.Components.w41.i(1, LocaleController.getString(R.string.TopicsEnable));
                i27.K(xyVar.f44673c);
                arrayList9.add(i27);
                if (xyVar.f44673c) {
                    arrayList9.add(org.telegram.ui.Components.w41.B(null));
                    arrayList9.add(org.telegram.ui.Components.w41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    xy xyVar2 = xyVar;
                                    xyVar2.d = true;
                                    ((wy) view.getParent()).a(true, true);
                                    bh.v vVar = xyVar2.f44675f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(xyVar2.f44673c), Boolean.valueOf(xyVar2.d));
                                    }
                                    xyVar2.U();
                                    return;
                                default:
                                    xy xyVar3 = xyVar;
                                    xyVar3.d = false;
                                    ((wy) view.getParent()).a(false, true);
                                    bh.v vVar2 = xyVar3.f44675f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(xyVar3.f44673c), Boolean.valueOf(xyVar3.d));
                                    }
                                    xyVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    xy xyVar2 = xyVar;
                                    xyVar2.d = true;
                                    ((wy) view.getParent()).a(true, true);
                                    bh.v vVar = xyVar2.f44675f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(xyVar2.f44673c), Boolean.valueOf(xyVar2.d));
                                    }
                                    xyVar2.U();
                                    return;
                                default:
                                    xy xyVar3 = xyVar;
                                    xyVar3.d = false;
                                    ((wy) view.getParent()).a(false, true);
                                    bh.v vVar2 = xyVar3.f44675f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(xyVar3.f44673c), Boolean.valueOf(xyVar3.d));
                                    }
                                    xyVar3.U();
                                    return;
                            }
                        }
                    };
                    int i28 = vy.f43797a;
                    org.telegram.ui.Components.w41 J5 = org.telegram.ui.Components.w41.J(vy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(xyVar.d);
                    arrayList9.add(J5);
                    th.A(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                mb0 mb0Var = (mb0) this.f36685b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                mb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(mb0Var.f40514b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.s(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        j7.l1.v(R.string.AIEditorStyleNotFound, mb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        mb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                iv0 iv0Var = (iv0) this.f36685b;
                qg.b bVar2 = iv0Var.B;
                Bitmap bitmap = (Bitmap) obj2;
                iv0Var.f39351s = (Bitmap) obj;
                Paint paint = new Paint(1);
                iv0Var.f39352w = paint;
                Bitmap bitmap2 = iv0Var.f39351s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                iv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f9 = 0.05f;
                } else {
                    f9 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f9);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                iv0Var.f39352w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                iv0Var.f39353x = new Matrix();
                bVar2.a(bitmap);
                rg.c.c(bVar2, iv0Var.f39345c);
                iv0Var.C.d();
                return;
            case 16:
                pv0 pv0Var = (pv0) this.f36685b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var7 = (org.telegram.ui.Components.k51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i29 = R.raw.bubble;
                org.telegram.ui.Components.w41 w41Var2 = new org.telegram.ui.Components.w41(2);
                w41Var2.f34300l = string3;
                w41Var2.f34299k = i29;
                arrayList10.add(w41Var2);
                org.telegram.ui.Components.w41 i30 = org.telegram.ui.Components.w41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i30.K(pv0Var.f41478r);
                arrayList10.add(i30);
                arrayList10.add(org.telegram.ui.Components.w41.A(2, null));
                if (pv0Var.f41478r) {
                    th.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.v7.a((int) pv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.xo0 xo0Var = new org.telegram.ui.Components.xo0(29);
                    org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7();
                    u7Var.f25741c = a2;
                    u7Var.d = 20;
                    u7Var.f25742e = xo0Var;
                    pv0Var.f41473b.d((int) Utilities.clamp(pv0Var.f41479s, 10000L, 0L), u7Var, new x3(pv0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.w41.j(3, pv0Var.f41473b));
                    if (pv0Var.f41479s > 0) {
                        str = pv0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.w41.A(4, str));
                    TLRPC.Chat chat3 = pv0Var.getMessagesController().getChat(Long.valueOf(pv0Var.f41472a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        pv0Var.f41474c.setLink(pv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        th.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.w41.j(5, pv0Var.f41474c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36685b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f35976e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f36685b;
                Bitmap bitmap3 = (Bitmap) obj;
                qg.b bVar3 = profileActivity.f36068l6;
                bVar3.a((Bitmap) obj2);
                rg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f36074m6.d();
                return;
            case 19:
                x21 x21Var = (x21) this.f36685b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var8 = (org.telegram.ui.Components.k51) obj2;
                org.telegram.ui.Components.u51 u51Var = x21Var.f44446f;
                y21 y21Var = x21Var.v;
                ArrayList arrayList12 = y21Var.h;
                bg.u1 u1Var = x21Var.h;
                if (u1Var.getMeasuredHeight() <= 0) {
                    u1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.w41 C = org.telegram.ui.Components.w41.C(u1Var.getMeasuredHeight());
                C.d = -1;
                C.f34307s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((u1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.f44443b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.f44444c != null || x21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.f44444c != null) {
                        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(x21Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 0, 0, false, false, y21.u(y21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = x21Var.f44443b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            k4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.f44444c;
                            if (tL_reportResultChooseOption != null) {
                                k4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        k4Var.setBackgroundColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
                        org.telegram.ui.Components.w41 k9 = org.telegram.ui.Components.w41.k(k4Var);
                        k9.d = -2;
                        arrayList11.add(k9);
                        measuredHeight += 40;
                    }
                    if (x21Var.f44443b != null) {
                        for (int i31 = 0; i31 < x21Var.f44443b.options.size(); i31++) {
                            org.telegram.ui.Components.w41 w41Var3 = new org.telegram.ui.Components.w41(30);
                            w41Var3.f34300l = x21Var.f44443b.options.get(i31).text;
                            w41Var3.f34299k = R.drawable.msg_arrowright;
                            w41Var3.d = i31;
                            arrayList11.add(w41Var3);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.f44444c != null) {
                        for (int i32 = 0; i32 < x21Var.f44444c.options.size(); i32++) {
                            org.telegram.ui.Components.w41 w41Var4 = new org.telegram.ui.Components.w41(30);
                            w41Var4.f34300l = x21Var.f44444c.options.get(i32).text;
                            w41Var4.f34299k = R.drawable.msg_arrowright;
                            w41Var4.d = i32;
                            arrayList11.add(w41Var4);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.d != null) {
                        if (x21Var.f44447n == null) {
                            v21 v21Var = new v21(x21Var, x21Var.getContext(), y21.v(y21Var));
                            x21Var.f44447n = v21Var;
                            v21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.e3 e3Var = x21Var.f44447n.f24387b;
                        if (x21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        e3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.w41 k10 = org.telegram.ui.Components.w41.k(x21Var.f44447n);
                        k10.d = -3;
                        arrayList11.add(k10);
                        long j11 = y21Var.f44715r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(y21.w(y21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        th.A(i13, arrayList11);
                        if (x21Var.f44448r == null) {
                            nh.d dVar = new nh.d(x21Var.getContext(), y21.x(y21Var), true);
                            x21Var.f44449s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(x21Var.getContext());
                            x21Var.f44448r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, y21.y(y21Var)));
                            x21Var.f44448r.addView(x21Var.f44449s, i7.f6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(x21Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, y21.A(y21Var)));
                            x21Var.f44448r.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        nh.d dVar2 = x21Var.f44449s;
                        if (!x21Var.d.optional && TextUtils.isEmpty(x21Var.f44447n.getText())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                        x21Var.f44449s.setOnClickListener(new t50(x21Var, 29));
                        org.telegram.ui.Components.w41 k11 = org.telegram.ui.Components.w41.k(x21Var.f44448r);
                        k11.d = -4;
                        arrayList11.add(k11);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.w41) j7.l1.i(1, arrayList11)).f34298j = true;
                    if (y21Var.d && x21Var.f44442a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(x21Var.getContext());
                        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7)), org.telegram.ui.ActionBar.g6.U0(x21Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23028b7, y21.B(y21Var))), 0, 0);
                        jqVar.f29792w = true;
                        frameLayout2.setBackground(jqVar);
                        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(x21Var.getContext(), null);
                        y80Var.setTextSize(1, 14.0f);
                        y80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), y21.C(y21Var)));
                        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, y21.E(y21Var)));
                        y80Var.setGravity(17);
                        frameLayout2.addView(y80Var, i7.f6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.w41 k12 = org.telegram.ui.Components.w41.k(frameLayout2);
                        k12.d = -3;
                        arrayList11.add(k12);
                        measuredHeight += 46;
                    }
                }
                if (u51Var != null) {
                    if (y21.F(y21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        u51Var.T2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    u51Var.T2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.k51 k51Var9 = (org.telegram.ui.Components.k51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.w41.k(((d31) this.f36685b).T));
                return;
            case 21:
                org.telegram.ui.Components.k51 k51Var10 = (org.telegram.ui.Components.k51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.w41.k(((o31) this.f36685b).T));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f36685b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.k51 k51Var11 = (org.telegram.ui.Components.k51) obj2;
                n61.Q((n61) this.f36685b, (ArrayList) obj);
                return;
            case 24:
                m61 m61Var = (m61) this.f36685b;
                ArrayList arrayList13 = m61Var.f40471e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i33 = m61Var.f40468a;
                ArrayList arrayList14 = m61Var.d;
                if (tL_error5 != null) {
                    if (m61Var.f40474r) {
                        arrayList14.clear();
                        m61Var.f40474r = false;
                    }
                    m61Var.h = true;
                    m61Var.f40472f = false;
                    int size5 = arrayList13.size();
                    while (i15 < size5) {
                        Object obj7 = arrayList13.get(i15);
                        i15++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i33).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i33).putChats(channels_channelparticipants.chats, false);
                if (m61Var.f40474r) {
                    arrayList14.clear();
                    m61Var.f40474r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i34 = 0;
                while (i34 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i34);
                    i34++;
                    TLObject userOrChat = MessagesController.getInstance(i33).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    m61Var.h = true;
                }
                m61Var.f40472f = false;
                int size7 = arrayList13.size();
                while (i15 < size7) {
                    Object obj8 = arrayList13.get(i15);
                    i15++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                q61 q61Var = (q61) this.f36685b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var12 = (org.telegram.ui.Components.k51) obj2;
                int i35 = q61Var.X;
                lh.k6 k6Var = q61Var.V;
                if (k6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.w41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = k6Var.f15838i;
                    int size8 = arrayList17.size();
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < size8) {
                        Object obj9 = arrayList17.get(i37);
                        i37++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i38 = aa1.f36498b;
                        org.telegram.ui.Components.w41 J6 = org.telegram.ui.Components.w41.J(aa1.class);
                        J6.f34309u = 1;
                        J6.f34313z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f22629id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f34295f = true;
                        J6.v = i35;
                        J6.K(q61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f34309u = 1;
                        arrayList16.add(J6);
                        i36--;
                        if (i36 == 0) {
                            i36 = i35;
                        }
                    }
                    if (k6Var.k() || !k6Var.f15847r) {
                        while (true) {
                            if (i36 <= 0) {
                                i14 = i35;
                            } else {
                                i14 = i36;
                            }
                            if (i15 < i14) {
                                i15++;
                                org.telegram.ui.Components.w41 o10 = org.telegram.ui.Components.w41.o(i15, 34);
                                o10.f34309u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.w41.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.k51 k51Var13 = (org.telegram.ui.Components.k51) obj2;
                b81.a0((b81) this.f36685b, (ArrayList) obj);
                return;
            case 27:
                l81 l81Var = (l81) this.f36685b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.k51 k51Var14 = (org.telegram.ui.Components.k51) obj2;
                LinearLayout linearLayout = l81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.w41.k(linearLayout));
                }
                LinearLayout linearLayout2 = l81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.w41.k(linearLayout2));
                    return;
                }
                return;
            default:
                fd1 fd1Var = (fd1) this.f36685b;
                qg.b bVar4 = fd1Var.A;
                Bitmap bitmap4 = (Bitmap) obj2;
                fd1Var.f38115r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                fd1Var.v = paint2;
                Bitmap bitmap5 = fd1Var.f38115r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                fd1Var.f38116s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.g6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                fd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                fd1Var.f38117w = new Matrix();
                bVar4.a(bitmap4);
                rg.c.c(bVar4, fd1Var.f38110b);
                fd1Var.B.d();
                return;
        }
    }
}
