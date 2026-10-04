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
public final class c5 implements Utilities.Callback2 {
    public final int f35278a;
    public final Object f35279b;

    public c5(Object obj, int i10) {
        this.f35278a = i10;
        this.f35279b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ha1 ha1Var;
        CharSequence charSequence;
        ArrayList arrayList;
        String str;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ft ftVar;
        float f7;
        String str2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        boolean z11 = true;
        int i15 = 0;
        switch (this.f35278a) {
            case 0:
                d5 d5Var = (d5) this.f35279b;
                d5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.f35647w = false;
                fh.b bVar = d5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, d5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f35279b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj2;
                boolean isEmpty = m9Var.J.isEmpty();
                ArrayList arrayList3 = m9Var.F;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.g61 c10 = org.telegram.ui.Components.g61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26674q = true;
                    arrayList2.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.g61 c11 = org.telegram.ui.Components.g61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26674q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.g61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = m9Var.J;
                    int size = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList4.get(i16);
                        i16++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, 0);
                            int i17 = k9.f37891a;
                            org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList2.add(J);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.g61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i18 = g9.f36533a;
                        org.telegram.ui.Components.g61 J2 = org.telegram.ui.Components.g61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = f2Var;
                        J2.K(m9Var.f0(i9Var.f37317c));
                        arrayList2.add(J2);
                    }
                    if (!m9Var.I) {
                        arrayList2.add(org.telegram.ui.Components.g61.p(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.g61.p(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.g61.p(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                me meVar = (me) this.f35279b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var2 = (org.telegram.ui.Components.u61) obj2;
                meVar.U1 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.f38562r1).getChat(Long.valueOf(-meVar.f38564s1));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.f38562r1).getChatFull(-meVar.f38564s1);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (meVar.f38547e2) {
                    arrayList5.add(org.telegram.ui.Components.g61.g(meVar.f38570v1));
                    ha1 ha1Var2 = meVar.f38557o2;
                    if (ha1Var2 != null && !ha1Var2.f37025l) {
                        arrayList5.add(org.telegram.ui.Components.g61.h(5, i10, ha1Var2));
                        charSequence = null;
                        arrayList5.add(org.telegram.ui.Components.g61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ha1 ha1Var3 = meVar.f38559p2;
                    if (ha1Var3 != null && !ha1Var3.f37025l) {
                        arrayList5.add(org.telegram.ui.Components.g61.h(2, i10, ha1Var3));
                        arrayList5.add(org.telegram.ui.Components.g61.A(-2, charSequence));
                    }
                }
                if (meVar.f38548f2 && (ha1Var = meVar.f38561q2) != null && !ha1Var.f37025l) {
                    arrayList5.add(org.telegram.ui.Components.g61.h(2, i10, ha1Var));
                    arrayList5.add(org.telegram.ui.Components.g61.A(-3, null));
                }
                if (meVar.f38563r2) {
                    arrayList5.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList5.add(org.telegram.ui.Components.g61.u(meVar.f38565s2));
                    arrayList5.add(org.telegram.ui.Components.g61.u(meVar.f38567t2));
                    arrayList5.add(org.telegram.ui.Components.g61.u(meVar.f38569u2));
                    arrayList5.add(org.telegram.ui.Components.g61.A(-4, meVar.f38573x1));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.f38547e2) {
                        arrayList5.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList5.add(org.telegram.ui.Components.g61.k(meVar.f38575z1));
                        arrayList5.add(org.telegram.ui.Components.g61.A(-5, meVar.f38572w1));
                        int i19 = MessagesController.getInstance(meVar.f38562r1).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (meVar.f38568u1 < i19) {
                            i11 = i19;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(0, new fp0(i11, context, null, false));
                            rqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(rqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.g61 i20 = org.telegram.ui.Components.g61.i(1, string);
                        i20.K((meVar.f38568u1 < i19 || !meVar.f38555m2) ? false : false);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.g61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.f38548f2) {
                        arrayList5.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList5.add(org.telegram.ui.Components.g61.j(3, meVar.F1));
                        arrayList5.add(org.telegram.ui.Components.g61.A(-6, meVar.f38574y1));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.f38562r1).getChat(Long.valueOf(-meVar.f38564s1))) && MessagesController.getInstance(meVar.f38562r1).starrefConnectAllowed) {
                    arrayList5.add(ei.i.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, meVar.f38560q1), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList5.add(org.telegram.ui.Components.g61.A(-7, null));
                }
                if (meVar.f38546d2.a()) {
                    meVar.U1 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.g61.l(-2, meVar.W1));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.g61.A(-10, null));
                return;
            case 3:
                ge geVar = (ge) this.f35279b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var3 = (org.telegram.ui.Components.u61) obj2;
                ie ieVar = geVar.f36602f;
                int i21 = geVar.d;
                int i22 = ie.f37399x;
                if (i21 == 0) {
                    arrayList = ieVar.f37406r;
                } else {
                    arrayList = ieVar.f37405n;
                }
                int size3 = arrayList.size();
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    int i23 = yh.q7.f51871a;
                    org.telegram.ui.Components.g61 J3 = org.telegram.ui.Components.g61.J(yh.q7.class);
                    J3.G = (TL_stars.StarsTransaction) obj5;
                    J3.f26674q = true;
                    arrayList6.add(J3);
                }
                if (i21 == 0) {
                    str = ieVar.f37407s;
                } else {
                    str = ieVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.g61.p(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.g61.p(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.g61.p(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                to toVar = (to) this.f35279b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    toVar.getClass();
                    org.telegram.ui.Components.yc.a0(toVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(toVar.f40897k0);
                AndroidUtilities.removeFromParent(toVar.f40894h0);
                AndroidUtilities.removeFromParent(toVar.f40896j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new nq((rr) this.f35279b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f35279b).J(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qs qsVar = (qs) this.f35279b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var4 = (org.telegram.ui.Components.u61) obj2;
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.V));
                arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.f39804b));
                arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.f39805c));
                if (TextUtils.isEmpty(qsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (qsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.g61.B(null));
                }
                if (qsVar.I && qsVar.K) {
                    org.telegram.ui.Components.g61 i24 = org.telegram.ui.Components.g61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i24.K(qsVar.X);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.g61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList7);
                if (!qsVar.I) {
                    TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.f39812x));
                    arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.f39813y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.g61.k(qsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.g61.B(null));
                    org.telegram.ui.Components.g61 e7 = org.telegram.ui.Components.g61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f26675r = true;
                    arrayList7.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList7.add(org.telegram.ui.Components.g61.B(charSequence2));
                if (qsVar.Y) {
                    AndroidUtilities.runOnUIThread(new hs(qsVar, user, 0));
                    qsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new is(qsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                rt.a((rt) this.f35279b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                nt ntVar = (nt) this.f35279b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                rt rtVar = ntVar.f39037a;
                pt ptVar = rtVar.f40272l;
                if (ptVar != null) {
                    String join = TextUtils.join("", rtVar.f40275o);
                    if (callback != null) {
                        ftVar = new ft(1, ntVar, callback);
                    } else {
                        ftVar = null;
                    }
                    ptVar.f(charSequence3, join, ftVar);
                    if (callback == null) {
                        rtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.u61 u61Var5 = (org.telegram.ui.Components.u61) obj2;
                du.P((du) this.f35279b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f35279b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.d5();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f35279b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f35279b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var6 = (org.telegram.ui.Components.u61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i25 = R.raw.topics_top;
                org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(2);
                g61Var.f26669l = string2;
                g61Var.f26668k = i25;
                arrayList8.add(g61Var);
                org.telegram.ui.Components.g61 i26 = org.telegram.ui.Components.g61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i26.K(mzVar.f38783c);
                arrayList8.add(i26);
                if (mzVar.f38783c) {
                    arrayList8.add(org.telegram.ui.Components.g61.B(null));
                    arrayList8.add(org.telegram.ui.Components.g61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f38785f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f38783c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.S();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f38785f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f38783c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.S();
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
                                    ai.m0 m0Var = mzVar2.f38785f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f38783c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.S();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f38785f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f38783c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.S();
                                    return;
                            }
                        }
                    };
                    int i27 = kz.f38128a;
                    org.telegram.ui.Components.g61 J4 = org.telegram.ui.Components.g61.J(kz.class);
                    J4.d = 2;
                    J4.G = onClickListener;
                    J4.H = onClickListener2;
                    J4.K(mzVar.d);
                    arrayList8.add(J4);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList8);
                    return;
                }
                return;
            case 14:
                dc0 dc0Var = (dc0) this.f35279b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(dc0Var.f35736b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.f0.p(R.string.AIEditorStyleNotFound, dc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        dc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                gw0 gw0Var = (gw0) this.f35279b;
                fh.b bVar2 = gw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                gw0Var.f36756s = (Bitmap) obj;
                Paint paint = new Paint(1);
                gw0Var.f36757w = paint;
                Bitmap bitmap2 = gw0Var.f36756s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                gw0Var.v = bitmapShader;
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
                gw0Var.f36757w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                gw0Var.f36758x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, gw0Var.f36746c);
                gw0Var.G.d();
                return;
            case 16:
                nw0 nw0Var = (nw0) this.f35279b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var7 = (org.telegram.ui.Components.u61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i28 = R.raw.bubble;
                org.telegram.ui.Components.g61 g61Var2 = new org.telegram.ui.Components.g61(2);
                g61Var2.f26669l = string3;
                g61Var2.f26668k = i28;
                arrayList9.add(g61Var2);
                org.telegram.ui.Components.g61 i29 = org.telegram.ui.Components.g61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i29.K(nw0Var.f39066r);
                arrayList9.add(i29);
                arrayList9.add(org.telegram.ui.Components.g61.A(2, null));
                if (nw0Var.f39066r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) nw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.e1 e1Var = new org.telegram.ui.Components.voip.e1(20);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23773c = a2;
                    y7Var.d = 20;
                    y7Var.f23774e = e1Var;
                    nw0Var.f39061b.d((int) Utilities.clamp(nw0Var.f39067s, 10000L, 0L), y7Var, new t3(nw0Var, 18));
                    arrayList9.add(org.telegram.ui.Components.g61.j(3, nw0Var.f39061b));
                    if (nw0Var.f39067s > 0) {
                        str2 = nw0Var.U();
                    } else {
                        str2 = null;
                    }
                    arrayList9.add(org.telegram.ui.Components.g61.A(4, str2));
                    TLRPC.Chat chat3 = nw0Var.getMessagesController().getChat(Long.valueOf(nw0Var.f39060a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        nw0Var.f39062c.setLink(nw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.g61.j(5, nw0Var.f39062c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35279b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34194e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f35279b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f34313p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                u31 u31Var = (u31) this.f35279b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var8 = (org.telegram.ui.Components.u61) obj2;
                org.telegram.ui.Components.c71 c71Var = u31Var.f41041f;
                v31 v31Var = u31Var.v;
                ArrayList arrayList11 = v31Var.h;
                u5 u5Var = u31Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.g61 C = org.telegram.ui.Components.g61.C(u5Var.getMeasuredHeight());
                C.d = -1;
                C.f26676s = true;
                arrayList10.add(C);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = u31Var.f41038b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || u31Var.f41039c != null || u31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || u31Var.f41039c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(u31Var.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 0, 0, false, false, v31.u(v31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = u31Var.f41038b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = u31Var.f41039c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5));
                        org.telegram.ui.Components.g61 k10 = org.telegram.ui.Components.g61.k(m4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (u31Var.f41038b != null) {
                        for (int i30 = 0; i30 < u31Var.f41038b.options.size(); i30++) {
                            org.telegram.ui.Components.g61 g61Var3 = new org.telegram.ui.Components.g61(30);
                            g61Var3.f26669l = u31Var.f41038b.options.get(i30).text;
                            g61Var3.f26668k = R.drawable.msg_arrowright;
                            g61Var3.d = i30;
                            arrayList10.add(g61Var3);
                            measuredHeight += 50;
                        }
                    } else if (u31Var.f41039c != null) {
                        for (int i31 = 0; i31 < u31Var.f41039c.options.size(); i31++) {
                            org.telegram.ui.Components.g61 g61Var4 = new org.telegram.ui.Components.g61(30);
                            g61Var4.f26669l = u31Var.f41039c.options.get(i31).text;
                            g61Var4.f26668k = R.drawable.msg_arrowright;
                            g61Var4.d = i31;
                            arrayList10.add(g61Var4);
                            measuredHeight += 50;
                        }
                    } else if (u31Var.d != null) {
                        if (u31Var.f41042n == null) {
                            t31 t31Var = new t31(u31Var, u31Var.getContext(), v31.v(v31Var));
                            u31Var.f41042n = t31Var;
                            t31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = u31Var.f41042n.f22307b;
                        if (u31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.g61 k11 = org.telegram.ui.Components.g61.k(u31Var.f41042n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j10 = v31Var.f41547r;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            if (arrayList11.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(v31.w(v31Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i13, arrayList10);
                        if (u31Var.f41043r == null) {
                            ci.d dVar = new ci.d(u31Var.getContext(), v31.x(v31Var), true);
                            u31Var.f41044s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(u31Var.getContext());
                            u31Var.f41043r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h5, v31.y(v31Var)));
                            u31Var.f41043r.addView(u31Var.f41044s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(u31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20819d7, v31.z(v31Var)));
                            u31Var.f41043r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = u31Var.f41044s;
                        if (!u31Var.d.optional && TextUtils.isEmpty(u31Var.f41042n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        u31Var.f41044s.setOnClickListener(new j60(u31Var, 28));
                        org.telegram.ui.Components.g61 k12 = org.telegram.ui.Components.g61.k(u31Var.f41043r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.g61) hg.k0.g(1, arrayList10)).f26667j = true;
                    if (v31Var.d && u31Var.f41037a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(u31Var.getContext());
                        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(v31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20762a7)), org.telegram.ui.ActionBar.i6.U0(u31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20782b7, v31.A(v31Var))), 0, 0);
                        sqVar.f30857w = true;
                        frameLayout2.setBackground(sqVar);
                        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(u31Var.getContext(), null);
                        q90Var.setTextSize(1, 14.0f);
                        q90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), v31.B(v31Var)));
                        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, v31.D(v31Var)));
                        q90Var.setGravity(17);
                        frameLayout2.addView(q90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.g61 k13 = org.telegram.ui.Components.g61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (c71Var != null) {
                    if (v31.E(v31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        c71Var.f25244e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList10);
                    c71Var.f25244e3.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.u61 u61Var9 = (org.telegram.ui.Components.u61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.g61.k(((b41) this.f35279b).X));
                return;
            case 21:
                org.telegram.ui.Components.u61 u61Var10 = (org.telegram.ui.Components.u61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.g61.k(((o41) this.f35279b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35279b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.u61 u61Var11 = (org.telegram.ui.Components.u61) obj2;
                m71.O((m71) this.f35279b, (ArrayList) obj);
                return;
            case 24:
                l71 l71Var = (l71) this.f35279b;
                ArrayList arrayList12 = l71Var.f38187e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i32 = l71Var.f38184a;
                ArrayList arrayList13 = l71Var.d;
                if (tL_error5 != null) {
                    if (l71Var.f38190r) {
                        arrayList13.clear();
                        l71Var.f38190r = false;
                    }
                    l71Var.h = true;
                    l71Var.f38188f = false;
                    int size4 = arrayList12.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList12.get(i15);
                        i15++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                MessagesController.getInstance(i32).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i32).putChats(channels_channelparticipants.chats, false);
                if (l71Var.f38190r) {
                    arrayList13.clear();
                    l71Var.f38190r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList14 = channels_channelparticipants.participants;
                int size5 = arrayList14.size();
                int i33 = 0;
                while (i33 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList14.get(i33);
                    i33++;
                    TLObject userOrChat = MessagesController.getInstance(i32).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList13.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    l71Var.h = true;
                }
                l71Var.f38188f = false;
                int size6 = arrayList12.size();
                while (i15 < size6) {
                    Object obj7 = arrayList12.get(i15);
                    i15++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                p71 p71Var = (p71) this.f35279b;
                ArrayList arrayList15 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var12 = (org.telegram.ui.Components.u61) obj2;
                int i34 = p71Var.f39362b0;
                ai.d9 d9Var = p71Var.Z;
                if (d9Var != null) {
                    arrayList15.add(org.telegram.ui.Components.g61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = d9Var.f789i;
                    int size7 = arrayList16.size();
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj8 = arrayList16.get(i36);
                        i36++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i37 = cb1.f35398b;
                        org.telegram.ui.Components.g61 J5 = org.telegram.ui.Components.g61.J(cb1.class);
                        J5.f26678u = 1;
                        J5.f26682z = 0;
                        J5.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20275id;
                        } else {
                            j3 = -1;
                        }
                        J5.B = j3;
                        J5.f26664f = true;
                        J5.v = i34;
                        J5.K(p71Var.f39361a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J5.f26678u = 1;
                        arrayList15.add(J5);
                        i35--;
                        if (i35 == 0) {
                            i35 = i34;
                        }
                    }
                    if (d9Var.k() || !d9Var.f798r) {
                        while (true) {
                            if (i35 <= 0) {
                                i14 = i34;
                            } else {
                                i14 = i35;
                            }
                            if (i15 < i14) {
                                i15++;
                                org.telegram.ui.Components.g61 p5 = org.telegram.ui.Components.g61.p(i15, 34);
                                p5.f26678u = 1;
                                arrayList15.add(p5);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.g61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.u61 u61Var13 = (org.telegram.ui.Components.u61) obj2;
                a91.e0((a91) this.f35279b, (ArrayList) obj);
                return;
            case 27:
                m91 m91Var = (m91) this.f35279b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.u61 u61Var14 = (org.telegram.ui.Components.u61) obj2;
                LinearLayout linearLayout = m91Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.g61.k(linearLayout));
                }
                LinearLayout linearLayout2 = m91Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.g61.k(linearLayout2));
                    return;
                }
                return;
            default:
                ge1 ge1Var = (ge1) this.f35279b;
                fh.b bVar4 = ge1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ge1Var.f36616r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ge1Var.v = paint2;
                Bitmap bitmap5 = ge1Var.f36616r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ge1Var.f36617s = bitmapShader2;
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
                ge1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ge1Var.f36618w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, ge1Var.f36607b);
                ge1Var.F.d();
                return;
        }
    }
}
