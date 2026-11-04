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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.UndoView;
public final class hm implements org.telegram.ui.Cells.l1 {
    public final wm f45934a;

    public hm(wm wmVar) {
        this.f45934a = wmVar;
    }

    @Override
    public final void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        wm wmVar = this.f45934a;
        if (wmVar.getParentActivity() != null && tLObject != null) {
            q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                if (((ActionBarLayout) q4Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f27001id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f27150id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 2, wmVar.getParentActivity(), wmVar.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, wmVar.getResourceProvider());
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(wmVar.getParentActivity(), false, false);
                y0Var.j(org.telegram.messenger.bd.M0(2131747819, null), 2131232088, null);
                y0Var.setMinimumWidth(160);
                y0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(wmVar.getParentActivity(), false, false);
                y0Var2.j(org.telegram.messenger.bd.M0(2131746670, null), 2131232044, null);
                y0Var2.setMinimumWidth(160);
                y0Var2.setOnClickListener(new a0(this, (TLRPC.Chat) tLObject, q1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                wm wmVar2 = new wm(bundle);
                wmVar2.f51288da = true;
                wmVar.presentFragmentAsPreviewWithMenu(wmVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                wmVar.r7();
                return;
            }
            wmVar.presentFragment(new wm(bundle));
        }
    }

    @Override
    public final void A1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        wm wmVar = this.f45934a;
        wmVar.f51500u5 = messageObject;
        wmVar.A9();
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Z5();
            messageObject.K1 = true;
            q1Var.G1();
            q1Var.requestLayout();
            this.f45934a.D0.R(messageObject, false, false);
        }
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        int i3 = messageObject.D;
        wm wmVar = this.f45934a;
        if (i3 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f26868k.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(wmVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.f1();
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = wmVar.getMessagesController().P6;
                s1Var.setOnCancelListener(new ci.b0(this, wmVar.getConnectionsManager().sendRequest(getgroupcall, new ci.s7(this, s1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                s1Var.r(600L);
                return;
            }
            TLRPC.User user = wmVar.f51306f;
            if (user != null) {
                boolean K4 = messageObject.K4();
                TLRPC.UserFull userFull = wmVar.f51466r8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.n1.m(user, K4, i10, wmVar.getParentActivity(), wmVar.getMessagesController().b2(wmVar.f51306f.f27150id), wmVar.getAccountInstance());
                return;
            }
            return;
        }
        wmVar.X7(q1Var, true, false, f10, f11, messageObject.J3(), false, false);
    }

    @Override
    public final void C(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.f45934a;
        if (!wmVar.getMessagesController().S4()) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, wmVar.getParentActivity(), null);
            s1Var.r(200L);
            wmVar.getMessagesController().R0(new z(this, s1Var, q1Var, 6));
            return;
        }
        if (q1Var.getMessageObject() != null) {
            q1Var.getMessageObject().f26896r2 = Boolean.FALSE;
        }
        q1Var.F3();
    }

    @Override
    public final void C1(org.telegram.messenger.zi ziVar) {
        this.f45934a.f51470s.put(ziVar, Boolean.TRUE);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject;
        if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null && messageObject.f26868k != null) {
            int f12 = messageObject.f1();
            wm wmVar = this.f45934a;
            if (wmVar.Xb != f12 || wmVar.Yb != 7) {
                TLRPC.InputPeer j12 = wmVar.getMessagesController().j1(org.telegram.messenger.zi.B0(messageObject.f26868k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = j12;
                getrichmessage.f27223id = f12;
                sf.b bVar = wmVar.f51263bc;
                if (bVar != null) {
                    bVar.a(true);
                    wmVar.f51263bc = null;
                }
                di diVar = new di(wmVar, f12, q1Var, 2);
                diVar.f54708b = new sc(10, wmVar, r3);
                wmVar.f51263bc = diVar;
                diVar.d();
                int[] iArr = {wmVar.getConnectionsManager().sendRequestTyped(getrichmessage, new c3.b(1), new ci.g3(wmVar, diVar, iArr, q1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, true, z11);
    }

    @Override
    public final void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        dm dmVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && sf.c.i(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        wm wmVar = this.f45934a;
        sf.b bVar = wmVar.f51263bc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (q1Var.getMessageObject() == null) {
            dmVar = null;
        } else {
            dmVar = new dm(this, q1Var);
        }
        wmVar.f51263bc = dmVar;
        if (!z11 && !sf.c.g(parse, false, null)) {
            org.telegram.ui.Components.t4.q0(wmVar, str, true, true, true, !z11, wmVar.f51263bc, webPage, wmVar.f51557ya);
        } else {
            sf.c.s(wmVar.getParentActivity(), parse, true, true, false, wmVar.f51263bc, null, false, true, false, false);
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.Message message = messageObject.f26868k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.h6(true);
        wm wmVar = this.f45934a;
        wmVar.getMessagesStorage().X1(org.telegram.messenger.zi.B0(messageObject.f26868k), messageObject.f26868k);
        wmVar.getMessagesController().f23120s7.h(messageObject, true, false);
        f(q1Var, true, false, true);
    }

    @Override
    public final CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar;
        int i3;
        if (q1Var.getMessageObject() != null && (i3 = (wmVar = this.f45934a).Xb) != 0 && i3 == q1Var.getMessageObject().f1() && wmVar.Yb == 1) {
            return wmVar.Zb;
        }
        return null;
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i3;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f26868k) != null) {
            int i12 = o2Var.f24482a;
            TL_stars.StarsAmount starsAmount = null;
            wm wmVar = this.f45934a;
            if (i12 == 1) {
                long o10 = org.telegram.messenger.m5.o(message.from_id);
                mi.f fVar = new mi.f(24, this, message);
                Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                Activity parentActivity = wmVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String M0 = org.telegram.messenger.bd.M0(2131744397, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744396, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).B1(o10, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, null);
                editText.setHint(org.telegram.messenger.bd.M0(2131744395, null));
                org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.k6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.k4(parentActivity)});
                if (org.telegram.messenger.bd.f21784a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.bd.f21784a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751605, null), new jo(6, fVar, editText));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                s1Var.O = new org.telegram.ui.Components.h1(editText, 0);
                frameLayout.addView(editText, b8.mf.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vf(editText, 3), 100L);
                wmVar.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    boolean A = org.telegram.messenger.t3.A(i3, wmVar.f51292e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        org.telegram.messenger.t3.A(i10, wmVar.f51292e, 5);
                    }
                    ci.u8 u8Var = new ci.u8(this, message, A, messageObject, 28);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    wmVar.u7(u8Var, dg.a.l(starsAmount), !A);
                }
            } else if (i12 == 3) {
                wmVar.X7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                wmVar.f51323g2.n(messageObject.Z1(), true);
            }
        }
    }

    @Override
    public final void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        try {
            wm wmVar = this.f45934a;
            org.telegram.ui.Components.ut.K0(wmVar, ziVar, wmVar.f51248ab, str2, str3, str4, str, i3, i10, -1, wmVar.T9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final void I(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.f45934a;
        wmVar.Ra.k(q1Var, wmVar, true);
        wmVar.A0.I0(false);
    }

    @Override
    public final boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        ge geVar;
        ai.r1 r1Var;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        long j10;
        ai.c0 c0Var;
        int i3;
        boolean z11;
        int i10;
        gz0 gz0Var;
        int i11;
        float f10;
        int i12;
        long j11;
        ArrayList arrayList = null;
        if (!ziVar.T4() && !ziVar.h4()) {
            if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
                if (ziVar.J3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f45934a.D0.L();
                    wm wmVar = this.f45934a;
                    long j12 = wmVar.f51272c7;
                    boolean z12 = true ^ wmVar.D0.O;
                    if (wmVar.f51525w4) {
                        j11 = wmVar.b();
                    } else {
                        j11 = 0;
                    }
                    return B.o0(L, ziVar, j12, z12, null, j11);
                }
            } else {
                boolean S = MediaController.B().S(ziVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f45934a.g8(ziVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            iz0 iz0Var = this.f45934a.f51493ta;
            if (iz0Var == null || iz0Var.f46461c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f25457b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!ziVar.Q3()) {
                            org.telegram.ui.Components.fc.a0(this.f45934a).w(2131232785, org.telegram.messenger.bd.M0(2131743523, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f45934a.f51493ta = new iz0(this.f45934a.getParentActivity());
                iz0 iz0Var2 = this.f45934a.f51493ta;
                if (!ziVar.Q3()) {
                    geVar = this.f45934a.Hb(ziVar, true);
                } else {
                    geVar = null;
                }
                if (!ziVar.Q3()) {
                    r1Var = wm.Z4(this.f45934a, ziVar);
                } else {
                    r1Var = null;
                }
                Context context = iz0Var2.f46456a;
                ai.c0 c0Var2 = iz0Var2.f46460c;
                iz0Var2.Y = geVar;
                iz0Var2.Z = r1Var;
                gz0 gz0Var2 = iz0Var2.O;
                if (gz0Var2 != null) {
                    c0Var2.removeView(gz0Var2);
                    iz0Var2.O = null;
                }
                iz0Var2.P = q1Var;
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                iz0Var2.N = messageObject;
                if (messageObject != null && messageObject.i4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                iz0Var2.T = z10;
                org.telegram.ui.Cells.q1 q1Var2 = iz0Var2.P;
                if (q1Var2 != null) {
                    e6Var = q1Var2.getResourcesProvider();
                } else {
                    e6Var = null;
                }
                iz0Var2.M = e6Var;
                if (iz0Var2.P != null) {
                    iz0Var2.U = 0.0f;
                    iz0Var2.V = q1Var.f30005n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        iz0Var2.U = view.getY() + iz0Var2.U;
                        iz0Var2.V = view.getY() + iz0Var2.V;
                    }
                    int width = iz0Var2.P.getWidth();
                    int height = iz0Var2.P.getHeight();
                    if (iz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f22608q.y));
                    }
                    iz0Var2.L = height - iz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f22607p);
                    j10 = 0;
                    int i13 = height;
                    c0Var = c0Var2;
                    gz0 gz0Var3 = new gz0(iz0Var2, iz0Var2.getContext(), org.telegram.messenger.h10.f22829t0, iz0Var2.P.getResourcesProvider(), width, i13);
                    iz0Var2.O = gz0Var3;
                    iz0Var2.P.t0(gz0Var3);
                    iz0Var2.O.s0(iz0Var2.P);
                    iz0Var2.O.setDelegate(new nb.a(19));
                    gz0 gz0Var4 = iz0Var2.O;
                    org.telegram.messenger.zi ziVar2 = iz0Var2.N;
                    org.telegram.messenger.ui currentMessagesGroup = iz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = iz0Var2.P;
                    gz0Var4.u3(ziVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, false, false);
                    if (!iz0Var2.T) {
                        org.telegram.ui.Components.a8 a8Var = new org.telegram.ui.Components.a8();
                        iz0Var2.W = a8Var;
                        gz0 gz0Var5 = iz0Var2.O;
                        a8Var.f31756i = gz0Var5;
                        gz0Var5.uc = a8Var;
                        if (gz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.sm0 seekBarWaveform = iz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = iz0Var2.f46469s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.f38076n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    iz0Var2.I = false;
                    c0Var.addView(iz0Var2.O, new FrameLayout.LayoutParams(iz0Var2.P.getWidth(), i13, 17));
                    i3 = ceil;
                } else {
                    j10 = 0;
                    c0Var = c0Var2;
                    i3 = 360;
                }
                TextureView textureView = iz0Var2.Q;
                if (textureView != null) {
                    c0Var.removeView(textureView);
                    iz0Var2.Q = null;
                }
                if (iz0Var2.T) {
                    iz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    iz0Var2.Q = textureView2;
                    c0Var.addView(textureView2, 0, b8.mf.c(i3, i3));
                }
                org.telegram.ui.Components.m51 m51Var = MediaController.B().f21324j0;
                if (m51Var != null) {
                    m51Var.g0();
                }
                org.telegram.ui.Components.m51 m51Var2 = iz0Var2.f46471x;
                if (m51Var2 != null) {
                    m51Var2.g0();
                    iz0Var2.f46471x.m0();
                    iz0Var2.f46471x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = iz0Var2.P;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(iz0Var2.P.getMessageObject().I1);
                    File I = org.telegram.messenger.w7.I(iz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(iz0Var2.P.getMessageObject().I1);
                        I = org.telegram.messenger.w7.N(iz0Var2.P.getMessageObject().f26868k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && iz0Var2.P.getMessageObject().f26868k.attachPath != null) {
                        I = new File(iz0Var2.P.getMessageObject().f26868k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.m51 m51Var3 = new org.telegram.ui.Components.m51();
                        iz0Var2.f46471x = m51Var3;
                        m51Var3.K = new hz0(iz0Var2);
                        if (iz0Var2.W != null) {
                            m51Var3.L = new hz0(iz0Var2);
                        }
                        if (iz0Var2.T) {
                            m51Var3.A0(iz0Var2.Q);
                        }
                        iz0Var2.f46471x.j0(Uri.fromFile(I), "other");
                        iz0Var2.f46471x.h0();
                        org.telegram.ui.Components.js jsVar = iz0Var2.F;
                        if (jsVar != null) {
                            jsVar.f35181s = iz0Var2.f46471x;
                            jsVar.a();
                        }
                    }
                    wm wmVar2 = this.f45934a;
                    wmVar2.showDialog(wmVar2.f51493ta);
                    return false;
                }
                gi.l3 l3Var = iz0Var2.f46472y;
                if (l3Var != null) {
                    c0Var.removeView(l3Var);
                    iz0Var2.f46472y = null;
                }
                org.telegram.messenger.zi ziVar3 = iz0Var2.N;
                if (ziVar3 != null && ziVar3.Q3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.zi ziVar4 = iz0Var2.N;
                if (ziVar4 != null && org.telegram.messenger.zi.B0(ziVar4.f26868k) != org.telegram.messenger.h10.i(iz0Var2.N.I1).e()) {
                    gi.l3 l3Var2 = new gi.l3(context, 3);
                    iz0Var2.f46472y = l3Var2;
                    l3Var2.r(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.zi.B0(iz0Var2.N.f26868k);
                        String str = "";
                        if (B0 > j10) {
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(iz0Var2.N.I1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.l10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(iz0Var2.N.I1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        gi.l3 l3Var3 = iz0Var2.f46472y;
                        if (iz0Var2.T) {
                            i12 = 2131743600;
                        } else {
                            i12 = 2131743524;
                        }
                        l3Var3.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i12, str)));
                    } else {
                        gi.l3 l3Var4 = iz0Var2.f46472y;
                        if (iz0Var2.T) {
                            i11 = 2131743601;
                        } else {
                            i11 = 2131743525;
                        }
                        l3Var4.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i11, null)));
                    }
                    iz0Var2.f46472y.s(12.0f);
                    gi.l3 l3Var5 = iz0Var2.f46472y;
                    if (!z11 && !iz0Var2.P.G) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    l3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (iz0Var2.T) {
                        iz0Var2.f46472y.p(0.5f, 0.0f);
                        iz0Var2.f46472y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        iz0Var2.f46472y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        iz0Var2.f46472y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    iz0Var2.f46472y.v(14.0f);
                    gi.l3 l3Var6 = iz0Var2.f46472y;
                    l3Var6.h = gi.l3.a(l3Var6.getText(), iz0Var2.f46472y.getTextPaint());
                    if (iz0Var2.T) {
                        c0Var.addView(iz0Var2.f46472y, b8.mf.d((int) ((iz0Var2.P.getWidth() / org.telegram.messenger.g0.f22607p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((iz0Var2.P.getHeight() + iz0Var2.L) / org.telegram.messenger.g0.f22607p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        c0Var.addView(iz0Var2.f46472y, b8.mf.d((int) ((iz0Var2.P.getWidth() / org.telegram.messenger.g0.f22607p) * 0.6f), 150.0f, 17, ((((iz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + iz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.f22607p) + 1.0f, ((-75.0f) - ((iz0Var2.P.getHeight() / org.telegram.messenger.g0.f22607p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    iz0Var2.f46472y.w();
                }
                TextView textView = iz0Var2.E;
                if (textView != null) {
                    c0Var.removeView(textView);
                    iz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                iz0Var2.E = textView2;
                textView2.setTextColor(-1);
                iz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    iz0Var2.E.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    iz0Var2.E.setBackground(org.telegram.ui.ActionBar.k6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                iz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                b8.pf.a(iz0Var2.E);
                TextView textView3 = iz0Var2.E;
                if (z11) {
                    i10 = 2131743529;
                } else {
                    i10 = 2131743526;
                }
                textView3.setText(org.telegram.messenger.bd.M0(i10, null));
                iz0Var2.E.setOnClickListener(new ez0(iz0Var2, 1));
                c0Var.addView(iz0Var2.E, b8.mf.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (gz0Var = iz0Var2.O) != null && gz0Var.getMessageObject() != null && iz0Var2.O.getMessageObject().f26868k != null) {
                    iz0Var2.O.getMessageObject().f26868k.media_unread = false;
                    iz0Var2.O.invalidate();
                }
                wm wmVar22 = this.f45934a;
                wmVar22.showDialog(wmVar22.f51493ta);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void J(org.telegram.messenger.wi wiVar) {
        StaticLayout staticLayout = wiVar.f26210e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = wiVar.f26210e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new oi.h(wiVar.L, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.fc.a0(this.f45934a));
        }
    }

    @Override
    public final boolean J0(long j10) {
        TLRPC.ChatFull N0;
        wm wmVar = this.f45934a;
        TLRPC.Chat chat = wmVar.f51292e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j11 = wmVar.f51292e.f27001id;
        if (j11 == j10) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j11));
        if (messagesController.getUserConfig().e() == j10 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.f23171y1.f(j11);
        if (hVar == null && (N0 = messagesController.N0(j11)) != null && N0.participants != null) {
            for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i3);
                if (chatParticipant.user_id == j10) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j10)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i3;
        if (q1Var != null && document != null) {
            wm wmVar = this.f45934a;
            if (wmVar.getParentLayout() != null && b0(q1Var)) {
                boolean K3 = org.telegram.messenger.zi.K3(document);
                q1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
                if (K3) {
                    i3 = 2131745921;
                } else {
                    i3 = 2131745941;
                }
                H.c(2131232114, org.telegram.messenger.bd.M0(i3, null), new p1(this, q1Var, document, 26), false);
                H.f33742p = new tl(q1Var, rectF, 0);
                H.Z();
            }
        }
    }

    @Override
    public final void K0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi ziVar;
        long j10;
        int i3;
        ArrayList arrayList;
        ai.r1 r1Var;
        org.telegram.messenger.ui uiVar;
        int i10;
        wm wmVar = this.f45934a;
        xh.j jVar = wmVar.f51467ra;
        if (jVar != null) {
            HashMap hashMap = jVar.f58865a;
            xh.h hVar = (xh.h) hashMap.get(xh.j.b(q1Var));
            org.telegram.ui.Components.ac acVar = null;
            if (hVar != null) {
                ziVar = hVar.F;
            } else {
                ziVar = null;
            }
            xh.h hVar2 = (xh.h) wmVar.f51467ra.f58865a.get(xh.j.b(q1Var));
            if (hVar2 != null && (i10 = hVar2.S) != -1) {
                j10 = hVar2.f58860x[i10].d;
            } else {
                j10 = 0;
            }
            if (ziVar != null && j10 != 0) {
                Activity parentActivity = wmVar.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.t4.h(parentActivity, i3, j10, false)) {
                    if (ziVar.d1() != 0 && (uiVar = (org.telegram.messenger.ui) wmVar.O6.f(ziVar.d1())) != null) {
                        arrayList = uiVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.k(ziVar);
                    }
                    if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22848n) {
                        z10 = true;
                    }
                    long j11 = j10;
                    ai.r1 r1Var2 = new ai.r1(this, arrayList, j11, 18);
                    if (z10) {
                        r1Var2.run();
                        r1Var = null;
                    } else {
                        r1Var = r1Var2;
                    }
                    acVar = org.telegram.ui.Components.fc.v(wmVar.getParentActivity(), wmVar, null, 1, j11, 1, wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.tj), wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.vj), 5000, false, r1Var);
                    acVar.f31793k = true;
                    acVar.k(acVar.f31788e instanceof org.telegram.ui.Components.lb);
                }
            }
            xh.h hVar3 = (xh.h) hashMap.get(xh.j.b(q1Var));
            if (hVar3 != null) {
                if (acVar == null) {
                    hVar3.S = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                if (!(fbVar instanceof org.telegram.ui.Components.ib)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ib ibVar = (org.telegram.ui.Components.ib) fbVar;
                hVar3.X = ibVar;
                ibVar.f34650a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new hw(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void K1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        wm wmVar = this.f45934a;
        if (wmVar.m1 != null && wmVar.getParentActivity() != null) {
            Context context = wmVar.m1.getContext();
            e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
            iy0.d1(context, wmVar, false, e6Var, null);
        }
    }

    @Override
    public final void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        wm wmVar = this.f45934a;
        wmVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, wmVar);
    }

    @Override
    public final void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        di diVar;
        int i3;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        cg.l0 l0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            wm wmVar = this.f45934a;
            sf.b bVar = wmVar.f51263bc;
            if (bVar != null) {
                bVar.a(true);
                wmVar.f51263bc = null;
            }
            if (q1Var.getMessageObject() == null) {
                wmVar.f51263bc = null;
                diVar = null;
            } else {
                diVar = new di(wmVar, q1Var.getMessageObject().f1(), q1Var, 1);
                wmVar.f51263bc = diVar;
            }
            i3 = ((org.telegram.ui.ActionBar.d2) this.f45934a).currentAccount;
            ci.e9 y9 = ci.e9.y(i3, false);
            Objects.requireNonNull(diVar);
            xg xgVar = new xg(diVar, 8);
            Context context = LaunchActivity.K1;
            if (context == null) {
                context = org.telegram.messenger.t0.f25457b;
            }
            org.telegram.ui.ActionBar.e6 I = ci.e9.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.zi.B0(messageObject.f26868k);
                int f12 = messageObject.f1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.hp.s1(y9.f5029a).j1(B0);
                tL_inputInvoiceMessage.msg_id = f12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = ii.a3.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                l0Var = new cg.l0(y9, ConnectionsManager.getInstance(y9.f5029a).sendRequest(tL_payments_getPaymentForm, new ai.q1(y9, messageObject, tL_inputInvoiceMessage, xgVar, 3)), 1);
            }
            if (l0Var != null) {
                diVar.f54708b = l0Var;
                diVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f26868k;
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
                    TLRPC.TL_message Q7 = wm.Q7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        Q7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        Q7.attachPath = message.attachPath;
                    }
                    Q7.media = tL_messageExtendedMedia.media;
                    Q7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.zi(messageObject.I1, Q7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer v12 = PhotoViewer.v1();
                wm wmVar2 = this.f45934a;
                v12.N2(null, wmVar2, wmVar2.f51557ya);
                PhotoViewer.v1().e2(arrayList, i10, this.f45934a.a(), 0L, 0L, this.f45934a.f51262bb);
            }
        }
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject.f26868k.send_state != 0) {
            this.f45934a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.f45934a.j8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override
    public final void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3;
        int i10;
        org.telegram.messenger.wo woVar;
        Integer num;
        org.telegram.messenger.ac b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        wm wmVar = this.f45934a;
        if (isEmpty) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            vg.h1 h1Var = new vg.h1(wmVar, i3, user, null, null, wmVar.f51557ya);
            q1Var.getLocationOnScreen(new int[2]);
            h1Var.f56637o2 = q1Var.getNameStatusX();
            h1Var.f56638p2 = q1Var.getNameStatusY();
            h1Var.f56641s2 = q1Var.getScaleX();
            h1Var.f56639q2 = q1Var.getLeft();
            h1Var.f56640r2 = q1Var.getTop();
            h1Var.f56642t2 = q1Var;
            int e10 = org.telegram.messenger.l10.e(user);
            if (e10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(i10).f23099q4;
                if (xoVar != null) {
                    woVar = xoVar.d(e10);
                } else {
                    woVar = null;
                }
                if (woVar != null) {
                    num = Integer.valueOf(woVar.f());
                } else {
                    num = null;
                }
                h1Var.f56636n2 = num;
            } else {
                h1Var.f56636n2 = Integer.valueOf(wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28142r8[e10]));
            }
            org.telegram.ui.Components.e5 e5Var = q1Var.f30041pa;
            if (e5Var != null && (e5Var.f33286f[0] instanceof org.telegram.ui.Components.g5)) {
                h1Var.f56641s2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(wmVar.getParentActivity());
                    org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.ac.b(document);
                        if (d != null) {
                            d.f23763e = 512;
                            d.f23764f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                            d.f23763e = 512;
                            d.f23764f = 512;
                        }
                        b10 = org.telegram.messenger.ac.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.ac acVar = b10;
                    String str3 = str2;
                    k9Var.setLayerNum(7);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    k9Var.m(acVar, str3, org.telegram.messenger.ac.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.zi.D4(document)) {
                        Integer num2 = h1Var.f56636n2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.f28214v6);
                        }
                        k9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        h1Var.f56644v2 = org.telegram.messenger.zi.j1(document);
                    } else {
                        h1Var.f56644v2 = org.telegram.messenger.zi.j1(document);
                    }
                    h1Var.f56643u2 = k9Var;
                    h1Var.f56646x2 = true;
                }
            }
            wmVar.showDialog(h1Var);
            return;
        }
        sf.c.t(wmVar.getParentActivity(), "https://" + wmVar.getMessagesController().V2 + "/nft/" + str);
    }

    @Override
    public final void P(org.telegram.messenger.zi ziVar) {
        if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            this.f45934a.Hb(ziVar, true);
        }
    }

    @Override
    public final boolean P0(org.telegram.ui.Cells.q1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.P0(org.telegram.ui.Cells.q1, boolean):boolean");
    }

    @Override
    public final boolean P1(org.telegram.ui.Cells.q1 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.P1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        int i3;
        int i10;
        boolean m32 = org.telegram.messenger.zi.m3(q1Var.getMessageObject().f26868k);
        wm wmVar = this.f45934a;
        if (m32) {
            long o10 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            a02.Q(2131624112, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744097, org.telegram.messenger.m5.l(i10, o10)))).k(true);
            return false;
        } else if (!q1Var.getMessageObject().q()) {
            long o11 = org.telegram.messenger.m5.o(q1Var.getMessageObject().b1());
            org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(wmVar);
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            a03.Q(2131624112, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131744098, org.telegram.messenger.m5.l(i3, o11)))).k(true);
            return false;
        } else if (!wmVar.getUserConfig().q()) {
            org.telegram.ui.Components.fc.a0(wmVar).Q(2131624216, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131744074, null), new pl(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.t3.M(wmVar.f51292e, wmVar.f51453q8, true);
            final org.telegram.messenger.yy sendMessagesHelper = wmVar.getSendMessagesHelper();
            final org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.zi.B0(messageObject.f26868k)), Integer.valueOf(messageObject.f1()), Integer.valueOf(todoItem.f27148id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.f1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.zi.B0(messageObject.f26868k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f27148id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f27148id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    yy yyVar = yy.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final qr messagesStorage = yyVar.getMessagesStorage();
                        zi ziVar = messageObject;
                        final long B0 = zi.B0(ziVar.f26868k);
                        final int f12 = ziVar.f1();
                        final int i11 = todoItem.f27148id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        p5 p5Var = messagesStorage.f24934a;
                        final long j10 = M;
                        p5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xq.run():void");
                            }
                        });
                        yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    }
                    g0.h3(new ci.c8(yyVar, hash, z11, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar = this.f45934a;
        wmVar.getNotificationCenter().k(org.telegram.messenger.hs.f23272n3, Long.valueOf(wmVar.f51376k6), q1Var);
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            g10Var.run();
            return;
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.p4() || messageObject.Z2()) && (message = messageObject.f26868k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f45934a;
            d2Var.getSendMessagesHelper().v(messageObject, messageObject.f26868k.rich_message, null, d2Var, true);
            return;
        }
        g10Var.run();
    }

    @Override
    public final boolean R() {
        wm wmVar = this.f45934a;
        if (wmVar.f51412n6[1].size() + wmVar.f51412n6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i3;
        org.telegram.messenger.zi messageObject;
        TLRPC.Message message;
        if (q1Var != null) {
            wm wmVar = this.f45934a;
            if (wmVar.getParentActivity() != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                if (org.telegram.messenger.hp.s1(i3).s4() && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f26868k) != null && message.rich_message != null) {
                    if (!messageObject.J2 || message.translatedRichMessage == null) {
                        return messageObject.u(wmVar.f51292e);
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
    public final void S0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f26868k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = org.telegram.messenger.bd.N0("PsaMessageInfo_" + messageObject.f26868k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = org.telegram.messenger.bd.M0(2131746602, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            org.telegram.messenger.zi.d(spannableStringBuilder, false);
            org.telegram.messenger.ui currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            wm wmVar = this.f45934a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f25702e;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.ri) arrayList.get(i3)).f25149l & 1) != 0) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) currentMessagesGroup.d.get(i3);
                        if (ziVar != messageObject) {
                            int childCount = wmVar.A0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = wmVar.A0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    if (ziVar.T(q1Var2.getMessageObject())) {
                                        q1Var = q1Var2;
                                    }
                                }
                            }
                            messageObject = ziVar;
                        }
                    } else {
                        i3++;
                    }
                }
            }
            wmVar.mc(messageObject, spannableStringBuilder, 1);
            q1Var.E3(1, false, true);
        }
    }

    @Override
    public final vq0 S1() {
        return this.f45934a.Qa;
    }

    @Override
    public final boolean T() {
        wm wmVar = this.f45934a;
        if (!org.telegram.messenger.l10.z(wmVar.f51306f) && !org.telegram.messenger.l10.B(wmVar.f51306f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.zi messageObject;
        if (chat == null) {
            return;
        }
        wm wmVar = this.f45934a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (!kVar.v() && !wmVar.W9()) {
            if (!z10 && chat.signature_profiles && (messageObject = q1Var.getMessageObject()) != null && org.telegram.messenger.zi.B0(messageObject.f26868k) != 1271266957) {
                wmVar.Na(org.telegram.messenger.m5.o(messageObject.f26868k.from_id));
                return;
            } else {
                k(q1Var, chat, i3, z10);
                return;
            }
        }
        wm.j2(wmVar, q1Var, true, f10, f11);
    }

    @Override
    public final void U1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new oi.h(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.camera.q.r(null, 2131752022, org.telegram.ui.Components.fc.a0(this.f45934a));
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        f(q1Var, true, true, false);
    }

    @Override
    public final boolean V1(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.V1(long):boolean");
    }

    @Override
    public final void W1(org.telegram.ui.Cells.q1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.W1(org.telegram.ui.Cells.q1, int, float, float, boolean):void");
    }

    @Override
    public final int X() {
        return this.f45934a.f51325g4;
    }

    @Override
    public final boolean X0(org.telegram.messenger.zi ziVar) {
        fl flVar;
        int i3 = (org.telegram.messenger.zi.B0(ziVar.f26868k) > 1271266957L ? 1 : (org.telegram.messenger.zi.B0(ziVar.f26868k) == 1271266957L ? 0 : -1));
        wm wmVar = this.f45934a;
        if ((i3 == 0 || ((flVar = wmVar.D0) != null && flVar.O)) && wmVar.f51325g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean Y1(org.telegram.ui.Cells.q1 r38, org.telegram.tgnet.TLRPC.TodoItem r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.Y1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final kh.a Z() {
        return this.f45934a.f51469rc;
    }

    @Override
    public final void Z1(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        wm wmVar = this.f45934a;
        if (org.telegram.messenger.g0.E1(wmVar.getParentActivity()) && (chat = wmVar.f51292e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
            long j10 = wmVar.f51292e.f27001id;
            long j11 = currentUser.f27150id;
            a0.h hVar = (a0.h) messagesController.f23171y1.f(j10);
            if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
                for (int i3 = 0; i3 < N0.participants.participants.size(); i3++) {
                    chatParticipant = N0.participants.participants.get(i3);
                    if (chatParticipant.user_id == j11) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j11);
            e(q1Var, chatParticipant);
        }
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        wm wmVar = this.f45934a;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            CharSequence fieldText = mjVar.getFieldText();
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
            String K = org.telegram.messenger.t3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                wmVar.f51237a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new pl(this, 6), 200L);
            }
        }
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
        Bundle j11 = a1.g.j(j10, "user_id");
        org.telegram.ui.ActionBar.d2 d2Var = this.f45934a;
        if (d2Var.getMessagesController().E(j11, d2Var, q1Var.getMessageObject(), null)) {
            d2Var.presentFragment(new wm(j11));
        }
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        wm wmVar = this.f45934a;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            CharSequence fieldText = mjVar.getFieldText();
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
            String n4 = org.telegram.messenger.l10.n(user);
            if (n4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(t4.c.q(org.telegram.messenger.l10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.y31("" + user.f27150id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            wmVar.f51237a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new pl(this, 7), 200L);
        }
    }

    @Override
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi messageObject;
        if (q1Var == null) {
            messageObject = null;
        } else {
            messageObject = q1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f26868k != null) {
            wm wmVar = this.f45934a;
            if (wmVar.f51325g4 != 1 && !wmVar.U9() && !messageObject.f26868k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        wm wmVar = this.f45934a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
            if (!kVar2.v() && !wmVar.W9()) {
                z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
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
    public final void c1() {
        wm wmVar = this.f45934a;
        wmVar.f8();
        UndoView undoView = wmVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, wmVar.f51376k6, null);
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c2;
        int i3;
        y4 b10;
        int i10;
        qj qjVar;
        pj pjVar;
        if (!h()) {
            return false;
        }
        wm wmVar = this.f45934a;
        if (wmVar.f51292e != null && (((qjVar = wmVar.f51279d1) == null || qjVar.getVisibility() != 0) && ((pjVar = wmVar.T) == null || pjVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = wmVar.f51292e;
        if (chat != null && ((wmVar.f51475s4 == 0 || wmVar.f51525w4) && (!org.telegram.messenger.t3.T(chat) || wmVar.f51292e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        e5[] e5VarArr = new e5[r22 + 2 + r42];
        e5VarArr[0] = e5.d;
        e5VarArr[1] = e5.h;
        if (r22 != 0) {
            e5VarArr[2] = e5.f44891n;
            c2 = 3;
        } else {
            c2 = 2;
        }
        if (r42 != 0) {
            e5VarArr[c2] = e5.f44892r;
        }
        TLRPC.UserFull b22 = wmVar.getMessagesController().b2(user.f27150id);
        if (b22 == null) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            b10 = y4.b(user, i3, e5VarArr);
        } else {
            b10 = y4.c(user, b22, e5VarArr);
            if (!b4.n.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                b10 = y4.b(user, i10, e5VarArr);
            }
        }
        if (b4.n.i(b10)) {
            b4.n.p().C((ViewGroup) wmVar.fragmentView, wmVar.f51557ya, b10, new b7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
        H.c(2131232266, org.telegram.messenger.bd.M0(2131747794, null), new Runnable(this) {
            public final hm f48909b;

            {
                this.f48909b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f48909b.o(user, false);
                        return;
                    case 1:
                        this.f48909b.b(user);
                        return;
                    default:
                        this.f48909b.f45934a.Ma(user);
                        return;
                }
            }
        }, false);
        H.c(2131232113, org.telegram.messenger.bd.M0(2131745611, null), new p1(this, q1Var, user, 24), false);
        H.l(2131232222, org.telegram.messenger.bd.M0(2131748617, null), new Runnable(this) {
            public final hm f48909b;

            {
                this.f48909b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f48909b.o(user, false);
                        return;
                    case 1:
                        this.f48909b.b(user);
                        return;
                    default:
                        this.f48909b.f45934a.Ma(user);
                        return;
                }
            }
        }, r22);
        H.l(2131232354, org.telegram.messenger.bd.M0(2131753758, null), new Runnable(this) {
            public final hm f48909b;

            {
                this.f48909b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f48909b.o(user, false);
                        return;
                    case 1:
                        this.f48909b.b(user);
                        return;
                    default:
                        this.f48909b.f45934a.Ma(user);
                        return;
                }
            }
        }, r42);
        H.f33748t = false;
        H.f33729i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        wm wmVar = this.f45934a;
        if (!wmVar.V9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (wmVar.getParentActivity() != null) {
                if (wmVar.f51279d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    mj mjVar = wmVar.f51237a0;
                    org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                    org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
                    ci ciVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    sf.b bVar = wmVar.f51263bc;
                    if (bVar != null) {
                        bVar.a(true);
                        wmVar.f51263bc = null;
                    }
                    if (str != null && q1Var.getMessageObject() != null) {
                        ci ciVar2 = new ci(wmVar, q1Var.getMessageObject().f1(), str, q1Var, 1);
                        wmVar.f51263bc = ciVar2;
                        ciVar = ciVar2;
                    } else {
                        wmVar.f51263bc = null;
                    }
                    mjVar.Z(keyboardButtonProto, messageObject, messageObject2, ciVar);
                }
            }
        }
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        wm wmVar = this.f45934a;
        wmVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(wmVar.getParentActivity()) && (chat = wmVar.f51292e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == wmVar.getUserConfig().e()) {
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
                    if (channelParticipant2.promoted_by == wmVar.getUserConfig().e()) {
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
                Activity parentActivity = wmVar.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                org.telegram.ui.Components.dy0.b(parentActivity, i3, -wmVar.f51292e.f27001id, currentUser, str2, z15, z16, z12, e6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == wmVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.t3.T(wmVar.f51292e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                wmVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.hp.i1(wmVar.f51292e);
                tL_channels_getParticipant.participant = wmVar.getMessagesController().j1(currentUser.f27150id);
                wmVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new c3.b(1), new ai.q4(12, this, q1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
            org.telegram.ui.Components.dy0.b(parentActivity2, i3, -wmVar.f51292e.f27001id, currentUser, str2, z152, z162, z12, e6Var);
        }
    }

    @Override
    public final void e0(int i3) {
        CharSequence U2;
        int i10;
        SpannableStringBuilder X2;
        int i11;
        wm wmVar = this.f45934a;
        try {
            if (i3 == 0) {
                wmVar.v7();
                ik ikVar = wmVar.O3;
                if (ikVar != null) {
                    ikVar.l(0L, 84, null, new pl(this, 1));
                    wmVar.O3.performHapticFeedback(3, 2);
                }
            } else if (i3 == 1) {
                String x10 = org.telegram.messenger.bd.x(wmVar.getMessagesController().f23135u4, true);
                if (wmVar.getMessagesController().f23135u4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(org.telegram.ui.Components.m11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(org.telegram.ui.Components.m11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.fc.a0(wmVar).G(2131624299, 6, X2).k(true);
                wmVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i3 == 2 || i3 == 3) {
                String x11 = org.telegram.messenger.bd.x(wmVar.getMessagesController().f23135u4, true);
                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(wmVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(wmVar.getMessagesController().f23118s4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i3 == 2) {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131743978, null), new pl(this, 2));
                } else if (wmVar.getMessagesController().f23135u4 <= 0) {
                    U2 = "";
                } else {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.bd.a0(null, null, 2131743977, x11), new pl(this, 3));
                }
                SpannableStringBuilder append2 = append.append(U2);
                a02.getClass();
                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), a02.f33774c);
                ibVar.c(2131624299, 36, 36, new String[0]);
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
                ibVar.f34651b.setText(append2);
                ibVar.f34651b.setSingleLine(false);
                ibVar.f34651b.setMaxLines(6);
                a02.b(ibVar, 7000).k(true);
                org.telegram.messenger.p2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.zi messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            wm wmVar = this.f45934a;
            if (wmVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f26868k) != null && messageObject.f26915w2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f26915w2.f22070g;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    org.telegram.messenger.xt xtVar = (org.telegram.messenger.xt) arrayList2.get(i3);
                    if (xtVar instanceof org.telegram.messenger.ku) {
                        arrayList.add(((org.telegram.messenger.ku) xtVar).f23872r0);
                    } else if (xtVar instanceof org.telegram.messenger.wu) {
                        arrayList.add(((org.telegram.messenger.wu) xtVar).f26256r0);
                    } else if (xtVar instanceof org.telegram.messenger.cu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.cu) xtVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.qt) obj).f24951b);
                        }
                    } else if (xtVar instanceof org.telegram.messenger.ou) {
                        ArrayList arrayList4 = ((org.telegram.messenger.ou) xtVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.qt) obj2).f24951b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.N2(null, wmVar, null);
                    return v12.h2(null, null, null, null, null, null, null, indexOf, new nl(wmVar, arrayList), null, 0L, 0L, 0L, true, new ml(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void f(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.zi primaryMessageObject;
        int i3;
        int i10;
        zi ziVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.K1 = true;
        wm wmVar = this.f45934a;
        wi wiVar = wmVar.A0;
        if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.f55518y < 0) {
            for (int childCount = wiVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = wmVar.A0.getChildAt(childCount);
                wmVar.A0.getClass();
                i3 = RecyclerView.R(childAt);
                if (i3 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i10 = wmVar.f9(childAt);
                        break;
                    }
                }
            }
        }
        i3 = -1;
        i10 = 0;
        if (z10 && i3 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                zi ziVar2 = wmVar.C0;
                wmVar.A0.getClass();
                ziVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) wmVar.M9), false);
            } else {
                wmVar.C0.h1(i3, i10);
            }
        }
        wmVar.f51267c1 = z11;
        wmVar.Vc(primaryMessageObject, false);
        wmVar.f51267c1 = false;
    }

    @Override
    public final boolean f0() {
        if (this.f45934a.f51325g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String M0;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        boolean z11 = false;
        am amVar = null;
        am amVar2 = null;
        File file = null;
        am amVar3 = null;
        am amVar4 = null;
        wm wmVar = this.f45934a;
        if (i3 == 19) {
            sf.b bVar = wmVar.f51263bc;
            if (bVar != null) {
                bVar.a(true);
            }
            if (q1Var.getMessageObject() != null) {
                amVar2 = new am(this, q1Var, 2);
            }
            final am amVar5 = amVar2;
            wmVar.f51263bc = amVar5;
            final Activity parentActivity = wmVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = wmVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            amVar5.d();
            amVar5.f54708b = new xg.e(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f26868k.media;
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
            final String b10 = xg.j.b(messageObject);
            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(-messageObject.Z0()));
            if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.f26868k.date * 1000;
            xg.s.d(messageObject, new org.telegram.messenger.u10(atomicBoolean, amVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f58698a;
                public final sf.b f58699b;
                public final boolean f58700c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f58701e;
                public final Context f58702f;
                public final e6 f58703g;

                {
                    this.f58701e = tL_messageMediaGiveaway2;
                    this.f58702f = parentActivity;
                    this.f58703g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f58698a.get()) {
                        this.f58699b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f58700c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f58701e;
                        Context context = this.f58702f;
                        e6 e6Var = this.f58703g;
                        if (z12) {
                            j.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            j.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        }
                    }
                }
            }, new xg.g(atomicBoolean, amVar5, 0));
        } else if (i3 == 21) {
            org.telegram.messenger.t0.u();
            boolean z12 = org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.t0.r();
            sf.c.t(wmVar.getParentActivity(), org.telegram.messenger.r2.f25045g);
        } else if (i3 == 84) {
            wmVar.Ta(q1Var);
        } else if (i3 == 80) {
            org.telegram.ui.Cells.n8 n8Var = org.telegram.ui.Components.se0.J1;
            if (wmVar.getParentActivity() != null) {
                wmVar.showDialog(new org.telegram.ui.Components.se0(wmVar.getContext(), wmVar.getCurrentAccount(), messageObject, wmVar.getResourceProvider()));
            }
        } else if (i3 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f26868k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(messageObject) == null) {
                    wmVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i3 == 5) {
            long j11 = messageObject.f26868k.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                user2 = org.telegram.messenger.hp.s1(i13).a2(Long.valueOf(j11));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f26868k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f27150id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                wmVar.presentFragment(new ProfileActivity(bundle, null));
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
                wmVar.showDialog(new org.telegram.ui.Components.vc0(wmVar, null, user2, null, file, mf.b.d(str, false), str3, str4, wmVar.f51557ya));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i3 == 30) {
            wmVar.presentFragment(new wm(a1.g.j(messageObject.f26868k.media.user_id, "user_id")));
        } else if (i3 == 31) {
            long j12 = messageObject.f26868k.media.user_id;
            if (j12 != 0) {
                i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                user = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(j12));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.X1)) {
                    M0 = messageObject.X1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = org.telegram.messenger.k5.i(new StringBuilder("+"), user.phone, mf.b.c());
                } else {
                    String str5 = org.telegram.messenger.zi.o1(messageObject.f26868k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        M0 = mf.b.c().b(str5);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131747840, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f27150id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                wmVar.presentFragment(new lr(bundle2));
            }
        } else if (i3 != 23 && i3 != 24) {
            if (messageObject.s4()) {
                wmVar.ja(messageObject, false, false);
                if (messageObject.R0 != null) {
                    sf.b bVar2 = wmVar.f51263bc;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        amVar3 = new am(this, q1Var, 4);
                    }
                    wmVar.f51263bc = amVar3;
                    sf.c.s(wmVar.getParentActivity(), Uri.parse(messageObject.R0), true, false, false, wmVar.f51263bc, null, false, wmVar.getMessagesController().f22988d6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage X1 = messageObject.X1();
            if (X1 == null && (message = messageObject.f26868k) != null && (messageMedia2 = message.media) != null) {
                X1 = messageMedia2.webpage;
            }
            if (X1 != null) {
                if (X1.attributes != null) {
                    for (int i14 = 0; i14 < X1.attributes.size(); i14++) {
                        if ((X1.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) X1.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.f1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            wmVar.getOrCreateStoryViewer().T(wmVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ei.i7.a(wmVar.A0));
                            return;
                        }
                    }
                }
                if (!wmVar.Ea(X1.url, q1Var, null, messageObject.f1(), 2)) {
                    sf.b bVar3 = wmVar.f51263bc;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        amVar4 = new am(this, q1Var, 5);
                    }
                    wmVar.f51263bc = amVar4;
                    sf.c.s(wmVar.getParentActivity(), Uri.parse(X1.url), true, true, false, wmVar.f51263bc, null, false, true, false, false);
                }
            }
        } else {
            if (i3 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f26868k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                sf.b bVar4 = wmVar.f51263bc;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (q1Var.getMessageObject() != null) {
                    amVar = new am(this, q1Var, 3);
                }
                wmVar.f51263bc = amVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    if (org.telegram.messenger.li.b0(i10).p0(group) == null) {
                        wmVar.f51263bc.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        wmVar.f51263bc.f54708b = new cg.l0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new gi.b3(3, this, z11)), 28);
                        return;
                    }
                }
                sf.c.s(wmVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, wmVar.f51263bc, null, false, true, false, false);
            }
        }
    }

    @Override
    public final void f2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f45934a.Vc(primaryMessageObject, false);
    }

    @Override
    public final String g(org.telegram.ui.Cells.q1 q1Var) {
        wm wmVar;
        int i3;
        if (q1Var.getMessageObject() != null && (i3 = (wmVar = this.f45934a).Xb) != 0 && i3 == q1Var.getMessageObject().f1() && wmVar.Yb == 3) {
            return wmVar.ac;
        }
        return null;
    }

    public final boolean h() {
        wm wmVar = this.f45934a;
        if (!org.telegram.messenger.l10.B(wmVar.f51306f)) {
            TLRPC.Chat chat = wmVar.f51292e;
            if (chat != null) {
                if (org.telegram.messenger.t3.T(chat) && !wmVar.f51292e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.f45934a.X7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void h2() {
        this.f45934a.M9();
    }

    @Override
    public final void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = th.g.a(messageObject);
            boolean a11 = x7.u.a(a10, 7);
            wm wmVar = this.f45934a;
            if (a11) {
                org.telegram.ui.Components.fc.a0(wmVar).Q(2131624006, 36, th.g.b(a10, messageObject)).j();
            } else if (i3 < 0 && !arrayList.isEmpty()) {
                wmVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                q1Var.a0(true);
            } else if (wmVar.getParentActivity() != null) {
                if (wmVar.C2 == null) {
                    int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
                    wmVar.C2 = D6;
                    D6.f13105v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i3 < 0) {
                    ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i12 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                        float y9 = ((q1Var.getY() + p1Var.f29778b) - org.telegram.messenger.g0.L(4.0f)) - wmVar.M9;
                        wmVar.F2 = org.telegram.messenger.g0.L(13.3f) + p1Var.f29777a;
                        int D = org.telegram.messenger.camera.q.D(6.0f, p1Var.f29778b, i11);
                        wmVar.G2 = D;
                        if (y9 > 0.0f) {
                            i10 = wmVar.F2;
                            i11 = D;
                            f10 = 0.0f;
                            break;
                        }
                        i12++;
                        f10 = y9;
                    }
                    if (f10 != 0.0f) {
                        wmVar.A0.w0(0, (int) f10, null);
                        wmVar.E2 = q1Var;
                        return;
                    }
                }
                wm.p2(wmVar, q1Var, i3, i10, i11);
            }
        }
    }

    @Override
    public final void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        xh.h hVar;
        int i3;
        boolean z10;
        boolean z11;
        float f12;
        xh.j jVar = this.f45934a.f51467ra;
        if (jVar != null && (hVar = (xh.h) jVar.f58865a.get(xh.j.b(q1Var))) != null) {
            xh.d[] dVarArr = hVar.f58860x;
            RectF rectF = hVar.f58857r;
            if (hVar.N) {
                float f13 = (f10 - rectF.left) + hVar.V;
                float f14 = (f11 - rectF.top) + hVar.W;
                int i10 = xh.g.f58842a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(xh.g.f58842a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i3 = b8.be.b(floor, 0, dVarArr.length - 1);
                } else {
                    i3 = -1;
                }
                if (hVar.S != i3) {
                    hVar.f58849a.performHapticFeedback(3, 1);
                    hVar.S = i3;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        xh.d dVar = dVarArr[i11];
                        if (i3 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f58820p != z10) {
                            ValueAnimator valueAnimator = dVar.f58818n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f58820p = z10;
                            float f16 = dVar.f58819o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f58818n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f58818n.addUpdateListener(dVar);
                            dVar.f58818n.setInterpolator(xh.f.f58824a);
                            dVar.f58818n.start();
                        }
                        xh.d dVar2 = dVarArr[i11];
                        if (i3 != i11 && i3 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f58817m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f58815k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f58817m = z11;
                            float f17 = dVar2.f58816l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f58815k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f58815k.addUpdateListener(dVar2);
                            dVar2.f58815k.setInterpolator(xh.f.f58824a);
                            dVar2.f58815k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f45934a.l8(q1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f25040a;
        org.telegram.messenger.t0.r();
        sf.c.t(this.f45934a.getParentActivity(), org.telegram.messenger.r2.f25045g);
    }

    @Override
    public final int j0(org.telegram.ui.Cells.q1 q1Var) {
        th.b bVar;
        wm wmVar = this.f45934a;
        if (wmVar.f51264bd.f53841f && (bVar = wmVar.f51345hd) != null && bVar.f55392n == q1Var && bVar.f55387a.getWidth() > 0) {
            return wmVar.f51345hd.f55387a.getHeight();
        }
        return 0;
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, boolean z10) {
        wm wmVar = this.f45934a;
        TLRPC.Chat chat2 = wmVar.f51292e;
        if (chat2 != null && chat.f27001id == chat2.f27001id) {
            qi qiVar = wmVar.f51433p1;
            if (qiVar != null && i3 == 0) {
                qiVar.e(false, false);
            } else if (q1Var.getMessageObject() != null) {
                wmVar.l(i3, q1Var.getMessageObject().f1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f27001id != chat2.f27001id || wmVar.da()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f27001id);
            if (i3 != 0) {
                bundle.putInt("message_id", i3);
            }
            di diVar = null;
            if (z10) {
                sf.b bVar = wmVar.f51263bc;
                if (bVar != null) {
                    bVar.a(true);
                    wmVar.f51263bc = null;
                }
                if (q1Var != null && q1Var.getMessageObject() != null) {
                    di diVar2 = new di(wmVar, q1Var.getMessageObject().f1(), q1Var, 0);
                    wmVar.f51263bc = diVar2;
                    diVar = diVar2;
                } else {
                    wmVar.f51263bc = null;
                }
            }
            if (wmVar.getMessagesController().E(bundle, wmVar, q1Var.getMessageObject(), diVar)) {
                di diVar3 = diVar;
                wm wmVar2 = new wm(bundle);
                if (diVar3 != null && i3 != 0) {
                    org.telegram.messenger.g0.i3(new ai.p1(this, diVar3, chat, i3, wmVar2, 13), 5000L);
                    diVar3.d();
                    return;
                }
                wmVar.presentFragment(wmVar2);
            }
        }
    }

    @Override
    public final void k0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        wm wmVar = this.f45934a;
        if (wmVar.getParentActivity() != null) {
            if (wmVar.f51467ra == null) {
                xh.j jVar = new xh.j(wmVar.getParentActivity());
                wmVar.f51467ra = jVar;
                wmVar.m1.addView(jVar, b8.mf.e(-1, -1, 48));
            }
            xh.j jVar2 = wmVar.f51467ra;
            HashMap hashMap = jVar2.f58865a;
            ArrayList arrayList = jVar2.f58867c;
            arrayList.clear();
            int i3 = jVar2.d;
            org.telegram.messenger.h10 i10 = org.telegram.messenger.h10.i(i3);
            long j10 = i10.f22848n;
            arrayList.add(Long.valueOf(j10));
            if (i10.W) {
                ArrayList arrayList2 = org.telegram.messenger.li.b0(i3).f24032j1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j11 = tL_topPeer.peer.user_id;
                    if (j11 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.hp.s1(i3).f23169y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j12 = dialog.f27005id;
                    if (j12 != j10 && !org.telegram.messenger.m5.C(j12)) {
                        if (org.telegram.messenger.m5.E(dialog.f27005id)) {
                            TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(dialog.f27005id));
                            if (a22 != null && !org.telegram.messenger.l10.t(a22) && !org.telegram.messenger.l10.x(a22) && !org.telegram.messenger.l10.A(a22.f27150id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f27005id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f27005id));
                                }
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-dialog.f27005id));
                            if (M0 != null && !M0.forum && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f27005id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f27005id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = xh.j.b(q1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    Long l10 = (Long) obj2;
                    if (hashSet.add(l10) && org.telegram.messenger.m5.E(l10.longValue())) {
                        arrayList5.add(l10);
                    }
                }
                xh.h hVar = new xh.h(jVar2, q1Var, arrayList5, new xh.i(0, jVar2, b10));
                hVar.setBounds(0, 0, jVar2.getMeasuredWidth(), jVar2.getMeasuredHeight());
                hVar.setCallback(jVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27150id);
            org.telegram.ui.ActionBar.d2 d2Var = this.f45934a;
            if (d2Var.getMessagesController().E(bundle, d2Var, q1Var.getMessageObject(), null)) {
                d2Var.presentFragment(new wm(bundle));
            }
        }
    }

    public final void m(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f27001id);
            bundle.putBoolean("expandPhoto", false);
            this.f45934a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final boolean m0() {
        boolean z10;
        wm wmVar = this.f45934a;
        if (!wmVar.W9()) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean m2(int i3) {
        boolean z10;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        if (i3 != 16 && i3 != 2131296267 && i3 != 2131296264) {
            return false;
        }
        wm wmVar = this.f45934a;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inPreviewMode;
        if (z10 && wmVar.f51288da) {
            q4Var = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
            if (q4Var != null) {
                q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).parentLayout;
                ((ActionBarLayout) q4Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
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
        long j10;
        long j11;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(messageObject);
        if (messageMedia != null && messageObject != null && (n12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                E1(q1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            wm wmVar = this.f45934a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(wmVar)) {
                    la0 la0Var = new la0(3);
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                    la0Var.setResourceProvider(e6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = wmVar.getMessagesController().z1(wmVar.a());
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
                    la0Var.Q0 = false;
                    la0Var.G0(new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, false));
                    wmVar.presentFragment(la0Var);
                }
            } else if (org.telegram.messenger.zi.O2(messageMedia.document)) {
                is.p().v(wmVar.getParentActivity());
                is.p().u(new fm(this, tL_messageMediaPoll, pollAnswer, q1Var));
                is p10 = is.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.zi.I2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, e6Var, 200);
            } else if (org.telegram.messenger.zi.K3(messageMedia.document)) {
                org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
                if (MediaController.B().I(messageObject) && ziVar != null) {
                    boolean z12 = ziVar.f26869k0;
                    if (i3 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(ziVar);
                            return;
                        } else {
                            MediaController.B().R(ziVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f26868k;
                TLRPC.TL_message Q7 = wm.Q7(message);
                Q7.media = messageMedia;
                Q7.attachPath = th.d.c(i3, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i16, Q7, false, true);
                if (i3 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ziVar2.f26869k0 = z10;
                arrayList.add(ziVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, ziVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.zi.L4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    th.a aVar = new th.a(i14, messageObject, document6, th.d.c(i3, messageObject.f26868k));
                    if (aVar.f55386g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else if (!aVar.f55385f) {
                        org.telegram.messenger.w7.G(i14).X(document6, messageObject, 2, 0);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f26868k;
                        TLRPC.TL_message Q72 = wm.Q7(message2);
                        Q72.media = messageMedia;
                        Q72.attachPath = th.d.c(i3, message2);
                        i15 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(i15, Q72, false, true);
                        if (org.telegram.messenger.zi.y(messageMedia.document)) {
                            PhotoViewer.v1().N2(null, wmVar, wmVar.f51557ya);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i18 = ziVar3.D;
                            long j12 = 0;
                            if (i18 != 0) {
                                j10 = wmVar.f51376k6;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = wmVar.f51272c7;
                            } else {
                                j11 = 0;
                            }
                            if (i18 != 0) {
                                j12 = wmVar.b();
                            }
                            v12.i2(ziVar3, wmVar, j10, j11, j12, wmVar.f51248ab);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(ziVar3, wmVar.getParentActivity(), wmVar.f51557ya, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            wmVar.L6(ziVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f26868k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.zi.L4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message Q73 = wm.Q7(message3);
                    Q73.media = messageMedia3;
                    Q73.attachPath = th.d.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.zi(i13, Q73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.J0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.zi.L4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message Q74 = wm.Q7(message3);
                    Q74.media = messageMedia2;
                    Q74.attachPath = th.d.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    Q74.message = pollResults2.solution;
                    Q74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.zi(i12, Q74, false, true));
                    arrayList2.add(-3);
                }
                dg.d.b(tL_messageMediaPoll.poll, wmVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.zi.L4(document))) {
                        if (pollAnswer2.unshuffled_index == i3) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message Q75 = wm.Q7(message3);
                        Q75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        Q75.message = tL_textWithEntities2.text;
                        Q75.entities = tL_textWithEntities2.entities;
                        Q75.attachPath = th.d.c(pollAnswer2.unshuffled_index, message3);
                        i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.zi(i11, Q75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f26890q0 = arrayList2;
                    PhotoViewer.v1().N2(null, wmVar, wmVar.f51557ya);
                    PhotoViewer.v1().e2(arrayList3, i10, wmVar.a(), 0L, 0L, wmVar.f51262bb);
                }
            }
        }
    }

    @Override
    public final void n0(String str) {
        wm wmVar = this.f45934a;
        qj qjVar = wmVar.f51279d1;
        if (qjVar == null || qjVar.getVisibility() != 0) {
            pj pjVar = wmVar.T;
            if ((pjVar == null || pjVar.getVisibility() != 0) && wmVar.f51237a0 != null && str != null && str.length() > 0) {
                mj mjVar = wmVar.f51237a0;
                mjVar.setFieldText("@" + str + " ");
                wmVar.f51237a0.G0();
            }
        }
    }

    @Override
    public final boolean n1() {
        wm wmVar = this.f45934a;
        if (wmVar.m1.getMeasuredWidth() > wmVar.m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    public final void o(TLRPC.User user, boolean z10) {
        int i3;
        if (user != null && user.f27150id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f27150id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            wm wmVar = this.f45934a;
            TLRPC.User user2 = wmVar.f51306f;
            if (user2 != null && user2.f27150id == user.f27150id) {
                i10 = 1;
            }
            profileActivity.g5(i10);
            Activity parentActivity = wmVar.getParentActivity();
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i3);
            wmVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        TLRPC.InputStickerSet j12;
        int i3;
        wm wmVar = this.f45934a;
        if (!wmVar.getMessagesController().D3() && p5Var != null && !p5Var.standard) {
            long documentId = p5Var.getDocumentId();
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                document = org.telegram.ui.Components.g5.e(i3, documentId);
            }
            if (document != null && (j12 = org.telegram.messenger.zi.j1(document)) != null) {
                org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).m0(j12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(j12);
                org.telegram.ui.Components.pu puVar = new org.telegram.ui.Components.pu(wmVar, wmVar.getParentActivity(), wmVar.f51557ya, arrayList);
                org.telegram.ui.Components.hu huVar = puVar.f37242n1;
                huVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(huVar);
                huVar.f34513w = imageReceiver;
                if (huVar.d) {
                    imageReceiver.P();
                }
                huVar.f34514x = true;
                huVar.f34515y.e(true, 1.0f);
                huVar.f34513w.r0(org.telegram.messenger.ac.b(document), "140_140", org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, true), 0L, null, null, 0);
                huVar.f34513w.E0(7);
                ImageReceiver imageReceiver2 = huVar.f34513w;
                imageReceiver2.f21274v0 = true;
                imageReceiver2.f21272u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = huVar.f34513w;
                imageReceiver3.f21280x0 = true;
                imageReceiver3.H0(huVar);
                boolean T9 = wmVar.T9();
                puVar.f28604i0 = T9;
                puVar.f28608n = T9;
                wmVar.showDialog(puVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void o2() {
        wm wmVar = this.f45934a;
        if (wmVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", wmVar.f51376k6);
            bundle.putInt("start_from", 10);
            wmVar.presentFragment(new org.telegram.ui.Components.r80(bundle, wmVar.f51433p1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.fc.a0(wmVar).Q(2131624216, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.bd.H(',', "UnlockSimilarChannelsPremium", wmVar.getMessagesController().f23164x4), new pl(this, 4))).j();
    }

    @Override
    public final void p(org.telegram.ui.Cells.q1 q1Var) {
        float f10;
        if (q1Var.getMessageObject().z3()) {
            c1();
            return;
        }
        wm wmVar = this.f45934a;
        if (!wmVar.A3 && wmVar.A0 != null && wmVar.getParentActivity() != null && wmVar.fragmentView != null) {
            if (wmVar.J2 == null) {
                int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
                if (indexOfChild != -1) {
                    gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
                    wmVar.J2 = D6;
                    D6.u(org.telegram.messenger.bd.M0(2131749337, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = q1Var.getCurrentUser();
                if (currentUser != null && currentUser.f27150id == 0) {
                    f10 = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.Q3() && q1Var.f29967j9 && q1Var.U8 != null) {
                        f10 = org.telegram.messenger.g0.L(20.0f) + L;
                    } else {
                        f10 = L;
                    }
                }
                if (wmVar.u9(q1Var, f10) > org.telegram.messenger.g0.L(80.0f)) {
                    wmVar.J2.x(wmVar.t9(q1Var, q1Var.getForwardNameCenterX()), wmVar.u9(q1Var, f10) - org.telegram.messenger.g0.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wm wmVar = this.f45934a;
        wmVar.X7(q1Var, false, false, f10, f11, true, false, false);
        wmVar.A0.getClass();
        wm.k2(wmVar, RecyclerView.R(q1Var));
    }

    @Override
    public final boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        wm wmVar = this.f45934a;
        if (wmVar.Xb != 0 && q1Var.getMessageObject() != null && wmVar.Xb == q1Var.getMessageObject().f1() && wmVar.Yb == i3) {
            return true;
        }
        return false;
    }

    @Override
    public final void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
        org.telegram.messenger.zi messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        wm wmVar = this.f45934a;
        gi.l3 l3Var = wmVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (wmVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.bd.E0().f21812y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            gi.l3 l3Var2 = new gi.l3(wmVar.getParentActivity(), 3);
            l3Var2.r(true);
            l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var2.d = -1L;
            l3Var2.U = true;
            l3Var2.f13084e = true;
            l3Var2.s(12.0f);
            wmVar.P1 = l3Var2;
            l3Var2.f13100r0 = new sc(22, this, l3Var2);
            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750849, str)));
            wmVar.P1.l(wmVar.L);
            wmVar.m1.addView(wmVar.P1, b8.mf.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            wmVar.m1.post(new k2.a0(this, q1Var, i10, i3, 12));
        }
    }

    @Override
    public final void q() {
        this.f45934a.m1.getClass();
    }

    @Override
    public final org.telegram.ui.Cells.i9 q2() {
        return this.f45934a.r9;
    }

    @Override
    public final void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, false, z11);
    }

    @Override
    public final void s(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.s(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        wm wmVar = this.f45934a;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        boolean z10 = true;
        if (!kVar.v() && !wmVar.W9()) {
            if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().s4()) {
                f1(q1Var, 10);
                return;
            }
            if (!org.telegram.messenger.t3.c0(wmVar.f51292e) && !wmVar.da()) {
                z10 = false;
            }
            o(user, z10);
            return;
        }
        wm.j2(wmVar, q1Var, true, f10, f11);
    }

    @Override
    public final void t0(org.telegram.ui.Cells.q1 r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.t0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var) {
        wm.e5(this.f45934a, q1Var);
    }

    @Override
    public final void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        f(q1Var, z10, false, false);
    }

    @Override
    public final void v() {
        this.f45934a.Bc();
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
        int i3;
        int i10;
        zi ziVar;
        org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f26826a3 = !primaryMessageObject.f26826a3;
            primaryMessageObject.K1 = true;
            wm wmVar = this.f45934a;
            wi wiVar = wmVar.A0;
            if (wiVar != null && (ziVar = wmVar.C0) != null && ziVar.f55518y < 0) {
                for (int childCount = wiVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = wmVar.A0.getChildAt(childCount);
                    wmVar.A0.getClass();
                    i3 = RecyclerView.R(childAt);
                    if (i3 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = wmVar.f9(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = wmVar.f9(childAt);
                            break;
                        }
                    }
                }
            }
            i3 = -1;
            i10 = 0;
            wmVar.Vc(primaryMessageObject, false);
            gi.l3 l3Var = wmVar.P1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (i3 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
                wmVar.C0.h1(i3, i10);
            }
        }
    }

    @Override
    public final boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i3;
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
        y4 y4Var;
        int i16;
        int i17;
        e5 e5Var;
        qj qjVar;
        pj pjVar;
        if (!h()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        wm wmVar = this.f45934a;
        if (!isEmpty && wmVar.f51292e != null && (((qjVar = wmVar.f51279d1) == null || qjVar.getVisibility() != 0) && ((pjVar = wmVar.T) == null || pjVar.getVisibility() != 0))) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        TLRPC.Chat chat2 = wmVar.f51292e;
        if (chat2 != null && ((wmVar.f51475s4 == 0 || wmVar.f51525w4) && (!org.telegram.messenger.t3.T(chat2) || wmVar.f51292e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = wmVar.f51292e;
        if (chat3 != null && chat3.f27001id == chat.f27001id && !wmVar.da()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        e5[] e5VarArr = new e5[i11 + 1 + i3 + i10];
        e5VarArr[0] = e5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                e5Var = e5.f44889e;
            } else {
                e5Var = e5.f44890f;
            }
            e5VarArr[1] = e5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i3 != 0) {
            e5VarArr[i12] = e5.f44891n;
            i12++;
        }
        if (i10 != 0) {
            e5VarArr[i12] = e5.f44892r;
        }
        TLRPC.ChatFull N0 = wmVar.getMessagesController().N0(chat.f27001id);
        if (N0 == null) {
            i13 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
            org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 0, chat);
            org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.f22829t0, 1, chat);
            if (m11 != null && (m11.f21492k instanceof TLRPC.TL_photoStrippedSize)) {
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
            i14 = i3;
            i15 = i10;
            str2 = null;
            z11 = i11;
            y4Var = new y4(m10, m11, null, str, null, null, bitmapDrawable, chat, e5VarArr, new a5(i13, org.telegram.messenger.hs.T, chat));
        } else {
            y4Var = y4.a(chat, N0, e5VarArr);
            i14 = i3;
            i15 = i10;
            z10 = true;
            str2 = null;
            z11 = i11;
        }
        if (b4.n.i(y4Var)) {
            b4.n.p().C((ViewGroup) wmVar.fragmentView, wmVar.f51557ya, y4Var, new b7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(wmVar, q1Var);
        H.c(2131232266, org.telegram.messenger.bd.M0(2131747794, str2), new sl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = 2131232088;
        } else {
            i16 = 2131232113;
        }
        if (z12) {
            i17 = 2131747819;
        } else {
            i17 = 2131747807;
        }
        H.l(i16, org.telegram.messenger.bd.M0(i17, str2), new p1(this, q1Var, chat, 25), z11);
        H.l(2131232222, org.telegram.messenger.bd.M0(2131748617, str2), new sl(this, chat, z10 ? 1 : 0), i14);
        H.l(2131232354, org.telegram.messenger.bd.M0(2131753758, str2), new sl(this, chat, 2), i15);
        H.f33748t = false;
        H.f33729i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean x0(org.telegram.messenger.zi ziVar) {
        return !this.f45934a.f51470s.containsKey(ziVar);
    }

    @Override
    public final void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        wm wmVar = this.f45934a;
        if (!wmVar.V9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (wmVar.getParentActivity() != null) {
                if (wmVar.f51279d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) wmVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) wmVar.f51557ya, false);
                        t2Var.N();
                        t2Var.P = str;
                        t2Var.Q = false;
                        t2Var.R = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131751767, null)};
                        u uVar = new u(2, wmVar, str);
                        t2Var.M = charSequenceArr;
                        t2Var.L = uVar;
                        wmVar.showDialog(t2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        wmVar.za(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void y(org.telegram.ui.Cells.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hm.y(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void y0(org.telegram.ui.Cells.q1 q1Var) {
        th.b bVar = this.f45934a.f51345hd;
        if (bVar != null && bVar.f55392n == q1Var) {
            bVar.f55396x.getClass();
        }
    }

    @Override
    public final boolean y1() {
        wm wmVar = this.f45934a;
        if (wmVar.m1.getKeyboardHeight() + wmVar.Ia >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final String z(long j10) {
        TLRPC.Peer peer;
        String C0;
        wm wmVar = this.f45934a;
        if (org.telegram.messenger.l10.u(wmVar.f51306f)) {
            return null;
        }
        TLRPC.Chat chat = wmVar.f51292e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = wmVar.getMessagesController().C0(wmVar.f51292e.f27001id, j10)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = wmVar.f51463r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return org.telegram.messenger.bd.M0(2131744030, null);
    }

    @Override
    public final void z0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Components.t5 m10;
        wm wmVar = this.f45934a;
        if (!wmVar.A3 && !org.telegram.messenger.az.A0 && wmVar.A0 != null && wmVar.getParentActivity() != null && wmVar.fragmentView != null) {
            gi.l3 l3Var = wmVar.I2;
            if (l3Var == null || !l3Var.W) {
                if (l3Var == null) {
                    int indexOfChild = wmVar.m1.indexOfChild(wmVar.U);
                    if (indexOfChild != -1) {
                        gi.l3 D6 = wmVar.D6(250.0f, 3, indexOfChild + 1, false);
                        wmVar.I2 = D6;
                        D6.d = 10000L;
                        D6.m(wmVar.getParentActivity().getResources().getDrawable(2131232785).mutate());
                        wmVar.I2.u(org.telegram.messenger.bd.M0(2131753762, null));
                    } else {
                        return;
                    }
                }
                int childCount = wmVar.A0.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = wmVar.A0.getChildAt(i3);
                    if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.zi.M4(messageObject.f26868k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !wmVar.I2.W) {
                        ImageReceiver photoImage = q1Var.getPhotoImage();
                        float u92 = wmVar.u9(q1Var, photoImage.M0);
                        float f10 = photoImage.O0;
                        View view = (View) q1Var.getParent();
                        float u93 = wmVar.u9(q1Var, -q1Var.getTop());
                        if (u92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((u92 + f10) - u93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            wmVar.Ib = q1Var;
                            gi.l3 l3Var2 = wmVar.I2;
                            l3Var2.f13100r0 = new xe(wmVar, 23);
                            l3Var2.x(wmVar.t9(q1Var, q1Var.getNoSoundIconCenterX()), u92, true);
                            org.telegram.messenger.az.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        boolean z10 = q1Var.getMessageObject().f26868k.media instanceof TLRPC.TL_messageMediaGiveaway;
        wm wmVar = this.f45934a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().f26868k.media).channels.get(i3).longValue();
            if (wmVar.f51376k6 != j10) {
                wmVar.presentFragment(wm.ra(j10));
            } else {
                wmVar.f51433p1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().f26868k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            wmVar.presentFragment(ProfileActivity.A4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().f26868k.media).winners.get(i3).longValue()));
        }
    }
}
