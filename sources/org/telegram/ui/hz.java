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
public final class hz extends org.telegram.ui.ActionBar.e2 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public xy J;
    public yy K;
    public cz L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hi.l3 S;
    public boolean T;
    public di.t7 U;
    public int V;
    public int W;
    public int X;
    public ct f47843a;
    public ez f47844b;
    public org.telegram.ui.ActionBar.z4 f47845c;
    public int d;
    public boolean f47846e;
    public boolean f47847f;
    public boolean h;
    public boolean f47848n;
    public final org.telegram.messenger.so f47849r;
    public boolean f47850s;
    public boolean f47851w;
    public CharSequence f47852x;
    public boolean f47853y;

    public hz(org.telegram.messenger.so soVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f47853y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.f47849r = soVar;
        if (soVar == null) {
            org.telegram.messenger.so soVar2 = new org.telegram.messenger.so();
            this.f47849r = soVar2;
            soVar2.f26552a = 2;
            while (getMessagesController().T0.get(this.f47849r.f26552a) != null) {
                this.f47849r.f26552a++;
            }
            org.telegram.messenger.so soVar3 = this.f47849r;
            soVar3.f26553b = "";
            soVar3.f26562m = (int) (Math.random() * 8.0d);
            this.f47850s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47849r.f26553b);
        this.f47852x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f47852x = m10;
        this.f47852x = org.telegram.messenger.gj.B5(m10, this.f47849r.f26554c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.f47849r.f26563n;
        this.f47853y = z10;
        org.telegram.ui.Components.g5.r(this.currentAccount, z10);
        org.telegram.messenger.so soVar4 = this.f47849r;
        this.E = soVar4.f26557g;
        this.F = soVar4.f26562m;
        ArrayList arrayList2 = new ArrayList(this.f47849r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.f47849r.f26558i);
        this.I = this.f47849r.f26559j.clone();
    }

    public static CharSequence E0(int i7, CharSequence charSequence, boolean z10) {
        Context context;
        if (i7 >= 0) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("n_" + i7, false) && (context = org.telegram.messenger.t0.f26609b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable g10 = i5.c.g(context, 2131232270);
                    g10.setBounds(0, -org.telegram.messenger.g0.L(8.0f), g10.getIntrinsicWidth(), g10.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(g10, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable g11 = i5.c.g(context, 2131232268);
                    Drawable g12 = i5.c.g(context, 2131232269);
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ki, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    g11.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g12.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false), mode));
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(g11, g12);
                    fqVar.setBounds(0, 0, fqVar.getIntrinsicWidth(), fqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(fqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(hz hzVar) {
        int i7;
        int i10;
        hzVar.f47853y = !hzVar.f47853y;
        yy yyVar = hzVar.K;
        if (yyVar != null) {
            org.telegram.ui.Cells.w3 w3Var = yyVar.f53748r;
            String str = null;
            if (q0(hzVar.f47852x)) {
                if (hzVar.f47853y) {
                    i10 = 2131750735;
                } else {
                    i10 = 2131750734;
                }
                str = org.telegram.messenger.hd.M0(i10, null);
            }
            w3Var.setText(str);
        }
        org.telegram.ui.Components.g5.r(hzVar.currentAccount, hzVar.f47853y);
        hzVar.o0(true);
        org.telegram.ui.ActionBar.w4 w4Var = hzVar.simpleActionBar;
        if (w4Var != null) {
            int i11 = 26;
            if (w4Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.j5 titleTextView = hzVar.simpleActionBar.getTitleTextView();
                if (hzVar.f47853y) {
                    i7 = 0;
                } else {
                    i7 = 26;
                }
                titleTextView.setEmojiCacheType(i7);
            }
            if (hzVar.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.j5 titleTextView2 = hzVar.simpleActionBar.getTitleTextView2();
                if (hzVar.f47853y) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void a0(hz hzVar) {
        org.telegram.messenger.so soVar = hzVar.f47849r;
        if (hzVar.f47851w) {
            hzVar.f47851w = false;
            Paint.FontMetricsInt titleFontMetricsInt = hzVar.simpleActionBar.getTitleFontMetricsInt();
            Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26553b, titleFontMetricsInt, false, null, 0), soVar.f26554c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.w4 w4Var = hzVar.simpleActionBar;
            w4Var.getClass();
            w4Var.D(B5, true, 220L, org.telegram.ui.Components.er.h);
            return;
        }
        hzVar.finishFragment();
    }

    public static void b0(hz hzVar) {
        int i7;
        org.telegram.messenger.np messagesController = hzVar.getMessagesController();
        org.telegram.messenger.so soVar = hzVar.f47849r;
        messagesController.l5(soVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < soVar.h.size(); i10++) {
            long longValue = ((Long) soVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(hzVar.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(hzVar.getMessagesController().j1(longValue));
            }
        }
        if (hzVar.getUserConfig().q()) {
            i7 = hzVar.getMessagesController().P4;
        } else {
            i7 = hzVar.getMessagesController().O4;
        }
        if (arrayList.size() > i7) {
            hzVar.showDialog(new ug.j0(4, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = soVar.f26552a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            hzVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new oy(hzVar, 1));
        } else {
            hy hyVar = new hy(soVar, null);
            hyVar.f47842y = new ly(hzVar, 1);
            hyVar.f47841x = new ly(hzVar, 2);
            hzVar.presentFragment(hyVar);
        }
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (!org.telegram.messenger.t3.y(3, chat)) {
            if (!org.telegram.messenger.t3.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.p5[] p5VarArr = (org.telegram.ui.Components.p5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.p5.class);
            if (p5VarArr != null && p5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.so soVar, int i7, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.e2 e2Var, Runnable runnable) {
        if (soVar.f26557g != i7 || z13) {
            soVar.f26555e = -1;
            if (z14) {
                soVar.d = -1;
            }
        }
        soVar.f26557g = i7;
        soVar.f26553b = str;
        soVar.f26554c = arrayList;
        soVar.f26562m = i10;
        soVar.f26558i = arrayList3;
        soVar.h = arrayList2;
        soVar.f26563n = z10;
        if (z11) {
            e2Var.getMessagesController().g(soVar, z12);
        } else {
            e2Var.getMessagesController().w3(soVar);
        }
        org.telegram.messenger.vr messagesStorage = e2Var.getMessagesStorage();
        messagesStorage.f27219a.c(new org.telegram.messenger.xf(messagesStorage, soVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = e2Var.getMessagesController().T0();
            int size = T0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.so) T0.get(i11)).f26552a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            e2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.Components.cc ccVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(4, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.k5.o(null, 2131750653, ccVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.k5.o(null, 2131750652, ccVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(5, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(12, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(13, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.k5.o(null, 2131748209, ccVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(4, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.j0(3, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, null).show();
            } else {
                org.telegram.messenger.k5.o(null, 2131743879, ccVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.so soVar, final int i7, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.e2 e2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        int i11 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, e2Var.getParentActivity(), null);
            t1Var2.f29637j0 = false;
            t1Var2.show();
            t1Var = t1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f28176id = soVar.f26552a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.np.D8;
        tL_dialogFilter.contacts = (i7 & 1) != 0;
        tL_dialogFilter.non_contacts = (i7 & 2) != 0;
        tL_dialogFilter.groups = (i7 & 4) != 0;
        tL_dialogFilter.broadcasts = (i7 & 8) != 0;
        tL_dialogFilter.bots = (i7 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i7 & 32) != 0;
        tL_dialogFilter.exclude_read = (i7 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i7 & 128) != 0;
        tL_dialogFilter.f28056id = soVar.f26552a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i10;
        }
        org.telegram.messenger.np messagesController = e2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!org.telegram.messenger.m5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new qs(longSparseIntArray, 1));
        }
        int i15 = 0;
        while (i15 < i11) {
            if (i15 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i15 == i12) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            int i16 = 0;
            while (i16 < size2) {
                Long l10 = (Long) arrayList5.get(i16);
                org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.m5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User a22 = messagesController.a2(l10);
                        if (a22 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = a22.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j3 = -longValue;
                        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
                        if (M0 != null) {
                            if (org.telegram.messenger.t3.T(M0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j3;
                                tL_inputPeerChannel.access_hash = M0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j3;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i16++;
                t1Var = t1Var3;
                size2 = i17;
            }
            i15++;
            i11 = 3;
            i12 = 1;
        }
        final org.telegram.ui.ActionBar.t1 t1Var4 = t1Var;
        e2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.t1 t1Var5 = t1Var4;
                final org.telegram.messenger.so soVar2 = soVar;
                final int i18 = i7;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i19 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (z22) {
                            org.telegram.ui.ActionBar.t1 t1Var6 = t1Var5;
                            if (t1Var6 != null) {
                                try {
                                    t1Var6.dismiss();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            hz.v0(soVar2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, e2Var2, runnable3);
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
        v0(soVar, i7, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, e2Var, null);
    }

    public final void A0(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z10);
        usersSelectActivity.G = this.f47849r.d();
        usersSelectActivity.f43453n = new ab.z(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(zy zyVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        if (z10) {
            t1Var.S = org.telegram.messenger.hd.M0(2131750709, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750710, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750708, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750711, charSequence);
            }
        } else {
            t1Var.S = org.telegram.messenger.hd.M0(2131750714, null);
            if (obj instanceof String) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750715, charSequence);
            } else if (obj instanceof TLRPC.User) {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750713, charSequence);
            } else {
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131750716, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131744855, null), new ab.j(this, zyVar, z10, 8));
        showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
    }

    public final void C0() {
        String str;
        int i7;
        String M0;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.P;
        arrayList.clear();
        ArrayList arrayList2 = this.Q;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String M02 = org.telegram.messenger.hd.M0(2131750733, null);
        if (q0(this.f47852x)) {
            if (this.f47853y) {
                i10 = 2131750735;
            } else {
                i10 = 2131750734;
            }
            str = org.telegram.messenger.hd.M0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final hz f48144b;

            {
                this.f48144b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                hz hzVar = this.f48144b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.so soVar = hzVar.f47849r;
                        if (soVar != null && soVar.d()) {
                            org.telegram.ui.Components.zz.g1(hzVar, soVar.f26552a, new ly(hzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                        String M03 = org.telegram.messenger.hd.M0(2131750790, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M03;
                        t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                        hzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                            return;
                        }
                        return;
                    case 1:
                        hz.Z(hzVar);
                        return;
                    case 2:
                        hzVar.A0(true);
                        return;
                    case 3:
                        hzVar.f47846e = true;
                        hzVar.C0();
                        return;
                    case 4:
                        hzVar.A0(false);
                        return;
                    default:
                        hzVar.f47847f = true;
                        hzVar.C0();
                        return;
                }
            }
        };
        ?? aVar = new rg.a(11, false);
        aVar.d = M02;
        aVar.f54061e = str;
        aVar.f54060c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new rg.a(2, false));
        arrayList2.add(zy.d(null));
        String M03 = org.telegram.messenger.hd.M0(2131750773, null);
        ?? aVar2 = new rg.a(0, false);
        aVar2.d = M03;
        arrayList2.add(aVar2);
        zy b10 = zy.b(2131232022, org.telegram.messenger.hd.M0(2131750813, null), false);
        b10.f54060c = new View.OnClickListener(this) {
            public final hz f48144b;

            {
                this.f48144b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                hz hzVar = this.f48144b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.so soVar = hzVar.f47849r;
                        if (soVar != null && soVar.d()) {
                            org.telegram.ui.Components.zz.g1(hzVar, soVar.f26552a, new ly(hzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                        String M032 = org.telegram.messenger.hd.M0(2131750790, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M032;
                        t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                        hzVar.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                            return;
                        }
                        return;
                    case 1:
                        hz.Z(hzVar);
                        return;
                    case 2:
                        hzVar.A0(true);
                        return;
                    case 3:
                        hzVar.f47846e = true;
                        hzVar.C0();
                        return;
                    case 4:
                        hzVar.A0(false);
                        return;
                    default:
                        hzVar.f47847f = true;
                        hzVar.C0();
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.E;
        int i12 = org.telegram.messenger.np.D8;
        if ((i11 & 1) != 0) {
            arrayList2.add(zy.c(1, org.telegram.messenger.hd.M0(2131750791, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList2.add(zy.c(2, org.telegram.messenger.hd.M0(2131750720, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList2.add(zy.c(4, org.telegram.messenger.hd.M0(2131750774, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList2.add(zy.c(8, org.telegram.messenger.hd.M0(2131750800, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList2.add(zy.c(16, org.telegram.messenger.hd.M0(2131750801, null), "bots", true));
        }
        int i13 = 5;
        if (!this.G.isEmpty()) {
            if (!this.f47846e && this.G.size() >= 8) {
                size2 = Math.min(5, this.G.size());
            } else {
                size2 = this.G.size();
            }
            int i14 = 0;
            while (i14 < size2) {
                long longValue = ((Long) this.G.get(i14)).longValue();
                int i15 = i13;
                ?? aVar3 = new rg.a(1, false);
                aVar3.f54063g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
                i14++;
                i13 = i15;
            }
            i7 = i13;
            if (size2 != this.G.size()) {
                zy b11 = zy.b(2131230871, org.telegram.messenger.hd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f54060c = new View.OnClickListener(this) {
                    public final hz f48144b;

                    {
                        this.f48144b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        hz hzVar = this.f48144b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.so soVar = hzVar.f47849r;
                                if (soVar != null && soVar.d()) {
                                    org.telegram.ui.Components.zz.g1(hzVar, soVar.f26552a, new ly(hzVar, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                                String M032 = org.telegram.messenger.hd.M0(2131750790, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M032;
                                t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                                hzVar.showDialog(t1Var);
                                TextView textView = (TextView) t1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                            case 1:
                                hz.Z(hzVar);
                                return;
                            case 2:
                                hzVar.A0(true);
                                return;
                            case 3:
                                hzVar.f47846e = true;
                                hzVar.C0();
                                return;
                            case 4:
                                hzVar.A0(false);
                                return;
                            default:
                                hzVar.f47847f = true;
                                hzVar.C0();
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        } else {
            i7 = 5;
        }
        arrayList2.add(zy.d(org.telegram.messenger.hd.M0(2131750772, null)));
        org.telegram.messenger.so soVar = this.f47849r;
        if (!soVar.d()) {
            String M04 = org.telegram.messenger.hd.M0(2131750778, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.d = M04;
            arrayList2.add(aVar4);
            zy b12 = zy.b(2131232022, org.telegram.messenger.hd.M0(2131750717, null), false);
            b12.f54060c = new View.OnClickListener(this) {
                public final hz f48144b;

                {
                    this.f48144b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    hz hzVar = this.f48144b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.so soVar2 = hzVar.f47849r;
                            if (soVar2 != null && soVar2.d()) {
                                org.telegram.ui.Components.zz.g1(hzVar, soVar2.f26552a, new ly(hzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                            String M032 = org.telegram.messenger.hd.M0(2131750790, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M032;
                            t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                            hzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                return;
                            }
                            return;
                        case 1:
                            hz.Z(hzVar);
                            return;
                        case 2:
                            hzVar.A0(true);
                            return;
                        case 3:
                            hzVar.f47846e = true;
                            hzVar.C0();
                            return;
                        case 4:
                            hzVar.A0(false);
                            return;
                        default:
                            hzVar.f47847f = true;
                            hzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i16 = this.E;
            int i17 = org.telegram.messenger.np.D8;
            if ((i16 & 32) != 0) {
                arrayList2.add(zy.c(32, org.telegram.messenger.hd.M0(2131750736, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList2.add(zy.c(64, org.telegram.messenger.hd.M0(2131750719, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList2.add(zy.c(128, org.telegram.messenger.hd.M0(2131750804, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                if (!this.f47847f && this.H.size() >= 8) {
                    size = Math.min(i7, this.H.size());
                } else {
                    size = this.H.size();
                }
                for (int i18 = 0; i18 < size; i18++) {
                    long longValue2 = ((Long) this.H.get(i18)).longValue();
                    ?? aVar5 = new rg.a(1, false);
                    aVar5.f54063g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.H.size()) {
                    zy b13 = zy.b(2131230871, org.telegram.messenger.hd.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f54060c = new View.OnClickListener(this) {
                        public final hz f48144b;

                        {
                            this.f48144b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            hz hzVar = this.f48144b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.so soVar2 = hzVar.f47849r;
                                    if (soVar2 != null && soVar2.d()) {
                                        org.telegram.ui.Components.zz.g1(hzVar, soVar2.f26552a, new ly(hzVar, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                                    String M032 = org.telegram.messenger.hd.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M032;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                                    hzVar.showDialog(t1Var);
                                    TextView textView = (TextView) t1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    hz.Z(hzVar);
                                    return;
                                case 2:
                                    hzVar.A0(true);
                                    return;
                                case 3:
                                    hzVar.f47846e = true;
                                    hzVar.C0();
                                    return;
                                case 4:
                                    hzVar.A0(false);
                                    return;
                                default:
                                    hzVar.f47847f = true;
                                    hzVar.C0();
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(zy.d(org.telegram.messenger.hd.M0(2131750777, null)));
        }
        if (getMessagesController().B7 || !getUserConfig().q()) {
            arrayList2.add(new rg.a(9, false));
            arrayList2.add(new rg.a(10, false));
            arrayList2.add(zy.d(org.telegram.messenger.hd.M0(2131750621, null)));
        }
        ArrayList arrayList3 = this.M;
        if (arrayList3.isEmpty()) {
            String M05 = org.telegram.messenger.hd.M0(2131750705, null);
            ?? aVar6 = new rg.a(0, false);
            aVar6.d = M05;
            aVar6.f54062f = true;
            arrayList2.add(aVar6);
            arrayList2.add(zy.b(2131232031, org.telegram.messenger.hd.M0(2131750704, null), false));
            arrayList2.add(zy.d(org.telegram.messenger.hd.M0(2131750743, null)));
        } else {
            String M06 = org.telegram.messenger.hd.M0(2131750745, null);
            ?? aVar7 = new rg.a(0, false);
            aVar7.d = M06;
            aVar7.f54062f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new rg.a(8, false));
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ?? aVar8 = new rg.a(7, false);
                aVar8.f54068m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i19);
                arrayList2.add(aVar8);
            }
            if (soVar.d()) {
                M0 = org.telegram.messenger.hd.M0(2131750743, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131750744, null);
            }
            arrayList2.add(zy.d(M0));
        }
        if (!this.f47850s) {
            zy b14 = zy.b(0, org.telegram.messenger.hd.M0(2131750790, null), true);
            b14.f54060c = new View.OnClickListener(this) {
                public final hz f48144b;

                {
                    this.f48144b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    hz hzVar = this.f48144b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.so soVar2 = hzVar.f47849r;
                            if (soVar2 != null && soVar2.d()) {
                                org.telegram.ui.Components.zz.g1(hzVar, soVar2.f26552a, new ly(hzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                            String M032 = org.telegram.messenger.hd.M0(2131750790, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M032;
                            t1Var.U = org.telegram.messenger.hd.M0(2131750789, null);
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ky(hzVar, 1));
                            hzVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                return;
                            }
                            return;
                        case 1:
                            hz.Z(hzVar);
                            return;
                        case 2:
                            hzVar.A0(true);
                            return;
                        case 3:
                            hzVar.f47846e = true;
                            hzVar.C0();
                            return;
                        case 4:
                            hzVar.A0(false);
                            return;
                        default:
                            hzVar.f47847f = true;
                            hzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(zy.d(null));
        }
        ez ezVar = this.f47844b;
        if (ezVar != null) {
            ezVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f47843a != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zl, false);
                if (x02 != this.W || x03 != this.X) {
                    this.W = x02;
                    this.X = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f47843a.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f47843a.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f47843a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f47843a.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f47843a.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f47843a.V(i10);
                            } else if (i7 == 2) {
                                O = this.f47843a.P(i10);
                            } else {
                                O = this.f47843a.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.pa) {
                                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                                paVar.f30886b0 = true;
                                paVar.R = x02;
                                paVar.S = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.pa) O).i(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29007li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return n0(true);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        boolean z10 = this.f47850s;
        org.telegram.messenger.so soVar = this.f47849r;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131750728, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26553b, titleFontMetricsInt, false, null, 0), soVar.f26554c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            if (w4Var != null) {
                int i11 = 26;
                if (w4Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.j5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f47853y) {
                        i7 = 0;
                    } else {
                        i7 = 26;
                    }
                    titleTextView.setEmojiCacheType(i7);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.j5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f47853y) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 2));
        org.telegram.ui.ActionBar.w4 w4Var2 = this.simpleActionBar;
        if (this.f47850s) {
            i10 = 2131751753;
        } else {
            i10 = 2131745946;
        }
        this.f47845c = w4Var2.q(org.telegram.messenger.hd.M0(i10, null));
        v8 v8Var = new v8(4, context, this);
        this.fragmentView = v8Var;
        ct ctVar = new ct(1, context, this);
        this.f47843a = ctVar;
        ctVar.r1();
        this.f47843a.setLayoutManager(new v4.b0(1, false));
        this.f47843a.setVerticalScrollBarEnabled(false);
        this.f47843a.setSectionsDrawBackground(true);
        v8Var.addView(this.f47843a, c8.ja.c(-1.0f, -1));
        ct ctVar2 = this.f47843a;
        ez ezVar = new ez(this, context);
        this.f47844b = ezVar;
        ctVar2.setAdapter(ezVar);
        this.f47843a.setOnItemClickListener(new h(this, 10));
        this.f47843a.setOnItemLongClickListener(new ky(this, 0));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.n(350L);
        this.f47843a.setItemAnimator(kVar);
        this.f47843a.setOnScrollListener(new g3(this, 11));
        o0(false);
        if (!this.O && soVar != null && soVar.d()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = soVar.f26552a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new oy(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f47843a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47843a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.l8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47843a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29070p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47843a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29089q6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47843a, 262144, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f47843a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (this.f47845c.f29949x.f57086f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z11 = this.f47850s;
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                if (z11) {
                    t1Var.S = org.telegram.messenger.hd.M0(2131750783, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131750785, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750784, null), new ky(this, 2));
                } else {
                    t1Var.S = org.telegram.messenger.hd.M0(2131750782, null);
                    t1Var.U = org.telegram.messenger.hd.M0(2131750786, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ky(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747580, null), new ky(this, 4));
                showDialog(t1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o0(boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f47852x) && this.f47852x.length() <= 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if ((this.E & org.telegram.messenger.np.E8) == 0 && this.G.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 && !this.f47850s) {
                this.h = false;
                org.telegram.messenger.so soVar = this.f47849r;
                if (soVar.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (soVar.f26558i.size() != this.H.size()) {
                    this.h = true;
                }
                if (soVar.f26562m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(soVar.h);
                    Collections.sort(this.G);
                    if (!soVar.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(soVar.f26558i);
                    Collections.sort(this.H);
                    if (!soVar.f26558i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (soVar.f26563n == (!this.f47853y) && TextUtils.equals(soVar.f26553b, this.f47852x) && soVar.f26557g == this.E) {
                    z12 = this.h;
                }
                z11 = z12;
            }
        }
        this.f47845c.a(z11, z10);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.f3 f3Var;
        cz czVar = this.L;
        if (czVar != null && (f3Var = czVar.f30375b) != null && f3Var.f39056e) {
            if (z10) {
                f3Var.k(true);
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
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        cz czVar;
        View view = this.fragmentView;
        if (view != null && (czVar = this.L) != null && czVar.f30375b.f39056e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        di.t7 t7Var = this.U;
        if (t7Var != null) {
            t7Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.f3 f3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                cz czVar = this.L;
                if (czVar != null && (f3Var = czVar.f30375b) != null && f3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Fi)) != this.V) {
                    this.V = themedColor;
                    this.L.f30375b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void p0() {
        String M0;
        if (this.f47850s) {
            if (TextUtils.isEmpty(this.f47852x) || !this.f47848n) {
                int i7 = this.E;
                int i10 = org.telegram.messenger.np.E8;
                int i11 = i7 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((i7 & 64) != 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750730, null);
                    } else {
                        if ((i7 & 32) != 0) {
                            M0 = org.telegram.messenger.hd.M0(2131750731, null);
                        }
                        M0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750791, null);
                    }
                    M0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750720, null);
                    }
                    M0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750774, null);
                    }
                    M0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750801, null);
                    }
                    M0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        M0 = org.telegram.messenger.hd.M0(2131750800, null);
                    }
                    M0 = "";
                }
                if (M0 == null || M0.length() <= 12) {
                    str = M0;
                }
                this.f47852x = str;
                xy xyVar = this.J;
                if (xyVar != null) {
                    xyVar.e(org.telegram.ui.Components.p5.cloneSpans(str, -1, xyVar.f53351s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                v4.e1 K = this.f47843a.K(this.d);
                if (K != null) {
                    this.f47844b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i7 = 0;
            while (true) {
                arrayList = this.M;
                if (i7 < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                arrayList.remove(i7);
                if (arrayList.isEmpty()) {
                    org.telegram.messenger.so soVar = this.f47849r;
                    int i10 = soVar.f26557g;
                    int i11 = org.telegram.messenger.np.D8;
                    soVar.f26557g = i10 & (-513);
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
        int i7 = 0;
        while (true) {
            arrayList = this.M;
            if (i7 < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i7, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i7, boolean z10) {
        org.telegram.messenger.so soVar;
        if (!this.T && (soVar = this.f47849r) != null && soVar.d() && soVar.f()) {
            this.T = true;
            this.U = new di.t7(this, z10, i7, 7);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i7;
        if (arrayList != null) {
            i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i7++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i7 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i7 = 0;
        }
        if (z10) {
            if (size > 0 && size > i7) {
                t0(size, true);
            } else if (i7 > 0) {
                t0(i7, false);
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
        hi.l3 l3Var = this.S;
        if (l3Var != null) {
            l3Var.f(true);
            this.S = null;
        }
        y0(new my(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.f47852x};
        z0(this.f47849r, this.E, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.f47853y, this.F, this.G, this.H, this.I, this.f47850s, false, this.h, true, z10, this, new org.telegram.ui.Components.voip.u(18, this, runnable));
    }
}
