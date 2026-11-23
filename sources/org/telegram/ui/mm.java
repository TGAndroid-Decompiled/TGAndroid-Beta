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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.UndoView;
public final class mm implements org.telegram.ui.Cells.m1 {
    public final bn f49941a;

    public mm(bn bnVar) {
        this.f49941a = bnVar;
    }

    @Override
    public final void A0() {
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.c6 m10;
        bn bnVar = this.f49941a;
        if (!bnVar.A3 && !org.telegram.messenger.cz.A0 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            hi.l3 l3Var = bnVar.I2;
            if (l3Var == null || !l3Var.W) {
                if (l3Var == null) {
                    int indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.U);
                    if (indexOfChild != -1) {
                        hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                        bnVar.I2 = E6;
                        E6.d = 10000L;
                        E6.m(bnVar.getParentActivity().getResources().getDrawable(2131232789).mutate());
                        bnVar.I2.v(org.telegram.messenger.hd.N0(2131753759, null));
                    } else {
                        return;
                    }
                }
                int childCount = bnVar.A0.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = bnVar.A0.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.r1) && (messageObject = (r1Var = (org.telegram.ui.Cells.r1) childAt).getMessageObject()) != null && org.telegram.messenger.gj.L4(messageObject.f24213k) && (m10 = r1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !bnVar.I2.W) {
                        ImageReceiver photoImage = r1Var.getPhotoImage();
                        float w92 = bnVar.w9(r1Var, photoImage.M0);
                        float f10 = photoImage.O0;
                        View view = (View) r1Var.getParent();
                        float w93 = bnVar.w9(r1Var, -r1Var.getTop());
                        if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            bnVar.Lb = r1Var;
                            hi.l3 l3Var2 = bnVar.I2;
                            l3Var2.f14988r0 = new af(bnVar, 22);
                            l3Var2.y(bnVar.v9(r1Var, r1Var.getNoSoundIconCenterX()), w92, true);
                            org.telegram.messenger.cz.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Y5();
            messageObject.M1 = true;
            r1Var.H1();
            r1Var.requestLayout();
            this.f49941a.D0.R(messageObject, false, false);
        }
    }

