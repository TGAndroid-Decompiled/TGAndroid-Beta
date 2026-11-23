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
public final class b00 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs, te.b {
    public static final SpannableStringBuilder[] f45842t0 = new SpannableStringBuilder[3];
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
    public final uz T;
    public final vz U;
    public final zz V;
    public final wz W;
    public final te.a f45843a;
    public final yz f45844a0;
    public final dt f45845b;
    public final wz f45846b0;
    public final org.telegram.ui.Components.mv0 f45847c;
    public final wz f45848c0;
    public org.telegram.ui.Components.dk0 d;
    public final ArrayList f45849d0;
    public lz f45850e;
    public final ArrayList f45851e0;
    public final ArrayList f45852f;
    public boolean f45853f0;
    public final m4 f45854g0;
    public final SparseArray h;
    public final oz f45855h0;
    public sz f45856i0;
    public org.telegram.ui.Components.pm0 f45857j0;
    public final v4.c0 f45858k0;
    public final pz f45859l0;
    public final h2.f m0;
    public final ArrayList f45860n;
    public final tz f45861n0;
    public final kz f45862o0;
    public a00 f45863p0;
    public boolean f45864q0;
    public final HashMap f45865r;
    public int f45866r0;
    public int f45867s;
    public boolean f45868s0;
    public int f45869w;
    public String f45870x;
    public String f45871y;

