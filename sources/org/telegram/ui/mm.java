package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.UndoView;
public final class mm implements org.telegram.ui.Cells.m1 {
    public final bn f50079a;

    public mm(bn bnVar) {
        this.f50079a = bnVar;
    }

    @Override
    public final void A(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        int i10;
        ej ejVar;
        org.telegram.messenger.fj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f24041c3 = !primaryMessageObject.f24041c3;
            primaryMessageObject.M1 = true;
            bn bnVar = this.f50079a;
            bj bjVar = bnVar.A0;
            if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59208y < 0) {
                for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = bnVar.A0.getChildAt(childCount);
                    bnVar.A0.getClass();
                    i7 = RecyclerView.R(childAt);
                    if (i7 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = bnVar.h9(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
            i7 = -1;
            i10 = 0;
            bnVar.Zc(primaryMessageObject, false);
            hi.u3 u3Var = bnVar.P1;
            if (u3Var != null) {
                u3Var.f(true);
            }
            if (i7 >= 0 && r1Var.getCurrentMessagesGroup() == null) {
                bnVar.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f50079a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        boolean z10 = true;
        if (!kVar.x() && !bnVar.Y9()) {
            if (r1Var != null && r1Var.getMessageObject() != null && r1Var.getMessageObject().r4()) {
                p1(r1Var, 10);
                return;
            }
            if (!org.telegram.messenger.v3.c0(bnVar.f46173e) && !bnVar.fa()) {
                z10 = false;
            }
            n(user, z10);
            return;
        }
        bn.k2(bnVar, r1Var, true, f10, f11);
    }

    @Override
    public final void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        org.telegram.messenger.fj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        bn bnVar = this.f50079a;
        hi.u3 u3Var = bnVar.P1;
        if (u3Var != null) {
            u3Var.f(true);
        }
        if (bnVar.getParentActivity() != null && (messageObject = r1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.gd.E0().f24342y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            hi.u3 u3Var2 = new hi.u3(bnVar.getParentActivity(), 3);
            u3Var2.r(true);
            u3Var2.L = Layout.Alignment.ALIGN_NORMAL;
            u3Var2.d = -1L;
            u3Var2.U = true;
            u3Var2.f15490e = true;
            u3Var2.s(12.0f);
            bnVar.P1 = u3Var2;
            u3Var2.f15506r0 = new ah(6, this, u3Var2);
            u3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750836, str)));
            bnVar.P1.l(bnVar.L);
            bnVar.f46279m1.addView(bnVar.P1, c8.na.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            bnVar.f46279m1.post(new l2.y(this, r1Var, i10, i7, 12));
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, false, z11);
    }

    @Override
    public final org.telegram.ui.Cells.j9 B2() {
        return this.f50079a.f46387u9;
    }

    @Override
    public final void C(org.telegram.ui.Cells.r1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.C(org.telegram.ui.Cells.r1):void");
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.C0(org.telegram.ui.Cells.r1, float, float, boolean):void");
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
        bn.f5(this.f50079a, r1Var);
    }

    @Override
    public final String D(long j3) {
        TLRPC.Peer peer;
        String E0;
        bn bnVar = this.f50079a;
        if (org.telegram.messenger.n10.v(bnVar.f46187f)) {
            return null;
        }
        TLRPC.Chat chat = bnVar.f46173e;
        if (chat != null && !org.telegram.messenger.v3.V(chat) && (E0 = bnVar.getMessagesController().E0(bnVar.f46173e.f28492id, j3)) != null) {
            return E0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = bnVar.f46345r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return org.telegram.messenger.gd.N0(2131743775, null);
    }

    @Override
    public final void F(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Y5();
            messageObject.M1 = true;
            r1Var.H1();
            r1Var.requestLayout();
            this.f50079a.D0.R(messageObject, false, false);
        }
    }

    @Override
    public final boolean F0(org.telegram.messenger.fj fjVar) {
        return !this.f50079a.f46354s.containsKey(fjVar);
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        f(r1Var, z10, false, false);
    }

    @Override
    public final void G0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar = this.f50079a.f46265kd;
        if (bVar != null && bVar.f57546n == r1Var) {
            bVar.f57550x.getClass();
        }
    }

