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
public final class ze0 extends FrameLayout {
    public final bi.t D;
    public final l9 E;
    public final TextView F;
    public final TextView G;
    public final fi.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public wp R;
    public wp S;
    public org.telegram.messenger.t T;
    public final wp[] U;
    public final we0 V;
    public final org.telegram.ui.ww f40923a;
    public final int f40924b;
    public final p41 f40925c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f40926e;
    public int f40927f;
    public boolean h;
    public final ArrayList f40928n;
    public int f40929r;
    public boolean f40930s;
    public boolean f40931w;
    public String f40932x;
    public final FrameLayout f40933y;

    public ze0(Context context, org.telegram.ui.ww wwVar) {
        super(context);
        this.f40926e = new ArrayList();
        this.f40928n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new wp[1];
        this.V = new we0(this, 1);
        this.f40923a = wwVar;
        int currentAccount = wwVar.getCurrentAccount();
        this.f40924b = currentAccount;
        p41 p41Var = new p41(context, currentAccount, 0, false, new d(this, 18), new ax(this, 12), null, null);
        this.f40925c = p41Var;
        p41Var.j(new ai.o0(4, this, wwVar));
        addView(p41Var, c8.ha.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40933y = frameLayout;
        bi.t tVar = new bi.t(context, 8);
        this.D = tVar;
        tVar.setOrientation(1);
        frameLayout.addView(tVar, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.E = l9Var;
        l9Var.setVisibility(8);
        tVar.addView(l9Var, c8.ha.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        tVar.addView(textView, c8.ha.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        tVar.addView(textView2, c8.ha.t(-2, -2, 1, 0, 9, 0, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, null, true);
        this.H = h;
        tVar.addView(h, c8.ha.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        tVar.addView(textView3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        p41Var.setHideIfEmpty(false);
        p41Var.setEmptyView(frameLayout);
        p41Var.W1 = true;
        p41Var.X1 = 0;
        c();
        d();
    }

    public final void a(boolean z9) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f40931w) {
            boolean isEmpty = TextUtils.isEmpty(this.f40932x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f40930s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f40931w = true;
                    int i7 = this.f40924b;
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f40932x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f40926e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f40927f;
                            tL_channels_searchPosts.offset_id = ijVar.M1();
                            tL_channels_searchPosts.offset_peer = s12.m1(ijVar.f23237k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f40928n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) jg.g.i(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f40929r;
                            tL_channels_searchPosts.offset_id = ijVar2.M1();
                            tL_channels_searchPosts.offset_peer = s12.m1(ijVar2.f23237k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    }
                    if (z9 && (searchPostsFlood = this.d) != null) {
                        tL_channels_searchPosts.flags |= 4;
                        j3 = searchPostsFlood.stars_amount;
                        tL_channels_searchPosts.allow_paid_stars = j3;
                    } else {
                        j3 = 0;
                    }
                    this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new b7(this, s12, isEmpty, tL_channels_searchPosts, z9, j3, connectionsManager), 1024);
                    d();
                    this.f40925c.f36781f3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z9;
        int i7 = this.O;
        int i10 = this.f40924b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f40928n.isEmpty() || !this.f40930s)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.N = z9;
        }
        this.M = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.O = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 8));
    }

    public final void c() {
        this.f40933y.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        p41 p41Var = this.f40925c;
        p41Var.setAdapter(null);
        p41Var.setAdapter(p41Var.f36781f3);
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
        we0 we0Var = this.V;
        org.telegram.messenger.g0.r(we0Var);
        int i7 = this.f40924b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        TextView textView = this.G;
        TextView textView2 = this.F;
        l9 l9Var = this.E;
        TextView textView3 = this.I;
        fi.d dVar = this.H;
        if (!q10) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745714, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745715, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.hd.M0(2131745729, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ze0 f40265b;

                {
                    this.f40265b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40265b.f40923a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40265b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40265b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.hd.M0(2131745716, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f40932x);
        ArrayList arrayList = this.f40928n;
        if (!isEmpty && arrayList.isEmpty() && this.f40930s) {
            if (l9Var.getImageReceiver().S == null) {
                l9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            l9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.hd.M0(2131745718, null));
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131745717, TextUtils.ellipsize(this.f40932x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f40932x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745722, null));
            textView.setText(org.telegram.messenger.hd.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i10 = this.d.wait_till - currentTime;
            int i11 = i10 / 3600;
            int i12 = i10 - (i11 * 3600);
            int i13 = i12 / 60;
            int i14 = i12 - (i13 * 60);
            dVar.setVisibility(0);
            dVar.i(bi.dd.U0(org.telegram.messenger.hd.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
            StringBuilder sb2 = new StringBuilder();
            if (i11 > 0) {
                str = com.google.android.recaptcha.internal.a.i(i11, ":");
            } else {
                str = "";
            }
            sb2.append(str);
            if (i13 < 10) {
                valueOf = jg.g.j(i13, "0");
            } else {
                valueOf = Integer.valueOf(i13);
            }
            sb2.append(valueOf);
            sb2.append(":");
            if (i14 < 10) {
                valueOf2 = jg.g.j(i14, "0");
            } else {
                valueOf2 = Integer.valueOf(i14);
            }
            sb2.append(valueOf2);
            dVar.g(org.telegram.messenger.hd.a0(null, null, 2131745728, sb2.toString()), true);
            dVar.f11754e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ze0 f40265b;

                {
                    this.f40265b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40265b.f40923a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40265b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40265b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.g0.i3(we0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f40931w && !TextUtils.isEmpty(this.f40932x)) {
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745714, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745715, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                wp wpVar = new wp(2131232741, 0);
                this.R = wpVar;
                wpVar.H = 0.79f;
                wpVar.I = 0.79f;
            }
            if (this.T == null) {
                this.T = new org.telegram.messenger.t(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false), org.telegram.ui.ActionBar.k6.r1(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131745733, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f40932x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.S == null) {
                wp wpVar2 = new wp(2131232241, 0);
                this.S = wpVar2;
                wpVar2.H = 1.05f;
                wpVar2.I = 1.05f;
            }
            spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.i(spannableStringBuilder, true, true);
            dVar.d.r(false, false);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ze0 f40265b;

                {
                    this.f40265b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40265b.f40923a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40265b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40265b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
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
            l9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.hd.M0(2131745714, null));
            textView.setText(org.telegram.messenger.hd.M0(2131745715, null));
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
        if (!this.P) {
            this.P = true;
            org.telegram.messenger.qp.e1().edit().putInt("searchpostsnew", org.telegram.messenger.qp.e1().getInt("searchpostsnew", 0) + 1).apply();
            bi.ea.y(this.f40924b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i7) {
        this.D.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27540w).start();
    }
}
