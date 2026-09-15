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
    public final int f32050a;
    public final Object f32051b;

    public b5(Object obj, int i10) {
        this.f32050a = i10;
        this.f32051b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ka1 ka1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        nf nfVar;
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
        switch (this.f32050a) {
            case 0:
                c5 c5Var = (c5) this.f32051b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f32669w = false;
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
                k9 k9Var = (k9) this.f32051b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f24899q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c11 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f24899q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, 0);
                            int i22 = i9.f34530a;
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
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        g9 g9Var = (g9) obj4;
                        ai.f2 f2Var = new ai.f2(27, k9Var, g9Var);
                        int i23 = e9.f33275a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = f2Var;
                        J2.K(k9Var.l0(g9Var.f33847c));
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
                je jeVar = (je) this.f32051b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var2 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.f34884y0).getChat(Long.valueOf(-jeVar.f34885z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.f34884y0).getChatFull(-jeVar.f34885z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (jeVar.f34865f1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(jeVar.C0));
                    ka1 ka1Var2 = jeVar.f34873o1;
                    if (ka1Var2 != null && !ka1Var2.f35101l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i10, ka1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ka1 ka1Var3 = jeVar.f34874p1;
                    if (ka1Var3 != null && !ka1Var3.f35101l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, ka1Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (jeVar.f34866g1 && (ka1Var = jeVar.f34875q1) != null && !ka1Var.f35101l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, ka1Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (jeVar.f34876r1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34877s1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34878t1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(jeVar.f34879u1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f34865f1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, jeVar.D0));
                        int i24 = MessagesController.getInstance(jeVar.f34884y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (jeVar.B0 < i24) {
                            i11 = i24;
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
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (jeVar.B0 >= i24 && jeVar.f34871m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.f34866g1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.f34884y0).getChat(Long.valueOf(-jeVar.f34885z0))) && MessagesController.getInstance(jeVar.f34884y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, jeVar.f34883x0), R.drawable.filled_earn_stars, wo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (jeVar.f34864e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(jeVar.f34864e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    return;
                }
            case 3:
                de deVar = (de) this.f32051b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var3 = (org.telegram.ui.Components.w51) obj2;
                fe feVar = deVar.f32999f;
                int i26 = deVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = feVar.f33550n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.r7.f47733a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(yh.r7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f24899q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.f33551r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.r7.f47733a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(yh.r7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f24899q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f33549f)) {
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
                wo woVar = (wo) this.f32051b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    woVar.getClass();
                    org.telegram.ui.Components.vc.a0(woVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(woVar.f39283k0);
                AndroidUtilities.removeFromParent(woVar.f39280h0);
                AndroidUtilities.removeFromParent(woVar.f39282j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new qq((ur) this.f32051b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32051b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ss ssVar = (ss) this.f32051b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var4 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.V));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37438b));
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37439c));
                if (TextUtils.isEmpty(ssVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (ssVar.K) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (ssVar.I && ssVar.K) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(ssVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (!ssVar.I) {
                    TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37445x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.f37446y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(ssVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f24900r = true;
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
                st.a((st) this.f32051b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                ot otVar = (ot) this.f32051b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                st stVar = otVar.f36336a;
                qt qtVar = stVar.f37464l;
                if (qtVar != null) {
                    String join = TextUtils.join("", stVar.f37467o);
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
                cu.R((cu) this.f32051b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f32051b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32051b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f32051b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var6 = (org.telegram.ui.Components.w51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f24894l = string2;
                i51Var.f24893k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(mzVar.f35843c);
                arrayList9.add(i31);
                if (mzVar.f35843c) {
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
                                    ai.m0 m0Var = mzVar2.f35844f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35843c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35844f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35843c), Boolean.valueOf(mzVar3.d));
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
                                    ai.m0 m0Var = mzVar2.f35844f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f35843c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.U();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f35844f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f35843c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = kz.f35289a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(kz.class);
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
                fc0 fc0Var = (fc0) this.f32051b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                fc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.f33535b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.w1.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        fc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                mw0 mw0Var = (mw0) this.f32051b;
                fh.b bVar2 = mw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                mw0Var.f35830s = (Bitmap) obj;
                Paint paint = new Paint(1);
                mw0Var.f35831w = paint;
                Bitmap bitmap2 = mw0Var.f35830s;
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
                mw0Var.f35831w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                mw0Var.f35832x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, mw0Var.f35821c);
                mw0Var.G.d();
                return;
            case 16:
                tw0 tw0Var = (tw0) this.f32051b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var7 = (org.telegram.ui.Components.w51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.f24894l = string3;
                i51Var2.f24893k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(tw0Var.f37798r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (tw0Var.f37798r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    zr0 zr0Var = new zr0(3);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f21663c = a2;
                    y7Var.d = 20;
                    y7Var.e = zr0Var;
                    tw0Var.f37794b.d((int) Utilities.clamp(tw0Var.f37799s, 10000L, 0L), y7Var, new s3(tw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, tw0Var.f37794b));
                    if (tw0Var.f37799s > 0) {
                        str = tw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, str));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.f37793a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.f37795c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, tw0Var.f37795c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32051b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32051b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31348p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                a41 a41Var = (a41) this.f32051b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var8 = (org.telegram.ui.Components.w51) obj2;
                org.telegram.ui.Components.e61 e61Var = a41Var.f31692f;
                b41 b41Var = a41Var.v;
                ArrayList arrayList12 = b41Var.h;
                t5 t5Var = a41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f24901s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = a41Var.f31690b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f31691c != null || a41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || a41Var.f31691c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(a41Var.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 0, 0, false, false, b41.u(b41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = a41Var.f31690b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = a41Var.f31691c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(b41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18907h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (a41Var.f31690b != null) {
                        for (int i35 = 0; i35 < a41Var.f31690b.options.size(); i35++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.f24894l = a41Var.f31690b.options.get(i35).text;
                            i51Var3.f24893k = R.drawable.msg_arrowright;
                            i51Var3.d = i35;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.f31691c != null) {
                        for (int i36 = 0; i36 < a41Var.f31691c.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.f24894l = a41Var.f31691c.options.get(i36).text;
                            i51Var4.f24893k = R.drawable.msg_arrowright;
                            i51Var4.d = i36;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (a41Var.d != null) {
                        if (a41Var.f31693n == null) {
                            z31 z31Var = new z31(a41Var, a41Var.getContext(), b41.v(b41Var));
                            a41Var.f31693n = z31Var;
                            z31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = a41Var.f31693n.f20229b;
                        if (a41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(a41Var.f31693n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = b41Var.f32048r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(b41.w(b41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i13, arrayList11);
                        if (a41Var.f31694r == null) {
                            ci.d dVar = new ci.d(a41Var.getContext(), b41.x(b41Var), true);
                            a41Var.f31695s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(a41Var.getContext());
                            a41Var.f31694r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18907h5, b41.y(b41Var)));
                            a41Var.f31694r.addView(a41Var.f31695s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(a41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18837d7, b41.z(b41Var)));
                            a41Var.f31694r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = a41Var.f31695s;
                        if (!a41Var.d.optional && TextUtils.isEmpty(a41Var.f31693n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        a41Var.f31695s.setOnClickListener(new k60(a41Var, 28));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(a41Var.f31694r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) hg.k0.h(1, arrayList11)).f24892j = true;
                    if (b41Var.d && a41Var.f31689a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(a41Var.getContext());
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(b41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7)), org.telegram.ui.ActionBar.i6.U0(a41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18800b7, b41.A(b41Var))), 0, 0);
                        pqVar.f27125w = true;
                        frameLayout2.setBackground(pqVar);
                        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(a41Var.getContext(), null);
                        c90Var.setTextSize(1, 14.0f);
                        c90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), b41.B(b41Var)));
                        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, b41.F(b41Var)));
                        c90Var.setGravity(17);
                        frameLayout2.addView(c90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e61Var != null) {
                    if (b41.G(b41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
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
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((h41) this.f32051b).X));
                return;
            case 21:
                org.telegram.ui.Components.w51 w51Var10 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((r41) this.f32051b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32051b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w51 w51Var11 = (org.telegram.ui.Components.w51) obj2;
                q71.Q((q71) this.f32051b, (ArrayList) obj);
                return;
            case 24:
                p71 p71Var = (p71) this.f32051b;
                ArrayList arrayList13 = p71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = p71Var.f36456a;
                ArrayList arrayList14 = p71Var.d;
                if (tL_error5 != null) {
                    if (p71Var.f36461r) {
                        arrayList14.clear();
                        p71Var.f36461r = false;
                    }
                    p71Var.h = true;
                    p71Var.f36459f = false;
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
                if (p71Var.f36461r) {
                    arrayList14.clear();
                    p71Var.f36461r = false;
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
                    p71Var.h = true;
                }
                p71Var.f36459f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                t71 t71Var = (t71) this.f32051b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var12 = (org.telegram.ui.Components.w51) obj2;
                int i39 = t71Var.f37582b0;
                ai.d9 d9Var = t71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f716i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = fb1.f33530b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(fb1.class);
                        J6.f24903u = 1;
                        J6.f24907z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18348id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f24889f = true;
                        J6.v = i39;
                        J6.K(t71Var.f37581a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f24903u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.f725r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.i51 o9 = org.telegram.ui.Components.i51.o(i16, 34);
                                o9.f24903u = 1;
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
                e91.b0((e91) this.f32051b, (ArrayList) obj);
                return;
            case 27:
                q91 q91Var = (q91) this.f32051b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var14 = (org.telegram.ui.Components.w51) obj2;
                LinearLayout linearLayout = q91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = q91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    return;
                }
                return;
            default:
                ke1 ke1Var = (ke1) this.f32051b;
                fh.b bVar4 = ke1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ke1Var.f35135r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ke1Var.v = paint2;
                Bitmap bitmap5 = ke1Var.f35135r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ke1Var.f35136s = bitmapShader2;
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
                ke1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ke1Var.f35137w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, ke1Var.f35127b);
                ke1Var.F.d();
                return;
        }
    }
}
