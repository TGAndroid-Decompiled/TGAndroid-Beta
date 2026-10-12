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
public final class e5 implements Utilities.Callback2 {
    public final int f36983a;
    public final Object f36984b;

    public e5(Object obj, int i10) {
        this.f36983a = i10;
        this.f36984b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        pa1 pa1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        jt jtVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r11 = false;
        boolean z11 = false;
        switch (this.f36983a) {
            case 0:
                f5 f5Var = (f5) this.f36984b;
                f5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                f5Var.f37636w = false;
                fh.b bVar = f5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, f5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = f5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f36984b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.u61 c10 = org.telegram.ui.Components.u61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f31076q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.u61 c11 = org.telegram.ui.Components.u61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f31076q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.u61.B(null));
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
                            int i22 = k9.f39380a;
                            org.telegram.ui.Components.u61 J = org.telegram.ui.Components.u61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.u61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i23 = g9.f37980a;
                        org.telegram.ui.Components.u61 J2 = org.telegram.ui.Components.u61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = f2Var;
                        J2.K(m9Var.l0(i9Var.f38809c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.u61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.u61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.u61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                oe oeVar = (oe) this.f36984b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var2 = (org.telegram.ui.Components.h71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(oeVar.f40682y0).getChat(Long.valueOf(-oeVar.f40683z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(oeVar.f40682y0).getChatFull(-oeVar.f40683z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (oeVar.f40663f1) {
                    arrayList4.add(org.telegram.ui.Components.u61.g(oeVar.C0));
                    pa1 pa1Var2 = oeVar.f40671o1;
                    if (pa1Var2 != null && !pa1Var2.f40901l) {
                        arrayList4.add(org.telegram.ui.Components.u61.h(5, i10, pa1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.u61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    pa1 pa1Var3 = oeVar.f40672p1;
                    if (pa1Var3 != null && !pa1Var3.f40901l) {
                        arrayList4.add(org.telegram.ui.Components.u61.h(2, i10, pa1Var3));
                        arrayList4.add(org.telegram.ui.Components.u61.A(-2, charSequence));
                    }
                }
                if (oeVar.f40664g1 && (pa1Var = oeVar.f40673q1) != null && !pa1Var.f40901l) {
                    arrayList4.add(org.telegram.ui.Components.u61.h(2, i10, pa1Var));
                    arrayList4.add(org.telegram.ui.Components.u61.A(-3, null));
                }
                if (oeVar.f40674r1) {
                    arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.u61.u(oeVar.f40675s1));
                    arrayList4.add(org.telegram.ui.Components.u61.u(oeVar.f40676t1));
                    arrayList4.add(org.telegram.ui.Components.u61.u(oeVar.f40677u1));
                    arrayList4.add(org.telegram.ui.Components.u61.A(-4, oeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (oeVar.f40663f1) {
                        arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.u61.k(oeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.u61.A(-5, oeVar.D0));
                        int i24 = MessagesController.getInstance(oeVar.f40682y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (oeVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(0, new lp0(i11, context, null, false));
                            grVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(grVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.u61 i25 = org.telegram.ui.Components.u61.i(1, string);
                        if (oeVar.B0 >= i24 && oeVar.f40669m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.u61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (oeVar.f40664g1) {
                        arrayList4.add(org.telegram.ui.Components.u61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.u61.j(3, oeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.u61.A(-6, oeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(oeVar.f40682y0).getChat(Long.valueOf(-oeVar.f40683z0))) && MessagesController.getInstance(oeVar.f40682y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, oeVar.f40681x0), R.drawable.filled_earn_stars, xo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.u61.A(-7, null));
                }
                if (oeVar.f40662e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.u61.p(oeVar.f40662e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.u61.A(-10, null));
                    return;
                }
            case 3:
                ie ieVar = (ie) this.f36984b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var3 = (org.telegram.ui.Components.h71) obj2;
                ke keVar = ieVar.f38887f;
                int i26 = ieVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = keVar.f39465n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.i7.f52935a;
                        org.telegram.ui.Components.u61 J3 = org.telegram.ui.Components.u61.J(yh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f31076q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(keVar.f39466r)) {
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = keVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.i7.f52935a;
                        org.telegram.ui.Components.u61 J4 = org.telegram.ui.Components.u61.J(yh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f31076q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(keVar.f39464f)) {
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.u61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                xo xoVar = (xo) this.f36984b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    xoVar.getClass();
                    org.telegram.ui.Components.zc.a0(xoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(xoVar.f44067k0);
                AndroidUtilities.removeFromParent(xoVar.f44064h0);
                AndroidUtilities.removeFromParent(xoVar.f44066j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new rq((wr) this.f36984b, 1), 1000L);
                return;
            case 6:
                ((pf.b) this.f36984b).S(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ts tsVar = (ts) this.f36984b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var4 = (org.telegram.ui.Components.h71) obj2;
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.V));
                arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.f42276b));
                arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.f42277c));
                if (TextUtils.isEmpty(tsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.u61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (tsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.u61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.u61.B(null));
                }
                if (tsVar.I && tsVar.K) {
                    org.telegram.ui.Components.u61 i29 = org.telegram.ui.Components.u61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(tsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.u61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.d));
                hg.c.p(R.string.AddNotesInfo, arrayList8);
                if (!tsVar.I) {
                    TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.f42284x));
                    arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.f42285y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.u61.k(tsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.u61.B(null));
                    org.telegram.ui.Components.u61 e7 = org.telegram.ui.Components.u61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f31077r = true;
                    arrayList8.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.u61.B(charSequence2));
                if (tsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ks(tsVar, user, 0));
                    tsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ls(tsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                ut.a((ut) this.f36984b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                qt qtVar = (qt) this.f36984b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ut utVar = qtVar.f41433a;
                st stVar = utVar.f42580l;
                if (stVar != null) {
                    String join = TextUtils.join("", utVar.f42583o);
                    if (callback != null) {
                        jtVar = new jt(1, qtVar, callback);
                    } else {
                        jtVar = null;
                    }
                    stVar.f(charSequence3, join, jtVar);
                    if (callback == null) {
                        utVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.h71 h71Var5 = (org.telegram.ui.Components.h71) obj2;
                eu.S((eu) this.f36984b, (ArrayList) obj);
                return;
            case 11:
                vy vyVar = (vy) this.f36984b;
                Long l10 = (Long) obj2;
                vyVar.P1 = (Long) obj;
                vyVar.R4();
                return;
            case 12:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f36984b).run();
                return;
            case 13:
                final nz nzVar = (nz) this.f36984b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var6 = (org.telegram.ui.Components.h71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(2);
                u61Var.f31071l = string2;
                u61Var.f31070k = i30;
                arrayList9.add(u61Var);
                org.telegram.ui.Components.u61 i31 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(nzVar.f40512c);
                arrayList9.add(i31);
                if (nzVar.f40512c) {
                    arrayList9.add(org.telegram.ui.Components.u61.B(null));
                    arrayList9.add(org.telegram.ui.Components.u61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    nz nzVar2 = nzVar;
                                    nzVar2.d = true;
                                    ((mz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = nzVar2.f40514f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(nzVar2.f40512c), Boolean.valueOf(nzVar2.d));
                                    }
                                    nzVar2.U();
                                    return;
                                default:
                                    nz nzVar3 = nzVar;
                                    nzVar3.d = false;
                                    ((mz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = nzVar3.f40514f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(nzVar3.f40512c), Boolean.valueOf(nzVar3.d));
                                    }
                                    nzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    nz nzVar2 = nzVar;
                                    nzVar2.d = true;
                                    ((mz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = nzVar2.f40514f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(nzVar2.f40512c), Boolean.valueOf(nzVar2.d));
                                    }
                                    nzVar2.U();
                                    return;
                                default:
                                    nz nzVar3 = nzVar;
                                    nzVar3.d = false;
                                    ((mz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = nzVar3.f40514f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(nzVar3.f40512c), Boolean.valueOf(nzVar3.d));
                                    }
                                    nzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = lz.f39872a;
                    org.telegram.ui.Components.u61 J5 = org.telegram.ui.Components.u61.J(lz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(nzVar.d);
                    arrayList9.add(J5);
                    hg.c.p(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f36984b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                fc0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.f37715b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.v0.q(R.string.AIEditorStyleNotFound, fc0.d(), R.raw.error, 36);
                        return;
                    } else {
                        fc0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                ow0 ow0Var = (ow0) this.f36984b;
                fh.b bVar2 = ow0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                ow0Var.f40802s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ow0Var.f40803w = paint;
                Bitmap bitmap2 = ow0Var.f40802s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ow0Var.v = bitmapShader;
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
                ow0Var.f40803w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ow0Var.f40804x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, ow0Var.f40792c);
                ow0Var.G.d();
                return;
            case 16:
                vw0 vw0Var = (vw0) this.f36984b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var7 = (org.telegram.ui.Components.h71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.u61 u61Var2 = new org.telegram.ui.Components.u61(2);
                u61Var2.f31071l = string3;
                u61Var2.f31070k = i33;
                arrayList10.add(u61Var2);
                org.telegram.ui.Components.u61 i34 = org.telegram.ui.Components.u61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(vw0Var.f42872r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.u61.A(2, null));
                if (vw0Var.f42872r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) vw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    c80 c80Var = new c80(9);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23545c = a2;
                    y7Var.d = 20;
                    y7Var.f23546e = c80Var;
                    vw0Var.f42867b.d((int) Utilities.clamp(vw0Var.f42873s, 10000L, 0L), y7Var, new t3(vw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.u61.j(3, vw0Var.f42867b));
                    if (vw0Var.f42873s > 0) {
                        str = vw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.u61.A(4, str));
                    TLRPC.Chat chat3 = vw0Var.getMessagesController().getChat(Long.valueOf(vw0Var.f42866a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        vw0Var.f42868c.setLink(vw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.u61.j(5, vw0Var.f42868c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36984b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34042e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f36984b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f34161p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                d41 d41Var = (d41) this.f36984b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var8 = (org.telegram.ui.Components.h71) obj2;
                org.telegram.ui.Components.p71 p71Var = d41Var.f36644f;
                e41 e41Var = d41Var.v;
                ArrayList arrayList12 = e41Var.h;
                w5 w5Var = d41Var.h;
                if (w5Var.getMeasuredHeight() <= 0) {
                    w5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.u61 C = org.telegram.ui.Components.u61.C(w5Var.getMeasuredHeight());
                C.d = -1;
                C.f31078s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((w5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = d41Var.f36641b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || d41Var.f36642c != null || d41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || d41Var.f36642c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(d41Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, e41.w(e41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = d41Var.f36641b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = d41Var.f36642c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(e41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5));
                        org.telegram.ui.Components.u61 k10 = org.telegram.ui.Components.u61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (d41Var.f36641b != null) {
                        for (int i35 = 0; i35 < d41Var.f36641b.options.size(); i35++) {
                            org.telegram.ui.Components.u61 u61Var3 = new org.telegram.ui.Components.u61(30);
                            u61Var3.f31071l = d41Var.f36641b.options.get(i35).text;
                            u61Var3.f31070k = R.drawable.msg_arrowright;
                            u61Var3.d = i35;
                            arrayList11.add(u61Var3);
                            measuredHeight += 50;
                        }
                    } else if (d41Var.f36642c != null) {
                        for (int i36 = 0; i36 < d41Var.f36642c.options.size(); i36++) {
                            org.telegram.ui.Components.u61 u61Var4 = new org.telegram.ui.Components.u61(30);
                            u61Var4.f31071l = d41Var.f36642c.options.get(i36).text;
                            u61Var4.f31070k = R.drawable.msg_arrowright;
                            u61Var4.d = i36;
                            arrayList11.add(u61Var4);
                            measuredHeight += 50;
                        }
                    } else if (d41Var.d != null) {
                        if (d41Var.f36645n == null) {
                            c41 c41Var = new c41(d41Var, d41Var.getContext(), e41.x(e41Var));
                            d41Var.f36645n = c41Var;
                            c41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = d41Var.f36645n.f22081b;
                        if (d41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.u61 k11 = org.telegram.ui.Components.u61.k(d41Var.f36645n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = e41Var.f36981r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(e41.y(e41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.p(i13, arrayList11);
                        if (d41Var.f36646r == null) {
                            ci.d dVar = new ci.d(d41Var.getContext(), e41.z(e41Var), true);
                            d41Var.f36647s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(d41Var.getContext());
                            d41Var.f36646r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, e41.A(e41Var)));
                            d41Var.f36646r.addView(d41Var.f36647s, w7.w5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(d41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20561d7, e41.B(e41Var)));
                            d41Var.f36646r.addView(view, w7.w5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = d41Var.f36647s;
                        if (!d41Var.d.optional && TextUtils.isEmpty(d41Var.f36645n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        d41Var.f36647s.setOnClickListener(new o60(d41Var, 27));
                        org.telegram.ui.Components.u61 k12 = org.telegram.ui.Components.u61.k(d41Var.f36646r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.u61) hg.c.h(1, arrayList11)).f31069j = true;
                    if (e41Var.d && d41Var.f36640a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(d41Var.getContext());
                        org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(e41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7)), org.telegram.ui.ActionBar.h6.V0(d41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20524b7, e41.D(e41Var))), 0, 0);
                        hrVar.f26883w = true;
                        frameLayout2.setBackground(hrVar);
                        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(d41Var.getContext(), null);
                        ia0Var.setTextSize(1, 14.0f);
                        ia0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), e41.E(e41Var)));
                        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, e41.G(e41Var)));
                        ia0Var.setGravity(17);
                        frameLayout2.addView(ia0Var, w7.w5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.u61 k13 = org.telegram.ui.Components.u61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (p71Var != null) {
                    if (e41.H(e41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        p71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    p71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.h71 h71Var9 = (org.telegram.ui.Components.h71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((j41) this.f36984b).X));
                return;
            case 21:
                org.telegram.ui.Components.h71 h71Var10 = (org.telegram.ui.Components.h71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.u61.k(((w41) this.f36984b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f36984b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.h71 h71Var11 = (org.telegram.ui.Components.h71) obj2;
                x71.R((x71) this.f36984b, (ArrayList) obj);
                return;
            case 24:
                w71 w71Var = (w71) this.f36984b;
                ArrayList arrayList13 = w71Var.f43082e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = w71Var.f43079a;
                ArrayList arrayList14 = w71Var.d;
                if (tL_error5 != null) {
                    if (w71Var.f43085r) {
                        arrayList14.clear();
                        w71Var.f43085r = false;
                    }
                    w71Var.h = true;
                    w71Var.f43083f = false;
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
                if (w71Var.f43085r) {
                    arrayList14.clear();
                    w71Var.f43085r = false;
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
                    w71Var.h = true;
                }
                w71Var.f43083f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                a81 a81Var = (a81) this.f36984b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var12 = (org.telegram.ui.Components.h71) obj2;
                int i39 = a81Var.f35727b0;
                ai.e9 e9Var = a81Var.Z;
                if (e9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.u61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = e9Var.f897i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = kb1.f39444b;
                        org.telegram.ui.Components.u61 J6 = org.telegram.ui.Components.u61.J(kb1.class);
                        J6.f31080u = 1;
                        J6.f31084z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20042id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f31066f = true;
                        J6.v = i39;
                        J6.K(a81Var.f35726a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f31080u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (e9Var.k() || !e9Var.f906r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.u61 o9 = org.telegram.ui.Components.u61.o(i16, 34);
                                o9.f31080u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.u61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.h71 h71Var13 = (org.telegram.ui.Components.h71) obj2;
                k91.b0((k91) this.f36984b, (ArrayList) obj);
                return;
            case 27:
                v91 v91Var = (v91) this.f36984b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.h71 h71Var14 = (org.telegram.ui.Components.h71) obj2;
                LinearLayout linearLayout = v91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.u61.k(linearLayout));
                }
                LinearLayout linearLayout2 = v91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.u61.k(linearLayout2));
                    return;
                }
                return;
            default:
                oe1 oe1Var = (oe1) this.f36984b;
                fh.b bVar4 = oe1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                oe1Var.f40698r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                oe1Var.v = paint2;
                Bitmap bitmap5 = oe1Var.f40698r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                oe1Var.f40699s = bitmapShader2;
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
                oe1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                oe1Var.f40700w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, oe1Var.f40689b);
                oe1Var.F.d();
                return;
        }
    }
}
