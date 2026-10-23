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
    public final int f37209a;
    public final Object f37210b;

    public f5(Object obj, int i10) {
        this.f37209a = i10;
        this.f37210b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        g91 g91Var;
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
        switch (this.f37209a) {
            case 0:
                g5 g5Var = (g5) this.f37210b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.f37491w = false;
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
                m9 m9Var = (m9) this.f37210b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var = (org.telegram.ui.Components.b71) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f28564q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.m61 c11 = org.telegram.ui.Components.m61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f28564q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
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
                            int i22 = k9.f38877a;
                            org.telegram.ui.Components.m61 J = org.telegram.ui.Components.m61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.m61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(7, m9Var, i9Var);
                        int i23 = g9.f37520a;
                        org.telegram.ui.Components.m61 J2 = org.telegram.ui.Components.m61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.k0(i9Var.f38104c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.m61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.m61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ie ieVar = (ie) this.f37210b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var2 = (org.telegram.ui.Components.b71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(ieVar.f38178y0).getChat(Long.valueOf(-ieVar.f38179z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(ieVar.f38178y0).getChatFull(-ieVar.f38179z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (ieVar.f38159f1) {
                    arrayList4.add(org.telegram.ui.Components.m61.g(ieVar.C0));
                    g91 g91Var2 = ieVar.f38167o1;
                    if (g91Var2 != null && !g91Var2.f37539l) {
                        arrayList4.add(org.telegram.ui.Components.m61.h(5, i10, g91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.m61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    g91 g91Var3 = ieVar.f38168p1;
                    if (g91Var3 != null && !g91Var3.f37539l) {
                        arrayList4.add(org.telegram.ui.Components.m61.h(2, i10, g91Var3));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-2, charSequence));
                    }
                }
                if (ieVar.f38160g1 && (g91Var = ieVar.f38169q1) != null && !g91Var.f37539l) {
                    arrayList4.add(org.telegram.ui.Components.m61.h(2, i10, g91Var));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-3, null));
                }
                if (ieVar.f38170r1) {
                    arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.f38171s1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.f38172t1));
                    arrayList4.add(org.telegram.ui.Components.m61.u(ieVar.f38173u1));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-4, ieVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (ieVar.f38159f1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.k(ieVar.G0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-5, ieVar.D0));
                        int i24 = MessagesController.getInstance(ieVar.f38178y0).channelRestrictSponsoredLevelMin;
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
                            org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(0, new uo0(i11, context, null, false));
                            xqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(xqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.m61 i25 = org.telegram.ui.Components.m61.i(1, string);
                        if (ieVar.B0 >= i24 && ieVar.f38165m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.m61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (ieVar.f38160g1) {
                        arrayList4.add(org.telegram.ui.Components.m61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.m61.j(3, ieVar.M0));
                        arrayList4.add(org.telegram.ui.Components.m61.A(-6, ieVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(ieVar.f38178y0).getChat(Long.valueOf(-ieVar.f38179z0))) && MessagesController.getInstance(ieVar.f38178y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, ieVar.f38177x0), R.drawable.filled_earn_stars, ko.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.m61.A(-7, null));
                }
                if (ieVar.f38158e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.m61.p(ieVar.f38158e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.m61.A(-10, null));
                    return;
                }
            case 3:
                ce ceVar = (ce) this.f37210b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var3 = (org.telegram.ui.Components.b71) obj2;
                ee eeVar = ceVar.f36342f;
                int i26 = ceVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = eeVar.f36945n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = ai.hd.f1441a;
                        org.telegram.ui.Components.m61 J3 = org.telegram.ui.Components.m61.J(ai.hd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f28564q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36946r)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
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
                        org.telegram.ui.Components.m61 J4 = org.telegram.ui.Components.m61.J(ai.hd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f28564q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36944f)) {
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.m61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ko koVar = (ko) this.f37210b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    koVar.getClass();
                    org.telegram.ui.Components.xc.a0(koVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(koVar.f38996j0);
                AndroidUtilities.removeFromParent(koVar.f38993g0);
                AndroidUtilities.removeFromParent(koVar.f38995i0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new eq((jr) this.f37210b, 1), 1000L);
                return;
            case 6:
                ((n4.s) this.f37210b).A(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                hs hsVar = (hs) this.f37210b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var4 = (org.telegram.ui.Components.b71) obj2;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.V));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.f37919b));
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.f37920c));
                if (TextUtils.isEmpty(hsVar.b0())) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (hsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.m61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                }
                if (hsVar.I && hsVar.K) {
                    org.telegram.ui.Components.m61 i29 = org.telegram.ui.Components.m61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(hsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.m61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.d));
                i2.o1.B(R.string.AddNotesInfo, arrayList8);
                if (!hsVar.I) {
                    TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.f37926x));
                    arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.f37927y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.m61.k(hsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.m61.B(null));
                    org.telegram.ui.Components.m61 e = org.telegram.ui.Components.m61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f28565r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.m61.B(charSequence2));
                if (hsVar.Y) {
                    AndroidUtilities.runOnUIThread(new zr(hsVar, user, 0));
                    hsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new xr(hsVar, 1), 200L);
                    return;
                }
                return;
            case 8:
                ht.a((ht) this.f37210b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                dt dtVar = (dt) this.f37210b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.f36729a;
                ft ftVar = htVar.f37945l;
                if (ftVar != null) {
                    String join = TextUtils.join("", htVar.f37948o);
                    if (callback != null) {
                        qyVar = new org.telegram.ui.Components.qy(7, dtVar, callback);
                    } else {
                        qyVar = null;
                    }
                    ftVar.t(charSequence3, join, qyVar);
                    if (callback == null) {
                        htVar.n();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.b71 b71Var5 = (org.telegram.ui.Components.b71) obj2;
                tt.R((tt) this.f37210b, (ArrayList) obj);
                return;
            case 11:
                ey eyVar = (ey) this.f37210b;
                Long l10 = (Long) obj2;
                eyVar.P1 = (Long) obj;
                eyVar.S4();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f37210b).run();
                return;
            case 13:
                final wy wyVar = (wy) this.f37210b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var6 = (org.telegram.ui.Components.b71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(2);
                m61Var.f28559l = string2;
                m61Var.f28558k = i30;
                arrayList9.add(m61Var);
                org.telegram.ui.Components.m61 i31 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(wyVar.f43455c);
                arrayList9.add(i31);
                if (wyVar.f43455c) {
                    arrayList9.add(org.telegram.ui.Components.m61.B(null));
                    arrayList9.add(org.telegram.ui.Components.m61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    wy wyVar2 = wyVar;
                                    wyVar2.d = true;
                                    ((vy) view.getParent()).a(true, true);
                                    ai.r5 r5Var = wyVar2.f43456f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.f43455c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f43456f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.f43455c), Boolean.valueOf(wyVar3.d));
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
                                    ai.r5 r5Var = wyVar2.f43456f;
                                    if (r5Var != null) {
                                        r5Var.run(Boolean.valueOf(wyVar2.f43455c), Boolean.valueOf(wyVar2.d));
                                    }
                                    wyVar2.U();
                                    return;
                                default:
                                    wy wyVar3 = wyVar;
                                    wyVar3.d = false;
                                    ((vy) view.getParent()).a(false, true);
                                    ai.r5 r5Var2 = wyVar3.f43456f;
                                    if (r5Var2 != null) {
                                        r5Var2.run(Boolean.valueOf(wyVar3.f43455c), Boolean.valueOf(wyVar3.d));
                                    }
                                    wyVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = uy.f42540a;
                    org.telegram.ui.Components.m61 J5 = org.telegram.ui.Components.m61.J(uy.class);
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
                ob0 ob0Var = (ob0) this.f37210b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ob0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ob0Var.f40120b).putUsers(tL_tones.users, false);
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
                uv0 uv0Var = (uv0) this.f37210b;
                gh.b bVar2 = uv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                uv0Var.f42527s = (Bitmap) obj;
                Paint paint = new Paint(1);
                uv0Var.f42528w = paint;
                Bitmap bitmap2 = uv0Var.f42527s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                uv0Var.v = bitmapShader;
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
                uv0Var.f42528w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                uv0Var.f42529x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, uv0Var.f42518c);
                uv0Var.G.d();
                return;
            case 16:
                bw0 bw0Var = (bw0) this.f37210b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var7 = (org.telegram.ui.Components.b71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.m61 m61Var2 = new org.telegram.ui.Components.m61(2);
                m61Var2.f28559l = string3;
                m61Var2.f28558k = i33;
                arrayList10.add(m61Var2);
                org.telegram.ui.Components.m61 i34 = org.telegram.ui.Components.m61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(bw0Var.f36187s);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.m61.A(2, null));
                if (bw0Var.f36187s) {
                    i2.o1.q(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) bw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    wv wvVar = new wv(15);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23955c = a2;
                    x7Var.d = 20;
                    x7Var.e = wvVar;
                    bw0Var.f36182b.d((int) Utilities.clamp(bw0Var.v, 10000L, 0L), x7Var, new u3(bw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.m61.j(3, bw0Var.f36182b));
                    if (bw0Var.v > 0) {
                        str = bw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.m61.A(4, str));
                    TLRPC.Chat chat3 = bw0Var.getMessagesController().getChat(Long.valueOf(bw0Var.f36181a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        bw0Var.f36183c.setLink(bw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.o1.q(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.m61.j(5, bw0Var.f36183c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37210b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f37210b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f34044w6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.f34052x6.d();
                return;
            case 19:
                r21 r21Var = (r21) this.f37210b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var8 = (org.telegram.ui.Components.b71) obj2;
                org.telegram.ui.Components.j71 j71Var = r21Var.f40982f;
                s21 s21Var = r21Var.v;
                ArrayList arrayList12 = s21Var.f41295n;
                ai.o5 o5Var = r21Var.h;
                if (o5Var.getMeasuredHeight() <= 0) {
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.m61 C = org.telegram.ui.Components.m61.C(o5Var.getMeasuredHeight());
                C.d = -1;
                C.f28566s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((o5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = r21Var.f40980b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || r21Var.f40981c != null || r21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || r21Var.f40981c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(r21Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 0, 0, false, false, s21.v(s21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = r21Var.f40980b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = r21Var.f40981c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, l4Var, s21.w(s21Var));
                        org.telegram.ui.Components.m61 k10 = org.telegram.ui.Components.m61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (r21Var.f40980b != null) {
                        for (int i35 = 0; i35 < r21Var.f40980b.options.size(); i35++) {
                            org.telegram.ui.Components.m61 m61Var3 = new org.telegram.ui.Components.m61(30);
                            m61Var3.f28559l = r21Var.f40980b.options.get(i35).text;
                            m61Var3.f28558k = R.drawable.msg_arrowright;
                            m61Var3.d = i35;
                            arrayList11.add(m61Var3);
                            measuredHeight += 50;
                        }
                    } else if (r21Var.f40981c != null) {
                        for (int i36 = 0; i36 < r21Var.f40981c.options.size(); i36++) {
                            org.telegram.ui.Components.m61 m61Var4 = new org.telegram.ui.Components.m61(30);
                            m61Var4.f28559l = r21Var.f40981c.options.get(i36).text;
                            m61Var4.f28558k = R.drawable.msg_arrowright;
                            m61Var4.d = i36;
                            arrayList11.add(m61Var4);
                            measuredHeight += 50;
                        }
                    } else if (r21Var.d != null) {
                        if (r21Var.f40983n == null) {
                            q21 q21Var = new q21(r21Var, r21Var.getContext(), s21.x(s21Var));
                            r21Var.f40983n = q21Var;
                            q21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.f3 f3Var = r21Var.f40983n.d;
                        if (r21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        f3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.m61 k11 = org.telegram.ui.Components.m61.k(r21Var.f40983n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = s21Var.f41297s;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(s21.y(s21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.o1.B(i13, arrayList11);
                        if (r21Var.f40984r == null) {
                            ei.d dVar = new ei.d(r21Var.getContext(), s21.z(s21Var), true);
                            r21Var.f40985s = dVar;
                            dVar.i(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(r21Var.getContext());
                            r21Var.f40984r = frameLayout;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, frameLayout, s21.A(s21Var));
                            r21Var.f40984r.addView(r21Var.f40985s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(r21Var.getContext());
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d7, view, s21.B(s21Var));
                            r21Var.f40984r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ei.d dVar2 = r21Var.f40985s;
                        if (!r21Var.d.optional && TextUtils.isEmpty(r21Var.f40983n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        r21Var.f40985s.setOnClickListener(new w50(r21Var, 27));
                        org.telegram.ui.Components.m61 k12 = org.telegram.ui.Components.m61.k(r21Var.f40984r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.m61) i2.o1.i(1, arrayList11)).f28557j = true;
                    if (s21Var.e && r21Var.f40979a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(r21Var.getContext());
                        Drawable mutate = r21Var.getContext().getResources().getDrawable(R.drawable.greydivider).mutate();
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, mutate, org.telegram.ui.ActionBar.k6.f21145b7, s21.C(s21Var), PorterDuff.Mode.MULTIPLY);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        org.telegram.ui.ActionBar.r6.z(frameLayout2, colorDrawable, org.telegram.ui.ActionBar.k6.f21125a7, s21.D(s21Var), PorterDuff.Mode.SRC_IN);
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, mutate, 0, 0);
                        yqVar.f33019w = true;
                        frameLayout2.setBackground(yqVar);
                        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(r21Var.getContext(), null);
                        y90Var.setTextSize(1, 14.0f);
                        y90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), s21.F(s21Var)));
                        org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.A6, s21.G(s21Var));
                        y90Var.setGravity(17);
                        frameLayout2.addView(y90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.m61 k13 = org.telegram.ui.Components.m61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (j71Var != null) {
                    if (s21.I(s21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        j71Var.Y2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    j71Var.Y2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.b71 b71Var9 = (org.telegram.ui.Components.b71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((x21) this.f37210b).X));
                return;
            case 21:
                org.telegram.ui.Components.b71 b71Var10 = (org.telegram.ui.Components.b71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.m61.k(((l31) this.f37210b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f37210b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.b71 b71Var11 = (org.telegram.ui.Components.b71) obj2;
                l61.Q((l61) this.f37210b, (ArrayList) obj);
                return;
            case 24:
                k61 k61Var = (k61) this.f37210b;
                ArrayList arrayList13 = k61Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = k61Var.f38832a;
                ArrayList arrayList14 = k61Var.d;
                if (tL_error5 != null) {
                    if (k61Var.f38837r) {
                        arrayList14.clear();
                        k61Var.f38837r = false;
                    }
                    k61Var.h = true;
                    k61Var.f38835f = false;
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
                if (k61Var.f38837r) {
                    arrayList14.clear();
                    k61Var.f38837r = false;
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
                    k61Var.h = true;
                }
                k61Var.f38835f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                o61 o61Var = (o61) this.f37210b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var12 = (org.telegram.ui.Components.b71) obj2;
                int i39 = o61Var.f40083b0;
                ci.z6 z6Var = o61Var.Z;
                if (z6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = z6Var.f6193i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ba1.f36006b;
                        org.telegram.ui.Components.m61 J6 = org.telegram.ui.Components.m61.J(ba1.class);
                        J6.f28568u = 1;
                        J6.f28572z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f20577id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f28554f = true;
                        J6.v = i39;
                        J6.K(o61Var.f40082a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f28568u = 1;
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
                                org.telegram.ui.Components.m61 o10 = org.telegram.ui.Components.m61.o(i16, 34);
                                o10.f28568u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.m61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.b71 b71Var13 = (org.telegram.ui.Components.b71) obj2;
                c81.b0((c81) this.f37210b, (ArrayList) obj);
                return;
            case 27:
                m81 m81Var = (m81) this.f37210b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.b71 b71Var14 = (org.telegram.ui.Components.b71) obj2;
                LinearLayout linearLayout = m81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout));
                }
                LinearLayout linearLayout2 = m81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.m61.k(linearLayout2));
                    return;
                }
                return;
            default:
                ed1 ed1Var = (ed1) this.f37210b;
                gh.b bVar4 = ed1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ed1Var.f36936r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ed1Var.v = paint2;
                Bitmap bitmap5 = ed1Var.f36936r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ed1Var.f36937s = bitmapShader2;
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
                ed1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ed1Var.f36938w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, ed1Var.f36928b);
                ed1Var.F.d();
                return;
        }
    }
}
