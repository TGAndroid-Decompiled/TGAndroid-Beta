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
    public final int f32051a;
    public final Object f32052b;

    public b5(Object obj, int i10) {
        this.f32051a = i10;
        this.f32052b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ma1 ma1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        pf pfVar;
        float f7;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r8 = false;
        boolean z11 = false;
        switch (this.f32051a) {
            case 0:
                c5 c5Var = (c5) this.f32052b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f32678w = false;
                fh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f32052b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var = (org.telegram.ui.Components.x51) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f25132q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.j51 c11 = org.telegram.ui.Components.j51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f25132q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
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
                            int i22 = k9.f35137a;
                            org.telegram.ui.Components.j51 J = org.telegram.ui.Components.j51.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.j51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i23 = g9.f33915a;
                        org.telegram.ui.Components.j51 J2 = org.telegram.ui.Components.j51.J(g9.class);
                        J2.G = i9Var;
                        J2.D = f2Var;
                        J2.K(m9Var.l0(i9Var.f34517c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.j51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.j51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                le leVar = (le) this.f32052b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var2 = (org.telegram.ui.Components.x51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(leVar.f35533y0).getChat(Long.valueOf(-leVar.f35534z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(leVar.f35533y0).getChatFull(-leVar.f35534z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (leVar.f35514f1) {
                    arrayList4.add(org.telegram.ui.Components.j51.g(leVar.C0));
                    ma1 ma1Var2 = leVar.f35522o1;
                    if (ma1Var2 != null && !ma1Var2.f35754l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(5, i10, ma1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.j51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ma1 ma1Var3 = leVar.f35523p1;
                    if (ma1Var3 != null && !ma1Var3.f35754l) {
                        arrayList4.add(org.telegram.ui.Components.j51.h(2, i10, ma1Var3));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-2, charSequence));
                    }
                }
                if (leVar.f35515g1 && (ma1Var = leVar.f35524q1) != null && !ma1Var.f35754l) {
                    arrayList4.add(org.telegram.ui.Components.j51.h(2, i10, ma1Var));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-3, null));
                }
                if (leVar.f35525r1) {
                    arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.f35526s1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.f35527t1));
                    arrayList4.add(org.telegram.ui.Components.j51.u(leVar.f35528u1));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-4, leVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (leVar.f35514f1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.k(leVar.G0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-5, leVar.D0));
                        int i24 = MessagesController.getInstance(leVar.f35533y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (leVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new lp0(i11, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.j51 i25 = org.telegram.ui.Components.j51.i(1, string);
                        if (leVar.B0 >= i24 && leVar.f35520m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.j51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (leVar.f35515g1) {
                        arrayList4.add(org.telegram.ui.Components.j51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.j51.j(3, leVar.M0));
                        arrayList4.add(org.telegram.ui.Components.j51.A(-6, leVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(leVar.f35533y0).getChat(Long.valueOf(-leVar.f35534z0))) && MessagesController.getInstance(leVar.f35533y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, leVar.f35532x0), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.j51.A(-7, null));
                }
                if (leVar.f35513e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.j51.p(leVar.f35513e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.j51.A(-10, null));
                    return;
                }
            case 3:
                fe feVar = (fe) this.f32052b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var3 = (org.telegram.ui.Components.x51) obj2;
                he heVar = feVar.f33627f;
                int i26 = feVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = heVar.f34251n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.r7.f47761a;
                        org.telegram.ui.Components.j51 J3 = org.telegram.ui.Components.j51.J(yh.r7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f25132q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(heVar.f34252r)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = heVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.r7.f47761a;
                        org.telegram.ui.Components.j51 J4 = org.telegram.ui.Components.j51.J(yh.r7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f25132q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(heVar.f34250f)) {
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.j51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                wo woVar = (wo) this.f32052b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    woVar.getClass();
                    org.telegram.ui.Components.vc.a0(woVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(woVar.f39101k0);
                AndroidUtilities.removeFromParent(woVar.f39098h0);
                AndroidUtilities.removeFromParent(woVar.f39100j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new qq((ur) this.f32052b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32052b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                us usVar = (us) this.f32052b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var4 = (org.telegram.ui.Components.x51) obj2;
                TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.V));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.f38187b));
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.f38188c));
                if (TextUtils.isEmpty(usVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (usVar.K) {
                    arrayList8.add(org.telegram.ui.Components.j51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                }
                if (usVar.I && usVar.K) {
                    org.telegram.ui.Components.j51 i29 = org.telegram.ui.Components.j51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(usVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.j51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.j51.k(usVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (!usVar.I) {
                    TLRPC.UserFull userFull = usVar.getMessagesController().getUserFull(usVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(usVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.j51.k(usVar.f38194x));
                    arrayList8.add(org.telegram.ui.Components.j51.k(usVar.f38195y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.j51.k(usVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.j51.B(null));
                    org.telegram.ui.Components.j51 e = org.telegram.ui.Components.j51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f25133r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.j51.B(charSequence2));
                if (usVar.Y) {
                    AndroidUtilities.runOnUIThread(new ls(usVar, user, 0));
                    usVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ms(usVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                ut.a((ut) this.f32052b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                qt qtVar = (qt) this.f32052b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ut utVar = qtVar.f37022a;
                st stVar = utVar.f38213l;
                if (stVar != null) {
                    String join = TextUtils.join("", utVar.f38216o);
                    if (callback != null) {
                        pfVar = new pf(24, qtVar, callback);
                    } else {
                        pfVar = null;
                    }
                    stVar.G(charSequence3, join, pfVar);
                    if (callback == null) {
                        utVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.x51 x51Var5 = (org.telegram.ui.Components.x51) obj2;
                eu.R((eu) this.f32052b, (ArrayList) obj);
                return;
            case 11:
                wy wyVar = (wy) this.f32052b;
                Long l10 = (Long) obj2;
                wyVar.P1 = (Long) obj;
                wyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32052b).run();
                return;
            case 13:
                final oz ozVar = (oz) this.f32052b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var6 = (org.telegram.ui.Components.x51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(2);
                j51Var.f25127l = string2;
                j51Var.f25126k = i30;
                arrayList9.add(j51Var);
                org.telegram.ui.Components.j51 i31 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(ozVar.f36466c);
                arrayList9.add(i31);
                if (ozVar.f36466c) {
                    arrayList9.add(org.telegram.ui.Components.j51.B(null));
                    arrayList9.add(org.telegram.ui.Components.j51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    ((nz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = ozVar2.f36467f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(ozVar2.f36466c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    return;
                                default:
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    ((nz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = ozVar3.f36467f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(ozVar3.f36466c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    ((nz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = ozVar2.f36467f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(ozVar2.f36466c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    return;
                                default:
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    ((nz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = ozVar3.f36467f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(ozVar3.f36466c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = mz.f35913a;
                    org.telegram.ui.Components.j51 J5 = org.telegram.ui.Components.j51.J(mz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(ozVar.d);
                    arrayList9.add(J5);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                hc0 hc0Var = (hc0) this.f32052b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                hc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(hc0Var.f34236b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.w1.o(R.string.AIEditorStyleNotFound, hc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        hc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                ow0 ow0Var = (ow0) this.f32052b;
                fh.b bVar2 = ow0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                ow0Var.f36453s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ow0Var.f36454w = paint;
                Bitmap bitmap2 = ow0Var.f36453s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ow0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                ow0Var.f36454w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ow0Var.f36455x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, ow0Var.f36444c);
                ow0Var.G.d();
                return;
            case 16:
                vw0 vw0Var = (vw0) this.f32052b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var7 = (org.telegram.ui.Components.x51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(2);
                j51Var2.f25127l = string3;
                j51Var2.f25126k = i33;
                arrayList10.add(j51Var2);
                org.telegram.ui.Components.j51 i34 = org.telegram.ui.Components.j51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(vw0Var.f38522r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.j51.A(2, null));
                if (vw0Var.f38522r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) vw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    bs0 bs0Var = new bs0(3);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21675c = a2;
                    y7Var.d = 20;
                    y7Var.e = bs0Var;
                    vw0Var.f38518b.d((int) Utilities.clamp(vw0Var.f38523s, 10000L, 0L), y7Var, new s3(vw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.j51.j(3, vw0Var.f38518b));
                    if (vw0Var.f38523s > 0) {
                        str = vw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.j51.A(4, str));
                    TLRPC.Chat chat3 = vw0Var.getMessagesController().getChat(Long.valueOf(vw0Var.f38517a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        vw0Var.f38519c.setLink(vw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.j51.j(5, vw0Var.f38519c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32052b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32052b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31365p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                c41 c41Var = (c41) this.f32052b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var8 = (org.telegram.ui.Components.x51) obj2;
                org.telegram.ui.Components.f61 f61Var = c41Var.f32667f;
                d41 d41Var = c41Var.v;
                ArrayList arrayList12 = d41Var.h;
                t5 t5Var = c41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.j51 C = org.telegram.ui.Components.j51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f25134s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = c41Var.f32665b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || c41Var.f32666c != null || c41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || c41Var.f32666c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(c41Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 0, 0, false, false, d41.u(d41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = c41Var.f32665b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = c41Var.f32666c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18934h5));
                        org.telegram.ui.Components.j51 k10 = org.telegram.ui.Components.j51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (c41Var.f32665b != null) {
                        for (int i35 = 0; i35 < c41Var.f32665b.options.size(); i35++) {
                            org.telegram.ui.Components.j51 j51Var3 = new org.telegram.ui.Components.j51(30);
                            j51Var3.f25127l = c41Var.f32665b.options.get(i35).text;
                            j51Var3.f25126k = R.drawable.msg_arrowright;
                            j51Var3.d = i35;
                            arrayList11.add(j51Var3);
                            measuredHeight += 50;
                        }
                    } else if (c41Var.f32666c != null) {
                        for (int i36 = 0; i36 < c41Var.f32666c.options.size(); i36++) {
                            org.telegram.ui.Components.j51 j51Var4 = new org.telegram.ui.Components.j51(30);
                            j51Var4.f25127l = c41Var.f32666c.options.get(i36).text;
                            j51Var4.f25126k = R.drawable.msg_arrowright;
                            j51Var4.d = i36;
                            arrayList11.add(j51Var4);
                            measuredHeight += 50;
                        }
                    } else if (c41Var.d != null) {
                        if (c41Var.f32668n == null) {
                            b41 b41Var = new b41(c41Var, c41Var.getContext(), d41.v(d41Var));
                            c41Var.f32668n = b41Var;
                            b41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = c41Var.f32668n.f20240b;
                        if (c41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.j51 k11 = org.telegram.ui.Components.j51.k(c41Var.f32668n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = d41Var.f33003r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(d41.w(d41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i13, arrayList11);
                        if (c41Var.f32669r == null) {
                            ci.d dVar = new ci.d(c41Var.getContext(), d41.x(d41Var), true);
                            c41Var.f32670s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(c41Var.getContext());
                            c41Var.f32669r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18934h5, d41.y(d41Var)));
                            c41Var.f32669r.addView(c41Var.f32670s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(c41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18864d7, d41.z(d41Var)));
                            c41Var.f32669r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = c41Var.f32670s;
                        if (!c41Var.d.optional && TextUtils.isEmpty(c41Var.f32668n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        c41Var.f32670s.setOnClickListener(new m60(c41Var, 28));
                        org.telegram.ui.Components.j51 k12 = org.telegram.ui.Components.j51.k(c41Var.f32669r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.j51) hg.k0.h(1, arrayList11)).f25125j = true;
                    if (d41Var.d && c41Var.f32664a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(c41Var.getContext());
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18807a7)), org.telegram.ui.ActionBar.j6.U0(c41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18827b7, d41.A(d41Var))), 0, 0);
                        pqVar.f27116w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(c41Var.getContext(), null);
                        c90Var.setTextSize(1, 14.0f);
                        c90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), d41.B(d41Var)));
                        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, d41.F(d41Var)));
                        c90Var.setGravity(17);
                        frameLayout2.addView(c90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.j51 k13 = org.telegram.ui.Components.j51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (f61Var != null) {
                    if (d41.G(d41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        f61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    f61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.x51 x51Var9 = (org.telegram.ui.Components.x51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((j41) this.f32052b).X));
                return;
            case 21:
                org.telegram.ui.Components.x51 x51Var10 = (org.telegram.ui.Components.x51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.j51.k(((u41) this.f32052b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32052b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.x51 x51Var11 = (org.telegram.ui.Components.x51) obj2;
                s71.Q((s71) this.f32052b, (ArrayList) obj);
                return;
            case 24:
                r71 r71Var = (r71) this.f32052b;
                ArrayList arrayList13 = r71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = r71Var.f37110a;
                ArrayList arrayList14 = r71Var.d;
                if (tL_error5 != null) {
                    if (r71Var.f37115r) {
                        arrayList14.clear();
                        r71Var.f37115r = false;
                    }
                    r71Var.h = true;
                    r71Var.f37113f = false;
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
                if (r71Var.f37115r) {
                    arrayList14.clear();
                    r71Var.f37115r = false;
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
                    r71Var.h = true;
                }
                r71Var.f37113f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                v71 v71Var = (v71) this.f32052b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var12 = (org.telegram.ui.Components.x51) obj2;
                int i39 = v71Var.f38326b0;
                ai.d9 d9Var = v71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f721i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = hb1.f34231b;
                        org.telegram.ui.Components.j51 J6 = org.telegram.ui.Components.j51.J(hb1.class);
                        J6.f25136u = 1;
                        J6.f25140z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18356id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f25122f = true;
                        J6.v = i39;
                        J6.K(v71Var.f38325a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f25136u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.f730r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.j51 o9 = org.telegram.ui.Components.j51.o(i16, 34);
                                o9.f25136u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.j51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.x51 x51Var13 = (org.telegram.ui.Components.x51) obj2;
                g91.b0((g91) this.f32052b, (ArrayList) obj);
                return;
            case 27:
                s91 s91Var = (s91) this.f32052b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.x51 x51Var14 = (org.telegram.ui.Components.x51) obj2;
                LinearLayout linearLayout = s91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout));
                }
                LinearLayout linearLayout2 = s91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.j51.k(linearLayout2));
                    return;
                }
                return;
            default:
                me1 me1Var = (me1) this.f32052b;
                fh.b bVar4 = me1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                me1Var.f35788r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                me1Var.v = paint2;
                Bitmap bitmap5 = me1Var.f35788r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                me1Var.f35789s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                me1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                me1Var.f35790w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, me1Var.f35780b);
                me1Var.F.d();
                return;
        }
    }
}
