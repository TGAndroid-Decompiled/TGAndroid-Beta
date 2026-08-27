package org.telegram.ui.Components;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class j implements pk0 {

    public final int f29526a;

    public final Object f29527b;

    public j(Object obj, int i10) {
        this.f29526a = i10;
        this.f29527b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        r8 r8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        long jLongValue;
        MessagesController.DialogFilter dialogFilter2;
        UndoView undoViewY3;
        int i11;
        int i12;
        MessagesController.DialogFilter dialogFilter3;
        long jLongValue2;
        UndoView undoViewY4;
        int i13;
        boolean z11;
        String str;
        dj0 dj0Var;
        ux0 ux0Var;
        int iIntValue;
        int iIntValue2;
        ag.p1 p1Var;
        CharSequence charSequenceReplaceEmoji;
        t5[] t5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i14 = this.f29526a;
        long j10 = 0;
        ?? r10 = -1;
        int i15 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        ?? r11 = 0;
        Object obj = this.f29527b;
        switch (i14) {
            case 0:
                ((e0) obj).K0.G(i10 - 1);
                break;
            case 1:
                ((q) obj).f31714b0.G(i10 - 1);
                break;
            case 2:
                s8 s8Var = (s8) obj;
                org.telegram.ui.w7 w7Var = s8Var.W2;
                v8 v8Var = s8Var.Y2;
                if (view instanceof t8) {
                    t8 t8Var = (t8) view;
                    if (!t8Var.d) {
                        r8 r8Var2 = t8Var.f32682a;
                        s8Var.V2 = r8Var2.f32099a;
                        v8Var.f33295a.b(r8Var2, false);
                        if (w7Var != null) {
                            w7Var.l();
                        }
                        v8Var.n0();
                    }
                }
                if (s8Var.V2 != 1 && (r8Var = s8Var.X2) != null) {
                    s8Var.V2 = 1;
                    v8Var.f33295a.b(r8Var, true);
                    if (w7Var != null) {
                        w7Var.l();
                    }
                    v8Var.n0();
                    break;
                } else if (v8Var.O == null) {
                    if (!v8Var.f33295a.v) {
                        v8Var.g0(true, true, true);
                    }
                    r8 r8Var3 = v8Var.f33295a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(v8Var.getParentActivity(), v8Var.getClassGuid());
                    j8 j8Var = new j8(v8Var, v8Var.getParentActivity());
                    v8Var.O = j8Var;
                    j8Var.fixNavigationBar();
                    v8Var.O.pauseAllHeavyOperations = false;
                    v8Var.h = true;
                    v8Var.f33298e.setBackground(new BitmapDrawable(v8Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(v8Var.fragmentView, 12.0f, 10)));
                    v8Var.h = false;
                    v8Var.f33298e.setVisibility(0);
                    v8Var.f33298e.setAlpha(0.0f);
                    v8Var.f33299f = true;
                    v8Var.fragmentView.invalidate();
                    v8Var.f33298e.animate().setListener(new k8(v8Var, r11)).alpha(1.0f).setDuration(200L).start();
                    v8Var.U = new r8();
                    l8 l8Var = new l8(v8Var.getParentActivity(), r11, new i8(v8Var, i15), r11);
                    r8 r8Var4 = v8Var.f33295a.h;
                    if (r8Var4 != null) {
                        r8 r8Var5 = v8Var.U;
                        int i16 = r8Var4.f32103f;
                        r8Var5.f32103f = i16;
                        l8Var.e(i16, 3);
                        r8 r8Var6 = v8Var.U;
                        int i17 = v8Var.f33295a.h.f32102e;
                        r8Var6.f32102e = i17;
                        l8Var.e(i17, 2);
                        r8 r8Var7 = v8Var.U;
                        int i18 = v8Var.f33295a.h.d;
                        r8Var7.d = i18;
                        l8Var.e(i18, 1);
                        r8 r8Var8 = v8Var.U;
                        int i19 = v8Var.f33295a.h.f32101c;
                        r8Var8.f32101c = i19;
                        l8Var.e(i19, 0);
                    }
                    r8 r8Var9 = v8Var.U;
                    if (r8Var9.f32103f != 0) {
                        i15 = 4;
                    } else if (r8Var9.f32102e != 0) {
                        i15 = 3;
                    } else if (r8Var9.d == 0) {
                        i15 = 1;
                    }
                    l8Var.f(-1, 4, i15, false);
                    v8Var.f33295a.b(v8Var.U, true);
                    v8Var.n0();
                    ?? linearLayout = new LinearLayout(v8Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(l8Var);
                    FrameLayout frameLayout = new FrameLayout(v8Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.g6.Oh));
                    TextView textView = new TextView(v8Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    frameLayout.addView(textView, h7.z5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, h7.z5.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new q2(v8Var, zArr));
                    v8Var.O.setCustomView(linearLayout);
                    j8 j8Var2 = v8Var.O;
                    j8Var2.smoothKeyboardAnimationEnabled = true;
                    j8Var2.setDimBehind(false);
                    v8Var.O.show();
                    v8Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                ap.p((ap) obj, view, i10);
                break;
            case 4:
                uq uqVar = (uq) obj;
                zk0 zk0Var = uqVar.d;
                if (i10 > 3) {
                    uqVar.Z = (TLRPC.Peer) uqVar.U.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.d4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i20 = 0;
                    while (i20 < zk0Var.getChildCount()) {
                        View childAt = zk0Var.getChildAt(i20);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.d4)) {
                            ((org.telegram.ui.Cells.d4) childAt).c(false, z10);
                        }
                        i20++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                yy yyVar = ((gx) obj).B;
                int i21 = yyVar.Y0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = yyVar.U1;
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i21).getFeaturedEmojiSets();
                    while (r11 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = featuredEmojiSets.get(r11);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered3.set;
                            tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.f22407id == stickerSetCovered3.set.f22407id) {
                                r10 = r11;
                            }
                        }
                        r10 = r10;
                        r11++;
                    }
                    MediaDataController.getInstance(i21).markFeaturedStickersAsRead(true, true);
                    cv cvVar = new cv(n2Var, yyVar.getContext(), n2Var == null ? yyVar.V1 : n2Var.getResourceProvider(), arrayList2);
                    if (r10 >= 0) {
                        cvVar.K = r10 == true ? 1 : 0;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(cvVar);
                    } else {
                        cvVar.show();
                    }
                }
                break;
            case 6:
                yy yyVar2 = ((py) obj).v;
                yyVar2.f35025p1.o(new j41(yyVar2.getContext(), new rw(yyVar2), yyVar2.f35039t1, yyVar2.f35042u1, yyVar2.f35045v1, (TLRPC.StickerSetCovered) view.getTag(), yyVar2.V1));
                break;
            case 7:
                b00 b00Var = (b00) obj;
                org.telegram.ui.zt ztVar = b00Var.f26870r;
                ArrayList arrayList3 = b00Var.f26866c.d.f26871s;
                MessagesController.DialogFilter dialogFilter4 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.x2 ? ((org.telegram.ui.ActionBar.x2) view).f23947e : false;
                org.telegram.ui.gy gyVar = ((org.telegram.ui.hw) ztVar.f45251b).f38894a;
                ArrayList arrayList4 = gyVar.E2;
                ArrayList arrayListI = b00.I(gyVar, dialogFilter4, arrayList4, true, false);
                if (z12) {
                    if (dialogFilter4 != null) {
                        gyVar.presentFragment(new org.telegram.ui.q00(null, arrayListI));
                    } else if (z12) {
                        for (i12 = 0; i12 < arrayList4.size(); i12++) {
                            dialogFilter4.neverShow.add((Long) arrayList4.get(i12));
                            dialogFilter4.alwaysShow.remove(arrayList4.get(i12));
                        }
                        dialogFilter3 = dialogFilter4;
                        org.telegram.ui.q00.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar, null);
                        jLongValue2 = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                        undoViewY4 = gyVar.Y3();
                        if (undoViewY4 != null) {
                            undoViewY4.k(jLongValue2, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                        }
                        gyVar = gyVar;
                    } else {
                        if (arrayListI.isEmpty()) {
                            dialogFilter = dialogFilter4;
                        } else {
                            for (i11 = 0; i11 < arrayListI.size(); i11++) {
                                dialogFilter4.neverShow.remove(arrayListI.get(i11));
                            }
                            dialogFilter4.alwaysShow.addAll(arrayListI);
                            dialogFilter = dialogFilter4;
                            org.telegram.ui.q00.t0(dialogFilter, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar, null);
                        }
                        gyVar = gyVar;
                        jLongValue = arrayListI.size() == 1 ? ((Long) arrayListI.get(0)).longValue() : 0L;
                        dialogFilter2 = dialogFilter;
                        undoViewY3 = gyVar.Y3();
                        if (undoViewY3 != null) {
                            undoViewY3.k(jLongValue, 20, Integer.valueOf(arrayListI.size()), dialogFilter2, null, null);
                        }
                    }
                    gyVar.b4(true);
                } else {
                    int size = arrayListI.size() + (dialogFilter4 != null ? dialogFilter4.alwaysShow.size() : 0);
                    if ((size <= gyVar.getMessagesController().dialogFiltersChatsLimitDefault || gyVar.getUserConfig().isPremium()) && size <= gyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        if (dialogFilter4 != null) {
                            gyVar.presentFragment(new org.telegram.ui.q00(null, arrayListI));
                        } else if (z12) {
                            while (i12 < arrayList4.size()) {
                                dialogFilter4.neverShow.add((Long) arrayList4.get(i12));
                                dialogFilter4.alwaysShow.remove(arrayList4.get(i12));
                            }
                            dialogFilter3 = dialogFilter4;
                            org.telegram.ui.q00.t0(dialogFilter3, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar, null);
                            jLongValue2 = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                            undoViewY4 = gyVar.Y3();
                            if (undoViewY4 != null) {
                                undoViewY4.k(jLongValue2, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                            }
                            gyVar = gyVar;
                        } else {
                            if (arrayListI.isEmpty()) {
                                while (i11 < arrayListI.size()) {
                                    dialogFilter4.neverShow.remove(arrayListI.get(i11));
                                }
                                dialogFilter4.alwaysShow.addAll(arrayListI);
                                dialogFilter = dialogFilter4;
                                org.telegram.ui.q00.t0(dialogFilter, dialogFilter4.flags, dialogFilter4.name, dialogFilter4.entities, dialogFilter4.title_noanimate, dialogFilter4.color, dialogFilter4.alwaysShow, dialogFilter4.neverShow, dialogFilter4.pinnedDialogs, false, false, true, true, false, gyVar, null);
                            } else {
                                dialogFilter = dialogFilter4;
                            }
                            gyVar = gyVar;
                            jLongValue = arrayListI.size() == 1 ? ((Long) arrayListI.get(0)).longValue() : 0L;
                            dialogFilter2 = dialogFilter;
                            undoViewY3 = gyVar.Y3();
                            if (undoViewY3 != null) {
                                undoViewY3.k(jLongValue, 20, Integer.valueOf(arrayListI.size()), dialogFilter2, null, null);
                            }
                        }
                        gyVar.b4(true);
                    } else {
                        gyVar.showDialog(new ag.i1(4, ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, gyVar.fragmentView.getContext(), gyVar, null));
                    }
                }
                b00Var.dismiss();
                break;
            case 8:
                q00 q00Var = (q00) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = q00Var.f31855n;
                ArrayList arrayList5 = q00Var.f31724c0;
                ArrayList arrayList6 = q00Var.f31726e0;
                if ((view instanceof org.telegram.ui.Cells.d4) && (i13 = (i10 - 1) - q00Var.f31734n0) >= 0 && i13 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i13));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.d4) view).c(true, true);
                    } else if (q00Var.f31725d0.contains(Long.valueOf(peerDialogId))) {
                        int i22 = -q00Var.f31745y0;
                        q00Var.f31745y0 = i22;
                        AndroidUtilities.shakeViewSpring(view, i22);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(n2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (q00Var.f31746z0 != peerDialogId || System.currentTimeMillis() - q00Var.A0 > 1500) {
                            q00Var.f31746z0 = peerDialogId;
                            q00Var.A0 = System.currentTimeMillis();
                            ec ecVarG = new mc(q00Var.f31728g0, null).g(str, arrayList7);
                            ecVarG.f28020j = 1500;
                            ecVarG.j();
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.d4) view).c(false, true);
                    }
                    q00Var.U(z11);
                    q00Var.V();
                    q00Var.Q(false);
                    break;
                }
                break;
            case 9:
                g30 g30Var = (g30) obj;
                if (i10 == g30Var.f28517e0) {
                    g30Var.f28515c0.f41785a.j1(true);
                    g30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.y4) {
                    org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                    if (!g30Var.f28514b0.contains(Long.valueOf(y4Var.getUserId()))) {
                        g30Var.f28515c0.f41785a.m1(y4Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                gj0 gj0Var = (gj0) obj;
                ArrayList arrayList8 = gj0Var.f28728n;
                int iJ = gj0Var.f28727f.j(i10);
                if (iJ == 0) {
                    fj0 fj0Var = gj0Var.A;
                    if (fj0Var != null) {
                        fj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                    }
                    break;
                } else if (iJ == 1 && (dj0Var = gj0Var.C) != null) {
                    dj0Var.g(gj0Var.E);
                    break;
                }
                break;
            case 11:
                wj0 wj0Var = (wj0) obj;
                vj0 vj0Var = wj0Var.f34240c0;
                if (vj0Var != null && (view instanceof uj0)) {
                    vj0Var.n(wj0Var, ((uj0) view).f33102e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                sp0 sp0Var = ((op0) obj).G;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).hints.get(i10);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j11 = peer.user_id;
                if (j11 != 0) {
                    j10 = j11;
                } else {
                    long j12 = peer.channel_id;
                    if (j12 != 0) {
                        j10 = -j12;
                    } else {
                        j12 = peer.chat_id;
                        if (j12 != 0) {
                            j10 = -j12;
                        }
                    }
                }
                if (k4Var.A) {
                    sp0Var.X0(j10, k4Var);
                } else {
                    tL_dialog.f22384id = j10;
                    sp0Var.U0(null, tL_dialog);
                    boolean z13 = sp0Var.Q.h(j10) >= 0;
                    if (k4Var.f24579w) {
                        k4Var.v.a(z13, true);
                    }
                }
                break;
            case 13:
                lu0 lu0Var = (lu0) obj;
                int i23 = i10 - 1;
                if (i23 >= 0 && i23 < LocationController.getLocationsCount()) {
                    lu0Var.f30470n.d(lu0.q(i23));
                    lu0Var.dismiss();
                    break;
                }
                break;
            case 14:
                ov0.P((ov0) obj, i10);
                break;
            case 15:
                gw0 gw0Var = (gw0) obj;
                if (i10 < 1) {
                    gw0Var.getClass();
                    break;
                } else {
                    cw0[] cw0VarArr = gw0Var.U2;
                    if (cw0VarArr != null) {
                        cw0 cw0Var = cw0VarArr[i10 - 1];
                        int iDp = AndroidUtilities.dp(64.0f);
                        if (gw0Var.getMeasuredWidth() - view.getRight() < iDp) {
                            gw0Var.v0(iDp - (gw0Var.getMeasuredWidth() - view.getRight()), 0, er.h);
                        } else if (view.getLeft() < iDp) {
                            gw0Var.v0(-(iDp - view.getLeft()), 0, er.h);
                        }
                        Utilities.Callback callback = gw0Var.f28845j3;
                        if (callback != null) {
                            callback.run(cw0Var);
                        }
                        break;
                    }
                }
                break;
            case 16:
                ex0.m((ex0) obj, view, i10);
                break;
            case 17:
                wx0 wx0Var = (wx0) obj;
                String str2 = ((vx0) view).f34063a;
                if (wx0Var.f34370s && (ux0Var = wx0Var.f34365c) != null && (ux0Var.getFieldText() instanceof Spanned)) {
                    if (wx0Var.P != null) {
                        iIntValue = ((Spanned) wx0Var.f34365c.getFieldText()).getSpanStart(wx0Var.P);
                        iIntValue2 = ((Spanned) wx0Var.f34365c.getFieldText()).getSpanEnd(wx0Var.P);
                    } else {
                        Integer num = wx0Var.R;
                        if (num != null && wx0Var.S != null) {
                            iIntValue = num.intValue();
                            iIntValue2 = wx0Var.S.intValue();
                            wx0Var.S = null;
                            wx0Var.R = null;
                        }
                    }
                    Editable editText = wx0Var.f34365c.getEditText();
                    if (editText != null && iIntValue >= 0 && iIntValue2 >= 0 && iIntValue <= editText.length() && iIntValue2 <= editText.length()) {
                        if (wx0Var.P != null) {
                            if (wx0Var.f34365c.getFieldText() instanceof Spannable) {
                                ((Spannable) wx0Var.f34365c.getFieldText()).removeSpan(wx0Var.P);
                            }
                            wx0Var.P = null;
                        }
                        String string2 = editText.toString();
                        String strSubstring = string2.substring(iIntValue, iIntValue2);
                        int length = strSubstring.length();
                        int i24 = iIntValue2 - length;
                        try {
                            while (i24 >= 0) {
                                int i25 = i24 + length;
                                if (string2.substring(i24, i25).equals(strSubstring)) {
                                    Paint.FontMetricsInt fontMetricsInt2 = wx0Var.f34365c.getEditField() != null ? wx0Var.f34365c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                                    if (fontMetricsInt2 == null) {
                                        Paint paint = new Paint();
                                        paint.setTextSize(AndroidUtilities.dp(18.0f));
                                        fontMetricsInt2 = paint.getFontMetricsInt();
                                    }
                                    if (str2 == null || !str2.startsWith("animated_")) {
                                        charSequenceReplaceEmoji = Emoji.replaceEmoji(str2, fontMetricsInt2, true);
                                    } else {
                                        try {
                                            long j13 = Long.parseLong(str2.substring(9));
                                            TLRPC.Document documentF = k5.f(wx0Var.f34363a, j13);
                                            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentF));
                                            spannableString.setSpan(documentF == null ? new t5(j13, fontMetricsInt2) : new t5(documentF, fontMetricsInt2), 0, spannableString.length(), 33);
                                            charSequenceReplaceEmoji = spannableString;
                                        } catch (Exception unused) {
                                            charSequenceReplaceEmoji = null;
                                        }
                                    }
                                    if (charSequenceReplaceEmoji != null && ((t5VarArr = (t5[]) editText.getSpans(i24, i25, t5.class)) == null || t5VarArr.length <= 0)) {
                                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i24, i25, Emoji.EmojiSpan.class);
                                        if (emojiSpanArr != null) {
                                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                                editText.removeSpan(emojiSpan);
                                            }
                                        }
                                        editText.replace(i24, i25, "");
                                        editText.insert(i24, charSequenceReplaceEmoji);
                                        i24 -= length;
                                        fontMetricsInt = null;
                                    }
                                }
                                wx0Var.performHapticFeedback(3, 1);
                                Emoji.addRecentEmoji(str2);
                                wx0Var.f34370s = false;
                                wx0Var.v = true;
                                wx0Var.C = 0;
                                p1Var = wx0Var.d;
                                if (p1Var != null) {
                                    p1Var.invalidate();
                                }
                                break;
                            }
                            wx0Var.performHapticFeedback(3, 1);
                            break;
                        } catch (Exception unused2) {
                        }
                        Emoji.addRecentEmoji(str2);
                        wx0Var.f34370s = false;
                        wx0Var.v = true;
                        wx0Var.C = 0;
                        p1Var = wx0Var.d;
                        if (p1Var != null) {
                            p1Var.invalidate();
                        }
                        break;
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    f2.q0 adapter = editorAlert.f26562c.getAdapter();
                    s01 s01Var = editorAlert.f26565n;
                    if (adapter == s01Var) {
                        int i26 = i10 - 1;
                        ArrayList arrayList9 = s01Var.d;
                        themeEditorView.f26552c = (i26 < 0 || i26 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i26);
                    } else {
                        t01 t01Var = editorAlert.f26566r;
                        int i27 = i10 - 1;
                        if (i27 >= 0) {
                            if (i27 < t01Var.f32608e.size()) {
                                arrayList = (ArrayList) t01Var.f32608e.get(i27);
                            }
                            themeEditorView.f26552c = arrayList;
                        } else {
                            t01Var.getClass();
                        }
                        arrayList = null;
                        themeEditorView.f26552c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i28 = 0; i28 < themeEditorView.f26552c.size(); i28++) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) themeEditorView.f26552c.get(i28);
                        int i29 = i6Var.f23517f;
                        if (i29 == org.telegram.ui.ActionBar.g6.Nd) {
                            final w71 w71Var = themeEditorView.f26558k;
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(w71Var.f34136b, null, false, false);
                            e3Var.fixNavigationBar();
                            e3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            e3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i30) {
                                    w71 w71Var2 = w71Var;
                                    v71 v71Var = w71Var2.d;
                                    Activity activity = w71Var2.f34136b;
                                    try {
                                        if (i30 != 0) {
                                            if (i30 == 1) {
                                                w71Var2.b();
                                                return;
                                            } else if (i30 == 2) {
                                                v71Var.a();
                                                return;
                                            } else {
                                                if (i30 == 3) {
                                                    v71Var.b(null, null, false);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        try {
                                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                            File fileGeneratePicturePath = AndroidUtilities.generatePicturePath();
                                            if (fileGeneratePicturePath != null) {
                                                if (Build.VERSION.SDK_INT >= 24) {
                                                    intent.putExtra("output", FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", fileGeneratePicturePath));
                                                    intent.addFlags(2);
                                                    intent.addFlags(1);
                                                } else {
                                                    intent.putExtra("output", Uri.fromFile(fileGeneratePicturePath));
                                                }
                                                w71Var2.f34135a = fileGeneratePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            };
                            e3Var.items = charSequenceArr;
                            e3Var.itemIcons = null;
                            e3Var.onClickListener = onClickListener;
                            e3Var.show();
                        } else {
                            int iW0 = org.telegram.ui.ActionBar.g6.w0(i6Var.f23520j, i29, false);
                            i6Var.f23519i = iW0;
                            if (i28 == 0) {
                                editorAlert.f26561b.c(iW0);
                            }
                        }
                        break;
                    }
                    editorAlert.L(true);
                    break;
                }
                break;
            default:
                j41 j41Var = (j41) obj;
                f2.q0 adapter2 = j41Var.f29585n.getAdapter();
                pf.l1 l1Var = j41Var.v;
                if (adapter2 == l1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) l1Var.G.get(i10);
                } else {
                    i41 i41Var = j41Var.f29587s;
                    stickerSetCovered = i10 < i41Var.f29223w ? (TLRPC.StickerSetCovered) i41Var.f29219f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    j41Var.b(stickerSetCovered.set, null);
                }
                break;
        }
    }
}
