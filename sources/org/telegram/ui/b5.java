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
    public final int f32037a;
    public final Object f32038b;

    public b5(Object obj, int i10) {
        this.f32037a = i10;
        this.f32038b = obj;
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
        nf nfVar;
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
        r9 = false;
        boolean z11 = false;
        switch (this.f32037a) {
            case 0:
                c5 c5Var = (c5) this.f32038b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f32666w = false;
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
                k9 k9Var = (k9) this.f32038b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f24905q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c11 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f24905q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj3 = arrayList3.get(i22);
                        i22++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, 0);
                            int i23 = i9.f34545a;
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i16 < size2) {
                        Object obj4 = arrayList2.get(i16);
                        i16++;
                        g9 g9Var = (g9) obj4;
                        ai.f2 f2Var = new ai.f2(27, k9Var, g9Var);
                        int i24 = e9.f33228a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = f2Var;
                        J2.K(k9Var.l0(g9Var.f33796c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                je jeVar = (je) this.f32038b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var2 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.f34894y0).getChat(Long.valueOf(-jeVar.f34895z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.f34894y0).getChatFull(-jeVar.f34895z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (jeVar.f34875f1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(jeVar.C0));
                    la1 la1Var2 = jeVar.f34883o1;
                    if (la1Var2 != null && !la1Var2.f35375l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i10, la1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    la1 la1Var3 = jeVar.f34884p1;
                    if (la1Var3 != null && !la1Var3.f35375l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, la1Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (jeVar.f34876g1 && (la1Var = jeVar.f34885q1) != null && !la1Var.f35375l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, la1Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (jeVar.f34886r1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34887s1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34888t1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34889u1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f34875f1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, jeVar.D0));
                        int i25 = MessagesController.getInstance(jeVar.f34894y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (jeVar.B0 < i25) {
                            i11 = i25;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(0, new jp0(i11, context, null, false));
                            oqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i26 = org.telegram.ui.Components.i51.i(1, string);
                        if (jeVar.B0 >= i25 && jeVar.f34881m1) {
                            z11 = true;
                        }
                        i26.K(z11);
                        arrayList4.add(i26);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.f34876g1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.f34894y0).getChat(Long.valueOf(-jeVar.f34895z0))) && MessagesController.getInstance(jeVar.f34894y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, jeVar.f34893x0), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (jeVar.f34874e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(jeVar.f34874e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    return;
                }
            case 3:
                de deVar = (de) this.f32038b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var3 = (org.telegram.ui.Components.w51) obj2;
                fe feVar = deVar.f33007f;
                int i27 = deVar.d;
                if (i27 == 0) {
                    ArrayList arrayList6 = feVar.f33578n;
                    int size3 = arrayList6.size();
                    while (i20 < size3) {
                        Object obj5 = arrayList6.get(i20);
                        i20++;
                        int i28 = yh.q7.f47637a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(yh.q7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f24905q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.f33579r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i27 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i21 < size4) {
                        Object obj6 = arrayList7.get(i21);
                        i21++;
                        int i29 = yh.q7.f47637a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(yh.q7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f24905q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f33577f)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                wo woVar = (wo) this.f32038b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    woVar.getClass();
                    org.telegram.ui.Components.vc.a0(woVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(woVar.f39279k0);
                AndroidUtilities.removeFromParent(woVar.f39276h0);
                AndroidUtilities.removeFromParent(woVar.f39278j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new qq((ur) this.f32038b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32038b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ss ssVar = (ss) this.f32038b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var4 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.V));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37447b));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37448c));
                if (TextUtils.isEmpty(ssVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (ssVar.K) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (ssVar.I && ssVar.K) {
                    org.telegram.ui.Components.i51 i30 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i30.K(ssVar.X);
                    arrayList8.add(i30);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.d));
                hg.c.p(R.string.AddNotesInfo, arrayList8);
                if (!ssVar.I) {
                    TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37454x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37455y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f24906r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (ssVar.Y) {
                    AndroidUtilities.runOnUIThread(new js(ssVar, user, 0));
                    ssVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ks(ssVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                st.a((st) this.f32038b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ot otVar = (ot) this.f32038b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                st stVar = otVar.f36339a;
                qt qtVar = stVar.f37473l;
                if (qtVar != null) {
                    String join = TextUtils.join("", stVar.f37476o);
                    if (callback != null) {
                        nfVar = new nf(24, otVar, callback);
                    } else {
                        nfVar = null;
                    }
                    qtVar.G(charSequence3, join, nfVar);
                    if (callback == null) {
                        stVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.w51 w51Var5 = (org.telegram.ui.Components.w51) obj2;
                cu.R((cu) this.f32038b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f32038b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32038b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f32038b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var6 = (org.telegram.ui.Components.w51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i31 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f24900l = string2;
                i51Var.f24899k = i31;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i32 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i32.K(mzVar.f35845c);
                arrayList9.add(i32);
                if (mzVar.f35845c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f35846f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35845c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35846f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35845c), Boolean.valueOf(mzVar3.d));
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
                                    ai.m0 m0Var = mzVar2.f35846f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35845c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35846f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35845c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i33 = kz.f35282a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(kz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(mzVar.d);
                    arrayList9.add(J5);
                    hg.c.p(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f32038b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                fc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.f33564b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.y0.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        fc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                mw0 mw0Var = (mw0) this.f32038b;
                fh.b bVar2 = mw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                mw0Var.f35832s = (Bitmap) obj;
                Paint paint = new Paint(1);
                mw0Var.f35833w = paint;
                Bitmap bitmap2 = mw0Var.f35832s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                mw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                mw0Var.f35833w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                mw0Var.f35834x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, mw0Var.f35823c);
                mw0Var.G.d();
                return;
            case 16:
                tw0 tw0Var = (tw0) this.f32038b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var7 = (org.telegram.ui.Components.w51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i34 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.f24900l = string3;
                i51Var2.f24899k = i34;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i35 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i35.K(tw0Var.f37747r);
                arrayList10.add(i35);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (tw0Var.f37747r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    js0 js0Var = new js0(2);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21659c = a2;
                    y7Var.d = 20;
                    y7Var.e = js0Var;
                    tw0Var.f37743b.d((int) Utilities.clamp(tw0Var.f37748s, 10000L, 0L), y7Var, new s3(tw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, tw0Var.f37743b));
                    if (tw0Var.f37748s > 0) {
                        str = tw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, str));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.f37742a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.f37744c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, tw0Var.f37744c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32038b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32038b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31345p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                b41 b41Var = (b41) this.f32038b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var8 = (org.telegram.ui.Components.w51) obj2;
                org.telegram.ui.Components.e61 e61Var = b41Var.f32033f;
                c41 c41Var = b41Var.v;
                ArrayList arrayList12 = c41Var.h;
                t5 t5Var = b41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f24907s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.f32031b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.f32032c != null || b41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.f32032c != null) {
                        Context context2 = b41Var.getContext();
                        int i36 = org.telegram.ui.ActionBar.i6.L6;
                        e6Var = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2, i36, 21, 0, 0, false, false, e6Var);
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = b41Var.f32031b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.f32032c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18904h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (b41Var.f32031b != null) {
                        for (int i37 = 0; i37 < b41Var.f32031b.options.size(); i37++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.f24900l = b41Var.f32031b.options.get(i37).text;
                            i51Var3.f24899k = R.drawable.msg_arrowright;
                            i51Var3.d = i37;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.f32032c != null) {
                        for (int i38 = 0; i38 < b41Var.f32032c.options.size(); i38++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.f24900l = b41Var.f32032c.options.get(i38).text;
                            i51Var4.f24899k = R.drawable.msg_arrowright;
                            i51Var4.d = i38;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.d != null) {
                        if (b41Var.f32034n == null) {
                            Context context3 = b41Var.getContext();
                            e6Var5 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            a41 a41Var = new a41(b41Var, context3, e6Var5);
                            b41Var.f32034n = a41Var;
                            a41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = b41Var.f32034n.f20190b;
                        if (b41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(b41Var.f32034n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = c41Var.f32657r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i14 = R.string.Report2CommentInfoMany;
                            } else {
                                i14 = R.string.Report2CommentInfo;
                            }
                        } else if (!DialogObject.isUserDialog(j10)) {
                            i13 = ((org.telegram.ui.ActionBar.f3) c41Var).currentAccount;
                            if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i13).getChat(Long.valueOf(-j10)))) {
                                i14 = R.string.Report2CommentInfoChannel;
                            } else {
                                i14 = R.string.Report2CommentInfoGroup;
                            }
                        } else {
                            i14 = R.string.Report2CommentInfoUser;
                        }
                        hg.c.p(i14, arrayList11);
                        if (b41Var.f32035r == null) {
                            Context context4 = b41Var.getContext();
                            e6Var2 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            ci.d dVar = new ci.d(context4, e6Var2, true);
                            b41Var.f32036s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(b41Var.getContext());
                            b41Var.f32035r = frameLayout;
                            int i39 = org.telegram.ui.ActionBar.i6.f18904h5;
                            e6Var3 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i39, e6Var3));
                            b41Var.f32035r.addView(b41Var.f32036s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(b41Var.getContext());
                            int i40 = org.telegram.ui.ActionBar.i6.f18835d7;
                            e6Var4 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i40, e6Var4));
                            b41Var.f32035r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = b41Var.f32036s;
                        if (!b41Var.d.optional && TextUtils.isEmpty(b41Var.f32034n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        b41Var.f32036s.setOnClickListener(new k60(b41Var, 28));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(b41Var.f32035r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) hg.c.h(1, arrayList11)).f24898j = true;
                    if (c41Var.d && b41Var.f32030a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b41Var.getContext());
                        Context context5 = b41Var.getContext();
                        int i41 = R.drawable.greydivider;
                        int i42 = org.telegram.ui.ActionBar.i6.f18798b7;
                        e6Var6 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18778a7)), org.telegram.ui.ActionBar.i6.U0(context5, i41, org.telegram.ui.ActionBar.i6.v0(i42, e6Var6)), 0, 0);
                        pqVar.f27122w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(b41Var.getContext(), null);
                        c90Var.setTextSize(1, 14.0f);
                        String string4 = LocaleController.getString(R.string.ReportAdLearnMore);
                        e6Var7 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        c90Var.setText(AndroidUtilities.replaceLinks(string4, e6Var7));
                        int i43 = org.telegram.ui.ActionBar.i6.A6;
                        e6Var8 = ((org.telegram.ui.ActionBar.f3) c41Var).resourcesProvider;
                        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i43, e6Var8));
                        c90Var.setGravity(17);
                        frameLayout2.addView(c90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e61Var != null) {
                    viewGroup = ((org.telegram.ui.ActionBar.f3) c41Var).containerView;
                    if (viewGroup.getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        e61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    e61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.w51 w51Var9 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((i41) this.f32038b).X));
                return;
            case 21:
                org.telegram.ui.Components.w51 w51Var10 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((s41) this.f32038b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32038b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w51 w51Var11 = (org.telegram.ui.Components.w51) obj2;
                r71.Q((r71) this.f32038b, (ArrayList) obj);
                return;
            case 24:
                q71 q71Var = (q71) this.f32038b;
                ArrayList arrayList13 = q71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i44 = q71Var.f36783a;
                ArrayList arrayList14 = q71Var.d;
                if (tL_error5 != null) {
                    if (q71Var.f36788r) {
                        arrayList14.clear();
                        q71Var.f36788r = false;
                    }
                    q71Var.h = true;
                    q71Var.f36786f = false;
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
                if (q71Var.f36788r) {
                    arrayList14.clear();
                    q71Var.f36788r = false;
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
                    q71Var.h = true;
                }
                q71Var.f36786f = false;
                int size7 = arrayList13.size();
                while (i19 < size7) {
                    Object obj8 = arrayList13.get(i19);
                    i19++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                u71 u71Var = (u71) this.f32038b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var12 = (org.telegram.ui.Components.w51) obj2;
                int i46 = u71Var.f37836b0;
                ai.d9 d9Var = u71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f718i;
                    int size8 = arrayList17.size();
                    int i47 = i46;
                    int i48 = 0;
                    while (i48 < size8) {
                        Object obj9 = arrayList17.get(i48);
                        i48++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i49 = gb1.f33809b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(gb1.class);
                        J6.f24909u = 1;
                        J6.f24913z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18344id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f24895f = true;
                        J6.v = i46;
                        J6.K(u71Var.f37835a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f24909u = 1;
                        arrayList16.add(J6);
                        i47--;
                        if (i47 == 0) {
                            i47 = i46;
                        }
                    }
                    if (d9Var.k() || !d9Var.f727r) {
                        while (true) {
                            if (i47 <= 0) {
                                i15 = i46;
                            } else {
                                i15 = i47;
                            }
                            if (i17 < i15) {
                                i17++;
                                org.telegram.ui.Components.i51 o9 = org.telegram.ui.Components.i51.o(i17, 34);
                                o9.f24909u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.w51 w51Var13 = (org.telegram.ui.Components.w51) obj2;
                f91.b0((f91) this.f32038b, (ArrayList) obj);
                return;
            case 27:
                r91 r91Var = (r91) this.f32038b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var14 = (org.telegram.ui.Components.w51) obj2;
                LinearLayout linearLayout = r91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = r91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    return;
                }
                return;
            default:
                le1 le1Var = (le1) this.f32038b;
                fh.b bVar4 = le1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                le1Var.f35458r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                le1Var.v = paint2;
                Bitmap bitmap5 = le1Var.f35458r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                le1Var.f35459s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                le1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                le1Var.f35460w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, le1Var.f35450b);
                le1Var.F.d();
                return;
        }
    }
}
