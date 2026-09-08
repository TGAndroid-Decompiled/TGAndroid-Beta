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
public final class es extends bb {
    public static final int G0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public v51 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f25785a0;
    public final ArrayList f25786b0;
    public final long f25787c0;
    public final int f25788d0;
    public final int f25789e0;
    public final Runnable f25790f0;
    public boolean f25791g0;
    public final boolean f25792h0;
    public final ds f25793i0;
    public final ds f25794j0;
    public final ds f25795k0;
    public final ds f25796l0;
    public final boolean[] m0;
    public final boolean[] f25797n0;
    public final boolean f25798o0;
    public boolean f25799p0;
    public final long f25800q0;
    public TL_communities.ParticipantJoinedChats f25801r0;
    public int[] f25802s0;
    public boolean f25803t0;
    public boolean f25804u0;
    public final TLRPC.TL_chatBannedRights f25805v0;
    public final TLRPC.TL_chatBannedRights f25806w0;
    public final ArrayList f25807x0;
    public boolean f25808y0;
    public final boolean f25809z0;

    public es(org.telegram.ui.ActionBar.n2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es.<init>(org.telegram.ui.ActionBar.n2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(es esVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            esVar.f25802s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(esVar.f25786b0).filter(new bs(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            esVar.f25803t0 = false;
            esVar.f25804u0 = true;
            esVar.O();
        }
    }

    public static void Q(es esVar) {
        Context context;
        boolean z10;
        String str;
        Context context2 = esVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = esVar.resourcesProvider;
        int i10 = esVar.currentAccount;
        long j3 = esVar.f25800q0;
        ArrayList<Long> arrayList = esVar.f25801r0.joined_chat_ids;
        boolean z11 = false;
        as asVar = new as(esVar, 0);
        Pattern pattern = e5.f25584a;
        LinearLayout f7 = org.telegram.messenger.wl.f(context2, 1);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j3)));
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
                bi.e7 e7Var = new bi.e7(context2, f6Var, z11);
                int i12 = size;
                ((TextView) e7Var.f2942b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) e7Var.f2943c;
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
                ((x9) e7Var.d).e(chat, new i9(chat));
                e7Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z10));
                e7Var.setOnClickListener(new org.telegram.ui.io(b2VarArr, asVar, longValue, 2));
                f7.addView(e7Var, w7.x5.n(-1, -2));
                context2 = context;
                size = i12;
                z11 = false;
            }
        }
        b2VarArr[0] = b2Var;
        b2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f25805v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, ds dsVar) {
        boolean z10;
        boolean c10 = dsVar.c();
        int i10 = dsVar.f25488g;
        int i11 = dsVar.f25483a;
        if (c10) {
            boolean z11 = false;
            if (!dsVar.b()) {
                h51 y3 = h51.y(i11, dsVar.f25484b);
                if (dsVar.f25489i > 0) {
                    z11 = true;
                }
                y3.K(z11);
                arrayList.add(y3);
                return;
            }
            String str = dsVar.f25484b;
            int i12 = dsVar.f25489i;
            if (i12 <= 0) {
                if (dsVar.f25486e != null) {
                    i12 = dsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            h51 h51Var = new h51(36);
            h51Var.d = i11;
            h51Var.f26621l = str;
            h51Var.f26624o = valueOf;
            if (dsVar.f25489i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h51Var.K(z10);
            h51Var.f26616f = dsVar.f25487f;
            h51Var.D = new org.telegram.ui.rf(28, this, dsVar);
            arrayList.add(h51Var);
            if (!dsVar.f25487f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = dsVar.f25486e;
                    if (zArr == null || zArr[i13]) {
                        h51 h51Var2 = new h51(37);
                        h51Var2.d = (i11 << 24) | i13;
                        h51Var2.G = (TLObject) dsVar.f25485c.get(i13);
                        h51Var2.K(dsVar.d[i13]);
                        h51Var2.f26618i = 1;
                        arrayList.add(h51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f25804u0) {
            O();
        } else if (!this.f25803t0) {
            this.f25803t0 = true;
            ds dsVar = this.f25794j0;
            int i10 = dsVar.f25488g;
            this.f25802s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < dsVar.f25488g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f20005q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) dsVar.f25485c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new bi.ga(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f25791g0;
        boolean z13 = false;
        ds dsVar = this.f25796l0;
        if (z12 && dsVar.c()) {
            if (dsVar.f25489i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f25791g0 && dsVar.c() && dsVar.f25489i == 0) {
            dsVar.d();
        } else if (!this.f25791g0 && dsVar.c()) {
            boolean z14 = this.E0;
            if (dsVar.f25489i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                dsVar.d();
            }
        }
        if (!this.f25791g0 && dsVar.c()) {
            if (dsVar.f25489i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.es.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f25793i0.a());
        edit.putBoolean("delete_deleteAll", this.f25794j0.a());
        if (!this.f25791g0 && this.f25796l0.a()) {
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
        ll0 ll0Var = this.d;
        rect.set(0, 0, ll0Var.getMeasuredWidth(), ll0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        ll0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        qc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.a2);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, this.f24676n.getClassGuid(), true, new xr(this, 0), this.resourcesProvider);
        this.X = v51Var;
        v51Var.f31162r = false;
        return v51Var;
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
        ArrayList arrayList = this.f25786b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f25802s0 != null && this.f25804u0) {
            int i11 = 0;
            while (true) {
                ds dsVar = this.f25794j0;
                if (i11 >= dsVar.f25488g) {
                    break;
                }
                if (dsVar.d[i11] && ((zArr = dsVar.f25486e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) dsVar.f25485c.get(i11);
                    iArr[0] = iArr[0] + this.f25802s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
