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
public final class jz extends org.telegram.ui.ActionBar.f2 {
    public int D;
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public zy I;
    public az J;
    public ez K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public fi.m3 R;
    public boolean S;
    public bi.c9 T;
    public int U;
    public int V;
    public int W;
    public ct f47108a;
    public gz f47109b;
    public org.telegram.ui.ActionBar.c5 f47110c;
    public int d;
    public boolean f47111e;
    public boolean f47112f;
    public boolean h;
    public boolean f47113n;
    public final org.telegram.messenger.vo f47114r;
    public boolean f47115s;
    public boolean f47116w;
    public CharSequence f47117x;
    public boolean f47118y;

    public jz(org.telegram.messenger.vo voVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.f47118y = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.f47114r = voVar;
        if (voVar == null) {
            org.telegram.messenger.vo voVar2 = new org.telegram.messenger.vo();
            this.f47114r = voVar2;
            voVar2.f26074a = 2;
            while (getMessagesController().S0.get(this.f47114r.f26074a) != null) {
                this.f47114r.f26074a++;
            }
            org.telegram.messenger.vo voVar3 = this.f47114r;
            voVar3.f26075b = "";
            voVar3.f26084m = (int) (Math.random() * 8.0d);
            this.f47115s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47114r.f26075b);
        this.f47117x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.f47117x = m10;
        this.f47117x = org.telegram.messenger.ij.B5(m10, this.f47114r.f26076c, textPaint.getFontMetricsInt(), false);
        boolean z9 = !this.f47114r.f26085n;
        this.f47118y = z9;
        org.telegram.ui.Components.h5.r(this.currentAccount, z9);
        org.telegram.messenger.vo voVar4 = this.f47114r;
        this.D = voVar4.f26079g;
        this.E = voVar4.f26084m;
        ArrayList arrayList2 = new ArrayList(this.f47114r.h);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.f47114r.f26080i);
        this.H = this.f47114r.f26081j.clone();
    }

    public static CharSequence E0(int i7, CharSequence charSequence, boolean z9) {
        Context context;
        if (i7 >= 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("n_" + i7, false) && (context = org.telegram.messenger.t0.f25570b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z9) {
                    Drawable h = jg.g.h(context, 2131232269);
                    h.setBounds(0, -org.telegram.messenger.g0.L(8.0f), h.getIntrinsicWidth(), h.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new ImageSpan(h, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable h7 = jg.g.h(context, 2131232267);
                    Drawable h10 = jg.g.h(context, 2131232268);
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hi, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    h7.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    h10.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false), mode));
                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(h7, h10);
                    xpVar.setBounds(0, 0, xpVar.getIntrinsicWidth(), xpVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(xpVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(jz jzVar) {
        int i7;
        int i10;
        jzVar.f47118y = !jzVar.f47118y;
        az azVar = jzVar.J;
        if (azVar != null) {
            org.telegram.ui.Cells.w3 w3Var = azVar.f43843r;
            String str = null;
            if (q0(jzVar.f47117x)) {
                if (jzVar.f47118y) {
                    i10 = 2131750735;
                } else {
                    i10 = 2131750734;
                }
                str = org.telegram.messenger.id.M0(i10, null);
            }
            w3Var.setText(str);
        }
        org.telegram.ui.Components.h5.r(jzVar.currentAccount, jzVar.f47118y);
        jzVar.o0(true);
        org.telegram.ui.ActionBar.z4 z4Var = jzVar.simpleActionBar;
        if (z4Var != null) {
            int i11 = 26;
            if (z4Var.getTitleTextView() != null) {
                org.telegram.ui.ActionBar.m5 titleTextView = jzVar.simpleActionBar.getTitleTextView();
                if (jzVar.f47118y) {
                    i7 = 0;
                } else {
                    i7 = 26;
                }
                titleTextView.setEmojiCacheType(i7);
            }
            if (jzVar.simpleActionBar.getTitleTextView2() != null) {
                org.telegram.ui.ActionBar.m5 titleTextView2 = jzVar.simpleActionBar.getTitleTextView2();
                if (jzVar.f47118y) {
                    i11 = 0;
                }
                titleTextView2.setEmojiCacheType(i11);
            }
        }
    }

    public static void a0(jz jzVar) {
        org.telegram.messenger.vo voVar = jzVar.f47114r;
        if (jzVar.f47116w) {
            jzVar.f47116w = false;
            Paint.FontMetricsInt titleFontMetricsInt = jzVar.simpleActionBar.getTitleFontMetricsInt();
            Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(voVar.f26075b, titleFontMetricsInt, false, null, 0), voVar.f26076c, titleFontMetricsInt, false);
            org.telegram.ui.ActionBar.z4 z4Var = jzVar.simpleActionBar;
            z4Var.getClass();
            z4Var.C(B5, true, 220L, org.telegram.ui.Components.wq.h);
            return;
        }
        jzVar.finishFragment();
    }

    public static void b0(jz jzVar) {
        int i7;
        org.telegram.messenger.qp messagesController = jzVar.getMessagesController();
        org.telegram.messenger.vo voVar = jzVar.f47114r;
        messagesController.k5(voVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < voVar.h.size(); i10++) {
            long longValue = ((Long) voVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(jzVar.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(jzVar.getMessagesController().j1(longValue));
            }
        }
        if (jzVar.getUserConfig().q()) {
            i7 = jzVar.getMessagesController().O4;
        } else {
            i7 = jzVar.getMessagesController().N4;
        }
        if (arrayList.size() > i7) {
            jzVar.showDialog(new ug.i0(4, jzVar.currentAccount, jzVar.getParentActivity(), jzVar, null));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = voVar.f26074a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            jzVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new qy(jzVar, 1));
        } else {
            jy jyVar = new jy(voVar, null);
            jyVar.f47103y = new ny(jzVar, 1);
            jyVar.f47102x = new ny(jzVar, 2);
            jzVar.presentFragment(jyVar);
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
            org.telegram.ui.Components.q5[] q5VarArr = (org.telegram.ui.Components.q5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.q5.class);
            if (q5VarArr != null && q5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.vo voVar, int i7, String str, ArrayList arrayList, boolean z9, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z10, boolean z11, boolean z12, boolean z13, org.telegram.ui.ActionBar.f2 f2Var, Runnable runnable) {
        if (voVar.f26079g != i7 || z12) {
            voVar.f26077e = -1;
            if (z13) {
                voVar.d = -1;
            }
        }
        voVar.f26079g = i7;
        voVar.f26075b = str;
        voVar.f26076c = arrayList;
        voVar.f26084m = i10;
        voVar.f26080i = arrayList3;
        voVar.h = arrayList2;
        voVar.f26085n = z9;
        if (z10) {
            f2Var.getMessagesController().g(voVar, z11);
        } else {
            f2Var.getMessagesController().w3(voVar);
        }
        org.telegram.messenger.yr messagesStorage = f2Var.getMessagesStorage();
        messagesStorage.f26723a.c(new org.telegram.messenger.yf(messagesStorage, voVar, z11, 9));
        if (z11) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = f2Var.getMessagesController().T0();
            int size = T0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.recaptcha.internal.a.f(((org.telegram.messenger.vo) T0.get(i11)).f26074a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            f2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.Components.gc gcVar) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(4, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131750653, gcVar, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131750652, gcVar, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(5, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(12, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(13, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                org.telegram.messenger.k5.p(null, 2131748209, gcVar, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(4, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new ug.i0(3, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, null).show();
            } else {
                org.telegram.messenger.k5.p(null, 2131743879, gcVar, null);
            }
        }
    }

    public static void z0(final org.telegram.messenger.vo voVar, final int i7, final String str, final ArrayList arrayList, final boolean z9, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final org.telegram.ui.ActionBar.f2 f2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = null;
        int i11 = 3;
        if (z14) {
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, f2Var.getParentActivity(), null);
            u1Var2.f28558i0 = false;
            u1Var2.show();
            u1Var = u1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.f27085id = voVar.f26074a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.qp.C8;
        tL_dialogFilter.contacts = (i7 & 1) != 0;
        tL_dialogFilter.non_contacts = (i7 & 2) != 0;
        tL_dialogFilter.groups = (i7 & 4) != 0;
        tL_dialogFilter.broadcasts = (i7 & 8) != 0;
        tL_dialogFilter.bots = (i7 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i7 & 32) != 0;
        tL_dialogFilter.exclude_read = (i7 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i7 & 128) != 0;
        tL_dialogFilter.f26965id = voVar.f26074a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z9;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i10;
        }
        org.telegram.messenger.qp messagesController = f2Var.getMessagesController();
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
                org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
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
                u1Var = u1Var3;
                size2 = i17;
            }
            i15++;
            i11 = 3;
            i12 = 1;
        }
        final org.telegram.ui.ActionBar.u1 u1Var4 = u1Var;
        f2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z15 = z14;
                final org.telegram.ui.ActionBar.u1 u1Var5 = u1Var4;
                final org.telegram.messenger.vo voVar2 = voVar;
                final int i18 = i7;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z16 = z9;
                final int i19 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z17 = z10;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z21 = z15;
                        Runnable runnable3 = runnable2;
                        if (z21) {
                            org.telegram.ui.ActionBar.u1 u1Var6 = u1Var5;
                            if (u1Var6 != null) {
                                try {
                                    u1Var6.dismiss();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            jz.v0(voVar2, i18, str2, arrayList7, z16, i19, arrayList8, arrayList9, z17, z18, z19, z20, f2Var2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z14) {
            return;
        }
        v0(voVar, i7, str, arrayList, z9, i10, arrayList2, arrayList3, z10, z11, z12, z13, f2Var, null);
    }

    public final void A0(boolean z9) {
        ArrayList arrayList;
        if (z9) {
            arrayList = this.F;
        } else {
            arrayList = this.G;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.D, arrayList, z9);
        usersSelectActivity.F = this.f47114r.d();
        usersSelectActivity.f42077n = new ab.y(7, this, z9);
        presentFragment(usersSelectActivity);
    }

    public final void B0(bz bzVar, CharSequence charSequence, Object obj, boolean z9) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        if (z9) {
            u1Var.R = org.telegram.messenger.id.M0(2131750709, null);
            if (obj instanceof String) {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750710, charSequence);
            } else if (obj instanceof TLRPC.User) {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750708, charSequence);
            } else {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750711, charSequence);
            }
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131750714, null);
            if (obj instanceof String) {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750715, charSequence);
            } else if (obj instanceof TLRPC.User) {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750713, charSequence);
            } else {
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131750716, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131744855, null), new ab.j(this, bzVar, z9, 8));
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
        }
    }

    public final void C0() {
        String str;
        int i7;
        String M0;
        int size;
        int size2;
        int i10;
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String M02 = org.telegram.messenger.id.M0(2131750733, null);
        if (q0(this.f47117x)) {
            if (this.f47118y) {
                i10 = 2131750735;
            } else {
                i10 = 2131750734;
            }
            str = org.telegram.messenger.id.M0(i10, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final jz f47458b;

            {
                this.f47458b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                jz jzVar = this.f47458b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.vo voVar = jzVar.f47114r;
                        if (voVar != null && voVar.d()) {
                            org.telegram.ui.Components.vz.g1(jzVar, voVar.f26074a, new ny(jzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                        String M03 = org.telegram.messenger.id.M0(2131750790, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M03;
                        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                        jzVar.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                            return;
                        }
                        return;
                    case 1:
                        jz.Z(jzVar);
                        return;
                    case 2:
                        jzVar.A0(true);
                        return;
                    case 3:
                        jzVar.f47111e = true;
                        jzVar.C0();
                        return;
                    case 4:
                        jzVar.A0(false);
                        return;
                    default:
                        jzVar.f47112f = true;
                        jzVar.C0();
                        return;
                }
            }
        };
        ?? aVar = new rg.a(11, false);
        aVar.d = M02;
        aVar.f44176e = str;
        aVar.f44175c = onClickListener;
        arrayList2.add(aVar);
        this.d = arrayList2.size();
        arrayList2.add(new rg.a(2, false));
        arrayList2.add(bz.d(null));
        String M03 = org.telegram.messenger.id.M0(2131750773, null);
        ?? aVar2 = new rg.a(0, false);
        aVar2.d = M03;
        arrayList2.add(aVar2);
        bz b10 = bz.b(2131232022, org.telegram.messenger.id.M0(2131750813, null), false);
        b10.f44175c = new View.OnClickListener(this) {
            public final jz f47458b;

            {
                this.f47458b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                jz jzVar = this.f47458b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.vo voVar = jzVar.f47114r;
                        if (voVar != null && voVar.d()) {
                            org.telegram.ui.Components.vz.g1(jzVar, voVar.f26074a, new ny(jzVar, 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                        String M032 = org.telegram.messenger.id.M0(2131750790, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                        u1Var.R = M032;
                        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                        jzVar.showDialog(u1Var);
                        TextView textView = (TextView) u1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                            return;
                        }
                        return;
                    case 1:
                        jz.Z(jzVar);
                        return;
                    case 2:
                        jzVar.A0(true);
                        return;
                    case 3:
                        jzVar.f47111e = true;
                        jzVar.C0();
                        return;
                    case 4:
                        jzVar.A0(false);
                        return;
                    default:
                        jzVar.f47112f = true;
                        jzVar.C0();
                        return;
                }
            }
        };
        arrayList2.add(b10);
        int i11 = this.D;
        int i12 = org.telegram.messenger.qp.C8;
        if ((i11 & 1) != 0) {
            arrayList2.add(bz.c(1, org.telegram.messenger.id.M0(2131750791, null), "contacts", true));
        }
        if ((this.D & 2) != 0) {
            arrayList2.add(bz.c(2, org.telegram.messenger.id.M0(2131750720, null), "non_contacts", true));
        }
        if ((this.D & 4) != 0) {
            arrayList2.add(bz.c(4, org.telegram.messenger.id.M0(2131750774, null), "groups", true));
        }
        if ((this.D & 8) != 0) {
            arrayList2.add(bz.c(8, org.telegram.messenger.id.M0(2131750800, null), "channels", true));
        }
        if ((this.D & 16) != 0) {
            arrayList2.add(bz.c(16, org.telegram.messenger.id.M0(2131750801, null), "bots", true));
        }
        int i13 = 5;
        if (!this.F.isEmpty()) {
            if (!this.f47111e && this.F.size() >= 8) {
                size2 = Math.min(5, this.F.size());
            } else {
                size2 = this.F.size();
            }
            int i14 = 0;
            while (i14 < size2) {
                long longValue = ((Long) this.F.get(i14)).longValue();
                int i15 = i13;
                ?? aVar3 = new rg.a(1, false);
                aVar3.f44178g = true;
                aVar3.h = longValue;
                arrayList2.add(aVar3);
                i14++;
                i13 = i15;
            }
            i7 = i13;
            if (size2 != this.F.size()) {
                bz b11 = bz.b(2131230871, org.telegram.messenger.id.G(this.F.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.f44175c = new View.OnClickListener(this) {
                    public final jz f47458b;

                    {
                        this.f47458b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i112 = r2;
                        jz jzVar = this.f47458b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.vo voVar = jzVar.f47114r;
                                if (voVar != null && voVar.d()) {
                                    org.telegram.ui.Components.vz.g1(jzVar, voVar.f26074a, new ny(jzVar, 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                                String M032 = org.telegram.messenger.id.M0(2131750790, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                u1Var.R = M032;
                                u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                                jzVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                    return;
                                }
                                return;
                            case 1:
                                jz.Z(jzVar);
                                return;
                            case 2:
                                jzVar.A0(true);
                                return;
                            case 3:
                                jzVar.f47111e = true;
                                jzVar.C0();
                                return;
                            case 4:
                                jzVar.A0(false);
                                return;
                            default:
                                jzVar.f47112f = true;
                                jzVar.C0();
                                return;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        } else {
            i7 = 5;
        }
        arrayList2.add(bz.d(org.telegram.messenger.id.M0(2131750772, null)));
        org.telegram.messenger.vo voVar = this.f47114r;
        if (!voVar.d()) {
            String M04 = org.telegram.messenger.id.M0(2131750778, null);
            ?? aVar4 = new rg.a(0, false);
            aVar4.d = M04;
            arrayList2.add(aVar4);
            bz b12 = bz.b(2131232022, org.telegram.messenger.id.M0(2131750717, null), false);
            b12.f44175c = new View.OnClickListener(this) {
                public final jz f47458b;

                {
                    this.f47458b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    jz jzVar = this.f47458b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.vo voVar2 = jzVar.f47114r;
                            if (voVar2 != null && voVar2.d()) {
                                org.telegram.ui.Components.vz.g1(jzVar, voVar2.f26074a, new ny(jzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                            String M032 = org.telegram.messenger.id.M0(2131750790, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = M032;
                            u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                            jzVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                return;
                            }
                            return;
                        case 1:
                            jz.Z(jzVar);
                            return;
                        case 2:
                            jzVar.A0(true);
                            return;
                        case 3:
                            jzVar.f47111e = true;
                            jzVar.C0();
                            return;
                        case 4:
                            jzVar.A0(false);
                            return;
                        default:
                            jzVar.f47112f = true;
                            jzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b12);
            int i16 = this.D;
            int i17 = org.telegram.messenger.qp.C8;
            if ((i16 & 32) != 0) {
                arrayList2.add(bz.c(32, org.telegram.messenger.id.M0(2131750736, null), "muted", false));
            }
            if ((this.D & 64) != 0) {
                arrayList2.add(bz.c(64, org.telegram.messenger.id.M0(2131750719, null), "read", false));
            }
            if ((this.D & 128) != 0) {
                arrayList2.add(bz.c(128, org.telegram.messenger.id.M0(2131750804, null), "archived", false));
            }
            if (!this.G.isEmpty()) {
                if (!this.f47112f && this.G.size() >= 8) {
                    size = Math.min(i7, this.G.size());
                } else {
                    size = this.G.size();
                }
                for (int i18 = 0; i18 < size; i18++) {
                    long longValue2 = ((Long) this.G.get(i18)).longValue();
                    ?? aVar5 = new rg.a(1, false);
                    aVar5.f44178g = false;
                    aVar5.h = longValue2;
                    arrayList2.add(aVar5);
                }
                if (size != this.G.size()) {
                    bz b13 = bz.b(2131230871, org.telegram.messenger.id.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.f44175c = new View.OnClickListener(this) {
                        public final jz f47458b;

                        {
                            this.f47458b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i112 = r2;
                            jz jzVar = this.f47458b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.vo voVar2 = jzVar.f47114r;
                                    if (voVar2 != null && voVar2.d()) {
                                        org.telegram.ui.Components.vz.g1(jzVar, voVar2.f26074a, new ny(jzVar, 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                                    String M032 = org.telegram.messenger.id.M0(2131750790, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                    u1Var.R = M032;
                                    u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                                    jzVar.showDialog(u1Var);
                                    TextView textView = (TextView) u1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    jz.Z(jzVar);
                                    return;
                                case 2:
                                    jzVar.A0(true);
                                    return;
                                case 3:
                                    jzVar.f47111e = true;
                                    jzVar.C0();
                                    return;
                                case 4:
                                    jzVar.A0(false);
                                    return;
                                default:
                                    jzVar.f47112f = true;
                                    jzVar.C0();
                                    return;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(bz.d(org.telegram.messenger.id.M0(2131750777, null)));
        }
        if (getMessagesController().A7 || !getUserConfig().q()) {
            arrayList2.add(new rg.a(9, false));
            arrayList2.add(new rg.a(10, false));
            arrayList2.add(bz.d(org.telegram.messenger.id.M0(2131750621, null)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String M05 = org.telegram.messenger.id.M0(2131750705, null);
            ?? aVar6 = new rg.a(0, false);
            aVar6.d = M05;
            aVar6.f44177f = true;
            arrayList2.add(aVar6);
            arrayList2.add(bz.b(2131232031, org.telegram.messenger.id.M0(2131750704, null), false));
            arrayList2.add(bz.d(org.telegram.messenger.id.M0(2131750743, null)));
        } else {
            String M06 = org.telegram.messenger.id.M0(2131750745, null);
            ?? aVar7 = new rg.a(0, false);
            aVar7.d = M06;
            aVar7.f44177f = true;
            arrayList2.add(aVar7);
            arrayList2.add(new rg.a(8, false));
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                ?? aVar8 = new rg.a(7, false);
                aVar8.f44183m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i19);
                arrayList2.add(aVar8);
            }
            if (voVar.d()) {
                M0 = org.telegram.messenger.id.M0(2131750743, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131750744, null);
            }
            arrayList2.add(bz.d(M0));
        }
        if (!this.f47115s) {
            bz b14 = bz.b(0, org.telegram.messenger.id.M0(2131750790, null), true);
            b14.f44175c = new View.OnClickListener(this) {
                public final jz f47458b;

                {
                    this.f47458b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    jz jzVar = this.f47458b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.vo voVar2 = jzVar.f47114r;
                            if (voVar2 != null && voVar2.d()) {
                                org.telegram.ui.Components.vz.g1(jzVar, voVar2.f26074a, new ny(jzVar, 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jzVar.getParentActivity());
                            String M032 = org.telegram.messenger.id.M0(2131750790, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = M032;
                            u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new my(jzVar, 1));
                            jzVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                return;
                            }
                            return;
                        case 1:
                            jz.Z(jzVar);
                            return;
                        case 2:
                            jzVar.A0(true);
                            return;
                        case 3:
                            jzVar.f47111e = true;
                            jzVar.C0();
                            return;
                        case 4:
                            jzVar.A0(false);
                            return;
                        default:
                            jzVar.f47112f = true;
                            jzVar.C0();
                            return;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(bz.d(null));
        }
        gz gzVar = this.f47109b;
        if (gzVar != null) {
            gzVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f47108a != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Wl, false);
                if (x02 != this.V || x03 != this.W) {
                    this.V = x02;
                    this.W = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f47108a.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f47108a.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f47108a.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f47108a.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f47108a.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f47108a.V(i10);
                            } else if (i7 == 2) {
                                O = this.f47108a.P(i10);
                            } else {
                                O = this.f47108a.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.pa) {
                                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) O;
                                paVar.f29767a0 = true;
                                paVar.Q = x02;
                                paVar.R = x03;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28282y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27992ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
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
        boolean z9 = this.f47115s;
        org.telegram.messenger.vo voVar = this.f47114r;
        if (z9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131750728, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(voVar.f26075b, titleFontMetricsInt, false, null, 0), voVar.f26076c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            if (z4Var != null) {
                int i11 = 26;
                if (z4Var.getTitleTextView() != null) {
                    org.telegram.ui.ActionBar.m5 titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.f47118y) {
                        i7 = 0;
                    } else {
                        i7 = 26;
                    }
                    titleTextView.setEmojiCacheType(i7);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    org.telegram.ui.ActionBar.m5 titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.f47118y) {
                        i11 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i11);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 1));
        org.telegram.ui.ActionBar.z4 z4Var2 = this.simpleActionBar;
        if (this.f47115s) {
            i10 = 2131751753;
        } else {
            i10 = 2131745946;
        }
        this.f47110c = z4Var2.p(org.telegram.messenger.id.M0(i10, null));
        v8 v8Var = new v8(4, context, this);
        this.fragmentView = v8Var;
        ct ctVar = new ct(1, context, this);
        this.f47108a = ctVar;
        ctVar.r1();
        this.f47108a.setLayoutManager(new v4.b0(1, false));
        this.f47108a.setVerticalScrollBarEnabled(false);
        this.f47108a.setSectionsDrawBackground(true);
        v8Var.addView(this.f47108a, c8.ha.c(-1.0f, -1));
        ct ctVar2 = this.f47108a;
        gz gzVar = new gz(this, context);
        this.f47109b = gzVar;
        ctVar2.setAdapter(gzVar);
        this.f47108a.setOnItemClickListener(new h(this, 10));
        this.f47108a.setOnItemLongClickListener(new my(this, 0));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        this.f47108a.setItemAnimator(kVar);
        this.f47108a.setOnScrollListener(new g3(this, 11));
        o0(false);
        if (!this.N && voVar != null && voVar.d()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = voVar.f26074a;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new qy(this, 0));
        }
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f47108a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47108a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.m8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47108a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28111p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47108a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28130q6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47108a, 262144, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47108a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z9) {
        if (this.f47110c.f27379x.f55499f) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z10 = this.f47115s;
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                if (z10) {
                    u1Var.R = org.telegram.messenger.id.M0(2131750783, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131750785, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750784, null), new my(this, 2));
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131750782, null);
                    u1Var.T = org.telegram.messenger.id.M0(2131750786, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new my(this, 3));
                }
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new my(this, 4));
                showDialog(u1Var);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void o0(boolean z9) {
        boolean z10;
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f47117x) && this.f47117x.length() <= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((this.D & org.telegram.messenger.qp.D8) == 0 && this.F.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && !this.f47115s) {
                this.h = false;
                org.telegram.messenger.vo voVar = this.f47114r;
                if (voVar.h.size() != this.F.size()) {
                    this.h = true;
                }
                if (voVar.f26080i.size() != this.G.size()) {
                    this.h = true;
                }
                if (voVar.f26084m != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(voVar.h);
                    Collections.sort(this.F);
                    if (!voVar.h.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(voVar.f26080i);
                    Collections.sort(this.G);
                    if (!voVar.f26080i.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (voVar.f26085n == (!this.f47118y) && TextUtils.equals(voVar.f26075b, this.f47117x) && voVar.f26079g == this.D) {
                    z11 = this.h;
                }
                z10 = z11;
            }
        }
        this.f47110c.a(z10, z9);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Cells.f3 f3Var;
        ez ezVar = this.K;
        if (ezVar != null && (f3Var = ezVar.f29267b) != null && f3Var.f35436e) {
            if (z9) {
                f3Var.k(true);
                return false;
            }
            return false;
        }
        return n0(z9);
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
    public final void onInsets(int i7, int i10, int i11, int i12) {
        ez ezVar;
        View view = this.fragmentView;
        if (view != null && (ezVar = this.K) != null && ezVar.f29267b.f35436e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        bi.c9 c9Var = this.T;
        if (c9Var != null) {
            c9Var.run();
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
                ez ezVar = this.K;
                if (ezVar != null && (f3Var = ezVar.f29267b) != null && f3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.Ci)) != this.U) {
                    this.U = themedColor;
                    this.K.f29267b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
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
        if (this.f47115s) {
            if (TextUtils.isEmpty(this.f47117x) || !this.f47113n) {
                int i7 = this.D;
                int i10 = org.telegram.messenger.qp.D8;
                int i11 = i7 & i10;
                String str = "";
                if ((i11 & i10) == i10) {
                    if ((i7 & 64) != 0) {
                        M0 = org.telegram.messenger.id.M0(2131750730, null);
                    } else {
                        if ((i7 & 32) != 0) {
                            M0 = org.telegram.messenger.id.M0(2131750731, null);
                        }
                        M0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        M0 = org.telegram.messenger.id.M0(2131750791, null);
                    }
                    M0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        M0 = org.telegram.messenger.id.M0(2131750720, null);
                    }
                    M0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        M0 = org.telegram.messenger.id.M0(2131750774, null);
                    }
                    M0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        M0 = org.telegram.messenger.id.M0(2131750801, null);
                    }
                    M0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        M0 = org.telegram.messenger.id.M0(2131750800, null);
                    }
                    M0 = "";
                }
                if (M0 == null || M0.length() <= 12) {
                    str = M0;
                }
                this.f47117x = str;
                zy zyVar = this.I;
                if (zyVar != null) {
                    zyVar.e(org.telegram.ui.Components.q5.cloneSpans(str, -1, zyVar.f52706s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                v4.d1 K = this.f47108a.K(this.d);
                if (K != null) {
                    this.f47109b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i7 = 0;
            while (true) {
                arrayList = this.L;
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
                    org.telegram.messenger.vo voVar = this.f47114r;
                    int i10 = voVar.f26079g;
                    int i11 = org.telegram.messenger.qp.C8;
                    voVar.f26079g = i10 & (-513);
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
            arrayList = this.L;
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

    public final void t0(int i7, boolean z9) {
        org.telegram.messenger.vo voVar;
        if (!this.S && (voVar = this.f47114r) != null && voVar.d() && voVar.f()) {
            this.S = true;
            this.T = new bi.c9(this, z9, i7, 7);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
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
        if (z9) {
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
        fi.m3 m3Var = this.R;
        if (m3Var != null) {
            m3Var.f(true);
            this.R = null;
        }
        y0(new oy(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z9) {
        CharSequence[] charSequenceArr = {this.f47117x};
        z0(this.f47114r, this.D, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.f47118y, this.E, this.F, this.G, this.H, this.f47115s, false, this.h, true, z9, this, new org.telegram.ui.Components.h41(23, this, runnable));
    }
}
