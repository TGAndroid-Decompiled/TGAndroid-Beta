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
public final class of0 extends FrameLayout {
    public final ai.k2 E;
    public final q9 F;
    public final TextView G;
    public final TextView H;
    public final hi.d I;
    public final TextView J;
    public boolean K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public nq S;
    public nq T;
    public org.telegram.messenger.t U;
    public final nq[] V;
    public final lf0 W;
    public final org.telegram.ui.cx f38144a;
    public final int f38145b;
    public final h51 f38146c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f38147e;
    public int f38148f;
    public boolean h;
    public final ArrayList f38149n;
    public int f38150r;
    public boolean f38151s;
    public boolean f38152w;
    public String f38153x;
    public final FrameLayout f38154y;

    public of0(Context context, org.telegram.ui.cx cxVar) {
        super(context);
        this.f38147e = new ArrayList();
        this.f38149n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new nq[1];
        this.W = new lf0(this, 1);
        this.f38144a = cxVar;
        int currentAccount = cxVar.getCurrentAccount();
        this.f38145b = currentAccount;
        h51 h51Var = new h51(context, currentAccount, 0, false, new d(this, 19), new ky(this, 11), null, null);
        this.f38146c = h51Var;
        h51Var.j(new bi.j6(5, this, cxVar));
        addView(h51Var, c8.na.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38154y = frameLayout;
        ai.k2 k2Var = new ai.k2(context, 8);
        this.E = k2Var;
        k2Var.setOrientation(1);
        frameLayout.addView(k2Var, c8.na.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.F = q9Var;
        q9Var.setVisibility(8);
        k2Var.addView(q9Var, c8.na.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        k2Var.addView(textView, c8.na.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        k2Var.addView(textView2, c8.na.t(-2, -2, 1, 0, 9, 0, 0));
        hi.d g10 = org.telegram.messenger.o10.g(24, context, null, true);
        this.I = g10;
        k2Var.addView(g10, c8.na.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        k2Var.addView(textView3, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.na.e(-1, -1, 119));
        h51Var.setHideIfEmpty(false);
        h51Var.setEmptyView(frameLayout);
        h51Var.X1 = true;
        h51Var.Y1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f38152w) {
            boolean isEmpty = TextUtils.isEmpty(this.f38153x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f38151s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f38152w = true;
                    int i7 = this.f38145b;
                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f38153x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f38147e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f38148f;
                            tL_channels_searchPosts.offset_id = gjVar.L1();
                            tL_channels_searchPosts.offset_peer = u12.o1(gjVar.f24177k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f38149n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) i5.c.h(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f38150r;
                            tL_channels_searchPosts.offset_id = gjVar2.L1();
                            tL_channels_searchPosts.offset_peer = u12.o1(gjVar2.f24177k.peer_id);
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
                    this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new g7(this, u12, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                    d();
                    this.f38146c.f35742g3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i7 = this.P;
        int i10 = this.f38145b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.P, true);
            this.P = -1;
        }
        if (!this.N) {
            if (this.R && (!this.f38149n.isEmpty() || !this.f38151s)) {
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
        this.P = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new f2(this, 8));
    }

    public final void c() {
        this.f38154y.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.f29739y6;
        this.J.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.H.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        h51 h51Var = this.f38146c;
        h51Var.setAdapter(null);
        h51Var.setAdapter(h51Var.f35742g3);
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
        lf0 lf0Var = this.W;
        org.telegram.messenger.g0.r(lf0Var);
        int i7 = this.f38145b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.k10.i(i7).q();
        TextView textView = this.H;
        TextView textView2 = this.G;
        q9 q9Var = this.F;
        TextView textView3 = this.J;
        hi.d dVar = this.I;
        if (!q10) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.hd.N0(2131745518, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.hd.N0(2131745532, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final of0 f37466b;

                {
                    this.f37466b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37466b.f38144a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            of0 of0Var = this.f37466b;
                            of0Var.I.setLoading(true);
                            of0Var.a(true);
                            return;
                        default:
                            of0 of0Var2 = this.f37466b;
                            of0Var2.I.setLoading(true);
                            of0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.hd.N0(2131745519, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f38153x);
        ArrayList arrayList = this.f38149n;
        if (!isEmpty && arrayList.isEmpty() && this.f38151s) {
            if (q9Var.getImageReceiver().T == null) {
                q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            q9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.hd.N0(2131745521, null));
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131745520, TextUtils.ellipsize(this.f38153x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f38153x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.N0(2131745525, null));
            textView.setText(org.telegram.messenger.hd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i10 = this.d.wait_till - currentTime;
            int i11 = i10 / 3600;
            int i12 = i10 - (i11 * 3600);
            int i13 = i12 / 60;
            int i14 = i12 - (i13 * 60);
            dVar.setVisibility(0);
            dVar.i(di.pb.U0(org.telegram.messenger.hd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
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
            dVar.g(org.telegram.messenger.hd.a0(null, null, 2131745531, sb2.toString()), true);
            dVar.f14302e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final of0 f37466b;

                {
                    this.f37466b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37466b.f38144a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            of0 of0Var = this.f37466b;
                            of0Var.I.setLoading(true);
                            of0Var.a(true);
                            return;
                        default:
                            of0 of0Var2 = this.f37466b;
                            of0Var2.I.setLoading(true);
                            of0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.g0.h3(lf0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f38152w && !TextUtils.isEmpty(this.f38153x)) {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.hd.N0(2131745518, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                nq nqVar = new nq(2131232743, 0);
                this.S = nqVar;
                nqVar.I = 0.79f;
                nqVar.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new org.telegram.messenger.t(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false), org.telegram.ui.ActionBar.m6.r1(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ji, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131745536, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f38153x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.T == null) {
                nq nqVar2 = new nq(2131232243, 0);
                this.T = nqVar2;
                nqVar2.I = 1.05f;
                nqVar2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(this.T, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.i(spannableStringBuilder, true, true);
            dVar.d.r(false, false);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final of0 f37466b;

                {
                    this.f37466b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f37466b.f38144a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            of0 of0Var = this.f37466b;
                            of0Var.I.setLoading(true);
                            of0Var.a(true);
                            return;
                        default:
                            of0 of0Var2 = this.f37466b;
                            of0Var2.I.setLoading(true);
                            of0Var2.a(false);
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
                textView3.setText(org.telegram.messenger.hd.H(',', "SearchPostsFreeSearches", i15));
                return;
            }
            textView3.setVisibility(8);
        } else {
            q9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.N0(2131745517, null));
            textView.setText(org.telegram.messenger.hd.N0(2131745518, null));
            dVar.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i16 = searchPostsFlood3.remains;
                if (i16 < 1) {
                    i16 = searchPostsFlood3.total_daily;
                }
                textView3.setText(org.telegram.messenger.hd.H(',', "SearchPostsFreeSearches", i16));
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
            org.telegram.messenger.np.g1().edit().putInt("searchpostsnew", org.telegram.messenger.np.g1().getInt("searchpostsnew", 0) + 1).apply();
            di.y8.y(this.f38145b, false).p();
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
        this.E.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28971w).start();
    }
}
