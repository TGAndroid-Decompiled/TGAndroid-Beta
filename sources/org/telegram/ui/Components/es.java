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
public final class es extends sa {
    public static final int D0 = 0;
    public boolean A0;
    public boolean B0;
    public float C0;
    public w51 U;
    public final TLRPC.Chat V;
    public final TLRPC.Chat W;
    public final boolean X;
    public final ArrayList Y;
    public final long Z;
    public final int f24640a0;
    public final int f24641b0;
    public final Runnable f24642c0;
    public boolean f24643d0;
    public final boolean f24644e0;
    public final ds f24645f0;
    public final ds f24646g0;
    public final ds f24647h0;
    public final ds f24648i0;
    public final boolean[] f24649j0;
    public final boolean[] f24650k0;
    public final boolean f24651l0;
    public boolean m0;
    public final long f24652n0;
    public TL_communities.ParticipantJoinedChats f24653o0;
    public int[] f24654p0;
    public boolean f24655q0;
    public boolean f24656r0;
    public final TLRPC.TL_chatBannedRights f24657s0;
    public final TLRPC.TL_chatBannedRights f24658t0;
    public final ArrayList f24659u0;
    public boolean f24660v0;
    public final boolean f24661w0;
    public final boolean f24662x0;
    public boolean f24663y0;
    public boolean f24664z0;

    public es(org.telegram.ui.ActionBar.p2 r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es.<init>(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(es esVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            esVar.f24654p0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(esVar.Y).filter(new bs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            esVar.f24655q0 = false;
            esVar.f24656r0 = true;
            esVar.O();
        }
    }

    public static void Q(es esVar) {
        Context context;
        boolean z4;
        String str;
        Context context2 = esVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = esVar.resourcesProvider;
        int i10 = esVar.currentAccount;
        long j10 = esVar.f24652n0;
        ArrayList<Long> arrayList = esVar.f24653o0.joined_chat_ids;
        boolean z10 = false;
        as asVar = new as(esVar, 0);
        Pattern pattern = z4.f31230a;
        LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
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
                dg.v3 v3Var = new dg.v3(context2, f6Var, z10);
                int i12 = size;
                ((TextView) v3Var.d).setText(DialogObject.getName(chat));
                TextView textView = (TextView) v3Var.f4831b;
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
                ((p9) v3Var.f4832c).e(chat, new z8(chat));
                v3Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z4));
                v3Var.setOnClickListener(new lh.r2(d2VarArr, asVar, longValue, 3));
                f10.addView(v3Var, k7.b6.n(-1, -2));
                context2 = context;
                size = i12;
                z10 = false;
            }
        }
        d2VarArr[0] = d2Var;
        d2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f24657s0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, ds dsVar) {
        boolean z4;
        boolean c3 = dsVar.c();
        int i10 = dsVar.f24359g;
        int i11 = dsVar.f24355a;
        if (c3) {
            boolean z10 = false;
            if (!dsVar.b()) {
                i51 y10 = i51.y(i11, dsVar.f24356b);
                if (dsVar.f24360i > 0) {
                    z10 = true;
                }
                y10.K(z10);
                arrayList.add(y10);
                return;
            }
            String str = dsVar.f24356b;
            int i12 = dsVar.f24360i;
            if (i12 <= 0) {
                if (dsVar.e != null) {
                    i12 = dsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            i51 i51Var = new i51(36);
            i51Var.d = i11;
            i51Var.f25565l = str;
            i51Var.f25568o = valueOf;
            if (dsVar.f24360i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            i51Var.K(z4);
            i51Var.f25560f = dsVar.f24358f;
            i51Var.D = new w2(13, this, dsVar);
            arrayList.add(i51Var);
            if (!dsVar.f24358f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = dsVar.e;
                    if (zArr == null || zArr[i13]) {
                        i51 i51Var2 = new i51(37);
                        i51Var2.d = (i11 << 24) | i13;
                        i51Var2.G = (TLObject) dsVar.f24357c.get(i13);
                        i51Var2.K(dsVar.d[i13]);
                        i51Var2.f25562i = 1;
                        arrayList.add(i51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f24656r0) {
            O();
        } else if (!this.f24655q0) {
            this.f24655q0 = true;
            ds dsVar = this.f24646g0;
            int i10 = dsVar.f24359g;
            this.f24654p0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < dsVar.f24359g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.V);
                tL_messages_search.f19293q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) dsVar.f24357c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new nh.b8(this, inputPeer, i11, iArr, 3));
            }
        }
    }

    public final void V() {
        boolean z4;
        boolean z10;
        boolean z11 = this.f24643d0;
        boolean z12 = false;
        ds dsVar = this.f24648i0;
        if (z11 && dsVar.c()) {
            if (dsVar.f24360i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B0 = z10;
        }
        if (this.f24643d0 && dsVar.c() && dsVar.f24360i == 0) {
            dsVar.d();
        } else if (!this.f24643d0 && dsVar.c()) {
            boolean z13 = this.B0;
            if (dsVar.f24360i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z13 != z4) {
                dsVar.d();
            }
        }
        if (!this.f24643d0 && dsVar.c()) {
            if (dsVar.f24360i > 0) {
                z12 = true;
            }
            this.B0 = z12;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z4;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f24645f0.a());
        edit.putBoolean("delete_deleteAll", this.f24646g0.a());
        if (!this.f24643d0 && this.f24648i0.a()) {
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
        sl0 sl0Var = this.d;
        rect.set(0, 0, sl0Var.getMeasuredWidth(), sl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        sl0Var.setClipBounds(rect);
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
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, this.f28678n.getClassGuid(), true, new wr(this, 0), this.resourcesProvider);
        this.U = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.f24662x0) {
            if (this.f24664z0) {
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
        if (this.f24654p0 != null && this.f24656r0) {
            int i11 = 0;
            while (true) {
                ds dsVar = this.f24646g0;
                if (i11 >= dsVar.f24359g) {
                    break;
                }
                if (dsVar.d[i11] && ((zArr = dsVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) dsVar.f24357c.get(i11);
                    iArr[0] = iArr[0] + this.f24654p0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