    @Override
    public final void H0() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Components.b6 m10;
        bn bnVar = this.f50079a;
        if (!bnVar.A3 && !org.telegram.messenger.bz.A0 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            hi.u3 u3Var = bnVar.I2;
            if (u3Var == null || !u3Var.W) {
                if (u3Var == null) {
                    int indexOfChild = bnVar.f46279m1.indexOfChild(bnVar.U);
                    if (indexOfChild != -1) {
                        hi.u3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                        bnVar.I2 = E6;
                        E6.d = 10000L;
                        E6.m(bnVar.getParentActivity().getResources().getDrawable(2131232792).mutate());
                        bnVar.I2.v(org.telegram.messenger.gd.N0(2131753759, null));
                    } else {
                        return;
                    }
                }
                int childCount = bnVar.A0.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = bnVar.A0.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && org.telegram.messenger.fj.L4(messageObject.f24073k) && (m10 = r1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !bnVar.I2.W) {
                        ImageReceiver photoImage = r1Var.getPhotoImage();
                        float w92 = bnVar.w9(r1Var, photoImage.M0);
                        float f10 = photoImage.O0;
                        View view = (View) r1Var.getParent();
                        float w93 = bnVar.w9(r1Var, -r1Var.getTop());
                        if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            bnVar.Lb = r1Var;
                            hi.u3 u3Var2 = bnVar.I2;
                            u3Var2.f15506r0 = new af(bnVar, 22);
                            u3Var2.y(bnVar.v9(r1Var, r1Var.getNoSoundIconCenterX()), w92, true);
                            org.telegram.messenger.bz.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z10;
        int i14;
        int i15;
        String str2;
        boolean z11;
        w4 w4Var;
        int i16;
        int i17;
        c5 c5Var;
        vj vjVar;
        uj ujVar;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.v3.K(chat, false));
        bn bnVar = this.f50079a;
        if (!isEmpty && bnVar.f46173e != null && (((vjVar = bnVar.f46162d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        TLRPC.Chat chat2 = bnVar.f46173e;
        if (chat2 != null && ((bnVar.f46359s4 == 0 || bnVar.f46422x4) && (!org.telegram.messenger.v3.T(chat2) || bnVar.f46173e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = bnVar.f46173e;
        if (chat3 != null && chat3.f28492id == chat.f28492id && !bnVar.fa()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i7 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f46708e;
            } else {
                c5Var = c5.f46709f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i7 != 0) {
            c5VarArr[i12] = c5.f46710n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f46711r;
        }
        TLRPC.ChatFull P0 = bnVar.getMessagesController().P0(chat.f28492id);
        if (P0 == null) {
            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(org.telegram.messenger.i10.f24637t0, 0, chat);
            org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(org.telegram.messenger.i10.f24637t0, 1, chat);
            if (m11 != null && (m11.f23980k instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            } else {
                bitmapDrawable = null;
            }
            z10 = true;
            i14 = i7;
            i15 = i10;
            str2 = null;
            z11 = i11;
            w4Var = new w4(m10, m11, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, org.telegram.messenger.ks.T, chat));
        } else {
            w4Var = w4.a(chat, P0, c5VarArr);
            i14 = i7;
            i15 = i10;
            z10 = true;
            str2 = null;
            z11 = i11;
        }
        if (ab.q.i(w4Var)) {
            ab.q.p().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, w4Var, new a7(this, chat, r1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(bnVar, r1Var);
        I.c(2131232271, org.telegram.messenger.gd.N0(2131747592, str2), new xl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = 2131232093;
        } else {
            i16 = 2131232118;
        }
        if (z12) {
            i17 = 2131747617;
        } else {
            i17 = 2131747605;
        }
        I.l(i16, org.telegram.messenger.gd.N0(i17, str2), new o1(this, r1Var, chat, 25), z11);
        I.l(2131232227, org.telegram.messenger.gd.N0(2131748416, str2), new xl(this, chat, z10 ? 1 : 0), i14);
        I.l(2131232359, org.telegram.messenger.gd.N0(2131753755, str2), new xl(this, chat, 2), i15);
        I.f41894t = false;
        I.f41873i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        bn bnVar = this.f50079a;
        if (bnVar.getParentActivity() != null && tLObject != null) {
            r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                if (((ActionBarLayout) r4Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28492id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f28641id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232572, 2, bnVar.getParentActivity(), bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
                y0Var.j(org.telegram.messenger.gd.N0(2131747617, null), 2131232093, null);
                y0Var.setMinimumWidth(160);
                y0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
                y0Var2.j(org.telegram.messenger.gd.N0(2131746466, null), 2131232049, null);
                y0Var2.setMinimumWidth(160);
                y0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, r1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                bn bnVar2 = new bn(bundle);
                bnVar2.f46210ga = true;
                bnVar.presentFragmentAsPreviewWithMenu(bnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                bnVar.s7();
                return;
            }
            bnVar.presentFragment(new bn(bundle));
        }
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bn bnVar = this.f50079a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f46162d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.i6) bnVar.Ba, false);
                        w2Var.O();
                        w2Var.P = str;
                        w2Var.Q = false;
                        w2Var.R = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131751755, null)};
                        og.j jVar = new og.j(3, bnVar, str);
                        w2Var.M = charSequenceArr;
                        w2Var.L = jVar;
                        bnVar.showDialog(w2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        bnVar.Ca(null, tL_inlineButtonTypeUrl.url, true, r1Var, r1Var.getMessageObject());
                        try {
                            r1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f50079a;
        if (!bnVar.getMessagesController().e5()) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), null);
            t1Var.r(200L);
            bnVar.getMessagesController().T0(new x(this, t1Var, r1Var, 6));
            return;
        }
        if (r1Var.getMessageObject() != null) {
            r1Var.getMessageObject().f24111t2 = Boolean.FALSE;
        }
        r1Var.J3();
    }

    @Override
    public final void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        int i7 = messageObject.D;
        bn bnVar = this.f50079a;
        if (i7 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f24073k.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(bnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = bnVar.getMessagesController().S6;
                t1Var.setOnCancelListener(new di.z(this, bnVar.getConnectionsManager().sendRequest(getgroupcall, new di.m7(this, t1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                t1Var.r(600L);
                return;
            }
            TLRPC.User user = bnVar.f46187f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = bnVar.f46362s8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.c2.m(user, J4, i10, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f46187f.f28641id), bnVar.getAccountInstance());
                return;
            }
            return;
        }
        bnVar.Y7(r1Var, true, false, f10, f11, messageObject.I3(), false, false);
    }

    @Override
    public final boolean J1() {
        bn bnVar = this.f50079a;
        if (bnVar.f46279m1.getKeyboardHeight() + bnVar.La >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        boolean z10 = r1Var.getMessageObject().f24073k.media instanceof TLRPC.TL_messageMediaGiveaway;
        bn bnVar = this.f50079a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) r1Var.getMessageObject().f24073k.media).channels.get(i7).longValue();
            if (bnVar.f46271l6 != j3) {
                bnVar.presentFragment(bn.ua(j3));
            } else {
                bnVar.f46315p1.e(false, false);
            }
        }
        if (r1Var.getMessageObject().f24073k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            bnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) r1Var.getMessageObject().f24073k.media).winners.get(i7).longValue()));
        }
    }

    @Override
    public final void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f24073k) != null) {
            int i12 = p2Var.f26275a;
            TL_stars.StarsAmount starsAmount = null;
            bn bnVar = this.f50079a;
            if (i12 == 1) {
                long o4 = org.telegram.messenger.n5.o(message.from_id);
                ki.n2 n2Var = new ki.n2(25, this, message);
                Pattern pattern = org.telegram.ui.Components.b5.f33627a;
                Activity parentActivity = bnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String N0 = org.telegram.messenger.gd.N0(2131744142, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744141, org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).D1(o4, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.u6.U(editText, org.telegram.ui.ActionBar.n6.G6, null);
                editText.setHint(org.telegram.messenger.gd.N0(2131744140, null));
                org.telegram.ui.ActionBar.u6.D(editText, org.telegram.ui.ActionBar.n6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.n6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.s4(parentActivity)});
                if (org.telegram.messenger.gd.f24314a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.gd.f24314a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751592, null), new oi.f0(28, n2Var, editText));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                t1Var.O = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, c8.na.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ng(editText, 3), 100L);
                bnVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    boolean A = org.telegram.messenger.v3.A(i7, bnVar.f46173e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        org.telegram.messenger.v3.A(i10, bnVar.f46173e, 5);
                    }
                    aa.c0 c0Var = new aa.c0(this, message, A, messageObject, 28);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    bnVar.v7(c0Var, cg.a.m(starsAmount), !A);
                }
            } else if (i12 == 3) {
                bnVar.Y7(r1Var, true, false, r1Var.getLastTouchX(), r1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                bnVar.f46202g2.n(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void L0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject;
        if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null && messageObject.f24073k != null) {
            int e12 = messageObject.e1();
            bn bnVar = this.f50079a;
            if (bnVar.f46130ac != e12 || bnVar.f46145bc != 7) {
                TLRPC.InputPeer l1 = bnVar.getMessagesController().l1(org.telegram.messenger.fj.B0(messageObject.f24073k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = l1;
                getrichmessage.f28714id = e12;
                vf.b bVar = bnVar.f46185ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f46185ec = null;
                }
                hi hiVar = new hi(bnVar, e12, r1Var, 2);
                hiVar.f59502b = new u5(24, bnVar, r3);
                bnVar.f46185ec = hiVar;
                hiVar.d();
                int[] iArr = {bnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new ne(bnVar, hiVar, iArr, r1Var, messageObject, 2))};
            }
        }
    }

    @Override
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        bn bnVar = this.f50079a;
        bnVar.f46396v5 = messageObject;
        bnVar.C9();
    }

    @Override
    public final void M(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f50079a;
        bnVar.Ua.k(r1Var, bnVar, true);
        bnVar.A0.I0(false);
    }

    @Override
    public final void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, true, z11);
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.Message message = messageObject.f24073k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.g6(true);
        bn bnVar = this.f50079a;
        bnVar.getMessagesStorage().X1(org.telegram.messenger.fj.B0(messageObject.f24073k), messageObject.f24073k);
        bnVar.getMessagesController().f25882v7.h(messageObject, true, false);
        f(r1Var, true, false, true);
    }

    @Override
    public final void O(org.telegram.messenger.cj cjVar) {
        StaticLayout staticLayout = cjVar.f23476e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = cjVar.f23476e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new qi.g(cjVar.L, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.m10.t(null, 2131752010, org.telegram.ui.Components.kc.b0(this.f50079a));
        }
    }

    @Override
    public final void O1(org.telegram.messenger.fj fjVar) {
        this.f50079a.f46354s.put(fjVar, Boolean.TRUE);
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7;
        if (r1Var != null && document != null) {
            bn bnVar = this.f50079a;
            if (bnVar.getParentLayout() != null && j0(r1Var)) {
                boolean J3 = org.telegram.messenger.fj.J3(document);
                r1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(bnVar, r1Var);
                if (J3) {
                    i7 = 2131745715;
                } else {
                    i7 = 2131745735;
                }
                I.c(2131232119, org.telegram.messenger.gd.N0(i7, null), new o1(this, r1Var, document, 26), false);
                I.f41886p = new yl(r1Var, rectF, 0);
                I.a0();
            }
        }
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        im imVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && vf.c.i(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        bn bnVar = this.f50079a;
        vf.b bVar = bnVar.f46185ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (r1Var.getMessageObject() == null) {
            imVar = null;
        } else {
            imVar = new im(this, r1Var);
        }
        bnVar.f46185ec = imVar;
        if (!z11 && !vf.c.g(parse, false, null)) {
            org.telegram.ui.Components.b5.o0(bnVar, str, true, true, true, !z11, bnVar.f46185ec, webPage, bnVar.Ba);
        } else {
            vf.c.s(bnVar.getParentActivity(), parse, true, true, false, bnVar.f46185ec, null, false, true, false, false);
        }
    }

    @Override
    public final void R(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject.f24073k.send_state != 0) {
            this.f50079a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final boolean R0(long j3) {
        TLRPC.ChatFull P0;
        bn bnVar = this.f50079a;
        TLRPC.Chat chat = bnVar.f46173e;
        if (chat == null || org.telegram.messenger.v3.V(chat)) {
            return false;
        }
        org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
        long j10 = bnVar.f46173e.f28492id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && O0 != null && O0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.A1.f(j10);
        if (hVar == null && (P0 = messagesController.P0(j10)) != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() != null && (i7 = (bnVar = this.f50079a).f46130ac) != 0 && i7 == r1Var.getMessageObject().e1() && bnVar.f46145bc == 1) {
            return bnVar.f46159cc;
        }
        return null;
    }

    @Override
    public final void S0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj fjVar;
        long j3;
        int i7;
        ArrayList arrayList;
        bi.s2 s2Var;
        org.telegram.messenger.aj ajVar;
        int i10;
        bn bnVar = this.f50079a;
        wh.i iVar = bnVar.f46388ua;
        if (iVar != null) {
            HashMap hashMap = iVar.f60056a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(r1Var));
            org.telegram.ui.Components.fc fcVar = null;
            if (hVar != null) {
                fjVar = hVar.F;
            } else {
                fjVar = null;
            }
            wh.h hVar2 = (wh.h) bnVar.f46388ua.f60056a.get(wh.i.b(r1Var));
            if (hVar2 != null && (i10 = hVar2.S) != -1) {
                j3 = hVar2.f60054x[i10].d;
            } else {
                j3 = 0;
            }
            if (fjVar != null && j3 != 0) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.b5.h(parentActivity, i7, j3, false)) {
                    if (fjVar.c1() != 0 && (ajVar = (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1())) != null) {
                        arrayList = ajVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f3.i(fjVar);
                    }
                    if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f24656n) {
                        z10 = true;
                    }
                    long j10 = j3;
                    bi.s2 s2Var2 = new bi.s2(this, arrayList, j10, 18);
                    if (z10) {
                        s2Var2.run();
                        s2Var = null;
                    } else {
                        s2Var = s2Var2;
                    }
                    fcVar = org.telegram.ui.Components.kc.v(bnVar.getParentActivity(), bnVar, null, 1, j10, 1, bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj), bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj), 5000, false, s2Var);
                    fcVar.f35092k = true;
                    fcVar.k(fcVar.f35087e instanceof org.telegram.ui.Components.qb);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(r1Var));
            if (hVar3 != null) {
                if (fcVar == null) {
                    hVar3.S = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.kb kbVar = fcVar.f35087e;
                if (!(kbVar instanceof org.telegram.ui.Components.nb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) kbVar;
                hVar3.X = nbVar;
                nbVar.f37751a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ow(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            bn bnVar = this.f50079a;
            org.telegram.ui.Components.gu.O0(bnVar, fjVar, bnVar.f46171db, str2, str3, str4, str, i7, i10, -1, bnVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        he heVar;
        bi.s2 s2Var;
        boolean z10;
        org.telegram.ui.ActionBar.i6 i6Var;
        long j3;
        ai.h0 h0Var;
        int i7;
        boolean z11;
        int i10;
        qz0 qz0Var;
        int i11;
        float f10;
        int i12;
        long j10;
        ArrayList arrayList = null;
        if (!fjVar.S4() && !fjVar.g4()) {
            if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
                if (fjVar.I3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f50079a.D0.L();
                    bn bnVar = this.f50079a;
                    long j11 = bnVar.f46167d7;
                    boolean z12 = true ^ bnVar.D0.O;
                    if (bnVar.f46422x4) {
                        j10 = bnVar.b();
                    } else {
                        j10 = 0;
                    }
                    return B.o0(L, fjVar, j11, z12, null, j10);
                }
            } else {
                boolean S = MediaController.B().S(fjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f50079a.i8(fjVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            sz0 sz0Var = this.f50079a.f46415wa;
            if (sz0Var == null || sz0Var.f52181c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f27013b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!fjVar.P3()) {
                            org.telegram.ui.Components.kc.b0(this.f50079a).w(2131232792, org.telegram.messenger.gd.N0(2131743263, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f50079a.f46415wa = new sz0(this.f50079a.getParentActivity());
                sz0 sz0Var2 = this.f50079a.f46415wa;
                if (!fjVar.P3()) {
                    heVar = this.f50079a.Lb(fjVar, true);
                } else {
                    heVar = null;
                }
                if (!fjVar.P3()) {
                    s2Var = bn.a5(this.f50079a, fjVar);
                } else {
                    s2Var = null;
                }
                Context context = sz0Var2.f52176a;
                ai.h0 h0Var2 = sz0Var2.f52180c;
                sz0Var2.Y = heVar;
                sz0Var2.Z = s2Var;
                qz0 qz0Var2 = sz0Var2.O;
                if (qz0Var2 != null) {
                    h0Var2.removeView(qz0Var2);
                    sz0Var2.O = null;
                }
                sz0Var2.P = r1Var;
                org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                sz0Var2.N = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sz0Var2.T = z10;
                org.telegram.ui.Cells.r1 r1Var2 = sz0Var2.P;
                if (r1Var2 != null) {
                    i6Var = r1Var2.getResourcesProvider();
                } else {
                    i6Var = null;
                }
                sz0Var2.M = i6Var;
                if (sz0Var2.P != null) {
                    sz0Var2.U = 0.0f;
                    sz0Var2.V = r1Var.f31574n;
                    if (r1Var.getParent() instanceof View) {
                        View view = (View) r1Var.getParent();
                        sz0Var2.U = view.getY() + sz0Var2.U;
                        sz0Var2.V = view.getY() + sz0Var2.V;
                    }
                    int width = sz0Var2.P.getWidth();
                    int height = sz0Var2.P.getHeight();
                    if (sz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f24226q.y));
                    }
                    sz0Var2.L = height - sz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f24225p);
                    j3 = 0;
                    int i13 = height;
                    h0Var = h0Var2;
                    qz0 qz0Var3 = new qz0(sz0Var2, sz0Var2.getContext(), org.telegram.messenger.i10.f24637t0, sz0Var2.P.getResourcesProvider(), width, i13);
                    sz0Var2.O = qz0Var3;
                    sz0Var2.P.u0(qz0Var3);
                    sz0Var2.O.t0(sz0Var2.P);
                    sz0Var2.O.setDelegate(new w7.s(19));
                    qz0 qz0Var4 = sz0Var2.O;
                    org.telegram.messenger.fj fjVar2 = sz0Var2.N;
                    org.telegram.messenger.aj currentMessagesGroup = sz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var3 = sz0Var2.P;
                    qz0Var4.y3(fjVar2, currentMessagesGroup, r1Var3.G, r1Var3.F, false, false);
                    if (!sz0Var2.T) {
                        org.telegram.ui.Components.f8 f8Var = new org.telegram.ui.Components.f8();
                        sz0Var2.W = f8Var;
                        qz0 qz0Var5 = sz0Var2.O;
                        f8Var.f35046i = qz0Var5;
                        qz0Var5.wc = f8Var;
                        if (qz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.dn0 seekBarWaveform = sz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = sz0Var2.f52189s;
                            org.telegram.ui.Cells.r1 r1Var4 = seekBarWaveform.f34406n;
                            if (r1Var4 != null) {
                                r1Var4.invalidate();
                            }
                        }
                    }
                    sz0Var2.I = false;
                    h0Var.addView(sz0Var2.O, new FrameLayout.LayoutParams(sz0Var2.P.getWidth(), i13, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    h0Var = h0Var2;
                    i7 = 360;
                }
                TextureView textureView = sz0Var2.Q;
                if (textureView != null) {
                    h0Var.removeView(textureView);
                    sz0Var2.Q = null;
                }
                if (sz0Var2.T) {
                    sz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    sz0Var2.Q = textureView2;
                    h0Var.addView(textureView2, 0, c8.na.c(i7, i7));
                }
                org.telegram.ui.Components.h61 h61Var = MediaController.B().f22814j0;
                if (h61Var != null) {
                    h61Var.g0();
                }
                org.telegram.ui.Components.h61 h61Var2 = sz0Var2.f52191x;
                if (h61Var2 != null) {
                    h61Var2.g0();
                    sz0Var2.f52191x.m0();
                    sz0Var2.f52191x = null;
                }
                org.telegram.ui.Cells.r1 r1Var5 = sz0Var2.P;
                if (r1Var5 != null && r1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(sz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(sz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(sz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(sz0Var2.P.getMessageObject().f24073k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && sz0Var2.P.getMessageObject().f24073k.attachPath != null) {
                        I = new File(sz0Var2.P.getMessageObject().f24073k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.h61 h61Var3 = new org.telegram.ui.Components.h61();
                        sz0Var2.f52191x = h61Var3;
                        h61Var3.K = new rz0(sz0Var2);
                        if (sz0Var2.W != null) {
                            h61Var3.L = new rz0(sz0Var2);
                        }
                        if (sz0Var2.T) {
                            h61Var3.A0(sz0Var2.Q);
                        }
                        sz0Var2.f52191x.j0(Uri.fromFile(I), "other");
                        sz0Var2.f52191x.h0();
                        org.telegram.ui.Components.vs vsVar = sz0Var2.F;
                        if (vsVar != null) {
                            vsVar.f41428s = sz0Var2.f52191x;
                            vsVar.a();
                        }
                    }
                    bn bnVar2 = this.f50079a;
                    bnVar2.showDialog(bnVar2.f46415wa);
                    return false;
                }
                hi.u3 u3Var = sz0Var2.f52192y;
                if (u3Var != null) {
                    h0Var.removeView(u3Var);
                    sz0Var2.f52192y = null;
                }
                org.telegram.messenger.fj fjVar3 = sz0Var2.N;
                if (fjVar3 != null && fjVar3.P3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.fj fjVar4 = sz0Var2.N;
                if (fjVar4 != null && org.telegram.messenger.fj.B0(fjVar4.f24073k) != org.telegram.messenger.i10.i(sz0Var2.N.K1).e()) {
                    hi.u3 u3Var2 = new hi.u3(context, 3);
                    sz0Var2.f52192y = u3Var2;
                    u3Var2.r(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.fj.B0(sz0Var2.N.f24073k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(sz0Var2.N.K1).c2(Long.valueOf(B0));
                            if (c22 != null) {
                                str = org.telegram.messenger.n10.k(c22, true);
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(sz0Var2.N.K1).O0(Long.valueOf(-B0));
                            if (O0 != null) {
                                str = O0.title;
                            }
                        }
                        hi.u3 u3Var3 = sz0Var2.f52192y;
                        if (sz0Var2.T) {
                            i12 = 2131743343;
                        } else {
                            i12 = 2131743264;
                        }
                        u3Var3.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i12, str)));
                    } else {
                        hi.u3 u3Var4 = sz0Var2.f52192y;
                        if (sz0Var2.T) {
                            i11 = 2131743344;
                        } else {
                            i11 = 2131743265;
                        }
                        u3Var4.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(i11, null)));
                    }
                    sz0Var2.f52192y.s(12.0f);
                    hi.u3 u3Var5 = sz0Var2.f52192y;
                    if (!z11 && !sz0Var2.P.G) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    u3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (sz0Var2.T) {
                        sz0Var2.f52192y.p(0.5f, 0.0f);
                        sz0Var2.f52192y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        sz0Var2.f52192y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        sz0Var2.f52192y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    sz0Var2.f52192y.w(14.0f);
                    hi.u3 u3Var6 = sz0Var2.f52192y;
                    u3Var6.h = hi.u3.a(u3Var6.getText(), sz0Var2.f52192y.getTextPaint());
                    if (sz0Var2.T) {
                        h0Var.addView(sz0Var2.f52192y, c8.na.d((int) ((sz0Var2.P.getWidth() / org.telegram.messenger.g0.f24225p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((sz0Var2.P.getHeight() + sz0Var2.L) / org.telegram.messenger.g0.f24225p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        h0Var.addView(sz0Var2.f52192y, c8.na.d((int) ((sz0Var2.P.getWidth() / org.telegram.messenger.g0.f24225p) * 0.6f), 150.0f, 17, ((((sz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + sz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.f24225p) + 1.0f, ((-75.0f) - ((sz0Var2.P.getHeight() / org.telegram.messenger.g0.f24225p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    sz0Var2.f52192y.x();
                }
                TextView textView = sz0Var2.E;
                if (textView != null) {
                    h0Var.removeView(textView);
                    sz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                sz0Var2.E = textView2;
                textView2.setTextColor(-1);
                sz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    sz0Var2.E.setBackground(org.telegram.ui.ActionBar.n6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    sz0Var2.E.setBackground(org.telegram.ui.ActionBar.n6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                sz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.sa.a(sz0Var2.E);
                TextView textView3 = sz0Var2.E;
                if (z11) {
                    i10 = 2131743269;
                } else {
                    i10 = 2131743266;
                }
                textView3.setText(org.telegram.messenger.gd.N0(i10, null));
                sz0Var2.E.setOnClickListener(new oz0(sz0Var2, 1));
                h0Var.addView(sz0Var2.E, c8.na.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (qz0Var = sz0Var2.O) != null && qz0Var.getMessageObject() != null && sz0Var2.O.getMessageObject().f24073k != null) {
                    sz0Var2.O.getMessageObject().f24073k.media_unread = false;
                    sz0Var2.O.invalidate();
                }
                bn bnVar22 = this.f50079a;
                bnVar22.showDialog(bnVar22.f46415wa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void U1() {
        org.telegram.ui.ActionBar.i6 i6Var;
        bn bnVar = this.f50079a;
        if (bnVar.f46279m1 != null && bnVar.getParentActivity() != null) {
            Context context = bnVar.f46279m1.getContext();
            i6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
            ty0.e1(context, bnVar, false, i6Var, null);
        }
    }

    @Override
    public final void W(org.telegram.messenger.fj fjVar) {
        if (org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            this.f50079a.Lb(fjVar, true);
        }
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        bn bnVar = this.f50079a;
        bnVar.getSendMessagesHelper().n0(true, r1Var.getMessageObject(), keyboardInlineButton, null, null, bnVar);
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.r1 r1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        TLRPC.Peer peer;
        int i7;
        TLRPC.Peer peer2;
        int i10;
        boolean l32 = org.telegram.messenger.fj.l3(r1Var.getMessageObject().f24073k);
        bn bnVar = this.f50079a;
        if (l32) {
            TLRPC.Message message = r1Var.getMessageObject().f24073k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long o4 = org.telegram.messenger.n5.o(peer2);
            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(bnVar);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b02.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743842, org.telegram.messenger.n5.l(i10, o4)))).k(true);
            return false;
        } else if (!r1Var.getMessageObject().q()) {
            TLRPC.Message message2 = r1Var.getMessageObject().f24073k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long o10 = org.telegram.messenger.n5.o(peer);
            org.telegram.ui.Components.kc b03 = org.telegram.ui.Components.kc.b0(bnVar);
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b03.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743843, org.telegram.messenger.n5.l(i7, o10)))).k(true);
            return false;
        } else if (!bnVar.getUserConfig().q()) {
            org.telegram.ui.Components.kc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131743819, null), new ul(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.v3.M(bnVar.f46173e, bnVar.f46349r8, true);
            final org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
            final org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.fj.B0(messageObject.f24073k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.f28639id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().l1(org.telegram.messenger.fj.B0(messageObject.f24073k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f28639id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f28639id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    zy zyVar = zy.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final tr messagesStorage = zyVar.getMessagesStorage();
                        fj fjVar = messageObject;
                        final long B0 = fj.B0(fjVar.f24073k);
                        final int e12 = fjVar.e1();
                        final int i11 = todoItem.f28639id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        q5 q5Var = messagesStorage.f27149a;
                        final long j3 = M;
                        q5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ar.run():void");
                            }
                        });
                        zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    }
                    g0.g3(new di.x7(zyVar, hash, z11, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final boolean Y() {
        bn bnVar = this.f50079a;
        if (bnVar.f46307o6[1].size() + bnVar.f46307o6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        ai.u0 u0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            bn bnVar = this.f50079a;
            vf.b bVar = bnVar.f46185ec;
            if (bVar != null) {
                bVar.a(true);
                bnVar.f46185ec = null;
            }
            if (r1Var.getMessageObject() == null) {
                bnVar.f46185ec = null;
                hiVar = null;
            } else {
                hiVar = new hi(bnVar, r1Var.getMessageObject().e1(), r1Var, 1);
                bnVar.f46185ec = hiVar;
            }
            i7 = ((org.telegram.ui.ActionBar.g2) this.f50079a).currentAccount;
            di.y8 y10 = di.y8.y(i7, false);
            Objects.requireNonNull(hiVar);
            ch chVar = new ch(hiVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f27013b;
            }
            org.telegram.ui.ActionBar.i6 I = di.y8.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.fj.B0(messageObject.f24073k);
                int e12 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.mp.u1(y10.f10046a).l1(B0);
                tL_inputInvoiceMessage.msg_id = e12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = ki.t2.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                u0Var = new ai.u0(y10, ConnectionsManager.getInstance(y10.f10046a).sendRequest(tL_payments_getPaymentForm, new bi.m2(y10, messageObject, tL_inputInvoiceMessage, chVar, 3)), 7);
            }
            if (u0Var != null) {
                hiVar.f59502b = u0Var;
                hiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f24073k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i10 = -1;
            for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i10 = arrayList.size();
                    }
                    TLRPC.TL_message R7 = bn.R7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        R7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        R7.attachPath = message.attachPath;
                    }
                    R7.media = tL_messageExtendedMedia.media;
                    R7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.fj(messageObject.K1, R7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer p12 = PhotoViewer.p1();
                bn bnVar2 = this.f50079a;
                p12.J2(null, bnVar2, bnVar2.Ba);
                PhotoViewer.p1().b2(arrayList, i10, this.f50079a.a(), 0L, 0L, this.f50079a.eb);
            }
        }
    }

    @Override
    public final boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        org.telegram.messenger.fj messageObject;
        TLRPC.Message message;
        if (r1Var != null) {
            bn bnVar = this.f50079a;
            if (bnVar.getParentActivity() != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (org.telegram.messenger.mp.u1(i7).B4() && (messageObject = r1Var.getMessageObject()) != null && (message = messageObject.f24073k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(bnVar.f46173e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.bp bpVar;
        Integer num;
        org.telegram.messenger.fc b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        bn bnVar = this.f50079a;
        if (isEmpty) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            ug.h1 h1Var = new ug.h1(bnVar, i7, user, null, null, bnVar.Ba);
            r1Var.getLocationOnScreen(new int[2]);
            h1Var.f58812r2 = r1Var.getNameStatusX();
            h1Var.f58813s2 = r1Var.getNameStatusY();
            h1Var.f58816v2 = r1Var.getScaleX();
            h1Var.f58814t2 = r1Var.getLeft();
            h1Var.f58815u2 = r1Var.getTop();
            h1Var.f58817w2 = r1Var;
            int f10 = org.telegram.messenger.n10.f(user);
            if (f10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i10).f25862t4;
                if (cpVar != null) {
                    bpVar = cpVar.d(f10);
                } else {
                    bpVar = null;
                }
                if (bpVar != null) {
                    num = Integer.valueOf(bpVar.f());
                } else {
                    num = null;
                }
                h1Var.f58811q2 = num;
            } else {
                h1Var.f58811q2 = Integer.valueOf(bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29712r8[f10]));
            }
            org.telegram.ui.Components.m5 m5Var = r1Var.f31625qa;
            if (m5Var != null && (m5Var.f37376f[0] instanceof org.telegram.ui.Components.o5)) {
                h1Var.f58816v2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(bnVar.getParentActivity());
                    org.telegram.messenger.kz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.fc.b(document);
                        if (d != null) {
                            d.f25409e = 512;
                            d.f25410f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                            d.f25409e = 512;
                            d.f25410f = 512;
                        }
                        b10 = org.telegram.messenger.fc.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.fc fcVar = b10;
                    String str3 = str2;
                    p9Var.setLayerNum(7);
                    p9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    p9Var.m(fcVar, str3, org.telegram.messenger.fc.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.fj.C4(document)) {
                        Integer num2 = h1Var.f58811q2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29786v6);
                        }
                        p9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        h1Var.f58819y2 = org.telegram.messenger.fj.i1(document);
                    } else {
                        h1Var.f58819y2 = org.telegram.messenger.fj.i1(document);
                    }
                    h1Var.f58818x2 = p9Var;
                    h1Var.A2 = true;
                }
            }
            bnVar.showDialog(h1Var);
            return;
        }
        vf.c.t(bnVar.getParentActivity(), "https://" + bnVar.getMessagesController().X2 + "/nft/" + str);
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f50079a;
        rj rjVar = bnVar.f46118a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = org.telegram.messenger.v3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                bnVar.f46118a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.h3(new ul(this, 6), 200L);
            }
        }
    }

    @Override
    public final void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        this.f50079a.l8(characterStyle, z10, r1Var.getMessageObject(), r1Var);
    }

    @Override
    public final boolean a2(org.telegram.ui.Cells.r1 r51, org.telegram.tgnet.TLRPC.PollAnswer r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.a2(org.telegram.ui.Cells.r1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f50079a;
        rj rjVar = bnVar.f46118a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String o4 = org.telegram.messenger.n10.o(user);
            if (o4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) o4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.n10.k(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.u41("" + user.f28641id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            bnVar.f46118a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.h3(new ul(this, 7), 200L);
        }
    }

    @Override
    public final boolean b0() {
        bn bnVar = this.f50079a;
        if (!org.telegram.messenger.n10.A(bnVar.f46187f) && !org.telegram.messenger.n10.C(bnVar.f46187f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
        TLRPC.Message message;
        if (r1Var == null) {
            h10Var.run();
            return;
        }
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f24073k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f50079a;
            g2Var.getSendMessagesHelper().v(messageObject, messageObject.f24073k.rich_message, null, g2Var, true);
            return;
        }
        h10Var.run();
    }

    public final void c(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.f50079a;
        bnVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f46173e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == bnVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == bnVar.getUserConfig().e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                org.telegram.ui.Components.oy0.b(parentActivity, i7, -bnVar.f46173e.f28492id, currentUser, str2, z15, z16, z12, i6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == bnVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.v3.T(bnVar.f46173e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                bnVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.mp.k1(bnVar.f46173e);
                tL_channels_getParticipant.participant = bnVar.getMessagesController().l1(currentUser.f28641id);
                bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.r6(15, this, r1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            i6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
            org.telegram.ui.Components.oy0.b(parentActivity2, i7, -bnVar.f46173e.f28492id, currentUser, str2, z152, z162, z12, i6Var);
        }
    }

    @Override
    public final void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.fj messageObject;
        if (chat == null) {
            return;
        }
        bn bnVar = this.f50079a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.x() && !bnVar.Y9()) {
            if (!z10 && chat.signature_profiles && (messageObject = r1Var.getMessageObject()) != null && org.telegram.messenger.fj.B0(messageObject.f24073k) != 1271266957) {
                bnVar.Qa(org.telegram.messenger.n5.o(messageObject.f24073k.from_id));
                return;
            } else {
                h(r1Var, chat, i7, z10);
                return;
            }
        }
        bn.k2(bnVar, r1Var, true, f10, f11);
    }

    @Override
    public final boolean c1(org.telegram.ui.Cells.r1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.c1(org.telegram.ui.Cells.r1, boolean):boolean");
    }

    @Override
    public final fr0 c2() {
        return this.f50079a.Ta;
    }

    @Override
    public final boolean d() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        bn bnVar = this.f50079a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            if (!kVar2.x() && !bnVar.Y9()) {
                z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d0(org.telegram.ui.Cells.r1 r1Var) {
        f(r1Var, true, true, false);
    }

    @Override
    public final void e() {
        this.f50079a.f46279m1.getClass();
    }

    @Override
    public final int e0() {
        return this.f50079a.f46204g4;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f50079a;
        bnVar.getNotificationCenter().k(org.telegram.messenger.ks.f25267p3, Long.valueOf(bnVar.f46271l6), r1Var);
    }

    @Override
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.m10.t(null, 2131752010, org.telegram.ui.Components.kc.b0(this.f50079a));
    }

    public final void f(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.fj primaryMessageObject;
        int i7;
        int i10;
        ej ejVar;
        if (r1Var == null || (primaryMessageObject = r1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        bn bnVar = this.f50079a;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59208y < 0) {
            for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        if (((org.telegram.ui.Cells.r1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i10 = bnVar.h9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z10 && i7 >= 0 && r1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                ej ejVar2 = bnVar.C0;
                bnVar.A0.getClass();
                ejVar2.i1(RecyclerView.R(r1Var), r1Var.getTop() - ((int) bnVar.P9), false);
            } else {
                bnVar.C0.h1(i7, i10);
            }
        }
        bnVar.f46148c1 = z11;
        bnVar.Zc(primaryMessageObject, false);
        bnVar.f46148c1 = false;
    }

    @Override
    public final void f1(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f24073k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String O0 = org.telegram.messenger.gd.O0("PsaMessageInfo_" + messageObject.f24073k.fwd_from.psa_type);
            if (TextUtils.isEmpty(O0)) {
                O0 = org.telegram.messenger.gd.N0(2131746398, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
            org.telegram.messenger.fj.d(spannableStringBuilder, false);
            org.telegram.messenger.aj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
            bn bnVar = this.f50079a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f23009e;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.xi) arrayList.get(i7)).f28005l & 1) != 0) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) currentMessagesGroup.d.get(i7);
                        if (fjVar != messageObject) {
                            int childCount = bnVar.A0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = bnVar.A0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                                    if (fjVar.T(r1Var2.getMessageObject())) {
                                        r1Var = r1Var2;
                                    }
                                }
                            }
                            messageObject = fjVar;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            bnVar.qc(messageObject, spannableStringBuilder, 1);
            r1Var.I3(1, false, true);
        }
    }

    @Override
    public final boolean f2(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.f2(long):boolean");
    }

    public final boolean g() {
        bn bnVar = this.f50079a;
        if (!org.telegram.messenger.n10.C(bnVar.f46187f)) {
            TLRPC.Chat chat = bnVar.f46173e;
            if (chat != null) {
                if (org.telegram.messenger.v3.T(chat) && !bnVar.f46173e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean g1(org.telegram.messenger.fj fjVar) {
        kl klVar;
        int i7 = (org.telegram.messenger.fj.B0(fjVar.f24073k) > 1271266957L ? 1 : (org.telegram.messenger.fj.B0(fjVar.f24073k) == 1271266957L ? 0 : -1));
        bn bnVar = this.f50079a;
        if ((i7 == 0 || ((klVar = bnVar.D0) != null && klVar.O)) && bnVar.f46204g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.g2(org.telegram.ui.Cells.r1, int, float, float, boolean):void");
    }

    public final void h(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, boolean z10) {
        bn bnVar = this.f50079a;
        TLRPC.Chat chat2 = bnVar.f46173e;
        if (chat2 != null && chat.f28492id == chat2.f28492id) {
            vi viVar = bnVar.f46315p1;
            if (viVar != null && i7 == 0) {
                viVar.e(false, false);
            } else if (r1Var.getMessageObject() != null) {
                bnVar.l(i7, r1Var.getMessageObject().e1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f28492id != chat2.f28492id || bnVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28492id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = bnVar.f46185ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f46185ec = null;
                }
                if (r1Var != null && r1Var.getMessageObject() != null) {
                    hi hiVar2 = new hi(bnVar, r1Var.getMessageObject().e1(), r1Var, 0);
                    bnVar.f46185ec = hiVar2;
                    hiVar = hiVar2;
                } else {
                    bnVar.f46185ec = null;
                }
            }
            if (bnVar.getMessagesController().E(bundle, bnVar, r1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                bn bnVar2 = new bn(bundle);
                if (hiVar3 != null && i7 != 0) {
                    org.telegram.messenger.g0.h3(new ai.d1(this, hiVar3, chat, i7, bnVar2, 13), 5000L);
                    hiVar3.d();
                    return;
                }
                bnVar.presentFragment(bnVar2);
            }
        }
    }

    @Override
    public final jh.a h0() {
        return this.f50079a.f46390uc;
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final void j(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28641id);
            org.telegram.ui.ActionBar.g2 g2Var = this.f50079a;
            if (g2Var.getMessagesController().E(bundle, g2Var, r1Var.getMessageObject(), null)) {
                g2Var.presentFragment(new bn(bundle));
            }
        }
    }

    @Override
    public final boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj messageObject;
        if (r1Var == null) {
            messageObject = null;
        } else {
            messageObject = r1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f24073k != null) {
            bn bnVar = this.f50079a;
            if (bnVar.f46204g4 != 1 && !bnVar.W9() && !messageObject.f24073k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean j2(org.telegram.ui.Cells.r1 r44, org.telegram.tgnet.TLRPC.TodoItem r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.j2(org.telegram.ui.Cells.r1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final String k(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() != null && (i7 = (bnVar = this.f50079a).f46130ac) != 0 && i7 == r1Var.getMessageObject().e1() && bnVar.f46145bc == 3) {
            return bnVar.dc;
        }
        return null;
    }

    @Override
    public final boolean k0(org.telegram.ui.Cells.r1 r1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c10;
        int i7;
        w4 b10;
        int i10;
        vj vjVar;
        uj ujVar;
        if (!g()) {
            return false;
        }
        bn bnVar = this.f50079a;
        if (bnVar.f46173e != null && (((vjVar = bnVar.f46162d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = bnVar.f46173e;
        if (chat != null && ((bnVar.f46359s4 == 0 || bnVar.f46422x4) && (!org.telegram.messenger.v3.T(chat) || bnVar.f46173e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        if (r22 != 0) {
            c5VarArr[2] = c5.f46710n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f46711r;
        }
        TLRPC.UserFull d2 = bnVar.getMessagesController().d2(user.f28641id);
        if (d2 == null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        } else {
            b10 = w4.c(user, d2, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (ab.q.i(b10)) {
            ab.q.p().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, b10, new a7(this, r1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(bnVar, r1Var);
        I.c(2131232271, org.telegram.messenger.gd.N0(2131747592, null), new Runnable(this) {
            public final mm f52980b;

            {
                this.f52980b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52980b.n(user, false);
                        return;
                    case 1:
                        this.f52980b.b(user);
                        return;
                    default:
                        this.f52980b.f50079a.Pa(user);
                        return;
                }
            }
        }, false);
        I.c(2131232118, org.telegram.messenger.gd.N0(2131745405, null), new o1(this, r1Var, user, 24), false);
        I.l(2131232227, org.telegram.messenger.gd.N0(2131748416, null), new Runnable(this) {
            public final mm f52980b;

            {
                this.f52980b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52980b.n(user, false);
                        return;
                    case 1:
                        this.f52980b.b(user);
                        return;
                    default:
                        this.f52980b.f50079a.Pa(user);
                        return;
                }
            }
        }, r22);
        I.l(2131232359, org.telegram.messenger.gd.N0(2131753755, null), new Runnable(this) {
            public final mm f52980b;

            {
                this.f52980b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52980b.n(user, false);
                        return;
                    case 1:
                        this.f52980b.b(user);
                        return;
                    default:
                        this.f52980b.f50079a.Pa(user);
                        return;
                }
            }
        }, r42);
        I.f41894t = false;
        I.f41873i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void k1() {
        bn bnVar = this.f50079a;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, bnVar.f46271l6, null);
    }

    @Override
    public final void k2(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull P0;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.f50079a;
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f46173e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46173e.f28492id;
            long j10 = currentUser.f28641id;
            a0.h hVar = (a0.h) messagesController.A1.f(j3);
            if (hVar == null && (P0 = messagesController.P0(j3)) != null && P0.participants != null) {
                for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                    chatParticipant = P0.participants.participants.get(i7);
                    if (chatParticipant.user_id == j10) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j10);
            c(r1Var, chatParticipant);
        }
    }

    public final void l(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28492id);
            bundle.putBoolean("expandPhoto", false);
            this.f50079a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.g2 g2Var = this.f50079a;
        if (g2Var.getMessagesController().E(j10, g2Var, r1Var.getMessageObject(), null)) {
            g2Var.presentFragment(new bn(j10));
        }
    }

    @Override
    public final void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = sh.g.a(messageObject);
            boolean a11 = c8.ed.a(a10, 7);
            bn bnVar = this.f50079a;
            if (a11) {
                org.telegram.ui.Components.kc.b0(bnVar).Q(2131624007, 36, sh.g.b(a10, messageObject)).j();
            } else if (i7 < 0 && !arrayList.isEmpty()) {
                bnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                r1Var.c0(true);
            } else if (bnVar.getParentActivity() != null) {
                if (bnVar.C2 == null) {
                    int indexOfChild = bnVar.f46279m1.indexOfChild(bnVar.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hi.u3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.C2 = E6;
                    E6.f15511v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i7 < 0) {
                    ArrayList<org.telegram.ui.Cells.q1> pollButtons = r1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i12 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        org.telegram.ui.Cells.q1 q1Var = pollButtons.get(i12);
                        float y10 = ((r1Var.getY() + q1Var.f31353b) - org.telegram.messenger.g0.L(4.0f)) - bnVar.P9;
                        bnVar.F2 = org.telegram.messenger.g0.L(13.3f) + q1Var.f31352a;
                        int i13 = org.telegram.ui.Cells.c0.i(6.0f, q1Var.f31353b, i11);
                        bnVar.G2 = i13;
                        if (y10 > 0.0f) {
                            i10 = bnVar.F2;
                            i11 = i13;
                            f10 = 0.0f;
                            break;
                        }
                        i12++;
                        f10 = y10;
                    }
                    if (f10 != 0.0f) {
                        bnVar.A0.w0(0, (int) f10, null);
                        bnVar.E2 = r1Var;
                        return;
                    }
                }
                bn.q2(bnVar, r1Var, i7, i10, i11);
            }
        }
    }

    @Override
    public final void m0(int i7) {
        CharSequence T2;
        int i10;
        SpannableStringBuilder W2;
        int i11;
        bn bnVar = this.f50079a;
        try {
            if (i7 == 0) {
                bnVar.w7();
                nk nkVar = bnVar.O3;
                if (nkVar != null) {
                    nkVar.l(0L, 84, null, new ul(this, 1));
                    bnVar.O3.performHapticFeedback(3, 2);
                }
            } else if (i7 == 1) {
                String x10 = org.telegram.messenger.gd.x(bnVar.getMessagesController().f25899x4, true);
                if (bnVar.getMessagesController().f25899x4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(org.telegram.ui.Components.i21.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(org.telegram.ui.Components.i21.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.kc.b0(bnVar).G(2131624300, 6, W2).k(true);
                bnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.gd.x(bnVar.getMessagesController().f25899x4, true);
                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(bnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(bnVar.getMessagesController().f25879v4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i7 == 2) {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131743721, null), new ul(this, 2));
                } else if (bnVar.getMessagesController().f25899x4 <= 0) {
                    T2 = "";
                } else {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131743720, x11), new ul(this, 3));
                }
                SpannableStringBuilder append2 = append.append(T2);
                b02.getClass();
                org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b02.X(), b02.f36700c);
                nbVar.c(2131624300, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i12 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i12 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i12++;
                    }
                }
                nbVar.f37752b.setText(append2);
                nbVar.f37752b.setSingleLine(false);
                nbVar.f37752b.setMaxLines(6);
                b02.b(nbVar, 7000).k(true);
                org.telegram.messenger.q2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        bn bnVar = this.f50079a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f46162d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    rj rjVar = bnVar.f46118a0;
                    org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
                    org.telegram.messenger.fj messageObject2 = r1Var.getMessageObject();
                    gi giVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    vf.b bVar = bnVar.f46185ec;
                    if (bVar != null) {
                        bVar.a(true);
                        bnVar.f46185ec = null;
                    }
                    if (str != null && r1Var.getMessageObject() != null) {
                        gi giVar2 = new gi(bnVar, r1Var.getMessageObject().e1(), str, r1Var, 1);
                        bnVar.f46185ec = giVar2;
                        giVar = giVar2;
                    } else {
                        bnVar.f46185ec = null;
                    }
                    rjVar.t0(keyboardButtonProto, messageObject, messageObject2, giVar);
                }
            }
        }
    }

    public final void n(TLRPC.User user, boolean z10) {
        int i7;
        if (user != null && user.f28641id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28641id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            bn bnVar = this.f50079a;
            TLRPC.User user2 = bnVar.f46187f;
            if (user2 != null && user2.f28641id == user.f28641id) {
                i10 = 1;
            }
            profileActivity.j5(i10);
            Activity parentActivity = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i7);
            bnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final boolean n0() {
        if (this.f50079a.f46204g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        this.f50079a.Y7(r1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void p() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26829a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f50079a.getParentActivity(), org.telegram.messenger.s2.f26834g);
    }

    @Override
    public final int p0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar;
        bn bnVar = this.f50079a;
        if (bnVar.f46186ed.f57780f && (bVar = bnVar.f46265kd) != null && bVar.f57546n == r1Var && bVar.f57541a.getWidth() > 0) {
            return bnVar.f46265kd.f57541a.getHeight();
        }
        return 0;
    }

    @Override
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String N0;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        boolean z11 = false;
        fm fmVar = null;
        fm fmVar2 = null;
        File file = null;
        fm fmVar3 = null;
        fm fmVar4 = null;
        bn bnVar = this.f50079a;
        if (i7 == 19) {
            vf.b bVar = bnVar.f46185ec;
            if (bVar != null) {
                bVar.a(true);
            }
            if (r1Var.getMessageObject() != null) {
                fmVar2 = new fm(this, r1Var, 2);
            }
            final fm fmVar5 = fmVar2;
            bnVar.f46185ec = fmVar5;
            final Activity parentActivity = bnVar.getParentActivity();
            final org.telegram.ui.ActionBar.i6 resourceProvider = bnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fmVar5.d();
            fmVar5.f59502b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f24073k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b10 = wg.h.b(messageObject);
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(-messageObject.Z0()));
            if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.f24073k.date * 1000;
            wg.r.d(messageObject, new org.telegram.messenger.w10(atomicBoolean, fmVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f59840a;
                public final vf.b f59841b;
                public final boolean f59842c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f59843e;
                public final Context f59844f;
                public final i6 f59845g;

                {
                    this.f59843e = tL_messageMediaGiveaway2;
                    this.f59844f = parentActivity;
                    this.f59845g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f59840a.get()) {
                        this.f59841b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f59842c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f59843e;
                        Context context = this.f59844f;
                        i6 i6Var = this.f59845g;
                        if (z12) {
                            h.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, i6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, i6Var);
                        }
                    }
                }
            }, new wg.e(atomicBoolean, fmVar5, 0));
        } else if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z12 = org.telegram.messenger.s2.f26829a;
            org.telegram.messenger.t0.r();
            vf.c.t(bnVar.getParentActivity(), org.telegram.messenger.s2.f26834g);
        } else if (i7 == 84) {
            bnVar.Wa(r1Var);
        } else if (i7 == 80) {
            org.telegram.ui.Cells.o8 o8Var = org.telegram.ui.Components.ef0.M1;
            if (bnVar.getParentActivity() != null) {
                bnVar.showDialog(new org.telegram.ui.Components.ef0(bnVar.getContext(), bnVar.getCurrentAccount(), messageObject, bnVar.getResourceProvider()));
            }
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f24073k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    bnVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            long j10 = messageObject.f24073k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user2 = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f24073k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f28641id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.g0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                bnVar.showDialog(new org.telegram.ui.Components.kd0(bnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, bnVar.Ba));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 30) {
            bnVar.presentFragment(new bn(a8.p0.j(messageObject.f24073k.media.user_id, "user_id")));
        } else if (i7 == 31) {
            long j11 = messageObject.f24073k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    N0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    N0 = org.telegram.messenger.m10.h(new StringBuilder("+"), user.phone, pf.b.c());
                } else {
                    String str5 = org.telegram.messenger.fj.n1(messageObject.f24073k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        N0 = pf.b.c().b(str5);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131747638, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f28641id);
                bundle2.putString("phone", N0);
                bundle2.putBoolean("addContact", true);
                bnVar.presentFragment(new qr(bundle2));
            }
        } else if (i7 != 23 && i7 != 24) {
            if (messageObject.r4()) {
                bnVar.ma(messageObject, false, false);
                if (messageObject.T0 != null) {
                    vf.b bVar2 = bnVar.f46185ec;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (r1Var.getMessageObject() != null) {
                        fmVar3 = new fm(this, r1Var, 4);
                    }
                    bnVar.f46185ec = fmVar3;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, bnVar.f46185ec, null, false, bnVar.getMessagesController().f25752g6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.f24073k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            if (W1 != null) {
                if (W1.attributes != null) {
                    for (int i14 = 0; i14 < W1.attributes.size(); i14++) {
                        if ((W1.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.n5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            bnVar.getOrCreateStoryViewer().L(bnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, fi.y6.a(bnVar.A0));
                            return;
                        }
                    }
                }
                if (!bnVar.Ha(W1.url, r1Var, null, messageObject.e1(), 2)) {
                    vf.b bVar3 = bnVar.f46185ec;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (r1Var.getMessageObject() != null) {
                        fmVar4 = new fm(this, r1Var, 5);
                    }
                    bnVar.f46185ec = fmVar4;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, bnVar.f46185ec, null, false, true, false, false);
                }
            }
        } else {
            if (i7 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f24073k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                vf.b bVar4 = bnVar.f46185ec;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (r1Var.getMessageObject() != null) {
                    fmVar = new fm(this, r1Var, 3);
                }
                bnVar.f46185ec = fmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    if (org.telegram.messenger.ri.d0(i10).r0(group) == null) {
                        bnVar.f46185ec.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        bnVar.f46185ec.f59502b = new ii(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.k3(3, this, z11)), 4);
                        return;
                    }
                }
                vf.c.s(bnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, bnVar.f46185ec, null, false, true, false, false);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.fj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (r1Var != null && pageBlock != null) {
            bn bnVar = this.f50079a;
            if (bnVar.getParentActivity() != null && (messageObject = r1Var.getMessageObject()) != null && (message = messageObject.f24073k) != null && messageObject.f24130y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f24130y2.f23877g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.zt ztVar = (org.telegram.messenger.zt) arrayList2.get(i7);
                    if (ztVar instanceof org.telegram.messenger.mu) {
                        arrayList.add(((org.telegram.messenger.mu) ztVar).f25934r0);
                    } else if (ztVar instanceof org.telegram.messenger.yu) {
                        arrayList.add(((org.telegram.messenger.yu) ztVar).f28281r0);
                    } else if (ztVar instanceof org.telegram.messenger.eu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.eu) ztVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.st) obj).f26950b);
                        }
                    } else if (ztVar instanceof org.telegram.messenger.qu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.qu) ztVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.st) obj2).f26950b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.J2(null, bnVar, null);
                    return p12.e2(null, null, null, null, null, null, null, indexOf, new sl(bnVar, arrayList), null, 0L, 0L, 0L, true, new rl(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        long j3;
        long j10;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                Q1(r1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            bn bnVar = this.f50079a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(bnVar)) {
                    pa0 pa0Var = new pa0(3);
                    i6Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                    pa0Var.setResourceProvider(i6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = bnVar.getMessagesController().B1(bnVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    pa0Var.V0 = false;
                    pa0Var.G0(new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, false));
                    bnVar.presentFragment(pa0Var);
                }
            } else if (org.telegram.messenger.fj.N2(messageMedia.document)) {
                ns.p().v(bnVar.getParentActivity());
                ns.p().u(new km(this, tL_messageMediaPoll, pollAnswer, r1Var));
                ns p10 = ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.fj.H2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.fj messageObject2 = r1Var.getMessageObject();
                i6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, i6Var, 200);
            } else if (org.telegram.messenger.fj.J3(messageMedia.document)) {
                org.telegram.messenger.fj fjVar = MediaController.B().f22838v0;
                if (MediaController.B().I(messageObject) && fjVar != null) {
                    boolean z12 = fjVar.m0;
                    if (i7 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(fjVar);
                            return;
                        } else {
                            MediaController.B().R(fjVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f24073k;
                TLRPC.TL_message R7 = bn.R7(message);
                R7.media = messageMedia;
                R7.attachPath = sh.d.c(i7, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i16, R7, false, true);
                if (i7 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fjVar2.m0 = z10;
                arrayList.add(fjVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, fjVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.fj.K4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.f24073k));
                    if (aVar.f57540g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        r1Var.b0();
                        return;
                    } else if (!aVar.f57539f) {
                        org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                        aVar.a();
                        r1Var.b0();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f24073k;
                        TLRPC.TL_message R72 = bn.R7(message2);
                        R72.media = messageMedia;
                        R72.attachPath = sh.d.c(i7, message2);
                        i15 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(i15, R72, false, true);
                        if (org.telegram.messenger.fj.y(messageMedia.document)) {
                            PhotoViewer.p1().J2(null, bnVar, bnVar.Ba);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i18 = fjVar3.D;
                            long j11 = 0;
                            if (i18 != 0) {
                                j3 = bnVar.f46271l6;
                            } else {
                                j3 = 0;
                            }
                            if (i18 != 0) {
                                j10 = bnVar.f46167d7;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = bnVar.b();
                            }
                            p12.f2(fjVar3, bnVar, j3, j10, j11, bnVar.f46171db);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(fjVar3, bnVar.getParentActivity(), bnVar.Ba, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bnVar.M6(fjVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f24073k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.fj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message R73 = bn.R7(message3);
                    R73.media = messageMedia3;
                    R73.attachPath = sh.d.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.fj(i13, R73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.fj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message R74 = bn.R7(message3);
                    R74.media = messageMedia2;
                    R74.attachPath = sh.d.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    R74.message = pollResults2.solution;
                    R74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.fj(i12, R74, false, true));
                    arrayList2.add(-3);
                }
                cg.d.b(tL_messageMediaPoll.poll, bnVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.fj.K4(document))) {
                        if (pollAnswer2.unshuffled_index == i7) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message R75 = bn.R7(message3);
                        R75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        R75.message = tL_textWithEntities2.text;
                        R75.entities = tL_textWithEntities2.entities;
                        R75.attachPath = sh.d.c(pollAnswer2.unshuffled_index, message3);
                        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.fj(i11, R75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f24105s0 = arrayList2;
                    PhotoViewer.p1().J2(null, bnVar, bnVar.Ba);
                    PhotoViewer.p1().b2(arrayList3, i10, bnVar.a(), 0L, 0L, bnVar.eb);
                }
            }
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bn bnVar = this.f50079a;
        if (bnVar.getParentActivity() != null) {
            if (bnVar.f46388ua == null) {
                wh.i iVar = new wh.i(bnVar.getParentActivity());
                bnVar.f46388ua = iVar;
                bnVar.f46279m1.addView(iVar, c8.na.e(-1, -1, 48));
            }
            wh.i iVar2 = bnVar.f46388ua;
            HashMap hashMap = iVar2.f60056a;
            ArrayList arrayList = iVar2.f60058c;
            arrayList.clear();
            int i7 = iVar2.d;
            org.telegram.messenger.i10 i10 = org.telegram.messenger.i10.i(i7);
            long j3 = i10.f24656n;
            arrayList.add(Long.valueOf(j3));
            if (i10.W) {
                ArrayList arrayList2 = org.telegram.messenger.ri.d0(i7).f26721j1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j10 = tL_topPeer.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.mp.u1(i7).f25904y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j11 = dialog.f28496id;
                    if (j11 != j3 && !org.telegram.messenger.n5.C(j11)) {
                        if (org.telegram.messenger.n5.E(dialog.f28496id)) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(dialog.f28496id));
                            if (c22 != null && !org.telegram.messenger.n10.u(c22) && !org.telegram.messenger.n10.y(c22) && !org.telegram.messenger.n10.B(c22.f28641id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28496id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28496id));
                                }
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-dialog.f28496id));
                            if (O0 != null && !O0.forum && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28496id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28496id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = wh.i.b(r1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    Long l10 = (Long) obj2;
                    if (hashSet.add(l10) && org.telegram.messenger.n5.E(l10.longValue())) {
                        arrayList5.add(l10);
                    }
                }
                wh.h hVar = new wh.h(iVar2, r1Var, arrayList5, new v9.b(10, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.fj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f50079a.Zc(primaryMessageObject, false);
    }

    @Override
    public final boolean r0() {
        boolean z10;
        bn bnVar = this.f50079a;
        if (!bnVar.Y9()) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r1Var) {
        float f10;
        if (r1Var.getMessageObject().y3()) {
            k1();
            return;
        }
        bn bnVar = this.f50079a;
        if (!bnVar.A3 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            if (bnVar.J2 == null) {
                int indexOfChild = bnVar.f46279m1.indexOfChild(bnVar.U);
                if (indexOfChild != -1) {
                    hi.u3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.J2 = E6;
                    E6.v(org.telegram.messenger.gd.N0(2131749136, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = r1Var.getCurrentUser();
                if (currentUser != null && currentUser.f28641id == 0) {
                    f10 = (r1Var.getMeasuredHeight() - Math.max(0, r1Var.getBottom() - ((View) r1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.P3() && r1Var.f31546k9 && r1Var.V8 != null) {
                        f10 = org.telegram.messenger.g0.L(20.0f) + L;
                    } else {
                        f10 = L;
                    }
                }
                if (bnVar.w9(r1Var, f10) > org.telegram.messenger.g0.L(80.0f)) {
                    bnVar.J2.y(bnVar.v9(r1Var, r1Var.getForwardNameCenterX()), bnVar.w9(r1Var, f10) - org.telegram.messenger.g0.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void t(org.telegram.ui.Cells.r1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.t(org.telegram.ui.Cells.r1):void");
    }

    @Override
    public final void t0(String str) {
        bn bnVar = this.f50079a;
        vj vjVar = bnVar.f46162d1;
        if (vjVar == null || vjVar.getVisibility() != 0) {
            uj ujVar = bnVar.T;
            if ((ujVar == null || ujVar.getVisibility() != 0) && bnVar.f46118a0 != null && str != null && str.length() > 0) {
                rj rjVar = bnVar.f46118a0;
                rjVar.setFieldText("@" + str + " ");
                bnVar.f46118a0.j1();
            }
        }
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        wh.h hVar;
        int i7;
        boolean z10;
        boolean z11;
        float f12;
        wh.i iVar = this.f50079a.f46388ua;
        if (iVar != null && (hVar = (wh.h) iVar.f60056a.get(wh.i.b(r1Var))) != null) {
            wh.d[] dVarArr = hVar.f60054x;
            RectF rectF = hVar.f60051r;
            if (hVar.N) {
                float f13 = (f10 - rectF.left) + hVar.V;
                float f14 = (f11 - rectF.top) + hVar.W;
                int i10 = wh.g.f60036a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.f60036a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i7 = c8.m9.b(floor, 0, dVarArr.length - 1);
                } else {
                    i7 = -1;
                }
                if (hVar.S != i7) {
                    hVar.f60043a.performHapticFeedback(3, 1);
                    hVar.S = i7;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        wh.d dVar = dVarArr[i11];
                        if (i7 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f60014p != z10) {
                            ValueAnimator valueAnimator = dVar.f60012n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f60014p = z10;
                            float f16 = dVar.f60013o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f60012n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f60012n.addUpdateListener(dVar);
                            dVar.f60012n.setInterpolator(wh.f.f60018a);
                            dVar.f60012n.start();
                        }
                        wh.d dVar2 = dVarArr[i11];
                        if (i7 != i11 && i7 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f60011m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f60009k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f60011m = z11;
                            float f17 = dVar2.f60010l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f60009k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f60009k.addUpdateListener(dVar2);
                            dVar2.f60009k.setInterpolator(wh.f.f60018a);
                            dVar2.f60009k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void u2() {
        this.f50079a.O9();
    }

    @Override
    public final boolean v0(org.telegram.ui.Components.x5 x5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        bn bnVar = this.f50079a;
        if (!bnVar.getMessagesController().K3() && x5Var != null && !x5Var.standard) {
            long documentId = x5Var.getDocumentId();
            TLRPC.Document document = x5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                document = org.telegram.ui.Components.o5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.fj.i1(document)) != null) {
                org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).o0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.bv bvVar = new org.telegram.ui.Components.bv(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                org.telegram.ui.Components.tu tuVar = bvVar.f33819q1;
                tuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(tuVar);
                tuVar.f40165w = imageReceiver;
                if (tuVar.d) {
                    imageReceiver.Q();
                }
                tuVar.f40166x = true;
                tuVar.f40167y.e(true, 1.0f);
                tuVar.f40165w.s0(org.telegram.messenger.fc.b(document), "140_140", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, true), 0L, null, null, 0);
                tuVar.f40165w.F0(7);
                ImageReceiver imageReceiver2 = tuVar.f40165w;
                imageReceiver2.f22764v0 = true;
                imageReceiver2.f22762u0 = true;
                imageReceiver2.X(1);
                ImageReceiver imageReceiver3 = tuVar.f40165w;
                imageReceiver3.f22770x0 = true;
                imageReceiver3.I0(tuVar);
                boolean V9 = bnVar.V9();
                bvVar.f30244i0 = V9;
                bvVar.f30251n = V9;
                bnVar.showDialog(bvVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f50079a.n8(r1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void x() {
        this.f50079a.Fc();
    }

    @Override
    public final void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        bn bnVar = this.f50079a;
        bnVar.Y7(r1Var, false, false, f10, f11, true, false, false);
        bnVar.A0.getClass();
        bn.l2(bnVar, RecyclerView.R(r1Var));
    }

    @Override
    public final boolean x1() {
        bn bnVar = this.f50079a;
        if (bnVar.f46279m1.getMeasuredWidth() > bnVar.f46279m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        if (i7 != 16 && i7 != 2131296267 && i7 != 2131296264) {
            return false;
        }
        bn bnVar = this.f50079a;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10 && bnVar.f46210ga) {
            r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                ((ActionBarLayout) r4Var2).r();
            }
            return true;
        }
        return !d();
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        bn bnVar = this.f50079a;
        if (bnVar.f46130ac != 0 && r1Var.getMessageObject() != null && bnVar.f46130ac == r1Var.getMessageObject().e1() && bnVar.f46145bc == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void z2() {
        bn bnVar = this.f50079a;
        if (bnVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46271l6);
            bundle.putInt("start_from", 10);
            bnVar.presentFragment(new org.telegram.ui.Components.h90(bundle, bnVar.f46315p1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.kc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.H(',', "UnlockSimilarChannelsPremium", bnVar.getMessagesController().A4), new ul(this, 4))).j();
    }
}
