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
public final class rs extends bb {
    public static final int H0 = 0;
    public final boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public float F0;
    public int G0;
    public j71 X;
    public final TLRPC.Chat Y;
    public final TLRPC.Chat Z;
    public final boolean f32294a0;
    public final ArrayList f32295b0;
    public final long f32296c0;
    public final int f32297d0;
    public final int f32298e0;
    public final Runnable f32299f0;
    public boolean f32300g0;
    public final boolean f32301h0;
    public final qs f32302i0;
    public final qs f32303j0;
    public final qs f32304k0;
    public final qs f32305l0;
    public final boolean[] m0;
    public final boolean[] f32306n0;
    public final boolean f32307o0;
    public boolean f32308p0;
    public final long f32309q0;
    public TL_communities.ParticipantJoinedChats f32310r0;
    public int[] f32311s0;
    public boolean f32312t0;
    public boolean f32313u0;
    public final TLRPC.TL_chatBannedRights f32314v0;
    public final TLRPC.TL_chatBannedRights f32315w0;
    public final ArrayList f32316x0;
    public boolean f32317y0;
    public final boolean f32318z0;

    public rs(org.telegram.ui.ActionBar.r2 r18, org.telegram.tgnet.TLRPC.Chat r19, java.util.ArrayList r20, java.util.ArrayList r21, org.telegram.tgnet.TLRPC.ChannelParticipant[] r22, long r23, int r25, int r26, boolean r27, java.lang.Runnable r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.<init>(org.telegram.ui.ActionBar.r2, org.telegram.tgnet.TLRPC$Chat, java.util.ArrayList, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChannelParticipant[], long, int, int, boolean, java.lang.Runnable):void");
    }

