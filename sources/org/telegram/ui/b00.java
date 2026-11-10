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
public final class b00 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.ls, te.b {
    public static final SpannableStringBuilder[] f43859s0 = new SpannableStringBuilder[3];
    public jg.o0 D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public boolean J;
    public final Activity K;
    public final org.telegram.ui.ActionBar.f2 L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public int R;
    public final uz S;
    public final vz T;
    public final zz U;
    public final wz V;
    public final yz W;
    public final te.a f43860a;
    public final wz f43861a0;
    public final ct f43862b;
    public final wz f43863b0;
    public final org.telegram.ui.Components.bv0 f43864c;
    public final ArrayList f43865c0;
    public org.telegram.ui.Components.oj0 d;
    public final ArrayList f43866d0;
    public lz f43867e;
    public boolean f43868e0;
    public final ArrayList f43869f;
    public final m4 f43870f0;
    public final oz f43871g0;
    public final SparseArray h;
    public sz f43872h0;
    public org.telegram.ui.Components.bm0 f43873i0;
    public final v4.b0 f43874j0;
    public final pz f43875k0;
    public final h2.f f43876l0;
    public final tz m0;
    public final ArrayList f43877n;
    public final kz f43878n0;
    public a00 f43879o0;
    public boolean f43880p0;
    public int f43881q0;
    public final HashMap f43882r;
    public boolean f43883r0;
    public int f43884s;
    public int f43885w;
    public String f43886x;
    public String f43887y;

