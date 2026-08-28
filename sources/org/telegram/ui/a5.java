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
public final class a5 implements Utilities.Callback2 {
    public final int f36362a;
    public final Object f36363b;

    public a5(Object obj, int i9) {
        this.f36362a = i9;
        this.f36363b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i9;
        int i10;
        e91 e91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        df dfVar;
        float f10;
        float f11;
        String str;
        int i11;
        int i12;
        boolean z10;
        int i13;
        long j10;
        TL_stories.StoryItem storyItem;
        float f12;
        float f13;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        r10 = false;
        boolean z11 = false;
        switch (this.f36362a) {
            case 0:
                b5 b5Var = (b5) this.f36363b;
                b5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                b5Var.f36642w = false;
                ng.b bVar = b5Var.h;
                bVar.a((Bitmap) obj2);
                og.d.c(bVar, b5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                i9 i9Var = (i9) this.f36363b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) obj2;
                boolean isEmpty = i9Var.G.isEmpty();
                ArrayList arrayList2 = i9Var.C;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f30344q = true;
                    arrayList.add(c10);
                    if (!i9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.l41 c11 = org.telegram.ui.Components.l41.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f30344q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.l41.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = i9Var.G;
                    int size = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size) {
                        Object obj3 = arrayList3.get(i20);
                        i20++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = i9Var.getMessagesController().getChat(l10)) != null) {
                            m8 m8Var = new m8(i9Var, 0);
                            int i21 = g9.f38473a;
                            org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(g9.class);
                            J.G = chat;
                            J.D = m8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.l41.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList2.get(i14);
                        i14++;
                        e9 e9Var = (e9) obj4;
                        mh.k3 k3Var = new mh.k3(14, i9Var, e9Var);
                        int i22 = c9.f37097a;
                        org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(c9.class);
                        J2.G = e9Var;
                        J2.D = k3Var;
                        J2.K(i9Var.k0(e9Var.f37858c));
                        arrayList.add(J2);
                    }
                    if (!i9Var.F) {
                        arrayList.add(org.telegram.ui.Components.l41.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.l41.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.l41.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                fe feVar = (fe) this.f36363b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var2 = (org.telegram.ui.Components.z41) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(feVar.f38238u0).getChat(Long.valueOf(-feVar.f38239v0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(feVar.f38238u0).getChatFull(-feVar.f38239v0);
                if (chatFull != null) {
                    i9 = chatFull.stats_dc;
                } else {
                    i9 = -1;
                }
                if (feVar.f38219b1) {
                    arrayList4.add(org.telegram.ui.Components.l41.g(feVar.f38242y0));
                    e91 e91Var2 = feVar.f38228k1;
                    if (e91Var2 != null && !e91Var2.f37878l) {
                        arrayList4.add(org.telegram.ui.Components.l41.h(5, i9, e91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.l41.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    e91 e91Var3 = feVar.l1;
                    if (e91Var3 != null && !e91Var3.f37878l) {
                        arrayList4.add(org.telegram.ui.Components.l41.h(2, i9, e91Var3));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-2, charSequence));
                    }
                }
                if (feVar.f38220c1 && (e91Var = feVar.f38229m1) != null && !e91Var.f37878l) {
                    arrayList4.add(org.telegram.ui.Components.l41.h(2, i9, e91Var));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-3, null));
                }
                if (feVar.f38230n1) {
                    arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.f38231o1));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.f38232p1));
                    arrayList4.add(org.telegram.ui.Components.l41.u(feVar.f38233q1));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-4, feVar.A0));
                }
                if (chat2 != null && chat2.creator) {
                    if (feVar.f38219b1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.l41.k(feVar.C0));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-5, feVar.f38243z0));
                        int i23 = MessagesController.getInstance(feVar.f38238u0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (feVar.f38241x0 < i23) {
                            i10 = i23;
                        } else {
                            i10 = 0;
                        }
                        if (i10 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(0, new lo0(i10, context, null, false));
                            eqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.l41 i24 = org.telegram.ui.Components.l41.i(1, string);
                        if (feVar.f38241x0 >= i23 && feVar.f38226i1) {
                            z11 = true;
                        }
                        i24.K(z11);
                        arrayList4.add(i24);
                        arrayList4.add(org.telegram.ui.Components.l41.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (feVar.f38220c1) {
                        arrayList4.add(org.telegram.ui.Components.l41.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.l41.j(3, feVar.I0));
                        arrayList4.add(org.telegram.ui.Components.l41.A(-6, feVar.B0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(feVar.f38238u0).getChat(Long.valueOf(-feVar.f38239v0))) && MessagesController.getInstance(feVar.f38238u0).starrefConnectAllowed) {
                    arrayList4.add(mh.h.a(4, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uj, feVar.f38237t0), R.drawable.filled_earn_stars, ho.c0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.l41.A(-7, null));
                }
                if (feVar.f38218a1.a()) {
                    arrayList4.add(org.telegram.ui.Components.l41.p(feVar.f38218a1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.l41.A(-10, null));
                    return;
                }
            case 3:
                zd zdVar = (zd) this.f36363b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var3 = (org.telegram.ui.Components.z41) obj2;
                be beVar = zdVar.f45116f;
                int i25 = zdVar.d;
                if (i25 == 0) {
                    ArrayList arrayList6 = beVar.f36836n;
                    int size3 = arrayList6.size();
                    while (i18 < size3) {
                        Object obj5 = arrayList6.get(i18);
                        i18++;
                        int i26 = gh.ia.f8310a;
                        org.telegram.ui.Components.l41 J3 = org.telegram.ui.Components.l41.J(gh.ia.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f30344q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(beVar.f36837r)) {
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i25 == 1) {
                    ArrayList arrayList7 = beVar.h;
                    int size4 = arrayList7.size();
                    while (i19 < size4) {
                        Object obj6 = arrayList7.get(i19);
                        i19++;
                        int i27 = gh.ia.f8310a;
                        org.telegram.ui.Components.l41 J4 = org.telegram.ui.Components.l41.J(gh.ia.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f30344q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(beVar.f36835f)) {
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.l41.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ho hoVar = (ho) this.f36363b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    hoVar.getClass();
                    org.telegram.ui.Components.oc.a0(hoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(hoVar.f38846g0);
                AndroidUtilities.removeFromParent(hoVar.f38841d0);
                AndroidUtilities.removeFromParent(hoVar.f38845f0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new cq((jr) this.f36363b, 1), 1000L);
                return;
            case 6:
                ((g5.b) this.f36363b).r(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                is isVar = (is) this.f36363b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var4 = (org.telegram.ui.Components.z41) obj2;
                TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.R));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.f39270b));
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.f39271c));
                if (TextUtils.isEmpty(isVar.b0())) {
                    arrayList8.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (isVar.G) {
                    arrayList8.add(org.telegram.ui.Components.l41.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.l41.B(null));
                }
                if (isVar.E && isVar.G) {
                    org.telegram.ui.Components.l41 i28 = org.telegram.ui.Components.l41.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i28.K(isVar.T);
                    arrayList8.add(i28);
                    arrayList8.add(org.telegram.ui.Components.l41.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.l41.k(isVar.d));
                org.telegram.ui.Cells.j2.y(R.string.AddNotesInfo, arrayList8);
                if (!isVar.E) {
                    TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.l41.k(isVar.B));
                    }
                    arrayList8.add(org.telegram.ui.Components.l41.k(isVar.f39278x));
                    arrayList8.add(org.telegram.ui.Components.l41.k(isVar.f39279y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.l41.k(isVar.A));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.l41.B(null));
                    org.telegram.ui.Components.l41 e10 = org.telegram.ui.Components.l41.e(1, LocaleController.getString(R.string.DeleteContact));
                    e10.f30345r = true;
                    arrayList8.add(e10);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.l41.B(charSequence2));
                if (isVar.U) {
                    AndroidUtilities.runOnUIThread(new zr(isVar, user, 0));
                    isVar.U = false;
                    AndroidUtilities.runOnUIThread(new as(isVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                ht.a((ht) this.f36363b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                dt dtVar = (dt) this.f36363b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                ht htVar = dtVar.f37593a;
                ft ftVar = htVar.f38923l;
                if (ftVar != null) {
                    String join = TextUtils.join("", htVar.f38926o);
                    if (callback != null) {
                        dfVar = new df(26, dtVar, callback);
                    } else {
                        dfVar = null;
                    }
                    ftVar.F(charSequence3, join, dfVar);
                    if (callback == null) {
                        htVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.z41 z41Var5 = (org.telegram.ui.Components.z41) obj2;
                st.Q((st) this.f36363b, (ArrayList) obj);
                return;
            case 11:
                dy dyVar = (dy) this.f36363b;
                Long l11 = (Long) obj2;
                dyVar.L1 = (Long) obj;
                dyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f36363b).run();
                return;
            case 13:
                final vy vyVar = (vy) this.f36363b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var6 = (org.telegram.ui.Components.z41) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i29 = R.raw.topics_top;
                org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(2);
                l41Var.f30339l = string2;
                l41Var.f30338k = i29;
                arrayList9.add(l41Var);
                org.telegram.ui.Components.l41 i30 = org.telegram.ui.Components.l41.i(1, LocaleController.getString(R.string.TopicsEnable));
                i30.K(vyVar.f43609c);
                arrayList9.add(i30);
                if (vyVar.f43609c) {
                    arrayList9.add(org.telegram.ui.Components.l41.B(null));
                    arrayList9.add(org.telegram.ui.Components.l41.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    vy vyVar2 = vyVar;
                                    vyVar2.d = true;
                                    ((uy) view.getParent()).a(true, true);
                                    bg.y0 y0Var = vyVar2.f43611f;
                                    if (y0Var != null) {
                                        y0Var.run(Boolean.valueOf(vyVar2.f43609c), Boolean.valueOf(vyVar2.d));
                                    }
                                    vyVar2.T();
                                    return;
                                default:
                                    vy vyVar3 = vyVar;
                                    vyVar3.d = false;
                                    ((uy) view.getParent()).a(false, true);
                                    bg.y0 y0Var2 = vyVar3.f43611f;
                                    if (y0Var2 != null) {
                                        y0Var2.run(Boolean.valueOf(vyVar3.f43609c), Boolean.valueOf(vyVar3.d));
                                    }
                                    vyVar3.T();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    vy vyVar2 = vyVar;
                                    vyVar2.d = true;
                                    ((uy) view.getParent()).a(true, true);
                                    bg.y0 y0Var = vyVar2.f43611f;
                                    if (y0Var != null) {
                                        y0Var.run(Boolean.valueOf(vyVar2.f43609c), Boolean.valueOf(vyVar2.d));
                                    }
                                    vyVar2.T();
                                    return;
                                default:
                                    vy vyVar3 = vyVar;
                                    vyVar3.d = false;
                                    ((uy) view.getParent()).a(false, true);
                                    bg.y0 y0Var2 = vyVar3.f43611f;
                                    if (y0Var2 != null) {
                                        y0Var2.run(Boolean.valueOf(vyVar3.f43609c), Boolean.valueOf(vyVar3.d));
                                    }
                                    vyVar3.T();
                                    return;
                            }
                        }
                    };
                    int i31 = ty.f43084a;
                    org.telegram.ui.Components.l41 J5 = org.telegram.ui.Components.l41.J(ty.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(vyVar.d);
                    arrayList9.add(J5);
                    org.telegram.ui.Cells.j2.y(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                kb0 kb0Var = (kb0) this.f36363b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                kb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(kb0Var.f39791b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.l0.p(R.string.AIEditorStyleNotFound, kb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        kb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                iv0 iv0Var = (iv0) this.f36363b;
                ng.b bVar2 = iv0Var.B;
                Bitmap bitmap = (Bitmap) obj2;
                iv0Var.f39305s = (Bitmap) obj;
                Paint paint = new Paint(1);
                iv0Var.f39306w = paint;
                Bitmap bitmap2 = iv0Var.f39305s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                iv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f10 = 0.05f;
                } else {
                    f10 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f10);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                iv0Var.f39306w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                iv0Var.f39307x = new Matrix();
                bVar2.a(bitmap);
                og.d.c(bVar2, iv0Var.f39299c);
                iv0Var.C.d();
                return;
            case 16:
                pv0 pv0Var = (pv0) this.f36363b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var7 = (org.telegram.ui.Components.z41) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i32 = R.raw.bubble;
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(2);
                l41Var2.f30339l = string3;
                l41Var2.f30338k = i32;
                arrayList10.add(l41Var2);
                org.telegram.ui.Components.l41 i33 = org.telegram.ui.Components.l41.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i33.K(pv0Var.f41603r);
                arrayList10.add(i33);
                arrayList10.add(org.telegram.ui.Components.l41.A(2, null));
                if (pv0Var.f41603r) {
                    org.telegram.ui.Cells.j2.l(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) pv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    fk0 fk0Var = new fk0(5);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f25909c = a2;
                    w7Var.d = 20;
                    w7Var.f25910e = fk0Var;
                    pv0Var.f41598b.d((int) Utilities.clamp(pv0Var.f41604s, 10000L, 0L), w7Var, new w3(pv0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.l41.j(3, pv0Var.f41598b));
                    if (pv0Var.f41604s > 0) {
                        str = pv0Var.V();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.l41.A(4, str));
                    TLRPC.Chat chat3 = pv0Var.getMessagesController().getChat(Long.valueOf(pv0Var.f41597a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        pv0Var.f41599c.setLink(pv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        org.telegram.ui.Cells.j2.l(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.l41.j(5, pv0Var.f41599c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36363b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f35910e = passkeys.passkeys;
                    privacySettingsActivity.z0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f36363b;
                Bitmap bitmap3 = (Bitmap) obj;
                ng.b bVar3 = profileActivity.f36003l6;
                bVar3.a((Bitmap) obj2);
                og.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.f36009m6.d();
                return;
            case 19:
                x21 x21Var = (x21) this.f36363b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var8 = (org.telegram.ui.Components.z41) obj2;
                org.telegram.ui.Components.i51 i51Var = x21Var.f44340f;
                y21 y21Var = x21Var.v;
                ArrayList arrayList12 = y21Var.h;
                bh.g gVar = x21Var.h;
                if (gVar.getMeasuredHeight() <= 0) {
                    gVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.l41 C = org.telegram.ui.Components.l41.C(gVar.getMeasuredHeight());
                C.d = -1;
                C.f30346s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((gVar.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = x21Var.f44337b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.f44338c != null || x21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || x21Var.f44338c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(x21Var.getContext(), org.telegram.ui.ActionBar.f6.L6, 21, 0, 0, false, false, y21.u(y21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = x21Var.f44337b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = x21Var.f44338c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
                        org.telegram.ui.Components.l41 k10 = org.telegram.ui.Components.l41.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (x21Var.f44337b != null) {
                        for (int i34 = 0; i34 < x21Var.f44337b.options.size(); i34++) {
                            org.telegram.ui.Components.l41 l41Var3 = new org.telegram.ui.Components.l41(30);
                            l41Var3.f30339l = x21Var.f44337b.options.get(i34).text;
                            l41Var3.f30338k = R.drawable.msg_arrowright;
                            l41Var3.d = i34;
                            arrayList11.add(l41Var3);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.f44338c != null) {
                        for (int i35 = 0; i35 < x21Var.f44338c.options.size(); i35++) {
                            org.telegram.ui.Components.l41 l41Var4 = new org.telegram.ui.Components.l41(30);
                            l41Var4.f30339l = x21Var.f44338c.options.get(i35).text;
                            l41Var4.f30338k = R.drawable.msg_arrowright;
                            l41Var4.d = i35;
                            arrayList11.add(l41Var4);
                            measuredHeight += 50;
                        }
                    } else if (x21Var.d != null) {
                        if (x21Var.f44341n == null) {
                            v21 v21Var = new v21(x21Var, x21Var.getContext(), y21.v(y21Var));
                            x21Var.f44341n = v21Var;
                            v21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = x21Var.f44341n.f24544b;
                        if (x21Var.d.optional) {
                            i11 = R.string.Report2CommentOptional;
                        } else {
                            i11 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i11));
                        org.telegram.ui.Components.l41 k11 = org.telegram.ui.Components.l41.k(x21Var.f44341n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = y21Var.f44696r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i12 = R.string.Report2CommentInfoMany;
                            } else {
                                i12 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i12 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(y21.w(y21Var)).getChat(Long.valueOf(-j11)))) {
                            i12 = R.string.Report2CommentInfoChannel;
                        } else {
                            i12 = R.string.Report2CommentInfoGroup;
                        }
                        org.telegram.ui.Cells.j2.y(i12, arrayList11);
                        if (x21Var.f44342r == null) {
                            kh.d dVar = new kh.d(x21Var.getContext(), y21.x(y21Var), true);
                            x21Var.f44343s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(x21Var.getContext());
                            x21Var.f44342r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, y21.y(y21Var)));
                            x21Var.f44342r.addView(x21Var.f44343s, g7.e6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(x21Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, y21.z(y21Var)));
                            x21Var.f44342r.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        kh.d dVar2 = x21Var.f44343s;
                        if (!x21Var.d.optional && TextUtils.isEmpty(x21Var.f44341n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        x21Var.f44343s.setOnClickListener(new q50(x21Var, 29));
                        org.telegram.ui.Components.l41 k12 = org.telegram.ui.Components.l41.k(x21Var.f44342r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.l41) j3.r0.j(1, arrayList11)).f30337j = true;
                    if (y21Var.d && x21Var.f44336a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(x21Var.getContext());
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7)), org.telegram.ui.ActionBar.f6.U0(x21Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22966b7, y21.A(y21Var))), 0, 0);
                        fqVar.f28550w = true;
                        frameLayout2.setBackground(fqVar);
                        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(x21Var.getContext(), null);
                        l80Var.setTextSize(1, 14.0f);
                        l80Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), y21.C(y21Var)));
                        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, y21.E(y21Var)));
                        l80Var.setGravity(17);
                        frameLayout2.addView(l80Var, g7.e6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.l41 k13 = org.telegram.ui.Components.l41.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (i51Var != null) {
                    if (y21.F(y21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        i51Var.T2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    i51Var.T2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.z41 z41Var9 = (org.telegram.ui.Components.z41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((d31) this.f36363b).T));
                return;
            case 21:
                org.telegram.ui.Components.z41 z41Var10 = (org.telegram.ui.Components.z41) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.l41.k(((n31) this.f36363b).T));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f36363b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.z41 z41Var11 = (org.telegram.ui.Components.z41) obj2;
                l61.P((l61) this.f36363b, (ArrayList) obj);
                return;
            case 24:
                k61 k61Var = (k61) this.f36363b;
                ArrayList arrayList13 = k61Var.f39755e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i36 = k61Var.f39752a;
                ArrayList arrayList14 = k61Var.d;
                if (tL_error5 != null) {
                    if (k61Var.f39758r) {
                        arrayList14.clear();
                        k61Var.f39758r = false;
                    }
                    k61Var.h = true;
                    k61Var.f39756f = false;
                    int size5 = arrayList13.size();
                    while (i16 < size5) {
                        Object obj7 = arrayList13.get(i16);
                        i16++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i36).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i36).putChats(channels_channelparticipants.chats, false);
                if (k61Var.f39758r) {
                    arrayList14.clear();
                    k61Var.f39758r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i37 = 0;
                while (i37 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i37);
                    i37++;
                    TLObject userOrChat = MessagesController.getInstance(i36).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    k61Var.h = true;
                }
                k61Var.f39756f = false;
                int size7 = arrayList13.size();
                while (i17 < size7) {
                    Object obj8 = arrayList13.get(i17);
                    i17++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                o61 o61Var = (o61) this.f36363b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var12 = (org.telegram.ui.Components.z41) obj2;
                int i38 = o61Var.X;
                ih.n6 n6Var = o61Var.V;
                if (n6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.l41.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = n6Var.f11851i;
                    int size8 = arrayList17.size();
                    int i39 = i38;
                    int i40 = 0;
                    while (i40 < size8) {
                        Object obj9 = arrayList17.get(i40);
                        i40++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i41 = z91.f45093b;
                        org.telegram.ui.Components.l41 J6 = org.telegram.ui.Components.l41.J(z91.class);
                        J6.f30348u = 1;
                        J6.f30352z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f22617id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f30334f = true;
                        J6.v = i38;
                        J6.K(o61Var.W.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f30348u = 1;
                        arrayList16.add(J6);
                        i39--;
                        if (i39 == 0) {
                            i39 = i38;
                        }
                    }
                    if (n6Var.k() || !n6Var.f11860r) {
                        while (true) {
                            if (i39 <= 0) {
                                i13 = i38;
                            } else {
                                i13 = i39;
                            }
                            if (i15 < i13) {
                                i15++;
                                org.telegram.ui.Components.l41 o6 = org.telegram.ui.Components.l41.o(i15, 34);
                                o6.f30348u = 1;
                                arrayList16.add(o6);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.l41.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.z41 z41Var13 = (org.telegram.ui.Components.z41) obj2;
                z71.Z((z71) this.f36363b, (ArrayList) obj);
                return;
            case 27:
                k81 k81Var = (k81) this.f36363b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.z41 z41Var14 = (org.telegram.ui.Components.z41) obj2;
                LinearLayout linearLayout = k81Var.U;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.l41.k(linearLayout));
                }
                LinearLayout linearLayout2 = k81Var.V;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.l41.k(linearLayout2));
                    return;
                }
                return;
            default:
                dd1 dd1Var = (dd1) this.f36363b;
                ng.b bVar4 = dd1Var.A;
                Bitmap bitmap4 = (Bitmap) obj2;
                dd1Var.f37510r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                dd1Var.v = paint2;
                Bitmap bitmap5 = dd1Var.f37510r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                dd1Var.f37511s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f12 = 0.05f;
                } else {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    f13 = -0.02f;
                } else {
                    f13 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f13);
                dd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                dd1Var.f37512w = new Matrix();
                bVar4.a(bitmap4);
                og.d.c(bVar4, dd1Var.f37505b);
                dd1Var.B.d();
                return;
        }
    }
}
