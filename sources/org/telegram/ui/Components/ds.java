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
public final class ds extends sa {
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
    public final int f24348a0;
    public final int f24349b0;
    public final Runnable f24350c0;
    public boolean f24351d0;
    public final boolean f24352e0;
    public final cs f24353f0;
    public final cs f24354g0;
    public final cs f24355h0;
    public final cs f24356i0;
    public final boolean[] f24357j0;
    public final boolean[] f24358k0;
    public final boolean f24359l0;
    public boolean m0;
    public final long f24360n0;
    public TL_communities.ParticipantJoinedChats f24361o0;
    public int[] f24362p0;
    public boolean f24363q0;
    public boolean f24364r0;
    public final TLRPC.TL_chatBannedRights f24365s0;
    public final TLRPC.TL_chatBannedRights f24366t0;
    public final ArrayList f24367u0;
    public boolean f24368v0;
    public final boolean f24369w0;
    public final boolean f24370x0;
    public boolean f24371y0;
    public boolean f24372z0;

    public ds(org.telegram.ui.ActionBar.p2 r20, org.telegram.tgnet.TLRPC.Chat r21, java.util.ArrayList r22, java.util.ArrayList r23, org.telegram.tgnet.TLRPC.ChannelParticipant[] r24, long r25, int r27, int r28, boolean r29, java.lang.Runnable r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ds.<init>(org.telegram.ui.ActionBar.p2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(ds dsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            dsVar.f24362p0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(dsVar.Y).filter(new as(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            dsVar.f24363q0 = false;
            dsVar.f24364r0 = true;
            dsVar.O();
        }
    }

    public static void Q(ds dsVar) {
        Context context;
        boolean z4;
        String str;
        Context context2 = dsVar.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = dsVar.resourcesProvider;
        int i10 = dsVar.currentAccount;
        long j10 = dsVar.f24360n0;
        ArrayList<Long> arrayList = dsVar.f24361o0.joined_chat_ids;
        boolean z10 = false;
        zr zrVar = new zr(dsVar, 0);
        Pattern pattern = z4.f31242a;
        LinearLayout f10 = org.telegram.messenger.y3.f(context2, 1);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
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
                TextView textView = (TextView) v3Var.f4837b;
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
                ((p9) v3Var.f4838c).e(chat, new z8(chat));
                v3Var.setBackground(org.telegram.ui.ActionBar.j6.K0(z4));
                v3Var.setOnClickListener(new lh.r2(d2VarArr, zrVar, longValue, 3));
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
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f24365s0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, cs csVar) {
        boolean z4;
        boolean c3 = csVar.c();
        int i10 = csVar.f24022g;
        int i11 = csVar.f24018a;
        if (c3) {
            boolean z10 = false;
            if (!csVar.b()) {
                i51 y10 = i51.y(i11, csVar.f24019b);
                if (csVar.f24023i > 0) {
                    z10 = true;
                }
                y10.K(z10);
                arrayList.add(y10);
                return;
            }
            String str = csVar.f24019b;
            int i12 = csVar.f24023i;
            if (i12 <= 0) {
                if (csVar.e != null) {
                    i12 = csVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            i51 i51Var = new i51(36);
            i51Var.d = i11;
            i51Var.f25585l = str;
            i51Var.f25588o = valueOf;
            if (csVar.f24023i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            i51Var.K(z4);
            i51Var.f25580f = csVar.f24021f;
            i51Var.D = new w2(13, this, csVar);
            arrayList.add(i51Var);
            if (!csVar.f24021f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = csVar.e;
                    if (zArr == null || zArr[i13]) {
                        i51 i51Var2 = new i51(37);
                        i51Var2.d = (i11 << 24) | i13;
                        i51Var2.G = (TLObject) csVar.f24020c.get(i13);
                        i51Var2.K(csVar.d[i13]);
                        i51Var2.f25582i = 1;
                        arrayList.add(i51Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f24364r0) {
            O();
        } else if (!this.f24363q0) {
            this.f24363q0 = true;
            cs csVar = this.f24354g0;
            int i10 = csVar.f24022g;
            this.f24362p0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < csVar.f24022g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.V);
                tL_messages_search.f19268q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) csVar.f24020c.get(i11));
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
        boolean z11 = this.f24351d0;
        boolean z12 = false;
        cs csVar = this.f24356i0;
        if (z11 && csVar.c()) {
            if (csVar.f24023i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.B0 = z10;
        }
        if (this.f24351d0 && csVar.c() && csVar.f24023i == 0) {
            csVar.d();
        } else if (!this.f24351d0 && csVar.c()) {
            boolean z13 = this.B0;
            if (csVar.f24023i > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z13 != z4) {
                csVar.d();
            }
        }
        if (!this.f24351d0 && csVar.c()) {
            if (csVar.f24023i > 0) {
                z12 = true;
            }
            this.B0 = z12;
        }
    }

    public final void W(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ds.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z4;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f24353f0.a());
        edit.putBoolean("delete_deleteAll", this.f24354g0.a());
        if (!this.f24351d0 && this.f24356i0.a()) {
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
        rl0 rl0Var = this.d;
        rect.set(0, 0, rl0Var.getMeasuredWidth(), rl0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        rl0Var.setClipBounds(rect);
    }

    @Override
    public final void show() {
        super.show();
        ic.e();
    }

    @Override
    public final boolean t(View view, float f10, float f11) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, this.f28701n.getClassGuid(), true, new vr(this, 0), this.resourcesProvider);
        this.U = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        boolean[] zArr;
        if (this.f24370x0) {
            if (this.f24372z0) {
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
        if (this.f24362p0 != null && this.f24364r0) {
            int i11 = 0;
            while (true) {
                cs csVar = this.f24354g0;
                if (i11 >= csVar.f24022g) {
                    break;
                }
                if (csVar.d[i11] && ((zArr = csVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) csVar.f24020c.get(i11);
                    iArr[0] = iArr[0] + this.f24362p0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