    public b00(org.telegram.ui.ActionBar.f2 f2Var) {
        super(f2Var.getParentActivity());
        this.f43860a = new te.a(0, this, org.telegram.ui.Components.wq.h, 380L, false);
        this.f43869f = new ArrayList();
        this.h = new SparseArray();
        this.f43877n = new ArrayList();
        this.f43882r = new HashMap();
        this.f43884s = 3;
        this.S = new uz(0, 0L);
        this.f43865c0 = new ArrayList();
        this.f43866d0 = new ArrayList();
        this.f43870f0 = new m4(this, 5);
        this.f43871g0 = new oz(this);
        this.f43876l0 = new h2.f((int[]) null);
        this.f43878n0 = new kz(this, 0);
        this.L = f2Var;
        Activity parentActivity = f2Var.getParentActivity();
        this.K = parentActivity;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, this, null);
        ct ctVar = new ct(2, parentActivity, this);
        this.f43862b = ctVar;
        ctVar.setOnItemClickListener(new h(this, 12));
        ctVar.setOnItemLongClickListener(new f(this, 15));
        v4.b0 b0Var = new v4.b0();
        this.f43874j0 = b0Var;
        ctVar.setLayoutManager(b0Var);
        pz pzVar = new pz(0, parentActivity, this);
        this.f43875k0 = pzVar;
        addView(pzVar);
        addView(ctVar);
        ctVar.setSectionsType(2);
        ctVar.setSkipDrawSection(true);
        ctVar.setOnScrollListener(new qz(this));
        tz tzVar = new tz(parentActivity);
        this.m0 = tzVar;
        String u10 = org.telegram.messenger.id.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(tzVar.f50359c, u10)) {
            tzVar.f50359c = u10;
            tzVar.f50357a.t(u10, true, true);
        }
        addView(tzVar, c8.ha.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.T = new vz(this);
        this.U = new zz(this, getContext());
        this.V = new wz(this, getContext(), 1);
        this.W = new yz(this, getContext());
        this.f43861a0 = new wz(this, getContext(), 4);
        this.f43863b0 = new wz(this, getContext(), 2);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(parentActivity, pzVar, 1, null);
        this.f43864c = bv0Var;
        addView(bv0Var);
        ctVar.setEmptyView(bv0Var);
        bv0Var.setVisibility(8);
        b();
    }

    public static void a(b00 b00Var, org.telegram.messenger.ij ijVar, View view, int i7) {
        if (!b00Var.f43879o0.i()) {
            b00Var.f43879o0.e();
        }
        if (b00Var.f43879o0.i()) {
            b00Var.f43879o0.h(ijVar, view, i7);
        }
    }

    public static CharSequence c(org.telegram.messenger.ij ijVar, boolean z9) {
        return d(ijVar, z9, 0, null);
    }

    public static CharSequence d(org.telegram.messenger.ij ijVar, boolean z9, int i7, TextPaint textPaint) {
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
        if (ijVar != null && (message = ijVar.f23266k) != null) {
            if (org.telegram.messenger.ij.b4(message)) {
                kg.s1 c10 = kg.t1.f(ijVar.I1).c(org.telegram.messenger.ij.I1(ijVar.f23266k));
                if (c10 != null) {
                    return c10.f17536b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (ijVar.r4()) {
                if (ijVar.Z0) {
                    return org.telegram.messenger.id.M0(2131745258, null);
                }
                if (ijVar.S0) {
                    return org.telegram.messenger.id.M0(2131745259, null);
                }
                return org.telegram.messenger.id.M0(2131745260, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f43859s0;
            if (spannableStringBuilderArr[i7] == null) {
                spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
                if (i7 == 0) {
                    i10 = 2131230875;
                } else if (i7 == 1) {
                    i10 = 2131232229;
                } else if (i7 == 2) {
                    i10 = 2131232228;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f25570b.getDrawable(i10).mutate();
                if (i7 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(i11, mutate);
                if (i7 == 1 || i7 == 2) {
                    wpVar.H = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = ijVar.f23266k;
            if (message2.saved_peer_id != null) {
                if (ijVar.P1() >= 0) {
                    user2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).a2(Long.valueOf(ijVar.P1()));
                    chat = null;
                } else if (ijVar.P1() < 0) {
                    chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(-ijVar.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).a2(Long.valueOf(ijVar.f23266k.from_id.user_id));
                } else {
                    user = null;
                }
                if (ijVar.f23266k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(ijVar.f23266k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (ijVar.f23266k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(ijVar.f23266k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (ijVar.f23266k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(ijVar.f23266k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (ijVar.f23266k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(ijVar.f23266k.peer_id.chat_id));
                    } else {
                        chat2 = null;
                    }
                }
                if (!org.telegram.messenger.t3.V(chat2) && !z9) {
                    chat2 = null;
                }
                user2 = user;
            }
            if (user2 != null && chat2 != null) {
                CharSequence charSequence2 = chat2.title;
                if (org.telegram.messenger.t3.c0(chat2) && (f11 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24881q7.f(chat2.f26960id, org.telegram.messenger.ij.b2(ijVar.I1, ijVar.f23266k, true, false))) != null) {
                    charSequence2 = qg.d.j(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.i6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String j3 = org.telegram.messenger.t10.j(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.i6.m(j3, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String p10 = org.telegram.messenger.t10.p(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.i6.m(p10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.t3.c0(chat) && (f10 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24881q7.f(chat.f26960id, org.telegram.messenger.ij.b2(ijVar.I1, ijVar.f23266k, true, false))) != null) {
                    charSequence3 = qg.d.j(f10, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt = null;
                } else {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.i6.m(charSequence3, fontMetricsInt, false, null, 0);
            }
            if (charSequence != null) {
                return charSequence;
            }
            return "";
        }
        return "";
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27910e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28020k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27875c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27893d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28285y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28266x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28247w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28228v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28209u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28189t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28133q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28113p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28002j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28058m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27948g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27984i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27856b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27836a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28274xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28255wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
    }

    public final void b() {
        int i7;
        float f10 = this.f43860a.f55498e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        tz tzVar = this.m0;
        tzVar.setTranslationY(f11);
        tzVar.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        tzVar.setVisibility(i7);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            ct ctVar = this.f43862b;
            int childCount = ctVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (ctVar.getChildAt(i11) instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) ctVar.getChildAt(i11)).j0(0, true);
                }
                ctVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b00.e(java.util.ArrayList, long):void");
    }

    public final void f(int i7, View view, org.telegram.messenger.ij ijVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (ijVar != null) {
            if (this.f43879o0.i()) {
                this.f43879o0.h(ijVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.t2) {
                this.f43879o0.g(ijVar);
            } else {
                int i11 = this.D.d;
                oz ozVar = this.f43871g0;
                ArrayList arrayList = this.f43869f;
                String str2 = null;
                org.telegram.ui.ActionBar.f2 f2Var = this.L;
                if (i11 == 0) {
                    PhotoViewer.p1().H2(null, f2Var, null);
                    PhotoViewer.p1().Z1(arrayList, i7, 0L, 0L, 0L, ozVar);
                    this.R = PhotoViewer.p1().f41363c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            TLRPC.Document F0 = ijVar.F0();
                            if (h7Var.G) {
                                if (ijVar.x()) {
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    int indexOf = arrayList.indexOf(ijVar);
                                    if (indexOf < 0) {
                                        ArrayList k10 = org.telegram.messenger.k5.k(ijVar);
                                        PhotoViewer.p1().H2(null, f2Var, null);
                                        PhotoViewer.p1().Z1(k10, 0, 0L, 0L, 0L, ozVar);
                                        this.R = PhotoViewer.p1().f41363c;
                                        return;
                                    }
                                    PhotoViewer.p1().H2(null, f2Var, null);
                                    PhotoViewer.p1().Z1(arrayList, indexOf, 0L, 0L, 0L, ozVar);
                                    this.R = PhotoViewer.p1().f41363c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(ijVar, this.K, f2Var);
                            } else if (!h7Var.F) {
                                org.telegram.messenger.ij message = h7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24474s0).f21770a).W(F0, message, 0, 0);
                                h7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.f24474s0).f21770a).f(F0);
                                h7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = ijVar.f23266k.media;
                            if (messageMedia != null) {
                                webPage = messageMedia.webpage;
                            } else {
                                webPage = null;
                            }
                            if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                if (webPage.cached_page != null) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(ijVar) == null) {
                                        f2Var.createArticleViewer(false).L(ijVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                                String str3 = webPage.embed_url;
                                if (str3 != null && str3.length() != 0) {
                                    org.telegram.ui.Components.vt.N0(this.L, ijVar, this.f43871g0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.k7) view).E;
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
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).a();
                }
            }
        }
    }

    public final void g(String str) {
        if (org.telegram.messenger.g0.J3(str)) {
            org.telegram.ui.Components.u4.n0(this.L, str, true, true);
        } else {
            vf.c.t(this.K, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27963h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27834a7));
        int i7 = org.telegram.ui.ActionBar.m6.i7;
        ct ctVar = this.f43862b;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        int i10 = org.telegram.ui.ActionBar.m6.f28020k7;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(ctVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        org.telegram.ui.Components.bv0 bv0Var = this.f43864c;
        arrayList.add(new org.telegram.ui.ActionBar.v6(bv0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(bv0Var.f32368e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28282y6));
        return arrayList;
    }

    public final void h(final long j3, final long j10, final long j11, final long j12, final jg.o0 o0Var, final boolean z9, String str, boolean z10) {
        final String str2;
        int i7;
        boolean z11;
        boolean z12;
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
        final String str3 = j3 + j10 + j11 + j12 + i7 + str2 + z9;
        String str4 = this.f43887y;
        if (str4 != null && str4.equals(str3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.D = o0Var;
        this.E = j3;
        this.F = j10;
        this.H = j11;
        this.G = j12;
        this.I = str2;
        this.J = z9;
        lz lzVar = this.f43867e;
        if (lzVar != null) {
            org.telegram.messenger.g0.r(lzVar);
        }
        m4 m4Var = this.f43870f0;
        org.telegram.messenger.g0.r(m4Var);
        if (!z11 || !z10) {
            ArrayList arrayList2 = this.f43866d0;
            final boolean z13 = z11;
            ArrayList arrayList3 = this.f43865c0;
            org.telegram.ui.Components.bv0 bv0Var = this.f43864c;
            ArrayList arrayList4 = this.f43869f;
            long j13 = 0;
            if (!z12 && (o0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z10 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f43877n.clear();
                this.f43882r.clear();
                this.M = true;
                bv0Var.setVisibility(0);
                org.telegram.ui.Components.oj0 oj0Var = this.d;
                if (oj0Var != null) {
                    oj0Var.f();
                }
                this.P++;
                ct ctVar = this.f43862b;
                if (ctVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    ctVar.getPinnedHeader().setAlpha(0.0f);
                } else {
                    arrayList = arrayList4;
                }
                arrayList3.clear();
                arrayList2.clear();
                if (!z12) {
                    return;
                }
            }
            this.M = true;
            org.telegram.ui.Components.oj0 oj0Var2 = this.d;
            if (oj0Var2 != null) {
                oj0Var2.f();
            }
            if (!z13) {
                m4Var.run();
                bv0Var.e(true, !z10);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                sz szVar = this.f43872h0;
                if (szVar != null) {
                    ((iu) szVar).j(false, null, null, false);
                }
            }
            final int i10 = this.P + 1;
            this.P = i10;
            final int i11 = org.telegram.messenger.p10.f24474s0;
            ?? r02 = new Runnable() {
                @Override
                public final void run() {
                    int i12;
                    String str5;
                    jg.o0 o0Var2;
                    int i13;
                    long j14;
                    boolean z14;
                    long j15;
                    int i14;
                    TLRPC.MessagesFilter messagesFilter;
                    int i15;
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                    TLRPC.MessagesFilter messagesFilter2;
                    final b00 b00Var = b00.this;
                    ArrayList arrayList5 = b00Var.f43869f;
                    final long j16 = j3;
                    int i16 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    long j17 = j10;
                    String str6 = str2;
                    jg.o0 o0Var3 = o0Var;
                    int i17 = i11;
                    long j18 = j11;
                    long j19 = j12;
                    boolean z15 = z13;
                    ArrayList arrayList6 = null;
                    if (i16 != 0 && j17 == 0) {
                        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                        tL_messages_search.f27071q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.f16873e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i17).f21770a).j1(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z15 && str6.equals(b00Var.f43886x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList5)).e1();
                        } else {
                            tL_messages_search.offset_id = 0;
                        }
                        i12 = i17;
                        str5 = str6;
                        o0Var2 = o0Var3;
                        j14 = j18;
                        tL_messages_searchGlobal = tL_messages_search;
                        z14 = z15;
                    } else {
                        boolean isEmpty = TextUtils.isEmpty(str6);
                        boolean z16 = z9;
                        if (!isEmpty) {
                            j14 = j18;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            z14 = z15;
                            ArrayList arrayList9 = new ArrayList();
                            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i17);
                            j15 = j19;
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i14 = 20;
                            a02.M0(0, str5, arrayList7, arrayList8, arrayList9, null, z16 ? 1 : 0);
                            i13 = z16 ? 1 : 0;
                            arrayList6 = arrayList7;
                        } else {
                            i12 = i17;
                            str5 = str6;
                            o0Var2 = o0Var3;
                            i13 = z16 ? 1 : 0;
                            j14 = j18;
                            z14 = z15;
                            j15 = j19;
                            i14 = 20;
                        }
                        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                        tL_messages_searchGlobal2.limit = i14;
                        tL_messages_searchGlobal2.f27073q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.f16873e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.qp.s1(i12).h1(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z14 && str5.equals(b00Var.f43886x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = ijVar.e1();
                            tL_messages_searchGlobal2.offset_rate = b00Var.f43885w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.qp.s1(i12).j1(org.telegram.messenger.ij.B1(ijVar.f23266k.peer_id));
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
                    b00Var.f43886x = str5;
                    b00Var.f43887y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    jg.q0.B1(b00Var.f43886x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z17 = z14;
                    final int i18 = i10;
                    final jg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.v10() {
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
                                    org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i20, messages_messages.messages.get(i21), false, true);
                                    ijVar2.K5(str8, true);
                                    arrayList12.add(ijVar2);
                                }
                            }
                            final b00 b00Var2 = b00.this;
                            final int i22 = i18;
                            final boolean z18 = z17;
                            final jg.o0 o0Var5 = o0Var4;
                            final long j21 = j16;
                            final long j22 = j20;
                            final ArrayList arrayList13 = arrayList11;
                            final ArrayList arrayList14 = arrayList10;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f43867e = r02;
            org.telegram.messenger.g0.i3(r02, (!z13 || arrayList.isEmpty()) ? 350L : 350L);
            pz pzVar = this.f43875k0;
            if (o0Var == null) {
                pzVar.setViewType(1);
                return;
            }
            int i12 = o0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.I)) {
                    pzVar.setViewType(1);
                } else {
                    pzVar.setViewType(2);
                }
            } else if (i12 == 1) {
                pzVar.setViewType(3);
            } else if (i12 != 3 && i12 != 5) {
                if (i12 == 2) {
                    pzVar.setViewType(5);
                }
            } else {
                pzVar.setViewType(4);
            }
        }
    }

    public final void i(sz szVar, boolean z9) {
        this.f43872h0 = szVar;
        if (z9 && szVar != null) {
            ArrayList arrayList = this.f43865c0;
            if (!arrayList.isEmpty()) {
                ((iu) szVar).j(false, arrayList, this.f43866d0, this.f43868e0);
            }
        }
    }

    public final void j(int i7, int i10, boolean z9) {
        setClipToPadding(false);
        this.f43883r0 = z9;
        setPadding(0, i7, 0, i10);
        ct ctVar = this.f43862b;
        if (z9) {
            ctVar.q1(0, i7, 0, i10);
        } else {
            ctVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ctVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.f43883r0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.p10.f24474s0;
        this.f43881q0 = i7;
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f43881q0).n(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.oj0 oj0Var;
        int i11 = this.f43884s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f43884s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f43884s = 6;
        } else {
            this.f43884s = 3;
        }
        if (i11 != this.f43884s && (oj0Var = this.d) == this.U) {
            this.f43883r0 = true;
            oj0Var.f();
            this.f43883r0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f43883r0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13973e = new g2.c(12);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f13974f = 1.0f;
        eVar.h = 1.0f;
        tz tzVar = this.m0;
        fh.g c10 = cVar.c(tzVar, eVar, false);
        tzVar.f50358b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        tzVar.f50358b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.bm0 bm0Var) {
        this.f43873i0 = bm0Var;
    }

    public void setUiCallback(a00 a00Var) {
        this.f43879o0 = a00Var;
    }

    public void setUseFromUserAsAvatar(boolean z9) {
        this.f43880p0 = z9;
    }

    @Override
    public final void updateColors() {
        try {
            tz tzVar = this.m0;
            if (tzVar != null) {
                tzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