    public static void P(rs rsVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i10, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            rsVar.f32311s0[i10] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(rsVar.f32295b0).filter(new os(0, inputPeer)).count());
        }
        int i11 = iArr[0] - 1;
        iArr[0] = i11;
        if (i11 == 0) {
            rsVar.f32312t0 = false;
            rsVar.f32313u0 = true;
            rsVar.O();
        }
    }

    public static void Q(rs rsVar) {
        Context context;
        boolean z10;
        CharSequence charSequence;
        Context context2 = rsVar.getContext();
        org.telegram.ui.ActionBar.u6 u6Var = rsVar.resourcesProvider;
        int i10 = rsVar.currentAccount;
        long j10 = rsVar.f32309q0;
        ArrayList<Long> arrayList = rsVar.f32310r0.joined_chat_ids;
        boolean z11 = false;
        ns nsVar = new ns(rsVar, 0);
        Pattern pattern = g5.f28418a;
        LinearLayout d = org.telegram.messenger.vh.d(context2, 1);
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, u6Var);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i10, j10)));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.o(d);
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
                bi.t1 t1Var = new bi.t1(context2, u6Var, z11);
                int i12 = size;
                ((TextView) t1Var.f5437b).setText(DialogObject.getName(chat));
                TextView textView = (TextView) t1Var.d;
                if (chatFull != null) {
                    context = context2;
                    z10 = false;
                    charSequence = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
                } else {
                    context = context2;
                    z10 = false;
                    charSequence = null;
                }
                textView.setText(charSequence);
                ((y9) t1Var.f5438c).f(chat, new j9(chat));
                t1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(z10));
                t1Var.setOnClickListener(new bi.p3(e2VarArr, nsVar, longValue, 3));
                d.addView(t1Var, gb1.r(-1, -2));
                context2 = context;
                size = i12;
                z11 = z10;
            }
        }
        e2VarArr[z11 ? 1 : 0] = e2Var;
        e2Var.show();
    }

    public final boolean S() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f32314v0;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    public final void T(ArrayList arrayList, qs qsVar) {
        boolean z10;
        boolean c10 = qsVar.c();
        int i10 = qsVar.f32017g;
        int i11 = qsVar.f32013a;
        if (c10) {
            boolean z11 = false;
            if (!qsVar.b()) {
                t61 z12 = t61.z(i11, qsVar.f32014b);
                if (qsVar.f32018i > 0) {
                    z11 = true;
                }
                z12.L(z11);
                arrayList.add(z12);
                return;
            }
            String str = qsVar.f32014b;
            int i12 = qsVar.f32018i;
            if (i12 <= 0) {
                if (qsVar.e != null) {
                    i12 = qsVar.h;
                } else {
                    i12 = i10;
                }
            }
            String valueOf = String.valueOf(i12);
            t61 t61Var = new t61(36);
            t61Var.d = i11;
            t61Var.f32872l = str;
            t61Var.f32875o = valueOf;
            if (qsVar.f32018i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t61Var.L(z10);
            t61Var.f32867f = qsVar.f32016f;
            t61Var.D = new ga(10, this, qsVar);
            arrayList.add(t61Var);
            if (!qsVar.f32016f) {
                for (int i13 = 0; i13 < i10; i13++) {
                    boolean[] zArr = qsVar.e;
                    if (zArr == null || zArr[i13]) {
                        t61 t61Var2 = new t61(37);
                        t61Var2.d = (i11 << 24) | i13;
                        t61Var2.G = (TLObject) qsVar.f32015c.get(i13);
                        t61Var2.L(qsVar.d[i13]);
                        t61Var2.f32869i = 1;
                        arrayList.add(t61Var2);
                    }
                }
            }
        }
    }

    public final void U() {
        if (this.f32313u0) {
            O();
        } else if (!this.f32312t0) {
            this.f32312t0 = true;
            qs qsVar = this.f32303j0;
            int i10 = qsVar.f32017g;
            this.f32311s0 = new int[i10];
            int[] iArr = {i10};
            for (int i11 = 0; i11 < qsVar.f32017g; i11++) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.peer = MessagesController.getInputPeer(this.Y);
                tL_messages_search.f22136q = "";
                TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) qsVar.f32015c.get(i11));
                tL_messages_search.from_id = inputPeer;
                tL_messages_search.flags |= 1;
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new di.q8(this, inputPeer, i11, iArr, 4));
            }
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f32300g0;
        boolean z13 = false;
        qs qsVar = this.f32305l0;
        if (z12 && qsVar.c()) {
            if (qsVar.f32018i > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.E0 = z11;
        }
        if (this.f32300g0 && qsVar.c() && qsVar.f32018i == 0) {
            qsVar.d();
        } else if (!this.f32300g0 && qsVar.c()) {
            boolean z14 = this.E0;
            if (qsVar.f32018i > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z14 != z10) {
                qsVar.d();
            }
        }
        if (!this.f32300g0 && qsVar.c()) {
            if (qsVar.f32018i > 0) {
                z13 = true;
            }
            this.E0 = z13;
        }
    }

    public final void W(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rs.W(boolean):void");
    }

    @Override
    public final void dismiss() {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        edit.putBoolean("delete_report", this.f32302i0.a());
        edit.putBoolean("delete_deleteAll", this.f32303j0.a());
        if (!this.f32300g0 && this.f32305l0.a()) {
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
        mm0 mm0Var = this.d;
        rect.set(0, 0, mm0Var.getMeasuredWidth(), mm0Var.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        mm0Var.setClipBounds(rect);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
        if (themedColor != this.G0) {
            this.G0 = themedColor;
            setBackgroundColor(themedColor);
        }
    }

    @Override
    public final void show() {
        super.show();
        qc.e();
    }

    @Override
    public final boolean t(View view, float f7, float f10) {
        return !(view instanceof org.telegram.ui.Cells.z1);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, this.f26809n.getClassGuid(), true, new ks(this, 0), this.resourcesProvider);
        this.X = j71Var;
        j71Var.f29505r = false;
        return j71Var;
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
        ArrayList arrayList = this.f32295b0;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        int[] iArr = {i10};
        if (this.f32311s0 != null && this.f32313u0) {
            int i11 = 0;
            while (true) {
                qs qsVar = this.f32303j0;
                if (i11 >= qsVar.f32017g) {
                    break;
                }
                if (qsVar.d[i11] && ((zArr = qsVar.e) == null || zArr[i11])) {
                    TLObject tLObject = (TLObject) qsVar.f32015c.get(i11);
                    iArr[0] = iArr[0] + this.f32311s0[i11];
                }
                i11++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }
}
