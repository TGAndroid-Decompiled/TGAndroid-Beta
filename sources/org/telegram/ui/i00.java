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
public final class i00 extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public yz I;
    public zz J;
    public d00 K;
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
    public ag.b1 f38066a;
    public f00 f38067b;
    public org.telegram.ui.ActionBar.l5 f38068c;
    public int d;
    public boolean e;
    public boolean f38069f;
    public boolean h;
    public boolean f38070n;
    public final org.telegram.messenger.ap f38071r;
    public boolean f38072s;
    public boolean f38073w;
    public CharSequence f38074x;
    public boolean f38075y;

    public i00(org.telegram.messenger.ap apVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f38075y = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f38071r = apVar;
        if (apVar == null) {
            org.telegram.messenger.ap apVar2 = new org.telegram.messenger.ap();
            this.f38071r = apVar2;
            apVar2.f14645a = 2;
            while (getMessagesController().S0.get(this.f38071r.f14645a) != null) {
                this.f38071r.f14645a++;
            }
            org.telegram.messenger.ap apVar3 = this.f38071r;
            apVar3.f14646b = "";
            apVar3.f14654m = (int) (Math.random() * 8.0d);
            this.f38072s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f38071r.f14646b);
        this.f38074x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f38074x = m10;
        this.f38074x = org.telegram.messenger.jj.A5(m10, this.f38071r.f14647c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f38071r.f14655n;
        this.f38075y = z10;
        org.telegram.ui.Components.f5.r(this.currentAccount, z10);
        org.telegram.messenger.ap apVar4 = this.f38071r;
        this.D = apVar4.f14649g;
        this.E = apVar4.f14654m;
        ArrayList arrayList2 = new ArrayList(this.f38071r.h);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f38071r.f14650i);
        this.H = this.f38071r.f14651j.clone();
    }

    public static CharSequence D0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("n_" + i10, false) && (context = org.telegram.messenger.w0.f19025b) != null) {
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

    public static void Y(i00 i00Var) {
        int i10;
        int i11;
        i00Var.f38075y = !i00Var.f38075y;
        zz zzVar = i00Var.J;
        if (zzVar != null) {
            org.telegram.ui.Cells.y3 y3Var = zzVar.f44261r;
            String str = null;
            if (p0(i00Var.f38074x)) {
                if (i00Var.f38075y) {
                    i11 = 2131750736;
                } else {
                    i11 = 2131750735;
                }
                str = org.telegram.messenger.cd.L0(i11, null);
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.f5.r(i00Var.currentAccount, i00Var.f38075y);
        i00Var.n0(true);
        org.telegram.ui.ActionBar.i5 i5Var = i00Var.simpleActionBar;
        if (i5Var != null) {
            int i12 = 26;
            if (i5Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.u5 titleTextView = i00Var.simpleActionBar.getTitleTextView();
                if (i00Var.f38075y) {
                    i10 = 0;
                } else {
                    i10 = 26;
                }
                titleTextView.setEmojiCacheType(i10);
            }
            if (i00Var.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.u5 titleTextView2 = i00Var.simpleActionBar.getTitleTextView2();
                if (i00Var.f38075y) {
                    i12 = 0;
                }
                titleTextView2.setEmojiCacheType(i12);
            }
        }
    }

    public static void Z(i00 i00Var) {
        org.telegram.messenger.ap apVar = i00Var.f38071r;
        if (i00Var.f38073w) {
            i00Var.f38073w = false;
            Paint.FontMetricsInt titleFontMetricsInt = i00Var.simpleActionBar.getTitleFontMetricsInt();
            Spannable A5 = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(apVar.f14646b, titleFontMetricsInt, false, null, 0), apVar.f14647c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.i5 i5Var = i00Var.simpleActionBar;
            i5Var.getClass();
            i5Var.B(A5, true, 220L, org.telegram.ui.Components.gr.h);
            return;
        }
        i00Var.finishFragment();
    }

    public static void a0(i00 i00Var) {
        int i10;
        org.telegram.messenger.vp messagesController = i00Var.getMessagesController();
        org.telegram.messenger.ap apVar = i00Var.f38071r;
        messagesController.h5(apVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < apVar.h.size(); i11++) {
            long longValue = ((Long) apVar.h.get(i11)).longValue();
            if (longValue < 0 && l0(i00Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(i00Var.getMessagesController().i1(longValue));
            }
        }
        if (i00Var.getUserConfig().q()) {
            i10 = i00Var.getMessagesController().P4;
        } else {
            i10 = i00Var.getMessagesController().O4;
        }
        if (arrayList.size() > i10) {
            i00Var.showDialog(new kg.q0(4, i00Var.currentAccount, i00Var.getParentActivity(), i00Var, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = apVar.f14645a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            i00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new oz(i00Var, 1));
        } else {
            iz izVar = new iz(apVar, null);
            izVar.f38387y = new lz(i00Var, 1);
            izVar.f38386x = new lz(i00Var, 2);
            i00Var.presentFragment(izVar);
        }
    }

    public static boolean l0(TLRPC.Chat chat) {
        if (!org.telegram.messenger.w3.y(3, chat)) {
            if (!org.telegram.messenger.w3.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean p0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.o5.class);
            if (o5VarArr != null && o5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void u0(org.telegram.messenger.ap apVar, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        if (apVar.f14649g != i10 || z13) {
            apVar.e = -1;
            if (z14) {
                apVar.d = -1;
            }
        }
        apVar.f14649g = i10;
        apVar.f14646b = str;
        apVar.f14647c = arrayList;
        apVar.f14654m = i11;
        apVar.f14650i = arrayList3;
        apVar.h = arrayList2;
        apVar.f14655n = z10;
        if (z11) {
            k2Var.getMessagesController().g(apVar, z12);
        } else {
            k2Var.getMessagesController().t3(apVar);
        }
        org.telegram.messenger.hs messagesStorage = k2Var.getMessagesStorage();
        messagesStorage.f15938a.c(new org.telegram.messenger.wf(messagesStorage, apVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = k2Var.getMessagesController().S0();
            int size = S0.size();
            for (int i12 = 0; i12 < size; i12 = c3.i0.j(((org.telegram.messenger.ap) S0.get(i12)).f14645a, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void w0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.Components.cc ccVar) {
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

    public static void y0(final org.telegram.messenger.ap apVar, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.k2 k2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = null;
        int i12 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, k2Var.getParentActivity(), null);
            x1Var2.f21488i0 = false;
            x1Var2.show();
            x1Var = x1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f19918id = apVar.f14645a;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i14 = org.telegram.messenger.vp.D8;
        tL_dialogFilter.contacts = (i10 & 1) != 0;
        tL_dialogFilter.non_contacts = (i10 & 2) != 0;
        tL_dialogFilter.groups = (i10 & 4) != 0;
        tL_dialogFilter.broadcasts = (i10 & 8) != 0;
        tL_dialogFilter.bots = (i10 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i10 & 32) != 0;
        tL_dialogFilter.exclude_read = (i10 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i10 & 128) != 0;
        tL_dialogFilter.f19798id = apVar.f14645a;
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
        org.telegram.messenger.vp messagesController = k2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!org.telegram.messenger.o5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ot(longSparseIntArray, 1));
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
                final org.telegram.messenger.ap apVar2 = apVar;
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
                            i00.u0(apVar2, i19, str2, arrayList7, z17, i20, arrayList8, arrayList9, z18, z19, z20, z21, k2Var2, runnable3);
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
        u0(apVar, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, k2Var, null);
    }

    public final void A0(a00 a00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131750710, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750711, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750709, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750712, charSequence);
            }
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131750715, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750716, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750714, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750717, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744873, null), new ag.v0(this, a00Var, z10, 6));
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
    }

    public final void B0() {
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
        String L02 = org.telegram.messenger.cd.L0(2131750734, null);
        if (p0(this.f38074x)) {
            if (this.f38075y) {
                i10 = 2131750736;
            } else {
                i10 = 2131750735;
            }
            str = org.telegram.messenger.cd.L0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final i00 f38634b;

            {
                this.f38634b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                i00 i00Var = this.f38634b;
                switch (i11) {
                    case 0:
                        i00Var.f38069f = true;
                        i00Var.B0();
                        return;
                    case 1:
                        org.telegram.messenger.ap apVar = i00Var.f38071r;
                        if (apVar != null && apVar.d()) {
                            org.telegram.ui.Components.j00.g1(i00Var, apVar.f14645a, new lz(i00Var, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                        String L03 = org.telegram.messenger.cd.L0(2131750791, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L03;
                        x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                        i00Var.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                            return;
                        }
                        return;
                    case 2:
                        i00.Y(i00Var);
                        return;
                    case 3:
                        i00Var.z0(true);
                        return;
                    case 4:
                        i00Var.e = true;
                        i00Var.B0();
                        return;
                    default:
                        i00Var.z0(false);
                        return;
                }
            }
        };
        ?? bVar = new hg.b(11, false);
        bVar.d = L02;
        bVar.e = str;
        bVar.f35495c = onClickListener;
        arrayList2.add(bVar);
        this.d = arrayList2.size();
        arrayList2.add(new hg.b(2, false));
        arrayList2.add(a00.d(null));
        String L03 = org.telegram.messenger.cd.L0(2131750774, null);
        ?? bVar2 = new hg.b(0, false);
        bVar2.d = L03;
        arrayList2.add(bVar2);
        a00 b10 = a00.b(2131232021, org.telegram.messenger.cd.L0(2131750814, null), false);
        b10.f35495c = new View.OnClickListener(this) {
            public final i00 f38634b;

            {
                this.f38634b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                i00 i00Var = this.f38634b;
                switch (i11) {
                    case 0:
                        i00Var.f38069f = true;
                        i00Var.B0();
                        return;
                    case 1:
                        org.telegram.messenger.ap apVar = i00Var.f38071r;
                        if (apVar != null && apVar.d()) {
                            org.telegram.ui.Components.j00.g1(i00Var, apVar.f14645a, new lz(i00Var, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                        String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L032;
                        x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                        i00Var.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                            return;
                        }
                        return;
                    case 2:
                        i00.Y(i00Var);
                        return;
                    case 3:
                        i00Var.z0(true);
                        return;
                    case 4:
                        i00Var.e = true;
                        i00Var.B0();
                        return;
                    default:
                        i00Var.z0(false);
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.D;
        int i12 = org.telegram.messenger.vp.D8;
        if ((i11 & 1) != 0) {
            arrayList2.add(a00.c(1, org.telegram.messenger.cd.L0(2131750792, null), "contacts", true));
        }
        if ((this.D & 2) != 0) {
            arrayList2.add(a00.c(2, org.telegram.messenger.cd.L0(2131750721, null), "non_contacts", true));
        }
        if ((this.D & 4) != 0) {
            arrayList2.add(a00.c(4, org.telegram.messenger.cd.L0(2131750775, null), "groups", true));
        }
        if ((this.D & 8) != 0) {
            arrayList2.add(a00.c(8, org.telegram.messenger.cd.L0(2131750801, null), "channels", true));
        }
        if ((this.D & 16) != 0) {
            arrayList2.add(a00.c(16, org.telegram.messenger.cd.L0(2131750802, null), "bots", true));
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
                bVar3.f35497g = true;
                bVar3.h = longValue;
                arrayList2.add(bVar3);
            }
            if (size2 != this.F.size()) {
                a00 b11 = a00.b(2131230871, org.telegram.messenger.cd.G(this.F.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f35495c = new View.OnClickListener(this) {
                    public final i00 f38634b;

                    {
                        this.f38634b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        i00 i00Var = this.f38634b;
                        switch (i112) {
                            case 0:
                                i00Var.f38069f = true;
                                i00Var.B0();
                                return;
                            case 1:
                                org.telegram.messenger.ap apVar = i00Var.f38071r;
                                if (apVar != null && apVar.d()) {
                                    org.telegram.ui.Components.j00.g1(i00Var, apVar.f14645a, new lz(i00Var, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                                i00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                            case 2:
                                i00.Y(i00Var);
                                return;
                            case 3:
                                i00Var.z0(true);
                                return;
                            case 4:
                                i00Var.e = true;
                                i00Var.B0();
                                return;
                            default:
                                i00Var.z0(false);
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750773, null)));
        org.telegram.messenger.ap apVar = this.f38071r;
        if (!apVar.d()) {
            String L04 = org.telegram.messenger.cd.L0(2131750779, null);
            ?? bVar4 = new hg.b(0, false);
            bVar4.d = L04;
            arrayList2.add(bVar4);
            a00 b12 = a00.b(2131232021, org.telegram.messenger.cd.L0(2131750718, null), false);
            b12.f35495c = new View.OnClickListener(this) {
                public final i00 f38634b;

                {
                    this.f38634b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    i00 i00Var = this.f38634b;
                    switch (i112) {
                        case 0:
                            i00Var.f38069f = true;
                            i00Var.B0();
                            return;
                        case 1:
                            org.telegram.messenger.ap apVar2 = i00Var.f38071r;
                            if (apVar2 != null && apVar2.d()) {
                                org.telegram.ui.Components.j00.g1(i00Var, apVar2.f14645a, new lz(i00Var, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                            String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                            i00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                return;
                            }
                            return;
                        case 2:
                            i00.Y(i00Var);
                            return;
                        case 3:
                            i00Var.z0(true);
                            return;
                        case 4:
                            i00Var.e = true;
                            i00Var.B0();
                            return;
                        default:
                            i00Var.z0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i14 = this.D;
            int i15 = org.telegram.messenger.vp.D8;
            if ((i14 & 32) != 0) {
                arrayList2.add(a00.c(32, org.telegram.messenger.cd.L0(2131750737, null), "muted", false));
            }
            if ((this.D & 64) != 0) {
                arrayList2.add(a00.c(64, org.telegram.messenger.cd.L0(2131750720, null), "read", false));
            }
            if ((this.D & 128) != 0) {
                arrayList2.add(a00.c(128, org.telegram.messenger.cd.L0(2131750805, null), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f38069f && this.G.size() >= 8) {
                    size = Math.min(5, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i16 = 0; i16 < size; i16++) {
                    long longValue2 = ((Long) this.G.get(i16)).longValue();
                    ?? bVar5 = new hg.b(1, false);
                    bVar5.f35497g = false;
                    bVar5.h = longValue2;
                    arrayList2.add(bVar5);
                }
                if (size != this.G.size()) {
                    a00 b13 = a00.b(2131230871, org.telegram.messenger.cd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f35495c = new View.OnClickListener(this) {
                        public final i00 f38634b;

                        {
                            this.f38634b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            i00 i00Var = this.f38634b;
                            switch (i112) {
                                case 0:
                                    i00Var.f38069f = true;
                                    i00Var.B0();
                                    return;
                                case 1:
                                    org.telegram.messenger.ap apVar2 = i00Var.f38071r;
                                    if (apVar2 != null && apVar2.d()) {
                                        org.telegram.ui.Components.j00.g1(i00Var, apVar2.f14645a, new lz(i00Var, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                    String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L032;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                                    i00Var.showDialog(x1Var);
                                    TextView textView = (TextView) x1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                        return;
                                    }
                                    return;
                                case 2:
                                    i00.Y(i00Var);
                                    return;
                                case 3:
                                    i00Var.z0(true);
                                    return;
                                case 4:
                                    i00Var.e = true;
                                    i00Var.B0();
                                    return;
                                default:
                                    i00Var.z0(false);
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750778, null)));
        }
        if (getMessagesController().B7 || !getUserConfig().q()) {
            arrayList2.add(new hg.b(9, false));
            arrayList2.add(new hg.b(10, false));
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750622, null)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String L05 = org.telegram.messenger.cd.L0(2131750706, null);
            ?? bVar6 = new hg.b(0, false);
            bVar6.d = L05;
            bVar6.f35496f = true;
            arrayList2.add(bVar6);
            arrayList2.add(a00.b(2131232030, org.telegram.messenger.cd.L0(2131750705, null), false));
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750744, null)));
        } else {
            String L06 = org.telegram.messenger.cd.L0(2131750746, null);
            ?? bVar7 = new hg.b(0, false);
            bVar7.d = L06;
            bVar7.f35496f = true;
            arrayList2.add(bVar7);
            arrayList2.add(new hg.b(8, false));
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                ?? bVar8 = new hg.b(7, false);
                bVar8.f35502m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i17);
                arrayList2.add(bVar8);
            }
            if (apVar.d()) {
                L0 = org.telegram.messenger.cd.L0(2131750744, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131750745, null);
            }
            arrayList2.add(a00.d(L0));
        }
        if (!this.f38072s) {
            a00 b14 = a00.b(0, org.telegram.messenger.cd.L0(2131750791, null), true);
            b14.f35495c = new View.OnClickListener(this) {
                public final i00 f38634b;

                {
                    this.f38634b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    i00 i00Var = this.f38634b;
                    switch (i112) {
                        case 0:
                            i00Var.f38069f = true;
                            i00Var.B0();
                            return;
                        case 1:
                            org.telegram.messenger.ap apVar2 = i00Var.f38071r;
                            if (apVar2 != null && apVar2.d()) {
                                org.telegram.ui.Components.j00.g1(i00Var, apVar2.f14645a, new lz(i00Var, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                            String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, 1));
                            i00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                return;
                            }
                            return;
                        case 2:
                            i00.Y(i00Var);
                            return;
                        case 3:
                            i00Var.z0(true);
                            return;
                        case 4:
                            i00Var.e = true;
                            i00Var.B0();
                            return;
                        default:
                            i00Var.z0(false);
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(a00.d(null));
        }
        f00 f00Var = this.f38067b;
        if (f00Var != null) {
            f00Var.E(arrayList, arrayList2);
        }
    }

    public final void C0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f38066a != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wl, false);
                if (x02 != this.V || x03 != this.W) {
                    this.V = x02;
                    this.W = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f38066a.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f38066a.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f38066a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f38066a.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f38066a.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f38066a.V(i11);
                            } else if (i10 == 2) {
                                O = this.f38066a.P(i11);
                            } else {
                                O = this.f38066a.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.pa) {
                                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                                paVar.f22469a0 = true;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21030ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return m0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        boolean z10 = this.f38072s;
        org.telegram.messenger.ap apVar = this.f38071r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750729, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(apVar.f14646b, titleFontMetricsInt, false, null, 0), apVar.f14647c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var != null) {
                if (i5Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.u5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f38075y) {
                        i11 = 0;
                    } else {
                        i11 = 26;
                    }
                    titleTextView.setEmojiCacheType(i11);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.u5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f38075y) {
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
        if (this.f38072s) {
            i12 = 2131751753;
        } else {
            i12 = 2131745963;
        }
        this.f38068c = i5Var2.n(org.telegram.messenger.cd.L0(i12, null));
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        ag.b1 b1Var = new ag.b1(this, context, 26);
        this.f38066a = b1Var;
        b1Var.r1();
        this.f38066a.setLayoutManager(new s4.a0(1, false));
        this.f38066a.setVerticalScrollBarEnabled(false);
        this.f38066a.setSectionsDrawBackground(true);
        w8Var.addView(this.f38066a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.f38066a;
        f00 f00Var = new f00(this, context);
        this.f38067b = f00Var;
        b1Var2.setAdapter(f00Var);
        this.f38066a.setOnItemClickListener(new g(this, 10));
        this.f38066a.setOnItemLongClickListener(new kz(this, 0));
        s4.j jVar = new s4.j();
        jVar.f47927m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f38066a.setItemAnimator(jVar);
        this.f38066a.setOnScrollListener(new h3(this, 11));
        n0(false);
        if (!this.N && apVar != null && apVar.d()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = apVar.f14645a;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new oz(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38066a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38066a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38066a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38066a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38066a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38066a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean m0(boolean z10) {
        if (this.f38068c.f20546x.f7021f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f38072s;
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                if (z11) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131750784, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131750786, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131750785, null), new kz(this, 2));
                } else {
                    x1Var.R = org.telegram.messenger.cd.L0(2131750783, null);
                    x1Var.T = org.telegram.messenger.cd.L0(2131750787, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new kz(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new kz(this, 4));
                showDialog(x1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void n0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f38074x) && this.f38074x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.D & org.telegram.messenger.vp.E8) == 0 && this.F.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f38072s) {
                this.h = false;
                org.telegram.messenger.ap apVar = this.f38071r;
                if (apVar.h.size() != this.F.size()) {
                    this.h = true;
                }
                if (apVar.f14650i.size() != this.G.size()) {
                    this.h = true;
                }
                if (apVar.f14654m != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(apVar.h);
                    Collections.sort(this.F);
                    if (!apVar.h.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(apVar.f14650i);
                    Collections.sort(this.G);
                    if (!apVar.f14650i.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (apVar.f14655n == (!this.f38075y) && TextUtils.equals(apVar.f14646b, this.f38074x) && apVar.f14649g == this.D) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f38068c.a(z11, z10);
    }

    public final void o0() {
        String L0;
        if (this.f38072s) {
            if (TextUtils.isEmpty(this.f38074x) || !this.f38070n) {
                int i10 = this.D;
                int i11 = org.telegram.messenger.vp.E8;
                int i12 = i10 & i11;
                String str = "";
                if ((i12 & i11) == i11) {
                    if ((i10 & 64) != 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750731, null);
                    } else {
                        if ((i10 & 32) != 0) {
                            L0 = org.telegram.messenger.cd.L0(2131750732, null);
                        }
                        L0 = "";
                    }
                } else if ((i12 & 1) != 0) {
                    if ((i12 & (-2)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750792, null);
                    }
                    L0 = "";
                } else if ((i12 & 2) != 0) {
                    if ((i12 & (-3)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750721, null);
                    }
                    L0 = "";
                } else if ((i12 & 4) != 0) {
                    if ((i12 & (-5)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750775, null);
                    }
                    L0 = "";
                } else if ((i12 & 16) != 0) {
                    if ((i12 & (-17)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750802, null);
                    }
                    L0 = "";
                } else {
                    if ((i12 & 8) != 0 && (i12 & (-9)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750801, null);
                    }
                    L0 = "";
                }
                if (L0 == null || L0.length() <= 12) {
                    str = L0;
                }
                this.f38074x = str;
                yz yzVar = this.I;
                if (yzVar != null) {
                    yzVar.e(org.telegram.ui.Components.o5.cloneSpans(str, -1, yzVar.f43919s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.f38066a.K(this.d);
                if (K != null) {
                    this.f38067b.y(K);
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.h3 h3Var;
        d00 d00Var = this.K;
        if (d00Var != null && (h3Var = d00Var.f22065b) != null && h3Var.e) {
            if (z10) {
                h3Var.k(true);
                return false;
            }
            return false;
        }
        return m0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        B0();
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
        d00 d00Var;
        View view = this.fragmentView;
        if (view != null && (d00Var = this.K) != null && d00Var.f22065b.e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        B0();
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
            C0();
            try {
                d00 d00Var = this.K;
                if (d00Var != null && (h3Var = d00Var.f22065b) != null && h3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.U) {
                    this.U = themedColor;
                    this.K.f22065b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void q0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
                    org.telegram.messenger.ap apVar = this.f38071r;
                    int i11 = apVar.f14649g;
                    int i12 = org.telegram.messenger.vp.D8;
                    apVar.f14649g = i11 & (-513);
                }
                B0();
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        B0();
    }

    public final void s0(int i10, boolean z10) {
        org.telegram.messenger.ap apVar;
        if (!this.S && (apVar = this.f38071r) != null && apVar.d() && apVar.f()) {
            this.S = true;
            this.T = new i2.j0(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void t0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
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
                s0(size, true);
            } else if (i10 > 0) {
                s0(i10, false);
            }
        } else if (size > 0) {
            s0(size, false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        ij ijVar = this.R;
        if (ijVar != null) {
            ijVar.b(true);
            this.R = null;
        }
        x0(new mz(this, 0), true);
    }

    public final void x0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f38074x};
        y0(this.f38071r, this.D, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.f38075y, this.E, this.F, this.G, this.H, this.f38072s, false, this.h, true, z10, this, new xs(15, this, runnable));
    }

    public final void z0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.D, arrayList, z10);
        usersSelectActivity.F = this.f38071r.d();
        usersSelectActivity.f34150n = new ag.w0(10, this, z10);
        presentFragment(usersSelectActivity);
    }
}
