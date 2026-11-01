package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h00 extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public xz I;
    public yz J;
    public c00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public ij R;
    public boolean S;
    public i2.j0 T;
    public int U;
    public int V;
    public int W;
    public ag.b1 f37601a;
    public e00 f37602b;
    public org.telegram.ui.ActionBar.l5 f37603c;
    public int d;
    public boolean e;
    public boolean f37604f;
    public boolean h;
    public boolean f37605n;
    public final org.telegram.messenger.bp f37606r;
    public boolean f37607s;
    public boolean f37608w;
    public CharSequence f37609x;
    public boolean f37610y;

    public h00(org.telegram.messenger.bp bpVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f37610y = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f37606r = bpVar;
        if (bpVar == null) {
            org.telegram.messenger.bp bpVar2 = new org.telegram.messenger.bp();
            this.f37606r = bpVar2;
            bpVar2.f15000a = 2;
            while (getMessagesController().S0.get(this.f37606r.f15000a) != null) {
                this.f37606r.f15000a++;
            }
            org.telegram.messenger.bp bpVar3 = this.f37606r;
            bpVar3.f15001b = "";
            bpVar3.f15009m = (int) (Math.random() * 8.0d);
            this.f37607s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f37606r.f15001b);
        this.f37609x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f37609x = m10;
        this.f37609x = org.telegram.messenger.kj.A5(m10, this.f37606r.f15002c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f37606r.f15010n;
        this.f37610y = z10;
        org.telegram.ui.Components.f5.r(this.currentAccount, z10);
        org.telegram.messenger.bp bpVar4 = this.f37606r;
        this.D = bpVar4.f15004g;
        this.E = bpVar4.f15009m;
        ArrayList arrayList2 = new ArrayList(this.f37606r.h);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f37606r.f15005i);
        this.H = this.f37606r.f15006j.clone();
    }

    public static CharSequence E0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("n_" + i10, false) && (context = org.telegram.messenger.w0.f18945b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable f7 = i0.a.f(context, 2131232268);
                    f7.setBounds(0, -org.telegram.messenger.i0.L(8.0f), f7.getIntrinsicWidth(), f7.getIntrinsicHeight() - org.telegram.messenger.i0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(f7, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable f10 = i0.a.f(context, 2131232266);
                    Drawable f11 = i0.a.f(context, 2131232267);
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    f10.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    f11.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false), mode));
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(f10, f11);
                    eqVar.setBounds(0, 0, eqVar.getIntrinsicWidth(), eqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(eqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(h00 h00Var) {
        int i10;
        int i11;
        h00Var.f37610y = !h00Var.f37610y;
        yz yzVar = h00Var.J;
        if (yzVar != null) {
            org.telegram.ui.Cells.y3 y3Var = yzVar.f43755r;
            String str = null;
            if (q0(h00Var.f37609x)) {
                if (h00Var.f37610y) {
                    i11 = 2131750736;
                } else {
                    i11 = 2131750735;
                }
                str = org.telegram.messenger.dd.L0(i11, null);
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.f5.r(h00Var.currentAccount, h00Var.f37610y);
        h00Var.o0(true);
        org.telegram.ui.ActionBar.i5 i5Var = h00Var.simpleActionBar;
        if (i5Var != null) {
            int i12 = 26;
            if (i5Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.u5 titleTextView = h00Var.simpleActionBar.getTitleTextView();
                if (h00Var.f37610y) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (h00Var.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.u5 titleTextView2 = h00Var.simpleActionBar.getTitleTextView2();
                if (h00Var.f37610y) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void a0(h00 h00Var) {
        org.telegram.messenger.bp bpVar = h00Var.f37606r;
        if (h00Var.f37608w) {
            h00Var.f37608w = false;
            Paint.FontMetricsInt titleFontMetricsInt = h00Var.simpleActionBar.getTitleFontMetricsInt();
            Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.f15001b, titleFontMetricsInt, false, null, 0), bpVar.f15002c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.i5 i5Var = h00Var.simpleActionBar;
            i5Var.getClass();
            i5Var.B(A5, true, 220L, org.telegram.ui.Components.gr.h);
            return;
        }
        h00Var.finishFragment();
    }

    public static void b0(h00 h00Var) {
        int i10;
        org.telegram.messenger.wp messagesController = h00Var.getMessagesController();
        org.telegram.messenger.bp bpVar = h00Var.f37606r;
        messagesController.h5(bpVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < bpVar.h.size(); i11++) {
            long longValue = ((Long) bpVar.h.get(i11)).longValue();
            if (longValue < 0 && m0(h00Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(h00Var.getMessagesController().i1(longValue));
            }
        }
        if (h00Var.getUserConfig().q()) {
            i10 = h00Var.getMessagesController().P4;
        } else {
            i10 = h00Var.getMessagesController().O4;
        }
        if (arrayList.size() > i10) {
            h00Var.showDialog(new kg.q0(4, h00Var.currentAccount, h00Var.getParentActivity(), h00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = bpVar.f15000a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            h00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new nz(h00Var, 1));
        } else {
            hz hzVar = new hz(bpVar, null);
            hzVar.f37905y = new kz(h00Var, 1);
            hzVar.f37904x = new kz(h00Var, 2);
            h00Var.presentFragment(hzVar);
        }
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (!org.telegram.messenger.w3.y(3, chat)) {
            if (!org.telegram.messenger.w3.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.o5.class);
            if (o5VarArr != null && o5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.bp bpVar, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        if (bpVar.f15004g != i10 || z13) {
            bpVar.e = -1;
            if (z14) {
                bpVar.d = -1;
            }
        }
        bpVar.f15004g = i10;
        bpVar.f15001b = str;
        bpVar.f15002c = arrayList;
        bpVar.f15009m = i11;
        bpVar.f15005i = arrayList3;
        bpVar.h = arrayList2;
        bpVar.f15010n = z10;
        if (z11) {
            k2Var.getMessagesController().g(bpVar, z12);
        } else {
            k2Var.getMessagesController().t3(bpVar);
        }
        org.telegram.messenger.is messagesStorage = k2Var.getMessagesStorage();
        messagesStorage.f16331a.c(new org.telegram.messenger.xf(messagesStorage, bpVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = k2Var.getMessagesController().S0();
            int size = S0.size();
            for (int i12 = 0; i12 < size; i12 = c3.i0.j(((org.telegram.messenger.bp) S0.get(i12)).f15000a, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.Components.cc ccVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(4, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.m5.o(null, 2131750654, ccVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.m5.o(null, 2131750653, ccVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(5, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(12, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(13, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.m5.o(null, 2131748226, ccVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(4, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new kg.q0(3, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            } else {
                org.telegram.messenger.m5.o(null, 2131743904, ccVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.bp bpVar, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.k2 k2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = null;
        int i12 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, k2Var.getParentActivity(), null);
            x1Var2.f21489i0 = false;
            x1Var2.show();
            x1Var = x1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f19919id = bpVar.f15000a;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i14 = org.telegram.messenger.wp.D8;
        tL_dialogFilter.contacts = (i10 & 1) != 0;
        tL_dialogFilter.non_contacts = (i10 & 2) != 0;
        tL_dialogFilter.groups = (i10 & 4) != 0;
        tL_dialogFilter.broadcasts = (i10 & 8) != 0;
        tL_dialogFilter.bots = (i10 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i10 & 32) != 0;
        tL_dialogFilter.exclude_read = (i10 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i10 & 128) != 0;
        tL_dialogFilter.f19799id = bpVar.f15000a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i11;
        }
        org.telegram.messenger.wp messagesController = k2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!org.telegram.messenger.o5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new nt(longSparseIntArray, 1));
        }
        int i16 = 0;
        while (i16 < i12) {
            if (i16 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i16 == i13) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            int i17 = 0;
            while (i17 < size2) {
                Long l4 = (Long) arrayList5.get(i17);
                org.telegram.ui.ActionBar.x1 x1Var3 = x1Var;
                int i18 = size2;
                long longValue = l4.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.o5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User Z1 = messagesController.Z1(l4);
                        if (Z1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = Z1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -longValue;
                        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
                        if (L0 != null) {
                            if (org.telegram.messenger.w3.T(L0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j10;
                                tL_inputPeerChannel.access_hash = L0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j10;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i17++;
                x1Var = x1Var3;
                size2 = i18;
            }
            i16++;
            i12 = 3;
            i13 = 1;
        }
        final org.telegram.ui.ActionBar.x1 x1Var4 = x1Var;
        k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.x1 x1Var5 = x1Var4;
                final org.telegram.messenger.bp bpVar2 = bpVar;
                final int i19 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i20 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.x1 x1Var6 = x1Var5;
                            if (x1Var6 != null) {
                                try {
                                    x1Var6.dismiss();
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                            }
                            h00.v0(bpVar2, i19, str2, arrayList7, z17, i20, arrayList8, arrayList9, z18, z19, z20, z21, k2Var2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        v0(bpVar, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, k2Var, null);
    }

    public final void A0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.D, arrayList, z10);
        usersSelectActivity.F = this.f37606r.d();
        usersSelectActivity.f34157n = new ag.w0(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(zz zzVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        if (z10) {
            x1Var.R = org.telegram.messenger.dd.L0(2131750710, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750711, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750709, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750712, charSequence);
            }
        } else {
            x1Var.R = org.telegram.messenger.dd.L0(2131750715, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750716, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750714, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750717, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131744873, null), new ag.v0(this, zzVar, z10, 6));
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
        }
    }

    public final void C0() {
        String str;
        String L0;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String L02 = org.telegram.messenger.dd.L0(2131750734, null);
        if (q0(this.f37609x)) {
            if (this.f37610y) {
                i10 = 2131750736;
            } else {
                i10 = 2131750735;
            }
            str = org.telegram.messenger.dd.L0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final h00 f38217b;

            {
                this.f38217b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                h00 h00Var = this.f38217b;
                switch (i11) {
                    case 0:
                        h00Var.f37604f = true;
                        h00Var.C0();
                        return;
                    case 1:
                        org.telegram.messenger.bp bpVar = h00Var.f37606r;
                        if (bpVar != null && bpVar.d()) {
                            org.telegram.ui.Components.j00.g1(h00Var, bpVar.f15000a, new kz(h00Var, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                        String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L03;
                        x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                        h00Var.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                            return;
                        }
                        return;
                    case 2:
                        h00.Z(h00Var);
                        return;
                    case 3:
                        h00Var.A0(true);
                        return;
                    case 4:
                        h00Var.e = true;
                        h00Var.C0();
                        return;
                    default:
                        h00Var.A0(false);
                        return;
                }
            }
        };
        ?? bVar = new hg.b(11, false);
        bVar.d = L02;
        bVar.e = str;
        bVar.f44256c = onClickListener;
        arrayList2.add(bVar);
        this.d = arrayList2.size();
        arrayList2.add(new hg.b(2, false));
        arrayList2.add(zz.d(null));
        String L03 = org.telegram.messenger.dd.L0(2131750774, null);
        ?? bVar2 = new hg.b(0, false);
        bVar2.d = L03;
        arrayList2.add(bVar2);
        zz b10 = zz.b(2131232021, org.telegram.messenger.dd.L0(2131750814, null), false);
        b10.f44256c = new View.OnClickListener(this) {
            public final h00 f38217b;

            {
                this.f38217b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                h00 h00Var = this.f38217b;
                switch (i11) {
                    case 0:
                        h00Var.f37604f = true;
                        h00Var.C0();
                        return;
                    case 1:
                        org.telegram.messenger.bp bpVar = h00Var.f37606r;
                        if (bpVar != null && bpVar.d()) {
                            org.telegram.ui.Components.j00.g1(h00Var, bpVar.f15000a, new kz(h00Var, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                        String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L032;
                        x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                        h00Var.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                            return;
                        }
                        return;
                    case 2:
                        h00.Z(h00Var);
                        return;
                    case 3:
                        h00Var.A0(true);
                        return;
                    case 4:
                        h00Var.e = true;
                        h00Var.C0();
                        return;
                    default:
                        h00Var.A0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.D;
        int i12 = org.telegram.messenger.wp.D8;
        if ((i11 & 1) != 0) {
            arrayList2.add(zz.c(1, org.telegram.messenger.dd.L0(2131750792, null), "contacts", true));
        }
        if ((this.D & 2) != 0) {
            arrayList2.add(zz.c(2, org.telegram.messenger.dd.L0(2131750721, null), "non_contacts", true));
        }
        if ((this.D & 4) != 0) {
            arrayList2.add(zz.c(4, org.telegram.messenger.dd.L0(2131750775, null), "groups", true));
        }
        if ((this.D & 8) != 0) {
            arrayList2.add(zz.c(8, org.telegram.messenger.dd.L0(2131750801, null), "channels", true));
        }
        if ((this.D & 16) != 0) {
            arrayList2.add(zz.c(16, org.telegram.messenger.dd.L0(2131750802, null), "bots", true));
        }
        if (!this.F.isEmpty()) {
            if (!this.e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            for (int i13 = 0; i13 < size2; i13++) {
                long longValue = ((Long) this.F.get(i13)).longValue();
                ?? bVar3 = new hg.b(1, false);
                bVar3.f44258g = true;
                bVar3.h = longValue;
                arrayList2.add(bVar3);
            }
            if (size2 != this.F.size()) {
                zz b11 = zz.b(2131230871, org.telegram.messenger.dd.G(this.F.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f44256c = new View.OnClickListener(this) {
                    public final h00 f38217b;

                    {
                        this.f38217b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        h00 h00Var = this.f38217b;
                        switch (i112) {
                            case 0:
                                h00Var.f37604f = true;
                                h00Var.C0();
                                return;
                            case 1:
                                org.telegram.messenger.bp bpVar = h00Var.f37606r;
                                if (bpVar != null && bpVar.d()) {
                                    org.telegram.ui.Components.j00.g1(h00Var, bpVar.f15000a, new kz(h00Var, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                                h00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                    return;
                                }
                                return;
                            case 2:
                                h00.Z(h00Var);
                                return;
                            case 3:
                                h00Var.A0(true);
                                return;
                            case 4:
                                h00Var.e = true;
                                h00Var.C0();
                                return;
                            default:
                                h00Var.A0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750773, null)));
        org.telegram.messenger.bp bpVar = this.f37606r;
        if (!bpVar.d()) {
            String L04 = org.telegram.messenger.dd.L0(2131750779, null);
            ?? bVar4 = new hg.b(0, false);
            bVar4.d = L04;
            arrayList2.add(bVar4);
            zz b12 = zz.b(2131232021, org.telegram.messenger.dd.L0(2131750718, null), false);
            b12.f44256c = new View.OnClickListener(this) {
                public final h00 f38217b;

                {
                    this.f38217b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    h00 h00Var = this.f38217b;
                    switch (i112) {
                        case 0:
                            h00Var.f37604f = true;
                            h00Var.C0();
                            return;
                        case 1:
                            org.telegram.messenger.bp bpVar2 = h00Var.f37606r;
                            if (bpVar2 != null && bpVar2.d()) {
                                org.telegram.ui.Components.j00.g1(h00Var, bpVar2.f15000a, new kz(h00Var, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                            String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                            h00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                return;
                            }
                            return;
                        case 2:
                            h00.Z(h00Var);
                            return;
                        case 3:
                            h00Var.A0(true);
                            return;
                        case 4:
                            h00Var.e = true;
                            h00Var.C0();
                            return;
                        default:
                            h00Var.A0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i14 = this.D;
            int i15 = org.telegram.messenger.wp.D8;
            if ((i14 & 32) != 0) {
                arrayList2.add(zz.c(32, org.telegram.messenger.dd.L0(2131750737, null), "muted", false));
            }
            if ((this.D & 64) != 0) {
                arrayList2.add(zz.c(64, org.telegram.messenger.dd.L0(2131750720, null), "read", false));
            }
            if ((this.D & 128) != 0) {
                arrayList2.add(zz.c(128, org.telegram.messenger.dd.L0(2131750805, null), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f37604f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i16 = 0; i16 < size; i16++) {
                    long longValue2 = ((Long) this.G.get(i16)).longValue();
                    ?? bVar5 = new hg.b(1, false);
                    bVar5.f44258g = false;
                    bVar5.h = longValue2;
                    arrayList2.add(bVar5);
                }
                if (size != this.G.size()) {
                    zz b13 = zz.b(2131230871, org.telegram.messenger.dd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f44256c = new View.OnClickListener(this) {
                        public final h00 f38217b;

                        {
                            this.f38217b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            h00 h00Var = this.f38217b;
                            switch (i112) {
                                case 0:
                                    h00Var.f37604f = true;
                                    h00Var.C0();
                                    return;
                                case 1:
                                    org.telegram.messenger.bp bpVar2 = h00Var.f37606r;
                                    if (bpVar2 != null && bpVar2.d()) {
                                        org.telegram.ui.Components.j00.g1(h00Var, bpVar2.f15000a, new kz(h00Var, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                    String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                                    x1Var.R = L032;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                                    h00Var.showDialog(x1Var);
                                    TextView textView = (TextView) x1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                        return;
                                    }
                                    return;
                                case 2:
                                    h00.Z(h00Var);
                                    return;
                                case 3:
                                    h00Var.A0(true);
                                    return;
                                case 4:
                                    h00Var.e = true;
                                    h00Var.C0();
                                    return;
                                default:
                                    h00Var.A0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750778, null)));
        }
        if (getMessagesController().B7 || !getUserConfig().q()) {
            arrayList2.add(new hg.b(9, false));
            arrayList2.add(new hg.b(10, false));
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750622, null)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String L05 = org.telegram.messenger.dd.L0(2131750706, null);
            ?? bVar6 = new hg.b(0, false);
            bVar6.d = L05;
            bVar6.f44257f = true;
            arrayList2.add(bVar6);
            arrayList2.add(zz.b(2131232030, org.telegram.messenger.dd.L0(2131750705, null), false));
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750744, null)));
        } else {
            String L06 = org.telegram.messenger.dd.L0(2131750746, null);
            ?? bVar7 = new hg.b(0, false);
            bVar7.d = L06;
            bVar7.f44257f = true;
            arrayList2.add(bVar7);
            arrayList2.add(new hg.b(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                ?? bVar8 = new hg.b(7, false);
                bVar8.f44263m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                arrayList2.add(bVar8);
            }
            if (bpVar.d()) {
                L0 = org.telegram.messenger.dd.L0(2131750744, null);
            } else {
                L0 = org.telegram.messenger.dd.L0(2131750745, null);
            }
            arrayList2.add(zz.d(L0));
        }
        if (!this.f37607s) {
            zz b14 = zz.b(0, org.telegram.messenger.dd.L0(2131750791, null), true);
            b14.f44256c = new View.OnClickListener(this) {
                public final h00 f38217b;

                {
                    this.f38217b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    h00 h00Var = this.f38217b;
                    switch (i112) {
                        case 0:
                            h00Var.f37604f = true;
                            h00Var.C0();
                            return;
                        case 1:
                            org.telegram.messenger.bp bpVar2 = h00Var.f37606r;
                            if (bpVar2 != null && bpVar2.d()) {
                                org.telegram.ui.Components.j00.g1(h00Var, bpVar2.f15000a, new kz(h00Var, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                            String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, 1));
                            h00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                return;
                            }
                            return;
                        case 2:
                            h00.Z(h00Var);
                            return;
                        case 3:
                            h00Var.A0(true);
                            return;
                        case 4:
                            h00Var.e = true;
                            h00Var.C0();
                            return;
                        default:
                            h00Var.A0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(zz.d(null));
        }
        e00 e00Var = this.f37602b;
        if (e00Var != null) {
            e00Var.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f37601a != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wl, false);
                if (x02 != this.V || x03 != this.W) {
                    this.V = x02;
                    this.W = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f37601a.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f37601a.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f37601a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f37601a.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f37601a.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f37601a.V(i11);
                            } else if (i10 == 2) {
                                O = this.f37601a.P(i11);
                            } else {
                                O = this.f37601a.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.pa) {
                                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                                paVar.f22470a0 = true;
                                paVar.Q = x02;
                                paVar.R = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.pa) O).i(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21031ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return n0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        boolean z10 = this.f37607s;
        org.telegram.messenger.bp bpVar = this.f37606r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131750729, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.f15001b, titleFontMetricsInt, false, null, 0), bpVar.f15002c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var != null) {
                if (i5Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.u5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f37610y) {
                        i11 = 0;
                    } else {
                        i11 = 26;
                    }
                    titleTextView.setEmojiCacheType(i11);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.u5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f37610y) {
                        i10 = 0;
                    } else {
                        i10 = 26;
                    }
                    titleTextView2.setEmojiCacheType(i10);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 22));
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        if (this.f37607s) {
            i12 = 2131751753;
        } else {
            i12 = 2131745963;
        }
        this.f37603c = i5Var2.n(org.telegram.messenger.dd.L0(i12, null));
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        ag.b1 b1Var = new ag.b1(this, context, 26);
        this.f37601a = b1Var;
        b1Var.r1();
        this.f37601a.setLayoutManager(new s4.a0(1, false));
        this.f37601a.setVerticalScrollBarEnabled(false);
        this.f37601a.setSectionsDrawBackground(true);
        w8Var.addView(this.f37601a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.f37601a;
        e00 e00Var = new e00(this, context);
        this.f37602b = e00Var;
        b1Var2.setAdapter(e00Var);
        this.f37601a.setOnItemClickListener(new g(this, 10));
        this.f37601a.setOnItemLongClickListener(new jz(this, 0));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f37601a.setItemAnimator(jVar);
        this.f37601a.setOnScrollListener(new h3(this, 11));
        o0(false);
        if (!this.N && bpVar != null && bpVar.d()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = bpVar.f15000a;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new nz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f37601a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37601a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20930d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37601a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37601a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37601a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37601a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (this.f37603c.f20547x.f7022f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f37607s;
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                if (z11) {
                    x1Var.R = org.telegram.messenger.dd.L0(2131750784, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131750786, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131750785, null), new jz(this, 2));
                } else {
                    x1Var.R = org.telegram.messenger.dd.L0(2131750783, null);
                    x1Var.T = org.telegram.messenger.dd.L0(2131750787, null);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new jz(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new jz(this, 4));
                showDialog(x1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f37609x) && this.f37609x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.D & org.telegram.messenger.wp.E8) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f37607s) {
                this.h = false;
                org.telegram.messenger.bp bpVar = this.f37606r;
                if (bpVar.h.size() != this.F.size()) {
                    this.h = true;
                }
                if (bpVar.f15005i.size() != this.G.size()) {
                    this.h = true;
                }
                if (bpVar.f15009m != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(bpVar.h);
                    Collections.sort(this.F);
                    if (!bpVar.h.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(bpVar.f15005i);
                    Collections.sort(this.G);
                    if (!bpVar.f15005i.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (bpVar.f15010n == (!this.f37610y) && TextUtils.equals(bpVar.f15001b, this.f37609x) && bpVar.f15004g == this.D) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f37603c.a(z11, z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.h3 h3Var;
        c00 c00Var = this.K;
        if (c00Var != null && (h3Var = c00Var.f22066b) != null && h3Var.e) {
            if (z10) {
                h3Var.k(true);
                return false;
            }
            return false;
        }
        return n0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c00 c00Var;
        View view = this.fragmentView;
        if (view != null && (c00Var = this.K) != null && c00Var.f22066b.e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        i2.j0 j0Var = this.T;
        if (j0Var != null) {
            j0Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.h3 h3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                c00 c00Var = this.K;
                if (c00Var != null && (h3Var = c00Var.f22066b) != null && h3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.U) {
                    this.U = themedColor;
                    this.K.f22066b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void p0() {
        String L0;
        if (this.f37607s) {
            if (TextUtils.isEmpty(this.f37609x) || !this.f37605n) {
                int i10 = this.D;
                int i11 = org.telegram.messenger.wp.E8;
                int i12 = i10 & i11;
                String str = "";
                if ((i12 & i11) == i11) {
                    if ((i10 & 64) != 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750731, null);
                    } else {
                        if ((i10 & 32) != 0) {
                            L0 = org.telegram.messenger.dd.L0(2131750732, null);
                        }
                        L0 = "";
                    }
                } else if ((i12 & 1) != 0) {
                    if ((i12 & (-2)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750792, null);
                    }
                    L0 = "";
                } else if ((i12 & 2) != 0) {
                    if ((i12 & (-3)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750721, null);
                    }
                    L0 = "";
                } else if ((i12 & 4) != 0) {
                    if ((i12 & (-5)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750775, null);
                    }
                    L0 = "";
                } else if ((i12 & 16) != 0) {
                    if ((i12 & (-17)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750802, null);
                    }
                    L0 = "";
                } else {
                    if ((i12 & 8) != 0 && (i12 & (-9)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750801, null);
                    }
                    L0 = "";
                }
                if (L0 == null || L0.length() <= 12) {
                    str = L0;
                }
                this.f37609x = str;
                xz xzVar = this.I;
                if (xzVar != null) {
                    xzVar.e(org.telegram.ui.Components.o5.cloneSpans(str, -1, xzVar.f43485s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.f37601a.K(this.d);
                if (K != null) {
                    this.f37602b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i10 = 0;
            while (true) {
                arrayList = this.L;
                if (i10 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                arrayList.remove(i10);
                if (arrayList.isEmpty()) {
                    org.telegram.messenger.bp bpVar = this.f37606r;
                    int i11 = bpVar.f15004g;
                    int i12 = org.telegram.messenger.wp.D8;
                    bpVar.f15004g = i11 & (-513);
                }
                C0();
            }
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i10, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i10, boolean z10) {
        org.telegram.messenger.bp bpVar;
        if (!this.S && (bpVar = this.f37606r) != null && bpVar.d() && bpVar.f()) {
            this.S = true;
            this.T = new i2.j0(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i10;
        if (arrayList != null) {
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!arrayList2.contains(arrayList.get(i11))) {
                    i10++;
                }
            }
            size = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (!arrayList.contains(arrayList2.get(i12))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i10 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i10 = 0;
        }
        if (z10) {
            if (size > 0 && size > i10) {
                t0(size, true);
            } else if (i10 > 0) {
                t0(i10, false);
            }
        } else if (size > 0) {
            t0(size, false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        ij ijVar = this.R;
        if (ijVar != null) {
            ijVar.b(true);
            this.R = null;
        }
        y0(new lz(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f37609x};
        z0(this.f37606r, this.D, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.f37610y, this.E, this.F, this.G, this.H, this.f37607s, false, this.h, true, z10, this, new org.telegram.ui.Components.voip.u(16, this, runnable));
    }
}
