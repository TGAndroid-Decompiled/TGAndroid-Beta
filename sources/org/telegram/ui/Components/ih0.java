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
    public final v9 E;
    public final TextView F;
    public final TextView G;
    public final ci.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public oq R;
    public oq S;
    public lu T;
    public final oq[] U;
    public final fh0 V;
    public final org.telegram.ui.uy f25047a;
    public final int f25048b;
    public final s61 f25049c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f25050f;
    public boolean h;
    public final ArrayList f25051n;
    public int f25052r;
    public boolean f25053s;
    public boolean v;
    public String f25054w;
    public final FrameLayout f25055x;
    public final org.telegram.ui.yd f25056y;

    public ih0(Context context, org.telegram.ui.uy uyVar) {
        super(context);
        this.e = new ArrayList();
        this.f25051n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new oq[1];
        this.V = new fh0(this, 1);
        this.f25047a = uyVar;
        int currentAccount = uyVar.getCurrentAccount();
        this.f25048b = currentAccount;
        s61 s61Var = new s61(context, currentAccount, 0, false, new d(this, 18), new mv(this, 12), null, null);
        this.f25049c = s61Var;
        s61Var.j(new ii.m3(3, this, uyVar));
        addView(s61Var, w7.y5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f25055x = frameLayout;
        org.telegram.ui.yd ydVar = new org.telegram.ui.yd(context, 3);
        this.f25056y = ydVar;
        ydVar.setOrientation(1);
        frameLayout.addView(ydVar, w7.y5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        v9 v9Var = new v9(context);
        this.E = v9Var;
        v9Var.setVisibility(8);
        ydVar.addView(v9Var, w7.y5.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        ydVar.addView(textView, w7.y5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        ydVar.addView(textView2, w7.y5.t(-2, -2, 1, 0, 9, 0, 0));
        ci.d g10 = org.telegram.messenger.rk.g(24, context, null, true);
        this.H = g10;
        ydVar.addView(g10, w7.y5.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        ydVar.addView(textView3, w7.y5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        s61Var.setHideIfEmpty(false);
        s61Var.setEmptyView(frameLayout);
        s61Var.Y1 = true;
        s61Var.Z1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j3;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.v) {
            boolean isEmpty = TextUtils.isEmpty(this.f25054w);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f25053s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.v = true;
                    int i10 = this.f25048b;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f25054w;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.e;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) hg.k0.g(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f25050f;
                            tL_channels_searchPosts.offset_id = messageObject.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f25051n;
                        if (!arrayList2.isEmpty()) {
                            MessageObject messageObject2 = (MessageObject) hg.k0.g(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f25052r;
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
                    this.f25049c.Y2.N(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i10 = this.O;
        int i11 = this.f25048b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f25051n.isEmpty() || !this.f25053s)) {
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
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new x1(this, 9));
    }

    public final void c() {
        this.f25055x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.f19477y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        s61 s61Var = this.f25049c;
        s61Var.setAdapter(null);
        s61Var.setAdapter(s61Var.Y2);
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
        int i10 = this.f25048b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.G;
        TextView textView2 = this.F;
        v9 v9Var = this.E;
        TextView textView3 = this.I;
        ci.d dVar = this.H;
        if (!isPremium) {
            v9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ih0 f24356b;

                {
                    this.f24356b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f24356b.f25047a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ih0 ih0Var = this.f24356b;
                            ih0Var.H.setLoading(true);
                            ih0Var.a(true);
                            return;
                        default:
                            ih0 ih0Var2 = this.f24356b;
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
        boolean isEmpty = TextUtils.isEmpty(this.f25054w);
        ArrayList arrayList = this.f25051n;
        if (!isEmpty && arrayList.isEmpty() && this.f25053s) {
            if (v9Var.getImageReceiver().getImageDrawable() == null) {
                v9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            v9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f25054w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.f25054w) && (searchPostsFlood = this.d) != null) {
            f7 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                v9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i11 = this.d.wait_till - currentTime;
                int i12 = i11 / 3600;
                int i13 = i11 - (i12 * 3600);
                int i14 = i13 / 60;
                int i15 = i13 - (i14 * 60);
                dVar.setVisibility(0);
                dVar.g(yh.w7.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
                int i16 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                if (i12 > 0) {
                    str = a4.a.m(i12, ":");
                } else {
                    str = "";
                }
                sb2.append(str);
                if (i14 < 10) {
                    valueOf = hg.k0.h(i14, "0");
                } else {
                    valueOf = Integer.valueOf(i14);
                }
                sb2.append(valueOf);
                sb2.append(":");
                if (i15 < 10) {
                    valueOf2 = hg.k0.h(i15, "0");
                } else {
                    valueOf2 = Integer.valueOf(i15);
                }
                sb2.append(valueOf2);
                dVar.f(LocaleController.formatString(i16, sb2.toString()), true);
                dVar.e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final ih0 f24356b;

                    {
                        this.f24356b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f24356b.f25047a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                return;
                            case 1:
                                ih0 ih0Var = this.f24356b;
                                ih0Var.H.setLoading(true);
                                ih0Var.a(true);
                                return;
                            default:
                                ih0 ih0Var2 = this.f24356b;
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
        if (arrayList.isEmpty() && !this.v && !TextUtils.isEmpty(this.f25054w)) {
            v9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                oq oqVar = new oq(R.drawable.smiles_tab_search, 0);
                this.R = oqVar;
                oqVar.setScale(0.79f, 0.79f);
            }
            if (this.T == null) {
                this.T = new lu(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false))), 1);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f25054w, dVar.getTextPaint(), AndroidUtilities.dp(f7), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.S == null) {
                oq oqVar2 = new oq(R.drawable.msg_mini_forumarrow, 0);
                this.S = oqVar2;
                oqVar2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.g(spannableStringBuilder, true, true);
            dVar.d.o(false, false, false);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final ih0 f24356b;

                {
                    this.f24356b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f24356b.f25047a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            ih0 ih0Var = this.f24356b;
                            ih0Var.H.setLoading(true);
                            ih0Var.a(true);
                            return;
                        default:
                            ih0 ih0Var2 = this.f24356b;
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
        v9Var.setVisibility(8);
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
            yh.u5.y(this.f25048b, false).p();
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
        this.f25056y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f19699w).start();
    }
}
