package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class ih0 extends FrameLayout {
    public final w9 E;
    public final TextView F;
    public final TextView G;
    public final bi.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public uq R;
    public uq S;
    public pu T;
    public final uq[] U;
    public final fh0 V;
    public final org.telegram.ui.wy f24020a;
    public final int f24021b;
    public final r61 f24022c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f24023f;
    public boolean h;
    public final ArrayList f24024n;
    public int f24025r;
    public boolean f24026s;
    public boolean v;
    public String f24027w;
    public final FrameLayout f24028x;
    public final org.telegram.ui.zd f24029y;

    public ih0(Context context, org.telegram.ui.wy wyVar) {
        super(context);
        this.e = new ArrayList();
        this.f24024n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new uq[1];
        this.V = new fh0(this, 1);
        this.f24020a = wyVar;
        int currentAccount = wyVar.getCurrentAccount();
        this.f24021b = currentAccount;
        r61 r61Var = new r61(context, currentAccount, 0, false, new e(this, 18), new pv(this, 11), null, null);
        this.f24022c = r61Var;
        r61Var.j(new hi.p3(3, this, wyVar));
        addView(r61Var, w7.a6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24028x = frameLayout;
        org.telegram.ui.zd zdVar = new org.telegram.ui.zd(context, 3);
        this.f24029y = zdVar;
        zdVar.setOrientation(1);
        frameLayout.addView(zdVar, w7.a6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        w9 w9Var = new w9(context);
        this.E = w9Var;
        w9Var.setVisibility(8);
        zdVar.addView(w9Var, w7.a6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        zdVar.addView(textView, w7.a6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        zdVar.addView(textView2, w7.a6.t(-2, -2, 1, 0, 9, 0, 0));
        bi.d g10 = org.telegram.messenger.em.g(24, context, null, true);
        this.H = g10;
        zdVar.addView(g10, w7.a6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        zdVar.addView(textView3, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        r61Var.setHideIfEmpty(false);
        r61Var.setEmptyView(frameLayout);
        r61Var.Y1 = true;
        r61Var.Z1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.v) {
            boolean isEmpty = TextUtils.isEmpty(this.f24027w);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f24026s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.v = true;
                    int i10 = this.f24021b;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f24027w;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.e;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) hc.b.i(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f24023f;
                            tL_channels_searchPosts.offset_id = messageObject.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f24024n;
                        if (!arrayList2.isEmpty()) {
                            MessageObject messageObject2 = (MessageObject) hc.b.i(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f24025r;
                            tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
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
                    this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new g7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j3, connectionsManager), 1024);
                    d();
                    this.f24022c.Y2.N(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i10 = this.O;
        int i11 = this.f24021b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f24024n.isEmpty() || !this.f24026s)) {
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
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new z1(this, 9));
    }

    public final void c() {
        this.f24028x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.f18306y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        r61 r61Var = this.f24022c;
        r61Var.setAdapter(null);
        r61Var.setAdapter(r61Var.Y2);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        float f7;
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        fh0 fh0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(fh0Var);
        int i10 = this.f24021b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.G;
        TextView textView2 = this.F;
        w9 w9Var = this.E;
        TextView textView3 = this.I;
        bi.d dVar = this.H;
        if (!isPremium) {
            w9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ih0 f23364b;

                {
                    this.f23364b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f23364b.f24020a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ih0 ih0Var = this.f23364b;
                            ih0Var.H.setLoading(true);
                            ih0Var.a(true);
                            return;
                        default:
                            ih0 ih0Var2 = this.f23364b;
                            ih0Var2.H.setLoading(true);
                            ih0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f24027w);
        ArrayList arrayList = this.f24024n;
        if (!isEmpty && arrayList.isEmpty() && this.f24026s) {
            if (w9Var.getImageReceiver().getImageDrawable() == null) {
                w9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            w9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f24027w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.f24027w) && (searchPostsFlood = this.d) != null) {
            f7 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                w9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i11 = this.d.wait_till - currentTime;
                int i12 = i11 / 3600;
                int i13 = i11 - (i12 * 3600);
                int i14 = i13 / 60;
                int i15 = i13 - (i14 * 60);
                dVar.setVisibility(0);
                dVar.g(xh.z7.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
                int i16 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                if (i12 > 0) {
                    str = a4.a.m(i12, ":");
                } else {
                    str = "";
                }
                sb2.append(str);
                if (i14 < 10) {
                    valueOf = hc.b.j(i14, "0");
                } else {
                    valueOf = Integer.valueOf(i14);
                }
                sb2.append(valueOf);
                sb2.append(":");
                if (i15 < 10) {
                    valueOf2 = hc.b.j(i15, "0");
                } else {
                    valueOf2 = Integer.valueOf(i15);
                }
                sb2.append(valueOf2);
                dVar.f(LocaleController.formatString(i16, sb2.toString()), true);
                dVar.e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final ih0 f23364b;

                    {
                        this.f23364b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f23364b.f24020a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                return;
                            case 1:
                                ih0 ih0Var = this.f23364b;
                                ih0Var.H.setLoading(true);
                                ih0Var.a(true);
                                return;
                            default:
                                ih0 ih0Var2 = this.f23364b;
                                ih0Var2.H.setLoading(true);
                                ih0Var2.a(false);
                                return;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(fh0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        } else {
            f7 = 100.0f;
        }
        if (arrayList.isEmpty() && !this.v && !TextUtils.isEmpty(this.f24027w)) {
            w9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                uq uqVar = new uq(R.drawable.smiles_tab_search, 0);
                this.R = uqVar;
                uqVar.setScale(0.79f, 0.79f);
            }
            if (this.T == null) {
                this.T = new pu(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false))), 1);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f24027w, dVar.getTextPaint(), AndroidUtilities.dp(f7), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.S == null) {
                uq uqVar2 = new uq(R.drawable.msg_mini_forumarrow, 0);
                this.S = uqVar2;
                uqVar2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.g(spannableStringBuilder, true, true);
            dVar.d.o(false, false, false);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ih0 f23364b;

                {
                    this.f23364b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f23364b.f24020a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ih0 ih0Var = this.f23364b;
                            ih0Var.H.setLoading(true);
                            ih0Var.a(true);
                            return;
                        default:
                            ih0 ih0Var2 = this.f23364b;
                            ih0Var2.H.setLoading(true);
                            ih0Var2.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i17 = searchPostsFlood2.remains;
                if (i17 < 1) {
                    i17 = searchPostsFlood2.total_daily;
                }
                textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i17));
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        w9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        dVar.setVisibility(8);
        if (this.d != null) {
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
            int i18 = searchPostsFlood3.remains;
            if (i18 < 1) {
                i18 = searchPostsFlood3.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i18));
            return;
        }
        textView3.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (!this.P) {
            this.P = true;
            MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
            xh.v5.y(this.f24021b, false).p();
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
        this.f24029y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f18592w).start();
    }
}
