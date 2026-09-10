package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ls extends ab {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public j61 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f25082a0;
    public final ArrayList f25083b0;
    public final long f25084c0;
    public final int f25085d0;
    public final int f25086e0;
    public final Runnable f25087f0;
    public boolean f25088g0;
    public final boolean f25089h0;
    public final ks f25090i0;
    public final ks f25091j0;
    public final ks f25092k0;
    public final ks f25093l0;
    public final boolean[] m0;
    public final boolean[] f25094n0;
    public final boolean f25095o0;
    public boolean f25096p0;
    public final long f25097q0;
    public TL_communities.ParticipantJoinedChats f25098r0;
    public int[] f25099s0;
    public boolean f25100t0;
    public boolean f25101u0;
    public final TLRPC.TL_chatBannedRights f25102v0;
    public final TLRPC.TL_chatBannedRights f25103w0;
    public final ArrayList f25104x0;
    public boolean f25105y0;
    public final boolean f25106z0;

    public ls(org.telegram.ui.ActionBar.p2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ls.<init>(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(ls lsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            lsVar.f25099s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(lsVar.f25083b0).filter(new is(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            lsVar.f25100t0 = false;
            lsVar.f25101u0 = true;
            lsVar.O();
        }
    }

    public static void Q(ls lsVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = lsVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = lsVar.resourcesProvider;
        int i10 = lsVar.currentAccount;
        long j3 = lsVar.f25097q0;
        ArrayList<Long> arrayList = lsVar.f25098r0.joined_chat_ids;
        boolean z11 = false;
        hs hsVar = new hs(lsVar, 0);
        Pattern pattern = d5.f22289a;
        LinearLayout f7 = org.telegram.messenger.em.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f7);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l4 = arrayList.get(i11);
            i11++;
            Long l10 = l4;
            long longValue = l10.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(longValue);
            if (chat != null) {
                bi.w7 w7Var = new bi.w7(context2, f6Var, z11);
                int i12 = size;
                ((TextView) w7Var.f3834c).setText(DialogObject.getName(chat));
                TextView textView = (TextView) w7Var.d;
                if (chatFull != null) {
                    context = context2;
                    z10 = false;
                    str = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z10 = false;
                    str = null;
                }
                textView.setText(str);
                ((w9) w7Var.f3833b).e(chat, new g9(chat));
                w7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                w7Var.setOnClickListener(new org.telegram.ui.jo(d2VarArr, hsVar, longValue, 2));
                f7.addView(w7Var, w7.a6.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        d2VarArr[0] = d2Var;
        d2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f25102v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, ks ksVar) {
        boolean z10;
        boolean c10 = ksVar.c();
        int i10 = ksVar.f24806g;
        int i11 = ksVar.f24802a;
        if (c10) {
            boolean z11 = false;
            if (!ksVar.b()) {
                v51 y3 = v51.y(i11, ksVar.f24803b);
                if (ksVar.f24807i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = ksVar.f24803b;
            int i12 = ksVar.f24807i;
            if (i12 <= 0) {
                if (ksVar.e != null) {
                    i12 = ksVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            v51 v51Var = new v51(36);
            v51Var.d = i11;
            v51Var.f27829l = str;
            v51Var.f27832o = valueOf;
            if (ksVar.f24807i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            v51Var.K(z10);
            v51Var.f27824f = ksVar.f24805f;
            v51Var.D = new org.telegram.ui.sh(25, this, ksVar);
            arrayList.add(v51Var);
            if (!ksVar.f24805f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = ksVar.e;
                    if (zArr == null || zArr[i13]) {
                        v51 v51Var2 = new v51(37);
                        v51Var2.d = (i11 << 24) | i13;
                        v51Var2.G = (TLObject) ksVar.f24804c.get(i13);
                        v51Var2.K(ksVar.d[i13]);
                        v51Var2.f27826i = 1;
                        arrayList.add(v51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f25101u0) {
            O();
        } else if (!this.f25100t0) {
            this.f25100t0 = true;
            ks ksVar = this.f25091j0;
            int i10 = ksVar.f24806g;
            this.f25099s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < ksVar.f24806g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f17304q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) ksVar.f24804c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new di.c5(this, inputPeer, i11, iArr, 3));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f25088g0;
        boolean z13 = false;
        ks ksVar = this.f25093l0;
        if (z12 && ksVar.c()) {
            if (ksVar.f24807i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f25088g0 && ksVar.c() && ksVar.f24807i == 0) {
            ksVar.d();
        } else if (!this.f25088g0 && ksVar.c()) {
            boolean z14 = this.E0;
            if (ksVar.f24807i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                ksVar.d();
            }
        }
        if (!this.f25088g0 && ksVar.c()) {
            if (ksVar.f24807i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ls.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f25090i0.a());
        edit.putBoolean("delete_deleteAll", this.f25091j0.a());
        if (!this.f25088g0 && this.f25093l0.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        edit.putBoolean("delete_ban", z10);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        vl0 vl0Var = this.d;
        rect.set(0, 0, vl0Var.getMeasuredWidth(), vl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        vl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        pc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, this.f21452n.getClassGuid(), true, new es(this, 0), this.resourcesProvider);
        this.X = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.A0) {
            if (this.C0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            if (this.D0) {
                return LocaleController.getString(R.string.DeleteReactionOptionsTitleAll);
            }
            return LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.f25083b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f25099s0 != null && this.f25101u0) {
            int i11 = 0;
            while (true) {
                ks ksVar = this.f25091j0;
                if (i11 >= ksVar.f24806g) {
                    break;
                }
                if (ksVar.d[i11] && ((zArr = ksVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) ksVar.f24804c.get(i11);
                    iArr[0] = iArr[0] + this.f25099s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
