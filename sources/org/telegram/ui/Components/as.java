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
public final class as extends xa {
    public static final int C0 = 0;
    public boolean A0;
    public float B0;
    public k51 T;
    public final TLRPC.Chat U;
    public final TLRPC.Chat V;
    public final boolean W;
    public final ArrayList X;
    public final long Y;
    public final int Z;
    public final int f26841a0;
    public final Runnable f26842b0;
    public boolean f26843c0;
    public final boolean f26844d0;
    public final zr f26845e0;
    public final zr f26846f0;
    public final zr f26847g0;
    public final zr f26848h0;
    public final boolean[] f26849i0;
    public final boolean[] f26850j0;
    public final boolean f26851k0;
    public boolean f26852l0;
    public final long m0;
    public TL_communities.ParticipantJoinedChats f26853n0;
    public int[] f26854o0;
    public boolean f26855p0;
    public boolean f26856q0;
    public final TLRPC.TL_chatBannedRights f26857r0;
    public final TLRPC.TL_chatBannedRights f26858s0;
    public final ArrayList f26859t0;
    public boolean f26860u0;
    public final boolean f26861v0;
    public final boolean f26862w0;
    public boolean f26863x0;
    public boolean f26864y0;
    public boolean f26865z0;

    public as(org.telegram.ui.ActionBar.o2 r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.as.<init>(org.telegram.ui.ActionBar.o2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(as asVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            asVar.f26854o0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(asVar.X).filter(new xr(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            asVar.f26855p0 = false;
            asVar.f26856q0 = true;
            asVar.O();
        }
    }

    public static void Q(as asVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = asVar.getContext();
        org.telegram.ui.ActionBar.c6 c6Var = asVar.resourcesProvider;
        int i10 = asVar.currentAccount;
        long j10 = asVar.m0;
        ArrayList<Long> arrayList = asVar.f26853n0.joined_chat_ids;
        boolean z11 = false;
        wr wrVar = new wr(asVar, 0);
        Pattern pattern = c5.f27308a;
        LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, c6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.n(g10);
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
                bg.z3 z3Var = new bg.z3(context2, c6Var, z11);
                int i12 = size;
                ((TextView) z3Var.d).setText(DialogObject.getName(chat));
                TextView textView = (TextView) z3Var.f2639b;
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
                ((t9) z3Var.f2640c).e(chat, new e9(chat));
                z3Var.setBackground(org.telegram.ui.ActionBar.g6.K0(z10));
                z3Var.setOnClickListener(new jh.q2(c2VarArr, wrVar, longValue, 3));
                g10.addView(z3Var, i7.f6.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        c2VarArr[0] = c2Var;
        c2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f26857r0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, zr zrVar) {
        boolean z10;
        boolean c3 = zrVar.c();
        int i10 = zrVar.f35406g;
        int i11 = zrVar.f35401a;
        if (c3) {
            boolean z11 = false;
            if (!zrVar.b()) {
                w41 y8 = w41.y(i11, zrVar.f35402b);
                if (zrVar.f35407i > 0) {
                    z11 = true;
                }
                y8.K(z11);
                arrayList.add(y8);
                return;
            }
            String str = zrVar.f35402b;
            int i12 = zrVar.f35407i;
            if (i12 <= 0) {
                if (zrVar.f35404e != null) {
                    i12 = zrVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            w41 w41Var = new w41(36);
            w41Var.d = i11;
            w41Var.f34300l = str;
            w41Var.f34303o = valueOf;
            if (zrVar.f35407i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w41Var.K(z10);
            w41Var.f34295f = zrVar.f35405f;
            w41Var.D = new t2(16, this, zrVar);
            arrayList.add(w41Var);
            if (!zrVar.f35405f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = zrVar.f35404e;
                    if (zArr == null || zArr[i13]) {
                        w41 w41Var2 = new w41(37);
                        w41Var2.d = (i11 << 24) | i13;
                        w41Var2.G = (TLObject) zrVar.f35403c.get(i13);
                        w41Var2.K(zrVar.d[i13]);
                        w41Var2.f34297i = 1;
                        arrayList.add(w41Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f26856q0) {
            O();
        } else if (!this.f26855p0) {
            this.f26855p0 = true;
            zr zrVar = this.f26846f0;
            int i10 = zrVar.f35406g;
            this.f26854o0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < zrVar.f35406g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.U);
                tL_messages_search.f22501q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) zrVar.f35403c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new lh.b8(this, inputPeer, i11, iArr, 3));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f26843c0;
        boolean z13 = false;
        zr zrVar = this.f26848h0;
        if (z12 && zrVar.c()) {
            if (zrVar.f35407i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.A0 = z11;
        }
        if (this.f26843c0 && zrVar.c() && zrVar.f35407i == 0) {
            zrVar.d();
        } else if (!this.f26843c0 && zrVar.c()) {
            boolean z14 = this.A0;
            if (zrVar.f35407i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                zrVar.d();
            }
        }
        if (!this.f26843c0 && zrVar.c()) {
            if (zrVar.f35407i > 0) {
                z13 = true;
            }
            this.A0 = z13;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.as.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f26845e0.a());
        edit.putBoolean("delete_deleteAll", this.f26846f0.a());
        if (!this.f26843c0 && this.f26848h0.a()) {
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
        jl0 jl0Var = this.d;
        rect.set(0, 0, jl0Var.getMeasuredWidth(), jl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        jl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        mc.e();
    }

    @Override
    public final boolean t(View view, float f9, float f10) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, this.f34662n.getClassGuid(), true, new sr(this, 0), this.resourcesProvider);
        this.T = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.f26862w0) {
            if (this.f26864y0) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            if (this.f26865z0) {
                return LocaleController.getString(R.string.DeleteReactionOptionsTitleAll);
            }
            return LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f26854o0 != null && this.f26856q0) {
            int i11 = 0;
            while (true) {
                zr zrVar = this.f26846f0;
                if (i11 >= zrVar.f35406g) {
                    break;
                }
                if (zrVar.d[i11] && ((zArr = zrVar.f35404e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) zrVar.f35403c.get(i11);
                    iArr[0] = iArr[0] + this.f26854o0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
