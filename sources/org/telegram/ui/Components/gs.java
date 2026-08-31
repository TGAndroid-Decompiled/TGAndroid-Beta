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
public final class gs extends sa {
    public static final int D0 = 0;
    public boolean A0;
    public boolean B0;
    public float C0;
    public x51 U;
    public final TLRPC.Chat V;
    public final TLRPC.Chat W;
    public final boolean X;
    public final ArrayList Y;
    public final long Z;
    public final int f27259a0;
    public final int f27260b0;
    public final Runnable f27261c0;
    public boolean f27262d0;
    public final boolean f27263e0;
    public final fs f27264f0;
    public final fs f27265g0;
    public final fs f27266h0;
    public final fs f27267i0;
    public final boolean[] f27268j0;
    public final boolean[] f27269k0;
    public final boolean f27270l0;
    public boolean m0;
    public final long f27271n0;
    public TL_communities.ParticipantJoinedChats f27272o0;
    public int[] f27273p0;
    public boolean f27274q0;
    public boolean f27275r0;
    public final TLRPC.TL_chatBannedRights f27276s0;
    public final TLRPC.TL_chatBannedRights f27277t0;
    public final ArrayList f27278u0;
    public boolean f27279v0;
    public final boolean f27280w0;
    public final boolean f27281x0;
    public boolean f27282y0;
    public boolean f27283z0;

    public gs(org.telegram.ui.ActionBar.p2 r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gs.<init>(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(gs gsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            gsVar.f27273p0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(gsVar.Y).filter(new ds(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            gsVar.f27274q0 = false;
            gsVar.f27275r0 = true;
            gsVar.O();
        }
    }

    public static void Q(gs gsVar) {
        Context context;
        boolean z4;
        String str;
        Context context2 = gsVar.getContext();
        org.telegram.ui.ActionBar.g6 g6Var = gsVar.resourcesProvider;
        int i10 = gsVar.currentAccount;
        long j10 = gsVar.f27271n0;
        ArrayList<Long> arrayList = gsVar.f27272o0.joined_chat_ids;
        boolean z10 = false;
        cs csVar = new cs(gsVar, 0);
        Pattern pattern = z4.f33718a;
        LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(f10);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Long l10 = arrayList.get(i11);
            i11++;
            Long l11 = l10;
            long longValue = l11.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(l11);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(longValue);
            if (chat != null) {
                eg.t3 t3Var = new eg.t3(context2, g6Var, z10);
                int i12 = size;
                ((TextView) t3Var.d).setText(DialogObject.getName(chat));
                TextView textView = (TextView) t3Var.f5496b;
                if (chatFull != null) {
                    context = context2;
                    z4 = false;
                    str = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z4 = false;
                    str = null;
                }
                textView.setText(str);
                ((p9) t3Var.f5497c).e(chat, new z8(chat));
                t3Var.setBackground(org.telegram.ui.ActionBar.k6.K0(z4));
                t3Var.setOnClickListener(new mh.q2(d2VarArr, csVar, longValue, 3));
                f10.addView(t3Var, k7.c6.n(-1, -2));
                context2 = context;
                size = i12;
                z10 = false;
            }
        }
        d2VarArr[0] = d2Var;
        d2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f27276s0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, fs fsVar) {
        boolean z4;
        boolean c3 = fsVar.c();
        int i10 = fsVar.f26996g;
        int i11 = fsVar.f26991a;
        if (c3) {
            boolean z10 = false;
            if (!fsVar.b()) {
                j51 y10 = j51.y(i11, fsVar.f26992b);
                if (fsVar.f26997i > 0) {
                    z10 = true;
                }
                y10.K(z10);
                arrayList.add(y10);
                return;
            }
            String str = fsVar.f26992b;
            int i12 = fsVar.f26997i;
            if (i12 <= 0) {
                if (fsVar.f26994e != null) {
                    i12 = fsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            j51 j51Var = new j51(36);
            j51Var.d = i11;
            j51Var.f28014l = str;
            j51Var.f28017o = valueOf;
            if (fsVar.f26997i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            j51Var.K(z4);
            j51Var.f28009f = fsVar.f26995f;
            j51Var.D = new w2(13, this, fsVar);
            arrayList.add(j51Var);
            if (!fsVar.f26995f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = fsVar.f26994e;
                    if (zArr == null || zArr[i13]) {
                        j51 j51Var2 = new j51(37);
                        j51Var2.d = (i11 << 24) | i13;
                        j51Var2.G = (TLObject) fsVar.f26993c.get(i13);
                        j51Var2.K(fsVar.d[i13]);
                        j51Var2.f28011i = 1;
                        arrayList.add(j51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f27275r0) {
            O();
        } else if (!this.f27274q0) {
            this.f27274q0 = true;
            fs fsVar = this.f27265g0;
            int i10 = fsVar.f26996g;
            this.f27273p0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < fsVar.f26996g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.V);
                tL_messages_search.f20952q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) fsVar.f26993c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new oh.b8(this, inputPeer, i11, iArr, 3));
            }
        }
    }

    public final void V() {
        boolean z4;
        boolean z10;
        boolean z11 = this.f27262d0;
        boolean z12 = false;
        fs fsVar = this.f27267i0;
        if (z11 && fsVar.c()) {
            if (fsVar.f26997i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B0 = z10;
        }
        if (this.f27262d0 && fsVar.c() && fsVar.f26997i == 0) {
            fsVar.d();
        } else if (!this.f27262d0 && fsVar.c()) {
            boolean z13 = this.B0;
            if (fsVar.f26997i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z13 != z4) {
                fsVar.d();
            }
        }
        if (!this.f27262d0 && fsVar.c()) {
            if (fsVar.f26997i > 0) {
                z12 = true;
            }
            this.B0 = z12;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gs.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z4;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f27264f0.a());
        edit.putBoolean("delete_deleteAll", this.f27265g0.a());
        if (!this.f27262d0 && this.f27267i0.a()) {
            z4 = true;
        } else {
            z4 = false;
        }
        edit.putBoolean("delete_ban", z4);
        edit.apply();
        super.dismiss();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Rect rect = AndroidUtilities.rectTmp2;
        tl0 tl0Var = this.d;
        rect.set(0, 0, tl0Var.getMeasuredWidth(), tl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        tl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        ic.e();
    }

    @Override
    public final boolean t(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, this.f31017n.getClassGuid(), true, new yr(this, 0), this.resourcesProvider);
        this.U = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.f27281x0) {
            if (this.f27283z0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            if (this.A0) {
                return LocaleController.getString(R.string.DeleteReactionOptionsTitleAll);
            }
            return LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.Y;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f27273p0 != null && this.f27275r0) {
            int i11 = 0;
            while (true) {
                fs fsVar = this.f27265g0;
                if (i11 >= fsVar.f26996g) {
                    break;
                }
                if (fsVar.d[i11] && ((zArr = fsVar.f26994e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) fsVar.f26993c.get(i11);
                    iArr[0] = iArr[0] + this.f27273p0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