    @Override
    public final void B0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        bn bnVar = this.f49941a;
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
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28434id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f28583id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 2, bnVar.getParentActivity(), bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
                y0Var.j(org.telegram.messenger.hd.N0(2131747617, null), 2131232090, null);
                y0Var.setMinimumWidth(160);
                y0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(bnVar.getParentActivity(), false, false);
                y0Var2.j(org.telegram.messenger.hd.N0(2131746466, null), 2131232046, null);
                y0Var2.setMinimumWidth(160);
                y0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, r1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                bn bnVar2 = new bn(bundle);
                bnVar2.f46042ga = true;
                bnVar.presentFragmentAsPreviewWithMenu(bnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                bnVar.s7();
                return;
            }
            bnVar.presentFragment(new bn(bundle));
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, false, z11);
    }

    @Override
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        int i7 = messageObject.D;
        bn bnVar = this.f49941a;
        if (i7 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f24213k.action;
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
            TLRPC.User user = bnVar.f46019f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = bnVar.f46194s8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.b2.m(user, J4, i10, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f46019f.f28583id), bnVar.getAccountInstance());
                return;
            }
            return;
        }
        bnVar.Y7(r1Var, true, false, f10, f11, messageObject.I3(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.r1 r1Var) {
        bn.f5(this.f49941a, r1Var);
    }

    @Override
    public final void E(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f49941a;
        if (!bnVar.getMessagesController().e5()) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), null);
            t1Var.r(200L);
            bnVar.getMessagesController().T0(new x(this, t1Var, r1Var, 6));
            return;
        }
        if (r1Var.getMessageObject() != null) {
            r1Var.getMessageObject().f24251t2 = Boolean.FALSE;
        }
        r1Var.J3();
    }

    @Override
    public final void F0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject;
        if (r1Var != null && (messageObject = r1Var.getMessageObject()) != null && messageObject.f24213k != null) {
            int e12 = messageObject.e1();
            bn bnVar = this.f49941a;
            if (bnVar.f45962ac != e12 || bnVar.f45977bc != 7) {
                TLRPC.InputPeer l1 = bnVar.getMessagesController().l1(org.telegram.messenger.gj.B0(messageObject.f24213k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = l1;
                getrichmessage.f28656id = e12;
                vf.b bVar = bnVar.f46017ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f46017ec = null;
                }
                hi hiVar = new hi(bnVar, e12, r1Var, 2);
                hiVar.f59417b = new u8(22, bnVar, r3);
                bnVar.f46017ec = hiVar;
                hiVar.d();
                int[] iArr = {bnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new ne(bnVar, hiVar, iArr, r1Var, messageObject, 2))};
            }
        }
    }

    @Override
    public final void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        f(r1Var, z10, false, false);
    }

    @Override
    public final void H0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
        f(r1Var, z10, true, z11);
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
        bn bnVar = this.f49941a;
        if (!isEmpty && bnVar.f46005e != null && (((vjVar = bnVar.f45994d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        TLRPC.Chat chat2 = bnVar.f46005e;
        if (chat2 != null && ((bnVar.f46191s4 == 0 || bnVar.f46254x4) && (!org.telegram.messenger.v3.T(chat2) || bnVar.f46005e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = bnVar.f46005e;
        if (chat3 != null && chat3.f28434id == chat.f28434id && !bnVar.fa()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i7 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f46422e;
            } else {
                c5Var = c5.f46423f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i7 != 0) {
            c5VarArr[i12] = c5.f46424n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f46425r;
        }
        TLRPC.ChatFull P0 = bnVar.getMessagesController().P0(chat.f28434id);
        if (P0 == null) {
            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.f24968t0, 0, chat);
            org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.k10.f24968t0, 1, chat);
            if (m11 != null && (m11.f24120k instanceof TLRPC.TL_photoStrippedSize)) {
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
            w4Var = new w4(m10, m11, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, org.telegram.messenger.ls.T, chat));
        } else {
            w4Var = w4.a(chat, P0, c5VarArr);
            i14 = i7;
            i15 = i10;
            z10 = true;
            str2 = null;
            z11 = i11;
        }
        if (ab.q.h(w4Var)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, w4Var, new z6(this, chat, r1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
        I.c(2131232268, org.telegram.messenger.hd.N0(2131747592, str2), new xl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = 2131232090;
        } else {
            i16 = 2131232115;
        }
        if (z12) {
            i17 = 2131747617;
        } else {
            i17 = 2131747605;
        }
        I.l(i16, org.telegram.messenger.hd.N0(i17, str2), new o1(this, r1Var, chat, 25), z11);
        I.l(2131232224, org.telegram.messenger.hd.N0(2131748416, str2), new xl(this, chat, z10 ? 1 : 0), i14);
        I.l(2131232356, org.telegram.messenger.hd.N0(2131753755, str2), new xl(this, chat, 2), i15);
        I.f33399t = false;
        I.f33378i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void I(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f24213k) != null) {
            int i12 = p2Var.f26261a;
            TL_stars.StarsAmount starsAmount = null;
            bn bnVar = this.f49941a;
            if (i12 == 1) {
                long o4 = org.telegram.messenger.n5.o(message.from_id);
                li.d dVar = new li.d(24, this, message);
                Pattern pattern = org.telegram.ui.Components.c5.f34013a;
                Activity parentActivity = bnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String N0 = org.telegram.messenger.hd.N0(2131744144, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131744143, org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).D1(o4, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.t6.U(editText, org.telegram.ui.ActionBar.m6.G6, null);
                editText.setHint(org.telegram.messenger.hd.N0(2131744142, null));
                org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.m6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.t4(parentActivity)});
                if (org.telegram.messenger.hd.f24444a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.hd.f24444a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751592, null), new oi.f0(28, dVar, editText));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                t1Var.O = new org.telegram.ui.Components.r1(editText, 0);
                frameLayout.addView(editText, c8.ma.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.og(editText, 3), 100L);
                bnVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    boolean A = org.telegram.messenger.v3.A(i7, bnVar.f46005e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        org.telegram.messenger.v3.A(i10, bnVar.f46005e, 5);
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
                bnVar.f46034g2.n(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.Message message = messageObject.f24213k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.g6(true);
        bn bnVar = this.f49941a;
        bnVar.getMessagesStorage().X1(org.telegram.messenger.gj.B0(messageObject.f24213k), messageObject.f24213k);
        bnVar.getMessagesController().f25986v7.h(messageObject, true, false);
        f(r1Var, true, false, true);
    }

    @Override
    public final void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bn bnVar = this.f49941a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f45994d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.w2 w2Var = new org.telegram.ui.ActionBar.w2(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.h6) bnVar.Ba, false);
                        w2Var.O();
                        w2Var.P = str;
                        w2Var.Q = false;
                        w2Var.R = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.N0(2131751755, null)};
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
    public final boolean J1() {
        bn bnVar = this.f49941a;
        if (bnVar.f46111m1.getKeyboardHeight() + bnVar.La >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f49941a;
        bnVar.Ua.k(r1Var, bnVar, true);
        bnVar.A0.I0(false);
    }

    @Override
    public final void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        boolean z10 = r1Var.getMessageObject().f24213k.media instanceof TLRPC.TL_messageMediaGiveaway;
        bn bnVar = this.f49941a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) r1Var.getMessageObject().f24213k.media).channels.get(i7).longValue();
            if (bnVar.f46103l6 != j3) {
                bnVar.presentFragment(bn.ua(j3));
            } else {
                bnVar.f46147p1.e(false, false);
            }
        }
        if (r1Var.getMessageObject().f24213k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            bnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) r1Var.getMessageObject().f24213k.media).winners.get(i7).longValue()));
        }
    }

    @Override
    public final void L(org.telegram.messenger.dj djVar) {
        StaticLayout staticLayout = djVar.f23561e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = djVar.f23561e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new qi.g(djVar.L, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.o10.t(null, 2131752010, org.telegram.ui.Components.lc.b0(this.f49941a));
        }
    }

    @Override
    public final boolean L0(long j3) {
        TLRPC.ChatFull P0;
        bn bnVar = this.f49941a;
        TLRPC.Chat chat = bnVar.f46005e;
        if (chat == null || org.telegram.messenger.v3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = bnVar.getMessagesController();
        long j10 = bnVar.f46005e.f28434id;
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
    public final void L1(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        bn bnVar = this.f49941a;
        bnVar.f46228v5 = messageObject;
        bnVar.C9();
    }

    @Override
    public final void N(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
        int i7;
        if (r1Var != null && document != null) {
            bn bnVar = this.f49941a;
            if (bnVar.getParentLayout() != null && d0(r1Var)) {
                boolean J3 = org.telegram.messenger.gj.J3(document);
                r1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
                if (J3) {
                    i7 = 2131745715;
                } else {
                    i7 = 2131745735;
                }
                I.c(2131232116, org.telegram.messenger.hd.N0(i7, null), new o1(this, r1Var, document, 26), false);
                I.f33391p = new yl(r1Var, rectF, 0);
                I.a0();
            }
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj gjVar;
        long j3;
        int i7;
        ArrayList arrayList;
        bi.q2 q2Var;
        org.telegram.messenger.bj bjVar;
        int i10;
        bn bnVar = this.f49941a;
        wh.i iVar = bnVar.f46220ua;
        if (iVar != null) {
            HashMap hashMap = iVar.f59973a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(r1Var));
            org.telegram.ui.Components.gc gcVar = null;
            if (hVar != null) {
                gjVar = hVar.F;
            } else {
                gjVar = null;
            }
            wh.h hVar2 = (wh.h) bnVar.f46220ua.f59973a.get(wh.i.b(r1Var));
            if (hVar2 != null && (i10 = hVar2.S) != -1) {
                j3 = hVar2.f59971x[i10].d;
            } else {
                j3 = 0;
            }
            if (gjVar != null && j3 != 0) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.c5.h(parentActivity, i7, j3, false)) {
                    if (gjVar.c1() != 0 && (bjVar = (org.telegram.messenger.bj) bnVar.P6.f(gjVar.c1())) != null) {
                        arrayList = bjVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f3.i(gjVar);
                    }
                    if (j3 == org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f24987n) {
                        z10 = true;
                    }
                    long j10 = j3;
                    bi.q2 q2Var2 = new bi.q2(this, arrayList, j10, 18);
                    if (z10) {
                        q2Var2.run();
                        q2Var = null;
                    } else {
                        q2Var = q2Var2;
                    }
                    gcVar = org.telegram.ui.Components.lc.v(bnVar.getParentActivity(), bnVar, null, 1, j10, 1, bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.wj), bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.yj), 5000, false, q2Var);
                    gcVar.f35528k = true;
                    gcVar.k(gcVar.f35523e instanceof org.telegram.ui.Components.rb);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(r1Var));
            if (hVar3 != null) {
                if (gcVar == null) {
                    hVar3.S = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.lb lbVar = gcVar.f35523e;
                if (!(lbVar instanceof org.telegram.ui.Components.ob)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) lbVar;
                hVar3.X = obVar;
                obVar.f38156a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new pw(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void O0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        bn bnVar = this.f49941a;
        bnVar.getSendMessagesHelper().n0(true, r1Var.getMessageObject(), keyboardInlineButton, null, null, bnVar);
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
        this.f49941a.f46186s.put(gjVar, Boolean.TRUE);
    }

    @Override
    public final void P(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject.f24213k.send_state != 0) {
            this.f49941a.getSendMessagesHelper().g(messageObject);
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
        bn bnVar = this.f49941a;
        vf.b bVar = bnVar.f46017ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (r1Var.getMessageObject() == null) {
            imVar = null;
        } else {
            imVar = new im(this, r1Var);
        }
        bnVar.f46017ec = imVar;
        if (!z11 && !vf.c.g(parse, false, null)) {
            org.telegram.ui.Components.c5.o0(bnVar, str, true, true, true, !z11, bnVar.f46017ec, webPage, bnVar.Ba);
        } else {
            vf.c.s(bnVar.getParentActivity(), parse, true, true, false, bnVar.f46017ec, null, false, true, false, false);
        }
    }

    @Override
    public final void R(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.gj.L4(gjVar.f24213k)) {
            this.f49941a.Lb(gjVar, true);
        }
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() != null && (i7 = (bnVar = this.f49941a).f45962ac) != 0 && i7 == r1Var.getMessageObject().e1() && bnVar.f45977bc == 1) {
            return bnVar.f45991cc;
        }
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.r1 r1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        TLRPC.Peer peer;
        int i7;
        TLRPC.Peer peer2;
        int i10;
        boolean l32 = org.telegram.messenger.gj.l3(r1Var.getMessageObject().f24213k);
        bn bnVar = this.f49941a;
        if (l32) {
            TLRPC.Message message = r1Var.getMessageObject().f24213k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long o4 = org.telegram.messenger.n5.o(peer2);
            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b02.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743844, org.telegram.messenger.n5.l(i10, o4)))).k(true);
            return false;
        } else if (!r1Var.getMessageObject().q()) {
            TLRPC.Message message2 = r1Var.getMessageObject().f24213k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long o10 = org.telegram.messenger.n5.o(peer);
            org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(bnVar);
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            b03.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131743845, org.telegram.messenger.n5.l(i7, o10)))).k(true);
            return false;
        } else if (!bnVar.getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.N0(2131743821, null), new ul(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.v3.M(bnVar.f46005e, bnVar.f46181r8, true);
            final org.telegram.messenger.az sendMessagesHelper = bnVar.getSendMessagesHelper();
            final org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.gj.B0(messageObject.f24213k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.f28581id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().l1(org.telegram.messenger.gj.B0(messageObject.f24213k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f28581id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f28581id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    az azVar = az.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final ur messagesStorage = azVar.getMessagesStorage();
                        gj gjVar = messageObject;
                        final long B0 = gj.B0(gjVar.f24213k);
                        final int e12 = gjVar.e1();
                        final int i11 = todoItem.f28581id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        q5 q5Var = messagesStorage.f27250a;
                        final long j3 = M;
                        q5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.br.run():void");
                            }
                        });
                        azVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    }
                    g0.g3(new di.x7(azVar, hash, z11, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            bn bnVar = this.f49941a;
            org.telegram.ui.Components.iu.O0(bnVar, gjVar, bnVar.f46003db, str2, str3, str4, str, i7, i10, -1, bnVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean T() {
        bn bnVar = this.f49941a;
        if (bnVar.f46139o6[1].size() + bnVar.f46139o6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        this.f49941a.l8(characterStyle, z10, r1Var.getMessageObject(), r1Var);
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.gj gjVar) {
        he heVar;
        bi.q2 q2Var;
        boolean z10;
        org.telegram.ui.ActionBar.h6 h6Var;
        long j3;
        ai.l0 l0Var;
        int i7;
        boolean z11;
        int i10;
        sz0 sz0Var;
        int i11;
        float f10;
        int i12;
        long j10;
        ArrayList arrayList = null;
        if (!gjVar.S4() && !gjVar.g4()) {
            if (!org.telegram.messenger.gj.R4(gjVar.f24213k) && !gjVar.h4()) {
                if (gjVar.I3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f49941a.D0.L();
                    bn bnVar = this.f49941a;
                    long j11 = bnVar.f45999d7;
                    boolean z12 = true ^ bnVar.D0.O;
                    if (bnVar.f46254x4) {
                        j10 = bnVar.d();
                    } else {
                        j10 = 0;
                    }
                    return B.o0(L, gjVar, j11, z12, null, j10);
                }
            } else {
                boolean S = MediaController.B().S(gjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f49941a.i8(gjVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            uz0 uz0Var = this.f49941a.f46247wa;
            if (uz0Var == null || uz0Var.f52662c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f26931b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!gjVar.P3()) {
                            org.telegram.ui.Components.lc.b0(this.f49941a).w(2131232789, org.telegram.messenger.hd.N0(2131743268, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f49941a.f46247wa = new uz0(this.f49941a.getParentActivity());
                uz0 uz0Var2 = this.f49941a.f46247wa;
                if (!gjVar.P3()) {
                    heVar = this.f49941a.Lb(gjVar, true);
                } else {
                    heVar = null;
                }
                if (!gjVar.P3()) {
                    q2Var = bn.a5(this.f49941a, gjVar);
                } else {
                    q2Var = null;
                }
                Context context = uz0Var2.f52657a;
                ai.l0 l0Var2 = uz0Var2.f52661c;
                uz0Var2.Y = heVar;
                uz0Var2.Z = q2Var;
                sz0 sz0Var2 = uz0Var2.O;
                if (sz0Var2 != null) {
                    l0Var2.removeView(sz0Var2);
                    uz0Var2.O = null;
                }
                uz0Var2.P = r1Var;
                org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                uz0Var2.N = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uz0Var2.T = z10;
                org.telegram.ui.Cells.r1 r1Var2 = uz0Var2.P;
                if (r1Var2 != null) {
                    h6Var = r1Var2.getResourcesProvider();
                } else {
                    h6Var = null;
                }
                uz0Var2.M = h6Var;
                if (uz0Var2.P != null) {
                    uz0Var2.U = 0.0f;
                    uz0Var2.V = r1Var.f31524n;
                    if (r1Var.getParent() instanceof View) {
                        View view = (View) r1Var.getParent();
                        uz0Var2.U = view.getY() + uz0Var2.U;
                        uz0Var2.V = view.getY() + uz0Var2.V;
                    }
                    int width = uz0Var2.P.getWidth();
                    int height = uz0Var2.P.getHeight();
                    if (uz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f24046q.y));
                    }
                    uz0Var2.L = height - uz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f24045p);
                    j3 = 0;
                    int i13 = height;
                    l0Var = l0Var2;
                    sz0 sz0Var3 = new sz0(uz0Var2, uz0Var2.getContext(), org.telegram.messenger.k10.f24968t0, uz0Var2.P.getResourcesProvider(), width, i13);
                    uz0Var2.O = sz0Var3;
                    uz0Var2.P.t0(sz0Var3);
                    uz0Var2.O.s0(uz0Var2.P);
                    uz0Var2.O.setDelegate(new w7.s(19));
                    sz0 sz0Var4 = uz0Var2.O;
                    org.telegram.messenger.gj gjVar2 = uz0Var2.N;
                    org.telegram.messenger.bj currentMessagesGroup = uz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.r1 r1Var3 = uz0Var2.P;
                    sz0Var4.y3(gjVar2, currentMessagesGroup, r1Var3.G, r1Var3.F, false, false);
                    if (!uz0Var2.T) {
                        org.telegram.ui.Components.g8 g8Var = new org.telegram.ui.Components.g8();
                        uz0Var2.W = g8Var;
                        sz0 sz0Var5 = uz0Var2.O;
                        g8Var.f35457i = sz0Var5;
                        sz0Var5.wc = g8Var;
                        if (sz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.en0 seekBarWaveform = uz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = uz0Var2.f52670s;
                            org.telegram.ui.Cells.r1 r1Var4 = seekBarWaveform.f34927n;
                            if (r1Var4 != null) {
                                r1Var4.invalidate();
                            }
                        }
                    }
                    uz0Var2.I = false;
                    l0Var.addView(uz0Var2.O, new FrameLayout.LayoutParams(uz0Var2.P.getWidth(), i13, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    l0Var = l0Var2;
                    i7 = 360;
                }
                TextureView textureView = uz0Var2.Q;
                if (textureView != null) {
                    l0Var.removeView(textureView);
                    uz0Var2.Q = null;
                }
                if (uz0Var2.T) {
                    uz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    uz0Var2.Q = textureView2;
                    l0Var.addView(textureView2, 0, c8.ma.c(i7, i7));
                }
                org.telegram.ui.Components.i61 i61Var = MediaController.B().f22747j0;
                if (i61Var != null) {
                    i61Var.g0();
                }
                org.telegram.ui.Components.i61 i61Var2 = uz0Var2.f52672x;
                if (i61Var2 != null) {
                    i61Var2.g0();
                    uz0Var2.f52672x.m0();
                    uz0Var2.f52672x = null;
                }
                org.telegram.ui.Cells.r1 r1Var5 = uz0Var2.P;
                if (r1Var5 != null && r1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(uz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(uz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(uz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(uz0Var2.P.getMessageObject().f24213k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && uz0Var2.P.getMessageObject().f24213k.attachPath != null) {
                        I = new File(uz0Var2.P.getMessageObject().f24213k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.i61 i61Var3 = new org.telegram.ui.Components.i61();
                        uz0Var2.f52672x = i61Var3;
                        i61Var3.K = new tz0(uz0Var2);
                        if (uz0Var2.W != null) {
                            i61Var3.L = new tz0(uz0Var2);
                        }
                        if (uz0Var2.T) {
                            i61Var3.A0(uz0Var2.Q);
                        }
                        uz0Var2.f52672x.j0(Uri.fromFile(I), "other");
                        uz0Var2.f52672x.h0();
                        org.telegram.ui.Components.ys ysVar = uz0Var2.F;
                        if (ysVar != null) {
                            ysVar.f42509s = uz0Var2.f52672x;
                            ysVar.a();
                        }
                    }
                    bn bnVar2 = this.f49941a;
                    bnVar2.showDialog(bnVar2.f46247wa);
                    return false;
                }
                hi.l3 l3Var = uz0Var2.f52673y;
                if (l3Var != null) {
                    l0Var.removeView(l3Var);
                    uz0Var2.f52673y = null;
                }
                org.telegram.messenger.gj gjVar3 = uz0Var2.N;
                if (gjVar3 != null && gjVar3.P3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.gj gjVar4 = uz0Var2.N;
                if (gjVar4 != null && org.telegram.messenger.gj.B0(gjVar4.f24213k) != org.telegram.messenger.k10.i(uz0Var2.N.K1).e()) {
                    hi.l3 l3Var2 = new hi.l3(context, 3);
                    uz0Var2.f52673y = l3Var2;
                    l3Var2.r(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.gj.B0(uz0Var2.N.f24213k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User c22 = org.telegram.messenger.np.u1(uz0Var2.N.K1).c2(Long.valueOf(B0));
                            if (c22 != null) {
                                str = org.telegram.messenger.p10.k(c22, true);
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.np.u1(uz0Var2.N.K1).O0(Long.valueOf(-B0));
                            if (O0 != null) {
                                str = O0.title;
                            }
                        }
                        hi.l3 l3Var3 = uz0Var2.f52673y;
                        if (uz0Var2.T) {
                            i12 = 2131743345;
                        } else {
                            i12 = 2131743269;
                        }
                        l3Var3.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i12, str)));
                    } else {
                        hi.l3 l3Var4 = uz0Var2.f52673y;
                        if (uz0Var2.T) {
                            i11 = 2131743346;
                        } else {
                            i11 = 2131743270;
                        }
                        l3Var4.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(i11, null)));
                    }
                    uz0Var2.f52673y.s(12.0f);
                    hi.l3 l3Var5 = uz0Var2.f52673y;
                    if (!z11 && !uz0Var2.P.G) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    l3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (uz0Var2.T) {
                        uz0Var2.f52673y.p(0.5f, 0.0f);
                        uz0Var2.f52673y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        uz0Var2.f52673y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        uz0Var2.f52673y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    uz0Var2.f52673y.w(14.0f);
                    hi.l3 l3Var6 = uz0Var2.f52673y;
                    l3Var6.h = hi.l3.a(l3Var6.getText(), uz0Var2.f52673y.getTextPaint());
                    if (uz0Var2.T) {
                        l0Var.addView(uz0Var2.f52673y, c8.ma.d((int) ((uz0Var2.P.getWidth() / org.telegram.messenger.g0.f24045p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((uz0Var2.P.getHeight() + uz0Var2.L) / org.telegram.messenger.g0.f24045p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        l0Var.addView(uz0Var2.f52673y, c8.ma.d((int) ((uz0Var2.P.getWidth() / org.telegram.messenger.g0.f24045p) * 0.6f), 150.0f, 17, ((((uz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + uz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.f24045p) + 1.0f, ((-75.0f) - ((uz0Var2.P.getHeight() / org.telegram.messenger.g0.f24045p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    uz0Var2.f52673y.x();
                }
                TextView textView = uz0Var2.E;
                if (textView != null) {
                    l0Var.removeView(textView);
                    uz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                uz0Var2.E = textView2;
                textView2.setTextColor(-1);
                uz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    uz0Var2.E.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    uz0Var2.E.setBackground(org.telegram.ui.ActionBar.m6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                uz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ra.a(uz0Var2.E);
                TextView textView3 = uz0Var2.E;
                if (z11) {
                    i10 = 2131743274;
                } else {
                    i10 = 2131743271;
                }
                textView3.setText(org.telegram.messenger.hd.N0(i10, null));
                uz0Var2.E.setOnClickListener(new qz0(uz0Var2, 1));
                l0Var.addView(uz0Var2.E, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (sz0Var = uz0Var2.O) != null && sz0Var.getMessageObject() != null && uz0Var2.O.getMessageObject().f24213k != null) {
                    uz0Var2.O.getMessageObject().f24213k.media_unread = false;
                    uz0Var2.O.invalidate();
                }
                bn bnVar22 = this.f49941a;
                bnVar22.showDialog(bnVar22.f46247wa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        if (r1Var != null) {
            bn bnVar = this.f49941a;
            if (bnVar.getParentActivity() != null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (org.telegram.messenger.np.u1(i7).B4() && (messageObject = r1Var.getMessageObject()) != null && (message = messageObject.f24213k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(bnVar.f46005e);
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
    public final void U1() {
        org.telegram.ui.ActionBar.h6 h6Var;
        bn bnVar = this.f49941a;
        if (bnVar.f46111m1 != null && bnVar.getParentActivity() != null) {
            Context context = bnVar.f46111m1.getContext();
            h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
            uy0.e1(context, bnVar, false, h6Var, null);
        }
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.r1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.V0(org.telegram.ui.Cells.r1, boolean):boolean");
    }

    @Override
    public final boolean W() {
        bn bnVar = this.f49941a;
        if (!org.telegram.messenger.p10.A(bnVar.f46019f) && !org.telegram.messenger.p10.C(bnVar.f46019f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar = this.f49941a;
        bnVar.getNotificationCenter().k(org.telegram.messenger.ls.f25362p3, Long.valueOf(bnVar.f46103l6), r1Var);
    }

    @Override
    public final void X(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj messageObject;
        if (chat == null) {
            return;
        }
        bn bnVar = this.f49941a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (!kVar.x() && !bnVar.Y9()) {
            if (!z10 && chat.signature_profiles && (messageObject = r1Var.getMessageObject()) != null && org.telegram.messenger.gj.B0(messageObject.f24213k) != 1271266957) {
                bnVar.Qa(org.telegram.messenger.n5.o(messageObject.f24213k.from_id));
                return;
            } else {
                j(r1Var, chat, i7, z10);
                return;
            }
        }
        bn.k2(bnVar, r1Var, true, f10, f11);
    }

    @Override
    public final void X0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f24213k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String O0 = org.telegram.messenger.hd.O0("PsaMessageInfo_" + messageObject.f24213k.fwd_from.psa_type);
            if (TextUtils.isEmpty(O0)) {
                O0 = org.telegram.messenger.hd.N0(2131746398, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
            org.telegram.messenger.gj.d(spannableStringBuilder, false);
            org.telegram.messenger.bj currentMessagesGroup = r1Var.getCurrentMessagesGroup();
            bn bnVar = this.f49941a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f23113e;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.yi) arrayList.get(i7)).f28101l & 1) != 0) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) currentMessagesGroup.d.get(i7);
                        if (gjVar != messageObject) {
                            int childCount = bnVar.A0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = bnVar.A0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                                    if (gjVar.T(r1Var2.getMessageObject())) {
                                        r1Var = r1Var2;
                                    }
                                }
                            }
                            messageObject = gjVar;
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
    public final void X1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        ai.c1 c1Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            bn bnVar = this.f49941a;
            vf.b bVar = bnVar.f46017ec;
            if (bVar != null) {
                bVar.a(true);
                bnVar.f46017ec = null;
            }
            if (r1Var.getMessageObject() == null) {
                bnVar.f46017ec = null;
                hiVar = null;
            } else {
                hiVar = new hi(bnVar, r1Var.getMessageObject().e1(), r1Var, 1);
                bnVar.f46017ec = hiVar;
            }
            i7 = ((org.telegram.ui.ActionBar.g2) this.f49941a).currentAccount;
            di.y8 y10 = di.y8.y(i7, false);
            Objects.requireNonNull(hiVar);
            bh bhVar = new bh(hiVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26931b;
            }
            org.telegram.ui.ActionBar.h6 I = di.y8.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.gj.B0(messageObject.f24213k);
                int e12 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.np.u1(y10.f10085a).l1(B0);
                tL_inputInvoiceMessage.msg_id = e12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = ki.s2.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                c1Var = new ai.c1(y10, ConnectionsManager.getInstance(y10.f10085a).sendRequest(tL_payments_getPaymentForm, new bi.k2(y10, messageObject, tL_inputInvoiceMessage, bhVar, 3)), 6);
            }
            if (c1Var != null) {
                hiVar.f59417b = c1Var;
                hiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f24213k;
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
                    arrayList.add(new org.telegram.messenger.gj(messageObject.K1, R7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer p12 = PhotoViewer.p1();
                bn bnVar2 = this.f49941a;
                p12.I2(null, bnVar2, bnVar2.Ba);
                PhotoViewer.p1().a2(arrayList, i10, this.f49941a.a(), 0L, 0L, this.f49941a.eb);
            }
        }
    }

    @Override
    public final void Y(org.telegram.ui.Cells.r1 r1Var) {
        f(r1Var, true, true, false);
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.cp cpVar;
        Integer num;
        org.telegram.messenger.gc b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        bn bnVar = this.f49941a;
        if (isEmpty) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            ug.h1 h1Var = new ug.h1(bnVar, i7, user, null, null, bnVar.Ba);
            r1Var.getLocationOnScreen(new int[2]);
            h1Var.f58732r2 = r1Var.getNameStatusX();
            h1Var.f58733s2 = r1Var.getNameStatusY();
            h1Var.f58736v2 = r1Var.getScaleX();
            h1Var.f58734t2 = r1Var.getLeft();
            h1Var.f58735u2 = r1Var.getTop();
            h1Var.f58737w2 = r1Var;
            int f10 = org.telegram.messenger.p10.f(user);
            if (f10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(i10).f25966t4;
                if (dpVar != null) {
                    cpVar = dpVar.d(f10);
                } else {
                    cpVar = null;
                }
                if (cpVar != null) {
                    num = Integer.valueOf(cpVar.f());
                } else {
                    num = null;
                }
                h1Var.f58731q2 = num;
            } else {
                h1Var.f58731q2 = Integer.valueOf(bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29642r8[f10]));
            }
            org.telegram.ui.Components.n5 n5Var = r1Var.f31575qa;
            if (n5Var != null && (n5Var.f37777f[0] instanceof org.telegram.ui.Components.p5)) {
                h1Var.f58736v2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(bnVar.getParentActivity());
                    org.telegram.messenger.mz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29546m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.gc.b(document);
                        if (d != null) {
                            d.f25692e = 512;
                            d.f25693f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                            d.f25692e = 512;
                            d.f25693f = 512;
                        }
                        b10 = org.telegram.messenger.gc.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.gc gcVar = b10;
                    String str3 = str2;
                    q9Var.setLayerNum(7);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    q9Var.m(gcVar, str3, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.gj.C4(document)) {
                        Integer num2 = h1Var.f58731q2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29716v6);
                        }
                        q9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        h1Var.f58739y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        h1Var.f58739y2 = org.telegram.messenger.gj.i1(document);
                    }
                    h1Var.f58738x2 = q9Var;
                    h1Var.A2 = true;
                }
            }
            bnVar.showDialog(h1Var);
            return;
        }
        vf.c.t(bnVar.getParentActivity(), "https://" + bnVar.getMessagesController().X2 + "/nft/" + str);
    }

    @Override
    public final int Z() {
        return this.f49941a.f46036g4;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.r1 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.Z1(org.telegram.ui.Cells.r1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f49941a;
        rj rjVar = bnVar.f45950a0;
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
                bnVar.f45950a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.h3(new ul(this, 6), 200L);
            }
        }
    }

    @Override
    public final void a2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.j10 j10Var) {
        TLRPC.Message message;
        if (r1Var == null) {
            j10Var.run();
            return;
        }
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f24213k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.g2 g2Var = this.f49941a;
            g2Var.getSendMessagesHelper().v(messageObject, messageObject.f24213k.rich_message, null, g2Var, true);
            return;
        }
        j10Var.run();
    }

    @Override
    public final boolean b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        bn bnVar = this.f49941a;
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
    public final void c() {
        this.f49941a.f46111m1.getClass();
    }

    @Override
    public final jh.a c0() {
        return this.f49941a.f46222uc;
    }

    @Override
    public final fr0 c2() {
        return this.f49941a.Ta;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f49941a;
        rj rjVar = bnVar.f45950a0;
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
            String o4 = org.telegram.messenger.p10.o(user);
            if (o4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) o4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.p10.k(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.v41("" + user.f28583id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            bnVar.f45950a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.h3(new ul(this, 7), 200L);
        }
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj messageObject;
        if (r1Var == null) {
            messageObject = null;
        } else {
            messageObject = r1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f24213k != null) {
            bn bnVar = this.f49941a;
            if (bnVar.f46036g4 != 1 && !bnVar.W9() && !messageObject.f24213k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.h6 h6Var;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.f49941a;
        bnVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f46005e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
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
                h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                org.telegram.ui.Components.py0.b(parentActivity, i7, -bnVar.f46005e.f28434id, currentUser, str2, z15, z16, z12, h6Var);
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
            } else if (org.telegram.messenger.v3.T(bnVar.f46005e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                bnVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.np.k1(bnVar.f46005e);
                tL_channels_getParticipant.participant = bnVar.getMessagesController().l1(currentUser.f28583id);
                bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.o6(15, this, r1Var));
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
            h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
            org.telegram.ui.Components.py0.b(parentActivity2, i7, -bnVar.f46005e.f28434id, currentUser, str2, z152, z162, z12, h6Var);
        }
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.r1 r1Var, final TLRPC.User user) {
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
        bn bnVar = this.f49941a;
        if (bnVar.f46005e != null && (((vjVar = bnVar.f45994d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = bnVar.f46005e;
        if (chat != null && ((bnVar.f46191s4 == 0 || bnVar.f46254x4) && (!org.telegram.messenger.v3.T(chat) || bnVar.f46005e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        if (r22 != 0) {
            c5VarArr[2] = c5.f46424n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f46425r;
        }
        TLRPC.UserFull d2 = bnVar.getMessagesController().d2(user.f28583id);
        if (d2 == null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        } else {
            b10 = w4.c(user, d2, c5VarArr);
            if (!ab.q.h(b10)) {
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (ab.q.h(b10)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, b10, new z6(this, r1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(bnVar, r1Var);
        I.c(2131232268, org.telegram.messenger.hd.N0(2131747592, null), new Runnable(this) {
            public final mm f52845b;

            {
                this.f52845b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52845b.o(user, false);
                        return;
                    case 1:
                        this.f52845b.d(user);
                        return;
                    default:
                        this.f52845b.f49941a.Pa(user);
                        return;
                }
            }
        }, false);
        I.c(2131232115, org.telegram.messenger.hd.N0(2131745405, null), new o1(this, r1Var, user, 24), false);
        I.l(2131232224, org.telegram.messenger.hd.N0(2131748416, null), new Runnable(this) {
            public final mm f52845b;

            {
                this.f52845b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52845b.o(user, false);
                        return;
                    case 1:
                        this.f52845b.d(user);
                        return;
                    default:
                        this.f52845b.f49941a.Pa(user);
                        return;
                }
            }
        }, r22);
        I.l(2131232356, org.telegram.messenger.hd.N0(2131753755, null), new Runnable(this) {
            public final mm f52845b;

            {
                this.f52845b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52845b.o(user, false);
                        return;
                    case 1:
                        this.f52845b.d(user);
                        return;
                    default:
                        this.f52845b.f49941a.Pa(user);
                        return;
                }
            }
        }, r42);
        I.f33399t = false;
        I.f33378i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.o10.t(null, 2131752010, org.telegram.ui.Components.lc.b0(this.f49941a));
    }

    public final void f(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.gj primaryMessageObject;
        int i7;
        int i10;
        ej ejVar;
        if (r1Var == null || (primaryMessageObject = r1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        bn bnVar = this.f49941a;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59126y < 0) {
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
        bnVar.f45980c1 = z11;
        bnVar.Zc(primaryMessageObject, false);
        bnVar.f45980c1 = false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        kl klVar;
        int i7 = (org.telegram.messenger.gj.B0(gjVar.f24213k) > 1271266957L ? 1 : (org.telegram.messenger.gj.B0(gjVar.f24213k) == 1271266957L ? 0 : -1));
        bn bnVar = this.f49941a;
        if ((i7 == 0 || ((klVar = bnVar.D0) != null && klVar.O)) && bnVar.f46036g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f2(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.f2(long):boolean");
    }

    public final boolean g() {
        bn bnVar = this.f49941a;
        if (!org.telegram.messenger.p10.C(bnVar.f46019f)) {
            TLRPC.Chat chat = bnVar.f46005e;
            if (chat != null) {
                if (org.telegram.messenger.v3.T(chat) && !bnVar.f46005e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void g2(org.telegram.ui.Cells.r1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.g2(org.telegram.ui.Cells.r1, int, float, float, boolean):void");
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void h0(int i7) {
        CharSequence T2;
        int i10;
        SpannableStringBuilder W2;
        int i11;
        bn bnVar = this.f49941a;
        try {
            if (i7 == 0) {
                bnVar.w7();
                nk nkVar = bnVar.O3;
                if (nkVar != null) {
                    nkVar.l(0L, 84, null, new ul(this, 1));
                    bnVar.O3.performHapticFeedback(3, 2);
                }
            } else if (i7 == 1) {
                String x10 = org.telegram.messenger.hd.x(bnVar.getMessagesController().f26003x4, true);
                if (bnVar.getMessagesController().f26003x4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(org.telegram.ui.Components.j21.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(org.telegram.ui.Components.j21.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.lc.b0(bnVar).G(2131624300, 6, W2).k(true);
                bnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.hd.x(bnVar.getMessagesController().f26003x4, true);
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(bnVar.getMessagesController().f25983v4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i7 == 2) {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131743723, null), new ul(this, 2));
                } else if (bnVar.getMessagesController().f26003x4 <= 0) {
                    T2 = "";
                } else {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.hd.a0(null, null, 2131743722, x11), new ul(this, 3));
                }
                SpannableStringBuilder append2 = append.append(T2);
                b02.getClass();
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(b02.X(), b02.f37162c);
                obVar.c(2131624300, 36, 36, new String[0]);
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
                obVar.f38157b.setText(append2);
                obVar.f38157b.setSingleLine(false);
                obVar.f38157b.setMaxLines(6);
                b02.b(obVar, 7000).k(true);
                org.telegram.messenger.q2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.r1 r38, org.telegram.tgnet.TLRPC.TodoItem r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.h2(org.telegram.ui.Cells.r1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final String i(org.telegram.ui.Cells.r1 r1Var) {
        bn bnVar;
        int i7;
        if (r1Var.getMessageObject() != null && (i7 = (bnVar = this.f49941a).f45962ac) != 0 && i7 == r1Var.getMessageObject().e1() && bnVar.f45977bc == 3) {
            return bnVar.dc;
        }
        return null;
    }

    @Override
    public final boolean i0() {
        if (this.f49941a.f46036g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i1() {
        bn bnVar = this.f49941a;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, bnVar.f46103l6, null);
    }

    public final void j(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, boolean z10) {
        bn bnVar = this.f49941a;
        TLRPC.Chat chat2 = bnVar.f46005e;
        if (chat2 != null && chat.f28434id == chat2.f28434id) {
            vi viVar = bnVar.f46147p1;
            if (viVar != null && i7 == 0) {
                viVar.e(false, false);
            } else if (r1Var.getMessageObject() != null) {
                bnVar.l(i7, r1Var.getMessageObject().e1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f28434id != chat2.f28434id || bnVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28434id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = bnVar.f46017ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f46017ec = null;
                }
                if (r1Var != null && r1Var.getMessageObject() != null) {
                    hi hiVar2 = new hi(bnVar, r1Var.getMessageObject().e1(), r1Var, 0);
                    bnVar.f46017ec = hiVar2;
                    hiVar = hiVar2;
                } else {
                    bnVar.f46017ec = null;
                }
            }
            if (bnVar.getMessagesController().E(bundle, bnVar, r1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                bn bnVar2 = new bn(bundle);
                if (hiVar3 != null && i7 != 0) {
                    org.telegram.messenger.g0.h3(new ai.i1(this, hiVar3, chat, i7, bnVar2, 13), 5000L);
                    hiVar3.d();
                    return;
                }
                bnVar.presentFragment(bnVar2);
            }
        }
    }

    @Override
    public final void j0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        this.f49941a.Y7(r1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void j2(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull P0;
        TLRPC.User currentUser = r1Var.getCurrentUser();
        bn bnVar = this.f49941a;
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f46005e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
            org.telegram.messenger.np messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f46005e.f28434id;
            long j10 = currentUser.f28583id;
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
            e(r1Var, chatParticipant);
        }
    }

    public final void k(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28583id);
            org.telegram.ui.ActionBar.g2 g2Var = this.f49941a;
            if (g2Var.getMessagesController().E(bundle, g2Var, r1Var.getMessageObject(), null)) {
                g2Var.presentFragment(new bn(bundle));
            }
        }
    }

    @Override
    public final int k0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar;
        bn bnVar = this.f49941a;
        if (bnVar.f46018ed.f57701f && (bVar = bnVar.f46097kd) != null && bVar.f57470n == r1Var && bVar.f57465a.getWidth() > 0) {
            return bnVar.f46097kd.f57465a.getHeight();
        }
        return 0;
    }

    @Override
    public final void k1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        bn bnVar = this.f49941a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f45994d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    rj rjVar = bnVar.f45950a0;
                    org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
                    org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
                    gi giVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    vf.b bVar = bnVar.f46017ec;
                    if (bVar != null) {
                        bVar.a(true);
                        bnVar.f46017ec = null;
                    }
                    if (str != null && r1Var.getMessageObject() != null) {
                        gi giVar2 = new gi(bnVar, r1Var.getMessageObject().e1(), str, r1Var, 1);
                        bnVar.f46017ec = giVar2;
                        giVar = giVar2;
                    } else {
                        bnVar.f46017ec = null;
                    }
                    rjVar.t0(keyboardButtonProto, messageObject, messageObject2, giVar);
                }
            }
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = sh.g.a(messageObject);
            boolean a11 = c8.dd.a(a10, 7);
            bn bnVar = this.f49941a;
            if (a11) {
                org.telegram.ui.Components.lc.b0(bnVar).Q(2131624007, 36, sh.g.b(a10, messageObject)).j();
            } else if (i7 < 0 && !arrayList.isEmpty()) {
                bnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                r1Var.a0(true);
            } else if (bnVar.getParentActivity() != null) {
                if (bnVar.C2 == null) {
                    int indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.C2 = E6;
                    E6.f14993v0 = 0.0f;
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
                        float y10 = ((r1Var.getY() + q1Var.f31297b) - org.telegram.messenger.g0.L(4.0f)) - bnVar.P9;
                        bnVar.F2 = org.telegram.messenger.g0.L(13.3f) + q1Var.f31296a;
                        int i13 = org.telegram.ui.Cells.c0.i(6.0f, q1Var.f31297b, i11);
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
    public final void l0(org.telegram.ui.Cells.r1 r1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bn bnVar = this.f49941a;
        if (bnVar.getParentActivity() != null) {
            if (bnVar.f46220ua == null) {
                wh.i iVar = new wh.i(bnVar.getParentActivity());
                bnVar.f46220ua = iVar;
                bnVar.f46111m1.addView(iVar, c8.ma.e(-1, -1, 48));
            }
            wh.i iVar2 = bnVar.f46220ua;
            HashMap hashMap = iVar2.f59973a;
            ArrayList arrayList = iVar2.f59975c;
            arrayList.clear();
            int i7 = iVar2.d;
            org.telegram.messenger.k10 i10 = org.telegram.messenger.k10.i(i7);
            long j3 = i10.f24987n;
            arrayList.add(Long.valueOf(j3));
            if (i10.W) {
                ArrayList arrayList2 = org.telegram.messenger.si.d0(i7).f26834j1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j10 = tL_topPeer.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.np.u1(i7).c2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.np.u1(i7).f26008y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j11 = dialog.f28438id;
                    if (j11 != j3 && !org.telegram.messenger.n5.C(j11)) {
                        if (org.telegram.messenger.n5.E(dialog.f28438id)) {
                            TLRPC.User c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(dialog.f28438id));
                            if (c22 != null && !org.telegram.messenger.p10.u(c22) && !org.telegram.messenger.p10.y(c22) && !org.telegram.messenger.p10.B(c22.f28583id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28438id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28438id));
                                }
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-dialog.f28438id));
                            if (O0 != null && !O0.forum && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28438id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28438id));
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
                wh.h hVar = new wh.h(iVar2, r1Var, arrayList5, new wg.q(6, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.g2 g2Var = this.f49941a;
        if (g2Var.getMessagesController().E(j10, g2Var, r1Var.getMessageObject(), null)) {
            g2Var.presentFragment(new bn(j10));
        }
    }

    @Override
    public final void m() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26730a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f49941a.getParentActivity(), org.telegram.messenger.s2.f26735g);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28434id);
            bundle.putBoolean("expandPhoto", false);
            this.f49941a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final boolean n0() {
        boolean z10;
        bn bnVar = this.f49941a;
        if (!bnVar.Y9()) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.User user, boolean z10) {
        int i7;
        if (user != null && user.f28583id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28583id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            bn bnVar = this.f49941a;
            TLRPC.User user2 = bnVar.f46019f;
            if (user2 != null && user2.f28583id == user.f28583id) {
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
    public final void o0(String str) {
        bn bnVar = this.f49941a;
        vj vjVar = bnVar.f45994d1;
        if (vjVar == null || vjVar.getVisibility() != 0) {
            uj ujVar = bnVar.T;
            if ((ujVar == null || ujVar.getVisibility() != 0) && bnVar.f45950a0 != null && str != null && str.length() > 0) {
                rj rjVar = bnVar.f45950a0;
                rjVar.setFieldText("@" + str + " ");
                bnVar.f45950a0.i1();
            }
        }
    }

    @Override
    public final void p(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                Q1(r1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            bn bnVar = this.f49941a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(bnVar)) {
                    qa0 qa0Var = new qa0(3);
                    h6Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                    qa0Var.setResourceProvider(h6Var2);
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
                    qa0Var.V0 = false;
                    qa0Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.k10.f24968t0, tL_message, false, false));
                    bnVar.presentFragment(qa0Var);
                }
            } else if (org.telegram.messenger.gj.N2(messageMedia.document)) {
                ns.p().v(bnVar.getParentActivity());
                ns.p().u(new km(this, tL_messageMediaPoll, pollAnswer, r1Var));
                ns p10 = ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.gj.H2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.gj messageObject2 = r1Var.getMessageObject();
                h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, h6Var, 200);
            } else if (org.telegram.messenger.gj.J3(messageMedia.document)) {
                org.telegram.messenger.gj gjVar = MediaController.B().f22771v0;
                if (MediaController.B().I(messageObject) && gjVar != null) {
                    boolean z12 = gjVar.m0;
                    if (i7 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(gjVar);
                            return;
                        } else {
                            MediaController.B().R(gjVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f24213k;
                TLRPC.TL_message R7 = bn.R7(message);
                R7.media = messageMedia;
                R7.attachPath = sh.d.c(i7, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i16, R7, false, true);
                if (i7 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gjVar2.m0 = z10;
                arrayList.add(gjVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, gjVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.gj.K4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.f24213k));
                    if (aVar.f57464g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        r1Var.Z();
                        return;
                    } else if (!aVar.f57463f) {
                        org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                        aVar.a();
                        r1Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f24213k;
                        TLRPC.TL_message R72 = bn.R7(message2);
                        R72.media = messageMedia;
                        R72.attachPath = sh.d.c(i7, message2);
                        i15 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(i15, R72, false, true);
                        if (org.telegram.messenger.gj.y(messageMedia.document)) {
                            PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i18 = gjVar3.D;
                            long j11 = 0;
                            if (i18 != 0) {
                                j3 = bnVar.f46103l6;
                            } else {
                                j3 = 0;
                            }
                            if (i18 != 0) {
                                j10 = bnVar.f45999d7;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = bnVar.d();
                            }
                            p12.e2(gjVar3, bnVar, j3, j10, j11, bnVar.f46003db);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(gjVar3, bnVar.getParentActivity(), bnVar.Ba, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bnVar.M6(gjVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f24213k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message R73 = bn.R7(message3);
                    R73.media = messageMedia3;
                    R73.attachPath = sh.d.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.gj(i13, R73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
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
                    arrayList3.add(new org.telegram.messenger.gj(i12, R74, false, true));
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
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.gj.K4(document))) {
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
                        arrayList3.add(new org.telegram.messenger.gj(i11, R75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f24245s0 = arrayList2;
                    PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                    PhotoViewer.p1().a2(arrayList3, i10, bnVar.a(), 0L, 0L, bnVar.eb);
                }
            }
        }
    }

    @Override
    public final boolean p0(org.telegram.ui.Components.y5 y5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        bn bnVar = this.f49941a;
        if (!bnVar.getMessagesController().K3() && y5Var != null && !y5Var.standard) {
            long documentId = y5Var.getDocumentId();
            TLRPC.Document document = y5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                document = org.telegram.ui.Components.p5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.gj.i1(document)) != null) {
                org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).o0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.ev evVar = new org.telegram.ui.Components.ev(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                org.telegram.ui.Components.wu wuVar = evVar.f34993q1;
                wuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(wuVar);
                wuVar.f41900w = imageReceiver;
                if (wuVar.d) {
                    imageReceiver.P();
                }
                wuVar.f41901x = true;
                wuVar.f41902y.e(true, 1.0f);
                wuVar.f41900w.r0(org.telegram.messenger.gc.b(document), "140_140", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29546m6, 0.2f, true), 0L, null, null, 0);
                wuVar.f41900w.E0(7);
                ImageReceiver imageReceiver2 = wuVar.f41900w;
                imageReceiver2.f22697v0 = true;
                imageReceiver2.f22695u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = wuVar.f41900w;
                imageReceiver3.f22703x0 = true;
                imageReceiver3.H0(wuVar);
                boolean V9 = bnVar.V9();
                evVar.f30194i0 = V9;
                evVar.f30201n = V9;
                bnVar.showDialog(evVar);
                return true;
            }
        }
        return false;
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
        org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
        boolean z11 = false;
        fm fmVar = null;
        fm fmVar2 = null;
        File file = null;
        fm fmVar3 = null;
        fm fmVar4 = null;
        bn bnVar = this.f49941a;
        if (i7 == 19) {
            vf.b bVar = bnVar.f46017ec;
            if (bVar != null) {
                bVar.a(true);
            }
            if (r1Var.getMessageObject() != null) {
                fmVar2 = new fm(this, r1Var, 2);
            }
            final fm fmVar5 = fmVar2;
            bnVar.f46017ec = fmVar5;
            final Activity parentActivity = bnVar.getParentActivity();
            final org.telegram.ui.ActionBar.h6 resourceProvider = bnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fmVar5.d();
            fmVar5.f59417b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f24213k.media;
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
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).O0(Long.valueOf(-messageObject.Z0()));
            if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.f24213k.date * 1000;
            wg.s.d(messageObject, new org.telegram.messenger.y10(atomicBoolean, fmVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f59773a;
                public final vf.b f59774b;
                public final boolean f59775c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f59776e;
                public final Context f59777f;
                public final h6 f59778g;

                {
                    this.f59776e = tL_messageMediaGiveaway2;
                    this.f59777f = parentActivity;
                    this.f59778g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f59773a.get()) {
                        this.f59774b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f59775c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f59776e;
                        Context context = this.f59777f;
                        h6 h6Var = this.f59778g;
                        if (z12) {
                            h.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, h6Var);
                        }
                    }
                }
            }, new wg.e(atomicBoolean, fmVar5, 0));
        } else if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z12 = org.telegram.messenger.s2.f26730a;
            org.telegram.messenger.t0.r();
            vf.c.t(bnVar.getParentActivity(), org.telegram.messenger.s2.f26735g);
        } else if (i7 == 84) {
            bnVar.Wa(r1Var);
        } else if (i7 == 80) {
            org.telegram.ui.Cells.p8 p8Var = org.telegram.ui.Components.ff0.M1;
            if (bnVar.getParentActivity() != null) {
                bnVar.showDialog(new org.telegram.ui.Components.ff0(bnVar.getContext(), bnVar.getCurrentAccount(), messageObject, bnVar.getResourceProvider()));
            }
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f24213k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    bnVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            long j10 = messageObject.f24213k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user2 = org.telegram.messenger.np.u1(i13).c2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f24213k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f28583id);
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
                bnVar.showDialog(new org.telegram.ui.Components.md0(bnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, bnVar.Ba));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 30) {
            bnVar.presentFragment(new bn(a8.p0.j(messageObject.f24213k.media.user_id, "user_id")));
        } else if (i7 == 31) {
            long j11 = messageObject.f24213k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                user = org.telegram.messenger.np.u1(i12).c2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    N0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    N0 = org.telegram.messenger.o10.h(new StringBuilder("+"), user.phone, pf.b.c());
                } else {
                    String str5 = org.telegram.messenger.gj.n1(messageObject.f24213k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        N0 = pf.b.c().b(str5);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(2131747638, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f28583id);
                bundle2.putString("phone", N0);
                bundle2.putBoolean("addContact", true);
                bnVar.presentFragment(new qr(bundle2));
            }
        } else if (i7 != 23 && i7 != 24) {
            if (messageObject.r4()) {
                bnVar.ma(messageObject, false, false);
                if (messageObject.T0 != null) {
                    vf.b bVar2 = bnVar.f46017ec;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (r1Var.getMessageObject() != null) {
                        fmVar3 = new fm(this, r1Var, 4);
                    }
                    bnVar.f46017ec = fmVar3;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, bnVar.f46017ec, null, false, bnVar.getMessagesController().f25856g6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.f24213k) != null && (messageMedia2 = message.media) != null) {
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
                    vf.b bVar3 = bnVar.f46017ec;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (r1Var.getMessageObject() != null) {
                        fmVar4 = new fm(this, r1Var, 5);
                    }
                    bnVar.f46017ec = fmVar4;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, bnVar.f46017ec, null, false, true, false, false);
                }
            }
        } else {
            if (i7 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f24213k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                vf.b bVar4 = bnVar.f46017ec;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (r1Var.getMessageObject() != null) {
                    fmVar = new fm(this, r1Var, 3);
                }
                bnVar.f46017ec = fmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    if (org.telegram.messenger.si.d0(i10).r0(group) == null) {
                        bnVar.f46017ec.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        bnVar.f46017ec.f59417b = new ii(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.b3(3, this, z11)), 2);
                        return;
                    }
                }
                vf.c.s(bnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, bnVar.f46017ec, null, false, true, false, false);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (r1Var != null && pageBlock != null) {
            bn bnVar = this.f49941a;
            if (bnVar.getParentActivity() != null && (messageObject = r1Var.getMessageObject()) != null && (message = messageObject.f24213k) != null && messageObject.f24270y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f24270y2.f23981g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.au auVar = (org.telegram.messenger.au) arrayList2.get(i7);
                    if (auVar instanceof org.telegram.messenger.nu) {
                        arrayList.add(((org.telegram.messenger.nu) auVar).f26038r0);
                    } else if (auVar instanceof org.telegram.messenger.zu) {
                        arrayList.add(((org.telegram.messenger.zu) auVar).f28377r0);
                    } else if (auVar instanceof org.telegram.messenger.fu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.fu) auVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.tt) obj).f27077b);
                        }
                    } else if (auVar instanceof org.telegram.messenger.ru) {
                        ArrayList arrayList4 = ((org.telegram.messenger.ru) auVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.tt) obj2).f27077b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.I2(null, bnVar, null);
                    return p12.d2(null, null, null, null, null, null, null, indexOf, new sl(bnVar, arrayList), null, 0L, 0L, 0L, true, new rl(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.r1 r1Var) {
        float f10;
        if (r1Var.getMessageObject().y3()) {
            i1();
            return;
        }
        bn bnVar = this.f49941a;
        if (!bnVar.A3 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            if (bnVar.J2 == null) {
                int indexOfChild = bnVar.f46111m1.indexOfChild(bnVar.U);
                if (indexOfChild != -1) {
                    hi.l3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.J2 = E6;
                    E6.v(org.telegram.messenger.hd.N0(2131749136, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.gj messageObject = r1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = r1Var.getCurrentUser();
                if (currentUser != null && currentUser.f28583id == 0) {
                    f10 = (r1Var.getMeasuredHeight() - Math.max(0, r1Var.getBottom() - ((View) r1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.P3() && r1Var.f31496k9 && r1Var.V8 != null) {
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
    public final void q0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        bn bnVar = this.f49941a;
        bnVar.Y7(r1Var, false, false, f10, f11, true, false, false);
        bnVar.A0.getClass();
        bn.l2(bnVar, RecyclerView.R(r1Var));
    }

    @Override
    public final void q2(org.telegram.ui.Cells.r1 r1Var) {
        org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f49941a.Zc(primaryMessageObject, false);
    }

    @Override
    public final void s(org.telegram.ui.Cells.r1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.s(org.telegram.ui.Cells.r1):void");
    }

    @Override
    public final void s2() {
        this.f49941a.O9();
    }

    @Override
    public final void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        wh.h hVar;
        int i7;
        boolean z10;
        boolean z11;
        float f12;
        wh.i iVar = this.f49941a.f46220ua;
        if (iVar != null && (hVar = (wh.h) iVar.f59973a.get(wh.i.b(r1Var))) != null) {
            wh.d[] dVarArr = hVar.f59971x;
            RectF rectF = hVar.f59968r;
            if (hVar.N) {
                float f13 = (f10 - rectF.left) + hVar.V;
                float f14 = (f11 - rectF.top) + hVar.W;
                int i10 = wh.g.f59953a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.f59953a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i7 = c8.l9.b(floor, 0, dVarArr.length - 1);
                } else {
                    i7 = -1;
                }
                if (hVar.S != i7) {
                    hVar.f59960a.performHapticFeedback(3, 1);
                    hVar.S = i7;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        wh.d dVar = dVarArr[i11];
                        if (i7 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f59931p != z10) {
                            ValueAnimator valueAnimator = dVar.f59929n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f59931p = z10;
                            float f16 = dVar.f59930o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f59929n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f59929n.addUpdateListener(dVar);
                            dVar.f59929n.setInterpolator(wh.f.f59935a);
                            dVar.f59929n.start();
                        }
                        wh.d dVar2 = dVarArr[i11];
                        if (i7 != i11 && i7 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f59928m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f59926k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f59928m = z11;
                            float f17 = dVar2.f59927l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f59926k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f59926k.addUpdateListener(dVar2);
                            dVar2.f59926k.setInterpolator(wh.f.f59935a);
                            dVar2.f59926k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void t2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f49941a.n8(r1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49941a;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        boolean z10 = true;
        if (!kVar.x() && !bnVar.Y9()) {
            if (r1Var != null && r1Var.getMessageObject() != null && r1Var.getMessageObject().r4()) {
                p1(r1Var, 10);
                return;
            }
            if (!org.telegram.messenger.v3.c0(bnVar.f46005e) && !bnVar.fa()) {
                z10 = false;
            }
            o(user, z10);
            return;
        }
        bn.k2(bnVar, r1Var, true, f10, f11);
    }

    @Override
    public final void v() {
        this.f49941a.Fc();
    }

    @Override
    public final boolean v2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        if (i7 != 16 && i7 != 2131296267 && i7 != 2131296264) {
            return false;
        }
        bn bnVar = this.f49941a;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inPreviewMode;
        if (z10 && bnVar.f46042ga) {
            r4Var = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
            if (r4Var != null) {
                r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar).parentLayout;
                ((ActionBarLayout) r4Var2).r();
            }
            return true;
        }
        return !b();
    }

    @Override
    public final void w(org.telegram.ui.Cells.r1 r1Var) {
        int i7;
        int i10;
        ej ejVar;
        org.telegram.messenger.gj primaryMessageObject = r1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f24181c3 = !primaryMessageObject.f24181c3;
            primaryMessageObject.M1 = true;
            bn bnVar = this.f49941a;
            bj bjVar = bnVar.A0;
            if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59126y < 0) {
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
            hi.l3 l3Var = bnVar.P1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (i7 >= 0 && r1Var.getCurrentMessagesGroup() == null) {
                bnVar.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.r1 r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.w0(org.telegram.ui.Cells.r1, float, float, boolean):void");
    }

    @Override
    public final boolean x1() {
        bn bnVar = this.f49941a;
        if (bnVar.f46111m1.getMeasuredWidth() > bnVar.f46111m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void x2() {
        bn bnVar = this.f49941a;
        if (bnVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46103l6);
            bundle.putInt("start_from", 10);
            bnVar.presentFragment(new org.telegram.ui.Components.k90(bundle, bnVar.f46147p1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.lc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.hd.H(',', "UnlockSimilarChannelsPremium", bnVar.getMessagesController().A4), new ul(this, 4))).j();
    }

    @Override
    public final void y(org.telegram.ui.Cells.r1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.y(org.telegram.ui.Cells.r1):void");
    }

    @Override
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return !this.f49941a.f46186s.containsKey(gjVar);
    }

    @Override
    public final void y2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
        org.telegram.messenger.gj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        bn bnVar = this.f49941a;
        hi.l3 l3Var = bnVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (bnVar.getParentActivity() != null && (messageObject = r1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.hd.E0().f24472y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            hi.l3 l3Var2 = new hi.l3(bnVar.getParentActivity(), 3);
            l3Var2.r(true);
            l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var2.d = -1L;
            l3Var2.U = true;
            l3Var2.f14972e = true;
            l3Var2.s(12.0f);
            bnVar.P1 = l3Var2;
            l3Var2.f14988r0 = new eh(4, this, l3Var2);
            l3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750836, str)));
            bnVar.P1.l(bnVar.L);
            bnVar.f46111m1.addView(bnVar.P1, c8.ma.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            bnVar.f46111m1.post(new l2.x(this, r1Var, i10, i7, 12));
        }
    }

    @Override
    public final String z(long j3) {
        TLRPC.Peer peer;
        String E0;
        bn bnVar = this.f49941a;
        if (org.telegram.messenger.p10.v(bnVar.f46019f)) {
            return null;
        }
        TLRPC.Chat chat = bnVar.f46005e;
        if (chat != null && !org.telegram.messenger.v3.V(chat) && (E0 = bnVar.getMessagesController().E0(bnVar.f46005e.f28434id, j3)) != null) {
            return E0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = bnVar.f46177r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return org.telegram.messenger.hd.N0(2131743777, null);
    }

    @Override
    public final void z0(org.telegram.ui.Cells.r1 r1Var) {
        sh.b bVar = this.f49941a.f46097kd;
        if (bVar != null && bVar.f57470n == r1Var) {
            bVar.f57474x.getClass();
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        bn bnVar = this.f49941a;
        if (bnVar.f45962ac != 0 && r1Var.getMessageObject() != null && bnVar.f45962ac == r1Var.getMessageObject().e1() && bnVar.f45977bc == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.k9 z2() {
        return this.f49941a.f46219u9;
    }
}
