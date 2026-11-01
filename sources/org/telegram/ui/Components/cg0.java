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
public final class cg0 extends FrameLayout {
    public final jg.z2 D;
    public final g9 E;
    public final TextView F;
    public final TextView G;
    public final vh.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public dq R;
    public dq S;
    public org.telegram.messenger.u T;
    public final dq[] U;
    public final zf0 V;
    public final org.telegram.ui.zx f25106a;
    public final int f25107b;
    public final v51 f25108c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f25109f;
    public boolean h;
    public final ArrayList f25110n;
    public int f25111r;
    public boolean f25112s;
    public boolean f25113w;
    public String f25114x;
    public final FrameLayout f25115y;

    public cg0(Context context, org.telegram.ui.zx zxVar) {
        super(context);
        this.e = new ArrayList();
        this.f25110n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new dq[1];
        this.V = new zf0(this, 1);
        this.f25106a = zxVar;
        int currentAccount = zxVar.getCurrentAccount();
        this.f25107b = currentAccount;
        v51 v51Var = new v51(context, currentAccount, 0, false, new d(this, 18), new px(this, 12), null, null);
        this.f25108c = v51Var;
        v51Var.j(new bi.t3(5, this, zxVar));
        addView(v51Var, w7.b6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25115y = frameLayout;
        jg.z2 z2Var = new jg.z2(context, 8);
        this.D = z2Var;
        z2Var.setOrientation(1);
        frameLayout.addView(z2Var, w7.b6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.E = g9Var;
        g9Var.setVisibility(8);
        z2Var.addView(g9Var, w7.b6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        z2Var.addView(textView, w7.b6.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 0, 9, 0, 0));
        vh.d i10 = org.telegram.messenger.a30.i(24, context, null, true);
        this.H = i10;
        z2Var.addView(i10, w7.b6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        z2Var.addView(textView3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, w7.b6.e(-1, -1, 119));
        v51Var.setHideIfEmpty(false);
        v51Var.setEmptyView(frameLayout);
        v51Var.W1 = true;
        v51Var.X1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f25113w) {
            boolean isEmpty = TextUtils.isEmpty(this.f25114x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f25112s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f25113w = true;
                    int i10 = this.f25107b;
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f25114x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) i0.a.g(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f25109f;
                            tL_channels_searchPosts.offset_id = kjVar.M1();
                            tL_channels_searchPosts.offset_peer = r12.l1(kjVar.f16690k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f25110n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) i0.a.g(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f25111r;
                            tL_channels_searchPosts.offset_id = kjVar2.M1();
                            tL_channels_searchPosts.offset_peer = r12.l1(kjVar2.f16690k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    }
                    if (z10 && (searchPostsFlood = this.d) != null) {
                        tL_channels_searchPosts.flags |= 4;
                        j10 = searchPostsFlood.stars_amount;
                        tL_channels_searchPosts.allow_paid_stars = j10;
                    } else {
                        j10 = 0;
                    }
                    this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new x6(this, r12, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                    d();
                    this.f25108c.f31183f3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i10 = this.O;
        int i11 = this.f25107b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f25110n.isEmpty() || !this.f25112s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
        }
        this.M = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 8));
    }

    public final void c() {
        this.f25115y.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        v51 v51Var = this.f25108c;
        v51Var.setAdapter(null);
        v51Var.setAdapter(v51Var.f31183f3);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        zf0 zf0Var = this.V;
        org.telegram.messenger.i0.r(zf0Var);
        int i10 = this.f25107b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean q6 = org.telegram.messenger.e20.i(i10).q();
        TextView textView = this.G;
        TextView textView2 = this.F;
        g9 g9Var = this.E;
        TextView textView3 = this.I;
        vh.d dVar = this.H;
        if (!q6) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.dd.L0(2131745730, null));
            textView.setText(org.telegram.messenger.dd.L0(2131745731, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.dd.L0(2131745745, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cg0 f24396b;

                {
                    this.f24396b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f24396b.f25106a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cg0 cg0Var = this.f24396b;
                            cg0Var.H.setLoading(true);
                            cg0Var.a(true);
                            return;
                        default:
                            cg0 cg0Var2 = this.f24396b;
                            cg0Var2.H.setLoading(true);
                            cg0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.dd.L0(2131745732, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f25114x);
        ArrayList arrayList = this.f25110n;
        if (!isEmpty && arrayList.isEmpty() && this.f25112s) {
            if (g9Var.getImageReceiver().S == null) {
                g9Var.setImageDrawable(new ci0(2131624317, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
            }
            g9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.dd.L0(2131745734, null));
            textView.setText(org.telegram.messenger.dd.a0(null, null, 2131745733, TextUtils.ellipsize(this.f25114x, textView.getPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f25114x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.dd.L0(2131745738, null));
            textView.setText(org.telegram.messenger.dd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i11 = this.d.wait_till - currentTime;
            int i12 = i11 / 3600;
            int i13 = i11 - (i12 * 3600);
            int i14 = i13 / 60;
            int i15 = i13 - (i14 * 60);
            dVar.setVisibility(0);
            dVar.i(rh.h8.U0(org.telegram.messenger.dd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
            StringBuilder sb2 = new StringBuilder();
            if (i12 > 0) {
                str = a1.g.k(i12, ":");
            } else {
                str = "";
            }
            sb2.append(str);
            if (i14 < 10) {
                valueOf = i0.a.i(i14, "0");
            } else {
                valueOf = Integer.valueOf(i14);
            }
            sb2.append(valueOf);
            sb2.append(":");
            if (i15 < 10) {
                valueOf2 = i0.a.i(i15, "0");
            } else {
                valueOf2 = Integer.valueOf(i15);
            }
            sb2.append(valueOf2);
            dVar.g(org.telegram.messenger.dd.a0(null, null, 2131745744, sb2.toString()), true);
            dVar.e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cg0 f24396b;

                {
                    this.f24396b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f24396b.f25106a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cg0 cg0Var = this.f24396b;
                            cg0Var.H.setLoading(true);
                            cg0Var.a(true);
                            return;
                        default:
                            cg0 cg0Var2 = this.f24396b;
                            cg0Var2.H.setLoading(true);
                            cg0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.i0.h3(zf0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f25113w && !TextUtils.isEmpty(this.f25114x)) {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.dd.L0(2131745730, null));
            textView.setText(org.telegram.messenger.dd.L0(2131745731, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                dq dqVar = new dq(2131232738, 0);
                this.R = dqVar;
                dqVar.H = 0.79f;
                dqVar.I = 0.79f;
            }
            if (this.T == null) {
                this.T = new org.telegram.messenger.u(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false), org.telegram.ui.ActionBar.t6.r1(0.75f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131745749, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f25114x, dVar.getTextPaint(), org.telegram.messenger.i0.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.S == null) {
                dq dqVar2 = new dq(2131232240, 0);
                this.S = dqVar2;
                dqVar2.H = 1.05f;
                dqVar2.I = 1.05f;
            }
            spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.i(spannableStringBuilder, true, true);
            dVar.d.r(false, false);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cg0 f24396b;

                {
                    this.f24396b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f24396b.f25106a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cg0 cg0Var = this.f24396b;
                            cg0Var.H.setLoading(true);
                            cg0Var.a(true);
                            return;
                        default:
                            cg0 cg0Var2 = this.f24396b;
                            cg0Var2.H.setLoading(true);
                            cg0Var2.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i16 = searchPostsFlood2.remains;
                if (i16 < 1) {
                    i16 = searchPostsFlood2.total_daily;
                }
                textView3.setText(org.telegram.messenger.dd.H(',', "SearchPostsFreeSearches", i16));
                return;
            }
            textView3.setVisibility(8);
        } else {
            g9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.dd.L0(2131745730, null));
            textView.setText(org.telegram.messenger.dd.L0(2131745731, null));
            dVar.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i17 = searchPostsFlood3.remains;
                if (i17 < 1) {
                    i17 = searchPostsFlood3.total_daily;
                }
                textView3.setText(org.telegram.messenger.dd.H(',', "SearchPostsFreeSearches", i17));
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
        if (!this.P) {
            this.P = true;
            org.telegram.messenger.wp.d1().edit().putInt("searchpostsnew", org.telegram.messenger.wp.d1().getInt("searchpostsnew", 0) + 1).apply();
            rh.e6.y(this.f25107b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.D.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20562w).start();
    }
}