    public b00(org.telegram.ui.ActionBar.g2 g2Var) {
        super(g2Var.getParentActivity());
        this.f45843a = new te.a(0, this, org.telegram.ui.Components.kr.h, 380L, false);
        this.f45852f = new ArrayList();
        this.h = new SparseArray();
        this.f45860n = new ArrayList();
        this.f45865r = new HashMap();
        this.f45867s = 3;
        this.T = new uz(0, 0L);
        this.f45849d0 = new ArrayList();
        this.f45851e0 = new ArrayList();
        this.f45854g0 = new m4(this, 5);
        this.f45855h0 = new oz(this);
        this.m0 = new h2.f((int[]) null);
        this.f45862o0 = new kz(this, 0);
        this.M = g2Var;
        Activity parentActivity = g2Var.getParentActivity();
        this.L = parentActivity;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this, null);
        dt dtVar = new dt(2, parentActivity, this);
        this.f45845b = dtVar;
        dtVar.setOnItemClickListener(new h(this, 12));
        dtVar.setOnItemLongClickListener(new f(this, 15));
        v4.c0 c0Var = new v4.c0();
        this.f45858k0 = c0Var;
        dtVar.setLayoutManager(c0Var);
        pz pzVar = new pz(0, parentActivity, this);
        this.f45859l0 = pzVar;
        addView(pzVar);
        addView(dtVar);
        dtVar.setSectionsType(2);
        dtVar.setSkipDrawSection(true);
        dtVar.setOnScrollListener(new qz(this));
        tz tzVar = new tz(parentActivity);
        this.f45861n0 = tzVar;
        String u10 = org.telegram.messenger.gd.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(tzVar.f52499c, u10)) {
            tzVar.f52499c = u10;
            tzVar.f52497a.t(u10, true, true);
        }
        addView(tzVar, c8.na.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new vz(this);
        this.V = new zz(this, getContext());
        this.W = new wz(this, getContext(), 1);
        this.f45844a0 = new yz(this, getContext());
        this.f45846b0 = new wz(this, getContext(), 4);
        this.f45848c0 = new wz(this, getContext(), 2);
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(parentActivity, pzVar, 1, null);
        this.f45847c = mv0Var;
        addView(mv0Var);
        dtVar.setEmptyView(mv0Var);
        mv0Var.setVisibility(8);
        b();
    }

    public static void a(b00 b00Var, org.telegram.messenger.fj fjVar, View view, int i7) {
        if (!b00Var.f45863p0.i0()) {
            b00Var.f45863p0.h();
        }
        if (b00Var.f45863p0.i0()) {
            b00Var.f45863p0.S(fjVar, view, i7);
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
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            if (org.telegram.messenger.fj.b4(message)) {
                kg.v1 c10 = kg.w1.f(fjVar.K1).c(org.telegram.messenger.fj.I1(fjVar.f24073k));
                if (c10 != null) {
                    return c10.f18602b;
                }
                return "";
            }
            CharSequence charSequence = null;
            if (fjVar.r4()) {
                if (fjVar.f24034b1) {
                    return org.telegram.messenger.gd.N0(2131745017, null);
                }
                if (fjVar.U0) {
                    return org.telegram.messenger.gd.N0(2131745018, null);
                }
                return org.telegram.messenger.gd.N0(2131745019, null);
            }
            SpannableStringBuilder[] spannableStringBuilderArr = f45842t0;
            if (spannableStringBuilderArr[i7] == null) {
                spannableStringBuilderArr[i7] = new SpannableStringBuilder(">");
                if (i7 == 0) {
                    i10 = 2131230875;
                } else if (i7 == 1) {
                    i10 = 2131232234;
                } else if (i7 == 2) {
                    i10 = 2131232233;
                } else {
                    return "";
                }
                Drawable mutate = org.telegram.messenger.t0.f27013b.getDrawable(i10).mutate();
                if (i7 == 0) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(i11, mutate);
                if (i7 == 1 || i7 == 2) {
                    kqVar.I = 0.85f;
                }
                SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i7];
                spannableStringBuilder.setSpan(kqVar, 0, spannableStringBuilder.length(), 0);
            }
            TLRPC.Message message2 = fjVar.f24073k;
            if (message2.saved_peer_id != null) {
                if (fjVar.P1() >= 0) {
                    user2 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(Long.valueOf(fjVar.P1()));
                    chat = null;
                } else if (fjVar.P1() < 0) {
                    chat = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(-fjVar.P1()));
                    user2 = null;
                    chat2 = null;
                } else {
                    user2 = null;
                    chat = null;
                }
                chat2 = chat;
            } else {
                if (message2.from_id.user_id != 0) {
                    user = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(Long.valueOf(fjVar.f24073k.from_id.user_id));
                } else {
                    user = null;
                }
                if (fjVar.f24073k.from_id.chat_id != 0) {
                    chat = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(fjVar.f24073k.peer_id.chat_id));
                } else {
                    chat = null;
                }
                if (chat == null) {
                    if (fjVar.f24073k.from_id.channel_id != 0) {
                        chat = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(fjVar.f24073k.peer_id.channel_id));
                    } else {
                        chat = null;
                    }
                }
                if (fjVar.f24073k.peer_id.channel_id != 0) {
                    chat2 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(fjVar.f24073k.peer_id.channel_id));
                } else {
                    chat2 = null;
                }
                if (chat2 == null) {
                    if (fjVar.f24073k.peer_id.chat_id != 0) {
                        chat2 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(fjVar.f24073k.peer_id.chat_id));
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
                if (org.telegram.messenger.v3.c0(chat2) && (f11 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25864t7.f(chat2.f28492id, org.telegram.messenger.fj.b2(fjVar.K1, fjVar.f24073k, true, false))) != null) {
                    charSequence2 = qg.c.k(f11, null, null);
                }
                if (textPaint == null) {
                    fontMetricsInt3 = null;
                } else {
                    fontMetricsInt3 = textPaint.getFontMetricsInt();
                }
                CharSequence m10 = org.telegram.messenger.j6.m(charSequence2, fontMetricsInt3, false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String k10 = org.telegram.messenger.n10.k(user2, true);
                if (textPaint == null) {
                    fontMetricsInt4 = null;
                } else {
                    fontMetricsInt4 = textPaint.getFontMetricsInt();
                }
                spannableStringBuilder2.append(org.telegram.messenger.j6.m(k10, fontMetricsInt4, false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i7]).append((char) 8202).append(m10);
                charSequence = spannableStringBuilder2;
            } else if (user2 != null) {
                String q10 = org.telegram.messenger.n10.q(user2);
                if (textPaint == null) {
                    fontMetricsInt2 = null;
                } else {
                    fontMetricsInt2 = textPaint.getFontMetricsInt();
                }
                charSequence = org.telegram.messenger.j6.m(q10, fontMetricsInt2, false, null, 0);
            } else if (chat != null) {
                CharSequence charSequence3 = chat.title;
                if (org.telegram.messenger.v3.c0(chat) && (f10 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25864t7.f(chat.f28492id, org.telegram.messenger.fj.b2(fjVar.K1, fjVar.f24073k, true, false))) != null) {
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
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            b();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29471e7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29581k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29436c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29454d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.C9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29865z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29846y9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29827x9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29808w9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29789v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29770u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29750t9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29563j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29619m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29545i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29417b9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29874zi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
    }

    public final void b() {
        int i7;
        float f10 = this.f45843a.f57779e;
        float f11 = (1.0f - f10) * (-org.telegram.messenger.g0.L(24.0f));
        tz tzVar = this.f45861n0;
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
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            dt dtVar = this.f45845b;
            int childCount = dtVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (dtVar.getChildAt(i11) instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) dtVar.getChildAt(i11)).k0(0, true);
                }
                dtVar.getChildAt(i11).invalidate();
            }
        }
    }

    public final void e(java.util.ArrayList r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b00.e(java.util.ArrayList, long):void");
    }

    public final void f(int i7, View view, org.telegram.messenger.fj fjVar, int i10) {
        TLRPC.WebPage webPage;
        String str;
        if (fjVar != null) {
            if (this.f45863p0.i0()) {
                this.f45863p0.S(fjVar, view, i10);
            } else if (view instanceof org.telegram.ui.Cells.u2) {
                this.f45863p0.B(fjVar);
            } else {
                int i11 = this.E.d;
                oz ozVar = this.f45855h0;
                ArrayList arrayList = this.f45852f;
                String str2 = null;
                org.telegram.ui.ActionBar.g2 g2Var = this.M;
                if (i11 == 0) {
                    PhotoViewer.p1().J2(null, g2Var, null);
                    PhotoViewer.p1().b2(arrayList, i7, 0L, 0L, 0L, ozVar);
                    this.S = PhotoViewer.p1().f43302c;
                } else if (i11 != 3 && i11 != 5) {
                    if (i11 == 1) {
                        if (view instanceof org.telegram.ui.Cells.h7) {
                            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                            TLRPC.Document F0 = fjVar.F0();
                            if (h7Var.H) {
                                if (fjVar.x()) {
                                    PhotoViewer.p1().J2(null, g2Var, null);
                                    int indexOf = arrayList.indexOf(fjVar);
                                    if (indexOf < 0) {
                                        ArrayList i12 = org.telegram.messenger.f3.i(fjVar);
                                        PhotoViewer.p1().J2(null, g2Var, null);
                                        PhotoViewer.p1().b2(i12, 0, 0L, 0L, 0L, ozVar);
                                        this.S = PhotoViewer.p1().f43302c;
                                        return;
                                    }
                                    PhotoViewer.p1().J2(null, g2Var, null);
                                    PhotoViewer.p1().b2(arrayList, indexOf, 0L, 0L, 0L, ozVar);
                                    this.S = PhotoViewer.p1().f43302c;
                                    return;
                                }
                                org.telegram.messenger.g0.s2(fjVar, this.L, g2Var);
                            } else if (!h7Var.G) {
                                org.telegram.messenger.fj message = h7Var.getMessage();
                                message.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.f24637t0).f23343a).W(F0, message, 0, 0);
                                h7Var.f(true);
                            } else {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.f24637t0).f23343a).f(F0);
                                h7Var.f(true);
                            }
                        }
                    } else if (i11 == 2) {
                        try {
                            TLRPC.MessageMedia messageMedia = fjVar.f24073k.media;
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
                                    org.telegram.ui.Components.gu.O0(this.M, fjVar, this.f45855h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                    return;
                                }
                                str = webPage.url;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                ArrayList arrayList2 = ((org.telegram.ui.Cells.k7) view).F;
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
        if (org.telegram.messenger.g0.H3(str)) {
            org.telegram.ui.Components.b5.n0(this.M, str, true, true);
        } else {
            vf.c.t(this.L, str);
        }
    }

    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394a7));
        int i7 = org.telegram.ui.ActionBar.n6.i7;
        dt dtVar = this.f45845b;
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 8192, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.f29581k7;
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 16384, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 8, new Class[]{org.telegram.ui.Cells.h7.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.qj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 8192, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 16384, new Class[]{org.telegram.ui.Cells.g7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 8192, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(dtVar, 16384, new Class[]{org.telegram.ui.Cells.k7.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        org.telegram.ui.Components.mv0 mv0Var = this.f45847c;
        arrayList.add(new org.telegram.ui.ActionBar.w6(mv0Var.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(mv0Var.f37553e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29843y6));
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
        String str4 = this.f45871y;
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
        lz lzVar = this.f45850e;
        if (lzVar != null) {
            org.telegram.messenger.g0.r(lzVar);
        }
        m4 m4Var = this.f45854g0;
        org.telegram.messenger.g0.r(m4Var);
        if (!z12 || !z11) {
            ArrayList arrayList2 = this.f45851e0;
            final boolean z14 = z12;
            ArrayList arrayList3 = this.f45849d0;
            org.telegram.ui.Components.mv0 mv0Var = this.f45847c;
            ArrayList arrayList4 = this.f45852f;
            long j13 = 0;
            if (!z13 && (o0Var != null || j10 != 0 || j3 != 0 || j11 != 0 || j12 != 0)) {
                if (!z11 || arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                } else {
                    return;
                }
            } else {
                arrayList4.clear();
                this.f45860n.clear();
                this.f45865r.clear();
                this.N = true;
                mv0Var.setVisibility(0);
                org.telegram.ui.Components.dk0 dk0Var = this.d;
                if (dk0Var != null) {
                    dk0Var.f();
                }
                this.Q++;
                dt dtVar = this.f45845b;
                if (dtVar.getPinnedHeader() != null) {
                    arrayList = arrayList4;
                    dtVar.getPinnedHeader().setAlpha(0.0f);
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
                mv0Var.e(true, !z11);
            }
            if (TextUtils.isEmpty(str2)) {
                arrayList2.clear();
                arrayList3.clear();
                sz szVar = this.f45856i0;
                if (szVar != null) {
                    ((iu) szVar).h(false, null, null, false);
                }
            }
            final int i10 = this.Q + 1;
            this.Q = i10;
            final int i11 = org.telegram.messenger.i10.f24637t0;
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
                    final b00 b00Var = b00.this;
                    ArrayList arrayList5 = b00Var.f45852f;
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
                        tL_messages_search.f28603q = str6;
                        tL_messages_search.limit = 20;
                        if (o0Var3 == null) {
                            messagesFilter2 = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter2 = o0Var3.f17701e;
                        }
                        tL_messages_search.filter = messagesFilter2;
                        tL_messages_search.peer = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i17).f23343a).l1(j16);
                        if (j18 > 0) {
                            tL_messages_search.min_date = (int) (j18 / 1000);
                        }
                        if (j19 > 0) {
                            tL_messages_search.max_date = (int) (j19 / 1000);
                        }
                        if (z16 && str6.equals(b00Var.f45870x) && !arrayList5.isEmpty()) {
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
                        tL_messages_searchGlobal2.f28605q = str5;
                        if (o0Var2 == null) {
                            messagesFilter = new TLRPC.TL_inputMessagesFilterEmpty();
                        } else {
                            messagesFilter = o0Var2.f17701e;
                        }
                        tL_messages_searchGlobal2.filter = messagesFilter;
                        tL_messages_searchGlobal2.community = org.telegram.messenger.mp.u1(i12).j1(j17);
                        if (j14 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j14 / 1000);
                        }
                        if (j15 > 0) {
                            tL_messages_searchGlobal2.max_date = (int) (j15 / 1000);
                        }
                        if (z15 && str5.equals(b00Var.f45870x) && !arrayList5.isEmpty()) {
                            i15 = 1;
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList5);
                            tL_messages_searchGlobal2.offset_id = fjVar.e1();
                            tL_messages_searchGlobal2.offset_rate = b00Var.f45869w;
                            tL_messages_searchGlobal2.offset_peer = org.telegram.messenger.mp.u1(i12).l1(org.telegram.messenger.fj.B1(fjVar.f24073k.peer_id));
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
                    b00Var.f45870x = str5;
                    b00Var.f45871y = str3;
                    final ArrayList arrayList10 = new ArrayList();
                    jg.q0.B1(b00Var.f45870x, arrayList10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                    final boolean z18 = z15;
                    final int i18 = i10;
                    final jg.o0 o0Var4 = o0Var2;
                    final String str7 = str5;
                    final int i19 = i12;
                    final ArrayList arrayList11 = arrayList6;
                    final long j20 = j14;
                    connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new org.telegram.messenger.p10() {
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
                            final b00 b00Var2 = b00.this;
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
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nz.run():void");
                                }
                            });
                        }
                    });
                }
            };
            this.f45850e = r02;
            org.telegram.messenger.g0.h3(r02, (!z14 || arrayList.isEmpty()) ? 350L : 350L);
            pz pzVar = this.f45859l0;
            if (o0Var == null) {
                pzVar.setViewType(1);
                return;
            }
            int i12 = o0Var.d;
            if (i12 == 0) {
                if (!TextUtils.isEmpty(this.J)) {
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

    public final void i(sz szVar, boolean z10) {
        this.f45856i0 = szVar;
        if (z10 && szVar != null) {
            ArrayList arrayList = this.f45849d0;
            if (!arrayList.isEmpty()) {
                ((iu) szVar).h(false, arrayList, this.f45851e0, this.f45853f0);
            }
        }
    }

    public final void j(int i7, int i10, boolean z10) {
        setClipToPadding(false);
        this.f45868s0 = z10;
        setPadding(0, i7, 0, i10);
        dt dtVar = this.f45845b;
        if (z10) {
            dtVar.q1(0, i7, 0, i10);
        } else {
            dtVar.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dtVar.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
        this.f45868s0 = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = org.telegram.messenger.i10.f24637t0;
        this.f45866r0 = i7;
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25247l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f45866r0).n(this, org.telegram.messenger.ks.f25247l4);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.dk0 dk0Var;
        int i11 = this.f45867s;
        if (org.telegram.messenger.g0.Q1()) {
            this.f45867s = 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            this.f45867s = 6;
        } else {
            this.f45867s = 3;
        }
        if (i11 != this.f45867s && (dk0Var = this.d) == this.V) {
            this.f45868s0 = true;
            dk0Var.f();
            this.f45868s0 = false;
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final void requestLayout() {
        if (this.f45868s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.f13620e = new g0.f(15);
        eVar.f(385875968, 402653183);
        eVar.e(385875968, 402653183);
        eVar.d(0, 0);
        eVar.f13621f = 1.0f;
        eVar.h = 1.0f;
        tz tzVar = this.f45861n0;
        fh.g c10 = cVar.c(tzVar, eVar, false);
        tzVar.f52498b = c10;
        c10.r(org.telegram.messenger.g0.L(11.5f));
        tzVar.f52498b.q(org.telegram.messenger.g0.L(5.0f));
    }

    public void setChatPreviewDelegate(org.telegram.ui.Components.pm0 pm0Var) {
        this.f45857j0 = pm0Var;
    }

    public void setUiCallback(a00 a00Var) {
        this.f45863p0 = a00Var;
    }

    public void setUseFromUserAsAvatar(boolean z10) {
        this.f45864q0 = z10;
    }

    @Override
    public final void updateColors() {
        try {
            tz tzVar = this.f45861n0;
            if (tzVar != null) {
                tzVar.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
