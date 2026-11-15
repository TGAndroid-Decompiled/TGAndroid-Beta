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
public final class cf0 extends FrameLayout {
    public final ai.q2 E;
    public final i9 F;
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
    public eq S;
    public eq T;
    public org.telegram.messenger.t U;
    public final eq[] V;
    public final ze0 W;
    public final org.telegram.ui.yw f33544a;
    public final int f33545b;
    public final u41 f33546c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f33547e;
    public int f33548f;
    public boolean h;
    public final ArrayList f33549n;
    public int f33550r;
    public boolean f33551s;
    public boolean f33552w;
    public String f33553x;
    public final FrameLayout f33554y;

    public cf0(Context context, org.telegram.ui.yw ywVar) {
        super(context);
        this.f33547e = new ArrayList();
        this.f33549n = new ArrayList();
        this.L = -1;
        this.M = 0;
        this.P = -1;
        this.V = new eq[1];
        this.W = new ze0(this, 1);
        this.f33544a = ywVar;
        int currentAccount = ywVar.getCurrentAccount();
        this.f33545b = currentAccount;
        u41 u41Var = new u41(context, currentAccount, 0, false, new d(this, 18), new gx(this, 12), null, null);
        this.f33546c = u41Var;
        u41Var.j(new bi.w3(5, this, ywVar));
        addView(u41Var, c8.ja.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33554y = frameLayout;
        ai.q2 q2Var = new ai.q2(context, 8);
        this.E = q2Var;
        q2Var.setOrientation(1);
        frameLayout.addView(q2Var, c8.ja.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        i9 i9Var = new i9(context);
        this.F = i9Var;
        i9Var.setVisibility(8);
        q2Var.addView(i9Var, c8.ja.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        q2Var.addView(textView, c8.ja.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.H = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        q2Var.addView(textView2, c8.ja.t(-2, -2, 1, 0, 9, 0, 0));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, null, true);
        this.I = g10;
        q2Var.addView(g10, c8.ja.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.J = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        q2Var.addView(textView3, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        u41Var.setHideIfEmpty(false);
        u41Var.setEmptyView(frameLayout);
        u41Var.X1 = true;
        u41Var.Y1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f33552w) {
            boolean isEmpty = TextUtils.isEmpty(this.f33553x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f33551s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f33552w = true;
                    int i7 = this.f33545b;
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f33553x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f33547e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f33548f;
                            tL_channels_searchPosts.offset_id = gjVar.L1();
                            tL_channels_searchPosts.offset_peer = s12.m1(gjVar.f23817k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f33549n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) i5.c.h(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f33550r;
                            tL_channels_searchPosts.offset_id = gjVar2.L1();
                            tL_channels_searchPosts.offset_peer = s12.m1(gjVar2.f23817k.peer_id);
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
                    this.L = connectionsManager.sendRequest(tL_channels_searchPosts, new z6(this, s12, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                    d();
                    this.f33546c.f39895g3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i7 = this.P;
        int i10 = this.f33545b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.P, true);
            this.P = -1;
        }
        if (!this.N) {
            if (this.R && (!this.f33549n.isEmpty() || !this.f33551s)) {
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
        this.P = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new v1(this, 8));
    }

    public final void c() {
        this.f33554y.setBackgroundColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        this.J.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.H.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        u41 u41Var = this.f33546c;
        u41Var.setAdapter(null);
        u41Var.setAdapter(u41Var.f39895g3);
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
        ze0 ze0Var = this.W;
        org.telegram.messenger.g0.r(ze0Var);
        int i7 = this.f33545b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.m10.i(i7).q();
        TextView textView = this.H;
        TextView textView2 = this.G;
        i9 i9Var = this.F;
        TextView textView3 = this.J;
        hi.d dVar = this.I;
        if (!q10) {
            i9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745713, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745714, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.hd.M0(2131745728, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cf0 f32980b;

                {
                    this.f32980b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32980b.f33544a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cf0 cf0Var = this.f32980b;
                            cf0Var.I.setLoading(true);
                            cf0Var.a(true);
                            return;
                        default:
                            cf0 cf0Var2 = this.f32980b;
                            cf0Var2.I.setLoading(true);
                            cf0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.hd.M0(2131745715, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f33553x);
        ArrayList arrayList = this.f33549n;
        if (!isEmpty && arrayList.isEmpty() && this.f33551s) {
            if (i9Var.getImageReceiver().T == null) {
                i9Var.setImageDrawable(new ch0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            i9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.hd.M0(2131745717, null));
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131745716, TextUtils.ellipsize(this.f33553x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f33553x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            i9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745721, null));
            textView.setText(org.telegram.messenger.hd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i10 = this.d.wait_till - currentTime;
            int i11 = i10 / 3600;
            int i12 = i10 - (i11 * 3600);
            int i13 = i12 / 60;
            int i14 = i12 - (i13 * 60);
            dVar.setVisibility(0);
            dVar.i(di.mb.U0(org.telegram.messenger.hd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.V), true, true);
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
            dVar.g(org.telegram.messenger.hd.a0(null, null, 2131745727, sb2.toString()), true);
            dVar.f14057e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cf0 f32980b;

                {
                    this.f32980b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32980b.f33544a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cf0 cf0Var = this.f32980b;
                            cf0Var.I.setLoading(true);
                            cf0Var.a(true);
                            return;
                        default:
                            cf0 cf0Var2 = this.f32980b;
                            cf0Var2.I.setLoading(true);
                            cf0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.g0.i3(ze0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f33552w && !TextUtils.isEmpty(this.f33553x)) {
            i9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745713, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745714, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.S == null) {
                eq eqVar = new eq(2131232742, 0);
                this.S = eqVar;
                eqVar.I = 0.79f;
                eqVar.J = 0.79f;
            }
            if (this.U == null) {
                this.U = new org.telegram.messenger.t(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false), org.telegram.ui.ActionBar.j6.r1(0.75f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ji, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.S, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745732, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f33553x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.U, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.T == null) {
                eq eqVar2 = new eq(2131232242, 0);
                this.T = eqVar2;
                eqVar2.I = 1.05f;
                eqVar2.J = 1.05f;
            }
            spannableStringBuilder.setSpan(this.T, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.i(spannableStringBuilder, true, true);
            dVar.d.r(false, false);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final cf0 f32980b;

                {
                    this.f32980b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f32980b.f33544a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            cf0 cf0Var = this.f32980b;
                            cf0Var.I.setLoading(true);
                            cf0Var.a(true);
                            return;
                        default:
                            cf0 cf0Var2 = this.f32980b;
                            cf0Var2.I.setLoading(true);
                            cf0Var2.a(false);
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
            i9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745713, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745714, null));
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
            org.telegram.messenger.np.e1().edit().putInt("searchpostsnew", org.telegram.messenger.np.e1().getInt("searchpostsnew", 0) + 1).apply();
            di.v8.y(this.f33545b, false).p();
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
        this.E.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f28644w).start();
    }
}
