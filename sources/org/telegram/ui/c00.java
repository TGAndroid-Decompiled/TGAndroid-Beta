package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c00 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.fs, te.b {
    public static final SpannableStringBuilder[] f46342t0 = new SpannableStringBuilder[3];
    public jg.o0 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final org.telegram.ui.ActionBar.g2 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final vz T;
    public final wz U;
    public final a00 V;
    public final xz W;
    public final te.a f46343a;
    public final zz f46344a0;
    public final et f46345b;
    public final xz f46346b0;
    public final org.telegram.ui.Components.nv0 f46347c;
    public final xz f46348c0;
    public org.telegram.ui.Components.dk0 d;
    public final ArrayList f46349d0;
    public mz f46350e;
    public final ArrayList f46351e0;
    public final ArrayList f46352f;
    public boolean f46353f0;
    public final m4 f46354g0;
    public final SparseArray h;
    public final pz f46355h0;
    public tz f46356i0;
    public org.telegram.ui.Components.qm0 f46357j0;
    public final v4.c0 f46358k0;
    public final qz f46359l0;
    public final h2.f m0;
    public final ArrayList f46360n;
    public final uz f46361n0;
    public final lz f46362o0;
    public b00 f46363p0;
    public boolean f46364q0;
    public final HashMap f46365r;
    public int f46366r0;
    public int f46367s;
    public boolean f46368s0;
    public int f46369w;
    public String f46370x;
    public String f46371y;

    public c00(org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getParentActivity());
        this.f46343a = new te.a(0, this, org.telegram.ui.Components.nr.h, 380L, false);
        this.f46352f = new ArrayList();
        this.h = new SparseArray();
        this.f46360n = new ArrayList();
        this.f46365r = new HashMap();
        this.f46367s = 3;
        this.T = new vz(0, 0L);
        this.f46349d0 = new ArrayList();
        this.f46351e0 = new ArrayList();
        this.f46354g0 = new m4(this, 5);
        this.f46355h0 = new pz(this);
        this.m0 = new h2.f((int[]) null);
        this.f46362o0 = new lz(this, 0);
        this.M = g2Var;
        Activity parentActivity = g2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, this, null);
        et etVar = new et(2, parentActivity, this);
        this.f46345b = etVar;
        etVar.setOnItemClickListener(new h(this, 12));
        etVar.setOnItemLongClickListener(new f(this, 15));
        v4.c0 c0Var = new v4.c0();
        this.f46358k0 = c0Var;
        etVar.setLayoutManager(c0Var);
        qz qzVar = new qz(0, parentActivity, this);
        this.f46359l0 = qzVar;
        addView(qzVar);
        addView(etVar);
        etVar.setSectionsType(2);
        etVar.setSkipDrawSection(true);
        etVar.setOnScrollListener(new rz(this));
        uz uzVar = new uz(parentActivity);
        this.f46361n0 = uzVar;
        String u10 = org.telegram.messenger.gd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(uzVar.f52652c, u10)) {
            uzVar.f52652c = u10;
            uzVar.f52650a.t(u10, true, true);
        }
        addView(uzVar, c8.ma.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new wz(this);
        this.V = new a00(this, getContext());
        this.W = new xz(this, getContext(), 1);
        this.f46344a0 = new zz(this, getContext());
        this.f46346b0 = new xz(this, getContext(), 4);
        this.f46348c0 = new xz(this, getContext(), 2);
        org.telegram.ui.Components.nv0 nv0Var = new org.telegram.ui.Components.nv0(parentActivity, qzVar, 1, null);
        this.f46347c = nv0Var;
        addView(nv0Var);
        etVar.setEmptyView(nv0Var);
        nv0Var.setVisibility(8);
        b();
    }

    public static void a(c00 c00Var, org.telegram.messenger.fj fjVar, View view, int i7) {
        if (!c00Var.f46363p0.V1()) {
            c00Var.f46363p0.n();
        }
        if (c00Var.f46363p0.V1()) {
            c00Var.f46363p0.Z0(fjVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.fj fjVar, boolean z10) {
        return d(fjVar, z10, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.fj fjVar, boolean z10, int i7, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.User user;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLRPC.User user2;
        Paint.FontMetricsInt fontMetricsInt;
        TLRPC.TL_forumTopic f10;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        Paint.FontMetricsInt fontMetricsInt4;
        TLRPC.TL_forumTopic f11;
        int i10;
        int i11;
        if (fjVar != null && (message = fjVar.f23993k) != null) {
            if (org.telegram.messenger.fj.b4(message)) {
                kg.u1 c10 = kg.v1.f(fjVar.K1).c(org.telegram.messenger.fj.I1(fjVar.f23993k));
                if (c10 != null) {
                    return c10.f18531b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (fjVar.r4()) {
                if (fjVar.f23954b1) {
                    return org.telegram.messenger.gd.N0(2131745017, null);
                }
                if (fjVar.U0) {
                    return org.telegram.messenger.gd.N0(2131745018, null);
                }
                return org.telegram.messenger.gd.N0(2131745019, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f46342t0;
            if (spannableStringBuilderArr[i7] == null) {
                spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
                if (i7 == 0) {
                    i10 = 2131230875;
                } else if (i7 == 1) {
                    i10 = 2131232231;
                } else if (i7 == 2) {
                    i10 = 2131232230;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f26941b.getDrawable(i10).mutate();
                if (i7 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(i11, mutate);
                if (i7 == 1 || i7 == 2) {
                    nqVar.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
                spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = fjVar.f23993k;
            if (message2.saved_peer_id != null) {
                if (fjVar.P1() >= 0) {
                    user2 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).c2(Long.valueOf(fjVar.P1()));
                    chat = null;
                } else if (fjVar.P1() < 0) {
                    chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(-fjVar.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).c2(Long.valueOf(fjVar.f23993k.from_id.user_id));
                } else {
                    user = null;
                }
                if (fjVar.f23993k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(fjVar.f23993k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (fjVar.f23993k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(fjVar.f23993k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (fjVar.f23993k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(fjVar.f23993k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (fjVar.f23993k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).O0(Long.valueOf(fjVar.f23993k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!org.telegram.messenger.v3.V(chat2) && !z10) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null && chat2 != null) {
                CharSequence charSequence2 = chat2.title;
                if (org.telegram.messenger.v3.c0(chat2) && (f11 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).f25797t7.f(chat2.f28431id, org.telegram.messenger.fj.b2(fjVar.K1, fjVar.f23993k, true, false))) != null) {
                    charSequence2 = qg.c.k(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String k10 = org.telegram.messenger.o10.k(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.j6.m(k10, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String q10 = org.telegram.messenger.o10.q(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.j6.m(q10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.v3.c0(chat) && (f10 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).f25797t7.f(chat.f28431id, org.telegram.messenger.fj.b2(fjVar.K1, fjVar.f23993k, true, false))) != null) {
                    charSequence3 = qg.c.k(f10, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.j6.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29398e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29417f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29508k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29363c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29754x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29735w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29716v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29697u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29677t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29621q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29601p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29490j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29436g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29472i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29344b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29323a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29789z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29801zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
    }

    public final void b() {
        int i7;
        float f10 = this.f46343a.f57696e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        uz uzVar = this.f46361n0;
        uzVar.setTranslationY(f11);
        uzVar.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        uzVar.setVisibility(i7);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25176l4) {
            et etVar = this.f46345b;
            int childCount = etVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (etVar.getChildAt(i11) instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) etVar.getChildAt(i11)).i0(0, true);
                }
                etVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c00.e(java.util.ArrayList, long):void");
    }

    public final void f(int i7, View view, org.telegram.messenger.fj fjVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (fjVar != null) {
            if (this.f46363p0.V1()) {
                this.f46363p0.Z0(fjVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.u2) {
                this.f46363p0.t0(fjVar);
            } else {
                int i11 = this.E.d;
                pz pzVar = this.f46355h0;
                ArrayList arrayList = this.f46352f;
                String str2 = null;
                org.telegram.ui.ActionBar.g2 g2Var = this.M;
                if (i11 == 0) {
                    PhotoViewer.p1().I2(null, g2Var, null);
                    PhotoViewer.p1().a2(arrayList, i7, 0L, 0L, 0L, pzVar);
                    this.S = PhotoViewer.p1().f43220c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.i7) {
                            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                            TLRPC.Document F0 = fjVar.F0();
                            if (i7Var.H) {
                                if (fjVar.x()) {
                                    PhotoViewer.p1().I2(null, g2Var, null);
                                    int indexOf = arrayList.indexOf(fjVar);
                                    if (indexOf < 0) {
                                        ArrayList i12 = org.telegram.messenger.f3.i(fjVar);
                                        PhotoViewer.p1().I2(null, g2Var, null);
                                        PhotoViewer.p1().a2(i12, 0, 0L, 0L, 0L, pzVar);
                                        this.S = PhotoViewer.p1().f43220c;
                                        return;
                                    }
                                    PhotoViewer.p1().I2(null, g2Var, null);
                                    PhotoViewer.p1().a2(arrayList, indexOf, 0L, 0L, 0L, pzVar);
                                    this.S = PhotoViewer.p1().f43220c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(fjVar, this.L, g2Var);
                            } else if (!i7Var.G) {
                                org.telegram.messenger.fj message = i7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24798t0).f23246a).W(F0, message, 0, 0);
                                i7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.f24798t0).f23246a).f(F0);
                                i7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = fjVar.f23993k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(fjVar) == null) {
                                        g2Var.createArticleViewer(false).L(fjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.iu.O0(this.M, fjVar, this.f46355h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.l7) view).F;
                                if (arrayList2.size() > 0) {
                                    str2 = ((CharSequence) arrayList2.get(0)).toString();
                                }
                                str = str2;
                            }
                            if (str != null) {
                                g(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.H3(str)) {
            org.telegram.ui.Components.c5.n0(this.M, str, true, true);
        } else {
            vf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29451h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29321a7));
        int i7 = org.telegram.ui.ActionBar.m6.i7;
        et etVar = this.f46345b;
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 8192, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.f29508k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 16384, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 8, new Class[]{org.telegram.ui.Cells.i7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29452h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 8192, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(etVar, 16384, new Class[]{org.telegram.ui.Cells.l7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        org.telegram.ui.Components.nv0 nv0Var = this.f46347c;
        arrayList.add(new org.telegram.ui.ActionBar.v6(nv0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(nv0Var.f37991e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29770y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z10, String str, boolean z11) {
        final String str2;
        int i7;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        Locale locale = Locale.ENGLISH;
        if (o0Var == null) {
            i7 = -1;
        } else {
            i7 = o0Var.d;
        }
        final String str3 = j3 + j10 + j11 + j12 + i7 + str2 + z10;
        String str4 = this.f46371y;
        if (str4 != null && str4.equals(str3)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.E = o0Var;
        this.F = j3;
        this.G = j10;
        this.I = j11;
        this.H = j12;
        this.J = str2;
        this.K = z10;
        mz mzVar = this.f46350e;
        if (mzVar != null) {
            org.telegram.messenger.g0.r(mzVar);
        }
        m4 m4Var = this.f46354g0;
        org.telegram.messenger.g0.r(m4Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f46351e0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f46349d0;
            org.telegram.ui.Components.nv0 nv0Var = this.f46347c;
            ArrayList arrayList4 = this.f46352f;
            long j13 = 0;
            if (!z13 && (o0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f46360n.clear();
                this.f46365r.clear();
                this.N = true;
                nv0Var.setVisibility(0);
                org.telegram.ui.Components.dk0 dk0Var = this.d;
                if (dk0Var != null) {
                    dk0Var.f();
                }
                this.Q++;
                et etVar = this.f46345b;
                if (etVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    etVar.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z13) {
                    return;
                }
            }
            this.N = true;
            org.telegram.ui.Components.dk0 dk0Var2 = this.d;
            if (dk0Var2 != null) {
                dk0Var2.f();
            }
            if (!z14) {
                m4Var.run();
                nv0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                tz tzVar = this.f46356i0;
                if (tzVar != null) {
                    ((ju) tzVar).j(false, null, null, false);
                }
            }
            final int i10 = this.Q + 1;
            this.Q = i10;
            final int i11 = org.telegram.messenger.j10.f24798t0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    String str5;
                    jg.o0 o0Var2;
                    int i13;
                    long j14;
                    boolean z15;
                    long j15;
                    int i14;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final c00 c00Var = c00.this;
                    ArrayList arrayList5 = c00Var.f46352f;
                    final long j16 = j3;
                    int i16 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    long j17 = j10;
                    String str6 = str2;
                    jg.o0 o0Var3 = o0Var;
                    int i17 = i11;
                    long j18 = j11;
                    long j19 = j12;
                    boolean z16 = z14;
                    ArrayList arrayList6 = null;
                    if (i16 != 0 && j17 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f28542q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.f17630e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i17).f23246a).l1(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z16 && str6.equals(c00Var.f46370x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.fj) i5.c.h(1, arrayList5)).e1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i12 = i17;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        j14 = j18;
                        tL_messages_searchGlobal = tL_messages_search;
                        z15 = z16;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z17 = z10;
                        if (!isEmpty) {
                            j14 = j18;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            z15 = z16;
                            ArrayList arrayList9 = new ArrayList();
                            org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i17);
                            j15 = j19;
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i14 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z17 ? 1 : 0);
                            i13 = z17 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i13 = z17 ? 1 : 0;
                            j14 = j18;
                            z15 = z16;
                            j15 = j19;
                            i14 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f28544q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.f17630e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.mp.u1(i12).j1(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(c00Var.f46370x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = fjVar.e1();
                            tL_messages_searchGlobal2.offset_rate = c00Var.f46369w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.mp.u1(i12).l1(org.telegram.messenger.fj.B1(fjVar.f23993k.peer_id));
                        } else {
                            i15 = 1;
                            tL_messages_searchGlobal2.offset_rate = 0;
                            tL_messages_searchGlobal2.offset_id = 0;
                            tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                        tL_messages_searchGlobal2.flags |= i15;
                        tL_messages_searchGlobal2.folder_id = i13;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                    c00Var.f46370x = str5;
                    c00Var.f46371y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    jg.q0.B1(c00Var.f46370x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z18 = z15;
                    final int i18 = i10;
                    final jg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.q10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                            final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            final ArrayList arrayList12 = new ArrayList();
                            final int i20 = i19;
                            final String str8 = str7;
                            if (tL_error == null) {
                                int size = messages_messages.messages.size();
                                for (int i21 = 0; i21 < size; i21++) {
                                    org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i20, messages_messages.messages.get(i21), false, true);
                                    fjVar2.K5(str8, true);
                                    arrayList12.add(fjVar2);
                                }
                            }
                            final c00 c00Var2 = c00.this;
                            final int i22 = i18;
                            final boolean z19 = z18;
                            final jg.o0 o0Var5 = o0Var4;
                            final long j21 = j16;
                            final long j22 = j20;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f46350e = r02;
            org.telegram.messenger.g0.h3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            qz qzVar = this.f46359l0;
            if (o0Var == null) {
                qzVar.setViewType(1);
                return;
            }
            int i12 = o0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
                    qzVar.setViewType(1);
                } else {
                    qzVar.setViewType(2);
                }
            } else if (i12 == 1) {
                qzVar.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    qzVar.setViewType(5);
                }
            } else {
                qzVar.setViewType(4);
            }
        }
    }

    public final void i(tz tzVar, boolean z10) {
        this.f46356i0 = tzVar;
        if (z10 && tzVar != null) {
            ArrayList arrayList = this.f46349d0;
            if (!arrayList.isEmpty()) {
                ((ju) tzVar).j(false, arrayList, this.f46351e0, this.f46353f0);
            }
        }
    }

    public final void j(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.f46368s0 = z10;
        setPadding(0, i7, 0, i10);
        et etVar = this.f46345b;
        if (z10) {
            etVar.q1(0, i7, 0, i10);
        } else {
            etVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) etVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.f46368s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.j10.f24798t0;
        this.f46366r0 = i7;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f46366r0).n(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.dk0 dk0Var;
        int i11 = this.f46367s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f46367s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f46367s = 6;
        } else {
            this.f46367s = 3;
        }
        if (i11 != this.f46367s && (dk0Var = this.d) == this.V) {
            this.f46368s0 = true;
            dk0Var.f();
            this.f46368s0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f46368s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13654e = new g0.e(15);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f13655f = 1.0f;
        eVar.h = 1.0f;
        uz uzVar = this.f46361n0;
        fh.g c10 = cVar.c(uzVar, eVar, false);
        uzVar.f52651b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        uzVar.f52651b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.qm0 qm0Var) {
        this.f46357j0 = qm0Var;
    }

    public void setUiCallback(b00 b00Var) {
        this.f46363p0 = b00Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f46364q0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            uz uzVar = this.f46361n0;
            if (uzVar != null) {
                uzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
