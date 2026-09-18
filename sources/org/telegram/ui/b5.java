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
import android.view.ViewGroup;
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
    public final int f32239a;
    public final Object f32240b;

    public b5(Object obj, int i10) {
        this.f32239a = i10;
        this.f32240b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        la1 la1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        of ofVar;
        float f7;
        String str;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        int i13;
        int i14;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        org.telegram.ui.ActionBar.e6 e6Var5;
        org.telegram.ui.ActionBar.e6 e6Var6;
        org.telegram.ui.ActionBar.e6 e6Var7;
        org.telegram.ui.ActionBar.e6 e6Var8;
        ViewGroup viewGroup;
        int i15;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        r8 = false;
        boolean z11 = false;
        switch (this.f32239a) {
            case 0:
                c5 c5Var = (c5) this.f32240b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f32538w = false;
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
                l9 l9Var = (l9) this.f32240b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var = (org.telegram.ui.Components.l61) obj2;
                boolean isEmpty = l9Var.K.isEmpty();
                ArrayList arrayList2 = l9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.x51 c10 = org.telegram.ui.Components.x51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f30253q = true;
                    arrayList.add(c10);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.x51 c11 = org.telegram.ui.Components.x51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f30253q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.x51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = l9Var.K;
                    int size = arrayList3.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj3 = arrayList3.get(i22);
                        i22++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = l9Var.getMessagesController().getChat(l4)) != null) {
                            o8 o8Var = new o8(l9Var, 0);
                            int i23 = j9.f34729a;
                            org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(j9.class);
                            J.G = chat;
                            J.D = o8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.x51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i16 < size2) {
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        h9 h9Var = (h9) obj4;
                        ai.f2 f2Var = new ai.f2(27, l9Var, h9Var);
                        int i24 = f9.f33473a;
                        org.telegram.ui.Components.x51 J2 = org.telegram.ui.Components.x51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = f2Var;
                        J2.K(l9Var.l0(h9Var.f34106c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.J) {
                        arrayList.add(org.telegram.ui.Components.x51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.x51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.x51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f32240b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var2 = (org.telegram.ui.Components.l61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f35065y0).getChat(Long.valueOf(-keVar.f35066z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f35065y0).getChatFull(-keVar.f35066z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f35046f1) {
                    arrayList4.add(org.telegram.ui.Components.x51.g(keVar.C0));
                    la1 la1Var2 = keVar.f35054o1;
                    if (la1Var2 != null && !la1Var2.f35330l) {
                        arrayList4.add(org.telegram.ui.Components.x51.h(5, i10, la1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.x51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    la1 la1Var3 = keVar.f35055p1;
                    if (la1Var3 != null && !la1Var3.f35330l) {
                        arrayList4.add(org.telegram.ui.Components.x51.h(2, i10, la1Var3));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-2, charSequence));
                    }
                }
                if (keVar.f35047g1 && (la1Var = keVar.f35056q1) != null && !la1Var.f35330l) {
                    arrayList4.add(org.telegram.ui.Components.x51.h(2, i10, la1Var));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-3, null));
                }
                if (keVar.f35057r1) {
                    arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.x51.u(keVar.f35058s1));
                    arrayList4.add(org.telegram.ui.Components.x51.u(keVar.f35059t1));
                    arrayList4.add(org.telegram.ui.Components.x51.u(keVar.f35060u1));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f35046f1) {
                        arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.x51.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-5, keVar.D0));
                        int i25 = MessagesController.getInstance(keVar.f35065y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.B0 < i25) {
                            i11 = i25;
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
                        org.telegram.ui.Components.x51 i26 = org.telegram.ui.Components.x51.i(1, string);
                        if (keVar.B0 >= i25 && keVar.f35052m1) {
                            z11 = true;
                        }
                        i26.K(z11);
                        arrayList4.add(i26);
                        arrayList4.add(org.telegram.ui.Components.x51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f35047g1) {
                        arrayList4.add(org.telegram.ui.Components.x51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.x51.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.x51.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f35065y0).getChat(Long.valueOf(-keVar.f35066z0))) && MessagesController.getInstance(keVar.f35065y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, keVar.f35064x0), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.x51.A(-7, null));
                }
                if (keVar.f35045e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.x51.p(keVar.f35045e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.x51.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f32240b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var3 = (org.telegram.ui.Components.l61) obj2;
                ge geVar = eeVar.f33266f;
                int i27 = eeVar.d;
                if (i27 == 0) {
                    ArrayList arrayList6 = geVar.f33820n;
                    int size3 = arrayList6.size();
                    while (i20 < size3) {
                        Object obj5 = arrayList6.get(i20);
                        i20++;
                        int i28 = yh.o7.f47823a;
                        org.telegram.ui.Components.x51 J3 = org.telegram.ui.Components.x51.J(yh.o7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f30253q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f33821r)) {
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i27 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i21 < size4) {
                        Object obj6 = arrayList7.get(i21);
                        i21++;
                        int i29 = yh.o7.f47823a;
                        org.telegram.ui.Components.x51 J4 = org.telegram.ui.Components.x51.J(yh.o7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f30253q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f33819f)) {
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.x51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                uo uoVar = (uo) this.f32240b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    uoVar.getClass();
                    org.telegram.ui.Components.xc.a0(uoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(uoVar.f38048k0);
                AndroidUtilities.removeFromParent(uoVar.f38045h0);
                AndroidUtilities.removeFromParent(uoVar.f38047j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new oq((sr) this.f32240b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32240b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ss ssVar = (ss) this.f32240b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var4 = (org.telegram.ui.Components.l61) obj2;
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.V));
                arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.f37456b));
                arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.f37457c));
                if (TextUtils.isEmpty(ssVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.x51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (ssVar.K) {
                    arrayList8.add(org.telegram.ui.Components.x51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.x51.B(null));
                }
                if (ssVar.I && ssVar.K) {
                    org.telegram.ui.Components.x51 i30 = org.telegram.ui.Components.x51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i30.K(ssVar.X);
                    arrayList8.add(i30);
                    arrayList8.add(org.telegram.ui.Components.x51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (!ssVar.I) {
                    TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.f37463x));
                    arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.f37464y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.x51.k(ssVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.x51.B(null));
                    org.telegram.ui.Components.x51 e = org.telegram.ui.Components.x51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f30254r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.x51.B(charSequence2));
                if (ssVar.Y) {
                    AndroidUtilities.runOnUIThread(new js(ssVar, user, 0));
                    ssVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ks(ssVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                st.a((st) this.f32240b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ot otVar = (ot) this.f32240b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                st stVar = otVar.f36238a;
                qt qtVar = stVar.f37482l;
                if (qtVar != null) {
                    String join = TextUtils.join("", stVar.f37485o);
                    if (callback != null) {
                        ofVar = new of(24, otVar, callback);
                    } else {
                        ofVar = null;
                    }
                    qtVar.u(charSequence3, join, ofVar);
                    if (callback == null) {
                        stVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.l61 l61Var5 = (org.telegram.ui.Components.l61) obj2;
                du.R((du) this.f32240b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f32240b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32240b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f32240b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var6 = (org.telegram.ui.Components.l61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i31 = R.raw.topics_top;
                org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(2);
                x51Var.f30248l = string2;
                x51Var.f30247k = i31;
                arrayList9.add(x51Var);
                org.telegram.ui.Components.x51 i32 = org.telegram.ui.Components.x51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i32.K(mzVar.f35778c);
                arrayList9.add(i32);
                if (mzVar.f35778c) {
                    arrayList9.add(org.telegram.ui.Components.x51.B(null));
                    arrayList9.add(org.telegram.ui.Components.x51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f35779f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35778c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35779f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35778c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f35779f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35778c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35779f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35778c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i33 = kz.f35202a;
                    org.telegram.ui.Components.x51 J5 = org.telegram.ui.Components.x51.J(kz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(mzVar.d);
                    arrayList9.add(J5);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                gc0 gc0Var = (gc0) this.f32240b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                gc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(gc0Var.f33804b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.q.q(R.string.AIEditorStyleNotFound, gc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        gc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                mw0 mw0Var = (mw0) this.f32240b;
                fh.b bVar2 = mw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                mw0Var.f35765s = (Bitmap) obj;
                Paint paint = new Paint(1);
                mw0Var.f35766w = paint;
                Bitmap bitmap2 = mw0Var.f35765s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                mw0Var.v = bitmapShader;
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
                mw0Var.f35766w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                mw0Var.f35767x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, mw0Var.f35756c);
                mw0Var.G.d();
                return;
            case 16:
                tw0 tw0Var = (tw0) this.f32240b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var7 = (org.telegram.ui.Components.l61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i34 = R.raw.bubble;
                org.telegram.ui.Components.x51 x51Var2 = new org.telegram.ui.Components.x51(2);
                x51Var2.f30248l = string3;
                x51Var2.f30247k = i34;
                arrayList10.add(x51Var2);
                org.telegram.ui.Components.x51 i35 = org.telegram.ui.Components.x51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i35.K(tw0Var.f37821r);
                arrayList10.add(i35);
                arrayList10.add(org.telegram.ui.Components.x51.A(2, null));
                if (tw0Var.f37821r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    wk0 wk0Var = new wk0(5);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21851c = a2;
                    y7Var.d = 20;
                    y7Var.e = wk0Var;
                    tw0Var.f37817b.d((int) Utilities.clamp(tw0Var.f37822s, 10000L, 0L), y7Var, new s3(tw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.x51.j(3, tw0Var.f37817b));
                    if (tw0Var.f37822s > 0) {
                        str = tw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.x51.A(4, str));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.f37816a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.f37818c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.x51.j(5, tw0Var.f37818c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32240b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32240b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31592p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                a41 a41Var = (a41) this.f32240b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var8 = (org.telegram.ui.Components.l61) obj2;
                org.telegram.ui.Components.t61 t61Var = a41Var.f31948f;
                b41 b41Var = a41Var.v;
                ArrayList arrayList12 = b41Var.h;
                t5 t5Var = a41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.x51 C = org.telegram.ui.Components.x51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f30255s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f31946b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f31947c != null || a41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f31947c != null) {
                        Context context2 = a41Var.getContext();
                        int i36 = org.telegram.ui.ActionBar.j6.L6;
                        e6Var = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i36, 21, 0, 0, false, false, e6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = a41Var.f31946b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f31947c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(b41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5));
                        org.telegram.ui.Components.x51 k10 = org.telegram.ui.Components.x51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (a41Var.f31946b != null) {
                        for (int i37 = 0; i37 < a41Var.f31946b.options.size(); i37++) {
                            org.telegram.ui.Components.x51 x51Var3 = new org.telegram.ui.Components.x51(30);
                            x51Var3.f30248l = a41Var.f31946b.options.get(i37).text;
                            x51Var3.f30247k = R.drawable.msg_arrowright;
                            x51Var3.d = i37;
                            arrayList11.add(x51Var3);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.f31947c != null) {
                        for (int i38 = 0; i38 < a41Var.f31947c.options.size(); i38++) {
                            org.telegram.ui.Components.x51 x51Var4 = new org.telegram.ui.Components.x51(30);
                            x51Var4.f30248l = a41Var.f31947c.options.get(i38).text;
                            x51Var4.f30247k = R.drawable.msg_arrowright;
                            x51Var4.d = i38;
                            arrayList11.add(x51Var4);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.d != null) {
                        if (a41Var.f31949n == null) {
                            Context context3 = a41Var.getContext();
                            e6Var5 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                            z31 z31Var = new z31(a41Var, context3, e6Var5);
                            a41Var.f31949n = z31Var;
                            z31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = a41Var.f31949n.f20455b;
                        if (a41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.x51 k11 = org.telegram.ui.Components.x51.k(a41Var.f31949n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = b41Var.f32237r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i14 = R.string.Report2CommentInfoMany;
                            } else {
                                i14 = R.string.Report2CommentInfo;
                            }
                        } else if (!DialogObject.isUserDialog(j10)) {
                            i13 = ((org.telegram.ui.ActionBar.f3) b41Var).currentAccount;
                            if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i13).getChat(Long.valueOf(-j10)))) {
                                i14 = R.string.Report2CommentInfoChannel;
                            } else {
                                i14 = R.string.Report2CommentInfoGroup;
                            }
                        } else {
                            i14 = R.string.Report2CommentInfoUser;
                        }
                        com.google.android.gms.internal.vision.e2.w(i14, arrayList11);
                        if (a41Var.f31950r == null) {
                            Context context4 = a41Var.getContext();
                            e6Var2 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                            ci.d dVar = new ci.d(context4, e6Var2, true);
                            a41Var.f31951s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(a41Var.getContext());
                            a41Var.f31950r = frameLayout;
                            int i39 = org.telegram.ui.ActionBar.j6.f19133h5;
                            e6Var3 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i39, e6Var3));
                            a41Var.f31950r.addView(a41Var.f31951s, w7.y5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(a41Var.getContext());
                            int i40 = org.telegram.ui.ActionBar.j6.f19063d7;
                            e6Var4 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i40, e6Var4));
                            a41Var.f31950r.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = a41Var.f31951s;
                        if (!a41Var.d.optional && TextUtils.isEmpty(a41Var.f31949n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        a41Var.f31951s.setOnClickListener(new k60(a41Var, 28));
                        org.telegram.ui.Components.x51 k12 = org.telegram.ui.Components.x51.k(a41Var.f31950r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.x51) hg.k0.g(1, arrayList11)).f30246j = true;
                    if (b41Var.d && a41Var.f31945a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(a41Var.getContext());
                        Context context5 = a41Var.getContext();
                        int i41 = R.drawable.greydivider;
                        int i42 = org.telegram.ui.ActionBar.j6.f19026b7;
                        e6Var6 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(b41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19006a7)), org.telegram.ui.ActionBar.j6.U0(context5, i41, org.telegram.ui.ActionBar.j6.v0(i42, e6Var6)), 0, 0);
                        pqVar.f27303w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(a41Var.getContext(), null);
                        l90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        e6Var7 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                        l90Var.setText(AndroidUtilities.replaceLinks(string4, e6Var7));
                        int i43 = org.telegram.ui.ActionBar.j6.A6;
                        e6Var8 = ((org.telegram.ui.ActionBar.f3) b41Var).resourcesProvider;
                        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i43, e6Var8));
                        l90Var.setGravity(17);
                        frameLayout2.addView(l90Var, w7.y5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.x51 k13 = org.telegram.ui.Components.x51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (t61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) b41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        t61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    t61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.l61 l61Var9 = (org.telegram.ui.Components.l61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.x51.k(((h41) this.f32240b).X));
                return;
            case 21:
                org.telegram.ui.Components.l61 l61Var10 = (org.telegram.ui.Components.l61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.x51.k(((s41) this.f32240b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32240b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.l61 l61Var11 = (org.telegram.ui.Components.l61) obj2;
                q71.Q((q71) this.f32240b, (ArrayList) obj);
                return;
            case 24:
                p71 p71Var = (p71) this.f32240b;
                ArrayList arrayList13 = p71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i44 = p71Var.f36365a;
                ArrayList arrayList14 = p71Var.d;
                if (tL_error5 != null) {
                    if (p71Var.f36370r) {
                        arrayList14.clear();
                        p71Var.f36370r = false;
                    }
                    p71Var.h = true;
                    p71Var.f36368f = false;
                    int size5 = arrayList13.size();
                    while (i18 < size5) {
                        Object obj7 = arrayList13.get(i18);
                        i18++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i44).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i44).putChats(channels_channelparticipants.chats, false);
                if (p71Var.f36370r) {
                    arrayList14.clear();
                    p71Var.f36370r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i45 = 0;
                while (i45 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i45);
                    i45++;
                    TLObject userOrChat = MessagesController.getInstance(i44).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    p71Var.h = true;
                }
                p71Var.f36368f = false;
                int size7 = arrayList13.size();
                while (i19 < size7) {
                    Object obj8 = arrayList13.get(i19);
                    i19++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                t71 t71Var = (t71) this.f32240b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var12 = (org.telegram.ui.Components.l61) obj2;
                int i46 = t71Var.f37607b0;
                ai.d9 d9Var = t71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.x51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f721i;
                    int size8 = arrayList17.size();
                    int i47 = i46;
                    int i48 = 0;
                    while (i48 < size8) {
                        Object obj9 = arrayList17.get(i48);
                        i48++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i49 = gb1.f33799b;
                        org.telegram.ui.Components.x51 J6 = org.telegram.ui.Components.x51.J(gb1.class);
                        J6.f30257u = 1;
                        J6.f30261z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18531id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f30243f = true;
                        J6.v = i46;
                        J6.K(t71Var.f37606a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f30257u = 1;
                        arrayList16.add(J6);
                        i47--;
                        if (i47 == 0) {
                            i47 = i46;
                        }
                    }
                    if (d9Var.k() || !d9Var.f730r) {
                        while (true) {
                            if (i47 <= 0) {
                                i15 = i46;
                            } else {
                                i15 = i47;
                            }
                            if (i17 < i15) {
                                i17++;
                                org.telegram.ui.Components.x51 o9 = org.telegram.ui.Components.x51.o(i17, 34);
                                o9.f30257u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.x51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.l61 l61Var13 = (org.telegram.ui.Components.l61) obj2;
                f91.b0((f91) this.f32240b, (ArrayList) obj);
                return;
            case 27:
                r91 r91Var = (r91) this.f32240b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.l61 l61Var14 = (org.telegram.ui.Components.l61) obj2;
                LinearLayout linearLayout = r91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.x51.k(linearLayout));
                }
                LinearLayout linearLayout2 = r91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.x51.k(linearLayout2));
                    return;
                }
                return;
            default:
                ke1 ke1Var = (ke1) this.f32240b;
                fh.b bVar4 = ke1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ke1Var.f35079r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ke1Var.v = paint2;
                Bitmap bitmap5 = ke1Var.f35079r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ke1Var.f35080s = bitmapShader2;
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
                ke1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ke1Var.f35081w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, ke1Var.f35071b);
                ke1Var.F.d();
                return;
        }
    }
}
