package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class nf0 extends FrameLayout {
    public final ai.l2 E;
    public final p9 F;
    public final TextView G;
    public final TextView H;
    public final hi.e I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public kq S;
    public kq T;
    public org.telegram.messenger.t U;
    public final kq[] V;
    public final kf0 W;
    public final org.telegram.ui.bx f37771a;
    public final int f37772b;
    public final g51 f37773c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f37774e;
    public int f37775f;
    public boolean h;
    public final ArrayList f37776n;
    public int f37777r;
    public boolean f37778s;
    public boolean f37779w;
    public String f37780x;
    public final FrameLayout f37781y;

    public nf0(Context context, org.telegram.ui.bx bxVar) {
        super(context);
        this.f37774e = new ArrayList();
        this.f37776n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new kq[1];
        this.W = new kf0(this, 1);
        this.f37771a = bxVar;
        int currentAccount = bxVar.getCurrentAccount();
        this.f37772b = currentAccount;
        g51 g51Var = new g51(context, currentAccount, 0, false, new d(this, 19), new hy(this, 11), null, null);
        this.f37773c = g51Var;
        g51Var.j(new bi.j6(5, this, bxVar));
        addView(g51Var, c8.na.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37781y = frameLayout;
        ai.l2 l2Var = new ai.l2(context, 8);
        this.E = l2Var;
        l2Var.setOrientation(1);
        frameLayout.addView(l2Var, c8.na.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        p9 p9Var = new p9(context);
        this.F = p9Var;
        p9Var.setVisibility(8);
        l2Var.addView(p9Var, c8.na.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        l2Var.addView(textView, c8.na.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        l2Var.addView(textView2, c8.na.t(-2, -2, 1, 0, 9, 0, 0));
        hi.e g10 = org.telegram.messenger.m10.g(24, context, null, true);
        this.I = g10;
        l2Var.addView(g10, c8.na.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        l2Var.addView(textView3, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.na.e(-1, -1, 119));
        g51Var.setHideIfEmpty(false);
        g51Var.setEmptyView(frameLayout);
        g51Var.X1 = true;
        g51Var.Y1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f37779w) {
            boolean isEmpty = TextUtils.isEmpty(this.f37780x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f37778s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f37779w = true;
                    int i7 = this.f37772b;
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f37780x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f37774e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f37775f;
                            tL_channels_searchPosts.offset_id = fjVar.L1();
                            tL_channels_searchPosts.offset_peer = u12.o1(fjVar.f24073k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f37776n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) i5.c.h(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f37777r;
                            tL_channels_searchPosts.offset_id = fjVar2.L1();
                            tL_channels_searchPosts.offset_peer = u12.o1(fjVar2.f24073k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    }
                    if (z10 && (searchPostsFlood = this.d) != null) {
                        tL_channels_searchPosts.flags |= 4;
                        j3 = searchPostsFlood.stars_amount;
                        tL_channels_searchPosts.allow_paid_stars = j3;
                    } else {
                        j3 = 0;
                    }
                    this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new f7(this, u12, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                    d();
                    this.f37773c.f35323g3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i7 = this.P;
        int i10 = this.f37772b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.P, true);
            this.P = -1;
        }
        if (!this.N) {
            if (this.R && (!this.f37776n.isEmpty() || !this.f37778s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.O = z10;
        }
        this.N = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.P = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new e2(this, 8));
    }

    public final void c() {
        this.f37781y.setBackgroundColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        this.J.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.H.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        g51 g51Var = this.f37773c;
        g51Var.setAdapter(null);
        g51Var.setAdapter(g51Var.f35323g3);
        if (this.U != null) {
            this.U = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        kf0 kf0Var = this.W;
        org.telegram.messenger.g0.r(kf0Var);
        int i7 = this.f37772b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.i10.i(i7).q();
        TextView textView = this.H;
        TextView textView2 = this.G;
        p9 p9Var = this.F;
        TextView textView3 = this.J;
        hi.e eVar = this.I;
        if (!q10) {
            p9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.gd.N0(2131745518, null));
            eVar.setVisibility(0);
            eVar.i(org.telegram.messenger.gd.N0(2131745532, null), true, true);
            eVar.g(null, true);
            eVar.setOnClickListener(new View.OnClickListener(this) {
                public final nf0 f37122b;

                {
                    this.f37122b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37122b.f37771a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            nf0 nf0Var = this.f37122b;
                            nf0Var.I.setLoading(true);
                            nf0Var.a(true);
                            return;
                        default:
                            nf0 nf0Var2 = this.f37122b;
                            nf0Var2.I.setLoading(true);
                            nf0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.gd.N0(2131745519, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f37780x);
        ArrayList arrayList = this.f37776n;
        if (!isEmpty && arrayList.isEmpty() && this.f37778s) {
            if (p9Var.getImageReceiver().T == null) {
                p9Var.setImageDrawable(new nh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            p9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.gd.N0(2131745521, null));
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131745520, TextUtils.ellipsize(this.f37780x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            eVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f37780x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            p9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.N0(2131745525, null));
            textView.setText(org.telegram.messenger.gd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i10 = this.d.wait_till - currentTime;
            int i11 = i10 / 3600;
            int i12 = i10 - (i11 * 3600);
            int i13 = i12 / 60;
            int i14 = i12 - (i13 * 60);
            eVar.setVisibility(0);
            eVar.i(di.pb.U0(org.telegram.messenger.gd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
            StringBuilder sb2 = new StringBuilder();
            if (i11 > 0) {
                str = com.google.android.gms.internal.vision.e2.i(i11, ":");
            } else {
                str = "";
            }
            sb2.append(str);
            if (i13 < 10) {
                valueOf = i5.c.i(i13, "0");
            } else {
                valueOf = Integer.valueOf(i13);
            }
            sb2.append(valueOf);
            sb2.append(":");
            if (i14 < 10) {
                valueOf2 = i5.c.i(i14, "0");
            } else {
                valueOf2 = Integer.valueOf(i14);
            }
            sb2.append(valueOf2);
            eVar.g(org.telegram.messenger.gd.a0(null, null, 2131745531, sb2.toString()), true);
            eVar.f14339e.r(false, true);
            eVar.setOnClickListener(new View.OnClickListener(this) {
                public final nf0 f37122b;

                {
                    this.f37122b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37122b.f37771a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            nf0 nf0Var = this.f37122b;
                            nf0Var.I.setLoading(true);
                            nf0Var.a(true);
                            return;
                        default:
                            nf0 nf0Var2 = this.f37122b;
                            nf0Var2.I.setLoading(true);
                            nf0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.g0.h3(kf0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f37779w && !TextUtils.isEmpty(this.f37780x)) {
            p9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.gd.N0(2131745518, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                kq kqVar = new kq(2131232746, 0);
                this.S = kqVar;
                kqVar.I = 0.79f;
                kqVar.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new org.telegram.messenger.t(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.r1(0.75f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131745536, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f37780x, eVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.T == null) {
                kq kqVar2 = new kq(2131232246, 0);
                this.T = kqVar2;
                kqVar2.I = 1.05f;
                kqVar2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(this.T, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            eVar.setVisibility(0);
            eVar.i(spannableStringBuilder, true, true);
            eVar.d.r(false, false);
            eVar.g(null, true);
            eVar.setOnClickListener(new View.OnClickListener(this) {
                public final nf0 f37122b;

                {
                    this.f37122b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37122b.f37771a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            nf0 nf0Var = this.f37122b;
                            nf0Var.I.setLoading(true);
                            nf0Var.a(true);
                            return;
                        default:
                            nf0 nf0Var2 = this.f37122b;
                            nf0Var2.I.setLoading(true);
                            nf0Var2.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i15 = searchPostsFlood2.remains;
                if (i15 < 1) {
                    i15 = searchPostsFlood2.total_daily;
                }
                textView3.setText(org.telegram.messenger.gd.H(',', "SearchPostsFreeSearches", i15));
                return;
            }
            textView3.setVisibility(8);
        } else {
            p9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.gd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.gd.N0(2131745518, null));
            eVar.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i16 = searchPostsFlood3.remains;
                if (i16 < 1) {
                    i16 = searchPostsFlood3.total_daily;
                }
                textView3.setText(org.telegram.messenger.gd.H(',', "SearchPostsFreeSearches", i16));
                return;
            }
            textView3.setVisibility(8);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (!this.Q) {
            this.Q = true;
            org.telegram.messenger.mp.g1().edit().putInt("searchpostsnew", org.telegram.messenger.mp.g1().getInt("searchpostsnew", 0) + 1).apply();
            di.y8.y(this.f37772b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i7) {
        this.E.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f29066w).start();
    }
}
