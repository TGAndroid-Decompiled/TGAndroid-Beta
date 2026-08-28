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
public final class kg0 extends FrameLayout {
    public final o9 A;
    public final TextView B;
    public final TextView C;
    public final kh.d D;
    public final TextView E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public eq N;
    public eq O;
    public wt P;
    public final eq[] Q;
    public final gg0 R;
    public final org.telegram.ui.dy f30076a;
    public final int f30077b;
    public final i51 f30078c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList f30079e;
    public int f30080f;
    public boolean h;
    public final ArrayList f30081n;
    public int f30082r;
    public boolean f30083s;
    public boolean v;
    public String f30084w;
    public final FrameLayout f30085x;
    public final gh.m f30086y;

    public kg0(Context context, org.telegram.ui.dy dyVar) {
        super(context);
        this.f30079e = new ArrayList();
        this.f30081n = new ArrayList();
        this.G = -1;
        this.H = 0;
        this.K = -1;
        this.Q = new eq[1];
        this.R = new gg0(this, 1);
        this.f30076a = dyVar;
        int currentAccount = dyVar.getCurrentAccount();
        this.f30077b = currentAccount;
        i51 i51Var = new i51(context, currentAccount, 0, false, new d(this, 18), new wu(this, 11), null, null);
        this.f30078c = i51Var;
        i51Var.j(new eh.n(4, this, dyVar));
        addView(i51Var, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30085x = frameLayout;
        gh.m mVar = new gh.m(context, 5);
        this.f30086y = mVar;
        mVar.setOrientation(1);
        frameLayout.addView(mVar, g7.e6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        o9 o9Var = new o9(context);
        this.A = o9Var;
        o9Var.setVisibility(8);
        mVar.addView(o9Var, g7.e6.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        mVar.addView(textView, g7.e6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        mVar.addView(textView2, g7.e6.t(-2, -2, 1, 0, 9, 0, 0));
        kh.d i9 = org.telegram.messenger.ll.i(24, context, null, true);
        this.D = i9;
        mVar.addView(i9, g7.e6.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.E = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        mVar.addView(textView3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        i51Var.setHideIfEmpty(false);
        i51Var.setEmptyView(frameLayout);
        i51Var.U1 = true;
        i51Var.V1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.v) {
            boolean isEmpty = TextUtils.isEmpty(this.f30084w);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f30083s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.v = true;
                    int i9 = this.f30077b;
                    MessagesController messagesController = MessagesController.getInstance(i9);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f30084w;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.f30079e;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f30080f;
                            tL_channels_searchPosts.offset_id = messageObject.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f30081n;
                        if (!arrayList2.isEmpty()) {
                            MessageObject messageObject2 = (MessageObject) j3.r0.j(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f30082r;
                            tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
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
                    this.G = connectionsManager.sendRequest(tL_channels_searchPosts, new b7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                    d();
                    this.f30078c.U2.N(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i9 = this.K;
        int i10 = this.f30077b;
        if (i9 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.K, true);
            this.K = -1;
        }
        if (!this.I) {
            if (this.M && (!this.f30081n.isEmpty() || !this.f30083s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.J = z10;
        }
        this.I = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.K = ConnectionsManager.getInstance(i10).sendRequest(tL_channels_checkSearchPostsFlood, new w1(this, 9));
    }

    public final void c() {
        this.f30085x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        this.E.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        i51 i51Var = this.f30078c;
        i51Var.setAdapter(null);
        i51Var.setAdapter(i51Var.U2);
        if (this.P != null) {
            this.P = null;
            d();
        }
    }

    public final void d() {
        float f10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        gg0 gg0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(gg0Var);
        int i9 = this.f30077b;
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        TextView textView = this.C;
        TextView textView2 = this.B;
        o9 o9Var = this.A;
        TextView textView3 = this.E;
        kh.d dVar = this.D;
        if (!isPremium) {
            o9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final kg0 f29073b;

                {
                    this.f29073b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f29073b.f30076a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            kg0 kg0Var = this.f29073b;
                            kg0Var.D.setLoading(true);
                            kg0Var.a(true);
                            return;
                        default:
                            kg0 kg0Var2 = this.f29073b;
                            kg0Var2.D.setLoading(true);
                            kg0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f30084w);
        ArrayList arrayList = this.f30081n;
        if (!isEmpty && arrayList.isEmpty() && this.f30083s) {
            if (o9Var.getImageReceiver().getImageDrawable() == null) {
                o9Var.setImageDrawable(new mi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
            }
            o9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f30084w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.f30084w) && (searchPostsFlood = this.d) != null) {
            f10 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                o9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i10 = this.d.wait_till - currentTime;
                int i11 = i10 / 3600;
                int i12 = i10 - (i11 * 3600);
                int i13 = i12 / 60;
                int i14 = i12 - (i13 * 60);
                dVar.setVisibility(0);
                dVar.g(gh.oa.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.Q), true, true);
                int i15 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                if (i11 > 0) {
                    str = ta.b.c(i11, ":");
                } else {
                    str = "";
                }
                sb2.append(str);
                if (i13 < 10) {
                    valueOf = j3.r0.l(i13, "0");
                } else {
                    valueOf = Integer.valueOf(i13);
                }
                sb2.append(valueOf);
                sb2.append(":");
                if (i14 < 10) {
                    valueOf2 = j3.r0.l(i14, "0");
                } else {
                    valueOf2 = Integer.valueOf(i14);
                }
                sb2.append(valueOf2);
                dVar.f(LocaleController.formatString(i15, sb2.toString()), true);
                dVar.f15069e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final kg0 f29073b;

                    {
                        this.f29073b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f29073b.f30076a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                return;
                            case 1:
                                kg0 kg0Var = this.f29073b;
                                kg0Var.D.setLoading(true);
                                kg0Var.a(true);
                                return;
                            default:
                                kg0 kg0Var2 = this.f29073b;
                                kg0Var2.D.setLoading(true);
                                kg0Var2.a(false);
                                return;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(gg0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        } else {
            f10 = 100.0f;
        }
        if (arrayList.isEmpty() && !this.v && !TextUtils.isEmpty(this.f30084w)) {
            o9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.N == null) {
                eq eqVar = new eq(R.drawable.smiles_tab_search, 0);
                this.N = eqVar;
                eqVar.setScale(0.79f, 0.79f);
            }
            if (this.P == null) {
                this.P = new wt(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false), org.telegram.ui.ActionBar.f6.l1(0.75f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false))), 1);
            }
            spannableStringBuilder.setSpan(this.N, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f30084w, dVar.getTextPaint(), AndroidUtilities.dp(f10), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.P, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.O == null) {
                eq eqVar2 = new eq(R.drawable.msg_mini_forumarrow, 0);
                this.O = eqVar2;
                eqVar2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.O, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.g(spannableStringBuilder, true, true);
            dVar.d.o(false, false, false);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final kg0 f29073b;

                {
                    this.f29073b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f29073b.f30076a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            kg0 kg0Var = this.f29073b;
                            kg0Var.D.setLoading(true);
                            kg0Var.a(true);
                            return;
                        default:
                            kg0 kg0Var2 = this.f29073b;
                            kg0Var2.D.setLoading(true);
                            kg0Var2.a(false);
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
                textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i16));
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        o9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        dVar.setVisibility(8);
        if (this.d != null) {
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
            int i17 = searchPostsFlood3.remains;
            if (i17 < 1) {
                i17 = searchPostsFlood3.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i17));
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
        if (!this.L) {
            this.L = true;
            MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
            gh.v7.y(this.f30077b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i9) {
        this.f30086y.animate().translationY((-i9) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f23713w).start();
    }
}
