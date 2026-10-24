package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
public final class f5 implements Utilities.Callback2 {
    public final int f37191a;
    public final Object f37192b;

    public f5(Object obj, int i10) {
        this.f37191a = i10;
        this.f37192b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        f91 f91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.oy oyVar;
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
        switch (this.f37191a) {
            case 0:
                g5 g5Var = (g5) this.f37192b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.f37452w = false;
                gh.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f37192b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var = (org.telegram.ui.Components.a71) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l61 c10 = org.telegram.ui.Components.l61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f28232q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.l61 c11 = org.telegram.ui.Components.l61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f28232q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
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
                            int i22 = k9.f38847a;
                            org.telegram.ui.Components.l61 J = org.telegram.ui.Components.l61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(7, m9Var, i9Var);
                        int i23 = g9.f37481a;
                        org.telegram.ui.Components.l61 J2 = org.telegram.ui.Components.l61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.k0(i9Var.f38184c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.l61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ie ieVar = (ie) this.f37192b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var2 = (org.telegram.ui.Components.a71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(ieVar.f38263y0).getChat(Long.valueOf(-ieVar.f38264z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(ieVar.f38263y0).getChatFull(-ieVar.f38264z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (ieVar.f38244f1) {
                    arrayList4.add(org.telegram.ui.Components.l61.g(ieVar.C0));
                    f91 f91Var2 = ieVar.f38252o1;
                    if (f91Var2 != null && !f91Var2.f37251l) {
                        arrayList4.add(org.telegram.ui.Components.l61.h(5, i10, f91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.l61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    f91 f91Var3 = ieVar.f38253p1;
                    if (f91Var3 != null && !f91Var3.f37251l) {
                        arrayList4.add(org.telegram.ui.Components.l61.h(2, i10, f91Var3));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-2, charSequence));
                    }
                }
                if (ieVar.f38245g1 && (f91Var = ieVar.f38254q1) != null && !f91Var.f37251l) {
                    arrayList4.add(org.telegram.ui.Components.l61.h(2, i10, f91Var));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-3, null));
                }
                if (ieVar.f38255r1) {
                    arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.l61.u(ieVar.f38256s1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(ieVar.f38257t1));
                    arrayList4.add(org.telegram.ui.Components.l61.u(ieVar.f38258u1));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-4, ieVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (ieVar.f38244f1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.k(ieVar.G0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-5, ieVar.D0));
                        int i24 = MessagesController.getInstance(ieVar.f38263y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (ieVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(0, new to0(i11, context, null, false));
                            vqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(vqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l61 i25 = org.telegram.ui.Components.l61.i(1, string);
                        if (ieVar.B0 >= i24 && ieVar.f38250m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.l61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (ieVar.f38245g1) {
                        arrayList4.add(org.telegram.ui.Components.l61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.l61.j(3, ieVar.M0));
                        arrayList4.add(org.telegram.ui.Components.l61.A(-6, ieVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(ieVar.f38263y0).getChat(Long.valueOf(-ieVar.f38264z0))) && MessagesController.getInstance(ieVar.f38263y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, ieVar.f38262x0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.l61.A(-7, null));
                }
                if (ieVar.f38243e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.l61.p(ieVar.f38243e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l61.A(-10, null));
                    return;
                }
            case 3:
                ce ceVar = (ce) this.f37192b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var3 = (org.telegram.ui.Components.a71) obj2;
                ee eeVar = ceVar.f36315f;
                int i26 = ceVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = eeVar.f36888n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = ai.hd.f1441a;
                        org.telegram.ui.Components.l61 J3 = org.telegram.ui.Components.l61.J(ai.hd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f28232q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36889r)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = eeVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = ai.hd.f1441a;
                        org.telegram.ui.Components.l61 J4 = org.telegram.ui.Components.l61.J(ai.hd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f28232q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36887f)) {
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ko koVar = (ko) this.f37192b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.vc.a0(koVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.f38964j0);
                AndroidUtilities.removeFromParent(koVar.f38961g0);
                AndroidUtilities.removeFromParent(koVar.f38963i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new eq((jr) this.f37192b, 1), 1000L);
                return;
            case 6:
                ((n4.s) this.f37192b).A(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                hs hsVar = (hs) this.f37192b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var4 = (org.telegram.ui.Components.a71) obj2;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.V));
                arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.f37972b));
                arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.f37973c));
                if (TextUtils.isEmpty(hsVar.b0())) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.l61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                }
                if (hsVar.I && hsVar.K) {
                    org.telegram.ui.Components.l61 i29 = org.telegram.ui.Components.l61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(hsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.l61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.d));
                i2.o1.B(R.string.AddNotesInfo, arrayList8);
                if (!hsVar.I) {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.f37979x));
                    arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.f37980y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.l61.k(hsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.l61.B(null));
                    org.telegram.ui.Components.l61 e = org.telegram.ui.Components.l61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f28233r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.l61.B(charSequence2));
                if (hsVar.Y) {
                    AndroidUtilities.runOnUIThread(new zr(hsVar, user, 0));
                    hsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new xr(hsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ht.a((ht) this.f37192b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                dt dtVar = (dt) this.f37192b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.f36721a;
                ft ftVar = htVar.f37996l;
                if (ftVar != null) {
                    String join = TextUtils.join("", htVar.f37999o);
                    if (callback != null) {
                        oyVar = new org.telegram.ui.Components.oy(7, dtVar, callback);
                    } else {
                        oyVar = null;
                    }
                    ftVar.t(charSequence3, join, oyVar);
                    if (callback == null) {
                        htVar.n();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.a71 a71Var5 = (org.telegram.ui.Components.a71) obj2;
                tt.R((tt) this.f37192b, (ArrayList) obj);
                return;
            case 11:
                ey eyVar = (ey) this.f37192b;
                Long l10 = (Long) obj2;
                eyVar.P1 = (Long) obj;
                eyVar.S4();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f37192b).run();
                return;
            case 13:
                final wy wyVar = (wy) this.f37192b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var6 = (org.telegram.ui.Components.a71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(2);
                l61Var.f28227l = string2;
                l61Var.f28226k = i30;
                arrayList9.add(l61Var);
                org.telegram.ui.Components.l61 i31 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(wyVar.f43430c);
                arrayList9.add(i31);
                if (wyVar.f43430c) {
                    arrayList9.add(org.telegram.ui.Components.l61.B(null));
                    arrayList9.add(org.telegram.ui.Components.l61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    ai.r5 r5Var = wyVar2.f43431f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.f43430c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f43431f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.f43430c), Boolean.valueOf(wyVar3.d));
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
                                    ai.r5 r5Var = wyVar2.f43431f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.f43430c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f43431f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.f43430c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = uy.f42510a;
                    org.telegram.ui.Components.l61 J5 = org.telegram.ui.Components.l61.J(uy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(wyVar.d);
                    arrayList9.add(J5);
                    i2.o1.B(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                ob0 ob0Var = (ob0) this.f37192b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ob0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.f40146b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.v0.p(R.string.AIEditorStyleNotFound, ob0.d(), R.raw.error, 36);
                        return;
                    } else {
                        ob0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                tv0 tv0Var = (tv0) this.f37192b;
                gh.b bVar2 = tv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                tv0Var.f42136s = (Bitmap) obj;
                Paint paint = new Paint(1);
                tv0Var.f42137w = paint;
                Bitmap bitmap2 = tv0Var.f42136s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                tv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                tv0Var.f42137w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                tv0Var.f42138x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, tv0Var.f42127c);
                tv0Var.G.d();
                return;
            case 16:
                aw0 aw0Var = (aw0) this.f37192b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var7 = (org.telegram.ui.Components.a71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.l61 l61Var2 = new org.telegram.ui.Components.l61(2);
                l61Var2.f28227l = string3;
                l61Var2.f28226k = i33;
                arrayList10.add(l61Var2);
                org.telegram.ui.Components.l61 i34 = org.telegram.ui.Components.l61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(aw0Var.f35858s);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.l61.A(2, null));
                if (aw0Var.f35858s) {
                    i2.o1.q(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) aw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    wv wvVar = new wv(15);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23956c = a2;
                    x7Var.d = 20;
                    x7Var.e = wvVar;
                    aw0Var.f35853b.d((int) Utilities.clamp(aw0Var.v, 10000L, 0L), x7Var, new u3(aw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.l61.j(3, aw0Var.f35853b));
                    if (aw0Var.v > 0) {
                        str = aw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.l61.A(4, str));
                    TLRPC.Chat chat3 = aw0Var.getMessagesController().getChat(Long.valueOf(aw0Var.f35852a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        aw0Var.f35854c.setLink(aw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.o1.q(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.l61.j(5, aw0Var.f35854c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37192b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f37192b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f34046w6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.f34054x6.d();
                return;
            case 19:
                q21 q21Var = (q21) this.f37192b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var8 = (org.telegram.ui.Components.a71) obj2;
                org.telegram.ui.Components.i71 i71Var = q21Var.f40696f;
                r21 r21Var = q21Var.v;
                ArrayList arrayList12 = r21Var.f40995n;
                ai.o5 o5Var = q21Var.h;
                if (o5Var.getMeasuredHeight() <= 0) {
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.l61 C = org.telegram.ui.Components.l61.C(o5Var.getMeasuredHeight());
                C.d = -1;
                C.f28234s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((o5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = q21Var.f40694b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || q21Var.f40695c != null || q21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || q21Var.f40695c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(q21Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 0, 0, false, false, r21.v(r21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = q21Var.f40694b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = q21Var.f40695c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, l4Var, r21.w(r21Var));
                        org.telegram.ui.Components.l61 k10 = org.telegram.ui.Components.l61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (q21Var.f40694b != null) {
                        for (int i35 = 0; i35 < q21Var.f40694b.options.size(); i35++) {
                            org.telegram.ui.Components.l61 l61Var3 = new org.telegram.ui.Components.l61(30);
                            l61Var3.f28227l = q21Var.f40694b.options.get(i35).text;
                            l61Var3.f28226k = R.drawable.msg_arrowright;
                            l61Var3.d = i35;
                            arrayList11.add(l61Var3);
                            measuredHeight += 50;
                        }
                    } else if (q21Var.f40695c != null) {
                        for (int i36 = 0; i36 < q21Var.f40695c.options.size(); i36++) {
                            org.telegram.ui.Components.l61 l61Var4 = new org.telegram.ui.Components.l61(30);
                            l61Var4.f28227l = q21Var.f40695c.options.get(i36).text;
                            l61Var4.f28226k = R.drawable.msg_arrowright;
                            l61Var4.d = i36;
                            arrayList11.add(l61Var4);
                            measuredHeight += 50;
                        }
                    } else if (q21Var.d != null) {
                        if (q21Var.f40697n == null) {
                            p21 p21Var = new p21(q21Var, q21Var.getContext(), r21.x(r21Var));
                            q21Var.f40697n = p21Var;
                            p21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.f3 f3Var = q21Var.f40697n.d;
                        if (q21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        f3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.l61 k11 = org.telegram.ui.Components.l61.k(q21Var.f40697n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = r21Var.f40997s;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(r21.y(r21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.o1.B(i13, arrayList11);
                        if (q21Var.f40698r == null) {
                            ei.d dVar = new ei.d(q21Var.getContext(), r21.z(r21Var), true);
                            q21Var.f40699s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(q21Var.getContext());
                            q21Var.f40698r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, frameLayout, r21.A(r21Var));
                            q21Var.f40698r.addView(q21Var.f40699s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(q21Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21185d7, view, r21.B(r21Var));
                            q21Var.f40698r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ei.d dVar2 = q21Var.f40699s;
                        if (!q21Var.d.optional && TextUtils.isEmpty(q21Var.f40697n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        q21Var.f40699s.setOnClickListener(new w50(q21Var, 27));
                        org.telegram.ui.Components.l61 k12 = org.telegram.ui.Components.l61.k(q21Var.f40698r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l61) i2.o1.i(1, arrayList11)).f28225j = true;
                    if (r21Var.e && q21Var.f40693a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(q21Var.getContext());
                        Drawable mutate = q21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.f21146b7, r21.C(r21Var), PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.f21126a7, r21.D(r21Var), PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(colorDrawable, mutate, 0, 0);
                        wqVar.f32329w = true;
                        frameLayout2.setBackground(wqVar);
                        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(q21Var.getContext(), null);
                        w90Var.setTextSize(1, 14.0f);
                        w90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), r21.F(r21Var)));
                        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.A6, r21.G(r21Var));
                        w90Var.setGravity(17);
                        frameLayout2.addView(w90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.l61 k13 = org.telegram.ui.Components.l61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i71Var != null) {
                    if (r21.I(r21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i71Var.Y2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    i71Var.Y2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.a71 a71Var9 = (org.telegram.ui.Components.a71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((w21) this.f37192b).X));
                return;
            case 21:
                org.telegram.ui.Components.a71 a71Var10 = (org.telegram.ui.Components.a71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l61.k(((k31) this.f37192b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f37192b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.a71 a71Var11 = (org.telegram.ui.Components.a71) obj2;
                k61.Q((k61) this.f37192b, (ArrayList) obj);
                return;
            case 24:
                j61 j61Var = (j61) this.f37192b;
                ArrayList arrayList13 = j61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = j61Var.f38475a;
                ArrayList arrayList14 = j61Var.d;
                if (tL_error5 != null) {
                    if (j61Var.f38480r) {
                        arrayList14.clear();
                        j61Var.f38480r = false;
                    }
                    j61Var.h = true;
                    j61Var.f38478f = false;
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
                if (j61Var.f38480r) {
                    arrayList14.clear();
                    j61Var.f38480r = false;
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
                    j61Var.h = true;
                }
                j61Var.f38478f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                n61 n61Var = (n61) this.f37192b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var12 = (org.telegram.ui.Components.a71) obj2;
                int i39 = n61Var.f39746b0;
                ci.z6 z6Var = n61Var.Z;
                if (z6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = z6Var.f6193i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = aa1.f35718b;
                        org.telegram.ui.Components.l61 J6 = org.telegram.ui.Components.l61.J(aa1.class);
                        J6.f28236u = 1;
                        J6.f28240z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f20578id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f28222f = true;
                        J6.v = i39;
                        J6.K(n61Var.f39745a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f28236u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (z6Var.k() || !z6Var.f6202r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.l61 o10 = org.telegram.ui.Components.l61.o(i16, 34);
                                o10.f28236u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.l61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.a71 a71Var13 = (org.telegram.ui.Components.a71) obj2;
                b81.b0((b81) this.f37192b, (ArrayList) obj);
                return;
            case 27:
                l81 l81Var = (l81) this.f37192b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.a71 a71Var14 = (org.telegram.ui.Components.a71) obj2;
                LinearLayout linearLayout = l81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout));
                }
                LinearLayout linearLayout2 = l81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.l61.k(linearLayout2));
                    return;
                }
                return;
            default:
                dd1 dd1Var = (dd1) this.f37192b;
                gh.b bVar4 = dd1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                dd1Var.f36598r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                dd1Var.v = paint2;
                Bitmap bitmap5 = dd1Var.f36598r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                dd1Var.f36599s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                dd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                dd1Var.f36600w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, dd1Var.f36590b);
                dd1Var.F.d();
                return;
        }
    }
}
