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
    public final k9 E;
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
    public final org.telegram.ui.zw f40921a;
    public final int f40922b;
    public final r41 f40923c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f40924e;
    public int f40925f;
    public boolean h;
    public final ArrayList f40926n;
    public int f40927r;
    public boolean f40928s;
    public boolean f40929w;
    public String f40930x;
    public final FrameLayout f40931y;

    public ze0(Context context, org.telegram.ui.zw zwVar) {
        super(context);
        this.f40924e = new ArrayList();
        this.f40926n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new wp[1];
        this.V = new we0(this, 1);
        this.f40921a = zwVar;
        int currentAccount = zwVar.getCurrentAccount();
        this.f40922b = currentAccount;
        r41 r41Var = new r41(context, currentAccount, 0, false, new d(this, 18), new ax(this, 12), null, null);
        this.f40923c = r41Var;
        r41Var.j(new ai.o0(4, this, zwVar));
        addView(r41Var, c8.ha.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40931y = frameLayout;
        bi.t tVar = new bi.t(context, 8);
        this.D = tVar;
        tVar.setOrientation(1);
        frameLayout.addView(tVar, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.E = k9Var;
        k9Var.setVisibility(8);
        tVar.addView(k9Var, c8.ha.t(130, 130, 1, 0, 0, 0, 12));
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
        r41Var.setHideIfEmpty(false);
        r41Var.setEmptyView(frameLayout);
        r41Var.W1 = true;
        r41Var.X1 = 0;
        c();
        d();
    }

    public final void a(boolean z9) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.f40929w) {
            boolean isEmpty = TextUtils.isEmpty(this.f40930x);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f40928s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.f40929w = true;
                    int i7 = this.f40922b;
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f40930x;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f40924e;
                        if (!arrayList.isEmpty()) {
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f40925f;
                            tL_channels_searchPosts.offset_id = ijVar.L1();
                            tL_channels_searchPosts.offset_peer = s12.m1(ijVar.f23266k.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f40926n;
                        if (!arrayList2.isEmpty()) {
                            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) jg.g.i(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f40927r;
                            tL_channels_searchPosts.offset_id = ijVar2.L1();
                            tL_channels_searchPosts.offset_peer = s12.m1(ijVar2.f23266k.peer_id);
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
                    this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new a7(this, s12, isEmpty, tL_channels_searchPosts, z9, j3, connectionsManager), 1024);
                    d();
                    this.f40923c.f37496f3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z9;
        int i7 = this.O;
        int i10 = this.f40922b;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f40926n.isEmpty() || !this.f40928s)) {
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
        this.O = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new w1(this, 8));
    }

    public final void c() {
        this.f40931y.setBackgroundColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        r41 r41Var = this.f40923c;
        r41Var.setAdapter(null);
        r41Var.setAdapter(r41Var.f37496f3);
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
        int i7 = this.f40922b;
        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
        boolean q10 = org.telegram.messenger.p10.i(i7).q();
        TextView textView = this.G;
        TextView textView2 = this.F;
        k9 k9Var = this.E;
        TextView textView3 = this.I;
        fi.d dVar = this.H;
        if (!q10) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745713, null));
            textView.setText(org.telegram.messenger.id.M0(2131745714, null));
            dVar.setVisibility(0);
            dVar.i(org.telegram.messenger.id.M0(2131745728, null), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ze0 f40294b;

                {
                    this.f40294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40294b.f40921a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40294b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40294b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(org.telegram.messenger.id.M0(2131745715, null));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f40930x);
        ArrayList arrayList = this.f40926n;
        if (!isEmpty && arrayList.isEmpty() && this.f40928s) {
            if (k9Var.getImageReceiver().S == null) {
                k9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
            }
            k9Var.setVisibility(0);
            textView2.setText(org.telegram.messenger.id.M0(2131745717, null));
            textView.setText(org.telegram.messenger.id.a0(null, null, 2131745716, TextUtils.ellipsize(this.f40930x, textView.getPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.f40930x) && (searchPostsFlood = this.d) != null && (searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745721, null));
            textView.setText(org.telegram.messenger.id.H(',', "SearchPostsLimitReachedText", this.d.total_daily));
            int i10 = this.d.wait_till - currentTime;
            int i11 = i10 / 3600;
            int i12 = i10 - (i11 * 3600);
            int i13 = i12 / 60;
            int i14 = i12 - (i13 * 60);
            dVar.setVisibility(0);
            dVar.i(bi.dd.U0(org.telegram.messenger.id.H(',', "SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
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
            dVar.g(org.telegram.messenger.id.a0(null, null, 2131745727, sb2.toString()), true);
            dVar.f11758e.r(false, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ze0 f40294b;

                {
                    this.f40294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40294b.f40921a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40294b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40294b;
                            ze0Var2.H.setLoading(true);
                            ze0Var2.a(false);
                            return;
                    }
                }
            });
            org.telegram.messenger.g0.i3(we0Var, 1000L);
            textView3.setVisibility(8);
        } else if (arrayList.isEmpty() && !this.f40929w && !TextUtils.isEmpty(this.f40930x)) {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745713, null));
            textView.setText(org.telegram.messenger.id.M0(2131745714, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                wp wpVar = new wp(2131232741, 0);
                this.R = wpVar;
                wpVar.H = 0.79f;
                wpVar.I = 0.79f;
            }
            if (this.T == null) {
                this.T = new org.telegram.messenger.t(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ci, false), org.telegram.ui.ActionBar.m6.r1(0.75f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gi, false))), 3, false);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131745732, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f40930x, dVar.getTextPaint(), org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
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
                public final ze0 f40294b;

                {
                    this.f40294b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f40294b.f40921a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ze0 ze0Var = this.f40294b;
                            ze0Var.H.setLoading(true);
                            ze0Var.a(true);
                            return;
                        default:
                            ze0 ze0Var2 = this.f40294b;
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
                textView3.setText(org.telegram.messenger.id.H(',', "SearchPostsFreeSearches", i15));
                return;
            }
            textView3.setVisibility(8);
        } else {
            k9Var.setVisibility(8);
            textView2.setText(org.telegram.messenger.id.M0(2131745713, null));
            textView.setText(org.telegram.messenger.id.M0(2131745714, null));
            dVar.setVisibility(8);
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
                int i16 = searchPostsFlood3.remains;
                if (i16 < 1) {
                    i16 = searchPostsFlood3.total_daily;
                }
                textView3.setText(org.telegram.messenger.id.H(',', "SearchPostsFreeSearches", i16));
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
            bi.ea.y(this.f40922b, false).p();
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
        this.D.animate().translationY((-i7) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.f27527w).start();
    }
}
